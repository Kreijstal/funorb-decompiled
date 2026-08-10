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
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var2 = ul.field_b;
          var3 = ul.field_f;
          this.field_o = 0;
          this.field_m = new int[200];
          this.field_e = 0;
          if (param0 <= -58) {
            break L0;
          } else {
            od.b((byte) -52);
            break L0;
          }
        }
        var4 = ul.field_l;
        this.field_d = new int[200];
        this.field_b = new int[200];
        this.field_g = 320;
        this.field_c = new int[200];
        this.field_l = new re(new int[]{1, 2, 3, 4, 5});
        this.field_i = new int[64];
        var5 = 0;
        L1: while (true) {
          if (-65 >= (var5 ^ -1)) {
            this.field_n = new int[32];
            var5 = 0;
            L2: while (true) {
              if ((var5 ^ -1) <= -17) {
                ul.field_f = var3;
                ul.field_b = var2;
                ul.field_l = var4;
                ul.c();
                return;
              } else {
                this.field_n[var5] = var5 * 262660;
                this.field_n[31 + -var5] = var5 * 262660;
                var5++;
                continue L2;
              }
            }
          } else {
            this.field_i[var5] = 65537 * var5;
            if ((var5 ^ -1) < -33) {
              this.field_i[var5] = ge.a(this.field_i[var5], -8192 + 256 * var5);
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
        if (-26 >= (this.field_e ^ -1)) {
            this.a((byte) -124, 25);
        } else {
            this.a((byte) -119, 25 * cc.field_f.field_e / 25);
        }
        if (!param0) {
            this.a((byte) -53, -57);
        }
    }

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        se var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                fieldTemp$2 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$2;
                dk.a((byte) 15, var1);
                uk.field_b.c((byte) 115, var1.field_i - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "od.D(" + param0 + ')');
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
        int var3;
        int var4;
        int var6;
        int var8;
        int var10;
        int var11;
        int var5;
        int var7;
        int var9;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var3 = -120 - -(2 * lc.field_o);
          this.field_g = 75;
          if (wj.field_m == 3) {
            this.field_g = this.field_g + 370;
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 108;
        ul.f(this.field_g, var3, var4 >> -1644137087, 0);
        ul.g(this.field_g, var3, var4 >> 720140225, 7798903);
        var6 = -102 / ((param0 - -55) / 63);
        var10 = 0;
        L1: while (true) {
          if ((var10 ^ -1) <= -201) {
            L2: {
              ul.i(this.field_g, var3, var4 >> 2110462369, 0, 50);
              ul.b(this.field_g << 995427908, var3 << 1244985412, 2 + var4 << -996124 >> -1274580319, 192, this.field_n);
              if (-26 >= (param1 ^ -1)) {
                break L2;
              } else {
                ul.i(this.field_g, var3, 48, 0, 250 - 10 * param1);
                break L2;
              }
            }
            ul.b(this.field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, this.field_n);
            ul.b(this.field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, this.field_n);
            ul.b(this.field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, this.field_n);
            return;
          } else {
            var8 = ((this.field_d[var10] >> 732925668) * (this.field_d[var10] >> -1614043100) + (this.field_c[var10] >> 1847670244) * (this.field_c[var10] >> -2002186652)) / 3;
            if (-1 > (var8 ^ -1)) {
              L3: {
                var9 = var8 >> 1553684068;
                var5 = (int)((double)(var4 * this.field_d[var10]) / Math.sqrt((double)(var8 * 3)));
                var7 = (int)((double)(var4 * this.field_c[var10]) / Math.sqrt((double)(var8 * 3)));
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
              ul.a((var5 >> 1592781025) - -(this.field_g << -2130156444), (var3 << 709311908) + (var7 >> 1581001889), var8 >> -1761747486 >> 1733067201, var9, this.field_i);
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
        int var2;
        double var3;
        int var5;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (vj.a(52)) {
          return;
        } else {
          L0: {
            this.field_e = this.field_e + 1;
            if (param0 >= 4) {
              break L0;
            } else {
              this.field_m = (int[]) null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= 200) {
              L2: {
                var2 = 864 + this.field_l.a(128) % 160;
                var3 = (double)(this.field_l.a(128) % 214) + (double)(this.field_l.a(128) % 100) * 0.01;
                this.field_m[this.field_o] = (int)((double)var2 * Math.sin(var3));
                this.field_b[this.field_o] = (int)((double)var2 * Math.cos(var3));
                this.field_o = this.field_o + 1;
                if (200 > this.field_o) {
                  break L2;
                } else {
                  this.field_o = 0;
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if ((this.field_m[var2] ^ -1) >= (this.field_d[var2] ^ -1)) {
                  break L3;
                } else {
                  this.field_d[var2] = this.field_d[var2] + 6;
                  break L3;
                }
              }
              L4: {
                if (this.field_d[var2] > this.field_m[var2]) {
                  this.field_d[var2] = this.field_d[var2] - 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_c[var2] < this.field_b[var2]) {
                  this.field_c[var2] = this.field_c[var2] + 3;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (this.field_b[var2] < this.field_c[var2]) {
                this.field_c[var2] = this.field_c[var2] - 6;
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
        field_h = "This is a hidden Achievement";
        field_a = "PANICO";
    }
}
