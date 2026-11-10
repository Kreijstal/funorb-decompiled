/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cna {
    static boolean field_a;
    static String field_d;
    static int[] field_c;
    static String[] field_b;

    final static bna a(int param0, int param1) {
        bna var2 = new bna();
        MovingWallComponent.field_N.addLast((byte) -109, var2);
        TouchSwitchBehaviour.b(param0, param1 - 228);
        if (param1 == 128) {
          return var2;
        }
        cna.releaseStatics(-55);
        return var2;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        if (param0 > -75) {
          field_c = (int[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_a = true;
        field_c = new int[128];
        field_d = "This option cannot be combined with the current '<%0>' setting.";
    }
}
