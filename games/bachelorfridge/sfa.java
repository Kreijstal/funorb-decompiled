/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sfa extends bw {
    nq field_h;
    int field_f;
    int field_g;

    abstract ii a(op param0, int param1);

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        var5 = 0;
        if (param3 >= an.field_q) {
          if (param3 > ha.field_n) {
            return;
          } else {
            param1 = cr.a(eo.field_l, param1, pw.field_x, 0);
            param4 = cr.a(eo.field_l, param4, pw.field_x, 0);
            ew.a(param1, param3, -82, param0, param4);
            return;
          }
        } else {
          return;
        }
    }

    sfa(int param0, int param1, nq param2) {
        try {
            ((sfa) this).field_h = param2;
            ((sfa) this).field_f = param0;
            ((sfa) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sfa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        pf var3 = sja.field_fb;
        var3.c(param0, (byte) 119);
        var3.d(3, 0);
        var3.d(10, 0);
        var3.b(param1, -125);
    }

    public final String toString() {
        oha var1 = al.a(123, ((sfa) this).field_g);
        if (var1 == null) {
            return "Move not found.";
        }
        return var1.field_f;
    }

    void a(int param0, lu param1) {
        try {
            int var3_int = 34 % ((param0 - 61) / 53);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sfa.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
