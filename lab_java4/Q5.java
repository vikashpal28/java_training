public class Q5 {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Thread senderThread = new Thread(new Sender(chat));
        Thread receiverThread = new Thread(new Receiver(chat));

        senderThread.start();
        receiverThread.start();
        
    }
}


class Chat{
    private boolean senderTurn = true;
    public synchronized void sender(String message){
        while (!senderTurn) {
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }            
        }
        System.out.println("Sender: "+message);
        senderTurn =  false;
        notify();
    }


    public synchronized void receiver(String message){
        while (senderTurn) {
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Receiver: "+message);
        senderTurn =  true;
        notify();
        
    }

}

class Sender implements Runnable {
    private Chat chat;
    private String[] messages = {"Hello!", "How are you?", "What's up?", "Bye!"};

    public Sender(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String msg : messages) {
            chat.sender(msg);
            try {
                Thread.sleep(600);  // Simulating message delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Receiver implements Runnable {
    private Chat chat;
    private String[] replies = {"Hi!", "I'm fine, thanks!", "Just coding!", "See you!"};

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String msg : replies) {
            chat.receiver(msg);
            try {
                Thread.sleep(600);  // Simulating response delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// output:-

// Sender: Hello!
// Receiver: Hi!
// Sender: How are you?
// Receiver: I'm fine, thanks!
// Sender: What's up?
// Receiver: Just coding!
// Sender: Bye!
// Receiver: See you!
