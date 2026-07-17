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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              if (null == ((uv) this).field_l) {
                ((uv) this).field_g.a(true, (kl) (Object) param0);
                ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, (byte) 81);
                ((uv) this).field_q.a(0, (byte) -91);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var5_long = ((uv) this).field_m.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5_long);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), ql.field_l, 0.0f, 0.0f);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(0, 0);
                jaggl.OpenGL.glTexCoord2f((float)((uv) this).field_t, 0.0f);
                jaggl.OpenGL.glVertex2i(1, 0);
                jaggl.OpenGL.glTexCoord2f((float)((uv) this).field_t, (float)((uv) this).field_n);
                jaggl.OpenGL.glVertex2i(1, 1);
                jaggl.OpenGL.glTexCoord2f(0.0f, (float)((uv) this).field_n);
                jaggl.OpenGL.glVertex2i(0, 1);
                jaggl.OpenGL.glEnd();
                break L1;
              } else {
                ((uv) this).field_g.b((ks) (Object) ((uv) this).field_s, (byte) 81);
                var5_int = b.a(((uv) this).field_t, (byte) 85);
                var6 = b.a(((uv) this).field_n, (byte) 96);
                var7_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int > 256) {
                      break L3;
                    } else {
                      if (var6 <= 256) {
                        ((uv) this).field_g.b((ks) (Object) ((uv) this).field_s, 0);
                        ((uv) this).field_g.a(true, (kl) (Object) ((uv) this).field_l[-1 + var7_int]);
                        ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, (byte) 81);
                        ((uv) this).field_q.a(0, (byte) -91);
                        jaggl.OpenGL.glViewport(0, 0, 256, 256);
                        var8 = ((uv) this).field_v.field_c;
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
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                    ((uv) this).field_s.a(true, ((uv) this).field_l[var7_int], 0);
                    if (var6 <= 256) {
                      break L4;
                    } else {
                      var6 = var6 >> 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5_int <= 256) {
                      break L5;
                    } else {
                      var5_int = var5_int >> 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (0 != var7_int) {
                      ((uv) this).field_g.a(true, (kl) (Object) ((uv) this).field_l[-1 + var7_int]);
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
                      break L6;
                    } else {
                      ((uv) this).field_g.a(true, (kl) (Object) param0);
                      jaggl.OpenGL.glBegin(7);
                      jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                      jaggl.OpenGL.glVertex2i(0, 0);
                      jaggl.OpenGL.glTexCoord2f((float)((uv) this).field_t, 0.0f);
                      jaggl.OpenGL.glVertex2i(1, 0);
                      jaggl.OpenGL.glTexCoord2f((float)((uv) this).field_t, (float)((uv) this).field_n);
                      jaggl.OpenGL.glVertex2i(1, 1);
                      jaggl.OpenGL.glTexCoord2f(0.0f, (float)((uv) this).field_n);
                      jaggl.OpenGL.glVertex2i(0, 1);
                      jaggl.OpenGL.glEnd();
                      var7_int++;
                      break L6;
                    }
                  }
                  var7_int++;
                  continue L2;
                }
              }
            }
            L7: {
              ((uv) this).field_q.a(1, (byte) -91);
              ((uv) this).field_g.a(true, (kl) (Object) ((uv) this).field_x);
              var5_long = ((uv) this).field_w.field_c;
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
              ((uv) this).field_q.a(0, (byte) -91);
              ((uv) this).field_g.a(true, (kl) (Object) ((uv) this).field_i);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "step"), 0.0f, 0.00390625f, 0.0f);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(1, 0);
              if (param2 <= -82) {
                break L7;
              } else {
                uv.d(-13);
                break L7;
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
            ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, 0);
            var7 = ((uv) this).field_j.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var7);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), vba.field_v, fra.field_p, 0.0f);
            ((uv) this).field_g.e(1, true);
            ((uv) this).field_g.a(true, (kl) (Object) ((uv) this).field_x);
            ((uv) this).field_g.e(0, true);
            ((uv) this).field_g.a(true, (kl) (Object) param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("uv.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
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
          if (((uv) this).field_g.field_id) {
            if (!((uv) this).field_g.field_Vc) {
              return false;
            } else {
              L0: {
                if (!((uv) this).field_g.field_z) {
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
          ((uv) this).field_m = null;
          if (((uv) this).field_g.field_id) {
            if (!((uv) this).field_g.field_Vc) {
              return false;
            } else {
              L1: {
                if (!((uv) this).field_g.field_z) {
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        ((uv) this).field_t = param2;
        ((uv) this).field_n = param0;
        if (param1 == -71) {
          var4 = b.a(((uv) this).field_t, (byte) -95);
          var5 = b.a(((uv) this).field_n, (byte) -95);
          if (((uv) this).field_r == var4) {
            if (~var5 == ~((uv) this).field_p) {
              return;
            } else {
              L0: {
                if (((uv) this).field_l != null) {
                  var6 = 0;
                  L1: while (true) {
                    if (~((uv) this).field_l.length >= ~var6) {
                      ((uv) this).field_l = null;
                      break L0;
                    } else {
                      ((uv) this).field_l[var6].b(0);
                      var6++;
                      continue L1;
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (256 < var4) {
                var6 = var4;
                var7 = var5;
                var8 = 0;
                L2: while (true) {
                  L3: {
                    if (var6 > 256) {
                      break L3;
                    } else {
                      if (256 >= var7) {
                        if (((uv) this).field_s != null) {
                          var6 = var4;
                          ((uv) this).field_l = new rt[var8];
                          var7 = var5;
                          var8 = 0;
                          L4: while (true) {
                            L5: {
                              if (var6 > 256) {
                                break L5;
                              } else {
                                if (var7 <= 256) {
                                  ((uv) this).field_r = var4;
                                  ((uv) this).field_p = var5;
                                  return;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              int incrementValue$7 = var8;
                              var8++;
                              ((uv) this).field_l[incrementValue$7] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                              if (var6 <= 256) {
                                break L6;
                              } else {
                                var6 = var6 >> 1;
                                break L6;
                              }
                            }
                            if (256 < var7) {
                              var7 = var7 >> 1;
                              continue L4;
                            } else {
                              continue L4;
                            }
                          }
                        } else {
                          ((uv) this).field_s = new cb(((uv) this).field_g);
                          var6 = var4;
                          ((uv) this).field_l = new rt[var8];
                          var7 = var5;
                          var8 = 0;
                          L7: while (true) {
                            L8: {
                              if (var6 > 256) {
                                break L8;
                              } else {
                                if (var7 <= 256) {
                                  ((uv) this).field_r = var4;
                                  ((uv) this).field_p = var5;
                                  return;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              int incrementValue$8 = var8;
                              var8++;
                              ((uv) this).field_l[incrementValue$8] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                              if (var6 <= 256) {
                                break L9;
                              } else {
                                var6 = var6 >> 1;
                                break L9;
                              }
                            }
                            if (256 < var7) {
                              var7 = var7 >> 1;
                              continue L7;
                            } else {
                              continue L7;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L10: {
                    if (var6 <= 256) {
                      break L10;
                    } else {
                      var6 = var6 >> 1;
                      break L10;
                    }
                  }
                  var8++;
                  if (var7 > 256) {
                    var7 = var7 >> 1;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              } else {
                if (var5 <= 256) {
                  ((uv) this).field_s = null;
                  ((uv) this).field_r = var4;
                  ((uv) this).field_p = var5;
                  return;
                } else {
                  var6 = var4;
                  var7 = var5;
                  var8 = 0;
                  L11: while (true) {
                    L12: {
                      if (var6 > 256) {
                        break L12;
                      } else {
                        if (256 >= var7) {
                          L13: {
                            if (((uv) this).field_s != null) {
                              var6 = var4;
                              ((uv) this).field_l = new rt[var8];
                              var7 = var5;
                              var8 = 0;
                              break L13;
                            } else {
                              ((uv) this).field_s = new cb(((uv) this).field_g);
                              var6 = var4;
                              ((uv) this).field_l = new rt[var8];
                              var7 = var5;
                              var8 = 0;
                              break L13;
                            }
                          }
                          L14: while (true) {
                            L15: {
                              if (var6 > 256) {
                                break L15;
                              } else {
                                if (var7 <= 256) {
                                  ((uv) this).field_r = var4;
                                  ((uv) this).field_p = var5;
                                  return;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L16: {
                              int incrementValue$9 = var8;
                              var8++;
                              ((uv) this).field_l[incrementValue$9] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                              if (var6 <= 256) {
                                break L16;
                              } else {
                                var6 = var6 >> 1;
                                break L16;
                              }
                            }
                            if (256 < var7) {
                              var7 = var7 >> 1;
                              continue L14;
                            } else {
                              continue L14;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L17: {
                      if (var6 <= 256) {
                        break L17;
                      } else {
                        var6 = var6 >> 1;
                        break L17;
                      }
                    }
                    var8++;
                    if (var7 > 256) {
                      var7 = var7 >> 1;
                      continue L11;
                    } else {
                      continue L11;
                    }
                  }
                }
              }
            }
          } else {
            L18: {
              if (((uv) this).field_l != null) {
                var6 = 0;
                L19: while (true) {
                  if (~((uv) this).field_l.length >= ~var6) {
                    ((uv) this).field_l = null;
                    break L18;
                  } else {
                    ((uv) this).field_l[var6].b(0);
                    var6++;
                    continue L19;
                  }
                }
              } else {
                break L18;
              }
            }
            if (256 < var4) {
              var6 = var4;
              var7 = var5;
              var8 = 0;
              L20: while (true) {
                L21: {
                  if (var6 > 256) {
                    break L21;
                  } else {
                    if (256 >= var7) {
                      if (((uv) this).field_s != null) {
                        var6 = var4;
                        ((uv) this).field_l = new rt[var8];
                        var7 = var5;
                        var8 = 0;
                        L22: while (true) {
                          L23: {
                            if (var6 > 256) {
                              break L23;
                            } else {
                              if (var7 <= 256) {
                                ((uv) this).field_r = var4;
                                ((uv) this).field_p = var5;
                                return;
                              } else {
                                break L23;
                              }
                            }
                          }
                          L24: {
                            int incrementValue$10 = var8;
                            var8++;
                            ((uv) this).field_l[incrementValue$10] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                            if (var6 <= 256) {
                              break L24;
                            } else {
                              var6 = var6 >> 1;
                              break L24;
                            }
                          }
                          if (256 < var7) {
                            var7 = var7 >> 1;
                            continue L22;
                          } else {
                            continue L22;
                          }
                        }
                      } else {
                        ((uv) this).field_s = new cb(((uv) this).field_g);
                        var6 = var4;
                        ((uv) this).field_l = new rt[var8];
                        var7 = var5;
                        var8 = 0;
                        L25: while (true) {
                          L26: {
                            if (var6 > 256) {
                              break L26;
                            } else {
                              if (var7 <= 256) {
                                ((uv) this).field_r = var4;
                                ((uv) this).field_p = var5;
                                return;
                              } else {
                                break L26;
                              }
                            }
                          }
                          L27: {
                            int incrementValue$11 = var8;
                            var8++;
                            ((uv) this).field_l[incrementValue$11] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                            if (var6 <= 256) {
                              break L27;
                            } else {
                              var6 = var6 >> 1;
                              break L27;
                            }
                          }
                          if (256 < var7) {
                            var7 = var7 >> 1;
                            continue L25;
                          } else {
                            continue L25;
                          }
                        }
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L28: {
                  if (var6 <= 256) {
                    break L28;
                  } else {
                    var6 = var6 >> 1;
                    break L28;
                  }
                }
                var8++;
                if (var7 > 256) {
                  var7 = var7 >> 1;
                  continue L20;
                } else {
                  continue L20;
                }
              }
            } else {
              if (var5 <= 256) {
                ((uv) this).field_s = null;
                ((uv) this).field_r = var4;
                ((uv) this).field_p = var5;
                return;
              } else {
                var6 = var4;
                var7 = var5;
                var8 = 0;
                L29: while (true) {
                  L30: {
                    if (var6 > 256) {
                      break L30;
                    } else {
                      if (256 >= var7) {
                        L31: {
                          if (((uv) this).field_s != null) {
                            var6 = var4;
                            ((uv) this).field_l = new rt[var8];
                            var7 = var5;
                            var8 = 0;
                            break L31;
                          } else {
                            ((uv) this).field_s = new cb(((uv) this).field_g);
                            var6 = var4;
                            ((uv) this).field_l = new rt[var8];
                            var7 = var5;
                            var8 = 0;
                            break L31;
                          }
                        }
                        L32: while (true) {
                          L33: {
                            if (var6 > 256) {
                              break L33;
                            } else {
                              if (var7 <= 256) {
                                ((uv) this).field_r = var4;
                                ((uv) this).field_p = var5;
                                return;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            int incrementValue$12 = var8;
                            var8++;
                            ((uv) this).field_l[incrementValue$12] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                            if (var6 <= 256) {
                              break L34;
                            } else {
                              var6 = var6 >> 1;
                              break L34;
                            }
                          }
                          if (256 < var7) {
                            var7 = var7 >> 1;
                            continue L32;
                          } else {
                            continue L32;
                          }
                        }
                      } else {
                        break L30;
                      }
                    }
                  }
                  L35: {
                    if (var6 <= 256) {
                      break L35;
                    } else {
                      var6 = var6 >> 1;
                      break L35;
                    }
                  }
                  var8++;
                  if (var7 > 256) {
                    var7 = var7 >> 1;
                    continue L29;
                  } else {
                    continue L29;
                  }
                }
              }
            }
          }
        } else {
          L36: {
            ((uv) this).field_w = null;
            var4 = b.a(((uv) this).field_t, (byte) -95);
            var5 = b.a(((uv) this).field_n, (byte) -95);
            if (((uv) this).field_r != var4) {
              break L36;
            } else {
              if (~var5 != ~((uv) this).field_p) {
                break L36;
              } else {
                return;
              }
            }
          }
          L37: {
            if (((uv) this).field_l != null) {
              var6 = 0;
              L38: while (true) {
                if (~((uv) this).field_l.length >= ~var6) {
                  ((uv) this).field_l = null;
                  break L37;
                } else {
                  ((uv) this).field_l[var6].b(0);
                  var6++;
                  continue L38;
                }
              }
            } else {
              break L37;
            }
          }
          L39: {
            if (256 < var4) {
              break L39;
            } else {
              if (var5 <= 256) {
                ((uv) this).field_s = null;
                ((uv) this).field_r = var4;
                ((uv) this).field_p = var5;
                return;
              } else {
                break L39;
              }
            }
          }
          var6 = var4;
          var7 = var5;
          var8 = 0;
          L40: while (true) {
            L41: {
              if (var6 > 256) {
                break L41;
              } else {
                if (256 >= var7) {
                  L42: {
                    if (((uv) this).field_s != null) {
                      var6 = var4;
                      ((uv) this).field_l = new rt[var8];
                      var7 = var5;
                      var8 = 0;
                      break L42;
                    } else {
                      ((uv) this).field_s = new cb(((uv) this).field_g);
                      var6 = var4;
                      ((uv) this).field_l = new rt[var8];
                      var7 = var5;
                      var8 = 0;
                      break L42;
                    }
                  }
                  L43: while (true) {
                    L44: {
                      if (var6 > 256) {
                        break L44;
                      } else {
                        if (var7 <= 256) {
                          ((uv) this).field_r = var4;
                          ((uv) this).field_p = var5;
                          return;
                        } else {
                          break L44;
                        }
                      }
                    }
                    L45: {
                      int incrementValue$13 = var8;
                      var8++;
                      ((uv) this).field_l[incrementValue$13] = new rt(((uv) this).field_g, 3553, 34842, var6, var7);
                      if (var6 <= 256) {
                        break L45;
                      } else {
                        var6 = var6 >> 1;
                        break L45;
                      }
                    }
                    if (256 < var7) {
                      var7 = var7 >> 1;
                      continue L43;
                    } else {
                      continue L43;
                    }
                  }
                } else {
                  break L41;
                }
              }
            }
            L46: {
              if (var6 <= 256) {
                break L46;
              } else {
                var6 = var6 >> 1;
                break L46;
              }
            }
            var8++;
            if (var7 > 256) {
              var7 = var7 >> 1;
              continue L40;
            } else {
              continue L40;
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
        Object stackIn_2_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        hja stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hja) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("uv.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final boolean c(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 78) {
          L0: {
            var3 = null;
            hja discarded$8 = uv.a((String) null, (cn) null, (String) null, -53);
            if (((uv) this).field_q == null) {
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
            if (((uv) this).field_q == null) {
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
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        ((uv) this).field_g.e(1, true);
        ((uv) this).field_g.a(true, (kl) null);
        ((uv) this).field_g.e(0, true);
        if (param1 < 117) {
            boolean discarded$0 = ((uv) this).e(-29);
        }
    }

    final boolean a(byte param0) {
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param0 == 65) {
            break L0;
          } else {
            boolean discarded$1 = ((uv) this).c((byte) -83);
            break L0;
          }
        }
        if (((uv) this).field_g.field_id) {
          if (((uv) this).field_g.field_Vc) {
            if (((uv) this).field_g.field_z) {
              ((uv) this).field_q = new cb(((uv) this).field_g);
              ((uv) this).field_x = new rt(((uv) this).field_g, 3553, 34842, 256, 256);
              ((uv) this).field_x.a(false, false, -3554);
              ((uv) this).field_i = new rt(((uv) this).field_g, 3553, 34842, 256, 256);
              ((uv) this).field_i.a(false, false, -3554);
              ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, (byte) 81);
              ((uv) this).field_q.a(true, ((uv) this).field_x, 0);
              ((uv) this).field_q.a(true, ((uv) this).field_i, 1);
              ((uv) this).field_q.a(0, (byte) -91);
              if (!((uv) this).field_q.c(-84)) {
                ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, 0);
                return false;
              } else {
                L1: {
                  L2: {
                    ((uv) this).field_g.b((ks) (Object) ((uv) this).field_q, 0);
                    ((uv) this).field_m = dga.a(21885, ((uv) this).field_g, new fca[1]);
                    ((uv) this).field_v = dga.a(param0 ^ 21820, ((uv) this).field_g, new fca[1]);
                    ((uv) this).field_j = dga.a(21885, ((uv) this).field_g, new fca[1]);
                    ((uv) this).field_w = dga.a(21885, ((uv) this).field_g, new fca[1]);
                    if (null == ((uv) this).field_v) {
                      break L2;
                    } else {
                      if (((uv) this).field_m == null) {
                        break L2;
                      } else {
                        if (null == ((uv) this).field_j) {
                          break L2;
                        } else {
                          if (null == ((uv) this).field_w) {
                            break L2;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                }
                return stackIn_15_0 != 0;
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
            field_k = null;
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
              stackIn_8_0 = (ei) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (lqa) (Object) stackIn_8_0;
        } else {
          L1: {
            var1 = baa.field_d.field_i;
            if (var1 != null) {
              stackOut_3_0 = var1.field_b;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (ei) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (lqa) (Object) stackIn_4_0;
        }
    }

    final void d(byte param0) {
        ((uv) this).field_q = null;
        ((uv) this).field_w = null;
        ((uv) this).field_x = null;
        ((uv) this).field_i = null;
        ((uv) this).field_j = null;
        ((uv) this).field_s = null;
        ((uv) this).field_m = null;
        ((uv) this).field_l = null;
        if (param0 >= -9) {
          return;
        } else {
          ((uv) this).field_v = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Mirrors";
        field_k = new String[1];
        field_k[0] = "Powerdown";
    }
}
