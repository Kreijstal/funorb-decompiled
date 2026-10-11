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

    final static void a(int param0) {
        h var1_ref = null;
        Object var1 = null;
        h var1_refLifetime1;
        if (param0 != 28773) {
          fd.a(66, -74, -52L);
          var1_ref = (h) (tm.field_a.c(56));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          wb.a(var1_ref.field_q, var1_ref.field_j, var1_ref.field_r);
          wb.b(var1_ref.field_l, var1_ref.field_o, var1_ref.field_p, var1_ref.field_k);
          var1_ref.field_q = null;
          ni.field_c.a((o) (var1_ref), (byte) 105);
          return;
        }
        var1_refLifetime1 = (h) (tm.field_a.c(56));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        wb.a(var1_refLifetime1.field_q, var1_refLifetime1.field_j, var1_refLifetime1.field_r);
        wb.b(var1_refLifetime1.field_l, var1_refLifetime1.field_o, var1_refLifetime1.field_p, var1_refLifetime1.field_k);
        var1_refLifetime1.field_q = null;
        ni.field_c.a((o) (var1_refLifetime1), (byte) 105);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 == 7) {
          le.field_f = param3;
          kj.field_h = param0;
          kg.field_V = param2;
          return;
        }
        um var5 = (um) null;
        fd.a((byte) 74, (um) null);
        le.field_f = param3;
        kj.field_h = param0;
        kg.field_V = param2;
    }

    public static void c(byte param0) {
        int var1 = 123 / ((-58 - param0) / 50);
        field_o = null;
        field_l = null;
    }

    final static void a(byte param0, um param1) {
        hi var2 = null;
        try {
          hi.b(param1.a("headers.packvorbis", 30045, ""));
          int var3 = -89 / ((-60 - param0) / 43);
          var2 = hi.a(param1, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "fd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private fd() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, long param2) {
        nk var4 = qn.field_U;
        var4.f(param0, -87);
        var4.field_l = var4.field_l + 1;
        int var5 = var4.field_l;
        var4.c(7, (byte) -84);
        if (param1 < -41) {
          var4.a(-74, param2);
          var4.a(var4.field_l - var5, -1);
          return;
        }
        field_l = (String) null;
        var4.a(-74, param2);
        var4.a(var4.field_l - var5, -1);
    }

    static {
        field_l = "No";
        field_o = "Create a free Account";
    }
}
