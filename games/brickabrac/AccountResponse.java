/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountResponse {
    static String field_h;
    String message;
    static int field_b;
    boolean success;
    String[] suggestedUsernames;
    boolean underThirteen;
    static int collisionX256;
    int responseCode;

    final static String getPendingLinkPath(byte param0) {
        if (param0 != -49) {
          collisionX256 = 94;
          return PasswordValidator.field_m;
        }
        return PasswordValidator.field_m;
    }

    final static boolean isOpaquePixelAt(int x, int y, byte obfuscationGuard, int originY, int originX, RgbSprite sprite) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          x = x - (sprite.offsetX + originX);
          if (x < 0) {
            return false;
          }
          if (sprite.width <= x) {
            return false;
          }
          y = y - (originY + sprite.offsetY);
          if (y >= 0 &&
            y < sprite.height) {
            if (obfuscationGuard != -24) {
              collisionX256 = 13;
            }
            originX = sprite.pixels[x + sprite.width * y];
            stackIn_16_0 = (originX != 0) && ((-16777216 & originX) != 0);
            return stackIn_16_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("oh.A(").append(x).append(',').append(y).append(',').append(obfuscationGuard).append(',').append(originY).append(',').append(originX).append(',');
          if (sprite == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static String replaceAllOccurrences(byte obfuscationGuard, String replacement, String text, String target) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var4 = text.indexOf(target);
        while (var4 != -1) {
          text = text.substring(0, var4) + replacement + text.substring(var4 + target.length());
          var4 = text.indexOf(target, replacement.length() + var4);
        }
        if (obfuscationGuard == 13) {
          return text;
        }
        field_b = -3;
        return text;
    }

    public static void clearSharedReferences(byte obfuscationGuard) {
        field_h = null;
        if (obfuscationGuard < 57) {
          AccountResponse.clearSharedReferences((byte) 49);
        }
    }

    AccountResponse(boolean success) {
        this.success = success ? true : false;
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 1;
    }
}
