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

    private final void a() {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var2 = ul.field_b;
        var3 = ul.field_f;
        ((od) this).field_o = 0;
        ((od) this).field_m = new int[200];
        ((od) this).field_e = 0;
        var4 = ul.field_l;
        ((od) this).field_d = new int[200];
        ((od) this).field_b = new int[200];
        ((od) this).field_g = 320;
        ((od) this).field_c = new int[200];
        ((od) this).field_l = new re(new int[5]);
        ((od) this).field_i = new int[64];
        var5 = 0;
        L0: while (true) {
          if (var5 >= 64) {
            ((od) this).field_n = new int[32];
            var5 = 0;
            L1: while (true) {
              if (var5 >= 16) {
                ul.field_f = var3;
                ul.field_b = var2;
                ul.field_l = var4;
                ul.c();
                return;
              } else {
                ((od) this).field_n[var5] = var5 * 262660;
                ((od) this).field_n[31 + -var5] = var5 * 262660;
                var5++;
                continue L1;
              }
            }
          } else {
            ((od) this).field_i[var5] = 65537 * var5;
            if (var5 > 32) {
              ((od) this).field_i[var5] = ge.a(((od) this).field_i[var5], -8192 + 256 * var5);
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(boolean param0) {
        if (((od) this).field_e >= 25) {
            this.a((byte) -124, 25);
        } else {
            this.a((byte) -119, 25 * cc.field_f.field_e / 25);
        }
        if (!param0) {
            this.a((byte) -53, -57);
        }
    }

    final static void a(int param0) {
        se var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 192) {
                break L1;
              } else {
                od.b((byte) 41);
                break L1;
              }
            }
            var1 = uk.field_b;
            L2: while (true) {
              if (!wl.a(-1)) {
                break L0;
              } else {
                var1.i(8, -44);
                int fieldTemp$5 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$5;
                dk.a((byte) 15, var1);
                uk.field_b.c((byte) 115, var1.field_i - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1_ref, "od.D(" + param0 + ')');
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
        ul.f(((od) this).field_g, var3, var4 >> 1, 0);
        ul.g(((od) this).field_g, var3, var4 >> 1, 7798903);
        var6 = -102 / ((param0 - -55) / 63);
        var10 = 0;
        L1: while (true) {
          if (var10 >= 200) {
            L2: {
              ul.i(((od) this).field_g, var3, var4 >> 1, 0, 50);
              ul.b(((od) this).field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, ((od) this).field_n);
              if (param1 >= 25) {
                break L2;
              } else {
                ul.i(((od) this).field_g, var3, 48, 0, 250 - 10 * param1);
                break L2;
              }
            }
            ul.b(((od) this).field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, ((od) this).field_n);
            ul.b(((od) this).field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, ((od) this).field_n);
            ul.b(((od) this).field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, ((od) this).field_n);
            return;
          } else {
            var8 = ((((od) this).field_d[var10] >> 4) * (((od) this).field_d[var10] >> 4) + (((od) this).field_c[var10] >> 4) * (((od) this).field_c[var10] >> 4)) / 3;
            if (var8 > 0) {
              L3: {
                var9 = var8 >> 4;
                var5 = (int)((double)(var4 * ((od) this).field_d[var10]) / Math.sqrt((double)(var8 * 3)));
                var7 = (int)((double)(var4 * ((od) this).field_c[var10]) / Math.sqrt((double)(var8 * 3)));
                if (param1 > 25) {
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
              ul.a((var5 >> 1) - -(((od) this).field_g << 4), (var3 << 4) + (var7 >> 1), var8 >> 2 >> 1, var9, ((od) this).field_i);
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
        int discarded$0 = -116;
        this.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is a hidden Achievement";
        field_a = "PANICO";
    }
}
