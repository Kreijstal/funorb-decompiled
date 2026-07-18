/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends ab {
    p field_y;
    byte field_x;
    static String field_A;
    static int field_z;
    int field_w;
    static String field_v;

    final static void a(byte param0, int param1) {
        nk var2 = null;
        int var3 = 0;
        if (param0 != 81) {
          return;
        } else {
          var2 = qn.field_U;
          var2.f(param1, -118);
          var2.field_l = var2.field_l + 1;
          var3 = var2.field_l;
          var2.c(2, (byte) 47);
          var2.a(g.field_f, (byte) -45, 0, g.field_f.length);
          var2.c(qd.field_u, (byte) -69);
          var2.c(p.field_n, (byte) 107);
          var2.a(fe.field_d, (byte) -45, 0, fe.field_d.length);
          var2.a(var2.field_l - var3, -1);
          return;
        }
    }

    public static void e(byte param0) {
        field_v = null;
        field_A = null;
    }

    cc() {
    }

    final int f(int param0) {
        if (param0 > 51) {
          if (null == ((cc) this).field_y) {
            return 0;
          } else {
            return 100 * ((cc) this).field_y.field_l / (((cc) this).field_y.field_o.length - ((cc) this).field_x);
          }
        } else {
          cc.a((byte) -115, 18);
          if (null == ((cc) this).field_y) {
            return 0;
          } else {
            return 100 * ((cc) this).field_y.field_l / (((cc) this).field_y.field_o.length - ((cc) this).field_x);
          }
        }
    }

    final byte[] a(boolean param0) {
        if (!((cc) this).field_s) {
          if (-((cc) this).field_x + ((cc) this).field_y.field_o.length <= ((cc) this).field_y.field_l) {
            if (param0) {
              ((cc) this).field_y = null;
              return ((cc) this).field_y.field_o;
            } else {
              return ((cc) this).field_y.field_o;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Checking";
    }
}
