/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static al field_b;
    static String field_d;
    static ng field_e;
    static String achievedText;
    static int[] difficultyStepFlags;
    static int field_c;

    public static void a(byte param0) {
        int var1 = -73 % ((26 - param0) / 53);
        field_e = null;
        achievedText = null;
        field_d = null;
        difficultyStepFlags = null;
        field_b = null;
    }

    final static void b(byte param0) {
        if (param0 <= 79) {
            return;
        }
        if (10 == hj.field_a) {
            la.f((byte) 24);
            hj.field_a = 11;
            lb.field_a = true;
            return;
        }
        if (!ck.b(0)) {
            la.f((byte) 24);
            hj.field_a = 11;
            lb.field_a = true;
            return;
        }
        lb.field_a = true;
    }

    static {
        field_d = "It's the<br>bubble bonus!";
        achievedText = "Achieved";
        difficultyStepFlags = new int[23];
        difficultyStepFlags[14] = lb.orInt(difficultyStepFlags[14], 128);
        difficultyStepFlags[12] = lb.orInt(difficultyStepFlags[12], 17);
        difficultyStepFlags[0] = 0;
        difficultyStepFlags[2] = lb.orInt(difficultyStepFlags[2], 12);
        difficultyStepFlags[15] = lb.orInt(difficultyStepFlags[15], 3);
        difficultyStepFlags[5] = lb.orInt(difficultyStepFlags[5], 140);
        difficultyStepFlags[1] = lb.orInt(difficultyStepFlags[1], 4);
        difficultyStepFlags[6] = lb.orInt(difficultyStepFlags[6], 1);
        difficultyStepFlags[11] = lb.orInt(difficultyStepFlags[11], 132);
        difficultyStepFlags[4] = lb.orInt(difficultyStepFlags[4], 0);
        difficultyStepFlags[16] = lb.orInt(difficultyStepFlags[16], 0);
        difficultyStepFlags[13] = lb.orInt(difficultyStepFlags[13], 16);
        difficultyStepFlags[21] = lb.orInt(difficultyStepFlags[21], 16);
        difficultyStepFlags[3] = lb.orInt(difficultyStepFlags[3], 133);
        difficultyStepFlags[7] = lb.orInt(difficultyStepFlags[7], 4);
        difficultyStepFlags[22] = lb.orInt(difficultyStepFlags[22], 0);
        difficultyStepFlags[17] = lb.orInt(difficultyStepFlags[17], 128);
        difficultyStepFlags[8] = lb.orInt(difficultyStepFlags[8], 136);
        difficultyStepFlags[20] = lb.orInt(difficultyStepFlags[20], 132);
        difficultyStepFlags[9] = lb.orInt(difficultyStepFlags[9], 2);
        difficultyStepFlags[18] = lb.orInt(difficultyStepFlags[18], 2);
        difficultyStepFlags[19] = lb.orInt(difficultyStepFlags[19], 16);
        difficultyStepFlags[10] = lb.orInt(difficultyStepFlags[10], 4);
        field_c = 0;
    }
}
