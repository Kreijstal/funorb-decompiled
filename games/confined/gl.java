/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gl extends mf {
    static mi field_j;
    static String field_k;
    private ul field_l;
    static double field_m;
    static double field_i;
    private ul field_h;

    gl(ul param0, ul param1, ul param2) {
        super(param0);
        try {
            ((gl) this).field_h = param1;
            ((gl) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(byte param0) {
        field_k = null;
        field_j = null;
    }

    final fi a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        fi stackIn_4_0 = null;
        fi stackIn_8_0 = null;
        fi stackIn_11_0 = null;
        fi stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_7_0 = null;
        fi stackOut_12_0 = null;
        fi stackOut_10_0 = null;
        fi stackOut_3_0 = null;
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
            L1: {
              var3 = ((gl) this).field_h.field_B.toLowerCase();
              var4 = param1.toLowerCase();
              if (param0 <= -44) {
                break L1;
              } else {
                field_i = 1.1993332607782194;
                break L1;
              }
            }
            if (var4.length() != 0) {
              if (!wd.a(0, var3, var4)) {
                stackOut_7_0 = fb.field_e;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!this.a(param1, (byte) -69)) {
                  stackOut_12_0 = nn.field_q;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = fb.field_e;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = fb.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("gl.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
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
              var3 = ((gl) this).field_l.field_B.toLowerCase();
              var4 = param0.toLowerCase();
              var5 = -119 % ((30 - param1) / 41);
              if (0 >= var3.length()) {
                break L1;
              } else {
                if (0 < var4.length()) {
                  var6 = var3.lastIndexOf("@");
                  if (0 > var6) {
                    break L1;
                  } else {
                    if (-1 + var3.length() > var6) {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 + 1);
                      if (var4.indexOf(var7) >= 0) {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        if (var4.indexOf(var8) < 0) {
                          break L1;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("gl.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_23_0 = null;
        String stackOut_27_0 = null;
        String stackOut_31_0 = null;
        String stackOut_19_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            var6 = ((gl) this).field_h.field_B.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (ef.a(101, var5)) {
                stackOut_5_0 = vm.field_bb;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (lc.a(param1, var5)) {
                  stackOut_9_0 = oe.field_T;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!wc.a(var5, -81)) {
                    if (this.a(param0, (byte) 124)) {
                      stackOut_16_0 = mg.field_f;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (var6.length() > 0) {
                        if (nm.a(var6, (byte) 96, var5)) {
                          stackOut_23_0 = fg.field_pb;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (qd.a(var6, var5, false)) {
                            stackOut_27_0 = wh.field_eb;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          } else {
                            if (ig.a(var6, 0, var5)) {
                              stackOut_31_0 = fg.field_pb;
                              stackIn_32_0 = stackOut_31_0;
                              break L0;
                            } else {
                              return vm.field_bb;
                            }
                          }
                        }
                      } else {
                        stackOut_19_0 = si.field_f;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  } else {
                    stackOut_12_0 = mk.field_m;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("gl.A(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
        return stackIn_32_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0.0;
    }
}
