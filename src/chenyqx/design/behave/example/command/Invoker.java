package chenyqx.design.behave.example.command;

public class Invoker {
    private Command command;

    public Invoker(Command cmd) {
        this.command = cmd;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
