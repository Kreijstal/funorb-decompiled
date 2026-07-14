/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    private static String field_z;

    final static bi[] a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = 61 % ((param0 - 26) / 63);
        bi[] var6 = new bi[9];
        var6[6] = gr.a((byte) -79, param2, param3);
        var6[3] = gr.a((byte) -79, param2, param3);
        var6[2] = gr.a((byte) -79, param2, param3);
        var6[1] = gr.a((byte) -79, param2, param3);
        var6[0] = gr.a((byte) -79, param2, param3);
        var6[8] = gr.a((byte) -58, param4, param3);
        var6[7] = gr.a((byte) -58, param4, param3);
        var6[5] = gr.a((byte) -58, param4, param3);
        if (!(param1 == 0)) {
            var6[4] = gr.a((byte) -105, param1, 64);
        }
        return var6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ao.A(";
    }
}
