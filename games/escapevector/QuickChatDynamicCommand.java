/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatDynamicCommand {
    int id;
    int parameterCount;
    static eg field_b;
    static p field_e;
    static CipherPacketBuffer field_g;
    static CipherPacketBuffer field_c;
    static Sprite[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_b = null;
        field_g = null;
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
        field_b = new eg();
    }
}
