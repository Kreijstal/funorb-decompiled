/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroLogoRenderer {
    static TextureFormat LUMINANCE;
    static int[][] field_a;

    public static void releaseStatics(byte param0) {
        field_a = (int[][]) null;
        if (param0 != 95) {
          LUMINANCE = (TextureFormat) null;
          LUMINANCE = null;
          return;
        }
        LUMINANCE = null;
    }

    final static ResourceArchive textArchive(byte guard, int archiveId) {
        int var2 = 39 % ((guard + 45) / 59);
        if (LegacyOpenGlShaderProgram.field_d != null) {
          return LegacyOpenGlShaderProgram.field_d;
        }
        if (-1 != archiveId) {
          return HardwareSpecularEffect.a(1, -101, true, archiveId, false, true);
        }
        return LegacyOpenGlShaderProgram.field_d;
    }

    final static void drawIntroLogo(int centerY, int centerX, int opacity) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var6Lifetime3;
        int var7Lifetime7;
        int var7Lifetime8;
        int var7Lifetime9;
        int var7Lifetime10;
        int var7Lifetime11;
        int var7Lifetime3Lifetime1;
        if (!(0 <= MusicPatch.field_u)) {
          return;
        }
        int var3 = -135 + centerX;
        int var4 = -35 + centerY;
        int var5 = opacity;
        if (!(75 <= MusicPatch.field_u)) {
          var5 = (MusicPatch.field_u << 8) / 75;
        }
        if (MusicPatch.field_u > 200) {
          var5 = (250 - MusicPatch.field_u << 8) / 50;
        }
        LegacyVertexAttribute.pushSpriteRaster(7161, LegacyOpenGlShaderProgram.field_a);
        SoftwareRasterViewport.syncClip();
        SoftwareRasterizer.clear();
        IsaacCipher.b(opacity + 0);
        if (256 > var5) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 256 - var5);
        }
        ClientException.popRasterState((byte) -69);
        if (MusicPatch.field_u >= 150) {
          LoginIdentifierSupport.field_a.a(var3 + 15, 10 + var4, var5);
          var6 = MusicPatch.field_u - 125;
          if (var6 <= 0) {
            var6 = MusicPatch.field_u - 140;
            if (0 < var6) {
              var7 = 256;
              if (20 > var6) {
                var7 = var6 * 256 / 20;
              }
              MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
            }
            return;
          }
          if (var6 >= 50) {
            var6 = MusicPatch.field_u - 140;
            if (0 < var6) {
              var7Lifetime7 = 256;
              if (20 > var6) {
                var7Lifetime7 = var6 * 256 / 20;
              }
              MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime7 >> 8);
            }
            return;
          }
          if (20 > var6) {
            var7Lifetime8 = var6 * 256 / 20;
            MenuFadeState.introGlow.d(var3, var4, var7Lifetime8);
            var6 = MusicPatch.field_u - 140;
            if (0 < var6) {
              var7Lifetime8 = 256;
              if (20 > var6) {
                var7Lifetime8 = var6 * 256 / 20;
              }
              MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime8 >> 8);
            }
            return;
          }
          if (var6 < 30) {
            MenuFadeState.introGlow.d(var3, var4, 256);
            var6 = MusicPatch.field_u - 140;
            if (0 < var6) {
              var7Lifetime9 = 256;
              if (20 > var6) {
                var7Lifetime9 = var6 * 256 / 20;
              }
              MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime9 >> 8);
            }
            return;
          }
          var7Lifetime10 = (12800 - 256 * var6) / 20;
          MenuFadeState.introGlow.d(var3, var4, var7Lifetime10);
          var6Lifetime3 = MusicPatch.field_u - 140;
          if (0 < var6Lifetime3) {
            var7Lifetime11 = 256;
            if (20 > var6Lifetime3) {
              var7Lifetime11 = var6Lifetime3 * 256 / 20;
            }
            MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime11 >> 8);
          }
          return;
        }
        LegacyOpenGlShaderProgram.field_a.drawHalfSize(var3, var4);
        var6Lifetime1 = MusicPatch.field_u - 125;
        if (var6Lifetime1 <= 0) {
          var6Lifetime1 = MusicPatch.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
            }
            MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime1 >= 50) {
          var6Lifetime1 = MusicPatch.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime2 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime2 = var6Lifetime1 * 256 / 20;
            }
            MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (20 > var6Lifetime1) {
          var7Lifetime3 = var6Lifetime1 * 256 / 20;
          MenuFadeState.introGlow.d(var3, var4, var7Lifetime3);
          var6Lifetime1 = MusicPatch.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime3Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime3Lifetime1 = var6Lifetime1 * 256 / 20;
            }
            MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime3Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime1 < 30) {
          MenuFadeState.introGlow.d(var3, var4, 256);
          var6Lifetime1 = MusicPatch.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime4 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime4 = var6Lifetime1 * 256 / 20;
            }
            MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime4 >> 8);
          }
          return;
        }
        var7Lifetime5 = (12800 - 256 * var6Lifetime1) / 20;
        MenuFadeState.introGlow.d(var3, var4, var7Lifetime5);
        var6Lifetime2 = MusicPatch.field_u - 140;
        if (0 < var6Lifetime2) {
          var7Lifetime6 = 256;
          if (20 > var6Lifetime2) {
            var7Lifetime6 = var6Lifetime2 * 256 / 20;
          }
          MusicPatchEnvelope.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime6 >> 8);
        }
    }

    final static void completeEmailAvailability(boolean available, int guard) {
        if (guard >= -78) {
          IntroLogoRenderer.drawIntroLogo(-106, 83, -73);
          AffineTransform3D.emailAvailabilityRequest.complete(120, available);
          return;
        }
        AffineTransform3D.emailAvailabilityRequest.complete(120, available);
    }

    static {
        LUMINANCE = new TextureFormat(1);
        field_a = new int[13][];
    }
}
