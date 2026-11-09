/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NextLevelChoiceOverlay extends SelectionOverlay {
    static boolean field_d;
    static String reassignPowerupsText;

    public static void releaseStatics(byte param0) {
        if (param0 <= 110) {
          NextLevelChoiceOverlay.releaseStatics((byte) 4);
        }
        reassignPowerupsText = null;
    }

    final void render(boolean guard, GraphicsToolkit toolkit) {
        int var3_int = 0;
        int var4 = 0;
        GraphicsToolkit var5 = null;
        int var6 = 0;
        ToolkitSprite[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!guard) {
            return;
          }
          DelegatingCanvas.a(up.field_c, 360, -5, -16777216, 3, toolkit, 650, 50, 1, guard);
          hc.field_e.a(hc.continueToNextLevelText, -1, -16777216, 150, 320, 0);
          var3_int = 45;
          var4 = 0;
          while (var3_int < 600) {
            var5 = toolkit;
            var6 = var3_int;
            var7 = up.field_c;
            DelegatingCanvas.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
            if (this.hoveredOption == var4) {
              ForceFieldRingEffect.field_t.a(NextLevelChoiceLabels.choices[var4], -1, -16777216, 258, var3_int + 125 - 4, 0);
            } else {
              hc.field_e.a(NextLevelChoiceLabels.choices[var4], -1, -16777216, 260, 125 + var3_int, 0);
            }
            var4++;
            var3_int += 300;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bw.J(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static Sprite[] takeDecodedSprites(int guard) {
        int var7_int = 0;
        int var8 = 0;
        Sprite[] var1;
        int var2;
        int var3;
        int var4;
        int[] var7;
        int var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var1 = new Sprite[RasterStateFrame.field_n];
        var2 = 0;
        var3 = 126 / ((-69 - guard) / 52);
        while (var2 < RasterStateFrame.field_n) {
          var4 = ScrollViewport.field_B[var2] * CheckboxRenderer.field_k[var2];
          var21 = TextLayout.field_d[var2];
          if (!SoundCache.field_d[var2]) {
            var10 = new int[var4];
            var22 = var10;
            for (var7_int = 0; var7_int < var4; var7_int++) {
              var10[var7_int] = LegacyOpenGlEffectManager.field_l[LegacyOpenGlPostProcessManager.bitwiseAnd((int) var21[var7_int], 255)];
            }
            var1[var2] = new Sprite(DisplayModeFailure.spriteSheetWidth, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], var22);
          } else {
            var23 = StatefulWidgetRenderer.field_o[var2];
            var17 = new int[var4];
            var14 = var17;
            var7 = var14;
            for (var8 = 0; var8 < var4; var8++) {
              var7[var8] = LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlEffectManager.field_l[LegacyOpenGlPostProcessManager.bitwiseAnd((int) var21[var8], 255)], LegacyOpenGlPostProcessManager.bitwiseAnd((int) var23[var8], 255) << 24);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(DisplayModeFailure.spriteSheetWidth, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], var17));
          }
          var2++;
        }
        PowerupPickup.releaseSpriteDecoderArrays((byte) -46);
        return var1;
    }

    final void update(int guard) {
        if (guard != 5008) {
          reassignPowerupsText = (String) null;
        }
        int var2 = (PointLight.mouseX - 45) / 300;
        int var3 = (pi.field_e - 200) / 100;
        this.hoveredOption = var2 + 2 * var3;
        if ((PointLight.mouseX - 45) % 300 > 250) {
          this.hoveredOption = -1;
        }
        if (!(this.hoveredOption < 2)) {
          this.hoveredOption = -1;
        }
        if (ActiveCanvasProvider.field_c == 1) {
          if (this.hoveredOption != 0) {
            StrongCacheReference.switchMenuScreen(-7753, true, 7);
            AffineTransform3D.field_j = 0;
            TextLayout.a(0, 0);
            LruNodeCache.gameplaySession.resetSession(88);
            this.hide((byte) -128);
          } else {
            LegacyOpenGlSpecularEffect.a(1 + OpenGlShaderProgram.levelIndex % 5, (byte) 56);
            this.hide((byte) -127);
          }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          ShaderEffect.field_d = true;
          var2 = "tuhstatbut";
          if (param0) {
            java.applet.Applet var6 = (java.applet.Applet) null;
            NextLevelChoiceOverlay.a(true, (java.applet.Applet) null);
          }
          var3 = "rvnadlm";
          var4 = -1L;
          BufferedCacheFile.a(var4, param1, true, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bw.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public NextLevelChoiceOverlay() {
    }

    static {
        reassignPowerupsText = "REASSIGN POWERUPS";
    }
}
