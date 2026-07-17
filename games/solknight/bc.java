/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bc extends si {
    private boolean field_O;
    private int field_L;
    private int field_N;
    private boolean field_I;
    static nc field_J;
    private int field_M;
    private int field_H;
    static sf field_K;

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
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
                if (!((bc) this).field_O) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (!((bc) this).a(param4, param3, param1, param5, -118)) {
              stackOut_10_0 = var8_int;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              L2: {
                if (1 == param0) {
                  jf.field_a = (bc) this;
                  ((bc) this).field_N = param3 - ((bc) this).field_m - param1;
                  ((bc) this).field_L = param4 + (-((bc) this).field_j - param5);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((bc) this).field_u = param0;
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("bc.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param6 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((bc) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "bc.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private bc(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((bc) this).field_M = 2147483647;
        ((bc) this).field_H = 2147483647;
        try {
            ((bc) this).field_I = param7 ? true : false;
            ((bc) this).field_O = param8 ? true : false;
            ((bc) this).field_G = param6;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "bc.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((bc) this).field_G instanceof pj)) {
                    break L3;
                  } else {
                    if (!((pj) (Object) ((bc) this).field_G).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((bc) this).field_u == 1) {
                  L4: {
                    var5_int = -((bc) this).field_N + (gb.field_j - param0);
                    var6 = -((bc) this).field_L + (ad.field_m - param2);
                    if (var5_int != ((bc) this).field_m) {
                      break L4;
                    } else {
                      if (var6 == ((bc) this).field_j) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((bc) this).field_m = var5_int;
                  ((bc) this).field_j = var6;
                  if (!(((bc) this).field_n instanceof t)) {
                    break L1;
                  } else {
                    ((t) (Object) ((bc) this).field_n).a(param0, (byte) 40, param2, (bc) this);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!((bc) this).field_I) {
                break L1;
              } else {
                L5: {
                  if (((bc) this).field_H == ((bc) this).field_m) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -((bc) this).field_m + ((bc) this).field_H;
                      stackOut_7_0 = this;
                      stackOut_7_1 = ((bc) this).field_m;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (-3 > Math.abs(var5_int)) {
                        stackOut_11_0 = this;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = var5_int >> 1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (-1 < var5_int) {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L6;
                        } else {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = -1;
                          stackIn_12_0 = stackOut_9_0;
                          stackIn_12_1 = stackOut_9_1;
                          stackIn_12_2 = stackOut_9_2;
                          break L6;
                        }
                      }
                    }
                    ((bc) this).field_m = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (((bc) this).field_M != ((bc) this).field_j) {
                  L7: {
                    var5_int = -((bc) this).field_j + ((bc) this).field_M;
                    stackOut_15_0 = this;
                    stackOut_15_1 = ((bc) this).field_j;
                    stackIn_19_0 = stackOut_15_0;
                    stackIn_19_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (Math.abs(var5_int) > 2) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = var5_int >> 1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L7;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (var5_int > 0) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L7;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        break L7;
                      }
                    }
                  }
                  ((bc) this).field_j = stackIn_20_1 + stackIn_20_2;
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
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("bc.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    public static void c(boolean param0) {
        field_K = null;
        field_J = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 < -41) {
              L1: {
                if (((bc) this).a(param2, -1, param1, param3)) {
                  ((bc) this).b(param2, -119, param1, param3);
                  ((bc) this).a(param1, param2, param3, -19156);
                  StringBuilder discarded$26 = param2.append(" revert=").append(((bc) this).field_I);
                  if (2147483647 == ((bc) this).field_H) {
                    break L1;
                  } else {
                    if (((bc) this).field_M != 2147483647) {
                      StringBuilder discarded$27 = param2.append(" to ").append(((bc) this).field_H).append(44).append(((bc) this).field_M);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_9_0 = (StringBuilder) param2;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bc.GA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0) {
        super.a(-123);
        ((bc) this).field_G.b(((bc) this).field_x, ((bc) this).field_t, 0, 0, 0);
        ((bc) this).field_H = ((bc) this).field_m;
        if (param0 >= -102) {
          return;
        } else {
          ((bc) this).field_M = ((bc) this).field_j;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new nc();
        field_K = new sf(1);
    }
}
