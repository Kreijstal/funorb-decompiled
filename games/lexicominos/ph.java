/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String[] field_a;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        if (param1 != null) {
            // if_icmplt L27
            // if_icmpgt L27
        } else {
            return true;
        }
        if (param0 != 107) {
            return true;
        }
        return false;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) hh.field_M);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
        bb.field_I = 0;
        int var2 = 102 / ((param1 - 71) / 52);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 35) {
            Object var2 = null;
            ph.a((java.awt.Component) null, 91);
        }
    }

    final static void a(int param0, byte param1, int param2, wh param3) {
        wh.field_f = param0;
        int var4 = 10 / ((69 - param1) / 55);
        id.field_v = param2;
        ki.field_a = param3;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (-101 != (param1 ^ -1)) {
            break L0;
          } else {
            if (mc.field_l > 0) {
              mc.field_l = mc.field_l - 1;
              var2_ref_byte__ = m.field_a[mc.field_l - 1];
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
              re.field_Z = re.field_Z - 1;
              var2_ref_byte__ = rb.field_c[re.field_Z - 1];
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
              li.field_S = li.field_S - 1;
              var2_ref_byte__ = gj.field_s[li.field_S - 1];
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
    }
}
