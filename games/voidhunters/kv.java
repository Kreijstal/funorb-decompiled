/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv extends qg {
    private rtb[] field_f;
    static volatile int field_e;
    private boolean field_c;
    private bt field_g;
    private boolean field_d;

    final void a(boolean param0, int param1) {
        if (param1 < 18) {
          this.field_d = true;
        }
        if (null != this.field_g &&
          param0) {
          if (!this.field_c) {
            this.field_b.h(33984, 2);
            this.field_b.a(64, this.field_b.field_qb);
            this.field_b.h(33984, 0);
          }
          this.field_g.a(true, '\0');
          this.field_d = true;
        } else {
          this.field_b.b(0, 770, 34168, 34184);
        }
    }

    final void a(int param0, byte param1, pib param2) {
        try {
          if (param1 != 125) {
            field_e = -96;
          }
          this.field_b.a(115, param2);
          this.field_b.c(param1 ^ 125, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kv.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        if (!this.field_d) {
          this.field_b.b(0, 770, 5890, 34184);
        } else {
          if (!this.field_c) {
            this.field_b.h(33984, 2);
            this.field_b.a(62, (pib) null);
          }
          this.field_b.h(33984, 1);
          this.field_b.a(param0 - 5852, (pib) null);
          this.field_b.h(33984, 0);
          this.field_g.a(true, '\001');
          this.field_d = false;
        }
        if (param0 != 5890) {
          return;
        }
        this.field_b.b(8448, 8448, false);
    }

    private final void d(int param0) {
        int var3 = VoidHunters.field_G;
        this.field_g = new bt(this.field_b, 2);
        this.field_g.a(param0 ^ 14647, 0);
        this.field_b.h(param0 + 48651, 1);
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
          this.field_b.b(7681, 8448, false);
          this.field_b.c(0, 34192, 768, 34168);
          this.field_b.h(33984, 2);
          this.field_b.b(260, 7681, false);
          this.field_b.c(0, param0 + 48859, 768, 34168);
          this.field_b.c(1, param0 ^ -48347, 770, 34168);
          this.field_b.b(0, 770, 34167, 34184);
        } else {
          this.field_b.b(260, 7681, false);
          this.field_b.c(0, 34192, 770, 5890);
          this.field_b.b(0, 770, 34167, 34184);
        }
        this.field_b.h(33984, 0);
        this.field_g.b(param0 + 19531);
        this.field_g.a(-96, 1);
        if (param0 != -14667) {
          faa var4 = (faa) null;
          kv.a(true, (faa) null);
        }
        this.field_b.h(param0 + 48651, 1);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.field_c) {
          this.field_b.b(8448, 8448, false);
          this.field_b.c(0, param0 + 48859, 768, 5890);
          this.field_b.h(param0 ^ -48523, 2);
          this.field_b.b(8448, 8448, false);
          this.field_b.c(0, param0 ^ -48347, 768, 5890);
          this.field_b.c(1, param0 ^ -48347, 768, 34168);
          this.field_b.b(0, 770, 5890, 34184);
        } else {
          this.field_b.b(8448, 8448, false);
          this.field_b.c(0, 34192, 768, 5890);
          this.field_b.b(0, 770, 5890, 34184);
        }
        this.field_b.h(param0 + 48651, 0);
        this.field_g.b(param0 + 19531);
    }

    final boolean b(int param0) {
        if (param0 >= -87) {
          this.b(8);
          return true;
        }
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          this.a(53);
        }
        this.field_b.b(8448, 7681, false);
    }

    kv(OpenGlToolkit param0) {
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
        this.field_d = false;
        try {
          if (param0.field_S) {
            stackIn_5_1 = !(param0.field_Dc >= 3);
            this.field_c = stackIn_5_1;
            stackIn_8_0 = (this.field_c) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            for (var14 = 0; 64 > var14; var14++) {
              for (var15 = 0; 64 > var15; var15++) {
                var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                var11 = (float)var15 * 2.0f / 64.0f - 1.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (0 == var16) {
                    var10 = -var11;
                  } else {
                    if (var16 == 1) {
                      var10 = var11;
                    } else {
                      if (2 == var16) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      }
                    }
                  }
                  if (var10 > 0.0f) {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  } else {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  }
                  var27[var16][var9] = (byte)var6;
                  var28[var16][var9] = (byte)var7;
                  var29[var16][var9] = (byte)var8;
                }
                var9++;
              }
            }
            this.field_f = new rtb[3];
            this.field_f[0] = new rtb(this.field_b, 6406, 64, false, var27, 6406);
            this.field_f[1] = new rtb(this.field_b, 6406, 64, false, var28, 6406);
            this.field_f[2] = new rtb(this.field_b, 6406, 64, false, var29, 6406);
            this.d(-14667);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("kv.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25139) {
          return;
        }
        if (this.field_d) {
          this.field_b.h(param1 + 59123, 1);
          this.field_b.a(65, this.field_f[-1 + param0]);
          this.field_b.h(param1 ^ -59123, 0);
        }
    }

    final static boolean a(boolean param0, faa param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_e = -61;
          }
          stackIn_5_0 = (param1.i(0, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kv.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_e = -1;
    }
}
