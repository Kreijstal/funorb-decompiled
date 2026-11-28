/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static int[] field_c;
    static int field_a;
    static RgbSprite[][] field_b;

    final static boolean b(int param0) {
        if (param0 != 50) {
          kl.b(-84);
          if (UiWidget.field_t == null) {
            return false;
          }
          if (MouseInput.field_d == rc.field_a) {
            return true;
          }
          return false;
        }
        if (UiWidget.field_t == null) {
          return false;
        }
        if (MouseInput.field_d == rc.field_a) {
          return true;
        }
        return false;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 < 90) {
          kl.clearStaticReferences(92);
          field_c = null;
          field_b = (RgbSprite[][]) null;
          return;
        }
        field_c = null;
        field_b = (RgbSprite[][]) null;
    }

    static {
        field_c = new int[50];
    }
}
