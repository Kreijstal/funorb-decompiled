/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlEnvironmentWaterEffect extends ShaderEffect {
    private boolean field_e;
    private hk field_f;
    private qca field_k;
    private boolean field_h;
    static wm field_j;
    static ToolkitSprite field_d;
    static UiComponent field_i;
    static su field_g;

    OpenGlEnvironmentWaterEffect(HardwareOpenGlToolkit param0, ResourceArchive param1, hk param2) {
        super(param0);
        pr var4 = null;
        RuntimeException var4_ref = null;
        pr var5 = null;
        pr var6 = null;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param2;
          if (param1 == null) {
            this.field_e = false;
            return;
          }
          if (!param0.field_Uc) {
            this.field_e = false;
            return;
          }
          if (!param0.field_Pc) {
            this.field_e = false;
            return;
          }
          var6 = ka.compileShader((byte) -95, param1.getFileByName("gl", (byte) 122, "environment_mapped_water_v"), 35633, param0);
          var4 = var6;
          var5 = ka.compileShader((byte) 123, param1.getFileByName("gl", (byte) 127, "environment_mapped_water_f"), 35632, param0);
          this.field_k = PasswordValidator.linkShaderProgram(new pr[]{var6, var5}, param0, 1);
          stackIn_12_1 = (this.field_k != null) && (this.field_f.b(-37));
          this.field_e = stackIn_12_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("dp.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void setParameters(byte param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (this.field_h) {
          var4 = 1 << (param1 & 3);
          var5 = (float)(1 << (param1 >> 3 & 7)) / 32.0f;
          var6 = 65535 & param2;
          var7 = (float)(3 & param2 >> 16) / 8.0f;
          var8 = this.field_k.field_b;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.owner.field_Dc * var4 % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (param0 == 55) {
          return;
        }
        this.disable(5);
    }

    final void disable(int param0) {
        if (param0 < -4) {
          if (this.field_h) {
            this.owner.e(1, false);
            this.owner.bindTexture(true, (GpuTexture) null);
            this.owner.e(0, false);
            this.owner.bindTexture(true, (GpuTexture) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_h = false;
          }
          return;
        }
        this.isSupported(6);
        if (this.field_h) {
          this.owner.e(1, false);
          this.owner.bindTexture(true, (GpuTexture) null);
          this.owner.e(0, false);
          this.owner.bindTexture(true, (GpuTexture) null);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_h = false;
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_j = null;
        if (param0 == 13936) {
          field_g = null;
          field_d = null;
          return;
        }
        field_i = (UiComponent) null;
        field_g = null;
        field_d = null;
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          return true;
        }
        return this.field_e;
    }

    final void enable(int param0, boolean param1) {
        long var5 = 0L;
        int var4 = -72 % ((41 - param0) / 62);
        na var3 = this.owner.n(11);
        if (this.field_e &&
          var3 != null) {
          this.owner.e(1, false);
          this.owner.bindTexture(true, var3);
          this.owner.e(0, false);
          this.owner.bindTexture(true, this.field_f.field_f);
          var5 = this.field_k.field_b;
          jaggl.OpenGL.glUseProgramObjectARB(var5);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.owner.field_Gb[0], -this.owner.field_Gb[1], -this.owner.field_Gb[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.owner.field_sc, this.owner.field_yb, this.owner.field_Kb, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(this.owner.field_Gb[1]) * 928.0f + 96.0f);
          this.field_h = true;
        }
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24595) {
            OpenGlEnvironmentWaterEffect.a(93, '￹');
          }
          if (this.field_h) {
            return;
          }
          this.owner.bindTexture(true, param1);
          this.owner.a((byte) 10, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dp.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 != 5744) {
          field_g = (su) null;
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 < 111) {
          OpenGlEnvironmentWaterEffect.a(-40, '￫');
          if (param1 < 48) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    static {
        field_j = new wm();
        field_g = new su(8, 0, 4, 1);
    }
}
