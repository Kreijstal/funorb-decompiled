/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FontAndFrameStyleHelpers {
    static int field_b;
    static int field_a;
    static String field_c;
    static String[] field_d;

    final static void setPopupFrameStyle(int param0, int param1, Sprite[] param2, byte param3) {
        if (param3 != -88) {
          return;
        }
        try {
          IntKeyLookup.field_b = new NineSliceFrame(param2);
          NameAlphabetTable.field_d = param1;
          SoundEffectLibrary.field_d = param0;
          GameBoard.drawLegacyMenu(54);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "jj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 2) {
          field_d = (String[]) null;
        }
    }

    final static void configureFonts(int param0, BitmapFont param1, BitmapFont param2, int param3) {
        try {
          LoginProgressHelpers.field_f = param0;
          LoginMethod.field_d = param1;
          PendingStatQuery.field_o = param2;
          SecondaryNodeDeque.setPopupMenuAnchor(SoftwareRasterizer.field_e / param3, -33, SoftwareRasterizer.field_f / 2);
          LobbyPlayerEntry.setMenuOptionMetrics(param2.field_u + param2.field_K, false, param1.field_K + param1.field_u, param1.field_u, param2.field_u);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "jj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = 256;
        field_d = new String[16];
        field_c = "Your email address is used to identify this account";
    }
}
