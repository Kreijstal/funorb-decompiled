/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo {
    static int[] field_b;
    static Hashtable field_a;
    static int field_c;

    final static int a(int param0, boolean param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        if (param1) {
          field_c = -100;
        }
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          0 < va.field_b) {
          fieldTemp$3 = va.field_b - 1;
          va.field_b = va.field_b - 1;
          var2_ref_byte__ = kh.field_f[fieldTemp$3];
          kh.field_f[va.field_b] = null;
          return var2_ref_byte__;
        }
        if (5000 == param1 &&
          hk.field_a > 0) {
          fieldTemp$4 = hk.field_a - 1;
          hk.field_a = hk.field_a - 1;
          var2_ref_byte__Lifetime1 = ow.field_d[fieldTemp$4];
          ow.field_d[hk.field_a] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param1 &&
          0 < fh.field_k) {
          fieldTemp$5 = fh.field_k - 1;
          fh.field_k = fh.field_k - 1;
          var2_ref_byte__Lifetime2 = ke.field_b[fieldTemp$5];
          ke.field_b[fh.field_k] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != gk.field_w) {
          for (var2 = 0; var2 < kr.field_d.length; var2++) {
            if (param1 == kr.field_d[var2] &&
              l.field_c[var2] > 0) {
              dupTemp$6 = l.field_c[var2] - 1;
              arrayValue$7 = gk.field_w[var2];
              l.field_c[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              gk.field_w[var2][l.field_c[var2]] = null;
              return var3;
            }
          }
        }
        var2Lifetime1 = 26 % ((42 - param0) / 51);
        return new byte[param1];
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -11 % ((-56 - param0) / 45);
        field_b = null;
    }

    static {
        field_a = new Hashtable();
        field_c = 0;
    }
}
