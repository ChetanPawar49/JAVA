<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title> 
    </head> 
    <body>
        <center>
        <h1>The required Result is:: </h1> 
        <h2> 
        <% 
            int n,i,flag=0; 
            String ns= request.getParameter("n"); 
            n=Integer.parseInt(ns); 
            if(n>1) 
            { 
                for(i=2;i<=n/2;i++) 
                { 
                    if(n%i==0) 
                    { 
                        flag=1; 
                        break; 
                    } 
                } 
            } 
            if(flag==0) 
            { 
                out.println("<pre>"); 
                out.println(n+" is a prime no."); 
                out.println("</pre>"); 
            } 
            else 
            { 
                out.println("<pre>"); 
                out.println(n+" is not a prime no."); 
                out.println("</pre>"); 
            } 
        %> 
        </h2></center> 
    </body> 
</html>