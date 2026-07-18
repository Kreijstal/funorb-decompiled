/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int[] field_d;
    static int field_a;
    static gk field_f;
    static gk field_g;
    static int field_c;
    static dm field_b;
    static String field_e;

    final static void b(int param0, int param1) {
        lj.field_a = 60;
        fj.field_o = 12;
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = 43 / ((24 - param1) / 50);
          if ((field_a & 1) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        return stackIn_3_0 != 0;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 <= 88) {
          return -15;
        } else {
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 - -1;
        }
    }

    final static void a(boolean param0, int param1) {
        j.field_lb = t.field_k[param1];
        ri.field_c = tf.field_e[param1];
        vc.field_g = le.field_b[param1];
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[4];
        field_a = 0;
        field_f = new gk();
        field_g = new gk();
        field_e = "Email is valid";
        field_c = 0;
    }
}
