/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws {
    final static Sprite a(byte param0) {
        int var5 = BachelorFridge.field_y;
        int var1 = lq.field_A[0] * InsanoSauceSpecial.field_s[0];
        byte[] var6 = BananarangAnimation.field_P[0];
        byte[] var2 = var6;
        int[] var3 = new int[var1];
        int var4_int = 0;
        if (param0 != 98) {
          return (Sprite) null;
        }
        while (var1 > var4_int) {
          var3[var4_int] = hk.field_f[dda.a(255, (int) var6[var4_int])];
          var4_int++;
        }
        Sprite var4 = new Sprite(ok.field_Bb, MassPoisonEvent.field_r, fl.field_j[0], AirstrikeAnimation.field_D[0], lq.field_A[0], InsanoSauceSpecial.field_s[0], var3);
        al.b(-18073);
        return var4;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
