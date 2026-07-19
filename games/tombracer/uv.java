/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends oga {
    private rt field_i;
    private rt field_x;
    private static String[] field_k;
    static boolean field_o;
    private int field_n;
    private cb field_s;
    static String field_u;
    private cua field_v;
    private int field_r;
    private int field_t;
    private cua field_j;
    private cua field_w;
    private int field_p;
    private rt[] field_l;
    private cb field_q;
    private cua field_m;

    final void a(rt param0, int param1, byte param2, rt param3) {
        RuntimeException var5 = null;
        long var5_long = 0L;
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        long var7 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                jaggl.OpenGL.glPushAttrib(2048);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glPushMatrix();
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                if (null == this.field_l) {
                  break L2;
                } else {
                  this.field_g.b((ks) (this.field_s), (byte) 81);
                  var5_int = b.a(this.field_t, (byte) 85);
                  var6 = b.a(this.field_n, (byte) 96);
                  var7_int = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            if ((var5_int ^ -1) < -257) {
                              break L7;
                            } else {
                              var12 = var6 ^ -1;
                              var11 = -257;
                              if (var10 != 0) {
                                if (var11 <= var12) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              } else {
                                if (var11 <= var12) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                          this.field_s.a(true, this.field_l[var7_int], 0);
                          if (var6 <= 256) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        var6 = var6 >> 1;
                        break L5;
                      }
                      L8: {
                        if (-257 <= (var5_int ^ -1)) {
                          break L8;
                        } else {
                          var5_int = var5_int >> 1;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (0 != var7_int) {
                            break L10;
                          } else {
                            this.field_g.a(true, param0);
                            jaggl.OpenGL.glBegin(7);
                            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                            jaggl.OpenGL.glVertex2i(0, 0);
                            jaggl.OpenGL.glTexCoord2f((float)this.field_t, 0.0f);
                            jaggl.OpenGL.glVertex2i(1, 0);
                            jaggl.OpenGL.glTexCoord2f((float)this.field_t, (float)this.field_n);
                            jaggl.OpenGL.glVertex2i(1, 1);
                            jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_n);
                            jaggl.OpenGL.glVertex2i(0, 1);
                            jaggl.OpenGL.glEnd();
                            if (var10 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_g.a(true, this.field_l[-1 + var7_int]);
                        jaggl.OpenGL.glBegin(7);
                        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                        jaggl.OpenGL.glVertex2i(0, 0);
                        jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
                        jaggl.OpenGL.glVertex2i(1, 0);
                        jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
                        jaggl.OpenGL.glVertex2i(1, 1);
                        jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
                        jaggl.OpenGL.glVertex2i(0, 1);
                        jaggl.OpenGL.glEnd();
                        break L9;
                      }
                      var7_int++;
                      if (var10 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                    this.field_g.b(this.field_s, 0);
                    this.field_g.a(true, this.field_l[-1 + var7_int]);
                    this.field_g.b((ks) (this.field_q), (byte) 81);
                    this.field_q.a(0, (byte) -91);
                    jaggl.OpenGL.glViewport(0, 0, 256, 256);
                    var8 = this.field_v.field_c;
                    jaggl.OpenGL.glUseProgramObjectARB(var8);
                    jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                    jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "params"), ql.field_l, 0.0f, 0.0f);
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(0, 0);
                    jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(1, 0);
                    jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(1, 1);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(0, 1);
                    jaggl.OpenGL.glEnd();
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_g.a(true, param0);
              this.field_g.b((ks) (this.field_q), (byte) 81);
              this.field_q.a(0, (byte) -91);
              jaggl.OpenGL.glViewport(0, 0, 256, 256);
              var5_long = this.field_m.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var5_long);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), ql.field_l, 0.0f, 0.0f);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f((float)this.field_t, 0.0f);
              jaggl.OpenGL.glVertex2i(1, 0);
              jaggl.OpenGL.glTexCoord2f((float)this.field_t, (float)this.field_n);
              jaggl.OpenGL.glVertex2i(1, 1);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_n);
              jaggl.OpenGL.glVertex2i(0, 1);
              jaggl.OpenGL.glEnd();
              break L1;
            }
            L11: {
              this.field_q.a(1, (byte) -91);
              this.field_g.a(true, this.field_x);
              var5_long = this.field_w.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var5_long);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "baseTex"), 0);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "step"), 0.00390625f, 0.0f, 0.0f);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(1, 0);
              jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(1, 1);
              jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(0, 1);
              jaggl.OpenGL.glEnd();
              this.field_q.a(0, (byte) -91);
              this.field_g.a(true, this.field_i);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "step"), 0.0f, 0.00390625f, 0.0f);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(1, 0);
              if (param2 <= -82) {
                break L11;
              } else {
                uv.d(-13);
                break L11;
              }
            }
            jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
            jaggl.OpenGL.glVertex2i(1, 1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
            jaggl.OpenGL.glVertex2i(0, 1);
            jaggl.OpenGL.glEnd();
            jaggl.OpenGL.glPopAttrib();
            jaggl.OpenGL.glPopMatrix();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_g.b(this.field_q, 0);
            var7 = this.field_j.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var7);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), vba.field_v, fra.field_p, 0.0f);
            this.field_g.e(1, true);
            this.field_g.a(true, this.field_x);
            this.field_g.e(0, true);
            this.field_g.a(true, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("uv.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L12;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L12;
            }
          }
          L13: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 34842) {
          if (this.field_g.field_id) {
            if (!this.field_g.field_Vc) {
              return false;
            } else {
              L0: {
                if (!this.field_g.field_z) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_m = (cua) null;
          if (this.field_g.field_id) {
            if (!this.field_g.field_Vc) {
              return false;
            } else {
              L1: {
                if (!this.field_g.field_z) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          this.field_t = param2;
          this.field_n = param0;
          if (param1 == -71) {
            break L0;
          } else {
            this.field_w = (cua) null;
            break L0;
          }
        }
        L1: {
          var4 = b.a(this.field_t, (byte) -95);
          var5 = b.a(this.field_n, (byte) -95);
          if (this.field_r != var4) {
            break L1;
          } else {
            if (var5 != this.field_p) {
              break L1;
            } else {
              return;
            }
          }
        }
        L2: {
          if (this.field_l != null) {
            var6 = 0;
            L3: while (true) {
              if (this.field_l.length <= var6) {
                this.field_l = null;
                break L2;
              } else {
                this.field_l[var6].b(0);
                var6++;
                if (var9 != 0) {
                  break L2;
                } else {
                  if (var9 == 0) {
                    continue L3;
                  } else {
                    this.field_l = null;
                    break L2;
                  }
                }
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (256 < var4) {
            break L4;
          } else {
            if (-257 <= (var5 ^ -1)) {
              this.field_s = null;
              this.field_r = var4;
              this.field_p = var5;
              return;
            } else {
              break L4;
            }
          }
        }
        var6 = var4;
        var7 = var5;
        var8 = 0;
        L5: while (true) {
          L6: {
            L7: {
              L8: {
                L9: {
                  if (-257 > (var6 ^ -1)) {
                    break L9;
                  } else {
                    var13 = var7;
                    var12 = 256;
                    if (var9 != 0) {
                      if (var12 <= var13) {
                        break L7;
                      } else {
                        break L8;
                      }
                    } else {
                      if (var12 >= var13) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                if (var6 <= 256) {
                  break L7;
                } else {
                  break L8;
                }
              }
              var6 = var6 >> 1;
              break L7;
            }
            var8++;
            if ((var7 ^ -1) < -257) {
              var7 = var7 >> 1;
              if (var9 == 0) {
                continue L5;
              } else {
                break L6;
              }
            } else {
              continue L5;
            }
          }
          L10: {
            if (this.field_s != null) {
              var6 = var4;
              this.field_l = new rt[var8];
              var7 = var5;
              var8 = 0;
              break L10;
            } else {
              this.field_s = new cb(this.field_g);
              var6 = var4;
              this.field_l = new rt[var8];
              var7 = var5;
              var8 = 0;
              break L10;
            }
          }
          L11: while (true) {
            L12: {
              L13: {
                L14: {
                  if ((var6 ^ -1) < -257) {
                    break L14;
                  } else {
                    var11 = var7 ^ -1;
                    var10 = -257;
                    if (var9 != 0) {
                      if (var10 <= var11) {
                        break L12;
                      } else {
                        break L13;
                      }
                    } else {
                      if (var10 > var11) {
                        break L14;
                      } else {
                        if (var9 == 0) {
                          this.field_r = var4;
                          this.field_p = var5;
                          return;
                        } else {
                          this.field_s = null;
                          this.field_r = var4;
                          this.field_p = var5;
                          return;
                        }
                      }
                    }
                  }
                }
                incrementValue$1 = var8;
                var8++;
                this.field_l[incrementValue$1] = new rt(this.field_g, 3553, 34842, var6, var7);
                if (-257 <= (var6 ^ -1)) {
                  break L12;
                } else {
                  break L13;
                }
              }
              var6 = var6 >> 1;
              break L12;
            }
            if (256 < var7) {
              var7 = var7 >> 1;
              continue L11;
            } else {
              continue L11;
            }
          }
        }
    }

    final int b(int param0) {
        if (param0 != 13727) {
            return -92;
        }
        return 1;
    }

    final static hja a(String param0, cn param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hja stackIn_2_0 = null;
        hja stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hja stackOut_3_0 = null;
        hja stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param3 == 8864) {
              var4_int = param1.b(param2, -7768);
              var5 = param1.a(true, param0, var4_int);
              stackOut_3_0 = cu.a(false, var5, param1, var4_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (hja) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("uv.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean c(byte param0) {
        hja discarded$8 = null;
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 78) {
          L0: {
            var3 = (String) null;
            discarded$8 = uv.a((String) null, (cn) null, (String) null, -53);
            if (this.field_q == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_q == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, byte param1) {
        boolean discarded$0 = false;
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        this.field_g.e(1, true);
        this.field_g.a(true, (kl) null);
        this.field_g.e(0, true);
        if (param1 < 117) {
            discarded$0 = this.e(-29);
        }
    }

    final boolean a(byte param0) {
        boolean discarded$1 = false;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          if (param0 == 65) {
            break L0;
          } else {
            discarded$1 = this.c((byte) -83);
            break L0;
          }
        }
        if (this.field_g.field_id) {
          if (this.field_g.field_Vc) {
            if (this.field_g.field_z) {
              this.field_q = new cb(this.field_g);
              this.field_x = new rt(this.field_g, 3553, 34842, 256, 256);
              this.field_x.a(false, false, -3554);
              this.field_i = new rt(this.field_g, 3553, 34842, 256, 256);
              this.field_i.a(false, false, -3554);
              this.field_g.b((ks) (this.field_q), (byte) 81);
              this.field_q.a(true, this.field_x, 0);
              this.field_q.a(true, this.field_i, 1);
              this.field_q.a(0, (byte) -91);
              if (this.field_q.c(-84)) {
                this.field_g.b(this.field_q, 0);
                this.field_m = dga.a(21885, this.field_g, new fca[]{cpa.a(param0 + -1, this.field_g, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.field_v = dga.a(param0 ^ 21820, this.field_g, new fca[]{cpa.a(64, this.field_g, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.field_j = dga.a(21885, this.field_g, new fca[]{cpa.a(64, this.field_g, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                this.field_w = dga.a(21885, this.field_g, new fca[]{cpa.a(param0 + -1, this.field_g, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                if (null != this.field_v) {
                  if (this.field_m == null) {
                    return false;
                  } else {
                    L1: {
                      L2: {
                        if (null == this.field_j) {
                          break L2;
                        } else {
                          if (null == this.field_w) {
                            break L2;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L1;
                    }
                    return stackIn_18_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_g.b(this.field_q, 0);
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    uv(cka param0) {
        super(param0);
    }

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_u = null;
        field_k = null;
    }

    final static void d(int param0) {
        ql.field_k.k(9, -2988);
        rpa.field_d = true;
        if (param0 != 30785) {
            uv.f(9);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 1) {
          L0: {
            stackOut_11_0 = jj.a(param0, param2, -32842);
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (0 == (458752 & param2)) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          if (stackIn_14_0 | stackIn_14_1 == 0) {
            if (so.a(param2, (byte) -105, param0)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            field_k = (String[]) null;
            stackOut_1_0 = jj.a(param0, param2, -32842);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (0 == (458752 & param2)) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!so.a(param2, (byte) -105, param0)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    final static lqa b(boolean param0) {
        iqa var1 = null;
        ei stackIn_4_0 = null;
        ei stackIn_8_0 = null;
        ei stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        ei stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0) {
          L0: {
            uv.d(-89);
            var1 = baa.field_d.field_i;
            if (var1 != null) {
              stackOut_7_0 = var1.field_b;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (ei) ((Object) stackOut_6_0);
              break L0;
            }
          }
          return (lqa) ((Object) stackIn_8_0);
        } else {
          L1: {
            var1 = baa.field_d.field_i;
            if (var1 != null) {
              stackOut_3_0 = var1.field_b;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (ei) ((Object) stackOut_2_0);
              break L1;
            }
          }
          return (lqa) ((Object) stackIn_4_0);
        }
    }

    final void d(byte param0) {
        this.field_q = null;
        this.field_w = null;
        this.field_x = null;
        this.field_i = null;
        this.field_j = null;
        this.field_s = null;
        this.field_m = null;
        this.field_l = null;
        if (param0 >= -9) {
          return;
        } else {
          this.field_v = null;
          return;
        }
    }

    static {
        field_u = "Mirrors";
        field_k = new String[1];
        field_k[0] = "Powerdown";
    }
}
