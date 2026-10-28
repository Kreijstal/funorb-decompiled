/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SimulatorSpriteAssets {
    Sprite[] sprites;
    static String[] field_f;
    static Sprite field_c;
    static int field_h;
    static int field_a;
    static int[] field_j;
    static String field_e;
    static String field_i;
    Sprite texture;
    int field_b;

    public static void releaseStatics(int guard) {
        field_c = null;
        field_j = null;
        if (guard <= 39) {
          field_j = (int[]) null;
        }
        field_e = null;
        field_i = null;
        field_f = null;
    }

    final boolean load(int guard) {
        if (null == this.sprites) {
          Sprite[] var2 = EmailValidationError.a(false, MembershipPromotionSupport.field_c);
          Sprite[] var3 = EmailValidationError.a(false, HudMessage.field_k);
          if (var2 != null &&
            var3 != null) {
            this.sprites = this.prepareMaskedSprites((byte) -28, var2, var3);
          }
        }
        if (guard != 23389) {
          this.load(-100);
        }
        if (null == this.texture) {
          this.texture = EmailValidationError.field_b.loadSprite(-100);
        }
        if (null == this.sprites) {
          return false;
        }
        if (null == this.texture) {
          return false;
        }
        return true;
    }

    private final int pixelAt(int x, Sprite sprite, int y, byte guard) {
        String stackIn_10_2 = null;
        try {
          int var5_int = this.pixelIndex(y, x, sprite, 5214);
          if (var5_int < 0) {
            int stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (guard >= -88) {
            Sprite var6 = (Sprite) null;
            int discarded$1 = this.pixelIndex(43, 80, (Sprite) null, 108);
          }
          int stackIn_6_0 = sprite.pixels[var5_int];
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("p.D(").append(x).append(',');
          if (sprite == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(y).append(',').append(guard).append(')').toString());
        }
    }

    private final Sprite applyMask(Sprite sprite, Sprite mask, byte guard) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (guard != -48) {
            field_a = -34;
          }
          for (int var4_int = 0; sprite.fullHeight > var4_int; var4_int++) {
            for (int var5 = 0; sprite.fullWidth > var5; var5++) {
              int var6 = this.pixelAt(var5, mask, var4_int, (byte) -93);
              if (var6 == 0) {
                this.setPixel(var4_int, 0, (byte) -128, sprite, var5);
              }
            }
          }
          Sprite stackIn_12_0 = (Sprite) (sprite);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("p.I(");
          if (sprite == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (mask == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    private final Sprite[] normalizeMasks(int startIndex, Sprite[] sprites) {
        String stackIn_9_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = startIndex; var3_int < sprites.length; var3_int++) {
            Sprite var4 = this.normalizeMask(startIndex + 0, sprites[var3_int]);
            sprites[var3_int] = var4;
          }
          Sprite[] stackIn_5_0 = (Sprite[]) (sprites);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("p.H(").append(startIndex).append(',');
          if (sprites == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void setPixel(int y, int color, byte guard, Sprite sprite, int x) {
        int var7 = -100 % ((guard - 45) / 54);
        int var6_int = this.pixelIndex(y, x, sprite, 5214);
        if (0 > var6_int) {
          return;
        }
        try {
          sprite.pixels[var6_int] = color;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "p.C(" + y + ',' + color + ',' + guard + ',' + (sprite != null ? "{...}" : "null") + ',' + x + ')');
        }
    }

    final static Sprite loadNamedSprite(byte guard, String fileName, ResourceArchive archive, String groupName) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = archive.findGroupId(-1, groupName);
          int var5 = archive.findFileId(var4_int, fileName, true);
          if (guard != 8) {
            String var6 = (String) null;
            SimulatorSpriteAssets.loadNamedSprite((byte) -89, (String) null, (ResourceArchive) null, (String) null);
          }
          Sprite stackIn_3_0 = CachedArchiveProvider.a(archive, true, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("p.B(").append(guard).append(',');
          if (fileName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final Sprite[] prepareMaskedSprites(byte guard, Sprite[] sprites, Sprite[] masks) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          masks = this.normalizeMasks(0, masks);
          if (guard != -28) {
            this.texture = (Sprite) null;
          }
          Sprite[] stackIn_3_0 = this.applyMasks(0, sprites, masks);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("p.G(").append(guard).append(',');
          if (sprites == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (masks == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final Sprite[] applyMasks(int startIndex, Sprite[] sprites, Sprite[] masks) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          for (int var4_int = startIndex; sprites.length > var4_int; var4_int++) {
            Sprite var5 = this.applyMask(sprites[var4_int], masks[var4_int], (byte) -48);
            sprites[var4_int] = var5;
          }
          Sprite[] stackIn_5_0 = (Sprite[]) (sprites);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("p.E(").append(startIndex).append(',');
          if (sprites == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (masks == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final Sprite normalizeMask(int startIndex, Sprite sprite) {
        String stackIn_12_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int[] var7 = sprite.pixels;
          int[] var3 = var7;
          for (int var4 = startIndex; var7.length > var4; var4++) {
            int var5 = var7[var4];
            var5 = (var5 != 0) ? 1 : 0;
            var7[var4] = var5;
          }
          Sprite stackIn_8_0 = (Sprite) (sprite);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3_ref;
          StringBuilder stackIn_11_1 = new StringBuilder().append("p.K(").append(startIndex).append(',');
          if (sprite == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final int pixelIndex(int y, int x, Sprite sprite, int guard) {
        String stackIn_21_2 = null;
        try {
          if (x < sprite.offsetX) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (sprite.offsetY > y) {
            int stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          x = -sprite.offsetX + x;
          if (sprite.width <= x) {
            int stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          if (guard != 5214) {
            SimulatorSpriteAssets.releaseStatics(43);
          }
          y = y - sprite.offsetY;
          if (sprite.height <= y) {
            int stackIn_15_0 = -1;
            return stackIn_15_0;
          }
          int var5_int = y * sprite.width + x;
          int stackIn_17_0 = var5_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("p.F(").append(y).append(',').append(x).append(',');
          if (sprite == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(')').toString());
        }
    }

    SimulatorSpriteAssets() {
        this.field_b = 2917671;
    }

    static {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = 20;
        field_e = "to return to the normal view.";
        field_j = new int[]{15, 26};
    }
}
