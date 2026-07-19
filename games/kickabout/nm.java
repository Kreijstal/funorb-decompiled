/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static Kickabout field_g;
    int[] field_e;
    static oj field_d;
    private static int[] field_b;
    boolean field_j;
    private int[][] field_n;
    int field_f;
    static int[] field_i;
    int[] field_c;
    private int[] field_m;
    static int field_l;
    int field_h;
    static dp field_k;
    static String field_a;

    final static ut a(int param0, int param1, ut param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        ut var10 = null;
        ut stackIn_3_0 = null;
        ut stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_10_0 = null;
        ut stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var9 = new ut(param2.field_q, param2.field_w);
            var10 = var9;
            var4 = 16711935 & param0;
            var5 = param0 & 65280;
            if (param1 < -73) {
              var6 = 0;
              L1: while (true) {
                if (var10.field_y.length <= var6) {
                  stackOut_10_0 = (ut) (var10);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = param2.field_y[var6];
                    if (0 == var7) {
                      break L2;
                    } else {
                      if ((var7 ^ -1) == -65794) {
                        break L2;
                      } else {
                        var7 = var7 & 255;
                        var7 = (16711935 & var7 * var4 >> -1457702552) + ((var7 * var5 & 16711798) >> 641963176);
                        break L2;
                      }
                    }
                  }
                  var9.field_y[var6] = var7;
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (ut) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("nm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >= gs.field_a.length ? 100 : gs.field_a[param1];
        if (param0 >= -89) {
            return 7;
        }
        return 55 + var2 * 45 / 100;
    }

    private nm(sj param0, int param1, String param2) {
        this(param0, param1, param0.a((byte) -111, param2, param1));
    }

    nm(sj param0, String param1, String param2) {
        this(param0, param0.b(param1, -1), param2);
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 256) {
            return;
        }
        field_i = null;
        field_a = null;
        field_b = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_3_0 = false;
        boolean stackOut_4_0 = false;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 == -76) {
            break L0;
          } else {
            field_b = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = kl.field_t;
            stackIn_8_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param3 != ih.field_c) {
              break L2;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackIn_8_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (rm.field_C != param0) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = stackIn_4_0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (param2) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                stackOut_7_0 = stackIn_7_0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (stackIn_7_1 != (vi.field_n ? 1 : 0)) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = stackIn_8_0;
          stackOut_8_1 = 1;
          stackIn_10_0 = stackOut_8_0;
          stackIn_10_1 = stackOut_8_1;
          break L1;
        }
        L4: {
          kl.field_t = stackIn_10_0 | stackIn_10_1 != 0;
          wh.field_q = true;
          rl.field_r = -1;
          if (!param2) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        vi.field_n = stackIn_13_0 != 0;
        rm.field_C = param0;
        ih.field_c = param3;
    }

    private final void a(int param0, iw param1, int param2) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int[] array$12 = null;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if ((param0 ^ -1) != -2) {
                  if (param0 == 2) {
                    this.field_h = param1.a((byte) 81);
                    break L2;
                  } else {
                    if (param0 == 3) {
                      var4_int = param1.h((byte) -122);
                      this.field_m = new int[1 + var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          this.field_m[var4_int] = 9999999;
                          break L2;
                        } else {
                          this.field_m[var5] = param1.h((byte) -115);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (5 == param0) {
                        discarded$9 = param1.h((byte) -126);
                        break L2;
                      } else {
                        if (-7 != (param0 ^ -1)) {
                          if (-8 != (param0 ^ -1)) {
                            if (param0 != 8) {
                              if ((param0 ^ -1) == -10) {
                                discarded$10 = param1.h((byte) -106);
                                break L2;
                              } else {
                                if (-11 != (param0 ^ -1)) {
                                  if (11 == param0) {
                                    discarded$11 = param1.h((byte) -118);
                                    break L2;
                                  } else {
                                    if (param0 != 12) {
                                      if (-14 == (param0 ^ -1)) {
                                        var4_int = param1.a((byte) 81);
                                        this.field_n = new int[var4_int][];
                                        var5 = 0;
                                        L4: while (true) {
                                          if (var5 >= var4_int) {
                                            break L2;
                                          } else {
                                            L5: {
                                              var6 = param1.h((byte) -108);
                                              if ((var6 ^ -1) >= -1) {
                                                break L5;
                                              } else {
                                                array$12 = new int[var6];
                                                this.field_n[var5] = array$12;
                                                this.field_n[var5][0] = param1.i(-95);
                                                var7 = 1;
                                                L6: while (true) {
                                                  if (var6 <= var7) {
                                                    break L5;
                                                  } else {
                                                    this.field_n[var5][var7] = param1.a((byte) 81);
                                                    var7++;
                                                    continue L6;
                                                  }
                                                }
                                              }
                                            }
                                            var5++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        if ((param0 ^ -1) != -15) {
                                          if (-16 != (param0 ^ -1)) {
                                            if (-17 != (param0 ^ -1)) {
                                              if (18 == param0) {
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              var4_int = -111 / ((param2 - -70) / 46);
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var4_int = param1.h((byte) -117);
                                      var5 = 0;
                                      L7: while (true) {
                                        if (var4_int <= var5) {
                                          var5 = 0;
                                          L8: while (true) {
                                            if (var4_int <= var5) {
                                              break L2;
                                            } else {
                                              discarded$13 = param1.a((byte) 81);
                                              var5++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          discarded$14 = param1.a((byte) 81);
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  discarded$15 = param1.h((byte) -115);
                                  break L2;
                                }
                              }
                            } else {
                              this.field_f = param1.h((byte) -124);
                              this.field_j = false;
                              break L2;
                            }
                          } else {
                            discarded$16 = param1.a((byte) 81);
                            break L2;
                          }
                        } else {
                          discarded$17 = param1.a((byte) 81);
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  var4_int = param1.a((byte) 81);
                  this.field_c = new int[var4_int];
                  var5 = 0;
                  L9: while (true) {
                    if (var4_int <= var5) {
                      this.field_e = new int[var4_int];
                      var5 = 0;
                      L10: while (true) {
                        if (var4_int <= var5) {
                          var5 = 0;
                          L11: while (true) {
                            if (var4_int <= var5) {
                              break L2;
                            } else {
                              this.field_e[var5] = (param1.a((byte) 81) << -735689136) - -this.field_e[var5];
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          this.field_e[var5] = param1.a((byte) 81);
                          var5++;
                          continue L10;
                        }
                      }
                    } else {
                      this.field_c[var5] = param1.a((byte) 81);
                      var5++;
                      continue L9;
                    }
                  }
                }
              }
              var4_int = -111 / ((param2 - -70) / 46);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var4);
            stackOut_57_1 = new StringBuilder().append("nm.E(").append(param0).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L12;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L12;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, tf param5, byte param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var7_int = param0 + -param4;
            var8 = param2 - param3;
            var9 = de.a(var7_int * var7_int - -(var8 * var8), (byte) -98);
            var10 = var9 / param1;
            if (param6 < -10) {
              var11 = 0;
              L1: while (true) {
                if (-1 + var10 <= var11) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param5.a(ek.b(true, param4 + (param0 - param4) * var11 / (-1 + var10), param3 - -(var11 * (-param3 + param2) / (-1 + var10))), 3);
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var7);
            stackOut_7_1 = new StringBuilder().append("nm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, iw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.h((byte) -124);
              if (-1 != (var3_int ^ -1)) {
                this.a(var3_int, param1, param0 ^ 118);
                continue L1;
              } else {
                L2: {
                  if (param0 == -1) {
                    break L2;
                  } else {
                    field_l = -19;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("nm.A(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private nm(sj param0, int param1, int param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
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
        this.field_f = 0;
        this.field_h = -1;
        try {
          L0: {
            L1: {
              this.field_j = true;
              var11 = param0.b(param1, -32669, param2);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(-1, new iw(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (this.field_e.length <= var6) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (this.field_c.length <= var7) {
                    break L0;
                  } else {
                    L4: {
                      if (this.field_c[var7] <= var6) {
                        break L4;
                      } else {
                        var6 = this.field_c[var7];
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (var5 >= this.field_e[var6]) {
                    break L5;
                  } else {
                    var5 = this.field_e[var6];
                    break L5;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4_ref);
            stackOut_14_1 = new StringBuilder().append("nm.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            field_i = new int[89];
            field_b = new int[89];
            var0 = 0;
            L0: while (true) {
              if (var0 >= field_i.length) {
                field_l = 0;
                field_a = "All players have left <%0>'s game.";
                break $cfr$clinit;
              } else {
                L1: {
                  if (-1 != (var0 ^ -1)) {
                    if (1 != var0) {
                      if (2 == var0) {
                        field_i[var0] = 64;
                        break L1;
                      } else {
                        if (-4 != (var0 ^ -1)) {
                          if (var0 != 4) {
                            if (var0 == 5) {
                              field_i[var0] = 20;
                              break L1;
                            } else {
                              if (-7 == (var0 ^ -1)) {
                                field_i[var0] = 30;
                                break L1;
                              } else {
                                if (var0 != 7) {
                                  if (-9 == (var0 ^ -1)) {
                                    field_i[var0] = 30;
                                    break L1;
                                  } else {
                                    if (var0 != 9) {
                                      if ((var0 ^ -1) != -11) {
                                        if (var0 == 11) {
                                          field_i[var0] = 30;
                                          break L1;
                                        } else {
                                          if (12 == var0) {
                                            field_i[var0] = 30;
                                            break L1;
                                          } else {
                                            if (-14 != (var0 ^ -1)) {
                                              if ((var0 ^ -1) == -15) {
                                                field_i[var0] = 30;
                                                break L1;
                                              } else {
                                                if (15 != var0) {
                                                  if (-17 != (var0 ^ -1)) {
                                                    if ((var0 ^ -1) != -18) {
                                                      if (18 != var0) {
                                                        if (19 == var0) {
                                                          field_i[var0] = 30;
                                                          break L1;
                                                        } else {
                                                          if ((var0 ^ -1) == -21) {
                                                            field_i[var0] = 30;
                                                            break L1;
                                                          } else {
                                                            if (21 != var0) {
                                                              if (-23 != (var0 ^ -1)) {
                                                                if (23 == var0) {
                                                                  field_i[var0] = 30;
                                                                  break L1;
                                                                } else {
                                                                  if (-25 != (var0 ^ -1)) {
                                                                    if ((var0 ^ -1) == -26) {
                                                                      field_i[var0] = 30;
                                                                      break L1;
                                                                    } else {
                                                                      if ((var0 ^ -1) != -27) {
                                                                        if (27 != var0) {
                                                                          if (28 == var0) {
                                                                            field_i[var0] = 80;
                                                                            break L1;
                                                                          } else {
                                                                            if (-30 == (var0 ^ -1)) {
                                                                              field_i[var0] = 80;
                                                                              break L1;
                                                                            } else {
                                                                              if (30 == var0) {
                                                                                field_i[var0] = 100;
                                                                                break L1;
                                                                              } else {
                                                                                if (-32 != (var0 ^ -1)) {
                                                                                  if ((var0 ^ -1) != -33) {
                                                                                    if ((var0 ^ -1) != -34) {
                                                                                      if (34 == var0) {
                                                                                        field_i[var0] = 64;
                                                                                        break L1;
                                                                                      } else {
                                                                                        if (var0 == 35) {
                                                                                          field_i[var0] = 70;
                                                                                          break L1;
                                                                                        } else {
                                                                                          if (36 != var0) {
                                                                                            if (37 != var0) {
                                                                                              if (38 != var0) {
                                                                                                if (39 != var0) {
                                                                                                  if ((var0 ^ -1) != -41) {
                                                                                                    if (-42 == (var0 ^ -1)) {
                                                                                                      field_i[var0] = 64;
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if ((var0 ^ -1) == -43) {
                                                                                                        field_i[var0] = 64;
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        if (var0 != 43) {
                                                                                                          if (-45 != (var0 ^ -1)) {
                                                                                                            if ((var0 ^ -1) == -46) {
                                                                                                              field_i[var0] = 256;
                                                                                                              break L1;
                                                                                                            } else {
                                                                                                              if ((var0 ^ -1) == -47) {
                                                                                                                field_i[var0] = 256;
                                                                                                                break L1;
                                                                                                              } else {
                                                                                                                if ((var0 ^ -1) != -48) {
                                                                                                                  if (var0 != 48) {
                                                                                                                    if (var0 != 49) {
                                                                                                                      if ((var0 ^ -1) != -51) {
                                                                                                                        if ((var0 ^ -1) != -52) {
                                                                                                                          if (52 == var0) {
                                                                                                                            field_i[var0] = 256;
                                                                                                                            break L1;
                                                                                                                          } else {
                                                                                                                            if (53 != var0) {
                                                                                                                              if (54 == var0) {
                                                                                                                                field_i[var0] = 256;
                                                                                                                                break L1;
                                                                                                                              } else {
                                                                                                                                if (55 == var0) {
                                                                                                                                  field_i[var0] = 256;
                                                                                                                                  break L1;
                                                                                                                                } else {
                                                                                                                                  if (56 != var0) {
                                                                                                                                    if ((var0 ^ -1) != -58) {
                                                                                                                                      if (var0 != 58) {
                                                                                                                                        if (var0 != 59) {
                                                                                                                                          if (60 != var0) {
                                                                                                                                            if ((var0 ^ -1) != -62) {
                                                                                                                                              if (var0 == 62) {
                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                break L1;
                                                                                                                                              } else {
                                                                                                                                                if (var0 != 63) {
                                                                                                                                                  if ((var0 ^ -1) != -65) {
                                                                                                                                                    if ((var0 ^ -1) != -66) {
                                                                                                                                                      if (66 == var0) {
                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                        break L1;
                                                                                                                                                      } else {
                                                                                                                                                        if (var0 != 67) {
                                                                                                                                                          if (68 == var0) {
                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                            break L1;
                                                                                                                                                          } else {
                                                                                                                                                            if (var0 != 69) {
                                                                                                                                                              if (70 == var0) {
                                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                                break L1;
                                                                                                                                                              } else {
                                                                                                                                                                if (-72 != (var0 ^ -1)) {
                                                                                                                                                                  if (-73 == (var0 ^ -1)) {
                                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                                    break L1;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (-74 != (var0 ^ -1)) {
                                                                                                                                                                      if (var0 != 74) {
                                                                                                                                                                        if ((var0 ^ -1) == -76) {
                                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                                          break L1;
                                                                                                                                                                        } else {
                                                                                                                                                                          if ((var0 ^ -1) == -77) {
                                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                                            break L1;
                                                                                                                                                                          } else {
                                                                                                                                                                            if ((var0 ^ -1) != -78) {
                                                                                                                                                                              if ((var0 ^ -1) == -79) {
                                                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                                                break L1;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (79 == var0) {
                                                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                                                  break L1;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (80 != var0) {
                                                                                                                                                                                    if (var0 == 81) {
                                                                                                                                                                                      field_i[var0] = 50;
                                                                                                                                                                                      break L1;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (82 != var0) {
                                                                                                                                                                                        if ((var0 ^ -1) != -84) {
                                                                                                                                                                                          if (-85 == (var0 ^ -1)) {
                                                                                                                                                                                            field_i[var0] = 70;
                                                                                                                                                                                            break L1;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (var0 == 85) {
                                                                                                                                                                                              field_i[var0] = 70;
                                                                                                                                                                                              break L1;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if ((var0 ^ -1) == -87) {
                                                                                                                                                                                                field_i[var0] = 64;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (var0 == 87) {
                                                                                                                                                                                                  field_i[var0] = 64;
                                                                                                                                                                                                  break L1;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (-89 == (var0 ^ -1)) {
                                                                                                                                                                                                    field_i[var0] = 64;
                                                                                                                                                                                                    break L1;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                                                                    break L1;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        } else {
                                                                                                                                                                                          field_i[var0] = 100;
                                                                                                                                                                                          break L1;
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        field_i[var0] = 100;
                                                                                                                                                                                        break L1;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    field_i[var0] = 50;
                                                                                                                                                                                    break L1;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            } else {
                                                                                                                                                                              field_i[var0] = 256;
                                                                                                                                                                              break L1;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                                        break L1;
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                                      break L1;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                                  break L1;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              field_i[var0] = 256;
                                                                                                                                                              break L1;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                          break L1;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                      break L1;
                                                                                                                                                    }
                                                                                                                                                  } else {
                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                    break L1;
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                  break L1;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              field_i[var0] = 256;
                                                                                                                                              break L1;
                                                                                                                                            }
                                                                                                                                          } else {
                                                                                                                                            field_i[var0] = 256;
                                                                                                                                            break L1;
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          field_i[var0] = 256;
                                                                                                                                          break L1;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        field_i[var0] = 256;
                                                                                                                                        break L1;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      field_i[var0] = 256;
                                                                                                                                      break L1;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    field_i[var0] = 256;
                                                                                                                                    break L1;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              field_i[var0] = 256;
                                                                                                                              break L1;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          field_i[var0] = 256;
                                                                                                                          break L1;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        field_i[var0] = 128;
                                                                                                                        break L1;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      field_i[var0] = 256;
                                                                                                                      break L1;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    field_i[var0] = 256;
                                                                                                                    break L1;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  field_i[var0] = 256;
                                                                                                                  break L1;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            field_i[var0] = 256;
                                                                                                            break L1;
                                                                                                          }
                                                                                                        } else {
                                                                                                          field_i[var0] = 155;
                                                                                                          break L1;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    field_i[var0] = 64;
                                                                                                    break L1;
                                                                                                  }
                                                                                                } else {
                                                                                                  field_i[var0] = 64;
                                                                                                  break L1;
                                                                                                }
                                                                                              } else {
                                                                                                field_i[var0] = 64;
                                                                                                break L1;
                                                                                              }
                                                                                            } else {
                                                                                              field_i[var0] = 55;
                                                                                              break L1;
                                                                                            }
                                                                                          } else {
                                                                                            field_i[var0] = 40;
                                                                                            break L1;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      field_i[var0] = 64;
                                                                                      break L1;
                                                                                    }
                                                                                  } else {
                                                                                    field_i[var0] = 72;
                                                                                    break L1;
                                                                                  }
                                                                                } else {
                                                                                  field_i[var0] = 50;
                                                                                  break L1;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          field_i[var0] = 80;
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        field_i[var0] = 50;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    field_i[var0] = 80;
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                field_i[var0] = 30;
                                                                break L1;
                                                              }
                                                            } else {
                                                              field_i[var0] = 30;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        field_i[var0] = 30;
                                                        break L1;
                                                      }
                                                    } else {
                                                      field_i[var0] = 30;
                                                      break L1;
                                                    }
                                                  } else {
                                                    field_i[var0] = 30;
                                                    break L1;
                                                  }
                                                } else {
                                                  field_i[var0] = 30;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              field_i[var0] = 30;
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        field_i[var0] = 30;
                                        break L1;
                                      }
                                    } else {
                                      field_i[var0] = 30;
                                      break L1;
                                    }
                                  }
                                } else {
                                  field_i[var0] = 30;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            field_i[var0] = 20;
                            break L1;
                          }
                        } else {
                          field_i[var0] = 26;
                          break L1;
                        }
                      }
                    } else {
                      field_i[var0] = 64;
                      break L1;
                    }
                  } else {
                    field_i[var0] = 64;
                    break L1;
                  }
                }
                field_b[var0] = field_i[var0];
                var0++;
                continue L0;
              }
            }
        }
    }
}
