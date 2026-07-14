/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vba extends rqa {
    static int[] field_q;
    static int[] field_s;
    static int[] field_o;
    static int[] field_r;
    static int[][] field_p;
    static String field_t;

    vba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean f(byte param0) {
        if (param0 < -63) {
          if (null != qn.field_h) {
            if (null == qn.field_h.g(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void e(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        field_p = null;
        field_t = null;
        if (param0 != -31) {
            field_s = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        iva.field_p = param0[0].a(11);
        if (param1 > -119) {
          boolean discarded$2 = vba.f((byte) -42);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0, String param1) {
        wg.field_p = param1;
        cea.a(-53, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[10];
        field_r = new int[10];
        field_o = new int[10];
        field_q = new int[10];
        field_p = new int[10][];
        int[] var0 = new int[]{0, 1, 21, 4, 3, 12};
        vua.a(320, var0, (byte) -80, 230, 530, 50, 0);
        int var1 = 70;
        vua.a(200, new int[5], (byte) -71, -var1 + 200, 440, 50, 1);
        vua.a(200, new int[5], (byte) -94, 200 + -var1, 440, 50, 2);
        vua.a(200, new int[4], (byte) -47, -var1 + 200, 440, 50, 3);
        vua.a(200, new int[4], (byte) -14, -var1 + 200, 440, 50, 4);
        vua.a(60, new int[3], (byte) -84, 400, 440, 50, 5);
        vua.a(200, new int[1], (byte) -58, 400, 440, 50, 6);
        vua.a(200, new int[0], (byte) -13, 200, 440, 50, 7);
        vua.a(200, new int[1], (byte) -26, 420, 440, 50, 8);
        vua.a(200, new int[6], (byte) -94, -var1 + 200, 440, 50, 9);
        field_t = "Choose the mission";
    }
}
