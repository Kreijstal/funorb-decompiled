/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlFlowingWaterEffect extends LegacyOpenGlEffect {
    static volatile int field_e;
    private LegacyOpenGlDisplayLists stateLists;
    private LegacyWaterTextureResources waterTextures;

    LegacyOpenGlFlowingWaterEffect(LegacyOpenGlGraphicsToolkit owner, LegacyWaterTextureResources textures) {
        super(owner);
        try {
          this.waterTextures = textures;
          this.stateLists = new LegacyOpenGlDisplayLists(owner, 2);
          this.stateLists.beginList(0, 4864);
          this.toolkit.setActiveTextureUnit(1, 98);
          if (this.waterTextures.useVolumeTextures) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.toolkit.setActiveTextureUnit(0, 106);
          this.stateLists.endList(true);
          this.stateLists.beginList(1, 4864);
          this.toolkit.setActiveTextureUnit(1, 127);
          if (this.waterTextures.useVolumeTextures) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.toolkit.setActiveTextureUnit(0, 80);
          this.stateLists.endList(true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kj.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textures != null ? "{...}" : "null") + ')');
        }
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard > -30) {
          field_e = 34;
        }
    }

    final void disable(int guard) {
        this.stateLists.callList((byte) 121, '\001');
        if (guard <= -125) {
          this.toolkit.setActiveTextureUnit(1, 100);
          this.toolkit.bindTexture(88, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, 110);
          return;
        }
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        float var4 = (float)(1 + (3 & parameters0)) * -0.0005000000237487257f;
        float var5 = 0.0005000000237487257f * (float)(1 + ((26 & parameters0) >> 3));
        float var6 = (64 & parameters0) == 0 ? 0.00048828125f : 0.0009765625f;
        int var7 = (parameters0 & 128) != 0 ? 1 : 0;
        int var8Lifetime1;
        this.toolkit.setActiveTextureUnit(1, 109);
        if (var7 != 0) {
          GameApplet.field_e[1] = 0.0f;
          GameApplet.field_e[0] = var6;
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[3] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8192, 9474, GameApplet.field_e, 0);
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[3] = var4 * (float)this.toolkit.animationTime % 1.0f;
          GameApplet.field_e[1] = var6;
          GameApplet.field_e[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8193, 9474, GameApplet.field_e, 0);
          if (this.waterTextures.useVolumeTextures) {
            GameApplet.field_e[2] = 0.0f;
            GameApplet.field_e[0] = 0.0f;
            GameApplet.field_e[1] = 0.0f;
            GameApplet.field_e[3] = (float)this.toolkit.animationTime * var5 % 1.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GameApplet.field_e, 0);
          } else {
            var8 = (int)(16.0f * ((float)this.toolkit.animationTime * var5));
            this.toolkit.bindTexture(90, this.waterTextures.turbulenceSlices[var8 % 16]);
          }
          this.toolkit.setActiveTextureUnit(0, 90);
          if (guard < 39) {
            field_e = 81;
            return;
          }
          return;
        }
        GameApplet.field_e[3] = 0.0f;
        GameApplet.field_e[0] = 0.0f;
        GameApplet.field_e[1] = 0.0f;
        GameApplet.field_e[2] = var6;
        jaggl.OpenGL.glTexGenfv(8192, 9474, GameApplet.field_e, 0);
        GameApplet.field_e[2] = 0.0f;
        GameApplet.field_e[3] = var4 * (float)this.toolkit.animationTime % 1.0f;
        GameApplet.field_e[1] = var6;
        GameApplet.field_e[0] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8193, 9474, GameApplet.field_e, 0);
        if (this.waterTextures.useVolumeTextures) {
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[0] = 0.0f;
          GameApplet.field_e[1] = 0.0f;
          GameApplet.field_e[3] = (float)this.toolkit.animationTime * var5 % 1.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GameApplet.field_e, 0);
        } else {
          var8Lifetime1 = (int)(16.0f * ((float)this.toolkit.animationTime * var5));
          this.toolkit.bindTexture(90, this.waterTextures.turbulenceSlices[var8Lifetime1 % 16]);
        }
        this.toolkit.setActiveTextureUnit(0, 90);
        if (guard < 39) {
          field_e = 81;
          return;
        }
    }

    final void enable(byte guard, boolean lighting) {
        if (guard >= 33) {
          this.stateLists.callList((byte) 121, '\0');
          if (this.waterTextures.useVolumeTextures) {
            this.toolkit.setActiveTextureUnit(1, 120);
            this.toolkit.bindTexture(56, this.waterTextures.turbulenceVolume);
            this.toolkit.setActiveTextureUnit(0, 110);
          }
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1, boolean param2, String param3) {
        try {
          RuntimeException var4 = null;
          String var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4_ref = null;
          try {
            if (PlatformTaskDispatcher.field_o.startsWith("win") &&
              IntList.openWindowsBrowser(param3, -2528)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              IntrusiveNode.reportClientError("MGR1: " + param3, (Throwable) null, 0);
            }
            if (param0 == -23166) {
              return;
            }
            var5 = (String) null;
            LegacyOpenGlFlowingWaterEffect.a(93, (java.applet.Applet) null, false, (String) null);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4;
            stackIn_12_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isSupported(byte guard) {
        if (guard > -64) {
          this.stateLists = (LegacyOpenGlDisplayLists) null;
          return true;
        }
        return true;
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        if (guard != 35) {
          return;
        }
        try {
          this.toolkit.bindTexture(46, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kj.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
