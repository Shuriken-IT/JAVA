package Inhertance;

public class Inhertance_core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *   kế thừa là tái sử dụng lại 
 *   kế thừa từ interface và class 
 *   kế thừa đơn ̣ java. c# đa thừa kế c/c++
 *   abstraction là lớp có phương thức chứa các hàm trừu tượng định nghĩa tên hàm
 *   interface là các lớp , chứa các method luật định mà các lớp con phải theo tạo tính nhất quán
 *   overriding: là phương thức cùng tên cùng tham số kiểu trả về và cách dùng của nó và xuất hiẹn
 *   ở lớp cha và tiếp tục xuất hiện ở lớp con . khi dùng override, lúc thực thu nếu lớp con k có method
 *   riêng, phương thức của lớp cha sẽ được gọi ngược lạ nếu có , phương thức của lớp Con được gọi
 *   
 *   polymorphism : là khả năng 1 đối tượng có thể thực hiện theo 1 tác vụ theo nhiều cách khác nhau
 *   Đối với tính chất này, nó được thể hiện rõ nhất qua việc gọi phương thức của đối tượng.
 *    Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau. 
 *  Nói cách khác: Tính đa hình cung cấp khả năng cho phép người lập trình gọi trước một phương thức của đối tượng, 
 *  tuy chưa xác định đối tượng có phương thức muốn gọi hay không. Đến khi thực hiện (run-time), chương trình mới xác định được đối tượng và gọi phương thức tương ứng của đối tượng đó. Kết nối trễ giúp chương trình được uyển chuyển hơn, 
 *   chỉ yêu cầu đối tượng cung cấp đúng phương thức cần thiết là đủ.
 *   trong java ta sử dụng method overloading(nạp chồng phương thức) và( ghi đè phương thức) overriding để có tính đa hình
 *  inhertance:
 *  + tổng quát hóa : là những thông tin chung cho mọi đối tượng tập hợp thành 1 lớp cha
 *  + chuyên biệt hóa: những thông tin khác nhau, chỉ có trong từng đối tượng cụ thể nào đó -> tạo
 *  lớp con(lớp con nào đa kế thùa các thông tin chung từ lớp cha rồi)
 *  
 */
		Class_father ft1 = new Class_son1() ;
		ft1.setName("hoàng văn mạnh");
		ft1.setCmnd("022201005231");
		System.out.println(ft1);
	    ft1=new Son_2();
		ft1.setName("hoàng văn mạnh");
		ft1.setCmnd("022201005231");
		System.out.print(ft1);
		Interface_core ds1 =  new Inhertance_Interface();
			
	}

}
