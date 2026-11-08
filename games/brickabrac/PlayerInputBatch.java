/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerInputBatch extends IntrusiveNode {
    private int readIndex;
    static String field_p;
    boolean hasChecksum;
    static String field_j;
    int[] controlMasks;
    int positionWord;
    static RgbSprite halfBallSprite;
    int maskedChecksum;

    final boolean isConsumed(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return true;
        }
        return this.controlMasks.length == this.readIndex ? true : false;
    }

    final int nextControlMask(byte obfuscationGuard) {
        int consumedIndex = 0;
        if (obfuscationGuard == -104) {
          consumedIndex = this.readIndex;
          this.readIndex = this.readIndex + 1;
          return this.controlMasks[consumedIndex];
        }
        PlayerInputBatch.clearSharedReferences(true);
        int fallbackIndex = this.readIndex;
        this.readIndex = this.readIndex + 1;
        return this.controlMasks[fallbackIndex];
    }

    final static boolean isValidLegacyDate(byte obfuscationGuard, int day, int year, int monthIndex) {
        if (monthIndex < 0) {
          return false;
        }
        if (monthIndex > 11) {
          return false;
        }
        if (day < 1) {
          return false;
        }
        if (ReflectionCheck.getLegacyMonthLength(year, 29, monthIndex) < day) {
          return false;
        }
        if (obfuscationGuard == -49) {
          return true;
        }
        field_j = (String) null;
        return true;
    }

    final static String getAccountNameOrFallback(int obfuscationGuard) {
        String var1 = "";
        if (null != DirectByteStorage.field_k) {
          var1 = DirectByteStorage.field_k.getAccount((byte) -76);
        }
        if (obfuscationGuard < -98) {
          if (0 == var1.length()) {
            var1 = MultiValueSliderRenderer.getLocalPlayerNameOrEmpty(100);
          }
          if (var1.length() == 0) {
            var1 = LevelSelectScreen.field_t;
          }
          return var1;
        }
        halfBallSprite = (RgbSprite) null;
        if (0 == var1.length()) {
          var1 = MultiValueSliderRenderer.getLocalPlayerNameOrEmpty(100);
        }
        if (var1.length() == 0) {
          var1 = LevelSelectScreen.field_t;
        }
        return var1;
    }

    public static void clearSharedReferences(boolean obfuscationGuard) {
        field_j = null;
        halfBallSprite = null;
        field_p = null;
        if (obfuscationGuard) {
          PlayerInputBatch.clearSharedReferences(true);
        }
    }

    final static RgbSprite createBlurredSilhouetteSprite(int obfuscationGuard, RgbSprite sprite, int passes, int color) {
        int var5 = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        RgbSprite var7 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = new RgbSprite(sprite.width + passes * 2, sprite.height + passes * 2);
          var7.bindRasterTarget();
          for (var5 = 0; passes > var5; var5++) {
            sprite.drawSilhouette(passes - sprite.offsetX, -sprite.offsetY + passes, color);
            Rasterizer2D.blurRectangle(1, 1, 0, 0, var7.width, var7.height);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 104);
          var7.offsetY = -passes + sprite.offsetY;
          if (obfuscationGuard != -12) {
            field_j = (String) null;
          }
          var7.offsetX = sprite.offsetX - passes;
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("p.A(").append(obfuscationGuard).append(',');
          if (sprite == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(passes).append(',').append(color).append(')').toString());
        }
    }

    public PlayerInputBatch() {
        this.controlMasks = new int[5];
        this.readIndex = 0;
    }

    static {
        field_p = "Login: ";
        field_j = "Allow spectators?";
    }
}
