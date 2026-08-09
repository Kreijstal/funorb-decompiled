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
            this.field_f = (ch) null;
            return true;
        }
        return true;
    }

    public static void c(int param0) {
        if (param0 != 4) {
            return;
        }
        field_j = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var5;
        int var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_k != null) {
          this.field_b.g(1, 126);
          if (param0 > 39) {
            if ((param1 & 128) != 0) {
              this.field_b.a(32, (ht) null);
              this.field_b.g(0, 122);
              if ((param1 & 64) == 0) {
                ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
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
              if ((1 & param2 ^ -1) == -2) {
                if (this.field_f.field_g) {
                  this.field_b.a(36, this.field_f.field_b);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_g, 0.0f, 0.0f, 1.0f);
                  this.field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                    ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                    ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
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
                  var4 = 16 * (this.field_b.field_Ac % 4000) / 4000;
                  this.field_b.a(13, this.field_f.field_i[var4]);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  this.field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                    ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                    ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
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
                if (!this.field_f.field_g) {
                  this.field_b.a(86, this.field_f.field_i[0]);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  this.field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                    ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                    ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
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
                  this.field_b.a(54, this.field_f.field_b);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  this.field_b.g(0, 122);
                  if ((param1 & 64) == 0) {
                    ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                    ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                    ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
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
            this.field_g = 2.270503520965576f;
        }
    }

    final void a(byte param0, int param1, ht param2) {
        try {
            this.field_b.a(param0 ^ 9, param2);
            this.field_b.c(param1, true);
            if (param0 != 35) {
                this.a(false);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "es.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (!(null != this.field_k)) {
            return;
        }
        this.field_k.a((byte) 121, '');
        this.field_b.g(1, 119);
        this.field_b.a(16, (ht) null);
        this.field_b.g(0, 118);
        if (param0 > -125) {
            this.a(53, false);
        }
    }

    es(fr param0, ch param1) {
        super(param0);
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        try {
          L0: {
            L1: {
              this.field_f = param1;
              if (!this.field_b.field_Ib) {
                break L1;
              } else {
                if ((this.field_b.field_T ^ -1) > -3) {
                  break L1;
                } else {
                  this.field_i = wr.a(this.field_b, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -24674);
                  if (null == this.field_i) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var16 = qe.a(false, 3, 0, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var12 = var16;
                    var11 = var12;
                    var3 = var11;
                    var23 = qe.a(false, 3, 8, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var5 = 0;
                    this.field_e = new float[32768];
                    var6 = 0;
                    L2: while (true) {
                      if (256 <= var6) {
                        this.a(true);
                        break L1;
                      } else {
                        var24 = var16[var6];
                        var25 = var23[var6];
                        var9 = 0;
                        L3: while (true) {
                          if (64 <= var9) {
                            var6++;
                            continue L2;
                          } else {
                            incrementValue$0 = var5;
                            var5++;
                            this.field_e[incrementValue$0] = (float)var24[var9] / 4096.0f;
                            incrementValue$1 = var5;
                            var5++;
                            this.field_e[incrementValue$1] = (float)var25[var9] / 4096.0f;
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
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("es.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        this.field_k = new tq(this.field_b, 2);
        this.field_k.a(0, 4864);
        this.field_b.g(1, 90);
        this.field_b.e(0, -16777216);
        this.field_b.a(20685, 7681, 260);
        this.field_b.a(121, 0, 34166, 770);
        this.field_b.g(0, 96);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_i.field_a);
        jaggl.OpenGL.glEnable(34336);
        this.field_k.a(true);
        this.field_k.a(1, 4864);
        this.field_b.g(1, 100);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_b.c(0, param0);
        this.field_b.a(122, 0, 5890, 770);
        this.field_b.g(0, 99);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.field_k.a(true);
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_k == null) {
          return;
        } else {
          this.field_k.a((byte) 121, ' ');
          this.field_b.g(1, 115);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.field_b.field_mc.b((byte) 57), 0);
          if (param0 < 33) {
            return;
          } else {
            L0: {
              jaggl.OpenGL.glMatrixMode(5888);
              this.field_b.g(0, 115);
              if (this.field_h != this.field_b.field_Ac) {
                var3 = 128 * (this.field_b.field_Ac % 5000) / 5000;
                var4 = 0;
                L1: while (true) {
                  if (64 <= var4) {
                    L2: {
                      if (!this.field_f.field_g) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                        break L2;
                      } else {
                        this.field_g = (float)(this.field_b.field_Ac % 4000) / 4000.0f;
                        break L2;
                      }
                    }
                    this.field_h = this.field_b.field_Ac;
                    break L0;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field_e, var3);
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
        field_j = "Loading graphics";
    }
}
