/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    int[] field_q;
    static String field_y;
    byte[][][] field_t;
    int[] field_z;
    static UiComponent field_n;
    static String field_p;
    static String field_v;
    AsyncRequest[] field_u;
    int field_r;
    AsyncRequest[] field_x;
    int field_s;
    static NineSliceFrame field_o;
    static String field_A;
    int[] field_w;

    public static void releaseStatics(byte param0) {
        field_y = null;
        field_o = null;
        field_n = null;
        field_A = null;
        field_p = null;
        if (param0 == 6) {
          field_v = null;
          return;
        }
        field_v = (String) null;
        field_v = null;
    }

    final static void pushRasterState(byte param0) {
        RasterSnapshot var1 = null;
        if (param0 > 27) {
          var1 = (RasterSnapshot) (ConfirmPasswordTextGlobals.field_a.removeLast((byte) 125));
          if (var1 == null) {
            var1 = new RasterSnapshot();
          }
          var1.setRasterState(SoftwareRasterizer.field_g, SoftwareRasterizer.field_l, SoftwareRasterizer.field_f, SoftwareRasterizer.field_j, SoftwareRasterizer.field_b, true, SoftwareRasterizer.field_i, SoftwareRasterizer.field_e);
          HighscoreQuery.field_u.addLast(var1, false);
          return;
        }
    }

    ReflectionCheck() {
    }

    static {
        field_y = "Invalid date";
        field_v = "Lobby";
        field_A = "Accept";
        field_p = "Asking for or providing contact information";
    }
}
