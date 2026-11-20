/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlWaterFogEffect extends LegacyOpenGlMaterialEffect {
    private OpenGlTexture1D fogRamp;
    private OpenGlDisplayLists displayLists;
    private LegacyOpenGlWaterTextures waterTextures;

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        this.toolkit.setTextureCombineOperations(260, 8448, !param0 ? true : false);
    }

    LegacyOpenGlWaterFogEffect(OpenGlToolkit param0, LegacyOpenGlWaterTextures param1) {
        super(param0);
        try {
          this.waterTextures = param1;
          this.buildDisplayLists(34163);
          this.fogRamp = new OpenGlTexture1D(this.toolkit, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.fogRamp.setWrap(false, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ssb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        try {
          if (param1 != 125) {
            this.fogRamp = (OpenGlTexture1D) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ssb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void disable(int param0) {
        this.displayLists.callList(true, '\001');
        if (0 >= this.toolkit.field_jc) {
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          jaggl.OpenGL.glMatrixMode(param0);
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(61, (OpenGlTexture) null);
        this.toolkit.setFogRangeAdjustments(0.0f, 1.0f, param0 - 5890);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
        jaggl.OpenGL.glMatrixMode(param0);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void enable(boolean param0, int param1) {
        float var3 = 0.0f;
        if (!(this.toolkit.field_jc <= 0)) {
          var3 = -0.5f / (float)this.toolkit.field_jc;
          this.toolkit.setActiveTextureUnit(33984, 1);
          GetSniperCannonRandomness.field_p[2] = var3;
          GetSniperCannonRandomness.field_p[3] = var3 * this.toolkit.field_wb + 0.25f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, GetSniperCannonRandomness.field_p, 0);
          jaggl.OpenGL.glPopMatrix();
          this.toolkit.setFogRangeAdjustments((float)this.toolkit.field_jc, 0.5f, 0);
          this.toolkit.bindTexture(68, this.fogRamp);
          this.toolkit.setActiveTextureUnit(33984, 0);
        }
        this.displayLists.callList(true, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param1 >= 18) {
          return;
        }
        this.displayLists = (OpenGlDisplayLists) null;
    }

    final void setParameters(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var4Lifetime1;
        if (param1 != -25139) {
          this.waterTextures = (LegacyOpenGlWaterTextures) null;
          if ((param0 & 1) == 1) {
            if (!this.waterTextures.usesVolumeTextures) {
              var4 = 16 * (this.toolkit.field_Mc % 4000) / 4000;
              this.toolkit.bindTexture(66, this.waterTextures.noiseFrames[var4]);
              return;
            }
            this.toolkit.bindTexture(35, this.waterTextures.noiseVolume);
            GetSniperCannonRandomness.field_p[2] = 0.0f;
            GetSniperCannonRandomness.field_p[3] = (float)(this.toolkit.field_Mc % 4000) / 4000.0f;
            GetSniperCannonRandomness.field_p[1] = 0.0f;
            GetSniperCannonRandomness.field_p[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
            return;
          }
          if (this.waterTextures.usesVolumeTextures) {
            this.toolkit.bindTexture(123, this.waterTextures.noiseVolume);
            GetSniperCannonRandomness.field_p[1] = 0.0f;
            GetSniperCannonRandomness.field_p[2] = 0.0f;
            GetSniperCannonRandomness.field_p[0] = 0.0f;
            GetSniperCannonRandomness.field_p[3] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
            return;
          }
          this.toolkit.bindTexture(93, this.waterTextures.noiseFrames[0]);
          return;
        }
        if ((param0 & 1) == 1) {
          if (!this.waterTextures.usesVolumeTextures) {
            var4Lifetime1 = 16 * (this.toolkit.field_Mc % 4000) / 4000;
            this.toolkit.bindTexture(66, this.waterTextures.noiseFrames[var4Lifetime1]);
            return;
          }
          this.toolkit.bindTexture(35, this.waterTextures.noiseVolume);
          GetSniperCannonRandomness.field_p[2] = 0.0f;
          GetSniperCannonRandomness.field_p[3] = (float)(this.toolkit.field_Mc % 4000) / 4000.0f;
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
          return;
        }
        if (this.waterTextures.usesVolumeTextures) {
          this.toolkit.bindTexture(123, this.waterTextures.noiseVolume);
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          GetSniperCannonRandomness.field_p[2] = 0.0f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          GetSniperCannonRandomness.field_p[3] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
          return;
        }
        this.toolkit.bindTexture(93, this.waterTextures.noiseFrames[0]);
    }

    private final void buildDisplayLists(int param0) {
        this.displayLists = new OpenGlDisplayLists(this.toolkit, 2);
        this.displayLists.beginList(-105, 0);
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.setTextureCombineOperations(7681, 260, false);
        this.toolkit.setRgbCombineArgument(0, 34192, 768, 34168);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.toolkit.setActiveTextureUnit(33984, 0);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.waterTextures.usesVolumeTextures) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
        }
        this.displayLists.endList(4864);
        this.displayLists.beginList(-115, 1);
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
        this.toolkit.setRgbCombineArgument(0, 34192, 768, 5890);
        jaggl.OpenGL.glDisable(3168);
        this.toolkit.setActiveTextureUnit(param0 ^ 435, 0);
        jaggl.OpenGL.glTexEnvf(8960, param0, 1.0f);
        if (!this.waterTextures.usesVolumeTextures) {
          this.displayLists.endList(param0 - 29299);
          return;
        }
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glDisable(3171);
        this.displayLists.endList(param0 - 29299);
    }

    final boolean isSupported(int param0) {
        if (param0 >= -87) {
          this.displayLists = (OpenGlDisplayLists) null;
          return true;
        }
        return true;
    }

    static {
    }
}
