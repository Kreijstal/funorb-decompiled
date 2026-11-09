/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlRidgedWaterEffect extends LegacyOpenGlEffect {
    private LegacyWaterTextureResources waterTextures;
    private LegacyOpenGlTexture1D depthRamp;
    static AccountConnectionPhase WAIT_HANDSHAKE_REPLY;
    private LegacyOpenGlDisplayLists stateLists;
    static int[] field_k;
    static int field_h;
    static int field_i;
    static String notYetAchievedText;

    final void disable(int guard) {
        if (guard > -125) {
          return;
        }
        this.stateLists.callList((byte) 121, '\001');
        if (this.toolkit.field_kc <= 0) {
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        this.toolkit.setActiveTextureUnit(1, 94);
        this.toolkit.bindTexture(24, (LegacyOpenGlTexture) null);
        this.toolkit.setFogDistanceAdjustment(1.0f, 15, 0.0f);
        this.toolkit.setActiveTextureUnit(0, 100);
        this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final boolean isSupported(byte guard) {
        if (guard >= -64) {
          field_i = -33;
          return true;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 8192) {
          WAIT_HANDSHAKE_REPLY = null;
          field_k = null;
          notYetAchievedText = null;
          return;
        }
        notYetAchievedText = (String) null;
        WAIT_HANDSHAKE_REPLY = null;
        field_k = null;
        notYetAchievedText = null;
    }

    final static String accountFormIdentifier(byte guard) {
        if (ProxySocketConnector.accountCreationState == LegacyOpenGlGraphicsHeap.PENDING) {
          return ValidationStatusWidget.field_G;
        }
        if (Base37NameAlphabet.nameAvailabilityState == LegacyOpenGlGraphicsHeap.PENDING) {
          return PowerupPickup.field_s;
        }
        if (guard != -2) {
          return (String) null;
        }
        if (!AffineTransform3D.emailAvailabilityRequest.isComplete(true)) {
          return PowerupPickup.field_s;
        }
        return FocusProxyWidget.loginIdentifier;
    }

    final void refreshState(int guard, boolean lighting) {
        this.toolkit.setTextureCombineOperations(20685, 8448, 260);
        if (guard > -30) {
          notYetAchievedText = (String) null;
        }
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if ((1 & parameters0) != 1) {
          if (!this.waterTextures.useVolumeTextures) {
            this.toolkit.bindTexture(108, this.waterTextures.ridgedSlices[0]);
            if (guard <= 39) {
              this.buildStateLists(2);
              return;
            }
            return;
          }
          this.toolkit.bindTexture(82, this.waterTextures.ridgedVolume);
          GpuDataType.field_a[1] = 0.0f;
          GpuDataType.field_a[2] = 0.0f;
          GpuDataType.field_a[3] = 0.0f;
          GpuDataType.field_a[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GpuDataType.field_a, 0);
          if (guard <= 39) {
            this.buildStateLists(2);
            return;
          }
          return;
        }
        if (!this.waterTextures.useVolumeTextures) {
          var4 = this.toolkit.animationTime % 4000 * 16 / 4000;
          this.toolkit.bindTexture(39, this.waterTextures.ridgedSlices[var4]);
          if (guard > 39) {
            return;
          }
          this.buildStateLists(2);
          return;
        }
        this.toolkit.bindTexture(80, this.waterTextures.ridgedVolume);
        GpuDataType.field_a[3] = (float)(this.toolkit.animationTime % 4000) / 4000.0f;
        GpuDataType.field_a[2] = 0.0f;
        GpuDataType.field_a[0] = 0.0f;
        GpuDataType.field_a[1] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8194, 9473, GpuDataType.field_a, 0);
        if (guard > 39) {
          return;
        }
        this.buildStateLists(2);
    }

    final void enable(byte guard, boolean lighting) {
        float var3 = 0.0f;
        if (this.toolkit.field_kc > 0) {
          var3 = -0.5f / (float)this.toolkit.field_kc;
          this.toolkit.setActiveTextureUnit(1, 92);
          GpuDataType.field_a[1] = 0.0f;
          GpuDataType.field_a[3] = 0.25f + var3 * this.toolkit.fogStart;
          GpuDataType.field_a[2] = var3;
          GpuDataType.field_a[0] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, GpuDataType.field_a, 0);
          jaggl.OpenGL.glPopMatrix();
          this.toolkit.setFogDistanceAdjustment(0.5f, 15, (float)this.toolkit.field_kc);
          this.toolkit.bindTexture(11, this.depthRamp);
          this.toolkit.setActiveTextureUnit(0, 115);
        }
        this.stateLists.callList((byte) 121, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        if (guard < 33) {
          this.setParameters((byte) -60, 117, -110);
        } else {
          jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    LegacyOpenGlRidgedWaterEffect(LegacyOpenGlGraphicsToolkit owner, LegacyWaterTextureResources textures) {
        super(owner);
        try {
          this.waterTextures = textures;
          this.buildStateLists(-53);
          this.depthRamp = new LegacyOpenGlTexture1D(this.toolkit, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.depthRamp.setRepeat(false, (byte) 126);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gi.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textures != null ? "{...}" : "null") + ')');
        }
    }

    private final void buildStateLists(int guard) {
        this.stateLists = new LegacyOpenGlDisplayLists(this.toolkit, 2);
        this.stateLists.beginList(0, 4864);
        this.toolkit.setActiveTextureUnit(1, 100);
        this.toolkit.setTextureCombineOperations(20685, 260, 7681);
        this.toolkit.setTextureCombineSources(34168, 768, 0, 104);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.toolkit.setActiveTextureUnit(0, 123);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.waterTextures.useVolumeTextures) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
        }
        this.stateLists.endList(true);
        this.stateLists.beginList(1, 4864);
        if (guard >= -38) {
          field_k = (int[]) null;
          this.toolkit.setActiveTextureUnit(1, 110);
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.setTextureCombineSources(5890, 768, 0, -118);
          jaggl.OpenGL.glDisable(3168);
          this.toolkit.setActiveTextureUnit(0, 95);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
          if (this.waterTextures.useVolumeTextures) {
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glDisable(3171);
          } else {
            this.stateLists.endList(true);
            return;
          }
          this.stateLists.endList(true);
          return;
        }
        this.toolkit.setActiveTextureUnit(1, 110);
        this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
        this.toolkit.setTextureCombineSources(5890, 768, 0, -118);
        jaggl.OpenGL.glDisable(3168);
        this.toolkit.setActiveTextureUnit(0, 95);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
        if (this.waterTextures.useVolumeTextures) {
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glDisable(3171);
        } else {
          this.stateLists.endList(true);
          return;
        }
        this.stateLists.endList(true);
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        try {
          if (guard != 35) {
            this.depthRamp = (LegacyOpenGlTexture1D) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gi.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final static void setTooltipAnchor(int y, int x, int guard) {
        ScanlineSpriteMask.pendingTooltipY = y;
        EmptyWidgetRenderer.pendingTooltipX = x;
        if (guard > -75) {
          LegacyOpenGlRidgedWaterEffect.releaseStatics(48);
        }
    }

    static {
        WAIT_HANDSHAKE_REPLY = new AccountConnectionPhase();
        field_k = new int[8192];
        notYetAchievedText = "Not yet achieved";
    }
}
