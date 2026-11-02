/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nea extends UiComponent {
    String field_xb;
    String field_Cb;
    String field_Ab;
    UiComponent field_Db;
    static IndexedSprite[] field_Bb;
    int field_wb;
    String field_vb;
    static UiComponent field_yb;
    UiComponent field_Eb;
    UiComponent field_zb;

    nea() {
        super(0L, (UiComponent) null);
    }

    public static void releaseStatics(int param0) {
        field_Bb = null;
        field_yb = null;
        if (param0 != 18178) {
          field_yb = (UiComponent) null;
        }
    }

    final static eq f(byte param0) {
        if (GameClock.field_a == FridgeScreen.field_p) {
          throw new IllegalStateException();
        }
        if (param0 != 94) {
          nea.releaseStatics(67);
          if (FridgeScreen.field_p == OhNoAnimation.field_w) {
            FridgeScreen.field_p = GameClock.field_a;
            return ZombiesSpecial.field_p;
          }
          return null;
        }
        if (FridgeScreen.field_p == OhNoAnimation.field_w) {
          FridgeScreen.field_p = GameClock.field_a;
          return ZombiesSpecial.field_p;
        }
        return null;
    }

    static {
    }
}
