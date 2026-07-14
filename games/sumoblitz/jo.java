/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo {
    static int[] field_b;
    static Hashtable field_a;
    static int field_c;

    final static int a(int param0, boolean param1) {
        int var2 = param0 >>> 2141259489;
        var2 = var2 | var2 >>> -1442105215;
        var2 = var2 | var2 >>> 20229634;
        var2 = var2 | var2 >>> 127505316;
        var2 = var2 | var2 >>> -519912760;
        if (param1) {
            field_c = -100;
        }
        var2 = var2 | var2 >>> 442003056;
        return param0 & (var2 ^ -1);
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (0 >= va.field_b) {
              break L0;
            } else {
              va.field_b = va.field_b - 1;
              var2_ref_byte__ = kh.field_f[va.field_b - 1];
              kh.field_f[va.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (5000 != param1) {
            break L1;
          } else {
            if (-1 <= (hk.field_a ^ -1)) {
              break L1;
            } else {
              hk.field_a = hk.field_a - 1;
              var2_ref_byte__ = ow.field_d[hk.field_a - 1];
              ow.field_d[hk.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (30000 != param1) {
            break L2;
          } else {
            if (0 >= fh.field_k) {
              break L2;
            } else {
              fh.field_k = fh.field_k - 1;
              var2_ref_byte__ = ke.field_b[fh.field_k - 1];
              ke.field_b[fh.field_k] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if (null != gk.field_w) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= kr.field_d.length) {
                break L3;
              } else {
                if (param1 == kr.field_d[var2]) {
                  if (l.field_c[var2] > 0) {
                    l.field_c[var2] = l.field_c[var2] - 1;
                    var3 = gk.field_w[var2][l.field_c[var2] - 1];
                    gk.field_w[var2][l.field_c[var2]] = null;
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
        var2 = 26 % ((42 - param0) / 51);
        return new byte[param1];
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -11 % ((-56 - param0) / 45);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Hashtable();
        field_c = 0;
    }
}
