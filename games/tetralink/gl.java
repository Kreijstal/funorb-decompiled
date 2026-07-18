/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ka {
    static String field_q;
    static je field_p;
    static int[] field_n;
    static le field_o;

    gl(long param0, String param1) {
        super(param0, param1);
    }

    final df a(byte param0) {
        if (param0 > -77) {
            return null;
        }
        return ua.field_h;
    }

    final static void a(boolean param0, byte param1) {
        if (null == sj.field_g) {
          if (param1 != 24) {
            gl.a(true, (byte) -84);
            return;
          } else {
            return;
          }
        } else {
          ra.e(ra.field_j, ra.field_i, -ra.field_j + ra.field_l, -ra.field_i + ra.field_g);
          sj.field_g.a(param0, 256);
          if (param1 == 24) {
            return;
          } else {
            gl.a(true, (byte) -84);
            return;
          }
        }
    }

    public static void d(int param0) {
        field_n = null;
        field_o = null;
        field_q = null;
        field_p = null;
    }

    final static void a(byte param0, int param1) {
        mb.field_B = 20000000L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Hotseat multiplayer game";
    }
}
