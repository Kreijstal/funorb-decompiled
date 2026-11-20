/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateNumericLoginCredentials extends NumericLoginCredentials {
    static int[] field_h;

    final static void alignSpriteToFourPixels(Sprite param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if ((3 & (param0.yOffset | (param0.xOffset | (param0.width | param0.height)))) == 0) {
            return;
          }
          var2_int = (param0.xOffset & 3) + param0.width;
          var3 = (param0.yOffset & 3) + param0.height;
          var2_int = var2_int + 4 - (3 & var2_int);
          var3 = -(3 & var3) + 4 + var3;
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (3 & param0.xOffset) + (param0.yOffset & 3) * var2_int;
          if (param1 < 111) {
            field_h = (int[]) null;
          }
          for (var7 = 0; param0.height > var7; var7++) {
            for (var8 = 0; var8 < param0.width; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.pixels[incrementValue$1];
            }
            var6 = var6 + (var2_int - param0.width);
          }
          param0.pixels = var4;
          param0.yOffset = param0.yOffset & -4;
          param0.xOffset = param0.xOffset & -4;
          param0.width = var2_int;
          param0.height = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("un.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          Sprite var2 = (Sprite) null;
          AlternateNumericLoginCredentials.alignSpriteToFourPixels((Sprite) null, 3);
        }
        field_h = null;
    }

    final LoginCredentialType getType(byte param0) {
        int var2 = -52 % ((param0 + 7) / 56);
        return SetThrusterBindingBalanceThreshold.alternateNumericCredentialType;
    }

    AlternateNumericLoginCredentials(long param0, String param1) {
        super(param0, param1);
    }

    static {
    }
}
