/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String[] field_a;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < g.field_o) {
                  break L1;
                } else {
                  if (~param1.length() < ~oc.field_c) {
                    break L1;
                  } else {
                    if (param0 == 107) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("ph.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) hh.field_M);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
            bb.field_I = 0;
            var2_int = 102 / ((param1 - 71) / 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ph.B(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            if (param0 <= 35) {
                ph.a((java.awt.Component) null, 91);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ph.A(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, wh param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            wh.field_f = param0;
            var4_int = 10 / ((69 - param1) / 55);
            id.field_v = param2;
            ki.field_a = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ph.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var2_int = 0;
        byte[] var3 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_32_0 = null;
        byte[] stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_18_0 = null;
        byte[] stackOut_31_0 = null;
        byte[] stackOut_37_0 = null;
        try {
          L0: {
            L1: {
              if (param1 != 100) {
                break L1;
              } else {
                if (mc.field_l > 0) {
                  int fieldTemp$3 = mc.field_l - 1;
                  mc.field_l = mc.field_l - 1;
                  var2_array = m.field_a[fieldTemp$3];
                  m.field_a[mc.field_l] = null;
                  stackOut_6_0 = (byte[]) var2_array;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 != 5000) {
                break L2;
              } else {
                if (re.field_Z <= 0) {
                  break L2;
                } else {
                  int fieldTemp$4 = re.field_Z - 1;
                  re.field_Z = re.field_Z - 1;
                  var2_array = rb.field_c[fieldTemp$4];
                  rb.field_c[re.field_Z] = null;
                  stackOut_12_0 = (byte[]) var2_array;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
            L3: {
              if (param1 != 30000) {
                break L3;
              } else {
                if (0 >= li.field_S) {
                  break L3;
                } else {
                  int fieldTemp$5 = li.field_S - 1;
                  li.field_S = li.field_S - 1;
                  var2_array = gj.field_s[fieldTemp$5];
                  gj.field_s[li.field_S] = null;
                  stackOut_18_0 = (byte[]) var2_array;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                }
              }
            }
            L4: {
              if (null == vg.field_a) {
                break L4;
              } else {
                var2_int = 0;
                L5: while (true) {
                  if (~var2_int <= ~ui.field_D.length) {
                    break L4;
                  } else {
                    L6: {
                      if (ui.field_D[var2_int] != param1) {
                        break L6;
                      } else {
                        if (0 < d.field_e[var2_int]) {
                          d.field_e[var2_int] = d.field_e[var2_int] - 1;
                          var3 = vg.field_a[var2_int][d.field_e[var2_int] - 1];
                          vg.field_a[var2_int][d.field_e[var2_int]] = null;
                          stackOut_31_0 = (byte[]) var3;
                          stackIn_32_0 = stackOut_31_0;
                          return stackIn_32_0;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var2_int++;
                    continue L5;
                  }
                }
              }
            }
            L7: {
              if (param0 < -30) {
                break L7;
              } else {
                field_b = -125;
                break L7;
              }
            }
            stackOut_37_0 = new byte[param1];
            stackIn_38_0 = stackOut_37_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "ph.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_38_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
    }
}
