/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static go[] field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -117 % ((8 - param0) / 62);
        field_a = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (-1 <= (gd.field_g ^ -1)) {
              break L0;
            } else {
              fieldTemp$3 = gd.field_g - 1;
              gd.field_g = gd.field_g - 1;
              var2_ref_byte__ = j.field_a[fieldTemp$3];
              j.field_a[gd.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (-1 > (in.field_a ^ -1)) {
              fieldTemp$4 = in.field_a - 1;
              in.field_a = in.field_a - 1;
              var2_ref_byte__ = cd.field_e[fieldTemp$4];
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
            if (-1 > (nd.field_g ^ -1)) {
              fieldTemp$5 = nd.field_g - 1;
              nd.field_g = nd.field_g - 1;
              var2_ref_byte__ = ef.field_h[fieldTemp$5];
              ef.field_h[nd.field_g] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param1 > 84) {
            break L3;
          } else {
            field_a = (go[]) null;
            break L3;
          }
        }
        L4: {
          if (ei.field_c != null) {
            var2 = 0;
            L5: while (true) {
              if (var2 >= di.field_p.length) {
                break L4;
              } else {
                if (di.field_p[var2] == param0) {
                  if (ic.field_f[var2] > 0) {
                    dupTemp$6 = ic.field_f[var2] - 1;
                    arrayValue$7 = ei.field_c[var2];
                    ic.field_f[var2] = dupTemp$6;
                    var3 = arrayValue$7[dupTemp$6];
                    ei.field_c[var2][ic.field_f[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          } else {
            break L4;
          }
        }
        return new byte[param0];
    }

    static {
        field_b = new int[16384];
    }
}
