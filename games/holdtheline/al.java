/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static go[] field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 0;
        field_a = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (gd.field_g <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = gd.field_g - 1;
              gd.field_g = gd.field_g - 1;
              var2_ref_byte__ = j.field_a[fieldTemp$6];
              j.field_a[gd.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (in.field_a > 0) {
              int fieldTemp$7 = in.field_a - 1;
              in.field_a = in.field_a - 1;
              var2_ref_byte__ = cd.field_e[fieldTemp$7];
              cd.field_e[in.field_a] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (30000 != param0) {
            break L2;
          } else {
            if (nd.field_g > 0) {
              int fieldTemp$8 = nd.field_g - 1;
              nd.field_g = nd.field_g - 1;
              var2_ref_byte__ = ef.field_h[fieldTemp$8];
              ef.field_h[nd.field_g] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ei.field_c != null) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= di.field_p.length) {
                break L3;
              } else {
                if (di.field_p[var2] == param0) {
                  if (ic.field_f[var2] > 0) {
                    ic.field_f[var2] = ic.field_f[var2] - 1;
                    var3 = ei.field_c[var2][ic.field_f[var2] - 1];
                    ei.field_c[var2][ic.field_f[var2]] = null;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[16384];
    }
}
