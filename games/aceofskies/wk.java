/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends hh {
    private boolean field_e;
    static int field_f;
    private si field_i;
    static double field_g;
    private boolean field_h;
    private q[] field_d;

    final void a(int param0, int param1, rt param2) {
        try {
          this.field_a.a(param2, 1);
          if (param1 != -1486691000) {
            wd var5 = (wd) null;
            wk.a((String) null, 16, (String) null, (String) null, (wd) null, -73, false);
          }
          this.field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wk.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -65) {
          this.a((byte) 58, 85, 122);
          if (this.field_h) {
            this.field_a.a(false, 1);
            this.field_a.a(this.field_d[param1 - 1], 1);
            this.field_a.a(false, 0);
            return;
          }
          return;
        }
        if (!this.field_h) {
          return;
        }
        this.field_a.a(false, 1);
        this.field_a.a(this.field_d[param1 - 1], 1);
        this.field_a.a(false, 0);
    }

    final static boolean a(String param0, int param1, String param2, String param3, wd param4, int param5, boolean param6) {
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        try {
          if (ht.field_k != dk.field_h) {
            return false;
          }
          jq var8 = new jq(vn.field_f, param4);
          vn.field_f.a(var8, 0);
          if (AircraftDefinition.a(param5)) {
            var8.n(126);
            return true;
          }
          sd.field_h = param1;
          SpriteState.field_s = param6;
          ld.field_c = null;
          rt.field_e = param3;
          fs.field_g = param0;
          ht.field_k = jq.field_fb;
          nh.field_b = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var7;
          StringBuilder stackIn_13_1 = new StringBuilder().append("wk.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    wk(wl param0) {
        super(param0);
        String stackIn_36_2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var10 = 0.0f;
        this.field_h = false;
        try {
          if (param0.field_nc) {
            boolean stackIn_5_1 = !(param0.field_Xb >= 3);
            this.field_e = stackIn_5_1;
            int stackIn_8_0 = (!this.field_e) ? 127 : 48;
            int var2_int = stackIn_8_0;
            byte[][] var29 = new byte[6][4096];
            byte[][] var27 = new byte[6][4096];
            byte[][] var28 = new byte[6][4096];
            int var9 = 0;
            for (int var14 = 0; 64 > var14; var14++) {
              for (int var15 = 0; var15 < 64; var15++) {
                float var12 = (float)var14 * 2.0f / 64.0f - 1.0f;
                float var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                float var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                var11 = var11 * var13;
                var12 = var12 * var13;
                for (int var16 = 0; var16 < 6; var16++) {
                  if (var16 == 0) {
                    var10 = -var11;
                  } else if (var16 == 1) {
                    var10 = var11;
                  } else if (var16 == 2) {
                    var10 = var12;
                  } else if (var16 == 3) {
                    var10 = -var12;
                  } else if (var16 != 4) {
                    var10 = -var13;
                  } else {
                    var10 = var13;
                  }
                  if (0.0f < var10) {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
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
            this.field_d = new q[3];
            this.field_d[0] = new q(this.field_a, 6406, 64, false, var27, 6406);
            this.field_d[1] = new q(this.field_a, 6406, 64, false, var28, 6406);
            this.field_d[2] = new q(this.field_a, 6406, 64, false, var29, 6406);
            this.d((byte) -57);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_35_0 = var2;
          StringBuilder stackIn_35_1 = new StringBuilder().append("wk.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        this.field_a.a(8448, param0 ^ -30721, 7681);
        if (param0 != 4096) {
          wk.c((byte) 102);
        }
    }

    final boolean a(byte param0) {
        int var2 = -28 % ((-11 - param0) / 63);
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (null == this.field_i) {
          this.field_a.a(770, 34168, 0, (byte) 81);
          if (!param0) {
            return;
          }
          wk.c((byte) -106);
          return;
        }
        if (!param1) {
          this.field_a.a(770, 34168, 0, (byte) 81);
          if (!param0) {
            return;
          }
          wk.c((byte) -106);
          return;
        }
        if (!this.field_e) {
          this.field_a.a(false, 2);
          this.field_a.a(this.field_a.field_Vb, 1);
          this.field_a.a(false, 0);
        }
        this.field_i.a(-23085, '\0');
        this.field_h = true;
        if (!param0) {
          return;
        }
        wk.c((byte) -106);
    }

    private final void d(byte param0) {
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_i = new si(this.field_a, 2);
        this.field_i.a((byte) 125, 0);
        this.field_a.a(false, 1);
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
        if (this.field_e) {
          this.field_a.a(260, -26625, 7681);
          this.field_a.a(5890, 770, 34176, 0);
          this.field_a.a(770, 34167, 0, (byte) 75);
        } else {
          this.field_a.a(7681, -26625, 8448);
          this.field_a.a(34168, 768, 34176, 0);
          this.field_a.a(false, 2);
          this.field_a.a(260, -26625, 7681);
          this.field_a.a(34168, 768, param0 ^ -34233, 0);
          this.field_a.a(34168, 770, 34176, 1);
          this.field_a.a(770, 34167, 0, (byte) 107);
        }
        this.field_a.a(false, 0);
        this.field_i.b(false);
        this.field_i.a((byte) 37, 1);
        this.field_a.a(false, 1);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        if (param0 != -57) {
          this.a((byte) 89, 16, 11);
        }
        jaggl.OpenGL.glMatrixMode(5888);
        if (this.field_e) {
          this.field_a.a(8448, -26625, 8448);
          this.field_a.a(5890, 768, 34176, 0);
          this.field_a.a(770, 5890, 0, (byte) 108);
        } else {
          this.field_a.a(8448, -26625, 8448);
          this.field_a.a(5890, 768, 34176, 0);
          this.field_a.a(false, 2);
          this.field_a.a(8448, param0 - 26568, 8448);
          this.field_a.a(5890, 768, 34176, 0);
          this.field_a.a(34168, 768, param0 + 34233, 1);
          this.field_a.a(770, 5890, 0, (byte) 82);
        }
        this.field_a.a(false, 0);
        this.field_i.b(false);
    }

    final void b(byte param0) {
        if (!this.field_h) {
          this.field_a.a(770, 5890, 0, (byte) 94);
          this.field_a.a(8448, -26625, 8448);
          if (param0 <= 5) {
            wk.c((byte) 80);
            return;
          }
          return;
        }
        if (!this.field_e) {
          this.field_a.a(false, 2);
          this.field_a.a((rt) null, 1);
        } else {
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(false, 0);
          this.field_i.a(-23085, '\001');
          this.field_h = false;
          this.field_a.a(8448, -26625, 8448);
          if (param0 <= 5) {
            wk.c((byte) 80);
            return;
          }
          return;
        }
        this.field_a.a(false, 1);
        this.field_a.a((rt) null, 1);
        this.field_a.a(false, 0);
        this.field_i.a(-23085, '\001');
        this.field_h = false;
        this.field_a.a(8448, -26625, 8448);
        if (param0 > 5) {
          return;
        }
        wk.c((byte) 80);
    }

    final static void c(byte param0) {
        if (RendererManager.field_c >= 224) {
          ve.a((byte) 43, 256);
        } else {
          int var1 = RendererManager.field_c % 32;
          ve.a((byte) 43, -var1 + RendererManager.field_c + 32);
        }
        int var1Lifetime1 = -94 % ((param0 + 73) / 39);
    }

    static {
        field_f = 0;
        field_g = 0.0;
    }
}
