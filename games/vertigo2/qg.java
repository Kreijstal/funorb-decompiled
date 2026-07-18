/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends oh {
    private boolean field_M;
    private boolean field_N;
    private int field_H;
    private int field_J;
    static int field_I;
    private int field_K;
    static int field_G;
    private int field_L;

    final void a(byte param0) {
        super.a((byte) 119);
        ((qg) this).field_C.a(false, 0, 0, ((qg) this).field_s, ((qg) this).field_n);
        if (param0 <= 93) {
          return;
        } else {
          ((qg) this).field_K = ((qg) this).field_t;
          ((qg) this).field_L = ((qg) this).field_o;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gg discarded$10 = pf.a((byte) -88, on.field_b[param2][param3], param1);
        if (param0 != 1) {
            qg.a(105, 55, -99, true, (String) null, 34L);
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, (byte) -120, param6) ? 1 : 0;
              if (param5 <= -107) {
                break L1;
              } else {
                ((qg) this).field_H = -3;
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!((qg) this).field_M) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (((qg) this).a(0, param2, param1, param0, param6)) {
              ((qg) this).field_A = param4;
              if (param4 != 1) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                um.field_E = (qg) this;
                ((qg) this).field_J = -param2 + -((qg) this).field_t + param6;
                ((qg) this).field_H = -param1 + (param0 - ((qg) this).field_o);
                return true;
              }
            } else {
              stackOut_7_0 = var8_int;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("qg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
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
              if (!((qg) this).a(param3, -1, param1, param0)) {
                break L1;
              } else {
                ((qg) this).a(param0, param3, true, param1);
                ((qg) this).a(1000, param0, param1, param3);
                StringBuilder discarded$26 = param3.append(" revert=").append(((qg) this).field_N);
                if (((qg) this).field_L == 2147483647) {
                  break L1;
                } else {
                  if (((qg) this).field_K != 2147483647) {
                    StringBuilder discarded$27 = param3.append(" to ").append(((qg) this).field_L).append(',').append(((qg) this).field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 == -79) {
                break L2;
              } else {
                ((qg) this).field_J = -46;
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param3;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("qg.FA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
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
            if (param0 > 6) {
              L1: {
                L2: {
                  L3: {
                    if (!(((qg) this).field_C instanceof d)) {
                      break L3;
                    } else {
                      if (!((d) (Object) ((qg) this).field_C).field_F) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (((qg) this).field_A == 1) {
                    L4: {
                      var5_int = -((qg) this).field_H + (ed.field_n + -param1);
                      var6 = -((qg) this).field_J + (gb.field_d - param2);
                      if (var5_int != ((qg) this).field_o) {
                        break L4;
                      } else {
                        if (var6 == ((qg) this).field_t) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((qg) this).field_o = var5_int;
                    ((qg) this).field_t = var6;
                    if (!(((qg) this).field_v instanceof ai)) {
                      break L1;
                    } else {
                      ((ai) (Object) ((qg) this).field_v).a(-17589, param1, (qg) this, param2);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
                if (((qg) this).field_N) {
                  L5: {
                    if (((qg) this).field_L == ((qg) this).field_o) {
                      break L5;
                    } else {
                      L6: {
                        var5_int = ((qg) this).field_L + -((qg) this).field_o;
                        stackOut_10_0 = this;
                        stackOut_10_1 = ((qg) this).field_o;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (Math.abs(var5_int) <= 2) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (0 >= var5_int) {
                            stackOut_14_0 = this;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = -1;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            break L6;
                          } else {
                            stackOut_13_0 = this;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            break L6;
                          }
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = var5_int >> 1;
                          stackIn_15_0 = stackOut_11_0;
                          stackIn_15_1 = stackOut_11_1;
                          stackIn_15_2 = stackOut_11_2;
                          break L6;
                        }
                      }
                      ((qg) this).field_o = stackIn_15_1 + stackIn_15_2;
                      break L5;
                    }
                  }
                  if (((qg) this).field_t == ((qg) this).field_K) {
                    break L1;
                  } else {
                    L7: {
                      var5_int = -((qg) this).field_t + ((qg) this).field_K;
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((qg) this).field_t;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (Math.abs(var5_int) >= -3) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (-1 < var5_int) {
                          stackOut_21_0 = this;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          break L7;
                        } else {
                          stackOut_20_0 = this;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = -1;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          break L7;
                        }
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = var5_int >> 1;
                        stackIn_22_0 = stackOut_18_0;
                        stackIn_22_1 = stackOut_18_1;
                        stackIn_22_2 = stackOut_18_2;
                        break L7;
                      }
                    }
                    ((qg) this).field_t = stackIn_22_1 + stackIn_22_2;
                    break L1;
                  }
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              }
              super.a((byte) 64, param1, param2, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("qg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw wn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((qg) this).field_A = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qg.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long b(boolean param0) {
        return gk.a(57) - gn.field_b;
    }

    final static void a(int param0, int param1, int param2, boolean param3, String param4, long param5) {
        int var7_int = 0;
        try {
            uh.field_Wb.j(param0, 127);
            uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
            var7_int = uh.field_Wb.field_u;
            if (param2 != 0) {
                qg.a(-61, -1, -60, -41);
            }
            uh.field_Wb.a((byte) -119, param5);
            uh.field_Wb.a((byte) 0, param4);
            uh.field_Wb.f(param1, -75);
            uh.field_Wb.f(param3 ? 1 : 0, 112);
            uh.field_Wb.b((byte) -125, uh.field_Wb.field_u + -var7_int);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qg.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private qg(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((qg) this).field_K = 2147483647;
        ((qg) this).field_L = 2147483647;
        try {
            ((qg) this).field_N = param7 ? true : false;
            ((qg) this).field_C = param6;
            ((qg) this).field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
