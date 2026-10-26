/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends sk {
    static as field_j;
    private io field_h;
    private boolean field_i;
    private em field_f;
    private boolean field_g;

    final void a(int param0, int param1, jj param2) {
        String stackIn_9_2 = null;
        try {
          if (!this.field_i) {
            this.field_b.a(param2, -9135);
            this.field_b.b(param0, false);
          }
          if (param1 > 66) {
            return;
          }
          field_j = (as) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("lo.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.a(true);
        }
    }

    public static void c(byte param0) {
        if (param0 <= 115) {
          lo.c((byte) 61);
          field_j = null;
          return;
        }
        field_j = null;
    }

    lo(jc param0, ResourceArchive param1, em param2) {
        super(param0);
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        try {
          this.field_f = param2;
          if (param1 == null) {
            this.field_g = false;
            return;
          }
          if (!param0.field_rc) {
            this.field_g = false;
            return;
          }
          if (!param0.field_Nc) {
            this.field_g = false;
            return;
          }
          vj var6 = RendererManager.a((byte) 29, 35633, param1.a("gl", (byte) -71, "environment_mapped_water_v"), param0);
          vj var4 = var6;
          vj var5 = RendererManager.a((byte) 29, 35632, param1.a("gl", (byte) -71, "environment_mapped_water_f"), param0);
          this.field_h = mo.a(0, param0, new vj[]{var6, var5});
          boolean stackIn_12_1 = (null != this.field_h) && (this.field_f.a(0));
          this.field_g = stackIn_12_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("lo.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == 1786747298) {
          if (this.field_i) {
            int var4 = 1 << (param1 & 3);
            float var5 = (float)(1 << ((param1 & 58) >> 3)) / 32.0f;
            int var6 = param2 & 65535;
            float var7 = (float)((param2 & 246595) >> 16) / 8.0f;
            long var8 = this.field_h.field_d;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_b.field_r * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
          }
          return;
        }
        this.field_h = (io) null;
        if (this.field_i) {
          int var4Lifetime1 = 1 << (param1 & 3);
          float var5Lifetime1 = (float)(1 << ((param1 & 58) >> 3)) / 32.0f;
          int var6Lifetime1 = param2 & 65535;
          float var7Lifetime1 = (float)((param2 & 246595) >> 16) / 8.0f;
          long var8Lifetime1 = this.field_h.field_d;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "time"), (float)(this.field_b.field_r * var4Lifetime1 % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "scale"), var5Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "breakWaterDepth"), (float)var6Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8Lifetime1, "breakWaterOffset"), var7Lifetime1);
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          this.field_h = (io) null;
          return this.field_g;
        }
        return this.field_g;
    }

    final void a(boolean param0, byte param1) {
        if (param1 < 2) {
          field_j = (as) null;
          go var3 = this.field_b.O(29190);
          if (this.field_g) {
            if (var3 != null) {
              this.field_b.a(1, (byte) 125);
              this.field_b.a(var3, -9135);
              this.field_b.a(0, (byte) 59);
              this.field_b.a(this.field_f.field_a, -9135);
              long var4 = this.field_h.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_b.field_Jb[1]));
              this.field_i = true;
            }
            return;
          }
          return;
        }
        go var3Lifetime1 = this.field_b.O(29190);
        if (!this.field_g) {
          return;
        }
        if (var3Lifetime1 != null) {
          this.field_b.a(1, (byte) 125);
          this.field_b.a(var3Lifetime1, -9135);
          this.field_b.a(0, (byte) 59);
          this.field_b.a(this.field_f.field_a, -9135);
          long var4Lifetime1 = this.field_h.field_d;
          jaggl.OpenGL.glUseProgramObjectARB(var4Lifetime1);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4Lifetime1, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4Lifetime1, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4Lifetime1, "sunDir"), -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4Lifetime1, "sunColour"), this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4Lifetime1, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_b.field_Jb[1]));
          this.field_i = true;
          return;
        }
    }

    final void a(boolean param0) {
        if (this.field_i) {
          this.field_b.a(1, (byte) 52);
          this.field_b.a((jj) null, -9135);
          this.field_b.a(0, (byte) 27);
          this.field_b.a((jj) null, -9135);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_i = false;
          if (!param0) {
            jj var3 = (jj) null;
            this.a(87, -111, (jj) null);
            return;
          }
          return;
        }
        if (param0) {
          return;
        }
        jj var3Lifetime1 = (jj) null;
        this.a(87, -111, (jj) null);
    }

    static {
        field_j = new as();
    }
}
