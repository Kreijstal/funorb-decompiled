/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static String reassignText;
    static ToolkitSprite field_b;
    static String unpackingSoundEffectsText;
    static boolean field_c;
    static ToolkitSprite[] field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        if (param0 == -20011) {
          return ((pd.field_m == this ? 1 : 0) | (mo.field_w == this ? 1 : 0)) != 0;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        reassignText = null;
        field_b = null;
        unpackingSoundEffectsText = null;
        if (param0 != -7520) {
          hv.releaseStatics(-61);
        }
    }

    static {
        unpackingSoundEffectsText = "Unpacking sound effects";
        reassignText = "reassign";
        field_c = false;
    }
}
