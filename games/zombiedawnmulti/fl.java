/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_c;
    static String[] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 103) {
            field_b = null;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (-1 <= pn.field_h) {
              break L0;
            } else {
              pn.field_h = pn.field_h - 1;
              var2_ref_byte__ = lp.field_f[pn.field_h - 1];
              lp.field_f[pn.field_h] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != param1) {
            break L1;
          } else {
            if (ej.field_e <= 0) {
              break L1;
            } else {
              ej.field_e = ej.field_e - 1;
              var2_ref_byte__ = vb.field_a[ej.field_e - 1];
              vb.field_a[ej.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (30000 != param1) {
            break L2;
          } else {
            if (0 < ci.field_a) {
              ci.field_a = ci.field_a - 1;
              var2_ref_byte__ = oj.field_N[ci.field_a - 1];
              oj.field_N[ci.field_a] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          var2 = -104 / ((param0 - 39) / 61);
          if (null != gb.field_b) {
            var3 = 0;
            L4: while (true) {
              if (var3 >= lk.field_P.length) {
                break L3;
              } else {
                if (param1 == lk.field_P[var3]) {
                  if (-1 > (ta.field_ib[var3] ^ -1)) {
                    ta.field_ib[var3] = ta.field_ib[var3] - 1;
                    var4 = gb.field_b[var3][ta.field_ib[var3] - 1];
                    gb.field_b[var3][ta.field_ib[var3]] = null;
                    return var4;
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param1];
    }

    final static ja a(String param0, String param1, ul param2, int param3) {
        if (param3 != 11091) {
            boolean discarded$0 = fl.a(-27, 'w');
        }
        int var4 = param2.a(param0, (byte) 118);
        int var5 = param2.a(param1, var4, -1);
        return bl.a((byte) 50, var4, param2, var5);
    }

    final static boolean a(int param0, char param1) {
        if (param0 > -69) {
            return false;
        }
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (gn.a(param1, 16413)) {
            return true;
        }
        if (param1 != 45) {
            if (param1 != 160) {
                if (param1 != 32) {
                    if (95 != param1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Zombie", "Overlord", "Planetary"};
        field_c = new int[8192];
    }
}
