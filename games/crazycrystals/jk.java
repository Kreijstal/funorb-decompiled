/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends fb {
    static String field_h;
    static int field_f;
    static int[] field_g;
    private ji field_i;

    final fb a(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = 81 / ((param0 - 36) / 62);
        var3 = null;
        if (null == ((jk) this).field_i.b((f[][]) null, 0, (byte) 28, 0)) {
          return null;
        } else {
          return (fb) this;
        }
    }

    public static void a() {
        field_g = null;
        field_h = null;
    }

    jk(fq param0) {
        super(param0);
        try {
            ((jk) this).field_i = new ji((f) null, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        if (param3 > -59) {
          ((jk) this).a(true, -19, 116, (byte) 114, true, -79, 54);
          ((jk) this).field_i.b(118, param1, param2, false, param5, param6);
          return;
        } else {
          ((jk) this).field_i.b(118, param1, param2, false, param5, param6);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "to keep fullscreen or";
        field_f = 64;
    }
}
