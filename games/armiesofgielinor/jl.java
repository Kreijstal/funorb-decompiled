/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String[][] field_c;
    static SoundCache field_d;
    static ClientUiComponent field_b;
    static long field_a;

    public static void releaseStatics(int obfuscationGuard) {
        field_d = null;
        field_b = null;
        if (obfuscationGuard > -124) {
          jl.releaseStatics(27);
          field_c = (String[][]) null;
          return;
        }
        field_c = (String[][]) null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
