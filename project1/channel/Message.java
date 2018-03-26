package channel;

import java.net.DatagramPacket;

/**
 * Created by antonioalmeida on 18/03/2018.
 *
 */

enum MessageType {
        PUTCHUNK, GETCHUNK, CHUNK //TODO: add others
    }

public class Message {
    public static String CR = Character.toString((char) 13);
    public static String LF = Character.toString((char) 10);

    private MessageType type;

    private String version;

    private int peerID;

    private String fileID;

    private int chunkNo;

    private int replicationDegree;

    public static Message parseString(String message) {
        String[] arr = message.split("\\s+");
        //TODO: parse string and return Message object

        for(String part : arr)
            System.out.println("Part: " + part);

        return new Message();
    }

}
