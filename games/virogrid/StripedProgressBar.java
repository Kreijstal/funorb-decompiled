/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressBar extends UiWidget {
    static int field_x;
    private Sprite[] field_D;
    private int field_K;
    private int field_H;
    boolean field_z;
    private int field_y;
    private Sprite field_I;
    static SpriteWidget field_E;
    static String textRatedAchievements;
    private Sprite field_B;
    private int field_J;
    private int field_F;
    private Sprite field_A;
    int field_C;
    private int field_L;

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final static LoginCredentials createLoginCredentials(String param0, int param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        LoginCredentials stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16711935) {
            StripedProgressBar.releaseStatics((byte) 84);
          }
          var4_long = 0L;
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = PacketBuffer.encodeBase37(var7, (byte) -105);
          } else {
            var6 = param0;
          }
          stackIn_6_0 = CredentialHelpers.createCredentials(var4_long, (String) (var6), 127, param2, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dg.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private final Sprite createRoundedEndMask(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var2 = this.field_m >> 1;
        Sprite var3 = new Sprite(var2, this.field_m);
        ChatPanelSetupHelpers.setRenderTargetSprite(var3, 16865);
        if (param0 < 63) {
          return (Sprite) null;
        }
        for (var4 = 0; this.field_m > var4; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_m - var4) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            Rasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        ContextMenuHelpers.popRasterTarget(true);
        return var3;
    }

    private final void drawStripedBar(int param0, Sprite param1, int param2, boolean param3) {
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = param2 + this.field_g;
          GameApplet.pushClipRect(param0 + this.field_m, 6, param2 + this.field_A.field_w, -this.field_A.field_w + var5_int, param0);
          for (var6 = -this.field_L + param2; var6 < var5_int; var6 = var6 + param1.field_w) {
            param1.drawTransparent(var6, param0);
          }
          ContextMenuHelpers.popRasterTarget(!param3);
          if (param3) {
            return;
          }
          if (Rasterizer.field_i <= this.field_A.field_w + param2) {
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_I, 16865);
            param1.drawTransparent(-this.field_L, 0);
            param1.drawTransparent(2 * this.field_J - this.field_L, 0);
            this.field_B.drawMultiply(0, 0);
            ContextMenuHelpers.popRasterTarget(true);
            this.field_I.drawTransparent(param2, param0);
          }
          if (-this.field_A.field_w + var5_int <= Rasterizer.field_k) {
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_I, 16865);
            for (var7 = this.field_L + (-this.field_A.field_w + this.field_g); this.field_J * 2 < var7; var7 = var7 - this.field_J * 2) {
            }
            param1.drawTransparent(-var7, 0);
            param1.drawTransparent(-var7 + 2 * this.field_J, 0);
            this.field_A.drawMultiply(0, 0);
            ContextMenuHelpers.popRasterTarget(true);
            this.field_I.drawTransparent(-this.field_A.field_w + var5_int, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        Sprite discarded$0 = null;
        if (param3 != 0) {
          return;
        }
        int var5 = this.field_l + param1;
        int var6 = param2 + this.field_u;
        this.drawStripedBar(var6, this.field_D[0], var5, false);
        if (this.field_C < 65536) {
          GameApplet.pushClipRect(var6 + this.field_m, 6, (this.field_C * this.field_g >> 16) + var5, var5 + this.field_g, var6);
          this.drawStripedBar(var6, this.field_D[1], var5, false);
          ContextMenuHelpers.popRasterTarget(true);
        }
        if (param0 != 37) {
          discarded$0 = this.buildStripeSprite(-103, -91, 31);
        }
    }

    private final void rebuildSprites(int param0) {
        this.field_D = new Sprite[]{this.buildStripeSprite(this.field_F, this.field_H, -17), this.buildStripeSprite(this.field_K, this.field_y, param0 ^ -46)};
        this.field_A = this.createRoundedEndMask(127);
        this.field_B = this.field_A.copyFlippedHorizontal();
        this.field_I = new Sprite(this.field_m >> 1, this.field_m);
        if (param0 != 10) {
          textRatedAchievements = (String) null;
        }
    }

    final void setBounds(int param0, boolean param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildSprites(10);
    }

    public static void releaseStatics(byte param0) {
        textRatedAchievements = null;
        if (param0 <= 13) {
          return;
        }
        field_E = null;
    }

    private final Sprite buildStripeSprite(int param0, int param1, int param2) {
        Sprite discarded$0 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Virogrid.field_F ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param2 > -15) {
          discarded$0 = this.createRoundedEndMask(93);
        }
        Sprite var14 = new Sprite(this.field_J * 2, this.field_m);
        ChatPanelSetupHelpers.setRenderTargetSprite(var14, 16865);
        int var5 = this.field_m >> 1;
        for (var6 = 0; var6 < this.field_m; var6++) {
          var7 = (var6 >> 1) * (-1 + 2 * this.field_J) % (2 * this.field_J);
          var8 = 16711935 & param1;
          var9 = param1 & 65280;
          var10 = var6 - var5;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
          var12 = var11 >= 256 ? var8 | var9 : (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8;
          Rasterizer.drawHorizontalLine(var7, var6, this.field_J, var12);
          var8Lifetime1 = param0 & 16711935;
          Rasterizer.drawHorizontalLine(var7 - 2 * this.field_J, var6, this.field_J, var12);
          var9Lifetime1 = 65280 & param0;
          var12Lifetime1 = var11 < 256 ? (var9Lifetime1 * var11 & 16711680 | -16711936 & var8Lifetime1 * var11) >>> 8 : var9Lifetime1 | var8Lifetime1;
          Rasterizer.drawHorizontalLine(var7 + this.field_J, var6, this.field_J, var12Lifetime1);
          Rasterizer.drawHorizontalLine(var7 - this.field_J, var6, this.field_J, var12Lifetime1);
        }
        ContextMenuHelpers.popRasterTarget(true);
        return var14;
    }

    final void setColors(int param0, int param1, int param2) {
        this.field_H = param1;
        this.field_y = 8355711 & param1 >> 1;
        this.field_K = (16711422 & param0) >> 1;
        if (param2 < 101) {
          this.field_L = 41;
        }
        this.field_F = param0;
        this.rebuildSprites(10);
    }

    final static void selectLanguageStrings(byte param0, int param1) {
        NameEntryPopup.field_Lb = SoundCache.field_g[param1];
        if (param0 != -53) {
          field_x = -72;
        }
        QuickChatHelpHelpers.field_d = EmailValidator.field_r[param1];
        GzipDecompressor.field_b = RequestResendSupport.field_b[param1];
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_K = param8;
        this.field_J = param4;
        this.field_H = param5;
        this.field_y = param7;
        this.field_F = param6;
        this.setBounds(param3, true, param1, param0, param2);
    }

    final static void drawPulsingGlowFrame(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 320;
          var4 = 240;
          param0 = param0 / 2;
          param2 = param2 / 2;
          var5 = 2 + (int)((Math.cos((double)((float)UiTheme.field_r / 20.0f)) + 1.0) * 8.0);
          if (param1 > -123) {
            textRatedAchievements = (String) null;
          }
          for (var6 = 0; 9 > var6; var6++) {
            var7 = (-var6 + 9) * var5 >>> 3;
            Rasterizer.fillRoundedRectangleBlended(var3_int + (-param2 - var7), var4 - param0 - var7, param2 + var7 << 1, var7 + param0 << 1, 10, 1141646, 26);
          }
          Rasterizer.fillRoundedRectangleBlended(-param2 + var3_int, -param0 + var4, param2 << 1, param0 << 1, 10, 0, 180);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "dg.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 < 113) {
            return;
          }
          if (this.field_z) {
            this.field_L = this.field_L + 1;
            if (this.field_J * 2 >= this.field_L) {
              return;
            }
            this.field_L = this.field_L - this.field_J * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        textRatedAchievements = "Achievements can only be obtained by playing Rated games";
    }
}
