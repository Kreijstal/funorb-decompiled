/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int field_g;
    static String field_c;
    static int field_a;
    private jj field_f;
    static tf field_e;
    private rh field_d;
    private rh field_b;

    final og a(byte param0, int param1) {
        byte[] var5 = null;
        og var3 = (og) (this.field_f.a((byte) 106, (long)param1));
        if (var3 == null) {
            int var4 = 3 % ((param0 - 57) / 42);
            if (param1 < 32768) {
                var5 = this.field_d.a(1, -28153, param1);
            } else {
                var5 = this.field_b.a(1, -28153, 32767 & param1);
            }
            var3 = new og();
            if ((var5 != null)) {
                var3.a(0, new qc(var5));
            }
            if (!(param1 < 32768)) {
                var3.f((byte) 119);
            }
            this.field_f.a(-126, (long)param1, var3);
            return var3;
        }
        return var3;
    }

    public static void a(byte param0) {
        int var1 = 52 / ((25 - param0) / 54);
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        hf var2 = null;
        int var3 = 0;
        wc var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Geoblox.field_C;
        try {
          var4 = (wc) ((Object) l.field_g.g(param1 ^ param1));
          while (var4 != null) {
            o.a(param0, var4, param1 - 21718);
            var4 = (wc) ((Object) l.field_g.d(1));
          }
          var2 = qa.field_e.g(0);
          while (var2 != null) {
            gf.a(param0, 125);
            var2 = qa.field_e.d(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "di.B(" + param0 + ',' + param1 + ')');
        }
    }

    private di() throws Throwable {
        throw new Error();
    }

    static {
        field_a = 0;
        field_c = "Create";
    }
}
