/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ma extends jc {
    private int field_K;
    static ea field_O;
    private int field_N;
    private boolean field_M;
    private int field_P;
    private boolean field_L;
    private int field_J;

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, 0);
            ((ma) this).field_w = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ma.LA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1) {
        sa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            oc.field_f = param1;
            if (param0 <= -88) {
              var2 = (sa) (Object) hj.field_b.b(61);
              L1: while (true) {
                if (var2 == null) {
                  if (m.field_c != null) {
                    var2 = (sa) (Object) m.field_c.b(80);
                    L2: while (true) {
                      if (var2 == null) {
                        break L0;
                      } else {
                        L3: {
                          if (!var2.field_p.c(118)) {
                            var2.b(34);
                            break L3;
                          } else {
                            var2.field_n.f(128 + oc.field_f * var2.field_q >> 8);
                            break L3;
                          }
                        }
                        var2 = (sa) (Object) m.field_c.b((byte) 56);
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    if (var2.field_p.c(123)) {
                      var2.field_n.f(oc.field_f * var2.field_q - -128 >> 8);
                      break L4;
                    } else {
                      var2.b(34);
                      break L4;
                    }
                  }
                  var2 = (sa) (Object) hj.field_b.b((byte) 56);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2_ref, "ma.B(" + param0 + 44 + param1 + 41);
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (((ma) this).a(param3, true, param2, param1)) {
                ((ma) this).a(param1, param3, 34, param2);
                ((ma) this).a(param1, param2, param3, -125);
                StringBuilder discarded$26 = param3.append(" revert=").append(((ma) this).field_L);
                if (((ma) this).field_J == 2147483647) {
                  break L1;
                } else {
                  if (((ma) this).field_P != 2147483647) {
                    StringBuilder discarded$27 = param3.append(" to ").append(((ma) this).field_J).append(44).append(((ma) this).field_P);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -70) {
                break L2;
              } else {
                ((ma) this).field_M = false;
                break L2;
              }
            }
            stackOut_8_0 = (StringBuilder) param3;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ma.SA(").append(param0).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final static int o(int param0) {
        return -cg.field_o + si.field_d;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
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
              var8_int = super.a(param0, param1, param2 ^ param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!((ma) this).field_M) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (((ma) this).b(param3, param6, param1, param0, -92)) {
              L2: {
                if (param4 != 1) {
                  break L2;
                } else {
                  j.field_d = (ma) this;
                  ((ma) this).field_N = -param6 + (-((ma) this).field_u + param0);
                  ((ma) this).field_K = -param1 + (param3 + -((ma) this).field_t);
                  break L2;
                }
              }
              ((ma) this).field_w = param4;
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_5_0 = var8_int;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("ma.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((ma) this).field_I instanceof hc)) {
                    break L3;
                  } else {
                    if (!((hc) (Object) ((ma) this).field_I).field_E) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((ma) this).field_w == 1) {
                  L4: {
                    var5_int = -param1 + nk.field_w - ((ma) this).field_N;
                    var6 = -param0 + (-((ma) this).field_K + gb.field_e);
                    if (var5_int != ((ma) this).field_u) {
                      break L4;
                    } else {
                      if (((ma) this).field_t != var6) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((ma) this).field_t = var6;
                  ((ma) this).field_u = var5_int;
                  if (((ma) this).field_y instanceof uc) {
                    ((uc) (Object) ((ma) this).field_y).a(param1, 64, (ma) this, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!((ma) this).field_L) {
                break L1;
              } else {
                L5: {
                  if (((ma) this).field_u != ((ma) this).field_J) {
                    L6: {
                      var5_int = -((ma) this).field_u + ((ma) this).field_J;
                      stackOut_8_0 = this;
                      stackOut_8_1 = ((ma) this).field_u;
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
                    ((ma) this).field_u = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((ma) this).field_t != ((ma) this).field_P) {
                  L7: {
                    var5_int = -((ma) this).field_t + ((ma) this).field_P;
                    stackOut_16_0 = this;
                    stackOut_16_1 = ((ma) this).field_t;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (Math.abs(var5_int) <= 2) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (var5_int > 0) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L7;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = -1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L7;
                      }
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = var5_int >> 1;
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_21_1 = stackOut_17_1;
                      stackIn_21_2 = stackOut_17_2;
                      break L7;
                    }
                  }
                  ((ma) this).field_t = stackIn_21_1 + stackIn_21_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            super.a(param0, param1, (byte) 61, param3);
            if (param2 >= 49) {
              break L0;
            } else {
              ((ma) this).field_P = -75;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("ma.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final void a(byte param0) {
        super.a(param0);
        ((ma) this).field_I.a(((ma) this).field_q, param0 + -111, 0, ((ma) this).field_v, 0);
        ((ma) this).field_P = ((ma) this).field_t;
        ((ma) this).field_J = ((ma) this).field_u;
    }

    public static void n(int param0) {
        field_O = null;
    }

    private ma(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ma) this).field_P = 2147483647;
        ((ma) this).field_J = 2147483647;
        try {
            ((ma) this).field_L = param7 ? true : false;
            ((ma) this).field_M = param8 ? true : false;
            ((ma) this).field_I = param6;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ma.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
    }
}
