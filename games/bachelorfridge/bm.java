/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends pp {
    int field_k;
    private int field_j;
    int field_l;
    static String field_i;
    static String field_m;

    public static void d(byte param0) {
        field_m = null;
        field_i = null;
        if (param0 != 3) {
            field_m = null;
        }
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        String var2_ref = null;
        ji var3 = null;
        var2 = lka.field_E[param1][5];
        var2_ref = var2.toLowerCase();
        var2_ref = var2_ref.trim();
        var3 = (ji) (Object) fi.field_m.a(true, (long)var2_ref.hashCode());
        if (param0 <= 58) {
          field_m = null;
          return var3.field_h;
        } else {
          return var3.field_h;
        }
    }

    bm(int param0, int param1, int param2) {
        ((bm) this).field_j = param0;
        ((bm) this).field_k = param1;
        ((bm) this).field_l = param2;
    }

    final void a(lu param0, byte param1) {
        int var3 = 96 / ((34 - param1) / 58);
        this.a(param0, (byte) -58);
        param0.d(((bm) this).field_j, 0);
        param0.d(((bm) this).field_k, 0);
        param0.d(((bm) this).field_l, 0);
    }

    final void a(aga param0, op param1, int param2) {
        Object var5 = null;
        if (param2 != 12) {
          var5 = null;
          ((bm) this).a((lu) null, (byte) 36);
          param1.b((byte) 76, ((bm) this).field_j, ((bm) this).field_k, ((bm) this).field_l);
          return;
        } else {
          param1.b((byte) 76, ((bm) this).field_j, ((bm) this).field_k, ((bm) this).field_l);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        an.field_q = param1;
        ha.field_n = param0;
        eo.field_l = param4;
        if (param3 != -14702) {
            return;
        }
        pw.field_x = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Speed</col>";
        field_m = "The invitation has been withdrawn.";
    }
}
