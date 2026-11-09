/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareAnimatedWaterEffect extends ShaderEffect {
    private float volumeTime;
    static int[][] field_g;
    private WaterTextureResources waterTextures;

    final void updateTextureUniforms(byte guard) {
        AffineTransform3D var2 = null;
        AffineTransform3D var3 = null;
        if (this.toolkit.t(-80) == 0) {
          var2 = this.toolkit.H(26453);
          this.toolkit.g(1, -128);
          var3 = this.toolkit.B(0);
          var3.copyFrom(0, var2);
          var3.scale(0.125f, 0.125f, -126, 1.0f);
          var3.translate((byte) 96, this.volumeTime, 0.0f, 0.0f);
          this.toolkit.a(LegacyRidgedWaterNoise.field_y, 28880);
          this.toolkit.g(0, -122);
        }
        if (guard < -47) {
          return;
        }
        this.volumeTime = -0.03486540541052818f;
    }

    HardwareAnimatedWaterEffect(HardwareGraphicsToolkit owner, WaterTextureResources textures) {
        super(owner);
        this.volumeTime = 0.0f;
        try {
          this.waterTextures = textures;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ib.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textures != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isSupported(byte guard) {
        if (guard >= -8) {
          this.volumeTime = -0.8005875945091248f;
          return this.waterTextures.hasAnimatedTextures(51);
        }
        return this.waterTextures.hasAnimatedTextures(51);
    }

    public static void e(int param0) {
        if (param0 != 1) {
          HardwareAnimatedWaterEffect.d(48);
          field_g = (int[][]) null;
          return;
        }
        field_g = (int[][]) null;
    }

    final void disable(boolean guard) {
        this.toolkit.g(1, -115);
        if (!guard) {
          this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
          this.toolkit.a(jq.TEXTURE, 0, 0);
          this.toolkit.a(jq.TEXTURE, 0, true);
          this.toolkit.c(1, 110);
          this.toolkit.a((GpuTexture) null, 95);
          this.toolkit.g(0, -111);
          this.toolkit.a(jq.TEXTURE, 0, true);
          return;
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        try {
          if (guard != 18834) {
            this.waterTextures = (WaterTextureResources) null;
          }
          this.toolkit.a(texture, 126);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ib.E(" + combineMode + ',' + guard + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(boolean lighting, int guard) {
        this.toolkit.g(1, -119);
        this.toolkit.a((byte) -83, lf.REPLACE, LoginForm.ADD);
        this.toolkit.setColorCombineSource((byte) 111, 0, true, false, jq.TEXTURE);
        this.toolkit.a(FontMetrics.PREVIOUS, 0, true);
        this.toolkit.c(0, guard ^ 20151);
        this.toolkit.g(0, -124);
        if (guard == 20186) {
          this.toolkit.a(false, -16777216);
          this.toolkit.a(AccountRequestState.CONSTANT, 0, true);
          this.updateTextureUniforms((byte) -107);
          return;
        }
        this.waterTextures = (WaterTextureResources) null;
        this.toolkit.a(false, -16777216);
        this.toolkit.a(AccountRequestState.CONSTANT, 0, true);
        this.updateTextureUniforms((byte) -107);
    }

    final static void d(int param0) {
        if (CompactMeshGeometry.field_o == null) {
          return;
        }
        CheckboxWidget.a(true, CompactMeshGeometry.field_o);
        if (param0 != 1) {
          return;
        }
        CompactMeshGeometry.field_o.a(false, lt.field_m);
        CompactMeshGeometry.field_o = null;
        if (SecondaryNodeDequeIterator.field_b == null) {
          NineSlicePanel.field_f.requestFocus();
          return;
        }
        SecondaryNodeDequeIterator.field_b.e(2);
        NineSlicePanel.field_f.requestFocus();
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        int var5;
        int var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.toolkit.g(1, -117);
        if (guard != 34023) {
          this.setParameters(43, 107, 112);
        }
        if ((128 & parameters0) != 0) {
          this.toolkit.a((GpuTexture) null, 97);
        } else {
          if ((1 & parameters1) != 1) {
            if (!this.waterTextures.useVolumeTextures) {
              this.toolkit.a(this.waterTextures.animatedSlices[0], 108);
            } else {
              this.toolkit.a(this.waterTextures.animatedVolume, 126);
            }
          } else {
            if (!this.waterTextures.useVolumeTextures) {
              var4 = this.toolkit.field_kc % 4000 * 16 / 4000;
              this.toolkit.a(this.waterTextures.animatedSlices[var4], 93);
              this.toolkit.g(0, -113);
              return;
            }
            this.volumeTime = (float)(this.toolkit.field_kc % 4000) / 4000.0f;
            this.toolkit.a(this.waterTextures.animatedVolume, 122);
          }
        }
        this.toolkit.g(0, -113);
    }

    final void refreshState(boolean lighting, byte guard) {
        if (guard <= -71) {
          this.toolkit.a((byte) -83, lf.REPLACE, SlowBurstParticle.MODULATE);
          return;
        }
        this.updateTextureUniforms((byte) 54);
        this.toolkit.a((byte) -83, lf.REPLACE, SlowBurstParticle.MODULATE);
    }

    static {
    }
}
