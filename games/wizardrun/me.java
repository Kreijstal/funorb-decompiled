/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static int field_c;
    static String field_a;
    static volatile long field_e;
    static String field_b;
    static String field_d;
    static int field_f;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -31) {
            field_f = -76;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param0) != 0) {
            var2 = -(param0 & 7) + 8;
        }
        int var4 = 77;
        int var3 = param0 + var2;
        return var3;
    }

    final static void a(int param0) {
        int discarded$5 = 1;
        rj.a((String) null, we.field_a);
        if (param0 != 7) {
            me.a((byte) -55);
        }
    }

    final static void a(int param0, boolean param1) {
        jf.field_f = mf.field_g[param0];
        bl.field_c = af.field_c[param0];
        if (!param1) {
          me.a((byte) -45);
          td.field_e = wh.field_e[param0];
          return;
        } else {
          td.field_e = wh.field_e[param0];
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Retry";
        field_c = -1;
        field_e = 0L;
        field_b = "Game Over";
    }
}
