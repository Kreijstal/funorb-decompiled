/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrickHitTransitionTable {
    static int[] codesByBrickType;
    private static String field_z;

    public static void clearTransitionCodes(byte obfuscationGuard) {
        codesByBrickType = null;
        int var1 = 68 % ((obfuscationGuard - 24) / 58);
    }

    static {
        field_z = "rb.A(";
        codesByBrickType = new int[29];
        codesByBrickType[26] = 12;
        codesByBrickType[17] = 1;
        codesByBrickType[25] = 14;
        codesByBrickType[22] = 11;
        codesByBrickType[12] = 1;
        codesByBrickType[16] = 1;
        codesByBrickType[28] = 14;
        codesByBrickType[20] = 7;
        codesByBrickType[18] = 1;
        codesByBrickType[9] = 1;
        codesByBrickType[2] = 1;
        codesByBrickType[5] = 1;
        codesByBrickType[4] = 1;
        codesByBrickType[10] = 1;
        codesByBrickType[11] = 1;
        codesByBrickType[13] = 1;
        codesByBrickType[14] = 1;
        codesByBrickType[19] = 6;
        codesByBrickType[3] = 1;
        codesByBrickType[24] = 1;
        codesByBrickType[15] = 1;
        codesByBrickType[21] = 10;
        codesByBrickType[27] = 1;
        codesByBrickType[1] = 12;
        codesByBrickType[23] = 2;
        codesByBrickType[8] = 1;
        codesByBrickType[7] = 1;
        codesByBrickType[6] = 1;
    }
}
