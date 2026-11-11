/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    static MatchScreen field_c;
    static String field_b;
    static UiComponent field_a;

    final static String a(byte param0) {
        int var1 = 126 % ((param0 + 60) / 52);
        if (LegacyOpenGlTexture.field_a == PlayerResultRow.field_y) {
          return ObjectList.field_i;
        }
        if (wt.field_d == PlayerResultRow.field_y) {
          return uaa.field_a;
        }
        if (DefaultRoomObjectRenderer.field_b.isComplete(124)) {
          return ScrollControlWidget.field_E;
        }
        return uaa.field_a;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 3840) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        cs.a((byte) 80);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = "No Reward (DNF)";
    }
}
