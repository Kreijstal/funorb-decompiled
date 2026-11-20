/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlScrollingNoiseEffect extends LegacyOpenGlMaterialEffect {
    static int[] field_e;
    private OpenGlDisplayLists displayLists;
    private LegacyOpenGlWaterTextures waterTextures;

    final void disable(int param0) {
        this.displayLists.callList(true, '\001');
        this.toolkit.setActiveTextureUnit(33984, 1);
        if (param0 == 5890) {
          this.toolkit.bindTexture(54, (OpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(33984, 0);
          return;
        }
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        if (param1 != 125) {
          return;
        }
        try {
          this.toolkit.bindTexture(param1 ^ 77, param2);
          this.toolkit.setTextureCombineMode(0, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iib.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          this.waterTextures = (LegacyOpenGlWaterTextures) null;
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          LegacyOpenGlScrollingNoiseEffect.clearSharedReferences(-53);
          field_e = null;
          return;
        }
        field_e = null;
    }

    LegacyOpenGlScrollingNoiseEffect(OpenGlToolkit param0, LegacyOpenGlWaterTextures param1) {
        super(param0);
        try {
          this.waterTextures = param1;
          this.displayLists = new OpenGlDisplayLists(param0, 2);
          this.displayLists.beginList(-109, 0);
          this.toolkit.setActiveTextureUnit(33984, 1);
          if (this.waterTextures.usesVolumeTextures) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.displayLists.endList(4864);
          this.displayLists.beginList(-89, 1);
          this.toolkit.setActiveTextureUnit(33984, 1);
          if (this.waterTextures.usesVolumeTextures) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.displayLists.endList(4864);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isSupported(int param0) {
        if (param0 > -87) {
          this.disable(42);
          return true;
        }
        return true;
    }

    final void setParameters(int param0, int param1, int param2) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        float var4 = -0.0005000000237487257f * (float)(1 + (param0 & 3));
        float var5 = (float)(1 + ((24 & param0) >> 3)) * 0.0005000000237487257f;
        float var6 = (64 & param0) != 0 ? 0.0009765625f : 0.00048828125f;
        int var7 = (param0 & 128) != 0 ? 1 : 0;
        int var8Lifetime1;
        this.toolkit.setActiveTextureUnit(33984, 1);
        if (var7 != 0) {
          FeatheredLineRasterizer.texGenPlaneScratch[2] = 0.0f;
          FeatheredLineRasterizer.texGenPlaneScratch[1] = 0.0f;
          FeatheredLineRasterizer.texGenPlaneScratch[3] = 0.0f;
          FeatheredLineRasterizer.texGenPlaneScratch[0] = var6;
          jaggl.OpenGL.glTexGenfv(8192, 9474, FeatheredLineRasterizer.texGenPlaneScratch, 0);
          FeatheredLineRasterizer.texGenPlaneScratch[3] = (float)this.toolkit.field_Mc * var4 % 1.0f;
          FeatheredLineRasterizer.texGenPlaneScratch[2] = 0.0f;
          if (param1 == -25139) {
            FeatheredLineRasterizer.texGenPlaneScratch[0] = 0.0f;
            FeatheredLineRasterizer.texGenPlaneScratch[1] = var6;
            jaggl.OpenGL.glTexGenfv(8193, 9474, FeatheredLineRasterizer.texGenPlaneScratch, 0);
            if (this.waterTextures.usesVolumeTextures) {
              FeatheredLineRasterizer.texGenPlaneScratch[3] = (float)this.toolkit.field_Mc * var5 % 1.0f;
              FeatheredLineRasterizer.texGenPlaneScratch[1] = 0.0f;
              FeatheredLineRasterizer.texGenPlaneScratch[2] = 0.0f;
              FeatheredLineRasterizer.texGenPlaneScratch[0] = 0.0f;
              jaggl.OpenGL.glTexGenfv(8194, 9473, FeatheredLineRasterizer.texGenPlaneScratch, 0);
            } else {
              var8 = (int)((float)this.toolkit.field_Mc * var5 * 16.0f);
              this.toolkit.bindTexture(25, this.waterTextures.scrollingNoiseFrames[var8 % 16]);
            }
            this.toolkit.setActiveTextureUnit(33984, 0);
            return;
          }
          return;
        }
        FeatheredLineRasterizer.texGenPlaneScratch[1] = 0.0f;
        FeatheredLineRasterizer.texGenPlaneScratch[2] = var6;
        FeatheredLineRasterizer.texGenPlaneScratch[3] = 0.0f;
        FeatheredLineRasterizer.texGenPlaneScratch[0] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8192, 9474, FeatheredLineRasterizer.texGenPlaneScratch, 0);
        FeatheredLineRasterizer.texGenPlaneScratch[3] = (float)this.toolkit.field_Mc * var4 % 1.0f;
        FeatheredLineRasterizer.texGenPlaneScratch[2] = 0.0f;
        if (param1 == -25139) {
          FeatheredLineRasterizer.texGenPlaneScratch[0] = 0.0f;
          FeatheredLineRasterizer.texGenPlaneScratch[1] = var6;
          jaggl.OpenGL.glTexGenfv(8193, 9474, FeatheredLineRasterizer.texGenPlaneScratch, 0);
          if (this.waterTextures.usesVolumeTextures) {
            FeatheredLineRasterizer.texGenPlaneScratch[3] = (float)this.toolkit.field_Mc * var5 % 1.0f;
            FeatheredLineRasterizer.texGenPlaneScratch[1] = 0.0f;
            FeatheredLineRasterizer.texGenPlaneScratch[2] = 0.0f;
            FeatheredLineRasterizer.texGenPlaneScratch[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, FeatheredLineRasterizer.texGenPlaneScratch, 0);
          } else {
            var8Lifetime1 = (int)((float)this.toolkit.field_Mc * var5 * 16.0f);
            this.toolkit.bindTexture(25, this.waterTextures.scrollingNoiseFrames[var8Lifetime1 % 16]);
          }
          this.toolkit.setActiveTextureUnit(33984, 0);
          return;
        }
    }

    final void enable(boolean param0, int param1) {
        this.displayLists.callList(true, '\0');
        if (param1 < 18) {
          this.isSupported(31);
          if (this.waterTextures.usesVolumeTextures) {
            this.toolkit.setActiveTextureUnit(33984, 1);
            this.toolkit.bindTexture(58, this.waterTextures.scrollingNoiseVolume);
            this.toolkit.setActiveTextureUnit(33984, 0);
            return;
          }
          return;
        }
        if (!this.waterTextures.usesVolumeTextures) {
          return;
        }
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(58, this.waterTextures.scrollingNoiseVolume);
        this.toolkit.setActiveTextureUnit(33984, 0);
    }

    static {
    }
}
