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
        Object var9 = null;
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
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_12_0 = 0;
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
            if (null != ((ch) this).field_J) {
              L1: {
                if (param0 == 30373) {
                  break L1;
                } else {
                  var9 = null;
                  ((ch) this).a((byte) -45, 101, 54, 104, (lh) null, -22);
                  break L1;
                }
              }
              var10 = ((ch) this).field_J;
              var5 = var10;
              var6 = 0;
              L2: while (true) {
                if (var10.length <= var6) {
                  var5_int = param1;
                  if (var5_int == 80) {
                    L3: {
                      if (fc.field_e[81]) {
                        int discarded$3 = -86;
                        stackOut_19_0 = this.b(param3);
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_18_0 = this.a(param3, (byte) -70);
                        stackIn_20_0 = stackOut_18_0;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    return false;
                  }
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
                          return stackIn_13_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
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
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("ch.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    private final boolean b(lh param0) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 1;
            stackOut_0_0 = this.b((byte) -127, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ch.FA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -86 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean a(byte param0, lh param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J != null) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= ((ch) this).field_J.length) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((ch) this).field_J[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.d(0)) {
                        break L2;
                      } else {
                        var4_int = var4_int + 1;
                        L3: while (true) {
                          if (((ch) this).field_J.length <= var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((ch) this).field_J[var4_int];
                              if (var6 != null) {
                                if (!var6.a(1, param1)) {
                                  break L4;
                                } else {
                                  stackOut_14_0 = 1;
                                  stackIn_15_0 = stackOut_14_0;
                                  return stackIn_15_0 != 0;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ch.GA(").append(-68).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
                var6 = null;
                ((ch) this).a(-37, -54, (lh) null, -3);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ch.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean b(byte param0, lh param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J == null) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              var4_int = -1 + ((ch) this).field_J.length;
              L1: while (true) {
                if (var4_int < 0) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((ch) this).field_J[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.d(0)) {
                        break L2;
                      } else {
                        var4_int = var4_int - 1;
                        L3: while (true) {
                          if (0 > var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((ch) this).field_J[var4_int];
                              if (var6 != null) {
                                if (var6.a(1, param1)) {
                                  stackOut_17_0 = 1;
                                  stackIn_18_0 = stackOut_17_0;
                                  return stackIn_18_0 != 0;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("ch.JA(").append(-127).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        lh[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        int var9 = 0;
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
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != ((ch) this).field_J) {
              var5 = ((ch) this).field_J;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5.length) {
                  break L0;
                } else {
                  var7 = var5[var6];
                  StringBuilder discarded$29 = param3.append('\n');
                  var8 = 0;
                  L2: while (true) {
                    if (var8 > param1) {
                      L3: {
                        if (var7 == null) {
                          StringBuilder discarded$30 = param3.append("null");
                          break L3;
                        } else {
                          StringBuilder discarded$31 = var7.a(param2, param3, (byte) -112, param1 - -1);
                          break L3;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      StringBuilder discarded$32 = param3.append(' ');
                      var8++;
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
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("ch.Q(").append(0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
            if (((ch) this).field_p == null) {
              break L0;
            } else {
              ((ch) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
              break L0;
            }
          }
        }
        L1: {
          if (null != ((ch) this).field_J) {
            var5 = ((ch) this).field_J.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((ch) this).field_J[var5];
                if (var6 != null) {
                  var6.a(param0 - -((ch) this).field_z, (byte) -126, param2 - -((ch) this).field_o, param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          } else {
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
        byte[] var43 = null;
        int var44 = 0;
        pe var45 = null;
        int[] var49 = null;
        int[] var53 = null;
        int[] var57 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        jj stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        jj stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var40 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_P) {
                  break L2;
                } else {
                  if (1 < var45.field_K) {
                    var43 = var45.field_P;
                    int discarded$1 = -32513;
                    la.a(var43, 0, qe.field_a, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              sn.a(0);
              break L1;
            }
            var62 = new int[param5.field_u];
            var57 = var62;
            var53 = var57;
            var49 = var53;
            var41 = var49;
            var8_array = var41;
            var63 = new int[param5.field_u];
            var59 = tc.field_A;
            var60 = hm.field_c;
            var61 = pi.field_e;
            var13 = 0;
            L3: while (true) {
              if (param5.field_u <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (wl.field_D <= var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = um.field_bb[var44];
                      var15 = param5.field_G[var14];
                      var16 = param5.field_j[var14];
                      var17 = param5.field_x[var14];
                      if (param5.field_M[var14] >= tc.field_A.length) {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = param5.field_M[var14];
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (tc.field_A.length > param5.field_V[var14]) {
                        stackOut_27_0 = param5.field_V[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (param5.field_T[var14] < tc.field_A.length) {
                        stackOut_30_0 = param5.field_T[var14];
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = -1;
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (pm.field_W == null) {
                          break L9;
                        } else {
                          if (null == param5.field_e) {
                            break L9;
                          } else {
                            if (param5.field_e.length <= var14) {
                              break L9;
                            } else {
                              if (param5.field_e[var14] == -1) {
                                break L9;
                              } else {
                                if (param5.field_e[var14] >= pm.field_W.length) {
                                  break L9;
                                } else {
                                  stackOut_36_0 = pm.field_W[param5.field_e[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (jj) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = eh.field_d[var15];
                        var23 = n.field_p[var15];
                        var24 = eh.field_d[var16];
                        var25 = n.field_p[var16];
                        var26 = eh.field_d[var17];
                        var27 = n.field_p[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var62[var18];
                              var29 = var63[var18];
                              if (var21_ref == null) {
                                stackOut_47_0 = 8355711;
                                stackIn_48_0 = stackOut_47_0;
                                break L12;
                              } else {
                                stackOut_46_0 = var21_ref.field_g;
                                stackIn_48_0 = stackOut_46_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = 1812004608 & var28 * var32 >>> 8 | (var28 * var31 & -16711831) >>> 8;
                            var33 = var33 + var29 * 65793;
                            vl.a(var27, var25, var23, var24, var26, var33 >> 1 & 8355711, false, var22);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var62[var18];
                        var29 = var62[var19];
                        var30 = var62[var20];
                        var31 = var63[var18];
                        var32 = var63[var19];
                        var33 = var63[var20];
                        if (var21_ref != null) {
                          stackOut_43_0 = var21_ref.field_g;
                          stackIn_44_0 = stackOut_43_0;
                          break L13;
                        } else {
                          stackOut_42_0 = 8355711;
                          stackIn_44_0 = stackOut_42_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = var35 * var28 >>> 8 & -2130771713 | 1912667904 & var36 * var28 >>> 8;
                      var38 = var35 * var29 >>> 8 & -16842497 | (16711703 & var36 * var29) >>> 8;
                      var39 = -1090453760 & var36 * var30 >>> 8 | (-16711709 & var35 * var30) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + 65793 * var32;
                      var39 = var39 + 65793 * var33;
                      wh.a(var37 >> 16, (var38 & 65525) >> 8, var39 >> 16, var39 >> 8 & 255, var26, var22, 255 & var37 >> 8, 255 & var38, 255 & var37, var27, 255 & var39, var24, 22, var23, var38 >> 16, var25);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var59[var13] * param6 + var60[var13] * param1 - -(param0 * var61[var13]) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (0 <= var14) {
                    if (var14 < 128) {
                      stackOut_15_0 = var14 + 128;
                      stackIn_16_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_16_0 = stackOut_14_0;
                      break L15;
                    }
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_16_0 = stackOut_12_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_16_0;
                  var15 = var61[var13] * param2 + param4 * var59[var13] + param7 * var60[var13] >> 8;
                  stackOut_16_0 = kf.field_t;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var15 < 0) {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = -var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L16;
                  } else {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L16;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (-var15 + 256) >>> 8;
                var62[var13] = var14;
                var63[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var8;
            stackOut_51_1 = new StringBuilder().append("ch.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(-125).append(',').append(param4).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param5 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String e(int param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (((ch) this).field_J != null) {
          var2 = ((ch) this).field_J;
          var3 = param0;
          L0: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.e(0);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
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
                field_O = null;
                break L1;
              }
            }
            int discarded$2 = 1;
            stackOut_2_0 = this.a((byte) -68, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ch.KA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
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
        }
        field_H = null;
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        lh[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
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
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != ((ch) this).field_J) {
              var12 = ((ch) this).field_J;
              var7 = var12;
              var8 = 19 % ((36 - param0) / 32);
              var9 = 0;
              L1: while (true) {
                if (var12.length <= var9) {
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 != null) {
                      var10.a((byte) 127, param1, ((ch) this).field_z + param2, param3 + ((ch) this).field_o, param4, param5);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7_ref;
            stackOut_10_1 = new StringBuilder().append("ch.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        int var5 = 0;
        lh[] var6 = null;
        var5 = SteelSentinels.field_G;
        var6 = ((ch) this).field_J;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            L1: {
              if (param0 == -45) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.d((byte) -45);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_I = null;
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
              if (var6 >= 6) {
                break L0;
              } else {
                pb.h(param3 - -var6, var6 + param0, param1 - 2 * var6, -(2 * var6) + param4, 16251129, var5_int);
                var5_int = var5_int >> 1;
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ch.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
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
            if (((ch) this).field_J != null) {
              L1: {
                if (param0 < -34) {
                  break L1;
                } else {
                  field_I = null;
                  break L1;
                }
              }
              var12 = ((ch) this).field_J;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.d(0)) {
                        break L3;
                      } else {
                        if (!var10.a((byte) -118, param1, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8_ref;
            stackOut_16_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    void a(int param0, int param1, lh param2, int param3) {
        lh[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh[] var9 = null;
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
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 95, param2, param3);
            if (param1 > 56) {
              if (((ch) this).field_J == null) {
                return;
              } else {
                var9 = ((ch) this).field_J;
                var5 = var9;
                var6 = 0;
                L1: while (true) {
                  if (var9.length <= var6) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var9[var6];
                      if (var7 == null) {
                        break L2;
                      } else {
                        var7.a(param0 - -((ch) this).field_o, 92, param2, param3 + ((ch) this).field_z);
                        break L2;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("ch.H(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, lh param1) {
        lh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        Object var7 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
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
                var7 = null;
                boolean discarded$2 = this.a((lh) null, (byte) 117);
                break L1;
              }
            }
            var8 = ((ch) this).field_J;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a(1, param1)) {
                      break L3;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ch.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final lh a(boolean param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        int var5 = 0;
        lh[] var6 = null;
        var5 = SteelSentinels.field_G;
        if (null != ((ch) this).field_J) {
          var6 = ((ch) this).field_J;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.d(0)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ch) this).field_J == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var12 = ((ch) this).field_J;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  if (param5) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    field_L = -105;
                    return false;
                  }
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (var10.a(param0, param1, ((ch) this).field_o + param2, param3, ((ch) this).field_z + param4, true, param6)) {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8_ref;
            stackOut_17_1 = new StringBuilder().append("ch.I(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -88, param2, param3, param4);
        ((ch) this).f(140);
        if (param1 > -71) {
            field_O = null;
        }
    }

    final static wk[] a() {
        int var9 = 0;
        wk[] var10 = null;
        wk[] var11_ref_wk__ = null;
        int var11 = 0;
        int var12 = 0;
        wk var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = SteelSentinels.field_G;
        var9 = 3;
        var10 = new wk[]{new wk(var9, var9), new wk(3, var9), new wk(var9, var9), new wk(var9, 3), new wk(64, 64), new wk(var9, 3), new wk(var9, var9), new wk(3, var9), new wk(var9, var9)};
        var11_ref_wk__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_wk__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_E[var11 + 3 * (var9 + (-var12 + -1))] = 65793;
                                var10[3].field_E[var9 * var11 + -var12 + (var9 + -1)] = 65793;
                                var10[7].field_E[3 * var12 + var11] = 65793;
                                var10[5].field_E[var9 * var11 + var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 < 1) {
                            var10[7].field_E[(-1 + (-var12 + var9)) * 3 - -var11] = 0;
                            var10[5].field_E[-1 - (-var9 - (-var12 + var11 * var9))] = 0;
                            var10[1].field_E[var12 * 3 + var11] = 0;
                            var10[3].field_E[var11 * var9 - -var12] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 < var9) {
                        var10[0].field_E[var11 * var9 + var12] = 0;
                        var10[0].field_E[var11 + var9 * var12] = 0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_E[var12 - -(var9 * var11)] = 0;
                          var10[6].field_E[var11 + var9 * var12] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 > var12) {
                    var10[6].field_E[var12 + var9 * (-1 + (-var11 + var9))] = 0;
                    var10[8].field_E[var9 * (-var11 + (var9 + -1)) + var12] = 0;
                    var10[2].field_E[var9 * var12 - 1 - (-var9 + var11)] = 0;
                    var10[8].field_E[-1 - -var9 - var11 + var12 * var9] = 0;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_wk__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_E.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_E[var14] = 0;
                var14++;
                continue L9;
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
          var3 = ((ch) this).field_J;
          if (param0) {
            break L0;
          } else {
            field_P = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(true);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
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
