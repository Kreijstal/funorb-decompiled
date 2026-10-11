/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lf {
    boolean field_l;
    private boolean field_u;
    int field_s;
    private gd field_A;
    private int field_C;
    static double field_b;
    private int field_w;
    boolean field_e;
    private int[] field_k;
    private int field_G;
    int field_a;
    int field_D;
    boolean field_d;
    boolean field_H;
    private int[] field_F;
    private vj field_x;
    static RgbSprite[] field_h;
    private boolean field_B;
    private int[] field_r;
    private boolean field_n;
    int field_j;
    private int field_y;
    private int field_J;
    int field_p;
    int field_m;
    int field_f;
    private int[] field_I;
    private int[] field_o;
    private int[] field_z;
    static String field_v;
    private boolean field_E;
    static pq field_q;
    static java.awt.Font field_g;
    static NodeDeque field_c;
    static int[] field_i;
    static int field_t;

    final void d(byte param0) {
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_125_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var6Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a((byte) -118);
        this.field_J = this.field_J + 1;
        var2 = 8;
        var3 = -this.field_j + this.field_a;
        var4 = -this.field_p + this.field_s;
        if (param0 != 113) {
          this.a(78, -75);
        }
        var5 = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
        if (this.field_D == 4) {
          if (var2 < var5) {
            this.field_s = this.field_s - var4 * var2 / var5;
            this.field_a = this.field_a - var2 * var3 / var5;
            if (this.field_J % 20 == 0) {
              stackIn_9_0 = this.field_s;
              stackIn_10_1 = (!this.field_u) ? 1 : -1;
              jg.a(stackIn_9_0, stackIn_10_1 * this.field_a, 512, 0, this.field_C);
              this.field_J = this.field_J + AttackEvent.a(false, 10, li.field_n);
            }
          } else {
            this.field_s = this.field_p;
            this.field_a = this.field_j;
            this.a(0, (byte) -93);
          }
        }
        if (this.field_D == 7) {
          this.field_s = this.field_p;
          this.field_a = this.field_j;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_D == 0) {
          if (0 == var3 &&
            var4 == 0) {
            if (((this.field_D == 0)) &&
              ((this.field_f != -1))) {
              this.field_m = this.field_m - 1;
              if (!(0 < this.field_m)) {
                this.a(this.field_f, (byte) -124);
                this.field_f = -1;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_C != 39 &&
              this.field_C != 51) {
              this.a(4, (byte) -107);
            } else {
              this.a(6, (byte) -125);
            }
          }
        } else {
          if (this.field_D == 0 &&
            this.field_f != -1) {
            this.field_m = this.field_m - 1;
            if (0 >= this.field_m) {
              this.a(this.field_f, (byte) -124);
              this.field_f = -1;
            }
          }
        }
        var6 = this.field_y;
        if (this.field_d &&
          2 == this.field_D) {
          var6Lifetime1 = 7;
        } else {
          if (this.field_D == 4) {
            var6Lifetime1 = 2;
          } else {
            if (this.field_D != 6) {
              if (this.field_D != 7) {
                if (this.field_D == 1) {
                  var6Lifetime1 = 3;
                } else {
                  if (2 != this.field_D) {
                    if (3 == this.field_D) {
                      var6Lifetime1 = 4;
                    } else {
                      var6Lifetime1 = (this.field_D == 5) ? 5 : 0;
                    }
                  } else {
                    var6Lifetime1 = 6;
                  }
                }
              } else {
                var6Lifetime1 = 1;
              }
            } else {
              var6Lifetime1 = 2;
            }
          }
        }
        this.a(var6Lifetime1, 0);
        var7 = this.field_x.a(param0 ^ -13) ? 1 : 0;
        if (1 != this.field_D) {
        }
        if (this.field_J == je.field_K[this.field_G][1] &&
          this.field_D == 3 &&
          !this.field_B) {
          stackIn_56_0 = this.field_s;
          if (this.field_u) {
            stackIn_57_1 = -1;
          } else {
            stackIn_57_1 = 1;
          }
          jg.a(stackIn_56_0, stackIn_57_1 * this.field_a, 512, 7, this.field_C);
          this.field_B = true;
          this.field_l = true;
        } else {
          if (3 == this.field_D && (!(je.field_K[this.field_G][1] >= 0) ||
            !(this.field_F[this.field_D] < je.field_K[this.field_G][1])) && !this.field_B) {
            stackIn_66_0 = this.field_s;
            stackIn_66_1 = this.field_a;
            if (!this.field_u) {
              stackIn_67_2 = 1;
            } else {
              stackIn_67_2 = -1;
            }
            jg.a(stackIn_66_0, stackIn_66_1 * stackIn_67_2, 512, 7, this.field_C);
            this.field_B = true;
            this.field_l = true;
          }
        }
        if (this.field_J == je.field_K[this.field_G][0] &&
          1 == this.field_D &&
          !this.field_B) {
          stackIn_84_0 = this.field_s;
          stackIn_84_1 = this.field_a;
          if (this.field_u) {
            stackIn_85_2 = -1;
          } else {
            stackIn_85_2 = 1;
          }
          jg.a(stackIn_84_0, stackIn_84_1 * stackIn_85_2, 512, 4, this.field_C);
          this.field_e = true;
          this.field_B = true;
        } else {
          if (this.field_D == 1 && (!(je.field_K[this.field_G][0] >= 0) ||
            !(je.field_K[this.field_G][0] > this.field_F[this.field_D])) && !this.field_B) {
            stackIn_80_0 = this.field_s;
            if (this.field_u) {
              stackIn_81_1 = -1;
            } else {
              stackIn_81_1 = 1;
            }
            jg.a(stackIn_80_0, stackIn_81_1 * this.field_a, 512, 4, this.field_C);
            this.field_e = true;
            this.field_B = true;
          }
        }
        if (1 == this.field_J &&
          this.field_D == 1) {
          stackIn_90_0 = this.field_s;
          stackIn_90_1 = this.field_a;
          stackIn_91_2 = (this.field_u) ? -1 : 1;
          jg.a(stackIn_90_0, stackIn_90_1 * stackIn_91_2, 512, 3, this.field_C);
        }
        if (1 == this.field_J &&
          this.field_D == 2 &&
          this.field_d) {
          stackIn_97_0 = this.field_s;
          stackIn_98_1 = (this.field_u) ? -1 : 1;
          jg.a(stackIn_97_0, stackIn_98_1 * this.field_a, 512, 5, this.field_C);
          stackIn_100_0 = this.field_s;
          stackIn_100_1 = this.field_a;
          stackIn_101_2 = (this.field_u) ? -1 : 1;
          jg.a(stackIn_100_0, stackIn_100_1 * stackIn_101_2, 512, 2, this.field_C);
        }
        if (1 == this.field_J &&
          2 == this.field_D &&
          !this.field_d) {
          stackIn_108_0 = this.field_s;
          stackIn_108_1 = this.field_a;
          stackIn_109_2 = (this.field_u) ? -1 : 1;
          jg.a(stackIn_108_0, stackIn_108_1 * stackIn_109_2, param0 ^ 625, 1, this.field_C);
          stackIn_111_0 = this.field_s;
          stackIn_112_1 = (!this.field_u) ? 1 : -1;
          jg.a(stackIn_111_0, stackIn_112_1 * this.field_a, 512, 2, this.field_C);
        }
        if (this.field_J == 1 &&
          this.field_D == 5) {
          stackIn_118_0 = this.field_s;
          stackIn_118_1 = this.field_a;
          stackIn_119_2 = (this.field_u) ? -1 : 1;
          jg.a(stackIn_118_0, stackIn_118_1 * stackIn_119_2, param0 ^ 625, 6, this.field_C);
        }
        if (1 == this.field_J &&
          this.field_D == 7) {
          stackIn_125_0 = this.field_s;
          stackIn_126_1 = (!this.field_u) ? 1 : -1;
          jg.a(stackIn_125_0, stackIn_126_1 * this.field_a, 512, 0, this.field_C);
        }
        if (this.field_J == 1 &&
          this.field_D == 6) {
          stackIn_131_0 = this.field_s;
          stackIn_132_1 = (!this.field_u) ? 1 : -1;
          jg.a(stackIn_131_0, stackIn_132_1 * this.field_a, param0 + 399, 5, this.field_C);
        }
        this.a(param0 ^ -313055231);
        if (var7 != 0) {
          this.field_J = 0;
          if (this.field_y != 5) {
            if (this.field_y != 7) {
              if (this.field_D == 6) {
                this.a(7, (byte) -122);
              } else {
                if (this.field_D == 3) {
                  if (!this.field_B) {
                    stackIn_152_0 = this.field_s;
                    stackIn_153_1 = (this.field_u) ? -1 : 1;
                    jg.a(stackIn_152_0, stackIn_153_1 * this.field_a, 512, 7, this.field_C);
                    this.field_l = true;
                  }
                } else {
                  if (this.field_D == 1 &&
                    !this.field_B) {
                    stackIn_147_0 = this.field_s;
                    stackIn_148_1 = (this.field_u) ? -1 : 1;
                    jg.a(stackIn_147_0, stackIn_148_1 * this.field_a, param0 ^ 625, 4, this.field_C);
                    this.field_e = true;
                  }
                }
                this.a(0, (byte) -94);
              }
            } else {
              this.field_H = true;
            }
          } else {
            this.a(5, (byte) -86);
            this.field_E = true;
          }
        }
        for (var8 = 0; var8 < lb.field_a; var8++) {
          if (0 < this.field_k[var8]) {
            this.field_k[var8] = this.field_k[var8] - 1;
            this.field_z[var8] = this.field_z[var8] + this.field_o[var8];
            this.field_I[var8] = this.field_I[var8] + this.field_r[var8];
            this.field_r[var8] = this.field_r[var8] - 10000;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3;
        var3 = 0;
        if ((param0 != this.field_y ||
          this.field_E) && (param0 != -1 &&
          param0 >= 0 &&
          param0 < 9)) {
          var3 = 1;
          this.field_E = false;
          this.field_y = param0;
        }
        if (~this.field_y == param1 ||
          this.field_y < 0 ||
          this.field_y >= 9) {
          this.field_y = 0;
          var3 = 1;
        }
        if (var3 != 0) {
          this.d(-82);
          this.field_J = 0;
          this.field_B = false;
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 2166) {
          this.d(-90);
        }
        stackIn_6_0 = (this.field_j == this.field_a) && (this.field_p == this.field_s);
        return stackIn_6_0;
    }

    private final void d(int param0) {
        this.field_x.a(-1, pg.a(this.field_y, 176, true, this.field_G));
        this.a(-313055120);
        if (param0 > -77) {
          this.a(-77, 60);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_w = param2;
        if (param6 != 122) {
          this.field_o = (int[]) null;
        }
        for (var8 = 0; lb.field_a > var8; var8++) {
          this.field_z[var8] = param4 << 16;
          this.field_I[var8] = param5 << 16;
          this.field_k[var8] = AttackEvent.a(false, param1 >> 1, li.field_n) + param1;
          this.field_o[var8] = (!this.field_u ? 1 : -1) * (param3 << 16) + (int)(Math.sin((double)AttackEvent.a(false, 256, li.field_n) * 3.141592653589793 / 128.0) * 10000.0 * (double)(param1 + AttackEvent.a(false, param1 >> 1, li.field_n)));
          this.field_r[var8] = (int)(10000.0 * Math.sin(3.141592653589793 * (double)AttackEvent.a(false, 256, li.field_n) / 128.0) * (double)(AttackEvent.a(false, param1 >> 1, li.field_n) + param1)) + (param0 << 16);
        }
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        RgbSprite[] var10;
        RgbSprite[] var11_ref_wk__;
        int var11;
        int var12;
        RgbSprite var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        RgbSprite[] var10Lifetime1;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var9 = param7 + param1 + param3;
        var10 = new RgbSprite[]{new RgbSprite(var9, var9), new RgbSprite(param4, var9), new RgbSprite(var9, var9), new RgbSprite(var9, param4), new RgbSprite(64, 64), new RgbSprite(var9, param4), new RgbSprite(var9, var9), new RgbSprite(param4, var9), new RgbSprite(var9, var9)};
        var11_ref_wk__ = var10;
        for (var12 = 0; var11_ref_wk__.length > var12; var12++) {
          var13 = var11_ref_wk__[var12];
          for (var14 = 0; var13.field_B.length > var14; var14++) {
            var13.field_B[var14] = param5;
          }
        }
        var10Lifetime1 = var11_ref_wk__;
        for (var11 = 0; var11 < param7; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10Lifetime1[6].field_B[var12Lifetime1 + var9 * (-1 - var11 + var9)] = param2;
            var10Lifetime1[8].field_B[var12Lifetime1 + var9 * (-1 + var9 - var11)] = param2;
            var10Lifetime1[2].field_B[-1 + var9 + (-var11 + var9 * var12Lifetime1)] = param2;
            var10Lifetime1[8].field_B[var9 * var12Lifetime1 - (-var9 + (1 + var11))] = param2;
          }
        }
        if (param6 != -1) {
          field_g = (java.awt.Font) null;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param7; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_B[var11Lifetime1 * var9 + var12Lifetime2] = param0;
            var10Lifetime1[0].field_B[var9 * var12Lifetime2 + var11Lifetime1] = param0;
            if (var12Lifetime2 < (var9 - var11Lifetime1)) {
              var10Lifetime1[2].field_B[var12Lifetime2 + var11Lifetime1 * var9] = param0;
              var10Lifetime1[6].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param0;
            }
          }
        }
        for (var11Lifetime2 = 0; param4 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param7 > var12Lifetime3; var12Lifetime3++) {
            var10Lifetime1[7].field_B[var11Lifetime2 + (-1 - var12Lifetime3 + var9) * param4] = param2;
            var10Lifetime1[5].field_B[-1 + var9 - (var12Lifetime3 - var11Lifetime2 * var9)] = param2;
            var10Lifetime1[1].field_B[var12Lifetime3 * param4 + var11Lifetime2] = param0;
            var10Lifetime1[3].field_B[var12Lifetime3 + var11Lifetime2 * var9] = param0;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param4 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param3 > var12Lifetime4; var12Lifetime4++) {
            var10Lifetime1[1].field_B[var11Lifetime3 + param4 * (var9 - (var12Lifetime4 + 1))] = param8;
            var10Lifetime1[3].field_B[var9 * var11Lifetime3 - (var12Lifetime4 + (1 - var9))] = param8;
            var10Lifetime1[7].field_B[param4 * var12Lifetime4 + var11Lifetime3] = param8;
            var10Lifetime1[5].field_B[var11Lifetime3 * var9 + var12Lifetime4] = param8;
          }
        }
        return var10Lifetime1;
    }

    final void a(int param0, int param1, boolean param2) {
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        gd stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_27_6 = 0;
        int stackIn_30_5;
        int stackIn_30_6;
        int stackIn_31_7 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_45_2;
        int[] stackIn_45_3;
        int stackIn_46_4 = 0;
        int stackIn_48_5;
        int stackIn_49_6;
        int stackIn_58_0 = 0;
        RgbSprite stackIn_58_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_61_3;
        int stackIn_62_4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        gd var13;
        int var9Lifetime1;
        int var10Lifetime1;
        int var9Lifetime1Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.field_A) {
          return;
        }
        var13 = (gd) (this.field_x.a(false, true, false, this.field_A));
        if (this.field_G == 75) {
          var13.b(250, 250, 250);
        }
        if (this.field_G == 76) {
          var13.b(512, 512, 512);
        }
        var5 = 0;
        if (param1 >= -30) {
          this.d((byte) -56);
        }
        stackIn_12_0 = (this.field_u) ? 1536 : 512;
        var6 = stackIn_12_0;
        var7 = 0;
        var8 = 150;
        if (4 == this.field_D) {
          var9 = -this.field_j + this.field_a;
          var10 = -this.field_p + this.field_s;
          if (0 != var9 ||
            var10 != 0) {
            stackIn_19_0 = (int)(1024.0 * Math.atan2((double)var9, (double)var10) / 3.141592653589793);
            if (!this.field_u) {
              stackIn_20_1 = 1;
            } else {
              stackIn_20_1 = -1;
            }
            var6 = th.a(stackIn_19_0 * stackIn_20_1, 1, 2048);
          }
        }
        if (param2) {
          np.a(false, var13);
        }
        stackIn_26_0 = var13;
        stackIn_26_1 = var5;
        stackIn_26_2 = var6;
        stackIn_26_3 = var7;
        stackIn_26_4 = var8;
        stackIn_26_5 = this.field_a;
        stackIn_27_6 = (!this.field_u) ? 1 : -1;
        stackIn_30_5 = stackIn_26_5 * stackIn_27_6;
        stackIn_30_6 = 600;
        if (!param2 &&
          this.field_n) {
          stackIn_31_7 = 100;
        } else {
          stackIn_31_7 = 0;
        }
        ((gd) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_30_5, stackIn_30_6 - stackIn_31_7, this.field_s);
        if (!param2) {
          if (this.field_w == 1) {
            for (var9Lifetime1 = 0; var9Lifetime1 < lb.field_a; var9Lifetime1++) {
              if (0 < this.field_k[var9Lifetime1]) {
                stackIn_58_0 = this.field_s;
                stackIn_58_1 = hs.field_F[this.field_k[var9Lifetime1] % hs.field_F.length];
                if (255 < this.field_k[var9Lifetime1] << 4) {
                  stackIn_59_2 = 256;
                } else {
                  stackIn_59_2 = this.field_k[var9Lifetime1] << 4;
                }
                stackIn_61_3 = 122;
                if (!this.field_u) {
                  stackIn_62_4 = 1;
                } else {
                  stackIn_62_4 = -1;
                }
                cb.a(stackIn_58_0, stackIn_58_1, stackIn_59_2, stackIn_61_3, stackIn_62_4 * (this.field_a - (this.field_z[var9Lifetime1] >> 16)), -(this.field_I[var9Lifetime1] >> 16) + 600);
              }
            }
            return;
          }
          if (this.field_w == 0) {
            var9Lifetime1Lifetime1 = bw.unitDefinitions[this.field_C][1] + 1;
            var12 = 0;
            var10Lifetime1 = var12;
            while (var12 < lb.field_a) {
              if (this.field_k[var12] > 0) {
                stackIn_42_0 = 600 - (this.field_I[var12] >> 16);
                if (255 >= this.field_k[var12] << 4) {
                  stackIn_43_1 = this.field_k[var12] << 4;
                } else {
                  stackIn_43_1 = 256;
                }
                stackIn_45_2 = 56;
                stackIn_45_3 = fe.field_o[var9Lifetime1Lifetime1];
                if (this.field_k[var12] << 4 <= 63) {
                  stackIn_46_4 = this.field_k[var12] << 4;
                } else {
                  stackIn_46_4 = 63;
                }
                stackIn_48_5 = this.field_a - (this.field_z[var12] >> 16);
                if (!this.field_u) {
                  stackIn_49_6 = 1;
                } else {
                  stackIn_49_6 = -1;
                }
                fh.$cfr$intArgs$a$e0bc7fdb2979(stackIn_42_0, stackIn_43_1, stackIn_45_2, stackIn_45_3, stackIn_46_4, stackIn_48_5 * stackIn_49_6, this.field_s);
              }
              var12++;
            }
            return;
          }
        }
        return;
    }

    final boolean b(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -118 / ((param0 + 7) / 36);
        stackIn_4_0 = (this.field_D == 0) && (this.field_f == -1);
        return stackIn_4_0;
    }

    public static void c(int param0) {
        field_i = null;
        field_v = null;
        field_q = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != -1) {
          field_g = (java.awt.Font) null;
        }
    }

    private final void a(byte param0) {
        int stackIn_57_0 = 0;
        int var2;
        vj var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 >= -85) {
          return;
        }
        if (this.field_D != 1 &&
          3 != this.field_D) {
          return;
        }
        if (null != this.field_F &&
          this.field_D >= 0 &&
          this.field_D < this.field_F.length) {
          if (0 > this.field_F[this.field_D]) {
            var2 = -1;
            if (1 == this.field_D) {
              var2 = 3;
            }
            if (this.field_D == 3) {
              var2 = 4;
            }
            if (var2 >= 0 &&
              this.field_y == var2) {
              if (aw.field_j != null &&
                this.field_G >= 0 &&
                aw.field_j.length > this.field_G) {
                if (aw.field_j[this.field_G] != null &&
                  0 <= var2 &&
                  var2 < aw.field_j[this.field_G].length) {
                  if (aw.field_j[this.field_G][this.field_y] != null &&
                    aw.field_j[this.field_G][this.field_y].length != 0) {
                    if (aw.field_j[this.field_G][this.field_y][0] < 0) {
                      this.field_F[this.field_D] = 0;
                      return;
                    }
                    if (null != ck.field_e &&
                      null != sf.field_P &&
                      0 <= this.field_G &&
                      sf.field_P.length > this.field_G) {
                      if (sf.field_P[this.field_G] >= 0 &&
                        sf.field_P[this.field_G] < ck.field_e.length) {
                        if (null != ck.field_e[sf.field_P[this.field_G]] &&
                          aw.field_j[this.field_G][this.field_y][0] >= 0 &&
                          aw.field_j[this.field_G][this.field_y][0] < ck.field_e[sf.field_P[this.field_G]].length) {
                          var3 = new vj();
                          this.a(-313055120);
                          var3.a(-1, ck.field_e[sf.field_P[this.field_G]][aw.field_j[this.field_G][this.field_y][0]]);
                          var4 = 0;
                          var5 = 0;
                          var6 = 10000;
                          var7 = 0;
                          while (true) {
                            stackIn_57_0 = (!var3.a(-111)) ? 0 : 1;
                            var5Lifetime1 = stackIn_57_0;
                            var7++;
                            if (var3.field_c) {
                              var4++;
                            }
                            if (var6 <= var7) {
                              this.field_F[this.field_D] = 0;
                              return;
                            }
                            if (var5Lifetime1 == 0) {
                              if (!var3.field_c) {
                                continue;
                              }
                              if (0 != var3.field_m) {
                                continue;
                              }
                            }
                            break;
                          }
                          this.field_F[this.field_D] = var4;
                          return;
                        }
                        this.field_F[this.field_D] = 0;
                        return;
                      }
                      this.field_F[this.field_D] = 0;
                      return;
                    }
                    this.field_F[this.field_D] = 0;
                    return;
                  }
                  this.field_F[this.field_D] = 0;
                  return;
                }
                this.field_F[this.field_D] = 0;
                return;
              }
              this.field_F[this.field_D] = 0;
              return;
            }
            this.field_F[this.field_D] = 0;
            return;
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -83) {
          this.field_l = false;
        }
        this.field_D = param0;
    }

    private final void a(int param0) {
        int var2 = this.field_x.field_i >> 16;
        wp var3 = we.a(var2, true);
        io.a(var3, (byte) -34);
        if (param0 != -313055120) {
          return;
        }
    }

    final void c(byte param0) {
        this.a(3, (byte) -91);
        this.field_E = true;
        if (param0 != 102) {
          lf.a(-71, 76, -87, 82, -108, 110, 13, -61, -101);
        }
    }

    final static om a(cf param0, CipherPacketBuffer param1, kl param2, byte param3) {
        om var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        om stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -81 % ((param3 - 51) / 60);
          var4 = na.a(param1, 44);
          var4.field_G = param0;
          var4.field_H = param2;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    lf(int param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        boolean stackIn_16_1 = false;
        int var7;
        this.field_D = 0;
        this.field_d = false;
        this.field_H = false;
        this.field_m = 0;
        this.field_f = -1;
        this.field_w = -1;
        this.field_x = new vj(1);
        this.field_C = param0;
        this.field_G = param0;
        if (param0 == 43) {
          this.field_G = 77;
        }
        if (!param4) {
          if (16 == param0) {
            this.field_G = 78;
          }
          if (25 == param0) {
            this.field_G = 79;
          }
          if (48 == param0) {
            this.field_G = 80;
          }
          if (param0 == 85) {
            this.field_G = 89;
          }
        }
        var7 = AttackEvent.a(false, SpellAreaSelection.field_k[this.field_G].length, li.field_n);
        this.field_A = (gd) (SpellAreaSelection.field_k[this.field_G][var7]);
        if (null == this.field_A) {
          af.a((Throwable) null, 100, "BattleCharacter: no model found - model_index: " + this.field_G + " variation: " + var7);
        }
        this.field_n = nh.field_D[this.field_G];
        this.field_a = param2 + param5;
        this.field_z = new int[lb.field_a];
        this.field_k = new int[lb.field_a];
        stackIn_16_1 = (param1);
        this.field_u = stackIn_16_1;
        this.field_I = new int[lb.field_a];
        this.field_J = 0;
        this.field_j = param2;
        this.field_p = param3;
        this.field_s = param3;
        this.field_y = 0;
        this.field_r = new int[lb.field_a];
        this.field_o = new int[lb.field_a];
        this.d(-104);
        this.field_F = new int[4];
        for (var8 = 0; var8 < this.field_F.length; var8++) {
          this.field_F[var8] = -1;
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_v = "The magic of creating Mana.";
        field_q = new pq();
        field_c = new NodeDeque();
        field_i = new int[]{0, 25, 75, 150, 0};
        field_t = -7;
    }
}
