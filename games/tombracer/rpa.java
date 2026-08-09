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
        if (this.field_k && var3 != null) {
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
        fca var5 = null;
        fca var4 = null;
        this.field_h = false;
        this.field_k = false;
        try {
            this.field_i = param1;
            if (this.field_i.field_c != null && this.field_a.field_wb && this.field_a.field_Vc) {
                var5 = cpa.a(64, this.field_a, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                fca var3 = var5;
                var4 = cpa.a(64, this.field_a, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                this.field_e = dga.a(21885, this.field_a, new fca[]{var5, var4});
                this.field_k = this.field_e != null ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
            this.b(true, -40);
        }
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("rpa.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
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
        cka stackIn_5_0 = null;
        cka stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cka stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cka stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        cka stackIn_15_0 = null;
        cka stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cka stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cka stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        if (param0) {
          L0: {
            field_d = true;
            if (this.field_h) {
              L1: {
                this.field_a.e(1, true);
                stackIn_15_0 = this.field_a;

                if (param0) {
                  stackIn_16_0 = (cka) ((Object) stackIn_15_0);
                  stackIn_16_1 = 0;
                  break L1;
                } else {
                  stackIn_16_0 = (cka) ((Object) stackIn_15_0);
                  stackIn_16_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((cka) (Object) stackIn_16_0).a(stackIn_16_1 != 0, (kl) null);
                stackIn_18_0 = this.field_a;

                stackIn_18_1 = 0;

                if (param0) {
                  stackIn_19_0 = (cka) ((Object) stackIn_18_0);
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 0;
                  break L2;
                } else {
                  stackIn_19_0 = (cka) ((Object) stackIn_18_0);
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 1;
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
                stackIn_5_0 = this.field_a;

                if (param0) {
                  stackIn_6_0 = (cka) ((Object) stackIn_5_0);
                  stackIn_6_1 = 0;
                  break L4;
                } else {
                  stackIn_6_0 = (cka) ((Object) stackIn_5_0);
                  stackIn_6_1 = 1;
                  break L4;
                }
              }
              L5: {
                ((cka) (Object) stackIn_6_0).a(stackIn_6_1 != 0, (kl) null);
                stackIn_8_0 = this.field_a;

                stackIn_8_1 = 0;

                if (param0) {
                  stackIn_9_0 = (cka) ((Object) stackIn_8_0);
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 0;
                  break L5;
                } else {
                  stackIn_9_0 = (cka) ((Object) stackIn_8_0);
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 1;
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
