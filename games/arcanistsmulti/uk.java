/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends java.awt.Canvas implements java.awt.event.FocusListener {
    private static int[] field_a;
    static wf[] field_g;
    volatile boolean field_e;
    static String field_c;
    java.awt.Frame field_b;
    static String field_f;
    static int field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((uk) this).field_e = true;
    }

    final static String a(CharSequence param0, byte param1) {
        Object var3 = null;
        if (param1 != -118) {
          var3 = null;
          String discarded$2 = uk.a((CharSequence) null, (byte) 121);
          return vk.a(false, param0, -123);
        } else {
          return vk.a(false, param0, -123);
        }
    }

    final void a(dl param0, byte param1) {
        if (param1 != 67) {
            field_f = null;
            fh.a(100, param0, ((uk) this).field_b);
            return;
        }
        fh.a(100, param0, ((uk) this).field_b);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        field_a = null;
        int var1 = -33 / ((51 - param0) / 56);
    }

    uk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_g = new wf[79];
        field_c = "Orb coins: <%0>";
        field_a = new int[98304];
        for (var0 = 92682; -46342 >= (var0 ^ -1); var0--) {
            var4 = (long)(-1 + (var0 << 753917857));
            var6 = (long)(1 + (var0 << 1457081729));
            var3 = (int)((var6 * var6 >> -1833308270) - 32768L);
            var2 = (int)(-32768L + (var4 * var4 >> 500559250));
            if (var3 >= field_a.length) {
                var3 = field_a.length + -1;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
        field_f = "Cog spells deal with changing the course of time and manipulating your opponents.";
    }
}
