/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static ed[] field_a;
    static qh field_b;

    public static void b(int param0) {
        if (param0 != 31167) {
            Object var2 = null;
            ed[] discarded$0 = tk.a(false, (qh[]) null);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 23403) {
            tk.b(-66);
        }
        return af.field_e.a(false);
    }

    final static ed[] a(boolean param0, qh[] param1) {
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        if (!nm.a((byte) -73, param1)) {
            return null;
        }
        ed[] var3 = new ed[param1.length];
        if (param0) {
            return null;
        }
        for (var4 = 0; var4 < param1.length; var4++) {
            var3[var4] = param1[var4].b(94);
        }
        return var3;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var4 = EscapeVector.field_A;
        qd var5 = (qd) (Object) mi.field_l.a(false);
        int var3 = -57 / ((-46 - param0) / 51);
        while (var5 != null) {
            sm.a(var5, param1, true);
            var5 = (qd) (Object) mi.field_l.b((byte) 70);
        }
        hg var2 = bc.field_b.a(false);
        while (var2 != null) {
            km.a(param1, 122);
            var2 = bc.field_b.b((byte) 70);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed[7];
    }
}
