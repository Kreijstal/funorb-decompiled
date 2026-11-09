/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelSelectScreen extends MenuScreen {
    static jj field_j;
    private int field_i;

    final void render(int opacity, GraphicsToolkit toolkit, int guard) {
        int stackIn_4_0 = 0;
        ToolkitSprite stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_3;
        ToolkitSprite stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        int stackIn_37_4;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        GraphicsToolkit var10_ref_ha = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ToolkitSprite[] var13 = null;
        int var14 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = opacity << 24;
          wo.a(up.field_c, 410, -5, var4_int, 3, toolkit, 650, 35, 1, true);
          ForceFieldRingEffect.field_t.a(mm.field_g.toUpperCase(), var4_int | 5023231, -1, 90, 320, 0);
          hc.field_e.a(mm.field_g.toUpperCase(), var4_int + 16777215, -1, 90, 320, 0);
          wo.a(up.field_c, 60, 44, var4_int, 3, toolkit, 325, 370, 1, true);
          MusicCrossfadeStream.field_q[0].drawRotated(80.0f, 402.0f, 1600, 0, 1, 0, 2);
          qv.field_k.a(407, 92, 5023231 | var4_int, Integer.toString(ResourceArchive.field_f), (byte) -110, -1);
          uq.field_a.a(407, 92, var4_int + 16777215, Integer.toString(ResourceArchive.field_f), (byte) -35, -1);
          MusicCrossfadeStream.field_q[1].drawRotated(130.0f, 402.0f, 1600, 0, 1, 0, 2);
          qv.field_k.a(407, 142, var4_int | 5023231, Integer.toString(LegacyOpenGlEffectManager.field_i), (byte) -101, -1);
          uq.field_a.a(407, 142, 16777215 + var4_int, Integer.toString(LegacyOpenGlEffectManager.field_i), (byte) -36, -1);
          MusicCrossfadeStream.field_q[2].drawRotated(180.0f, 402.0f, 1600, 0, 1, 0, 2);
          qv.field_k.a(407, 192, var4_int | 5023231, Integer.toString(hc.field_f), (byte) -15, -1);
          uq.field_a.a(407, 192, 16777215 + var4_int, Integer.toString(hc.field_f), (byte) -51, -1);
          var5 = lg.field_c << 2;
          if (128 >= var5 % 255) {
            stackIn_4_0 = var5 % 255;
          } else {
            stackIn_4_0 = -(var5 % 255) + 255;
          }
          var6 = stackIn_4_0;
          var6 += 127;
          var7 = 0;
          for (var8 = 108; -120 + rl.field_k > var8; var8 += 52) {
            for (var9 = 44; ArchiveCatalog.field_c - 96 > var9; var9 += 112) {
              if (var7 == 1 + bl.field_e &&
                opacity >= 250 &&
                !MusicPatchEnvelope.a(8230, 25)) {
                toolkit.fillRectangle(var9, var8, 100, 42, var6 << 24 | 5023231, 1);
              }
              wo.a(up.field_c, 42, var9, var4_int, 3, toolkit, 100, var8, 1, true);
              if (var7 <= bl.field_e + 1 &&
                var7 < 25) {
                qv.field_k.a(Integer.toString(var7 + 1), 5023231 | var4_int, -1, 28 + var8, var9 + 48, 0);
                uq.field_a.a(Integer.toString(1 + var7), var4_int + 16777215, -1, var8 + 28, 48 + var9, 0);
              } else {
                CacheReferenceNode.field_y.drawRotated((float)(var9 + 50), (float)(var8 + 22), 4096, 0, 3, var4_int, 1);
              }
              var7++;
            }
          }
          super.render(opacity, toolkit, guard);
          if (this.field_i != -1) {
            if (1 + bl.field_e < this.field_i) {
              return;
            }
            var8Lifetime1 = 5 + this.field_i % 5 * 112 + 44;
            var9Lifetime1 = this.field_i / 5 * 52 + 108;
            var10_ref_ha = toolkit;
            var11 = -25 + var8Lifetime1;
            var12 = -21 + var9Lifetime1;
            var13 = up.field_c;
            wo.a(var13, 84, var11, 0, 1, var10_ref_ha, 142, var12, 1, true);
            if (TextureMetadata.field_f[this.field_i]) {
              MessageDialog.field_db.a(InstrumentNoteMask.timeText.toLowerCase() + dp.b(CacheIoRequest.field_z[this.field_i], -23620), var4_int | 5023231, -1, 5 + var9Lifetime1, 42 + var8Lifetime1, 0);
              LegacyOpenGlEffect.field_c.a(InstrumentNoteMask.timeText.toLowerCase() + dp.b(CacheIoRequest.field_z[this.field_i], -23620), 16777215 + var4_int, -1, var9Lifetime1 + 5, -8 + (var8Lifetime1 + 50), guard + 2355);
              MessageDialog.field_db.a(ps.scoreText.toLowerCase() + OpenGlTexture3D.field_j[this.field_i], var4_int | 5023231, -1, 20 + var9Lifetime1, -8 + (var8Lifetime1 + 50), 0);
              LegacyOpenGlEffect.field_c.a(ps.scoreText.toLowerCase() + OpenGlTexture3D.field_j[this.field_i], var4_int + 16777215, -1, var9Lifetime1 + 20, var8Lifetime1 + 42, guard + 2355);
              var10 = 0;
              if (up.field_g[this.field_i]) {
                var10++;
              }
              if (qn.field_d[this.field_i]) {
                var10++;
              }
              if (up.field_g[this.field_i]) {
                stackIn_30_0 = il.field_b;
                stackIn_30_1 = 90 / var10 * var10 - 45;
                stackIn_30_2 = var8Lifetime1;
                if (var10 > 1) {
                  stackIn_31_3 = -15;
                } else {
                  stackIn_31_3 = 0;
                }
                ((ToolkitSprite) (Object) stackIn_30_0).drawRotated((float)(stackIn_30_1 + (stackIn_30_2 + stackIn_31_3)), (float)(40 + var9Lifetime1), 4096, 0, 3, -65536, 1);
              }
              if (!qn.field_d[this.field_i]) {
                return;
              }
              stackIn_36_0 = CacheIoWorker.field_b;
              stackIn_36_1 = -45;
              stackIn_36_2 = var8Lifetime1;
              stackIn_36_3 = -(90 / var10 * var10);
              if (var10 > 1) {
                stackIn_37_4 = 15;
              } else {
                stackIn_37_4 = 0;
              }
              ((ToolkitSprite) (Object) stackIn_36_0).drawRotated((float)(stackIn_36_1 + (stackIn_36_2 - (stackIn_36_3 - stackIn_37_4))), (float)(var9Lifetime1 + 40), 4096, 0, 3, -1, 1);
              return;
            }
            MessageDialog.field_db.a(bi.notCompletedText, var4_int | 5023231, -1, var9Lifetime1 + 20, -8 + (var8Lifetime1 + 50), 0);
            LegacyOpenGlEffect.field_c.a(bi.notCompletedText, var4_int + 16777215, -1, var9Lifetime1 + 20, var8Lifetime1 + 42, guard ^ -2355);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("tr.B(").append(opacity).append(',');
          if (toolkit == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(guard).append(')').toString());
        }
    }

    final void update(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        super.update(param0 + 0);
        var2 = (-44 + ko.field_p) / 112;
        var3 = (pi.field_e - 108) / 52;
        var4 = 5 * var3 + var2;
        if (param0 != -18556) {
          return;
        }
        if (!((-44 + ko.field_p) % 112 <= 100) ||
          !((pi.field_e - 108) % 52 <= 42)) {
          var4 = -1;
        }
        if (25 > var4 &&
          var4 >= -1) {
          if (var4 != this.field_i &&
            var4 != -1) {
            gn.a(17, true);
          }
        } else {
          var4 = -1;
          if (var4 != this.field_i &&
            var4 != -1) {
            gn.a(17, true);
          }
        }
        this.field_i = var4;
        if (hk.field_c == 1 &&
          this.field_i != -1 &&
          this.field_i <= bl.field_e + 1) {
          gn.a(16, true);
          ph.gameplaySession.startLevel(this.field_i, false, false);
          StrongCacheReference.switchMenuScreen(-7753, true, -1);
        }
        if (2 <= Bzip2State.field_j &&
          hw.field_b[82] &&
          hw.field_b[48]) {
          for (var5 = 0; var5 < 25; var5++) {
            TextureMetadata.field_f[var5] = true;
          }
          bl.field_e = 25;
        }
    }

    public LevelSelectScreen() {
        super(7);
        this.field_i = -1;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          LevelSelectScreen.releaseStatics(-101);
        }
        field_j = null;
    }

    static {
        field_j = new jj("usename");
    }
}
