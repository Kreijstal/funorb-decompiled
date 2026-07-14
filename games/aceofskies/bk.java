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
        if (null != ((bk) this).field_l) {
          ((bk) this).field_l.a(-23085, '');
          ((bk) this).field_a.a(false, 1);
          ((bk) this).field_a.a((rt) null, 1);
          if (param0 <= 5) {
            field_g = (String) null;
            ((bk) this).field_a.a(false, 0);
            return;
          } else {
            ((bk) this).field_a.a(false, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, rt param2) {
        ((bk) this).field_a.a(param2, 1);
        ((bk) this).field_a.a(param0, (byte) -39);
        if (param1 != -1486691000) {
            field_e = (int[]) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (null == ((bk) this).field_l) {
          return;
        } else {
          L0: {
            ((bk) this).field_a.a(false, 1);
            if ((param1 & 128) == -1) {
              if (-2 == (param2 & 1)) {
                if (((bk) this).field_h.field_d) {
                  ((bk) this).field_a.a((rt) (Object) ((bk) this).field_h.field_j, 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, ((bk) this).field_d, 0.0f, 0.0f, 1.0f);
                  if (param0 == -65) {
                    ((bk) this).field_a.a(false, 0);
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
                      st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
                      st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
                      st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
                    ((bk) this).field_j = 19;
                    ((bk) this).field_a.a(false, 0);
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
                        st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
                        st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
                        st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
                  var4 = 16 * (((bk) this).field_a.field_hb % 4000) / 4000;
                  ((bk) this).field_a.a((rt) (Object) ((bk) this).field_h.field_h[var4], param0 + 66);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  if (param0 == -65) {
                    ((bk) this).field_a.a(false, 0);
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
                      st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
                      st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
                      st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
                    ((bk) this).field_j = 19;
                    ((bk) this).field_a.a(false, 0);
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
                      st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
                      st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
                      st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
                if (!((bk) this).field_h.field_d) {
                  ((bk) this).field_a.a((rt) (Object) ((bk) this).field_h.field_h[0], 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  break L0;
                } else {
                  ((bk) this).field_a.a((rt) (Object) ((bk) this).field_h.field_j, 1);
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                  break L0;
                }
              }
            } else {
              ((bk) this).field_a.a((rt) null, 1);
              break L0;
            }
          }
          if (param0 == -65) {
            ((bk) this).field_a.a(false, 0);
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
              st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
              st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
              st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
            ((bk) this).field_j = 19;
            ((bk) this).field_a.a(false, 0);
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
              st.field_a[1] = ((bk) this).field_a.field_Fb * ((bk) this).field_a.field_wb;
              st.field_a[2] = ((bk) this).field_a.field_w * ((bk) this).field_a.field_Fb;
              st.field_a[0] = ((bk) this).field_a.field_ic * ((bk) this).field_a.field_Fb;
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
        int var6 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int var9 = 0;
        ((bk) this).field_h = param1;
        if (!((bk) this).field_a.field_x) {
        }
        if (((bk) this).field_a.field_Xb < 2) {
        }
        ((bk) this).field_i = nk.a((byte) 122, 34336, ((bk) this).field_a, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
        if (((bk) this).field_i == null) {
        }
        int[][] var24 = hh.a((byte) -88, 3, 64, false, 256, 0.4000000059604645f, 4, 0, 4);
        int[][] var20 = var24;
        int[][] var16 = var20;
        int[][] var12 = var16;
        int[][] var11 = var12;
        int[][] var3 = var11;
        int[][] var25 = hh.a((byte) -119, 3, 64, false, 256, 0.4000000059604645f, 4, 8, 4);
        ((bk) this).field_k = new float[32768];
        int var5 = 0;
        for (var6 = 0; -257 < var6; var6++) {
            var26 = var24[var6];
            var27 = var25[var6];
            for (var9 = 0; -65 > var9; var9++) {
                var5++;
                ((bk) this).field_k[var5] = (float)var26[var9] / 4096.0f;
                var5++;
                ((bk) this).field_k[var5] = (float)var27[var9] / 4096.0f;
            }
        }
        this.a(true);
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            ((bk) this).field_j = -72;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (!(null != ((bk) this).field_l)) {
            return;
        }
        ((bk) this).field_l.a(-23085, ' ');
        ((bk) this).field_a.a(param0, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(((bk) this).field_a.field_H.b(126), 0);
        jaggl.OpenGL.glMatrixMode(5888);
        ((bk) this).field_a.a(false, 0);
        if (((bk) this).field_a.field_hb == ((bk) this).field_j) {
        } else {
            var3 = ((bk) this).field_a.field_hb % 5000 * 128 / 5000;
            for (var4 = 0; 64 > var4; var4++) {
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, ((bk) this).field_k, var3);
                var3 += 2;
            }
            if (!((bk) this).field_h.field_d) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            } else {
                ((bk) this).field_d = (float)(((bk) this).field_a.field_hb % 4000) / 4000.0f;
            }
            ((bk) this).field_j = ((bk) this).field_a.field_hb;
        }
    }

    final boolean a(byte param0) {
        int var2 = 86 % ((-11 - param0) / 63);
        return true;
    }

    private final void a(boolean param0) {
        rt var3 = null;
        ((bk) this).field_l = new si(((bk) this).field_a, 2);
        ((bk) this).field_l.a((byte) 111, 0);
        ((bk) this).field_a.a(!param0 ? true : false, 1);
        ((bk) this).field_a.c(2, -16777216);
        ((bk) this).field_a.a(260, -26625, 7681);
        ((bk) this).field_a.a(770, 34166, 0, (byte) 115);
        ((bk) this).field_a.a(false, 0);
        jaggl.OpenGL.glBindProgramARB(34336, ((bk) this).field_i.field_a);
        jaggl.OpenGL.glEnable(34336);
        ((bk) this).field_l.b(false);
        ((bk) this).field_l.a((byte) -121, 1);
        ((bk) this).field_a.a(false, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        ((bk) this).field_a.a(0, (byte) -39);
        ((bk) this).field_a.a(770, 5890, 0, (byte) 88);
        ((bk) this).field_a.a(false, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        if (!param0) {
            var3 = (rt) null;
            ((bk) this).a(114, 52, (rt) null);
        } else {
            jaggl.OpenGL.glDisable(34336);
            jaggl.OpenGL.glDisable(34820);
            ((bk) this).field_l.b(false);
            return;
        }
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        ((bk) this).field_l.b(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Waiting for fonts";
        field_e = new int[8];
    }
}
