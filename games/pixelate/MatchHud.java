/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchHud {
    private int[] field_j;
    String field_f;
    private int field_d;
    private int[] field_r;
    static String field_h;
    static String field_m;
    static String field_b;
    private Match field_g;
    private String field_e;
    static int field_a;
    private int field_k;
    static String field_l;
    private String[] field_s;
    private int field_c;
    private int field_n;
    private boolean field_o;
    private int[] field_q;
    private int field_p;
    static boolean field_i;

    final static void resetReflectionCheckQueue(boolean param0) {
        ScoreMarkerBar.field_o = new IntrusiveDeque();
        if (!param0) {
          ResourceArchive var2 = (ResourceArchive) null;
          MatchHud.loadCommonUiResources(-1, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
        }
    }

    final void draw(byte param0) {
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        PaletteBitmapFont var9;
        PaletteBitmapFont var10;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var8 = Pixelate.field_H ? 1 : 0;
        var3 = -96 / ((param0 + 64) / 35);
        var9 = PieceTiming.field_e;
        var10 = var9;
        if (this.field_n != 0) {
          if (this.field_n != 1 &&
            2 == this.field_n) {
            if (null != this.field_s) {
              stackIn_14_0 = (!DateOfBirthValidator.field_i) ? 0 : 110;
              var4 = stackIn_14_0;
              for (var5 = 0; 2 > var5; var5++) {
                var9.drawCentered(sb.formatScore(this.field_r[var5], 3), this.field_j[var5], -var4 + (this.field_q[var5] + 155), 0, -1);
              }
              var5Lifetime2 = 20;
              stackIn_20_0 = (this.field_o) ? 1 : 0;
              var6 = stackIn_20_0;
              var7 = 1 - var6;
              var10.drawText(this.field_s[var6], var5Lifetime2, 420 - var4, 0, -1);
              var10.drawRightAlignedText(this.field_s[var7], -var5Lifetime2 + 640, -var4 + 420, 0, -1);
            }
            if (0 < this.field_k) {
              stackIn_25_0 = (!DateOfBirthValidator.field_i) ? 0 : 50;
              var4Lifetime1 = stackIn_25_0;
              if (this.field_k > 256) {
                stackIn_28_0 = 256;
              } else {
                stackIn_28_0 = this.field_k;
              }
              var5Lifetime1 = stackIn_28_0;
              if (380 < this.field_k) {
                var5Lifetime1 = -(5 * this.field_k) + 2150;
              }
              var10.drawCenteredAlpha(this.field_e, 320, -var4Lifetime1 + 130, 0, -1, var5Lifetime1);
            }
            if (this.field_d > 0) {
              Match.field_l[3 - this.field_d].drawScaled(-(this.field_c >> 1) + 320, 40, this.field_c, 90);
            }
          }
        } else {
          if (0 < this.field_p) {
            SpriteEffectHelpers.drawLabelValueAlpha(var10, SoundCache.field_j, Integer.toString(this.field_g.field_r), Js5Transport.field_n, 30, 50, 0, -1, this.field_p);
            var9.drawLeftAlpha(sb.formatScore(this.field_r[0], 3), 30, 415, 0, -1, this.field_p);
            if (null != this.field_f) {
              SpriteEffectHelpers.drawLabelValueAlpha(var10, IntrusiveDeque.field_e, this.field_f, ArrayWidgetContainer.field_J, 30, 390, 0, -1, this.field_p);
            }
          }
        }
    }

    final void tick(int param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        if (param0 >= -78) {
          this.field_r = (int[]) null;
        }
        while (var2 < this.field_r.length) {
          if (this.field_r[var2] < -100 + this.field_g.scores[var2]) {
            this.field_r[var2] = this.field_r[var2] + 40;
          }
          if (this.field_g.scores[var2] - 1000 <= this.field_r[var2]) {
            if (this.field_r[var2] < this.field_g.scores[var2]) {
              this.field_r[var2] = this.field_r[var2] + 5;
            }
          } else {
            this.field_r[var2] = this.field_r[var2] + 320;
          }
          if (this.field_r[var2] > this.field_g.scores[var2]) {
            this.field_r[var2] = this.field_g.scores[var2];
          }
          var2++;
        }
        if (0 < this.field_k) {
          this.field_k = this.field_k - 5;
        }
        if (DateOfBirthValidator.field_j == 0 &&
          this.field_g.field_r > 0 && 256 > this.field_p) {
          this.field_p = this.field_p + 4;
        }
    }

    final static void setBrowserCookie(java.applet.Applet param0, int param1, String param2, String param3, long param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var9 = param0.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var8 = 46 % ((18 - param1) / 49);
              var10 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (param4 >= 0L) {
                var7Lifetime4 = var10 + "; Expires=" + SoundCache.formatCookieDate(10, param4 * 1000L + hm.monotonicMillis(64)) + "; Max-Age=" + param4;
              } else {
                var7Lifetime4 = var10 + "; Discard;";
              }
              JavaScriptBridge.evaluateScript(param0, (byte) -115, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("nn.H(");
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
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setPictureLabel(int param0) {
        this.field_k = param0;
        int var2 = 1 + this.field_g.puzzle.pictureIndex;
        if (!(var2 <= this.field_g.puzzle.pictures.length)) {
          var2--;
        }
        this.field_e = AlphaContainer.formatTemplate(field_b, 73, new String[]{Integer.toString(var2), Integer.toString(this.field_g.puzzle.pictures.length)});
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 != -1) {
          MatchHud.releaseStatics(-122);
        }
        field_h = null;
        field_m = null;
        field_b = null;
    }

    final static void loadCommonUiResources(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Pixelate.field_H ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          HowToPlayScreen.field_s = SocketConnector.loadRgbSpritesByName("frame_top", "commonui", (byte) 47, param2);
          PlayerBoard.field_v = SocketConnector.loadRgbSpritesByName("frame_bottom", "commonui", (byte) 47, param2);
          ge.field_g = bi.loadSprite("commonui", "jagex_logo_grey", param2, (byte) -74);
          fc.field_d = SocketConnector.loadRgbSpritesByName("button", "commonui", (byte) 47, param2);
          CanvasRasterBuffer.field_g = MusicCrossfadeStream.loadSpriteSheetByName(param2, 20049, "validation", "commonui");
          ep.field_b = (BitmapFont) ((Object) BoardView.loadCoverageFontByName(param2, "commonui", 0, "arezzo12", param3));
          he.field_d = (BitmapFont) ((Object) BoardView.loadCoverageFontByName(param2, "commonui", 0, "arezzo14", param3));
          FireworkBurst.field_d = (BitmapFont) ((Object) BoardView.loadCoverageFontByName(param2, "commonui", 0, "arezzo14bold", param3));
          var17 = new Sprite(param1.getNamedFile((byte) 24, "", "button.gif"), (java.awt.Component) ((Object) NameAvailabilityValidator.field_u));
          dq.loadIndexedSprite((byte) 31, "dropdown", "commonui", param2);
          var5 = NetworkGameClient.loadIndexedSpritesByName(param2, param0 ^ 4767934, "commonui", "screen_options");
          UiComponent.field_A = new IndexedSprite[4];
          UiComponent.field_o = new IndexedSprite[4];
          qg.field_a = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{qg.field_a, UiComponent.field_A, UiComponent.field_o};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].palette;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].indices[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = param0;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = MouseInputHandler.createRepalettedSprite(var5[var9], false, var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.field_E;
          MidiPcmStream.pushRasterState(false);
          var17.makeRasterTarget();
          SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.makeRasterTarget();
          var17.drawOpaque(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.makeRasterTarget();
          var17.drawOpaque(var9Lifetime1 - var17.field_F, 0);
          var12 = new Sprite(-(2 * var9Lifetime1) + var17.field_F, var9Lifetime1);
          var12.makeRasterTarget();
          var17.drawOpaque(-var9Lifetime1, 0);
          LinkButtonPainter.a((byte) 92);
          fc.field_d = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "nn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateCountdown(byte param0, int param1) {
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0) {
          this.field_d = 0;
        } else {
          this.field_d = 1 + param1 / 50;
          var3 = param1 % 50;
          if (48 == var3) {
            mc.playSoundEffect(4, param0 - 40);
          }
          if (var3 > 25) {
            var3 = 50 - var3;
          }
          if (var3 < 5) {
            this.field_c = var3 * 30;
          } else {
            this.field_c = 150;
          }
        }
        if (param0 != -87) {
          this.field_k = -50;
        }
    }

    MatchHud(Match param0, int[] param1, int[] param2, boolean param3) {
        int var5_int = 0;
        this.field_d = 0;
        this.field_k = 0;
        this.field_c = 0;
        try {
          this.field_g = param0;
          this.field_j = param1;
          this.field_q = param2;
          this.field_n = DateOfBirthValidator.field_j;
          this.field_o = param3 ? true : false;
          this.field_r = new int[this.field_g.scores.length];
          this.field_p = 0;
          this.field_k = 0;
          this.field_f = null;
          if (this.field_n == 2) {
            this.field_s = new String[this.field_g.playerNames.length];
            for (var5_int = 0; var5_int < this.field_s.length; var5_int++) {
              this.field_s[var5_int] = this.field_g.playerNames[var5_int];
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "nn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_h = "Quick Chat lobby";
        field_m = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_b = "<%0> / <%1>";
        field_l = "Rankings";
    }
}
