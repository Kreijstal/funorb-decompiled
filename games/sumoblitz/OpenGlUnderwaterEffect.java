/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlUnderwaterEffect extends ShaderEffect {
    static int[] field_k;
    static String field_n;
    private OpenGlAssemblyProgram field_f;
    static int field_r;
    static IntrusiveDeque field_q;
    private boolean field_e;
    private OpenGlAssemblyProgram field_g;
    private boolean field_u;
    static ToolkitSprite field_t;
    private float[] field_s;
    private OpenGlAssemblyProgram field_m;
    private boolean field_h;
    private OpenGlAssemblyProgram field_j;
    private Texture2D field_o;
    private boolean field_l;
    static int field_i;
    static int[] field_p;

    final void updateFogUniforms(int guard) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var2Lifetime1;
        int var3Lifetime1;
        float var4Lifetime1;
        float var5Lifetime1;
        if (guard == 260) {
          if (this.field_l) {
            var2 = this.toolkit.farPlane();
            var3 = this.toolkit.nearPlane();
            var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
            var5 = -(0.25f * (float)(var2 - var3)) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.toolkit.S(98), (float)this.toolkit.e((byte) 99) / 255.0f);
            this.toolkit.g(1, -116);
            this.toolkit.a(false, this.toolkit.v(15));
            this.toolkit.g(0, -117);
          }
          return;
        }
        this.setParameters(-12, 3, -112);
        if (this.field_l) {
          var2Lifetime1 = this.toolkit.farPlane();
          var3Lifetime1 = this.toolkit.nearPlane();
          var4Lifetime1 = (float)var2Lifetime1 - (float)(-var3Lifetime1 + var2Lifetime1) * 0.125f;
          var5Lifetime1 = -(0.25f * (float)(var2Lifetime1 - var3Lifetime1)) + (float)var2Lifetime1;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5Lifetime1, var4Lifetime1, 1.0f / (float)this.toolkit.S(98), (float)this.toolkit.e((byte) 99) / 255.0f);
          this.toolkit.g(1, -116);
          this.toolkit.a(false, this.toolkit.v(15));
          this.toolkit.g(0, -117);
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 == 12) {
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        }
        field_t = (ToolkitSprite) null;
        field_q = null;
        field_k = null;
        field_p = null;
        field_t = null;
    }

    private final void e(byte param0) {
        int var2 = this.toolkit.M(-125);
        AffineTransform3D var3 = this.toolkit.g((byte) -28);
        if (this.field_e) {
          jaggl.OpenGL.glBindProgramARB(34336, var2 != 2147483647 ? this.field_g.programId : this.field_j.programId);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != var2 ? this.field_f.programId : this.field_m.programId);
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_l = true;
        var3.transformPlane(0.0f, this.field_s, (byte) 71, 0.0f, -1.0f, (float)var2);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_s[0], this.field_s[1], this.field_s[2], this.field_s[3]);
        this.updateFogUniforms(param0 + 246);
        if (param0 == 14) {
          return;
        }
        this.enable(true, 123);
    }

    OpenGlUnderwaterEffect(OpenGlGraphicsToolkit param0, ResourceArchive param1) {
        super(param0);
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_s = new float[4];
        this.field_h = false;
        try {
          if (param1 != null &&
            param0.field_Ac) {
            this.field_m = LegacyOpenGlPostProcessEffect.compileAssemblyProgram((byte) 83, param0, param1.fetchNamedFile("uw_ground_unlit", "gl", -1), 34336);
            this.field_j = LegacyOpenGlPostProcessEffect.compileAssemblyProgram((byte) 83, param0, param1.fetchNamedFile("uw_ground_lit", "gl", -1), 34336);
            this.field_f = LegacyOpenGlPostProcessEffect.compileAssemblyProgram((byte) 73, param0, param1.fetchNamedFile("uw_model_unlit", "gl", -1), 34336);
            this.field_g = LegacyOpenGlPostProcessEffect.compileAssemblyProgram((byte) -120, param0, param1.fetchNamedFile("uw_model_lit", "gl", -1), 34336);
            stackIn_7_0 = (this.field_f == null) ? 0 : 1;
            if (this.field_j == null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if (this.field_m == null) {
              stackIn_13_2 = 0;
            } else {
              stackIn_13_2 = 1;
            }
            stackIn_15_0 = stackIn_7_0 & (stackIn_10_1 & stackIn_13_2);
            if (null == this.field_g) {
              stackIn_16_1 = 0;
            } else {
              stackIn_16_1 = 1;
            }
            if ((stackIn_15_0 & stackIn_16_1) == 0) {
              this.field_u = false;
              return;
            }
            this.field_o = this.toolkit.a(new int[]{0, -1}, 1, false, -119, 2);
            this.field_o.setWrap(false, false, true);
            this.field_u = true;
            return;
          }
          this.field_u = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("pn.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void refreshState(boolean lighting, byte guard) {
        if (guard >= -71) {
          OpenGlUnderwaterEffect.releaseStatics(26);
        }
    }

    final void disable(boolean guard) {
        this.toolkit.g(1, -119);
        this.toolkit.a((GpuTexture) null, 113);
        this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
        this.toolkit.a(jq.TEXTURE, 0, 0);
        this.toolkit.a(AccountRequestState.CONSTANT, 2, 0);
        this.toolkit.a(jq.TEXTURE, 0, true);
        this.toolkit.g(0, -108);
        if (this.field_h) {
          this.toolkit.a(jq.TEXTURE, 0, 0);
          this.toolkit.a(jq.TEXTURE, 0, true);
          this.field_h = false;
        }
        if (this.field_l) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.field_l = false;
        }
        if (!guard) {
          return;
        }
        this.field_h = false;
    }

    final boolean isSupported(byte guard) {
        if (guard >= -8) {
          OpenGlUnderwaterEffect.releaseStatics(21);
          return this.field_u;
        }
        return this.field_u;
    }

    final static void d(byte param0) {
        int var1 = SpriteOptionRenderer.fullscreenDialogWidth(-25843);
        int var2 = MarkerTrackWidget.fullscreenDialogHeight((byte) 78);
        CompactMeshGeometry.field_v.a(var1 + (LegacyOpenGlRenderbuffer.field_B << 1), -LegacyOpenGlRenderbuffer.field_B + VertexStreamLayout.field_b, (pd.field_l << 1) + var2, 19, ProxyAuthenticationRequiredException.field_f - pd.field_l);
        if (param0 == -7) {
          sj.a((byte) 124);
          return;
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 18834) {
            field_i = -7;
          }
          if (texture != null) {
            if (this.field_h) {
              this.toolkit.a(jq.TEXTURE, 0, 0);
              this.toolkit.a(jq.TEXTURE, 0, true);
              this.field_h = false;
            }
            this.toolkit.a(texture, 121);
            this.toolkit.h(37, combineMode);
            return;
          }
          if (this.field_h) {
            return;
          }
          this.toolkit.a(this.toolkit.field_D, 97);
          this.toolkit.h(113, 1);
          this.toolkit.a(FontMetrics.PREVIOUS, 0, 0);
          this.toolkit.a(FontMetrics.PREVIOUS, 0, true);
          this.field_h = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pn.E(").append(combineMode).append(',').append(guard).append(',');
          if (texture == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        if (guard != 34023) {
          this.setParameters(-3, -116, 82);
        }
    }

    final void enable(boolean lighting, int guard) {
        if (guard == 20186) {
          this.field_e = lighting ? true : false;
          this.toolkit.g(1, -112);
          this.toolkit.a(this.field_o, guard - 20070);
          this.toolkit.a((byte) -83, lf.REPLACE, OpenGlBuffer.INTERPOLATE);
          this.toolkit.a(AccountRequestState.CONSTANT, 0, 0);
          this.toolkit.setColorCombineSource((byte) 85, 2, true, false, jq.TEXTURE);
          this.toolkit.a(FontMetrics.PREVIOUS, 0, true);
          this.toolkit.g(0, -108);
          this.e((byte) 14);
          return;
        }
    }

    static {
        field_k = new int[12];
        field_q = new IntrusiveDeque();
    }
}
