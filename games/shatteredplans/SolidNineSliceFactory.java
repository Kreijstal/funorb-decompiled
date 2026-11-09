/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SolidNineSliceFactory {
    private static String field_z;

    final static Sprite[] createSolidNineSlice(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = 61 % ((param0 - 26) / 63);
        Sprite[] var6 = new Sprite[9];
        Sprite dupTemp$0 = gr.createSolidSquare((byte) -79, param2, param3);
        var6[6] = dupTemp$0;
        var6[3] = dupTemp$0;
        var6[2] = dupTemp$0;
        var6[1] = dupTemp$0;
        var6[0] = dupTemp$0;
        Sprite dupTemp$1 = gr.createSolidSquare((byte) -58, param4, param3);
        var6[8] = dupTemp$1;
        var6[7] = dupTemp$1;
        var6[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = gr.createSolidSquare((byte) -105, param1, 64);
        }
        return var6;
    }

    static {
        field_z = "ao.A(";
    }
}
