/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aia extends pib {
    int field_h;
    int field_j;
    private int field_k;
    private int field_i;

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param3 * param4, param5);
        int var12 = 0;
        int var15 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var13 = 0;
        int var14 = 0;
        int[] var17 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          this.field_h = param3;
          this.field_j = param4;
          if (param9) {
            var17 = new int[param6.length];
            var11 = var17;
            for (var12 = 0; var12 < param4; var12++) {
              var13 = var12 * param3;
              var14 = (param4 - var12 - 1) * param3;
              for (var15 = 0; param3 > var15; var15++) {
                var17[var13++] = param6[var14++];
              }
            }
            param6 = var17;
          }
          this.field_g.a(57, (pib) (this));
          if (34037 != this.field_b &&
            param5 &&
            0 == param7 &&
            param8 == 0) {
            jdb.a(param6, this.field_g.field_cc, 29175, this.field_d, this.field_b, 32993, this.field_j, this.field_h);
            this.a((byte) 62, true);
          } else {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Di(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, 32993, this.field_g.field_cc, param6, param8 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            this.a((byte) 62, false);
          }
          this.a(62, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_19_0 = var11_ref;
          stackIn_19_1 = new StringBuilder().append("aia.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 != 10497) {
          return;
        }
        if (this.field_b == 3553) {
          this.field_g.a(116, (pib) (this));
          jaggl.OpenGL.glTexParameteri(this.field_b, 10242, !param1 ? 33071 : 10497);
          jaggl.OpenGL.glTexParameteri(this.field_b, 10243, !param0 ? 33071 : 10497);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int[] param8) {
        int var11 = 0;
        int var14 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        try {
          if (param1 == 0) {
            param1 = param2;
          }
          if (param7) {
            var10 = new int[param2 * param4];
            for (var11 = 0; var11 < param4; var11++) {
              var12 = var11 * param2;
              var13 = param6 + (-var11 + param4 - 1) * param1;
              for (var14 = 0; var14 < param2; var14++) {
                var10[var12++] = param8[var13++];
              }
            }
            param8 = var10;
          }
          if (param0 != 32) {
            return;
          }
          this.field_g.a(97, (pib) (this));
          if (param2 != param1) {
            jaggl.OpenGL.glPixelStorei(3314, param1);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.field_b, 0, param5, this.field_j - param3 - param4, param2, param4, 32993, this.field_g.field_cc, param8, param6);
          if (param1 != param2) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_23_0 = var10_ref;
          stackIn_23_1 = new StringBuilder().append("aia.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_i, this.field_k, this.field_b, 0, 0);
        if (param0 != 31294) {
          this.a(3, 70, -60, -31, 85, 83, 30);
        }
        this.field_i = -1;
        this.field_k = -1;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param1, this.field_b, this.field_c, param2);
        this.field_k = param1;
        this.field_i = param0;
        if (param3) {
          this.field_k = -5;
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
        int var11 = 0;
        int var14 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var10 = null;
        RuntimeException var10_ref = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var16 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          this.field_h = param3;
          this.field_j = param4;
          if (param8) {
            var16 = new byte[param6.length];
            var10 = var16;
            for (var11 = 0; param4 > var11; var11++) {
              var12 = var11 * param3;
              var13 = param3 * (-var11 + (param4 - 1));
              for (var14 = 0; param3 > var14; var14++) {
                var16[var12++] = param6[var13++];
              }
            }
            param6 = var16;
          }
          this.field_g.a(118, (pib) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (param5 &&
            this.field_b != 34037) {
            ue.a(param6, 0, param7, param1, param2, param3, param4);
            this.a((byte) 62, true);
          } else {
            jaggl.OpenGL.glTexImage2Dub(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, param7, 5121, param6, 0);
            this.a((byte) 62, false);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(-79, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_17_0 = var10_ref;
          stackIn_17_1 = new StringBuilder().append("aia.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int var15 = 0;
        int var18 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          if (param4 == 0) {
            param4 = param5;
          }
          if (param8) {
            var11_int = pu.a((byte) -122, param1);
            var12 = var11_int * param5;
            var13 = var11_int * param4;
            var14 = new byte[var12 * param0];
            for (var15 = 0; param0 > var15; var15++) {
              var16 = var15 * var12;
              var17 = (param0 - (var15 + 1)) * var13 + param2;
              for (var18 = 0; var18 < var12; var18++) {
                var14[var16++] = param3[var17++];
              }
            }
            param3 = var14;
          }
          this.field_g.a(95, (pib) (this));
          jaggl.OpenGL.glPixelStorei(3317, param9);
          if (param5 != param4) {
            jaggl.OpenGL.glPixelStorei(3314, param4);
          }
          jaggl.OpenGL.glTexSubImage2Dub(this.field_b, 0, param7, param6, param5, param0, param1, 5121, param3, param2);
          if (param4 != param5) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_21_0 = var11;
          stackIn_21_1 = new StringBuilder().append("aia.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        this.field_k = -1;
        this.field_i = -1;
        try {
          this.field_j = param4;
          this.field_h = param3;
          this.field_g.a(102, (pib) (this));
          jaggl.OpenGL.glTexImage2Dub(this.field_b, 0, this.field_d, param3, param4, 0, fsb.a(this.field_d, false), 5121, (byte[]) null, 0);
          this.a(-96, true);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          this.field_j = param4;
          this.field_h = param3;
          this.field_g.a(100, (pib) (this));
          if (param5 &&
            this.field_b != 34037) {
            co.a(param7, param2, param3, param1, param4, param6, -29702);
            this.a((byte) 62, true);
          } else {
            jaggl.OpenGL.glTexImage2Df(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, param7, 5126, param6, 0);
            this.a((byte) 62, false);
          }
          this.a(-86, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("aia.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -param6 - (param3 - this.field_g.field_Y);
        this.field_g.a(121, (pib) (this));
        jaggl.OpenGL.glCopyTexSubImage2D(this.field_b, 0, param2, this.field_j - param3 - param1, param5, var8, param4, param3);
        int var9 = -33 / ((-65 - param0) / 43);
        jaggl.OpenGL.glFlush();
    }

    static {
    }
}
