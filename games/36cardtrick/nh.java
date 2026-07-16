/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private static String field_z;

    final synchronized static byte[] a(int param0, int param1) {
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        L0: {
          var2 = 100 % ((10 - param0) / 54);
          if (-101 != (param1 ^ -1)) {
            break L0;
          } else {
            if ((ll.field_c ^ -1) < -1) {
              int fieldTemp$8 = ll.field_c - 1;
              ll.field_c = ll.field_c - 1;
              var3_ref_byte__ = al.field_b[fieldTemp$8];
              al.field_b[ll.field_c] = null;
              return var3_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (5000 != param1) {
            break L1;
          } else {
            if (0 < fd.field_h) {
              int fieldTemp$9 = fd.field_h - 1;
              fd.field_h = fd.field_h - 1;
              var3_ref_byte__ = cf.field_b[fieldTemp$9];
              cf.field_b[fd.field_h] = null;
              return var3_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (30000 != param1) {
            break L2;
          } else {
            if (qa.field_c > 0) {
              byte[][] fieldTemp$10 = lf.field_c;
              int fieldTemp$11 = qa.field_c - 1;
              qa.field_c = qa.field_c - 1;
              var3_ref_byte__ = fieldTemp$10[fieldTemp$11];
              lf.field_c[qa.field_c] = null;
              return var3_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == ui.field_H) {
            break L3;
          } else {
            var3 = 0;
            L4: while (true) {
              if (var3 >= fd.field_q.length) {
                break L3;
              } else {
                if (param1 == fd.field_q[var3]) {
                  if (-1 > (sg.field_f[var3] ^ -1)) {
                    sg.field_f[var3] = sg.field_f[var3] - 1;
                    var4 = ui.field_H[var3][sg.field_f[var3] - 1];
                    ui.field_H[var3][sg.field_f[var3]] = null;
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
          }
        }
        return new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "nh.A(";
    }
}
