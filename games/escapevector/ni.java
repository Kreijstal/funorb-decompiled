/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni extends r {
    private int field_J;
    static hh field_M;
    private int field_L;
    static int[] field_D;
    static o field_N;
    private int field_I;
    private boolean field_P;
    static String field_K;
    static int field_O;
    private int field_H;
    static boolean field_F;
    static String field_G;
    private boolean field_E;

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
            super.a(param0, param1, param2, param3, param4, (byte) -96);
            ((ni) this).field_t = 0;
            int var7_int = 58 % ((-39 - param5) / 45);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ni.MA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    public static void l() {
        field_M = null;
        field_K = null;
        field_D = null;
        field_G = null;
        field_N = null;
    }

    private ni(int param0, int param1, int param2, int param3, db param4, wn param5, hm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ni) this).field_H = 2147483647;
        ((ni) this).field_I = 2147483647;
        try {
            ((ni) this).field_P = param8 ? true : false;
            ((ni) this).field_C = param6;
            ((ni) this).field_E = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ni.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_8_0 = null;
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
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_O = 81;
                break L1;
              }
            }
            L2: {
              if (((ni) this).a(param3, param1, param2, false)) {
                ((ni) this).a(param1, param2, param3, 1);
                ((ni) this).a(param3, (byte) 95, param1, param2);
                StringBuilder discarded$26 = param2.append(" revert=").append(((ni) this).field_E);
                if (((ni) this).field_H == 2147483647) {
                  break L2;
                } else {
                  if (2147483647 != ((ni) this).field_I) {
                    StringBuilder discarded$27 = param2.append(" to ").append(((ni) this).field_H).append(44).append(((ni) this).field_I);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_8_0 = (StringBuilder) param2;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ni.AA(").append(param0).append(44);
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    final void k(int param0) {
        if (param0 != -6844) {
          return;
        } else {
          super.k(param0);
          ((ni) this).field_C.a(((ni) this).field_g, 0, 0, true, ((ni) this).field_x);
          ((ni) this).field_I = ((ni) this).field_j;
          ((ni) this).field_H = ((ni) this).field_k;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!((ni) this).field_P) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (((ni) this).a(param1, param3, param4, (byte) 97, param0)) {
              ((ni) this).field_t = param6;
              if (param6 == 1) {
                ((ni) this).field_J = -((ni) this).field_k + (param1 - param4);
                ((ni) this).field_L = -((ni) this).field_j + (param3 + -param0);
                gf.field_b = (ni) this;
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_5_0 = var8_int;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("ni.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0, int param1, int param2, hm param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((ni) this).field_C instanceof hc)) {
                    break L3;
                  } else {
                    if (!((hc) (Object) ((ni) this).field_C).field_y) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((ni) this).field_t != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -((ni) this).field_J + dh.field_d - param2;
                    var6 = -param1 + -((ni) this).field_L + bj.field_y;
                    if (var5_int != ((ni) this).field_k) {
                      break L4;
                    } else {
                      if (((ni) this).field_j != var6) {
                        break L4;
                      } else {
                        super.a(param0, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  ((ni) this).field_j = var6;
                  ((ni) this).field_k = var5_int;
                  if (!(((ni) this).field_q instanceof nd)) {
                    break L1;
                  } else {
                    ((nd) (Object) ((ni) this).field_q).a((ni) this, param1, param2, 32468);
                    break L1;
                  }
                }
              }
              if (!((ni) this).field_E) {
                break L1;
              } else {
                L5: {
                  if (((ni) this).field_k == ((ni) this).field_H) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -((ni) this).field_k + ((ni) this).field_H;
                      stackOut_11_0 = this;
                      stackOut_11_1 = ((ni) this).field_k;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (Math.abs(var5_int) <= 2) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var5_int <= 0) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = -1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L6;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L6;
                        }
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = var5_int >> 1;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_16_2 = stackOut_12_2;
                        break L6;
                      }
                    }
                    ((ni) this).field_k = stackIn_16_1 + stackIn_16_2;
                    break L5;
                  }
                }
                if (((ni) this).field_j != ((ni) this).field_I) {
                  L7: {
                    var5_int = -((ni) this).field_j + ((ni) this).field_I;
                    stackOut_19_0 = this;
                    stackOut_19_1 = ((ni) this).field_j;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (Math.abs(var5_int) >= -3) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (-1 >= var5_int) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L7;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        break L7;
                      }
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> 1;
                      stackIn_24_0 = stackOut_20_0;
                      stackIn_24_1 = stackOut_20_1;
                      stackIn_24_2 = stackOut_20_2;
                      break L7;
                    }
                  }
                  ((ni) this).field_j = stackIn_24_1 + stackIn_24_2;
                  break L1;
                } else {
                  break L1;
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
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("ni.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    final static int a(int param0, int param1, boolean param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
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
            if (0 > param1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              field_O = 75;
              if (param3.length <= param1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var4_int = param3[param1];
                stackOut_8_0 = ul.a(var4_int, param0, 112);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ni.A(").append(param0).append(44).append(param1).append(44).append(0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Connection restored.";
        field_O = -1;
        field_D = new int[8192];
        field_G = "Account created successfully!";
    }
}
