package Assesment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;

import jdbc.DBConnector;

public class ReadData {
	Connection con = null;
	public static ArrayList<Book> bookList = new ArrayList<>();

	
	public void inputBook()
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,a.author_name,a.nationality,b.publisher_id,p.publisher_name, p.location from books b join author a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				
				Publisher p = new Publisher(rs.getInt(9),rs.getString(10),rs.getString(11));
				Author a = new Author(rs.getInt(6),rs.getString(7),rs.getString(8));
				Book b = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),a,p);
				bookList.add(b);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void printList()
	{
		for(Book b: bookList) {
			System.out.println(b);
		}
	}
	
	public void getData()
	{
		for(Book b : bookList) {
			System.out.println(b.getIsbn()+" "+b.getTitle()+" "+b.getPages()+" "+b.getAuth().getName()+" "+b.getPubl().getName()+" "+b.getPubl().getLocation());
		}
	}
	
	public void sortData()
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		ArrayList<Book> bookList2 = new ArrayList<>();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,a.author_name,a.nationality,b.publisher_id,p.publisher_name, p.location from books b join author a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id order by b.title, a.author_name";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				
				Publisher p = new Publisher(rs.getInt(9),rs.getString(10),rs.getString(11));
				Author a = new Author(rs.getInt(6),rs.getString(7),rs.getString(8));
				Book b = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),a,p);
				bookList2.add(b);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		for(Book b2: bookList2) {
			System.out.println(b2);
		}
		
	}
	
	
	public void afterDate(int date)
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		ArrayList<Book> bookList2 = new ArrayList<>();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,a.author_name,a.nationality,b.publisher_id,p.publisher_name, p.location from books b join author a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id where pub_year>"+date;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				
				Publisher p = new Publisher(rs.getInt(9),rs.getString(10),rs.getString(11));
				Author a = new Author(rs.getInt(6),rs.getString(7),rs.getString(8));
				Book b = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),a,p);
				bookList2.add(b);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		for(Book b2: bookList2) {
			System.out.println(b2);
		}
	
	}
	
	public void poemCity(String city)
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		ArrayList<Book> bookList2 = new ArrayList<>();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,a.author_name,a.nationality,b.publisher_id,p.publisher_name, p.location from books b join author a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id where b.type='Poem' and p.location='"+city+"'";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				
				Publisher p = new Publisher(rs.getInt(9),rs.getString(10),rs.getString(11));
				Author a = new Author(rs.getInt(6),rs.getString(7),rs.getString(8));
				Book b = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),a,p);
				bookList2.add(b);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		for(Book b2: bookList2) {
			System.out.println(b2);
		}
	
	}
	
	public void countBook(String name)
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		int count=0;
		String sql = "select count(*) \r\n" + 
				"from books join author \r\n" + 
				"on books.author_id = author.author_id  \r\n" + 
				"where author.author_name='"+name +"'";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				
				count++;
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		System.out.println(count);
		}
	

	public static void main(String[] args) {
		
		ReadData rd = new ReadData();
		
		rd.inputBook();
		rd.printList();
		rd.getData();
		rd.sortData();
		rd.afterDate(2006);
		rd.poemCity("Mumbai");
		rd.countBook("Kafka");

	}

}
