/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pga {
    static int field_a;
    static js field_b;

    final static du a(boolean param0, int param1) {
        int var3 = 0;
        du[] var2;
        int var4;
        du[] var5;
        var4 = BachelorFridge.field_y;
        var5 = wga.d(0);
        var2 = var5;
        if (param0) {
          return (du) null;
        }
        for (var3 = 0; var5.length > var3; var3++) {
          if (var5[var3].field_c == param1) {
            return var5[var3];
          }
        }
        return null;
    }

    public static void a(int param0) {
        if (param0 != 470) {
          pga.a(-55);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = 470;
    }
}
