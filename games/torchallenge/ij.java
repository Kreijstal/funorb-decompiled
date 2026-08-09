/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends fk {
    static k field_w;
    static boolean field_z;
    static long[] field_A;
    static String field_x;
    static int field_B;
    static rk[] field_y;

    final String a(ee param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -6782) {
                break L1;
              } else {
                ij.c((byte) -111);
                break L1;
              }
            }
            stackIn_3_0 = la.a((byte) 123, param0.field_v.length(), '*');
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ij.Q(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ij(int param0) {
        this(oe.field_g, param0);
    }

    private ij(eg param0, int param1) {
        super(param0, param1);
    }

    final static void c(byte param0) {
        if (gi.field_d != null) {
          rk.a((byte) 116, gi.field_d);
          if (param0 >= -77) {
            L0: {
              field_w = (k) null;
              gi.field_d.a(sh.field_u, -69);
              gi.field_d = null;
              if (tf.field_h != null) {
                tf.field_h.d(-1);
                break L0;
              } else {
                break L0;
              }
            }
            bg.field_P.requestFocus();
            return;
          } else {
            L1: {
              gi.field_d.a(sh.field_u, -69);
              gi.field_d = null;
              if (tf.field_h != null) {
                tf.field_h.d(-1);
                break L1;
              } else {
                break L1;
              }
            }
            bg.field_P.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 42) {
          ij.b(50);
          field_y = null;
          field_x = null;
          field_w = null;
          field_A = null;
          return;
        } else {
          field_y = null;
          field_x = null;
          field_w = null;
          field_A = null;
          return;
        }
    }

    static {
        field_w = new k(0, 2, 2, 1);
        field_x = "Loading fonts";
        field_A = new long[32];
    }
}
