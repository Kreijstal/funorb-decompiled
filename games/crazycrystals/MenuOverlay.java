/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuOverlay {
    static String field_a;
    static java.awt.Frame field_d;
    static volatile int field_b;
    static int[] field_c;

    abstract void drawOverlay(byte param0);

    abstract void updateOverlayPointer(boolean param0);

    abstract boolean handleOverlayKeyEvent(byte param0);

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 0) {
          field_d = (java.awt.Frame) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static int pollLobbySelection(boolean param0, byte param1, int param2, int param3) {
        if (param1 < 36) {
          return 92;
        }
        return ga.p(-1);
    }

    static {
        field_b = 0;
        field_c = new int[]{2, 2, 2, 2, 0, 0, 0, 0, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2};
        field_a = "Loading sound effects";
    }
}
