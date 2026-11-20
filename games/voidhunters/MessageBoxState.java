/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageBoxState {
    static String field_b;
    static boolean open;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != 9911) {
          open = false;
        }
    }

    static {
        field_z = "wia.A(";
        field_b = "You need to play 1 more rated game to unlock this option.";
        open = false;
    }
}
