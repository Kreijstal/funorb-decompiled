/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static oh field_e;
    static String field_h;
    static String field_c;
    static String field_i;
    static String field_f;
    static int field_g;
    static boolean field_d;
    static int field_a;
    static int field_b;

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener((java.awt.event.KeyListener) (Object) vi.field_a);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) vi.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("me.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 250 + ')');
        }
    }

    final static void a(boolean param0) {
        sc.field_a[vc.field_c] = ra.field_b;
        qd.field_Y[vc.field_c] = ra.field_j;
        ea.field_b[vc.field_c] = ra.field_l;
        ca.field_f[vc.field_c] = ra.field_i;
        ml.field_ib[vc.field_c] = ra.field_g;
        gh.field_a[vc.field_c] = ra.field_f;
        hc.field_s[vc.field_c] = ra.field_e;
        vc.field_c = vc.field_c + 1;
    }

    public static void b() {
        field_i = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static void a() {
        int var1 = 0;
        if (32 >= jj.field_a) {
            ve.a(0, 98);
        } else {
            var1 = jj.field_a % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            ve.a(jj.field_a + -var1, 93);
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -99) {
          L0: {
            boolean discarded$8 = me.a((byte) -112);
            if (250 >= en.field_K) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= en.field_K) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Year";
        field_f = "Security";
        field_i = "Username: ";
        field_d = false;
        field_a = 0;
        field_c = "Red";
    }
}
