/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends hh {
    private float[] field_k;
    private int field_j;
    private qe field_h;
    static int field_f;
    private float field_d;
    static int[] field_e;
    static String field_g;
    private si field_l;
    private uf field_i;

    public static void b(int param0) {
        if (param0 != 66) {
            field_f = -79;
            field_g = null;
            field_e = null;
            return;
        }
        field_g = null;
        field_e = null;
    }

    final void b(byte param0) {
        if (null != this.field_l) {
          this.field_l.a(-23085, '');
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          if (param0 <= 5) {
            field_g = (String) null;
            this.field_a.a(false, 0);
            return;
          } else {
            this.field_a.a(false, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, rt param2) {
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
              this.field_a.a(param2, 1);
              this.field_a.a(param0, (byte) -39);
              if (param1 == -1486691000) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bk.J(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (null == this.field_l) {
          return;
        } else {
          L0: {
            this.field_a.a(false, 1);
            if ((param1 & 128) == 0) {
              if (-2 == (param2 & 1 ^ -1)) {
                if (this.field_h.field_d) {
                  this.field_a.a(this.field_h.field_j, 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_d, 0.0f, 0.0f, 1.0f);
                  if (param0 == -65) {
                    this.field_a.a(false, 0);
                    if (0 != (64 & param1)) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
                      st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                      st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                      st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                      jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
                  } else {
                    this.field_j = 19;
                    this.field_a.a(false, 0);
                    if (0 != (64 & param1)) {
                      L1: {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                        var4 = param1 & 3;
                        if (2 == var4) {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                          break L1;
                        } else {
                          if (var4 == 3) {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                            break L1;
                          } else {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                            break L1;
                          }
                        }
                      }
                      return;
                    } else {
                      L2: {
                        st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                        st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                        st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                        jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
                        var4 = param1 & 3;
                        if (2 == var4) {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                          break L2;
                        } else {
                          if (var4 == 3) {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                            break L2;
                          } else {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                            break L2;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var4 = 16 * (this.field_a.field_hb % 4000) / 4000;
                  this.field_a.a(this.field_h.field_h[var4], param0 + 66);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  if (param0 == -65) {
                    this.field_a.a(false, 0);
                    if (0 != (64 & param1)) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
                      st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                      st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                      st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                      jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
                    this.field_j = 19;
                    this.field_a.a(false, 0);
                    if (0 != (64 & param1)) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
                      st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                      st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                      st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                      jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
                      var4 = param1 & 3;
                      if (2 != var4) {
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
              } else {
                if (!this.field_h.field_d) {
                  this.field_a.a(this.field_h.field_h[0], 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  break L0;
                } else {
                  this.field_a.a(this.field_h.field_j, 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  break L0;
                }
              }
            } else {
              this.field_a.a((rt) null, 1);
              break L0;
            }
          }
          if (param0 == -65) {
            this.field_a.a(false, 0);
            if (0 != (64 & param1)) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              var4 = param1 & 3;
              if (2 == var4) {
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
              st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
              st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
              st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
              var4 = param1 & 3;
              if (2 == var4) {
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
            this.field_j = 19;
            this.field_a.a(false, 0);
            if (0 != (64 & param1)) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              var4 = param1 & 3;
              if (2 == var4) {
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
              st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
              st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
              st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
              var4 = param1 & 3;
              if (2 != var4) {
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
        }
    }

    bk(wl param0, qe param1) {
        super(param0);
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
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
        int decompiledRegionSelector0 = 0;
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
              this.field_h = param1;
              if (!this.field_a.field_x) {
                break L1;
              } else {
                if (this.field_a.field_Xb < 2) {
                  break L1;
                } else {
                  this.field_i = nk.a((byte) 122, 34336, this.field_a, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
                  if (this.field_i == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var16 = hh.a((byte) -88, 3, 64, false, 256, 0.4000000059604645f, 4, 0, 4);
                    var12 = var16;
                    var11 = var12;
                    var3_array = var11;
                    var23 = hh.a((byte) -119, 3, 64, false, 256, 0.4000000059604645f, 4, 8, 4);
                    this.field_k = new float[32768];
                    var5 = 0;
                    var6 = 0;
                    L2: while (true) {
                      if (-257 >= (var6 ^ -1)) {
                        this.a(true);
                        break L1;
                      } else {
                        var24 = var16[var6];
                        var25 = var23[var6];
                        var9 = 0;
                        L3: while (true) {
                          if (-65 >= (var9 ^ -1)) {
                            var6++;
                            continue L2;
                          } else {
                            incrementValue$2 = var5;
                            var5++;
                            this.field_k[incrementValue$2] = (float)var24[var9] / 4096.0f;
                            incrementValue$3 = var5;
                            var5++;
                            this.field_k[incrementValue$3] = (float)var25[var9] / 4096.0f;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("bk.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            this.field_j = -72;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (!(null != this.field_l)) {
            return;
        }
        this.field_l.a(-23085, ' ');
        this.field_a.a(param0, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.field_a.field_H.b(126), 0);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_a.a(false, 0);
        if (this.field_a.field_hb == this.field_j) {
        } else {
            var3 = this.field_a.field_hb % 5000 * 128 / 5000;
            for (var4 = 0; 64 > var4; var4++) {
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field_k, var3);
                var3 += 2;
            }
            if (!this.field_h.field_d) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            } else {
                this.field_d = (float)(this.field_a.field_hb % 4000) / 4000.0f;
            }
            this.field_j = this.field_a.field_hb;
        }
    }

    final boolean a(byte param0) {
        int var2 = 86 % ((-11 - param0) / 63);
        return true;
    }

    private final void a(boolean param0) {
        rt var3 = null;
        this.field_l = new si(this.field_a, 2);
        this.field_l.a((byte) 111, 0);
        this.field_a.a(!param0 ? true : false, 1);
        this.field_a.c(2, -16777216);
        this.field_a.a(260, -26625, 7681);
        this.field_a.a(770, 34166, 0, (byte) 115);
        this.field_a.a(false, 0);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_i.field_a);
        jaggl.OpenGL.glEnable(34336);
        this.field_l.b(false);
        this.field_l.a((byte) -121, 1);
        this.field_a.a(false, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_a.a(0, (byte) -39);
        this.field_a.a(770, 5890, 0, (byte) 88);
        this.field_a.a(false, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        if (!param0) {
            var3 = (rt) null;
            this.a(114, 52, (rt) null);
        } else {
            jaggl.OpenGL.glDisable(34336);
            jaggl.OpenGL.glDisable(34820);
            this.field_l.b(false);
            return;
        }
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.field_l.b(false);
    }

    static {
        field_g = "Waiting for fonts";
        field_e = new int[8];
    }
}
