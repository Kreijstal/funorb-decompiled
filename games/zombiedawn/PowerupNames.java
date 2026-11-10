/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerupNames {
    static Sprite[] field_c;
    static String field_a;
    static int[] field_b;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 24) {
          PowerupNames.releaseStatics((byte) 47);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static String getPowerupName(int param0, int param1) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param1 <= 32) {
          return (String) null;
        }
        var2 = param0;
        if (0 == var2) {
          return NameCheckRequest.field_b;
        }
        if (var2 == 1) {
          return GooPuddle.field_l;
        }
        if (var2 == 2) {
          return Human.field_bb;
        }
        if (var2 == 3) {
          return DimensionOnlyResizer.field_a;
        }
        if (var2 == 4) {
          return ScrollViewport.field_K;
        }
        if (var2 == 5) {
          return PopupMenuBuilder.field_d;
        }
        if (var2 == 6) {
          return DraggableWidget.field_J;
        }
        if (var2 == 7) {
          return MidiNoteMask.field_h;
        }
        if (var2 == 9) {
          return AccountTermsPanel.field_J;
        }
        if (var2 == 10) {
          return LevelHud.field_h;
        }
        if (var2 == 13) {
          return QuickChatPhraseDefinition.field_s;
        }
        if (var2 == 12) {
          return SingleChildWidget.field_C;
        }
        if (var2 == 14) {
          return RoamingCountryHuman.field_Bb;
        }
        if (var2 != 15) {
          return null;
        }
        return GameResourceLoader.field_k;
    }

    static {
        field_a = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
    }
}
