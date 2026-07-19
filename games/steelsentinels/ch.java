/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ch extends lh implements lm {
    static boolean[] field_G;
    static int field_N;
    static String field_K;
    static String field_P;
    static String field_M;
    static k field_O;
    static int field_L;
    static String field_H;
    static String field_I;
    lh[] field_J;

    final boolean a(int param0, int param1, char param2, lh param3) {
        lh[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh var9 = null;
        lh[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        boolean stackOut_19_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != this.field_J) {
              L1: {
                if (param0 == 30373) {
                  break L1;
                } else {
                  var9 = (lh) null;
                  this.a((byte) -45, 101, 54, 104, (lh) null, -22);
                  break L1;
                }
              }
              var10 = this.field_J;
              var5 = var10;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var10.length <= var6) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var10[var6];
                      if (var7 == null) {
                        break L4;
                      } else {
                        if (!var7.d(0)) {
                          break L4;
                        } else {
                          if (var7.a(30373, param1, param2, param3)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6++;
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_int = param1;
                if ((var5_int ^ -1) == -81) {
                  L5: {
                    if (fc.field_e[81]) {
                      stackOut_19_0 = this.b(param3, (byte) -86);
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      stackOut_18_0 = this.a(param3, (byte) -70);
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5_ref);
            stackOut_21_1 = new StringBuilder().append("ch.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    private final boolean b(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -61) {
                break L1;
              } else {
                field_N = 50;
                break L1;
              }
            }
            stackOut_2_0 = this.b((byte) -127, param0, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ch.FA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_9_0 = null;
        lh stackIn_9_1 = null;
        Object stackIn_14_0 = null;
        lh stackIn_14_1 = null;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        lh stackOut_8_1 = null;
        Object stackOut_13_0 = null;
        lh stackOut_13_1 = null;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_J != null) {
              var4_int = 0;
              if (param0 == -68) {
                L1: while (true) {
                  L2: {
                    if (var4_int >= this.field_J.length) {
                      break L2;
                    } else {
                      var5 = this.field_J[var4_int];
                      stackOut_8_0 = null;
                      stackOut_8_1 = (lh) (var5);
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      L3: while (true) {
                        L4: {
                          if (stackIn_9_0 == stackIn_9_1) {
                            break L4;
                          } else {
                            if (!var5.d(0)) {
                              break L4;
                            } else {
                              var4_int = var4_int + param2;
                              L5: while (true) {
                                if (this.field_J.length <= var4_int) {
                                  break L4;
                                } else {
                                  var6 = this.field_J[var4_int];
                                  stackOut_13_0 = null;
                                  stackOut_13_1 = (lh) (var6);
                                  stackIn_9_0 = stackOut_13_0;
                                  stackIn_9_1 = stackOut_13_1;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  if (var7 != 0) {
                                    continue L3;
                                  } else {
                                    L6: {
                                      L7: {
                                        if (stackIn_14_0 != stackIn_14_1) {
                                          break L7;
                                        } else {
                                          if (var7 == 0) {
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      if (!var6.a(1, param1)) {
                                        break L6;
                                      } else {
                                        stackOut_18_0 = 1;
                                        stackIn_19_0 = stackOut_18_0;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    }
                                    var4_int = var4_int + param2;
                                    if (var7 == 0) {
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("ch.GA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        lh var6 = null;
        StringBuilder stackIn_6_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
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
        try {
          L0: {
            L1: {
              if (this.a(param1, (byte) -91, param3, param0)) {
                this.a(param3, param0, false, param1);
                this.a(0, param3, param0, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 < -104) {
                break L2;
              } else {
                var6 = (lh) null;
                this.a(-37, -54, (lh) null, -3);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param1);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ch.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean b(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_11_0 = null;
        lh stackIn_11_1 = null;
        Object stackIn_16_0 = null;
        lh stackIn_16_1 = null;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        Object stackOut_10_0 = null;
        lh stackOut_10_1 = null;
        Object stackOut_15_0 = null;
        lh stackOut_15_1 = null;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 <= -118) {
              if (this.field_J == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4_int = -1 + this.field_J.length;
                L1: while (true) {
                  L2: {
                    if (-1 < (var4_int ^ -1)) {
                      break L2;
                    } else {
                      var5 = this.field_J[var4_int];
                      stackOut_10_0 = null;
                      stackOut_10_1 = (lh) (var5);
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      L3: while (true) {
                        L4: {
                          if (stackIn_11_0 == stackIn_11_1) {
                            break L4;
                          } else {
                            if (!var5.d(0)) {
                              break L4;
                            } else {
                              var4_int = var4_int - param2;
                              L5: while (true) {
                                if (0 > var4_int) {
                                  break L4;
                                } else {
                                  var6 = this.field_J[var4_int];
                                  stackOut_15_0 = null;
                                  stackOut_15_1 = (lh) (var6);
                                  stackIn_11_0 = stackOut_15_0;
                                  stackIn_11_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var7 != 0) {
                                    continue L3;
                                  } else {
                                    L6: {
                                      L7: {
                                        if (stackIn_16_0 != stackIn_16_1) {
                                          break L7;
                                        } else {
                                          if (var7 == 0) {
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      if (var6.a(1, param1)) {
                                        stackOut_21_0 = 1;
                                        stackIn_22_0 = stackOut_21_0;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    var4_int = var4_int - param2;
                                    if (var7 == 0) {
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4_int--;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("ch.JA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    private final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$41 = null;
        StringBuilder discarded$42 = null;
        StringBuilder discarded$43 = null;
        StringBuilder discarded$44 = null;
        lh[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != this.field_J) {
              var10 = this.field_J;
              var5 = var10;
              var6 = param0;
              L1: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$41 = param3.append('\n');
                  if (var9 != 0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 > param1) {
                            if (var7 == null) {
                              break L4;
                            } else {
                              discarded$42 = var7.a(param2, param3, (byte) -112, param1 - -1);
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            discarded$43 = param3.append(' ');
                            var8++;
                            if (var9 != 0) {
                              break L4;
                            } else {
                              continue L2;
                            }
                          }
                        }
                        discarded$44 = param3.append("null");
                        break L3;
                      }
                      var6++;
                      continue L1;
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
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5_ref);
            stackOut_17_1 = new StringBuilder().append("ch.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        lh var6 = null;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (0 != param3) {
            break L0;
          } else {
            if (this.field_p == null) {
              break L0;
            } else {
              this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (null != this.field_J) {
              var5 = this.field_J.length + -1;
              L3: while (true) {
                if (0 > var5) {
                  break L2;
                } else {
                  var6 = this.field_J[var5];
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if (var6 != null) {
                        var6.a(param0 - -this.field_z, (byte) -126, param2 - -this.field_o, param3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5--;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          if (param1 <= -99) {
            break L1;
          } else {
            field_K = (String) null;
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, pe param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        jj var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        pe var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        jj stackIn_44_0 = null;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        short stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        short stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        jj stackOut_42_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var40 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var44 = param5;
                  if (null == var44.field_P) {
                    break L3;
                  } else {
                    if (1 < var44.field_K) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                sn.a(0);
                if (var40 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var60 = var44.field_P;
              la.a(var60, 0, qe.field_a, 0, -32513);
              break L1;
            }
            L4: {
              if (param3 <= -114) {
                break L4;
              } else {
                field_H = (String) null;
                break L4;
              }
            }
            var54 = new int[param5.field_u];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param5.field_u];
            var61 = tc.field_A;
            var62 = hm.field_c;
            var63 = pi.field_e;
            var13 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    if (param5.field_u <= var13) {
                      break L8;
                    } else {
                      var14 = var61[var13] * param6 + var62[var13] * param1 - -(param0 * var63[var13]) >> -461225144;
                      stackOut_11_0 = var14 ^ -1;
                      stackOut_11_1 = -1;
                      stackIn_26_0 = stackOut_11_0;
                      stackIn_26_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var40 != 0) {
                        L9: while (true) {
                          if (stackIn_26_0 <= stackIn_26_1) {
                            break L6;
                          } else {
                            var14 = um.field_bb[var13];
                            var15 = param5.field_G[var14];
                            var16 = param5.field_j[var14];
                            var17 = param5.field_x[var14];
                            if (var40 != 0) {
                              break L7;
                            } else {
                              L10: {
                                if (param5.field_M[var14] >= tc.field_A.length) {
                                  stackOut_30_0 = -1;
                                  stackIn_31_0 = stackOut_30_0;
                                  break L10;
                                } else {
                                  stackOut_29_0 = param5.field_M[var14];
                                  stackIn_31_0 = stackOut_29_0;
                                  break L10;
                                }
                              }
                              L11: {
                                var18 = stackIn_31_0;
                                if (tc.field_A.length > param5.field_V[var14]) {
                                  stackOut_33_0 = param5.field_V[var14];
                                  stackIn_34_0 = stackOut_33_0;
                                  break L11;
                                } else {
                                  stackOut_32_0 = -1;
                                  stackIn_34_0 = stackOut_32_0;
                                  break L11;
                                }
                              }
                              L12: {
                                var19 = stackIn_34_0;
                                if (param5.field_T[var14] < tc.field_A.length) {
                                  stackOut_36_0 = param5.field_T[var14];
                                  stackIn_37_0 = stackOut_36_0;
                                  break L12;
                                } else {
                                  stackOut_35_0 = -1;
                                  stackIn_37_0 = stackOut_35_0;
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  var20 = stackIn_37_0;
                                  if (pm.field_W == null) {
                                    break L14;
                                  } else {
                                    if (null == param5.field_e) {
                                      break L14;
                                    } else {
                                      if (param5.field_e.length <= var14) {
                                        break L14;
                                      } else {
                                        if (param5.field_e[var14] == -1) {
                                          break L14;
                                        } else {
                                          if (param5.field_e[var14] >= pm.field_W.length) {
                                            break L14;
                                          } else {
                                            stackOut_42_0 = pm.field_W[param5.field_e[var14]];
                                            stackIn_44_0 = stackOut_42_0;
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_43_0 = null;
                                stackIn_44_0 = (jj) ((Object) stackOut_43_0);
                                break L13;
                              }
                              L15: {
                                L16: {
                                  L17: {
                                    var21_ref = stackIn_44_0;
                                    var22 = eh.field_d[var15];
                                    var23 = n.field_p[var15];
                                    var24 = eh.field_d[var16];
                                    var25 = n.field_p[var16];
                                    var26 = eh.field_d[var17];
                                    var27 = n.field_p[var17];
                                    if (var19 != var18) {
                                      break L17;
                                    } else {
                                      if (var20 == var19) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    var28 = var54[var18];
                                    var29 = var54[var19];
                                    var30 = var54[var20];
                                    var31 = var64[var18];
                                    var32 = var64[var19];
                                    var33 = var64[var20];
                                    if (var21_ref != null) {
                                      stackOut_49_0 = var21_ref.field_g;
                                      stackIn_50_0 = stackOut_49_0;
                                      break L18;
                                    } else {
                                      stackOut_48_0 = 8355711;
                                      stackIn_50_0 = stackOut_48_0;
                                      break L18;
                                    }
                                  }
                                  var34 = stackIn_50_0;
                                  var35 = var34 & 16711935;
                                  var36 = 65280 & var34;
                                  var37 = var35 * var28 >>> -528179448 & -2130771713 | 1912667904 & var36 * var28 >>> -1592337432;
                                  var38 = var35 * var29 >>> -436502744 & -16842497 | (16711703 & var36 * var29) >>> -1548077496;
                                  var39 = -1090453760 & var36 * var30 >>> -169890840 | (-16711709 & var35 * var30) >>> 540690536;
                                  var37 = var37 + var31 * 65793;
                                  var38 = var38 + 65793 * var32;
                                  var39 = var39 + 65793 * var33;
                                  wh.a(var37 >> -241908944, (var38 & 65525) >> 872677448, var39 >> -1456192656, var39 >> 322790216 & 255, var26, var22, 255 & var37 >> 1652434088, 255 & var38, 255 & var37, var27, 255 & var39, var24, 22, var23, var38 >> 391624368, var25);
                                  if (var40 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                                L19: {
                                  var28 = var54[var18];
                                  var29 = var64[var18];
                                  if (var21_ref == null) {
                                    stackOut_53_0 = 8355711;
                                    stackIn_54_0 = stackOut_53_0;
                                    break L19;
                                  } else {
                                    stackOut_52_0 = var21_ref.field_g;
                                    stackIn_54_0 = stackOut_52_0;
                                    break L19;
                                  }
                                }
                                var30 = stackIn_54_0;
                                var31 = var30 & 16711935;
                                var32 = var30 & 65280;
                                var33 = 1812004608 & var28 * var32 >>> 205411400 | (var28 * var31 & -16711831) >>> 918423112;
                                var33 = var33 + var29 * 65793;
                                vl.a(var27, var25, var23, var24, var26, var33 >> -1960202239 & 8355711, false, var22);
                                break L15;
                              }
                              var13++;
                              stackOut_25_0 = wl.field_D;
                              stackOut_25_1 = var13;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (stackIn_12_0 > stackIn_12_1) {
                            var14 = -var14;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (0 <= var14) {
                            if ((var14 ^ -1) > -129) {
                              stackOut_19_0 = var14 + 128;
                              stackIn_20_0 = stackOut_19_0;
                              break L21;
                            } else {
                              stackOut_18_0 = 256;
                              stackIn_20_0 = stackOut_18_0;
                              break L21;
                            }
                          } else {
                            stackOut_16_0 = 128;
                            stackIn_20_0 = stackOut_16_0;
                            break L21;
                          }
                        }
                        L22: {
                          var14 = stackIn_20_0;
                          var15 = var63[var13] * param2 + param4 * var61[var13] + param7 * var62[var13] >> -1070993560;
                          stackOut_20_0 = kf.field_t;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (-1 < (var15 ^ -1)) {
                            stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
                            stackOut_22_1 = -var15;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            break L22;
                          } else {
                            stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                            stackOut_21_1 = var15;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            break L22;
                          }
                        }
                        var15 = stackIn_23_0[stackIn_23_1];
                        var14 = var14 * (-var15 + 256) >>> -1836577048;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var13 = 0;
                  L23: while (true) {
                    stackOut_25_0 = wl.field_D;
                    stackOut_25_1 = var13;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (stackIn_26_0 <= stackIn_26_1) {
                      break L6;
                    } else {
                      var14 = um.field_bb[var13];
                      var15 = param5.field_G[var14];
                      var16 = param5.field_j[var14];
                      var17 = param5.field_x[var14];
                      if (var40 != 0) {
                        break L7;
                      } else {
                        L24: {
                          if (param5.field_M[var14] >= tc.field_A.length) {
                            stackOut_30_0 = -1;
                            stackIn_31_0 = stackOut_30_0;
                            break L24;
                          } else {
                            stackOut_29_0 = param5.field_M[var14];
                            stackIn_31_0 = stackOut_29_0;
                            break L24;
                          }
                        }
                        L25: {
                          var18 = stackIn_31_0;
                          if (tc.field_A.length > param5.field_V[var14]) {
                            stackOut_33_0 = param5.field_V[var14];
                            stackIn_34_0 = stackOut_33_0;
                            break L25;
                          } else {
                            stackOut_32_0 = -1;
                            stackIn_34_0 = stackOut_32_0;
                            break L25;
                          }
                        }
                        L26: {
                          var19 = stackIn_34_0;
                          if (param5.field_T[var14] < tc.field_A.length) {
                            stackOut_36_0 = param5.field_T[var14];
                            stackIn_37_0 = stackOut_36_0;
                            break L26;
                          } else {
                            stackOut_35_0 = -1;
                            stackIn_37_0 = stackOut_35_0;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            var20 = stackIn_37_0;
                            if (pm.field_W == null) {
                              break L28;
                            } else {
                              if (null == param5.field_e) {
                                break L28;
                              } else {
                                if (param5.field_e.length <= var14) {
                                  break L28;
                                } else {
                                  if (param5.field_e[var14] == -1) {
                                    break L28;
                                  } else {
                                    if (param5.field_e[var14] >= pm.field_W.length) {
                                      break L28;
                                    } else {
                                      stackOut_42_0 = pm.field_W[param5.field_e[var14]];
                                      stackIn_44_0 = stackOut_42_0;
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_43_0 = null;
                          stackIn_44_0 = (jj) ((Object) stackOut_43_0);
                          break L27;
                        }
                        L29: {
                          L30: {
                            L31: {
                              var21_ref = stackIn_44_0;
                              var22 = eh.field_d[var15];
                              var23 = n.field_p[var15];
                              var24 = eh.field_d[var16];
                              var25 = n.field_p[var16];
                              var26 = eh.field_d[var17];
                              var27 = n.field_p[var17];
                              if (var19 != var18) {
                                break L31;
                              } else {
                                if (var20 == var19) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              var28 = var54[var18];
                              var29 = var54[var19];
                              var30 = var54[var20];
                              var31 = var64[var18];
                              var32 = var64[var19];
                              var33 = var64[var20];
                              if (var21_ref != null) {
                                stackOut_49_0 = var21_ref.field_g;
                                stackIn_50_0 = stackOut_49_0;
                                break L32;
                              } else {
                                stackOut_48_0 = 8355711;
                                stackIn_50_0 = stackOut_48_0;
                                break L32;
                              }
                            }
                            var34 = stackIn_50_0;
                            var35 = var34 & 16711935;
                            var36 = 65280 & var34;
                            var37 = var35 * var28 >>> -528179448 & -2130771713 | 1912667904 & var36 * var28 >>> -1592337432;
                            var38 = var35 * var29 >>> -436502744 & -16842497 | (16711703 & var36 * var29) >>> -1548077496;
                            var39 = -1090453760 & var36 * var30 >>> -169890840 | (-16711709 & var35 * var30) >>> 540690536;
                            var37 = var37 + var31 * 65793;
                            var38 = var38 + 65793 * var32;
                            var39 = var39 + 65793 * var33;
                            wh.a(var37 >> -241908944, (var38 & 65525) >> 872677448, var39 >> -1456192656, var39 >> 322790216 & 255, var26, var22, 255 & var37 >> 1652434088, 255 & var38, 255 & var37, var27, 255 & var39, var24, 22, var23, var38 >> 391624368, var25);
                            if (var40 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                          L33: {
                            var28 = var54[var18];
                            var29 = var64[var18];
                            if (var21_ref == null) {
                              stackOut_53_0 = 8355711;
                              stackIn_54_0 = stackOut_53_0;
                              break L33;
                            } else {
                              stackOut_52_0 = var21_ref.field_g;
                              stackIn_54_0 = stackOut_52_0;
                              break L33;
                            }
                          }
                          var30 = stackIn_54_0;
                          var31 = var30 & 16711935;
                          var32 = var30 & 65280;
                          var33 = 1812004608 & var28 * var32 >>> 205411400 | (var28 * var31 & -16711831) >>> 918423112;
                          var33 = var33 + var29 * 65793;
                          vl.a(var27, var25, var23, var24, var26, var33 >> -1960202239 & 8355711, false, var22);
                          break L29;
                        }
                        var13++;
                        continue L23;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var8 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var8);
            stackOut_57_1 = new StringBuilder().append("ch.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param5 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L34;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L34;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String e(int param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        String var5 = null;
        int var6 = 0;
        lh[] var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackOut_5_0 = null;
        var6 = SteelSentinels.field_G;
        if (this.field_J != null) {
          var7 = this.field_J;
          var2 = var7;
          var3 = param0;
          L0: while (true) {
            if (var3 < var7.length) {
              var4 = var7[var3];
              stackOut_5_0 = null;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                L1: {
                  L2: {
                    if (stackIn_7_0 != var4) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5 = var4.e(0);
                  if (var5 != null) {
                    return var5;
                  } else {
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return (String) ((Object) stackIn_6_0);
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    abstract void f(int param0);

    private final boolean a(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -70) {
                break L1;
              } else {
                field_O = (k) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) -68, param0, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ch.KA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_G = null;
        field_P = null;
        field_K = null;
        field_O = null;
        if (param0 != -68) {
          return;
        } else {
          field_H = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        RuntimeException runtimeException = null;
        lh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != this.field_J) {
              var12 = this.field_J;
              var7 = var12;
              var8 = 19 % ((36 - param0) / 32);
              var9 = 0;
              L1: while (true) {
                L2: {
                  if (var12.length <= var9) {
                    break L2;
                  } else {
                    var10 = var12[var9];
                    if (var11 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L3: {
                        if (var10 != null) {
                          var10.a((byte) 127, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var9++;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("ch.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ')');
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

    final void d(byte param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        int var5 = 0;
        lh[] var6 = null;
        var5 = SteelSentinels.field_G;
        var6 = this.field_J;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var6.length <= var3) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var4 != null) {
                      var4.d((byte) -45);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == -45) {
              break L1;
            } else {
              field_K = (String) null;
              break L1;
            }
          }
          return;
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_I = (String) null;
        }
        return null != this.a(true) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pb.h(param3, param0, param1, param4, 12105914);
              pb.e(1 + param3, param0 - -1, param1 + -2, -2 + param4, 10461345, 16251129);
              var5_int = 64;
              if (param2 == 32308) {
                break L1;
              } else {
                ch.a((byte) 31);
                break L1;
              }
            }
            var6 = 1;
            L2: while (true) {
              L3: {
                if ((var6 ^ -1) <= -7) {
                  break L3;
                } else {
                  pb.h(param3 - -var6, var6 + param0, param1 - 2 * var6, -(2 * var6) + param4, 16251129, var5_int);
                  var5_int = var5_int >> 813834401;
                  var6++;
                  if (var7 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
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
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ch.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_J != null) {
              L1: {
                if (param0 < -34) {
                  break L1;
                } else {
                  field_I = (String) null;
                  break L1;
                }
              }
              var12 = this.field_J;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var9 >= var12.length) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (!var10.d(0)) {
                          break L4;
                        } else {
                          if (!var10.a((byte) -118, param1, param2, param3, param4, param5, param6)) {
                            break L4;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8_ref);
            stackOut_16_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh[] var9 = null;
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
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 95, param2, param3);
            if (param1 > 56) {
              if (this.field_J == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var9 = this.field_J;
                var5 = var9;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var9.length <= var6) {
                      break L2;
                    } else {
                      var7 = var9[var6];
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          if (var7 == null) {
                            break L3;
                          } else {
                            var7.a(param0 - -this.field_o, 92, param2, param3 + this.field_z);
                            break L3;
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
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
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ch.H(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
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

    final boolean a(int param0, lh param1) {
        boolean discarded$2 = false;
        lh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        lh var7 = null;
        lh[] var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var7 = (lh) null;
                discarded$2 = this.a((lh) null, (byte) 117);
                break L1;
              }
            }
            var8 = this.field_J;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var8.length <= var4) {
                  break L3;
                } else {
                  L4: {
                    var5 = var8[var4];
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (!var5.a(1, param1)) {
                        break L4;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("ch.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final lh a(boolean param0) {
        lh var4 = null;
        int var5 = SteelSentinels.field_G;
        if (null == this.field_J) {
            return null;
        }
        lh[] var2 = this.field_J;
        int var3 = 0;
        if (!param0) {
            field_H = (String) null;
        }
        do {
            if (var2.length <= var3) {
                return null;
            }
            var4 = var2[var3];
            if (var4 != null) {
                if (!(!var4.d(0))) {
                    return var4;
                }
            }
            var3++;
        } while (var5 == 0);
        return null;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_J == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_J;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 >= var12.length) {
                      break L3;
                    } else {
                      var10 = var12[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var10 == null) {
                            break L4;
                          } else {
                            if (var10.a(param0, param1, this.field_o + param2, param3, this.field_z + param4, true, param6)) {
                              stackOut_11_0 = 1;
                              stackIn_12_0 = stackOut_11_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9++;
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param5) {
                    break L2;
                  } else {
                    field_L = -105;
                    return false;
                  }
                }
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var8_ref);
            stackOut_18_1 = new StringBuilder().append("ch.I(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -88, param2, param3, param4);
        this.f(140);
        if (param1 > -71) {
            field_O = (k) null;
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        wk[] var10 = null;
        wk[] var11_ref_wk__ = null;
        int var11 = 0;
        int var12 = 0;
        wk var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          var9 = param7 + (param1 + param8);
          var10 = new wk[]{new wk(var9, var9), new wk(param0, var9), new wk(var9, var9), new wk(var9, param0), new wk(64, 64), new wk(var9, param0), new wk(var9, var9), new wk(param0, var9), new wk(var9, var9)};
          var11_ref_wk__ = var10;
          if (param2 == 4) {
            break L0;
          } else {
            field_N = -114;
            break L0;
          }
        }
        var12 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var12 >= var11_ref_wk__.length) {
                break L3;
              } else {
                var13 = var11_ref_wk__[var12];
                stackOut_4_0 = 0;
                stackIn_13_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var15 != 0) {
                  break L2;
                } else {
                  var14 = stackIn_5_0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var13.field_E.length <= var14) {
                          break L6;
                        } else {
                          var13.field_E[var14] = param6;
                          var14++;
                          if (var15 != 0) {
                            break L5;
                          } else {
                            if (var15 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var12++;
                      break L5;
                    }
                    if (var15 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          }
          var11 = stackIn_13_0;
          L7: while (true) {
            L8: {
              if (var11 >= param1) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L8;
              } else {
                stackOut_15_0 = 0;
                stackIn_24_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var15 != 0) {
                  break L8;
                } else {
                  var12 = stackIn_16_0;
                  L9: while (true) {
                    L10: {
                      if (var9 <= var12) {
                        var11++;
                        break L10;
                      } else {
                        var10[6].field_E[var12 + var9 * (-1 + (-var11 + var9))] = param3;
                        var10[8].field_E[var9 * (-var11 + (var9 + -1)) + var12] = param3;
                        var10[2].field_E[var9 * var12 - 1 - (-var9 + var11)] = param3;
                        var10[8].field_E[-1 - -var9 - var11 + var12 * var9] = param3;
                        var12++;
                        if (var15 != 0) {
                          break L10;
                        } else {
                          continue L9;
                        }
                      }
                    }
                    continue L7;
                  }
                }
              }
            }
            var11 = stackIn_24_0;
            L11: while (true) {
              stackOut_25_0 = var11;
              stackOut_25_1 = param1;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              L12: while (true) {
                L13: {
                  if (stackIn_26_0 >= stackIn_26_1) {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L13;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_33_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      var12 = stackIn_28_0;
                      if (var12 >= var9) {
                        var11++;
                        continue L11;
                      } else {
                        var10[0].field_E[var11 * var9 + var12] = param5;
                        var10[0].field_E[var11 + var9 * var12] = param5;
                        stackOut_29_0 = -var11 + var9 ^ -1;
                        stackOut_29_1 = var12 ^ -1;
                        stackIn_26_0 = stackOut_29_0;
                        stackIn_26_1 = stackOut_29_1;
                        continue L12;
                      }
                    }
                  }
                }
                var11 = stackIn_33_0;
                L14: while (true) {
                  L15: {
                    if (var11 >= param0) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (var15 != 0) {
                        break L15;
                      } else {
                        var12 = stackIn_36_0;
                        L16: while (true) {
                          L17: {
                            if (var12 >= param1) {
                              var11++;
                              break L17;
                            } else {
                              var10[7].field_E[(-1 + (-var12 + var9)) * param0 - -var11] = param3;
                              var10[5].field_E[-1 - (-var9 - (-var12 + var11 * var9))] = param3;
                              var10[1].field_E[var12 * param0 + var11] = param5;
                              var10[3].field_E[var11 * var9 - -var12] = param5;
                              var12++;
                              if (var15 != 0) {
                                break L17;
                              } else {
                                continue L16;
                              }
                            }
                          }
                          continue L14;
                        }
                      }
                    }
                  }
                  var11 = stackIn_44_0;
                  L18: while (true) {
                    L19: {
                      if (param0 >> 928002657 <= var11) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (param7 <= var12) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_E[var11 + param0 * (var9 + (-var12 + -1))] = param4;
                              var10[3].field_E[var9 * var11 + -var12 + (var9 + -1)] = param4;
                              var10[7].field_E[param0 * var12 + var11] = param4;
                              var10[5].field_E[var9 * var11 + var12] = param4;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        lh[] var3 = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          var2 = 0;
          var3 = this.field_J;
          if (param0) {
            break L0;
          } else {
            field_P = (String) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= var3.length) {
              break L2;
            } else {
              L3: {
                var5 = var3[var4];
                if (var5 == null) {
                  break L3;
                } else {
                  var6 = var5.b(true);
                  if (var2 >= var6) {
                    break L3;
                  } else {
                    var2 = var6;
                    break L3;
                  }
                }
              }
              var4++;
              if (var7 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var2;
        }
    }

    static {
        field_K = "You must play <%1> more rated games before playing with the current options.";
        field_P = "Game options changed (<%0>)";
        field_N = -1;
        field_I = "<%1> met <%0>'s magic bullet";
        field_L = 4;
        field_M = "Respect";
        field_H = "Cancel unrated rematch";
    }
}
