/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String[] field_a;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
                    return false;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ph.C(").append(107).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) hh.field_M);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
            bb.field_I = 0;
            int var2_int = 102;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ph.B(" + (param0 != null ? "{...}" : "null") + 44 + 123 + 41);
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, byte param1, int param2, wh param3) {
        try {
            wh.field_f = 0;
            int var4_int = -10;
            id.field_v = 0;
            ki.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ph.E(" + 0 + 44 + 126 + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (mc.field_l > 0) {
              int fieldTemp$6 = mc.field_l - 1;
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
          if (param1 != 5000) {
            break L1;
          } else {
            if (re.field_Z <= 0) {
              break L1;
            } else {
              int fieldTemp$7 = re.field_Z - 1;
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
              int fieldTemp$8 = li.field_S - 1;
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
        return new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
    }
}
