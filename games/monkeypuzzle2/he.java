/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ug {
    static String[] field_f;
    int field_h;
    static te field_e;
    static int[] field_g;

    final static void e() {
        int var1_int = 0;
        ki var2 = null;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            for (var1_int = 0; 1000 > var1_int; var1_int++) {
                var2 = new ki(-1, 0, var1_int);
                ri.field_b.a(-8212, (ug) (Object) var2);
                e.field_a[var1_int] = var2;
                aj.field_b.a(-8212, (ug) (Object) new il((ki) null, (ki) null, 32.0f));
            }
            nd.field_b.e();
            ge.f(nd.field_b.field_m >> 1, nd.field_b.field_n >> 1, (nd.field_b.field_m >> 1) + -1, 16711680);
            ac.field_a.a((byte) 115);
            ek.field_b = 0;
            dc.field_e = 0;
            ok.field_d = false;
            sc.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "he.C(" + 0 + ')');
        }
    }

    he(int param0) {
        ((he) this).field_h = param0;
    }

    final static void f(int param0) {
        if (param0 != 0) {
            field_f = null;
            ne.a(true);
            return;
        }
        ne.a(true);
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_g = null;
    }

    final static le[] a(byte param0, int param1, int param2, int param3, int param4) {
        le[] var6 = new le[9];
        le[] var5 = var6;
        le dupTemp$0 = sj.a(1, 74, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        le dupTemp$1 = sj.a(1, 74, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(0 == param4)) {
            var6[4] = sj.a(64, 74, param4);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = new te(15, 0, 1, 0);
        field_g = new int[8192];
    }
}
