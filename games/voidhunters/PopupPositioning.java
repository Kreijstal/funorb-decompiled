/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupPositioning {
    private static String field_z;

    final static int adjustPopupY(int param0, int param1, int param2, byte param3) {
        if (!(param1 + param0 + param2 > SoftwareRasterizer2D.height)) {
          return param0 + param1;
        }
        if (-param2 + param1 >= 0) {
          return -param2 + param1;
        }
        if (param3 == -16) {
          return SoftwareRasterizer2D.height - param2;
        }
        return -11;
    }

    static {
        field_z = "lma.A(";
    }
}
