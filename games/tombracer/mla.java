/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mla {
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        if (param0 < -22) {
          return ((coa.field_s == this ? 1 : 0) | (this == cha.field_d ? 1 : 0)) != 0;
        }
        return false;
    }

    final static void a(int param0, int param1) {
        kh var6 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 < -83) {
          var6 = ql.field_k;
          var6.k(param0, -2988);
          var6.field_h = var6.field_h + 1;
          var3 = var6.field_h;
          var6.i(5, 0);
          var6.i(uu.field_a.field_Jb, 0);
          var4 = (uu.field_a.field_yb << 6) + uu.field_a.field_cc;
          var6.i(var4, 0);
          var6.a(0, uu.field_a.field_ac, uu.field_a.field_ac.length, 121);
          var6.d(var6.field_h - var3, (byte) -97);
          return;
        }
        mla.a(-5, 33);
        kh var5 = ql.field_k;
        var5.k(param0, -2988);
        var5.field_h = var5.field_h + 1;
        var3Lifetime1 = var5.field_h;
        var5.i(5, 0);
        var5.i(uu.field_a.field_Jb, 0);
        var4Lifetime1 = (uu.field_a.field_yb << 6) + uu.field_a.field_cc;
        var5.i(var4Lifetime1, 0);
        var5.a(0, uu.field_a.field_ac, uu.field_a.field_ac.length, 121);
        var5.d(var5.field_h - var3Lifetime1, (byte) -97);
    }

    static {
    }
}
