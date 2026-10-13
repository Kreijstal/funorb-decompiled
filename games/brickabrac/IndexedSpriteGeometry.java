/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteGeometry {
    int height;
    static PlatformTask field_e;
    static String field_c;
    int canvasHeight;
    int offsetX;
    int offsetY;
    int width;
    int canvasWidth;

    final static void pushSpriteRaster(int obfuscationGuard, RgbSprite sprite) {
        try {
          HighscorePackSelector.pushRaster(-99);
          Rasterizer2D.bind(sprite.pixels, sprite.canvasWidth, sprite.canvasHeight);
          if (obfuscationGuard > -46) {
            IndexedSprite[] var3 = (IndexedSprite[]) null;
            IndexedSpriteGeometry.a(79, (byte[]) null, 74, (IndexedSprite[]) null, -94, -115);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fc.K(" + obfuscationGuard + ',' + (sprite != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 31797) {
          field_c = (String) null;
        }
    }

    final static String a(int param0) {
        if (param0 <= 6) {
          return (String) null;
        }
        if (ik.field_g == MusicEnvelope.field_f) {
          return am.field_cc;
        }
        if (!ma.field_I.b(96)) {
          return ma.field_I.a(0);
        }
        if (MusicVoice.field_l == MusicEnvelope.field_f) {
          return ma.field_I.a(0);
        }
        return GameScreen.field_d;
    }

    final static PaletteFont a(int param0, byte[] param1, int param2, IndexedSprite[] param3, int param4, int param5) {
        int var16_int = 0;
        byte[] array$0 = null;
        int incrementValue$3 = 0;
        int var26 = 0;
        int incrementValue$2 = 0;
        PaletteFont stackIn_28_0 = null;
        PaletteFont stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        PaletteFont var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        var27 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3.length != 256) {
            throw new IllegalArgumentException();
          }
          var38 = new int[256];
          var31 = var38;
          var6 = var31;
          var39 = new int[256];
          var32 = var39;
          var7 = var32;
          var36 = new int[256];
          var29 = var36;
          var8 = var29;
          var37 = new int[256];
          var30 = var37;
          var9 = var30;
          var10 = new int[]{0, param2, param4};
          var40 = new byte[256][];
          var33 = var40;
          var11 = var33;
          var45 = Rasterizer2D.pixels;
          var13 = Rasterizer2D.width;
          var14 = Rasterizer2D.height;
          var44 = new int[4];
          Rasterizer2D.saveClip(var44);
          for (var16_int = 0; var16_int < 256; var16_int++) {
            var6[var16_int] = -param0 + param3[var16_int].offsetX;
            var7[var16_int] = -param0 + param3[var16_int].offsetY;
            var8[var16_int] = param3[var16_int].width + (param0 << 1);
            var9[var16_int] = (param0 << 1) + param3[var16_int].height;
            array$0 = new byte[var36[var16_int] * var37[var16_int]];
            var11[var16_int] = array$0;
            var17 = array$0;
            var18 = param3[var16_int].indices;
            var19 = param3[var16_int].width;
            var20 = param3[var16_int].height;
            var21 = var36[var16_int];
            var22 = -var19 + var21;
            Rasterizer2D.bind(new int[var36[var16_int] * var37[var16_int]], var36[var16_int], var37[var16_int]);
            var23 = 0;
            for (var24 = 0; var20 > var24; var24++) {
              for (var25 = 0; var19 > var25; var25++) {
                incrementValue$3 = var23;
                var23++;
                if (0 != var18[incrementValue$3]) {
                  Rasterizer2D.f(var25 + param0, param0 + var24, param0, 2);
                }
              }
            }
            for (var24Lifetime1 = 0; var24Lifetime1 < var17.length; var24Lifetime1++) {
              var17[var24Lifetime1] = (byte)Rasterizer2D.pixels[var24Lifetime1];
            }
            var23Lifetime1 = 0;
            var24Lifetime2 = (1 + var36[var16_int]) * param0;
            for (var25Lifetime1 = 0; var20 > var25Lifetime1; var25Lifetime1++) {
              for (var26 = 0; var19 > var26; var26++) {
                if (var18[var23Lifetime1++] == 0) {
                  var24Lifetime2++;
                } else {
                  incrementValue$2 = var24Lifetime2;
                  var24Lifetime2++;
                  var17[incrementValue$2] = (byte) 1;
                }
              }
              var24Lifetime2 = var24Lifetime2 + var22;
            }
          }
          var16 = new PaletteFont(param1, var38, var39, var36, var37, var10, var40);
          var16.capHeight = var16.capHeight - param0;
          var16.descent = var16.descent - param0;
          var16.ascent = var16.ascent - param0;
          if (param5 != 1) {
            stackIn_28_0 = (PaletteFont) null;
            return stackIn_28_0;
          }
          var16.xHeight = var16.xHeight - param0;
          Rasterizer2D.bind(var45, var13, var14);
          Rasterizer2D.restoreClip(var44);
          stackIn_30_0 = var16;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_33_0 = var6_ref;
          stackIn_33_1 = new StringBuilder().append("fc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    abstract void drawAlpha(int x, int y, int alpha);

    abstract void drawTransparent(int x, int y);

    static {
        field_c = "Username: ";
    }
}
