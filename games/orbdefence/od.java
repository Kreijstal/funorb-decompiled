/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static nc field_f;
    private re field_l;
    private int[] field_i;
    private int[] field_c;
    static String field_a;
    static String field_h;
    private int field_e;
    private int[] field_m;
    private int[] field_n;
    static char field_k;
    private int field_o;
    static int[] field_j;
    private int[] field_d;
    private int field_g;
    private int[] field_b;

    private final void a(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var2 = ul.field_b;
          var3 = ul.field_f;
          ((od) this).field_o = 0;
          ((od) this).field_m = new int[200];
          ((od) this).field_e = 0;
          if (param0 <= -58) {
            break L0;
          } else {
            od.b((byte) -52);
            break L0;
          }
        }
        var4 = ul.field_l;
        ((od) this).field_d = new int[200];
        ((od) this).field_b = new int[200];
        ((od) this).field_g = 320;
        ((od) this).field_c = new int[200];
        ((od) this).field_l = new re(new int[5]);
        ((od) this).field_i = new int[64];
        var5 = 0;
        L1: while (true) {
          if (-65 >= (var5 ^ -1)) {
            ((od) this).field_n = new int[32];
            var5 = 0;
            L2: while (true) {
              if ((var5 ^ -1) <= -17) {
                ul.field_f = var3;
                ul.field_b = var2;
                ul.field_l = var4;
                ul.c();
                return;
              } else {
                ((od) this).field_n[var5] = var5 * 262660;
                ((od) this).field_n[31 + -var5] = var5 * 262660;
                var5++;
                continue L2;
              }
            }
          } else {
            ((od) this).field_i[var5] = 65537 * var5;
            if ((var5 ^ -1) < -33) {
              ((od) this).field_i[var5] = ge.a(((od) this).field_i[var5], -8192 + 256 * var5);
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        if (-26 >= (((od) this).field_e ^ -1)) {
            this.a((byte) -124, 25);
        } else {
            this.a((byte) -119, 25 * cc.field_f.field_e / 25);
        }
        if (!param0) {
            this.a((byte) -53, -57);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 192) {
            od.b((byte) 41);
        }
        se var1 = uk.field_b;
        while (wl.a(-1)) {
            var1.i(8, -44);
            var1.field_i = var1.field_i + 1;
            var2 = var1.field_i + 1;
            dk.a((byte) 15, var1);
            uk.field_b.c((byte) 115, var1.field_i - var2);
        }
    }

    public static void b(byte param0) {
        if (param0 != -87) {
            od.a(31);
        }
        field_j = null;
        field_f = null;
        field_a = null;
        field_h = null;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var3 = -120 - -(2 * lc.field_o);
          ((od) this).field_g = 75;
          if (wj.field_m == 3) {
            ((od) this).field_g = ((od) this).field_g + 370;
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 108;
        ul.f(((od) this).field_g, var3, var4 >> -1644137087, 0);
        ul.g(((od) this).field_g, var3, var4 >> 720140225, 7798903);
        var6 = -102 / ((param0 - -55) / 63);
        var10 = 0;
        L1: while (true) {
          if ((var10 ^ -1) <= -201) {
            L2: {
              ul.i(((od) this).field_g, var3, var4 >> 2110462369, 0, 50);
              ul.b(((od) this).field_g << 995427908, var3 << 1244985412, 2 + var4 << -996124 >> -1274580319, 192, ((od) this).field_n);
              if (-26 >= (param1 ^ -1)) {
                break L2;
              } else {
                ul.i(((od) this).field_g, var3, 48, 0, 250 - 10 * param1);
                break L2;
              }
            }
            ul.b(((od) this).field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, ((od) this).field_n);
            ul.b(((od) this).field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, ((od) this).field_n);
            ul.b(((od) this).field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, ((od) this).field_n);
            return;
          } else {
            var8 = ((((od) this).field_d[var10] >> 732925668) * (((od) this).field_d[var10] >> -1614043100) + (((od) this).field_c[var10] >> 1847670244) * (((od) this).field_c[var10] >> -2002186652)) / 3;
            if (-1 > (var8 ^ -1)) {
              L3: {
                var9 = var8 >> 1553684068;
                var5 = (int)((double)(var4 * ((od) this).field_d[var10]) / Math.sqrt((double)(var8 * 3)));
                var7 = (int)((double)(var4 * ((od) this).field_c[var10]) / Math.sqrt((double)(var8 * 3)));
                if ((param1 ^ -1) < -26) {
                  var8 = var8 + (10 * param1 + -250);
                  var9 = var9 + (-25 + param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var9 > 63) {
                  var9 = 63;
                  break L4;
                } else {
                  break L4;
                }
              }
              ul.a((var5 >> 1592781025) - -(((od) this).field_g << -2130156444), (var3 << 709311908) + (var7 >> 1581001889), var8 >> -1761747486 >> 1733067201, var9, ((od) this).field_i);
              var10++;
              continue L1;
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (vj.a(52)) {
          return;
        } else {
          L0: {
            ((od) this).field_e = ((od) this).field_e + 1;
            if (param0 >= 4) {
              break L0;
            } else {
              ((od) this).field_m = null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= 200) {
              L2: {
                var2 = 864 + ((od) this).field_l.a(128) % 160;
                var3 = (double)(((od) this).field_l.a(128) % 214) + (double)(((od) this).field_l.a(128) % 100) * 0.01;
                ((od) this).field_m[((od) this).field_o] = (int)((double)var2 * Math.sin(var3));
                ((od) this).field_b[((od) this).field_o] = (int)((double)var2 * Math.cos(var3));
                ((od) this).field_o = ((od) this).field_o + 1;
                if (200 > ((od) this).field_o) {
                  break L2;
                } else {
                  ((od) this).field_o = 0;
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (((od) this).field_m[var2] <= ((od) this).field_d[var2]) {
                  break L3;
                } else {
                  ((od) this).field_d[var2] = ((od) this).field_d[var2] + 6;
                  break L3;
                }
              }
              L4: {
                if (((od) this).field_d[var2] > ((od) this).field_m[var2]) {
                  ((od) this).field_d[var2] = ((od) this).field_d[var2] - 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((od) this).field_c[var2] < ((od) this).field_b[var2]) {
                  ((od) this).field_c[var2] = ((od) this).field_c[var2] + 3;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (((od) this).field_b[var2] < ((od) this).field_c[var2]) {
                ((od) this).field_c[var2] = ((od) this).field_c[var2] - 6;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    od() {
        this.a((byte) -116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is a hidden Achievement";
        field_a = "PANICO";
    }
}
