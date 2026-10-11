/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends bq {
    private boolean field_j;
    private hp[] field_e;
    static rj field_i;
    private tq field_f;
    private boolean field_g;
    static int[] field_h;

    final boolean b(byte param0) {
        if (param0 >= -64) {
          return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        try {
          this.field_b.a(33, param2);
          this.field_b.c(param1, true);
          if (param0 != 35) {
            this.a((byte) 46, 96, -43);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wt.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8193) {
          field_h = (int[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b.a(20685, 7681, 8448);
        if (param0 >= -30) {
          field_h = (int[]) null;
        }
    }

    private final void d(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_f = new tq(this.field_b, 2);
        this.field_f.a(0, 4864);
        this.field_b.g(1, 98);
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
        if (!this.field_j) {
          this.field_b.a(20685, 8448, 7681);
          this.field_b.b(34168, 768, 0, 30);
          this.field_b.g(2, 123);
          this.field_b.a(20685, 7681, 260);
          this.field_b.b(34168, 768, 0, 4);
          this.field_b.b(34168, 770, 1, 20);
          this.field_b.a(125, 0, 34167, 770);
        } else {
          this.field_b.a(20685, 7681, 260);
          this.field_b.b(5890, 770, 0, -20);
          this.field_b.a(117, 0, 34167, 770);
        }
        this.field_b.g(0, 83);
        this.field_f.a(true);
        this.field_f.a(1, 4864);
        if (param0 > -116) {
          field_i = (rj) null;
        }
        this.field_b.g(1, 102);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.field_j) {
          this.field_b.a(20685, 8448, 8448);
          this.field_b.b(5890, 768, 0, -120);
          this.field_b.g(2, 111);
          this.field_b.a(20685, 8448, 8448);
          this.field_b.b(5890, 768, 0, 20);
          this.field_b.b(34168, 768, 1, -126);
          this.field_b.a(114, 0, 5890, 770);
        } else {
          this.field_b.a(20685, 8448, 8448);
          this.field_b.b(5890, 768, 0, -118);
          this.field_b.a(122, 0, 5890, 770);
        }
        this.field_b.g(0, 81);
        this.field_f.a(true);
    }

    wt(fr param0) {
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
        this.field_g = false;
        try {
          if (param0.field_Ob) {
            stackIn_5_1 = !(param0.field_T >= 3);
            this.field_j = stackIn_5_1;
            stackIn_8_0 = (this.field_j) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            for (var14 = 0; 64 > var14; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (var16 == 1) {
                      var10 = var11;
                    } else {
                      if (var16 != 2) {
                        if (3 == var16) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      } else {
                        var10 = var12;
                      }
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(0.0f < var10)) {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  }
                  var27[var16][var9] = (byte)var6;
                  var28[var16][var9] = (byte)var7;
                  var29[var16][var9] = (byte)var8;
                }
                var9++;
              }
            }
            this.field_e = new hp[3];
            this.field_e[0] = new hp(this.field_b, 6406, 64, false, var27, 6406);
            this.field_e[1] = new hp(this.field_b, 6406, 64, false, var28, 6406);
            this.field_e[2] = new hp(this.field_b, 6406, 64, false, var29, 6406);
            this.d(-125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("wt.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 > -17) {
          return;
        }
        field_i = null;
        field_h = null;
    }

    final void b(int param0) {
        if (this.field_g) {
          if (!this.field_j) {
            this.field_b.g(2, 124);
            this.field_b.a(39, (ht) null);
          }
          this.field_b.g(1, 91);
          this.field_b.a(59, (ht) null);
          this.field_b.g(0, 92);
          this.field_f.a((byte) 121, '\001');
          this.field_g = false;
        } else {
          this.field_b.a(118, 0, 5890, 770);
        }
        this.field_b.a(20685, 8448, 8448);
        if (param0 > -125) {
          this.field_e = (hp[]) null;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 <= 33) {
          wt.c(-77);
        }
        if (this.field_f != null &&
          param1) {
          if (!this.field_j) {
            this.field_b.g(2, 89);
            this.field_b.a(101, this.field_b.field_n);
            this.field_b.g(0, 105);
          }
          this.field_f.a((byte) 121, '\0');
          this.field_g = true;
        } else {
          this.field_b.a(124, 0, 34168, 770);
        }
    }

    final static void a(int param0, byte param1) {
        ut.a(8, (byte) -55, nt.field_m[param0], true);
        if (param1 < 27) {
          field_i = (rj) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_g) {
          this.field_b.g(1, 122);
          this.field_b.a(107, this.field_e[param1 - 1]);
          this.field_b.g(0, 95);
        }
        if (param0 < 39) {
          wt.c(-83);
        }
    }

    static {
        field_h = new int[]{1, 1, 1};
    }
}
