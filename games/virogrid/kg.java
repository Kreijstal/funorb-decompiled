/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private boolean field_d;
    static String field_h;
    static String field_g;
    private boolean field_b;
    static il field_c;
    static float field_a;
    private String field_f;
    static int field_e;

    public static void b(byte param0) {
        field_h = null;
        field_c = null;
        field_g = null;
        if (param0 != 123) {
            kg.b((byte) 16);
        }
    }

    kg(String param0) {
        this.field_b = false;
        this.field_d = false;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 66 / ((param0 - 14) / 53);
        return this.field_d;
    }

    final String a(int param0) {
        rg discarded$0 = null;
        if (param0 != 32) {
            String var3 = (String) null;
            discarded$0 = kg.a((Throwable) null, (String) null);
            return this.field_f;
        }
        return this.field_f;
    }

    final static rg a(Throwable param0, String param1) {
        rg var2 = null;
        if (!(param0 instanceof rg)) {
            var2 = new rg(param0, param1);
        } else {
            var2 = (rg) ((Object) param0);
            var2.field_c = var2.field_c + ' ' + param1;
        }
        return var2;
    }

    final void a(boolean param0, int param1) {
        if (param1 != 11358) {
            return;
        }
        this.field_d = param0 ? true : false;
        this.field_b = true;
    }

    final boolean b(int param0) {
        if (param0 > -42) {
            return false;
        }
        return this.field_b;
    }

    static {
        field_h = "End Game";
        field_g = "Hide players in <%0>'s game";
        field_e = 0;
    }
}
