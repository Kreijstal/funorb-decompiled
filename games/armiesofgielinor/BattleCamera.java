/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattleCamera {
    private int[] velocity;
    private int[] field_n;
    private EventPresenter focusedPresenter;
    int[] field_h;
    private boolean field_q;
    private int field_i;
    int field_b;
    private int[] field_a;
    private int field_m;
    int[] targetPosition;
    int[] currentPosition;
    int[] field_e;
    int[] field_o;
    private int[] field_r;
    static String field_f;
    private int field_g;
    int[] field_c;
    private int field_j;

    private final boolean b(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        boolean stackIn_8_0 = false;
        this.a(-100, this.targetPosition);
        var3 = this.targetPosition[0];
        var4 = this.targetPosition[1];
        var5 = -this.currentPosition[0] + var3;
        var6 = -this.currentPosition[1] + var4;
        var7 = 16;
        if (param1 > -1) {
          var7 = param1;
        }
        var8 = 2;
        this.velocity[0] = this.a(this.velocity[0], 6198, var5, var8, var7);
        this.velocity[1] = this.a(this.velocity[1], 6198, var6, var8, var7);
        if (param0 >= -118) {
          this.f(-83);
        }
        this.currentPosition[1] = this.currentPosition[1] + this.velocity[1];
        this.currentPosition[0] = this.currentPosition[0] + this.velocity[0];
        this.a(-78, this.currentPosition);
        this.a(false);
        this.h(-1);
        stackIn_8_0 = (0 == this.velocity[0]) && (0 == this.velocity[1]);
        return stackIn_8_0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var6 = param0;
        if (param2 == 0) {
          return 0;
        }
        if (param1 != 6198) {
          return -40;
        }
        if (param0 == param2) {
          return param0;
        }
        stackIn_11_0 = (param2 < 0) ? -1 : 1;
        var8 = stackIn_11_0;
        param2 = param2 * var8;
        if (param0 == 0) {
          var7 = var8;
        } else {
          stackIn_15_0 = (0 > param0) ? -1 : 1;
          var7 = stackIn_15_0;
          param0 = var7 * param0;
        }
        if (param2 < param0) {
          return var8 * param2;
        }
        stackIn_23_0 = (var7 == var8) ? 0 : 1;
        var9 = stackIn_23_0;
        stackIn_26_0 = (param4 > param0) ? 0 : 1;
        var10 = stackIn_26_0;
        var11 = this.a((byte) -70, param0, param2) ? 1 : 0;
        if (param3 <= param4 - param0) {
          stackIn_32_0 = (Math.abs(param2) > param3 + param0) ? 1 : 0;
        } else {
          stackIn_32_0 = 0;
        }
        var12 = stackIn_32_0;
        stackIn_35_0 = (param4 <= param0) ? 0 : 1;
        regionExit1: {
          var13 = stackIn_35_0;
          if (var9 != 0) {
            var6 = param0 >> 3;
          } else {
            if (var10 == 0 &&
              var11 == 0) {
              if (var12 != 0) {
                var6 = param0 + param3;
              } else {
                if (var13 != 0) {
                  var6 = param0 + 1;
                  break regionExit1;
                }
              }
              break regionExit1;
            }
            var6 = param0 * 7 >> 3;
          }
        }
        var6 = var6 * var7;
        return var6;
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3) {
        if (!param1 ||
          param2 < 0 ||
          0 > param3) {
          this.field_a[0] = param2;
          this.field_a[1] = param3;
          return false;
        }
        this.currentPosition[0] = this.currentPosition[0] - (param2 - this.field_a[0]);
        this.currentPosition[1] = this.currentPosition[1] - (-this.field_a[1] + param3);
        this.field_a[0] = param2;
        this.field_a[1] = param3;
        this.a(-85, this.currentPosition);
        this.a(!param0 ? true : false);
        this.h(-1);
        if (!param0) {
          this.a((byte) 70, 24);
        }
        return true;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = param1;
        int var5 = 0;
        while (var4 > 0) {
          var5 = var5 + var4;
          var4 = 7 * var4 >> 3;
        }
        if (param0 != -70) {
          return false;
        }
        if (param2 - var5 <= 0) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, byte param2) {
        this.currentPosition[1] = param1;
        this.currentPosition[0] = param0;
        this.a(-93, this.currentPosition);
        this.a(false);
        if (param2 <= 54) {
          this.field_m = -31;
        }
        this.h(-1);
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0;
        if (-1 < param2 &&
          param2 < this.field_j &&
          param0 > -1 &&
          this.field_j > param0) {
          var4 = var4 + this.field_o[param2 + param0 * this.field_j];
        } else {
          var4 += 255;
        }
        if (-1 < param2 + 1 &&
          this.field_j > param2 + 1 &&
          param0 > -1 &&
          param0 < this.field_j) {
          var4 = var4 + this.field_o[this.field_j * param0 + 1 + param2];
        } else {
          var4 += 255;
        }
        if (param2 + 1 > -1 &&
          this.field_j > 1 + param2 &&
          param0 + 1 > -1 &&
          param0 + 1 < this.field_j) {
          var4 = var4 + this.field_o[(1 + param0) * this.field_j + (param2 + 1)];
        } else {
          var4 += 255;
        }
        if (param1 != -4510) {
          BattleCamera.d((byte) -11);
        }
        if (param2 > -1 &&
          param2 < this.field_j &&
          -1 < param0 + 1 &&
          this.field_j > 1 + param0) {
          var4 = var4 + this.field_o[this.field_j * (1 + param0) + param2];
        } else {
          var4 += 255;
        }
        return var4 >> 2;
    }

    final void c(int param0) {
        this.f(-41);
        this.field_e[0] = -this.currentPosition[0] + (this.targetPosition[0] + (so.field_b.field_a >> 1));
        if (param0 != 9470337) {
          this.field_q = false;
        }
        this.field_e[1] = -this.currentPosition[1] + (this.targetPosition[1] + (so.field_b.field_g >> 1) - 20);
    }

    final void j(int param0) {
        if (param0 > -117) {
          return;
        }
        this.a(false);
        this.h(-1);
    }

    private final void c(byte param0) {
        this.f(-115);
        if (param0 != -28) {
          field_f = (String) null;
        }
        this.field_g = this.targetPosition[0];
        this.field_i = this.targetPosition[1];
        this.a(false);
        this.h(param0 + 27);
    }

    private final void a(int param0, int[] param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 40 * this.field_j >> 1;
          if (param0 >= -76) {
            this.focusedPresenter = (EventPresenter) null;
          }
          var4 = param1[0] - (var3_int << 1) >> 1;
          var5 = param1[1] - var3_int;
          if (Math.abs(var4) + Math.abs(var5) > var3_int) {
            var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> 1;
            if (0 >= var4) {
              param1[0] = param1[0] + (var6 << 1);
            } else {
              param1[0] = param1[0] - (var6 << 1);
            }
            if (var5 > 0) {
              param1[1] = param1[1] - var6;
            } else {
              param1[1] = param1[1] + var6;
            }
          }
          var5Lifetime1 = param1[1] - var3_int;
          var4Lifetime1 = -(var3_int << 1) + param1[0] >> 1;
          var3_int -= 100;
          if (var3_int < var4Lifetime1) {
            param1[0] = param1[0] - (-var3_int + var4Lifetime1 << 1);
          } else {
            if (var4Lifetime1 < -var3_int) {
              param1[0] = param1[0] - (var3_int + var4Lifetime1 << 1);
            }
          }
          if (var5Lifetime1 > var3_int) {
            param1[1] = param1[1] - (var5Lifetime1 - var3_int);
          } else {
            if (-var3_int > var5Lifetime1) {
              param1[1] = param1[1] - (var3_int + var5Lifetime1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("v.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int stackIn_19_0;
        int stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_19_4;
        int stackIn_19_5;
        boolean stackIn_20_6;
        int stackIn_29_0 = 0;
        int var3;
        int var4;
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
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 1745035905) {
          return;
        }
        var3 = this.field_n[0];
        var4 = this.field_n[1];
        var4 -= 3;
        this.field_c[0] = var3;
        this.field_c[1] = var4;
        this.f(param1 ^ -1745035990);
        this.i(0);
        var5 = this.field_e[0] + 40;
        var6 = this.field_e[1] - 20;
        var7 = var5;
        var8 = var6;
        var9 = var3;
        var10 = var4;
        var11 = so.field_b.field_a;
        var12 = so.field_b.field_g;
        SoftwareRaster.f(0, 0, var11, var12);
        var13 = 0;
        while (var8 < 256 + var12 + 40) {
          while (80 + var11 > var7) {
            if (var9 >= -1 &&
              var9 <= this.field_j &&
              var10 >= -1 &&
              this.field_m >= var10) {
              stackIn_19_0 = var10;
              stackIn_19_1 = var9;
              stackIn_19_2 = param0;
              stackIn_19_3 = var8;
              stackIn_19_4 = 99;
              stackIn_19_5 = var7;
              stackIn_20_6 = !(var8 <= var12 + 40);
              fg.a(stackIn_19_0, stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_20_6);
            }
            var7 += 80;
            var10++;
            var9++;
          }
          var8 += 20;
          if (var13 != 0) {
            var3--;
            var7 = -40 + var5;
          }
          if (var13 == 0) {
            var7 = var5;
            var4++;
          }
          stackIn_29_0 = (var13 != 0) ? 0 : 1;
          var13 = stackIn_29_0;
          var9 = var3;
          var10 = var4;
        }
        if (param0 == 0 &&
          gb.field_B &&
          cu.field_a) {
          this.a(-12608);
        }
        return;
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        if (param0 < 88) {
          discarded$0 = this.a(false, true, 4, 95);
        }
        int var3 = this.field_e[1];
        int var2 = this.field_e[0];
        var3 = var3 - (so.field_b.field_g >> 1);
        var2 = var2 - (so.field_b.field_a >> 1);
        int var4 = var2 + this.currentPosition[0];
        int var5 = var3 + this.currentPosition[1];
        this.targetPosition[1] = var5;
        this.targetPosition[0] = var4;
    }

    final void b(int param0, int param1, byte param2) {
        int var15 = 0;
        int var17 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int var4;
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
        int var16;
        int var18;
        int var19;
        int var20;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_e[0] = 0;
        this.field_e[1] = 0;
        this.c(false);
        this.field_c[1] = this.field_c[1] - 2;
        var4 = this.field_c[0];
        var5 = this.field_c[1];
        this.f(-63);
        this.i(0);
        this.f(-113);
        this.i(0);
        var6 = this.field_e[0];
        var7 = this.field_e[1];
        var10 = 1 + var4;
        if (param2 != 93) {
          return;
        }
        var11 = var5;
        var12 = 0;
        var13 = so.field_b.field_a;
        var14 = so.field_b.field_g;
        for (var15 = var6; var15 <= var13; var15 += 40) {
          var8 = var10;
          var9 = var11;
          var16 = var12;
          for (var17 = var7; var14 >= var17; var17 += 20) {
            if (var16 != 0) {
              var9++;
            } else {
              var8--;
              if (-1 < var8 &&
                var8 < this.field_j + 1 &&
                var9 > -1 &&
                var9 < 1 + this.field_m) {
                var18 = (-param1 + var15) * (-param1 + var15) + (var17 - param0) * (-param0 + var17);
                var19 = 3 * fe.a(var18 * 4) - 30;
                if (var19 < 0) {
                  var19 = 0;
                }
                if (var19 < 256) {
                  pi.field_T.e(-6 + var15, -3 + var17, -var19 + 256);
                }
              }
            }
            stackIn_19_0 = (var16 != 0) ? 0 : 1;
            var16 = stackIn_19_0;
          }
          if (var12 != 0) {
            var10++;
            var11++;
          }
          stackIn_26_0 = (var12 != 0) ? 0 : 1;
          var12 = stackIn_26_0;
        }
        return;
    }

    final void b(byte param0) {
        this.field_c[1] = this.field_b / this.field_j;
        this.field_c[0] = -(this.field_c[1] * this.field_j) + this.field_b;
        if (param0 != 36) {
          return;
        }
    }

    private final void h(int param0) {
        this.field_e[1] = 0;
        this.field_e[0] = 0;
        this.c(false);
        if (param0 != -1) {
          this.a((byte) 54, -118);
        }
        this.field_n[0] = this.field_c[0];
        this.field_n[1] = this.field_c[1];
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var11 = 255;
        var12 = 255;
        var13 = 255;
        var14 = 255;
        if (param1 > -1 &&
          param5 > -1 &&
          param1 < this.field_j &&
          param5 < this.field_m) {
          if (param3) {
            var12 = this.field_o[this.field_j * param5 + param1];
          } else {
            var11 = this.field_o[param5 * this.field_j + param1];
          }
        }
        if (param0 > -1 &&
          param2 > -1 &&
          param0 < this.field_j &&
          param2 < this.field_m) {
          if (param3) {
            var13 = this.field_o[this.field_j * param2 + param0];
          } else {
            var14 = this.field_o[param0 + param2 * this.field_j];
          }
        }
        if (param8 != 1760) {
          this.field_o = (int[]) null;
        }
        if (!param3) {
          var13 = this.b(param2, -4510, param0);
          var12 = this.b(-1 + param5, -4510, param1 - 1);
        } else {
          var14 = this.b(param2 - 1, -4510, -1 + param0);
          var11 = this.b(param5, -4510, param1);
        }
        this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
    }

    private final void a(boolean param0) {
        this.field_e[1] = so.field_b.field_g >> 1;
        this.field_e[0] = so.field_b.field_a >> 1;
        this.c(param0);
        this.field_r[1] = this.field_c[1];
        this.field_r[0] = this.field_c[0];
    }

    private final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5) {
        int var7;
        int var8;
        int var9;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var7 = 0;
        if (param5 ||
          param1 ||
          param4 ||
          param3) {
          var7 = 1;
        }
        if (!param0) {
          return true;
        }
        var8 = 16;
        if (!param5) {
          if (!param2 &&
            this.velocity[1] < 0) {
            this.velocity[1] = this.velocity[1] + 1;
          }
        } else {
          if (this.velocity[1] > -var8) {
            this.velocity[1] = this.velocity[1] - 1;
          }
        }
        if (param1) {
          if (this.velocity[1] < var8) {
            this.velocity[1] = this.velocity[1] + 1;
          }
        } else {
          if (!param2 &&
            this.velocity[1] > 0) {
            this.velocity[1] = this.velocity[1] - 1;
          }
        }
        if (param4) {
          if (-var8 < this.velocity[0]) {
            this.velocity[0] = this.velocity[0] - 1;
          }
        } else {
          if (!param2 &&
            this.velocity[0] < 0) {
            this.velocity[0] = this.velocity[0] + 1;
          }
        }
        if (param3) {
          if (this.velocity[0] < var8) {
            this.velocity[0] = this.velocity[0] + 1;
          }
        } else {
          if (!param2 &&
            0 < this.velocity[0]) {
            this.velocity[0] = this.velocity[0] - 1;
          }
        }
        if (!param2 ||
          var7 != 0) {
          this.currentPosition[1] = this.currentPosition[1] + this.velocity[1];
          this.currentPosition[0] = this.currentPosition[0] + (this.velocity[0] << 1);
          this.a(-81, this.currentPosition);
          this.a(false);
          this.h(-1);
        }
        return var7 != 0;
    }

    private final void d(int param0) {
        int var2 = -40 + this.targetPosition[0] >> 1;
        int var3 = this.targetPosition[1] - (this.field_m * 40 >> 1);
        int var5 = var3 + var2;
        int var4 = var2 - var3;
        if (var4 < 0) {
          var4 -= 40;
        }
        if (var5 < 0) {
          var5 -= 40;
        }
        this.field_c[0] = var4 / 40;
        this.field_c[param0] = var5 / 40;
    }

    final void a(int param0, boolean param1) {
        this.field_c[1] = param0 / this.field_j;
        this.field_c[0] = param0 - this.field_j * this.field_c[1];
        if (!param1) {
          this.velocity = (int[]) null;
        }
        this.b(!param1 ? true : false);
    }

    final void c(boolean param0) {
        if (param0) {
          this.a(-4, 46);
        }
        this.e(105);
        this.d(1);
    }

    private final void a(int param0) {
        int var18 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int var2;
        int var3;
        int var4;
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
        int var19;
        int var21;
        var21 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_e[0] = 0;
        this.field_e[1] = 0;
        this.c(false);
        this.field_c[1] = this.field_c[1] - 2;
        var2 = this.field_c[0];
        var3 = this.field_c[1];
        this.f(-47);
        this.i(0);
        this.f(-85);
        this.i(param0 ^ param0);
        var4 = this.field_e[0];
        var5 = this.field_e[1];
        var11 = var2 - 1;
        var12 = var3;
        var13 = var3;
        var10 = var2;
        var14 = 0;
        stackIn_3_0 = (0 != (var3 + var2) % 2) ? 0 : 1;
        var15 = stackIn_3_0;
        var16 = so.field_b.field_a;
        var17 = so.field_b.field_g;
        for (var18 = var4; var18 <= var16; var18 += 40) {
          var8 = var12;
          var6 = var10;
          var7 = var11;
          var9 = var13;
          var19 = var14;
          for (var20 = var5; var20 <= var17; var20 += 20) {
            this.a(var7, var6, var9, var19 != 0, var15 != 0, var8, var14 != 0, var18, 1760, var20);
            if (var19 == 0) {
              var9++;
              var6--;
            } else {
              var7--;
              var8++;
            }
            stackIn_13_0 = (var19 != 0) ? 0 : 1;
            var19 = stackIn_13_0;
          }
          if (var14 != 0) {
            var10++;
            var12++;
          } else {
            var13++;
            var11++;
          }
          stackIn_20_0 = (var14 != 0) ? 0 : 1;
          var14 = stackIn_20_0;
        }
    }

    final void a(byte param0) {
        int var2 = this.targetPosition[0];
        int var3 = this.targetPosition[1];
        int var4 = 0;
        int var5 = 0;
        int var6 = so.a(327680, -129);
        var4 = var4 + ev.b(-48, var2 << 14, var6);
        var5 = var5 + ev.b(-70, var2 << 14, var6);
        var4 = var4 - ev.b(-94, var2 << 15, var6);
        var5 = var5 + ev.b(-51, var3 << 15, var6);
        this.field_h[0] = var4;
        this.field_h[1] = var5;
        int var7 = -48 % ((19 - param0) / 36);
    }

    final void i(int param0) {
        int var3 = this.targetPosition[1];
        int var2 = this.targetPosition[0];
        int var5 = var3 - this.currentPosition[1];
        int var4 = var2 - this.currentPosition[param0];
        var4 = var4 + (so.field_b.field_a >> 1);
        var5 = (so.field_b.field_g >> 1) + var5;
        this.field_e[1] = var5;
        this.field_e[0] = var4;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
        int var24 = 0;
        int var28 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_28_1 = false;
        int stackIn_31_1 = 0;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int[] var40;
        var39 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 <= param11 &&
          0 <= param1 &&
          this.field_m - 1 >= param13 &&
          param8 <= -1 + this.field_j) {
          if (0 > param13) {
            this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (0 > param8) {
            this.a(true, param4, param10, param0 ^ 8236, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (param0 != -8302) {
            var40 = (int[]) null;
            this.a(-43, (int[]) null);
          }
          if (param1 > -1 + this.field_m) {
            this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (-1 + this.field_j < param11) {
            this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          var15 = param2 << 16;
          var16 = (-var15 + (param12 << 16)) / 40;
          var17 = param7 << 16;
          var18 = ((param4 << 16) - var17) / 40;
          var19 = var15;
          var20 = var17;
          stackIn_22_0 = 0;
          stackIn_23_1 = (param9 ^ param5) ? 0 : 40;
          var21 = stackIn_22_0 + stackIn_23_1;
          var22 = so.field_b.field_a;
          var23 = so.field_b.field_g;
          for (var24 = param6; var24 < param6 + 40; var24++) {
            stackIn_27_0 = 0;
            stackIn_28_1 = (param3 != param5);
            if (stackIn_28_1 ^ param9) {
              stackIn_31_1 = 20;
            } else {
              stackIn_31_1 = 0;
            }
            var25 = stackIn_27_0 + stackIn_31_1;
            var26 = var19;
            var27 = (-var19 + var20) / 20;
            for (var28 = param10; param10 + 20 > var28; var28++) {
              if (0 <= var24 &&
                var24 < var22 &&
                var28 >= 0 &&
                var23 > var28) {
                var29 = var24 + var22 * var28;
                var30 = SoftwareRaster.field_d[var29];
                var31 = dd.field_k.field_B[var21 + var25 * 80];
                if (var30 != 0) {
                  var32 = (16745529 & var26) >> 15;
                  if (var32 > 255) {
                    var32 = 255;
                  }
                  var36 = (16711680 & var31) * (-var32 + 255) >>> 8;
                  var33 = 255 & var30 >> 16;
                  var35 = (var30 & 65280) >> 8;
                  var34 = var30 & 255;
                  var37 = (var31 & 255) * (-var32 + 255);
                  var36 = var36 + var32 * 65280;
                  var38 = (65280 & var31) * (-var32 + 255);
                  var38 = var38 + 65280 * var32;
                  var37 = var37 + 255 * var32;
                  var37 = var37 >> 8;
                  var38 = var38 >> 8;
                  var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> 8;
                  SoftwareRaster.field_d[var29] = var30;
                }
              }
              var26 = var26 + var27;
              var25++;
            }
            var20 = var20 + var18;
            var21++;
            var19 = var19 + var16;
          }
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10) {
        int var21 = 0;
        int var27 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_10_2 = 0;
        int stackIn_13_3 = 0;
        boolean stackIn_16_2 = false;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        var38 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var12 = param6 << 16;
        var13 = (-var12 + (param10 << 16)) / 40;
        var14 = param7 << 16;
        var15 = (-var14 + (param1 << 16)) / 40;
        var16 = var12;
        var17 = var14;
        stackIn_2_0 = 0;
        stackIn_3_1 = (param4 ^ param9) ? 0 : 40;
        var18 = stackIn_2_0 + stackIn_3_1;
        var19 = so.field_b.field_a;
        var20 = so.field_b.field_g;
        if (param3 >= -51) {
          this.field_g = -88;
        }
        for (var21 = param5; 40 + param5 > var21; var21++) {
          stackIn_9_0 = 0;
          stackIn_9_1 = param9;
          if (param4) {
            stackIn_10_2 = 0;
          } else {
            stackIn_10_2 = 1;
          }
          if (param8) {
            stackIn_13_3 = 0;
          } else {
            stackIn_13_3 = 1;
          }
          stackIn_16_2 = (stackIn_10_2 != stackIn_13_3);
          if (stackIn_9_1 ^ !stackIn_16_2) {
            stackIn_19_1 = 0;
          } else {
            stackIn_19_1 = 20;
          }
          var22 = stackIn_9_0 + stackIn_19_1;
          var23 = var16;
          if (!param8) {
            stackIn_22_0 = -param5 + var21 >> 1;
          } else {
            stackIn_22_0 = -var21 + (param5 + 40) >> 1;
          }
          var24 = stackIn_22_0;
          var25 = 0;
          var26 = (var17 - var16) / 20;
          for (var27 = param2; param2 + 20 > var27; var27++) {
            if ((var25 >= var24 &&
              !param0 ||
              var25 < var24 &&
              param0) && (0 <= var21 &&
              var19 > var21 &&
              0 <= var27 &&
              var20 > var27)) {
              var28 = var21 + var19 * var27;
              var29 = SoftwareRaster.field_d[var28];
              var30 = dd.field_k.field_B[var22 * 80 + var18];
              if (var29 != 0) {
                var31 = (16772243 & var23) >> 15;
                if (255 < var31) {
                  var31 = 255;
                }
                var32 = (var29 & 16711680) >> 16;
                var34 = 255 & var29 >> 8;
                var35 = (-var31 + 255) * (16711680 & var30) >>> 8;
                var33 = var29 & 255;
                var36 = (var30 & 255) * (-var31 + 255);
                var35 = var35 + var31 * 65280;
                var37 = (-var31 + 255) * (65280 & var30);
                var37 = var37 + var31 * 65280;
                var36 = var36 + 255 * var31;
                var37 = var37 >> 8;
                var36 = var36 >> 8;
                var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 8;
                SoftwareRaster.field_d[var28] = var29;
              }
            }
            var25++;
            var23 = var23 + var26;
            var22++;
          }
          var16 = var16 + var13;
          var18++;
          var17 = var17 + var15;
        }
    }

    public static void d(byte param0) {
        if (param0 != 55) {
          return;
        }
        field_f = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8) {
        int var10 = 0;
        var10 = this.a(true, param7, param8, param2) ? 1 : 0;
        if (var10 == 0) {
          var10 = this.a(true, param1, param6, param4, param5, param3) ? 1 : 0;
        }
        if (param0 < 88) {
          this.e(93);
        }
        return var10 != 0;
    }

    final void g(int param0) {
        boolean stackIn_20_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_36_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.field_n[0];
        var3 = this.field_n[1];
        this.field_c[0] = var2;
        var3 -= 3;
        this.field_c[1] = var3;
        this.f(param0 - 242);
        this.i(0);
        if (param0 != 200) {
          this.field_i = 67;
        }
        var4 = 40 + this.field_e[0];
        var5 = -20 + this.field_e[1];
        var6 = var4;
        var7 = var5;
        var8 = var2;
        var9 = var3;
        var10 = so.field_b.field_a;
        var11 = so.field_b.field_g;
        SoftwareRaster.f(0, 0, var10, var11);
        var12 = 0;
        while (var11 + 200 + 256 > var7) {
          while (var6 < var10 + 80) {
            if (-5 <= var8 &&
              this.field_j >= var8 &&
              var9 >= -1 &&
              4 + this.field_m >= var9) {
              stackIn_20_0 = !(40 + var11 >= var7);
              bi.a(stackIn_20_0, var7, var6, param0 ^ 132, var8, var9);
              stackIn_23_0 = !(var7 <= var11 + 120);
              wd.a(stackIn_23_0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
              stackIn_26_0 = !(var7 <= 200 + var11);
              SpellAreaSelection.a(stackIn_26_0, 4 + var8, var6, (byte) 120, var9 - 4, var7 - 160);
            }
            var9++;
            var8++;
            var6 += 80;
          }
          var7 += 20;
          if (var12 != 0) {
            var6 = var4 - 40;
            var2--;
          }
          if (var12 == 0) {
            var6 = var4;
            var3++;
          }
          var9 = var3;
          var8 = var2;
          stackIn_36_0 = (var12 != 0) ? 0 : 1;
          var12 = stackIn_36_0;
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        this.field_c[1] = param2 / this.field_j;
        if (param1 != 113) {
          this.field_e = (int[]) null;
        }
        this.field_c[0] = -(this.field_c[1] * this.field_j) + param2;
        this.f(-62);
        return this.b((byte) -125, param0);
    }

    final void a(byte param0, NodeDeque param1) {
        boolean discarded$0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        EventPresenter var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = (EventPresenter) (param1.d((byte) -77));
          while (var3 != null) {
            if (var3.tileIndex <= -1) {
              var3 = (EventPresenter) (param1.b((byte) 73));
              continue;
            }
            stackIn_7_0 = (var3 != this.focusedPresenter) ? 0 : 1;
            var4 = stackIn_7_0;
            this.focusedPresenter = var3;
            if (var4 == 0) {
              this.field_q = true;
            }
            this.field_i = -(so.field_b.field_g >> 1) + var3.screenY + this.currentPosition[1];
            this.field_g = this.currentPosition[0] + var3.screenX - (so.field_b.field_a >> 1);
            var5 = this.currentPosition[0] - this.field_g;
            var6 = -this.field_i + this.currentPosition[1];
            if (var6 * var6 + var5 * var5 < 40000) {
              if (var4 == 0) {
                this.field_q = false;
              }
            } else {
              this.field_q = true;
            }
            if (!this.field_q) {
              return;
            }
            break;
          }
          this.targetPosition[0] = this.field_g;
          this.targetPosition[1] = this.field_i;
          if (param0 <= 99) {
            this.b(63, 30, (byte) -17);
          }
          discarded$0 = this.b((byte) -127, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("v.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        this.field_c[1] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.c((byte) -28);
        int var3 = 121 / ((-71 - param0) / 49);
    }

    final void a(int param0, int param1) {
        this.field_c[param0] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.f(param0 ^ -72);
        this.i(param0 - 1);
    }

    private final void b(int param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = -71 % ((4 - param0) / 32);
        byte[] var3 = new cn(AttackEvent.a(false, 2147483647, li.field_n), 4, this.field_j / 5, this.field_m / 5, 7, 0.5f, true).a(this.field_m, (byte) 93, this.field_j);
        this.field_o = new int[var3.length];
        for (var4 = 0; var3.length > var4; var4++) {
          this.field_o[var4] = 256 - rn.a((int) var3[var4], 255);
        }
    }

    private final void b(boolean param0) {
        this.f(-112);
        this.currentPosition[0] = this.targetPosition[0];
        this.currentPosition[1] = this.targetPosition[1];
        this.field_g = this.targetPosition[0];
        this.field_i = this.targetPosition[1];
        this.a(param0);
        if (param0) {
          this.a(true);
        }
        this.h(-1);
    }

    BattleCamera(int param0, int param1) {
        this.field_i = 0;
        this.field_g = 0;
        this.a(param1, param0, -87);
        AiInfluenceMap.field_d = this;
    }

    private final void a(int param0, int param1, int param2) {
        this.velocity = new int[2];
        this.field_n = new int[2];
        this.field_r = new int[2];
        this.field_a = new int[2];
        this.currentPosition = new int[2];
        this.currentPosition[0] = 40 + 80 * (this.field_j >> 1) - 80;
        this.field_e = new int[2];
        this.currentPosition[1] = 20 + 40 * (-1 + (this.field_m >> 1));
        this.targetPosition = new int[2];
        if (param2 > -53) {
          return;
        }
        this.field_h = new int[2];
        this.field_c = new int[2];
        this.field_m = param0;
        this.field_j = param1;
        this.b(63);
        this.a(101, false, so.field_b.field_g >> 1, false, false, false, false, false, so.field_b.field_a >> 1);
        this.h(-1);
    }

    final void f(int param0) {
        int var7 = -20;
        int var9 = 20;
        int var6 = 40;
        int var2 = 40;
        int var4 = this.field_c[0];
        int var5 = this.field_c[1];
        if (param0 >= -30) {
          this.focusedPresenter = (EventPresenter) null;
        }
        int var8 = 40;
        int var3 = this.field_j * 40 >> 1;
        int var11 = var5 * var9 + var4 * var7;
        int var10 = var6 * var4 + var8 * var5;
        var3 = var3 + var11;
        var2 = var10 + var2;
        this.targetPosition[0] = var2;
        this.targetPosition[1] = var3;
    }

    static {
        field_f = "Environmental";
    }
}
