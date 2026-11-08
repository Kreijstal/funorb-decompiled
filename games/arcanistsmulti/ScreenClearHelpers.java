/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenClearHelpers implements ScreenMarker {
    static String field_e;
    static int field_f;
    static boolean field_a;
    static IntrusiveDeque field_b;
    static SceneWidget field_c;
    static int field_d;

    public static void releaseStatics(byte param0) {
        int var1 = 2 / ((-60 - param0) / 56);
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final static void clearOrDimScreen(boolean param0, boolean param1, byte param2) {
        if (param2 >= -22) {
          return;
        }
        if (!param1) {
          SoftwareRasterizer.clear();
          GameDetailsRenderer.drawRootContainer((byte) -29, param1);
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j, 0, 192);
        GameDetailsRenderer.drawRootContainer((byte) -29, param1);
    }

    final static int[] newEightInts(byte param0) {
        if (param0 != 12) {
          return (int[]) null;
        }
        return new int[8];
    }

    static {
        field_e = "Members";
        field_f = 0;
        field_b = new IntrusiveDeque();
    }
}
