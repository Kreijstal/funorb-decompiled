/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class h extends ug {
    static de field_Y;
    private int field_R;
    private int field_Z;
    static wk field_T;
    private boolean field_W;
    private boolean field_S;
    static int field_U;
    private int field_ab;
    static int field_G;
    static String[] field_X;
    private int field_V;

    final static void i(int param0) {
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        if (param0 == -1) {
          if (null != fk.field_i) {
            if (fk.field_i.field_J) {
              if (0 == (fk.field_i.field_X.field_X & 1 << ed.field_j)) {
                if (0 == fk.field_i.field_X.field_X) {
                  if ((fk.field_i.field_N | 1 << ed.field_j) != -1 + (1 << fk.field_i.field_X.field_kb)) {
                    ti.field_A[12] = cl.field_i;
                    return;
                  } else {
                    ti.field_A[12] = jh.field_g;
                    return;
                  }
                } else {
                  ti.field_A[12] = nl.field_Z;
                  return;
                }
              } else {
                ti.field_A[12] = ch.field_H;
                return;
              }
            } else {
              if ((1 << ed.field_j & fk.field_i.field_X.field_X) == 0) {
                if (0 == fk.field_i.field_X.field_X) {
                  if ((1 << fk.field_i.field_X.field_kb) + -1 != (1 << ed.field_j | fk.field_i.field_N)) {
                    ti.field_A[12] = dg.field_a;
                    return;
                  } else {
                    ti.field_A[12] = hm.field_d;
                    return;
                  }
                } else {
                  ti.field_A[12] = ih.field_p;
                  return;
                }
              } else {
                ti.field_A[12] = ig.field_d;
                return;
              }
            }
          } else {
            if ((1 << ed.field_j & fk.field_i.field_X.field_X) == 0) {
              if (0 == fk.field_i.field_X.field_X) {
                if ((1 << fk.field_i.field_X.field_kb) + -1 != (1 << ed.field_j | fk.field_i.field_N)) {
                  ti.field_A[12] = dg.field_a;
                  return;
                } else {
                  ti.field_A[12] = hm.field_d;
                  return;
                }
              } else {
                ti.field_A[12] = ih.field_p;
                return;
              }
            } else {
              ti.field_A[12] = ig.field_d;
              return;
            }
          }
        } else {
          return;
        }
    }

    private h(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((h) this).field_ab = 2147483647;
        ((h) this).field_V = 2147483647;
        try {
            ((h) this).field_J = param6;
            ((h) this).field_W = param8 ? true : false;
            ((h) this).field_S = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "h.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((h) this).field_W) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((h) this).a(param0, param4, (byte) 81, param3, param2)) {
              L2: {
                if (param6 == 1) {
                  ((h) this).field_R = param0 - (((h) this).field_z - -param4);
                  ((h) this).field_Z = -param2 + (param3 - ((h) this).field_o);
                  nc.field_e = (h) this;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((h) this).field_w = param6;
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
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
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("h.I(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void f(int param0) {
        super.f(-128);
        ((h) this).field_J.a(0, (byte) -95, 0, ((h) this).field_x, ((h) this).field_E);
        ((h) this).field_V = ((h) this).field_z;
        if (param0 >= -120) {
          field_Y = null;
          ((h) this).field_ab = ((h) this).field_o;
          return;
        } else {
          ((h) this).field_ab = ((h) this).field_o;
          return;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (!((h) this).a(param1, (byte) -91, param3, param0)) {
                break L1;
              } else {
                ((h) this).a(param3, param0, false, param1);
                ((h) this).a(param0, (byte) 75, param3, param1);
                StringBuilder discarded$28 = param1.append(" revert=").append(((h) this).field_S);
                if (-2147483648 == ((h) this).field_ab) {
                  break L1;
                } else {
                  if (-2147483648 != ((h) this).field_V) {
                    StringBuilder discarded$29 = param1.append(" to ").append(((h) this).field_ab).append(',').append(((h) this).field_V);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 < -104) {
                break L2;
              } else {
                var6 = null;
                boolean discarded$30 = ((h) this).a(-29, (lh) null, 114, -68, 100, true, 18);
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
            stackOut_9_1 = new StringBuilder().append("h.D(");
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, int param1, lh param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
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
                  if (!(((h) this).field_J instanceof oa)) {
                    break L3;
                  } else {
                    if (!((oa) (Object) ((h) this).field_J).field_K) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 != ((h) this).field_w) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -((h) this).field_Z + oh.field_f - param0;
                    var6 = -param3 + (pi.field_c - ((h) this).field_R);
                    if (var5_int != ((h) this).field_o) {
                      break L4;
                    } else {
                      if (var6 != ((h) this).field_z) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((h) this).field_z = var6;
                  ((h) this).field_o = var5_int;
                  if (!(((h) this).field_A instanceof bn)) {
                    break L1;
                  } else {
                    ((bn) (Object) ((h) this).field_A).a(-107, param0, (h) this, param3);
                    break L1;
                  }
                }
              }
              if (!((h) this).field_S) {
                break L1;
              } else {
                L5: {
                  if (((h) this).field_ab != ((h) this).field_o) {
                    L6: {
                      var5_int = -((h) this).field_o + ((h) this).field_ab;
                      stackOut_12_0 = this;
                      stackOut_12_1 = ((h) this).field_o;
                      stackIn_16_0 = stackOut_12_0;
                      stackIn_16_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (2 < Math.abs(var5_int)) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = var5_int >> 1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L6;
                      } else {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (0 >= var5_int) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = -1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L6;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L6;
                        }
                      }
                    }
                    ((h) this).field_o = stackIn_17_1 + stackIn_17_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((h) this).field_z == ((h) this).field_V) {
                  break L1;
                } else {
                  L7: {
                    var5_int = ((h) this).field_V - ((h) this).field_z;
                    stackOut_19_0 = this;
                    stackOut_19_1 = ((h) this).field_z;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (Math.abs(var5_int) <= 2) {
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
                  ((h) this).field_z = stackIn_24_1 + stackIn_24_2;
                  break L1;
                }
              }
            }
            super.a(param0, 78, param2, param3);
            if (param1 > 56) {
              break L0;
            } else {
              ((h) this).field_ab = -32;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("h.H(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
            super.a((byte) 75, param1, param2, param3, param4, param5);
            int var7_int = -101 / ((param0 - 36) / 32);
            ((h) this).field_w = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "h.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void h() {
        field_T = null;
        field_Y = null;
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new de("");
        field_X = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
