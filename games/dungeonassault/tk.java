/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk {
    int[] field_n;
    private cn[] field_p;
    int[] field_z;
    int[] field_m;
    int[] field_s;
    boolean[] field_i;
    int[] field_x;
    int[] field_e;
    int[] field_h;
    int[] field_c;
    int field_g;
    private se field_o;
    static pp field_k;
    static String field_b;
    int[] field_y;
    int[] field_a;
    int[] field_u;
    int[] field_A;
    boolean[] field_B;
    private cn[] field_l;
    int[] field_j;
    int[] field_f;
    private String[] field_t;
    int[] field_q;
    int[] field_d;
    int field_w;
    int field_r;
    static String field_v;

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((tk) this).field_w = ((tk) this).field_w + 1;
    }

    final static void a(byte param0) {
        tn.a(-1);
        if (param0 > -64) {
            field_v = null;
        }
        he.field_s = true;
        qc.field_t = true;
        lg.field_w.h(1);
        gh.a(23321, ha.field_o, false);
    }

    private final int a(cn[] param0, cn[] param1, int[] param2, se param3, int param4, String[] param5, int param6) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        boolean[] var16 = null;
        int var17 = 0;
        int[] var24 = null;
        int var19 = 0;
        int var20 = DungeonAssault.field_K;
        int var8 = param1.length;
        ((tk) this).field_z = new int[var8];
        ((tk) this).field_d = new int[var8];
        ((tk) this).field_i = new boolean[var8];
        ((tk) this).field_q = new int[var8];
        ((tk) this).field_y = new int[var8];
        ((tk) this).field_p = param0;
        ((tk) this).field_w = 0;
        ((tk) this).field_B = new boolean[var8];
        ((tk) this).field_m = new int[var8];
        ((tk) this).field_j = new int[var8];
        ((tk) this).field_o = param3;
        ((tk) this).field_a = new int[var8];
        ((tk) this).field_A = new int[var8];
        ((tk) this).field_u = new int[var8];
        ((tk) this).field_t = param5;
        ((tk) this).field_l = param1;
        ((tk) this).field_e = new int[var8];
        ((tk) this).field_n = new int[var8];
        ((tk) this).field_f = new int[var8];
        if (param6 != 2048) {
            tk.b((byte) -101);
        }
        ((tk) this).field_x = new int[var8];
        ((tk) this).field_c = new int[var8];
        ((tk) this).field_s = new int[var8];
        ((tk) this).field_h = new int[var8];
        Random var9 = new Random(416516L);
        int var10 = 0;
        for (var11 = 0; var11 < var8; var11++) {
            var12 = param1[var11].field_y << -152367260;
            var13 = param1[var11].field_v << 918994852;
            var14 = var12 / 2;
            var15 = var13 / 2;
            ((tk) this).field_c[var11] = -1024 - -uj.a(var9, 37, 2048);
            ((tk) this).field_n[var11] = 6000 - -uj.a(var9, md.b(param6, 2085), 2048);
            ((tk) this).field_A[var11] = -var14 / 2;
            ((tk) this).field_y[var11] = -var15 / 2;
            ((tk) this).field_j[var11] = -(var14 * ((tk) this).field_n[var11]) >> -1285621844;
            ((tk) this).field_q[var11] = -(var15 * ((tk) this).field_n[var11]) >> 503088332;
            ((tk) this).field_h[var11] = -1024 - -uj.a(var9, 37, 2048);
            ((tk) this).field_s[var11] = uj.a(var9, 37, 2048) + 6000;
            ((tk) this).field_e[var11] = -var14 / 4;
            ((tk) this).field_m[var11] = -var15 / 4;
            ((tk) this).field_f[var11] = -(var14 * ((tk) this).field_n[var11]) >> 41697836;
            ((tk) this).field_x[var11] = -(((tk) this).field_n[var11] * var15 >> -1422977684) + 2000;
            ((tk) this).field_z[var11] = var10;
            var10 = var10 + param2[var11];
            ((tk) this).field_d[var11] = var10 + param4;
            var16 = ((tk) this).field_i;
            ((tk) this).field_B[var11] = false;
            var17 = var11;
            var16[var17] = false;
            var24 = ((tk) this).field_u;
            var19 = var11;
            ((tk) this).field_a[var11] = 0;
            var24[var19] = 0;
        }
        return ((tk) this).field_d[-1 + var8];
    }

    public static void b(byte param0) {
        field_v = null;
        field_k = null;
        if (param0 != 10) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        sm.field_c = param2;
        om.field_a = param0;
        he.field_p = param3;
        if (param1 > -35) {
            field_v = null;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var10 = 0;
        L0: {
          var10 = DungeonAssault.field_K;
          var2 = 0;
          if (param0 <= -1) {
            break L0;
          } else {
            ((tk) this).field_w = -24;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((tk) this).field_l.length) {
            return;
          } else {
            if (((tk) this).field_w >= ((tk) this).field_z[var2]) {
              if (((tk) this).field_d[var2] >= ((tk) this).field_w) {
                L2: {
                  var3 = ((tk) this).field_w - ((tk) this).field_z[var2];
                  var4 = ((tk) this).field_d[var2] + -((tk) this).field_z[var2];
                  var5 = (double)var3 / (double)var4;
                  if (12 <= bc.field_a) {
                    ((tk) this).field_l[var2].b((int)to.a(((tk) this).field_A[var2], ((tk) this).field_e[var2], var5, -94), (int)to.a(((tk) this).field_y[var2], ((tk) this).field_m[var2], var5, -92), (int)to.a(((tk) this).field_j[var2], ((tk) this).field_f[var2], var5, 122), (int)to.a(((tk) this).field_q[var2], ((tk) this).field_x[var2], var5, -104), (int)to.a(((tk) this).field_c[var2], ((tk) this).field_h[var2], var5, -82), (int)to.a(((tk) this).field_n[var2], ((tk) this).field_s[var2], var5, -95));
                    break L2;
                  } else {
                    ((tk) this).field_l[var2].a((int)to.a(((tk) this).field_A[var2], ((tk) this).field_e[var2], var5, 127), (int)to.a(((tk) this).field_y[var2], ((tk) this).field_m[var2], var5, -109), (int)to.a(((tk) this).field_j[var2], ((tk) this).field_f[var2], var5, 76), (int)to.a(((tk) this).field_q[var2], ((tk) this).field_x[var2], var5, -110), (int)to.a(((tk) this).field_c[var2], ((tk) this).field_h[var2], var5, -45), (int)to.a(((tk) this).field_n[var2], ((tk) this).field_s[var2], var5, 77));
                    break L2;
                  }
                }
                L3: {
                  gf.b(0, 0, gf.field_i, ((tk) this).field_r, 0);
                  gf.b(0, gf.field_c + -((tk) this).field_r, gf.field_i, ((tk) this).field_r, 0);
                  if (((tk) this).field_o == null) {
                    if (-26 >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (!((tk) this).field_B[var2]) {
                        break L3;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, ((tk) this).field_a[var2], 256 + -(var3 * 10));
                        break L3;
                      }
                    }
                  } else {
                    if (-26 >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (!((tk) this).field_B[var2]) {
                        break L3;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, ((tk) this).field_a[var2], 256 + -(var3 * 10));
                        break L3;
                      }
                    }
                  }
                }
                var3 = -var3 + var4;
                if (25 > var3) {
                  if (((tk) this).field_i[var2]) {
                    gf.b(0, 0, gf.field_i, gf.field_c, ((tk) this).field_u[var2], 256 + -(10 * var3));
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    tk(cn[] param0, int[] param1, int param2, se param3, String[] param4, cn[] param5) {
        ((tk) this).field_g = this.a(param5, param0, param1, param3, param2, param4, 2048);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=FF0000>Lethal</col>. Can cause party to flee in terror.";
    }
}
