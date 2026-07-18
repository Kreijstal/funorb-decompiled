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
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        boolean stackOut_27_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != ((ch) this).field_J) {
              L1: {
                if (param0 == 30373) {
                  break L1;
                } else {
                  ((ch) this).a((byte) -45, 101, 54, 104, (lh) null, -22);
                  break L1;
                }
              }
              var5 = ((ch) this).field_J;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var5.length <= var6) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var5[var6];
                      if (var7 == null) {
                        break L4;
                      } else {
                        if (!var7.d(0)) {
                          break L4;
                        } else {
                          if (var7.a(30373, param1, param2, param3)) {
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
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
                if (var5_int == 80) {
                  L5: {
                    if (fc.field_e[81]) {
                      stackOut_27_0 = this.b(param3, (byte) -86);
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_25_0 = this.a(param3, (byte) -70);
                      stackIn_28_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  return stackIn_28_0;
                } else {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5_ref;
            stackOut_31_1 = new StringBuilder().append("ch.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_30_0 != 0;
    }

    private final boolean b(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = this.b((byte) -127, param0, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ch.FA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        lh stackOut_8_1 = null;
        Object stackOut_13_0 = null;
        lh stackOut_13_1 = null;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J != null) {
              var4_int = 0;
              if (param0 == -68) {
                L1: while (true) {
                  L2: {
                    if (var4_int >= ((ch) this).field_J.length) {
                      break L2;
                    } else {
                      var5 = ((ch) this).field_J[var4_int];
                      stackOut_8_0 = null;
                      stackOut_8_1 = (lh) var5;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      L3: while (true) {
                        L4: {
                          if (stackIn_9_0 == (Object) (Object) stackIn_9_1) {
                            break L4;
                          } else {
                            if (!var5.d(0)) {
                              break L4;
                            } else {
                              var4_int = var4_int + param2;
                              L5: while (true) {
                                if (((ch) this).field_J.length <= var4_int) {
                                  break L4;
                                } else {
                                  var6 = ((ch) this).field_J[var4_int];
                                  stackOut_13_0 = null;
                                  stackOut_13_1 = (lh) var6;
                                  stackIn_9_0 = stackOut_13_0;
                                  stackIn_9_1 = stackOut_13_1;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  if (var7 != 0) {
                                    continue L3;
                                  } else {
                                    L6: {
                                      L7: {
                                        if (stackIn_14_0 != (Object) (Object) stackIn_14_1) {
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
                                        stackOut_21_0 = 1;
                                        stackIn_22_0 = stackOut_21_0;
                                        return stackIn_22_0 != 0;
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
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ch.GA(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((ch) this).a(param1, (byte) -91, param3, param0)) {
                ((ch) this).a(param3, param0, false, param1);
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
                ((ch) this).a(-37, -54, (lh) null, -3);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ch.D(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    private final boolean b(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_12_0 = null;
        lh stackIn_12_1 = null;
        Object stackIn_17_0 = null;
        lh stackIn_17_1 = null;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        Object stackOut_11_0 = null;
        lh stackOut_11_1 = null;
        Object stackOut_16_0 = null;
        lh stackOut_16_1 = null;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 <= -118) {
              if (((ch) this).field_J == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var4_int = -1 + ((ch) this).field_J.length;
                L1: while (true) {
                  L2: {
                    if (var4_int < 0) {
                      break L2;
                    } else {
                      var5 = ((ch) this).field_J[var4_int];
                      stackOut_11_0 = null;
                      stackOut_11_1 = (lh) var5;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      L3: while (true) {
                        L4: {
                          if (stackIn_12_0 == (Object) (Object) stackIn_12_1) {
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
                                  var6 = ((ch) this).field_J[var4_int];
                                  stackOut_16_0 = null;
                                  stackOut_16_1 = (lh) var6;
                                  stackIn_12_0 = stackOut_16_0;
                                  stackIn_12_1 = stackOut_16_1;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  if (var7 != 0) {
                                    continue L3;
                                  } else {
                                    L6: {
                                      L7: {
                                        if (stackIn_17_0 != (Object) (Object) stackIn_17_1) {
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
                                        stackOut_26_0 = 1;
                                        stackIn_27_0 = stackOut_26_0;
                                        return stackIn_27_0 != 0;
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
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("ch.JA(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param2 + ')');
        }
        return stackIn_31_0 != 0;
    }

    private final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != ((ch) this).field_J) {
              var5 = ((ch) this).field_J;
              var6 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var6 <= ~var5.length) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      StringBuilder discarded$14 = param3.append('\n');
                      if (var9 != 0) {
                        break L2;
                      } else {
                        var8 = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (var8 > param1) {
                                  break L7;
                                } else {
                                  StringBuilder discarded$15 = param3.append(' ');
                                  var8++;
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    if (var9 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var7 == null) {
                                break L6;
                              } else {
                                StringBuilder discarded$16 = var7.a(param2, param3, (byte) -112, param1 - -1);
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            StringBuilder discarded$17 = param3.append("null");
                            break L5;
                          }
                          var6++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) runtimeException;
            stackOut_19_1 = new StringBuilder().append("ch.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        lh var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 != param3) {
                break L1;
              } else {
                if (((ch) this).field_p == null) {
                  break L1;
                } else {
                  ((ch) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (null != ((ch) this).field_J) {
                  var5_int = ((ch) this).field_J.length + -1;
                  L4: while (true) {
                    if (0 > var5_int) {
                      break L3;
                    } else {
                      var6 = ((ch) this).field_J[var5_int];
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (var6 != null) {
                            var6.a(param0 - -((ch) this).field_z, (byte) -126, param2 - -((ch) this).field_o, param3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5_int--;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              if (param1 <= -99) {
                break L2;
              } else {
                field_K = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ch.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, pe param5, int param6, int param7) {
        RuntimeException var8 = null;
        pe var8_ref = null;
        int[] var8_array = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_27_0 = 0;
        int[] stackIn_28_0 = null;
        int[] stackIn_30_0 = null;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        jj stackIn_66_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_41_0 = 0;
        short stackOut_39_0 = 0;
        short stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        short stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        jj stackOut_63_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int[] stackOut_27_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var40 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var8_ref = param5;
                  if (null == var8_ref.field_P) {
                    break L3;
                  } else {
                    if (1 < var8_ref.field_K) {
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
              var9 = var8_ref.field_P;
              la.a(var9, 0, qe.field_a, 0, -32513);
              break L1;
            }
            L4: {
              if (param3 <= -114) {
                break L4;
              } else {
                field_H = null;
                break L4;
              }
            }
            var8_array = new int[param5.field_u];
            var9_array = new int[param5.field_u];
            var10 = tc.field_A;
            var11 = hm.field_c;
            var12 = pi.field_e;
            var13 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    if (param5.field_u <= var13) {
                      break L8;
                    } else {
                      var14 = var10[var13] * param6 + var11[var13] * param1 - -(param0 * var12[var13]) >> -461225144;
                      stackOut_14_0 = ~var14;
                      stackOut_14_1 = -1;
                      stackIn_34_0 = stackOut_14_0;
                      stackIn_34_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var40 != 0) {
                        L9: while (true) {
                          if (stackIn_34_0 <= stackIn_34_1) {
                            break L7;
                          } else {
                            var14 = um.field_bb[var13];
                            var15 = param5.field_G[var14];
                            var16 = param5.field_j[var14];
                            var17 = param5.field_x[var14];
                            if (var40 != 0) {
                              break L6;
                            } else {
                              L10: {
                                if (param5.field_M[var14] >= tc.field_A.length) {
                                  stackOut_41_0 = -1;
                                  stackIn_42_0 = stackOut_41_0;
                                  break L10;
                                } else {
                                  stackOut_39_0 = param5.field_M[var14];
                                  stackIn_42_0 = stackOut_39_0;
                                  break L10;
                                }
                              }
                              L11: {
                                var18 = stackIn_42_0;
                                if (~tc.field_A.length < ~param5.field_V[var14]) {
                                  stackOut_45_0 = param5.field_V[var14];
                                  stackIn_46_0 = stackOut_45_0;
                                  break L11;
                                } else {
                                  stackOut_43_0 = -1;
                                  stackIn_46_0 = stackOut_43_0;
                                  break L11;
                                }
                              }
                              L12: {
                                var19 = stackIn_46_0;
                                if (~param5.field_T[var14] > ~tc.field_A.length) {
                                  stackOut_49_0 = param5.field_T[var14];
                                  stackIn_50_0 = stackOut_49_0;
                                  break L12;
                                } else {
                                  stackOut_47_0 = -1;
                                  stackIn_50_0 = stackOut_47_0;
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  var20 = stackIn_50_0;
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
                                            stackOut_63_0 = pm.field_W[param5.field_e[var14]];
                                            stackIn_66_0 = stackOut_63_0;
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_65_0 = null;
                                stackIn_66_0 = (jj) (Object) stackOut_65_0;
                                break L13;
                              }
                              L15: {
                                L16: {
                                  L17: {
                                    var21_ref = stackIn_66_0;
                                    var22 = eh.field_d[var15];
                                    var23 = n.field_p[var15];
                                    var24 = eh.field_d[var16];
                                    var25 = n.field_p[var16];
                                    var26 = eh.field_d[var17];
                                    var27 = n.field_p[var17];
                                    if (~var19 != ~var18) {
                                      break L17;
                                    } else {
                                      if (~var20 == ~var19) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    var28 = var8_array[var18];
                                    var29 = var8_array[var19];
                                    var30 = var8_array[var20];
                                    var31 = var9_array[var18];
                                    var32 = var9_array[var19];
                                    var33 = var9_array[var20];
                                    if (null != var21_ref) {
                                      stackOut_73_0 = var21_ref.field_g;
                                      stackIn_74_0 = stackOut_73_0;
                                      break L18;
                                    } else {
                                      stackOut_71_0 = 8355711;
                                      stackIn_74_0 = stackOut_71_0;
                                      break L18;
                                    }
                                  }
                                  var34 = stackIn_74_0;
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
                                  var28 = var8_array[var18];
                                  var29 = var9_array[var18];
                                  if (null == var21_ref) {
                                    stackOut_78_0 = 8355711;
                                    stackIn_79_0 = stackOut_78_0;
                                    break L19;
                                  } else {
                                    stackOut_76_0 = var21_ref.field_g;
                                    stackIn_79_0 = stackOut_76_0;
                                    break L19;
                                  }
                                }
                                var30 = stackIn_79_0;
                                var31 = var30 & 16711935;
                                var32 = var30 & 65280;
                                var33 = 1812004608 & var28 * var32 >>> 205411400 | (var28 * var31 & -16711831) >>> 918423112;
                                var33 = var33 + var29 * 65793;
                                vl.a(var27, var25, var23, var24, var26, var33 >> -1960202239 & 8355711, false, var22);
                                break L15;
                              }
                              var13++;
                              if (var40 == 0) {
                                stackOut_33_0 = wl.field_D;
                                stackOut_33_1 = var13;
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                continue L9;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (stackIn_15_0 > stackIn_15_1) {
                            var14 = -var14;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (0 <= var14) {
                            if (var14 < 128) {
                              stackOut_26_0 = var14 + 128;
                              stackIn_27_0 = stackOut_26_0;
                              break L21;
                            } else {
                              stackOut_24_0 = 256;
                              stackIn_27_0 = stackOut_24_0;
                              break L21;
                            }
                          } else {
                            stackOut_21_0 = 128;
                            stackIn_27_0 = stackOut_21_0;
                            break L21;
                          }
                        }
                        L22: {
                          var14 = stackIn_27_0;
                          var15 = var12[var13] * param2 + param4 * var10[var13] + param7 * var11[var13] >> -1070993560;
                          stackOut_27_0 = kf.field_t;
                          stackIn_30_0 = stackOut_27_0;
                          stackIn_28_0 = stackOut_27_0;
                          if (var15 < 0) {
                            stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                            stackOut_30_1 = -var15;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            break L22;
                          } else {
                            stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                            stackOut_28_1 = var15;
                            stackIn_31_0 = stackOut_28_0;
                            stackIn_31_1 = stackOut_28_1;
                            break L22;
                          }
                        }
                        var15 = stackIn_31_0[stackIn_31_1];
                        var14 = var14 * (-var15 + 256) >>> -1836577048;
                        var8_array[var13] = var14;
                        var9_array[var13] = var15;
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
                    stackOut_33_0 = wl.field_D;
                    stackOut_33_1 = var13;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    if (stackIn_34_0 <= stackIn_34_1) {
                      break L7;
                    } else {
                      var14 = um.field_bb[var13];
                      var15 = param5.field_G[var14];
                      var16 = param5.field_j[var14];
                      var17 = param5.field_x[var14];
                      if (var40 != 0) {
                        break L6;
                      } else {
                        L24: {
                          if (param5.field_M[var14] >= tc.field_A.length) {
                            stackOut_41_0 = -1;
                            stackIn_42_0 = stackOut_41_0;
                            break L24;
                          } else {
                            stackOut_39_0 = param5.field_M[var14];
                            stackIn_42_0 = stackOut_39_0;
                            break L24;
                          }
                        }
                        L25: {
                          var18 = stackIn_42_0;
                          if (~tc.field_A.length < ~param5.field_V[var14]) {
                            stackOut_45_0 = param5.field_V[var14];
                            stackIn_46_0 = stackOut_45_0;
                            break L25;
                          } else {
                            stackOut_43_0 = -1;
                            stackIn_46_0 = stackOut_43_0;
                            break L25;
                          }
                        }
                        L26: {
                          var19 = stackIn_46_0;
                          if (~param5.field_T[var14] > ~tc.field_A.length) {
                            stackOut_49_0 = param5.field_T[var14];
                            stackIn_50_0 = stackOut_49_0;
                            break L26;
                          } else {
                            stackOut_47_0 = -1;
                            stackIn_50_0 = stackOut_47_0;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            var20 = stackIn_50_0;
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
                                      stackOut_63_0 = pm.field_W[param5.field_e[var14]];
                                      stackIn_66_0 = stackOut_63_0;
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_65_0 = null;
                          stackIn_66_0 = (jj) (Object) stackOut_65_0;
                          break L27;
                        }
                        L29: {
                          L30: {
                            L31: {
                              var21_ref = stackIn_66_0;
                              var22 = eh.field_d[var15];
                              var23 = n.field_p[var15];
                              var24 = eh.field_d[var16];
                              var25 = n.field_p[var16];
                              var26 = eh.field_d[var17];
                              var27 = n.field_p[var17];
                              if (~var19 != ~var18) {
                                break L31;
                              } else {
                                if (~var20 == ~var19) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              var28 = var8_array[var18];
                              var29 = var8_array[var19];
                              var30 = var8_array[var20];
                              var31 = var9_array[var18];
                              var32 = var9_array[var19];
                              var33 = var9_array[var20];
                              if (null != var21_ref) {
                                stackOut_73_0 = var21_ref.field_g;
                                stackIn_74_0 = stackOut_73_0;
                                break L32;
                              } else {
                                stackOut_71_0 = 8355711;
                                stackIn_74_0 = stackOut_71_0;
                                break L32;
                              }
                            }
                            var34 = stackIn_74_0;
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
                            var28 = var8_array[var18];
                            var29 = var9_array[var18];
                            if (null == var21_ref) {
                              stackOut_78_0 = 8355711;
                              stackIn_79_0 = stackOut_78_0;
                              break L33;
                            } else {
                              stackOut_76_0 = var21_ref.field_g;
                              stackIn_79_0 = stackOut_76_0;
                              break L33;
                            }
                          }
                          var30 = stackIn_79_0;
                          var31 = var30 & 16711935;
                          var32 = var30 & 65280;
                          var33 = 1812004608 & var28 * var32 >>> 205411400 | (var28 * var31 & -16711831) >>> 918423112;
                          var33 = var33 + var29 * 65793;
                          vl.a(var27, var25, var23, var24, var26, var33 >> -1960202239 & 8355711, false, var22);
                          break L29;
                        }
                        var13++;
                        if (var40 == 0) {
                          continue L23;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var8 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var8;
            stackOut_82_1 = new StringBuilder().append("ch.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_85_0 = stackOut_82_0;
            stackIn_85_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param5 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L34;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_86_0 = stackOut_83_0;
              stackIn_86_1 = stackOut_83_1;
              stackIn_86_2 = stackOut_83_2;
              break L34;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String e(int param0) {
        lh[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        lh var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J != null) {
              var2 = ((ch) this).field_J;
              var3 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~var2.length) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      stackOut_6_0 = null;
                      stackIn_20_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 != (Object) (Object) var4) {
                              break L5;
                            } else {
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = var4.e(0);
                          if (var5 != null) {
                            stackOut_16_0 = (String) var5;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0;
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ch.S(" + param0 + ')');
        }
        return (String) (Object) stackIn_20_0;
    }

    abstract void f(int param0);

    private final boolean a(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -70) {
                break L1;
              } else {
                field_O = null;
                break L1;
              }
            }
            stackOut_3_0 = this.a((byte) -68, param0, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ch.KA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
        }
        try {
            field_H = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ch.CA(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        RuntimeException runtimeException = null;
        lh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != ((ch) this).field_J) {
              var7 = ((ch) this).field_J;
              var8 = 19 % ((36 - param0) / 32);
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7.length <= var9) {
                      break L3;
                    } else {
                      var10 = var7[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null != var10) {
                            var10.a((byte) 127, param1, ((ch) this).field_z + param2, param3 + ((ch) this).field_o, param4, param5);
                            break L4;
                          } else {
                            break L4;
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
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ch.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2 = ((ch) this).field_J;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2.length <= var3) {
                    break L3;
                  } else {
                    var4 = var2[var3];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4 != null) {
                          var4.d((byte) -45);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -45) {
                  break L2;
                } else {
                  field_K = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ch.J(" + param0 + ')');
        }
    }

    final boolean d(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            L2: {
              if (null == this.a(true)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ch.N(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ch(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
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
                L4: {
                  if (var6 >= 6) {
                    break L4;
                  } else {
                    pb.h(param3 - -var6, var6 + param0, param1 - 2 * var6, -(2 * var6) + param4, 16251129, var5_int);
                    var5_int = var5_int >> 813834401;
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ch.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J != null) {
              L1: {
                if (param0 < -34) {
                  break L1;
                } else {
                  field_I = null;
                  break L1;
                }
              }
              var8 = ((ch) this).field_J;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var9 >= var8.length) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var8[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (!var10.d(0)) {
                          break L4;
                        } else {
                          if (!var10.a((byte) -118, param1, param2, param3, param4, param5, param6)) {
                            break L4;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
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
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var8_ref;
            stackOut_21_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_20_0 != 0;
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 95, param2, param3);
            if (param1 > 56) {
              if (((ch) this).field_J == null) {
                return;
              } else {
                var5 = ((ch) this).field_J;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5.length <= var6) {
                        break L3;
                      } else {
                        var7 = var5[var6];
                        if (var8 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (null == var7) {
                              break L4;
                            } else {
                              var7.a(param0 - -((ch) this).field_o, 92, param2, param3 + ((ch) this).field_z);
                              break L4;
                            }
                          }
                          var6++;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("ch.H(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, lh param1) {
        lh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                boolean discarded$2 = this.a((lh) null, (byte) 117);
                break L1;
              }
            }
            var3 = ((ch) this).field_J;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var3.length <= var4) {
                  break L3;
                } else {
                  L4: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (!var5.a(1, param1)) {
                        break L4;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
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
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ch.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final lh a(boolean param0) {
        lh[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        lh var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        lh stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        lh stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (null == ((ch) this).field_J) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (lh) (Object) stackIn_5_0;
            } else {
              L1: {
                var2 = ((ch) this).field_J;
                var3 = 0;
                if (param0) {
                  break L1;
                } else {
                  field_H = null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if (var2.length <= var3) {
                    break L3;
                  } else {
                    L4: {
                      var4 = var2[var3];
                      if (var4 == null) {
                        break L4;
                      } else {
                        if (var4.d(0)) {
                          stackOut_16_0 = (lh) var4;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ch.EA(" + param0 + ')');
        }
        return (lh) (Object) stackIn_20_0;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var8 = ((ch) this).field_J;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var9 <= ~var8.length) {
                      break L3;
                    } else {
                      var10 = var8[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var10 == null) {
                            break L4;
                          } else {
                            if (var10.a(param0, param1, ((ch) this).field_o + param2, param3, ((ch) this).field_z + param4, true, param6)) {
                              stackOut_17_0 = 1;
                              stackIn_18_0 = stackOut_17_0;
                              return stackIn_18_0 != 0;
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
                    break L2;
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8_ref;
            stackOut_25_1 = new StringBuilder().append("ch.I(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        try {
            super.a(param0, (byte) -88, param2, param3, param4);
            ((ch) this).f(140);
            if (param1 > -71) {
                field_O = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ch.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        wk[] var10 = null;
        wk[] var11_ref_wk__ = null;
        int var11 = 0;
        int var12 = 0;
        wk var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        wk[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        wk[] stackOut_63_0 = null;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var9_int = param7 + (param1 + param8);
              var10 = new wk[]{new wk(var9_int, var9_int), new wk(param0, var9_int), new wk(var9_int, var9_int), new wk(var9_int, param0), new wk(64, 64), new wk(var9_int, param0), new wk(var9_int, var9_int), new wk(param0, var9_int), new wk(var9_int, var9_int)};
              var11_ref_wk__ = var10;
              if (param2 == 4) {
                break L1;
              } else {
                field_N = -114;
                break L1;
              }
            }
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var12 >= var11_ref_wk__.length) {
                    break L4;
                  } else {
                    var13 = var11_ref_wk__[var12];
                    stackOut_6_0 = 0;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      var14 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~var13.field_E.length >= ~var14) {
                              break L7;
                            } else {
                              var13.field_E[var14] = param6;
                              var14++;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var12++;
                          break L6;
                        }
                        if (var15 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              var11 = stackIn_16_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var11 >= param1) {
                      break L10;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_28_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_19_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var9_int <= var12) {
                                break L13;
                              } else {
                                var10[6].field_E[var12 + var9_int * (-1 + (-var11 + var9_int))] = param3;
                                var10[8].field_E[var9_int * (-var11 + (var9_int + -1)) + var12] = param3;
                                var10[2].field_E[var9_int * var12 - 1 - (-var9_int + var11)] = param3;
                                var10[8].field_E[-1 - -var9_int - var11 + var12 * var9_int] = param3;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                var11 = stackIn_28_0;
                L14: while (true) {
                  stackOut_29_0 = ~var11;
                  stackOut_29_1 = ~param1;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_30_0 <= stackIn_30_1) {
                          break L17;
                        } else {
                          stackOut_31_0 = 0;
                          stackIn_41_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_32_0;
                            L18: while (true) {
                              L19: {
                                if (~var12 <= ~var9_int) {
                                  break L19;
                                } else {
                                  var10[0].field_E[var11 * var9_int + var12] = param5;
                                  var10[0].field_E[var11 + var9_int * var12] = param5;
                                  stackOut_34_0 = ~(-var11 + var9_int);
                                  stackOut_34_1 = ~var12;
                                  stackIn_30_0 = stackOut_34_0;
                                  stackIn_30_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_35_0 >= stackIn_35_1) {
                                        break L20;
                                      } else {
                                        var10[2].field_E[var12 - -(var9_int * var11)] = param5;
                                        var10[6].field_E[var11 + var9_int * var12] = param5;
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L16;
                    }
                    var11 = stackIn_41_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (var11 >= param0) {
                            break L23;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_53_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_44_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (~var12 <= ~param1) {
                                      break L26;
                                    } else {
                                      var10[7].field_E[(-1 + (-var12 + var9_int)) * param0 - -var11] = param3;
                                      var10[5].field_E[-1 - (-var9_int - (-var12 + var11 * var9_int))] = param3;
                                      var10[1].field_E[var12 * param0 + var11] = param5;
                                      var10[3].field_E[var11 * var9_int - -var12] = param5;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L22;
                      }
                      var11 = stackIn_53_0;
                      L27: while (true) {
                        L28: {
                          if (param0 >> 928002657 <= var11) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~param7 >= ~var12) {
                                    break L31;
                                  } else {
                                    var10[1].field_E[var11 + param0 * (var9_int + (-var12 + -1))] = param4;
                                    var10[3].field_E[var9_int * var11 + -var12 + (var9_int + -1)] = param4;
                                    var10[7].field_E[param0 * var12 + var11] = param4;
                                    var10[5].field_E[var9_int * var11 + var12] = param4;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_63_0 = (wk[]) var10;
                        stackIn_64_0 = stackOut_63_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var9, "ch.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lh[] var3 = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = ((ch) this).field_J;
              if (param0) {
                break L1;
              } else {
                field_P = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var3.length) {
                  break L3;
                } else {
                  L4: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L4;
                    } else {
                      var6 = var5.b(true);
                      if (var2_int >= var6) {
                        break L4;
                      } else {
                        var2_int = var6;
                        break L4;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_10_0 = var2_int;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ch.O(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "You must play <%1> more rated games before playing with the current options.";
        field_P = "Game options changed (<%0>)";
        field_N = -1;
        field_I = "<%1> met <%0>'s magic bullet";
        field_L = 4;
        field_M = "Respect";
        field_H = "Cancel unrated rematch";
    }
}
