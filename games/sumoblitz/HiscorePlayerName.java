/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HiscorePlayerName {
    boolean included;
    String primaryName;
    String secondaryName;
    static SpriteData field_d;

    final static int a(byte param0) {
        if (param0 <= 97) {
          HiscorePlayerName.a((byte) 125);
          return LegacyOpenGlFlowingWaterEffect.field_e;
        }
        return LegacyOpenGlFlowingWaterEffect.field_e;
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        if (param0) {
          field_d = (SpriteData) null;
        }
    }

    static {
    }
}
