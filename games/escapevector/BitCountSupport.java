/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitCountSupport {
    static Sprite field_a;
    static boolean field_d;
    static String field_c;
    static int field_b;
    static Sprite field_e;
    static String[] field_g;
    static IndexedSprite[] field_f;

    final static void submitDisplayName(byte guard, String displayName) {
        try {
          MatchingTextValidator.setPendingDisplayName(-10002, displayName);
          UiTheme.showAccountRequest((byte) 125, ThemeAssetSupport.field_a, false);
          if (guard > -113) {
            String var3 = (String) null;
            BitCountSupport.submitDisplayName((byte) -29, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ej.B(" + guard + ',' + (displayName != null ? "{...}" : "null") + ')');
        }
    }

    final static int countSetBits(int pairMask, int value) {
        value = ((value & -1431655765) >>> 1) + (value & 1431655765);
        value = (value & pairMask) + ((-858993460 & value) >>> 2);
        value = (value >>> 4) + value & 252645135;
        value = value + (value >>> 8);
        value = value + (value >>> 16);
        return value & 255;
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_g = null;
        if (guard >= 13) {
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_c = null;
    }

    static {
        field_c = "To Customer Support";
        field_g = new String[]{"", "", "", ""};
    }
}
