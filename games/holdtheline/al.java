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
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 == 100 &&
          gd.field_g > 0) {
          fieldTemp$3 = gd.field_g - 1;
          gd.field_g = gd.field_g - 1;
          var2_ref_byte__ = j.field_a[fieldTemp$3];
          j.field_a[gd.field_g] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          in.field_a > 0) {
          fieldTemp$4 = in.field_a - 1;
          in.field_a = in.field_a - 1;
          var2_ref_byte__Lifetime1 = cd.field_e[fieldTemp$4];
          cd.field_e[in.field_a] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param0 &&
          nd.field_g > 0) {
          fieldTemp$5 = nd.field_g - 1;
          nd.field_g = nd.field_g - 1;
          var2_ref_byte__Lifetime2 = ef.field_h[fieldTemp$5];
          ef.field_h[nd.field_g] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 <= 84) {
          field_a = (go[]) null;
        }
        if (ei.field_c != null) {
          for (var2 = 0; var2 < di.field_p.length; var2++) {
            if (di.field_p[var2] == param0 &&
              ic.field_f[var2] > 0) {
              dupTemp$6 = ic.field_f[var2] - 1;
              arrayValue$7 = ei.field_c[var2];
              ic.field_f[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              ei.field_c[var2][ic.field_f[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    static {
        field_b = new int[16384];
    }
}
