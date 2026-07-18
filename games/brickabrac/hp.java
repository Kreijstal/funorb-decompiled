/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends nm {
    int field_j;
    static String field_k;
    static mf field_i;
    private int[] field_o;
    static jp[] field_l;
    private int field_n;
    static int field_m;

    final int b(int param0, int param1) {
        if (!(param0 <= ((hp) this).field_j)) {
            throw new RuntimeException("State in future " + ((hp) this).field_j + " " + param0);
        }
        if (!(param0 >= -((hp) this).field_n + ((hp) this).field_j + param1)) {
            throw new RuntimeException("State erased " + param0 + ". Lastest entry: " + ((hp) this).field_j);
        }
        return ((hp) this).field_o[param0 % ((hp) this).field_n];
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = ((hp) this).field_j + 1;
        ((hp) this).field_j = ((hp) this).field_j + 1;
        ((hp) this).field_o[fieldTemp$0 % ((hp) this).field_n] = param1;
        if (param0 != -7255) {
            ((hp) this).a(-25, 104);
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        field_k = null;
    }

    hp(int param0) {
        ((hp) this).field_j = -1;
        ((hp) this).field_n = param0;
        ((hp) this).field_o = new int[((hp) this).field_n];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Waiting for extra data";
        field_m = field_m | 4;
        field_m = field_m | 8;
        field_m = field_m | 16;
        field_m = field_m | 32;
        field_m = field_m | 64;
        field_m = field_m | 128;
        field_m = field_m | 256;
        field_m = field_m | 512;
        field_m = field_m | 1024;
        field_m = field_m | 2048;
        field_m = field_m | 4096;
        field_m = field_m | 8192;
        field_m = field_m | 16384;
        field_m = field_m | 32768;
        field_m = field_m | 65536;
        field_m = field_m | 131072;
        field_m = field_m | 262144;
        field_m = field_m | 524288;
        field_m = field_m | 1048576;
        field_m = field_m | 2097152;
        field_m = field_m | 4194304;
        field_m = field_m | 8388608;
        field_m = field_m | 16777216;
        field_m = field_m | 67108864;
        field_m = field_m | 134217728;
    }
}
