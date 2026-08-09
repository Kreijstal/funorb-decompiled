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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.setFocusTraversalKeysEnabled(false);
              param0.addKeyListener(vi.field_a);
              param0.addFocusListener(vi.field_a);
              if (param1 == 250) {
                break L1;
              } else {
                me.a((byte) 114);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("me.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -99) {
          L0: {
            me.a((byte) -112);
            if (250 >= en.field_K) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= en.field_K) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
