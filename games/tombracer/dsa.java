/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dsa {
    static String field_d;
    static int field_b;
    static PlatformTaskDispatcher field_c;
    static String[] componentTypeNames;

    final static vb createRandomClickSound(int param0) {
        int var1 = uca.cosmeticRandom.nextBounded(6, 0);
        if (param0 > -11) {
          field_b = 76;
          return ValidationState.playMenuSound(255, var1);
        }
        return ValidationState.playMenuSound(255, var1);
    }

    public static void releaseStatics(byte param0) {
        int var1 = 40 / ((-56 - param0) / 38);
        field_c = null;
        componentTypeNames = null;
        field_d = null;
    }

    static {
        field_b = 1048576;
        field_d = "Creating your account";
    }
}
