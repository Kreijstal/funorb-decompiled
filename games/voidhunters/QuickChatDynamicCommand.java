/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatDynamicCommand {
    int id;
    static String field_b;
    int parameterCount;

    public static void clearSharedReferences(int param0) {
        int var1 = 24 / ((param0 + 53) / 32);
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatDynamicCommand(int param0, int param1, int param2, int param3) {
        this.parameterCount = param3;
        this.id = param0;
    }

    static {
        field_b = "Members only";
    }
}
