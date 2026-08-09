/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private static String field_z;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        byte[][] fieldTemp$6 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int var2;
        byte[] var3_ref_byte__;
        int var3;
        byte[] var4;
        L0: {
          var2 = 100 % ((10 - param0) / 54);
          if (-101 != (param1 ^ -1)) {
            break L0;
          } else {
            if ((ll.field_c ^ -1) < -1) {
              fieldTemp$4 = ll.field_c - 1;
              ll.field_c = ll.field_c - 1;
              var3_ref_byte__ = al.field_b[fieldTemp$4];
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
              fieldTemp$5 = fd.field_h - 1;
              fd.field_h = fd.field_h - 1;
              var3_ref_byte__ = cf.field_b[fieldTemp$5];
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
              fieldTemp$6 = lf.field_c;
              fieldTemp$7 = qa.field_c - 1;
              qa.field_c = qa.field_c - 1;
              var3_ref_byte__ = fieldTemp$6[fieldTemp$7];
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
                    dupTemp$8 = sg.field_f[var3] - 1;
                    arrayValue$9 = ui.field_H[var3];
                    sg.field_f[var3] = dupTemp$8;
                    var4 = arrayValue$9[dupTemp$8];
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
        field_z = "nh.A(";
    }
}
