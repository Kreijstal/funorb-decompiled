/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static wk[] field_a;
    static String field_h;
    static String field_e;
    static wk[] field_d;
    static String field_f;
    static int field_b;
    static String field_g;
    static boolean[] field_c;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (-101 != (param0 ^ -1)) {
            break L0;
          } else {
            if ((af.field_b ^ -1) >= -1) {
              break L0;
            } else {
              af.field_b = af.field_b - 1;
              var2_ref_byte__ = ut.field_W[af.field_b - 1];
              ut.field_W[af.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != (param0 ^ -1)) {
            break L1;
          } else {
            if (0 >= ul.field_d) {
              break L1;
            } else {
              ul.field_d = ul.field_d - 1;
              var2_ref_byte__ = oo.field_d[ul.field_d - 1];
              oo.field_d[ul.field_d] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if ((param0 ^ -1) != -30001) {
            break L2;
          } else {
            if ((oj.field_v ^ -1) < -1) {
              oj.field_v = oj.field_v - 1;
              var2_ref_byte__ = dh.field_j[oj.field_v - 1];
              dh.field_j[oj.field_v] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        if (param1 == 50) {
          L3: {
            if (vh.field_k != null) {
              var2 = 0;
              L4: while (true) {
                if (var2 >= at.field_b.length) {
                  break L3;
                } else {
                  if (at.field_b[var2] == param0) {
                    if ((ca.field_a[var2] ^ -1) < -1) {
                      ca.field_a[var2] = ca.field_a[var2] - 1;
                      var3 = vh.field_k[var2][ca.field_a[var2] - 1];
                      vh.field_k[var2][ca.field_a[var2]] = null;
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
            } else {
              break L3;
            }
          }
          return new byte[param0];
        } else {
          return null;
        }
    }

    final static String[] a(int param0, String param1) {
        if (param0 != -16399) {
            od.a(36);
        }
        Object var2 = null;
        if (-2 == param1.length()) {
            return null;
        }
        String[] var3 = dj.a(77, ' ', param1);
        String[] var2_array = var3;
        if (-2 == var3.length) {
            return null;
        }
        return var2_array;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            field_e = null;
        }
    }

    final synchronized static void a(int param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-101 != (param1.length ^ -1)) {
            break L0;
          } else {
            if (af.field_b > -1001) {
              af.field_b = af.field_b + 1;
              ut.field_W[af.field_b] = param1;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-5001 != param1.length) {
            break L1;
          } else {
            if ((ul.field_d ^ -1) <= -251) {
              break L1;
            } else {
              ul.field_d = ul.field_d + 1;
              oo.field_d[ul.field_d] = param1;
              return;
            }
          }
        }
        L2: {
          if ((param1.length ^ -1) != param0) {
            break L2;
          } else {
            if (oj.field_v < 50) {
              oj.field_v = oj.field_v + 1;
              dh.field_j[oj.field_v] = param1;
              return;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (vh.field_k == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (at.field_b.length <= var2) {
                break L3;
              } else {
                if (at.field_b[var2] == param1.length) {
                  if (vh.field_k[var2].length > ca.field_a[var2]) {
                    ca.field_a[var2] = ca.field_a[var2] + 1;
                    vh.field_k[var2][ca.field_a[var2]] = param1;
                    return;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Army Setup";
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new boolean[]{false, true, true, false, true, true};
        field_e = "to keep fullscreen or";
        field_g = "Training";
    }
}
