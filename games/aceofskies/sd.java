/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends hh {
    static String[] field_j;
    private qe field_i;
    static boolean[][] field_d;
    private boolean field_f;
    private in field_l;
    static pa[] field_k;
    static int field_h;
    static String field_e;
    static String field_m;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            this.b((byte) 78);
        }
    }

    final void b(byte param0) {
        if (!this.field_g) {
          if (param0 < 5) {
            field_e = (String) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(false, 0);
          this.field_a.a((rt) null, 1);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_g = false;
          if (param0 >= 5) {
            return;
          } else {
            field_e = (String) null;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = (boolean[][]) null;
        if (param0 != 0) {
          sd.a(false, -71, true, true, -75);
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -31 % ((param0 - -11) / 63);
        return false;
    }

    final static gk a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        if (param3) {
          field_m = (String) null;
          return lc.a(param2, param0, false, (byte) -65, param1, param4);
        } else {
          return lc.a(param2, param0, false, (byte) -65, param1, param4);
        }
    }

    final void a(int param0, int param1, rt param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1486691000) {
                break L1;
              } else {
                field_j = (String[]) null;
                break L1;
              }
            }
            if (!this.field_g) {
              this.field_a.a(param2, 1);
              this.field_a.a(param0, (byte) -39);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("sd.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    sd(wl param0, qe param1) {
        super(param0);
        RuntimeException runtimeException = null;
        aq var3 = null;
        aq var4 = null;
        aq var5 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = false;
        this.field_g = false;
        try {
          L0: {
            L1: {
              this.field_i = param1;
              if (this.field_i.field_b == null) {
                break L1;
              } else {
                if (!this.field_a.field_v) {
                  break L1;
                } else {
                  if (!this.field_a.field_lc) {
                    break L1;
                  } else {
                    L2: {
                      var5 = kg.a("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, true, this.field_a);
                      var3 = var5;
                      var4 = kg.a("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, true, this.field_a);
                      this.field_l = br.a(this.field_a, new aq[]{var5, var4}, (byte) -121);
                      stackIn_6_0 = this;

                      if (null == this.field_l) {
                        stackIn_7_0 = this;
                        stackIn_7_1 = 0;
                        break L2;
                      } else {
                        stackIn_7_0 = this;
                        stackIn_7_1 = 1;
                        break L2;
                      }
                    }
                    ((sd) (this)).field_f = stackIn_7_1 != 0;
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
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("sd.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        q var3;
        long var4;
        wl stackIn_2_0 = null;
        wl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this.field_a;

          if (param0) {
            stackIn_3_0 = (wl) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (wl) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          var3 = ((wl) (Object) stackIn_3_0).c(stackIn_3_1 != 0);
          if (!this.field_f) {
            break L1;
          } else {
            if (var3 == null) {
              break L1;
            } else {
              this.field_a.a(false, 1);
              this.field_a.a(var3, 1);
              this.field_a.a(false, 0);
              this.field_a.a(this.field_i.field_b, 1);
              var4 = this.field_l.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_a.field_n[0], -this.field_a.field_n[1], -this.field_a.field_n[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_a.field_ic, this.field_a.field_wb, this.field_a.field_w, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(this.field_a.field_n[1]) * 928.0f + 96.0f);
              this.field_g = true;
              break L1;
            }
          }
        }
        if (param0) {
          this.a(-114, true);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        if (param0 != -65) {
          return;
        } else {
          L0: {
            if (!this.field_g) {
              break L0;
            } else {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((62 & param1) >> 1290135011)) / 32.0f;
              var6 = 65535 & param2;
              var7 = (float)((param2 & 260994) >> -601664112) / 8.0f;
              var8 = this.field_l.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_a.field_hb % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
              break L0;
            }
          }
          return;
        }
    }

    static {
        field_d = new boolean[][]{new boolean[]{true, true, false, false, false, true, true, false, false, true, false, false, false, false, false, false}, new boolean[]{true, true, true, true, true, true, true, false, false, true, false, false, false, false, false, false}, new boolean[]{true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false}, new boolean[]{false, true, false, false, false, false, true, true, true, false, false, true, false, false, true, false}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false}};
        field_e = "Orb Coins";
        field_m = "SETTINGS";
    }
}
