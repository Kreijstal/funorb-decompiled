/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla extends aja {
    private int field_b;
    static String field_k;
    private int field_j;
    private qfa field_g;
    private im field_e;
    static String field_h;
    private int field_a;
    private boolean field_l;
    im field_f;
    static boolean field_c;
    private int field_d;
    private int field_i;

    private final void a(int param0) {
        if (param0 != -27568) {
            this.field_e = (im) null;
        }
        this.field_g.h(33984, 1);
        this.field_g.a(65, (pib) null);
        this.field_g.b(8448, 8448, false);
        this.field_g.c(1, param0 + 61760, 768, 34168);
        this.field_g.b(0, 770, 5890, 34184);
        this.field_g.h(33984, 0);
        this.field_g.c(1, 34192, 768, 34168);
    }

    final static boolean b(int param0, int param1) {
        if (param0 < 92) {
            return false;
        }
        return fwa.field_g.a(param1, 11, true);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_f.a(-78, false);
        this.field_g.n(27841);
        this.field_g.d(param4, 73);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> -1898587152), (byte)(param3 >> 1433623560), (byte)param3, (byte)(param3 >> 1320538392));
        param1 = param1 + this.field_d;
        param0 = param0 + this.field_i;
        if (this.field_e != null) {
            this.a(true, param2);
            this.field_e.a(-77, false);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_f.field_o);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, this.field_f.field_p + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(this.field_f.field_m + param0, this.field_f.field_p + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, this.field_f.field_o);
            jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0 - -this.field_f.field_m, param1);
            jaggl.OpenGL.glEnd();
            this.a(-27568);
        } else {
            this.field_g.a(117, this.field_f);
            this.field_g.c(0, param2);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, this.field_f.field_p + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(this.field_f.field_m + param0, param1 + this.field_f.field_p);
            jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
            jaggl.OpenGL.glVertex2i(this.field_f.field_m + param0, param1);
            jaggl.OpenGL.glEnd();
        }
    }

    final int a() {
        return this.field_f.field_p;
    }

    final int b() {
        return this.field_f.field_p - (-this.field_d - this.field_b);
    }

    private final void a(boolean param0, int param1) {
        qfa stackIn_12_0 = null;
        float stackIn_12_1 = 0.0f;
        float stackIn_12_2 = 0.0f;
        qfa stackIn_13_0;
        float stackIn_13_1;
        float stackIn_13_2;
        int stackIn_13_3;
        int var4;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0) {
            break L0;
          } else {
            this.b(10, 76, -118, 126, -96, -43, 86);
            break L0;
          }
        }
        L1: {
          this.field_g.h(33984, 1);
          this.field_g.a(55, this.field_f);
          this.field_g.b(this.field_g.j(param1, 25887), 7681, false);
          this.field_g.c(1, 34192, 768, 34167);
          this.field_g.b(0, 770, 34168, 34184);
          this.field_g.h(33984, 0);
          this.field_g.a(63, this.field_e);
          this.field_g.b(34479, 7681, false);
          this.field_g.c(1, 34192, 768, 34166);
          if (-1 == (this.field_j ^ -1)) {
            L2: {
              stackIn_12_0 = this.field_g;

              stackIn_12_1 = 0.0f;

              stackIn_12_2 = 0.5f;

              if (param0) {
                stackIn_13_0 = (qfa) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = stackIn_12_2;
                stackIn_13_3 = 0;
                break L2;
              } else {
                stackIn_13_0 = (qfa) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = stackIn_12_2;
                stackIn_13_3 = 1;
                break L2;
              }
            }
            ((qfa) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0, 0.5f, 1.0f);
            break L1;
          } else {
            if ((this.field_j ^ -1) == -2) {
              this.field_g.a(0.0f, 1.0f, false, 0.5f, 0.5f);
              break L1;
            } else {
              if (-3 != (this.field_j ^ -1)) {
                if ((this.field_j ^ -1) == -4) {
                  this.field_g.a(0.0f, 128.5f, false, 128.5f, 128.5f);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_g.a(0.0f, 0.5f, false, 1.0f, 0.5f);
                break L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.field_f.a((byte) 32, param6, param2, param1, param3, param0, param5, true, param4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tla.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        int var15;
        im stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        im stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        L0: {
          var15 = VoidHunters.field_G;
          stackIn_2_0 = this.field_f;

          stackIn_2_1 = -124;

          if ((param7 & 1) == 0) {
            stackIn_3_0 = (im) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 0;
            break L0;
          } else {
            stackIn_3_0 = (im) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 1;
            break L0;
          }
        }
        L1: {
          ((im) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
          this.field_g.n(27841);
          this.field_g.d(param6, 115);
          jaggl.OpenGL.glColor4ub((byte)(param5 >> -844912), (byte)(param5 >> 2066705736), (byte)param5, (byte)(param5 >> 875985752));
          if (!this.field_l) {
            if (null != this.field_e) {
              this.a(true, param4);
              this.field_e.a(-112, true);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 - -param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param1 + param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1);
              jaggl.OpenGL.glEnd();
              this.a(-27568);
              break L1;
            } else {
              this.field_g.a(103, this.field_f);
              this.field_g.c(0, param4);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 + param3);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param3 + param1);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1);
              jaggl.OpenGL.glEnd();
              break L1;
            }
          } else {
            var9 = (float)param2 / (float)this.c();
            var10 = (float)param3 / (float)this.b();
            var11 = (float)this.field_i * var9 + (float)param0;
            var12 = (float)param1 + (float)this.field_d * var10;
            var13 = var11 + (float)this.field_f.field_m * var9;
            var14 = (float)this.field_f.field_p * var10 + var12;
            if (this.field_e != null) {
              this.a(true, param4);
              this.field_e.a(-128, true);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              this.a(-27568);
              break L1;
            } else {
              this.field_g.a(120, this.field_f);
              this.field_g.c(0, param4);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              break L1;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        int var9;
        int var10_int;
        int var11_int;
        int var12;
        int var13;
        int var14_int;
        float var14;
        int var15;
        float var16_float;
        int var16;
        float var17;
        int var18;
        float var10;
        float var11;
        L0: {
          L1: {
            var18 = VoidHunters.field_G;
            var8 = param2 + param0;
            this.field_f.a(-122, false);
            var9 = param1 + param3;
            this.field_g.n(27841);
            this.field_g.a(31, this.field_f);
            this.field_g.d(param6, 111);
            this.field_g.c(0, param4);
            jaggl.OpenGL.glColor4ub((byte)(param5 >> 1565038224), (byte)(param5 >> -1041554616), (byte)param5, (byte)(param5 >> -1503411368));
            if (!this.field_f.field_l) {
              break L1;
            } else {
              if (!this.field_l) {
                var10 = this.field_f.field_o * (float)param3 / (float)this.field_f.field_p;
                var11 = this.field_f.field_n * (float)param2 / (float)this.field_f.field_m;
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, var10);
                jaggl.OpenGL.glVertex2i(param0, param1);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(param0, var9);
                jaggl.OpenGL.glTexCoord2f(var11, 0.0f);
                jaggl.OpenGL.glVertex2i(var8, var9);
                jaggl.OpenGL.glTexCoord2f(var11, var10);
                jaggl.OpenGL.glVertex2i(var8, param1);
                jaggl.OpenGL.glEnd();
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glTranslatef((float)this.field_i, (float)this.field_d, 0.0f);
          var10_int = this.c();
          var11_int = this.b();
          var13 = this.field_f.field_p + param1;
          jaggl.OpenGL.glBegin(7);
          var12 = param1;
          L2: while (true) {
            if (var13 > var9) {
              if (var12 < var9) {
                var14 = (float)(this.field_f.field_p - (var9 - var12)) * this.field_f.field_o / (float)this.field_f.field_p;
                var16 = param0 - -this.field_f.field_m;
                var15 = param0;
                L3: while (true) {
                  if (var16 > var8) {
                    L4: {
                      if (var15 < var8) {
                        var17 = (float)(var8 + -var15) * this.field_f.field_n / (float)this.field_f.field_m;
                        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
                        jaggl.OpenGL.glVertex2i(var15, var12);
                        jaggl.OpenGL.glTexCoord2f(0.0f, var14);
                        jaggl.OpenGL.glVertex2i(var15, var9);
                        jaggl.OpenGL.glTexCoord2f(var17, var14);
                        jaggl.OpenGL.glVertex2i(var8, var9);
                        jaggl.OpenGL.glTexCoord2f(var17, this.field_f.field_o);
                        jaggl.OpenGL.glVertex2i(var8, var12);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    jaggl.OpenGL.glEnd();
                    jaggl.OpenGL.glPopMatrix();
                    break L0;
                  } else {
                    jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
                    jaggl.OpenGL.glVertex2i(var15, var12);
                    jaggl.OpenGL.glTexCoord2f(0.0f, var14);
                    jaggl.OpenGL.glVertex2i(var15, var9);
                    jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, var14);
                    jaggl.OpenGL.glVertex2i(var16, var9);
                    jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
                    jaggl.OpenGL.glVertex2i(var16, var12);
                    var16 = var16 + var10_int;
                    var15 = var15 + var10_int;
                    continue L3;
                  }
                }
              } else {
                jaggl.OpenGL.glEnd();
                jaggl.OpenGL.glPopMatrix();
                break L0;
              }
            } else {
              var15 = param0 - -this.field_f.field_m;
              var14_int = param0;
              L5: while (true) {
                if (var15 > var8) {
                  L6: {
                    if (var8 > var14_int) {
                      var16_float = this.field_f.field_n * (float)(-var14_int + var8) / (float)this.field_f.field_m;
                      jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
                      jaggl.OpenGL.glVertex2i(var14_int, var12);
                      jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                      jaggl.OpenGL.glVertex2i(var14_int, var13);
                      jaggl.OpenGL.glTexCoord2f(var16_float, 0.0f);
                      jaggl.OpenGL.glVertex2i(var8, var13);
                      jaggl.OpenGL.glTexCoord2f(var16_float, this.field_f.field_o);
                      jaggl.OpenGL.glVertex2i(var8, var12);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var13 = var13 + var11_int;
                  var12 = var12 + var11_int;
                  continue L2;
                } else {
                  jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
                  jaggl.OpenGL.glVertex2i(var14_int, var12);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(var14_int, var13);
                  jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
                  jaggl.OpenGL.glVertex2i(var15, var13);
                  jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
                  jaggl.OpenGL.glVertex2i(var15, var12);
                  var14_int = var14_int + var10_int;
                  var15 = var15 + var10_int;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final int c() {
        return this.field_a + (this.field_f.field_m + this.field_i);
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        L0: {
          L1: {
            this.field_a = param2;
            this.field_b = param3;
            this.field_d = param1;
            this.field_i = param0;
            stackIn_5_0 = this;

            if (this.field_i != 0) {
              break L1;
            } else {
              stackIn_5_0 = this;

              if (0 != this.field_d) {
                break L1;
              } else {
                stackIn_5_0 = this;

                if (0 != this.field_a) {
                  break L1;
                } else {
                  stackIn_6_0 = this;

                  if (0 == this.field_b) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L0;
                  } else {
                    stackIn_5_0 = this;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = this;
          stackIn_7_1 = 1;
          break L0;
        }
        ((tla) (this)).field_l = stackIn_7_1 != 0;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var14 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var15 = null;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param4 <= 90) {
            field_h = (String) null;
        }
        if (!this.field_g.field_eb) {
            this.field_f.a(112, param2, param0, param6, param1, param3, param5);
        } else {
            var14 = this.field_g.na(param3, param5, param1, param6);
            var12 = var14;
            var11 = var12;
            var15 = var11;
            if (!(var11 == null)) {
                for (var9 = 0; var9 < var14.length; var9++) {
                    var11[var9] = knb.a(var14[var9], -16777216);
                }
                this.a(param0, param2, param1, param6, var15, 0, param1);
            }
        }
    }

    final int d() {
        return this.field_f.field_m;
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
        if (!(!this.field_l)) {
            var11 = (float)this.c();
            var12 = (float)this.b();
            var13 = (-param0 + param2) / var11;
            var14 = (-param1 + param3) / var11;
            var15 = (-param0 + param4) / var12;
            var16 = (param5 - param1) / var12;
            var17 = var15 * (float)this.field_d;
            var18 = var16 * (float)this.field_d;
            var19 = (float)this.field_i * var13;
            var20 = var14 * (float)this.field_i;
            var21 = (float)this.field_a * -var13;
            var22 = -var14 * (float)this.field_a;
            var23 = (float)this.field_b * -var15;
            param1 = var18 + (param1 + var20);
            param3 = var18 + (var22 + param3);
            param0 = var19 + param0 + var17;
            param4 = param4 + var19 + var23;
            var24 = (float)this.field_b * -var16;
            param2 = var17 + (var21 + param2);
            param5 = var24 + (var20 + param5);
        }
        var11 = param4 + (param2 - param0);
        this.field_f.a(109, (1 & param9) != 0 ? true : false);
        var12 = -param1 + param5 + param3;
        this.field_g.n(27841);
        this.field_g.a(54, this.field_f);
        this.field_g.d(param8, 122);
        this.field_g.c(0, param6);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> -744830640), (byte)(param7 >> -1787943960), (byte)param7, (byte)(param7 >> -704913352));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_f.field_o);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(this.field_f.field_n, this.field_f.field_o);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    public static void b(int param0) {
        field_k = null;
        field_h = null;
        if (param0 != 1) {
            field_h = (String) null;
        }
    }

    tla(qfa param0, int param1, int param2, boolean param3) {
        this.field_a = 0;
        this.field_d = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_i = 0;
        this.field_l = false;
        try {
            this.field_g = param0;
            this.field_f = jr.a(28, param1, param2, param0, param3 ? 6408 : 6407);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    tla(qfa param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_a = 0;
        this.field_d = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_i = 0;
        this.field_l = false;
        try {
            this.field_g = param0;
            this.field_f = uw.a(param0, param4, param5, param2, param3, param1, false, (byte) 60);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_h = "You can spectate this game";
        field_k = "Swap control to clicked ship";
    }
}
