/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws {
    final static kv a(byte param0) {
        int var1;
        byte[] var2;
        int[] var3;
        int var4_int;
        kv var4;
        int var5;
        byte[] var6;
        var5 = BachelorFridge.field_y;
        var1 = lq.field_A[0] * eha.field_s[0];
        var6 = baa.field_P[0];
        var2 = var6;
        var3 = new int[var1];
        var4_int = 0;
        if (param0 == 98) {
          L0: while (true) {
            if (var1 <= var4_int) {
              var4 = new kv(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var3);
              al.b(-18073);
              return var4;
            } else {
              var3[var4_int] = hk.field_f[dda.a(255, (int) var6[var4_int])];
              var4_int++;
              continue L0;
            }
          }
        } else {
          return (kv) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
