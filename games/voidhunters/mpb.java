/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class mpb extends mea {
    private int field_u;
    static int[] field_h;
    private int field_r;
    private int field_q;
    private int field_o;
    private rpa field_j;
    static String[] field_l;
    private rpa field_s;
    static String field_k;
    private aia field_t;
    private of field_g;
    private of field_n;
    private of field_v;
    private of field_m;
    private aia field_i;
    private aia[] field_p;

    final boolean f(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 15) {
          L0: {
            L1: {
              if (!((mpb) this).field_d.field_U) {
                break L1;
              } else {
                if (!((mpb) this).field_d.field_B) {
                  break L1;
                } else {
                  if (!((mpb) this).field_d.field_I) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, byte param2, String param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = VoidHunters.field_G;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 >= (var7_int ^ -1)) {
                      if (0 > param0) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if ((var7_int ^ -1) <= -1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 > var7_int) {
                      break L4;
                    } else {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if ((param0 ^ -1) < -1) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if ((param3.length() ^ -1) >= -1) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param3);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param4 == null) {
                    break L9;
                  } else {
                    if (0 < param4.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5.length() <= var6) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  }
                }
                try {
                  L11: {
                    if (param2 > 43) {
                      break L11;
                    } else {
                      field_l = null;
                      break L11;
                    }
                  }
                  stackOut_41_0 = new java.net.URL(param1, var7.toString());
                  stackIn_42_0 = stackOut_41_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_42_0;
                }
              }
              var6 = var7_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(aia param0, int param1, aia param2, int param3) {
        long var5 = 0L;
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        long var7 = 0L;
        long var8 = 0L;
        int var10 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          jaggl.OpenGL.glPushAttrib(2048);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          if (((mpb) this).field_p == null) {
            ((mpb) this).field_d.a(97, (pib) (Object) param0);
            ((mpb) this).field_d.a((byte) -109, (jaa) (Object) ((mpb) this).field_s);
            ((mpb) this).field_s.a(0, 0);
            jaggl.OpenGL.glViewport(0, 0, 256, 256);
            var5 = ((mpb) this).field_g.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var5);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "params"), mqa.field_o, 0.0f, 0.0f);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(0, 0);
            jaggl.OpenGL.glTexCoord2f((float)((mpb) this).field_o, 0.0f);
            jaggl.OpenGL.glVertex2i(1, 0);
            jaggl.OpenGL.glTexCoord2f((float)((mpb) this).field_o, (float)((mpb) this).field_u);
            jaggl.OpenGL.glVertex2i(1, 1);
            jaggl.OpenGL.glTexCoord2f(0.0f, (float)((mpb) this).field_u);
            jaggl.OpenGL.glVertex2i(0, 1);
            jaggl.OpenGL.glEnd();
            break L0;
          } else {
            ((mpb) this).field_d.a((byte) -123, (jaa) (Object) ((mpb) this).field_j);
            var5_int = wsb.a(((mpb) this).field_o, 1302374146);
            var6 = wsb.a(((mpb) this).field_u, 1302374146);
            var7_int = 0;
            L1: while (true) {
              L2: {
                if (256 < var5_int) {
                  break L2;
                } else {
                  if (-257 <= (var6 ^ -1)) {
                    ((mpb) this).field_d.a((jaa) (Object) ((mpb) this).field_j, 2896);
                    ((mpb) this).field_d.a(107, (pib) (Object) ((mpb) this).field_p[var7_int + -1]);
                    ((mpb) this).field_d.a((byte) -124, (jaa) (Object) ((mpb) this).field_s);
                    ((mpb) this).field_s.a(0, 0);
                    jaggl.OpenGL.glViewport(0, 0, 256, 256);
                    var8 = ((mpb) this).field_m.field_c;
                    jaggl.OpenGL.glUseProgramObjectARB(var8);
                    jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                    jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "params"), mqa.field_o, 0.0f, 0.0f);
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
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                ((mpb) this).field_j.a(0, (byte) -127, ((mpb) this).field_p[var7_int]);
                if (var5_int > 256) {
                  var5_int = var5_int >> 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((var6 ^ -1) < -257) {
                  var6 = var6 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (var7_int != 0) {
                ((mpb) this).field_d.a(80, (pib) (Object) ((mpb) this).field_p[var7_int - 1]);
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
                var7_int++;
                continue L1;
              } else {
                ((mpb) this).field_d.a(40, (pib) (Object) param0);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(0, 0);
                jaggl.OpenGL.glTexCoord2f((float)((mpb) this).field_o, 0.0f);
                jaggl.OpenGL.glVertex2i(1, 0);
                jaggl.OpenGL.glTexCoord2f((float)((mpb) this).field_o, (float)((mpb) this).field_u);
                jaggl.OpenGL.glVertex2i(1, 1);
                jaggl.OpenGL.glTexCoord2f(0.0f, (float)((mpb) this).field_u);
                jaggl.OpenGL.glVertex2i(0, 1);
                jaggl.OpenGL.glEnd();
                var7_int++;
                continue L1;
              }
            }
          }
        }
        ((mpb) this).field_s.a(0, 1);
        ((mpb) this).field_d.a(param1 + 3097, (pib) (Object) ((mpb) this).field_i);
        var5 = ((mpb) this).field_v.field_c;
        jaggl.OpenGL.glUseProgramObjectARB(var5);
        jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "baseTex"), 0);
        jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "step"), 0.00390625f, 0.0f, 0.0f);
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
        ((mpb) this).field_s.a(0, 0);
        ((mpb) this).field_d.a(53, (pib) (Object) ((mpb) this).field_t);
        jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "step"), 0.0f, 0.00390625f, 0.0f);
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
        jaggl.OpenGL.glPopAttrib();
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
        ((mpb) this).field_d.a((jaa) (Object) ((mpb) this).field_s, 2896);
        var7 = ((mpb) this).field_n.field_c;
        if (param1 == -3009) {
          jaggl.OpenGL.glUseProgramObjectARB(var7);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), pba.field_q, u.field_q, 0.0f);
          ((mpb) this).field_d.h(33984, 1);
          ((mpb) this).field_d.a(57, (pib) (Object) ((mpb) this).field_i);
          ((mpb) this).field_d.h(33984, 0);
          ((mpb) this).field_d.a(73, (pib) (Object) param0);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          ((mpb) this).field_o = param1;
          ((mpb) this).field_u = param0;
          if (param2 == -19454) {
            break L0;
          } else {
            boolean discarded$1 = ((mpb) this).f((byte) 118);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = wsb.a(((mpb) this).field_o, param2 ^ -1302392064);
            var5 = wsb.a(((mpb) this).field_u, param2 + 1302393600);
            if (((mpb) this).field_q != var4) {
              break L2;
            } else {
              if (var5 != ((mpb) this).field_r) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (null == ((mpb) this).field_p) {
              break L3;
            } else {
              var6 = 0;
              L4: while (true) {
                if (var6 >= ((mpb) this).field_p.length) {
                  ((mpb) this).field_p = null;
                  break L3;
                } else {
                  ((mpb) this).field_p[var6].e(0);
                  var6++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            L6: {
              if (var4 > 256) {
                break L6;
              } else {
                if (var5 <= 256) {
                  ((mpb) this).field_j = null;
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var6 = var4;
              var7 = var5;
              var8 = 0;
              if (((mpb) this).field_j != null) {
                break L7;
              } else {
                ((mpb) this).field_j = new rpa(((mpb) this).field_d);
                break L7;
              }
            }
            L8: while (true) {
              L9: {
                if (-257 > var6) {
                  break L9;
                } else {
                  if (-257 >= var7) {
                    var6 = var4;
                    ((mpb) this).field_p = new aia[var8];
                    var7 = var5;
                    var8 = 0;
                    L10: while (true) {
                      L11: {
                        if (256 < var6) {
                          break L11;
                        } else {
                          if ((var7 ^ -1) >= -257) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        var8++;
                        ((mpb) this).field_p[var8] = new aia(((mpb) this).field_d, 3553, 34842, var6, var7);
                        if (-257 <= var7) {
                          break L12;
                        } else {
                          var7 = var7 >> 1;
                          break L12;
                        }
                      }
                      if (-257 < var6) {
                        var6 = var6 >> 1;
                        continue L10;
                      } else {
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L13: {
                if (256 < var6) {
                  var6 = var6 >> 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              var8++;
              if (256 < var7) {
                var7 = var7 >> 1;
                continue L8;
              } else {
                continue L8;
              }
            }
          }
          ((mpb) this).field_r = var5;
          ((mpb) this).field_q = var4;
          break L1;
        }
    }

    final int d(byte param0) {
        if (param0 != 7) {
            return -72;
        }
        return 1;
    }

    final boolean a(int param0) {
        int var2 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (!((mpb) this).field_d.field_U) {
            break L0;
          } else {
            if (!((mpb) this).field_d.field_B) {
              break L0;
            } else {
              if (!((mpb) this).field_d.field_I) {
                break L0;
              } else {
                ((mpb) this).field_s = new rpa(((mpb) this).field_d);
                ((mpb) this).field_i = new aia(((mpb) this).field_d, 3553, 34842, 256, 256);
                ((mpb) this).field_i.a(false, false, 10497);
                ((mpb) this).field_t = new aia(((mpb) this).field_d, 3553, 34842, 256, 256);
                ((mpb) this).field_t.a(false, false, 10497);
                ((mpb) this).field_d.a((byte) -122, (jaa) (Object) ((mpb) this).field_s);
                ((mpb) this).field_s.a(0, (byte) -125, ((mpb) this).field_i);
                ((mpb) this).field_s.a(1, (byte) -128, ((mpb) this).field_t);
                ((mpb) this).field_s.a(0, 0);
                if (!((mpb) this).field_s.g(92)) {
                  ((mpb) this).field_d.a((jaa) (Object) ((mpb) this).field_s, 2896);
                  return false;
                } else {
                  L1: {
                    L2: {
                      ((mpb) this).field_d.a((jaa) (Object) ((mpb) this).field_s, 2896);
                      ((mpb) this).field_g = wra.a(new ts[1], (byte) 107, ((mpb) this).field_d);
                      ((mpb) this).field_m = wra.a(new ts[1], (byte) 107, ((mpb) this).field_d);
                      ((mpb) this).field_n = wra.a(new ts[1], (byte) 107, ((mpb) this).field_d);
                      ((mpb) this).field_v = wra.a(new ts[1], (byte) 107, ((mpb) this).field_d);
                      if (null == ((mpb) this).field_m) {
                        break L2;
                      } else {
                        if (null == ((mpb) this).field_g) {
                          break L2;
                        } else {
                          if (((mpb) this).field_n == null) {
                            break L2;
                          } else {
                            if (null == ((mpb) this).field_v) {
                              break L2;
                            } else {
                              stackOut_10_0 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  }
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        }
        var2 = 89 / ((-43 - param0) / 33);
        return false;
    }

    final boolean f(int param0) {
        if (param0 != -257) {
            ((mpb) this).field_p = null;
        }
        return null != ((mpb) this).field_s ? true : false;
    }

    mpb(qfa param0) {
        super(param0);
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        ((mpb) this).field_d.h(33984, param1);
        ((mpb) this).field_d.a(77, (pib) null);
        ((mpb) this).field_d.h(33984, 0);
    }

    final void c(byte param0) {
        if (param0 != 66) {
            return;
        }
        ((mpb) this).field_j = null;
        ((mpb) this).field_p = null;
        ((mpb) this).field_t = null;
        ((mpb) this).field_s = null;
        ((mpb) this).field_i = null;
        ((mpb) this).field_g = null;
        ((mpb) this).field_m = null;
        ((mpb) this).field_n = null;
        ((mpb) this).field_v = null;
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        field_h = null;
        if (param0 != 0) {
            field_k = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_k = "Don't mind";
    }
}
