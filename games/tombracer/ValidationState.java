/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static TextureFormat field_b;
    static float field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static vb playMenuSound(int param0, int param1) {
        if (param0 != 255) {
          return (vb) null;
        }
        return MatchProtocol.playSoundEffect(100, (byte) -76, 128, param1, 0, 255);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        int var1 = 47 % ((param0 - 51) / 40);
    }

    static {
        field_b = new TextureFormat(3);
    }
}
