/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryKeyHelpers {
    static String field_b;
    static int field_c;
    static int field_a;

    final static void setPendingTooltipAnchor(int param0, int param1, byte param2) {
        IconLabelItem.field_Nb = param1;
        if (param2 > -5) {
          return;
        }
        HotspotTextWidget.field_S = param0;
    }

    final static boolean dispatchNameEntryPopupKey(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          if (BevelFrameSpriteFactory.field_b == null) {
            return false;
          }
          if (BevelFrameSpriteFactory.field_b.handleNormalizedNameKey(param0 ^ 0)) {
            return true;
          }
          return false;
        }
        if (BevelFrameSpriteFactory.field_b == null) {
          return false;
        }
        if (BevelFrameSpriteFactory.field_b.handleNormalizedNameKey(param0 ^ 0)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != 41) {
          NameEntryKeyHelpers.dispatchNameEntryPopupKey(-42);
        }
    }

    static {
        field_c = 0;
        field_b = "Players are <%0> and <%1>.";
    }
}
