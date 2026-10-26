/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends hh {
    private float[] field_k;
    private int field_j;
    private qe field_h;
    static int lastKeyCode;
    private float field_d;
    static int[] menuTop;
    static String field_g;
    private si field_l;
    private uf field_i;

    public static void b(int param0) {
        if (param0 != 66) {
          lastKeyCode = -79;
          field_g = null;
          menuTop = null;
          return;
        }
        field_g = null;
        menuTop = null;
    }

    final void b(byte param0) {
        if (null == this.field_l) {
          return;
        }
        this.field_l.a(-23085, '\001');
        this.field_a.a(false, 1);
        this.field_a.a((rt) null, 1);
        if (param0 > 5) {
          this.field_a.a(false, 0);
          return;
        }
        field_g = (String) null;
        this.field_a.a(false, 0);
    }

    final void a(int param0, int param1, rt param2) {
        try {
          this.field_a.a(param2, 1);
          this.field_a.a(param0, (byte) -39);
          if (param1 != -1486691000) {
            menuTop = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bk.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (null == this.field_l) {
          return;
        }
        this.field_a.a(false, 1);
        if ((param1 & 128) == 0) {
          if ((param2 & 1) == 1) {
            if (!this.field_h.field_d) {
              var4 = 16 * (this.field_a.field_hb % 4000) / 4000;
              this.field_a.a(this.field_h.field_h[var4], param0 + 66);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
              if (param0 != -65) {
                this.field_j = 19;
              }
              this.field_a.a(false, 0);
              if (0 != (64 & param1)) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              } else {
                st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
              }
              var4Lifetime4 = param1 & 3;
              if (2 == var4Lifetime4) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
              } else {
                if (var4Lifetime4 != 3) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                }
              }
              return;
            }
            this.field_a.a(this.field_h.field_j, 1);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_d, 0.0f, 0.0f, 1.0f);
            if (param0 == -65) {
              this.field_a.a(false, 0);
              if (0 != (64 & param1)) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                var4Lifetime2 = param1 & 3;
                if (2 == var4Lifetime2) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                } else {
                  if (var4Lifetime2 != 3) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                  }
                }
                return;
              }
              st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
              st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
              st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
            } else {
              this.field_j = 19;
              this.field_a.a(false, 0);
              if (0 != (64 & param1)) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              } else {
                st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
                st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
                st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
              }
            }
            var4Lifetime3 = param1 & 3;
            if (2 == var4Lifetime3) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
            } else {
              if (var4Lifetime3 == 3) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
              }
            }
            return;
          }
          if (!this.field_h.field_d) {
            this.field_a.a(this.field_h.field_h[0], 1);
          } else {
            this.field_a.a(this.field_h.field_j, 1);
          }
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
        } else {
          this.field_a.a((rt) null, 1);
        }
        if (param0 != -65) {
          this.field_j = 19;
        }
        this.field_a.a(false, 0);
        if (0 != (64 & param1)) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
        } else {
          st.field_a[1] = this.field_a.field_Fb * this.field_a.field_wb;
          st.field_a[2] = this.field_a.field_w * this.field_a.field_Fb;
          st.field_a[0] = this.field_a.field_ic * this.field_a.field_Fb;
          jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, st.field_a, 0);
        }
        var4Lifetime1 = param1 & 3;
        if (2 == var4Lifetime1) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
        } else {
          if (var4Lifetime1 == 3) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
          } else {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
          }
        }
    }

    bk(wl param0, qe param1) {
        super(param0);
        int var6 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        try {
          this.field_h = param1;
          if (this.field_a.field_x &&
            this.field_a.field_Xb >= 2) {
            this.field_i = MenuScreen.a((byte) 122, 34336, this.field_a, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field_i == null) {
              return;
            }
            var16 = hh.a((byte) -88, 3, 64, false, 256, 0.4000000059604645f, 4, 0, 4);
            var12 = var16;
            var11 = var12;
            var3 = var11;
            var23 = hh.a((byte) -119, 3, 64, false, 256, 0.4000000059604645f, 4, 8, 4);
            this.field_k = new float[32768];
            var5 = 0;
            for (var6 = 0; var6 < 256; var6++) {
              var24 = var16[var6];
              var25 = var23[var6];
              for (var9 = 0; var9 < 64; var9++) {
                incrementValue$0 = var5;
                var5++;
                this.field_k[incrementValue$0] = (float)var24[var9] / 4096.0f;
                incrementValue$1 = var5;
                var5++;
                this.field_k[incrementValue$1] = (float)var25[var9] / 4096.0f;
              }
            }
            this.a(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
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
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (null == this.field_l) {
          return;
        }
        this.field_l.a(-23085, '\0');
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
        menuTop = new int[8];
    }
}
