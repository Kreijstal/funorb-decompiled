/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    dna field_a;
    static String field_c;
    static int field_d;
    static kv field_b;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = 1;
    }

    lm(String param0, sna param1) {
        String[] var3 = null;
        sna[] var4 = null;
        try {
            var3 = new String[]{param0, de.field_K, uj.field_v};
            var4 = new sna[]{param1, ov.field_d, (sna) (Object) nr.field_w};
            ((lm) this).field_a = new dna(0L, ad.field_q, var3, jfa.field_f, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        if (param4 <= 45) {
          return;
        } else {
          ((lm) this).field_a.a(var7, param2, 0, param1, param3, param0, var6);
          kg.field_d.a(rg.field_h, 31407, ov.field_d.field_sb, 0, 0);
          eda.field_k.a(18, 31407, -82 + ov.field_d.field_sb + (-rj.field_j - 2), 0, 2 + rg.field_h);
          vl.field_d.a(18, 31407, rj.field_j + 82, -2 + ov.field_d.field_sb + (-rj.field_j - 80), 2 + rg.field_h);
          rba.field_a.a(ov.field_d.field_sb, 20 + rg.field_h + 2, 107, 2, 0, -22 + (ov.field_d.field_p - rg.field_h), 20, rj.field_j);
          nr.field_w.a((byte) -125, rj.field_j, 20, 2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You can join this game";
    }
}
