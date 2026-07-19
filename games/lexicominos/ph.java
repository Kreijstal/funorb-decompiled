/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String[] field_a;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < g.field_o) {
                  break L1;
                } else {
                  if (param1.length() > oc.field_c) {
                    break L1;
                  } else {
                    if (param0 == 107) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ph.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(hh.field_M);
            param0.removeMouseMotionListener(hh.field_M);
            param0.removeFocusListener(hh.field_M);
            bb.field_I = 0;
            int var2_int = 102 / ((param1 - 71) / 52);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ph.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 35) {
            java.awt.Component var2 = (java.awt.Component) null;
            ph.a((java.awt.Component) null, 91);
        }
    }

    final static void a(int param0, byte param1, int param2, wh param3) {
        try {
            wh.field_f = param0;
            int var4_int = 10 / ((69 - param1) / 55);
            id.field_v = param2;
            ki.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ph.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (-101 != (param1 ^ -1)) {
            break L0;
          } else {
            if (mc.field_l > 0) {
              fieldTemp$6 = mc.field_l - 1;
              mc.field_l = mc.field_l - 1;
              var2_ref_byte__ = m.field_a[fieldTemp$6];
              m.field_a[mc.field_l] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-5001 != (param1 ^ -1)) {
            break L1;
          } else {
            if (re.field_Z <= 0) {
              break L1;
            } else {
              fieldTemp$7 = re.field_Z - 1;
              re.field_Z = re.field_Z - 1;
              var2_ref_byte__ = rb.field_c[fieldTemp$7];
              rb.field_c[re.field_Z] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1 != 30000) {
            break L2;
          } else {
            if (0 >= li.field_S) {
              break L2;
            } else {
              fieldTemp$8 = li.field_S - 1;
              li.field_S = li.field_S - 1;
              var2_ref_byte__ = gj.field_s[fieldTemp$8];
              gj.field_s[li.field_S] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if (null == vg.field_a) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= ui.field_D.length) {
                break L3;
              } else {
                if (ui.field_D[var2] == param1) {
                  if (0 < d.field_e[var2]) {
                    d.field_e[var2] = d.field_e[var2] - 1;
                    var3 = vg.field_a[var2][d.field_e[var2] - 1];
                    vg.field_a[var2][d.field_e[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        L5: {
          if (param0 < -30) {
            break L5;
          } else {
            field_b = -125;
            break L5;
          }
        }
        return new byte[param1];
    }

    static {
        field_a = new String[255];
    }
}
