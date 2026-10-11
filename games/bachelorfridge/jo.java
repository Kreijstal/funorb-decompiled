/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo {
    private kv field_l;
    int field_d;
    pn field_k;
    private kv field_c;
    private kv field_E;
    private kv field_g;
    bq[][] field_j;
    private kv field_x;
    private kv field_n;
    private kv field_C;
    int field_s;
    private int[][] field_G;
    int field_B;
    private kv field_u;
    private kv field_H;
    gj field_i;
    private kv field_o;
    int field_r;
    wia[][] field_I;
    int field_a;
    int field_z;
    int field_h;
    private kv field_f;
    kv field_p;
    int field_q;
    static int field_t;
    int field_F;
    private kv field_A;
    kv field_y;
    int field_b;
    private ad[] field_e;
    private kv field_m;
    private int[] field_v;
    private kv[] field_w;

    private final void b(aj param0, int param1, int param2, int param3) {
        try {
          param0.a(-1, 64 * (param3 - param1) + this.field_b, this.field_B + (param1 + param3) * 32);
          if (param2 != -3613) {
            this.b(11, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jo.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, aj param1, ad param2) {
        if (param2 == null) {
          return;
        }
        this.a(param1, (param2.field_s.field_J << 16) + param2.field_r, param2.field_o + (param2.field_s.field_x << 16), -58);
        if (param0 > -109) {
          return;
        }
        try {
          param1.field_a = param1.field_a - param2.field_k;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jo.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, aj param1) {
        this.field_u.a(param1.field_c + 1, 1 + param1.field_a, 64);
        int var3_int = this.field_i.field_L >> 2;
        int var4 = this.field_v[this.field_i.field_L % 128 < 64 ? this.field_i.field_L % 128 : 127 - this.field_i.field_L % 128];
        int var5 = 255;
        var3_int = lw.a(5, param1.field_c + 64, var4, -1 + param1.field_a, 128 + param1.field_c, 12175, var3_int, param1.field_a + 32, var5);
        var3_int = lw.a(5, 128 + param1.field_c, var4, 32 + param1.field_a, param1.field_c + 64, 12175, var3_int, param1.field_a + 64, var5);
        var3_int = lw.a(5, 64 + param1.field_c, var4, param1.field_a + 64, param1.field_c, 12175, var3_int, param1.field_a + 32, var5);
        var3_int = lw.a(5, param1.field_c, var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, param1.field_a, var5);
        var3_int = lw.a(5, 64 + param1.field_c, var4, 1 + (-1 + param1.field_a), -1 + param1.field_c + 128, param0 - 13268, var3_int, param1.field_a + 32, var5);
        var3_int += 2;
        var3_int = lw.a(5, -1 + (param1.field_c + 128), var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, -1 + param1.field_a + 64, var5);
        var3_int = lw.a(5, 64 + param1.field_c, var4, 64 + (param1.field_a - 1), 1 + param1.field_c, param0 ^ 19692, var3_int, param1.field_a + 32, var5);
        var3_int += 2;
        var3_int = lw.a(5, param1.field_c + 1, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, 1 + param1.field_a, var5);
        var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a + 2, -2 + (128 + param1.field_c), param0 ^ 19692, var3_int, 32 + param1.field_a, var5);
        var3_int += 4;
        var3_int = lw.a(5, 128 + param1.field_c - 2, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, param1.field_a + 62, var5);
        if (param0 != 25443) {
          return;
        }
        try {
          var3_int = lw.a(5, param1.field_c + 64, var4, -2 + (64 + param1.field_a), param1.field_c + 2, 12175, var3_int, 32 + param1.field_a, var5);
          var3_int += 4;
          var3_int = lw.a(5, param1.field_c + 2, var4, 32 + param1.field_a, 64 + param1.field_c, 12175, var3_int, 2 + param1.field_a, var5);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jo.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final aj a(byte param0, ad param1) {
        RuntimeException var3 = null;
        aj stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 77) {
            stackIn_2_0 = (aj) null;
            return stackIn_2_0;
          }
          this.a(-114, dp.field_l, param1);
          stackIn_4_0 = dp.field_l;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jo.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var6;
        int var10;
        int[][] var13;
        int[] var14;
        var10 = BachelorFridge.field_y;
        if (this.field_I[param2][param4].field_n == 20) {
          var6 = -1;
          var13 = this.field_i.field_h.field_i;
          for (var8 = 0; var8 < var13.length; var8++) {
            var14 = var13[var8];
            if (~var14[0] == ~param2 &&
              var14[1] == param4) {
              var6 = var14[2];
            }
          }
          if (-1 != var6) {
            this.field_p.e(param1, param3, this.field_i.c(var6, 2271));
          }
        }
        if (param0 != -1) {
          this.field_p = (kv) null;
        }
        this.field_i.a(-18254, param4, param2);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        aj var28;
        aj var29;
        int[][] var30;
        int[][] var31;
        int var15Lifetime1;
        int var16Lifetime1;
        var19 = BachelorFridge.field_y;
        param3--;
        var30 = haa.b(1, param2, param0);
        var10 = 17;
        var11 = 17;
        var12 = var10 - 1 >> 1;
        var13 = -1 + var11 >> 1;
        if (!param1) {
          this.field_r = 120;
        }
        var31 = new int[var10][var11];
        for (var15 = 0; var10 > var15; var15++) {
          for (var16 = 0; var11 > var16; var16++) {
            if (var30[var15][var16] == 1) {
              var31[var15][var16] = 1;
            }
          }
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var10; var15Lifetime1++) {
          var20 = 0;
          var16Lifetime1 = var20;
          while (var11 > var20) {
            boolean decompiledFrameRemainder0 = true;
            if (var31[var15Lifetime1][var20] != 0) {
              var17 = param4 + var15Lifetime1 - var12;
              var18 = var20 - var13 + param5;
              if (param0 != 1) {
                if (param0 != 3) {
                  if (param0 == 4) {
                    var17 = var17 + param3;
                  } else {
                    if (param0 != 2) {
                      if ((!(var17 < 0)) &&
                        (!(var18 < 0)) &&
                        (!(this.field_a <= var17)) &&
                        (!(var18 >= this.field_z))) {
                        var28 = this.a(var18, (byte) -108, var17);
                        this.field_g.a(1 + var28.field_c, 1 + var28.field_a, 128 - param6 * 20);
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var17 = var17 - param3;
                    }
                  }
                } else {
                  var18 = var18 + param3;
                }
              } else {
                var18 = var18 - param3;
              }
              if ((decompiledFrameRemainder0) && (var17 >= 0 &&
                var18 >= 0 &&
                this.field_a > var17 &&
                var18 < this.field_z)) {
                var29 = this.a(var18, (byte) -108, var17);
                this.field_g.a(1 + var29.field_c, 1 + var29.field_a, 128 - param6 * 20);
              }
            }
            var20++;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, sfa param3) {
        int var9 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        hia var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        aj var21 = null;
        aj var24 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int var12Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var19 = BachelorFridge.field_y;
        try {
          if (param0 != -64) {
            this.a((byte) 70);
          }
          if (param3 instanceof hia) {
            var6 = (hia) (param3);
            var7 = this.field_i.field_G[var6.field_h.field_f].field_s;
            al.a(param0 - 60, var6.field_g);
            var21 = new aj(this.a(var7.field_J, (byte) -96, var7.field_x));
            if (!param2) {
              return;
            }
            var8 = (5 - param1) * 4;
            for (var9 = -44; var9 < 44; var9++) {
              var10 = (int)Math.sqrt((double)(1936 - var9 * var9));
              var11 = var10 / 2;
              var12 = var10 * var8 / 44;
              var13 = var9 + 64 + var21.field_c;
              var14 = 32 + var21.field_a;
              dg.d(var13, 0, var14 - var11, 65793 * var12);
              if (0 != var11) {
                for (var15 = -var11; var15 <= var11; var15++) {
                  dg.h(var13, var14 + var15, var12 * 131329, (var11 - var15 << 8) / (2 * var11));
                }
              }
            }
            var29 = haa.b(param0 ^ -63, var7.d(125, var6.field_g), var6.field_j);
            var10Lifetime1 = 17;
            var11Lifetime1 = 17;
            var12Lifetime1 = -1 + var10Lifetime1 >> 1;
            var13Lifetime1 = -1 + var11Lifetime1 >> 1;
            var30 = new int[var10Lifetime1][var11Lifetime1];
            for (var15Lifetime1 = 0; var15Lifetime1 < var10Lifetime1; var15Lifetime1++) {
              for (var16 = 0; var16 < var11Lifetime1; var16++) {
                if (1 == var29[var15Lifetime1][var16]) {
                  var30[var15Lifetime1][var16] = 1;
                }
              }
            }
            for (var15Lifetime2 = 0; var15Lifetime2 < var10Lifetime1; var15Lifetime2++) {
              var20 = 0;
              var16Lifetime1 = var20;
              while (var11Lifetime1 > var20) {
                if (var30[var15Lifetime2][var20] != 0) {
                  var17 = var7.field_x - var12Lifetime1 + var15Lifetime2;
                  var18 = var7.field_J - var13Lifetime1 + var20;
                  if (var6.field_j == 1) {
                    var18 = var18 - var6.field_k;
                  } else {
                    if (var6.field_j == 3) {
                      var18 = var18 + var6.field_k;
                    } else {
                      if (4 == var6.field_j) {
                        var17 = var17 + var6.field_k;
                      } else {
                        if (var6.field_j == 2) {
                          var17 = var17 - var6.field_k;
                        }
                      }
                    }
                  }
                  if (0 <= var17 &&
                    var18 >= 0 &&
                    this.field_a > var17 &&
                    var18 < this.field_z) {
                    var24 = this.a(var18, (byte) 106, var17);
                    this.field_g.a(var24.field_c, var24.field_a, -(param1 * 10) + 64);
                  }
                }
                var20++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_54_0 = var5;
          stackIn_54_1 = new StringBuilder().append("jo.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    private final void a(aj param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = -1;
          if (param1 != 1) {
            this.c((byte) 26);
          }
          while (1 > var3_int) {
            for (var4 = -1; var4 < 2; var4++) {
              to.field_b.c(sg.a(to.field_b.field_q, param1 ^ 1816304478, this.field_b) + var3_int * to.field_b.field_q, sg.a(to.field_b.field_p, 1816304479, this.field_B) + var4 * to.field_b.field_p);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jo.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        aj var6;
        int var7;
        int var2Lifetime1;
        int var3Lifetime1;
        var5 = BachelorFridge.field_y;
        for (var2 = 0; 2 + this.field_a > var2; var2++) {
          for (var3 = 0; var3 < this.field_z + 2; var3++) {
            this.field_j[var2][var3].field_n = 0;
          }
        }
        for (var2Lifetime1 = 0; this.field_a + 1 > var2Lifetime1; var2Lifetime1++) {
          var7 = 0;
          var3Lifetime1 = var7;
          while (this.field_z + 1 > var7) {
            var4 = 0;
            if (var2Lifetime1 < this.field_a) {
              if (this.field_z > var7) {
                if (this.field_I[var2Lifetime1][var7].field_i) {
                  var4 += 4;
                  if (this.field_z > var7 &&
                    var2Lifetime1 > 0 &&
                    this.field_I[-1 + var2Lifetime1][var7].field_i) {
                    var4 += 8;
                  }
                } else {
                  if (this.field_z > var7 &&
                    var2Lifetime1 > 0 &&
                    this.field_I[-1 + var2Lifetime1][var7].field_i) {
                    var4 += 8;
                  }
                }
              } else {
                if (this.field_z > var7 &&
                  var2Lifetime1 > 0 &&
                  this.field_I[-1 + var2Lifetime1][var7].field_i) {
                  var4 += 8;
                }
              }
            } else {
              if (this.field_z > var7 &&
                var2Lifetime1 > 0 &&
                this.field_I[-1 + var2Lifetime1][var7].field_i) {
                var4 += 8;
              }
            }
            if (var2Lifetime1 > 0) {
              if (var7 > 0) {
                if (this.field_I[-1 + var2Lifetime1][-1 + var7].field_i) {
                  var4++;
                }
                if (this.field_a > var2Lifetime1 &&
                  var7 > 0 &&
                  this.field_I[var2Lifetime1][-1 + var7].field_i) {
                  var4 += 2;
                }
              } else {
                if (this.field_a > var2Lifetime1 &&
                  var7 > 0 &&
                  this.field_I[var2Lifetime1][-1 + var7].field_i) {
                  var4 += 2;
                }
              }
            } else {
              if (this.field_a > var2Lifetime1 &&
                var7 > 0 &&
                this.field_I[var2Lifetime1][-1 + var7].field_i) {
                var4 += 2;
              }
            }
            if (var4 > 0) {
              this.field_j[var2Lifetime1][var7].field_n = 1;
              this.field_j[var2Lifetime1][var7].field_k = var4;
              if ((var7 + var2Lifetime1) % 2 == 1) {
                this.field_j[var2Lifetime1][var7].field_o = true;
              }
            }
            var7++;
          }
        }
        if (!param0) {
          var6 = (aj) null;
          this.a(false, (aj) null, 63);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7 = 0;
        aj var9 = null;
        aj var15 = null;
        aj var16 = null;
        aj var17 = null;
        aj var18 = null;
        int var8 = 0;
        int var10 = BachelorFridge.field_y;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        param0 = param0 * (160 + (via.a(vr.field_b << 7, (byte) 58) >> 11));
        param0 = param0 >> 8;
        for (var7 = param3; var7 < param2; var7++) {
          for (var8 = param1; var8 < param4; var8++) {
            var9 = this.a(var8, (byte) -119, var7);
            this.field_A.d(var9.field_c, var9.field_a, param0);
          }
        }
        aj var11 = this.a(param4, (byte) -102, param2);
        this.field_E.d(2 + var11.field_c, var11.field_a, param0);
        this.field_E.c();
        aj var12 = this.a(param1 - 1, (byte) -117, -1 + param3);
        this.field_E.d(2 + var12.field_c, var12.field_a, param0);
        this.field_E.c();
        aj var13 = this.a(param4, (byte) -128, -1 + param3);
        this.field_l.d(var13.field_c + 2, var13.field_a, param0);
        this.field_l.e();
        aj var14 = this.a(param1 - 1, (byte) -111, param2);
        this.field_l.d(var14.field_c, var14.field_a, param0);
        this.field_l.e();
        for (var8Lifetime1 = param1; param4 > var8Lifetime1; var8Lifetime1++) {
          var15 = this.a(var8Lifetime1, (byte) -122, param2);
          this.field_H.d(var15.field_c, -1 + var15.field_a, param0);
        }
        this.field_H.e();
        for (var8Lifetime2 = param3; var8Lifetime2 < param2; var8Lifetime2++) {
          var16 = this.a(param4, (byte) 106, var8Lifetime2);
          this.field_H.d(var16.field_c, var16.field_a, param0);
        }
        this.field_H.c();
        if (param5 != -106) {
          return;
        }
        for (var8Lifetime3 = param1; param4 > var8Lifetime3; var8Lifetime3++) {
          var17 = this.a(var8Lifetime3, (byte) -101, -1 + param3);
          this.field_H.d(var17.field_c, var17.field_a, param0);
        }
        this.field_H.e();
        for (var8Lifetime4 = param3; var8Lifetime4 < param2; var8Lifetime4++) {
          var18 = this.a(-1 + param1, (byte) 62, var8Lifetime4);
          this.field_H.d(var18.field_c, 1 + var18.field_a, param0);
        }
        this.field_H.c();
    }

    private final void b(int param0, byte param1, int param2) {
        int var11 = 0;
        int var4;
        aj var5;
        double var6;
        int var8;
        int var9;
        int var13;
        ad var14;
        int[][] var21;
        int[] var22;
        var13 = BachelorFridge.field_y;
        var4 = -1;
        var5 = this.a(param2, (byte) 115, param0);
        var6 = 1.5707963267948966 + 0.5 * ((double)((param2 * param0 << 2) + this.field_i.field_L) / 80.0);
        var8 = (int)(Math.sin(0.5 * ((double)(this.field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 32.0);
        var9 = (int)(Math.cos(0.5 * ((double)(this.field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 15.0);
        var21 = this.field_i.field_h.field_i;
        for (var11 = 0; var11 < var21.length; var11++) {
          var22 = var21[var11];
          if (param0 == var22[0] &&
            var22[1] == param2) {
            var4 = var22[2];
          }
        }
        if (param1 != 80) {
          var14 = (ad) null;
          this.a(-31, (aj) null, (ad) null);
        }
        if (-1 != var4) {
          this.field_o.e(var5.field_c, var5.field_a, this.field_i.c(var4, 2271));
          if (var9 < 0) {
            if (var6 % 3.141592653589793 > 2.0943951023931953) {
              hha.field_y[(this.field_i.field_L >> 3) % 5 + 10].b(var5.field_c + 64 - (18 - var8), -18 + var5.field_a + 32 + var9, this.field_i.c(var4, 2271));
            } else {
              if (!(1.0471975511965976 < var6 % 3.141592653589793)) {
                hha.field_y[5 + (this.field_i.field_L >> 3) % 5].b(var8 + 46 + var5.field_c, var9 + var5.field_a + 14, this.field_i.c(var4, 2271));
              } else {
                hha.field_y[(this.field_i.field_L >> 3) % 5].b(var8 - 18 + (var5.field_c + 64), var9 + (-18 + (32 + var5.field_a)), this.field_i.c(var4, param1 ^ 2191));
              }
            }
          } else {
            if (!(2.0943951023931953 < var6 % 3.141592653589793)) {
              if (1.0471975511965976 < var6 % 3.141592653589793) {
                ik.field_h[(this.field_i.field_L >> 3) % 5].b(-18 + (var5.field_c + (64 + var8)), var9 + (var5.field_a + 14), this.field_i.c(var4, 2271));
              } else {
                ik.field_h[(this.field_i.field_L >> 3) % 5 + 10].b(var5.field_c + 64 + (-18 + var8), 32 + var5.field_a + (-18 + var9), this.field_i.c(var4, 2271));
              }
            } else {
              ik.field_h[(this.field_i.field_L >> 3) % 5 + 5].b(var8 + 64 + var5.field_c - 18, var9 + (-18 + (32 + var5.field_a)), this.field_i.c(var4, 2271));
            }
          }
        } else {
          if (var9 < 0) {
            if (var6 % 3.141592653589793 > 2.0943951023931953) {
              hha.field_y[10 + (this.field_i.field_L >> 3) % 5].a(-18 + (var5.field_c + 64 + var8), var9 - 18 + (32 + var5.field_a));
            } else {
              if (!(var6 % 3.141592653589793 > 1.0471975511965976)) {
                hha.field_y[5 + (this.field_i.field_L >> 3) % 5].a(-18 + var5.field_c + 64 + var8, var5.field_a + 14 + var9);
              } else {
                hha.field_y[(this.field_i.field_L >> 3) % 5].a(var8 + (var5.field_c + 64) - 18, var5.field_a + 14 + var9);
              }
            }
          } else {
            if (!(var6 % 3.141592653589793 > 2.0943951023931953)) {
              if (!(1.0471975511965976 < var6 % 3.141592653589793)) {
                ik.field_h[(this.field_i.field_L >> 3) % 5 + 10].a(var8 + 64 + var5.field_c - 18, var9 + (var5.field_a + 14));
              } else {
                ik.field_h[(this.field_i.field_L >> 3) % 5].a(var8 - 18 + (64 + var5.field_c), var9 + var5.field_a + 32 - 18);
              }
            } else {
              ik.field_h[(this.field_i.field_L >> 3) % 5 + 5].a(64 + (var5.field_c - 18 + var8), var9 + (var5.field_a + 32 - 18));
            }
          }
        }
    }

    private final void a(byte param0, aj param1) {
        int var4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ad var5 = null;
        aga var6 = null;
        int var7_int = 0;
        vca var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        double var14_double = 0.0;
        int var14 = 0;
        int var16 = 0;
        aj var17 = null;
        ad[] var18 = null;
        aj var19 = null;
        int var14Lifetime1;
        var16 = BachelorFridge.field_y;
        try {
          if (param0 >= -93) {
            return;
          }
          if (this.field_i.field_P != null) {
            var17 = this.a(this.field_i.field_P.field_s.field_J, (byte) 49, this.field_i.field_P.field_s.field_x);
            param1 = var17;
            this.b(25443, var17);
            this.field_n.e(var17.field_c + 2, var17.field_a - 40 - 12, 32 + this.field_n.field_q, 32 + this.field_n.field_p, 192);
          }
          var18 = this.field_e;
          for (var4 = 0; var4 < var18.length; var4++) {
            var5 = var18[var4];
            if (var5 != null && (!this.field_i.field_h.field_a[var5.field_s.field_x][var5.field_s.field_J].field_d ||
              this.field_i.field_n == var5.field_s.field_D)) {
              var6 = var5.field_s;
              var19 = this.a((byte) 106, var5);
              param1 = var19;
              if (!var5.field_s.i(126)) {
                if (39 == var6.field_y) {
                  od.field_C.a(var19.field_c, var19.field_a - 64);
                } else {
                  if (var6.field_y == 2) {
                    ala.field_a[(this.field_i.field_L >> 2) % 4 + 8].e(42 + var19.field_c, var19.field_a - 42);
                  } else {
                    if (29 != var6.field_y) {
                      if (var6.field_y == 1) {
                        ala.field_a[(this.field_i.field_L >> 2) % 4 + 4].e(42 + var19.field_c, -42 + var19.field_a);
                      } else {
                        if (var6.field_y != 12) {
                          if (var6.field_y == 37) {
                            ala.field_a[(this.field_i.field_L >> 2) % 4 + 16].e(42 + var19.field_c, -42 + var19.field_a);
                          }
                        } else {
                          ala.field_a[12 + (this.field_i.field_L >> 2) % 4].e(var19.field_c + 42, -42 + var19.field_a);
                        }
                      }
                    } else {
                      ala.field_a[(this.field_i.field_L >> 2) % 4 + 0].e(var19.field_c + 42, -42 + var19.field_a);
                    }
                  }
                }
              }
              this.a(16429, var5, var19);
              if (var5.field_j > 0) {
                var7_int = 50;
                var8 = var19.field_c + (128 - var7_int >> 1);
                var9 = var19.field_a - 14;
                var10 = (int)((double)var5.field_j / (double)var6.field_t * 100.0);
                dg.b(-14 + var8, var9, 13, 65793);
                cfa.a(var10, 13574, 14.199999809265137f, var8 - 14, this.field_i.c(var6.field_D, 2271), var9);
                var11 = var6.field_t / 10;
                var12 = 6.283185307179586 / (double)var11;
                var14_double = 0.0;
                while (var11 >= 0) {
                  dg.d(var8 - 14, var9, (int)((long)(-14 + var8) + Math.round(13.0 * Math.sin(var14_double))), (int)(-Math.round(Math.cos(var14_double) * 13.0) + (long)var9), 65793);
                  var14_double = var14_double + var12;
                  var11--;
                }
                sia.field_g.e(-28 + var8, var9 - 14);
                if (this.field_i.b(var5, true) != null &&
                  var5.field_s.field_D == this.field_i.field_n) {
                  ad.field_h.a("" + var6.field_v, -16 + var8 + 2, -26 + (30 + var9), 2 + var6.field_D, -1);
                  var14 = this.field_i.b(var5, true).field_g;
                  stackIn_37_0 = var9 - 15;
                  if (this.field_i.field_L % 128 >= 64) {
                    stackIn_38_1 = -(this.field_i.field_L % 128) + 127;
                  } else {
                    stackIn_38_1 = this.field_i.field_L % 128;
                  }
                  cba.a(stackIn_37_0, stackIn_38_1 * 4, -29 + var8, var14, -60);
                } else {
                  ad.field_h.a("" + var6.field_v, var8 + 2 - 16, var9 + 30 - 26, var6.field_D + 2, -1);
                }
                if (this.field_i.field_h.field_o == 3 &&
                  var6.g((byte) 85)) {
                  var14Lifetime1 = (int)(15.0 * Math.cos(0.5 * ((double)(this.field_i.field_L + (var6.field_x * var6.field_J << 2)) / 40.0)));
                  pm.field_v[(this.field_i.field_L >> 2) % 2].a(72 + var19.field_c, var14Lifetime1 + (var19.field_a - 32));
                }
                if (var5.field_s.field_y != 0 &&
                  pna.field_zb[var5.field_s.field_y].field_i != -1) {
                  lga.field_k.e(15 + var19.field_c, var19.field_a + 2);
                  am.field_M[pna.field_zb[var5.field_s.field_y].field_i].e(var19.field_c + 17, var19.field_a + 4);
                }
                if (!var5.field_s.i(-89)) {
                  if (var5.field_s.field_y == 39) {
                    hr.field_c.a(var19.field_c, var19.field_a - 64, 192);
                  } else {
                    if (var5.field_s.field_y == 2) {
                      dg.a(var19.field_c + 42, var19.field_a - 28, var19.field_c + 88, var19.field_a);
                      ala.field_a[(this.field_i.field_L >> 2) % 4 + 8].e(42 + var19.field_c, var19.field_a - 42);
                      dg.c();
                    } else {
                      if (var5.field_s.field_y == 29) {
                        dg.a(42 + var19.field_c, -28 + var19.field_a, 88 + var19.field_c, var19.field_a);
                        ala.field_a[0 + (this.field_i.field_L >> 2) % 4].e(var19.field_c + 42, -42 + var19.field_a);
                        dg.c();
                      } else {
                        if (1 == var5.field_s.field_y) {
                          dg.a(var19.field_c + 42, -28 + var19.field_a, var19.field_c + 88, var19.field_a);
                          ala.field_a[(this.field_i.field_L >> 2) % 4 + 4].e(var19.field_c + 42, -42 + var19.field_a);
                          dg.c();
                        } else {
                          if (var5.field_s.field_y == 12) {
                            dg.a(var19.field_c + 42, -28 + var19.field_a, 88 + var19.field_c, var19.field_a);
                            ala.field_a[(this.field_i.field_L >> 2) % 4 + 12].e(42 + var19.field_c, -42 + var19.field_a);
                            dg.c();
                          } else {
                            if (var5.field_s.field_y == 37) {
                              dg.a(var19.field_c + 42, var19.field_a - 28, var19.field_c + 88, var19.field_a);
                              ala.field_a[(this.field_i.field_L >> 2) % 4 + 16].e(42 + var19.field_c, -42 + var19.field_a);
                              dg.c();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              var7 = (vca) (var5.field_t.b((byte) 90));
              while (var7 != null) {
                var7.a(-40 + var19.field_a + 32, var19.field_c + 64, false);
                var7 = (vca) (var5.field_t.c(0));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("jo.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    private final void a(boolean param0, sfa param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ad var4 = null;
        aga var5 = null;
        int var6 = 0;
        int var7 = 0;
        aj var8 = null;
        aj var9 = null;
        int var10 = 0;
        gm var11 = null;
        gm var12 = null;
        var10 = BachelorFridge.field_y;
        try {
          if (param1 instanceof gm) {
            var11 = (gm) (param1);
            var12 = var11;
            var4 = this.field_i.field_G[var11.field_h.field_f];
            var5 = var4.field_s;
            var6 = var12.field_l;
            var7 = var12.field_i;
            var8 = new aj(this.a(var5.field_J, (byte) 36, var5.field_x));
            if (3 != var7) {
              if (var7 != 1) {
                if (var7 != 2) {
                  if (var7 != 4) {
                    var9 = new aj(this.a(var5.field_J, (byte) 86, var5.field_x));
                  } else {
                    var9 = this.a(var5.field_J, (byte) -89, var5.field_x + var6);
                  }
                } else {
                  var9 = this.a(var5.field_J, (byte) -90, -var6 + var5.field_x);
                }
              } else {
                var9 = this.a(-var6 + var5.field_J, (byte) -105, var5.field_x);
              }
            } else {
              var9 = this.a(var6 + var5.field_J, (byte) 120, var5.field_x);
            }
            this.a(var5, var8, -32, var9, var7);
          }
          if (!param0) {
            this.b(-107, -63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("jo.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 2962) {
          this.field_E = (kv) null;
        }
        this.field_B = this.field_B + param1;
        this.field_b = this.field_b + param0;
        this.a((byte) -97);
    }

    final void a(int param0) {
        int var5 = 0;
        int var8 = 0;
        int[] var2;
        int var3;
        ad[][] var4;
        ad[] var6;
        ad[] var7;
        ad var9;
        int var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int[] var14;
        int[] var15;
        var10 = BachelorFridge.field_y;
        this.field_e = new ad[7 * this.field_i.field_h.field_d];
        var14 = new int[7 * this.field_i.field_h.field_d];
        var12 = var14;
        var11 = var12;
        var15 = var11;
        var13 = var15;
        var2 = var13;
        if (param0 != -22048) {
          this.field_m = (kv) null;
        }
        bl.a(var11, 0, var14.length, 2147483646);
        var3 = 0;
        var4 = this.field_i.field_o;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (var6 != null) {
            var7 = var6;
            for (var8 = 0; var7.length > var8; var8++) {
              var9 = var7[var8];
              if (var9 != null) {
                this.field_e[var3] = var9;
                var2[var3] = var9.field_s.field_x + var9.field_s.field_J;
                if (var9.field_s.i(-122)) {
                  var2[var3] = var2[var3] - 1;
                }
                var3++;
              }
            }
          }
        }
        dk.$cfr$intArgs$a$e46325ef0b7e(this.field_e, 101, var15);
    }

    private final void a(boolean param0, aj param1, int param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_q != -1 &&
            -1 != this.field_r) {
            param1 = this.a(this.field_r, (byte) -97, this.field_q);
            if (param0) {
              rla.field_k.e(22 + param1.field_c, 10 + param1.field_a, 65376);
            } else {
              rla.field_k.e(param1.field_c + 22, param1.field_a + 10, 16711680);
            }
            if (param2 != 18503) {
              this.a((byte) -63, -5, -59);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("jo.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final aj a(boolean param0, int param1, int param2) {
        if (param0) {
          this.field_H = (kv) null;
        }
        this.a(dp.field_l, param1, param2, -80);
        return dp.field_l;
    }

    private final void a(aj param0, int param1, int param2, int param3) {
        try {
          param0.a(-1, ((-param1 + param2) * 128 >> 17) + this.field_b, (64 * (param2 + param1) >> 17) + this.field_B);
          if (param3 > -47) {
            this.field_n = (kv) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jo.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        this.field_b = param0;
        if (param3 != -71) {
          return;
        }
        this.field_B = param1;
        if (param2) {
          this.a((byte) 38);
        }
    }

    private final void a(int param0, ad param1, aj param2) {
        int stackIn_19_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        aga var8 = null;
        lna var9 = null;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kv var14 = null;
        kv var15 = null;
        int var16 = 0;
        kv var17 = null;
        Object var18 = null;
        gca var19 = null;
        gca var19Lifetime1;
        int var11Lifetime1;
        var18 = null;
        var16 = BachelorFridge.field_y;
        try {
          if (!param1.field_s.field_A &&
            0 >= param1.field_j) {
            return;
          }
          if (this.field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n == 21 &&
            param1.field_s.i(124)) {
            return;
          }
          if (this.field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_d &&
            this.field_i.field_n != param1.field_s.field_D) {
            return;
          }
          var4_int = param2.field_c - 12;
          var5 = -90 + param2.field_a;
          var6 = 48;
          var7 = 32;
          var8 = param1.field_s;
          var9 = param1.field_f;
          var10 = param1.e((byte) -121);
          if (0.0f != var10) {
            var11 = (int)((float)(via.a(50 * vr.field_b, (byte) 104) + 65536) * var10);
            var5 = var5 - (int)(var10 * 30.0f);
            var6 = var6 - (var11 * 6 >> 16);
            var7 = var7 - (var11 * 4 >> 16);
            var5 = var5 - (var11 * 4 >> 16);
          }
          if (param1.field_k > 0) {
            if (15 <= param1.field_k) {
              stackIn_19_0 = 15;
            } else {
              stackIn_19_0 = param1.field_k;
            }
            var11Lifetime1 = stackIn_19_0;
            var6 = var6 - (3 * var11Lifetime1 >> 1);
            var7 = var7 - (2 * var11Lifetime1 >> 1);
          }
          if (param0 != 16429) {
            return;
          }
          var19 = (gca) (param1.field_n.b((byte) 90));
          while (var19 != null) {
            var19.a(120 + var5, 76 + var4_int, (byte) -34);
            var19 = (gca) (param1.field_n.c(0));
          }
          if (0 < var6 &&
            var7 > 0) {
            nk.a(this.field_y, param2.field_c + 64 - (var6 >> 1), -(var7 >> 1) + param2.field_a - (-param1.field_k - 24), var6, var7);
          }
          if (var8.field_s != 1) {
            stackIn_35_0 = (var8.field_s == 4) ? 1 : 0;
          } else {
            stackIn_35_0 = 1;
          }
          var12 = stackIn_35_0;
          if (param1.field_p == 0) {
            var9.a(var12 != 0, false, 2048, 2048, 0, -49, 255, var4_int, var5);
          } else {
            var13 = param1.field_p;
            if (var13 < 0) {
              var13 = -var13;
            }
            var13 = bd.field_i.field_p * (var13 - 128) >> 8;
            var14 = var9.e(param0 ^ 16465);
            if (var12 != 0) {
              var14.e();
            }
            var17 = lq.a(this.field_k.field_b[93], 8533, var14, -60 + var13, 0);
            var15 = bd.field_i;
            bd.field_i = var17;
            var9.a(0, 2048, 2048, (byte) 123, false, 255, var5, var4_int);
            bd.field_i = var15;
          }
          var19Lifetime1 = (gca) (param1.field_n.b((byte) 90));
          while (var19Lifetime1 != null) {
            var19Lifetime1.a(120 + var5, (byte) 72, 76 + var4_int);
            var19Lifetime1 = (gca) (param1.field_n.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_49_0 = var4;
          stackIn_49_1 = new StringBuilder().append("jo.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        aj var6;
        int var7;
        int var8;
        var3 = this.field_i.field_h.field_c[param0][0];
        var5 = -101 % ((18 - param1) / 36);
        var4 = this.field_i.field_h.field_c[param0][1];
        if (-1 == var3) {
          return;
        }
        if (-1 != var4 &&
          this.field_i.field_h.field_z > var3 &&
          this.field_i.field_h.field_B > var4) {
          if (this.field_i.field_h.field_a[var3][var4].field_l != null) {
            return;
          }
          var6 = this.a(var4, (byte) -95, var3);
          var7 = (int)(Math.sin(0.5 * ((double)(this.field_i.field_L + (var4 * var3 << 2)) / 40.0)) * 30.0);
          var8 = (int)(Math.cos(0.5 * ((double)(this.field_i.field_L + (var3 * var4 << 2)) / 40.0)) * 15.0);
          if (var8 >= 0) {
            hb.field_k[(this.field_i.field_L >> 2) % 2].b(var6.field_c + 56 + var7, var8 + (var6.field_a - 16), this.field_i.c(param0, 2271));
          } else {
            pm.field_v[(this.field_i.field_L >> 2) % 2].b(64 + var6.field_c - (8 - var7), var6.field_a + (-16 + var8), this.field_i.c(param0, 2271));
          }
          return;
        }
    }

    private final void b(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var2;
        int var3;
        wia var6;
        int var13;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var13 = BachelorFridge.field_y;
        if (param0 != 24731) {
          this.field_q = -41;
        }
        var2 = this.field_i.field_h.field_z;
        var3 = this.field_i.field_h.field_B;
        for (var4 = 0; var4 < var2; var4++) {
          for (var5 = 0; var3 > var5; var5++) {
            var6 = this.field_i.field_h.field_a[var4][var5];
            if (33 == var6.field_n) {
              var7 = 4 - var6.field_j;
              var8 = (2 + var6.field_j) * 32;
              var9 = var4 - var7;
              var10 = 1 + (var7 + var4);
              var11 = -var7 + var5;
              if (var11 < 0) {
                var11 = 0;
              }
              if (var2 < var10) {
                var10 = var2;
              }
              if (var9 < 0) {
                var9 = 0;
              }
              var12 = var7 + (var5 + 1);
              if (var3 < var12) {
                var12 = var3;
              }
              this.a(var8, var11, var10, var9, var12, (byte) -106);
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, kv param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          var6_int = 0;
          if (param1 >= -91) {
            this.field_e = (ad[]) null;
          }
          for (var7 = 0; var7 < param4.field_p; var7++) {
            var8 = 0;
            while (var8 < param4.field_q) {
              var9 = param4.field_v[var6_int];
              if (0 != var9) {
                var10 = param3 * var7 + (param0 + param2 * var8) >> 1;
                var10 = this.c(var10, -16079);
                if (var10 <= 0) {
                  param4.field_v[var6_int] = 0;
                } else {
                  var11 = 16711935 & var9;
                  var11 = var11 * var10;
                  var12 = var9 & 65280;
                  var12 = var12 * var10;
                  param4.field_v[var6_int] = mp.a(dda.a(var12, 16711680), dda.a(-16711936, var11)) >>> 8;
                }
              }
              var8++;
              var6_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("jo.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(aga param0, aj param1, int param2, aj param3, int param4) {
        int var16 = 0;
        int var17 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = BachelorFridge.field_y;
        try {
          var6_int = param1.field_c + 64;
          var7 = param1.field_a - param2;
          var8 = param3.field_c + 64;
          var9 = param3.field_a + 32;
          stackIn_4_0 = (var7 < var9) ? var7 : var9;
          var10 = stackIn_4_0 - 8;
          stackIn_7_0 = (var7 <= var9) ? var9 : var7;
          var11 = stackIn_7_0 + 8;
          stackIn_10_0 = (var8 > var6_int) ? var6_int : var8;
          var12 = stackIn_10_0 - 16;
          stackIn_13_0 = (var6_int <= var8) ? var8 : var6_int;
          var13 = stackIn_13_0 + 16;
          var14 = 1;
          var15 = 2;
          if (2 == param4) {
            var14 = -1;
            var15 = -2;
          } else {
            if (1 == param4) {
              var15 = -2;
            } else {
              if (param4 == 3) {
                var14 = -1;
              }
            }
          }
          for (var16 = var10; var11 > var16; var16++) {
            for (var17 = var12; var17 < var13; var17++) {
              var18 = (-var7 + var16) * var15 + var14 * (var17 - var6_int);
              var19 = var14 * (var17 - var6_int) - var15 * (-var7 + var16);
              var20 = (var8 - var6_int) * var14 + var15 * (var9 - var7);
              if (32 <= var18 &&
                var18 <= var20) {
                var21 = 16;
                if (var20 - 80 < var18) {
                  var21 = (var20 - var18) / 2;
                }
                var22 = 33023;
                if (var19 >= -var21 &&
                  var21 >= var19) {
                  var23 = (var18 << 7) / var20;
                  var23 += 32;
                  dg.h(var17, var16, var22, var23);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_43_0 = var6;
          stackIn_43_1 = new StringBuilder().append("jo.CA(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_b = param2;
        if (param0 <= 0) {
          this.field_G = (int[][]) null;
        }
        this.field_B = param1;
        this.a((byte) -96);
    }

    private final void c(byte param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        int var3Lifetime1;
        this.field_p = tf.a((byte) 119, 3, 3, 127, 64);
        this.field_o = new kv(128, 64);
        this.field_o.b();
        this.field_u = new kv(128, 64);
        this.field_u.b();
        this.field_p.e(0, 0, 33023);
        this.field_C = new kv(128, 64);
        this.field_C.b();
        this.field_p.e(0, 0, 16776960);
        this.field_m = new kv(128, 64);
        this.field_m.b();
        this.field_p.e(0, 0, 16777215);
        this.field_g = new kv(128, 64);
        this.field_g.b();
        this.field_p.e(0, 0, 16711680);
        this.field_f = new kv(128, 64);
        this.field_f.b();
        this.field_p.e(0, 0, 8454016);
        this.field_y = new kv(49, 49);
        int[] var5 = new int[256];
        int[] var10 = var5;
        for (var3 = 0; var3 < 256; var3++) {
          var5[var3] = 65793 * var3;
        }
        this.field_y.b();
        dg.a(400, 400, 384, 128, var10);
        this.field_x = new kv(128, 64);
        this.field_x.b();
        this.field_p.e(0, 0, 2302755);
        this.field_c = new kv(128, 64);
        this.field_c.b();
        this.field_p.e(0, 0, 16711680);
        this.field_w = new kv[4];
        if (param0 != -124) {
          this.field_v = (int[]) null;
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 4) {
          this.field_w[var6] = new kv(128, 64);
          this.field_w[var6].b();
          this.field_p.e(0, 0, this.field_i.c(var6, 2271));
          var6++;
        }
        this.field_n = new kv(84, 84);
        this.field_n.b();
        dg.a(672, 672, 672, 128, var10);
        this.field_A = new kv(128, 64);
        this.field_A.b();
        this.field_p.c(0, 0, 65280);
        this.field_H = this.field_A.a();
        this.a(-64, (byte) -115, 1, 2, this.field_H);
        this.field_E = this.field_A.a();
        this.a(64, -1, this.field_E, -64, 1, (byte) -127, 2, 2);
        this.field_l = this.field_A.a();
        this.a(192, -1, this.field_l, 64, -1, (byte) -100, 2, -2);
        hga.field_U.a((byte) 126);
    }

    private final int c(int param0, int param1) {
        if (param1 != -16079) {
          this.field_r = -114;
        }
        return (int)(Math.pow(2.0, (double)((float)(-param0) / 10.239999771118164f)) * 256.0);
    }

    private final void a(int param0, int param1, kv param2, int param3, int param4, byte param5, int param6, int param7) {
        int var10 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = BachelorFridge.field_y;
        try {
          var9_int = 0;
          if (param5 > -79) {
            return;
          }
          for (var10 = 0; param2.field_p > var10; var10++) {
            var11 = 0;
            while (param2.field_q > var11) {
              var12 = param2.field_v[var9_int];
              if (var12 != 0) {
                var13 = var10 * param7 + (param1 * var11 + param0);
                var14 = param4 * var11 + param3 + var10 * param6;
                var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14)) >> 1;
                var15 = this.c(var15, -16079);
                if (var15 <= 0) {
                  param2.field_v[var9_int] = 0;
                } else {
                  var16 = 16711935 & var12;
                  var16 = var16 * var15;
                  var17 = 65280 & var12;
                  var17 = var17 * var15;
                  param2.field_v[var9_int] = mp.a(dda.a(var17, 16711680), dda.a(-16711936, var16)) >>> 8;
                }
              }
              var11++;
              var9_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_19_0 = var9;
          stackIn_19_1 = new StringBuilder().append("jo.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = -16384 + 64 * this.field_b + (128 * this.field_B - 30720);
        var2 = var3;
        var4 = -4096 + this.field_B * 128 + (this.field_b * -64 + 20480) - 30720;
        if (0 < var2) {
          this.field_b = this.field_b - (var2 / 64 >> 1);
          this.field_B = this.field_B - (var2 / 128 >> 1);
        }
        var2Lifetime1 = var3 + 8192 * this.field_a;
        if (var2Lifetime1 < 0) {
          this.field_B = this.field_B - (var2Lifetime1 / 128 >> 1);
          this.field_b = this.field_b - (var2Lifetime1 / 64 >> 1);
        }
        var5 = 68 / ((-31 - param0) / 57);
        var2Lifetime2 = var4;
        if (var2Lifetime2 > 0) {
          this.field_b = this.field_b + (var2Lifetime2 / 64 >> 1);
          this.field_B = this.field_B - (var2Lifetime2 / 128 >> 1);
        }
        var2Lifetime3 = var4 + this.field_z * 8192;
        if (var2Lifetime3 < 0) {
          this.field_b = this.field_b + (var2Lifetime3 / 64 >> 1);
          this.field_B = this.field_B - (var2Lifetime3 / 128 >> 1);
        }
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = BachelorFridge.field_y;
        for (var2 = 0; 2 + this.field_a > var2; var2++) {
          for (var3 = 0; var3 < 2 + this.field_z; var3++) {
            this.field_j[var2][var3].field_n = 0;
          }
        }
        for (var2Lifetime1 = 0; 1 + this.field_a > var2Lifetime1; var2Lifetime1++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 1 + this.field_z; var3Lifetime1++) {
            var4 = 0;
            if (var2Lifetime1 < this.field_a &&
              this.field_z > var3Lifetime1 &&
              this.field_I[var2Lifetime1][var3Lifetime1].field_i) {
              var4 += 4;
            }
            if (var3Lifetime1 < this.field_z &&
              var2Lifetime1 > 0 &&
              this.field_I[var2Lifetime1 - 1][var3Lifetime1].field_i) {
              var4 += 8;
            }
            if (0 < var2Lifetime1) {
              if (0 < var3Lifetime1) {
                if (this.field_I[-1 + var2Lifetime1][var3Lifetime1 - 1].field_i) {
                  var4++;
                }
                if (this.field_a > var2Lifetime1 &&
                  0 < var3Lifetime1 &&
                  this.field_I[var2Lifetime1][-1 + var3Lifetime1].field_i) {
                  var4 += 2;
                }
              } else {
                if (this.field_a > var2Lifetime1 &&
                  0 < var3Lifetime1 &&
                  this.field_I[var2Lifetime1][-1 + var3Lifetime1].field_i) {
                  var4 += 2;
                }
              }
            } else {
              if (this.field_a > var2Lifetime1 &&
                0 < var3Lifetime1 &&
                this.field_I[var2Lifetime1][-1 + var3Lifetime1].field_i) {
                var4 += 2;
              }
            }
            if (var4 > 0) {
              this.field_j[var2Lifetime1][var3Lifetime1].field_n = 1;
              this.field_j[var2Lifetime1][var3Lifetime1].field_k = var4;
            }
          }
        }
        if (param0 < 53) {
          this.c((byte) -3);
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < this.field_a + 1; var2Lifetime2++) {
          for (var3Lifetime2 = 0; this.field_z + 1 > var3Lifetime2; var3Lifetime2++) {
            var4Lifetime1 = 0;
            if (this.field_a > var2Lifetime2) {
              if (this.field_z > var3Lifetime2) {
                if (29 == this.field_I[var2Lifetime2][var3Lifetime2].field_n) {
                  var4Lifetime1 += 4;
                  if (this.field_z > var3Lifetime2 &&
                    var2Lifetime2 > 0 &&
                    this.field_I[var2Lifetime2 - 1][var3Lifetime2].field_n == 29) {
                    var4Lifetime1 += 8;
                  }
                } else {
                  if (this.field_z > var3Lifetime2 &&
                    var2Lifetime2 > 0 &&
                    this.field_I[var2Lifetime2 - 1][var3Lifetime2].field_n == 29) {
                    var4Lifetime1 += 8;
                  }
                }
              } else {
                if (this.field_z > var3Lifetime2 &&
                  var2Lifetime2 > 0 &&
                  this.field_I[var2Lifetime2 - 1][var3Lifetime2].field_n == 29) {
                  var4Lifetime1 += 8;
                }
              }
            } else {
              if (this.field_z > var3Lifetime2 &&
                var2Lifetime2 > 0 &&
                this.field_I[var2Lifetime2 - 1][var3Lifetime2].field_n == 29) {
                var4Lifetime1 += 8;
              }
            }
            if (var2Lifetime2 > 0) {
              if (var3Lifetime2 > 0) {
                if (this.field_I[var2Lifetime2 - 1][-1 + var3Lifetime2].field_n == 29) {
                  var4Lifetime1++;
                }
                if (this.field_a > var2Lifetime2 &&
                  var3Lifetime2 > 0 &&
                  this.field_I[var2Lifetime2][-1 + var3Lifetime2].field_n == 29) {
                  var4Lifetime1 += 2;
                }
              } else {
                if (this.field_a > var2Lifetime2 &&
                  var3Lifetime2 > 0 &&
                  this.field_I[var2Lifetime2][-1 + var3Lifetime2].field_n == 29) {
                  var4Lifetime1 += 2;
                }
              }
            } else {
              if (this.field_a > var2Lifetime2 &&
                var3Lifetime2 > 0 &&
                this.field_I[var2Lifetime2][-1 + var3Lifetime2].field_n == 29) {
                var4Lifetime1 += 2;
              }
            }
            if (var4Lifetime1 > 0) {
              this.field_j[var2Lifetime2][var3Lifetime2].field_n = 29;
              this.field_j[var2Lifetime2][var3Lifetime2].field_k = var4Lifetime1;
            }
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < this.field_a + 1; var2Lifetime3++) {
          for (var3Lifetime3 = 0; var3Lifetime3 < 1 + this.field_z; var3Lifetime3++) {
            var4Lifetime2 = 0;
            if (var2Lifetime3 < this.field_a &&
              var3Lifetime3 < this.field_z &&
              this.field_I[var2Lifetime3][var3Lifetime3].field_n == 30) {
              var4Lifetime2 += 4;
            }
            if (var3Lifetime3 < this.field_z &&
              var2Lifetime3 > 0 &&
              this.field_I[var2Lifetime3 - 1][var3Lifetime3].field_n == 30) {
              var4Lifetime2 += 8;
            }
            if (var2Lifetime3 > 0 &&
              var3Lifetime3 > 0 &&
              30 == this.field_I[-1 + var2Lifetime3][-1 + var3Lifetime3].field_n) {
              var4Lifetime2++;
            }
            if (this.field_a > var2Lifetime3 &&
              var3Lifetime3 > 0 &&
              this.field_I[var2Lifetime3][-1 + var3Lifetime3].field_n == 30) {
              var4Lifetime2 += 2;
            }
            if (0 < var4Lifetime2) {
              this.field_j[var2Lifetime3][var3Lifetime3].field_n = 30;
              this.field_j[var2Lifetime3][var3Lifetime3].field_k = var4Lifetime2;
            }
          }
        }
    }

    final void a(ad param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == null) {
            return;
          }
          var3_int = (param0.field_s.field_x << 16) + param0.field_o;
          var4 = (param0.field_s.field_J << 16) + param0.field_r;
          this.field_b = -(128 * (var3_int - var4) >> 17) + 256;
          this.field_B = 208 - ((var4 + var3_int) * 64 >> 17);
          this.field_B = this.field_B + param0.field_k;
          this.a((byte) -89);
          if (param1 < 87) {
            this.field_b = -9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jo.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, aj param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = this.a(this.field_r, (byte) -95, this.field_q);
          if (this.field_i.field_h.field_a[this.field_q][this.field_r].e(-97) &&
            !this.field_i.field_h.a((byte) -101, this.field_i.field_n, this.field_q, this.field_r)) {
            this.field_m.a(param1.field_c + 1, param1.field_a + 1, 64);
          } else {
            this.field_g.a(param1.field_c + 1, 1 + param1.field_a, 64);
          }
          var3_int = this.field_i.field_L >> 2;
          var4 = 16777215;
          var5 = 192;
          if (param0 != 2024848226) {
            this.field_w = (kv[]) null;
          }
          var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a, param1.field_c + 128, 12175, var3_int, param1.field_a + 32, var5);
          var3_int = lw.a(5, 128 + param1.field_c, var4, param1.field_a + 32, 64 + param1.field_c, param0 - 2024836051, var3_int, param1.field_a + 64, var5);
          var3_int = lw.a(5, param1.field_c + 64, var4, param1.field_a + 64, param1.field_c, param0 - 2024836051, var3_int, 32 + param1.field_a, var5);
          var3_int = lw.a(5, param1.field_c, var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, param1.field_a, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("jo.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void c(int param0) {
        kv[][] stackIn_67_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_240_2 = 0;
        Object stackIn_241_0;
        boolean stackIn_241_3;
        int var2;
        int var3;
        int var4;
        int var5;
        aj var6;
        int var7;
        int var8;
        tia var8_ref_tia;
        int var9;
        int var10;
        int var11_int;
        t var11;
        int var12;
        int var13;
        tv var14_ref_tv;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        Object var24;
        aj var25;
        aj var27;
        aj var28;
        aj var29;
        aj var30;
        aj var31;
        aj var34;
        aj var35;
        ad var36;
        aj var37;
        aj var38;
        aj var39;
        aj var40;
        aga var41;
        aj var42;
        aj var43;
        aj var44;
        aj var45;
        Object var46;
        hd var46_ref;
        sfa var47;
        aj var48;
        aj var49;
        aj var50;
        int[] var57;
        int[][] var58;
        int[] var59;
        at var60;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        int var8Lifetime8;
        int var8Lifetime9;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var46 = null;
        var24 = null;
        var23 = BachelorFridge.field_y;
        var2 = 0;
        dg.c(0, 0, 640, 480, 2434341);
        var3 = (int)(Math.sin(0.5 * ((double)this.field_i.field_L / 10.0)) * 5.0);
        var4 = 0;
        var5 = 0;
        if (param0 != -32095) {
          this.a(-94, false, 99, 6, 27, -34, -41);
        }
        if (this.field_i.field_U > 0) {
          var5 = this.field_i.field_L % 128;
          var4 = this.field_i.field_L / 128 % (this.field_i.field_U + 1);
          var5 = (int)(Math.cos((double)var5 / 5.0 * 0.5) * 5.0);
        }
        var25 = this.a(this.field_r, (byte) 116, this.field_q);
        var6 = var25;
        this.a(var25, param0 + 32096);
        this.a(false, var25);
        for (var7 = 0; this.field_G.length > var7; var7++) {
          var57 = this.field_G[var7];
          var27 = this.a(var57[2], (byte) 120, var57[1]);
          var6 = var27;
          vc.field_d[var57[0]].e(var27.field_c, var27.field_a);
        }
        if (this.field_d > 0) {
          var28 = this.a(-3, (byte) -97, (this.field_i.field_h.field_z >> 1) - 1);
          var6 = var28;
          du.field_b.a(-42 + var28.field_c, -this.field_d + 106 + var28.field_a);
          var7Lifetime1 = var3;
          if (mk.field_p != -1) {
            var7Lifetime1 = -6 + (6 * mk.field_p / 640 + 6 * gd.field_m / 480);
          }
          lu.field_f.a(-16 + (var28.field_c + var7Lifetime1), var28.field_a - (-106 + this.field_d) + (var7Lifetime1 >> 1));
        }
        this.field_k.b(this, param0 ^ 18776);
        this.field_k.a(this, (byte) 117);
        for (var7Lifetime2 = 0; this.field_a > var7Lifetime2; var7Lifetime2++) {
          for (var8 = 0; this.field_z > var8; var8++) {
            if (this.field_i.field_h.a(var7Lifetime2, 120, this.field_i.field_n, var8) &&
              this.field_i.field_h.field_a[var7Lifetime2][var8].e(-111)) {
              var29 = this.a(var8, (byte) -98, var7Lifetime2);
              var6 = var29;
              this.field_w[this.field_i.field_n].a(var29.field_c, var29.field_a, 64 - var3 * 10);
            }
          }
        }
        for (var7Lifetime3 = 0; this.field_a > var7Lifetime3; var7Lifetime3++) {
          for (var8Lifetime1 = 0; var8Lifetime1 < this.field_z; var8Lifetime1++) {
            if (this.field_I[var7Lifetime3][var8Lifetime1].field_n == 22) {
              var31 = this.a(var8Lifetime1, (byte) 65, var7Lifetime3);
              var6 = var31;
              if (this.field_i.field_h.field_E != 1) {
                if (this.field_i.field_h.field_E == 2) {
                  this.field_k.field_b[95].a(var31.field_c, var31.field_a - 64);
                } else {
                  if (this.field_i.field_h.field_E == 0) {
                    this.field_k.field_b[95].a(var31.field_c, var31.field_a - 64);
                  }
                }
              } else {
                this.field_k.field_b[95].a(var31.field_c, var31.field_a - 64);
              }
            } else {
              if (39 == this.field_I[var7Lifetime3][var8Lifetime1].field_n) {
                var30 = this.a(var8Lifetime1, (byte) -90, var7Lifetime3);
                var6 = var30;
                ip.field_f[1].e(var30.field_c + 32, var30.field_a - 32);
              }
            }
          }
        }
        if (this.field_i.field_h.field_o == 2) {
          var58 = this.field_i.field_h.field_i;
          for (var8Lifetime2 = 0; var8Lifetime2 < var58.length; var8Lifetime2++) {
            var59 = var58[var8Lifetime2];
            this.b(var59[0], (byte) 80, var59[1]);
          }
        }
        for (var7Lifetime4 = 0; this.field_a > var7Lifetime4; var7Lifetime4++) {
          for (var8Lifetime3 = 0; var8Lifetime3 < this.field_z; var8Lifetime3++) {
            if (this.field_i.field_h.field_a[var7Lifetime4][var8Lifetime3].field_m &&
              !this.field_i.field_h.field_a[var7Lifetime4][var8Lifetime3].field_d) {
              var9 = od.field_w[this.field_i.field_h.field_a[var7Lifetime4][var8Lifetime3].field_n].field_f;
              var34 = this.a(var8Lifetime3, (byte) -100, var7Lifetime4);
              var6 = var34;
              if (var9 != -1) {
                nk.a(this.field_y, 40 + var34.field_c, var34.field_a + 16, 38, 24);
                stackIn_67_0 = ve.field_m;
                if (var9 < 4) {
                  stackIn_68_1 = var9;
                } else {
                  stackIn_68_1 = var9 - 4;
                }
                ((kv) (Object) stackIn_67_0[stackIn_68_1][(this.field_i.field_L >> 2) % 25]).e(44 + var34.field_c, -var3 + var34.field_a - 4);
              }
            }
          }
        }
        for (var7Lifetime5 = 0; var7Lifetime5 < this.field_z; var7Lifetime5++) {
          for (var8Lifetime4 = 0; this.field_a > var8Lifetime4; var8Lifetime4++) {
            var35 = this.a(var7Lifetime5, (byte) -100, var8Lifetime4);
            var6 = var35;
            if (null != this.field_i.field_D[var8Lifetime4][var7Lifetime5]) {
              this.field_i.field_D[var8Lifetime4][var7Lifetime5].a(var35.field_a, 0, var35.field_c);
            }
          }
        }
        this.b(24731);
        var36 = this.field_i.field_P;
        if (var36 != null &&
          this.field_i.field_l) {
          var8Lifetime5 = 1;
          var9Lifetime1 = 0;
          var10 = 0;
          var12 = 0;
          var11_int = 0;
          var13 = var36.field_s.f((byte) 122);
          var14_ref_tv = (tv) (ur.field_e[this.field_i.field_Z.field_g]);
          if (hl.a((byte) 109, this.field_i.field_Z.field_g)) {
            var13 = var13 << 1;
            var13 = var13 + var14_ref_tv.field_l;
          }
          stackIn_88_0 = (var36.field_s.field_y != 32) ? 0 : 1;
          var15 = stackIn_88_0;
          var16 = var36.field_s.field_x;
          var17 = var36.field_s.field_J;
          if (var15 == 0 &&
            this.field_i.field_h.field_E == 0 &&
            !this.field_i.field_h.field_a[var16][var17].field_i) {
            var13 = var13 >> 1;
          }
          while (var8Lifetime5 < var13 + 1) {
            boolean decompiledFrameRemainder3 = true;
            if (var11_int == 0 &&
              var16 - var8Lifetime5 >= 0) {
              if (var15 == 0 && (!this.field_I[var16 - var8Lifetime5][var17].e(-53) ||
                this.field_i.field_h.a((byte) -98, this.field_i.field_n, -var8Lifetime5 + var16, var17))) {
                var11_int = 1;
              } else {
                var37 = this.a(var17, (byte) -100, var16 - var8Lifetime5);
                var6 = var37;
                this.field_u.a(var37.field_c, var37.field_a, -(10 * var3) + 128);
                if (((-var8Lifetime5 + var16 == this.field_q)) &&
                  ((var17 == this.field_r))) {
                  var2 = 1;
                  this.a(true, var37, 18503);
                }
              }
              decompiledFrameRemainder3 = false;
            }
            else {
              var11_int = 1;
            }
            boolean decompiledFrameRemainder2 = true;
            if (var9Lifetime1 == 0 &&
              -var8Lifetime5 + var17 >= 0) {
              if (var15 == 0 && (!this.field_I[var16][-var8Lifetime5 + var17].e(-30) ||
                this.field_i.field_h.a((byte) -127, this.field_i.field_n, var16, -var8Lifetime5 + var17))) {
                var9Lifetime1 = 1;
              } else {
                var38 = this.a(var17 - var8Lifetime5, (byte) -100, var16);
                var6 = var38;
                this.field_u.a(var38.field_c, var38.field_a, 128 - 10 * var3);
                if (((this.field_q == var16)) &&
                  ((this.field_r == var17 - var8Lifetime5))) {
                  this.a(true, var38, 18503);
                  var2 = 1;
                }
              }
              decompiledFrameRemainder2 = false;
            }
            else {
              var9Lifetime1 = 1;
            }
            boolean decompiledFrameRemainder1 = true;
            if (var12 == 0 &&
              -1 + this.field_a >= var8Lifetime5 + var16) {
              if (var15 == 0 && (!this.field_I[var16 + var8Lifetime5][var17].e(param0 + 32003) ||
                this.field_i.field_h.a((byte) -100, this.field_i.field_n, var8Lifetime5 + var16, var17))) {
                var12 = 1;
              } else {
                var39 = this.a(var17, (byte) -118, var16 + var8Lifetime5);
                var6 = var39;
                this.field_u.a(var39.field_c, var39.field_a, -(10 * var3) + 128);
                if (((var16 + var8Lifetime5 == this.field_q)) &&
                  ((var17 == this.field_r))) {
                  this.a(true, var39, param0 + 50598);
                  var2 = 1;
                }
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              var12 = 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var10 == 0 &&
              this.field_z - 1 >= var8Lifetime5 + var17 && (var15 != 0 ||
              this.field_I[var16][var17 + var8Lifetime5].e(-78) &&
              !this.field_i.field_h.a((byte) -121, this.field_i.field_n, var16, var17 + var8Lifetime5))) {
              var40 = this.a(var17 + var8Lifetime5, (byte) 83, var16);
              var6 = var40;
              this.field_u.a(var40.field_c, var40.field_a, -(10 * var3) + 128);
              if (((this.field_q == var16)) &&
                ((var17 + var8Lifetime5 == this.field_r))) {
                var2 = 1;
                this.a(true, var40, 18503);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var10 = 1;
            }
            var8Lifetime5++;
          }
        }
        if (var36 != null &&
          this.field_i.field_ab) {
          var41 = var36.field_s;
          var6 = this.a(var41.field_J, (byte) -117, var41.field_x);
          var9Lifetime2 = var41.field_m[this.field_i.field_db];
          var10Lifetime1 = var41.field_o.field_g.field_b[var9Lifetime2];
          var11 = (t) (al.a(-83, var10Lifetime1));
          var12Lifetime1 = var41.c(87, var10Lifetime1);
          var13Lifetime1 = var11.field_w;
          var14 = 0;
          var15Lifetime1 = -1;
          var16Lifetime1 = 0;
          var18 = 0;
          var17Lifetime1 = 0;
          var20 = 0;
          var19 = 0;
          var21 = var36.field_s.field_x;
          var22 = var36.field_s.field_J;
          while (1 + var12Lifetime1 > var13Lifetime1) {
            if (var19 == 0 &&
              var21 - var13Lifetime1 >= 0) {
              var42 = this.a(var22, (byte) 97, -var13Lifetime1 + var21);
              var6 = var42;
              if (var21 - var13Lifetime1 == this.field_q &&
                var22 == this.field_r) {
                var14 = 1;
                var16Lifetime1 = var13Lifetime1;
                var2 = 1;
                var15Lifetime1 = 2;
              }
              this.field_C.a(var42.field_c, var42.field_a, 64 - var3 * 10);
            } else {
              var19 = 1;
            }
            if (var17Lifetime1 == 0 &&
              0 <= -var13Lifetime1 + var22) {
              var43 = this.a(var22 - var13Lifetime1, (byte) 32, var21);
              var6 = var43;
              if (var21 == this.field_q &&
                this.field_r == -var13Lifetime1 + var22) {
                var14 = 1;
                var16Lifetime1 = var13Lifetime1;
                var15Lifetime1 = 1;
                var2 = 1;
              }
              this.field_C.a(var43.field_c, var43.field_a, -(10 * var3) + 64);
            } else {
              var17Lifetime1 = 1;
            }
            if (var20 == 0 &&
              this.field_a - 1 >= var13Lifetime1 + var21) {
              var44 = this.a(var22, (byte) 50, var21 + var13Lifetime1);
              var6 = var44;
              if (this.field_q == var13Lifetime1 + var21 &&
                var22 == this.field_r) {
                var16Lifetime1 = var13Lifetime1;
                var15Lifetime1 = 4;
                var14 = 1;
                var2 = 1;
              }
              this.field_C.a(var44.field_c, var44.field_a, -(var3 * 10) + 64);
            } else {
              var20 = 1;
            }
            if (var18 == 0 &&
              -1 + this.field_z >= var22 + var13Lifetime1) {
              var45 = this.a(var13Lifetime1 + var22, (byte) 104, var21);
              var6 = var45;
              if (this.field_q == var21 &&
                var22 + var13Lifetime1 == this.field_r) {
                var15Lifetime1 = 3;
                var2 = 1;
                var16Lifetime1 = var13Lifetime1;
                var14 = 1;
              }
              this.field_C.a(var45.field_c, var45.field_a, -(10 * var3) + 64);
            } else {
              var18 = 1;
            }
            var13Lifetime1++;
          }
          if (var14 != 0) {
            if (2 == var11.field_p) {
              var16Lifetime1++;
            }
            if (var11.field_p == 3) {
              var16Lifetime1++;
            }
            this.a(var15Lifetime1, true, var11.field_r, var16Lifetime1, var36.field_s.field_x, var36.field_s.field_J, var5);
            this.a(true, var6, 18503);
          }
        }
        if (var36 != null &&
          this.field_i.field_w) {
          var46_ref = (hd) (ur.field_e[this.field_i.field_Z.field_g]);
          if (0 != var46_ref.c(0)) {
            if (2 != var46_ref.c(param0 ^ -32095)) {
              if (3 == var46_ref.c(0)) {
                if (this.field_q != -1 &&
                  -1 != this.field_r &&
                  null != this.field_i.field_h.field_a[this.field_q][this.field_r].field_l) {
                  this.a(true, var6, param0 + 50598);
                  var2 = 1;
                }
                if (this.field_q != -1 &&
                  this.field_r != -1 &&
                  93 == var46_ref.field_j &&
                  null != this.field_i.field_h.c(this.field_q, this.field_r, 121) &&
                  this.field_i.field_h.c(this.field_q, this.field_r, 116).field_A) {
                  var2 = 1;
                  this.a(true, var6, 18503);
                }
              }
            } else {
              if (this.field_q == 1 + var36.field_s.field_x &&
                var36.field_s.field_J == this.field_r) {
                var2 = 1;
                this.a(true, var6, 18503);
              } else {
                if (this.field_q == var36.field_s.field_x - 1 &&
                  this.field_r == var36.field_s.field_J) {
                  var2 = 1;
                  this.a(true, var6, 18503);
                } else {
                  if (var36.field_s.field_x == this.field_q &&
                    1 + var36.field_s.field_J == this.field_r) {
                    var2 = 1;
                    this.a(true, var6, 18503);
                  } else {
                    if (var36.field_s.field_x == this.field_q &&
                      -1 + var36.field_s.field_J == this.field_r) {
                      this.a(true, var6, 18503);
                      var2 = 1;
                    }
                  }
                }
              }
            }
          } else {
            if (this.field_q != -1 &&
              this.field_r != -1 &&
              130 == var46_ref.field_j &&
              this.field_i.field_h.field_a[this.field_q][this.field_r].field_l == null &&
              this.field_i.field_h.field_a[this.field_q][this.field_r].e(-52)) {
              var2 = 1;
              this.a(true, var6, 18503);
            } else {
              if (this.field_q != -1 &&
                this.field_r != -1 &&
                var46_ref.field_j != 130) {
                this.a(true, var6, 18503);
                var2 = 1;
              }
            }
          }
        }
        for (var8Lifetime6 = 0; this.field_i.field_Y.length > var8Lifetime6; var8Lifetime6++) {
          var47 = this.field_i.field_Y[var8Lifetime6];
          if (var47 != null) {
            stackIn_240_1 = -64;
            stackIn_240_2 = var5;
            if (var8Lifetime6 != var4) {
              stackIn_241_0 = this;
              stackIn_241_3 = false;
            } else {
              stackIn_241_0 = this;
              stackIn_241_3 = true;
            }
            this.a(stackIn_240_1, stackIn_240_2, stackIn_241_3, var47);
            this.a(true, var47);
          }
        }
        if (null != this.field_i.field_Z) {
          this.a(true, this.field_i.field_Z);
        }
        if (this.field_q != -1 &&
          -1 != this.field_r) {
          if (!this.field_i.field_J &&
            null == this.field_i.field_Z &&
            0 != this.field_i.field_M) {
            this.a(2024848226, var6);
          } else {
            if (this.field_i.field_Z != null &&
              var2 == 0) {
              this.a(false, var6, param0 + 50598);
            }
          }
        }
        this.a((byte) -116, var6);
        if (3 == this.field_i.field_h.field_o) {
          for (var8Lifetime7 = 0; this.field_i.field_h.field_c.length > var8Lifetime7; var8Lifetime7++) {
            this.b(var8Lifetime7, -101);
          }
        }
        for (var8Lifetime8 = 0; var8Lifetime8 < this.field_i.field_h.field_z; var8Lifetime8++) {
          for (var9Lifetime3 = 0; var9Lifetime3 < this.field_i.field_h.field_B; var9Lifetime3++) {
            var48 = this.a(var9Lifetime3, (byte) 124, var8Lifetime8);
            if (this.field_i.field_h.field_a[var8Lifetime8][var9Lifetime3].field_d) {
              co.field_b[4].a(var48.field_c, -64 + (var48.field_a + (var3 >> 1)), 192);
            }
          }
        }
        for (var8Lifetime9 = 0; this.field_z > var8Lifetime9; var8Lifetime9++) {
          for (var9Lifetime4 = 0; var9Lifetime4 < this.field_a; var9Lifetime4++) {
            var49 = this.a(var8Lifetime9, (byte) 115, var9Lifetime4);
            if (this.field_i.field_D[var9Lifetime4][var8Lifetime9] != null) {
              this.field_i.field_D[var9Lifetime4][var8Lifetime9].a(var49.field_a, true, var49.field_c);
            }
          }
        }
        var8_ref_tia = (tia) (this.field_i.field_fb.b((byte) 90));
        while (var8_ref_tia != null) {
          var50 = this.a((byte) 126, var8_ref_tia.field_h);
          var8_ref_tia.a(var50.field_a + 32, 25415, 64 + var50.field_c);
          var8_ref_tia = (tia) (this.field_i.field_fb.c(0));
        }
        var60 = (at) (this.field_i.field_j.b((byte) 90));
        while (var60 != null) {
          var60.c(-59);
          var60 = (at) (this.field_i.field_j.c(0));
        }
    }

    final aj b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        aj var4;
        int var7;
        sfa var8;
        var7 = BachelorFridge.field_y;
        if (param1 != 9) {
          var8 = (sfa) null;
          this.a(true, (sfa) null);
        }
        for (var5 = -1 + this.field_z; var5 >= 0; var5--) {
          for (var6 = -1 + this.field_a; var6 >= 0; var6--) {
            var4 = this.a(var5, (byte) 100, var6);
            if (this.field_p.a(var4.field_c, var4.field_a, param0, param2)) {
              return new aj(var6, var5);
            }
          }
        }
        return null;
    }

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var5;
        aj var6;
        aj var7;
        var5 = BachelorFridge.field_y;
        if (param0 <= 65) {
          var6 = (aj) null;
          this.a(true, (aj) null);
        }
        this.field_h = -1;
        this.field_s = -1;
        this.field_q = -1;
        this.field_r = -1;
        for (var3 = 0; var3 < this.field_a; var3++) {
          for (var4 = 0; var4 < this.field_z; var4++) {
            var7 = this.a(var4, (byte) 52, var3);
            if (lf.field_c != 0 &&
              this.field_p.a(var7.field_c, var7.field_a, nfa.field_a, jc.field_r)) {
              this.field_s = var3;
              this.field_h = var4;
            }
            if (this.field_p.a(var7.field_c, var7.field_a, mk.field_p, gd.field_m)) {
              this.field_q = var3;
              this.field_r = var4;
            }
          }
        }
        if (this.field_q != -1) {
          if (-1 != this.field_r) {
            if (this.field_i.field_h.field_a[this.field_q][this.field_r].field_n == 21) {
              uca.a(27, (byte) 103);
            }
            if (22 == this.field_i.field_h.field_a[this.field_q][this.field_r].field_n) {
              uca.a(28, (byte) 124);
            }
            if (this.field_i.field_h.field_a[this.field_q][this.field_r].field_n == 6 ||
              this.field_i.field_h.field_a[this.field_q][this.field_r].field_n == 8 ||
              10 == this.field_i.field_h.field_a[this.field_q][this.field_r].field_n ||
              12 == this.field_i.field_h.field_a[this.field_q][this.field_r].field_n) {
              uca.a(26, (byte) 98);
            }
            if (-1 != this.field_F) {
              fieldTemp$0 = this.field_F + 1;
              this.field_F = this.field_F + 1;
              if (fieldTemp$0 >= 120) {
                this.field_F = -1;
              }
            }
          } else {
            if (-1 != this.field_F) {
              fieldTemp$1 = this.field_F + 1;
              this.field_F = this.field_F + 1;
              if (fieldTemp$1 >= 120) {
                this.field_F = -1;
              }
            }
          }
        } else {
          if (-1 != this.field_F) {
            fieldTemp$2 = this.field_F + 1;
            this.field_F = this.field_F + 1;
            if (fieldTemp$2 >= 120) {
              this.field_F = -1;
            }
          }
        }
    }

    private final void a(boolean param0, aj param1) {
        int var3_int = 0;
        int var4 = 0;
        aj var5 = null;
        aj var6 = null;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var13 = null;
        aj var14 = null;
        aj var15 = null;
        aj var16 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        aj var17 = null;
        aj var18 = null;
        aj var19 = null;
        aj var20 = null;
        aj var21 = null;
        aj var22 = null;
        aj var23 = null;
        aj var24 = null;
        aj var25 = null;
        aj var26 = null;
        aj var27 = null;
        aj var28 = null;
        aj var29 = null;
        aj var30 = null;
        aj var31 = null;
        aj var32 = null;
        aj var33 = null;
        aj var34 = null;
        aj var35 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param0) {
            var5 = (aj) null;
            this.b((aj) null, -117, -116, -84);
          }
          var3_int = this.field_i.field_h.field_E;
          if (1 == var3_int) {
            for (var3_int = 0; 1 + this.field_a > var3_int; var3_int++) {
              var6 = this.a(this.field_z + 1, (byte) 27, var3_int);
              param1 = var6;
              if (var3_int != 0) {
                as.field_a[5 * this.field_i.field_h.field_E + 2].a(var6.field_c + 14, var6.field_a + 48, 128);
              } else {
                as.field_a[1 + 5 * this.field_i.field_h.field_E].a(var6.field_c + 14, 48 + var6.field_a, 128);
              }
            }
            for (var3_int = 0; this.field_z + 1 > var3_int; var3_int++) {
              var7 = this.a(var3_int, (byte) -116, this.field_a + 1);
              param1 = var7;
              if (var3_int == 0) {
                ls.field_a[5 * this.field_i.field_h.field_E + 1].a(var7.field_c + 14, 48 + var7.field_a, 128);
              } else {
                ls.field_a[2 + this.field_i.field_h.field_E * 5].a(var7.field_c + 14, var7.field_a + 48, 128);
              }
            }
            var8 = this.a(this.field_z + 1, (byte) -114, 1 + this.field_a);
            ls.field_a[5 * this.field_i.field_h.field_E + 3].a(14 + var8.field_c, 48 + var8.field_a, 128);
            var9 = this.a(-1, (byte) -114, this.field_a + 1);
            ls.field_a[5 * this.field_i.field_h.field_E].a(14 + var9.field_c, var9.field_a + 48, 128);
            var10 = this.a(-1, (byte) 32, this.field_a);
            ls.field_a[4 + this.field_i.field_h.field_E * 5].a(14 + var10.field_c, var10.field_a + 48, 128);
            var11 = this.a(-1, (byte) -123, -1 + this.field_a);
            ls.field_a[5 * this.field_i.field_h.field_E + 4].a(14 + var11.field_c, 48 + var11.field_a, 128);
            var12 = this.a(0, (byte) -99, this.field_a);
            ls.field_a[2 + 5 * this.field_i.field_h.field_E].a(4 + var12.field_c + 14, var12.field_a + 50, 128);
            var13 = this.a(1 + this.field_z, (byte) -111, -1);
            as.field_a[this.field_i.field_h.field_E * 5].a(14 + var13.field_c, var13.field_a + 48, 128);
            var14 = this.a(this.field_z, (byte) -113, -1);
            as.field_a[4 + 5 * this.field_i.field_h.field_E].a(var14.field_c + 14, 48 + var14.field_a, 128);
            var15 = this.a(this.field_z - 1, (byte) -123, -1);
            as.field_a[this.field_i.field_h.field_E * 5 + 4].a(14 + var15.field_c, 48 + var15.field_a, 128);
            var16 = this.a(this.field_z, (byte) 105, 0);
            param1 = var16;
            as.field_a[5 * this.field_i.field_h.field_E + 2].a(14 + var16.field_c - 4, var16.field_a + 50, 128);
            return;
          }
          if (var3_int == 0) {
            for (var3_int = -1; this.field_a + 1 > var3_int; var3_int++) {
              var17 = this.a(this.field_z + 1, (byte) -110, var3_int);
              param1 = var17;
              if (-1 == var3_int) {
                as.field_a[1 + this.field_i.field_h.field_E * 5].a(14 + var17.field_c, var17.field_a + 48, 128);
              } else {
                as.field_a[2 + this.field_i.field_h.field_E * 5].a(var17.field_c + 14, 48 + var17.field_a, 128);
              }
            }
            for (var3_int = -5; var3_int < -1; var3_int++) {
              var18 = this.a(this.field_z + 1, (byte) 74, var3_int);
              param1 = var18;
              as.field_a[2 + 5 * this.field_i.field_h.field_E].a(30 + var18.field_c, 40 + var18.field_a, 128);
            }
            for (var3_int = 0; this.field_z + 1 > var3_int; var3_int++) {
              var19 = this.a(var3_int, (byte) 72, this.field_a + 1);
              param1 = var19;
              if (var3_int == 0) {
                ls.field_a[1 + 5 * this.field_i.field_h.field_E].a(14 + var19.field_c, 48 + var19.field_a, 128);
              } else {
                ls.field_a[2 + this.field_i.field_h.field_E * 5].a(14 + var19.field_c, 48 + var19.field_a, 128);
              }
            }
            var20 = this.a(this.field_z + 1, (byte) 70, this.field_a + 1);
            ls.field_a[5 * this.field_i.field_h.field_E + 3].a(var20.field_c + 14, var20.field_a + 48, 128);
            var21 = this.a(-1, (byte) 124, 1 + this.field_a);
            ls.field_a[this.field_i.field_h.field_E * 5].a(var21.field_c + 14, var21.field_a + 48, 128);
            var22 = this.a(-1, (byte) 58, this.field_a);
            ls.field_a[4 + 5 * this.field_i.field_h.field_E].a(var22.field_c + 14, 48 + var22.field_a, 128);
            var23 = this.a(-1, (byte) -95, -1 + this.field_a);
            ls.field_a[this.field_i.field_h.field_E * 5 + 4].a(var23.field_c + 14, 48 + var23.field_a, 128);
            var24 = this.a(0, (byte) 95, this.field_a);
            ls.field_a[this.field_i.field_h.field_E * 5 + 2].a(14 + var24.field_c + 4, 50 + var24.field_a, 128);
            param1 = this.a(1 + this.field_z, (byte) -104, -2);
            param1 = this.a(this.field_z, (byte) 70, -1);
            param1 = this.a(this.field_z - 1, (byte) -122, -1);
            param1 = this.a(this.field_z, (byte) 51, 0);
            return;
          }
          if (var3_int == 2) {
            for (var3_int = 0; var3_int < 1 + this.field_a; var3_int++) {
              var25 = this.a(this.field_z + 1, (byte) -110, var3_int);
              param1 = var25;
              if (var3_int == 0) {
                as.field_a[this.field_i.field_h.field_E * 5 + 1].a(16 + var25.field_c, var25.field_a - 32, 128);
              } else {
                as.field_a[2 + this.field_i.field_h.field_E * 5].a(16 + var25.field_c, var25.field_a - 32, 128);
              }
            }
            for (var3_int = 0; this.field_z + 1 > var3_int; var3_int++) {
              var26 = this.a(var3_int, (byte) -112, this.field_a + 1);
              param1 = var26;
              if (0 == var3_int) {
                ls.field_a[5 * this.field_i.field_h.field_E + 1].a(var26.field_c + 16, -32 + var26.field_a, 128);
              } else {
                ls.field_a[2 + this.field_i.field_h.field_E * 5].a(16 + var26.field_c, var26.field_a - 32, 128);
              }
            }
            var27 = this.a(1 + this.field_z, (byte) -108, 1 + this.field_a);
            ls.field_a[3 + 5 * this.field_i.field_h.field_E].a(var27.field_c + 16, -32 + var27.field_a, 128);
            var28 = this.a(-1, (byte) -114, this.field_a + 1);
            ls.field_a[5 * this.field_i.field_h.field_E].a(var28.field_c + 16, var28.field_a - 32, 128);
            var29 = this.a(-1, (byte) 42, this.field_a);
            ls.field_a[this.field_i.field_h.field_E * 5 + 4].a(var29.field_c + 16, -32 + var29.field_a, 128);
            var30 = this.a(-1, (byte) 101, this.field_a - 1);
            ls.field_a[5 * this.field_i.field_h.field_E + 4].a(16 + var30.field_c, -32 + var30.field_a, 128);
            var31 = this.a(0, (byte) -111, this.field_a);
            ls.field_a[5 * this.field_i.field_h.field_E + 2].a(var31.field_c + 16, -32 + var31.field_a, 128);
            var32 = this.a(this.field_z + 1, (byte) 88, -1);
            as.field_a[this.field_i.field_h.field_E * 5].a(var32.field_c + 16, -32 + var32.field_a, 128);
            var33 = this.a(this.field_z, (byte) 71, -1);
            as.field_a[4 + 5 * this.field_i.field_h.field_E].a(16 + var33.field_c, -32 + var33.field_a, 128);
            var34 = this.a(-1 + this.field_z, (byte) -95, -1);
            as.field_a[this.field_i.field_h.field_E * 5 + 4].a(16 + var34.field_c, -32 + var34.field_a, 128);
            var35 = this.a(this.field_z, (byte) -96, 0);
            param1 = var35;
            as.field_a[2 + 5 * this.field_i.field_h.field_E].a(16 + var35.field_c, var35.field_a - 32, 128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("jo.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final aj a(int param0, byte param1, int param2) {
        int var4 = 9 % ((-31 - param1) / 58);
        this.b(dp.field_l, param0, -3613, param2);
        return dp.field_l;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -57) {
          return;
        }
        this.field_b = 256 - (128 * (param2 - param1) >> 1);
        this.field_B = 208 - ((param1 + param2) * 64 >> 1);
        this.a((byte) -127);
    }

    final void a(int param0, int param1) {
        if (param0 != -1907) {
          return;
        }
        this.field_b = this.field_b + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
        this.field_B = this.field_B + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
    }

    jo(gj param0) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var10 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime1Lifetime1;
        this.field_d = 0;
        this.field_F = -1;
        try {
          this.field_i = param0;
          this.field_I = this.field_i.field_h.field_a;
          this.field_k = ida.a(0, (vr) null, this.field_i.field_h.field_E);
          hga.field_U.a((byte) 127);
          this.field_z = this.field_i.field_h.field_B;
          this.field_a = this.field_i.field_h.field_z;
          this.field_j = new bq[this.field_a + 2][2 + this.field_z];
          for (var2_int = 0; this.field_a + 2 > var2_int; var2_int++) {
            for (var3 = 0; var3 < 2 + this.field_z; var3++) {
              this.field_j[var2_int][var3] = new bq(0);
            }
          }
          this.a(true);
          this.c((byte) -124);
          if (this.field_i.field_n < 0) {
            this.a((byte) -57, this.field_z >> 1, this.field_a >> 1);
          } else {
            var2_intLifetime1 = 0;
            var3 = 0;
            var10 = this.field_i.field_h.field_L.b(this.field_i.field_n, -60);
            var3 = var10[0][1];
            var2_intLifetime1Lifetime1 = var10[0][0];
            this.a((byte) -57, var3, var2_intLifetime1Lifetime1);
          }
          this.a(-22048);
          this.field_G = new int[4][3];
          for (var2_intLifetime2 = 0; var2_intLifetime2 < 4; var2_intLifetime2++) {
            var3 = kla.a(9, this.field_i.field_h.field_w, -2147483648);
            var4 = 0;
            var5 = 0;
            if (var2_intLifetime2 != 0) {
              if (var2_intLifetime2 == 1) {
                var4 = this.field_a + 3;
                var5 = kla.a(this.field_z, this.field_i.field_h.field_w, -2147483648);
              } else {
                if (2 != var2_intLifetime2) {
                  if (var2_intLifetime2 == 3) {
                    var4 = kla.a(this.field_a, this.field_i.field_h.field_w, -2147483648);
                    var5 = this.field_z + 3;
                  }
                } else {
                  var4 = kla.a(this.field_a, this.field_i.field_h.field_w, -2147483648);
                  var5 = -3;
                }
              }
            } else {
              var5 = kla.a(this.field_z, this.field_i.field_h.field_w, -2147483648);
              var4 = -3;
            }
            this.field_G[var2_intLifetime2] = new int[]{var3, var4, var5};
          }
          this.field_v = a.a(12889, 64, 16763049, 46335);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("jo.<init>(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
