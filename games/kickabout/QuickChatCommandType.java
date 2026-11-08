/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCommandType {
    int id;
    static Sprite field_b;
    int parameterCount;
    static String field_c;

    public static void releaseStatics(byte param0) {
        if (param0 <= 100) {
          QuickChatCommandType.releaseStatics((byte) 118);
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatCommandType(int param0, int param1, int param2, int param3) {
        this.parameterCount = param3;
        this.id = param0;
    }

    static {
        field_b = new Sprite(80, 10);
        field_c = "Withdraw request to join <%0>'s game";
    }
}
