/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj implements up {
    private int field_f;
    private int field_a;
    private int field_d;
    private int field_b;
    private ws[] field_g;
    private wl field_e;
    private int field_c;
    private int field_h;

    public final void b(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 != 10383) {
          this.field_e = (wl) null;
        }
        this.field_a = this.field_a & -5;
        this.field_c = this.d(-15395);
    }

    private final void a(int param0, int param1, int param2, nr param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (-1 == this.field_c) {
            throw new RuntimeException();
          }
          var5_int = 1 << param2;
          if (param0 != (~var5_int & this.field_b)) {
            if (this.field_h != param3.field_m ||
              param3.field_k != this.field_f) {
              throw new RuntimeException();
            }
          } else {
            this.field_f = param3.field_k;
            this.field_h = param3.field_m;
          }
          param3.a(fo.field_f[param2], param0 + 0, param1, this.field_c);
          this.field_g[param2] = (ws) ((Object) param3);
          this.field_b = this.field_b | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("wj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wu var4_ref_wu = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        wu var17 = null;
        int var19 = 0;
        jt var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          qg.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = gp.field_y.length;
          var22 = new int[var1_int];
          var21 = var22;
          var2 = var21;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_wu = gp.field_y[var3];
            var4_ref_wu.b(32767);
            kg.a(0, var3);
            var5 = var4_ref_wu.field_b + var4_ref_wu.field_N >> 1;
            var6 = var4_ref_wu.field_h + var4_ref_wu.field_J >> 1;
            var7 = var4_ref_wu.field_A + var4_ref_wu.field_s >> 1;
            var8 = qg.field_e[9] >> 2;
            var9 = qg.field_e[10] >> 2;
            var10_int = qg.field_e[11] >> 2;
            var11 = var10_int * PacketBuffer.field_k[5] + var8 * PacketBuffer.field_k[3] + PacketBuffer.field_k[4] * var9 >> 14;
            var12 = var9 * PacketBuffer.field_k[7] + var8 * PacketBuffer.field_k[6] + var10_int * PacketBuffer.field_k[8] >> 14;
            var13 = var8 * PacketBuffer.field_k[9] + PacketBuffer.field_k[10] * var9 + var10_int * PacketBuffer.field_k[11] >> 14;
            var2[var3] = var11 * var5 - (-(var12 * var6) - var7 * var13) >> 16;
          }
          var3Lifetime1 = qg.field_e[9] >> 8;
          var4 = qg.field_e[10] >> 8;
          var5Lifetime1 = qg.field_e[11] >> 8;
          var6Lifetime1 = it.field_c << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = tg.a(var6Lifetime1, -4097) >> 8;
          var9Lifetime1 = u.a(-108, var6Lifetime1) >> 8;
          if (ic.field_b != -1 &&
            -1 != cf.field_g) {
            var7Lifetime1 = -320 + ic.field_b;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - cf.field_g;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          if (param0 > -106) {
            var20 = (jt) null;
            wj.a(-122, (rk) null, (java.awt.Component) null, 3, true, (jt) null, -104, 35);
          }
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; gp.field_y.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; gp.field_y.length > var17_int; var17_int++) {
              if (var22[var16] < var22[var17_int]) {
                var16 = var17_int;
              }
            }
            var22[var16] = -2147483648;
            var17 = gp.field_y[var16];
            kg.a(0, var16);
            for (var18 = 0; 3 > var18; var18++) {
              PacketBuffer.field_k[var18] = PacketBuffer.field_k[var18] + ia.field_a[var15][var18];
            }
            eg.a(var17, qg.field_e, 45, true, false, PacketBuffer.field_k, false);
            hg.a(var14, var8Lifetime1, var13Lifetime1, var12Lifetime1, var9Lifetime1, 255, var7Lifetime1, var17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "wj.N(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (null != this.field_g[param0]) {
          this.field_g[param0].a((byte) 11);
        }
        if (param1 > -17) {
          this.field_f = -115;
        }
        this.field_b = this.field_b & ~(1 << param0);
        this.field_g[param0] = null;
    }

    private final int d(int param0) {
        if (0 != (this.field_a & 4)) {
          return 36160;
        }
        if ((this.field_a & 2) != 0) {
          return 36009;
        }
        if (0 != (this.field_a & 1)) {
          return 36008;
        }
        if (param0 != -15395) {
          this.c((byte) -77);
        }
        return -1;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, this.field_d);
        this.field_a = this.field_a | 4;
        if (param0 != -19065) {
          return;
        }
        this.field_c = this.d(-15395);
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, this.field_d);
        this.field_a = this.field_a | 1;
        if (param0 <= 79) {
          return;
        }
        this.field_c = this.d(-15395);
    }

    final void a(int param0, nr param1, int param2) {
        if (param2 != -5531) {
          return;
        }
        try {
          this.a(0, 0, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wj.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(cu param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_c == -1) {
            throw new RuntimeException();
          }
          var4_int = 1 << param1;
          if ((this.field_b & ~var4_int) != 0) {
            if (this.field_h != param0.field_u ||
              this.field_f != param0.field_v) {
              throw new RuntimeException();
            }
          } else {
            this.field_h = param0.field_u;
            this.field_f = param0.field_v;
          }
          param0.a(this.field_c, -12658, fo.field_f[param1]);
          this.field_g[param1] = (ws) ((Object) param0);
          this.field_b = this.field_b | var4_int;
          if (param2 != 119) {
            this.field_h = -18;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wj.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_d);
        if (param0 != -1122) {
          this.field_a = 59;
        }
        this.field_a = this.field_a | 2;
        this.field_c = this.d(-15395);
    }

    protected final void finalize() throws Throwable {
        this.field_e.a((byte) -85, this.field_d);
        super.finalize();
    }

    final static void a(int param0, rk param1, java.awt.Component param2, int param3, boolean param4, jt param5, int param6, int param7) {
        try {
          tk.a(param3, param4, 10);
          um.field_m = tk.a(param1, param2, 0, param6);
          BitmapFont.field_a = tk.a(param1, param2, 1, param7);
          qn.pcmMixer = new PcmStreamMixer();
          int var8_int = -86 % ((param0 + 12) / 37);
          Vector2.field_c = param7;
          BitmapFont.field_a.a(qn.pcmMixer);
          wt.field_e = param5;
          wt.field_e.a((byte) 125, RendererManager.field_c);
          um.field_m.a(wt.field_e);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean d(byte param0) {
        int var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_c);
        if (param0 != -64) {
          return true;
        }
        if (var2 != 36053) {
          return false;
        }
        return true;
    }

    public final void b(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        this.field_a = this.field_a & -3;
        int var2 = -33 / ((-88 - param0) / 38);
        this.field_c = this.d(-15395);
    }

    final static void e(int param0) {
        ul.field_r.field_j = 0;
        ul.field_r.field_e = 0;
        if (param0 <= 74) {
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 <= 65) {
          this.field_h = 108;
        }
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        this.field_a = this.field_a & -2;
        this.field_c = this.d(-15395);
    }

    wj(wl param0) {
        this.field_a = 0;
        this.field_c = -1;
        this.field_g = new ws[9];
        try {
          if (!param0.field_A) {
            throw new IllegalStateException("");
          }
          this.field_e = param0;
          jaggl.OpenGL.glGenFramebuffersEXT(1, ho.field_c, 0);
          this.field_d = ho.field_c[0];
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
