/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
              if (!this.field_d.field_U) {
                break L1;
              } else {
                if (!this.field_d.field_B) {
                  break L1;
                } else {
                  if (!this.field_d.field_I) {
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
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = VoidHunters.field_G;
            try {
              L0: {
                var5_ref = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (0 > param0) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if ((var7_int ^ -1) <= -1) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 + 1);
                        if (0 > var7_int) {
                          break L5;
                        } else {
                          if (param3 == null) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param4 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if ((param0 ^ -1) < -1) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param0));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param3 == null) {
                        break L9;
                      } else {
                        if ((param3.length() ^ -1) >= -1) {
                          break L9;
                        } else {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param3);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param4 == null) {
                        break L10;
                      } else {
                        if (0 < param4.length()) {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param4);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5_ref.length() <= var6) {
                        discarded$16 = var7.append('/');
                        break L11;
                      } else {
                        discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        L13: {
                          if (param2 > 43) {
                            break L13;
                          } else {
                            field_l = (String[]) null;
                            break L13;
                          }
                        }
                        stackOut_41_0 = new java.net.URL(param1, var7.toString());
                        stackIn_42_0 = stackOut_41_0;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_43_0 = (java.net.URL) (param1);
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) (var5);
                stackOut_45_1 = new StringBuilder().append("mpb.Q(").append(param0).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param1 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L14;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L14;
                }
              }
              L15: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param2).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param3 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L15;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L15;
                }
              }
              L16: {
                stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L16;
                } else {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L16;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(aia param0, int param1, aia param2, int param3) {
        RuntimeException var5 = null;
        long var5_long = 0L;
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        long var7 = 0L;
        long var8 = 0L;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              if (this.field_p == null) {
                this.field_d.a(97, param0);
                this.field_d.a((byte) -109, (jaa) (this.field_s));
                this.field_s.a(0, 0);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var5_long = this.field_g.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5_long);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), mqa.field_o, 0.0f, 0.0f);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(0, 0);
                jaggl.OpenGL.glTexCoord2f((float)this.field_o, 0.0f);
                jaggl.OpenGL.glVertex2i(1, 0);
                jaggl.OpenGL.glTexCoord2f((float)this.field_o, (float)this.field_u);
                jaggl.OpenGL.glVertex2i(1, 1);
                jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_u);
                jaggl.OpenGL.glVertex2i(0, 1);
                jaggl.OpenGL.glEnd();
                break L1;
              } else {
                this.field_d.a((byte) -123, (jaa) (this.field_j));
                var5_int = wsb.a(this.field_o, 1302374146);
                var6 = wsb.a(this.field_u, 1302374146);
                var7_int = 0;
                L2: while (true) {
                  L3: {
                    if (256 < var5_int) {
                      break L3;
                    } else {
                      if (-257 <= (var6 ^ -1)) {
                        this.field_d.a(this.field_j, 2896);
                        this.field_d.a(107, this.field_p[var7_int + -1]);
                        this.field_d.a((byte) -124, (jaa) (this.field_s));
                        this.field_s.a(0, 0);
                        jaggl.OpenGL.glViewport(0, 0, 256, 256);
                        var8 = this.field_m.field_c;
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
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                    this.field_j.a(0, (byte) -127, this.field_p[var7_int]);
                    if (var5_int > 256) {
                      var5_int = var5_int >> 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var6 ^ -1) < -257) {
                      var6 = var6 >> 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var7_int != 0) {
                      this.field_d.a(80, this.field_p[var7_int - 1]);
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
                      this.field_d.a(40, param0);
                      jaggl.OpenGL.glBegin(7);
                      jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                      jaggl.OpenGL.glVertex2i(0, 0);
                      jaggl.OpenGL.glTexCoord2f((float)this.field_o, 0.0f);
                      jaggl.OpenGL.glVertex2i(1, 0);
                      jaggl.OpenGL.glTexCoord2f((float)this.field_o, (float)this.field_u);
                      jaggl.OpenGL.glVertex2i(1, 1);
                      jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_u);
                      jaggl.OpenGL.glVertex2i(0, 1);
                      jaggl.OpenGL.glEnd();
                      break L6;
                    }
                  }
                  var7_int++;
                  continue L2;
                }
              }
            }
            this.field_s.a(0, 1);
            this.field_d.a(param1 + 3097, this.field_i);
            var5_long = this.field_v.field_c;
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
            this.field_s.a(0, 0);
            this.field_d.a(53, this.field_t);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "step"), 0.0f, 0.00390625f, 0.0f);
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
            this.field_d.a(this.field_s, 2896);
            var7 = this.field_n.field_c;
            if (param1 == -3009) {
              jaggl.OpenGL.glUseProgramObjectARB(var7);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), pba.field_q, u.field_q, 0.0f);
              this.field_d.h(33984, 1);
              this.field_d.a(57, this.field_i);
              this.field_d.h(33984, 0);
              this.field_d.a(73, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("mpb.I(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        int incrementValue$3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          this.field_o = param1;
          this.field_u = param0;
          if (param2 == -19454) {
            break L0;
          } else {
            discarded$2 = this.f((byte) 118);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = wsb.a(this.field_o, param2 ^ -1302392064);
            var5 = wsb.a(this.field_u, param2 + 1302393600);
            if (this.field_q != var4) {
              break L2;
            } else {
              if (var5 != this.field_r) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (null == this.field_p) {
              break L3;
            } else {
              var6 = 0;
              L4: while (true) {
                if (var6 >= this.field_p.length) {
                  this.field_p = null;
                  break L3;
                } else {
                  this.field_p[var6].e(0);
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
                  this.field_j = null;
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
              if (this.field_j != null) {
                break L7;
              } else {
                this.field_j = new rpa(this.field_d);
                break L7;
              }
            }
            L8: while (true) {
              L9: {
                if (-257 > (var6 ^ -1)) {
                  break L9;
                } else {
                  if (-257 <= (var7 ^ -1)) {
                    var6 = var4;
                    this.field_p = new aia[var8];
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
                        incrementValue$3 = var8;
                        var8++;
                        this.field_p[incrementValue$3] = new aia(this.field_d, 3553, 34842, var6, var7);
                        if (-257 <= (var7 ^ -1)) {
                          break L12;
                        } else {
                          var7 = var7 >> 1;
                          break L12;
                        }
                      }
                      if (-257 > (var6 ^ -1)) {
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
          this.field_r = var5;
          this.field_q = var4;
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
          if (!this.field_d.field_U) {
            break L0;
          } else {
            if (!this.field_d.field_B) {
              break L0;
            } else {
              if (!this.field_d.field_I) {
                break L0;
              } else {
                this.field_s = new rpa(this.field_d);
                this.field_i = new aia(this.field_d, 3553, 34842, 256, 256);
                this.field_i.a(false, false, 10497);
                this.field_t = new aia(this.field_d, 3553, 34842, 256, 256);
                this.field_t.a(false, false, 10497);
                this.field_d.a((byte) -122, (jaa) (this.field_s));
                this.field_s.a(0, (byte) -125, this.field_i);
                this.field_s.a(1, (byte) -128, this.field_t);
                this.field_s.a(0, 0);
                if (!this.field_s.g(92)) {
                  this.field_d.a(this.field_s, 2896);
                  return false;
                } else {
                  L1: {
                    L2: {
                      this.field_d.a(this.field_s, 2896);
                      this.field_g = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.field_d);
                      this.field_m = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.field_d);
                      this.field_n = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")}, (byte) 107, this.field_d);
                      this.field_v = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")}, (byte) 107, this.field_d);
                      if (null == this.field_m) {
                        break L2;
                      } else {
                        if (null == this.field_g) {
                          break L2;
                        } else {
                          if (this.field_n == null) {
                            break L2;
                          } else {
                            if (null == this.field_v) {
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
            this.field_p = (aia[]) null;
        }
        return null != this.field_s ? true : false;
    }

    mpb(qfa param0) {
        super(param0);
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        this.field_d.h(33984, param1);
        this.field_d.a(77, (pib) null);
        this.field_d.h(33984, 0);
    }

    final void c(byte param0) {
        if (param0 != 66) {
            return;
        }
        this.field_j = null;
        this.field_p = null;
        this.field_t = null;
        this.field_s = null;
        this.field_i = null;
        this.field_g = null;
        this.field_m = null;
        this.field_n = null;
        this.field_v = null;
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        field_h = null;
        if (param0 != 0) {
            field_k = (String) null;
        }
    }

    static {
        field_l = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_k = "Don't mind";
    }
}
