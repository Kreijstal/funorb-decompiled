/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends vw {
    private boolean field_e;
    private hk field_f;
    private qca field_k;
    private boolean field_h;
    static wm field_j;
    static nh field_d;
    static jea field_i;
    static su field_g;

    dp(kda param0, cn param1, hk param2) {
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
          var6 = ka.a((byte) -95, param1.a("gl", (byte) 122, "environment_mapped_water_v"), 35633, param0);
          var4 = var6;
          var5 = ka.a((byte) 123, param1.a("gl", (byte) 127, "environment_mapped_water_f"), 35632, param0);
          this.field_k = jm.a(new pr[]{var6, var5}, param0, 1);
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

    final void a(byte param0, int param1, int param2) {
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
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_c.field_Dc * var4 % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (param0 == 55) {
          return;
        }
        this.a(5);
    }

    final void a(int param0) {
        if (param0 < -4) {
          if (this.field_h) {
            this.field_c.e(1, false);
            this.field_c.a(true, (iva) null);
            this.field_c.e(0, false);
            this.field_c.a(true, (iva) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_h = false;
          }
          return;
        }
        this.c(6);
        if (this.field_h) {
          this.field_c.e(1, false);
          this.field_c.a(true, (iva) null);
          this.field_c.e(0, false);
          this.field_c.a(true, (iva) null);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_h = false;
        }
    }

    public static void d(int param0) {
        field_i = null;
        field_j = null;
        if (param0 == 13936) {
          field_g = null;
          field_d = null;
          return;
        }
        field_i = (jea) null;
        field_g = null;
        field_d = null;
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
          return true;
        }
        return this.field_e;
    }

    final void a(int param0, boolean param1) {
        long var5 = 0L;
        int var4 = -72 % ((41 - param0) / 62);
        na var3 = this.field_c.n(11);
        if (this.field_e &&
          var3 != null) {
          this.field_c.e(1, false);
          this.field_c.a(true, var3);
          this.field_c.e(0, false);
          this.field_c.a(true, this.field_f.field_f);
          var5 = this.field_k.field_b;
          jaggl.OpenGL.glUseProgramObjectARB(var5);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_c.field_Gb[0], -this.field_c.field_Gb[1], -this.field_c.field_Gb[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_c.field_sc, this.field_c.field_yb, this.field_c.field_Kb, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(this.field_c.field_Gb[1]) * 928.0f + 96.0f);
          this.field_h = true;
        }
    }

    final void a(int param0, iva param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24595) {
            dp.a(93, '￹');
          }
          if (this.field_h) {
            return;
          }
          this.field_c.a(true, param1);
          this.field_c.a((byte) 10, param0);
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

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          field_g = (su) null;
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 < 111) {
          dp.a(-40, '￫');
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
