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
        if (param1 != -6782) {
          ij.c((byte) -111);
          return la.a((byte) 123, param0.field_v.length(), '*');
        } else {
          return la.a((byte) 123, param0.field_v.length(), '*');
        }
    }

    ij(int param0) {
        this(oe.field_g, param0);
    }

    private ij(eg param0, int param1) {
        super(param0, param1);
    }

    final static void c(byte param0) {
        if (gi.field_d != null) {
          rk.a((byte) 116, (java.awt.Canvas) (Object) gi.field_d);
          if (param0 >= -77) {
            L0: {
              field_w = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new k(0, 2, 2, 1);
        field_x = "Loading fonts";
        field_A = new long[32];
    }
}
