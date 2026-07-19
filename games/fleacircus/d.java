/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends bb {
    static boolean field_L;
    private id field_K;
    static ed field_O;
    int field_M;
    static int field_N;
    int field_P;
    private int field_R;
    static boolean field_Q;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
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
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var20 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param5 - param0 << 1723611368) / param2.field_x;
              var7 = var6_int * param2.field_q + (param0 << 1612409736);
              param3 = param3 + param2.field_q;
              param1 = param1 + param2.field_v;
              var8 = param3 - -(gb.field_d * param1);
              var9 = 0;
              var10 = param2.field_t;
              if (param4 == 2147483647) {
                break L1;
              } else {
                d.j(-47);
                break L1;
              }
            }
            L2: {
              var11 = param2.field_w;
              var12 = -var11 + gb.field_d;
              var13 = 0;
              if (gb.field_b <= param1) {
                break L2;
              } else {
                var14 = -param1 + gb.field_b;
                param1 = gb.field_b;
                var8 = var8 + gb.field_d * var14;
                var9 = var9 + var14 * var11;
                var10 = var10 - var14;
                break L2;
              }
            }
            L3: {
              if (var10 + param1 <= gb.field_i) {
                break L3;
              } else {
                var10 = var10 - (var10 + (param1 - gb.field_i));
                break L3;
              }
            }
            L4: {
              if (gb.field_l > param3) {
                var14 = gb.field_l - param3;
                var8 = var8 + var14;
                var9 = var9 + var14;
                var13 = var13 + var14;
                param3 = gb.field_l;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var6_int * var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 + param3 <= gb.field_h) {
                break L5;
              } else {
                var14 = var11 + (param3 - gb.field_h);
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if ((var10 ^ -1) >= -1) {
                  break L6;
                } else {
                  param1 = -var10;
                  L7: while (true) {
                    if (-1 >= (param1 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      if (var20 == 0) {
                        param3 = -var11;
                        L8: while (true) {
                          L9: {
                            if (-1 >= (param3 ^ -1)) {
                              var8 = var8 + var12;
                              stackOut_32_0 = var9;
                              stackOut_32_1 = var13;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              break L9;
                            } else {
                              var15 = var14 >> -2068757560;
                              var16 = 256 - var15;
                              var14 = var14 + var6_int;
                              stackOut_22_0 = -1;
                              stackOut_22_1 = var15 ^ -1;
                              stackIn_33_0 = stackOut_22_0;
                              stackIn_33_1 = stackOut_22_1;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              if (var20 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  L11: {
                                    if (stackIn_23_0 >= stackIn_23_1) {
                                      break L11;
                                    } else {
                                      var8++;
                                      var9++;
                                      if (var20 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    incrementValue$1 = var9;
                                    var9++;
                                    var17 = param2.field_B[incrementValue$1];
                                    if (0 == var17) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (255 < var15) {
                                          break L13;
                                        } else {
                                          var18 = gb.field_a[var8];
                                          var19 = (16711935 & var17) * var15 + (var18 & 16711935) * var16 >> -129030680 & 16711935;
                                          gb.field_a[var8] = (sc.a(16711908, sc.a(var17, 65280) * var15 + sc.a(65280, var18) * var16) >> -1641925464) + var19;
                                          if (var20 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      gb.field_a[var8] = var17;
                                      break L12;
                                    }
                                  }
                                  var8++;
                                  break L10;
                                }
                                param3++;
                                continue L8;
                              }
                            }
                          }
                          var9 = stackIn_33_0 + stackIn_33_1;
                          param1++;
                          continue L7;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var6);
            stackOut_35_1 = new StringBuilder().append("d.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L14;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L14;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static si a(int param0, ih param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        si stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        si stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b(8, (byte) -87);
            if (-1 <= (var2_int ^ -1)) {
              L1: {
                var3 = fb.a((byte) 98, param1) ? 1 : 0;
                var4 = fb.a((byte) 98, param1) ? 1 : 0;
                var5 = new si();
                var5.field_w = (short)param1.b(16, (byte) -87);
                var5.field_n = qg.a((byte) 125, var5.field_n, 16, param1);
                var5.field_f = qg.a((byte) 125, var5.field_f, 16, param1);
                var5.field_P = qg.a((byte) 125, var5.field_P, 16, param1);
                var5.field_j = (short)param1.b(16, (byte) -87);
                var5.field_Q = qg.a((byte) 125, var5.field_Q, 16, param1);
                var5.field_M = qg.a((byte) 125, var5.field_M, 16, param1);
                var5.field_N = qg.a((byte) 125, var5.field_N, 16, param1);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_p = (short)param1.b(16, (byte) -87);
                  var5.field_r = qg.a((byte) 125, var5.field_r, 16, param1);
                  var5.field_K = qg.a((byte) 125, var5.field_K, 16, param1);
                  var5.field_x = qg.a((byte) 125, var5.field_x, 16, param1);
                  var5.field_D = qg.a((byte) 125, var5.field_D, 16, param1);
                  var5.field_F = qg.a((byte) 125, var5.field_F, 16, param1);
                  var5.field_u = qg.a((byte) 125, var5.field_u, 16, param1);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  discarded$1 = param1.b(16, (byte) -87);
                  var5.field_E = qg.a((byte) 125, var5.field_E, 16, param1);
                  var5.field_i = qg.a((byte) 125, var5.field_i, 16, param1);
                  var5.field_t = qg.a((byte) 125, var5.field_t, 16, param1);
                  var5.field_q = qg.a((byte) 125, var5.field_q, 16, param1);
                  var5.field_l = qg.a((byte) 125, var5.field_l, 16, param1);
                  break L2;
                }
              }
              L3: {
                if (!fb.a((byte) 98, param1)) {
                  break L3;
                } else {
                  var5.field_s = qg.a((byte) 125, var5.field_s, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!fb.a((byte) 98, param1)) {
                  break L4;
                } else {
                  var5.field_J = bf.a(param1, 8, var5.field_J, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        L8: {
                          if (var5.field_J.length <= var7) {
                            break L8;
                          } else {
                            var10 = var6;
                            var9 = var5.field_J[var7] & 255;
                            if (var8 != 0) {
                              if (var9 != var10) {
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              L9: {
                                if (var9 <= var10) {
                                  break L9;
                                } else {
                                  var6 = var5.field_J[var7] & 255;
                                  break L9;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                      var5.field_J = null;
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                    var5.field_h = (byte)(1 + var6);
                    break L4;
                  }
                }
              }
              var6 = 37 / ((87 - param0) / 37);
              stackOut_23_0 = (si) (var5);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("d.FA(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        if (0 <= param0) {
          if (this.field_K.b(0) <= param0) {
            return -1;
          } else {
            var3 = 76 % ((param1 - 14) / 59);
            return this.field_K.b(param0, false);
          }
        } else {
          return -1;
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param4 - (param6 - -this.field_M);
                var9 = this.field_u - 2 * this.field_M;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 >= (var8_int ^ -1)) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = this.field_R * var8_int / var9;
                  if (param5 != 1) {
                    break L4;
                  } else {
                    this.field_K.a((byte) 47, var8_int);
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 != (param5 ^ -1)) {
                  break L3;
                } else {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var12 >= this.field_K.b(0)) {
                          break L7;
                        } else {
                          var13 = -var8_int + this.field_K.b(var12, false);
                          var13 = var13 * var13;
                          var16 = var13;
                          var15 = var10;
                          if (var14 != 0) {
                            if (var15 > var16) {
                              break L3;
                            } else {
                              break L6;
                            }
                          } else {
                            L8: {
                              if (var15 > var16) {
                                var11 = var12;
                                var10 = var13;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var12++;
                            if (var14 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (0 > var11) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                    this.field_K.b(1, var11);
                    break L3;
                  }
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var8);
            stackOut_26_1 = new StringBuilder().append("d.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 != -1) {
            field_O = (ed) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    final int i(int param0) {
        int discarded$0 = 0;
        if (param0 <= 24) {
            discarded$0 = this.i(-5);
            return this.field_K.b(0);
        }
        return this.field_K.b(0);
    }

    final static void a(int param0, int param1, qc param2, qc param3, int param4, int param5, int param6, fa param7, fa param8, qc param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              bk.a(-5237, param15, param7, param8);
              hg.a(0, param17, param0, param14, param16);
              rb.a(param6, param4, (byte) 83);
              sk.a(param11, param2, param5, 443, param3, param19);
              if (param20 == 255) {
                break L1;
              } else {
                field_Q = false;
                break L1;
              }
            }
            ai.a(param10, param1, param9, false);
            mh.a(param12, 1, param18, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var21);
            stackOut_4_1 = new StringBuilder().append("d.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param7 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param8 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param9 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 9) {
            this.field_K = (id) null;
            return this.field_R;
        }
        return this.field_R;
    }

    static {
        field_L = false;
        field_O = new ed();
    }
}
