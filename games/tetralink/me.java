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

    final static void a(java.awt.Component param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.setFocusTraversalKeysEnabled(false);
              param0.addKeyListener(vi.field_a);
              param0.addFocusListener(vi.field_a);
              if (param1 == 250) {
                break L1;
              } else {
                discarded$2 = me.a((byte) 114);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("me.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
        if (param0) {
          me.b((byte) 92);
          vc.field_c = vc.field_c + 1;
          return;
        } else {
          vc.field_c = vc.field_c + 1;
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 > -91) {
            return;
        }
        field_i = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 >= jj.field_a) {
            ve.a(0, param0 ^ 66);
        } else {
            var1 = jj.field_a % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            ve.a(jj.field_a + -var1, param0 ^ 125);
        }
    }

    final static boolean a(byte param0) {
        boolean discarded$8 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -99) {
          L0: {
            discarded$8 = me.a((byte) -112);
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
        field_h = "Year";
        field_f = "Security";
        field_i = "Username: ";
        field_d = false;
        field_a = 0;
        field_c = "Red";
    }
}
