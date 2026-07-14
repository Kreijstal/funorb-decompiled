/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vn extends oh {
    int field_z;
    fs field_k;
    int field_x;
    int field_n;
    fs field_j;
    fs[] field_q;
    int field_u;
    int[] field_m;
    static int[] field_r;
    static String field_p;
    int[] field_v;
    ln field_o;
    sd field_h;
    fs field_l;
    static String field_A;
    static String field_i;
    static rn field_w;
    static a field_s;
    static qr field_t;
    static qr field_y;

    final static void d(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        ke.a(-6187, 640, 480, 372, 0);
        int var1 = -qd.field_a + 480;
        for (var2 = 0; hj.field_l.length > var2; var2++) {
            // if_acmpeq L68
            hj.field_l[var2].a(-208410008, var1);
            var1 -= 18;
        }
        if (param0 != -14145) {
            int discarded$0 = vn.e(-71);
        }
        ln.f((byte) -101);
    }

    final static int e(int param0) {
        if (param0 != -13299) {
            vn.a((byte) 41);
        }
        return new Date().getYear() + 1900;
    }

    final static boolean a(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1 = eh.field_L != null ? eh.field_L.length : 0;
        if (!(null == oi.field_i)) {
            for (var2 = 0; oi.field_i.length > var2; var2++) {
                var1 = var1 + oi.field_i[var2].length;
            }
        }
        if (param0 != 0) {
            return false;
        }
        var2 = var1 * ol.field_g.field_j;
        if (var2 <= te.field_c) {
            return true;
        }
        te.field_c = var2;
        return false;
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          ((vn) this).field_v = (int[]) ((vn) this).field_m.clone();
          if (param0) {
            break L0;
          } else {
            ((vn) this).c(false);
            break L0;
          }
        }
        ((vn) this).field_u = 0;
        var2 = 0;
        L1: while (true) {
          if (((vn) this).field_m.length <= var2) {
            if (-2 != (((vn) this).field_q.length ^ -1)) {
              L2: {
                ((vn) this).field_l = ((vn) this).field_q[vc.a((byte) -39, -1 + ((vn) this).field_q.length)];
                if (((vn) this).field_k != ((vn) this).field_l) {
                  break L2;
                } else {
                  ((vn) this).field_l = ((vn) this).field_q[-1 + ((vn) this).field_q.length];
                  break L2;
                }
              }
              L3: {
                var2 = -1 + ((vn) this).field_m.length;
                if (null != ((vn) this).field_k) {
                  stackOut_14_0 = ((vn) this).field_k.field_x;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = var2;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              L4: {
                var3 = stackIn_15_0;
                if (((vn) this).field_l == null) {
                  stackOut_17_0 = var2;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = ((vn) this).field_l.field_x;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              var4 = stackIn_18_0;
              ((vn) this).field_v[var3] = ((vn) this).field_v[var3] - ((vn) this).field_n;
              ((vn) this).field_u = ((vn) this).field_u - ((vn) this).field_n;
              ((vn) this).field_v[var4] = ((vn) this).field_v[var4] - 1;
              ((vn) this).field_u = ((vn) this).field_u - 1;
              return;
            } else {
              ((vn) this).field_u = 0;
              var2 = 0;
              L5: while (true) {
                if (((vn) this).field_v.length <= var2) {
                  return;
                } else {
                  ((vn) this).field_v[var2] = 0;
                  var2++;
                  continue L5;
                }
              }
            }
          } else {
            ((vn) this).field_u = ((vn) this).field_u + ((vn) this).field_m[var2];
            var2++;
            continue L1;
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_t = null;
        field_w = null;
        field_A = null;
        field_i = null;
        if (param0 != 68) {
            int discarded$0 = vn.e(52);
        }
    }

    vn(eg param0) {
        int var2 = 0;
        ((vn) this).field_z = 0;
        ((vn) this).field_m = param0.field_j;
        ((vn) this).field_j = param0.field_w;
        ((vn) this).field_n = param0.field_l;
        ((vn) this).field_q = param0.field_h;
        ((vn) this).field_k = param0.field_i;
        ((vn) this).field_o = param0.field_p;
        ((vn) this).field_h = param0.field_m;
        ((vn) this).field_x = param0.field_n;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((vn) this).field_m.length) {
            ((vn) this).c(true);
          } else {
            if (((vn) this).field_z < ((vn) this).field_m[var2]) {
              ((vn) this).field_z = ((vn) this).field_m[var2];
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static ro a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        ro var5 = null;
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (0 != param1.length()) {
              var2 = param1.indexOf((int) (char)param0);
              if (-1 == var2) {
                return fg.field_a;
              } else {
                var3 = param1.substring(0, var2);
                var4 = param1.substring(var2 - -1);
                var5 = uc.a(-77, var3);
                if (var5 == null) {
                  return fg.a(var4, (byte) 111);
                } else {
                  return var5;
                }
              }
            } else {
              break L0;
            }
          }
        }
        return hd.field_r;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_r = new int[6];
        field_p = "<%0> has left the lobby.";
        int[] var0 = new int[]{150, 60, 60, 60, 60, 60};
        int var1 = 560;
        for (var2 = 0; 6 > var2; var2++) {
            var1 = var1 - var0[var2];
        }
        var2 = 560;
        for (var3 = 5; var3 > 0; var3--) {
            var4 = var1 / (2 + var3);
            var1 = var1 - var4;
            var2 = var2 - var4;
            field_r[var3] = var2 - (var0[var3] >> -1030199615);
            var2 = var2 - var0[var3];
        }
        field_r[0] = var1 >> -362317151;
        field_i = "(hiding this text)";
        field_A = "Your rating is <%0>";
    }
}
