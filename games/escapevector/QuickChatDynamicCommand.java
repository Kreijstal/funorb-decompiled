/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatDynamicCommand {
    int id;
    int parameterCount;
    static MouseInputHandler mouseHandler;
    static p field_e;
    static CipherPacketBuffer incomingPackets;
    static CipherPacketBuffer outgoingPackets;
    static Sprite[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int guard) {
        outgoingPackets = null;
        mouseHandler = null;
        incomingPackets = null;
        if (guard == 5468) {
          field_e = null;
          field_a = null;
          return;
        }
        QuickChatDynamicCommand.releaseStatics(-50);
        field_e = null;
        field_a = null;
    }

    QuickChatDynamicCommand(int id, int unusedArgumentOne, int unusedArgumentTwo, int parameterCount) {
        this.id = id;
        this.parameterCount = parameterCount;
    }

    static {
        mouseHandler = new MouseInputHandler();
    }
}
