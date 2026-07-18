/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk extends dk {
    private boolean field_E;
    static int[] field_J;
    private int field_L;
    static String field_G;
    private int field_I;
    private int field_F;
    private int field_H;
    private boolean field_K;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
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
              if (param3 < -47) {
                break L1;
              } else {
                var6 = null;
                ((pk) this).a((byte) 36, (qa) null, 37, -90, -110, -10);
                break L1;
              }
            }
            L2: {
              if (((pk) this).a(param1, -103, param0, param2)) {
                ((pk) this).a(param2, -70, param0, param1);
                ((pk) this).a(param0, param1, (byte) 103, param2);
                StringBuilder discarded$26 = param0.append(" revert=").append(((pk) this).field_K);
                if (((pk) this).field_I == 2147483647) {
                  break L2;
                } else {
                  if (((pk) this).field_H == 2147483647) {
                    break L2;
                  } else {
                    StringBuilder discarded$27 = param0.append(" to ").append(((pk) this).field_I).append(',').append(((pk) this).field_H);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("pk.S(");
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
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((pk) this).field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private pk(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((pk) this).field_I = 2147483647;
        ((pk) this).field_H = 2147483647;
        try {
            ((pk) this).field_E = param8 ? true : false;
            ((pk) this).field_K = param7 ? true : false;
            ((pk) this).field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        ((pk) this).field_A.a(0, ((pk) this).field_u, 0, ((pk) this).field_j, 80);
        ((pk) this).field_H = ((pk) this).field_z;
        ((pk) this).field_I = ((pk) this).field_y;
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
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
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (param3 < -85) {
                break L1;
              } else {
                var7 = null;
                ((pk) this).a((byte) -72, (qa) null, 106, 108, -8, 125);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!(((pk) this).field_A instanceof bb)) {
                    break L4;
                  } else {
                    if (!((bb) (Object) ((pk) this).field_A).field_D) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((pk) this).field_v == 1) {
                  L5: {
                    var5_int = -param1 + (ag.field_f - ((pk) this).field_F);
                    var6 = -param0 + -((pk) this).field_L + kc.field_b;
                    if (((pk) this).field_y != var5_int) {
                      break L5;
                    } else {
                      if (((pk) this).field_z == var6) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((pk) this).field_z = var6;
                  ((pk) this).field_y = var5_int;
                  if (!(((pk) this).field_s instanceof qd)) {
                    break L2;
                  } else {
                    ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                    break L2;
                  }
                } else {
                  break L3;
                }
              }
              if (((pk) this).field_K) {
                L6: {
                  if (((pk) this).field_y != ((pk) this).field_I) {
                    L7: {
                      var5_int = -((pk) this).field_y + ((pk) this).field_I;
                      stackOut_11_0 = this;
                      stackOut_11_1 = ((pk) this).field_y;
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
                        if (var5_int > 0) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L7;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = -1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L7;
                        }
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = var5_int >> 1;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_16_2 = stackOut_12_2;
                        break L7;
                      }
                    }
                    ((pk) this).field_y = stackIn_16_1 + stackIn_16_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((pk) this).field_H != ((pk) this).field_z) {
                  L8: {
                    var5_int = ((pk) this).field_H - ((pk) this).field_z;
                    stackOut_19_0 = this;
                    stackOut_19_1 = ((pk) this).field_z;
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
                      if (0 >= var5_int) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L8;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        break L8;
                      }
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> 1;
                      stackIn_24_0 = stackOut_20_0;
                      stackIn_24_1 = stackOut_20_1;
                      stackIn_24_2 = stackOut_20_2;
                      break L8;
                    }
                  }
                  ((pk) this).field_z = stackIn_24_1 + stackIn_24_2;
                  break L2;
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              } else {
                break L2;
              }
            }
            super.a(param0, param1, param2, (byte) -91);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5;
            stackOut_32_1 = new StringBuilder().append("pk.I(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param3 + ')');
        }
    }

    final static ve a(byte param0, String param1) {
        RuntimeException var2 = null;
        ve stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_0_0 = null;
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
            stackOut_0_0 = new ve(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pk.FA(").append(68).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void d(byte param0) {
        field_G = null;
        if (param0 < 50) {
            pk.d((byte) 21);
            field_J = null;
            return;
        }
        field_J = null;
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
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
                if (((pk) this).field_E) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!((pk) this).b(param0, param6, 0, param4, param2)) {
              stackOut_8_0 = var8_int;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              ((pk) this).field_v = param5;
              if (1 != param5) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                ((pk) this).field_F = -param6 + -((pk) this).field_y + param4;
                ((pk) this).field_L = -param0 + (-((pk) this).field_z + param2);
                wi.field_e = (pk) this;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("pk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[16384];
        field_G = "Level: <%0>";
    }
}
