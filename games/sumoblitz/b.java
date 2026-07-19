/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static volatile int field_a;
    static String field_d;
    static boolean field_c;
    private fr field_e;
    static String field_f;
    private sn field_b;

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -69) {
            field_f = (String) null;
        }
    }

    b(fr param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        if (param0 <= 1) {
            return;
        }
        if (!(null != lt.field_m)) {
            return;
        }
        if (null != gk.field_o) {
            ib.d(1);
        }
    }

    final boolean b(byte param0) {
        mk var2 = null;
        mk var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (this.field_e.field_xc) {
          if (this.field_e.field_wb) {
            L0: {
              if (this.field_b != null) {
                break L0;
              } else {
                var3 = sk.a(this.field_e, false, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
                var2 = var3;
                if (var2 != null) {
                  var3 = var2;
                  this.field_b = hc.a(-14382, new mk[]{var3}, this.field_e);
                  break L0;
                } else {
                  if (param0 != -101) {
                    L1: {
                      field_a = -88;
                      if (null == this.field_b) {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        break L1;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_32_0 = stackOut_30_0;
                        break L1;
                      }
                    }
                    return stackIn_32_0 != 0;
                  } else {
                    L2: {
                      if (null == this.field_b) {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        break L2;
                      } else {
                        stackOut_26_0 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        break L2;
                      }
                    }
                    return stackIn_28_0 != 0;
                  }
                }
              }
            }
            if (param0 != -101) {
              L3: {
                field_a = -88;
                if (null == this.field_b) {
                  stackOut_42_0 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  break L3;
                } else {
                  stackOut_41_0 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  break L3;
                }
              }
              return stackIn_43_0 != 0;
            } else {
              L4: {
                if (null == this.field_b) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L4;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L4;
                }
              }
              return stackIn_39_0 != 0;
            }
          } else {
            if (param0 == -101) {
              L5: {
                if (null == this.field_b) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L5;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L5;
                }
              }
              return stackIn_20_0 != 0;
            } else {
              L6: {
                field_a = -88;
                if (null == this.field_b) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L6;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L6;
                }
              }
              return stackIn_16_0 != 0;
            }
          }
        } else {
          if (param0 != -101) {
            L7: {
              field_a = -88;
              if (null == this.field_b) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L7;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L7;
              }
            }
            return stackIn_9_0 != 0;
          } else {
            L8: {
              if (null == this.field_b) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L8;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L8;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final boolean a(ek param0, float param1, boolean param2, ek param3) {
        RuntimeException var5 = null;
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        cs var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.b((byte) -101)) {
              L1: {
                var11 = this.field_e.field_G;
                var6 = new kf(this.field_e, 6408, param0.field_p, param0.field_q);
                this.field_e.a(var11, -98);
                var7 = param2 ? 1 : 0;
                var11.a(var6, 0, -14269);
                if (var11.h(-276)) {
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glMatrixMode(5889);
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                  jaggl.OpenGL.glPushAttrib(2048);
                  jaggl.OpenGL.glViewport(0, 0, param0.field_p, param0.field_q);
                  jaggl.OpenGL.glUseProgramObjectARB(this.field_b.field_c);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_c, "heightMap"), 0);
                  jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_c, "rcpRelief"), 1.0f / param1);
                  jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_c, "sampleSize"), 1.0f / (float)param3.field_p, 1.0f / (float)param3.field_q);
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var8 >= param0.field_o) {
                          break L4;
                        } else {
                          var9 = (float)var8 / (float)param0.field_o;
                          this.field_e.a(117, param3);
                          jaggl.OpenGL.glBegin(7);
                          jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var9);
                          jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
                          jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var9);
                          jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
                          jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var9);
                          jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
                          jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var9);
                          jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
                          jaggl.OpenGL.glEnd();
                          param0.a(0, (byte) 80, 0, var8, param0.field_q, param0.field_p, 0, 0);
                          var8++;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            if (var10 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      var7 = 1;
                      break L3;
                    }
                    jaggl.OpenGL.glPopMatrix();
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var11.a(0, 17012);
              this.field_e.a((byte) -72, (mw) (var11));
              stackOut_13_0 = var7;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("b.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        hg var11 = null;
        pl var12 = null;
        eg var13 = null;
        int[] var14 = null;
        eg var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -30084) {
                break L1;
              } else {
                b.c((byte) -53);
                break L1;
              }
            }
            L2: {
              L3: {
                var12 = ig.field_a;
                var2 = var12.e(-31302);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (-2 != (var2 ^ -1)) {
                      break L4;
                    } else {
                      var11 = (hg) ((Object) hi.field_f.b(param0 + 29968));
                      if (var11 == null) {
                        kk.a((byte) -113);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var11.b(false);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (-3 == (var2 ^ -1)) {
                      break L5;
                    } else {
                      ms.a("A1: " + di.b((byte) 110), (Throwable) null, 0);
                      kk.a((byte) -120);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13 = (eg) ((Object) wr.field_E.b(123));
                  if (var13 == null) {
                    kk.a((byte) -122);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var13.field_m = lr.a(-14808);
                    var13.field_o = true;
                    var13.field_k = var13.field_m[0];
                    var13.b(false);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var16 = lr.a(-14808);
              var14 = var16;
              var3 = var14;
              var10 = var3;
              var4 = var10;
              var5 = var12;
              var6 = ((fs) ((Object) var5)).e(param0 + -1218);
              var7 = 0;
              L6: while (true) {
                if (var7 >= var6) {
                  var15 = (eg) ((Object) wr.field_E.b(-120));
                  if (var15 == null) {
                    kk.a((byte) -111);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var15.field_o = true;
                    var15.field_k = var16[0];
                    var15.field_m = var3;
                    var15.b(false);
                    break L2;
                  }
                } else {
                  var10[var7] = ((fs) ((Object) var5)).c(true);
                  var7++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L6;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "b.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = 0;
        field_d = "You are not currently logged in to the<nbsp>game.";
        field_f = "Loading levels";
    }
}
