/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    nh field_e;
    nh field_f;
    static ri[] field_c;
    boolean field_g;
    private aw field_a;
    ru[] field_d;
    private ru[] field_b;

    final boolean a(int param0) {
        byte[] var22 = null;
        byte[] var19 = null;
        byte[] var18 = null;
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var17 = null;
        byte[] var24 = null;
        byte[] var21 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        byte[] var2 = null;
        int var16 = Sumoblitz.field_L ? 1 : 0;
        byte[] var2Lifetime1;
        if (this.field_e == null) {
          if (ab.field_b == null) {
            var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
            var19 = var22;
            var18 = var19;
            var2 = var18;
            ab.field_b = aj.a((byte) -121, var22, false);
          }
          var23 = ab.a(false, ab.field_b, 0);
          var20 = var23;
          var17 = var20;
          var2Lifetime1 = var17;
          var24 = new byte[4 * var23.length];
          var21 = var24;
          var3 = var21;
          var4 = 0;
          for (var5 = 0; 16 > var5; var5++) {
            var6 = 16384 * var5;
            var7 = var6;
            for (var8 = 0; var8 < 128; var8++) {
              var9 = var7 + var8 * 128;
              var10 = var7 + (127 & var8 - 1) * 128;
              var11 = 128 * (1 + var8 & 127) + var7;
              for (var12 = 0; var12 < 128; var12++) {
                var13 = (float)((var2Lifetime1[var12 + var10] & 255) - (var2Lifetime1[var12 + var11] & 255));
                var14 = (float)((var2Lifetime1[(var12 - 1 & 127) + var9] & 255) - (255 & var2Lifetime1[var9 + (127 & var12 + 1)]));
                var15 = (float)(128.0 / Math.sqrt((double)(16384.0f + var14 * var14 + var13 * var13)));
                incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = (byte)(int)(127.0f + var15 * var14);
                incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = (byte)(int)(127.0f + 128.0f * var15);
                incrementValue$2 = var4;
                var4++;
                var3[incrementValue$2] = (byte)(int)(var13 * var15 + 127.0f);
                var3[var4++] = var2Lifetime1[var6++];
              }
            }
          }
          this.field_e = this.field_a.a(true, nl.field_p, 16, 128, var24, 128);
        }
        if (param0 > -120) {
          this.field_g = true;
        }
        return this.field_e != null ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= 14) {
          return false;
        }
        return !this.field_g ? this.field_d != null ? true : false : null != this.field_f ? true : false;
    }

    public static void b(int param0) {
        if (param0 != 128) {
          sk.b(-102);
        }
        field_c = null;
    }

    final static mk a(fr param0, boolean param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        mk stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        mk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
          jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, cl.field_z, 0);
          if (param1) {
            stackIn_2_0 = (mk) null;
            return stackIn_2_0;
          }
          if (cl.field_z[0] == 0) {
            if (cl.field_z[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, cl.field_z, 1);
            if (cl.field_z[1] > 1) {
              var10 = new byte[cl.field_z[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, cl.field_z[1], cl.field_z, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (0 == cl.field_z[0]) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_13_0 = null;
              return (mk) (stackIn_13_0);
            }
          }
          stackIn_15_0 = new mk(param0, var4_long, param2);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sk.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    sk(aw param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var2_intLifetime1;
        this.field_e = null;
        this.field_f = null;
        this.field_d = null;
        this.field_b = null;
        try {
          this.field_a = param0;
          this.field_g = this.field_a.field_Eb;
          if (this.field_g &&
            !this.field_a.a((byte) -42, io.field_g, ps.field_c)) {
            this.field_g = false;
          }
          if (!this.field_g &&
            !this.field_a.a(io.field_g, ps.field_c, 6)) {
            return;
          }
          as.f(23369);
          if (!this.field_g) {
            this.field_d = new ru[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var17 = iq.a(pd.field_n, 14381, 32768, var2_int * 32768);
              this.field_d[var2_int] = this.field_a.a(var17, 128, 128, ps.field_c, 0, true);
            }
            this.field_b = new ru[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var18 = iq.a(mk.field_d, 14381, 32768, 32768 * var2_intLifetime1);
              this.field_b[var2_intLifetime1] = this.field_a.a(var18, 128, 128, ps.field_c, 0, true);
            }
            return;
          }
          var15 = ab.a(false, pd.field_n, 0);
          this.field_f = this.field_a.a(true, ps.field_c, 16, 128, var15, 128);
          var16 = ab.a(false, mk.field_d, 0);
          this.field_a.a(true, ps.field_c, 16, 128, var16, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("sk.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
