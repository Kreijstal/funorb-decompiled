/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends RenderSprite {
    private int field_k;
    private int field_a;
    private int field_b;
    el field_j;
    private wl field_g;
    private el field_f;
    private boolean field_e;
    private int field_c;
    private int field_d;
    static ia field_h;
    static int[] field_l;
    static int field_i;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_j.a(false, -128);
        this.field_g.g(1025208104);
        this.field_g.b((byte) -113, param4);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        param0 = param0 + this.field_c;
        param1 = param1 + this.field_a;
        if (this.field_f != null) {
          this.a(false, param2);
          this.field_f.a(false, -128);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_j.field_p);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, this.field_j.field_o + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
          jaggl.OpenGL.glVertex2i(this.field_j.field_q + param0, this.field_j.field_o + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, this.field_j.field_p);
          jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
          jaggl.OpenGL.glVertex2i(this.field_j.field_q + param0, param1);
          jaggl.OpenGL.glEnd();
          this.b(118);
        } else {
          this.field_g.a(this.field_j, 1);
          this.field_g.a(param2, (byte) -39);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, param1 + this.field_j.field_o);
          jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
          jaggl.OpenGL.glVertex2i(param0 + this.field_j.field_q, param1 + this.field_j.field_o);
          jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
          jaggl.OpenGL.glVertex2i(param0 + this.field_j.field_q, param1);
          jaggl.OpenGL.glEnd();
        }
    }

    final int c() {
        return this.field_b + (this.field_j.field_o + this.field_a);
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_7_1 = false;
        this.field_d = param2;
        this.field_a = param1;
        this.field_c = param0;
        this.field_b = param3;
        stackIn_7_1 = (this.field_c != 0) || (this.field_a != 0) || (this.field_d != 0) || (this.field_b != 0);
        this.field_e = stackIn_7_1;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var11Lifetime1;
        float var12Lifetime1;
        if (this.field_e) {
          var11 = (float)this.d();
          var12 = (float)this.c();
          var13 = (param2 - param0) / var11;
          var14 = (param3 - param1) / var11;
          var15 = (-param0 + param4) / var12;
          var16 = (param5 - param1) / var12;
          var17 = var15 * (float)this.field_a;
          var18 = (float)this.field_a * var16;
          var19 = (float)this.field_c * var13;
          var20 = (float)this.field_c * var14;
          var21 = (float)this.field_d * -var13;
          var22 = -var14 * (float)this.field_d;
          var23 = -var15 * (float)this.field_b;
          param0 = var17 + (param0 + var19);
          param2 = param2 + var21 + var17;
          param4 = var23 + (var19 + param4);
          var24 = -var16 * (float)this.field_b;
          param3 = var18 + (var22 + param3);
          param1 = var18 + (param1 + var20);
          param5 = var24 + (var20 + param5);
        }
        var11Lifetime1 = param4 + (-param0 + param2);
        this.field_j.a((1 & param9) != 0 ? true : false, -128);
        var12Lifetime1 = param3 + (-param1 + param5);
        this.field_g.g(1025208104);
        this.field_g.a(this.field_j, 1);
        this.field_g.b((byte) -126, param8);
        this.field_g.a(param6, (byte) -39);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
        jaggl.OpenGL.glVertex2f(var11Lifetime1, var12Lifetime1);
        jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    final static void b(int param0, int param1) {
        if (param1 > -87) {
          field_l = (int[]) null;
        }
        ld.field_b = 1000000000L / (long)param0;
    }

    private final void b(int param0) {
        this.field_g.a(false, 1);
        this.field_g.a((rt) null, 1);
        this.field_g.a(8448, -26625, 8448);
        if (param0 < 82) {
          tm.b(47, -9);
        }
        this.field_g.a(34168, 768, 34176, 1);
        this.field_g.a(770, 5890, 0, (byte) 113);
        this.field_g.a(false, 0);
        this.field_g.a(34168, 768, 34176, 1);
    }

    private final void a(boolean param0, int param1) {
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_g.a(param0, 1);
        this.field_g.a(this.field_j, 1);
        this.field_g.a(this.field_g.b(true, param1), -26625, 7681);
        this.field_g.a(34167, 768, 34176, 1);
        this.field_g.a(770, 34168, 0, (byte) 103);
        this.field_g.a(false, 0);
        this.field_g.a(this.field_f, 1);
        this.field_g.a(34479, -26625, 7681);
        this.field_g.a(34166, 768, 34176, 1);
        if (this.field_k != 0) {
          if (this.field_k != 1) {
            if (2 == this.field_k) {
              this.field_g.a(1.0f, 0.5f, 0.5f, 0.0f, (byte) 35);
            } else {
              if (3 == this.field_k) {
                this.field_g.a(128.5f, 128.5f, 128.5f, 0.0f, (byte) 35);
              }
            }
          } else {
            this.field_g.a(0.5f, 1.0f, 0.5f, 0.0f, (byte) 35);
          }
        } else {
          this.field_g.a(0.5f, 0.5f, 1.0f, 0.0f, (byte) 35);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var14 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var15 = null;
        int var9 = 0;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!this.field_g.field_eb) {
          this.field_j.a(param3, param1, param2, param6, param4, param0, 83);
        } else {
          var14 = this.field_g.a(param1, param6, (byte) -78, param0, param3);
          var12 = var14;
          var11 = var12;
          var15 = var11;
          if (var11 != null) {
            for (var9 = 0; var9 < var14.length; var9++) {
              var11[var9] = vo.a(var14[var9], -16777216);
            }
            this.a(var15, param2, 0, param0, param0, param4, param6, 0);
          }
        }
        if (param5 != -14164) {
          this.a(46, 40, 8, -47, 93);
        }
    }

    final int a() {
        return this.field_j.field_q;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        int var15;
        el stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        stackIn_2_0 = this.field_j;
        stackIn_3_1 = ((param7 & 1) == 0) ? false : true;
        ((el) (Object) stackIn_2_0).a(stackIn_3_1, -128);
        this.field_g.g(1025208104);
        this.field_g.b((byte) -97, param6);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
        if (!this.field_e) {
          if (null == this.field_f) {
            this.field_g.a(this.field_j, 1);
            this.field_g.a(param4, (byte) -39);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 + param3);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 + param2, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
          } else {
            this.a(false, param4);
            this.field_f.a(true, -128);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 + param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1 + param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0 + param2, param1);
            jaggl.OpenGL.glEnd();
            this.b(123);
          }
        } else {
          var9 = (float)param2 / (float)this.d();
          var10 = (float)param3 / (float)this.c();
          var11 = (float)this.field_c * var9 + (float)param0;
          var12 = (float)param1 + var10 * (float)this.field_a;
          var13 = var11 + (float)this.field_j.field_q * var9;
          var14 = (float)this.field_j.field_o * var10 + var12;
          if (null != this.field_f) {
            this.a(false, param4);
            this.field_f.a(true, -128);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            this.b(85);
          } else {
            this.field_g.a(this.field_j, 1);
            this.field_g.a(param4, (byte) -39);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_j.field_p);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_j.field_r, this.field_j.field_p);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
          }
        }
    }

    final int b() {
        return this.field_j.field_o;
    }

    public static void a(int param0) {
        if (param0 > -127) {
          int[] var2 = (int[]) null;
          tm.a(124, 122, 112, -109, 59, (int[]) null, 37, -107, -100);
        }
        field_l = null;
        field_h = null;
    }

    final int d() {
        return this.field_c + (this.field_j.field_q + this.field_d);
    }

    private final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_j.a(param3, param1, param6, true, param5, param0, param7, (byte) 0, param4);
          if (param2 != 0) {
            this.a(-1.3366332054138184f, -0.0905967578291893f, 1.239539384841919f, -0.2479313760995865f, 0.13926813006401062f, -0.1986529529094696f, -78, 35, 110, -22);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 >= 0 &&
            re.field_f > param6) {
            if (param4 < 0 &&
              param0 < 0 &&
              param2 < 0) {
              return;
            }
            if (re.field_b <= param4 &&
              re.field_b <= param0 &&
              param2 >= re.field_b) {
              return;
            }
            if (param3 != 14250) {
              field_h = (ia) null;
            }
            var14 = -param6 + param1;
            if (param7 == param6) {
              if (param6 != param1) {
                var15 = -param7 + param1;
                if (param4 < param0) {
                  var11 = (-param4 + param2 << 16) / var14;
                  var9_int = param4 << 16;
                  var10 = param0 << 16;
                  var12 = (param2 - param0 << 16) / var15;
                } else {
                  var12 = (param2 - param4 << 16) / var14;
                  var9_int = param0 << 16;
                  var10 = param4 << 16;
                  var11 = (param2 - param0 << 16) / var15;
                }
              } else {
                var11 = 0;
                var12 = 0;
                var10 = param0 << 16;
                var9_int = param4 << 16;
              }
              if (param6 < 0) {
                param6 = Math.min(-param6, -param6 + param7);
                var10 = var10 + param6 * var12;
                var9_int = var9_int + param6 * var11;
                param6 = 0;
              }
              var13 = 0;
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var15 = -param6 + param7;
              var12 = (-param4 + param2 << 16) / var14;
              var11 = (param0 - param4 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (0 > param7) {
                  param6 = -param6 + param7;
                  var10 = var10 + var12 * param6;
                  var9_int = var9_int + var11 * param6;
                  param6 = param7;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var9_int = var9_int + param6 * var11;
                  var10 = var10 + param6 * var12;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = re.field_i[param6];
                while (param6 < param7) {
                  var17 = var9_int >> 16;
                  if (re.field_b > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        re.field_b > var17) {
                        ut.a(var18, (byte) -96, param5, param8, var17 + var16Lifetime2);
                      }
                    } else {
                      if (var18 + var17 >= re.field_b) {
                        var18 = -1 + (re.field_b - var17);
                      }
                      if (var17 >= 0) {
                        ut.a(var18, (byte) -96, param5, param8, var17 + var16Lifetime2);
                      } else {
                        ut.a(var18 + var17, (byte) -96, param5, param8, var16Lifetime2);
                      }
                    }
                  }
                  param6++;
                  if (re.field_f <= param6) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.stride;
                }
              }
              var16Lifetime3 = param1 - param7;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param2 << 16;
                if (var13 == 0) {
                  var9_int = param0 << 16;
                } else {
                  var10 = param0 << 16;
                }
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (0 > param6) {
              param6 = -param6;
              var10 = var10 + var12 * param6;
              var9_int = var9_int + var11 * param6;
              param6 = 0;
            }
            var15Lifetime1 = re.field_i[param6];
            while (param1 > param6) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < re.field_b) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    re.field_b > var16Lifetime1) {
                    ut.a(var17Lifetime1, (byte) -96, param5, param8, var16Lifetime1 + var15Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= re.field_b) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + re.field_b);
                  }
                  if (var16Lifetime1 >= 0) {
                    ut.a(var17Lifetime1, (byte) -96, param5, param8, var16Lifetime1 + var15Lifetime1);
                  } else {
                    ut.a(var17Lifetime1 + var16Lifetime1, (byte) -96, param5, param8, var15Lifetime1);
                  }
                }
              }
              param6++;
              if (re.field_f <= param6) {
                return;
              }
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRasterizer.stride;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_74_0 = var9;
          stackIn_74_1 = new StringBuilder().append("tm.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    tm(wl param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_k = 0;
        this.field_b = 0;
        this.field_d = 0;
        this.field_c = 0;
        this.field_a = 0;
        this.field_e = false;
        try {
          this.field_g = param0;
          this.field_j = ab.a(param0, -126, false, param3, param4, param5, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_h = new ia();
        field_l = new int[8192];
        field_i = 0;
    }
}
