/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends bq {
    private ch field_f;
    private int field_h;
    private vk field_i;
    private float field_g;
    private tq field_k;
    private float[] field_e;
    static String field_j;

    final boolean b(byte param0) {
        if (param0 > -64) {
            ((es) this).field_f = null;
            return true;
        }
        return true;
    }

    public static void c() {
        field_j = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (((es) this).field_k != null) {
          ((es) this).field_b.g(1, 126);
          if (param0 > 39) {
            if ((param1 & 128) != 0) {
              ((es) this).field_b.a(32, (ht) null);
              ((es) this).field_b.g(0, 122);
              if ((param1 & 64) == 0) {
                ps.field_d[1] = ((es) this).field_b.field_cb * ((es) this).field_b.field_z;
                ps.field_d[2] = ((es) this).field_b.field_cb * ((es) this).field_b.field_ac;
                ps.field_d[0] = ((es) this).field_b.field_Fc * ((es) this).field_b.field_cb;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                var4 = param1 & 3;
                if (var4 == 2) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  return;
                } else {
                  if (var4 == 3) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                    return;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                    return;
                  }
                }
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                var4 = param1 & 3;
                if (var4 == 2) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  return;
                } else {
                  if (var4 == 3) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                    return;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                    return;
                  }
                }
              }
            } else {
              if ((1 & param2) == 1) {
                if (((es) this).field_f.field_g) {
                  ((es) this).field_b.a(36, (ht) (Object) ((es) this).field_f.field_b);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, ((es) this).field_g, 0.0f, 0.0f, 1.0f);
                  ((es) this).field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = ((es) this).field_b.field_cb * ((es) this).field_b.field_z;
                    ps.field_d[2] = ((es) this).field_b.field_cb * ((es) this).field_b.field_ac;
                    ps.field_d[0] = ((es) this).field_b.field_Fc * ((es) this).field_b.field_cb;
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                    var4 = param1 & 3;
                    if (var4 == 2) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    } else {
                      if (var4 == 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    }
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 != 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  }
                } else {
                  var4 = 16 * (((es) this).field_b.field_Ac % 4000) / 4000;
                  ((es) this).field_b.a(13, (ht) (Object) ((es) this).field_f.field_i[var4]);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  ((es) this).field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = ((es) this).field_b.field_cb * ((es) this).field_b.field_z;
                    ps.field_d[2] = ((es) this).field_b.field_cb * ((es) this).field_b.field_ac;
                    ps.field_d[0] = ((es) this).field_b.field_Fc * ((es) this).field_b.field_cb;
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 == 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 == 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  }
                }
              } else {
                if (!((es) this).field_f.field_g) {
                  ((es) this).field_b.a(86, (ht) (Object) ((es) this).field_f.field_i[0]);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  ((es) this).field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = ((es) this).field_b.field_cb * ((es) this).field_b.field_z;
                    ps.field_d[2] = ((es) this).field_b.field_cb * ((es) this).field_b.field_ac;
                    ps.field_d[0] = ((es) this).field_b.field_Fc * ((es) this).field_b.field_cb;
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 != 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 != 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  }
                } else {
                  ((es) this).field_b.a(54, (ht) (Object) ((es) this).field_f.field_b);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  ((es) this).field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = ((es) this).field_b.field_cb * ((es) this).field_b.field_z;
                    ps.field_d[2] = ((es) this).field_b.field_cb * ((es) this).field_b.field_ac;
                    ps.field_d[0] = ((es) this).field_b.field_Fc * ((es) this).field_b.field_cb;
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 != 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                    var4 = param1 & 3;
                    if (var4 != 2) {
                      if (var4 != 3) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                        return;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
            ((es) this).field_g = 2.270503520965576f;
        }
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((es) this).field_b.a(param0 ^ 9, param2);
              ((es) this).field_b.c(param1, true);
              if (param0 == 35) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("es.A(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void b(int param0) {
        if (!(null != ((es) this).field_k)) {
            return;
        }
        ((es) this).field_k.a((byte) 121, '');
        ((es) this).field_b.g(1, 119);
        ((es) this).field_b.a(16, (ht) null);
        ((es) this).field_b.g(0, 118);
        if (param0 > -125) {
            ((es) this).a(53, false);
        }
    }

    es(fr param0, ch param1) {
        super(param0);
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var20 = null;
        int[][] var24 = null;
        int[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              ((es) this).field_f = param1;
              if (!((es) this).field_b.field_Ib) {
                break L1;
              } else {
                if (((es) this).field_b.field_T < 2) {
                  break L1;
                } else {
                  int discarded$3 = -24674;
                  ((es) this).field_i = wr.a(((es) this).field_b, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
                  if (null == ((es) this).field_i) {
                    return;
                  } else {
                    var24 = qe.a(false, 3, 0, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var20 = var24;
                    var16 = var20;
                    var12 = var16;
                    var11 = var12;
                    var3_array = var11;
                    var25 = qe.a(false, 3, 8, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var5 = 0;
                    ((es) this).field_e = new float[32768];
                    var6 = 0;
                    L2: while (true) {
                      if (256 <= var6) {
                        this.a(true);
                        break L1;
                      } else {
                        var26 = var24[var6];
                        var27 = var25[var6];
                        var9 = 0;
                        L3: while (true) {
                          if (64 <= var9) {
                            var6++;
                            continue L2;
                          } else {
                            int incrementValue$4 = var5;
                            var5++;
                            ((es) this).field_e[incrementValue$4] = (float)var26[var9] / 4096.0f;
                            int incrementValue$5 = var5;
                            var5++;
                            ((es) this).field_e[incrementValue$5] = (float)var27[var9] / 4096.0f;
                            var9++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("es.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    private final void a(boolean param0) {
        ((es) this).field_k = new tq(((es) this).field_b, 2);
        ((es) this).field_k.a(0, 4864);
        ((es) this).field_b.g(1, 90);
        ((es) this).field_b.e(0, -16777216);
        ((es) this).field_b.a(20685, 7681, 260);
        ((es) this).field_b.a(121, 0, 34166, 770);
        ((es) this).field_b.g(0, 96);
        jaggl.OpenGL.glBindProgramARB(34336, ((es) this).field_i.field_a);
        jaggl.OpenGL.glEnable(34336);
        ((es) this).field_k.a(true);
        ((es) this).field_k.a(1, 4864);
        ((es) this).field_b.g(1, 100);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        ((es) this).field_b.c(0, param0);
        ((es) this).field_b.a(122, 0, 5890, 770);
        ((es) this).field_b.g(0, 99);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        ((es) this).field_k.a(true);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (((es) this).field_k == null) {
          return;
        } else {
          ((es) this).field_k.a((byte) 121, ' ');
          ((es) this).field_b.g(1, 115);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(((es) this).field_b.field_mc.b((byte) 57), 0);
          if (param0 < 33) {
            return;
          } else {
            L0: {
              jaggl.OpenGL.glMatrixMode(5888);
              ((es) this).field_b.g(0, 115);
              if (((es) this).field_h != ((es) this).field_b.field_Ac) {
                var3 = 128 * (((es) this).field_b.field_Ac % 5000) / 5000;
                var4 = 0;
                L1: while (true) {
                  if (64 <= var4) {
                    L2: {
                      if (!((es) this).field_f.field_g) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                        break L2;
                      } else {
                        ((es) this).field_g = (float)(((es) this).field_b.field_Ac % 4000) / 4000.0f;
                        break L2;
                      }
                    }
                    ((es) this).field_h = ((es) this).field_b.field_Ac;
                    break L0;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, ((es) this).field_e, var3);
                    var3 += 2;
                    var4++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Loading graphics";
    }
}
