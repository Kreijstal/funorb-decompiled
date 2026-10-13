/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleViewportResizeHandler extends RasterViewportResizeHandler {
    static String field_f;
    static StandardContentDialog loginDialog;
    static RgbSprite[] field_h;
    static RgbSprite[] field_i;

    final static String decodeBase37DisplayName(int obfuscationGuard, long encodedName) {
        int digitCount = 0;
        long remainingDigits = 0L;
        StringBuilder reversedName = null;
        long previousValue = 0L;
        int characterCode = 0;
        int nextCharacterIndex = 0;
        StringBuilder appendedName = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (encodedName <= 0L) {
          return null;
        }
        if (encodedName >= 6582952005840035281L) {
          return null;
        }
        if (encodedName % 37L != 0L) {
          digitCount = 0;
          remainingDigits = encodedName;
          while (remainingDigits != 0L) {
            remainingDigits = remainingDigits / 37L;
            digitCount++;
          }
          reversedName = new StringBuilder(digitCount);
          while (encodedName != 0L) {
            previousValue = encodedName;
            encodedName = encodedName / 37L;
            characterCode = hq.base37Alphabet[(int)(previousValue - 37L * encodedName)];
            if (characterCode == 95) {
              nextCharacterIndex = reversedName.length() - 1;
              reversedName.setCharAt(nextCharacterIndex, Character.toUpperCase(reversedName.charAt(nextCharacterIndex)));
              characterCode = 160;
            }
            appendedName = reversedName.append((char) characterCode);
          }
          reversedName.reverse();
          reversedName.setCharAt(0, Character.toUpperCase(reversedName.charAt(obfuscationGuard)));
          return reversedName.toString();
        }
        return null;
    }

    public BattleViewportResizeHandler() {
    }

    public final void viewportResized(int height, int obfuscationGuard, int width) {
        super.viewportResized(height, obfuscationGuard, width);
        if (AiInfluenceMap.field_d != null) {
          AiInfluenceMap.field_d.refreshViewportGrid(-128);
        }
    }

    public static void b(int param0) {
        field_f = null;
        loginDialog = null;
        field_i = null;
        if (param0 >= -8) {
          field_h = (RgbSprite[]) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    static {
        field_f = "<br><br><col=FF0000>This trinket is worth <%0> runes. You have <%1> runes left to use this game.</col>";
    }
}
