/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static PlatformTaskDispatcher field_a;
    static int field_f;
    static int field_b;
    static byte[][] field_c;
    static Sprite[] field_d;
    static String field_e;

    public static void clearStaticReferences(byte param0) {
        if (param0 != 92) {
          return;
        }
        field_d = null;
        field_c = (byte[][]) null;
        field_a = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static rj a(int param0, byte param1) {
        rj var2 = new rj();
        sd.field_d.addLast(124, var2);
        if (param1 == 113) {
          u.a(param0, 1);
          return var2;
        }
        field_a = (PlatformTaskDispatcher) null;
        u.a(param0, 1);
        return var2;
    }

    static {
        field_e = "to keep fullscreen or";
    }
}
