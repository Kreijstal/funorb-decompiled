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
              param0.a(-1, 64 * (param3 - param1) + ((jo) this).field_b, ((jo) this).field_B - -((param1 + param3) * 32));
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jo.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, aj param1, ad param2) {
        if (!(param2 != null)) {
            return;
        }
        this.a(param1, (param2.field_s.field_J << 16) + param2.field_r, param2.field_o + (param2.field_s.field_x << 16), -58);
        try {
            param1.field_a = param1.field_a - param2.field_k;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jo.G(" + -114 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
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
              ((jo) this).field_u.a(param1.field_c + 1, 1 + param1.field_a, 64);
              var3_int = ((jo) this).field_i.field_L >> 2;
              stackOut_0_0 = ((jo) this).field_v;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((jo) this).field_i.field_L % 128 >= 64) {
                stackOut_2_0 = (int[]) (Object) stackIn_2_0;
                stackOut_2_1 = 127 - ((jo) this).field_i.field_L % 128;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (int[]) (Object) stackIn_1_0;
                stackOut_1_1 = ((jo) this).field_i.field_L % 128;
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
            var3_int = lw.a(5, 64 + param1.field_c, var4, 1 + (-1 + param1.field_a), -1 + param1.field_c + 128, 12175, var3_int, param1.field_a - -32, var5);
            var3_int += 2;
            var3_int = lw.a(5, -1 + (param1.field_c + 128), var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, -1 + param1.field_a + 64, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, 64 + (param1.field_a - 1), 1 + param1.field_c, 12175, var3_int, param1.field_a + 32, var5);
            var3_int += 2;
            var3_int = lw.a(5, param1.field_c + 1, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, 1 + param1.field_a, var5);
            var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a + 2, -2 + (128 + param1.field_c), 12175, var3_int, 32 + param1.field_a, var5);
            var3_int += 4;
            var3_int = lw.a(5, 128 + param1.field_c - 2, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, param1.field_a - -62, var5);
            var3_int = lw.a(5, param1.field_c + 64, var4, -2 + (64 + param1.field_a), param1.field_c + 2, 12175, var3_int, 32 + param1.field_a, var5);
            var3_int += 4;
            var3_int = lw.a(5, param1.field_c + 2, var4, 32 + param1.field_a, 64 + param1.field_c, 12175, var3_int, 2 + param1.field_a, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jo.K(").append(25443).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    private final aj a(byte param0, ad param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (aj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jo.L(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int[][] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          if (((jo) this).field_I[param2][param4].field_n == 20) {
            var6 = -1;
            var7 = ((jo) this).field_i.field_h.field_i;
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7.length) {
                if (-1 == var6) {
                  break L0;
                } else {
                  ((jo) this).field_p.e(param1, param3, ((jo) this).field_i.c(var6, 2271));
                  break L0;
                }
              } else {
                var9 = var7[var8];
                if (var9[0] == param2) {
                  if (var9[1] == param4) {
                    var6 = var9[2];
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
            ((jo) this).field_p = null;
            break L2;
          }
        }
        int discarded$1 = ((jo) this).field_i.a(-18254, param4, param2);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        aj var8 = null;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var19 = BachelorFridge.field_y;
          param3--;
          var9 = haa.b(1, param2, param0);
          var10 = 17;
          var11 = 17;
          var12 = var10 - 1 >> 1;
          var13 = -1 + var11 >> 1;
          if (param1) {
            break L0;
          } else {
            ((jo) this).field_r = 120;
            break L0;
          }
        }
        var14 = new int[var10][var11];
        var15 = 0;
        L1: while (true) {
          if (~var10 >= ~var15) {
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
                    L4: {
                      if (var14[var15][var20] != 0) {
                        L5: {
                          var17 = param4 + var15 + -var12;
                          var18 = var20 + -var13 + param5;
                          if (param0 != 1) {
                            if (param0 != 3) {
                              if (param0 == 4) {
                                var17 = var17 + param3;
                                break L5;
                              } else {
                                if (param0 == 2) {
                                  var17 = var17 - param3;
                                  break L5;
                                } else {
                                  L6: {
                                    if (var17 < 0) {
                                      break L6;
                                    } else {
                                      if (var18 < 0) {
                                        break L6;
                                      } else {
                                        if (((jo) this).field_a <= var17) {
                                          break L6;
                                        } else {
                                          if (var18 >= ((jo) this).field_z) {
                                            break L6;
                                          } else {
                                            var8 = ((jo) this).a(var18, (byte) -108, var17);
                                            ((jo) this).field_g.a(1 + var8.field_c, 1 + var8.field_a, 128 + -(param6 * 20));
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var20++;
                                  continue L3;
                                }
                              }
                            } else {
                              var18 = var18 + param3;
                              break L5;
                            }
                          } else {
                            var18 = var18 - param3;
                            break L5;
                          }
                        }
                        if (var17 < 0) {
                          break L4;
                        } else {
                          if (var18 < 0) {
                            break L4;
                          } else {
                            if (((jo) this).field_a <= var17) {
                              break L4;
                            } else {
                              if (var18 >= ((jo) this).field_z) {
                                break L4;
                              } else {
                                var8 = ((jo) this).a(var18, (byte) -108, var17);
                                ((jo) this).field_g.a(1 + var8.field_c, 1 + var8.field_a, 128 + -(param6 * 20));
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var20++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var16 = 0;
            L7: while (true) {
              if (var11 <= var16) {
                var15++;
                continue L1;
              } else {
                L8: {
                  if (var9[var15][var16] == 1) {
                    var14[var15][var16] = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var16++;
                continue L7;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, sfa param3) {
        RuntimeException var5 = null;
        aj var5_ref = null;
        hia var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9_int = 0;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof hia)) {
                break L1;
              } else {
                var6 = (hia) (Object) param3;
                var7 = ((jo) this).field_i.field_G[var6.field_h.field_f].field_s;
                oha discarded$1 = al.a(-124, var6.field_g);
                var5_ref = new aj(((jo) this).a(var7.field_J, (byte) -96, var7.field_x));
                if (param2) {
                  var8 = (5 + -param1) * 4;
                  var9_int = -44;
                  L2: while (true) {
                    if (var9_int >= 44) {
                      var9 = haa.b(1, var7.d(125, var6.field_g), var6.field_j);
                      var10 = 17;
                      var11 = 17;
                      var12 = -1 + var10 >> 1;
                      var13 = -1 + var11 >> 1;
                      var14 = new int[var10][var11];
                      var15 = 0;
                      L3: while (true) {
                        if (var15 >= var10) {
                          var15 = 0;
                          L4: while (true) {
                            if (var15 >= var10) {
                              break L1;
                            } else {
                              var20 = 0;
                              var16 = var20;
                              L5: while (true) {
                                if (var11 <= var20) {
                                  var15++;
                                  continue L4;
                                } else {
                                  if (var14[var15][var20] != 0) {
                                    L6: {
                                      var17 = var7.field_x + -var12 + var15;
                                      var18 = var7.field_J - var13 - -var20;
                                      if (-2 == var6.field_j) {
                                        var18 = var18 - var6.field_k;
                                        break L6;
                                      } else {
                                        if (-4 == var6.field_j) {
                                          var18 = var18 + var6.field_k;
                                          break L6;
                                        } else {
                                          if (4 == var6.field_j) {
                                            var17 = var17 + var6.field_k;
                                            break L6;
                                          } else {
                                            if (var6.field_j == 2) {
                                              var17 = var17 - var6.field_k;
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if (0 > var17) {
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var20++;
                                    continue L5;
                                  } else {
                                    var20++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = 0;
                          L8: while (true) {
                            if (var16 >= var11) {
                              var15++;
                              continue L3;
                            } else {
                              L9: {
                                if (1 != var9[var15][var16]) {
                                  break L9;
                                } else {
                                  var14[var15][var16] = 1;
                                  break L9;
                                }
                              }
                              var16++;
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      L10: {
                        var10 = (int)Math.sqrt((double)(1936 - var9_int * var9_int));
                        var11 = var10 / 2;
                        var12 = var10 * var8 / 44;
                        var13 = var9_int + 64 + var5_ref.field_c;
                        var14_int = 32 + var5_ref.field_a;
                        dg.d(var13, 0, var14_int + -var11, 65793 * var12);
                        if (0 != var11) {
                          var15 = -var11;
                          L11: while (true) {
                            if (var15 > var11) {
                              break L10;
                            } else {
                              dg.h(var13, var14_int - -var15, var12 * 131329, (var11 + -var15 << 8) / (2 * var11));
                              var15++;
                              continue L11;
                            }
                          }
                        } else {
                          break L10;
                        }
                      }
                      var9_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("jo.NA(").append(-64).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
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
                    to.field_b.c(sg.a(to.field_b.field_q, param1 ^ 1816304478, ((jo) this).field_b) - -(var3_int * to.field_b.field_q), sg.a(to.field_b.field_p, 1816304479, ((jo) this).field_B) + var4 * to.field_b.field_p);
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jo.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (2 + ((jo) this).field_a <= var2) {
            var2 = 0;
            L1: while (true) {
              if (~(((jo) this).field_a + 1) >= ~var2) {
                return;
              } else {
                var7 = 0;
                var3 = var7;
                L2: while (true) {
                  if (~(((jo) this).field_z + 1) >= ~var7) {
                    var2++;
                    continue L1;
                  } else {
                    L3: {
                      var4 = 0;
                      if (var2 >= ((jo) this).field_a) {
                        break L3;
                      } else {
                        if (~((jo) this).field_z >= ~var7) {
                          break L3;
                        } else {
                          if (!((jo) this).field_I[var2][var7].field_i) {
                            break L3;
                          } else {
                            var4 += 4;
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      if (~((jo) this).field_z >= ~var7) {
                        break L4;
                      } else {
                        if (var2 <= 0) {
                          break L4;
                        } else {
                          if (!((jo) this).field_I[-1 + var2][var7].field_i) {
                            break L4;
                          } else {
                            var4 += 8;
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (var2 <= 0) {
                        break L5;
                      } else {
                        if (var7 <= 0) {
                          break L5;
                        } else {
                          if (((jo) this).field_I[-1 + var2][-1 + var7].field_i) {
                            var4++;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((jo) this).field_a <= var2) {
                        break L6;
                      } else {
                        if (var7 <= 0) {
                          break L6;
                        } else {
                          if (!((jo) this).field_I[var2][-1 + var7].field_i) {
                            break L6;
                          } else {
                            var4 += 2;
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (var4 > 0) {
                        ((jo) this).field_j[var2][var7].field_n = 1;
                        ((jo) this).field_j[var2][var7].field_k = var4;
                        if ((var7 + var2) % 2 == 1) {
                          ((jo) this).field_j[var2][var7].field_o = true;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L8: while (true) {
              if (var3 >= ((jo) this).field_z - -2) {
                var2++;
                continue L0;
              } else {
                ((jo) this).field_j[var2][var3].field_n = 0;
                var3++;
                continue L8;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7_int = 0;
        aj var7 = null;
        int var8 = 0;
        aj var9 = null;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        param0 = param0 * (160 - -(via.a(vr.field_b << 7, (byte) 58) >> 11));
        param0 = param0 >> 8;
        var7_int = param3;
        L0: while (true) {
          if (var7_int >= param2) {
            var7 = ((jo) this).a(param4, (byte) -102, param2);
            ((jo) this).field_E.d(2 + var7.field_c, var7.field_a, param0);
            ((jo) this).field_E.c();
            var7 = ((jo) this).a(param1 - 1, (byte) -117, -1 + param3);
            ((jo) this).field_E.d(2 + var7.field_c, var7.field_a, param0);
            ((jo) this).field_E.c();
            var7 = ((jo) this).a(param4, (byte) -128, -1 + param3);
            ((jo) this).field_l.d(var7.field_c - -2, var7.field_a, param0);
            ((jo) this).field_l.e();
            var7 = ((jo) this).a(param1 - 1, (byte) -111, param2);
            ((jo) this).field_l.d(var7.field_c, var7.field_a, param0);
            ((jo) this).field_l.e();
            var8 = param1;
            L1: while (true) {
              if (param4 <= var8) {
                ((jo) this).field_H.e();
                var8 = param3;
                L2: while (true) {
                  if (var8 >= param2) {
                    ((jo) this).field_H.c();
                    var8 = param1;
                    L3: while (true) {
                      if (param4 <= var8) {
                        ((jo) this).field_H.e();
                        var8 = param3;
                        L4: while (true) {
                          if (var8 >= param2) {
                            ((jo) this).field_H.c();
                            return;
                          } else {
                            var7 = ((jo) this).a(-1 + param1, (byte) 62, var8);
                            ((jo) this).field_H.d(var7.field_c, 1 + var7.field_a, param0);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var7 = ((jo) this).a(var8, (byte) -101, -1 + param3);
                        ((jo) this).field_H.d(var7.field_c, var7.field_a, param0);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var7 = ((jo) this).a(param4, (byte) 106, var8);
                    ((jo) this).field_H.d(var7.field_c, var7.field_a, param0);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var7 = ((jo) this).a(var8, (byte) -122, param2);
                ((jo) this).field_H.d(var7.field_c, -1 + var7.field_a, param0);
                var8++;
                continue L1;
              }
            }
          } else {
            var8 = param1;
            L5: while (true) {
              if (var8 >= param4) {
                var7_int++;
                continue L0;
              } else {
                var9 = ((jo) this).a(var8, (byte) -119, var7_int);
                ((jo) this).field_A.d(var9.field_c, var9.field_a, param0);
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
        int[][] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        var4 = -1;
        var5 = ((jo) this).a(param2, (byte) 115, param0);
        var6 = 1.5707963267948966 + 0.5 * ((double)((param2 * param0 << 2) + ((jo) this).field_i.field_L) / 80.0);
        var8 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 32.0);
        var9 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 15.0);
        var10 = ((jo) this).field_i.field_h.field_i;
        var11 = 0;
        L0: while (true) {
          if (var11 >= var10.length) {
            L1: {
              if (-1 != var4) {
                ((jo) this).field_o.e(var5.field_c, var5.field_a, ((jo) this).field_i.c(var4, 2271));
                if (var9 < 0) {
                  if (var6 % 3.141592653589793 > 2.0943951023931953) {
                    hha.field_y[(((jo) this).field_i.field_L >> 3) % 5 - -10].b(var5.field_c + 64 - (18 + -var8), -18 + var5.field_a - -32 + var9, ((jo) this).field_i.c(var4, 2271));
                    break L1;
                  } else {
                    if (1.0471975511965976 >= var6 % 3.141592653589793) {
                      hha.field_y[5 + (((jo) this).field_i.field_L >> 3) % 5].b(var8 + 46 + var5.field_c, var9 + var5.field_a - -14, ((jo) this).field_i.c(var4, 2271));
                      break L1;
                    } else {
                      hha.field_y[(((jo) this).field_i.field_L >> 3) % 5].b(var8 + -18 + (var5.field_c + 64), var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4, 2271));
                      break L1;
                    }
                  }
                } else {
                  if (2.0943951023931953 >= var6 % 3.141592653589793) {
                    if (1.0471975511965976 < var6 % 3.141592653589793) {
                      ik.field_h[(((jo) this).field_i.field_L >> 3) % 5].b(-18 + (var5.field_c + (64 - -var8)), var9 + (var5.field_a + 14), ((jo) this).field_i.c(var4, 2271));
                      break L1;
                    } else {
                      ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -10].b(var5.field_c - -64 + (-18 - -var8), 32 + var5.field_a + (-18 + var9), ((jo) this).field_i.c(var4, 2271));
                      break L1;
                    }
                  } else {
                    ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -5].b(var8 + 64 + var5.field_c + -18, var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4, 2271));
                    break L1;
                  }
                }
              } else {
                if (var9 < 0) {
                  if (var6 % 3.141592653589793 > 2.0943951023931953) {
                    hha.field_y[10 + (((jo) this).field_i.field_L >> 3) % 5].a(-18 + (var5.field_c + 64 - -var8), var9 + -18 + (32 + var5.field_a));
                    break L1;
                  } else {
                    if (var6 % 3.141592653589793 <= 1.0471975511965976) {
                      hha.field_y[5 + (((jo) this).field_i.field_L >> 3) % 5].a(-18 + var5.field_c + 64 + var8, var5.field_a + 14 - -var9);
                      break L1;
                    } else {
                      hha.field_y[(((jo) this).field_i.field_L >> 3) % 5].a(var8 + (var5.field_c + 64) + -18, var5.field_a + 14 - -var9);
                      break L1;
                    }
                  }
                } else {
                  if (var6 % 3.141592653589793 <= 2.0943951023931953) {
                    if (1.0471975511965976 >= var6 % 3.141592653589793) {
                      ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -10].a(var8 + 64 + var5.field_c - 18, var9 + (var5.field_a + 14));
                      break L1;
                    } else {
                      ik.field_h[(((jo) this).field_i.field_L >> 3) % 5].a(var8 + -18 + (64 + var5.field_c), var9 + var5.field_a + 14);
                      break L1;
                    }
                  } else {
                    ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -5].a(64 + (var5.field_c + -18 - -var8), var9 + (var5.field_a + 14));
                    break L1;
                  }
                }
              }
            }
            return;
          } else {
            var12 = var10[var11];
            if (param0 == var12[0]) {
              if (var12[1] == param2) {
                var4 = var12[2];
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
        ad[] var3_array = null;
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
            L1: {
              if (((jo) this).field_i.field_P != null) {
                param1 = ((jo) this).a(((jo) this).field_i.field_P.field_s.field_J, (byte) 49, ((jo) this).field_i.field_P.field_s.field_x);
                this.b(25443, param1);
                ((jo) this).field_n.e(param1.field_c - -2, param1.field_a - 52, 32 + ((jo) this).field_n.field_q, 32 + ((jo) this).field_n.field_p, 192);
                break L1;
              } else {
                break L1;
              }
            }
            var3_array = ((jo) this).field_e;
            var4 = 0;
            L2: while (true) {
              if (~var4 <= ~var3_array.length) {
                break L0;
              } else {
                L3: {
                  var5 = var3_array[var4];
                  if (var5 != null) {
                    L4: {
                      if (!((jo) this).field_i.field_h.field_a[var5.field_s.field_x][var5.field_s.field_J].field_d) {
                        break L4;
                      } else {
                        if (((jo) this).field_i.field_n != var5.field_s.field_D) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      var6 = var5.field_s;
                      param1 = this.a((byte) 106, var5);
                      if (var5.field_s.i(126)) {
                        break L5;
                      } else {
                        if (39 == var6.field_y) {
                          od.field_C.a(param1.field_c, param1.field_a - 64);
                          break L5;
                        } else {
                          if (var6.field_y == 2) {
                            ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 8].e(42 + param1.field_c, param1.field_a + -42);
                            break L5;
                          } else {
                            if (29 != var6.field_y) {
                              if (var6.field_y == 1) {
                                ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 4].e(42 + param1.field_c, -42 + param1.field_a);
                                break L5;
                              } else {
                                if (var6.field_y != 12) {
                                  if (var6.field_y != 37) {
                                    break L5;
                                  } else {
                                    ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                                    break L5;
                                  }
                                } else {
                                  ala.field_a[12 + (((jo) this).field_i.field_L >> 2) % 4].e(param1.field_c + 42, -42 + param1.field_a);
                                  break L5;
                                }
                              }
                            } else {
                              ala.field_a[(((jo) this).field_i.field_L >> 2) % 4].e(param1.field_c + 42, -42 + param1.field_a);
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    L6: {
                      this.a(16429, var5, param1);
                      if (var5.field_j > 0) {
                        var7_int = 50;
                        var8 = param1.field_c + (128 - var7_int >> 1);
                        var9 = param1.field_a + -14;
                        var10 = (int)((double)var5.field_j / (double)var6.field_t * 100.0);
                        dg.b(-14 + var8, var9, 13, 65793);
                        cfa.a(var10, 13574, 14.199999809265137f, var8 - 14, ((jo) this).field_i.c(var6.field_D, 2271), var9);
                        var11 = var6.field_t / 10;
                        var12 = 6.283185307179586 / (double)var11;
                        var14_double = 0.0;
                        L7: while (true) {
                          if (var11 < 0) {
                            L8: {
                              L9: {
                                sia.field_g.e(-28 + var8, var9 - 14);
                                if (((jo) this).field_i.b(var5, true) == null) {
                                  break L9;
                                } else {
                                  if (~var5.field_s.field_D == ~((jo) this).field_i.field_n) {
                                    L10: {
                                      ad.field_h.a("" + var6.field_v, -16 + var8 - -2, -26 + (30 + var9), 2 + var6.field_D, -1);
                                      var14 = ((jo) this).field_i.b(var5, true).field_g;
                                      stackOut_35_0 = var9 - 15;
                                      stackIn_37_0 = stackOut_35_0;
                                      stackIn_36_0 = stackOut_35_0;
                                      if (((jo) this).field_i.field_L % 128 >= 64) {
                                        stackOut_37_0 = stackIn_37_0;
                                        stackOut_37_1 = -(((jo) this).field_i.field_L % 128) + 127;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackIn_38_1 = stackOut_37_1;
                                        break L10;
                                      } else {
                                        stackOut_36_0 = stackIn_36_0;
                                        stackOut_36_1 = ((jo) this).field_i.field_L % 128;
                                        stackIn_38_0 = stackOut_36_0;
                                        stackIn_38_1 = stackOut_36_1;
                                        break L10;
                                      }
                                    }
                                    int discarded$1 = -60;
                                    cba.a(stackIn_38_0, stackIn_38_1 * 4, -29 + var8, var14);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ad.field_h.a("" + var6.field_v, var8 - 14, var9 + 4, var6.field_D + 2, -1);
                              break L8;
                            }
                            L11: {
                              if (((jo) this).field_i.field_h.field_o != 3) {
                                break L11;
                              } else {
                                if (!var6.g((byte) 85)) {
                                  break L11;
                                } else {
                                  var14 = (int)(15.0 * Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (var6.field_x * var6.field_J << 2)) / 40.0)));
                                  pm.field_v[(((jo) this).field_i.field_L >> 2) % 2].a(72 + param1.field_c, var14 + (param1.field_a + -32));
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
                                  lga.field_k.e(15 + param1.field_c, param1.field_a + 2);
                                  am.field_M[pna.field_zb[var5.field_s.field_y].field_i].e(param1.field_c - -17, param1.field_a + 4);
                                  break L12;
                                }
                              }
                            }
                            if (!var5.field_s.i(-89)) {
                              if (var5.field_s.field_y == 39) {
                                hr.field_c.a(param1.field_c, param1.field_a + -64, 192);
                                break L6;
                              } else {
                                if (var5.field_s.field_y == 2) {
                                  dg.a(param1.field_c - -42, param1.field_a - 28, param1.field_c - -88, param1.field_a);
                                  ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 8].e(42 + param1.field_c, param1.field_a - 42);
                                  dg.c();
                                  break L6;
                                } else {
                                  if (var5.field_s.field_y != 29) {
                                    if (1 != var5.field_s.field_y) {
                                      if (var5.field_s.field_y != 12) {
                                        if (var5.field_s.field_y != 37) {
                                          break L6;
                                        } else {
                                          dg.a(param1.field_c - -42, param1.field_a + -28, param1.field_c + 88, param1.field_a);
                                          ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                                          dg.c();
                                          break L6;
                                        }
                                      } else {
                                        dg.a(param1.field_c - -42, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                                        ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 12].e(42 + param1.field_c, -42 + param1.field_a);
                                        dg.c();
                                        break L6;
                                      }
                                    } else {
                                      dg.a(param1.field_c - -42, -28 + param1.field_a, param1.field_c - -88, param1.field_a);
                                      ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 4].e(param1.field_c + 42, -42 + param1.field_a);
                                      dg.c();
                                      break L6;
                                    }
                                  } else {
                                    dg.a(42 + param1.field_c, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                                    ala.field_a[0 - -((((jo) this).field_i.field_L >> 2) % 4)].e(param1.field_c - -42, -42 + param1.field_a);
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
                    var7 = (vca) (Object) var5.field_t.b((byte) 90);
                    L13: while (true) {
                      if (var7 == null) {
                        break L3;
                      } else {
                        var7.a(-40 + param1.field_a - -32, param1.field_c + 64, false);
                        var7 = (vca) (Object) var5.field_t.c(0);
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var3;
            stackOut_64_1 = new StringBuilder().append("jo.EA(").append(-116).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L14;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
        }
    }

    private final void a(boolean param0, sfa param1) {
        RuntimeException var3 = null;
        gm var3_ref = null;
        ad var4 = null;
        aga var5 = null;
        int var6 = 0;
        int var7 = 0;
        aj var8 = null;
        aj var9 = null;
        int var10 = 0;
        gm var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 instanceof gm) {
                L2: {
                  var11 = (gm) (Object) param1;
                  var3_ref = var11;
                  var4 = ((jo) this).field_i.field_G[var11.field_h.field_f];
                  var5 = var4.field_s;
                  var6 = var3_ref.field_l;
                  var7 = var3_ref.field_i;
                  var8 = new aj(((jo) this).a(var5.field_J, (byte) 36, var5.field_x));
                  if (3 != var7) {
                    if (var7 != 1) {
                      if (var7 != 2) {
                        if (var7 != 4) {
                          var9 = new aj(((jo) this).a(var5.field_J, (byte) 86, var5.field_x));
                          break L2;
                        } else {
                          var9 = ((jo) this).a(var5.field_J, (byte) -89, var5.field_x - -var6);
                          break L2;
                        }
                      } else {
                        var9 = ((jo) this).a(var5.field_J, (byte) -90, -var6 + var5.field_x);
                        break L2;
                      }
                    } else {
                      var9 = ((jo) this).a(-var6 + var5.field_J, (byte) -105, var5.field_x);
                      break L2;
                    }
                  } else {
                    var9 = ((jo) this).a(var6 + var5.field_J, (byte) 120, var5.field_x);
                    break L2;
                  }
                }
                this.a(var5, var8, -32, var9, var7);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("jo.U(").append(1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 2962) {
            ((jo) this).field_E = null;
        }
        ((jo) this).field_B = ((jo) this).field_B + param1;
        ((jo) this).field_b = ((jo) this).field_b + param0;
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
        L0: {
          var10 = BachelorFridge.field_y;
          ((jo) this).field_e = new ad[7 * ((jo) this).field_i.field_h.field_d];
          var11 = new int[7 * ((jo) this).field_i.field_h.field_d];
          var2 = var11;
          if (param0 == -22048) {
            break L0;
          } else {
            ((jo) this).field_m = null;
            break L0;
          }
        }
        bl.a(var11, 0, var11.length, 2147483646);
        var3 = 0;
        var4 = ((jo) this).field_i.field_o;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            dk.a((Object[]) (Object) ((jo) this).field_e, (byte) 101, var2);
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
                    ((jo) this).field_e[var3] = var9;
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
              if (((jo) this).field_q == -1) {
                break L1;
              } else {
                if (-1 != ((jo) this).field_r) {
                  L2: {
                    param1 = ((jo) this).a(((jo) this).field_r, (byte) -97, ((jo) this).field_q);
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
                      ((jo) this).a((byte) -63, -5, -59);
                      break L3;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("jo.JA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    final aj a(boolean param0, int param1, int param2) {
        if (param0) {
            ((jo) this).field_H = null;
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
              param0.a(-1, ((-param1 + param2) * 128 >> 17) + ((jo) this).field_b, (64 * (param2 - -param1) >> 17) + ((jo) this).field_B);
              if (param3 <= -47) {
                break L1;
              } else {
                ((jo) this).field_n = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jo.V(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        ((jo) this).field_b = param0;
        if (param3 != -71) {
            return;
        }
        ((jo) this).field_B = param1;
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
        int stackIn_34_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
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
                if (((jo) this).field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n != 21) {
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
                if (!((jo) this).field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_d) {
                  break L4;
                } else {
                  if (((jo) this).field_i.field_n != param1.field_s.field_D) {
                    return;
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
                  var6 = var6 - (var11 * 6 >> 16);
                  var7 = var7 - (var11 * 4 >> 16);
                  var5 = var5 - (var11 * 4 >> 16);
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
                  var6 = var6 - (3 * var11 >> 1);
                  var7 = var7 - (2 * var11 >> 1);
                  break L6;
                } else {
                  break L6;
                }
              }
              var19 = (gca) (Object) param1.field_n.b((byte) 90);
              L8: while (true) {
                if (var19 == null) {
                  L9: {
                    if (0 >= var6) {
                      break L9;
                    } else {
                      if (var7 > 0) {
                        nk.a(((jo) this).field_y, param2.field_c + 64 + -(var6 >> 1), -(var7 >> 1) + param2.field_a - (-param1.field_k - 24), var6, var7);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var8.field_s != 1) {
                      if (var8.field_s == 4) {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L10;
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_34_0 = stackOut_31_0;
                        break L10;
                      }
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_34_0 = stackOut_29_0;
                      break L10;
                    }
                  }
                  L11: {
                    var12 = stackIn_34_0;
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
                        var13 = bd.field_i.field_p * (var13 + -128) >> 8;
                        var14 = var9.e(124);
                        if (var12 == 0) {
                          break L13;
                        } else {
                          var14.e();
                          break L13;
                        }
                      }
                      var17 = lq.a(((jo) this).field_k.field_b[93], 8533, var14, -60 + var13, 0);
                      var15 = bd.field_i;
                      bd.field_i = var17;
                      var9.a(0, 2048, 2048, (byte) 123, false, 255, var5, var4_int);
                      bd.field_i = var15;
                      break L11;
                    }
                  }
                  var19 = (gca) (Object) param1.field_n.b((byte) 90);
                  L14: while (true) {
                    if (var19 == null) {
                      break L0;
                    } else {
                      var19.a(120 + var5, (byte) 72, 76 + var4_int);
                      var19 = (gca) (Object) param1.field_n.c(0);
                      continue L14;
                    }
                  }
                } else {
                  var19.a(120 + var5, 76 + var4_int, (byte) -34);
                  var19 = (gca) (Object) param1.field_n.c(0);
                  continue L8;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var4;
            stackOut_46_1 = new StringBuilder().append("jo.J(").append(16429).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L15;
            }
          }
          L16: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7 = 0;
        int var8 = 0;
        var3 = ((jo) this).field_i.field_h.field_c[param0][0];
        var5 = -101 % ((18 - param1) / 36);
        var4 = ((jo) this).field_i.field_h.field_c[param0][1];
        if (-1 == var3) {
          return;
        } else {
          L0: {
            if (-1 == var4) {
              break L0;
            } else {
              if (((jo) this).field_i.field_h.field_z <= var3) {
                break L0;
              } else {
                if (((jo) this).field_i.field_h.field_B > var4) {
                  if (((jo) this).field_i.field_h.field_a[var3][var4].field_l == null) {
                    L1: {
                      var6 = ((jo) this).a(var4, (byte) -95, var3);
                      var7 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (var4 * var3 << 2)) / 40.0)) * 30.0);
                      var8 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L - -(var3 * var4 << 2)) / 40.0)) * 15.0);
                      if (var8 >= 0) {
                        hb.field_k[(((jo) this).field_i.field_L >> 2) % 2].b(var6.field_c + 56 - -var7, var8 + (var6.field_a - 16), ((jo) this).field_i.c(param0, 2271));
                        break L1;
                      } else {
                        pm.field_v[(((jo) this).field_i.field_L >> 2) % 2].b(64 + var6.field_c - (8 - var7), var6.field_a + (-16 + var8), ((jo) this).field_i.c(param0, 2271));
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

    private final void b() {
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
        var13 = BachelorFridge.field_y;
        var2 = ((jo) this).field_i.field_h.field_z;
        var3 = ((jo) this).field_i.field_h.field_B;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var4++;
                continue L0;
              } else {
                var6 = ((jo) this).field_i.field_h.field_a[var4][var5];
                if (33 == var6.field_n) {
                  L2: {
                    var7 = 4 - var6.field_j;
                    var8 = (2 + var6.field_j) * 32;
                    var9 = var4 - var7;
                    var10 = 1 + (var7 + var4);
                    var11 = -var7 + var5;
                    if (var11 >= 0) {
                      break L2;
                    } else {
                      var11 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    if (var2 >= var10) {
                      break L3;
                    } else {
                      var10 = var2;
                      break L3;
                    }
                  }
                  L4: {
                    if (var9 >= 0) {
                      break L4;
                    } else {
                      var9 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = var7 + (var5 + 1);
                    if (var3 < var12) {
                      var12 = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.a(var8, var11, var10, var9, var12, (byte) -106);
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
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
        int var13 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param4.field_p) {
                break L0;
              } else {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= param4.field_q) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      var9 = param4.field_v[var6_int];
                      if (0 == var9) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var8++;
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("jo.W(").append(-64).append(44).append(-115).append(44).append(1).append(44).append(2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
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
        int var24 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var24 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = param1.field_c - -64;
              var7 = param1.field_a - -32;
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
                    L8: {
                      var18 = (-var7 + var16) * var15 + var14 * (var17 + -var6_int);
                      var19 = var14 * (var17 + -var6_int) + -(var15 * (-var7 + var16));
                      var20 = (var8 + -var6_int) * var14 - -(var15 * (var9 - var7));
                      if (32 > var18) {
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var17++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("jo.CA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44).append(-32).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param4 + 41);
        }
    }

    final void c(int param0, int param1, int param2) {
        ((jo) this).field_b = param2;
        if (param0 <= 0) {
            ((jo) this).field_G = null;
        }
        ((jo) this).field_B = param1;
        this.a((byte) -96);
    }

    private final void c(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        var4 = BachelorFridge.field_y;
        ((jo) this).field_p = tf.a((byte) 119, 3, 3, 127, 64);
        ((jo) this).field_o = new kv(128, 64);
        ((jo) this).field_o.b();
        ((jo) this).field_u = new kv(128, 64);
        ((jo) this).field_u.b();
        ((jo) this).field_p.e(0, 0, 33023);
        ((jo) this).field_C = new kv(128, 64);
        ((jo) this).field_C.b();
        ((jo) this).field_p.e(0, 0, 16776960);
        ((jo) this).field_m = new kv(128, 64);
        ((jo) this).field_m.b();
        ((jo) this).field_p.e(0, 0, 16777215);
        ((jo) this).field_g = new kv(128, 64);
        ((jo) this).field_g.b();
        ((jo) this).field_p.e(0, 0, 16711680);
        ((jo) this).field_f = new kv(128, 64);
        ((jo) this).field_f.b();
        ((jo) this).field_p.e(0, 0, 8454016);
        ((jo) this).field_y = new kv(49, 49);
        var5 = new int[256];
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 256) {
            L1: {
              ((jo) this).field_y.b();
              dg.a(400, 400, 384, 128, var2);
              ((jo) this).field_x = new kv(128, 64);
              ((jo) this).field_x.b();
              ((jo) this).field_p.e(0, 0, 2302755);
              ((jo) this).field_c = new kv(128, 64);
              ((jo) this).field_c.b();
              ((jo) this).field_p.e(0, 0, 16711680);
              ((jo) this).field_w = new kv[4];
              if (param0 == -124) {
                break L1;
              } else {
                ((jo) this).field_v = null;
                break L1;
              }
            }
            var6 = 0;
            var3 = var6;
            L2: while (true) {
              if (var6 >= 4) {
                ((jo) this).field_n = new kv(84, 84);
                ((jo) this).field_n.b();
                dg.a(672, 672, 672, 128, var2);
                ((jo) this).field_A = new kv(128, 64);
                ((jo) this).field_A.b();
                ((jo) this).field_p.c(0, 0, 65280);
                ((jo) this).field_H = ((jo) this).field_A.a();
                this.a(-64, (byte) -115, 1, 2, ((jo) this).field_H);
                ((jo) this).field_E = ((jo) this).field_A.a();
                this.a(64, -1, ((jo) this).field_E, -64, 1, (byte) -127, 2, 2);
                ((jo) this).field_l = ((jo) this).field_A.a();
                this.a(192, -1, ((jo) this).field_l, 64, -1, (byte) -100, 2, -2);
                hga.field_U.a((byte) 126);
                return;
              } else {
                ((jo) this).field_w[var6] = new kv(128, 64);
                ((jo) this).field_w[var6].b();
                ((jo) this).field_p.e(0, 0, ((jo) this).field_i.c(var6, 2271));
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
        return (int)(Math.pow(2.0, (double)((float)(-param0) / 10.239999771118164f)) * 256.0);
    }

    private final void a(int param0, int param1, kv param2, int param3, int param4, byte param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var18 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var9_int = 0;
            if (param5 <= -79) {
              var10 = 0;
              L1: while (true) {
                if (param2.field_p <= var10) {
                  break L0;
                } else {
                  var11 = 0;
                  L2: while (true) {
                    if (param2.field_q <= var11) {
                      var10++;
                      continue L1;
                    } else {
                      L3: {
                        var12 = param2.field_v[var9_int];
                        if (var12 == 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var11++;
                      var9_int++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var9;
            stackOut_12_1 = new StringBuilder().append("jo.GA(").append(param0).append(44).append(-1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + 2 + 44 + param7 + 41);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = -16384 + 64 * ((jo) this).field_b + (128 * ((jo) this).field_B - 30720);
          var2 = var3;
          var4 = -4096 + ((jo) this).field_B * 128 + (((jo) this).field_b * -64 + 20480) - 30720;
          if (0 < var2) {
            ((jo) this).field_b = ((jo) this).field_b - (var2 / 64 >> 1);
            ((jo) this).field_B = ((jo) this).field_B - (var2 / 128 >> 1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = var3 + 8192 * ((jo) this).field_a;
          if (var2 < 0) {
            ((jo) this).field_B = ((jo) this).field_B - (var2 / 128 >> 1);
            ((jo) this).field_b = ((jo) this).field_b - (var2 / 64 >> 1);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var5 = 68 / ((-31 - param0) / 57);
          var2 = var4;
          if (var2 <= 0) {
            break L2;
          } else {
            ((jo) this).field_b = ((jo) this).field_b + (var2 / 64 >> 1);
            ((jo) this).field_B = ((jo) this).field_B - (var2 / 128 >> 1);
            break L2;
          }
        }
        L3: {
          var2 = var4 - -(((jo) this).field_z * 8192);
          if (var2 >= 0) {
            break L3;
          } else {
            ((jo) this).field_b = ((jo) this).field_b + (var2 / 64 >> 1);
            ((jo) this).field_B = ((jo) this).field_B - (var2 / 128 >> 1);
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
          if (2 + ((jo) this).field_a <= var2) {
            var2 = 0;
            L1: while (true) {
              if (1 + ((jo) this).field_a <= var2) {
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
                  if (var2 >= ((jo) this).field_a + 1) {
                    var2 = 0;
                    L4: while (true) {
                      if (~var2 <= ~(((jo) this).field_a + 1)) {
                        return;
                      } else {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 1 + ((jo) this).field_z) {
                            var2++;
                            continue L4;
                          } else {
                            L6: {
                              var4 = 0;
                              if (var2 >= ((jo) this).field_a) {
                                break L6;
                              } else {
                                if (var3 >= ((jo) this).field_z) {
                                  break L6;
                                } else {
                                  if (((jo) this).field_I[var2][var3].field_n != 30) {
                                    break L6;
                                  } else {
                                    var4 += 4;
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              if (~var3 <= ~((jo) this).field_z) {
                                break L7;
                              } else {
                                if (var2 <= 0) {
                                  break L7;
                                } else {
                                  if (((jo) this).field_I[var2 - 1][var3].field_n == 30) {
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
                                if (var3 <= 0) {
                                  break L8;
                                } else {
                                  if (30 != ((jo) this).field_I[-1 + var2][-1 + var3].field_n) {
                                    break L8;
                                  } else {
                                    var4++;
                                    break L8;
                                  }
                                }
                              }
                            }
                            L9: {
                              if (~((jo) this).field_a >= ~var2) {
                                break L9;
                              } else {
                                if (var3 <= 0) {
                                  break L9;
                                } else {
                                  if (((jo) this).field_I[var2][-1 + var3].field_n != 30) {
                                    break L9;
                                  } else {
                                    var4 += 2;
                                    break L9;
                                  }
                                }
                              }
                            }
                            L10: {
                              if (0 < var4) {
                                ((jo) this).field_j[var2][var3].field_n = 30;
                                ((jo) this).field_j[var2][var3].field_k = var4;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var3++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var3 = 0;
                    L11: while (true) {
                      if (((jo) this).field_z - -1 <= var3) {
                        var2++;
                        continue L3;
                      } else {
                        L12: {
                          var4 = 0;
                          if (((jo) this).field_a <= var2) {
                            break L12;
                          } else {
                            if (~((jo) this).field_z >= ~var3) {
                              break L12;
                            } else {
                              if (29 != ((jo) this).field_I[var2][var3].field_n) {
                                break L12;
                              } else {
                                var4 += 4;
                                break L12;
                              }
                            }
                          }
                        }
                        L13: {
                          if (((jo) this).field_z <= var3) {
                            break L13;
                          } else {
                            if (var2 <= 0) {
                              break L13;
                            } else {
                              if (((jo) this).field_I[var2 + -1][var3].field_n != 29) {
                                break L13;
                              } else {
                                var4 += 8;
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (var2 <= 0) {
                            break L14;
                          } else {
                            if (var3 <= 0) {
                              break L14;
                            } else {
                              if (((jo) this).field_I[var2 - 1][-1 + var3].field_n == 29) {
                                var4++;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          if (((jo) this).field_a <= var2) {
                            break L15;
                          } else {
                            if (var3 <= 0) {
                              break L15;
                            } else {
                              if (((jo) this).field_I[var2][-1 + var3].field_n != 29) {
                                break L15;
                              } else {
                                var4 += 2;
                                break L15;
                              }
                            }
                          }
                        }
                        L16: {
                          if (var4 > 0) {
                            ((jo) this).field_j[var2][var3].field_n = 29;
                            ((jo) this).field_j[var2][var3].field_k = var4;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var3++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var3 = 0;
                L17: while (true) {
                  if (var3 >= 1 + ((jo) this).field_z) {
                    var2++;
                    continue L1;
                  } else {
                    L18: {
                      var4 = 0;
                      if (~var2 <= ~((jo) this).field_a) {
                        break L18;
                      } else {
                        if (((jo) this).field_z <= var3) {
                          break L18;
                        } else {
                          if (!((jo) this).field_I[var2][var3].field_i) {
                            break L18;
                          } else {
                            var4 += 4;
                            break L18;
                          }
                        }
                      }
                    }
                    L19: {
                      if (var3 >= ((jo) this).field_z) {
                        break L19;
                      } else {
                        if (var2 <= 0) {
                          break L19;
                        } else {
                          if (((jo) this).field_I[var2 - 1][var3].field_i) {
                            var4 += 8;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    L20: {
                      if (0 >= var2) {
                        break L20;
                      } else {
                        if (0 >= var3) {
                          break L20;
                        } else {
                          if (((jo) this).field_I[-1 + var2][var3 - 1].field_i) {
                            var4++;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      if (~((jo) this).field_a >= ~var2) {
                        break L21;
                      } else {
                        if (0 >= var3) {
                          break L21;
                        } else {
                          if (!((jo) this).field_I[var2][-1 + var3].field_i) {
                            break L21;
                          } else {
                            var4 += 2;
                            break L21;
                          }
                        }
                      }
                    }
                    L22: {
                      if (var4 <= 0) {
                        break L22;
                      } else {
                        ((jo) this).field_j[var2][var3].field_n = 1;
                        ((jo) this).field_j[var2][var3].field_k = var4;
                        break L22;
                      }
                    }
                    var3++;
                    continue L17;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L23: while (true) {
              if (~var3 <= ~(2 + ((jo) this).field_z)) {
                var2++;
                continue L0;
              } else {
                ((jo) this).field_j[var2][var3].field_n = 0;
                var3++;
                continue L23;
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
                var3_int = (param0.field_s.field_x << 16) + param0.field_o;
                var4 = (param0.field_s.field_J << 16) - -param0.field_r;
                ((jo) this).field_b = -(128 * (var3_int - var4) >> 17) + 256;
                ((jo) this).field_B = 208 + -((var4 + var3_int) * 64 >> 17);
                ((jo) this).field_B = ((jo) this).field_B + param0.field_k;
                this.a((byte) -89);
                if (param1 >= 87) {
                  break L1;
                } else {
                  ((jo) this).field_b = -9;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jo.MA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, aj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = ((jo) this).a(((jo) this).field_r, (byte) -95, ((jo) this).field_q);
                if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-97)) {
                  break L2;
                } else {
                  if (((jo) this).field_i.field_h.a((byte) -101, ((jo) this).field_i.field_n, ((jo) this).field_q, ((jo) this).field_r)) {
                    break L2;
                  } else {
                    ((jo) this).field_m.a(param1.field_c + 1, param1.field_a + 1, 64);
                    break L1;
                  }
                }
              }
              ((jo) this).field_g.a(param1.field_c - -1, 1 + param1.field_a, 64);
              break L1;
            }
            var3_int = ((jo) this).field_i.field_L >> 2;
            var4 = 16777215;
            var5 = 192;
            var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a, param1.field_c + 128, 12175, var3_int, param1.field_a - -32, var5);
            var3_int = lw.a(5, 128 + param1.field_c, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, param1.field_a - -64, var5);
            var3_int = lw.a(5, param1.field_c - -64, var4, param1.field_a - -64, param1.field_c, 12175, var3_int, 32 + param1.field_a, var5);
            var3_int = lw.a(5, param1.field_c, var4, param1.field_a - -32, param1.field_c - -64, 12175, var3_int, param1.field_a, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jo.IA(").append(2024848226).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7_int = 0;
        int[][] var7 = null;
        ad var7_ref = null;
        int[] var8 = null;
        int var8_int = 0;
        aga var8_ref = null;
        hd var8_ref2 = null;
        tia var8_ref3 = null;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        sfa var9_ref_sfa = null;
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
        at var25 = null;
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
          var24 = null;
          var23 = BachelorFridge.field_y;
          var2 = 0;
          dg.c(0, 0, 640, 480, 2434341);
          var3 = (int)(Math.sin(0.5 * ((double)((jo) this).field_i.field_L / 10.0)) * 5.0);
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
          if (((jo) this).field_i.field_U <= 0) {
            break L1;
          } else {
            var5 = ((jo) this).field_i.field_L % 128;
            var4 = ((jo) this).field_i.field_L / 128 % (((jo) this).field_i.field_U + 1);
            var5 = (int)(Math.cos((double)var5 / 5.0 * 0.5) * 5.0);
            break L1;
          }
        }
        var6 = ((jo) this).a(((jo) this).field_r, (byte) 116, ((jo) this).field_q);
        this.a(var6, param0 + 32096);
        this.a(false, var6);
        var7_int = 0;
        L2: while (true) {
          if (((jo) this).field_G.length <= var7_int) {
            L3: {
              if (((jo) this).field_d <= 0) {
                break L3;
              } else {
                L4: {
                  var6 = ((jo) this).a(-3, (byte) -97, (((jo) this).field_i.field_h.field_z >> 1) - 1);
                  du.field_b.a(-42 + var6.field_c, -((jo) this).field_d + 106 + var6.field_a);
                  var7_int = var3;
                  if (mk.field_p == -1) {
                    break L4;
                  } else {
                    var7_int = -6 + (6 * mk.field_p / 640 + 6 * gd.field_m / 480);
                    break L4;
                  }
                }
                lu.field_f.a(-16 + (var6.field_c - -var7_int), var6.field_a - (-106 + ((jo) this).field_d) - -(var7_int >> 1));
                break L3;
              }
            }
            ((jo) this).field_k.b((jo) this, param0 ^ 18776);
            ((jo) this).field_k.a((jo) this, (byte) 117);
            var7_int = 0;
            L5: while (true) {
              if (((jo) this).field_a <= var7_int) {
                var7_int = 0;
                L6: while (true) {
                  if (((jo) this).field_a <= var7_int) {
                    L7: {
                      if (((jo) this).field_i.field_h.field_o == 2) {
                        var7 = ((jo) this).field_i.field_h.field_i;
                        var8_int = 0;
                        L8: while (true) {
                          if (var8_int >= var7.length) {
                            break L7;
                          } else {
                            var9_ref_int__ = var7[var8_int];
                            this.b(var9_ref_int__[0], (byte) 80, var9_ref_int__[1]);
                            var8_int++;
                            continue L8;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    var7_int = 0;
                    L9: while (true) {
                      if (((jo) this).field_a <= var7_int) {
                        var7_int = 0;
                        L10: while (true) {
                          if (var7_int >= ((jo) this).field_z) {
                            L11: {
                              int discarded$1 = 24731;
                              this.b();
                              var7_ref = ((jo) this).field_i.field_P;
                              if (var7_ref == null) {
                                break L11;
                              } else {
                                if (!((jo) this).field_i.field_l) {
                                  break L11;
                                } else {
                                  L12: {
                                    var8_int = 1;
                                    var9 = 0;
                                    var10 = 0;
                                    var12 = 0;
                                    var11_int = 0;
                                    var13 = var7_ref.field_s.f((byte) 122);
                                    var14_ref_tv = (tv) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                    if (!hl.a((byte) 109, ((jo) this).field_i.field_Z.field_g)) {
                                      break L12;
                                    } else {
                                      var13 = var13 << 1;
                                      var13 = var13 + var14_ref_tv.field_l;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var7_ref.field_s.field_y != 32) {
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
                                    var16 = var7_ref.field_s.field_x;
                                    var17 = var7_ref.field_s.field_J;
                                    if (var15 != 0) {
                                      break L14;
                                    } else {
                                      if (((jo) this).field_i.field_h.field_E != 0) {
                                        break L14;
                                      } else {
                                        if (((jo) this).field_i.field_h.field_a[var16][var17].field_i) {
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
                                                    if (!((jo) this).field_I[var16 + -var8_int][var17].e(-53)) {
                                                      break L19;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -98, ((jo) this).field_i.field_n, -var8_int + var16, var17)) {
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
                                              var6 = ((jo) this).a(var17, (byte) -100, var16 - var8_int);
                                              ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                              if (-var8_int + var16 != ((jo) this).field_q) {
                                                break L16;
                                              } else {
                                                if (var17 != ((jo) this).field_r) {
                                                  break L16;
                                                } else {
                                                  var2 = 1;
                                                  this.a(true, var6, 18503);
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
                                            if (-var8_int + var17 < 0) {
                                              break L21;
                                            } else {
                                              L22: {
                                                if (var15 != 0) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (!((jo) this).field_I[var16][-var8_int + var17].e(-30)) {
                                                      break L23;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -127, ((jo) this).field_i.field_n, var16, -var8_int + var17)) {
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
                                              var6 = ((jo) this).a(var17 - var8_int, (byte) -100, var16);
                                              ((jo) this).field_u.a(var6.field_c, var6.field_a, 128 + -(10 * var3));
                                              if (((jo) this).field_q != var16) {
                                                break L20;
                                              } else {
                                                if (((jo) this).field_r != var17 + -var8_int) {
                                                  break L20;
                                                } else {
                                                  this.a(true, var6, 18503);
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
                                            if (-1 + ((jo) this).field_a < var8_int + var16) {
                                              break L25;
                                            } else {
                                              L26: {
                                                if (var15 != 0) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (!((jo) this).field_I[var16 - -var8_int][var17].e(param0 + 32003)) {
                                                      break L27;
                                                    } else {
                                                      if (!((jo) this).field_i.field_h.a((byte) -100, ((jo) this).field_i.field_n, var8_int + var16, var17)) {
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
                                              var6 = ((jo) this).a(var17, (byte) -118, var16 + var8_int);
                                              ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                              if (var16 + var8_int != ((jo) this).field_q) {
                                                break L24;
                                              } else {
                                                if (var17 != ((jo) this).field_r) {
                                                  break L24;
                                                } else {
                                                  this.a(true, var6, param0 + 50598);
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
                                          if (((jo) this).field_z - 1 < var8_int + var17) {
                                            break L28;
                                          } else {
                                            L29: {
                                              if (var15 != 0) {
                                                break L29;
                                              } else {
                                                if (!((jo) this).field_I[var16][var17 - -var8_int].e(-78)) {
                                                  break L28;
                                                } else {
                                                  if (((jo) this).field_i.field_h.a((byte) -121, ((jo) this).field_i.field_n, var16, var17 + var8_int)) {
                                                    break L28;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                            }
                                            var6 = ((jo) this).a(var17 + var8_int, (byte) 83, var16);
                                            ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                            if (((jo) this).field_q == var16) {
                                              if (var17 + var8_int == ((jo) this).field_r) {
                                                var2 = 1;
                                                this.a(true, var6, 18503);
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
                              if (var7_ref == null) {
                                break L30;
                              } else {
                                if (!((jo) this).field_i.field_ab) {
                                  break L30;
                                } else {
                                  var8_ref = var7_ref.field_s;
                                  var6 = ((jo) this).a(var8_ref.field_J, (byte) -117, var8_ref.field_x);
                                  var9 = var8_ref.field_m[((jo) this).field_i.field_db];
                                  var10 = var8_ref.field_o.field_g.field_b[var9];
                                  var11 = (t) (Object) al.a(-83, var10);
                                  var12 = var8_ref.c(87, var10);
                                  var13 = var11.field_w;
                                  var14 = 0;
                                  var15 = -1;
                                  var16 = 0;
                                  var18 = 0;
                                  var17 = 0;
                                  var20 = 0;
                                  var19 = 0;
                                  var21 = var7_ref.field_s.field_x;
                                  var22 = var7_ref.field_s.field_J;
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
                                          if (var11.field_p == 3) {
                                            var16++;
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        this.a(var15, true, var11.field_r, var16, var7_ref.field_s.field_x, var7_ref.field_s.field_J, var5);
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
                                            if (var21 + -var13 >= 0) {
                                              L36: {
                                                var6 = ((jo) this).a(var22, (byte) 97, -var13 + var21);
                                                if (var21 - var13 != ((jo) this).field_q) {
                                                  break L36;
                                                } else {
                                                  if (var22 == ((jo) this).field_r) {
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
                                              ((jo) this).field_C.a(var6.field_c, var6.field_a, 64 + -(var3 * 10));
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
                                                var6 = ((jo) this).a(var22 + -var13, (byte) 32, var21);
                                                if (var21 != ((jo) this).field_q) {
                                                  break L39;
                                                } else {
                                                  if (((jo) this).field_r == -var13 + var22) {
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
                                              ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
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
                                            if (((jo) this).field_a + -1 < var13 + var21) {
                                              break L41;
                                            } else {
                                              L42: {
                                                var6 = ((jo) this).a(var22, (byte) 50, var21 + var13);
                                                if (((jo) this).field_q != var13 + var21) {
                                                  break L42;
                                                } else {
                                                  if (var22 == ((jo) this).field_r) {
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
                                              ((jo) this).field_C.a(var6.field_c, var6.field_a, -(var3 * 10) + 64);
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
                                          if (-1 + ((jo) this).field_z >= var22 + var13) {
                                            L44: {
                                              var6 = ((jo) this).a(var13 + var22, (byte) 104, var21);
                                              if (((jo) this).field_q != var21) {
                                                break L44;
                                              } else {
                                                if (var22 - -var13 == ((jo) this).field_r) {
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
                                            ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
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
                              if (var7_ref == null) {
                                break L45;
                              } else {
                                if (!((jo) this).field_i.field_w) {
                                  break L45;
                                } else {
                                  var8_ref2 = (hd) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                  if (0 != var8_ref2.c(0)) {
                                    if (2 != var8_ref2.c(param0 ^ -32095)) {
                                      if (3 != var8_ref2.c(0)) {
                                        break L45;
                                      } else {
                                        L46: {
                                          if (((jo) this).field_q == -1) {
                                            break L46;
                                          } else {
                                            if (-1 == ((jo) this).field_r) {
                                              break L46;
                                            } else {
                                              if (null != ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l) {
                                                this.a(true, var6, param0 + 50598);
                                                var2 = 1;
                                                break L46;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                        if (((jo) this).field_q == -1) {
                                          break L45;
                                        } else {
                                          if (((jo) this).field_r == -1) {
                                            break L45;
                                          } else {
                                            if (93 != var8_ref2.field_j) {
                                              break L45;
                                            } else {
                                              if (null == ((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 121)) {
                                                break L45;
                                              } else {
                                                if (((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 116).field_A) {
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
                                        if (((jo) this).field_q != 1 + var7_ref.field_s.field_x) {
                                          break L47;
                                        } else {
                                          if (var7_ref.field_s.field_J != ((jo) this).field_r) {
                                            break L47;
                                          } else {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          }
                                        }
                                      }
                                      L48: {
                                        if (((jo) this).field_q != var7_ref.field_s.field_x - 1) {
                                          break L48;
                                        } else {
                                          if (((jo) this).field_r != var7_ref.field_s.field_J) {
                                            break L48;
                                          } else {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          }
                                        }
                                      }
                                      L49: {
                                        if (var7_ref.field_s.field_x != ((jo) this).field_q) {
                                          break L49;
                                        } else {
                                          if (1 + var7_ref.field_s.field_J == ((jo) this).field_r) {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L45;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      if (var7_ref.field_s.field_x != ((jo) this).field_q) {
                                        break L45;
                                      } else {
                                        if (-1 + var7_ref.field_s.field_J != ((jo) this).field_r) {
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
                                      if (((jo) this).field_q == -1) {
                                        break L50;
                                      } else {
                                        if (((jo) this).field_r == -1) {
                                          break L50;
                                        } else {
                                          if (130 != var8_ref2.field_j) {
                                            break L50;
                                          } else {
                                            if (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l != null) {
                                              break L50;
                                            } else {
                                              if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-52)) {
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
                                    if (((jo) this).field_q == 0) {
                                      break L45;
                                    } else {
                                      if (0 == ((jo) this).field_r) {
                                        break L45;
                                      } else {
                                        if (var8_ref2.field_j != 130) {
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
                              if (((jo) this).field_i.field_Y.length <= var8_int) {
                                L52: {
                                  if (null == ((jo) this).field_i.field_Z) {
                                    break L52;
                                  } else {
                                    this.a(true, ((jo) this).field_i.field_Z);
                                    break L52;
                                  }
                                }
                                L53: {
                                  if (((jo) this).field_q == -1) {
                                    break L53;
                                  } else {
                                    if (-1 != ((jo) this).field_r) {
                                      L54: {
                                        if (((jo) this).field_i.field_J) {
                                          break L54;
                                        } else {
                                          if (null != ((jo) this).field_i.field_Z) {
                                            break L54;
                                          } else {
                                            if (0 == ((jo) this).field_i.field_M) {
                                              break L54;
                                            } else {
                                              this.a(2024848226, var6);
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                      if (((jo) this).field_i.field_Z == null) {
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
                                  if (3 != ((jo) this).field_i.field_h.field_o) {
                                    break L55;
                                  } else {
                                    var8_int = 0;
                                    L56: while (true) {
                                      if (((jo) this).field_i.field_h.field_c.length <= var8_int) {
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
                                  if (var8_int >= ((jo) this).field_i.field_h.field_z) {
                                    var8_int = 0;
                                    L58: while (true) {
                                      if (((jo) this).field_z <= var8_int) {
                                        var8_ref3 = (tia) (Object) ((jo) this).field_i.field_fb.b((byte) 90);
                                        L59: while (true) {
                                          if (var8_ref3 == null) {
                                            var25 = (at) (Object) ((jo) this).field_i.field_j.b((byte) 90);
                                            L60: while (true) {
                                              if (var25 == null) {
                                                return;
                                              } else {
                                                var25.c(-59);
                                                var25 = (at) (Object) ((jo) this).field_i.field_j.c(0);
                                                continue L60;
                                              }
                                            }
                                          } else {
                                            var6 = this.a((byte) 126, var8_ref3.field_h);
                                            var8_ref3.a(var6.field_a + 32, 25415, 64 + var6.field_c);
                                            var8_ref3 = (tia) (Object) ((jo) this).field_i.field_fb.c(0);
                                            continue L59;
                                          }
                                        }
                                      } else {
                                        var9 = 0;
                                        L61: while (true) {
                                          if (var9 >= ((jo) this).field_a) {
                                            var8_int++;
                                            continue L58;
                                          } else {
                                            var6 = ((jo) this).a(var8_int, (byte) 115, var9);
                                            if (((jo) this).field_i.field_D[var9][var8_int] != null) {
                                              ((jo) this).field_i.field_D[var9][var8_int].a(var6.field_a, true, var6.field_c);
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
                                      if (var9 >= ((jo) this).field_i.field_h.field_B) {
                                        var8_int++;
                                        continue L57;
                                      } else {
                                        var6 = ((jo) this).a(var9, (byte) 124, var8_int);
                                        if (((jo) this).field_i.field_h.field_a[var8_int][var9].field_d) {
                                          co.field_b[4].a(var6.field_c, -64 + (var6.field_a + (var3 >> 1)), 192);
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
                                var9_ref_sfa = ((jo) this).field_i.field_Y[var8_int];
                                if (var9_ref_sfa != null) {
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
                                  this.a(stackIn_219_1, stackIn_219_2, stackIn_219_3 != 0, var9_ref_sfa);
                                  this.a(true, var9_ref_sfa);
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
                              if (((jo) this).field_a <= var8_int) {
                                var7_int++;
                                continue L10;
                              } else {
                                var6 = ((jo) this).a(var7_int, (byte) -100, var8_int);
                                if (null != ((jo) this).field_i.field_D[var8_int][var7_int]) {
                                  ((jo) this).field_i.field_D[var8_int][var7_int].a(var6.field_a, 0, var6.field_c);
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
                          if (var8_int >= ((jo) this).field_z) {
                            var7_int++;
                            continue L9;
                          } else {
                            if (((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_m) {
                              if (!((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_d) {
                                var9 = od.field_w[((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_n].field_f;
                                var6 = ((jo) this).a(var8_int, (byte) -100, var7_int);
                                if (var9 != -1) {
                                  L66: {
                                    nk.a(((jo) this).field_y, 40 + var6.field_c, var6.field_a + 16, 38, 24);
                                    stackOut_53_0 = ve.field_m;
                                    stackIn_55_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (var9 < 4) {
                                      stackOut_55_0 = (kv[][]) (Object) stackIn_55_0;
                                      stackOut_55_1 = var9;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      break L66;
                                    } else {
                                      stackOut_54_0 = (kv[][]) (Object) stackIn_54_0;
                                      stackOut_54_1 = var9 + -4;
                                      stackIn_56_0 = stackOut_54_0;
                                      stackIn_56_1 = stackOut_54_1;
                                      break L66;
                                    }
                                  }
                                  ((kv) (Object) stackIn_56_0[stackIn_56_1][(((jo) this).field_i.field_L >> 2) % 25]).e(44 + var6.field_c, -var3 + var6.field_a - 4);
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
                      if (var8_int >= ((jo) this).field_z) {
                        var7_int++;
                        continue L6;
                      } else {
                        if (((jo) this).field_I[var7_int][var8_int].field_n == 22) {
                          var6 = ((jo) this).a(var8_int, (byte) 65, var7_int);
                          if (((jo) this).field_i.field_h.field_E != 1) {
                            if (((jo) this).field_i.field_h.field_E == 2) {
                              ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                              var8_int++;
                              continue L67;
                            } else {
                              if (((jo) this).field_i.field_h.field_E == 0) {
                                ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                                var8_int++;
                                continue L67;
                              } else {
                                var8_int++;
                                continue L67;
                              }
                            }
                          } else {
                            ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                            var8_int++;
                            continue L67;
                          }
                        } else {
                          if (39 == ((jo) this).field_I[var7_int][var8_int].field_n) {
                            var6 = ((jo) this).a(var8_int, (byte) -90, var7_int);
                            ip.field_f[1].e(var6.field_c - -32, var6.field_a - 32);
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
                  if (((jo) this).field_z <= var8_int) {
                    var7_int++;
                    continue L5;
                  } else {
                    if (((jo) this).field_i.field_h.a(var7_int, 120, ((jo) this).field_i.field_n, var8_int)) {
                      if (((jo) this).field_i.field_h.field_a[var7_int][var8_int].e(-111)) {
                        var6 = ((jo) this).a(var8_int, (byte) -98, var7_int);
                        ((jo) this).field_w[((jo) this).field_i.field_n].a(var6.field_c, var6.field_a, 64 + -(var3 * 10));
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
            var8 = ((jo) this).field_G[var7_int];
            var6 = ((jo) this).a(var8[2], (byte) 120, var8[1]);
            vc.field_d[var8[0]].e(var6.field_c, var6.field_a);
            var7_int++;
            continue L2;
          }
        }
    }

    final aj b(int param0, int param1, int param2) {
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param1 == 9) {
            break L0;
          } else {
            var8 = null;
            this.a(true, (sfa) null);
            break L0;
          }
        }
        var5 = -1 + ((jo) this).field_z;
        L1: while (true) {
          if (var5 >= 0) {
            var6 = -1 + ((jo) this).field_a;
            L2: while (true) {
              if (var6 < 0) {
                var5--;
                continue L1;
              } else {
                var4 = ((jo) this).a(var5, (byte) 100, var6);
                if (((jo) this).field_p.a(var4.field_c, var4.field_a, param0, param2)) {
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
        aj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 > 65) {
            break L0;
          } else {
            var6 = null;
            this.a(true, (aj) null);
            break L0;
          }
        }
        ((jo) this).field_h = -1;
        ((jo) this).field_s = -1;
        ((jo) this).field_q = -1;
        ((jo) this).field_r = -1;
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((jo) this).field_a) {
            L2: {
              if (((jo) this).field_q != -1) {
                if (-1 != ((jo) this).field_F) {
                  int fieldTemp$4 = ((jo) this).field_F + 1;
                  ((jo) this).field_F = ((jo) this).field_F + 1;
                  if (fieldTemp$4 < 120) {
                    break L2;
                  } else {
                    ((jo) this).field_F = -1;
                    break L2;
                  }
                } else {
                  if (-1 == ((jo) this).field_F) {
                    break L2;
                  } else {
                    int fieldTemp$5 = ((jo) this).field_F + 1;
                    ((jo) this).field_F = ((jo) this).field_F + 1;
                    if (fieldTemp$5 < 120) {
                      break L2;
                    } else {
                      ((jo) this).field_F = -1;
                      break L2;
                    }
                  }
                }
              } else {
                if (-1 != ((jo) this).field_F) {
                  int fieldTemp$6 = ((jo) this).field_F + 1;
                  ((jo) this).field_F = ((jo) this).field_F + 1;
                  if (fieldTemp$6 < 120) {
                    break L2;
                  } else {
                    ((jo) this).field_F = -1;
                    break L2;
                  }
                } else {
                  if (-1 == ((jo) this).field_F) {
                    break L2;
                  } else {
                    int fieldTemp$7 = ((jo) this).field_F + 1;
                    ((jo) this).field_F = ((jo) this).field_F + 1;
                    if (fieldTemp$7 < 120) {
                      break L2;
                    } else {
                      ((jo) this).field_F = -1;
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
              if (var4 >= ((jo) this).field_z) {
                var3++;
                continue L1;
              } else {
                L4: {
                  var2 = ((jo) this).a(var4, (byte) 52, var3);
                  if (lf.field_c == 0) {
                    break L4;
                  } else {
                    if (((jo) this).field_p.a(var2.field_c, var2.field_a, nfa.field_a, jc.field_r)) {
                      ((jo) this).field_s = var3;
                      ((jo) this).field_h = var4;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((jo) this).field_p.a(var2.field_c, var2.field_a, mk.field_p, gd.field_m)) {
                  ((jo) this).field_q = var3;
                  ((jo) this).field_r = var4;
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
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            var5 = null;
            this.b((aj) null, -117, -116, -84);
            break L0;
          }
        }
        L1: {
          var3_int = ((jo) this).field_i.field_h.field_E;
          if (1 == var3_int) {
            var3_int = 0;
            L2: while (true) {
              if (~(1 + ((jo) this).field_a) >= ~var3_int) {
                var3_int = 0;
                L3: while (true) {
                  if (((jo) this).field_z - -1 <= var3_int) {
                    param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) -114, 1 + ((jo) this).field_a);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 3].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1, (byte) -114, ((jo) this).field_a + 1);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E].a(14 + param1.field_c, param1.field_a + 48, 128);
                    param1 = ((jo) this).a(-1, (byte) 32, ((jo) this).field_a);
                    ls.field_a[4 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a - -48, 128);
                    param1 = ((jo) this).a(-1, (byte) -123, -1 + ((jo) this).field_a);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 4].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(0, (byte) -99, ((jo) this).field_a);
                    ls.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(4 + param1.field_c - -14, param1.field_a - -50, 128);
                    param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -111, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a - -48, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) -113, -1);
                    as.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z - 1, (byte) -123, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5 - -4].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) 105, 0);
                    as.field_a[5 * ((jo) this).field_i.field_h.field_E + 2].a(14 + param1.field_c - 4, param1.field_a - -50, 128);
                    break L1;
                  } else {
                    L4: {
                      param1 = ((jo) this).a(var3_int, (byte) -116, ((jo) this).field_a + 1);
                      if (var3_int == 0) {
                        ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 14, 48 + param1.field_a, 128);
                        break L4;
                      } else {
                        ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, param1.field_a + 48, 128);
                        break L4;
                      }
                    }
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 27, var3_int);
                  if (var3_int != 0) {
                    as.field_a[5 * ((jo) this).field_i.field_h.field_E - -2].a(param1.field_c + 14, param1.field_a - -48, 128);
                    break L5;
                  } else {
                    as.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    break L5;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          } else {
            if (var3_int == 0) {
              var3_int = -1;
              L6: while (true) {
                if (((jo) this).field_a - -1 <= var3_int) {
                  var3_int = -5;
                  L7: while (true) {
                    if (var3_int >= -1) {
                      var3_int = 0;
                      L8: while (true) {
                        if (~(((jo) this).field_z + 1) >= ~var3_int) {
                          param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 70, ((jo) this).field_a + 1);
                          ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -3].a(param1.field_c - -14, param1.field_a + 48, 128);
                          param1 = ((jo) this).a(-1, (byte) 124, 1 + ((jo) this).field_a);
                          ls.field_a[((jo) this).field_i.field_h.field_E * 5].a(param1.field_c + 14, param1.field_a + 48, 128);
                          param1 = ((jo) this).a(-1, (byte) 58, ((jo) this).field_a);
                          ls.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                          param1 = ((jo) this).a(-1, (byte) -95, -1 + ((jo) this).field_a);
                          ls.field_a[((jo) this).field_i.field_h.field_E * 5 - -4].a(param1.field_c + 14, 48 + param1.field_a, 128);
                          param1 = ((jo) this).a(0, (byte) 95, ((jo) this).field_a);
                          ls.field_a[((jo) this).field_i.field_h.field_E * 5 - -2].a(14 + param1.field_c - -4, 50 + param1.field_a, 128);
                          param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -104, -2);
                          param1 = ((jo) this).a(((jo) this).field_z, (byte) 70, -1);
                          param1 = ((jo) this).a(((jo) this).field_z - 1, (byte) -122, -1);
                          param1 = ((jo) this).a(((jo) this).field_z, (byte) 51, 0);
                          break L1;
                        } else {
                          L9: {
                            param1 = ((jo) this).a(var3_int, (byte) 72, ((jo) this).field_a + 1);
                            if (var3_int == 0) {
                              ls.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(14 + param1.field_c, 48 + param1.field_a, 128);
                              break L9;
                            } else {
                              ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, 48 + param1.field_a, 128);
                              break L9;
                            }
                          }
                          var3_int++;
                          continue L8;
                        }
                      }
                    } else {
                      param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) 74, var3_int);
                      as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(30 + param1.field_c, 40 + param1.field_a, 128);
                      var3_int++;
                      continue L7;
                    }
                  }
                } else {
                  L10: {
                    param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) -110, var3_int);
                    if (-1 == var3_int) {
                      as.field_a[1 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a + 48, 128);
                      break L10;
                    } else {
                      as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, 48 + param1.field_a, 128);
                      break L10;
                    }
                  }
                  var3_int++;
                  continue L6;
                }
              }
            } else {
              L11: {
                if (var3_int != 2) {
                  break L11;
                } else {
                  var3_int = 0;
                  L12: while (true) {
                    if (~var3_int <= ~(1 + ((jo) this).field_a)) {
                      var3_int = 0;
                      L13: while (true) {
                        if (((jo) this).field_z + 1 <= var3_int) {
                          param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -108, 1 + ((jo) this).field_a);
                          ls.field_a[3 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -16, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(-1, (byte) -114, ((jo) this).field_a + 1);
                          ls.field_a[5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c + 16, param1.field_a - 32, 128);
                          param1 = ((jo) this).a(-1, (byte) 42, ((jo) this).field_a);
                          ls.field_a[((jo) this).field_i.field_h.field_E * 5 + 4].a(param1.field_c + 16, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(-1, (byte) 101, ((jo) this).field_a - 1);
                          ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -4].a(16 + param1.field_c, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(0, (byte) -111, ((jo) this).field_a);
                          ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -2].a(param1.field_c - -16, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 88, -1);
                          as.field_a[((jo) this).field_i.field_h.field_E * 5].a(param1.field_c + 16, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(((jo) this).field_z, (byte) 71, -1);
                          as.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(16 + param1.field_c, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(-1 + ((jo) this).field_z, (byte) -95, -1);
                          as.field_a[((jo) this).field_i.field_h.field_E * 5 + 4].a(16 + param1.field_c, -32 + param1.field_a, 128);
                          param1 = ((jo) this).a(((jo) this).field_z, (byte) -96, 0);
                          as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(16 + param1.field_c, param1.field_a + -32, 128);
                          break L11;
                        } else {
                          L14: {
                            param1 = ((jo) this).a(var3_int, (byte) -112, ((jo) this).field_a - -1);
                            if (0 == var3_int) {
                              ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 16, -32 + param1.field_a, 128);
                              break L14;
                            } else {
                              ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a - 32, 128);
                              break L14;
                            }
                          }
                          var3_int++;
                          continue L13;
                        }
                      }
                    } else {
                      L15: {
                        param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) -110, var3_int);
                        if (var3_int == 0) {
                          as.field_a[((jo) this).field_i.field_h.field_E * 5 + 1].a(16 + param1.field_c, param1.field_a - 32, 128);
                          break L15;
                        } else {
                          as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a + -32, 128);
                          break L15;
                        }
                      }
                      var3_int++;
                      continue L12;
                    }
                  }
                }
              }
              break L1;
            }
          }
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
        ((jo) this).field_b = 256 + -(128 * (param2 - param1) >> 1);
        ((jo) this).field_B = 208 - ((param1 + param2) * 64 >> 1);
        this.a((byte) -127);
    }

    final void a(int param0, int param1) {
        if (param0 != -1907) {
            return;
        }
        ((jo) this).field_b = ((jo) this).field_b + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
        ((jo) this).field_B = ((jo) this).field_B + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
    }

    jo(gj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var4_ref_int____ = null;
        int var4 = 0;
        int var5 = 0;
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
        ((jo) this).field_d = 0;
        ((jo) this).field_F = -1;
        try {
          L0: {
            ((jo) this).field_i = param0;
            ((jo) this).field_I = ((jo) this).field_i.field_h.field_a;
            ((jo) this).field_k = ida.a(0, (vr) null, ((jo) this).field_i.field_h.field_E);
            hga.field_U.a((byte) 127);
            ((jo) this).field_z = ((jo) this).field_i.field_h.field_B;
            ((jo) this).field_a = ((jo) this).field_i.field_h.field_z;
            ((jo) this).field_j = new bq[((jo) this).field_a - -2][2 + ((jo) this).field_z];
            var2_int = 0;
            L1: while (true) {
              if (((jo) this).field_a + 2 <= var2_int) {
                L2: {
                  int discarded$1 = 1;
                  this.a();
                  this.c((byte) -124);
                  if (((jo) this).field_i.field_n < 0) {
                    ((jo) this).a((byte) -57, ((jo) this).field_z >> 1, ((jo) this).field_a >> 1);
                    break L2;
                  } else {
                    var2_int = 0;
                    var3 = 0;
                    var4_ref_int____ = ((jo) this).field_i.field_h.field_L.b(((jo) this).field_i.field_n, -60);
                    var3 = var4_ref_int____[0][1];
                    var2_int = var4_ref_int____[0][0];
                    ((jo) this).a((byte) -57, var3, var2_int);
                    break L2;
                  }
                }
                ((jo) this).a(-22048);
                ((jo) this).field_G = new int[4][3];
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= 4) {
                    ((jo) this).field_v = a.a(12889, 64, 16763049, 46335);
                    break L0;
                  } else {
                    L4: {
                      var3 = kla.a(9, ((jo) this).field_i.field_h.field_w, -2147483648);
                      var4 = 0;
                      var5 = 0;
                      if (var2_int != 0) {
                        if (var2_int == 1) {
                          var4 = ((jo) this).field_a + 3;
                          var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                          break L4;
                        } else {
                          if (2 != var2_int) {
                            if (var2_int != 3) {
                              break L4;
                            } else {
                              var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                              var5 = ((jo) this).field_z - -3;
                              break L4;
                            }
                          } else {
                            var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                            var5 = -3;
                            break L4;
                          }
                        }
                      } else {
                        var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                        var4 = -3;
                        break L4;
                      }
                    }
                    ((jo) this).field_G[var2_int] = new int[3];
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                var3 = 0;
                L5: while (true) {
                  if (~var3 <= ~(2 + ((jo) this).field_z)) {
                    var2_int++;
                    continue L1;
                  } else {
                    ((jo) this).field_j[var2_int][var3] = new bq(0);
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
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("jo.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
    }
}
