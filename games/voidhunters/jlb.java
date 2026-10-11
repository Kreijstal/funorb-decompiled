/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jlb extends le {
    private int field_j;
    private int field_m;
    private int[] field_v;
    private int field_p;
    private int[][] field_i;
    private int field_k;
    private int[][] field_w;
    private int field_u;
    private int field_l;
    private int field_n;
    private int field_q;
    private int field_r;
    private int field_o;
    static String field_t;
    private int field_s;

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        int[] var19Lifetime1;
        var17 = VoidHunters.field_G;
        var19 = this.field_f.a((byte) 40, param0);
        var18 = var19;
        var3 = var18;
        if (!param1) {
          return (int[]) null;
        }
        if (this.field_f.field_e) {
          var7 = 0;
          for (var9 = this.field_p + sj.field_p[param0]; 0 > var9; var9 += 4096) {
          }
          while (4096 < var9) {
            var9 -= 4096;
          }
          while (var7 < this.field_s) {
            if (var9 >= this.field_v[var7]) {
              var7++;
              continue;
            }
            break;
          }
          var11 = -1 + var7;
          stackIn_14_0 = ((var7 & 1) != 0) ? 0 : 1;
          var12 = stackIn_14_0;
          var15 = this.field_v[var7];
          var16 = this.field_v[-1 + var7];
          if (this.field_o + var16 < var9 &&
            var15 - this.field_o > var9) {
            for (var4 = 0; var4 < hob.field_d; var4++) {
              var6 = 0;
              if (var12 == 0) {
                stackIn_21_0 = -this.field_j;
              } else {
                stackIn_21_0 = this.field_j;
              }
              var5 = stackIn_21_0;
              for (var8 = (var5 * this.field_m >> 12) + grb.field_l[var4]; var8 < 0; var8 += 4096) {
              }
              while (var8 > 4096) {
                var8 -= 4096;
              }
              while (var6 < this.field_q) {
                if (this.field_w[var11][var6] <= var8) {
                  var6++;
                  continue;
                }
                break;
              }
              var10 = -1 + var6;
              var14 = this.field_w[var11][var6];
              var13 = this.field_w[var11][var10];
              if (var8 > this.field_o + var13 &&
                -this.field_o + var14 > var8) {
                var3[var4] = this.field_i[var11][var10];
              } else {
                var19Lifetime1 = var18;
                var19Lifetime1[var4] = 0;
              }
            }
          } else {
            var19Lifetime1 = var18;
            cua.a(var19Lifetime1, 0, hob.field_d, 0);
          }
        }
        return var3;
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        if (cka.field_o != null &&
          cka.field_o.a(0)) {
          lnb.d(0);
          return true;
        }
        if (crb.field_v != null &&
          crb.field_v.h(-15244)) {
          crb.field_v = null;
          lnb.d(0);
          return true;
        }
        if (nu.e((byte) 114)) {
          return true;
        }
        if (param1 != -2048) {
          jlb.a(false);
        }
        if (rtb.a(param0, -94, param3, param2)) {
          return true;
        }
        return false;
    }

    final void c(byte param0) {
        this.e((byte) -34);
        if (param0 >= -35) {
          this.field_p = -6;
        }
    }

    public jlb() {
        super(0, true);
        this.field_p = 0;
        this.field_u = 1024;
        this.field_j = 1024;
        this.field_l = 204;
        this.field_k = 81;
        this.field_q = 4;
        this.field_r = 409;
        this.field_s = 8;
    }

    private final void e(byte param0) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = VoidHunters.field_G;
        Random var10 = new Random((long)this.field_s);
        int var6Lifetime1;
        int var7Lifetime1;
        this.field_m = 4096 / this.field_q;
        this.field_o = this.field_k / 2;
        this.field_n = 4096 / this.field_s;
        int var3 = this.field_m / 2;
        if (param0 != -34) {
          return;
        }
        this.field_w = new int[this.field_s][1 + this.field_q];
        this.field_i = new int[this.field_s][this.field_q];
        int var4 = this.field_n / 2;
        this.field_v = new int[this.field_s + 1];
        this.field_v[0] = 0;
        for (var5 = 0; var5 < this.field_s; var5++) {
          if (var5 > 0) {
            var6 = this.field_n;
            var7 = (-2048 + hob.a(var10, 4096, 123)) * this.field_l >> 12;
            var6 = var6 + (var7 * var4 >> 12);
            this.field_v[var5] = var6 + this.field_v[-1 + var5];
          }
          this.field_w[var5][0] = 0;
          for (var6Lifetime1 = 0; this.field_q > var6Lifetime1; var6Lifetime1++) {
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = this.field_m;
              var8 = (hob.a(var10, 4096, param0 ^ -91) - 2048) * this.field_r >> 12;
              var7Lifetime1 = var7Lifetime1 + (var8 * var3 >> 12);
              this.field_w[var5][var6Lifetime1] = this.field_w[var5][var6Lifetime1 - 1] + var7Lifetime1;
            }
            this.field_i[var5][var6Lifetime1] = this.field_u > 0 ? -hob.a(var10, this.field_u, 123) + 4096 : 4096;
          }
          this.field_w[var5][this.field_q] = 4096;
        }
        this.field_v[this.field_s] = 4096;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_s = param2.e((byte) -118);
            } else {
              if (2 == var4_int) {
                this.field_r = param2.e(1869);
              } else {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.field_j = param2.e(1869);
                  } else {
                    if (var4_int != 5) {
                      if (var4_int != 6) {
                        if (7 == var4_int) {
                          this.field_u = param2.e(1869);
                        }
                      } else {
                        this.field_k = param2.e(1869);
                      }
                    } else {
                      this.field_p = param2.e(1869);
                    }
                  }
                } else {
                  this.field_l = param2.e(1869);
                }
              }
            }
          } else {
            this.field_q = param2.e((byte) -101);
          }
          if (param1 >= -60) {
            jlb.b(-48, 83, 33, 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("jlb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
          field_t = (String) null;
        }
    }

    static {
        field_t = "Destroy the enemy VIP";
    }
}
