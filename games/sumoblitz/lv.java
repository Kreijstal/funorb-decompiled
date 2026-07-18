/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lv extends bq {
    static int field_i;
    private boolean field_j;
    private sn field_k;
    private ch field_h;
    static String field_f;
    static String field_e;
    private boolean field_g;

    lv(fr param0, ch param1) {
        super(param0);
        RuntimeException runtimeException = null;
        mk var3 = null;
        mk var4 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        ((lv) this).field_j = false;
        ((lv) this).field_g = false;
        try {
          L0: {
            L1: {
              ((lv) this).field_h = param1;
              if (((lv) this).field_h.field_c == null) {
                break L1;
              } else {
                if (!((lv) this).field_b.field_N) {
                  break L1;
                } else {
                  if (!((lv) this).field_b.field_wb) {
                    break L1;
                  } else {
                    L2: {
                      var3 = sk.a(((lv) this).field_b, false, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                      var4 = sk.a(((lv) this).field_b, false, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                      ((lv) this).field_k = hc.a(-14382, new mk[2], ((lv) this).field_b);
                      stackOut_6_0 = this;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (null == ((lv) this).field_k) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 1;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        break L2;
                      }
                    }
                    ((lv) this).field_j = stackIn_10_1 != 0;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("lv.<init>(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        try {
            if (param0 >= -30) {
                field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lv.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        hp var3 = null;
        RuntimeException var3_ref = null;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = ((lv) this).field_b.j((byte) 62);
              if (!((lv) this).field_j) {
                break L1;
              } else {
                if (null == var3) {
                  break L1;
                } else {
                  ((lv) this).field_b.g(1, 113);
                  ((lv) this).field_b.a(41, (ht) (Object) var3);
                  ((lv) this).field_b.g(0, 97);
                  ((lv) this).field_b.a(121, (ht) (Object) ((lv) this).field_h.field_c);
                  var4 = ((lv) this).field_k.field_c;
                  jaggl.OpenGL.glUseProgramObjectARB(var4);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                  jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((lv) this).field_b.field_o[0], -((lv) this).field_b.field_o[1], -((lv) this).field_b.field_o[2]);
                  jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((lv) this).field_b.field_Fc, ((lv) this).field_b.field_z, ((lv) this).field_b.field_ac, 1.0f);
                  jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0f * Math.abs(((lv) this).field_b.field_o[1]) + 96.0f);
                  ((lv) this).field_g = true;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 >= 33) {
                break L2;
              } else {
                ((lv) this).field_k = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3_ref, "lv.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            field_f = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "lv.G(" + param0 + ')');
        }
    }

    final static jj a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jj[] var3 = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        jj stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        jj stackIn_12_0 = null;
        jj stackIn_18_0 = null;
        jj stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        jj stackOut_4_0 = null;
        jj stackOut_11_0 = null;
        jj stackOut_17_0 = null;
        jj stackOut_20_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = ji.a(param0, (byte) -57, "jagex-last-login-method");
            if (var2 == null) {
              stackOut_4_0 = na.field_c;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param1 == 1) {
                var3 = ie.a(32);
                var4 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var3.length >= ~var4) {
                        break L3;
                      } else {
                        var5 = var3[var4];
                        stackOut_11_0 = (jj) var5;
                        stackIn_21_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (((jj) (Object) stackIn_12_0).a(var2, param1 + -2184)) {
                            stackOut_17_0 = (jj) var5;
                            stackIn_18_0 = stackOut_17_0;
                            return stackIn_18_0;
                          } else {
                            var4++;
                            if (var6 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_20_0 = na.field_c;
                    stackIn_21_0 = stackOut_20_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (jj) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("lv.C(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 35) {
                break L1;
              } else {
                ((lv) this).field_g = true;
                break L1;
              }
            }
            L2: {
              if (!((lv) this).field_g) {
                ((lv) this).field_b.a(20, param2);
                ((lv) this).field_b.c(param1, true);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("lv.A(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((lv) this).field_g) {
                ((lv) this).field_b.g(1, 105);
                ((lv) this).field_b.a(84, (ht) null);
                ((lv) this).field_b.g(0, 80);
                ((lv) this).field_b.a(98, (ht) null);
                jaggl.OpenGL.glUseProgramObjectARB(0L);
                ((lv) this).field_g = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -125) {
                break L2;
              } else {
                field_e = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "lv.F(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -64) {
                break L1;
              } else {
                ((lv) this).field_h = null;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "lv.H(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (param0 < 39) {
            return;
        }
        try {
            if (((lv) this).field_g) {
                var4_int = 1 << (3 & param1);
                var5 = (float)(1 << ((56 & param1) >> 1308504131)) / 32.0f;
                var6 = 65535 & param2;
                var7 = (float)((param2 & 204417) >> 780041648) / 8.0f;
                var8 = ((lv) this).field_k.field_c;
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4_int * ((lv) this).field_b.field_Ac % 40000) / 40000.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_i = 0;
        field_f = "Visit the Account Management section on the main site to view.";
    }
}
