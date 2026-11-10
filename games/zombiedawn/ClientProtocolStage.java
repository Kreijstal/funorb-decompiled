/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientProtocolStage {
    static Sprite field_d;
    static String field_a;
    static IndexedSprite[] field_c;
    static int field_b;

    final boolean isPostRequestStage(int param0) {
        if (param0 >= -37) {
          return true;
        }
        if (UiContainer.field_z == this) {
          return true;
        }
        if (this == OfflineLoginHelpers.field_b) {
          return true;
        }
        if (PendingFlagRequest.field_j != this) {
          return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        if (param0 == 25752) {
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
        ClientProtocolStage.releaseStatics(-8);
        field_c = null;
        field_a = null;
        field_d = null;
    }

    static {
    }
}
