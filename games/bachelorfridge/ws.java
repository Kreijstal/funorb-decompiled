/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws {
    final static kv a(byte param0) {
        int var5 = BachelorFridge.field_y;
        int var1 = lq.field_A[0] * eha.field_s[0];
        byte[] var6 = baa.field_P[0];
        byte[] var2 = var6;
        int[] var3 = new int[var1];
        int var4_int = 0;
        if (param0 != 98) {
          return (kv) null;
        }
        while (var1 > var4_int) {
          var3[var4_int] = hk.field_f[dda.a(255, (int) var6[var4_int])];
          var4_int++;
        }
        kv var4 = new kv(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var3);
        al.b(-18073);
        return var4;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
