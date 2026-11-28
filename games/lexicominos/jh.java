/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static int field_c;
    static RgbSprite[] field_b;
    static BinaryBitmapFont field_d;
    static PlatformTaskDispatcher field_a;
    static int field_e;

    public static void clearStaticReferences(boolean param0) {
        field_d = null;
        if (param0) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        ui.field_w = e.field_p[param1];
        if (param0 != 14221) {
          return;
        }
        oh.field_a = NameSuggestionsPanel.field_F[param1];
        we.field_c = bc.field_E[param1];
    }

    static {
    }
}
