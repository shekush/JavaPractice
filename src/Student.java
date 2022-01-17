class Student extends Thread
{
    String name;
    WhiteBoard wb;
    public Student(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    
    public void run()
    {
        String text;
        wb.attendance();     
        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
    
}