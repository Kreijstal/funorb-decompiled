/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends pc {
    static int[] field_ab;
    static le[] field_Z;

    final void c(byte param0, we param1) {
        if (param0 <= 25) {
            ra.f((byte) -87);
            super.c((byte) 43, param1);
            return;
        }
        super.c((byte) 43, param1);
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2 = 71 % ((-67 - param1) / 44);
        return pd.a(65, param0, 10, true);
    }

    public static void f(byte param0) {
        if (param0 != -96) {
            return;
        }
        field_ab = null;
        field_Z = null;
    }

    ra(kj param0, we param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var2 > var4; var4++) {
            var3 = m.a(1, param1.charAt(var4)) + (-var3 + (var3 << -478074267));
        }
        var4 = -36 % ((param0 - 50) / 47);
        return var3;
    }

    static {
    }
}
