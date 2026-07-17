/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends si {
    static vh field_P;
    private int field_K;
    private boolean field_H;
    private int field_L;
    private int field_U;
    private boolean field_T;
    private int field_M;
    static String field_W;
    static String field_J;
    static sa field_N;
    static bl field_I;
    static wg field_V;
    static int field_Q;
    static he[] field_S;
    static wa field_O;
    static String field_R;

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            L2: {
              if (null != ug.field_I) {
                ug.field_I.field_V.a(2, param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (null == dd.field_g) {
              break L0;
            } else {
              dd.field_g.field_O.a(2, param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("pi.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private pi(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((pi) this).field_K = 2147483647;
        ((pi) this).field_M = 2147483647;
        try {
            ((pi) this).field_T = param7 ? true : false;
            ((pi) this).field_z = param6;
            ((pi) this).field_H = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "pi.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void i(int param0) {
        super.i(0);
        ((pi) this).field_z.a(param0, ((pi) this).field_k, 0, 16535, ((pi) this).field_w);
        ((pi) this).field_M = ((pi) this).field_o;
        ((pi) this).field_K = ((pi) this).field_m;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) pj.field_G);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pj.field_G);
        try {
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) pj.field_G);
            tf.field_mb = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "pi.E(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        Object var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 113) {
                break L1;
              } else {
                var9 = null;
                ((pi) this).a((vg) null, -121, -33, (byte) 86);
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, (byte) 126, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (((pi) this).field_H) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!((pi) this).a(param6, param5, false, param4, param0)) {
              stackOut_11_0 = var8_int;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0 != 0;
            } else {
              L3: {
                if (1 == param2) {
                  ((pi) this).field_L = -param5 + (-((pi) this).field_o + param4);
                  ((pi) this).field_U = -((pi) this).field_m + (param0 - param6);
                  oh.field_b = (pi) this;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((pi) this).field_y = param2;
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("pi.JA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(nh param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          sa.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pi.A(");
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
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 21914 + 41);
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
              if (((pi) this).a(param1, param2, param0, -98)) {
                ((pi) this).a(param2, (byte) 89, param0, param1);
                ((pi) this).a(10, param2, param0, param1);
                StringBuilder discarded$26 = param2.append(" revert=").append(((pi) this).field_T);
                if (((pi) this).field_M == 2147483647) {
                  break L1;
                } else {
                  if (((pi) this).field_K != 2147483647) {
                    StringBuilder discarded$27 = param2.append(" to ").append(((pi) this).field_M).append(44).append(((pi) this).field_K);
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
              if (param3 == -10612) {
                break L2;
              } else {
                ((pi) this).i(-7);
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
            stackOut_10_1 = new StringBuilder().append("pi.WA(").append(param0).append(44);
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
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    public static void j(int param0) {
        field_I = null;
        field_V = null;
        field_J = null;
        field_P = null;
        field_R = null;
        field_O = null;
        field_W = null;
        field_S = null;
        field_N = null;
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((pi) this).field_z instanceof hf)) {
                    break L3;
                  } else {
                    if (!((hf) (Object) ((pi) this).field_z).field_E) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((pi) this).field_y != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param1 + (-((pi) this).field_L + ck.field_c);
                    var6 = ob.field_g - ((pi) this).field_U - param2;
                    if (var5_int != ((pi) this).field_o) {
                      break L4;
                    } else {
                      if (((pi) this).field_m == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((pi) this).field_m = var6;
                  ((pi) this).field_o = var5_int;
                  if (!(((pi) this).field_u instanceof te)) {
                    break L1;
                  } else {
                    ((te) (Object) ((pi) this).field_u).a((pi) this, -31124, param1, param2);
                    break L1;
                  }
                }
              }
              if (((pi) this).field_T) {
                L5: {
                  if (((pi) this).field_o == ((pi) this).field_M) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -((pi) this).field_o + ((pi) this).field_M;
                      stackOut_13_0 = this;
                      stackOut_13_1 = ((pi) this).field_o;
                      stackIn_17_0 = stackOut_13_0;
                      stackIn_17_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (Math.abs(var5_int) > 2) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = var5_int >> 1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L6;
                      } else {
                        stackOut_14_0 = this;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var5_int <= 0) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = -1;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          break L6;
                        } else {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 1;
                          stackIn_18_0 = stackOut_15_0;
                          stackIn_18_1 = stackOut_15_1;
                          stackIn_18_2 = stackOut_15_2;
                          break L6;
                        }
                      }
                    }
                    ((pi) this).field_o = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  }
                }
                if (((pi) this).field_m == ((pi) this).field_K) {
                  break L1;
                } else {
                  L7: {
                    var5_int = ((pi) this).field_K + -((pi) this).field_m;
                    stackOut_20_0 = this;
                    stackOut_20_1 = ((pi) this).field_m;
                    stackIn_24_0 = stackOut_20_0;
                    stackIn_24_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (Math.abs(var5_int) > 2) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = var5_int >> 1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      break L7;
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (var5_int <= 0) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L7;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        break L7;
                      }
                    }
                  }
                  ((pi) this).field_m = stackIn_25_1 + stackIn_25_2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, (byte) -128);
            if (param3 < -127) {
              break L0;
            } else {
              field_N = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("pi.I(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((pi) this).field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "pi.D(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new vh();
        field_W = "Achievements";
        field_J = null;
        field_V = null;
        field_Q = -1;
        field_N = new sa(4, 1, 1, 1);
        field_R = "Names cannot contain consecutive spaces";
    }
}
