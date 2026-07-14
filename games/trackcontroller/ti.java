/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends fc {
    long[][] field_q;
    int[][] field_n;
    String[][] field_m;
    static String field_p;
    static String field_r;
    int field_i;
    boolean field_o;
    int field_l;
    int field_k;
    static int[] field_j;

    final static void a(int param0, int param1) {
        ba.field_f = 1000000000L / (long)param1;
        if (param0 > -103) {
            Object var3 = null;
            ti.a(-55, (byte) 107, (cf) null);
        }
    }

    public static void c(byte param0) {
        int var1 = -100 % ((-71 - param0) / 39);
        field_p = null;
        field_j = null;
        field_r = null;
    }

    final static void a(int param0, byte param1, cf param2) {
        if (param1 < 17) {
          ti.a(-51, -77);
          kd.field_b.a((byte) -120, (fc) (Object) param2);
          md.a(param0, param2, 118);
          return;
        } else {
          kd.field_b.a((byte) -120, (fc) (Object) param2);
          md.a(param0, param2, 118);
          return;
        }
    }

    final static ng a(String param0, kk param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3 != 17) {
          return null;
        } else {
          var4 = param1.a(true, param2);
          var5 = param1.a(param0, var4, -1);
          return pj.a(param1, var5, -127, var4);
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (param0 != -58) {
          var2 = null;
          ng discarded$2 = ti.a((String) null, (kk) null, (String) null, -73);
          qc.b(17, (byte) -42);
          return;
        } else {
          qc.b(17, (byte) -42);
          return;
        }
    }

    ti() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Confirm Password: ";
        field_p = "Type your age in years";
    }
}
