/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb extends gb {
    static String field_A;
    static int field_z;
    static wf[] field_y;
    int field_t;
    static ni field_u;
    static long field_B;
    static int[] field_w;
    static hl field_x;
    static String field_v;
    static int field_C;

    mb(int param0) {
        ((mb) this).field_t = param0;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    abstract Object g(int param0);

    abstract boolean f(int param0);

    final static float a(float param0, float param1, boolean param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        float var3 = 0.0f;
        for (var4 = 0; var4 < 8; var4++) {
            var3 = (float)((double)var3 + (double)vj.a(param1, true) * Math.sin((double)((float)(1 << var4) * param0 + vj.a(vj.a(param1, true) + param1, true))));
        }
        if (param2) {
            field_u = null;
        }
        return var3;
    }

    public static void b(byte param0) {
        field_v = null;
        field_A = null;
        field_x = null;
        field_u = null;
        if (param0 != -48) {
            float discarded$0 = mb.a(0.8539373278617859f, -0.7423967719078064f, true);
        }
        field_w = null;
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Show all private chat";
        field_w = new int[8192];
        field_B = 20000000L;
        field_v = "Retry";
    }
}
