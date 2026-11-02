/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cpa extends qe {
    private hoa[] field_d;
    private boolean field_c;
    private tla field_f;
    private boolean field_e;

    final void a(int param0, int param1, kl param2) {
        try {
          this.field_a.a(true, param2);
          this.field_a.d(1, param0);
          if (param1 != 32221) {
            this.field_f = (tla) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cpa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_f = new tla(this.field_a, 2);
        this.field_f.a((byte) 6, 0);
        this.field_a.e(1, true);
        jaggl.OpenGL.glTexGeni(8192, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8193, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8194, 9472, 34065);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glEnable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRotatef(22.5f, 1.0f, 0.0f, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.field_c) {
          this.field_a.b(7681, param0 + 9035, 8448);
          this.field_a.c(0, 0, 34168, 768);
          this.field_a.e(2, true);
          this.field_a.b(260, param0 ^ -9035, 7681);
          this.field_a.c(0, 0, 34168, 768);
          this.field_a.c(1, 0, 34168, 770);
          this.field_a.b(34167, param0 + 78, 0, 770);
        } else {
          this.field_a.b(260, 8960, 7681);
          this.field_a.c(0, 0, 5890, 770);
          this.field_a.b(34167, 3, 0, 770);
        }
        this.field_a.e(0, true);
        this.field_f.b((byte) -92);
        this.field_f.a((byte) 6, 1);
        this.field_a.e(1, true);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.field_c) {
          this.field_a.b(8448, param0 + 9035, 8448);
          this.field_a.c(0, 0, 5890, 768);
          this.field_a.e(2, true);
          this.field_a.b(8448, 8960, 8448);
          this.field_a.c(0, 0, 5890, 768);
          this.field_a.c(1, param0 ^ -75, 34168, 768);
          this.field_a.b(5890, 3, 0, 770);
        } else {
          this.field_a.b(8448, 8960, 8448);
          this.field_a.c(0, 0, 5890, 768);
          this.field_a.b(5890, param0 ^ -74, 0, 770);
        }
        this.field_a.e(0, true);
        this.field_f.b((byte) -104);
        if (param0 != -75) {
          this.b(-115);
        }
    }

    final void a(boolean param0, int param1) {
        int var3;
        if (this.field_f != null &&
          param0) {
          if (!this.field_c) {
            this.field_a.e(2, true);
            this.field_a.a(true, this.field_a.field_lc);
            this.field_a.e(0, true);
          }
          this.field_f.a(4864, '\0');
          this.field_e = true;
        } else {
          this.field_a.b(34168, 3, 0, 770);
        }
        var3 = -100 / ((param1 - 56) / 48);
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_e) {
          this.field_a.e(1, true);
          this.field_a.a(true, this.field_d[-1 + param0]);
          this.field_a.e(0, true);
        }
        if (param2 <= 117) {
          this.a((byte) -84);
        }
    }

    final static fca a(int param0, OpenGlToolkit param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        String var7 = null;
        byte[] var11 = null;
        Object stackIn_10_0 = null;
        fca stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 64) {
            var7 = (String) null;
            cpa.a(-65, (OpenGlToolkit) null, -121, (String) null);
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
          jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, oma.field_I, 0);
          if (oma.field_I[0] == 0) {
            if (oma.field_I[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, oma.field_I, 1);
            if (oma.field_I[1] > 1) {
              var11 = new byte[oma.field_I[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, oma.field_I[1], oma.field_I, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (oma.field_I[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_10_0 = null;
              return (fca) (stackIn_10_0);
            }
          }
          stackIn_12_0 = new fca(param1, var4_long, param2);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("cpa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (!this.field_e) {
          this.field_a.b(5890, 3, 0, 770);
        } else {
          if (!this.field_c) {
            this.field_a.e(2, !param0 ? true : false);
            this.field_a.a(true, (kl) null);
          }
          this.field_a.e(1, true);
          this.field_a.a(true, (kl) null);
          this.field_a.e(0, !param0 ? true : false);
          this.field_f.a(4864, '\001');
          this.field_e = false;
        }
        this.field_a.b(8448, 8960, 8448);
        if (param0) {
          this.field_d = (hoa[]) null;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
          return false;
        }
        return true;
    }

    final void b(boolean param0, int param1) {
        this.field_a.b(8448, 8960, 7681);
        if (param1 <= 77) {
          this.field_f = (tla) null;
        }
    }

    cpa(OpenGlToolkit param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        byte[][] var27 = null;
        byte[][] var28 = null;
        byte[][] var29 = null;
        this.field_e = false;
        try {
          if (param0.field_Kc) {
            stackIn_5_1 = !(3 <= param0.field_Ic);
            this.field_c = stackIn_5_1;
            stackIn_8_0 = (this.field_c) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (1.0f + var11 * var11))));
                var11 = var11 * var13;
                var12 = var12 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (0 == var16) {
                    var10 = -var11;
                  } else {
                    if (1 == var16) {
                      var10 = var11;
                    } else {
                      if (var16 != 2) {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 != 4) {
                            var10 = -var13;
                          } else {
                            var10 = var13;
                          }
                        }
                      } else {
                        var10 = var12;
                      }
                    }
                  }
                  if (0.0f < var10) {
                    var6 = (int)((double)var2_int * Math.pow((double)var10, 96.0));
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                  } else {
                    var7 = 0;
                    var8 = 0;
                    var6 = 0;
                  }
                  var27[var16][var9] = (byte)var6;
                  var28[var16][var9] = (byte)var7;
                  var29[var16][var9] = (byte)var8;
                }
                var9++;
              }
            }
            this.field_d = new hoa[3];
            this.field_d[0] = new hoa(this.field_a, 6406, 64, false, var27, 6406);
            this.field_d[1] = new hoa(this.field_a, 6406, 64, false, var28, 6406);
            this.field_d[2] = new hoa(this.field_a, 6406, 64, false, var29, 6406);
            this.a((byte) -75);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("cpa.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
    }
}
