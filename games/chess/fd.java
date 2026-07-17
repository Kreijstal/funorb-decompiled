/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends o {
    int field_k;
    int field_m;
    int field_j;
    static int field_n;
    static String field_o;
    static String field_l;

    final static void a() {
        h var1 = (h) (Object) tm.field_a.c(56);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        wb.a(var1.field_q, var1.field_j, var1.field_r);
        wb.b(var1.field_l, var1.field_o, var1.field_p, var1.field_k);
        var1.field_q = null;
        ni.field_c.a((o) (Object) var1, (byte) 105);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        le.field_f = param3;
        kj.field_h = param0;
        kg.field_V = param2;
    }

    public static void c() {
        int var1 = -41;
        field_o = null;
        field_l = null;
    }

    final static void a(byte param0, um param1) {
        hi var2 = null;
        try {
            hi.b(param1.a("headers.packvorbis", 30045, ""));
            int var3 = -89;
            var2 = hi.a(param1, "jagex logo2.packvorbis", "");
            lm discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "fd.D(" + -103 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private fd() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, long param2) {
        nk var4 = null;
        int var5 = 0;
        var4 = qn.field_U;
        var4.f(param0, -87);
        var4.field_l = var4.field_l + 1;
        var5 = var4.field_l;
        var4.c(7, (byte) -84);
        if (param1 >= -41) {
          field_l = null;
          var4.a(-74, param2);
          var4.a(var4.field_l + -var5, -1);
          return;
        } else {
          var4.a(-74, param2);
          var4.a(var4.field_l + -var5, -1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "No";
        field_o = "Create a free Account";
    }
}
