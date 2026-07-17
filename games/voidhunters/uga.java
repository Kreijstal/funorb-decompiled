/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uga extends qg {
    private float field_k;
    private vab field_j;
    private float[] field_f;
    static llb field_h;
    private int field_c;
    static boolean field_d;
    private jjb field_i;
    static fdb field_g;
    private bt field_e;

    public static void a() {
        field_g = null;
        field_h = null;
    }

    final static void d(int param0) {
        if (param0 == -10128) {
          if (null == efb.field_b) {
            throw new IllegalStateException("NGR");
          } else {
            efb.field_b.field_b = true;
            mb.h(1, 117);
            return;
          }
        } else {
          uga.d(115);
          if (null == efb.field_b) {
            throw new IllegalStateException("NGR");
          } else {
            efb.field_b.field_b = true;
            mb.h(1, 117);
            return;
          }
        }
    }

    uga(qfa param0, jjb param1) {
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
              ((uga) this).field_i = param1;
              if (!((uga) this).field_b.field_Zb) {
                break L1;
              } else {
                if (2 > ((uga) this).field_b.field_Dc) {
                  break L1;
                } else {
                  ((uga) this).field_j = faa.a((byte) 115, ((uga) this).field_b, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
                  if (null == ((uga) this).field_j) {
                    return;
                  } else {
                    var24 = soa.a(4, 0, 4, 3, false, 256, -1, 64, 0.4000000059604645f);
                    var20 = var24;
                    var16 = var20;
                    var12 = var16;
                    var11 = var12;
                    var3_array = var11;
                    var25 = soa.a(4, 8, 4, 3, false, 256, -1, 64, 0.4000000059604645f);
                    ((uga) this).field_f = new float[32768];
                    var5 = 0;
                    var6 = 0;
                    L2: while (true) {
                      if (256 <= var6) {
                        int discarded$3 = 105;
                        this.b();
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
                            ((uga) this).field_f[incrementValue$4] = (float)var26[var9] / 4096.0f;
                            int incrementValue$5 = var5;
                            var5++;
                            ((uga) this).field_f[incrementValue$5] = (float)var27[var9] / 4096.0f;
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
            stackOut_14_1 = new StringBuilder().append("uga.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 != 125) {
            return;
        }
        try {
            ((uga) this).field_b.a(param1 ^ 96, param2);
            ((uga) this).field_b.c(param1 + -125, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "uga.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (null == ((uga) this).field_e) {
          return;
        } else {
          if (param1 <= 18) {
            return;
          } else {
            L0: {
              ((uga) this).field_e.a(true, ' ');
              ((uga) this).field_b.h(33984, 1);
              jaggl.OpenGL.glMatrixMode(5890);
              jaggl.OpenGL.glLoadMatrixf(((uga) this).field_b.field_Bb.a(true), 0);
              jaggl.OpenGL.glMatrixMode(5888);
              ((uga) this).field_b.h(33984, 0);
              if (((uga) this).field_c == ((uga) this).field_b.field_Mc) {
                break L0;
              } else {
                var3 = 128 * (((uga) this).field_b.field_Mc % 5000) / 5000;
                var4 = 0;
                L1: while (true) {
                  if (64 <= var4) {
                    L2: {
                      if (((uga) this).field_i.field_d) {
                        ((uga) this).field_k = (float)(((uga) this).field_b.field_Mc % 4000) / 4000.0f;
                        break L2;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                        break L2;
                      }
                    }
                    ((uga) this).field_c = ((uga) this).field_b.field_Mc;
                    break L0;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, ((uga) this).field_f, var3);
                    var3 += 2;
                    var4++;
                    continue L1;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
            return false;
        }
        return true;
    }

    final void a(int param0) {
        if (null == ((uga) this).field_e) {
          return;
        } else {
          ((uga) this).field_e.a(true, '');
          ((uga) this).field_b.h(33984, 1);
          if (param0 != 5890) {
            ((uga) this).a(true, -64);
            ((uga) this).field_b.a(38, (pib) null);
            ((uga) this).field_b.h(33984, 0);
            return;
          } else {
            ((uga) this).field_b.a(38, (pib) null);
            ((uga) this).field_b.h(33984, 0);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (((uga) this).field_e == null) {
          return;
        } else {
          ((uga) this).field_b.h(33984, 1);
          if (param1 != -25139) {
            L0: {
              ((uga) this).field_e = null;
              if (0 == (128 & param0)) {
                if ((param2 & 1) != 1) {
                  if (((uga) this).field_i.field_d) {
                    ((uga) this).field_b.a(param1 + 25256, (pib) (Object) ((uga) this).field_i.field_b);
                    L1: {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                      ((uga) this).field_b.h(33984, 0);
                      if ((param0 & 64) == 0) {
                        meb.field_c[2] = ((uga) this).field_b.field_pc * ((uga) this).field_b.field_i;
                        meb.field_c[1] = ((uga) this).field_b.field_nc * ((uga) this).field_b.field_pc;
                        meb.field_c[0] = ((uga) this).field_b.field_nb * ((uga) this).field_b.field_pc;
                        jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
                        break L1;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                        break L1;
                      }
                    }
                    L2: {
                      var4 = param0 & 3;
                      if (var4 != 2) {
                        if (3 == var4) {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                          break L2;
                        } else {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                          break L2;
                        }
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                        break L2;
                      }
                    }
                    return;
                  } else {
                    ((uga) this).field_b.a(87, (pib) (Object) ((uga) this).field_i.field_e[0]);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    break L0;
                  }
                } else {
                  if (((uga) this).field_i.field_d) {
                    ((uga) this).field_b.a(26, (pib) (Object) ((uga) this).field_i.field_b);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, ((uga) this).field_k, 0.0f, 0.0f, 1.0f);
                    break L0;
                  } else {
                    var4 = 16 * (((uga) this).field_b.field_Mc % 4000) / 4000;
                    ((uga) this).field_b.a(102, (pib) (Object) ((uga) this).field_i.field_e[var4]);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    break L0;
                  }
                }
              } else {
                ((uga) this).field_b.a(28, (pib) null);
                break L0;
              }
            }
            ((uga) this).field_b.h(33984, 0);
            if ((param0 & 64) == 0) {
              meb.field_c[2] = ((uga) this).field_b.field_pc * ((uga) this).field_b.field_i;
              meb.field_c[1] = ((uga) this).field_b.field_nc * ((uga) this).field_b.field_pc;
              meb.field_c[0] = ((uga) this).field_b.field_nb * ((uga) this).field_b.field_pc;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
              var4 = param0 & 3;
              if (var4 != 2) {
                if (3 != var4) {
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
              var4 = param0 & 3;
              if (var4 != 2) {
                if (3 != var4) {
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
            L3: {
              if (0 == (128 & param0)) {
                if ((param2 & 1) != 1) {
                  if (((uga) this).field_i.field_d) {
                    ((uga) this).field_b.a(param1 + 25256, (pib) (Object) ((uga) this).field_i.field_b);
                    L4: {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                      ((uga) this).field_b.h(33984, 0);
                      if ((param0 & 64) == 0) {
                        meb.field_c[2] = ((uga) this).field_b.field_pc * ((uga) this).field_b.field_i;
                        meb.field_c[1] = ((uga) this).field_b.field_nc * ((uga) this).field_b.field_pc;
                        meb.field_c[0] = ((uga) this).field_b.field_nb * ((uga) this).field_b.field_pc;
                        jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
                        break L4;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                        break L4;
                      }
                    }
                    L5: {
                      var4 = param0 & 3;
                      if (var4 != 2) {
                        if (3 == var4) {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                          break L5;
                        } else {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                          break L5;
                        }
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    ((uga) this).field_b.a(87, (pib) (Object) ((uga) this).field_i.field_e[0]);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    break L3;
                  }
                } else {
                  if (((uga) this).field_i.field_d) {
                    ((uga) this).field_b.a(26, (pib) (Object) ((uga) this).field_i.field_b);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, ((uga) this).field_k, 0.0f, 0.0f, 1.0f);
                    break L3;
                  } else {
                    var4 = 16 * (((uga) this).field_b.field_Mc % 4000) / 4000;
                    ((uga) this).field_b.a(102, (pib) (Object) ((uga) this).field_i.field_e[var4]);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    break L3;
                  }
                }
              } else {
                ((uga) this).field_b.a(28, (pib) null);
                break L3;
              }
            }
            ((uga) this).field_b.h(33984, 0);
            if ((param0 & 64) != 0) {
              L6: {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                var4 = param0 & 3;
                if (var4 != 2) {
                  if (3 == var4) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                    break L6;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                    break L6;
                  }
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                meb.field_c[2] = ((uga) this).field_b.field_pc * ((uga) this).field_b.field_i;
                meb.field_c[1] = ((uga) this).field_b.field_nc * ((uga) this).field_b.field_pc;
                meb.field_c[0] = ((uga) this).field_b.field_nb * ((uga) this).field_b.field_pc;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
                var4 = param0 & 3;
                if (var4 != 2) {
                  if (3 == var4) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                    break L7;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                    break L7;
                  }
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  break L7;
                }
              }
              return;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            field_d = true;
        }
    }

    private final void b() {
        ((uga) this).field_e = new bt(((uga) this).field_b, 2);
        ((uga) this).field_e.a(-85, 0);
        ((uga) this).field_b.h(33984, 1);
        ((uga) this).field_b.b(true, -16777216);
        ((uga) this).field_b.b(260, 7681, false);
        ((uga) this).field_b.b(0, 770, 34166, 34184);
        ((uga) this).field_b.h(33984, 0);
        jaggl.OpenGL.glBindProgramARB(34336, ((uga) this).field_j.field_b);
        int var2 = 0;
        jaggl.OpenGL.glEnable(34336);
        ((uga) this).field_e.b(4864);
        ((uga) this).field_e.a(-116, 1);
        ((uga) this).field_b.h(33984, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        ((uga) this).field_b.c(0, 0);
        ((uga) this).field_b.b(0, 770, 5890, 34184);
        ((uga) this).field_b.h(33984, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        ((uga) this).field_e.b(4864);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
