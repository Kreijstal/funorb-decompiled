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
        if (param0 < 17) {
            field_z = 70;
            field_A = null;
            return;
        }
        field_A = null;
    }

    cc() {
    }

    final int f(int param0) {
        if (param0 > 51) {
          if (null == this.field_y) {
            return 0;
          } else {
            return 100 * this.field_y.field_l / (this.field_y.field_o.length - this.field_x);
          }
        } else {
          cc.a((byte) -115, 18);
          if (null == this.field_y) {
            return 0;
          } else {
            return 100 * this.field_y.field_l / (this.field_y.field_o.length - this.field_x);
          }
        }
    }

    final byte[] a(boolean param0) {
        if (!this.field_s) {
          if (-this.field_x + this.field_y.field_o.length <= this.field_y.field_l) {
            if (param0) {
              this.field_y = (p) null;
              return this.field_y.field_o;
            } else {
              return this.field_y.field_o;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        field_v = "Checking";
    }
}
