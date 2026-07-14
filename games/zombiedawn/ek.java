/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek extends fb {
    private int field_F;
    private int field_N;
    boolean field_G;
    static nk field_E;
    private int field_K;
    private int field_L;
    private int field_H;
    int field_M;
    private int field_D;
    static int field_I;
    static int field_J;

    final void j(int param0) {
        ((ek) this).b(-27598);
        ((ek) this).c((byte) -56);
        td.field_c.a((le) this, 87);
        if (param0 != -18475) {
            ek.i(112);
        }
    }

    private final void f(byte param0) {
        Object var3 = null;
        ((ek) this).field_H = pb.a(so.field_a, 127, 1) + 128;
        if (param0 != -8) {
          var3 = null;
          ((ek) this).a((byte) 119, (wk) null);
          ((ek) this).field_F = 0;
          ((ek) this).field_y = ((ek) this).field_N - (-pb.a(so.field_a, 24, param0 ^ -7) - -12) << 1112895856;
          ((ek) this).field_x = ((ek) this).field_L - 12 - -pb.a(so.field_a, 24, 1) << 99730800;
          return;
        } else {
          ((ek) this).field_F = 0;
          ((ek) this).field_y = ((ek) this).field_N - (-pb.a(so.field_a, 24, param0 ^ -7) - -12) << 1112895856;
          ((ek) this).field_x = ((ek) this).field_L - 12 - -pb.a(so.field_a, 24, 1) << 99730800;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ((ek) this).field_L = param0;
        ((ek) this).field_G = false;
        ((ek) this).field_N = param1;
        if (param3 != 2011722288) {
          return;
        } else {
          ((ek) this).field_y = param1 << -703263792;
          ((ek) this).field_x = param0 << 2011722288;
          ((ek) this).field_M = 0;
          this.f((byte) -8);
          var5 = bg.field_o.length;
          ((ek) this).field_D = pb.a(so.field_a, 10, 1);
          ((ek) this).field_K = pb.a(so.field_a, param2, 1);
          ((ek) this).field_F = pb.a(so.field_a, var5, 1);
          return;
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        if (!((ek) this).field_G) {
          ((ek) this).field_K = ((ek) this).field_K - 1;
          if (((ek) this).field_K - 1 <= 0) {
            if (param0 < -76) {
              var3 = param1.a(((ek) this).a(true), (byte) -59);
              var4 = param1.a(((ek) this).f(237239984), 0) + -24;
              if (km.a(21405, var3, param1, var4)) {
                if (!ng.field_e) {
                  if (!dj.field_e.field_H.field_b[((ek) this).f(237239984) / 24][((ek) this).a(true) / 24]) {
                    bg.field_o[((ek) this).field_F].e(var3, var4, ((ek) this).field_H);
                    return;
                  } else {
                    return;
                  }
                } else {
                  bg.field_o[((ek) this).field_F].e(var3, var4, ((ek) this).field_H);
                  return;
                }
              } else {
                return;
              }
            } else {
              ((ek) this).j(-76);
              var3 = param1.a(((ek) this).a(true), (byte) -59);
              var4 = param1.a(((ek) this).f(237239984), 0) + -24;
              if (km.a(21405, var3, param1, var4)) {
                if (!ng.field_e) {
                  if (!dj.field_e.field_H.field_b[((ek) this).f(237239984) / 24][((ek) this).a(true) / 24]) {
                    bg.field_o[((ek) this).field_F].e(var3, var4, ((ek) this).field_H);
                    return;
                  } else {
                    return;
                  }
                } else {
                  bg.field_o[((ek) this).field_F].e(var3, var4, ((ek) this).field_H);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_E = null;
    }

    final void g(int param0) {
        ((ek) this).field_D = ((ek) this).field_D + 1;
        if (-5 >= (((ek) this).field_D + 1 ^ -1)) {
          ((ek) this).field_D = 0;
          ((ek) this).field_F = ((ek) this).field_F + 1;
          if (((ek) this).field_F + 1 < bg.field_o.length) {
            if (param0 < 95) {
              ((ek) this).a(-13, -95, -104, 35);
              return;
            } else {
              return;
            }
          } else {
            if (((ek) this).field_M == 1) {
              ((ek) this).field_G = true;
              if (param0 < 95) {
                ((ek) this).a(-13, -95, -104, 35);
                return;
              } else {
                return;
              }
            } else {
              this.f((byte) -8);
              if (param0 >= 95) {
                return;
              } else {
                ((ek) this).a(-13, -95, -104, 35);
                return;
              }
            }
          }
        } else {
          if (param0 >= 95) {
            return;
          } else {
            ((ek) this).a(-13, -95, -104, 35);
            return;
          }
        }
    }

    ek() {
        super(0, 0, 0);
        ((ek) this).field_D = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new nk(0);
        field_J = 5;
    }
}
