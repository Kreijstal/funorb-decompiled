/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends qg {
    private jjb field_d;
    static String field_k;
    private boolean field_e;
    static String field_g;
    private boolean field_j;
    private of field_f;
    static Object field_c;
    static String field_i;
    static String field_h;

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            field_i = (String) null;
        }
    }

    final boolean b(int param0) {
        if (param0 >= -87) {
            ti.a(true);
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, pib param2) {
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
              if (param1 == 125) {
                break L1;
              } else {
                field_c = (Object) null;
                break L1;
              }
            }
            if (!this.field_j) {
              this.field_b.a(72, param2);
              this.field_b.c(0, param0);
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

            stackIn_8_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0) {
        pib var3;
        if (param0 != 5890) {
          L0: {
            var3 = (pib) null;
            this.a(115, (byte) 3, (pib) null);
            if (this.field_j) {
              this.field_b.h(33984, 1);
              this.field_b.a(25, (pib) null);
              this.field_b.h(param0 ^ 37826, 0);
              this.field_b.a(59, (pib) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_j = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_j) {
              this.field_b.h(33984, 1);
              this.field_b.a(25, (pib) null);
              this.field_b.h(param0 ^ 37826, 0);
              this.field_b.a(59, (pib) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_j = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    ti(qfa param0, jjb param1) {
        super(param0);
        RuntimeException runtimeException = null;
        ts var3 = null;
        ts var4 = null;
        ts var5 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_j = false;
        this.field_e = false;
        try {
          L0: {
            L1: {
              this.field_d = param1;
              if (null == this.field_d.field_a) {
                break L1;
              } else {
                if (!this.field_b.field_bc) {
                  break L1;
                } else {
                  if (this.field_b.field_B) {
                    L2: {
                      var5 = ccb.a(35633, this.field_b, 18753, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                      var3 = var5;
                      var4 = ccb.a(35632, this.field_b, 18753, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                      this.field_f = wra.a(new ts[]{var5, var4}, (byte) 107, this.field_b);
                      stackIn_7_0 = this;

                      if (null == this.field_f) {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 0;
                        break L2;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 1;
                        break L2;
                      }
                    }
                    ((ti) (this)).field_e = stackIn_8_1 != 0;
                    break L1;
                  } else {
                    return;
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
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("ti.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        L0: {
          if (this.field_j) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << ((param0 & 60) >> -2032098333)) / 32.0f;
            var6 = param2 & 65535;
            var7 = (float)(3 & param2 >> 1819714032) / 8.0f;
            var8 = this.field_f.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_b.field_Mc * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -25139) {
          this.field_j = false;
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_k = null;
        field_i = null;
        field_h = null;
        if (!param0) {
          ti.a(true);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        rtb var3;
        long var4;
        if (param1 >= 18) {
          var3 = this.field_b.a(false);
          if (this.field_e) {
            if (var3 == null) {
              return;
            } else {
              this.field_b.h(33984, 1);
              this.field_b.a(106, var3);
              this.field_b.h(33984, 0);
              this.field_b.a(106, this.field_d.field_a);
              var4 = this.field_f.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_Eb[0], -this.field_b.field_Eb[1], -this.field_b.field_Eb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_nb, this.field_b.field_nc, this.field_b.field_i, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(this.field_b.field_Eb[1]) * 928.0f + 96.0f);
              this.field_j = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_k = "Shift event up";
        field_g = "Join <%0>'s game";
        field_i = "for members";
    }
}
