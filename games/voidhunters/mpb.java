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
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_37_0 = null;
            java.net.URL stackIn_39_0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_36_0 = null;
            java.net.URL stackOut_38_0 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            var9 = VoidHunters.field_G;
            try {
              var5_ref = param1.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 > var7_int) {
                        break L4;
                      } else {
                        if (param3 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param4 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                  L7: {
                    if (param3 == null) {
                      break L7;
                    } else {
                      if (param3.length() <= 0) {
                        break L7;
                      } else {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param3);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param4 == null) {
                      break L8;
                    } else {
                      if (0 < param4.length()) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param4);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() <= var6) {
                      StringBuilder discarded$12 = var7.append('/');
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_36_0 = new java.net.URL(param1, var7.toString());
                      stackIn_37_0 = stackOut_36_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_38_0 = (java.net.URL) param1;
                    stackIn_39_0 = stackOut_38_0;
                    return stackIn_39_0;
                  }
                  return stackIn_37_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_40_0 = (RuntimeException) var5;
                stackOut_40_1 = new StringBuilder().append("mpb.Q(").append(-1).append(',');
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param1 == null) {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "null";
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L11;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L11;
                }
              }
              L12: {
                stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(50).append(',');
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param3 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L12;
                } else {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L12;
                }
              }
              L13: {
                stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param4 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L13;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L13;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
            }
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
              if (((mpb) this).field_p == null) {
                ((mpb) this).field_d.a(97, (pib) (Object) param0);
                ((mpb) this).field_d.a((byte) -109, (jaa) (Object) ((mpb) this).field_s);
                ((mpb) this).field_s.a(0, 0);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var5_long = ((mpb) this).field_g.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5_long);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), mqa.field_o, 0.0f, 0.0f);
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
                break L1;
              } else {
                ((mpb) this).field_d.a((byte) -123, (jaa) (Object) ((mpb) this).field_j);
                var5_int = wsb.a(((mpb) this).field_o, 1302374146);
                var6 = wsb.a(((mpb) this).field_u, 1302374146);
                var7_int = 0;
                L2: while (true) {
                  L3: {
                    if (256 < var5_int) {
                      break L3;
                    } else {
                      if (var6 <= 256) {
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
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                    ((mpb) this).field_j.a(0, (byte) -127, ((mpb) this).field_p[var7_int]);
                    if (var5_int > 256) {
                      var5_int = var5_int >> 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var6 > 256) {
                      var6 = var6 >> 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
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
                      break L6;
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
                      break L6;
                    }
                  }
                  var7_int++;
                  continue L2;
                }
              }
            }
            ((mpb) this).field_s.a(0, 1);
            ((mpb) this).field_d.a(param1 + 3097, (pib) (Object) ((mpb) this).field_i);
            var5_long = ((mpb) this).field_v.field_c;
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
            ((mpb) this).field_s.a(0, 0);
            ((mpb) this).field_d.a(53, (pib) (Object) ((mpb) this).field_t);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("mpb.I(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ')');
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
            boolean discarded$2 = ((mpb) this).f((byte) 118);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = wsb.a(((mpb) this).field_o, param2 ^ -1302392064);
            var5 = wsb.a(((mpb) this).field_u, param2 + 1302393600);
            if (~((mpb) this).field_q != ~var4) {
              break L2;
            } else {
              if (~var5 != ~((mpb) this).field_r) {
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
                if (~var6 <= ~((mpb) this).field_p.length) {
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
                if (var6 > 256) {
                  break L9;
                } else {
                  if (var7 <= 256) {
                    var6 = var4;
                    ((mpb) this).field_p = new aia[var8];
                    var7 = var5;
                    var8 = 0;
                    L10: while (true) {
                      L11: {
                        if (256 < var6) {
                          break L11;
                        } else {
                          if (var7 <= 256) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        int incrementValue$3 = var8;
                        var8++;
                        ((mpb) this).field_p[incrementValue$3] = new aia(((mpb) this).field_d, 3553, 34842, var6, var7);
                        if (var7 <= 256) {
                          break L12;
                        } else {
                          var7 = var7 >> 1;
                          break L12;
                        }
                      }
                      if (var6 > 256) {
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_k = "Don't mind";
    }
}
