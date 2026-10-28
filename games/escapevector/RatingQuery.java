/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RatingQuery extends IntrusiveNode {
    int rowCount;
    static String field_l;
    static IndexedSprite pointCloudRasterSprite;
    static int field_h;
    int requestId;
    static boolean field_j;

    public static void releaseStatics(int guard) {
        field_l = null;
        pointCloudRasterSprite = null;
        if (guard != 29152) {
          field_l = (String) null;
        }
    }

    final static void updatePauseMenu(int guard) {
        if (LoginHandshakeSupport.field_d == 0) {
          StringNode.playFrameAppearSound(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (guard != -46) {
          RatingQuery.updatePauseMenu(-10);
        }
        if (20 <= LoginHandshakeSupport.field_d) {
          IntValueNode.field_j = false;
        }
        if (LoginHandshakeSupport.field_d < 1000) {
          LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
        }
        SessionMenuSupport.field_c.update((byte) -75);
    }

    final static boolean isIntText(int radix, byte guard, boolean allowPlus, CharSequence text) {
        String stackIn_49_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (radix >= 2 &&
            radix <= 36) {
            boolean var4_int = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = text.length();
            for (int var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              int var9 = text.charAt(var8);
              if (var8 == 0 &&
                var9 == 45) {
                var4_int = true;
                decompiledFrameRemainder0 = false;
              }
              if (decompiledFrameRemainder0 && (var8 != 0 || (var9 != 43 ||
                !allowPlus))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= radix) {
                  return false;
                }
                if (var4_int) {
                  var9 = -var9;
                }
                int var10 = var6 * radix + var9;
                if (var10 / radix != var6) {
                  return false;
                }
                var5 = true;
                var6 = var10;
              }
            }
            if (guard > 20) {
              boolean stackIn_45_0 = var5;
              return (stackIn_45_0);
            }
            return false;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_48_0 = var4;
          StringBuilder stackIn_48_1 = new StringBuilder().append("rl.A(").append(radix).append(',').append(guard).append(',').append(allowPlus).append(',');
          if (text == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private RatingQuery() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "Out of fuel!";
        field_j = false;
    }
}
