/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fib extends uda {
    static String field_h;
    private ibb field_f;
    private boolean field_e;
    static waa field_j;
    private boolean field_i;
    private rga field_g;

    final void a(byte param0, int param1, ura param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_i) {
            this.field_d.a(param2, -107);
            this.field_d.h(13, param1);
          }
          if (param0 > 42) {
            return;
          }
          this.a(-23, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fib.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var2 = 97 / ((param0 - 34) / 63);
        return this.field_e;
    }

    final void a(int param0) {
        if (param0 == 2543) {
          if (this.field_i) {
            this.field_d.g(1, -120);
            this.field_d.a((ura) null, -112);
            this.field_d.g(0, -91);
            this.field_d.a((ura) null, param0 ^ -2450);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_i = false;
          }
          return;
        }
        this.field_i = true;
        if (this.field_i) {
          this.field_d.g(1, -120);
          this.field_d.a((ura) null, -112);
          this.field_d.g(0, -91);
          this.field_d.a((ura) null, param0 ^ -2450);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_i = false;
        }
    }

    final void a(int param0, boolean param1) {
        hdb var3 = null;
        long var4 = 0L;
        if (param0 == 5) {
          var3 = this.field_d.J(param0 ^ 15);
          if (this.field_e &&
            var3 != null) {
            this.field_d.g(1, -123);
            this.field_d.a(var3, -111);
            this.field_d.g(0, -108);
            this.field_d.a(this.field_g.field_e, -107);
            var4 = this.field_f.field_b;
            jaggl.OpenGL.glUseProgramObjectARB(var4);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2]);
            jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_d.field_wc[1]));
            this.field_i = true;
          }
          return;
        }
    }

    fib(jp param0, asb param1, rga param2) {
        super(param0);
        ue var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        ue var6 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param2;
          if (param1 == null) {
            this.field_e = false;
            return;
          }
          if (!param0.field_Mc) {
            this.field_e = false;
            return;
          }
          if (!param0.field_Qc) {
            this.field_e = false;
            return;
          }
          var6 = gha.a(param1.a("environment_mapped_water_v", true, "gl"), 35633, (byte) -15, param0);
          var4 = var6;
          var5 = gha.a(param1.a("environment_mapped_water_f", true, "gl"), 35632, (byte) -15, param0);
          this.field_f = gnb.a(0, new ue[]{var6, var5}, param0);
          stackIn_8_1 = (this.field_f != null) && (this.field_g.b((byte) 63));
          this.field_e = stackIn_8_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("fib.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        if (param0 > -66) {
          field_j = (waa) null;
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
          this.field_i = true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        int var4Lifetime1;
        float var5Lifetime1;
        int var6Lifetime1;
        float var7Lifetime1;
        long var8Lifetime1;
        if (param2 == 5) {
          if (this.field_i) {
            var4 = 1 << (param1 & 3);
            var5 = (float)(1 << (7 & param1 >> 3)) / 32.0f;
            var6 = 65535 & param0;
            var7 = (float)((198236 & param0) >> 16) / 8.0f;
            var8 = this.field_f.field_b;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_d.field_pc % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
          }
          return;
        }
        this.a(8);
        if (this.field_i) {
          var4Lifetime1 = 1 << (param1 & 3);
          var5Lifetime1 = (float)(1 << (7 & param1 >> 3)) / 32.0f;
          var6Lifetime1 = 65535 & param0;
          var7Lifetime1 = (float)((198236 & param0) >> 16) / 8.0f;
          var8Lifetime1 = this.field_f.field_b;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "time"), (float)(var4Lifetime1 * this.field_d.field_pc % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "scale"), var5Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "breakWaterDepth"), (float)var6Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "breakWaterOffset"), var7Lifetime1);
        }
    }

    static {
        field_h = "Enlarges your ship";
    }
}
