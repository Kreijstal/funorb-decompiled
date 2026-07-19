/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hb extends tk {
    static boolean field_y;
    static long field_x;
    static int[] field_z;
    static int field_w;
    boolean field_B;
    static String field_A;
    volatile boolean field_u;
    boolean field_v;

    abstract byte[] c(byte param0);

    final static void a(kn param0, boolean param1) {
        try {
            if (param1) {
                hb.a(27, -126, 116, 12, -63, -53, 36, -10, -75);
            }
            param0.field_v = new int[]{-1};
            param0.field_u = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "hb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void g(int param0) {
        if (param0 < 20) {
            return;
        }
        bd.a(4, true);
    }

    public static void a(byte param0) {
        field_A = null;
        if (param0 <= 1) {
            kn var2 = (kn) null;
            hb.a((kn) null, true);
            field_z = null;
            return;
        }
        field_z = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        L0: {
          param7 = -param7 + 256;
          if (param3 == 2) {
            break L0;
          } else {
            hb.a((byte) -88);
            break L0;
          }
        }
        param4 = 256 + -param4;
        if (-1 == (param8 ^ -1)) {
          if (0 != param1) {
            rp.a(param8 + param0, 65280, -(param8 * 2) + param6, param4 * param7 >> 1588022344, -(param1 * 2) + param5, param1 + param2);
            rp.a(param0, 65280, param6, param4, param1, param2);
            rp.a(param0, 65280, param6, param4, param1, param2 + param5 - param1);
            rp.a(param0, 65280, param8, param4, -(2 * param1) + param5, param2 - -param1);
            rp.a(-param8 + param0 - -param6, 65280, param8, param4, param5 + -(2 * param1), param1 + param2);
            nh.a(14 + param6, param5 - -14, -40, -7 + param0, cd.field_h, param2 - 7);
            return;
          } else {
            rp.a(param0, 65280, param6, param4, param5, param2);
            nh.a(14 + param6, param5 - -14, -40, -7 + param0, cd.field_h, param2 - 7);
            return;
          }
        } else {
          rp.a(param8 + param0, 65280, -(param8 * 2) + param6, param4 * param7 >> 1588022344, -(param1 * 2) + param5, param1 + param2);
          rp.a(param0, 65280, param6, param4, param1, param2);
          rp.a(param0, 65280, param6, param4, param1, param2 + param5 - param1);
          rp.a(param0, 65280, param8, param4, -(2 * param1) + param5, param2 - -param1);
          rp.a(-param8 + param0 - -param6, 65280, param8, param4, param5 + -(2 * param1), param1 + param2);
          nh.a(14 + param6, param5 - -14, -40, -7 + param0, cd.field_h, param2 - 7);
          return;
        }
    }

    abstract int f(int param0);

    hb() {
        this.field_u = true;
    }

    static {
        field_x = 20000000L;
        field_w = 0;
        field_A = "Invite <%0> to this game";
    }
}
