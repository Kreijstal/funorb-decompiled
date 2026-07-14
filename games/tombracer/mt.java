/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mt {
    static int field_a;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param0 & 7) != param1) {
            var2 = 8 + -(7 & param0);
        }
        int var3 = param0 - -var2;
        return var3;
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 < 99) {
            return null;
        }
        return fs.field_p.a("", (byte) 116, param0);
    }

    abstract tu a(ff param0, int param1);

    static {
    }
}
