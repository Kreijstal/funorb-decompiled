/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn {
    private int field_l;
    private int field_b;
    private int field_u;
    private int field_f;
    private int field_i;
    static boolean field_v;
    private int field_x;
    static boolean field_r;
    private int field_m;
    private int field_c;
    private int field_w;
    int[] field_e;
    private int field_s;
    private int field_k;
    private int field_d;
    private int field_B;
    int field_q;
    private int field_j;
    boolean field_o;
    private int field_A;
    private int field_t;
    private int field_a;
    private int field_p;
    private int field_z;
    private int field_y;
    private int field_h;
    private int field_g;
    private int field_n;

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        this.field_i = 1;
        this.field_x = 1;
        this.field_f = param6;
        this.field_h = (param4 - param0) / 2 + param0;
        this.field_A = param6 + (param1 - param6) / 2;
        this.field_n = 30;
        this.field_g = param2 + (param5 - param2) / 2;
        this.field_o = true;
        this.field_y = this.field_u;
        if (param3) {
          this.field_b = -86;
        }
        this.field_b = param1;
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var12 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param3.length();
          var5 = param1.length();
          var6 = var4_int;
          var8 = 109 / ((param0 + 40) / 53);
          var7 = -1 + var5;
          if (var7 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param3.indexOf((int) param2, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int++;
              var6 = var6 + var7;
            }
          }
          var9 = new StringBuilder(var6);
          var10 = 0;
          while (true) {
            var11 = param3.indexOf((int) param2, var10);
            if (0 > var11) {
              discarded$0 = var9.append(param3.substring(var10));
              stackIn_11_0 = var9.toString();
              return stackIn_11_0;
            }
            discarded$1 = var9.append(param3.substring(var10, var11));
            discarded$2 = var9.append(param1);
            var10 = var11 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("cn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int b(int param0) {
        if (param0 != 1) {
          return -2;
        }
        return this.field_x;
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        var3 = -21 / ((param1 + 33) / 63);
        if (param0 != this.field_i) {
          this.field_x = this.field_i;
        }
        this.field_i = param0;
        if (param0 != 0) {
          if (1 == param0) {
            this.field_d = 214;
            this.field_t = 550;
          } else {
            if (param0 != 2) {
              this.field_w = this.field_w + (param0 << 1);
              this.field_t = this.field_w;
            } else {
              this.field_t = 400;
              this.field_d = 195;
            }
          }
        } else {
          this.field_t = 400;
          this.field_d = 239;
        }
    }

    final int c(int param0) {
        if (param0 != -1870) {
          return 46;
        }
        return this.field_i;
    }

    final static void a(ed param0, int param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = Vertigo2.field_L ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (param1 < 113) {
              field_r = false;
            }
            if (null != as.field_d) {
              try {
                as.field_d.a(-23669, 0L);
                as.field_d.a(0, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var6[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param0.a(0, -10140, var2, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = runtimeException;
            stackIn_18_1 = new StringBuilder().append("cn.K(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.a(85, -89, -12, -107);
        }
        return this.field_l == this.field_q ? true : false;
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param0 < 77) {
          this.c(77);
        }
        if (!this.field_o) {
          param6 = param6 << 1;
          param1 = param1 << 1;
          var8 = 2047 & -param1;
          var9 = -param6 & 2047;
          var10 = 0;
          var11 = 0;
          var12 = param5;
          if (param1 != 0) {
            var13 = oo.field_j[param1];
            var14 = oo.field_h[param1];
            var15 = var14 * var11 - var12 * var13 >> 16;
            var12 = var11 * var13 + var14 * var12 >> 16;
            var11 = var15;
          }
          if (param6 != 0) {
            var13 = oo.field_j[param6];
            var14 = oo.field_h[param6];
            var15 = var10 * var14 + var13 * var12 >> 16;
            var12 = var12 * var14 - var13 * var10 >> 16;
            var10 = var15;
          }
          var16 = oo.field_j[var9];
          var17 = oo.field_h[var9];
          var18 = oo.field_j[var8];
          var19 = oo.field_h[var8];
          var20 = (var16 >> 1) * (var18 >> 1) >> 14;
          var21 = (var19 >> 1) * (var16 >> 1) >> 14;
          var22 = (var17 >> 1) * (var18 >> 1) >> 14;
          var23 = (var17 >> 1) * (var19 >> 1) >> 14;
          var24 = -var10 + param4;
          var25 = -var11 + param3;
          var26 = param2 - var12;
          this.field_e[0] = var24;
          this.field_e[1] = var25;
          this.field_e[9] = -var21;
          this.field_e[4] = 0;
          this.field_e[10] = var18;
          this.field_e[5] = var16 >> 1;
          this.field_e[8] = -var22 >> 1;
          this.field_e[11] = var23;
          this.field_e[2] = var26;
          this.field_e[6] = var20 >> 1;
          this.field_e[7] = var19 >> 1;
          this.field_e[3] = var17 >> 1;
        } else {
          var8 = param2;
          param2 = param3;
          param4 = param4 * 4;
          param3 = var8;
          param2 = param2 * 4;
          this.field_e[2] = param2;
          this.field_e[1] = this.field_f;
          this.field_e[0] = param4;
          param3 = -param3 + this.field_b;
          param2 = -param2 + this.field_g;
          param4 = this.field_h - param4;
          var9 = wg.a(124, param3 * param3 + param4 * param4 + param2 * param2);
          param2 = (param2 << 16) / var9;
          param3 = (param3 << 16) / var9;
          param4 = (param4 << 16) / var9;
          this.field_e[9] = param4;
          this.field_e[10] = param3;
          this.field_e[11] = param2;
          var10 = param2 * 16384 >> 14;
          var11 = 0;
          var11 = var11 >> 2;
          var10 = var10 >> 2;
          var12 = -16384 * param4 >> 14;
          var12 = var12 >> 2;
          var9 = wg.a(92, var10 * var10 - (-(var11 * var11) - var12 * var12));
          var11 = (var11 << 16) / var9;
          var12 = (var12 << 16) / var9;
          var10 = (var10 << 16) / var9;
          this.field_e[5] = var12;
          this.field_e[3] = var10;
          this.field_e[4] = var11;
          param3 = param3 >> 1;
          param2 = param2 >> 1;
          var12 = var12 >> 1;
          param4 = param4 >> 1;
          var10 = var10 >> 1;
          var11 = var11 >> 1;
          var13 = param3 * var12 - var11 * param2 >> 16;
          var14 = -(var12 * param4) + param2 * var10 >> 16;
          var15 = param4 * var11 - param3 * var10 >> 16;
          var9 = wg.a(123, var14 * var14 + (var13 * var13 + var15 * var15));
          var15 = (var15 << 16) / var9;
          var13 = (var13 << 16) / var9;
          var14 = (var14 << 16) / var9;
          this.field_e[6] = var13;
          this.field_e[8] = var15;
          this.field_e[7] = var14;
        }
    }

    final void d(int param0) {
        this.field_t = param0;
        this.field_u = 214;
        this.field_w = this.field_t / 4;
        this.field_z = this.field_k;
        this.field_c = 214;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_o) {
          this.a((byte) 82, 0, this.field_A, this.field_s, this.field_a, this.field_w, 4 * this.field_n);
        } else {
          this.a((byte) 92, 4 * this.field_c, param3, param0, param1, this.field_w, 4 * this.field_z);
        }
        if (param2 != 12257) {
          cn.b(false);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        return gd.field_j.field_hc == ao.field_N ? true : false;
    }

    final void a(int param0) {
        int var2;
        int var3;
        double var4;
        int var6;
        int var7;
        int var8;
        int var2Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        this.field_j = this.field_j + 3;
        if (this.field_o) {
          this.field_d = 204;
          this.field_t = 50;
          if (this.field_y >= this.field_d) {
            if (this.field_d < this.field_y) {
              this.field_y = this.field_y - 1;
            }
          } else {
            this.field_y = this.field_y + 1;
          }
          if (this.field_b - this.field_B <= this.field_f + this.field_m) {
            this.field_B = this.field_B - 240;
            this.field_m = this.field_m - 240;
          }
          if (this.field_w >= this.field_t) {
            if (this.field_t < this.field_w) {
              this.field_w = this.field_w - 5;
            }
          } else {
            this.field_w = this.field_w + 5;
          }
          if (this.field_A > this.field_b &&
            this.field_p > 0 ||
            this.field_A < this.field_f + this.field_m &&
            0 > this.field_p) {
            this.field_p = this.field_p * -1;
          }
          var2 = 1;
          if (this.field_b < this.field_A &&
            this.field_p < 0) {
            var2 = 3;
          }
          if (this.field_A < this.field_f + this.field_m &&
            this.field_p > 0) {
            var2 = 3;
          }
          this.field_A = this.field_A + this.field_p * var2;
          this.field_a = (oo.field_h[this.field_j % 2048] * 640 / 2 >> 16) + 160;
          this.field_s = (oo.field_j[this.field_j % 2048] * 640 / 2 >> 16) + 160;
        }
        var2Lifetime1 = this.field_w - this.field_t;
        if (var2Lifetime1 * var2Lifetime1 < 25) {
          this.field_w = this.field_t;
        }
        var3 = 5;
        var4 = (double)(var2Lifetime1 * var2Lifetime1 / 50000);
        if (var2Lifetime1 * var2Lifetime1 > 50000) {
          var3 = (int)(5.0 * Math.sqrt(var4 * 8.0));
        }
        if (~(this.field_z % 64) == param0) {
          this.field_l = this.field_q;
        }
        if (this.field_t > this.field_w) {
          this.field_w = this.field_w + var3;
        } else {
          if (this.field_w > this.field_t) {
            this.field_w = this.field_w - var3;
          }
        }
        if (this.field_c >= this.field_d) {
          if (this.field_d >= this.field_c) {
            this.field_x = this.field_i;
          } else {
            this.field_c = this.field_c - 1;
          }
        } else {
          this.field_c = this.field_c + 1;
        }
        {
          this.field_k = this.field_l * 64;
          var6 = -this.field_z + this.field_k;
          var7 = 4;
          if ((0 >= var6 ||
            var6 >= 128) && (-128 <= var6 ||
            var6 <= -256)) {
            if (this.field_k == this.field_z) {
            } else if (16 <= var6 * var6) {
              this.field_z = this.field_z - var7 & 255;
            } else {
              this.field_z = this.field_k;
            }
          } else {
            this.field_z = 255 & var7 + this.field_z;
          }
        }
    }

    cn() {
        this.field_i = 0;
        this.field_x = 0;
        this.field_u = 0;
        this.field_k = 0;
        this.field_e = new int[12];
        this.field_t = 550;
        this.field_p = 3;
        this.field_B = 720;
        this.field_w = 275;
        this.field_d = 428;
        this.field_z = 125;
        this.field_c = 255;
        this.field_t = 550;
        this.field_m = 720;
    }

    static {
    }
}
