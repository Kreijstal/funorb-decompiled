/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    ai field_b;
    private ai field_c;
    static int field_a;

    final ai a(byte param0) {
        ai var2 = ((bc) this).field_b.field_c;
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_c;
        if (param0 > -44) {
            boolean discarded$0 = ((bc) this).f((byte) 90);
        }
        return var2;
    }

    final ai c(byte param0) {
        if (param0 != -52) {
            ((bc) this).b(108);
        }
        ai var2 = ((bc) this).field_b.field_c;
        if (((bc) this).field_b == var2) {
            return null;
        }
        var2.c(param0 ^ -50);
        return var2;
    }

    final ai b(byte param0) {
        ai var2 = ((bc) this).field_b.field_f;
        if (param0 <= 9) {
            return null;
        }
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_f;
        return var2;
    }

    final ai d(byte param0) {
        ai var2 = ((bc) this).field_c;
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        int var3 = 102 % ((15 - param0) / 33);
        ((bc) this).field_c = var2.field_c;
        return var2;
    }

    final boolean f(byte param0) {
        if (param0 != -93) {
            ai discarded$0 = ((bc) this).c((byte) 40);
        }
        return ((bc) this).field_b == ((bc) this).field_b.field_c ? true : false;
    }

    final ai e(byte param0) {
        ai var2 = ((bc) this).field_b.field_f;
        if (param0 <= 55) {
            return null;
        }
        if (var2 == ((bc) this).field_b) {
            return null;
        }
        var2.c(2);
        return var2;
    }

    final void a(int param0, ai param1) {
        if (null != param1.field_f) {
            param1.c(2);
        }
        if (param0 != 1) {
            ((bc) this).field_c = null;
        }
        param1.field_c = ((bc) this).field_b;
        param1.field_f = ((bc) this).field_b.field_f;
        param1.field_f.field_c = param1;
        param1.field_c.field_f = param1;
    }

    final ai a(int param0) {
        ai var2 = ((bc) this).field_c;
        if (var2 == ((bc) this).field_b) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_f;
        if (param0 != -18158) {
            ((bc) this).field_c = null;
        }
        return var2;
    }

    final void a(byte param0, ai param1) {
        if (!(null == param1.field_f)) {
            param1.c(param0 ^ 81);
        }
        param1.field_c = ((bc) this).field_b.field_c;
        if (param0 != 83) {
            return;
        }
        param1.field_f = ((bc) this).field_b;
        param1.field_f.field_c = param1;
        param1.field_c.field_f = param1;
    }

    final void b(int param0) {
        ai var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 81 % ((-6 - param0) / 51);
        while (true) {
            var3 = ((bc) this).field_b.field_c;
            if (var3 == ((bc) this).field_b) {
                break;
            }
            var3.c(2);
        }
        ((bc) this).field_c = null;
    }

    public bc() {
        ((bc) this).field_b = new ai();
        ((bc) this).field_b.field_f = ((bc) this).field_b;
        ((bc) this).field_b.field_c = ((bc) this).field_b;
    }

    final static String a(String param0, int param1) {
        int var5 = 0;
        int var6 = Bounce.field_N;
        int var3 = 4 / ((-61 - param1) / 32);
        int var2 = param0.length();
        char[] var4 = new char[var2];
        for (var5 = 0; var5 < var2; var5++) {
            var4[var2 - 1 + -var5] = param0.charAt(var5);
        }
        return new String(var4);
    }

    static {
    }
}
