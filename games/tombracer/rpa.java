/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rpa extends qe {
    static String field_j;
    private boolean field_h;
    private boolean field_k;
    static boolean field_d;
    private cua field_e;
    static String field_g;
    static String field_f;
    static String field_c;
    private aaa field_i;

    final boolean b(int param0) {
        if (param0 != -11921) {
            this.field_k = true;
            return false;
        }
        return false;
    }

    final void a(boolean param0, int param1) {
        long var5 = 0L;
        int var4 = 82 % ((56 - param1) / 48);
        hoa var3 = this.field_a.n(16664);
        if (this.field_k) {
            if (var3 != null) {
                this.field_a.e(1, true);
                this.field_a.a(true, var3);
                this.field_a.e(0, true);
                this.field_a.a(true, this.field_i.field_c);
                var5 = this.field_e.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_a.field_Wb[0], -this.field_a.field_Wb[1], -this.field_a.field_Wb[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_a.field_wc, this.field_a.field_Fb, this.field_a.field_bc, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0f * Math.abs(this.field_a.field_Wb[1]) + 96.0f);
                this.field_h = true;
            }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        field_f = null;
        field_j = null;
        if (param0 >= -4) {
            field_j = (String) null;
        }
    }

    rpa(cka param0, aaa param1) {
        super(param0);
        RuntimeException runtimeException = null;
        fca var3 = null;
        fca var4 = null;
        fca var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_h = false;
        this.field_k = false;
        try {
          L0: {
            L1: {
              this.field_i = param1;
              if (this.field_i.field_c == null) {
                break L1;
              } else {
                if (!this.field_a.field_wb) {
                  break L1;
                } else {
                  if (!this.field_a.field_Vc) {
                    break L1;
                  } else {
                    L2: {
                      var5 = cpa.a(64, this.field_a, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                      var3 = var5;
                      var4 = cpa.a(64, this.field_a, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                      this.field_e = dga.a(21885, this.field_a, new fca[]{var5, var4});
                      stackOut_4_0 = this;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (this.field_e == null) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L2;
                      } else {
                        stackOut_5_0 = this;
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        break L2;
                      }
                    }
                    ((rpa) (this)).field_k = stackIn_7_1 != 0;
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("rpa.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
            this.b(true, -40);
        }
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32221) {
                break L1;
              } else {
                this.b(true, -8);
                break L1;
              }
            }
            if (this.field_h) {
              break L0;
            } else {
              this.field_a.a(true, param2);
              this.field_a.d(1, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("rpa.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param1) {
          wk.field_m = wk.field_m - 1;
          if (-1 == (wk.field_m ^ -1)) {
            bt.field_h = null;
            if (param2) {
              if (param0) {
                fl.field_m = fl.field_m - 1;
                if (-1 != (fl.field_m ^ -1)) {
                  return;
                } else {
                  cla.field_m = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (param2) {
              if (param0) {
                fl.field_m = fl.field_m - 1;
                if (-1 != (fl.field_m ^ -1)) {
                  return;
                } else {
                  cla.field_m = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param2) {
            if (param0) {
              fl.field_m = fl.field_m - 1;
              if (-1 != (fl.field_m ^ -1)) {
                return;
              } else {
                cla.field_m = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        L0: {
          if (this.field_h) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << (7 & param0 >> -728822621)) / 32.0f;
            var6 = 65535 & param1;
            var7 = (float)((param1 & 247312) >> 1913007792) / 8.0f;
            var8 = this.field_e.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_a.field_Oc * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 <= 117) {
          this.field_k = false;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (!param1) {
          field_g = (String) null;
          tga.field_a.a(param2, (byte) -104, param0, jg.a(param3, (byte) -79, param4), param5);
          return;
        } else {
          tga.field_a.a(param2, (byte) -104, param0, jg.a(param3, (byte) -79, param4), param5);
          return;
        }
    }

    final void a(boolean param0) {
        cka stackIn_4_0 = null;
        cka stackIn_5_0 = null;
        cka stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cka stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cka stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cka stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        cka stackIn_14_0 = null;
        cka stackIn_15_0 = null;
        cka stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cka stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cka stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cka stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        cka stackOut_13_0 = null;
        cka stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cka stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cka stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cka stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        cka stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        cka stackOut_3_0 = null;
        cka stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cka stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cka stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cka stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        cka stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        if (param0) {
          L0: {
            field_d = true;
            if (this.field_h) {
              L1: {
                this.field_a.e(1, true);
                stackOut_13_0 = this.field_a;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (param0) {
                  stackOut_15_0 = (cka) ((Object) stackIn_15_0);
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L1;
                } else {
                  stackOut_14_0 = (cka) ((Object) stackIn_14_0);
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L1;
                }
              }
              L2: {
                ((cka) (Object) stackIn_16_0).a(stackIn_16_1 != 0, (kl) null);
                stackOut_16_0 = this.field_a;
                stackOut_16_1 = 0;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0) {
                  stackOut_18_0 = (cka) ((Object) stackIn_18_0);
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L2;
                } else {
                  stackOut_17_0 = (cka) ((Object) stackIn_17_0);
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L2;
                }
              }
              ((cka) (Object) stackIn_19_0).e(stackIn_19_1, stackIn_19_2 != 0);
              this.field_a.a(true, (kl) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_h) {
              L4: {
                this.field_a.e(1, true);
                stackOut_3_0 = this.field_a;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0) {
                  stackOut_5_0 = (cka) ((Object) stackIn_5_0);
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L4;
                } else {
                  stackOut_4_0 = (cka) ((Object) stackIn_4_0);
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L4;
                }
              }
              L5: {
                ((cka) (Object) stackIn_6_0).a(stackIn_6_1 != 0, (kl) null);
                stackOut_6_0 = this.field_a;
                stackOut_6_1 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0) {
                  stackOut_8_0 = (cka) ((Object) stackIn_8_0);
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L5;
                } else {
                  stackOut_7_0 = (cka) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L5;
                }
              }
              ((cka) (Object) stackIn_9_0).e(stackIn_9_1, stackIn_9_2 != 0);
              this.field_a.a(true, (kl) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_h = false;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    static {
        field_j = "Visit the Account Management section on the main site to view.";
        field_g = "Yes";
        field_f = "Friends can be added in the multiplayer<nbsp>lobby";
        field_c = "You must play 1 more rated game before playing with the current options.";
    }
}
