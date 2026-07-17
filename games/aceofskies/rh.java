/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends wf {
    su field_g;
    static qo field_e;
    wf field_i;
    int field_h;
    static kp field_f;

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 32081) {
            field_e = null;
        }
    }

    final void b(int param0, int param1) {
        if (param0 != -2580) {
            ((rh) this).b(108, -13);
            ((rh) this).field_g.g(param1);
            return;
        }
        ((rh) this).field_g.g(param1);
    }

    final void a(int param0, int param1) {
        param1 = param1 << 6;
        ((rh) this).field_h = param1;
        if (param0 != -128) {
          rh.a(-71);
          ((rh) this).field_g.f(128 + param1 * gn.field_a >> 8);
          return;
        } else {
          ((rh) this).field_g.f(128 + param1 * gn.field_a >> 8);
          return;
        }
    }

    rh(su param0, wf param1) {
        try {
            ((rh) this).field_g = param0;
            ((rh) this).field_h = param0.i();
            ((rh) this).field_i = param1;
            ((rh) this).field_g.f(((rh) this).field_h * gn.field_a - -128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new qo();
    }
}
