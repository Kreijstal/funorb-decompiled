/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends pp {
    private int field_k;
    static ee[] field_j;
    static sna field_i;

    public static void d(byte param0) {
        if (param0 != 80) {
            field_i = null;
            field_j = null;
            field_i = null;
            return;
        }
        field_j = null;
        field_i = null;
    }

    final void a(lu param0, byte param1) {
        int var3 = 37 % ((34 - param1) / 58);
        this.a(param0, (byte) -49);
        er.a(((ela) this).field_h, 108, param0);
        param0.d(((ela) this).field_k, 0);
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = ((ela) this).field_h.a(param2 ^ 18, param1);
        if (!(var4 != null)) {
            return;
        }
        var4.c(((ela) this).field_k, (byte) -79);
        if (param2 != 12) {
            ela.d((byte) 105);
        }
    }

    ela(nq param0, int param1) {
        ((ela) this).field_h = param0;
        ((ela) this).field_k = param1;
    }

    static {
    }
}
