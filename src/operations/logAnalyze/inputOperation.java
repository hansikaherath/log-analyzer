package operations.logAnalyze;

import operations.exit.userExit;
#;#;

public class inputOperation {

    public String checkInput(){

        //call to get user input
        CommandLineInput item=new CommandLineInput();
        int fact= item.readMenuItem();


        switch (fact){

            case 1:
                //get file path and pass
                askpathoutput path= new askpathoutput();
                path.methodname();
                //get list
                getlistoferror errormsg=new gerlistoferror();
                errormsg.method-name();
                //pass error list
                break;

            case 2:

                //get summary details  from log repo error,info,warn
             //   List<Integer> numbers=numberRepository.read();
                //displaysummary
                calldisplaysummaryclass summary=new calldisplaysummaryclass();
                summary.methodisplaysum( error,info, warns);
                break;

            case 3:

                //call email menu from output package
                askemailmenu emailmenu= new askmailmenu();
                emailmenu.methodmeilmenu();
                //get user input as a- b- c-
                emailuserinputclass chose=new emailuserinputclass();
                 String s=chose.methodn();
                 return s;

                 /*
                //choose one option
                if(s.equals("a")){
                    addEmailOperation addemail=new addEmailOperation();
                    addemail.add();
                }else if(s.equals("b")){
                    deletEmailOperation deletemail=new deletEmailOperation();
                    deletemail.delete();
                }else{
                    getEmailOperation getEmail=new getEmailOperation();
                    getEmail.get();
                }*/
                break;

            default:
                //save current timestamp in the text file-overwrite
                //exit from the application call user exit
                userExit obj=new userExit();
                obj.appExit();
                break;
        }
        return null;
    }
}
