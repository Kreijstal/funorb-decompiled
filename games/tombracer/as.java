/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends qe {
    private boolean field_c;
    private cua field_d;
    private aaa field_f;
    private boolean field_e;

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        g[] var3 = null;
        int var4 = 0;
        g var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = cm.field_a[param0].field_c;
            var4 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var3.length) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_3_0 = var2_int + var5.field_h;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var2_int = stackIn_4_0;
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var2_int;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "as.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void a(boolean param0) {
        cka stackIn_3_0 = null;
        cka stackIn_4_0 = null;
        cka stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cka stackOut_2_0 = null;
        cka stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cka stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (this.field_e) {
            L1: {
              this.field_a.e(1, true);
              this.field_a.a(true, (kl) null);
              this.field_a.e(0, true);
              stackOut_2_0 = this.field_a;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param0) {
                stackOut_4_0 = (cka) ((Object) stackIn_4_0);
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = (cka) ((Object) stackIn_3_0);
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((cka) (Object) stackIn_5_0).a(stackIn_5_1 != 0, (kl) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_e = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          this.field_e = false;
          return;
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            kl var3 = (kl) null;
            this.a(1, 32, (kl) null);
            return this.field_c;
        }
        return this.field_c;
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_e) {
                this.field_a.a(true, param2);
                this.field_a.d(param1 + -32220, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 32221) {
              break L0;
            } else {
              this.a(-9, -76, 44);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("as.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, float[] param1, int param2, int param3, float param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, int param12, float[] param13) {
        RuntimeException var14 = null;
        float var14_float = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19_float = 0.0f;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                param9 = param9 - param5;
                param2 = param2 - param0;
                param7 = param7 - param3;
                var14_float = param13[0] * (float)param7 + (float)param2 * param13[1] + param13[2] * (float)param9;
                var15 = param13[4] * (float)param2 + (float)param7 * param13[3] + (float)param9 * param13[5];
                var16 = param13[8] * (float)param9 + (param13[6] * (float)param7 + (float)param2 * param13[7]);
                if (param8 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (-2 != (param8 ^ -1)) {
                      break L3;
                    } else {
                      var17 = 0.5f + (var14_float + param11);
                      var18 = param4 + var16 + 0.5f;
                      if (var20 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (2 != param8) {
                      break L4;
                    } else {
                      var17 = 0.5f + (-var14_float + param11);
                      var18 = -var15 + param6 + 0.5f;
                      if (var20 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (3 == param8) {
                      break L5;
                    } else {
                      L6: {
                        if (-5 == (param8 ^ -1)) {
                          break L6;
                        } else {
                          var17 = -var16 + param4 + 0.5f;
                          var18 = 0.5f + (-var15 + param6);
                          if (var20 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var18 = param6 + -var15 + 0.5f;
                      var17 = param4 + var16 + 0.5f;
                      if (var20 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var18 = -var15 + param6 + 0.5f;
                  var17 = param11 + var14_float + 0.5f;
                  if (var20 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var17 = 0.5f + (var14_float + param11);
              var18 = 0.5f + (param4 + -var16);
              break L1;
            }
            L7: {
              L8: {
                if (-2 == (param12 ^ -1)) {
                  break L8;
                } else {
                  L9: {
                    if (-3 != (param12 ^ -1)) {
                      break L9;
                    } else {
                      var17 = -var17;
                      var18 = -var18;
                      if (var20 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (3 != param12) {
                    break L7;
                  } else {
                    var19_float = var17;
                    var17 = var18;
                    var18 = -var19_float;
                    if (var20 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var19_float = var17;
              var17 = -var18;
              var18 = var19_float;
              break L7;
            }
            var19 = 98 % ((param10 - -50) / 39);
            param1[0] = var17;
            param1[1] = var18;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var14 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var14);
            stackOut_20_1 = new StringBuilder().append("as.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          L11: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param13 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    as(cka param0, aaa param1) {
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
        this.field_c = false;
        this.field_e = false;
        try {
          L0: {
            L1: {
              this.field_f = param1;
              if (this.field_f.field_c == null) {
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
                      var4 = cpa.a(64, this.field_a, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                      this.field_d = dga.a(21885, this.field_a, new fca[]{var5, var4});
                      stackOut_4_0 = this;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (null == this.field_d) {
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
                    ((as) (this)).field_c = stackIn_7_1 != 0;
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
            stackOut_9_1 = new StringBuilder().append("as.<init>(");
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
            this.field_e = true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        long var11 = 0L;
        if (param2 < 117) {
          L0: {
            this.field_c = true;
            if (this.field_e) {
              var4 = 1 << (param0 & 3);
              var5 = (float)(1 << ((57 & param0) >> 1430405475)) / 32.0f;
              var6 = param1 & 65535;
              var7 = (float)(param1 >> 1198757456 & 3) / 8.0f;
              var8 = (float)(param1 >> -1200987533 & 15) / 16.0f;
              var9 = (float)(param1 >> 2087592343 & 15) / 16.0f;
              var10 = (param1 & 2114051285) >> 1197937563;
              var11 = this.field_d.field_c;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_a.field_Oc % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_e) {
              var4 = 1 << (param0 & 3);
              var5 = (float)(1 << ((57 & param0) >> 1430405475)) / 32.0f;
              var6 = param1 & 65535;
              var7 = (float)(param1 >> 1198757456 & 3) / 8.0f;
              var8 = (float)(param1 >> -1200987533 & 15) / 16.0f;
              var9 = (float)(param1 >> 2087592343 & 15) / 16.0f;
              var10 = (param1 & 2114051285) >> 1197937563;
              var11 = this.field_d.field_c;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_a.field_Oc % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1) {
        hoa var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        long var6 = 0L;
        L0: {
          var3 = this.field_a.n(16664);
          var4 = -104 / ((56 - param1) / 48);
          if (!this.field_c) {
            break L0;
          } else {
            if (var3 == null) {
              break L0;
            } else {
              var5 = (-Math.abs(this.field_a.field_Wb[1]) + 1.0f) * 2.0f + 1.0f;
              this.field_a.e(1, true);
              this.field_a.a(true, var3);
              this.field_a.e(0, true);
              this.field_a.a(true, this.field_f.field_c);
              var6 = this.field_d.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var6);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunDir"), -this.field_a.field_Wb[0], -this.field_a.field_Wb[1], -this.field_a.field_Wb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunColour"), var5 * this.field_a.field_wc, this.field_a.field_Fb * var5, this.field_a.field_bc * var5, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0f + Math.abs(this.field_a.field_Wb[1]) * 928.0f);
              this.field_e = true;
              break L0;
            }
          }
        }
    }

    static {
    }
}
