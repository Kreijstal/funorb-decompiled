/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioPumpThread implements Runnable {
    static TypeCode field_i;
    static String field_g;
    static int field_a;
    volatile boolean field_f;
    volatile boolean field_d;
    volatile AudioOutput[] field_h;
    PlatformTaskDispatcher field_b;
    static LoginRsaKey field_e;
    static int field_j;
    static String textPlayers;
    static String field_c;

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != -94) {
          AudioPumpThread.drawMenuScreen(85, 97, false, 87, -111);
        }
        field_g = null;
        textPlayers = null;
        field_e = null;
        field_i = null;
    }

    final static void pushRasterState(int param0) {
        RasterSnapshot var1 = (RasterSnapshot) (PatchNoteUsage.field_m.removeLast(-109));
        if (var1 == null) {
          var1 = new RasterSnapshot();
        }
        var1.capture(Rasterizer.field_d, Rasterizer.field_i, Rasterizer.field_h, (byte) -45, Rasterizer.field_e, Rasterizer.field_f, Rasterizer.field_g, Rasterizer.field_k);
        if (param0 != 0) {
          return;
        }
        BitCountAndDialogHelpers.field_a.addFirst(var1, (byte) -37);
    }

    final static void drawMenuScreen(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        GameSession stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        GameSession stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        GameSession stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        GameSession stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        MenuScreen stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -1) {
            if (param0 == -2) {
              throw new RuntimeException();
            }
            RenderTargetHelpers.setRenderTargetSprite(DisplayNameHelpers.field_d, param4 + 256);
            stackIn_25_0 = DateOfBirthValidator.field_j[param0];
            stackIn_25_1 = param3;
            if (!WidgetNode.field_p.field_d) {
              stackIn_26_2 = 2;
            } else {
              stackIn_26_2 = 0;
            }
            ((MenuScreen) (Object) stackIn_25_0).drawScreen(stackIn_25_1, stackIn_26_2, -62);
            if (param1 != -1) {
              StipplePatterns.fillScreenWithStipple(param1, 0, StipplePatterns.field_a);
            }
            LoginCredentialType.popRasterState((byte) 124);
          } else {
            if (DropTargetWidget.field_I != null) {
              if (WidgetNode.field_p.field_d) {
                stackIn_20_0 = DropTargetWidget.field_I;
                stackIn_21_1 = !(!(0.0 > HotspotTextWidget.field_K[11]));
                ((GameSession) (Object) stackIn_20_0).renderBoardTexture(stackIn_21_1, 85, DisplayNameHelpers.field_d);
              } else {
                stackIn_16_0 = DropTargetWidget.field_I;
                stackIn_17_1 = !(!(0.0 > HotspotTextWidget.field_K[11]));
                ((GameSession) (Object) stackIn_16_0).renderCellAndHighlightTextures(stackIn_17_1, (byte) 101, ClientEnvironmentHelpers.field_e, DisplayNameHelpers.field_d);
              }
            } else {
              if (MusicPlaybackHelpers.field_b != null) {
                if (WidgetNode.field_p.field_d) {
                  stackIn_11_0 = MusicPlaybackHelpers.field_b;
                  stackIn_12_1 = !(!(HotspotTextWidget.field_K[11] < 0.0));
                  ((GameSession) (Object) stackIn_11_0).renderBoardTexture(stackIn_12_1, 99, DisplayNameHelpers.field_d);
                } else {
                  stackIn_7_0 = MusicPlaybackHelpers.field_b;
                  stackIn_8_1 = !(!(0.0 > HotspotTextWidget.field_K[11]));
                  ((GameSession) (Object) stackIn_7_0).renderCellAndHighlightTextures(stackIn_8_1, (byte) 58, ClientEnvironmentHelpers.field_e, DisplayNameHelpers.field_d);
                }
              }
            }
          }
          if (Bzip2State.hasFeatureBit((byte) 13, param4)) {
            if (AchievementNotice.field_h <= 0) {
              return;
            }
            RenderTargetHelpers.setRenderTargetSprite(DisplayNameHelpers.field_d, param4 + 256);
            var5_int = 1024 * Math.min(-AchievementNotice.field_h + UiTheme.field_c, AchievementNotice.field_h) / UiTheme.field_c;
            if (var5_int > 0) {
              for (var6 = 0; DisplayNameHelpers.field_d.field_B.length > var6; var6++) {
                var7 = (var6 * 173 + 159 * UiTheme.field_r) % var5_int - var5_int / 2;
                var8 = 255 & DisplayNameHelpers.field_d.field_B[var6];
                var8 = var8 + var7;
                if (0 <= var8) {
                  if (255 < var8) {
                    var8 = 255;
                  }
                } else {
                  var8 = 0;
                }
                DisplayNameHelpers.field_d.field_B[var6] = BitwiseHelpers.bitOr(var8, WidgetFactoryHelpers.bitAnd(DisplayNameHelpers.field_d.field_B[var6], 16776960));
              }
            }
            LoginCredentialType.popRasterState((byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var5), "lm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        this.field_f = true;
        try {
          while (!this.field_d) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_h[var1_int];
              if (var2 == null) {
              } else {
                var2.serviceOutput();
              }
            }
            IsaacRandom.sleepMillis(-92, 10L);
            Object var5 = (Object) null;
            NetworkGameClient.pumpPlatformEvents(this.field_b, (Object) null, (byte) -100);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          IconLabelWidget.reportClientError((String) null, (Throwable) ((Object) exception), 1);
        } finally {
          this.field_f = false;
        }
    }

    final static Sprite[] createGradientTabSprites(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        Sprite var13 = null;
        Sprite var14 = null;
        int var6 = 51 / ((34 - param1) / 32);
        int[] var18 = Rasterizer.field_d;
        int var8 = Rasterizer.field_e;
        int var9 = Rasterizer.field_f;
        Sprite var10 = new Sprite(16, param2);
        var10.makeRasterTarget();
        Rasterizer.fillVerticalGradient(0, 0, 16, param2, param3, param0);
        Object var11 = null;
        if (param5) {
          var13 = var10.copy();
          var11 = var13;
          var13.makeRasterTarget();
          Rasterizer.drawHorizontalLine(0, 0, 5, 0);
          Rasterizer.drawHorizontalLine(0, 1, 3, 0);
          Rasterizer.drawHorizontalLine(0, 2, 2, 0);
          Rasterizer.drawHorizontalLine(0, 3, 1, 0);
          Rasterizer.drawHorizontalLine(0, 4, 1, 0);
        }
        Object var12 = null;
        if (param4) {
          var14 = var10.copy();
          var12 = var14;
          var14.makeRasterTarget();
          Rasterizer.drawHorizontalLine(11, 0, 5, 0);
          Rasterizer.drawHorizontalLine(13, 1, 3, 0);
          Rasterizer.drawHorizontalLine(14, 2, 2, 0);
          Rasterizer.drawHorizontalLine(15, 3, 1, 0);
          Rasterizer.drawHorizontalLine(15, 4, 1, 0);
        }
        Rasterizer.setTarget(var18, var8, var9);
        return new Sprite[]{null, null, null, (Sprite) (var11), var10, (Sprite) (var12), null, null, null};
    }

    static long bitAnd(long param0, long param1) {
        return param0 & param1;
    }

    AudioPumpThread() {
        this.field_h = new AudioOutput[2];
        this.field_d = false;
        this.field_f = false;
    }

    static {
        field_g = "Player Name: ";
        field_a = 500;
        field_i = new TypeCode(10, 2, 2, 0);
        textPlayers = "Players are <%0> and <%1>.";
        field_e = new LoginRsaKey();
        field_c = "To <%0>: ";
    }
}
