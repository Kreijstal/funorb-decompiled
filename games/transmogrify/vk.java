/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    final static od a(byte param0, hb param1) {
        if (param0 <= 77) {
            Object var3 = null;
            od discarded$0 = vk.a((byte) -63, (hb) null);
        }
        return ic.a(bb.a(param1, 100, 96), 4);
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (-1 <= (cc.field_a ^ -1)) {
              break L0;
            } else {
              cc.field_a = cc.field_a - 1;
              var2_ref_byte__ = pf.field_a[cc.field_a - 1];
              pf.field_a[cc.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          var2 = 11 % ((param1 - -3) / 47);
          if (5000 != param0) {
            break L1;
          } else {
            if (th.field_a <= 0) {
              break L1;
            } else {
              th.field_a = th.field_a - 1;
              var3_ref_byte__ = ai.field_e[th.field_a - 1];
              ai.field_e[th.field_a] = null;
              return var3_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 >= fd.field_f) {
              break L2;
            } else {
              fd.field_f = fd.field_f - 1;
              var3_ref_byte__ = dl.field_p[fd.field_f - 1];
              dl.field_p[fd.field_f] = null;
              return var3_ref_byte__;
            }
          }
        }
        L3: {
          if (null != lb.field_c) {
            var3 = 0;
            L4: while (true) {
              if (var3 >= de.field_b.length) {
                break L3;
              } else {
                if (param0 == de.field_b[var3]) {
                  if (pe.field_b[var3] > 0) {
                    pe.field_b[var3] = pe.field_b[var3] - 1;
                    var4 = lb.field_c[var3][pe.field_b[var3] - 1];
                    lb.field_c[var3][pe.field_b[var3]] = null;
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
        return new byte[param0];
    }

    static {
    }
}
