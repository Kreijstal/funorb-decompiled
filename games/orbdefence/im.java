/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static int[] field_a;
    static String field_b;
    ca field_d;
    private ca field_c;

    final ca a(byte param0) {
        ca var2 = ((im) this).field_d.field_c;
        if (((im) this).field_d == var2) {
            return null;
        }
        int var3 = -80 / ((param0 - -14) / 34);
        var2.b(57);
        return var2;
    }

    final ca d(int param0) {
        ca var2 = ((im) this).field_c;
        if (!(((im) this).field_d != var2)) {
            ((im) this).field_c = null;
            return null;
        }
        ((im) this).field_c = var2.field_e;
        if (param0 != 853) {
            field_b = null;
        }
        return var2;
    }

    final ca b(byte param0) {
        ca var2 = ((im) this).field_d.field_e;
        if (var2 == ((im) this).field_d) {
            ((im) this).field_c = null;
            return null;
        }
        int var3 = -122 / ((58 - param0) / 56);
        ((im) this).field_c = var2.field_e;
        return var2;
    }

    final boolean c(int param0) {
        if (param0 != -3088) {
            field_a = null;
        }
        return ((im) this).field_d.field_e == ((im) this).field_d ? true : false;
    }

    final ca d(byte param0) {
        ca var2 = ((im) this).field_d.field_c;
        if (var2 == ((im) this).field_d) {
            ((im) this).field_c = null;
            return null;
        }
        ((im) this).field_c = var2.field_c;
        if (param0 != -122) {
            ((im) this).field_c = null;
        }
        return var2;
    }

    final void a(int param0, ca param1) {
        if (null != param1.field_c) {
            param1.b(57);
        }
        if (param0 >= -68) {
            return;
        }
        try {
            param1.field_c = ((im) this).field_d.field_c;
            param1.field_e = ((im) this).field_d;
            param1.field_c.field_e = param1;
            param1.field_e.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "im.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(char param0, int param1) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = '*';
        }
        var4 = -70;
        return new String(var3);
    }

    final int c(byte param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        int var2 = 0;
        ca var3 = ((im) this).field_d.field_e;
        if (param0 != 52) {
            ((im) this).field_d = null;
        }
        while (((im) this).field_d != var3) {
            var2++;
            var3 = var3.field_e;
        }
        return var2;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final ca b(int param0) {
        ca var2 = ((im) this).field_c;
        if (param0 != 10708) {
            ca discarded$0 = ((im) this).a((byte) 52);
        }
        if (!(var2 != ((im) this).field_d)) {
            ((im) this).field_c = null;
            return null;
        }
        ((im) this).field_c = var2.field_c;
        return var2;
    }

    public im() {
        ((im) this).field_d = new ca();
        ((im) this).field_d.field_e = ((im) this).field_d;
        ((im) this).field_d.field_c = ((im) this).field_d;
    }

    final void a(ca param0, int param1) {
        if (param0.field_c != null) {
            param0.b(57);
        }
        if (param1 != 9) {
            return;
        }
        try {
            param0.field_e = ((im) this).field_d.field_e;
            param0.field_c = ((im) this).field_d;
            param0.field_c.field_e = param0;
            param0.field_e.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "im.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0) {
        ca var2 = null;
        int var3 = OrbDefence.field_D ? 1 : 0;
        while (true) {
            var2 = ((im) this).field_d.field_e;
            if (var2 == ((im) this).field_d) {
                break;
            }
            var2.b(57);
        }
        if (param0) {
            ca discarded$0 = ((im) this).d(79);
        }
        ((im) this).field_c = null;
    }

    final ca e(int param0) {
        if (param0 != 0) {
            ((im) this).field_c = null;
        }
        ca var2 = ((im) this).field_d.field_e;
        if (((im) this).field_d == var2) {
            return null;
        }
        var2.b(param0 ^ 57);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names cannot contain consecutive spaces";
        field_a = new int[9];
    }
}
