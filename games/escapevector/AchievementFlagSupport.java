/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementFlagSupport {
    static ValidationState field_c;
    static String field_b;
    static String[] field_d;
    static Sprite[] field_a;

    final static boolean isHiddenAchievement(int achievementId, int start) {
        try {
          int[] var5 = ProxySocketConnector.hiddenAchievementIds;
          int[] var2 = var5;
          int var3 = start;
          while (true) {
            if (var5.length <= var3) {
              return false;
            }
            int var4 = var5[var3];
            if (achievementId != var4) {
              var3++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ug.C(" + achievementId + ',' + start + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        field_a = null;
        field_c = null;
        if (!guard) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    final static int[] blendPalette256(int guard, int startColor, int endColor) {
        int var12 = EscapeVector.obfuscationControl;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16744599 & endColor) >> 16;
        int var5 = (endColor & 65434) >> 8;
        int var6 = 255 & endColor;
        int var7 = (startColor & 16746391) >> 16;
        int var8 = startColor >> 8 & 255;
        int var9 = 255 & startColor;
        for (int var10 = 0; var10 < 256; var10++) {
          int var11 = 256 - var10;
          var13[var10] = (var6 * var10 >> 8) - (-(var9 * var11 >> 8) - ((var4 * var10 >> 8) + (var7 * var11 >> 8) << 16) - ((var5 * var10 >> 8) + (var11 * var8 >> 8) << 8));
        }
        if (guard != 1746055568) {
          AchievementFlagSupport.isHiddenAchievement(-56, -75);
        }
        return var3;
    }

    static {
        field_b = " - rotate ship left";
        field_d = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = new ValidationState();
        field_a = new Sprite[5];
    }
}
