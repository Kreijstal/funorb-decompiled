/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static jf field_g;
    static bd field_b;
    static int field_i;
    static wm field_c;
    static int field_a;
    static bd field_j;
    static String[] field_d;
    static bd field_e;
    static int field_h;
    static String field_f;

    final static pg a(byte param0, gb param1, int param2, int param3) {
        if (param0 < 29) {
            byte[] discarded$0 = hf.a(true, -93);
        }
        if (!rl.a(2884, param1, param2, param3)) {
            return null;
        }
        return rg.b(0);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_g = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_c = null;
        field_j = null;
        field_e = null;
        field_b = null;
    }

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0) {
          L0: {
            if (param1 != 100) {
              break L0;
            } else {
              if (mb.field_i <= 0) {
                break L0;
              } else {
                mb.field_i = mb.field_i - 1;
                var2_ref_byte__ = rf.field_i[mb.field_i - 1];
                rf.field_i[mb.field_i] = null;
                return var2_ref_byte__;
              }
            }
          }
          L1: {
            if ((param1 ^ -1) != -5001) {
              break L1;
            } else {
              if (gn.field_t > 0) {
                gn.field_t = gn.field_t - 1;
                var2_ref_byte__ = pl.field_i[gn.field_t - 1];
                pl.field_i[gn.field_t] = null;
                return var2_ref_byte__;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 != 30000) {
              break L2;
            } else {
              if (gm.field_f <= 0) {
                break L2;
              } else {
                gm.field_f = gm.field_f - 1;
                var2_ref_byte__ = cn.field_m[gm.field_f - 1];
                cn.field_m[gm.field_f] = null;
                return var2_ref_byte__;
              }
            }
          }
          L3: {
            if (null == c.field_c) {
              break L3;
            } else {
              var2 = 0;
              L4: while (true) {
                if (var2 >= ni.field_a.length) {
                  break L3;
                } else {
                  if (param1 == ni.field_a[var2]) {
                    if ((mg.field_e[var2] ^ -1) < -1) {
                      mg.field_e[var2] = mg.field_e[var2] - 1;
                      var3 = c.field_c[var2][mg.field_e[var2] - 1];
                      c.field_c[var2][mg.field_e[var2]] = null;
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
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_g = new jf();
        field_f = "Retry";
    }
}
