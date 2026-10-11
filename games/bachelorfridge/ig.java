/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ig extends k {
    private int field_x;
    private int field_v;
    private int[][] field_r;
    private int field_o;
    private int field_l;
    private int field_k;
    private int[][] field_p;
    private int field_q;
    private int field_s;
    private int field_y;
    private int field_t;
    static pf field_m;
    private int field_w;
    private int[] field_u;
    private int field_n;

    private final void b(boolean param0) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = BachelorFridge.field_y;
        Random var10 = new Random((long)this.field_v);
        Random var11 = var10;
        int var6Lifetime1;
        int var7Lifetime1;
        this.field_l = 4096 / this.field_v;
        this.field_n = this.field_w / 2;
        this.field_q = 4096 / this.field_x;
        int var3 = this.field_q / 2;
        this.field_r = new int[this.field_v][1 + this.field_x];
        this.field_u = new int[this.field_v + 1];
        this.field_p = new int[this.field_v][this.field_x];
        int var4 = this.field_l / 2;
        if (!param0) {
          return;
        }
        this.field_u[0] = 0;
        for (var5 = 0; this.field_v > var5; var5++) {
          if (var5 > 0) {
            var6 = this.field_l;
            var7 = (kla.a(4096, var11, -2147483648) - 2048) * this.field_o >> 12;
            var6 = var6 + (var4 * var7 >> 12);
            this.field_u[var5] = this.field_u[-1 + var5] + var6;
          }
          this.field_r[var5][0] = 0;
          for (var6Lifetime1 = 0; this.field_x > var6Lifetime1; var6Lifetime1++) {
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = this.field_q;
              var8 = (kla.a(4096, var11, -2147483648) - 2048) * this.field_k >> 12;
              var7Lifetime1 = var7Lifetime1 + (var3 * var8 >> 12);
              this.field_r[var5][var6Lifetime1] = var7Lifetime1 + this.field_r[var5][var6Lifetime1 - 1];
            }
            this.field_p[var5][var6Lifetime1] = this.field_s <= 0 ? 4096 : -kla.a(this.field_s, var10, -2147483648) + 4096;
          }
          this.field_r[var5][this.field_x] = 4096;
        }
        this.field_u[this.field_v] = 4096;
    }

    public ig() {
        super(0, true);
        this.field_o = 204;
        this.field_s = 1024;
        this.field_v = 8;
        this.field_k = 409;
        this.field_y = 1024;
        this.field_t = 0;
        this.field_w = 81;
        this.field_x = 4;
    }

    public static void d(int param0) {
        if (param0 != 0) {
          field_m = (pf) null;
        }
        field_m = null;
    }

    final static vb a(int param0, lu param1) {
        RuntimeException var2 = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_m = (pf) null;
          }
          stackIn_3_0 = new vb(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.a(param0 ^ 3), param1.b(16711935));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ig.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            return;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_x = param1.b(16711935);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_k = param1.e((byte) 103);
              } else {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    if (var4_int != 5) {
                      if (var4_int != 6) {
                        if (7 == var4_int) {
                          this.field_s = param1.e((byte) 99);
                        }
                      } else {
                        this.field_w = param1.e((byte) 52);
                      }
                    } else {
                      this.field_t = param1.e((byte) 56);
                    }
                  } else {
                    this.field_y = param1.e((byte) 59);
                  }
                } else {
                  this.field_o = param1.e((byte) 123);
                }
              }
            } else {
              this.field_v = param1.b(16711935);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("ig.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    final static cj a(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cj stackIn_2_0 = null;
        ce stackIn_6_0 = null;
        hba stackIn_10_0 = null;
        vja stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 51) {
            stackIn_2_0 = (cj) null;
            return stackIn_2_0;
          }
          var2_int = param0.e((byte) 64);
          if (3 == ((t) (al.a(103, var2_int))).field_p) {
            stackIn_6_0 = kfa.a(param0, 4096, var2_int);
            return (cj) ((Object) stackIn_6_0);
          }
          if (((t) (al.a(118, var2_int))).field_p == 2) {
            stackIn_10_0 = nh.a(param0, var2_int, (byte) -116);
            return (cj) ((Object) stackIn_10_0);
          }
          stackIn_12_0 = new vja(var2_int, param0);
          return (cj) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ig.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] a(int param0, int param1) {
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
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
        var17 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.field_y = 126;
        }
        var19 = this.field_j.a(param0, -1);
        var18 = var19;
        var3 = var18;
        if (this.field_j.field_m) {
          var7 = 0;
          for (var9 = tj.field_f[param0] + this.field_t; var9 < 0; var9 += 4096) {
          }
          while (var9 > 4096) {
            var9 -= 4096;
          }
          while (var7 < this.field_v) {
            if (this.field_u[var7] <= var9) {
              var7++;
              continue;
            }
            break;
          }
          var11 = -1 + var7;
          stackIn_15_0 = (0 != (1 & var7)) ? 0 : 1;
          var12 = stackIn_15_0;
          var15 = this.field_u[var7];
          var16 = this.field_u[var7 - 1];
          if (var9 > var16 + this.field_n &&
            var9 < -this.field_n + var15) {
            for (var4 = 0; hh.field_d > var4; var4++) {
              if (var12 == 0) {
                stackIn_22_0 = -this.field_y;
              } else {
                stackIn_22_0 = this.field_y;
              }
              var5 = stackIn_22_0;
              var6 = 0;
              for (var8 = jq.field_k[var4] + (this.field_q * var5 >> 12); var8 < 0; var8 += 4096) {
              }
              while (var8 > 4096) {
                var8 -= 4096;
              }
              while (this.field_x > var6) {
                if (var8 >= this.field_r[var11][var6]) {
                  var6++;
                  continue;
                }
                break;
              }
              var10 = -1 + var6;
              var13 = this.field_r[var11][var10];
              var14 = this.field_r[var11][var6];
              if (var8 > this.field_n + var13 &&
                var14 - this.field_n > var8) {
                var3[var4] = this.field_p[var11][var10];
              } else {
                var19Lifetime1 = var18;
                var19Lifetime1[var4] = 0;
              }
            }
          } else {
            var19Lifetime1 = var18;
            bl.a(var19Lifetime1, 0, hh.field_d, 0);
          }
        }
        return var3;
    }

    final void d(byte param0) {
        if (param0 != -68) {
          return;
        }
        this.b(true);
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = BachelorFridge.field_y;
        int var4 = param1.indexOf(param2);
        if (param0 != -19384) {
          String var6 = (String) null;
          ig.a(7, (String) null, (String) null, (String) null);
        }
        while (-1 != var4) {
          param1 = param1.substring(0, var4) + param3 + param1.substring(var4 + param2.length());
          var4 = param1.indexOf(param2, var4 + param3.length());
        }
        return param1;
    }

    static {
    }
}
