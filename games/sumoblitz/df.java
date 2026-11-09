/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    boolean field_b;
    String field_c;
    String field_a;
    static SpriteData field_d;

    final static int a(byte param0) {
        if (param0 <= 97) {
          df.a((byte) 125);
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
