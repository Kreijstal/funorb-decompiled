/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends java.awt.Canvas {
    private java.awt.Component field_a;
    static byte[] field_b;

    final static void a(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int[] var5 = nn.field_c;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    kq(java.awt.Component param0) {
        ((kq) this).field_a = param0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 60) {
            field_b = null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((kq) this).field_a.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((kq) this).field_a.update(param0);
    }

    static {
    }
}
