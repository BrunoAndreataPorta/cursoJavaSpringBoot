enum Status{
    Running, Failed, Pending, Sucess;
}

public class Demo {
    public static void main(String a[])
    {

        Status s = Status.Pending;
        
        switch(s)
        {
            case Running:
                System.out.println("Working");
                break;
            
            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
        //É possivel fazer com if também
        // if(s == Status.Running)
        //     System.out.println("Working");
        // else if(s == Status.Failed)
        //     System.out.println("Try Again");
        // else if(s == Status.Pending)
        //     System.out.println("Please Wait");
        // else
        //     System.out.println("Done");

        // Para mostrar todas as constantes de Status
        // Status[] stat = Status.values();
        // System.out.println("");
        // for(Status ss : stat)
        // {
        //     System.out.println(ss);
        // }
    }   
}
