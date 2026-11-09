/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw extends qt {
    static boolean field_d;
    static String reassignPowerupsText;

    public static void releaseStatics(byte param0) {
        if (param0 <= 110) {
          bw.releaseStatics((byte) 4);
        }
        reassignPowerupsText = null;
    }

    final void a(boolean param0, GraphicsToolkit param1) {
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
          if (!param0) {
            return;
          }
          wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, param0);
          hc.field_e.a(hc.continueToNextLevelText, -1, -16777216, 150, 320, 0);
          var3_int = 45;
          var4 = 0;
          while (var3_int < 600) {
            var5 = param1;
            var6 = var3_int;
            var7 = up.field_c;
            wo.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
            if (this.field_a == var4) {
              ForceFieldRingEffect.field_t.a(vd.field_a[var4], -1, -16777216, 258, var3_int + 125 - 4, 0);
            } else {
              hc.field_e.a(vd.field_a[var4], -1, -16777216, 260, 125 + var3_int, 0);
            }
            var4++;
            var3_int += 300;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bw.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static Sprite[] b(int param0) {
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
        var3 = 126 / ((-69 - param0) / 52);
        while (var2 < RasterStateFrame.field_n) {
          var4 = ScrollViewport.field_B[var2] * CheckboxRenderer.field_k[var2];
          var21 = TextLayout.field_d[var2];
          if (!SoundCache.field_d[var2]) {
            var10 = new int[var4];
            var22 = var10;
            for (var7_int = 0; var7_int < var4; var7_int++) {
              var10[var7_int] = LegacyOpenGlEffectManager.field_l[LegacyOpenGlPostProcessManager.bitwiseAnd((int) var21[var7_int], 255)];
            }
            var1[var2] = new Sprite(vf.field_d, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], var22);
          } else {
            var23 = StatefulWidgetRenderer.field_o[var2];
            var17 = new int[var4];
            var14 = var17;
            var7 = var14;
            for (var8 = 0; var8 < var4; var8++) {
              var7[var8] = ic.a(LegacyOpenGlEffectManager.field_l[LegacyOpenGlPostProcessManager.bitwiseAnd((int) var21[var8], 255)], LegacyOpenGlPostProcessManager.bitwiseAnd((int) var23[var8], 255) << 24);
            }
            var1[var2] = (Sprite) ((Object) new mg(vf.field_d, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], var17));
          }
          var2++;
        }
        PowerupPickup.releaseSpriteDecoderArrays((byte) -46);
        return var1;
    }

    final void c(int param0) {
        if (param0 != 5008) {
          reassignPowerupsText = (String) null;
        }
        int var2 = (ko.field_p - 45) / 300;
        int var3 = (pi.field_e - 200) / 100;
        this.field_a = var2 + 2 * var3;
        if ((ko.field_p - 45) % 300 > 250) {
          this.field_a = -1;
        }
        if (!(this.field_a < 2)) {
          this.field_a = -1;
        }
        if (ActiveCanvasProvider.field_c == 1) {
          if (this.field_a != 0) {
            StrongCacheReference.switchMenuScreen(-7753, true, 7);
            AffineTransform3D.field_j = 0;
            TextLayout.a(0, 0);
            ph.gameplaySession.resetSession(88);
            this.b((byte) -128);
          } else {
            LegacyOpenGlSpecularEffect.a(1 + OpenGlShaderProgram.levelIndex % 5, (byte) 56);
            this.b((byte) -127);
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
            bw.a(true, (java.applet.Applet) null);
          }
          var3 = "rvnadlm";
          var4 = -1L;
          BufferedCacheFile.a(var4, param1, true, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bw.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bw() {
    }

    static {
        reassignPowerupsText = "REASSIGN POWERUPS";
    }
}
