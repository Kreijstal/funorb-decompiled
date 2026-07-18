/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj extends ok {
    private boolean field_L;
    private int field_K;
    private int field_E;
    private int field_Q;
    static java.math.BigInteger field_N;
    private int field_I;
    static ng[] field_M;
    static ja field_H;
    private boolean field_J;
    static nb field_P;
    static String field_O;
    static int field_S;
    static String field_R;
    static int field_U;
    static int field_T;

    private fj(int param0, int param1, int param2, int param3, t param4, tg param5, al param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((fj) this).field_E = 2147483647;
        ((fj) this).field_Q = 2147483647;
        try {
            ((fj) this).field_B = param6;
            ((fj) this).field_J = param8 ? true : false;
            ((fj) this).field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0) {
        super.a((byte) 107);
        int var2 = 95 / ((48 - param0) / 40);
        ((fj) this).field_B.a(((fj) this).field_u, -3050, 0, ((fj) this).field_x, 0);
        ((fj) this).field_Q = ((fj) this).field_p;
        ((fj) this).field_E = ((fj) this).field_m;
    }

    public static void e(byte param0) {
        if (param0 != 118) {
          fj.e((byte) 71);
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        } else {
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        }
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((fj) this).field_r = 0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "fj.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 >= 48) {
          if (57 >= param1) {
            return -48 + param1;
          } else {
            L0: {
              if (param1 < 97) {
                break L0;
              } else {
                if (param1 > 122) {
                  break L0;
                } else {
                  return -87 - -param1;
                }
              }
            }
            L1: {
              if (65 > param1) {
                break L1;
              } else {
                if (param1 > 90) {
                  break L1;
                } else {
                  return 36 - (65 + -param1);
                }
              }
            }
            L2: {
              if (param1 != 43) {
                stackOut_36_0 = 63;
                stackIn_37_0 = stackOut_36_0;
                break L2;
              } else {
                stackOut_35_0 = 62;
                stackIn_37_0 = stackOut_35_0;
                break L2;
              }
            }
            return stackIn_37_0;
          }
        } else {
          if (param1 >= 97) {
            if (param1 <= 122) {
              return -87 - -param1;
            } else {
              if (65 <= param1) {
                if (param1 <= 90) {
                  return 36 - (65 + -param1);
                } else {
                  L3: {
                    if (param1 != 43) {
                      stackOut_23_0 = 63;
                      stackIn_24_0 = stackOut_23_0;
                      break L3;
                    } else {
                      stackOut_22_0 = 62;
                      stackIn_24_0 = stackOut_22_0;
                      break L3;
                    }
                  }
                  return stackIn_24_0;
                }
              } else {
                L4: {
                  if (param1 != 43) {
                    stackOut_17_0 = 63;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 62;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                return stackIn_18_0;
              }
            }
          } else {
            if (65 <= param1) {
              if (param1 <= 90) {
                return 36 - (65 + -param1);
              } else {
                L5: {
                  if (param1 != 43) {
                    stackOut_10_0 = 63;
                    stackIn_11_0 = stackOut_10_0;
                    break L5;
                  } else {
                    stackOut_9_0 = 62;
                    stackIn_11_0 = stackOut_9_0;
                    break L5;
                  }
                }
                return stackIn_11_0;
              }
            } else {
              L6: {
                if (param1 != 43) {
                  stackOut_5_0 = 63;
                  stackIn_6_0 = stackOut_5_0;
                  break L6;
                } else {
                  stackOut_4_0 = 62;
                  stackIn_6_0 = stackOut_4_0;
                  break L6;
                }
              }
              return stackIn_6_0;
            }
          }
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((fj) this).field_J) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((fj) this).a(param5, param6, param2, false, param1)) {
              L2: {
                if (param3 != 1) {
                  break L2;
                } else {
                  rf.field_e = (fj) this;
                  ((fj) this).field_I = param1 + (-((fj) this).field_m + -param6);
                  ((fj) this).field_K = -param5 + -((fj) this).field_p + param2;
                  break L2;
                }
              }
              ((fj) this).field_r = param3;
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              stackOut_4_0 = var8_int;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("fj.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!((fj) this).a((byte) 116, param3, param2, param1)) {
                break L1;
              } else {
                ((fj) this).a(34, param2, param3, param1);
                ((fj) this).a(-51, param1, param2, param3);
                StringBuilder discarded$26 = param2.append(" revert=").append(((fj) this).field_L);
                if (((fj) this).field_Q == 2147483647) {
                  break L1;
                } else {
                  if (((fj) this).field_E != 2147483647) {
                    StringBuilder discarded$27 = param2.append(" to ").append(((fj) this).field_Q).append(',').append(((fj) this).field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((fj) this).a((byte) -42);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param2;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("fj.BB(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((fj) this).field_B instanceof rh)) {
                    break L3;
                  } else {
                    if (!((rh) (Object) ((fj) this).field_B).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 == ((fj) this).field_r) {
                  L4: {
                    var5_int = -((fj) this).field_K + (kf.field_b - param1);
                    var6 = -param0 + (-((fj) this).field_I + fg.field_a);
                    if (((fj) this).field_p != var5_int) {
                      break L4;
                    } else {
                      if (((fj) this).field_m == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((fj) this).field_m = var6;
                  ((fj) this).field_p = var5_int;
                  if (((fj) this).field_l instanceof ek) {
                    ((ek) (Object) ((fj) this).field_l).a((fj) this, param0, param1, param2 + -21487);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!((fj) this).field_L) {
                break L1;
              } else {
                L5: {
                  if (((fj) this).field_Q != ((fj) this).field_p) {
                    L6: {
                      var5_int = -((fj) this).field_p + ((fj) this).field_Q;
                      stackOut_8_0 = this;
                      stackOut_8_1 = ((fj) this).field_p;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (2 >= Math.abs(var5_int)) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var5_int <= 0) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = -1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L6;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L6;
                        }
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = var5_int >> 1;
                        stackIn_13_0 = stackOut_9_0;
                        stackIn_13_1 = stackOut_9_1;
                        stackIn_13_2 = stackOut_9_2;
                        break L6;
                      }
                    }
                    ((fj) this).field_p = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((fj) this).field_E != ((fj) this).field_m) {
                  L7: {
                    var5_int = -((fj) this).field_m + ((fj) this).field_E;
                    stackOut_16_0 = this;
                    stackOut_16_1 = ((fj) this).field_m;
                    stackIn_20_0 = stackOut_16_0;
                    stackIn_20_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (-3 > Math.abs(var5_int)) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> 1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L7;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (-1 < var5_int) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L7;
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = -1;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        break L7;
                      }
                    }
                  }
                  ((fj) this).field_m = stackIn_21_1 + stackIn_21_2;
                  break L1;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0 <= 0) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param2 & 1;
                param2 = param2 >>> 1;
                param0--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "fj.C(" + param0 + ',' + 1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new java.math.BigInteger("65537");
        field_H = new ja();
        field_O = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "Resume Game";
        field_S = 2;
    }
}
