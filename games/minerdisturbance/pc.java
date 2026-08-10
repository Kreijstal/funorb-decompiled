/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pc extends hn {
    static String[][] field_e;
    static String field_i;
    private long field_j;
    static ea[] field_f;
    static int[] field_g;
    static int field_k;
    private String field_h;

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        field_e = (String[][]) null;
        if (param0 != 12) {
            pc.b(false, (byte) 60);
        }
    }

    ec b(int param0) {
        if (param0 != 0) {
            field_e = (String[][]) null;
            return kl.field_a;
        }
        return kl.field_a;
    }

    final static void b(boolean param0, byte param1) {
        g.a(true, 98, param0);
        if (param1 <= 102) {
            pc.b(true, (byte) 28);
        }
    }

    final void a(sb param0, byte param1) {
        try {
            param0.b(-1, this.field_j);
            param0.a((byte) 97, this.field_h);
            if (param1 > -85) {
                field_k = -121;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "pc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pc(long param0, String param1) {
        try {
            this.field_j = param0;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "pc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Reload game";
        field_e = new String[][]{null, new String[]{"Snow melts: Explosions melt the ice and turn it into water. Don't flood yourself!"}};
        field_g = new int[12];
    }
}
