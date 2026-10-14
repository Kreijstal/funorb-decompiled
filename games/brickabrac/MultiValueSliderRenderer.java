/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiValueSliderRenderer implements WidgetRenderer {
    private TextFont font;
    static String field_k;
    private int backgroundColor;
    private int textPaint;
    static RgbSprite field_e;
    private int markerRadius;
    private int markerColor;
    static RgbSprite jungleMidSprite;
    static RgbSprite[] field_b;
    private int shadowPaint;
    static int field_d;
    private int trackColor;

    public static void a(int param0) {
        jungleMidSprite = null;
        field_b = null;
        field_e = null;
        field_k = null;
        if (param0 != -51) {
          field_k = (String) null;
        }
    }

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        int var10 = 0;
        Widget stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        MultiValueSliderWidget var12 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (widget instanceof MultiValueSliderWidget) {
            stackIn_4_0 = (Widget) (widget);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (MultiValueSliderWidget) (stackIn_4_0);
          Rasterizer2D.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.backgroundColor);
          if (var12 != null) {
          }
          var7 = widget.width - 2 * var12.horizontalInset;
          var8 = parentX - (-widget.x - var12.horizontalInset);
          var9 = var12.trackY + widget.y + parentY;
          Rasterizer2D.drawLine(var8, var9, var7 + var8, var9, this.trackColor);
          for (var10 = var12.getValueCount(false) - 1; var10 >= 0; var10--) {
            Rasterizer2D.f(var8 + var12.getValue(var10, false) * var7 / var12.getMaximumValue(-119), var9, this.markerRadius, this.markerColor);
          }
          if (callbackGuard != -20618) {
            MultiValueSliderRenderer.a(46);
          }
          if (this.font != null) {
            this.font.drawCentered(var12.text, var7 / 2 + var8, var9 + this.font.baselineHeight + var12.trackY, this.textPaint, this.shadowPaint);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("dg.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(parentY).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (null == LoadingProgressDialog.field_cb) {
          return "";
        }
        int var1 = 90 % ((-28 - param0) / 48);
        return LoadingProgressDialog.field_cb;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime3;
        int var7Lifetime3;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (0 > MatchResultScreen.field_t) {
          return;
        }
        var3 = param2 - 135;
        var4 = param1 - 35;
        var5 = 256;
        if (MatchResultScreen.field_t < 75) {
          var5 = (MatchResultScreen.field_t << 8) / 75;
        }
        if (MatchResultScreen.field_t > 200) {
          var5 = (-MatchResultScreen.field_t + 250 << 8) / 50;
        }
        IndexedSpriteGeometry.pushSpriteRaster(-90, LoginMethodPreference.field_b);
        MeshRasterState.syncRasterClip();
        if (!param0) {
          Rasterizer2D.clear();
          jl.b(-120);
          if (256 > var5) {
            Rasterizer2D.fillRectangleAlpha(0, 0, Rasterizer2D.width, Rasterizer2D.height, 0, 256 - var5);
          }
          sc.popRaster(-96);
          if (MatchResultScreen.field_t < 150) {
            LoginMethodPreference.field_b.a(var3, var4);
          } else {
            LevelCompleteScreen.field_I.b(var3 + 15, 10 + var4, var5);
          }
          var6 = -125 + MatchResultScreen.field_t;
          if (var6 > 0 &&
            var6 < 50) {
            if (20 <= var6) {
              if (30 <= var6) {
                var7 = (-var6 + 50) * 256 / 20;
                aa.field_b.f(var3, var4, var7);
              } else {
                aa.field_b.f(var3, var4, 256);
              }
            } else {
              var7 = var6 * 256 / 20;
              aa.field_b.f(var3, var4, var7);
            }
          }
          var6Lifetime3 = -140 + MatchResultScreen.field_t;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = 256 * var6Lifetime3 / 20;
            }
            BitPacketBuffer.field_t.b(15 + var3, 10 + var4, var5 * var7Lifetime3 >> 8);
          }
          return;
        }
        MultiValueSliderRenderer.a(-70);
        Rasterizer2D.clear();
        jl.b(-120);
        if (256 > var5) {
          Rasterizer2D.fillRectangleAlpha(0, 0, Rasterizer2D.width, Rasterizer2D.height, 0, 256 - var5);
        }
        sc.popRaster(-96);
        if (MatchResultScreen.field_t < 150) {
          LoginMethodPreference.field_b.a(var3, var4);
        } else {
          LevelCompleteScreen.field_I.b(var3 + 15, 10 + var4, var5);
        }
        var6Lifetime1 = -125 + MatchResultScreen.field_t;
        if (var6Lifetime1 > 0 &&
          var6Lifetime1 < 50) {
          if (20 > var6Lifetime1) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
            aa.field_b.f(var3, var4, var7Lifetime1);
          } else {
            if (30 > var6Lifetime1) {
              aa.field_b.f(var3, var4, 256);
            } else {
              var7Lifetime1 = (-var6Lifetime1 + 50) * 256 / 20;
              aa.field_b.f(var3, var4, var7Lifetime1);
            }
          }
        }
        var6Lifetime2 = -140 + MatchResultScreen.field_t;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = 256 * var6Lifetime2 / 20;
          }
          BitPacketBuffer.field_t.b(15 + var3, 10 + var4, var5 * var7Lifetime2 >> 8);
        }
        return;
    }

    final static LobbyGame findLobbyGame(int gameId, byte obfuscationGuard) {
        if (obfuscationGuard == 61) {
          return null == LevelResultSubmission.lobbyGameIndex ? null : (LobbyGame) (LevelResultSubmission.lobbyGameIndex.get((long)gameId, -1));
        }
        return (LobbyGame) null;
    }

    final static void a(boolean param0) {
        CheckboxWidgetRenderer.a(17, param0);
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3, RgbSprite param4, int param5, int param6, RgbSprite param7, int param8, int param9) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          param4.drawAt((param8 * 5 >> 16) + param2 + (param1 - param4.canvasWidth) / 2, param5);
          param7.drawTransparent((-param7.canvasWidth + param1) / 2 + (param2 + (10 * param8 >> 16)), -param7.canvasHeight + 480 + (param9 + param5));
          param3.drawTransparent((20 * param8 >> 16) + (param1 - param3.canvasWidth) / 2 + param2, -param3.canvasHeight + (480 + param5) + param9);
          if (param0 != -899814320) {
            MultiValueSliderRenderer.a(-80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_5_0 = var10;
          stackIn_5_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    MultiValueSliderRenderer(TextFont font, int textPaint, int shadowPaint, int trackColor, int backgroundColor, int markerRadius, int markerColor) {
        try {
          this.font = font;
          this.textPaint = textPaint;
          this.backgroundColor = backgroundColor;
          this.markerColor = markerColor;
          this.shadowPaint = shadowPaint;
          this.markerRadius = markerRadius;
          this.trackColor = trackColor;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dg.<init>(" + (font != null ? "{...}" : "null") + ',' + textPaint + ',' + shadowPaint + ',' + trackColor + ',' + backgroundColor + ',' + markerRadius + ',' + markerColor + ')');
        }
    }

    static {
        field_k = "Click";
    }
}
