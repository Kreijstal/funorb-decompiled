/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private static String field_z;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        byte[][] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int var2;
        byte[] var3_ref_byte__;
        byte[] var4;
        byte[] var3_ref_byte__Lifetime1;
        byte[] var3_ref_byte__Lifetime2;
        var2 = 100 % ((10 - param0) / 54);
        if (param1 == 100 &&
          ll.field_c > 0) {
          fieldTemp$0 = ll.field_c - 1;
          ll.field_c = ll.field_c - 1;
          var3_ref_byte__ = al.field_b[fieldTemp$0];
          al.field_b[ll.field_c] = null;
          return var3_ref_byte__;
        }
        if (5000 == param1 &&
          0 < fd.field_h) {
          fieldTemp$1 = fd.field_h - 1;
          fd.field_h = fd.field_h - 1;
          var3_ref_byte__Lifetime1 = cf.field_b[fieldTemp$1];
          cf.field_b[fd.field_h] = null;
          return var3_ref_byte__Lifetime1;
        }
        if (30000 == param1 &&
          qa.field_c > 0) {
          fieldTemp$2 = lf.field_c;
          fieldTemp$3 = qa.field_c - 1;
          qa.field_c = qa.field_c - 1;
          var3_ref_byte__Lifetime2 = fieldTemp$2[fieldTemp$3];
          lf.field_c[qa.field_c] = null;
          return var3_ref_byte__Lifetime2;
        }
        if (null != ui.field_H) {
          for (var3 = 0; var3 < fd.field_q.length; var3++) {
            if (param1 == fd.field_q[var3] &&
              sg.field_f[var3] > 0) {
              dupTemp$4 = sg.field_f[var3] - 1;
              arrayValue$5 = ui.field_H[var3];
              sg.field_f[var3] = dupTemp$4;
              var4 = arrayValue$5[dupTemp$4];
              ui.field_H[var3][sg.field_f[var3]] = null;
              return var4;
            }
          }
        }
        return new byte[param1];
    }

    static {
        field_z = "nh.A(";
    }
}
