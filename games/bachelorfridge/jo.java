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
        if (param0 > -109) {
            return;
        }
        try {
            param1.field_a = param1.field_a - param2.field_k;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jo.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jo.K(").append(param0).append(44);
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          if (((jo) this).field_I[param2][param4].field_n == 20) {
            var6 = -1;
            var7 = ((jo) this).field_i.field_h.field_i;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 >= var7.length) {
                    break L3;
                  } else {
                    var9 = var7[var8];
                    stackOut_4_0 = ~var9[0];
                    stackOut_4_1 = ~param2;
                    stackIn_10_0 = stackOut_4_0;
                    stackIn_10_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_5_0 != stackIn_5_1) {
                          break L4;
                        } else {
                          if (var9[1] != param4) {
                            break L4;
                          } else {
                            var6 = var9[2];
                            break L4;
                          }
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = -1;
                stackOut_9_1 = var6;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              if (stackIn_10_0 == stackIn_10_1) {
                break L0;
              } else {
                ((jo) this).field_p.e(param1, param3, ((jo) this).field_i.c(var6, 2271));
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param0 == -1) {
            break L5;
          } else {
            ((jo) this).field_p = null;
            break L5;
          }
        }
        int discarded$2 = ((jo) this).field_i.a(-18254, param4, param2);
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
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
          stackOut_3_0 = ~var10;
          stackOut_3_1 = ~var15;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_4_0 >= stackIn_4_1) {
                  break L4;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_15_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var19 != 0) {
                    break L3;
                  } else {
                    var16 = stackIn_6_0;
                    L5: while (true) {
                      L6: {
                        if (var11 <= var16) {
                          break L6;
                        } else {
                          stackOut_8_0 = ~var9[var15][var16];
                          stackOut_8_1 = -2;
                          stackIn_4_0 = stackOut_8_0;
                          stackIn_4_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var19 != 0) {
                            continue L2;
                          } else {
                            L7: {
                              if (stackIn_9_0 == stackIn_9_1) {
                                var14[var15][var16] = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var16++;
                            if (var19 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var15++;
                      if (var19 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            }
            var20 = stackIn_15_0;
            var15 = var20;
            L8: while (true) {
              stackOut_16_0 = var20;
              stackOut_16_1 = var10;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              L9: while (true) {
                L10: {
                  if (stackIn_17_0 >= stackIn_17_1) {
                    break L10;
                  } else {
                    if (var19 != 0) {
                      break L10;
                    } else {
                      var16 = 0;
                      L11: while (true) {
                        L12: {
                          if (var11 <= var16) {
                            break L12;
                          } else {
                            stackOut_21_0 = ~var14[var20][var16];
                            stackOut_21_1 = -1;
                            stackIn_17_0 = stackOut_21_0;
                            stackIn_17_1 = stackOut_21_1;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            if (var19 != 0) {
                              continue L9;
                            } else {
                              L13: {
                                L14: {
                                  if (stackIn_22_0 != stackIn_22_1) {
                                    break L14;
                                  } else {
                                    if (var19 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  L16: {
                                    var17 = param4 + var20 + -var12;
                                    var18 = var16 + -var13 + param5;
                                    if (param0 != 1) {
                                      break L16;
                                    } else {
                                      var18 = var18 - param3;
                                      if (var19 == 0) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (param0 != 3) {
                                      break L17;
                                    } else {
                                      var18 = var18 + param3;
                                      if (var19 == 0) {
                                        break L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (param0 == 4) {
                                      break L18;
                                    } else {
                                      if (param0 == 2) {
                                        var17 = var17 - param3;
                                        if (var19 == 0) {
                                          break L15;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var17 = var17 + param3;
                                  break L15;
                                }
                                if (var17 < 0) {
                                  break L13;
                                } else {
                                  if (var18 < 0) {
                                    break L13;
                                  } else {
                                    if (((jo) this).field_a <= var17) {
                                      break L13;
                                    } else {
                                      if (var18 >= ((jo) this).field_z) {
                                        break L13;
                                      } else {
                                        var8 = ((jo) this).a(var18, (byte) -108, var17);
                                        ((jo) this).field_g.a(1 + var8.field_c, 1 + var8.field_a, 128 + -(param6 * 20));
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var16++;
                              if (var19 == 0) {
                                continue L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var20++;
                        if (var19 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                return;
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
        int var14_int = 0;
        int[][] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
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
                var6 = (hia) (Object) param3;
                var7 = ((jo) this).field_i.field_G[var6.field_h.field_f].field_s;
                oha discarded$1 = al.a(param0 + -60, var6.field_g);
                var5_ref = new aj(((jo) this).a(var7.field_J, (byte) -96, var7.field_x));
                if (param2) {
                  var8 = (5 + -param1) * 4;
                  var9_int = -44;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var9_int >= 44) {
                          break L5;
                        } else {
                          var10 = (int)Math.sqrt((double)(1936 - var9_int * var9_int));
                          var11 = var10 / 2;
                          var12 = var10 * var8 / 44;
                          var13 = var9_int + 64 + var5_ref.field_c;
                          var14_int = 32 + var5_ref.field_a;
                          dg.d(var13, 0, var14_int + -var11, 65793 * var12);
                          stackOut_8_0 = 0;
                          stackOut_8_1 = var11;
                          stackIn_19_0 = stackOut_8_0;
                          stackIn_19_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var19 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  var15 = -var11;
                                  L8: while (true) {
                                    if (var15 > var11) {
                                      break L7;
                                    } else {
                                      dg.h(var13, var14_int - -var15, var12 * 131329, (var11 + -var15 << 8) / (2 * var11));
                                      var15++;
                                      if (var19 != 0) {
                                        break L6;
                                      } else {
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              var9_int++;
                              break L6;
                            }
                            if (var19 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_18_0 = param0 ^ -63;
                      stackOut_18_1 = var7.d(125, var6.field_g);
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L4;
                    }
                    var9 = haa.b(stackIn_19_0, stackIn_19_1, var6.field_j);
                    var10 = 17;
                    var11 = 17;
                    var12 = -1 + var10 >> 1;
                    var13 = -1 + var11 >> 1;
                    var14 = new int[var10][var11];
                    var15 = 0;
                    L9: while (true) {
                      stackOut_20_0 = var15;
                      stackOut_20_1 = var10;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      L10: while (true) {
                        L11: {
                          if (stackIn_21_0 >= stackIn_21_1) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L11;
                          } else {
                            stackOut_22_0 = 0;
                            stackIn_28_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var19 != 0) {
                              break L11;
                            } else {
                              var16 = stackIn_23_0;
                              if (var16 >= var11) {
                                var15++;
                                continue L9;
                              } else {
                                stackOut_24_0 = 1;
                                stackOut_24_1 = var9[var15][var16];
                                stackIn_21_0 = stackOut_24_0;
                                stackIn_21_1 = stackOut_24_1;
                                continue L10;
                              }
                            }
                          }
                        }
                        var15 = stackIn_28_0;
                        L12: while (true) {
                          stackOut_29_0 = var15;
                          stackIn_30_0 = stackOut_29_0;
                          L13: while (true) {
                            if (stackIn_30_0 >= var10) {
                              break L2;
                            } else {
                              if (var19 != 0) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                var16 = 0;
                                if (var11 <= var16) {
                                  var15++;
                                  continue L12;
                                } else {
                                  stackOut_33_0 = var14[var15][var16];
                                  stackIn_30_0 = stackOut_33_0;
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("jo.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(aj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              L3: {
                if (1 <= var3_int) {
                  break L3;
                } else {
                  if (var5 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = -1;
                    L4: while (true) {
                      L5: {
                        if (var4 >= 2) {
                          var3_int++;
                          break L5;
                        } else {
                          to.field_b.c(sg.a(to.field_b.field_q, param1 ^ 1816304478, ((jo) this).field_b) - -(var3_int * to.field_b.field_q), sg.a(to.field_b.field_p, 1816304479, ((jo) this).field_B) + var4 * to.field_b.field_p);
                          var4++;
                          if (var5 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("jo.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_43_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_42_0 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (2 + ((jo) this).field_a <= var2) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var3 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 >= ((jo) this).field_z - -2) {
                          break L5;
                        } else {
                          ((jo) this).field_j[var2][var3].field_n = 0;
                          var3++;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      break L4;
                    }
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var7 = stackIn_11_0;
          var2 = var7;
          L6: while (true) {
            stackOut_12_0 = ~(((jo) this).field_a + 1);
            stackOut_12_1 = ~var7;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            L7: while (true) {
              L8: {
                L9: {
                  if (stackIn_13_0 >= stackIn_13_1) {
                    break L9;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_43_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var5 != 0) {
                      break L8;
                    } else {
                      var3 = stackIn_15_0;
                      L10: while (true) {
                        L11: {
                          if (~(((jo) this).field_z + 1) >= ~var3) {
                            break L11;
                          } else {
                            var4 = 0;
                            stackOut_17_0 = var7;
                            stackOut_17_1 = ((jo) this).field_a;
                            stackIn_13_0 = stackOut_17_0;
                            stackIn_13_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (var5 != 0) {
                              continue L7;
                            } else {
                              L12: {
                                if (stackIn_18_0 >= stackIn_18_1) {
                                  break L12;
                                } else {
                                  if (~((jo) this).field_z >= ~var3) {
                                    break L12;
                                  } else {
                                    if (!((jo) this).field_I[var7][var3].field_i) {
                                      break L12;
                                    } else {
                                      var4 += 4;
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (~((jo) this).field_z >= ~var3) {
                                  break L13;
                                } else {
                                  if (var7 <= 0) {
                                    break L13;
                                  } else {
                                    if (!((jo) this).field_I[-1 + var7][var3].field_i) {
                                      break L13;
                                    } else {
                                      var4 += 8;
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L14: {
                                if (var7 <= 0) {
                                  break L14;
                                } else {
                                  if (var3 <= 0) {
                                    break L14;
                                  } else {
                                    if (((jo) this).field_I[-1 + var7][-1 + var3].field_i) {
                                      var4++;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L15: {
                                if (((jo) this).field_a <= var7) {
                                  break L15;
                                } else {
                                  if (var3 <= 0) {
                                    break L15;
                                  } else {
                                    if (!((jo) this).field_I[var7][-1 + var3].field_i) {
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
                                  ((jo) this).field_j[var7][var3].field_n = 1;
                                  ((jo) this).field_j[var7][var3].field_k = var4;
                                  if ((var3 + var7) % 2 == 1) {
                                    ((jo) this).field_j[var7][var3].field_o = true;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var3++;
                              if (var5 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        var7++;
                        if (var5 == 0) {
                          continue L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                stackOut_42_0 = 1;
                stackIn_43_0 = stackOut_42_0;
                break L8;
              }
              L17: {
                if (stackIn_43_0 == 1) {
                  break L17;
                } else {
                  var6 = null;
                  this.a(false, (aj) null, 63);
                  break L17;
                }
              }
              return;
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
          L1: {
            if (var7_int >= param2) {
              break L1;
            } else {
              var8 = param1;
              L2: while (true) {
                L3: {
                  if (var8 >= param4) {
                    var7_int++;
                    break L3;
                  } else {
                    var9 = ((jo) this).a(var8, (byte) -119, var7_int);
                    ((jo) this).field_A.d(var9.field_c, var9.field_a, param0);
                    var8++;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      continue L2;
                    }
                  }
                }
                if (var10 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
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
          L4: while (true) {
            L5: {
              if (param4 <= var8) {
                ((jo) this).field_H.e();
                break L5;
              } else {
                var7 = ((jo) this).a(var8, (byte) -122, param2);
                ((jo) this).field_H.d(var7.field_c, -1 + var7.field_a, param0);
                var8++;
                if (var10 != 0) {
                  break L5;
                } else {
                  continue L4;
                }
              }
            }
            var8 = param3;
            L6: while (true) {
              L7: {
                if (var8 >= param2) {
                  ((jo) this).field_H.c();
                  break L7;
                } else {
                  var7 = ((jo) this).a(param4, (byte) 106, var8);
                  ((jo) this).field_H.d(var7.field_c, var7.field_a, param0);
                  var8++;
                  if (var10 != 0) {
                    break L7;
                  } else {
                    continue L6;
                  }
                }
              }
              var8 = param1;
              L8: while (true) {
                L9: {
                  if (param4 <= var8) {
                    ((jo) this).field_H.e();
                    break L9;
                  } else {
                    var7 = ((jo) this).a(var8, (byte) -101, -1 + param3);
                    ((jo) this).field_H.d(var7.field_c, var7.field_a, param0);
                    var8++;
                    if (var10 != 0) {
                      break L9;
                    } else {
                      continue L8;
                    }
                  }
                }
                var8 = param3;
                L10: while (true) {
                  L11: {
                    if (var8 >= param2) {
                      ((jo) this).field_H.c();
                      break L11;
                    } else {
                      var7 = ((jo) this).a(-1 + param1, (byte) 62, var8);
                      ((jo) this).field_H.d(var7.field_c, 1 + var7.field_a, param0);
                      var8++;
                      if (var10 != 0) {
                        break L11;
                      } else {
                        continue L10;
                      }
                    }
                  }
                  return;
                }
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
        Object var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var13 = BachelorFridge.field_y;
        var4 = -1;
        var5 = ((jo) this).a(param2, (byte) 115, param0);
        var6 = 1.5707963267948966 + 0.5 * ((double)((param2 * param0 << 2) + ((jo) this).field_i.field_L) / 80.0);
        var8 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 32.0);
        var9 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 2)) / 80.0)) * 15.0);
        var10 = ((jo) this).field_i.field_h.field_i;
        var11 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11 >= var10.length) {
                break L2;
              } else {
                var12 = var10[var11];
                stackOut_2_0 = param0;
                stackOut_2_1 = var12[0];
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      break L3;
                    } else {
                      if (var12[1] != param2) {
                        break L3;
                      } else {
                        var4 = var12[2];
                        break L3;
                      }
                    }
                  }
                  var11++;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = param1;
            stackOut_7_1 = 80;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L1;
          }
          L4: {
            if (stackIn_8_0 == stackIn_8_1) {
              break L4;
            } else {
              var14 = null;
              this.a(-31, (aj) null, (ad) null);
              break L4;
            }
          }
          L5: {
            L6: {
              if (-1 != var4) {
                break L6;
              } else {
                L7: {
                  if (var9 < 0) {
                    break L7;
                  } else {
                    L8: {
                      if (var6 % 3.141592653589793 <= 2.0943951023931953) {
                        break L8;
                      } else {
                        ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -5].a(64 + (var5.field_c + -18 - -var8), var9 + (var5.field_a + 14));
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (1.0471975511965976 >= var6 % 3.141592653589793) {
                        break L9;
                      } else {
                        ik.field_h[(((jo) this).field_i.field_L >> 3) % 5].a(var8 + -18 + (64 + var5.field_c), var9 + var5.field_a + 14);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -10].a(var8 + 64 + var5.field_c - 18, var9 + (var5.field_a + 14));
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                L10: {
                  if (var6 % 3.141592653589793 > 2.0943951023931953) {
                    break L10;
                  } else {
                    L11: {
                      if (var6 % 3.141592653589793 <= 1.0471975511965976) {
                        break L11;
                      } else {
                        hha.field_y[(((jo) this).field_i.field_L >> 3) % 5].a(var8 + (var5.field_c + 64) + -18, var5.field_a + 14 - -var9);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L11;
                        }
                      }
                    }
                    hha.field_y[5 + (((jo) this).field_i.field_L >> 3) % 5].a(-18 + var5.field_c + 64 + var8, var5.field_a + 14 - -var9);
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L10;
                    }
                  }
                }
                hha.field_y[10 + (((jo) this).field_i.field_L >> 3) % 5].a(-18 + (var5.field_c + 64 - -var8), var9 + -18 + (32 + var5.field_a));
                if (var13 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L12: {
              ((jo) this).field_o.e(var5.field_c, var5.field_a, ((jo) this).field_i.c(var4, 2271));
              if (var9 < 0) {
                break L12;
              } else {
                L13: {
                  if (2.0943951023931953 >= var6 % 3.141592653589793) {
                    break L13;
                  } else {
                    ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -5].b(var8 + 64 + var5.field_c + -18, var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4, 2271));
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (1.0471975511965976 < var6 % 3.141592653589793) {
                    break L14;
                  } else {
                    ik.field_h[(((jo) this).field_i.field_L >> 3) % 5 - -10].b(var5.field_c - -64 + (-18 - -var8), 32 + var5.field_a + (-18 + var9), ((jo) this).field_i.c(var4, 2271));
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L14;
                    }
                  }
                }
                ik.field_h[(((jo) this).field_i.field_L >> 3) % 5].b(-18 + (var5.field_c + (64 - -var8)), var9 + (var5.field_a + 14), ((jo) this).field_i.c(var4, 2271));
                if (var13 == 0) {
                  break L5;
                } else {
                  break L12;
                }
              }
            }
            L15: {
              if (var6 % 3.141592653589793 > 2.0943951023931953) {
                break L15;
              } else {
                L16: {
                  if (1.0471975511965976 >= var6 % 3.141592653589793) {
                    break L16;
                  } else {
                    hha.field_y[(((jo) this).field_i.field_L >> 3) % 5].b(var8 + -18 + (var5.field_c + 64), var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4, param1 ^ 2191));
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L16;
                    }
                  }
                }
                hha.field_y[5 + (((jo) this).field_i.field_L >> 3) % 5].b(var8 + 46 + var5.field_c, var9 + var5.field_a - -14, ((jo) this).field_i.c(var4, 2271));
                if (var13 == 0) {
                  break L5;
                } else {
                  break L15;
                }
              }
            }
            hha.field_y[(((jo) this).field_i.field_L >> 3) % 5 - -10].b(var5.field_c + 64 - (18 + -var8), -18 + var5.field_a - -32 + var9, ((jo) this).field_i.c(var4, 2271));
            break L5;
          }
          return;
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
        ad[] var17 = null;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 < -93) {
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
              var17 = ((jo) this).field_e;
              var3_array = var17;
              var4 = 0;
              L2: while (true) {
                L3: {
                  if (~var4 <= ~var17.length) {
                    break L3;
                  } else {
                    var5 = var17[var4];
                    if (var16 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (var5 != null) {
                              break L6;
                            } else {
                              if (var16 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (!((jo) this).field_i.field_h.field_a[var5.field_s.field_x][var5.field_s.field_J].field_d) {
                              break L7;
                            } else {
                              if (((jo) this).field_i.field_n != var5.field_s.field_D) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var6 = var5.field_s;
                            param1 = this.a((byte) 106, var5);
                            if (var5.field_s.i(126)) {
                              break L8;
                            } else {
                              L9: {
                                if (39 == var6.field_y) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var6.field_y == 2) {
                                      break L10;
                                    } else {
                                      L11: {
                                        if (29 != var6.field_y) {
                                          break L11;
                                        } else {
                                          ala.field_a[(((jo) this).field_i.field_L >> 2) % 4].e(param1.field_c + 42, -42 + param1.field_a);
                                          if (var16 == 0) {
                                            break L8;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      L12: {
                                        if (var6.field_y == 1) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var6.field_y != 12) {
                                              break L13;
                                            } else {
                                              ala.field_a[12 + (((jo) this).field_i.field_L >> 2) % 4].e(param1.field_c + 42, -42 + param1.field_a);
                                              if (var16 == 0) {
                                                break L8;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (var6.field_y != 37) {
                                            break L8;
                                          } else {
                                            ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                                            if (var16 == 0) {
                                              break L8;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 4].e(42 + param1.field_c, -42 + param1.field_a);
                                      if (var16 == 0) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 8].e(42 + param1.field_c, param1.field_a + -42);
                                  if (var16 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              od.field_C.a(param1.field_c, param1.field_a - 64);
                              break L8;
                            }
                          }
                          L14: {
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
                              L15: while (true) {
                                L16: {
                                  L17: {
                                    if (var11 < 0) {
                                      break L17;
                                    } else {
                                      dg.d(var8 - 14, var9, (int)((long)(-14 + var8) + Math.round(13.0 * Math.sin(var14_double))), (int)(-Math.round(Math.cos(var14_double) * 13.0) + (long)var9), 65793);
                                      var14_double = var14_double + var12;
                                      var11--;
                                      if (var16 != 0) {
                                        break L16;
                                      } else {
                                        if (var16 == 0) {
                                          continue L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                  sia.field_g.e(-28 + var8, var9 - 14);
                                  break L16;
                                }
                                L18: {
                                  L19: {
                                    L20: {
                                      if (((jo) this).field_i.b(var5, true) == null) {
                                        break L20;
                                      } else {
                                        if (~var5.field_s.field_D == ~((jo) this).field_i.field_n) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    ad.field_h.a("" + var6.field_v, var8 - 14, var9 + 4, var6.field_D + 2, -1);
                                    if (var16 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L21: {
                                    ad.field_h.a("" + var6.field_v, -16 + var8 - -2, -26 + (30 + var9), 2 + var6.field_D, -1);
                                    var14 = ((jo) this).field_i.b(var5, true).field_g;
                                    stackOut_46_0 = var9 - 15;
                                    stackIn_48_0 = stackOut_46_0;
                                    stackIn_47_0 = stackOut_46_0;
                                    if (((jo) this).field_i.field_L % 128 >= 64) {
                                      stackOut_48_0 = stackIn_48_0;
                                      stackOut_48_1 = -(((jo) this).field_i.field_L % 128) + 127;
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      break L21;
                                    } else {
                                      stackOut_47_0 = stackIn_47_0;
                                      stackOut_47_1 = ((jo) this).field_i.field_L % 128;
                                      stackIn_49_0 = stackOut_47_0;
                                      stackIn_49_1 = stackOut_47_1;
                                      break L21;
                                    }
                                  }
                                  cba.a(stackIn_49_0, stackIn_49_1 * 4, -29 + var8, var14, -60);
                                  break L18;
                                }
                                L22: {
                                  if (((jo) this).field_i.field_h.field_o != 3) {
                                    break L22;
                                  } else {
                                    if (!var6.g((byte) 85)) {
                                      break L22;
                                    } else {
                                      var14 = (int)(15.0 * Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (var6.field_x * var6.field_J << 2)) / 40.0)));
                                      pm.field_v[(((jo) this).field_i.field_L >> 2) % 2].a(72 + param1.field_c, var14 + (param1.field_a + -32));
                                      break L22;
                                    }
                                  }
                                }
                                L23: {
                                  if (var5.field_s.field_y == 0) {
                                    break L23;
                                  } else {
                                    if (pna.field_zb[var5.field_s.field_y].field_i == -1) {
                                      break L23;
                                    } else {
                                      lga.field_k.e(15 + param1.field_c, param1.field_a + 2);
                                      am.field_M[pna.field_zb[var5.field_s.field_y].field_i].e(param1.field_c - -17, param1.field_a + 4);
                                      break L23;
                                    }
                                  }
                                }
                                if (!var5.field_s.i(-89)) {
                                  L24: {
                                    if (var5.field_s.field_y == 39) {
                                      break L24;
                                    } else {
                                      L25: {
                                        if (var5.field_s.field_y == 2) {
                                          break L25;
                                        } else {
                                          L26: {
                                            if (var5.field_s.field_y != 29) {
                                              break L26;
                                            } else {
                                              dg.a(42 + param1.field_c, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                                              ala.field_a[0 - -((((jo) this).field_i.field_L >> 2) % 4)].e(param1.field_c - -42, -42 + param1.field_a);
                                              dg.c();
                                              if (var16 == 0) {
                                                break L14;
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                          L27: {
                                            if (1 != var5.field_s.field_y) {
                                              break L27;
                                            } else {
                                              dg.a(param1.field_c - -42, -28 + param1.field_a, param1.field_c - -88, param1.field_a);
                                              ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 4].e(param1.field_c + 42, -42 + param1.field_a);
                                              dg.c();
                                              if (var16 == 0) {
                                                break L14;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          L28: {
                                            if (var5.field_s.field_y != 12) {
                                              break L28;
                                            } else {
                                              dg.a(param1.field_c - -42, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                                              ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 12].e(42 + param1.field_c, -42 + param1.field_a);
                                              dg.c();
                                              if (var16 == 0) {
                                                break L14;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                          if (var5.field_s.field_y != 37) {
                                            break L14;
                                          } else {
                                            dg.a(param1.field_c - -42, param1.field_a + -28, param1.field_c + 88, param1.field_a);
                                            ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                                            dg.c();
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                      dg.a(param1.field_c - -42, param1.field_a - 28, param1.field_c - -88, param1.field_a);
                                      ala.field_a[(((jo) this).field_i.field_L >> 2) % 4 + 8].e(42 + param1.field_c, param1.field_a - 42);
                                      dg.c();
                                      if (var16 == 0) {
                                        break L14;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  hr.field_c.a(param1.field_c, param1.field_a + -64, 192);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                          var7 = (vca) (Object) var5.field_t.b((byte) 90);
                          L29: while (true) {
                            if (var7 == null) {
                              break L5;
                            } else {
                              var7.a(-40 + param1.field_a - -32, param1.field_c + 64, false);
                              var7 = (vca) (Object) var5.field_t.c(0);
                              if (var16 != 0) {
                                break L4;
                              } else {
                                if (var16 == 0) {
                                  continue L29;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        break L4;
                      }
                      if (var16 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("jo.EA(").append(param0).append(44);
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param1 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L30;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L30;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                  L3: {
                    var11 = (gm) (Object) param1;
                    var3_ref = var11;
                    var4 = ((jo) this).field_i.field_G[var11.field_h.field_f];
                    var5 = var4.field_s;
                    var6 = var3_ref.field_l;
                    var7 = var3_ref.field_i;
                    var8 = new aj(((jo) this).a(var5.field_J, (byte) 36, var5.field_x));
                    if (3 != var7) {
                      break L3;
                    } else {
                      var9 = ((jo) this).a(var6 + var5.field_J, (byte) 120, var5.field_x);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var7 != 1) {
                      break L4;
                    } else {
                      var9 = ((jo) this).a(-var6 + var5.field_J, (byte) -105, var5.field_x);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var7 != 2) {
                      break L5;
                    } else {
                      var9 = ((jo) this).a(var5.field_J, (byte) -90, -var6 + var5.field_x);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var7 != 4) {
                      break L6;
                    } else {
                      var9 = ((jo) this).a(var5.field_J, (byte) -89, var5.field_x - -var6);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = new aj(((jo) this).a(var5.field_J, (byte) 86, var5.field_x));
                  break L2;
                }
                this.a(var5, var8, -32, var9, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L7: {
              if (param0) {
                break L7;
              } else {
                this.b(-107, -63);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("jo.U(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
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
        ad[] stackIn_5_0 = null;
        ad[] stackIn_19_0 = null;
        ad[] stackOut_18_0 = null;
        ad[] stackOut_4_0 = null;
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
          L2: {
            if (var4.length <= var5) {
              stackOut_18_0 = ((jo) this).field_e;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            } else {
              var6 = var4[var5];
              stackOut_4_0 = (ad[]) var6;
              stackIn_19_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var10 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (stackIn_5_0 == null) {
                      break L4;
                    } else {
                      var7 = var6;
                      var8 = 0;
                      L5: while (true) {
                        if (var7.length <= var8) {
                          break L4;
                        } else {
                          var9 = var7[var8];
                          if (var10 != 0) {
                            break L3;
                          } else {
                            L6: {
                              L7: {
                                if (var9 != null) {
                                  break L7;
                                } else {
                                  if (var10 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                ((jo) this).field_e[var3] = var9;
                                var11[var3] = var9.field_s.field_x + var9.field_s.field_J;
                                if (!var9.field_s.i(-122)) {
                                  break L8;
                                } else {
                                  var11[var3] = var11[var3] - 1;
                                  break L8;
                                }
                              }
                              var3++;
                              break L6;
                            }
                            var8++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  var5++;
                  break L3;
                }
                continue L1;
              }
            }
          }
          dk.a((Object[]) (Object) stackIn_19_0, (byte) 101, var11);
          return;
        }
    }

    private final void a(boolean param0, aj param1, int param2) {
        RuntimeException var4 = null;
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
        try {
          L0: {
            L1: {
              if (((jo) this).field_q == -1) {
                break L1;
              } else {
                if (-1 != ((jo) this).field_r) {
                  L2: {
                    L3: {
                      param1 = ((jo) this).a(((jo) this).field_r, (byte) -97, ((jo) this).field_q);
                      if (param0) {
                        break L3;
                      } else {
                        rla.field_k.e(param1.field_c + 22, param1.field_a - -10, 16711680);
                        if (BachelorFridge.field_y == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    rla.field_k.e(22 + param1.field_c, 10 + param1.field_a, 65376);
                    break L2;
                  }
                  L4: {
                    if (param2 == 18503) {
                      break L4;
                    } else {
                      ((jo) this).a((byte) -63, -5, -59);
                      break L4;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("jo.JA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
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
        int stackIn_37_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
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
              if (param0 == 16429) {
                var19 = (gca) (Object) param1.field_n.b((byte) 90);
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var19 == null) {
                        break L10;
                      } else {
                        var19.a(120 + var5, 76 + var4_int, (byte) -34);
                        var19 = (gca) (Object) param1.field_n.c(0);
                        if (var16 != 0) {
                          break L9;
                        } else {
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
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
                  L11: {
                    if (var8.field_s != 1) {
                      if (var8.field_s == 4) {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L11;
                      } else {
                        stackOut_34_0 = 0;
                        stackIn_37_0 = stackOut_34_0;
                        break L11;
                      }
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_37_0 = stackOut_32_0;
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      var12 = stackIn_37_0;
                      if (param1.field_p == 0) {
                        break L13;
                      } else {
                        L14: {
                          var13 = param1.field_p;
                          if (var13 < 0) {
                            var13 = -var13;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          var13 = bd.field_i.field_p * (var13 + -128) >> 8;
                          var14 = var9.e(param0 ^ 16465);
                          if (var12 == 0) {
                            break L15;
                          } else {
                            var14.e();
                            break L15;
                          }
                        }
                        var17 = lq.a(((jo) this).field_k.field_b[93], 8533, var14, -60 + var13, 0);
                        var15 = bd.field_i;
                        bd.field_i = var17;
                        var9.a(0, 2048, 2048, (byte) 123, false, 255, var5, var4_int);
                        bd.field_i = var15;
                        if (var16 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var9.a(var12 != 0, false, 2048, 2048, 0, -49, 255, var4_int, var5);
                    break L12;
                  }
                  var19 = (gca) (Object) param1.field_n.b((byte) 90);
                  L16: while (true) {
                    L17: {
                      if (var19 == null) {
                        break L17;
                      } else {
                        var19.a(120 + var5, (byte) 72, 76 + var4_int);
                        var19 = (gca) (Object) param1.field_n.c(0);
                        if (var16 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          if (var16 == 0) {
                            continue L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                return;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var4;
            stackOut_51_1 = new StringBuilder().append("jo.J(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          L19: {
            stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        if (-1 != var3) {
          L0: {
            if (-1 == var4) {
              break L0;
            } else {
              if (((jo) this).field_i.field_h.field_z <= var3) {
                break L0;
              } else {
                if (((jo) this).field_i.field_h.field_B > var4) {
                  if (((jo) this).field_i.field_h.field_a[var3][var4].field_l != null) {
                    return;
                  } else {
                    L1: {
                      L2: {
                        var6 = ((jo) this).a(var4, (byte) -95, var3);
                        var7 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (var4 * var3 << 2)) / 40.0)) * 30.0);
                        var8 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L - -(var3 * var4 << 2)) / 40.0)) * 15.0);
                        if (var8 >= 0) {
                          break L2;
                        } else {
                          pm.field_v[(((jo) this).field_i.field_L >> 2) % 2].b(64 + var6.field_c - (8 - var7), var6.field_a + (-16 + var8), ((jo) this).field_i.c(param0, 2271));
                          if (BachelorFridge.field_y == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      hb.field_k[(((jo) this).field_i.field_L >> 2) % 2].b(var6.field_c + 56 - -var7, var8 + (var6.field_a - 16), ((jo) this).field_i.c(param0, 2271));
                      break L1;
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        } else {
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
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var13 = BachelorFridge.field_y;
        var2 = ((jo) this).field_i.field_h.field_z;
        var3 = ((jo) this).field_i.field_h.field_B;
        var4 = 0;
        L0: while (true) {
          stackOut_1_0 = var4;
          stackOut_1_1 = var2;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              if (stackIn_2_0 >= stackIn_2_1) {
                break L2;
              } else {
                if (var13 != 0) {
                  break L2;
                } else {
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      var4++;
                      continue L0;
                    } else {
                      var6 = ((jo) this).field_i.field_h.field_a[var4][var5];
                      stackOut_6_0 = 33;
                      stackOut_6_1 = var6.field_n;
                      stackIn_2_0 = stackOut_6_0;
                      stackIn_2_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var13 != 0) {
                        continue L1;
                      } else {
                        L4: {
                          if (stackIn_7_0 == stackIn_7_1) {
                            L5: {
                              var7 = 4 - var6.field_j;
                              var8 = (2 + var6.field_j) * 32;
                              var9 = var4 - var7;
                              var10 = 1 + (var7 + var4);
                              var11 = -var7 + var5;
                              if (var11 >= 0) {
                                break L5;
                              } else {
                                var11 = 0;
                                break L5;
                              }
                            }
                            L6: {
                              if (var2 >= var10) {
                                break L6;
                              } else {
                                var10 = var2;
                                break L6;
                              }
                            }
                            L7: {
                              if (var9 >= 0) {
                                break L7;
                              } else {
                                var9 = 0;
                                break L7;
                              }
                            }
                            L8: {
                              var12 = var7 + (var5 + 1);
                              if (var3 < var12) {
                                var12 = var3;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            this.a(var8, var11, var10, var9, var12, (byte) -106);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            return;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param1 < -91) {
                break L1;
              } else {
                ((jo) this).field_e = null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              stackOut_4_0 = var7;
              stackOut_4_1 = param4.field_p;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 >= stackIn_5_1) {
                    break L4;
                  } else {
                    if (var13 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var8 = 0;
                      L5: while (true) {
                        L6: {
                          if (var8 >= param4.field_q) {
                            break L6;
                          } else {
                            var9 = param4.field_v[var6_int];
                            stackOut_9_0 = 0;
                            stackOut_9_1 = var9;
                            stackIn_5_0 = stackOut_9_0;
                            stackIn_5_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var13 != 0) {
                              continue L3;
                            } else {
                              L7: {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  break L7;
                                } else {
                                  L8: {
                                    var10 = param3 * var7 + (param0 + param2 * var8) >> 1;
                                    var10 = this.c(var10, -16079);
                                    if (var10 <= 0) {
                                      param4.field_v[var6_int] = 0;
                                      if (var13 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var11 = 16711935 & var9;
                                  var11 = var11 * var10;
                                  var12 = var9 & 65280;
                                  var12 = var12 * var10;
                                  param4.field_v[var6_int] = mp.a(dda.a(var12, 16711680), dda.a(-16711936, var11)) >>> 8;
                                  break L7;
                                }
                              }
                              var8++;
                              var6_int++;
                              if (var13 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var7++;
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("jo.W(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
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
              L6: {
                var13 = stackIn_13_0 - -16;
                var14 = 1;
                var15 = 2;
                if (2 == param4) {
                  break L6;
                } else {
                  L7: {
                    if (1 == param4) {
                      break L7;
                    } else {
                      if (param4 != 3) {
                        break L5;
                      } else {
                        var14 = -1;
                        if (var24 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var15 = -2;
                  if (var24 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var14 = -1;
              var15 = -2;
              break L5;
            }
            var16 = var10;
            L8: while (true) {
              stackOut_20_0 = var11;
              stackOut_20_1 = var16;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              L9: while (true) {
                if (stackIn_21_0 <= stackIn_21_1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (var24 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var17 = var12;
                    L10: while (true) {
                      if (var17 >= var13) {
                        var16++;
                        continue L8;
                      } else {
                        var18 = (-var7 + var16) * var15 + var14 * (var17 + -var6_int);
                        var19 = var14 * (var17 + -var6_int) + -(var15 * (-var7 + var16));
                        var20 = (var8 + -var6_int) * var14 - -(var15 * (var9 - var7));
                        stackOut_25_0 = 32;
                        stackOut_25_1 = var18;
                        stackIn_21_0 = stackOut_25_0;
                        stackIn_21_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (var24 != 0) {
                          continue L9;
                        } else {
                          L11: {
                            if (stackIn_26_0 > stackIn_26_1) {
                              break L11;
                            } else {
                              if (var18 > var20) {
                                break L11;
                              } else {
                                L12: {
                                  var21 = 16;
                                  if (var20 - 80 < var18) {
                                    var21 = (var20 + -var18) / 2;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var22 = 33023;
                                if (var19 < -var21) {
                                  break L11;
                                } else {
                                  L13: {
                                    if (var21 >= var19) {
                                      break L13;
                                    } else {
                                      if (var24 == 0) {
                                        break L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var23 = (var18 << 7) / var20;
                                  var23 += 32;
                                  dg.h(var17, var16, var22, var23);
                                  break L11;
                                }
                              }
                            }
                          }
                          var17++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var6;
            stackOut_39_1 = new StringBuilder().append("jo.CA(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          L15: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L15;
            }
          }
          L16: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44).append(param2).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L16;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + param4 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
          L1: {
            L2: {
              if (var3 >= 256) {
                break L2;
              } else {
                var5[var3] = 65793 * var3;
                var3++;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ((jo) this).field_y.b();
            dg.a(400, 400, 384, 128, var5);
            ((jo) this).field_x = new kv(128, 64);
            ((jo) this).field_x.b();
            ((jo) this).field_p.e(0, 0, 2302755);
            ((jo) this).field_c = new kv(128, 64);
            ((jo) this).field_c.b();
            ((jo) this).field_p.e(0, 0, 16711680);
            ((jo) this).field_w = new kv[4];
            break L1;
          }
          L3: {
            if (param0 == -124) {
              break L3;
            } else {
              ((jo) this).field_v = null;
              break L3;
            }
          }
          var6 = 0;
          var3 = var6;
          L4: while (true) {
            L5: {
              L6: {
                if (var6 >= 4) {
                  break L6;
                } else {
                  ((jo) this).field_w[var6] = new kv(128, 64);
                  ((jo) this).field_w[var6].b();
                  ((jo) this).field_p.e(0, 0, ((jo) this).field_i.c(var6, 2271));
                  var6++;
                  if (var4 != 0) {
                    break L5;
                  } else {
                    if (var4 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              ((jo) this).field_n = new kv(84, 84);
              ((jo) this).field_n.b();
              dg.a(672, 672, 672, 128, var5);
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
              break L5;
            }
            return;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var9_int = 0;
            if (param5 <= -79) {
              var10 = 0;
              L1: while (true) {
                stackOut_4_0 = param2.field_p;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_5_0 <= var10) {
                      break L3;
                    } else {
                      if (var18 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var11 = 0;
                        L4: while (true) {
                          L5: {
                            if (param2.field_q <= var11) {
                              break L5;
                            } else {
                              var12 = param2.field_v[var9_int];
                              stackOut_9_0 = var12;
                              stackIn_5_0 = stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var18 != 0) {
                                continue L2;
                              } else {
                                L6: {
                                  if (stackIn_10_0 == 0) {
                                    break L6;
                                  } else {
                                    L7: {
                                      var13 = var10 * param7 + (param1 * var11 + param0);
                                      var14 = param4 * var11 + param3 + var10 * param6;
                                      var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14)) >> 1;
                                      var15 = this.c(var15, -16079);
                                      if (var15 <= 0) {
                                        param2.field_v[var9_int] = 0;
                                        if (var18 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var16 = 16711935 & var12;
                                    var16 = var16 * var15;
                                    var17 = 65280 & var12;
                                    var17 = var17 * var15;
                                    param2.field_v[var9_int] = mp.a(dda.a(var17, 16711680), dda.a(-16711936, var16)) >>> 8;
                                    break L6;
                                  }
                                }
                                var11++;
                                var9_int++;
                                if (var18 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var10++;
                          if (var18 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var9 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var9;
            stackOut_18_1 = new StringBuilder().append("jo.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
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
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (2 + ((jo) this).field_a <= var2) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var3 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var3 <= ~(2 + ((jo) this).field_z)) {
                          break L5;
                        } else {
                          ((jo) this).field_j[var2][var3].field_n = 0;
                          var3++;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      break L4;
                    }
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var2 = stackIn_11_0;
          L6: while (true) {
            stackOut_12_0 = 1 + ((jo) this).field_a;
            stackOut_12_1 = var2;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            L7: while (true) {
              L8: {
                L9: {
                  if (stackIn_13_0 <= stackIn_13_1) {
                    break L9;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_41_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var5 != 0) {
                      break L8;
                    } else {
                      var3 = stackIn_15_0;
                      L10: while (true) {
                        L11: {
                          if (var3 >= 1 + ((jo) this).field_z) {
                            break L11;
                          } else {
                            var4 = 0;
                            stackOut_17_0 = ~var2;
                            stackOut_17_1 = ~((jo) this).field_a;
                            stackIn_13_0 = stackOut_17_0;
                            stackIn_13_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (var5 != 0) {
                              continue L7;
                            } else {
                              L12: {
                                if (stackIn_18_0 <= stackIn_18_1) {
                                  break L12;
                                } else {
                                  if (((jo) this).field_z <= var3) {
                                    break L12;
                                  } else {
                                    if (!((jo) this).field_I[var2][var3].field_i) {
                                      break L12;
                                    } else {
                                      var4 += 4;
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (var3 >= ((jo) this).field_z) {
                                  break L13;
                                } else {
                                  if (var2 <= 0) {
                                    break L13;
                                  } else {
                                    if (((jo) this).field_I[var2 - 1][var3].field_i) {
                                      var4 += 8;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L14: {
                                if (0 >= var2) {
                                  break L14;
                                } else {
                                  if (0 >= var3) {
                                    break L14;
                                  } else {
                                    if (((jo) this).field_I[-1 + var2][var3 - 1].field_i) {
                                      var4++;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L15: {
                                if (~((jo) this).field_a >= ~var2) {
                                  break L15;
                                } else {
                                  if (0 >= var3) {
                                    break L15;
                                  } else {
                                    if (!((jo) this).field_I[var2][-1 + var3].field_i) {
                                      break L15;
                                    } else {
                                      var4 += 2;
                                      break L15;
                                    }
                                  }
                                }
                              }
                              L16: {
                                if (var4 <= 0) {
                                  break L16;
                                } else {
                                  ((jo) this).field_j[var2][var3].field_n = 1;
                                  ((jo) this).field_j[var2][var3].field_k = var4;
                                  break L16;
                                }
                              }
                              var3++;
                              if (var5 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        var2++;
                        if (var5 == 0) {
                          continue L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                stackOut_40_0 = param0;
                stackIn_41_0 = stackOut_40_0;
                break L8;
              }
              L17: {
                if (stackIn_41_0 >= 53) {
                  break L17;
                } else {
                  this.c((byte) -3);
                  break L17;
                }
              }
              var2 = 0;
              L18: while (true) {
                stackOut_44_0 = var2;
                stackOut_44_1 = ((jo) this).field_a + 1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                L19: while (true) {
                  L20: {
                    L21: {
                      if (stackIn_45_0 >= stackIn_45_1) {
                        break L21;
                      } else {
                        stackOut_46_0 = 0;
                        stackIn_73_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (var5 != 0) {
                          break L20;
                        } else {
                          var3 = stackIn_47_0;
                          L22: while (true) {
                            L23: {
                              if (((jo) this).field_z - -1 <= var3) {
                                break L23;
                              } else {
                                var4 = 0;
                                stackOut_49_0 = ((jo) this).field_a;
                                stackOut_49_1 = var2;
                                stackIn_45_0 = stackOut_49_0;
                                stackIn_45_1 = stackOut_49_1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                if (var5 != 0) {
                                  continue L19;
                                } else {
                                  L24: {
                                    if (stackIn_50_0 <= stackIn_50_1) {
                                      break L24;
                                    } else {
                                      if (~((jo) this).field_z >= ~var3) {
                                        break L24;
                                      } else {
                                        if (29 != ((jo) this).field_I[var2][var3].field_n) {
                                          break L24;
                                        } else {
                                          var4 += 4;
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                  L25: {
                                    if (((jo) this).field_z <= var3) {
                                      break L25;
                                    } else {
                                      if (var2 <= 0) {
                                        break L25;
                                      } else {
                                        if (((jo) this).field_I[var2 + -1][var3].field_n != 29) {
                                          break L25;
                                        } else {
                                          var4 += 8;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (var2 <= 0) {
                                      break L26;
                                    } else {
                                      if (var3 <= 0) {
                                        break L26;
                                      } else {
                                        if (((jo) this).field_I[var2 - 1][-1 + var3].field_n == 29) {
                                          var4++;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L27: {
                                    if (((jo) this).field_a <= var2) {
                                      break L27;
                                    } else {
                                      if (var3 <= 0) {
                                        break L27;
                                      } else {
                                        if (((jo) this).field_I[var2][-1 + var3].field_n != 29) {
                                          break L27;
                                        } else {
                                          var4 += 2;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (var4 > 0) {
                                      ((jo) this).field_j[var2][var3].field_n = 29;
                                      ((jo) this).field_j[var2][var3].field_k = var4;
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var3++;
                                  if (var5 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            var2++;
                            if (var5 == 0) {
                              continue L18;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                    stackOut_72_0 = 0;
                    stackIn_73_0 = stackOut_72_0;
                    break L20;
                  }
                  var2 = stackIn_73_0;
                  L29: while (true) {
                    stackOut_74_0 = ~var2;
                    stackOut_74_1 = ~(((jo) this).field_a + 1);
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    L30: while (true) {
                      L31: {
                        if (stackIn_75_0 <= stackIn_75_1) {
                          break L31;
                        } else {
                          if (var5 != 0) {
                            break L31;
                          } else {
                            var3 = 0;
                            L32: while (true) {
                              L33: {
                                if (var3 >= 1 + ((jo) this).field_z) {
                                  break L33;
                                } else {
                                  var4 = 0;
                                  stackOut_79_0 = var2;
                                  stackOut_79_1 = ((jo) this).field_a;
                                  stackIn_75_0 = stackOut_79_0;
                                  stackIn_75_1 = stackOut_79_1;
                                  stackIn_80_0 = stackOut_79_0;
                                  stackIn_80_1 = stackOut_79_1;
                                  if (var5 != 0) {
                                    continue L30;
                                  } else {
                                    L34: {
                                      if (stackIn_80_0 >= stackIn_80_1) {
                                        break L34;
                                      } else {
                                        if (var3 >= ((jo) this).field_z) {
                                          break L34;
                                        } else {
                                          if (((jo) this).field_I[var2][var3].field_n != 30) {
                                            break L34;
                                          } else {
                                            var4 += 4;
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                    L35: {
                                      if (~var3 <= ~((jo) this).field_z) {
                                        break L35;
                                      } else {
                                        if (var2 <= 0) {
                                          break L35;
                                        } else {
                                          if (((jo) this).field_I[var2 - 1][var3].field_n == 30) {
                                            var4 += 8;
                                            break L35;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                    L36: {
                                      if (var2 <= 0) {
                                        break L36;
                                      } else {
                                        if (var3 <= 0) {
                                          break L36;
                                        } else {
                                          if (30 != ((jo) this).field_I[-1 + var2][-1 + var3].field_n) {
                                            break L36;
                                          } else {
                                            var4++;
                                            break L36;
                                          }
                                        }
                                      }
                                    }
                                    L37: {
                                      if (~((jo) this).field_a >= ~var2) {
                                        break L37;
                                      } else {
                                        if (var3 <= 0) {
                                          break L37;
                                        } else {
                                          if (((jo) this).field_I[var2][-1 + var3].field_n != 30) {
                                            break L37;
                                          } else {
                                            var4 += 2;
                                            break L37;
                                          }
                                        }
                                      }
                                    }
                                    L38: {
                                      if (0 < var4) {
                                        ((jo) this).field_j[var2][var3].field_n = 30;
                                        ((jo) this).field_j[var2][var3].field_k = var4;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    var3++;
                                    if (var5 == 0) {
                                      continue L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                              }
                              var2++;
                              if (var5 == 0) {
                                continue L29;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
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
              L2: {
                param1 = ((jo) this).a(((jo) this).field_r, (byte) -95, ((jo) this).field_q);
                if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-97)) {
                  break L2;
                } else {
                  if (((jo) this).field_i.field_h.a((byte) -101, ((jo) this).field_i.field_n, ((jo) this).field_q, ((jo) this).field_r)) {
                    break L2;
                  } else {
                    ((jo) this).field_m.a(param1.field_c + 1, param1.field_a + 1, 64);
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((jo) this).field_g.a(param1.field_c - -1, 1 + param1.field_a, 64);
              break L1;
            }
            L3: {
              var3_int = ((jo) this).field_i.field_L >> 2;
              var4 = 16777215;
              var5 = 192;
              if (param0 == 2024848226) {
                break L3;
              } else {
                ((jo) this).field_w = null;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jo.IA(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
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
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_44_0 = false;
        kv[][] stackIn_49_0 = null;
        kv[][] stackIn_50_0 = null;
        kv[][] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_218_0 = 0;
        sfa stackIn_221_0 = null;
        Object stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        int stackIn_225_2 = 0;
        Object stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        int stackIn_226_2 = 0;
        Object stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        int stackIn_227_2 = 0;
        int stackIn_227_3 = 0;
        int stackIn_259_0 = 0;
        gj stackIn_264_0 = null;
        gj stackIn_270_0 = null;
        Object stackIn_271_0 = null;
        tia stackIn_274_0 = null;
        Object stackIn_276_0 = null;
        int stackIn_286_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_290_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        boolean stackOut_43_0 = false;
        kv[][] stackOut_48_0 = null;
        kv[][] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        kv[][] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_283_0 = 0;
        boolean stackOut_282_0 = false;
        int stackOut_258_0 = 0;
        gj stackOut_263_0 = null;
        gj stackOut_269_0 = null;
        bw stackOut_270_0 = null;
        sfa stackOut_220_0 = null;
        Object stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        Object stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        int stackOut_226_2 = 0;
        int stackOut_226_3 = 0;
        Object stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        int stackOut_225_3 = 0;
        tia stackOut_273_0 = null;
        bw stackOut_275_0 = null;
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
          L3: {
            L4: {
              if (((jo) this).field_G.length <= var7_int) {
                break L4;
              } else {
                var8 = ((jo) this).field_G[var7_int];
                var6 = ((jo) this).a(var8[2], (byte) 120, var8[1]);
                vc.field_d[var8[0]].e(var6.field_c, var6.field_a);
                var7_int++;
                if (var23 != 0) {
                  break L3;
                } else {
                  if (var23 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (((jo) this).field_d <= 0) {
                break L5;
              } else {
                L6: {
                  var6 = ((jo) this).a(-3, (byte) -97, (((jo) this).field_i.field_h.field_z >> 1) - 1);
                  du.field_b.a(-42 + var6.field_c, -((jo) this).field_d + 106 + var6.field_a);
                  var7_int = var3;
                  if (mk.field_p == -1) {
                    break L6;
                  } else {
                    var7_int = -6 + (6 * mk.field_p / 640 + 6 * gd.field_m / 480);
                    break L6;
                  }
                }
                lu.field_f.a(-16 + (var6.field_c - -var7_int), var6.field_a - (-106 + ((jo) this).field_d) - -(var7_int >> 1));
                break L5;
              }
            }
            ((jo) this).field_k.b((jo) this, param0 ^ 18776);
            ((jo) this).field_k.a((jo) this, (byte) 117);
            break L3;
          }
          var7_int = 0;
          L7: while (true) {
            stackOut_15_0 = ((jo) this).field_a;
            stackIn_16_0 = stackOut_15_0;
            L8: while (true) {
              L9: {
                L10: {
                  if (stackIn_16_0 <= var7_int) {
                    break L10;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_23_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var23 != 0) {
                      break L9;
                    } else {
                      var8_int = stackIn_18_0;
                      if (((jo) this).field_z <= var8_int) {
                        var7_int++;
                        if (var23 == 0) {
                          continue L7;
                        } else {
                          break L10;
                        }
                      } else {
                        stackOut_19_0 = ((jo) this).field_i.field_h.a(var7_int, 120, ((jo) this).field_i.field_n, var8_int);
                        stackIn_16_0 = stackOut_19_0 ? 1 : 0;
                        continue L8;
                      }
                    }
                  }
                }
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L9;
              }
              var7_int = stackIn_23_0;
              L11: while (true) {
                stackOut_24_0 = ((jo) this).field_a;
                stackOut_24_1 = var7_int;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (stackIn_25_0 <= stackIn_25_1) {
                        break L14;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_32_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var23 != 0) {
                          break L13;
                        } else {
                          var8_int = stackIn_27_0;
                          if (var8_int >= ((jo) this).field_z) {
                            var7_int++;
                            if (var23 == 0) {
                              continue L11;
                            } else {
                              break L14;
                            }
                          } else {
                            stackOut_28_0 = -23;
                            stackOut_28_1 = ~((jo) this).field_I[var7_int][var8_int].field_n;
                            stackIn_25_0 = stackOut_28_0;
                            stackIn_25_1 = stackOut_28_1;
                            continue L12;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = ~((jo) this).field_i.field_h.field_o;
                    stackIn_32_0 = stackOut_31_0;
                    break L13;
                  }
                  L15: {
                    if (stackIn_32_0 == -3) {
                      var7 = ((jo) this).field_i.field_h.field_i;
                      var8_int = 0;
                      L16: while (true) {
                        if (var8_int >= var7.length) {
                          break L15;
                        } else {
                          var9_ref_int__ = var7[var8_int];
                          this.b(var9_ref_int__[0], (byte) 80, var9_ref_int__[1]);
                          var8_int++;
                          if (var23 == 0) {
                            continue L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  var7_int = 0;
                  L17: while (true) {
                    stackOut_38_0 = ((jo) this).field_a;
                    stackIn_39_0 = stackOut_38_0;
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (stackIn_39_0 <= var7_int) {
                            break L20;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_55_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var23 != 0) {
                              break L19;
                            } else {
                              var8_int = stackIn_41_0;
                              L21: while (true) {
                                L22: {
                                  if (var8_int >= ((jo) this).field_z) {
                                    break L22;
                                  } else {
                                    stackOut_43_0 = ((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_m;
                                    stackIn_39_0 = stackOut_43_0 ? 1 : 0;
                                    stackIn_44_0 = stackOut_43_0;
                                    if (var23 != 0) {
                                      continue L18;
                                    } else {
                                      L23: {
                                        if (!stackIn_44_0) {
                                          break L23;
                                        } else {
                                          if (!((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_d) {
                                            var9 = od.field_w[((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_n].field_f;
                                            var6 = ((jo) this).a(var8_int, (byte) -100, var7_int);
                                            if (var9 == -1) {
                                              break L23;
                                            } else {
                                              L24: {
                                                nk.a(((jo) this).field_y, 40 + var6.field_c, var6.field_a + 16, 38, 24);
                                                stackOut_48_0 = ve.field_m;
                                                stackIn_50_0 = stackOut_48_0;
                                                stackIn_49_0 = stackOut_48_0;
                                                if (var9 < 4) {
                                                  stackOut_50_0 = (kv[][]) (Object) stackIn_50_0;
                                                  stackOut_50_1 = var9;
                                                  stackIn_51_0 = stackOut_50_0;
                                                  stackIn_51_1 = stackOut_50_1;
                                                  break L24;
                                                } else {
                                                  stackOut_49_0 = (kv[][]) (Object) stackIn_49_0;
                                                  stackOut_49_1 = var9 + -4;
                                                  stackIn_51_0 = stackOut_49_0;
                                                  stackIn_51_1 = stackOut_49_1;
                                                  break L24;
                                                }
                                              }
                                              ((kv) (Object) stackIn_51_0[stackIn_51_1][(((jo) this).field_i.field_L >> 2) % 25]).e(44 + var6.field_c, -var3 + var6.field_a - 4);
                                              break L23;
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var8_int++;
                                      if (var23 == 0) {
                                        continue L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                var7_int++;
                                if (var23 == 0) {
                                  continue L17;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                        stackOut_54_0 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        break L19;
                      }
                      var7_int = stackIn_55_0;
                      L25: while (true) {
                        L26: {
                          L27: {
                            if (var7_int >= ((jo) this).field_z) {
                              break L27;
                            } else {
                              if (var23 != 0) {
                                break L26;
                              } else {
                                var8_int = 0;
                                L28: while (true) {
                                  L29: {
                                    L30: {
                                      if (((jo) this).field_a <= var8_int) {
                                        break L30;
                                      } else {
                                        var6 = ((jo) this).a(var7_int, (byte) -100, var8_int);
                                        if (var23 != 0) {
                                          break L29;
                                        } else {
                                          L31: {
                                            if (null != ((jo) this).field_i.field_D[var8_int][var7_int]) {
                                              ((jo) this).field_i.field_D[var8_int][var7_int].a(var6.field_a, 0, var6.field_c);
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          var8_int++;
                                          if (var23 == 0) {
                                            continue L28;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    var7_int++;
                                    break L29;
                                  }
                                  if (var23 == 0) {
                                    continue L25;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                          this.b(24731);
                          break L26;
                        }
                        L32: {
                          L33: {
                            var7_ref = ((jo) this).field_i.field_P;
                            if (var7_ref == null) {
                              break L33;
                            } else {
                              if (!((jo) this).field_i.field_l) {
                                break L33;
                              } else {
                                L34: {
                                  var8_int = 1;
                                  var9 = 0;
                                  var10 = 0;
                                  var12 = 0;
                                  var11_int = 0;
                                  var13 = var7_ref.field_s.f((byte) 122);
                                  var14_ref_tv = (tv) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                  if (!hl.a((byte) 109, ((jo) this).field_i.field_Z.field_g)) {
                                    break L34;
                                  } else {
                                    var13 = var13 << 1;
                                    var13 = var13 + var14_ref_tv.field_l;
                                    break L34;
                                  }
                                }
                                L35: {
                                  if (var7_ref.field_s.field_y != 32) {
                                    stackOut_74_0 = 0;
                                    stackIn_75_0 = stackOut_74_0;
                                    break L35;
                                  } else {
                                    stackOut_73_0 = 1;
                                    stackIn_75_0 = stackOut_73_0;
                                    break L35;
                                  }
                                }
                                L36: {
                                  var15 = stackIn_75_0;
                                  var16 = var7_ref.field_s.field_x;
                                  var17 = var7_ref.field_s.field_J;
                                  if (var15 != 0) {
                                    break L36;
                                  } else {
                                    if (((jo) this).field_i.field_h.field_E != 0) {
                                      break L36;
                                    } else {
                                      if (((jo) this).field_i.field_h.field_a[var16][var17].field_i) {
                                        break L36;
                                      } else {
                                        var13 = var13 >> 1;
                                        break L36;
                                      }
                                    }
                                  }
                                }
                                L37: while (true) {
                                  if (var8_int >= var13 - -1) {
                                    break L33;
                                  } else {
                                    stackOut_80_0 = var11_int;
                                    stackIn_218_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if (var23 != 0) {
                                      break L32;
                                    } else {
                                      L38: {
                                        L39: {
                                          if (stackIn_81_0 != 0) {
                                            break L39;
                                          } else {
                                            if (var16 + -var8_int < 0) {
                                              break L39;
                                            } else {
                                              L40: {
                                                L41: {
                                                  if (var15 != 0) {
                                                    break L41;
                                                  } else {
                                                    if (!((jo) this).field_I[var16 + -var8_int][var17].e(-53)) {
                                                      break L40;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -98, ((jo) this).field_i.field_n, -var8_int + var16, var17)) {
                                                        break L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17, (byte) -100, var16 - var8_int);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                                if (-var8_int + var16 != ((jo) this).field_q) {
                                                  break L38;
                                                } else {
                                                  if (var17 != ((jo) this).field_r) {
                                                    break L38;
                                                  } else {
                                                    var2 = 1;
                                                    this.a(true, var6, 18503);
                                                    if (var23 == 0) {
                                                      break L38;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                              }
                                              var11_int = 1;
                                              if (var23 == 0) {
                                                break L38;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                        }
                                        var11_int = 1;
                                        break L38;
                                      }
                                      L42: {
                                        L43: {
                                          if (var9 != 0) {
                                            break L43;
                                          } else {
                                            if (-var8_int + var17 < 0) {
                                              break L43;
                                            } else {
                                              L44: {
                                                L45: {
                                                  if (var15 != 0) {
                                                    break L45;
                                                  } else {
                                                    if (!((jo) this).field_I[var16][-var8_int + var17].e(-30)) {
                                                      break L44;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -127, ((jo) this).field_i.field_n, var16, -var8_int + var17)) {
                                                        break L44;
                                                      } else {
                                                        break L45;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17 - var8_int, (byte) -100, var16);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, 128 + -(10 * var3));
                                                if (((jo) this).field_q != var16) {
                                                  break L42;
                                                } else {
                                                  if (((jo) this).field_r != var17 + -var8_int) {
                                                    break L42;
                                                  } else {
                                                    this.a(true, var6, 18503);
                                                    var2 = 1;
                                                    if (var23 == 0) {
                                                      break L42;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                              }
                                              var9 = 1;
                                              if (var23 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                        }
                                        var9 = 1;
                                        break L42;
                                      }
                                      L46: {
                                        L47: {
                                          if (var12 != 0) {
                                            break L47;
                                          } else {
                                            if (-1 + ((jo) this).field_a < var8_int + var16) {
                                              break L47;
                                            } else {
                                              L48: {
                                                if (var15 != 0) {
                                                  break L48;
                                                } else {
                                                  L49: {
                                                    if (!((jo) this).field_I[var16 - -var8_int][var17].e(param0 + 32003)) {
                                                      break L49;
                                                    } else {
                                                      if (!((jo) this).field_i.field_h.a((byte) -100, ((jo) this).field_i.field_n, var8_int + var16, var17)) {
                                                        break L48;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                  }
                                                  var12 = 1;
                                                  if (var23 == 0) {
                                                    break L46;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                              }
                                              var6 = ((jo) this).a(var17, (byte) -118, var16 + var8_int);
                                              ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                              if (var16 + var8_int != ((jo) this).field_q) {
                                                break L46;
                                              } else {
                                                if (var17 != ((jo) this).field_r) {
                                                  break L46;
                                                } else {
                                                  this.a(true, var6, param0 + 50598);
                                                  var2 = 1;
                                                  if (var23 == 0) {
                                                    break L46;
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 1;
                                        break L46;
                                      }
                                      L50: {
                                        L51: {
                                          if (var10 != 0) {
                                            break L51;
                                          } else {
                                            if (((jo) this).field_z - 1 < var8_int + var17) {
                                              break L51;
                                            } else {
                                              L52: {
                                                L53: {
                                                  if (var15 != 0) {
                                                    break L53;
                                                  } else {
                                                    if (!((jo) this).field_I[var16][var17 - -var8_int].e(-78)) {
                                                      break L52;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -121, ((jo) this).field_i.field_n, var16, var17 + var8_int)) {
                                                        break L52;
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17 + var8_int, (byte) 83, var16);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                                if (((jo) this).field_q != var16) {
                                                  break L50;
                                                } else {
                                                  if (var17 + var8_int != ((jo) this).field_r) {
                                                    break L50;
                                                  } else {
                                                    var2 = 1;
                                                    this.a(true, var6, 18503);
                                                    if (var23 == 0) {
                                                      break L50;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                }
                                              }
                                              var10 = 1;
                                              if (var23 == 0) {
                                                break L50;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                        }
                                        var10 = 1;
                                        break L50;
                                      }
                                      var8_int++;
                                      if (var23 == 0) {
                                        continue L37;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L54: {
                            if (var7_ref == null) {
                              break L54;
                            } else {
                              if (!((jo) this).field_i.field_ab) {
                                break L54;
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
                                L55: while (true) {
                                  L56: {
                                    if (1 + var12 <= var13) {
                                      stackOut_166_0 = var14;
                                      stackIn_167_0 = stackOut_166_0;
                                      break L56;
                                    } else {
                                      stackOut_130_0 = var19;
                                      stackIn_167_0 = stackOut_130_0;
                                      stackIn_131_0 = stackOut_130_0;
                                      if (var23 != 0) {
                                        break L56;
                                      } else {
                                        L57: {
                                          L58: {
                                            L59: {
                                              if (stackIn_131_0 != 0) {
                                                break L59;
                                              } else {
                                                if (var21 + -var13 >= 0) {
                                                  break L58;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            var19 = 1;
                                            if (var23 == 0) {
                                              break L57;
                                            } else {
                                              break L58;
                                            }
                                          }
                                          L60: {
                                            var6 = ((jo) this).a(var22, (byte) 97, -var13 + var21);
                                            if (var21 - var13 != ((jo) this).field_q) {
                                              break L60;
                                            } else {
                                              if (var22 == ((jo) this).field_r) {
                                                var14 = 1;
                                                var16 = var13;
                                                var2 = 1;
                                                var15 = 2;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            }
                                          }
                                          ((jo) this).field_C.a(var6.field_c, var6.field_a, 64 + -(var3 * 10));
                                          break L57;
                                        }
                                        L61: {
                                          L62: {
                                            if (var17 != 0) {
                                              break L62;
                                            } else {
                                              if (0 > -var13 + var22) {
                                                break L62;
                                              } else {
                                                L63: {
                                                  var6 = ((jo) this).a(var22 + -var13, (byte) 32, var21);
                                                  if (var21 != ((jo) this).field_q) {
                                                    break L63;
                                                  } else {
                                                    if (((jo) this).field_r == -var13 + var22) {
                                                      var14 = 1;
                                                      var16 = var13;
                                                      var15 = 1;
                                                      var2 = 1;
                                                      break L63;
                                                    } else {
                                                      break L63;
                                                    }
                                                  }
                                                }
                                                ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
                                                if (var23 == 0) {
                                                  break L61;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                          }
                                          var17 = 1;
                                          break L61;
                                        }
                                        L64: {
                                          L65: {
                                            if (var20 != 0) {
                                              break L65;
                                            } else {
                                              if (((jo) this).field_a + -1 < var13 + var21) {
                                                break L65;
                                              } else {
                                                L66: {
                                                  var6 = ((jo) this).a(var22, (byte) 50, var21 + var13);
                                                  if (((jo) this).field_q != var13 + var21) {
                                                    break L66;
                                                  } else {
                                                    if (var22 == ((jo) this).field_r) {
                                                      var16 = var13;
                                                      var15 = 4;
                                                      var14 = 1;
                                                      var2 = 1;
                                                      break L66;
                                                    } else {
                                                      break L66;
                                                    }
                                                  }
                                                }
                                                ((jo) this).field_C.a(var6.field_c, var6.field_a, -(var3 * 10) + 64);
                                                if (var23 == 0) {
                                                  break L64;
                                                } else {
                                                  break L65;
                                                }
                                              }
                                            }
                                          }
                                          var20 = 1;
                                          break L64;
                                        }
                                        L67: {
                                          L68: {
                                            L69: {
                                              if (var18 != 0) {
                                                break L69;
                                              } else {
                                                if (-1 + ((jo) this).field_z >= var22 + var13) {
                                                  break L68;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                            }
                                            var18 = 1;
                                            if (var23 == 0) {
                                              break L67;
                                            } else {
                                              break L68;
                                            }
                                          }
                                          L70: {
                                            var6 = ((jo) this).a(var13 + var22, (byte) 104, var21);
                                            if (((jo) this).field_q != var21) {
                                              break L70;
                                            } else {
                                              if (var22 - -var13 == ((jo) this).field_r) {
                                                var15 = 3;
                                                var2 = 1;
                                                var16 = var13;
                                                var14 = 1;
                                                break L70;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                          ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
                                          break L67;
                                        }
                                        var13++;
                                        continue L55;
                                      }
                                    }
                                  }
                                  if (stackIn_167_0 != 0) {
                                    L71: {
                                      if (2 == var11.field_p) {
                                        var16++;
                                        break L71;
                                      } else {
                                        break L71;
                                      }
                                    }
                                    L72: {
                                      if (var11.field_p == 3) {
                                        var16++;
                                        break L72;
                                      } else {
                                        break L72;
                                      }
                                    }
                                    this.a(var15, true, var11.field_r, var16, var7_ref.field_s.field_x, var7_ref.field_s.field_J, var5);
                                    this.a(true, var6, 18503);
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                          }
                          L73: {
                            if (var7_ref == null) {
                              break L73;
                            } else {
                              if (!((jo) this).field_i.field_w) {
                                break L73;
                              } else {
                                L74: {
                                  var8_ref2 = (hd) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                  if (0 != var8_ref2.c(0)) {
                                    break L74;
                                  } else {
                                    L75: {
                                      if (((jo) this).field_q == -1) {
                                        break L75;
                                      } else {
                                        if (((jo) this).field_r == -1) {
                                          break L75;
                                        } else {
                                          if (130 != var8_ref2.field_j) {
                                            break L75;
                                          } else {
                                            if (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l != null) {
                                              break L75;
                                            } else {
                                              if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-52)) {
                                                break L75;
                                              } else {
                                                var2 = 1;
                                                this.a(true, var6, 18503);
                                                if (var23 == 0) {
                                                  break L73;
                                                } else {
                                                  break L75;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (((jo) this).field_q == 0) {
                                      break L73;
                                    } else {
                                      if (0 == ((jo) this).field_r) {
                                        break L73;
                                      } else {
                                        if (var8_ref2.field_j != 130) {
                                          this.a(true, var6, 18503);
                                          var2 = 1;
                                          if (var23 == 0) {
                                            break L73;
                                          } else {
                                            break L74;
                                          }
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                  }
                                }
                                L76: {
                                  if (2 != var8_ref2.c(param0 ^ -32095)) {
                                    break L76;
                                  } else {
                                    L77: {
                                      if (((jo) this).field_q != 1 + var7_ref.field_s.field_x) {
                                        break L77;
                                      } else {
                                        if (var7_ref.field_s.field_J != ((jo) this).field_r) {
                                          break L77;
                                        } else {
                                          var2 = 1;
                                          this.a(true, var6, 18503);
                                          if (var23 == 0) {
                                            break L73;
                                          } else {
                                            break L77;
                                          }
                                        }
                                      }
                                    }
                                    L78: {
                                      if (((jo) this).field_q != var7_ref.field_s.field_x - 1) {
                                        break L78;
                                      } else {
                                        if (((jo) this).field_r != var7_ref.field_s.field_J) {
                                          break L78;
                                        } else {
                                          var2 = 1;
                                          this.a(true, var6, 18503);
                                          if (var23 == 0) {
                                            break L73;
                                          } else {
                                            break L78;
                                          }
                                        }
                                      }
                                    }
                                    L79: {
                                      L80: {
                                        if (var7_ref.field_s.field_x != ((jo) this).field_q) {
                                          break L80;
                                        } else {
                                          if (1 + var7_ref.field_s.field_J == ((jo) this).field_r) {
                                            break L79;
                                          } else {
                                            break L80;
                                          }
                                        }
                                      }
                                      if (var7_ref.field_s.field_x != ((jo) this).field_q) {
                                        break L73;
                                      } else {
                                        if (-1 + var7_ref.field_s.field_J != ((jo) this).field_r) {
                                          break L73;
                                        } else {
                                          this.a(true, var6, 18503);
                                          var2 = 1;
                                          if (var23 == 0) {
                                            break L73;
                                          } else {
                                            break L79;
                                          }
                                        }
                                      }
                                    }
                                    var2 = 1;
                                    this.a(true, var6, 18503);
                                    if (var23 == 0) {
                                      break L73;
                                    } else {
                                      break L76;
                                    }
                                  }
                                }
                                if (3 != var8_ref2.c(0)) {
                                  break L73;
                                } else {
                                  L81: {
                                    if (((jo) this).field_q == -1) {
                                      break L81;
                                    } else {
                                      if (-1 == ((jo) this).field_r) {
                                        break L81;
                                      } else {
                                        if (null != ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l) {
                                          this.a(true, var6, param0 + 50598);
                                          var2 = 1;
                                          break L81;
                                        } else {
                                          break L81;
                                        }
                                      }
                                    }
                                  }
                                  if (((jo) this).field_q == -1) {
                                    break L73;
                                  } else {
                                    if (((jo) this).field_r == -1) {
                                      break L73;
                                    } else {
                                      if (93 != var8_ref2.field_j) {
                                        break L73;
                                      } else {
                                        if (null == ((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 121)) {
                                          break L73;
                                        } else {
                                          if (((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 116).field_A) {
                                            var2 = 1;
                                            this.a(true, var6, 18503);
                                            break L73;
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_217_0 = 0;
                          stackIn_218_0 = stackOut_217_0;
                          break L32;
                        }
                        var8_int = stackIn_218_0;
                        L82: while (true) {
                          L83: {
                            if (((jo) this).field_i.field_Y.length <= var8_int) {
                              L84: {
                                if (null == ((jo) this).field_i.field_Z) {
                                  break L84;
                                } else {
                                  this.a(true, ((jo) this).field_i.field_Z);
                                  break L84;
                                }
                              }
                              L85: {
                                if (((jo) this).field_q == -1) {
                                  break L85;
                                } else {
                                  if (-1 != ((jo) this).field_r) {
                                    L86: {
                                      if (((jo) this).field_i.field_J) {
                                        break L86;
                                      } else {
                                        if (null != ((jo) this).field_i.field_Z) {
                                          break L86;
                                        } else {
                                          if (0 == ((jo) this).field_i.field_M) {
                                            break L86;
                                          } else {
                                            this.a(2024848226, var6);
                                            if (var23 == 0) {
                                              break L85;
                                            } else {
                                              break L86;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (((jo) this).field_i.field_Z == null) {
                                      break L85;
                                    } else {
                                      if (var2 == 0) {
                                        this.a(false, var6, param0 + 50598);
                                        break L85;
                                      } else {
                                        break L85;
                                      }
                                    }
                                  } else {
                                    break L85;
                                  }
                                }
                              }
                              L87: {
                                L88: {
                                  this.a((byte) -116, var6);
                                  if (3 != ((jo) this).field_i.field_h.field_o) {
                                    break L88;
                                  } else {
                                    var8_int = 0;
                                    L89: while (true) {
                                      if (((jo) this).field_i.field_h.field_c.length <= var8_int) {
                                        break L88;
                                      } else {
                                        this.b(var8_int, -101);
                                        var8_int++;
                                        if (var23 != 0) {
                                          break L87;
                                        } else {
                                          continue L89;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8_int = 0;
                                break L87;
                              }
                              stackOut_250_0 = var8_int;
                              stackIn_290_0 = stackOut_250_0;
                              L90: while (true) {
                                L91: {
                                  L92: {
                                    if (stackIn_290_0 >= ((jo) this).field_i.field_h.field_z) {
                                      break L92;
                                    } else {
                                      stackOut_288_0 = 0;
                                      stackIn_259_0 = stackOut_288_0;
                                      stackIn_289_0 = stackOut_288_0;
                                      if (var23 != 0) {
                                        break L91;
                                      } else {
                                        stackOut_289_0 = stackIn_289_0;
                                        stackIn_286_0 = stackOut_289_0;
                                        var9 = stackIn_286_0;
                                        if (var9 >= ((jo) this).field_i.field_h.field_B) {
                                          var8_int++;
                                          if (var23 == 0) {
                                            stackOut_283_0 = var8_int;
                                            stackIn_290_0 = stackOut_283_0;
                                            continue L90;
                                          } else {
                                            break L92;
                                          }
                                        } else {
                                          var6 = ((jo) this).a(var9, (byte) 124, var8_int);
                                          stackOut_282_0 = ((jo) this).field_i.field_h.field_a[var8_int][var9].field_d;
                                          stackIn_290_0 = stackOut_282_0 ? 1 : 0;
                                          continue L90;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_258_0 = 0;
                                  stackIn_259_0 = stackOut_258_0;
                                  break L91;
                                }
                                var8_int = stackIn_259_0;
                                L93: while (true) {
                                  L94: {
                                    L95: {
                                      if (((jo) this).field_z <= var8_int) {
                                        break L95;
                                      } else {
                                        var9 = 0;
                                        L96: while (true) {
                                          L97: {
                                            if (var9 >= ((jo) this).field_a) {
                                              break L97;
                                            } else {
                                              var6 = ((jo) this).a(var8_int, (byte) 115, var9);
                                              stackOut_263_0 = ((jo) this).field_i;
                                              stackIn_270_0 = stackOut_263_0;
                                              stackIn_264_0 = stackOut_263_0;
                                              if (var23 != 0) {
                                                break L94;
                                              } else {
                                                L98: {
                                                  if (stackIn_264_0.field_D[var9][var8_int] != null) {
                                                    ((jo) this).field_i.field_D[var9][var8_int].a(var6.field_a, true, var6.field_c);
                                                    break L98;
                                                  } else {
                                                    break L98;
                                                  }
                                                }
                                                var9++;
                                                if (var23 == 0) {
                                                  continue L96;
                                                } else {
                                                  break L97;
                                                }
                                              }
                                            }
                                          }
                                          var8_int++;
                                          if (var23 == 0) {
                                            continue L93;
                                          } else {
                                            break L95;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_269_0 = ((jo) this).field_i;
                                    stackIn_270_0 = stackOut_269_0;
                                    break L94;
                                  }
                                  stackOut_270_0 = ((eaa) (Object) stackIn_270_0.field_fb).b((byte) 90);
                                  stackIn_271_0 = (Object) (Object) stackOut_270_0;
                                  break L83;
                                }
                              }
                            } else {
                              var9_ref_sfa = ((jo) this).field_i.field_Y[var8_int];
                              stackOut_220_0 = (sfa) var9_ref_sfa;
                              stackIn_271_0 = (Object) (Object) stackOut_220_0;
                              stackIn_221_0 = stackOut_220_0;
                              if (var23 != 0) {
                                break L83;
                              } else {
                                L99: {
                                  L100: {
                                    if (stackIn_221_0 != null) {
                                      break L100;
                                    } else {
                                      if (var23 == 0) {
                                        break L99;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                  L101: {
                                    stackOut_224_0 = this;
                                    stackOut_224_1 = -64;
                                    stackOut_224_2 = var5;
                                    stackIn_226_0 = stackOut_224_0;
                                    stackIn_226_1 = stackOut_224_1;
                                    stackIn_226_2 = stackOut_224_2;
                                    stackIn_225_0 = stackOut_224_0;
                                    stackIn_225_1 = stackOut_224_1;
                                    stackIn_225_2 = stackOut_224_2;
                                    if (var8_int != var4) {
                                      stackOut_226_0 = this;
                                      stackOut_226_1 = stackIn_226_1;
                                      stackOut_226_2 = stackIn_226_2;
                                      stackOut_226_3 = 0;
                                      stackIn_227_0 = stackOut_226_0;
                                      stackIn_227_1 = stackOut_226_1;
                                      stackIn_227_2 = stackOut_226_2;
                                      stackIn_227_3 = stackOut_226_3;
                                      break L101;
                                    } else {
                                      stackOut_225_0 = this;
                                      stackOut_225_1 = stackIn_225_1;
                                      stackOut_225_2 = stackIn_225_2;
                                      stackOut_225_3 = 1;
                                      stackIn_227_0 = stackOut_225_0;
                                      stackIn_227_1 = stackOut_225_1;
                                      stackIn_227_2 = stackOut_225_2;
                                      stackIn_227_3 = stackOut_225_3;
                                      break L101;
                                    }
                                  }
                                  this.a(stackIn_227_1, stackIn_227_2, stackIn_227_3 != 0, var9_ref_sfa);
                                  this.a(true, var9_ref_sfa);
                                  break L99;
                                }
                                var8_int++;
                                continue L82;
                              }
                            }
                          }
                          var8_ref3 = (tia) (Object) stackIn_271_0;
                          L102: while (true) {
                            L103: {
                              L104: {
                                if (var8_ref3 == null) {
                                  break L104;
                                } else {
                                  var6 = this.a((byte) 126, var8_ref3.field_h);
                                  var8_ref3.a(var6.field_a + 32, 25415, 64 + var6.field_c);
                                  stackOut_273_0 = (tia) (Object) ((jo) this).field_i.field_fb.c(0);
                                  stackIn_276_0 = (Object) (Object) stackOut_273_0;
                                  stackIn_274_0 = stackOut_273_0;
                                  if (var23 != 0) {
                                    break L103;
                                  } else {
                                    var8_ref3 = stackIn_274_0;
                                    if (var23 == 0) {
                                      continue L102;
                                    } else {
                                      break L104;
                                    }
                                  }
                                }
                              }
                              stackOut_275_0 = ((jo) this).field_i.field_j.b((byte) 90);
                              stackIn_276_0 = (Object) (Object) stackOut_275_0;
                              break L103;
                            }
                            var25 = (at) (Object) stackIn_276_0;
                            L105: while (true) {
                              L106: {
                                if (var25 == null) {
                                  break L106;
                                } else {
                                  var25.c(-59);
                                  var25 = (at) (Object) ((jo) this).field_i.field_j.c(0);
                                  if (var23 != 0) {
                                    break L106;
                                  } else {
                                    if (var23 == 0) {
                                      continue L105;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final aj b(int param0, int param1, int param2) {
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
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
          stackOut_3_0 = -1;
          stackIn_4_0 = stackOut_3_0;
          L2: while (true) {
            if (stackIn_4_0 >= ~var5) {
              var6 = -1 + ((jo) this).field_a;
              L3: while (true) {
                L4: {
                  if (var6 < 0) {
                    break L4;
                  } else {
                    var4 = ((jo) this).a(var5, (byte) 100, var6);
                    stackOut_8_0 = ((jo) this).field_p.a(var4.field_c, var4.field_a, param0, param2);
                    stackIn_4_0 = stackOut_8_0 ? 1 : 0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var7 != 0) {
                      continue L2;
                    } else {
                      if (stackIn_9_0) {
                        return new aj(var6, var5);
                      } else {
                        var6--;
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var5--;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void b(byte param0) {
        aj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_17_0 = 0;
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
          stackOut_3_0 = var3;
          stackOut_3_1 = ((jo) this).field_a;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_4_0 >= stackIn_4_1) {
                  break L4;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_18_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L3;
                  } else {
                    var4 = stackIn_6_0;
                    L5: while (true) {
                      L6: {
                        if (var4 >= ((jo) this).field_z) {
                          break L6;
                        } else {
                          var2 = ((jo) this).a(var4, (byte) 52, var3);
                          stackOut_8_0 = ~lf.field_c;
                          stackOut_8_1 = -1;
                          stackIn_4_0 = stackOut_8_0;
                          stackIn_4_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var5 != 0) {
                            continue L2;
                          } else {
                            L7: {
                              if (stackIn_9_0 == stackIn_9_1) {
                                break L7;
                              } else {
                                if (((jo) this).field_p.a(var2.field_c, var2.field_a, nfa.field_a, jc.field_r)) {
                                  ((jo) this).field_s = var3;
                                  ((jo) this).field_h = var4;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (!((jo) this).field_p.a(var2.field_c, var2.field_a, mk.field_p, gd.field_m)) {
                                break L8;
                              } else {
                                ((jo) this).field_q = var3;
                                ((jo) this).field_r = var4;
                                break L8;
                              }
                            }
                            var4++;
                            if (var5 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = ((jo) this).field_q;
              stackIn_18_0 = stackOut_17_0;
              break L3;
            }
            L9: {
              if (stackIn_18_0 != -1) {
                if (-1 != ((jo) this).field_F) {
                  int fieldTemp$4 = ((jo) this).field_F + 1;
                  ((jo) this).field_F = ((jo) this).field_F + 1;
                  if (fieldTemp$4 < 120) {
                    break L9;
                  } else {
                    ((jo) this).field_F = -1;
                    break L9;
                  }
                } else {
                  if (-1 == ((jo) this).field_F) {
                    break L9;
                  } else {
                    int fieldTemp$5 = ((jo) this).field_F + 1;
                    ((jo) this).field_F = ((jo) this).field_F + 1;
                    if (fieldTemp$5 < 120) {
                      break L9;
                    } else {
                      ((jo) this).field_F = -1;
                      break L9;
                    }
                  }
                }
              } else {
                if (-1 != ((jo) this).field_F) {
                  int fieldTemp$6 = ((jo) this).field_F + 1;
                  ((jo) this).field_F = ((jo) this).field_F + 1;
                  if (fieldTemp$6 < 120) {
                    break L9;
                  } else {
                    ((jo) this).field_F = -1;
                    break L9;
                  }
                } else {
                  if (-1 == ((jo) this).field_F) {
                    break L9;
                  } else {
                    int fieldTemp$7 = ((jo) this).field_F + 1;
                    ((jo) this).field_F = ((jo) this).field_F + 1;
                    if (fieldTemp$7 < 120) {
                      break L9;
                    } else {
                      ((jo) this).field_F = -1;
                      break L9;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(boolean param0, aj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                this.b((aj) null, -117, -116, -84);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var3_int = ((jo) this).field_i.field_h.field_E;
                    if (1 == var3_int) {
                      break L5;
                    } else {
                      if (var3_int == 0) {
                        break L4;
                      } else {
                        if (var3_int != 2) {
                          break L2;
                        } else {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  var3_int = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (1 + ((jo) this).field_a <= var3_int) {
                          break L8;
                        } else {
                          param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 27, var3_int);
                          stackOut_10_0 = var3_int;
                          stackIn_17_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var4 != 0) {
                            break L7;
                          } else {
                            L9: {
                              L10: {
                                if (stackIn_11_0 != 0) {
                                  break L10;
                                } else {
                                  as.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              as.field_a[5 * ((jo) this).field_i.field_h.field_E - -2].a(param1.field_c + 14, param1.field_a - -48, 128);
                              break L9;
                            }
                            var3_int++;
                            if (var4 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L7;
                    }
                    var3_int = stackIn_17_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (((jo) this).field_z - -1 <= var3_int) {
                            break L13;
                          } else {
                            param1 = ((jo) this).a(var3_int, (byte) -116, ((jo) this).field_a + 1);
                            if (var4 != 0) {
                              break L12;
                            } else {
                              L14: {
                                L15: {
                                  if (var3_int == 0) {
                                    break L15;
                                  } else {
                                    ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, param1.field_a + 48, 128);
                                    if (var4 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 14, 48 + param1.field_a, 128);
                                break L14;
                              }
                              var3_int++;
                              if (var4 == 0) {
                                continue L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
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
                        break L12;
                      }
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3_int = -1;
                L16: while (true) {
                  L17: {
                    L18: {
                      L19: {
                        L20: {
                          if (((jo) this).field_a - -1 <= var3_int) {
                            break L20;
                          } else {
                            param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) -110, var3_int);
                            stackOut_29_0 = -1;
                            stackOut_29_1 = var3_int;
                            stackIn_37_0 = stackOut_29_0;
                            stackIn_37_1 = stackOut_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            if (var4 != 0) {
                              L21: while (true) {
                                if ((stackIn_37_0 ^ stackIn_37_1) <= 0) {
                                  break L18;
                                } else {
                                  param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) 74, var3_int);
                                  as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(30 + param1.field_c, 40 + param1.field_a, 128);
                                  var3_int++;
                                  if (var4 != 0) {
                                    break L17;
                                  } else {
                                    if (var4 == 0) {
                                      stackOut_36_0 = var3_int;
                                      stackOut_36_1 = -1;
                                      stackIn_37_0 = stackOut_36_0;
                                      stackIn_37_1 = stackOut_36_1;
                                      continue L21;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            } else {
                              L22: {
                                L23: {
                                  if (stackIn_30_0 == stackIn_30_1) {
                                    break L23;
                                  } else {
                                    as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, 48 + param1.field_a, 128);
                                    if (var4 == 0) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                as.field_a[1 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a + 48, 128);
                                break L22;
                              }
                              var3_int++;
                              if (var4 == 0) {
                                continue L16;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        var3_int = -5;
                        L24: while (true) {
                          stackOut_36_0 = var3_int;
                          stackOut_36_1 = -1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if ((stackIn_37_0 ^ stackIn_37_1) <= 0) {
                            break L18;
                          } else {
                            param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) 74, var3_int);
                            as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(30 + param1.field_c, 40 + param1.field_a, 128);
                            var3_int++;
                            if (var4 != 0) {
                              break L17;
                            } else {
                              if (var4 == 0) {
                                continue L24;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      break L18;
                    }
                    var3_int = 0;
                    break L17;
                  }
                  L25: while (true) {
                    L26: {
                      L27: {
                        if (((jo) this).field_z + 1 <= var3_int) {
                          break L27;
                        } else {
                          param1 = ((jo) this).a(var3_int, (byte) 72, ((jo) this).field_a + 1);
                          if (var4 != 0) {
                            break L26;
                          } else {
                            L28: {
                              L29: {
                                if (var3_int == 0) {
                                  break L29;
                                } else {
                                  ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, 48 + param1.field_a, 128);
                                  if (var4 == 0) {
                                    break L28;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              ls.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(14 + param1.field_c, 48 + param1.field_a, 128);
                              break L28;
                            }
                            var3_int++;
                            if (var4 == 0) {
                              continue L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
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
                      break L26;
                    }
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var3_int = 0;
              L30: while (true) {
                L31: {
                  L32: {
                    L33: {
                      if (var3_int >= 1 + ((jo) this).field_a) {
                        break L33;
                      } else {
                        param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) -110, var3_int);
                        stackOut_53_0 = -1;
                        stackOut_53_1 = ~var3_int;
                        stackIn_61_0 = stackOut_53_0;
                        stackIn_61_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (var4 != 0) {
                          L34: while (true) {
                            if (stackIn_61_0 <= stackIn_61_1) {
                              break L32;
                            } else {
                              param1 = ((jo) this).a(var3_int, (byte) -112, ((jo) this).field_a - -1);
                              if (var4 != 0) {
                                break L31;
                              } else {
                                L35: {
                                  L36: {
                                    if (0 == var3_int) {
                                      break L36;
                                    } else {
                                      ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a - 32, 128);
                                      if (var4 == 0) {
                                        break L35;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 16, -32 + param1.field_a, 128);
                                  break L35;
                                }
                                var3_int++;
                                if (var4 == 0) {
                                  stackOut_60_0 = ((jo) this).field_z + 1;
                                  stackOut_60_1 = var3_int;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  continue L34;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                        } else {
                          L37: {
                            L38: {
                              if (stackIn_54_0 == stackIn_54_1) {
                                break L38;
                              } else {
                                as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a + -32, 128);
                                if (var4 == 0) {
                                  break L37;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            as.field_a[((jo) this).field_i.field_h.field_E * 5 + 1].a(16 + param1.field_c, param1.field_a - 32, 128);
                            break L37;
                          }
                          var3_int++;
                          if (var4 == 0) {
                            continue L30;
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                    var3_int = 0;
                    L39: while (true) {
                      stackOut_60_0 = ((jo) this).field_z + 1;
                      stackOut_60_1 = var3_int;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if (stackIn_61_0 <= stackIn_61_1) {
                        break L32;
                      } else {
                        param1 = ((jo) this).a(var3_int, (byte) -112, ((jo) this).field_a - -1);
                        if (var4 != 0) {
                          break L31;
                        } else {
                          L40: {
                            L41: {
                              if (0 == var3_int) {
                                break L41;
                              } else {
                                ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a - 32, 128);
                                if (var4 == 0) {
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 16, -32 + param1.field_a, 128);
                            break L40;
                          }
                          var3_int++;
                          if (var4 == 0) {
                            continue L39;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                  }
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
                  break L31;
                }
                as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(16 + param1.field_c, param1.field_a + -32, 128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var3 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var3;
            stackOut_71_1 = new StringBuilder().append("jo.DA(").append(param0).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L42;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L42;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
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
        } else {
          ((jo) this).field_b = 256 + -(128 * (param2 - param1) >> 1);
          ((jo) this).field_B = 208 - ((param1 + param2) * 64 >> 1);
          this.a((byte) -127);
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != -1907) {
          return;
        } else {
          ((jo) this).field_b = ((jo) this).field_b + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
          ((jo) this).field_B = ((jo) this).field_B + (-(param1 >> 1) + kla.a(param1, m.field_a, -2147483648));
          return;
        }
    }

    jo(gj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var4_ref_int____ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = BachelorFridge.field_y;
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
              L2: {
                L3: {
                  if (((jo) this).field_a + 2 <= var2_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var3 >= 2 + ((jo) this).field_z) {
                              break L6;
                            } else {
                              ((jo) this).field_j[var2_int][var3] = new bq(0);
                              var3++;
                              if (var6 != 0) {
                                break L5;
                              } else {
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L5;
                        }
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.a(true);
                this.c((byte) -124);
                stackOut_10_0 = ~((jo) this).field_i.field_n;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L7: {
                L8: {
                  if (stackIn_11_0 > -1) {
                    break L8;
                  } else {
                    var2_int = 0;
                    var3 = 0;
                    var4_ref_int____ = ((jo) this).field_i.field_h.field_L.b(((jo) this).field_i.field_n, -60);
                    var3 = var4_ref_int____[0][1];
                    var2_int = var4_ref_int____[0][0];
                    ((jo) this).a((byte) -57, var3, var2_int);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                ((jo) this).a((byte) -57, ((jo) this).field_z >> 1, ((jo) this).field_a >> 1);
                break L7;
              }
              ((jo) this).a(-22048);
              ((jo) this).field_G = new int[4][3];
              var2_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var2_int >= 4) {
                      break L11;
                    } else {
                      var3 = kla.a(9, ((jo) this).field_i.field_h.field_w, -2147483648);
                      var4 = 0;
                      var5 = 0;
                      if (var6 != 0) {
                        break L10;
                      } else {
                        L12: {
                          L13: {
                            if (var2_int != 0) {
                              break L13;
                            } else {
                              var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                              var4 = -3;
                              if (var6 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var2_int == 1) {
                              break L14;
                            } else {
                              L15: {
                                if (2 != var2_int) {
                                  break L15;
                                } else {
                                  var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                                  var5 = -3;
                                  if (var6 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (var2_int != 3) {
                                break L12;
                              } else {
                                var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                                var5 = ((jo) this).field_z - -3;
                                if (var6 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var4 = ((jo) this).field_a + 3;
                          var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                          break L12;
                        }
                        ((jo) this).field_G[var2_int] = new int[3];
                        var2_int++;
                        if (var6 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  ((jo) this).field_v = a.a(12889, 64, 16763049, 46335);
                  break L10;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("jo.<init>(");
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
              break L16;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    static {
    }
}
