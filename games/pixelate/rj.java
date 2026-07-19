/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends gn {
    we field_D;
    int field_H;
    static ge field_F;
    byte field_B;
    static uo field_G;
    static int field_I;
    static jj[] field_C;

    final int g(int param0) {
        if (param0 < -92) {
          if (this.field_D == null) {
            return 0;
          } else {
            return this.field_D.field_m * 100 / (-this.field_B + this.field_D.field_k.length);
          }
        } else {
          rj.i(15);
          if (this.field_D == null) {
            return 0;
          } else {
            return this.field_D.field_m * 100 / (-this.field_B + this.field_D.field_k.length);
          }
        }
    }

    final static void a(int param0, boolean param1) {
        wa.field_c.a(0, 0, 120);
        if (param0 <= 73) {
            rj.c((byte) 4);
        }
    }

    final static nc j(int param0) {
        if (param0 != -30272) {
            field_G = (uo) null;
            return (nc) ((Object) new k());
        }
        return (nc) ((Object) new k());
    }

    final byte[] h(int param0) {
        if (!this.field_v) {
          if (this.field_D.field_m >= -this.field_B + this.field_D.field_k.length) {
            if (param0 != 0) {
              this.field_H = 39;
              return this.field_D.field_k;
            } else {
              return this.field_D.field_k;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    rj() {
    }

    final static void i(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = 16777215;
        gb.field_b = new tf(108, 100);
        var2 = 65793;
        gb.field_b.c();
        t.d(4, 0, t.field_j - 8, t.field_d, var1);
        t.c(4, 0, 4, var2);
        t.c(-4 + t.field_j + -1, 0, 4, var2);
        t.c(4, t.field_d, 4, var2);
        t.c(-4 + (t.field_j - 1), t.field_d, 4, var2);
        t.g(4, 0, t.field_d, var2);
        t.g(5, 0, t.field_d, var2);
        if (param0 != 7902) {
          field_C = (jj[]) null;
          t.g(-5 + t.field_j, 0, t.field_d, var2);
          t.g(-2 + t.field_j + -4, 0, t.field_d, var2);
          t.b(4, 0, -8 + t.field_j, var2);
          t.b(4, -1 + t.field_d, t.field_j + -8, var2);
          wh.field_q = new tf(gb.field_b.field_A, 4);
          wh.field_q.c();
          t.c(4, t.field_d, 4, var2);
          t.c(t.field_j + -5, t.field_d, 4, var2);
          t.b(4, -1 + t.field_d, -8 + t.field_j, var2);
          of.field_h = new tf(wh.field_q.field_A, wh.field_q.field_B);
          of.field_h.c();
          wh.field_q.c(0, 0);
          qa.field_f.a(19692);
          return;
        } else {
          t.g(-5 + t.field_j, 0, t.field_d, var2);
          t.g(-2 + t.field_j + -4, 0, t.field_d, var2);
          t.b(4, 0, -8 + t.field_j, var2);
          t.b(4, -1 + t.field_d, t.field_j + -8, var2);
          wh.field_q = new tf(gb.field_b.field_A, 4);
          wh.field_q.c();
          t.c(4, t.field_d, 4, var2);
          t.c(t.field_j + -5, t.field_d, 4, var2);
          t.b(4, -1 + t.field_d, -8 + t.field_j, var2);
          of.field_h = new tf(wh.field_q.field_A, wh.field_q.field_B);
          of.field_h.c();
          wh.field_q.c(0, 0);
          qa.field_f.a(19692);
          return;
        }
    }

    public static void c(byte param0) {
        field_G = null;
        field_F = null;
        field_C = null;
        if (param0 > -44) {
            rj.c((byte) -123);
        }
    }

    static {
        field_F = new ge();
        field_C = new jj[8];
    }
}
