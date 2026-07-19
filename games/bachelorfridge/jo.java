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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-1, 64 * (param3 - param1) + this.field_b, this.field_B - -((param1 + param3) * 32));
              if (param2 == -3613) {
                break L1;
              } else {
                this.b(11, 13);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jo.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, aj param1, ad param2) {
        if (!(param2 != null)) {
            return;
        }
        this.a(param1, (param2.field_s.field_J << 451480816) + param2.field_r, param2.field_o + (param2.field_s.field_x << 802962640), -58);
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_1_0 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.field_u.a(param1.field_c + 1, 1 + param1.field_a, 64);
              var3_int = this.field_i.field_L >> -2041137534;
              stackOut_0_0 = this.field_v;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if ((this.field_i.field_L % 128 ^ -1) <= -65) {
                stackOut_2_0 = (int[]) ((Object) stackIn_2_0);
                stackOut_2_1 = 127 - this.field_i.field_L % 128;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (int[]) ((Object) stackIn_1_0);
                stackOut_1_1 = this.field_i.field_L % 128;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            var4 = stackIn_3_0[stackIn_3_1];
            var5 = 255;
            var3_int = lw.a(5, param1.field_c + 64, var4, -1 + param1.field_a, 128 + param1.field_c, 12175, var3_int, param1.field_a + 32, var5);
            var3_int = lw.a(5, 128 + param1.field_c, var4, 32 + param1.field_a, param1.field_c - -64, 12175, var3_int, param1.field_a - -64, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, param1.field_a - -64, param1.field_c, 12175, var3_int, param1.field_a - -32, var5);
            var3_int = lw.a(5, param1.field_c, var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, param1.field_a, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, 1 + (-1 + param1.field_a), -1 + param1.field_c + 128, param0 + -13268, var3_int, param1.field_a - -32, var5);
            var3_int += 2;
            var3_int = lw.a(5, -1 + (param1.field_c + 128), var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, -1 + param1.field_a + 64, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, 64 + (param1.field_a - 1), 1 + param1.field_c, param0 ^ 19692, var3_int, param1.field_a + 32, var5);
            var3_int += 2;
            var3_int = lw.a(5, param1.field_c + 1, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, 1 + param1.field_a, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a + 2, -2 + (128 + param1.field_c), param0 ^ 19692, var3_int, 32 + param1.field_a, var5);
            var3_int += 4;
            var3_int = lw.a(5, 128 + param1.field_c - 2, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, param1.field_a - -62, var5);
            if (param0 == 25443) {
              var3_int = lw.a(5, param1.field_c + 64, var4, -2 + (64 + param1.field_a), param1.field_c + 2, 12175, var3_int, 32 + param1.field_a, var5);
              var3_int += 4;
              var3_int = lw.a(5, param1.field_c + 2, var4, 32 + param1.field_a, 64 + param1.field_c, 12175, var3_int, 2 + param1.field_a, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("jo.K(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final aj a(byte param0, ad param1) {
        RuntimeException var3 = null;
        aj stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_3_0 = null;
        aj stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 77) {
              this.a(-114, dp.field_l, param1);
              stackOut_3_0 = dp.field_l;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (aj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("jo.L(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        int var10 = 0;
        int[][] var13 = null;
        int[] var14 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          if (this.field_I[param2][param4].field_n == 20) {
            var6 = -1;
            var13 = this.field_i.field_h.field_i;
            var8 = 0;
            L1: while (true) {
              if (var8 >= var13.length) {
                if (-1 == var6) {
                  break L0;
                } else {
                  this.field_p.e(param1, param3, this.field_i.c(var6, 2271));
                  break L0;
                }
              } else {
                var14 = var13[var8];
                if (var14[0] == param2) {
                  if (var14[1] == param4) {
                    var6 = var14[2];
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == -1) {
            break L2;
          } else {
            this.field_p = (kv) null;
            break L2;
          }
        }
        int discarded$1 = this.field_i.a(-18254, param4, param2);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        aj var28 = null;
        aj var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        L0: {
          var19 = BachelorFridge.field_y;
          param3--;
          var30 = haa.b(1, param2, param0);
          var10 = 17;
          var11 = 17;
          var12 = var10 - 1 >> 1815948193;
          var13 = -1 + var11 >> -546677471;
          if (param1) {
            break L0;
          } else {
            this.field_r = 120;
            break L0;
          }
        }
        var31 = new int[var10][var11];
        var15 = 0;
        L1: while (true) {
          if (var10 <= var15) {
            var15 = 0;
            L2: while (true) {
              if (var15 >= var10) {
                return;
              } else {
                var20 = 0;
                var16 = var20;
                L3: while (true) {
                  if (var11 <= var20) {
                    var15++;
                    continue L2;
                  } else {
                    if (var31[var15][var20] != 0) {
                      L4: {
                        var17 = param4 + var15 + -var12;
                        var18 = var20 + -var13 + param5;
                        if ((param0 ^ -1) != -2) {
                          if (param0 != 3) {
                            if (-5 == (param0 ^ -1)) {
                              var17 = var17 + param3;
                              break L4;
                            } else {
                              if (param0 == 2) {
                                var17 = var17 - param3;
                                break L4;
                              } else {
                                if (-1 >= (var17 ^ -1)) {
                                  if (-1 >= (var18 ^ -1)) {
                                    if (this.field_a > var17) {
                                      if (var18 < this.field_z) {
                                        var28 = this.a(var18, (byte) -108, var17);
                                        this.field_g.a(1 + var28.field_c, 1 + var28.field_a, 128 + -(param6 * 20));
                                        var20++;
                                        continue L3;
                                      } else {
                                        var20++;
                                        continue L3;
                                      }
                                    } else {
                                      var20++;
                                      continue L3;
                                    }
                                  } else {
                                    var20++;
                                    continue L3;
                                  }
                                } else {
                                  var20++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            var18 = var18 + param3;
                            break L4;
                          }
                        } else {
                          var18 = var18 - param3;
                          break L4;
                        }
                      }
                      if (-1 >= (var17 ^ -1)) {
                        if (-1 >= (var18 ^ -1)) {
                          if (this.field_a > var17) {
                            if (var18 < this.field_z) {
                              var29 = this.a(var18, (byte) -108, var17);
                              this.field_g.a(1 + var29.field_c, 1 + var29.field_a, 128 + -(param6 * 20));
                              var20++;
                              continue L3;
                            } else {
                              var20++;
                              continue L3;
                            }
                          } else {
                            var20++;
                            continue L3;
                          }
                        } else {
                          var20++;
                          continue L3;
                        }
                      } else {
                        var20++;
                        continue L3;
                      }
                    } else {
                      var20++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var16 = 0;
            L5: while (true) {
              if (var11 <= var16) {
                var15++;
                continue L1;
              } else {
                if ((var30[var15][var16] ^ -1) == -2) {
                  var31[var15][var16] = 1;
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, sfa param3) {
        oha discarded$1 = null;
        RuntimeException var5 = null;
        hia var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
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
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -64) {
                break L1;
              } else {
                this.a((byte) 70);
                break L1;
              }
            }
            L2: {
              if (!(param3 instanceof hia)) {
                break L2;
              } else {
                var6 = (hia) ((Object) param3);
                var7 = this.field_i.field_G[var6.field_h.field_f].field_s;
                discarded$1 = al.a(param0 + -60, var6.field_g);
                var21 = new aj(this.a(var7.field_J, (byte) -96, var7.field_x));
                if (param2) {
                  var8 = (5 + -param1) * 4;
                  var9 = -44;
                  L3: while (true) {
                    if (-45 >= (var9 ^ -1)) {
                      var29 = haa.b(param0 ^ -63, var7.d(125, var6.field_g), var6.field_j);
                      var10 = 17;
                      var11 = 17;
                      var12 = -1 + var10 >> -770519647;
                      var13 = -1 + var11 >> -1000453759;
                      var30 = new int[var10][var11];
                      var15 = 0;
                      L4: while (true) {
                        if (var15 >= var10) {
                          var15 = 0;
                          L5: while (true) {
                            if (var15 >= var10) {
                              break L2;
                            } else {
                              var20 = 0;
                              var16 = var20;
                              L6: while (true) {
                                if (var11 <= var20) {
                                  var15++;
                                  continue L5;
                                } else {
                                  L7: {
                                    if (var30[var15][var20] != 0) {
                                      L8: {
                                        var17 = var7.field_x + -var12 + var15;
                                        var18 = var7.field_J - var13 - -var20;
                                        if (-2 == (var6.field_j ^ -1)) {
                                          var18 = var18 - var6.field_k;
                                          break L8;
                                        } else {
                                          if (-4 == (var6.field_j ^ -1)) {
                                            var18 = var18 + var6.field_k;
                                            break L8;
                                          } else {
                                            if (4 == var6.field_j) {
                                              var17 = var17 + var6.field_k;
                                              break L8;
                                            } else {
                                              if (-3 == (var6.field_j ^ -1)) {
                                                var17 = var17 - var6.field_k;
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (0 <= var17) {
                                        if (-1 >= (var18 ^ -1)) {
                                          if (this.field_a > var17) {
                                            if (var18 < this.field_z) {
                                              var24 = this.a(var18, (byte) 106, var17);
                                              this.field_g.a(var24.field_c, var24.field_a, -(param1 * 10) + 64);
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var20++;
                                            continue L6;
                                          }
                                        } else {
                                          var20++;
                                          continue L6;
                                        }
                                      } else {
                                        var20++;
                                        continue L6;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var20++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = 0;
                          L9: while (true) {
                            if (var16 >= var11) {
                              var15++;
                              continue L4;
                            } else {
                              L10: {
                                if (1 != var29[var15][var16]) {
                                  break L10;
                                } else {
                                  var30[var15][var16] = 1;
                                  break L10;
                                }
                              }
                              var16++;
                              continue L9;
                            }
                          }
                        }
                      }
                    } else {
                      L11: {
                        var10 = (int)Math.sqrt((double)(1936 - var9 * var9));
                        var11 = var10 / 2;
                        var12 = var10 * var8 / 44;
                        var13 = var9 + 64 + var21.field_c;
                        var14 = 32 + var21.field_a;
                        dg.d(var13, 0, var14 + -var11, 65793 * var12);
                        if (0 != var11) {
                          var15 = -var11;
                          L12: while (true) {
                            if (var15 > var11) {
                              break L11;
                            } else {
                              dg.h(var13, var14 - -var15, var12 * 131329, (var11 + -var15 << 1954612584) / (2 * var11));
                              var15++;
                              continue L12;
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var5);
            stackOut_49_1 = new StringBuilder().append("jo.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L13;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L13;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
    }

    private final void a(aj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = -1;
              if (param1 == 1) {
                break L1;
              } else {
                this.c((byte) 26);
                break L1;
              }
            }
            L2: while (true) {
              if (1 <= var3_int) {
                break L0;
              } else {
                var4 = -1;
                L3: while (true) {
                  if (var4 >= 2) {
                    var3_int++;
                    continue L2;
                  } else {
                    to.field_b.c(sg.a(to.field_b.field_q, param1 ^ 1816304478, this.field_b) - -(var3_int * to.field_b.field_q), sg.a(to.field_b.field_p, 1816304479, this.field_B) + var4 * to.field_b.field_p);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("jo.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (2 + this.field_a <= var2) {
            var2 = 0;
            L1: while (true) {
              if (this.field_a + 1 <= var2) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    var6 = (aj) null;
                    this.a(false, (aj) null, 63);
                    break L2;
                  }
                }
                return;
              } else {
                var7 = 0;
                var3 = var7;
                L3: while (true) {
                  if (this.field_z + 1 <= var7) {
                    var2++;
                    continue L1;
                  } else {
                    L4: {
                      var4 = 0;
                      if (var2 < this.field_a) {
                        if (this.field_z > var7) {
                          if (var2 <= 0) {
                            break L4;
                          } else {
                            if (!this.field_I[-1 + var2][var7].field_i) {
                              break L4;
                            } else {
                              var4 += 8;
                              break L4;
                            }
                          }
                        } else {
                          if (this.field_z <= var7) {
                            break L4;
                          } else {
                            if (var2 <= 0) {
                              break L4;
                            } else {
                              if (!this.field_I[-1 + var2][var7].field_i) {
                                break L4;
                              } else {
                                var4 += 8;
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_z > var7) {
                          if (var2 <= 0) {
                            break L4;
                          } else {
                            if (!this.field_I[-1 + var2][var7].field_i) {
                              break L4;
                            } else {
                              var4 += 8;
                              break L4;
                            }
                          }
                        } else {
                          if (this.field_z <= var7) {
                            break L4;
                          } else {
                            if (var2 <= 0) {
                              break L4;
                            } else {
                              if (!this.field_I[-1 + var2][var7].field_i) {
                                break L4;
                              } else {
                                var4 += 8;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    L5: {
                      if ((var2 ^ -1) < -1) {
                        if (this.field_a <= var2) {
                          break L5;
                        } else {
                          if ((var7 ^ -1) >= -1) {
                            break L5;
                          } else {
                            if (!this.field_I[var2][-1 + var7].field_i) {
                              break L5;
                            } else {
                              var4 += 2;
                              break L5;
                            }
                          }
                        }
                      } else {
                        if (this.field_a <= var2) {
                          break L5;
                        } else {
                          if ((var7 ^ -1) >= -1) {
                            break L5;
                          } else {
                            if (!this.field_I[var2][-1 + var7].field_i) {
                              break L5;
                            } else {
                              var4 += 2;
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (-1 > (var4 ^ -1)) {
                      this.field_j[var2][var7].field_n = 1;
                      this.field_j[var2][var7].field_k = var4;
                      if ((var7 + var2) % 2 == 1) {
                        this.field_j[var2][var7].field_o = true;
                        var7++;
                        continue L3;
                      } else {
                        var7++;
                        continue L3;
                      }
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L6: while (true) {
              if (var3 >= this.field_z - -2) {
                var2++;
                continue L0;
              } else {
                this.field_j[var2][var3].field_n = 0;
                var3++;
                continue L6;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        aj var9 = null;
        int var10 = 0;
        aj var11 = null;
        aj var12 = null;
        aj var13 = null;
        aj var14 = null;
        aj var15 = null;
        aj var16 = null;
        aj var17 = null;
        aj var18 = null;
        var10 = BachelorFridge.field_y;
        param0 = param0 * (160 - -(via.a(vr.field_b << -385802425, (byte) 58) >> -1239578613));
        param0 = param0 >> 8;
        var7 = param3;
        L0: while (true) {
          if (var7 >= param2) {
            var11 = this.a(param4, (byte) -102, param2);
            this.field_E.d(2 + var11.field_c, var11.field_a, param0);
            this.field_E.c();
            var12 = this.a(param1 - 1, (byte) -117, -1 + param3);
            this.field_E.d(2 + var12.field_c, var12.field_a, param0);
            this.field_E.c();
            var13 = this.a(param4, (byte) -128, -1 + param3);
            this.field_l.d(var13.field_c - -2, var13.field_a, param0);
            this.field_l.e();
            var14 = this.a(param1 - 1, (byte) -111, param2);
            this.field_l.d(var14.field_c, var14.field_a, param0);
            this.field_l.e();
            var8 = param1;
            L1: while (true) {
              if (param4 <= var8) {
                this.field_H.e();
                var8 = param3;
                L2: while (true) {
                  if (var8 >= param2) {
                    this.field_H.c();
                    if (param5 == -106) {
                      var8 = param1;
                      L3: while (true) {
                        if (param4 <= var8) {
                          this.field_H.e();
                          var8 = param3;
                          L4: while (true) {
                            if (var8 >= param2) {
                              this.field_H.c();
                              return;
                            } else {
                              var18 = this.a(-1 + param1, (byte) 62, var8);
                              this.field_H.d(var18.field_c, 1 + var18.field_a, param0);
                              var8++;
                              continue L4;
                            }
                          }
                        } else {
                          var17 = this.a(var8, (byte) -101, -1 + param3);
                          this.field_H.d(var17.field_c, var17.field_a, param0);
                          var8++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var16 = this.a(param4, (byte) 106, var8);
                    this.field_H.d(var16.field_c, var16.field_a, param0);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var15 = this.a(var8, (byte) -122, param2);
                this.field_H.d(var15.field_c, -1 + var15.field_a, param0);
                var8++;
                continue L1;
              }
            }
          } else {
            var8 = param1;
            L5: while (true) {
              if (var8 >= param4) {
                var7++;
                continue L0;
              } else {
                var9 = this.a(var8, (byte) -119, var7);
                this.field_A.d(var9.field_c, var9.field_a, param0);
                var8++;
                continue L5;
              }
            }
          }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        aj var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var13 = 0;
        ad var14 = null;
        int[][] var21 = null;
        int[] var22 = null;
        var13 = BachelorFridge.field_y;
        var4 = -1;
        var5 = this.a(param2, (byte) 115, param0);
        var6 = 1.5707963267948966 + 0.5 * ((double)((param2 * param0 << -269799614) + this.field_i.field_L) / 80.0);
        var8 = (int)(Math.sin(0.5 * ((double)(this.field_i.field_L + (param0 * param2 << 1218051234)) / 80.0)) * 32.0);
        var9 = (int)(Math.cos(0.5 * ((double)(this.field_i.field_L + (param0 * param2 << 330530)) / 80.0)) * 15.0);
        var21 = this.field_i.field_h.field_i;
        var11 = 0;
        L0: while (true) {
          if (var11 >= var21.length) {
            L1: {
              if (param1 == 80) {
                break L1;
              } else {
                var14 = (ad) null;
                this.a(-31, (aj) null, (ad) null);
                break L1;
              }
            }
            L2: {
              if (-1 != var4) {
                this.field_o.e(var5.field_c, var5.field_a, this.field_i.c(var4, 2271));
                if (var9 < 0) {
                  if (var6 % 3.141592653589793 > 2.0943951023931953) {
                    hha.field_y[(this.field_i.field_L >> 889813443) % 5 - -10].b(var5.field_c + 64 - (18 + -var8), -18 + var5.field_a - -32 + var9, this.field_i.c(var4, 2271));
                    break L2;
                  } else {
                    if (1.0471975511965976 >= var6 % 3.141592653589793) {
                      hha.field_y[5 + (this.field_i.field_L >> 872535587) % 5].b(var8 + 46 + var5.field_c, var9 + var5.field_a - -14, this.field_i.c(var4, 2271));
                      break L2;
                    } else {
                      hha.field_y[(this.field_i.field_L >> 812543075) % 5].b(var8 + -18 + (var5.field_c + 64), var9 + (-18 + (32 + var5.field_a)), this.field_i.c(var4, param1 ^ 2191));
                      break L2;
                    }
                  }
                } else {
                  if (2.0943951023931953 >= var6 % 3.141592653589793) {
                    if (1.0471975511965976 < var6 % 3.141592653589793) {
                      ik.field_h[(this.field_i.field_L >> -458035805) % 5].b(-18 + (var5.field_c + (64 - -var8)), var9 + (var5.field_a + 14), this.field_i.c(var4, 2271));
                      break L2;
                    } else {
                      ik.field_h[(this.field_i.field_L >> 275930179) % 5 - -10].b(var5.field_c - -64 + (-18 - -var8), 32 + var5.field_a + (-18 + var9), this.field_i.c(var4, 2271));
                      break L2;
                    }
                  } else {
                    ik.field_h[(this.field_i.field_L >> 540756323) % 5 - -5].b(var8 + 64 + var5.field_c + -18, var9 + (-18 + (32 + var5.field_a)), this.field_i.c(var4, 2271));
                    break L2;
                  }
                }
              } else {
                if (-1 < (var9 ^ -1)) {
                  if (var6 % 3.141592653589793 > 2.0943951023931953) {
                    hha.field_y[10 + (this.field_i.field_L >> -426412413) % 5].a(-18 + (var5.field_c + 64 - -var8), var9 + -18 + (32 + var5.field_a));
                    break L2;
                  } else {
                    if (var6 % 3.141592653589793 <= 1.0471975511965976) {
                      hha.field_y[5 + (this.field_i.field_L >> 1150232387) % 5].a(-18 + var5.field_c + 64 + var8, var5.field_a + 14 - -var9);
                      break L2;
                    } else {
                      hha.field_y[(this.field_i.field_L >> -1861804509) % 5].a(var8 + (var5.field_c + 64) + -18, var5.field_a + 14 - -var9);
                      break L2;
                    }
                  }
                } else {
                  if (var6 % 3.141592653589793 <= 2.0943951023931953) {
                    if (1.0471975511965976 >= var6 % 3.141592653589793) {
                      ik.field_h[(this.field_i.field_L >> 1347896675) % 5 - -10].a(var8 + 64 + var5.field_c - 18, var9 + (var5.field_a + 14));
                      break L2;
                    } else {
                      ik.field_h[(this.field_i.field_L >> 2105833059) % 5].a(var8 + -18 + (64 + var5.field_c), var9 + var5.field_a + 32 + -18);
                      break L2;
                    }
                  } else {
                    ik.field_h[(this.field_i.field_L >> 35288003) % 5 - -5].a(64 + (var5.field_c + -18 - -var8), var9 + (var5.field_a - -32 + -18));
                    break L2;
                  }
                }
              }
            }
            return;
          } else {
            var22 = var21[var11];
            if (param0 == var22[0]) {
              if (var22[1] == param2) {
                var4 = var22[2];
                var11++;
                continue L0;
              } else {
                var11++;
                continue L0;
              }
            } else {
              var11++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, aj param1) {
        RuntimeException var3 = null;
        int var4 = 0;
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
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 < -93) {
              L1: {
                if (this.field_i.field_P != null) {
                  var17 = this.a(this.field_i.field_P.field_s.field_J, (byte) 49, this.field_i.field_P.field_s.field_x);
                  param1 = var17;
                  this.b(25443, var17);
                  this.field_n.e(var17.field_c - -2, var17.field_a - 40 - 12, 32 + this.field_n.field_q, 32 + this.field_n.field_p, 192);
                  break L1;
                } else {
                  break L1;
                }
              }
              var18 = this.field_e;
              var4 = 0;
              L2: while (true) {
                if (var4 >= var18.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var5 = var18[var4];
                    if (var5 != null) {
                      L4: {
                        if (!this.field_i.field_h.field_a[var5.field_s.field_x][var5.field_s.field_J].field_d) {
                          break L4;
                        } else {
                          if (this.field_i.field_n != var5.field_s.field_D) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var6 = var5.field_s;
                        var19 = this.a((byte) 106, var5);
                        param1 = var19;
                        if (var5.field_s.i(126)) {
                          break L5;
                        } else {
                          if (39 == var6.field_y) {
                            od.field_C.a(var19.field_c, var19.field_a - 64);
                            break L5;
                          } else {
                            if (-3 == (var6.field_y ^ -1)) {
                              ala.field_a[(this.field_i.field_L >> 1226580258) % 4 + 8].e(42 + var19.field_c, var19.field_a + -42);
                              break L5;
                            } else {
                              if (29 != var6.field_y) {
                                if ((var6.field_y ^ -1) == -2) {
                                  ala.field_a[(this.field_i.field_L >> -1526110782) % 4 + 4].e(42 + var19.field_c, -42 + var19.field_a);
                                  break L5;
                                } else {
                                  if (-13 != (var6.field_y ^ -1)) {
                                    if (-38 != (var6.field_y ^ -1)) {
                                      break L5;
                                    } else {
                                      ala.field_a[(this.field_i.field_L >> -509436958) % 4 + 16].e(42 + var19.field_c, -42 + var19.field_a);
                                      break L5;
                                    }
                                  } else {
                                    ala.field_a[12 + (this.field_i.field_L >> -344335166) % 4].e(var19.field_c + 42, -42 + var19.field_a);
                                    break L5;
                                  }
                                }
                              } else {
                                ala.field_a[(this.field_i.field_L >> 1184545442) % 4 + 0].e(var19.field_c + 42, -42 + var19.field_a);
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        this.a(16429, var5, var19);
                        if ((var5.field_j ^ -1) < -1) {
                          var7_int = 50;
                          var8 = var19.field_c + (128 - var7_int >> -1674772895);
                          var9 = var19.field_a + -14;
                          var10 = (int)((double)var5.field_j / (double)var6.field_t * 100.0);
                          dg.b(-14 + var8, var9, 13, 65793);
                          cfa.a(var10, 13574, 14.199999809265137f, var8 - 14, this.field_i.c(var6.field_D, 2271), var9);
                          var11 = var6.field_t / 10;
                          var12 = 6.283185307179586 / (double)var11;
                          var14_double = 0.0;
                          L7: while (true) {
                            if (var11 < 0) {
                              L8: {
                                L9: {
                                  sia.field_g.e(-28 + var8, var9 - 14);
                                  if (this.field_i.b(var5, true) == null) {
                                    break L9;
                                  } else {
                                    if (var5.field_s.field_D == this.field_i.field_n) {
                                      L10: {
                                        ad.field_h.a("" + var6.field_v, -16 + var8 - -2, -26 + (30 + var9), 2 + var6.field_D, -1);
                                        var14 = this.field_i.b(var5, true).field_g;
                                        stackOut_35_0 = var9 - 15;
                                        stackIn_37_0 = stackOut_35_0;
                                        stackIn_36_0 = stackOut_35_0;
                                        if ((this.field_i.field_L % 128 ^ -1) <= -65) {
                                          stackOut_37_0 = stackIn_37_0;
                                          stackOut_37_1 = -(this.field_i.field_L % 128) + 127;
                                          stackIn_38_0 = stackOut_37_0;
                                          stackIn_38_1 = stackOut_37_1;
                                          break L10;
                                        } else {
                                          stackOut_36_0 = stackIn_36_0;
                                          stackOut_36_1 = this.field_i.field_L % 128;
                                          stackIn_38_0 = stackOut_36_0;
                                          stackIn_38_1 = stackOut_36_1;
                                          break L10;
                                        }
                                      }
                                      cba.a(stackIn_38_0, stackIn_38_1 * 4, -29 + var8, var14, -60);
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                ad.field_h.a("" + var6.field_v, var8 + 2 + -16, var9 - -30 - 26, var6.field_D + 2, -1);
                                break L8;
                              }
                              L11: {
                                if ((this.field_i.field_h.field_o ^ -1) != -4) {
                                  break L11;
                                } else {
                                  if (!var6.g((byte) 85)) {
                                    break L11;
                                  } else {
                                    var14 = (int)(15.0 * Math.cos(0.5 * ((double)(this.field_i.field_L + (var6.field_x * var6.field_J << 1888122498)) / 40.0)));
                                    pm.field_v[(this.field_i.field_L >> 1757160258) % 2].a(72 + var19.field_c, var14 + (var19.field_a + -32));
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var5.field_s.field_y == 0) {
                                  break L12;
                                } else {
                                  if (pna.field_zb[var5.field_s.field_y].field_i == -1) {
                                    break L12;
                                  } else {
                                    lga.field_k.e(15 + var19.field_c, var19.field_a + 2);
                                    am.field_M[pna.field_zb[var5.field_s.field_y].field_i].e(var19.field_c - -17, var19.field_a + 4);
                                    break L12;
                                  }
                                }
                              }
                              if (!var5.field_s.i(-89)) {
                                if ((var5.field_s.field_y ^ -1) == -40) {
                                  hr.field_c.a(var19.field_c, var19.field_a + -64, 192);
                                  break L6;
                                } else {
                                  if (var5.field_s.field_y == 2) {
                                    dg.a(var19.field_c - -42, var19.field_a - 28, var19.field_c - -88, var19.field_a);
                                    ala.field_a[(this.field_i.field_L >> 1037639746) % 4 + 8].e(42 + var19.field_c, var19.field_a - 42);
                                    dg.c();
                                    break L6;
                                  } else {
                                    if ((var5.field_s.field_y ^ -1) != -30) {
                                      if (1 != var5.field_s.field_y) {
                                        if (-13 != (var5.field_s.field_y ^ -1)) {
                                          if (-38 != (var5.field_s.field_y ^ -1)) {
                                            break L6;
                                          } else {
                                            dg.a(var19.field_c - -42, var19.field_a + -28, var19.field_c + 88, var19.field_a);
                                            ala.field_a[(this.field_i.field_L >> -1614601470) % 4 + 16].e(42 + var19.field_c, -42 + var19.field_a);
                                            dg.c();
                                            break L6;
                                          }
                                        } else {
                                          dg.a(var19.field_c - -42, -28 + var19.field_a, 88 + var19.field_c, var19.field_a);
                                          ala.field_a[(this.field_i.field_L >> -29519966) % 4 + 12].e(42 + var19.field_c, -42 + var19.field_a);
                                          dg.c();
                                          break L6;
                                        }
                                      } else {
                                        dg.a(var19.field_c - -42, -28 + var19.field_a, var19.field_c - -88, var19.field_a);
                                        ala.field_a[(this.field_i.field_L >> -965563134) % 4 + 4].e(var19.field_c + 42, -42 + var19.field_a);
                                        dg.c();
                                        break L6;
                                      }
                                    } else {
                                      dg.a(42 + var19.field_c, -28 + var19.field_a, 88 + var19.field_c, var19.field_a);
                                      ala.field_a[0 - -((this.field_i.field_L >> 1553622082) % 4)].e(var19.field_c - -42, -42 + var19.field_a);
                                      dg.c();
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              dg.d(var8 - 14, var9, (int)((long)(-14 + var8) + Math.round(13.0 * Math.sin(var14_double))), (int)(-Math.round(Math.cos(var14_double) * 13.0) + (long)var9), 65793);
                              var14_double = var14_double + var12;
                              var11--;
                              continue L7;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      var7 = (vca) ((Object) var5.field_t.b((byte) 90));
                      L13: while (true) {
                        if (var7 == null) {
                          break L3;
                        } else {
                          var7.a(-40 + var19.field_a - -32, var19.field_c + 64, false);
                          var7 = (vca) ((Object) var5.field_t.c(0));
                          continue L13;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var3);
            stackOut_64_1 = new StringBuilder().append("jo.EA(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L14;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L14;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, sfa param1) {
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 instanceof gm) {
                L2: {
                  var11 = (gm) ((Object) param1);
                  var12 = var11;
                  var4 = this.field_i.field_G[var11.field_h.field_f];
                  var5 = var4.field_s;
                  var6 = var12.field_l;
                  var7 = var12.field_i;
                  var8 = new aj(this.a(var5.field_J, (byte) 36, var5.field_x));
                  if (3 != var7) {
                    if (var7 != 1) {
                      if ((var7 ^ -1) != -3) {
                        if (-5 != (var7 ^ -1)) {
                          var9 = new aj(this.a(var5.field_J, (byte) 86, var5.field_x));
                          break L2;
                        } else {
                          var9 = this.a(var5.field_J, (byte) -89, var5.field_x - -var6);
                          break L2;
                        }
                      } else {
                        var9 = this.a(var5.field_J, (byte) -90, -var6 + var5.field_x);
                        break L2;
                      }
                    } else {
                      var9 = this.a(-var6 + var5.field_J, (byte) -105, var5.field_x);
                      break L2;
                    }
                  } else {
                    var9 = this.a(var6 + var5.field_J, (byte) 120, var5.field_x);
                    break L2;
                  }
                }
                this.a(var5, var8, -32, var9, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.b(-107, -63);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("jo.U(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
        int[] var2 = null;
        int var3 = 0;
        ad[][] var4 = null;
        int var5 = 0;
        ad[] var6 = null;
        ad[] var7 = null;
        int var8 = 0;
        ad var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          this.field_e = new ad[7 * this.field_i.field_h.field_d];
          var14 = new int[7 * this.field_i.field_h.field_d];
          var12 = var14;
          var11 = var12;
          var15 = var11;
          var13 = var15;
          var2 = var13;
          if (param0 == -22048) {
            break L0;
          } else {
            this.field_m = (kv) null;
            break L0;
          }
        }
        bl.a(var11, 0, var14.length, 2147483646);
        var3 = 0;
        var4 = this.field_i.field_o;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            dk.a(this.field_e, (byte) 101, var15);
            return;
          } else {
            var6 = var4[var5];
            if (var6 != null) {
              var7 = var6;
              var8 = 0;
              L2: while (true) {
                if (var7.length > var8) {
                  var9 = var7[var8];
                  if (var9 != null) {
                    this.field_e[var3] = var9;
                    var2[var3] = var9.field_s.field_x + var9.field_s.field_J;
                    if (var9.field_s.i(-122)) {
                      var2[var3] = var2[var3] - 1;
                      var3++;
                      var8++;
                      continue L2;
                    } else {
                      var3++;
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void a(boolean param0, aj param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_q ^ -1) == 0) {
                break L1;
              } else {
                if (-1 != this.field_r) {
                  L2: {
                    param1 = this.a(this.field_r, (byte) -97, this.field_q);
                    if (param0) {
                      rla.field_k.e(22 + param1.field_c, 10 + param1.field_a, 65376);
                      break L2;
                    } else {
                      rla.field_k.e(param1.field_c + 22, param1.field_a - -10, 16711680);
                      break L2;
                    }
                  }
                  L3: {
                    if (param2 == 18503) {
                      break L3;
                    } else {
                      this.a((byte) -63, -5, -59);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("jo.JA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-1, ((-param1 + param2) * 128 >> 111344849) + this.field_b, (64 * (param2 - -param1) >> -983714639) + this.field_B);
              if (param3 <= -47) {
                break L1;
              } else {
                this.field_n = (kv) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jo.V(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int stackIn_19_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var18 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_s.field_A) {
                  break L2;
                } else {
                  if (0 >= param1.field_j) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((this.field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n ^ -1) != -22) {
                  break L3;
                } else {
                  if (param1.field_s.i(124)) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!this.field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_d) {
                  break L4;
                } else {
                  if (this.field_i.field_n != param1.field_s.field_D) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var4_int = param2.field_c + -12;
                var5 = -90 + param2.field_a;
                var6 = 48;
                var7 = 32;
                var8 = param1.field_s;
                var9 = param1.field_f;
                var10 = param1.e((byte) -121);
                if (0.0f == var10) {
                  break L5;
                } else {
                  var11 = (int)((float)(via.a(50 * vr.field_b, (byte) 104) + 65536) * var10);
                  var5 = var5 - (int)(var10 * 30.0f);
                  var6 = var6 - (var11 * 6 >> -1740030736);
                  var7 = var7 - (var11 * 4 >> 1501202832);
                  var5 = var5 - (var11 * 4 >> 283024976);
                  break L5;
                }
              }
              L6: {
                if (param1.field_k > 0) {
                  L7: {
                    if (15 <= param1.field_k) {
                      stackOut_18_0 = 15;
                      stackIn_19_0 = stackOut_18_0;
                      break L7;
                    } else {
                      stackOut_17_0 = param1.field_k;
                      stackIn_19_0 = stackOut_17_0;
                      break L7;
                    }
                  }
                  var11 = stackIn_19_0;
                  var6 = var6 - (3 * var11 >> -1139043199);
                  var7 = var7 - (2 * var11 >> 2064681057);
                  break L6;
                } else {
                  break L6;
                }
              }
              if (param0 == 16429) {
                var19 = (gca) ((Object) param1.field_n.b((byte) 90));
                L8: while (true) {
                  if (var19 == null) {
                    L9: {
                      if (0 >= var6) {
                        break L9;
                      } else {
                        if ((var7 ^ -1) < -1) {
                          nk.a(this.field_y, param2.field_c + 64 + -(var6 >> 1690607201), -(var7 >> -545295679) + param2.field_a - (-param1.field_k - 24), var6, var7);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8.field_s != 1) {
                        if (-5 == (var8.field_s ^ -1)) {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L10;
                        } else {
                          stackOut_32_0 = 0;
                          stackIn_35_0 = stackOut_32_0;
                          break L10;
                        }
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_35_0 = stackOut_30_0;
                        break L10;
                      }
                    }
                    L11: {
                      var12 = stackIn_35_0;
                      if (param1.field_p == 0) {
                        var9.a(var12 != 0, false, 2048, 2048, 0, -49, 255, var4_int, var5);
                        break L11;
                      } else {
                        L12: {
                          var13 = param1.field_p;
                          if (var13 < 0) {
                            var13 = -var13;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          var13 = bd.field_i.field_p * (var13 + -128) >> 507219336;
                          var14 = var9.e(param0 ^ 16465);
                          if (var12 == 0) {
                            break L13;
                          } else {
                            var14.e();
                            break L13;
                          }
                        }
                        var17 = lq.a(this.field_k.field_b[93], 8533, var14, -60 + var13, 0);
                        var15 = bd.field_i;
                        bd.field_i = var17;
                        var9.a(0, 2048, 2048, (byte) 123, false, 255, var5, var4_int);
                        bd.field_i = var15;
                        break L11;
                      }
                    }
                    var19 = (gca) ((Object) param1.field_n.b((byte) 90));
                    L14: while (true) {
                      if (var19 == null) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var19.a(120 + var5, (byte) 72, 76 + var4_int);
                        var19 = (gca) ((Object) param1.field_n.c(0));
                        continue L14;
                      }
                    }
                  } else {
                    var19.a(120 + var5, 76 + var4_int, (byte) -34);
                    var19 = (gca) ((Object) param1.field_n.c(0));
                    continue L8;
                  }
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("jo.J(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L15;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L15;
            }
          }
          L16: {
            stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L16;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L16;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7 = 0;
        int var8 = 0;
        var3 = this.field_i.field_h.field_c[param0][0];
        var5 = -101 % ((18 - param1) / 36);
        var4 = this.field_i.field_h.field_c[param0][1];
        if (-1 == var3) {
          return;
        } else {
          L0: {
            if (-1 == var4) {
              break L0;
            } else {
              if (this.field_i.field_h.field_z <= var3) {
                break L0;
              } else {
                if (this.field_i.field_h.field_B > var4) {
                  if (this.field_i.field_h.field_a[var3][var4].field_l == null) {
                    L1: {
                      var6 = this.a(var4, (byte) -95, var3);
                      var7 = (int)(Math.sin(0.5 * ((double)(this.field_i.field_L + (var4 * var3 << -1190559070)) / 40.0)) * 30.0);
                      var8 = (int)(Math.cos(0.5 * ((double)(this.field_i.field_L - -(var3 * var4 << 1830250338)) / 40.0)) * 15.0);
                      if (var8 >= 0) {
                        hb.field_k[(this.field_i.field_L >> -1554524286) % 2].b(var6.field_c + 56 - -var7, var8 + (var6.field_a - 16), this.field_i.c(param0, 2271));
                        break L1;
                      } else {
                        pm.field_v[(this.field_i.field_L >> 719595874) % 2].b(64 + var6.field_c - (8 - var7), var6.field_a + (-16 + var8), this.field_i.c(param0, 2271));
                        break L1;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          if (param0 == 24731) {
            break L0;
          } else {
            this.field_q = -41;
            break L0;
          }
        }
        var2 = this.field_i.field_h.field_z;
        var3 = this.field_i.field_h.field_B;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var3 <= var5) {
                var4++;
                continue L1;
              } else {
                var6 = this.field_i.field_h.field_a[var4][var5];
                if (33 == var6.field_n) {
                  L3: {
                    var7 = 4 - var6.field_j;
                    var8 = (2 + var6.field_j) * 32;
                    var9 = var4 - var7;
                    var10 = 1 + (var7 + var4);
                    var11 = -var7 + var5;
                    if (-1 >= (var11 ^ -1)) {
                      break L3;
                    } else {
                      var11 = 0;
                      break L3;
                    }
                  }
                  L4: {
                    if (var2 >= var10) {
                      break L4;
                    } else {
                      var10 = var2;
                      break L4;
                    }
                  }
                  L5: {
                    if (var9 >= 0) {
                      break L5;
                    } else {
                      var9 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    var12 = var7 + (var5 + 1);
                    if (var3 < var12) {
                      var12 = var3;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.a(var8, var11, var10, var9, var12, (byte) -106);
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, kv param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param1 < -91) {
                break L1;
              } else {
                this.field_e = (ad[]) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= param4.field_p) {
                break L0;
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= param4.field_q) {
                    var7++;
                    continue L2;
                  } else {
                    var9 = param4.field_v[var6_int];
                    if (0 != var9) {
                      L4: {
                        var10 = param3 * var7 + (param0 + param2 * var8) >> 1688796865;
                        var10 = this.c(var10, -16079);
                        if (-1 <= (var10 ^ -1)) {
                          param4.field_v[var6_int] = 0;
                          break L4;
                        } else {
                          var11 = 16711935 & var9;
                          var11 = var11 * var10;
                          var12 = var9 & 65280;
                          var12 = var12 * var10;
                          param4.field_v[var6_int] = mp.a(dda.a(var12, 16711680), dda.a(-16711936, var11)) >>> -1256270328;
                          break L4;
                        }
                      }
                      var8++;
                      var6_int++;
                      continue L3;
                    } else {
                      var8++;
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("jo.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    private final void a(aga param0, aj param1, int param2, aj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var24 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = param1.field_c - -64;
              var7 = param1.field_a - param2;
              var8 = param3.field_c + 64;
              var9 = param3.field_a - -32;
              if (var7 < var9) {
                stackOut_3_0 = var7;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = var9;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var10 = stackIn_4_0 - 8;
              if (var7 <= var9) {
                stackOut_6_0 = var9;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var7;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_7_0 + 8;
              if (var8 > var6_int) {
                stackOut_9_0 = var6_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var8;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var12 = stackIn_10_0 + -16;
              if (var6_int <= var8) {
                stackOut_12_0 = var8;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6_int;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var13 = stackIn_13_0 - -16;
              var14 = 1;
              var15 = 2;
              if (2 == param4) {
                var14 = -1;
                var15 = -2;
                break L5;
              } else {
                if (1 == param4) {
                  var15 = -2;
                  break L5;
                } else {
                  if (param4 != 3) {
                    break L5;
                  } else {
                    var14 = -1;
                    break L5;
                  }
                }
              }
            }
            var16 = var10;
            L6: while (true) {
              if (var11 <= var16) {
                break L0;
              } else {
                var17 = var12;
                L7: while (true) {
                  if (var17 >= var13) {
                    var16++;
                    continue L6;
                  } else {
                    var18 = (-var7 + var16) * var15 + var14 * (var17 + -var6_int);
                    var19 = var14 * (var17 + -var6_int) + -(var15 * (-var7 + var16));
                    var20 = (var8 + -var6_int) * var14 - -(var15 * (var9 - var7));
                    if (32 <= var18) {
                      if (var18 <= var20) {
                        L8: {
                          var21 = 16;
                          if (var20 - 80 < var18) {
                            var21 = (var20 + -var18) / 2;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var22 = 33023;
                        if (var19 >= -var21) {
                          L9: {
                            if (var21 >= var19) {
                              var23 = (var18 << 1655934471) / var20;
                              var23 += 32;
                              dg.h(var17, var16, var22, var23);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var17++;
                          continue L7;
                        } else {
                          var17++;
                          continue L7;
                        }
                      } else {
                        var17++;
                        continue L7;
                      }
                    } else {
                      var17++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var6);
            stackOut_38_1 = new StringBuilder().append("jo.CA(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          L11: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          L12: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param4 + ')');
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
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var10 = null;
        var4 = BachelorFridge.field_y;
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
        var5 = new int[256];
        var10 = var5;
        var3 = 0;
        L0: while (true) {
          if ((var3 ^ -1) <= -257) {
            L1: {
              this.field_y.b();
              dg.a(400, 400, 384, 128, var10);
              this.field_x = new kv(128, 64);
              this.field_x.b();
              this.field_p.e(0, 0, 2302755);
              this.field_c = new kv(128, 64);
              this.field_c.b();
              this.field_p.e(0, 0, 16711680);
              this.field_w = new kv[4];
              if (param0 == -124) {
                break L1;
              } else {
                this.field_v = (int[]) null;
                break L1;
              }
            }
            var6 = 0;
            var3 = var6;
            L2: while (true) {
              if (-5 >= (var6 ^ -1)) {
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
                return;
              } else {
                this.field_w[var6] = new kv(128, 64);
                this.field_w[var6].b();
                this.field_p.e(0, 0, this.field_i.c(var6, 2271));
                var6++;
                continue L2;
              }
            }
          } else {
            var5[var3] = 65793 * var3;
            var3++;
            continue L0;
          }
        }
    }

    private final int c(int param0, int param1) {
        if (param1 != -16079) {
            this.field_r = -114;
        }
        return (int)(Math.pow(2.0, (double)((float)(-param0) / 10.239999771118164f)) * 256.0);
    }

    private final void a(int param0, int param1, kv param2, int param3, int param4, byte param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var9_int = 0;
            if (param5 <= -79) {
              var10 = 0;
              L1: while (true) {
                if (param2.field_p <= var10) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var11 = 0;
                  L2: while (true) {
                    if (param2.field_q <= var11) {
                      var10++;
                      continue L1;
                    } else {
                      var12 = param2.field_v[var9_int];
                      if (var12 != 0) {
                        L3: {
                          var13 = var10 * param7 + (param1 * var11 + param0);
                          var14 = param4 * var11 + param3 + var10 * param6;
                          var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14)) >> 1333027681;
                          var15 = this.c(var15, -16079);
                          if ((var15 ^ -1) >= -1) {
                            param2.field_v[var9_int] = 0;
                            break L3;
                          } else {
                            var16 = 16711935 & var12;
                            var16 = var16 * var15;
                            var17 = 65280 & var12;
                            var17 = var17 * var15;
                            param2.field_v[var9_int] = mp.a(dda.a(var17, 16711680), dda.a(-16711936, var16)) >>> -1543631288;
                            break L3;
                          }
                        }
                        var11++;
                        var9_int++;
                        continue L2;
                      } else {
                        var11++;
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var9);
            stackOut_16_1 = new StringBuilder().append("jo.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = -16384 + 64 * this.field_b + (128 * this.field_B - 30720);
          var2 = var3;
          var4 = -4096 + this.field_B * 128 + (this.field_b * -64 + 20480) - 30720;
          if (0 < var2) {
            this.field_b = this.field_b - (var2 / 64 >> -1371231615);
            this.field_B = this.field_B - (var2 / 128 >> -1182766495);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = var3 + 8192 * this.field_a;
          if ((var2 ^ -1) > -1) {
            this.field_B = this.field_B - (var2 / 128 >> -443646911);
            this.field_b = this.field_b - (var2 / 64 >> -533787903);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var5 = 68 / ((-31 - param0) / 57);
          var2 = var4;
          if ((var2 ^ -1) >= -1) {
            break L2;
          } else {
            this.field_b = this.field_b + (var2 / 64 >> -1179944799);
            this.field_B = this.field_B - (var2 / 128 >> -394156447);
            break L2;
          }
        }
        L3: {
          var2 = var4 - -(this.field_z * 8192);
          if (var2 >= 0) {
            break L3;
          } else {
            this.field_b = this.field_b + (var2 / 64 >> -2085839839);
            this.field_B = this.field_B - (var2 / 128 >> -186401151);
            break L3;
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (2 + this.field_a <= var2) {
            var2 = 0;
            L1: while (true) {
              if (1 + this.field_a <= var2) {
                L2: {
                  if (param0 >= 53) {
                    break L2;
                  } else {
                    this.c((byte) -3);
                    break L2;
                  }
                }
                var2 = 0;
                L3: while (true) {
                  if (var2 >= this.field_a + 1) {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= this.field_a + 1) {
                        return;
                      } else {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 1 + this.field_z) {
                            var2++;
                            continue L4;
                          } else {
                            L6: {
                              var4 = 0;
                              if (var2 >= this.field_a) {
                                break L6;
                              } else {
                                if (var3 >= this.field_z) {
                                  break L6;
                                } else {
                                  if ((this.field_I[var2][var3].field_n ^ -1) != -31) {
                                    break L6;
                                  } else {
                                    var4 += 4;
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              if (var3 >= this.field_z) {
                                break L7;
                              } else {
                                if (var2 <= 0) {
                                  break L7;
                                } else {
                                  if ((this.field_I[var2 - 1][var3].field_n ^ -1) == -31) {
                                    var4 += 8;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L8: {
                              if (var2 <= 0) {
                                break L8;
                              } else {
                                if (-1 <= (var3 ^ -1)) {
                                  break L8;
                                } else {
                                  if (30 != this.field_I[-1 + var2][-1 + var3].field_n) {
                                    break L8;
                                  } else {
                                    var4++;
                                    break L8;
                                  }
                                }
                              }
                            }
                            L9: {
                              if (this.field_a <= var2) {
                                break L9;
                              } else {
                                if (-1 <= (var3 ^ -1)) {
                                  break L9;
                                } else {
                                  if ((this.field_I[var2][-1 + var3].field_n ^ -1) != -31) {
                                    break L9;
                                  } else {
                                    var4 += 2;
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (0 < var4) {
                              this.field_j[var2][var3].field_n = 30;
                              this.field_j[var2][var3].field_k = var4;
                              var3++;
                              continue L5;
                            } else {
                              var3++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3 = 0;
                    L10: while (true) {
                      if (this.field_z - -1 <= var3) {
                        var2++;
                        continue L3;
                      } else {
                        L11: {
                          var4 = 0;
                          if (this.field_a > var2) {
                            if (this.field_z > var3) {
                              if (-1 <= (var2 ^ -1)) {
                                break L11;
                              } else {
                                if ((this.field_I[var2 + -1][var3].field_n ^ -1) != -30) {
                                  break L11;
                                } else {
                                  var4 += 8;
                                  break L11;
                                }
                              }
                            } else {
                              if (this.field_z <= var3) {
                                break L11;
                              } else {
                                if (-1 <= (var2 ^ -1)) {
                                  break L11;
                                } else {
                                  if ((this.field_I[var2 + -1][var3].field_n ^ -1) != -30) {
                                    break L11;
                                  } else {
                                    var4 += 8;
                                    break L11;
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_z > var3) {
                              if (-1 <= (var2 ^ -1)) {
                                break L11;
                              } else {
                                if ((this.field_I[var2 + -1][var3].field_n ^ -1) != -30) {
                                  break L11;
                                } else {
                                  var4 += 8;
                                  break L11;
                                }
                              }
                            } else {
                              if (this.field_z <= var3) {
                                break L11;
                              } else {
                                if (-1 <= (var2 ^ -1)) {
                                  break L11;
                                } else {
                                  if ((this.field_I[var2 + -1][var3].field_n ^ -1) != -30) {
                                    break L11;
                                  } else {
                                    var4 += 8;
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L12: {
                          if (-1 > (var2 ^ -1)) {
                            if (this.field_a <= var2) {
                              break L12;
                            } else {
                              if (var3 <= 0) {
                                break L12;
                              } else {
                                if (this.field_I[var2][-1 + var3].field_n != 29) {
                                  break L12;
                                } else {
                                  var4 += 2;
                                  break L12;
                                }
                              }
                            }
                          } else {
                            if (this.field_a <= var2) {
                              break L12;
                            } else {
                              if (var3 <= 0) {
                                break L12;
                              } else {
                                if (this.field_I[var2][-1 + var3].field_n != 29) {
                                  break L12;
                                } else {
                                  var4 += 2;
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        if (var4 > 0) {
                          this.field_j[var2][var3].field_n = 29;
                          this.field_j[var2][var3].field_k = var4;
                          var3++;
                          continue L10;
                        } else {
                          var3++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                var3 = 0;
                L13: while (true) {
                  if (var3 >= 1 + this.field_z) {
                    var2++;
                    continue L1;
                  } else {
                    L14: {
                      var4 = 0;
                      if (var2 >= this.field_a) {
                        break L14;
                      } else {
                        if (this.field_z <= var3) {
                          break L14;
                        } else {
                          if (!this.field_I[var2][var3].field_i) {
                            break L14;
                          } else {
                            var4 += 4;
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      if (var3 >= this.field_z) {
                        break L15;
                      } else {
                        if (-1 <= (var2 ^ -1)) {
                          break L15;
                        } else {
                          if (this.field_I[var2 - 1][var3].field_i) {
                            var4 += 8;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    L16: {
                      if (0 < var2) {
                        if (this.field_a <= var2) {
                          break L16;
                        } else {
                          if (0 >= var3) {
                            break L16;
                          } else {
                            if (!this.field_I[var2][-1 + var3].field_i) {
                              break L16;
                            } else {
                              var4 += 2;
                              break L16;
                            }
                          }
                        }
                      } else {
                        if (this.field_a <= var2) {
                          break L16;
                        } else {
                          if (0 >= var3) {
                            break L16;
                          } else {
                            if (!this.field_I[var2][-1 + var3].field_i) {
                              break L16;
                            } else {
                              var4 += 2;
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    if ((var4 ^ -1) < -1) {
                      this.field_j[var2][var3].field_n = 1;
                      this.field_j[var2][var3].field_k = var4;
                      var3++;
                      continue L13;
                    } else {
                      var3++;
                      continue L13;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L17: while (true) {
              if (var3 >= 2 + this.field_z) {
                var2++;
                continue L0;
              } else {
                this.field_j[var2][var3].field_n = 0;
                var3++;
                continue L17;
              }
            }
          }
        }
    }

    final void a(ad param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = (param0.field_s.field_x << -1924344400) + param0.field_o;
                var4 = (param0.field_s.field_J << -1176363024) - -param0.field_r;
                this.field_b = -(128 * (var3_int - var4) >> -1315590127) + 256;
                this.field_B = 208 + -((var4 + var3_int) * 64 >> 910214385);
                this.field_B = this.field_B + param0.field_k;
                this.a((byte) -89);
                if (param1 >= 87) {
                  break L1;
                } else {
                  this.field_b = -9;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("jo.MA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, aj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = this.a(this.field_r, (byte) -95, this.field_q);
                if (!this.field_i.field_h.field_a[this.field_q][this.field_r].e(-97)) {
                  break L2;
                } else {
                  if (this.field_i.field_h.a((byte) -101, this.field_i.field_n, this.field_q, this.field_r)) {
                    break L2;
                  } else {
                    this.field_m.a(param1.field_c + 1, param1.field_a + 1, 64);
                    break L1;
                  }
                }
              }
              this.field_g.a(param1.field_c - -1, 1 + param1.field_a, 64);
              break L1;
            }
            L3: {
              var3_int = this.field_i.field_L >> 2024848226;
              var4 = 16777215;
              var5 = 192;
              if (param0 == 2024848226) {
                break L3;
              } else {
                this.field_w = (kv[]) null;
                break L3;
              }
            }
            var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a, param1.field_c + 128, 12175, var3_int, param1.field_a - -32, var5);
            var3_int = lw.a(5, 128 + param1.field_c, var4, param1.field_a + 32, 64 + param1.field_c, param0 + -2024836051, var3_int, param1.field_a - -64, var5);
            var3_int = lw.a(5, param1.field_c - -64, var4, param1.field_a - -64, param1.field_c, param0 + -2024836051, var3_int, 32 + param1.field_a, var5);
            var3_int = lw.a(5, param1.field_c, var4, param1.field_a - -32, param1.field_c - -64, 12175, var3_int, param1.field_a, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("jo.IA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7 = 0;
        int var8_int = 0;
        tia var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        t var11 = null;
        int var12 = 0;
        int var13 = 0;
        tv var14_ref_tv = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        aj var25 = null;
        aj var27 = null;
        aj var28 = null;
        aj var29 = null;
        aj var30 = null;
        aj var31 = null;
        aj var34 = null;
        aj var35 = null;
        ad var36 = null;
        aj var37 = null;
        aj var38 = null;
        aj var39 = null;
        aj var40 = null;
        aga var41 = null;
        aj var42 = null;
        aj var43 = null;
        aj var44 = null;
        aj var45 = null;
        Object var46 = null;
        hd var46_ref = null;
        sfa var47 = null;
        aj var48 = null;
        aj var49 = null;
        aj var50 = null;
        int[] var57 = null;
        int[][] var58 = null;
        int[] var59 = null;
        at var60 = null;
        kv[][] stackIn_54_0 = null;
        kv[][] stackIn_55_0 = null;
        kv[][] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_73_0 = 0;
        Object stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        int stackIn_217_2 = 0;
        Object stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        Object stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        int stackIn_219_2 = 0;
        int stackIn_219_3 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        Object stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        int stackOut_216_2 = 0;
        Object stackOut_218_0 = null;
        int stackOut_218_1 = 0;
        int stackOut_218_2 = 0;
        int stackOut_218_3 = 0;
        Object stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        int stackOut_217_2 = 0;
        int stackOut_217_3 = 0;
        kv[][] stackOut_53_0 = null;
        kv[][] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        kv[][] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        L0: {
          var46 = null;
          var24 = null;
          var23 = BachelorFridge.field_y;
          var2 = 0;
          dg.c(0, 0, 640, 480, 2434341);
          var3 = (int)(Math.sin(0.5 * ((double)this.field_i.field_L / 10.0)) * 5.0);
          var4 = 0;
          var5 = 0;
          if (param0 == -32095) {
            break L0;
          } else {
            this.a(-94, false, 99, 6, 27, -34, -41);
            break L0;
          }
        }
        L1: {
          if ((this.field_i.field_U ^ -1) >= -1) {
            break L1;
          } else {
            var5 = this.field_i.field_L % 128;
            var4 = this.field_i.field_L / 128 % (this.field_i.field_U + 1);
            var5 = (int)(Math.cos((double)var5 / 5.0 * 0.5) * 5.0);
            break L1;
          }
        }
        var25 = this.a(this.field_r, (byte) 116, this.field_q);
        var6 = var25;
        this.a(var25, param0 + 32096);
        this.a(false, var25);
        var7 = 0;
        L2: while (true) {
          if (this.field_G.length <= var7) {
            L3: {
              if (-1 <= (this.field_d ^ -1)) {
                break L3;
              } else {
                L4: {
                  var28 = this.a(-3, (byte) -97, (this.field_i.field_h.field_z >> 271459713) - 1);
                  var6 = var28;
                  du.field_b.a(-42 + var28.field_c, -this.field_d + 106 + var28.field_a);
                  var7 = var3;
                  if (mk.field_p == -1) {
                    break L4;
                  } else {
                    var7 = -6 + (6 * mk.field_p / 640 + 6 * gd.field_m / 480);
                    break L4;
                  }
                }
                lu.field_f.a(-16 + (var28.field_c - -var7), var28.field_a - (-106 + this.field_d) - -(var7 >> -536230239));
                break L3;
              }
            }
            this.field_k.b((jo) (this), param0 ^ 18776);
            this.field_k.a((jo) (this), (byte) 117);
            var7 = 0;
            L5: while (true) {
              if (this.field_a <= var7) {
                var7 = 0;
                L6: while (true) {
                  if (this.field_a <= var7) {
                    L7: {
                      if ((this.field_i.field_h.field_o ^ -1) == -3) {
                        var58 = this.field_i.field_h.field_i;
                        var8_int = 0;
                        L8: while (true) {
                          if (var8_int >= var58.length) {
                            break L7;
                          } else {
                            var59 = var58[var8_int];
                            this.b(var59[0], (byte) 80, var59[1]);
                            var8_int++;
                            continue L8;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    var7 = 0;
                    L9: while (true) {
                      if (this.field_a <= var7) {
                        var7 = 0;
                        L10: while (true) {
                          if (var7 >= this.field_z) {
                            L11: {
                              this.b(24731);
                              var36 = this.field_i.field_P;
                              if (var36 == null) {
                                break L11;
                              } else {
                                if (!this.field_i.field_l) {
                                  break L11;
                                } else {
                                  L12: {
                                    var8_int = 1;
                                    var9 = 0;
                                    var10 = 0;
                                    var12 = 0;
                                    var11_int = 0;
                                    var13 = var36.field_s.f((byte) 122);
                                    var14_ref_tv = (tv) ((Object) ur.field_e[this.field_i.field_Z.field_g]);
                                    if (!hl.a((byte) 109, this.field_i.field_Z.field_g)) {
                                      break L12;
                                    } else {
                                      var13 = var13 << 1;
                                      var13 = var13 + var14_ref_tv.field_l;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if ((var36.field_s.field_y ^ -1) != -33) {
                                      stackOut_72_0 = 0;
                                      stackIn_73_0 = stackOut_72_0;
                                      break L13;
                                    } else {
                                      stackOut_71_0 = 1;
                                      stackIn_73_0 = stackOut_71_0;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    var15 = stackIn_73_0;
                                    var16 = var36.field_s.field_x;
                                    var17 = var36.field_s.field_J;
                                    if (var15 != 0) {
                                      break L14;
                                    } else {
                                      if (this.field_i.field_h.field_E != 0) {
                                        break L14;
                                      } else {
                                        if (this.field_i.field_h.field_a[var16][var17].field_i) {
                                          break L14;
                                        } else {
                                          var13 = var13 >> 1;
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  L15: while (true) {
                                    if (var8_int >= var13 - -1) {
                                      break L11;
                                    } else {
                                      L16: {
                                        L17: {
                                          if (var11_int != 0) {
                                            break L17;
                                          } else {
                                            if (var16 + -var8_int < 0) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (var15 != 0) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (!this.field_I[var16 + -var8_int][var17].e(-53)) {
                                                      break L19;
                                                    } else {
                                                      if (this.field_i.field_h.a((byte) -98, this.field_i.field_n, -var8_int + var16, var17)) {
                                                        break L19;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  var11_int = 1;
                                                  break L16;
                                                }
                                              }
                                              var37 = this.a(var17, (byte) -100, var16 - var8_int);
                                              var6 = var37;
                                              this.field_u.a(var37.field_c, var37.field_a, -(10 * var3) + 128);
                                              if (-var8_int + var16 != this.field_q) {
                                                break L16;
                                              } else {
                                                if (var17 != this.field_r) {
                                                  break L16;
                                                } else {
                                                  var2 = 1;
                                                  this.a(true, var37, 18503);
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var11_int = 1;
                                        break L16;
                                      }
                                      L20: {
                                        L21: {
                                          if (var9 != 0) {
                                            break L21;
                                          } else {
                                            if (-1 < (-var8_int + var17 ^ -1)) {
                                              break L21;
                                            } else {
                                              L22: {
                                                if (var15 != 0) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (!this.field_I[var16][-var8_int + var17].e(-30)) {
                                                      break L23;
                                                    } else {
                                                      if (this.field_i.field_h.a((byte) -127, this.field_i.field_n, var16, -var8_int + var17)) {
                                                        break L23;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  var9 = 1;
                                                  break L20;
                                                }
                                              }
                                              var38 = this.a(var17 - var8_int, (byte) -100, var16);
                                              var6 = var38;
                                              this.field_u.a(var38.field_c, var38.field_a, 128 + -(10 * var3));
                                              if (this.field_q != var16) {
                                                break L20;
                                              } else {
                                                if (this.field_r != var17 + -var8_int) {
                                                  break L20;
                                                } else {
                                                  this.a(true, var38, 18503);
                                                  var2 = 1;
                                                  break L20;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var9 = 1;
                                        break L20;
                                      }
                                      L24: {
                                        L25: {
                                          if (var12 != 0) {
                                            break L25;
                                          } else {
                                            if (-1 + this.field_a < var8_int + var16) {
                                              break L25;
                                            } else {
                                              L26: {
                                                if (var15 != 0) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (!this.field_I[var16 - -var8_int][var17].e(param0 + 32003)) {
                                                      break L27;
                                                    } else {
                                                      if (!this.field_i.field_h.a((byte) -100, this.field_i.field_n, var8_int + var16, var17)) {
                                                        break L26;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  var12 = 1;
                                                  break L24;
                                                }
                                              }
                                              var39 = this.a(var17, (byte) -118, var16 + var8_int);
                                              var6 = var39;
                                              this.field_u.a(var39.field_c, var39.field_a, -(10 * var3) + 128);
                                              if (var16 + var8_int != this.field_q) {
                                                break L24;
                                              } else {
                                                if (var17 != this.field_r) {
                                                  break L24;
                                                } else {
                                                  this.a(true, var39, param0 + 50598);
                                                  var2 = 1;
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 1;
                                        break L24;
                                      }
                                      L28: {
                                        if (var10 != 0) {
                                          break L28;
                                        } else {
                                          if (this.field_z - 1 < var8_int + var17) {
                                            break L28;
                                          } else {
                                            L29: {
                                              if (var15 != 0) {
                                                break L29;
                                              } else {
                                                if (!this.field_I[var16][var17 - -var8_int].e(-78)) {
                                                  break L28;
                                                } else {
                                                  if (this.field_i.field_h.a((byte) -121, this.field_i.field_n, var16, var17 + var8_int)) {
                                                    break L28;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                            }
                                            var40 = this.a(var17 + var8_int, (byte) 83, var16);
                                            var6 = var40;
                                            this.field_u.a(var40.field_c, var40.field_a, -(10 * var3) + 128);
                                            if (this.field_q == var16) {
                                              if (var17 + var8_int == this.field_r) {
                                                var2 = 1;
                                                this.a(true, var40, 18503);
                                                var8_int++;
                                                continue L15;
                                              } else {
                                                var8_int++;
                                                continue L15;
                                              }
                                            } else {
                                              var8_int++;
                                              continue L15;
                                            }
                                          }
                                        }
                                      }
                                      var10 = 1;
                                      var8_int++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                            L30: {
                              if (var36 == null) {
                                break L30;
                              } else {
                                if (!this.field_i.field_ab) {
                                  break L30;
                                } else {
                                  var41 = var36.field_s;
                                  var6 = this.a(var41.field_J, (byte) -117, var41.field_x);
                                  var9 = var41.field_m[this.field_i.field_db];
                                  var10 = var41.field_o.field_g.field_b[var9];
                                  var11 = (t) ((Object) al.a(-83, var10));
                                  var12 = var41.c(87, var10);
                                  var13 = var11.field_w;
                                  var14 = 0;
                                  var15 = -1;
                                  var16 = 0;
                                  var18 = 0;
                                  var17 = 0;
                                  var20 = 0;
                                  var19 = 0;
                                  var21 = var36.field_s.field_x;
                                  var22 = var36.field_s.field_J;
                                  L31: while (true) {
                                    if (1 + var12 <= var13) {
                                      if (var14 != 0) {
                                        L32: {
                                          if (2 == var11.field_p) {
                                            var16++;
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        L33: {
                                          if ((var11.field_p ^ -1) == -4) {
                                            var16++;
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        this.a(var15, true, var11.field_r, var16, var36.field_s.field_x, var36.field_s.field_J, var5);
                                        this.a(true, var6, 18503);
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    } else {
                                      L34: {
                                        L35: {
                                          if (var19 != 0) {
                                            break L35;
                                          } else {
                                            if (-1 >= (var21 + -var13 ^ -1)) {
                                              L36: {
                                                var42 = this.a(var22, (byte) 97, -var13 + var21);
                                                var6 = var42;
                                                if (var21 - var13 != this.field_q) {
                                                  break L36;
                                                } else {
                                                  if (var22 == this.field_r) {
                                                    var14 = 1;
                                                    var16 = var13;
                                                    var2 = 1;
                                                    var15 = 2;
                                                    break L36;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              this.field_C.a(var42.field_c, var42.field_a, 64 + -(var3 * 10));
                                              break L34;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        var19 = 1;
                                        break L34;
                                      }
                                      L37: {
                                        L38: {
                                          if (var17 != 0) {
                                            break L38;
                                          } else {
                                            if (0 > -var13 + var22) {
                                              break L38;
                                            } else {
                                              L39: {
                                                var43 = this.a(var22 + -var13, (byte) 32, var21);
                                                var6 = var43;
                                                if (var21 != this.field_q) {
                                                  break L39;
                                                } else {
                                                  if (this.field_r == -var13 + var22) {
                                                    var14 = 1;
                                                    var16 = var13;
                                                    var15 = 1;
                                                    var2 = 1;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              this.field_C.a(var43.field_c, var43.field_a, -(10 * var3) + 64);
                                              break L37;
                                            }
                                          }
                                        }
                                        var17 = 1;
                                        break L37;
                                      }
                                      L40: {
                                        L41: {
                                          if (var20 != 0) {
                                            break L41;
                                          } else {
                                            if (this.field_a + -1 < var13 + var21) {
                                              break L41;
                                            } else {
                                              L42: {
                                                var44 = this.a(var22, (byte) 50, var21 + var13);
                                                var6 = var44;
                                                if (this.field_q != var13 + var21) {
                                                  break L42;
                                                } else {
                                                  if (var22 == this.field_r) {
                                                    var16 = var13;
                                                    var15 = 4;
                                                    var14 = 1;
                                                    var2 = 1;
                                                    break L42;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              this.field_C.a(var44.field_c, var44.field_a, -(var3 * 10) + 64);
                                              break L40;
                                            }
                                          }
                                        }
                                        var20 = 1;
                                        break L40;
                                      }
                                      L43: {
                                        if (var18 != 0) {
                                          break L43;
                                        } else {
                                          if (-1 + this.field_z >= var22 + var13) {
                                            L44: {
                                              var45 = this.a(var13 + var22, (byte) 104, var21);
                                              var6 = var45;
                                              if (this.field_q != var21) {
                                                break L44;
                                              } else {
                                                if (var22 - -var13 == this.field_r) {
                                                  var15 = 3;
                                                  var2 = 1;
                                                  var16 = var13;
                                                  var14 = 1;
                                                  break L44;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                            this.field_C.a(var45.field_c, var45.field_a, -(10 * var3) + 64);
                                            var13++;
                                            continue L31;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var18 = 1;
                                      var13++;
                                      continue L31;
                                    }
                                  }
                                }
                              }
                            }
                            L45: {
                              if (var36 == null) {
                                break L45;
                              } else {
                                if (!this.field_i.field_w) {
                                  break L45;
                                } else {
                                  var46_ref = (hd) ((Object) ur.field_e[this.field_i.field_Z.field_g]);
                                  if (0 != var46_ref.c(0)) {
                                    if (2 != var46_ref.c(param0 ^ -32095)) {
                                      if (3 != var46_ref.c(0)) {
                                        break L45;
                                      } else {
                                        L46: {
                                          if (this.field_q == -1) {
                                            break L46;
                                          } else {
                                            if (-1 == this.field_r) {
                                              break L46;
                                            } else {
                                              if (null != this.field_i.field_h.field_a[this.field_q][this.field_r].field_l) {
                                                this.a(true, var6, param0 + 50598);
                                                var2 = 1;
                                                break L46;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                        if (this.field_q == -1) {
                                          break L45;
                                        } else {
                                          if (0 == (this.field_r ^ -1)) {
                                            break L45;
                                          } else {
                                            if (93 != var46_ref.field_j) {
                                              break L45;
                                            } else {
                                              if (null == this.field_i.field_h.c(this.field_q, this.field_r, 121)) {
                                                break L45;
                                              } else {
                                                if (this.field_i.field_h.c(this.field_q, this.field_r, 116).field_A) {
                                                  var2 = 1;
                                                  this.a(true, var6, 18503);
                                                  break L45;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L47: {
                                        if (this.field_q != 1 + var36.field_s.field_x) {
                                          break L47;
                                        } else {
                                          if (var36.field_s.field_J != this.field_r) {
                                            break L47;
                                          } else {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          }
                                        }
                                      }
                                      L48: {
                                        if (this.field_q != var36.field_s.field_x - 1) {
                                          break L48;
                                        } else {
                                          if (this.field_r != var36.field_s.field_J) {
                                            break L48;
                                          } else {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          }
                                        }
                                      }
                                      L49: {
                                        if (var36.field_s.field_x != this.field_q) {
                                          break L49;
                                        } else {
                                          if (1 + var36.field_s.field_J == this.field_r) {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      if (var36.field_s.field_x != this.field_q) {
                                        break L45;
                                      } else {
                                        if (-1 + var36.field_s.field_J != this.field_r) {
                                          break L45;
                                        } else {
                                          this.a(true, var6, 18503);
                                          var2 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                  } else {
                                    L50: {
                                      if ((this.field_q ^ -1) == 0) {
                                        break L50;
                                      } else {
                                        if (this.field_r == -1) {
                                          break L50;
                                        } else {
                                          if (130 != var46_ref.field_j) {
                                            break L50;
                                          } else {
                                            if (this.field_i.field_h.field_a[this.field_q][this.field_r].field_l != null) {
                                              break L50;
                                            } else {
                                              if (!this.field_i.field_h.field_a[this.field_q][this.field_r].e(-52)) {
                                                break L50;
                                              } else {
                                                var2 = 1;
                                                this.a(true, var6, 18503);
                                                break L45;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if ((this.field_q ^ -1) == 0) {
                                      break L45;
                                    } else {
                                      if (0 == (this.field_r ^ -1)) {
                                        break L45;
                                      } else {
                                        if (var46_ref.field_j != 130) {
                                          this.a(true, var6, 18503);
                                          var2 = 1;
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var8_int = 0;
                            L51: while (true) {
                              if (this.field_i.field_Y.length <= var8_int) {
                                L52: {
                                  if (null == this.field_i.field_Z) {
                                    break L52;
                                  } else {
                                    this.a(true, this.field_i.field_Z);
                                    break L52;
                                  }
                                }
                                L53: {
                                  if ((this.field_q ^ -1) == 0) {
                                    break L53;
                                  } else {
                                    if (-1 != this.field_r) {
                                      L54: {
                                        if (this.field_i.field_J) {
                                          break L54;
                                        } else {
                                          if (null != this.field_i.field_Z) {
                                            break L54;
                                          } else {
                                            if (0 == this.field_i.field_M) {
                                              break L54;
                                            } else {
                                              this.a(2024848226, var6);
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                      if (this.field_i.field_Z == null) {
                                        break L53;
                                      } else {
                                        if (var2 == 0) {
                                          this.a(false, var6, param0 + 50598);
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L55: {
                                  this.a((byte) -116, var6);
                                  if (3 != this.field_i.field_h.field_o) {
                                    break L55;
                                  } else {
                                    var8_int = 0;
                                    L56: while (true) {
                                      if (this.field_i.field_h.field_c.length <= var8_int) {
                                        break L55;
                                      } else {
                                        this.b(var8_int, -101);
                                        var8_int++;
                                        continue L56;
                                      }
                                    }
                                  }
                                }
                                var8_int = 0;
                                L57: while (true) {
                                  if (var8_int >= this.field_i.field_h.field_z) {
                                    var8_int = 0;
                                    L58: while (true) {
                                      if (this.field_z <= var8_int) {
                                        var8 = (tia) ((Object) this.field_i.field_fb.b((byte) 90));
                                        L59: while (true) {
                                          if (var8 == null) {
                                            var60 = (at) ((Object) this.field_i.field_j.b((byte) 90));
                                            L60: while (true) {
                                              if (var60 == null) {
                                                return;
                                              } else {
                                                var60.c(-59);
                                                var60 = (at) ((Object) this.field_i.field_j.c(0));
                                                continue L60;
                                              }
                                            }
                                          } else {
                                            var50 = this.a((byte) 126, var8.field_h);
                                            var8.a(var50.field_a + 32, 25415, 64 + var50.field_c);
                                            var8 = (tia) ((Object) this.field_i.field_fb.c(0));
                                            continue L59;
                                          }
                                        }
                                      } else {
                                        var9 = 0;
                                        L61: while (true) {
                                          if (var9 >= this.field_a) {
                                            var8_int++;
                                            continue L58;
                                          } else {
                                            var49 = this.a(var8_int, (byte) 115, var9);
                                            if (this.field_i.field_D[var9][var8_int] != null) {
                                              this.field_i.field_D[var9][var8_int].a(var49.field_a, true, var49.field_c);
                                              var9++;
                                              continue L61;
                                            } else {
                                              var9++;
                                              continue L61;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var9 = 0;
                                    L62: while (true) {
                                      if (var9 >= this.field_i.field_h.field_B) {
                                        var8_int++;
                                        continue L57;
                                      } else {
                                        var48 = this.a(var9, (byte) 124, var8_int);
                                        if (this.field_i.field_h.field_a[var8_int][var9].field_d) {
                                          co.field_b[4].a(var48.field_c, -64 + (var48.field_a + (var3 >> -541531359)), 192);
                                          var9++;
                                          continue L62;
                                        } else {
                                          var9++;
                                          continue L62;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var47 = this.field_i.field_Y[var8_int];
                                if (var47 != null) {
                                  L63: {
                                    stackOut_216_0 = this;
                                    stackOut_216_1 = -64;
                                    stackOut_216_2 = var5;
                                    stackIn_218_0 = stackOut_216_0;
                                    stackIn_218_1 = stackOut_216_1;
                                    stackIn_218_2 = stackOut_216_2;
                                    stackIn_217_0 = stackOut_216_0;
                                    stackIn_217_1 = stackOut_216_1;
                                    stackIn_217_2 = stackOut_216_2;
                                    if (var8_int != var4) {
                                      stackOut_218_0 = this;
                                      stackOut_218_1 = stackIn_218_1;
                                      stackOut_218_2 = stackIn_218_2;
                                      stackOut_218_3 = 0;
                                      stackIn_219_0 = stackOut_218_0;
                                      stackIn_219_1 = stackOut_218_1;
                                      stackIn_219_2 = stackOut_218_2;
                                      stackIn_219_3 = stackOut_218_3;
                                      break L63;
                                    } else {
                                      stackOut_217_0 = this;
                                      stackOut_217_1 = stackIn_217_1;
                                      stackOut_217_2 = stackIn_217_2;
                                      stackOut_217_3 = 1;
                                      stackIn_219_0 = stackOut_217_0;
                                      stackIn_219_1 = stackOut_217_1;
                                      stackIn_219_2 = stackOut_217_2;
                                      stackIn_219_3 = stackOut_217_3;
                                      break L63;
                                    }
                                  }
                                  this.a(stackIn_219_1, stackIn_219_2, stackIn_219_3 != 0, var47);
                                  this.a(true, var47);
                                  var8_int++;
                                  continue L51;
                                } else {
                                  var8_int++;
                                  continue L51;
                                }
                              }
                            }
                          } else {
                            var8_int = 0;
                            L64: while (true) {
                              if (this.field_a <= var8_int) {
                                var7++;
                                continue L10;
                              } else {
                                var35 = this.a(var7, (byte) -100, var8_int);
                                var6 = var35;
                                if (null != this.field_i.field_D[var8_int][var7]) {
                                  this.field_i.field_D[var8_int][var7].a(var35.field_a, 0, var35.field_c);
                                  var8_int++;
                                  continue L64;
                                } else {
                                  var8_int++;
                                  continue L64;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var8_int = 0;
                        L65: while (true) {
                          if (var8_int >= this.field_z) {
                            var7++;
                            continue L9;
                          } else {
                            if (this.field_i.field_h.field_a[var7][var8_int].field_m) {
                              if (!this.field_i.field_h.field_a[var7][var8_int].field_d) {
                                var9 = od.field_w[this.field_i.field_h.field_a[var7][var8_int].field_n].field_f;
                                var34 = this.a(var8_int, (byte) -100, var7);
                                var6 = var34;
                                if ((var9 ^ -1) != 0) {
                                  L66: {
                                    nk.a(this.field_y, 40 + var34.field_c, var34.field_a + 16, 38, 24);
                                    stackOut_53_0 = ve.field_m;
                                    stackIn_55_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (-5 < (var9 ^ -1)) {
                                      stackOut_55_0 = (kv[][]) ((Object) stackIn_55_0);
                                      stackOut_55_1 = var9;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      break L66;
                                    } else {
                                      stackOut_54_0 = (kv[][]) ((Object) stackIn_54_0);
                                      stackOut_54_1 = var9 + -4;
                                      stackIn_56_0 = stackOut_54_0;
                                      stackIn_56_1 = stackOut_54_1;
                                      break L66;
                                    }
                                  }
                                  ((kv) (Object) stackIn_56_0[stackIn_56_1][(this.field_i.field_L >> 389131842) % 25]).e(44 + var34.field_c, -var3 + var34.field_a - 4);
                                  var8_int++;
                                  continue L65;
                                } else {
                                  var8_int++;
                                  continue L65;
                                }
                              } else {
                                var8_int++;
                                continue L65;
                              }
                            } else {
                              var8_int++;
                              continue L65;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var8_int = 0;
                    L67: while (true) {
                      if (var8_int >= this.field_z) {
                        var7++;
                        continue L6;
                      } else {
                        if (-23 == (this.field_I[var7][var8_int].field_n ^ -1)) {
                          var31 = this.a(var8_int, (byte) 65, var7);
                          var6 = var31;
                          if ((this.field_i.field_h.field_E ^ -1) != -2) {
                            if (-3 == (this.field_i.field_h.field_E ^ -1)) {
                              this.field_k.field_b[95].a(var31.field_c, var31.field_a + -64);
                              var8_int++;
                              continue L67;
                            } else {
                              if (this.field_i.field_h.field_E == 0) {
                                this.field_k.field_b[95].a(var31.field_c, var31.field_a + -64);
                                var8_int++;
                                continue L67;
                              } else {
                                var8_int++;
                                continue L67;
                              }
                            }
                          } else {
                            this.field_k.field_b[95].a(var31.field_c, var31.field_a + -64);
                            var8_int++;
                            continue L67;
                          }
                        } else {
                          if (39 == this.field_I[var7][var8_int].field_n) {
                            var30 = this.a(var8_int, (byte) -90, var7);
                            var6 = var30;
                            ip.field_f[1].e(var30.field_c - -32, var30.field_a - 32);
                            var8_int++;
                            continue L67;
                          } else {
                            var8_int++;
                            continue L67;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var8_int = 0;
                L68: while (true) {
                  if (this.field_z <= var8_int) {
                    var7++;
                    continue L5;
                  } else {
                    if (this.field_i.field_h.a(var7, 120, this.field_i.field_n, var8_int)) {
                      if (this.field_i.field_h.field_a[var7][var8_int].e(-111)) {
                        var29 = this.a(var8_int, (byte) -98, var7);
                        var6 = var29;
                        this.field_w[this.field_i.field_n].a(var29.field_c, var29.field_a, 64 + -(var3 * 10));
                        var8_int++;
                        continue L68;
                      } else {
                        var8_int++;
                        continue L68;
                      }
                    } else {
                      var8_int++;
                      continue L68;
                    }
                  }
                }
              }
            }
          } else {
            var57 = this.field_G[var7];
            var27 = this.a(var57[2], (byte) 120, var57[1]);
            var6 = var27;
            vc.field_d[var57[0]].e(var27.field_c, var27.field_a);
            var7++;
            continue L2;
          }
        }
    }

    final aj b(int param0, int param1, int param2) {
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        sfa var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param1 == 9) {
            break L0;
          } else {
            var8 = (sfa) null;
            this.a(true, (sfa) null);
            break L0;
          }
        }
        var5 = -1 + this.field_z;
        L1: while (true) {
          if (-1 >= (var5 ^ -1)) {
            var6 = -1 + this.field_a;
            L2: while (true) {
              if ((var6 ^ -1) > -1) {
                var5--;
                continue L1;
              } else {
                var4 = this.a(var5, (byte) 100, var6);
                if (this.field_p.a(var4.field_c, var4.field_a, param0, param2)) {
                  return new aj(var6, var5);
                } else {
                  var6--;
                  continue L2;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    final void b(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        aj var7 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 > 65) {
            break L0;
          } else {
            var6 = (aj) null;
            this.a(true, (aj) null);
            break L0;
          }
        }
        this.field_h = -1;
        this.field_s = -1;
        this.field_q = -1;
        this.field_r = -1;
        var3 = 0;
        L1: while (true) {
          if (var3 >= this.field_a) {
            L2: {
              if (this.field_q != -1) {
                if (-1 != this.field_F) {
                  fieldTemp$4 = this.field_F + 1;
                  this.field_F = this.field_F + 1;
                  if ((fieldTemp$4 ^ -1) > -121) {
                    break L2;
                  } else {
                    this.field_F = -1;
                    break L2;
                  }
                } else {
                  if (-1 == this.field_F) {
                    break L2;
                  } else {
                    fieldTemp$5 = this.field_F + 1;
                    this.field_F = this.field_F + 1;
                    if ((fieldTemp$5 ^ -1) > -121) {
                      break L2;
                    } else {
                      this.field_F = -1;
                      break L2;
                    }
                  }
                }
              } else {
                if (-1 != this.field_F) {
                  fieldTemp$6 = this.field_F + 1;
                  this.field_F = this.field_F + 1;
                  if ((fieldTemp$6 ^ -1) > -121) {
                    break L2;
                  } else {
                    this.field_F = -1;
                    break L2;
                  }
                } else {
                  if (-1 == this.field_F) {
                    break L2;
                  } else {
                    fieldTemp$7 = this.field_F + 1;
                    this.field_F = this.field_F + 1;
                    if ((fieldTemp$7 ^ -1) > -121) {
                      break L2;
                    } else {
                      this.field_F = -1;
                      break L2;
                    }
                  }
                }
              }
            }
            return;
          } else {
            var4 = 0;
            L3: while (true) {
              if (var4 >= this.field_z) {
                var3++;
                continue L1;
              } else {
                L4: {
                  var7 = this.a(var4, (byte) 52, var3);
                  if (lf.field_c == 0) {
                    break L4;
                  } else {
                    if (this.field_p.a(var7.field_c, var7.field_a, nfa.field_a, jc.field_r)) {
                      this.field_s = var3;
                      this.field_h = var4;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_p.a(var7.field_c, var7.field_a, mk.field_p, gd.field_m)) {
                  this.field_q = var3;
                  this.field_r = var4;
                  var4++;
                  continue L3;
                } else {
                  var4++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, aj param1) {
        RuntimeException var3 = null;
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
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = (aj) null;
                this.b((aj) null, -117, -116, -84);
                break L1;
              }
            }
            L2: {
              var3_int = this.field_i.field_h.field_E;
              if (1 == var3_int) {
                var3_int = 0;
                L3: while (true) {
                  if ((1 + this.field_a ^ -1) >= (var3_int ^ -1)) {
                    var3_int = 0;
                    L4: while (true) {
                      if (this.field_z - -1 <= var3_int) {
                        var8 = this.a(this.field_z + 1, (byte) -114, 1 + this.field_a);
                        ls.field_a[5 * this.field_i.field_h.field_E + 3].a(14 + var8.field_c, 48 + var8.field_a, 128);
                        var9 = this.a(-1, (byte) -114, this.field_a + 1);
                        ls.field_a[5 * this.field_i.field_h.field_E].a(14 + var9.field_c, var9.field_a + 48, 128);
                        var10 = this.a(-1, (byte) 32, this.field_a);
                        ls.field_a[4 + this.field_i.field_h.field_E * 5].a(14 + var10.field_c, var10.field_a - -48, 128);
                        var11 = this.a(-1, (byte) -123, -1 + this.field_a);
                        ls.field_a[5 * this.field_i.field_h.field_E + 4].a(14 + var11.field_c, 48 + var11.field_a, 128);
                        var12 = this.a(0, (byte) -99, this.field_a);
                        ls.field_a[2 + 5 * this.field_i.field_h.field_E].a(4 + var12.field_c - -14, var12.field_a - -50, 128);
                        var13 = this.a(1 + this.field_z, (byte) -111, -1);
                        as.field_a[this.field_i.field_h.field_E * 5].a(14 + var13.field_c, var13.field_a - -48, 128);
                        var14 = this.a(this.field_z, (byte) -113, -1);
                        as.field_a[4 + 5 * this.field_i.field_h.field_E].a(var14.field_c - -14, 48 + var14.field_a, 128);
                        var15 = this.a(this.field_z - 1, (byte) -123, -1);
                        as.field_a[this.field_i.field_h.field_E * 5 - -4].a(14 + var15.field_c, 48 + var15.field_a, 128);
                        var16 = this.a(this.field_z, (byte) 105, 0);
                        param1 = var16;
                        as.field_a[5 * this.field_i.field_h.field_E + 2].a(14 + var16.field_c - 4, var16.field_a - -50, 128);
                        break L2;
                      } else {
                        L5: {
                          var7 = this.a(var3_int, (byte) -116, this.field_a + 1);
                          param1 = var7;
                          if ((var3_int ^ -1) == -1) {
                            ls.field_a[5 * this.field_i.field_h.field_E + 1].a(var7.field_c + 14, 48 + var7.field_a, 128);
                            break L5;
                          } else {
                            ls.field_a[2 + this.field_i.field_h.field_E * 5].a(var7.field_c - -14, var7.field_a + 48, 128);
                            break L5;
                          }
                        }
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      var6 = this.a(this.field_z - -1, (byte) 27, var3_int);
                      param1 = var6;
                      if (var3_int != 0) {
                        as.field_a[5 * this.field_i.field_h.field_E - -2].a(var6.field_c + 14, var6.field_a - -48, 128);
                        break L6;
                      } else {
                        as.field_a[1 + 5 * this.field_i.field_h.field_E].a(var6.field_c - -14, 48 + var6.field_a, 128);
                        break L6;
                      }
                    }
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                if ((var3_int ^ -1) == -1) {
                  var3_int = -1;
                  L7: while (true) {
                    if (this.field_a - -1 <= var3_int) {
                      var3_int = -5;
                      L8: while (true) {
                        if ((var3_int ^ -1) <= 0) {
                          var3_int = 0;
                          L9: while (true) {
                            if ((this.field_z + 1 ^ -1) >= (var3_int ^ -1)) {
                              var20 = this.a(this.field_z - -1, (byte) 70, this.field_a + 1);
                              ls.field_a[5 * this.field_i.field_h.field_E - -3].a(var20.field_c - -14, var20.field_a + 48, 128);
                              var21 = this.a(-1, (byte) 124, 1 + this.field_a);
                              ls.field_a[this.field_i.field_h.field_E * 5].a(var21.field_c + 14, var21.field_a + 48, 128);
                              var22 = this.a(-1, (byte) 58, this.field_a);
                              ls.field_a[4 + 5 * this.field_i.field_h.field_E].a(var22.field_c - -14, 48 + var22.field_a, 128);
                              var23 = this.a(-1, (byte) -95, -1 + this.field_a);
                              ls.field_a[this.field_i.field_h.field_E * 5 - -4].a(var23.field_c + 14, 48 + var23.field_a, 128);
                              var24 = this.a(0, (byte) 95, this.field_a);
                              ls.field_a[this.field_i.field_h.field_E * 5 - -2].a(14 + var24.field_c - -4, 50 + var24.field_a, 128);
                              param1 = this.a(1 + this.field_z, (byte) -104, -2);
                              param1 = this.a(this.field_z, (byte) 70, -1);
                              param1 = this.a(this.field_z - 1, (byte) -122, -1);
                              param1 = this.a(this.field_z, (byte) 51, 0);
                              break L2;
                            } else {
                              L10: {
                                var19 = this.a(var3_int, (byte) 72, this.field_a + 1);
                                param1 = var19;
                                if ((var3_int ^ -1) == -1) {
                                  ls.field_a[1 + 5 * this.field_i.field_h.field_E].a(14 + var19.field_c, 48 + var19.field_a, 128);
                                  break L10;
                                } else {
                                  ls.field_a[2 + this.field_i.field_h.field_E * 5].a(14 + var19.field_c, 48 + var19.field_a, 128);
                                  break L10;
                                }
                              }
                              var3_int++;
                              continue L9;
                            }
                          }
                        } else {
                          var18 = this.a(this.field_z + 1, (byte) 74, var3_int);
                          param1 = var18;
                          as.field_a[2 + 5 * this.field_i.field_h.field_E].a(30 + var18.field_c, 40 + var18.field_a, 128);
                          var3_int++;
                          continue L8;
                        }
                      }
                    } else {
                      L11: {
                        var17 = this.a(this.field_z + 1, (byte) -110, var3_int);
                        param1 = var17;
                        if (-1 == var3_int) {
                          as.field_a[1 + this.field_i.field_h.field_E * 5].a(14 + var17.field_c, var17.field_a + 48, 128);
                          break L11;
                        } else {
                          as.field_a[2 + this.field_i.field_h.field_E * 5].a(var17.field_c - -14, 48 + var17.field_a, 128);
                          break L11;
                        }
                      }
                      var3_int++;
                      continue L7;
                    }
                  }
                } else {
                  L12: {
                    if (var3_int != 2) {
                      break L12;
                    } else {
                      var3_int = 0;
                      L13: while (true) {
                        if ((var3_int ^ -1) <= (1 + this.field_a ^ -1)) {
                          var3_int = 0;
                          L14: while (true) {
                            if (this.field_z + 1 <= var3_int) {
                              var27 = this.a(1 + this.field_z, (byte) -108, 1 + this.field_a);
                              ls.field_a[3 + 5 * this.field_i.field_h.field_E].a(var27.field_c - -16, -32 + var27.field_a, 128);
                              var28 = this.a(-1, (byte) -114, this.field_a + 1);
                              ls.field_a[5 * this.field_i.field_h.field_E].a(var28.field_c + 16, var28.field_a - 32, 128);
                              var29 = this.a(-1, (byte) 42, this.field_a);
                              ls.field_a[this.field_i.field_h.field_E * 5 + 4].a(var29.field_c + 16, -32 + var29.field_a, 128);
                              var30 = this.a(-1, (byte) 101, this.field_a - 1);
                              ls.field_a[5 * this.field_i.field_h.field_E - -4].a(16 + var30.field_c, -32 + var30.field_a, 128);
                              var31 = this.a(0, (byte) -111, this.field_a);
                              ls.field_a[5 * this.field_i.field_h.field_E - -2].a(var31.field_c - -16, -32 + var31.field_a, 128);
                              var32 = this.a(this.field_z - -1, (byte) 88, -1);
                              as.field_a[this.field_i.field_h.field_E * 5].a(var32.field_c + 16, -32 + var32.field_a, 128);
                              var33 = this.a(this.field_z, (byte) 71, -1);
                              as.field_a[4 + 5 * this.field_i.field_h.field_E].a(16 + var33.field_c, -32 + var33.field_a, 128);
                              var34 = this.a(-1 + this.field_z, (byte) -95, -1);
                              as.field_a[this.field_i.field_h.field_E * 5 + 4].a(16 + var34.field_c, -32 + var34.field_a, 128);
                              var35 = this.a(this.field_z, (byte) -96, 0);
                              param1 = var35;
                              as.field_a[2 + 5 * this.field_i.field_h.field_E].a(16 + var35.field_c, var35.field_a + -32, 128);
                              break L12;
                            } else {
                              L15: {
                                var26 = this.a(var3_int, (byte) -112, this.field_a - -1);
                                param1 = var26;
                                if (0 == var3_int) {
                                  ls.field_a[5 * this.field_i.field_h.field_E + 1].a(var26.field_c + 16, -32 + var26.field_a, 128);
                                  break L15;
                                } else {
                                  ls.field_a[2 + this.field_i.field_h.field_E * 5].a(16 + var26.field_c, var26.field_a - 32, 128);
                                  break L15;
                                }
                              }
                              var3_int++;
                              continue L14;
                            }
                          }
                        } else {
                          L16: {
                            var25 = this.a(this.field_z - -1, (byte) -110, var3_int);
                            param1 = var25;
                            if (-1 == (var3_int ^ -1)) {
                              as.field_a[this.field_i.field_h.field_E * 5 + 1].a(16 + var25.field_c, var25.field_a - 32, 128);
                              break L16;
                            } else {
                              as.field_a[2 + this.field_i.field_h.field_E * 5].a(16 + var25.field_c, var25.field_a + -32, 128);
                              break L16;
                            }
                          }
                          var3_int++;
                          continue L13;
                        }
                      }
                    }
                  }
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var3);
            stackOut_50_1 = new StringBuilder().append("jo.DA(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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
        this.field_b = 256 + -(128 * (param2 - param1) >> 560402497);
        this.field_B = 208 - ((param1 + param2) * 64 >> -1785116447);
        this.a((byte) -127);
    }

    final void a(int param0, int param1) {
        if (param0 != -1907) {
            return;
        }
        this.field_b = this.field_b + (-(param1 >> 1641063265) + kla.a(param1, m.field_a, -2147483648));
        this.field_B = this.field_B + (-(param1 >> 1815409281) + kla.a(param1, m.field_a, -2147483648));
    }

    jo(gj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var10 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        this.field_d = 0;
        this.field_F = -1;
        try {
          L0: {
            this.field_i = param0;
            this.field_I = this.field_i.field_h.field_a;
            this.field_k = ida.a(0, (vr) null, this.field_i.field_h.field_E);
            hga.field_U.a((byte) 127);
            this.field_z = this.field_i.field_h.field_B;
            this.field_a = this.field_i.field_h.field_z;
            this.field_j = new bq[this.field_a - -2][2 + this.field_z];
            var2_int = 0;
            L1: while (true) {
              if (this.field_a + 2 <= var2_int) {
                L2: {
                  this.a(true);
                  this.c((byte) -124);
                  if ((this.field_i.field_n ^ -1) > -1) {
                    this.a((byte) -57, this.field_z >> 1233427681, this.field_a >> 1056893153);
                    break L2;
                  } else {
                    var2_int = 0;
                    var3 = 0;
                    var10 = this.field_i.field_h.field_L.b(this.field_i.field_n, -60);
                    var3 = var10[0][1];
                    var2_int = var10[0][0];
                    this.a((byte) -57, var3, var2_int);
                    break L2;
                  }
                }
                this.a(-22048);
                this.field_G = new int[4][3];
                var2_int = 0;
                L3: while (true) {
                  if ((var2_int ^ -1) <= -5) {
                    this.field_v = a.a(12889, 64, 16763049, 46335);
                    break L0;
                  } else {
                    L4: {
                      var3 = kla.a(9, this.field_i.field_h.field_w, -2147483648);
                      var4 = 0;
                      var5 = 0;
                      if (-1 != (var2_int ^ -1)) {
                        if (var2_int == 1) {
                          var4 = this.field_a + 3;
                          var5 = kla.a(this.field_z, this.field_i.field_h.field_w, -2147483648);
                          break L4;
                        } else {
                          if (2 != var2_int) {
                            if ((var2_int ^ -1) != -4) {
                              break L4;
                            } else {
                              var4 = kla.a(this.field_a, this.field_i.field_h.field_w, -2147483648);
                              var5 = this.field_z - -3;
                              break L4;
                            }
                          } else {
                            var4 = kla.a(this.field_a, this.field_i.field_h.field_w, -2147483648);
                            var5 = -3;
                            break L4;
                          }
                        }
                      } else {
                        var5 = kla.a(this.field_z, this.field_i.field_h.field_w, -2147483648);
                        var4 = -3;
                        break L4;
                      }
                    }
                    this.field_G[var2_int] = new int[]{var3, var4, var5};
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                var3 = 0;
                L5: while (true) {
                  if (var3 >= 2 + this.field_z) {
                    var2_int++;
                    continue L1;
                  } else {
                    this.field_j[var2_int][var3] = new bq(0);
                    var3++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("jo.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
    }
}
