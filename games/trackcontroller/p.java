/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static BitmapFont field_a;

    final static void a(byte param0) {
        if (param0 != 25) {
          field_a = (BitmapFont) null;
          if (null == AlphaWidgetContainer.field_E) {
            if (null == ib.field_e) {
              rf.a(true);
              return;
            }
            ib.field_e.freezeNormalProgressAnimation((byte) 50);
            rf.a(true);
            return;
          }
          AlphaWidgetContainer.field_E.snapAndPruneDialogs(-113);
          if (null != ib.field_e) {
            ib.field_e.freezeNormalProgressAnimation((byte) 50);
            rf.a(true);
            return;
          }
          rf.a(true);
          return;
        }
        if (null != AlphaWidgetContainer.field_E) {
          AlphaWidgetContainer.field_E.snapAndPruneDialogs(-113);
          if (null == ib.field_e) {
            rf.a(true);
            return;
          }
          ib.field_e.freezeNormalProgressAnimation((byte) 50);
          rf.a(true);
          return;
        }
        if (null == ib.field_e) {
          rf.a(true);
          return;
        }
        ib.field_e.freezeNormalProgressAnimation((byte) 50);
        rf.a(true);
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = 22 / ((param0 - 46) / 53);
        field_a = null;
    }

    static {
    }
}
