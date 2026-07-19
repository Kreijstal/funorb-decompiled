/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ara extends jea {
    static jea field_ub;
    static int field_xb;
    static boolean field_wb;
    static String field_yb;
    private jea field_tb;
    static jpa field_vb;

    final boolean a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 >= 7) {
          this.c(42, true);
          if (-1 == (hf.field_b ^ -1)) {
            if (this.field_tb.field_y != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (0 != this.field_y) {
              L0: {
                if (this.field_tb.field_y == 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_yb = (String) null;
          this.c(42, true);
          if (-1 != (hf.field_b ^ -1)) {
            if (0 == this.field_y) {
              return true;
            } else {
              L1: {
                if (this.field_tb.field_y == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (this.field_tb.field_y == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = param5 + -param4;
            var7 = -param2 + param3;
            if (var7 != 0) {
              if (var6_int == 0) {
                uea.a(param3, param1, param4, param2, false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if ((var6_int ^ -1) <= -1) {
                    break L1;
                  } else {
                    var6_int = -var6_int;
                    break L1;
                  }
                }
                L2: {
                  if ((var7 ^ -1) > -1) {
                    var7 = -var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var7 >= var6_int) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_18_0;
                  if (var8 != 0) {
                    var9 = param2;
                    var10 = param3;
                    param2 = param4;
                    param3 = param5;
                    param4 = var9;
                    param5 = var10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 0) {
                    break L5;
                  } else {
                    field_xb = 36;
                    break L5;
                  }
                }
                L6: {
                  if (param3 < param2) {
                    var9 = param2;
                    param2 = param3;
                    var10 = param4;
                    param3 = var9;
                    param4 = param5;
                    param5 = var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = param4;
                  var10 = param3 + -param2;
                  var11 = param5 + -param4;
                  var12 = -(var10 >> -108411583);
                  if (param4 < param5) {
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    break L7;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_29_0 = stackOut_27_0;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_29_0;
                  if (-1 < (var11 ^ -1)) {
                    var11 = -var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    if (var8 == 0) {
                      break L10;
                    } else {
                      var14 = param2;
                      L11: while (true) {
                        if (var14 > param3) {
                          if (var15 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          vaa.field_a[var14][var9] = param1;
                          var12 = var12 + var11;
                          if (var15 != 0) {
                            break L9;
                          } else {
                            L12: {
                              if ((var12 ^ -1) >= -1) {
                                break L12;
                              } else {
                                var12 = var12 - var10;
                                var9 = var9 + var13;
                                break L12;
                              }
                            }
                            var14++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  var14 = param2;
                  L13: while (true) {
                    if (param3 < var14) {
                      break L9;
                    } else {
                      var12 = var12 + var11;
                      vaa.field_a[var9][var14] = param1;
                      if (var15 == 0) {
                        L14: {
                          if (-1 > (var12 ^ -1)) {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var14++;
                        continue L13;
                      } else {
                        return;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L15: {
                if (0 != var6_int) {
                  dfa.a(param2, param5, param4, param1, param0 + 0);
                  break L15;
                } else {
                  break L15;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "ara.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    ara(jea param0, jea param1, jea param2, jea param3, jea param4, jea param5) {
        RuntimeException var7 = null;
        jea var8 = null;
        jea var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jea var13 = null;
        jea var14 = null;
        int var15 = 0;
        int var16 = 0;
        jea var17 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new jea(0L, param1, iw.field_a.toUpperCase());
            var17.field_z = 1;
            this.field_tb = new jea(0L, param2);
            var8 = new jea(0L, param3);
            var9 = new jea(0L, param3, kpa.field_b);
            var9.field_z = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (ufa.field_q.length <= var12) {
                    break L3;
                  } else {
                    var13 = new jea(0L, param3, s.field_b[var12]);
                    var14 = new jea(0L, param3, ufa.field_q[var12]);
                    var15 = param3.field_H.b(ufa.field_q[var12]);
                    stackOut_3_0 = var11 ^ -1;
                    stackOut_3_1 = var15 ^ -1;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_8_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= stackIn_4_1) {
                          break L4;
                        } else {
                          var11 = var15;
                          break L4;
                        }
                      }
                      var13.a(65, 15, -23776, var10, 20);
                      var14.a(640, 15, -23776, var10, 90);
                      var8.b(-127, var13);
                      var10 += 30;
                      var8.b(-126, var14);
                      var12++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var17.a(20 + var11 - -90, 24, -23776, 0, 0);
                var10 += 15;
                this.a(var17.field_G, var17.field_t + var10, -23776, 100, 100);
                this.field_tb.a(15, 15, -23776, 5, -20 + var17.field_G);
                var8.a(this.field_G, this.field_t + -var17.field_t, -23776, var17.field_t, 0);
                var9.a(this.field_G, 15, -23776, 20, 0);
                var8.field_w = hca.c(var8.field_t, 2105376, 3, 11579568, -125, 8421504);
                var17.b(-125, this.field_tb);
                var8.b(-128, var9);
                this.b(-123, var17);
                this.b(-128, var8);
                stackOut_7_0 = -(this.field_t >> 9238561);
                stackOut_7_1 = 240;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              }
              var10 = stackIn_8_0 + stackIn_8_1;
              this.field_qb = -(this.field_G >> 48600193) + 320;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7);
            stackOut_10_1 = new StringBuilder().append("ara.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_yb = null;
        field_ub = null;
        field_vb = null;
        if (param0) {
            ara.a(true);
        }
    }

    static {
        field_yb = "<%0> finished";
    }
}
