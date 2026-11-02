/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThemeSpriteLoadingSupport {
    static int[] field_a;

    final static void loadThemeSprites(ResourceArchive archive, int obfuscationGuard) {
        RgbSprite[][] array$0 = null;
        int var4 = 0;
        RgbSprite[] array$1 = null;
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String[] var5 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var3Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          DecodedSpriteSupport.field_a = new RgbSprite[ConsoleTokenCursor.field_c.length][][];
          var9 = "basic";
          var2 = var9;
          var3 = 0;
          if (obfuscationGuard != 18) {
            return;
          }
          while (ConsoleTokenCursor.field_c.length > var3) {
            if (ConsoleTokenCursor.field_c[var3] != null) {
              array$0 = new RgbSprite[ConsoleTokenCursor.field_c[var3].length][];
              DecodedSpriteSupport.field_a[var3] = array$0;
              for (var4 = 0; ConsoleTokenCursor.field_c[var3].length > var4; var4++) {
                var5 = ConsoleTokenCursor.field_c[var3][var4];
                if (var5 != null) {
                  array$1 = new RgbSprite[var5.length];
                  DecodedSpriteSupport.field_a[var3][var4] = array$1;
                  for (var6 = 0; var5.length > var6; var6++) {
                    var7 = var5[var6];
                    if (var7 != null) {
                      DecodedSpriteSupport.field_a[var3][var4][var6] = GameplayController.a(var7, (byte) 51, var9, archive);
                    }
                  }
                  if (var3 == 14 &&
                    var4 == 0) {
                    SummonRequest.a((byte) 29, var3, var4);
                  }
                }
              }
            }
            var3++;
          }
          AlphaDecodedSpriteSupport.field_p = new RgbSprite[4];
          var10 = 0;
          var3Lifetime1 = var10;
          while (AlphaDecodedSpriteSupport.field_p.length > var10) {
            AlphaDecodedSpriteSupport.field_p[var10] = new RgbSprite(100, 110);
            AlphaDecodedSpriteSupport.field_p[var10].bindAsRasterTarget();
            SoftwareRaster.clearPixels();
            LinkButtonPainter.field_f.selectTheme(var10, 0);
            PointerCaptureSupport.a(10, 50, QuickChatCategory.field_G[0], 27066, false, var10, true, QuickChatCategory.field_G[3]);
            PointerCaptureSupport.a(10, 50, QuickChatCategory.field_G[0], 27066, false, var10, false, QuickChatCategory.field_G[3]);
            ToggleWidget.a(true, false, 10, 50, var10, 1, 1);
            ToggleWidget.a(false, false, 10, 50, var10, 1, 1);
            var10++;
          }
          LinkButtonPainter.field_f.selectTheme(0, obfuscationGuard - 18);
          FixedSquareRootSupport.field_b.bindRasterTarget(5605);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_29_0 = var2_ref;
          stackIn_29_1 = new StringBuilder().append("vr.A(");
          if (archive == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void releaseStatics(byte obfuscationGuard) {
        if (obfuscationGuard != -37) {
          field_a = (int[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean accountNamesMatch(int obfuscationGuard, String firstName, String secondName) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11987) {
            field_a = (int[]) null;
          }
          var5 = (CharSequence) ((Object) firstName);
          var3 = AccountNameNormalizer.normalize(var5, false);
          var6 = (CharSequence) ((Object) secondName);
          var4 = AccountNameNormalizer.normalize(var6, false);
          if (var3 == null &&
            var4 == null) {
            return true;
          }
          if (var3 == null) {
            return false;
          }
          if (var4 == null) {
            return false;
          }
          stackIn_12_0 = var3.equals(var4);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("vr.B(").append(obfuscationGuard).append(',');
          if (firstName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (secondName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_a = new int[]{0, 4, 9, 13, 22, 18, 8, 17};
    }
}
