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

    public static void a(byte param0) {
        if (param0 != -9) {
          return;
        }
        field_g = null;
        field_h = null;
    }

    final static void d(int param0) {
        if (param0 != -10128) {
          uga.d(115);
          if (null != efb.field_b) {
            efb.field_b.field_b = true;
            mb.h(1, 117);
            return;
          }
          throw new IllegalStateException("NGR");
        }
        if (null != efb.field_b) {
          efb.field_b.field_b = true;
          mb.h(1, 117);
          return;
        }
        throw new IllegalStateException("NGR");
    }

    uga(qfa param0, jjb param1) {
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
          this.field_i = param1;
          if (this.field_b.field_Zb &&
            2 <= this.field_b.field_Dc) {
            this.field_j = faa.a((byte) 115, this.field_b, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (null == this.field_j) {
              return;
            }
            var16 = soa.a(4, 0, 4, 3, false, 256, -1, 64, 0.4000000059604645f);
            var12 = var16;
            var11 = var12;
            var3 = var11;
            var23 = soa.a(4, 8, 4, 3, false, 256, -1, 64, 0.4000000059604645f);
            this.field_f = new float[32768];
            var5 = 0;
            for (var6 = 0; 256 > var6; var6++) {
              var24 = var16[var6];
              var25 = var23[var6];
              for (var9 = 0; 64 > var9; var9++) {
                incrementValue$0 = var5;
                var5++;
                this.field_f[incrementValue$0] = (float)var24[var9] / 4096.0f;
                incrementValue$1 = var5;
                var5++;
                this.field_f[incrementValue$1] = (float)var25[var9] / 4096.0f;
              }
            }
            this.b((byte) 105);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uga.<init>(");
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
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 != 125) {
          return;
        }
        try {
          this.field_b.a(param1 ^ 96, param2);
          this.field_b.c(param1 - 125, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uga.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (null == this.field_e) {
          return;
        }
        if (param1 > 18) {
          this.field_e.a(true, '\0');
          this.field_b.h(33984, 1);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.field_b.field_Bb.a(true), 0);
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_b.h(33984, 0);
          if (this.field_c != this.field_b.field_Mc) {
            var3 = 128 * (this.field_b.field_Mc % 5000) / 5000;
            for (var4 = 0; 64 > var4; var4++) {
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field_f, var3);
              var3 += 2;
            }
            if (!this.field_i.field_d) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            } else {
              this.field_k = (float)(this.field_b.field_Mc % 4000) / 4000.0f;
            }
            this.field_c = this.field_b.field_Mc;
          }
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
          return false;
        }
        return true;
    }

    final void a(int param0) {
        if (null == this.field_e) {
          return;
        }
        this.field_e.a(true, '\001');
        this.field_b.h(33984, 1);
        if (param0 == 5890) {
          this.field_b.a(38, (pib) null);
          this.field_b.h(33984, 0);
          return;
        }
        this.a(true, -64);
        this.field_b.a(38, (pib) null);
        this.field_b.h(33984, 0);
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var5 = VoidHunters.field_G;
        if (this.field_e == null) {
          return;
        }
        this.field_b.h(33984, 1);
        if (param1 == -25139) {
          boolean decompiledFrameRemainder0 = true;
          if (0 == (128 & param0)) {
            if ((param2 & 1) != 1) {
              if (this.field_i.field_d) {
                this.field_b.a(param1 + 25256, this.field_i.field_b);
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                this.field_b.h(33984, 0);
                if ((param0 & 64) == 0) {
                  meb.field_c[2] = this.field_b.field_pc * this.field_b.field_i;
                  meb.field_c[1] = this.field_b.field_nc * this.field_b.field_pc;
                  meb.field_c[0] = this.field_b.field_nb * this.field_b.field_pc;
                  jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_b.a(87, this.field_i.field_e[0]);
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
              }
            } else {
              if (this.field_i.field_d) {
                this.field_b.a(26, this.field_i.field_b);
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_k, 0.0f, 0.0f, 1.0f);
              } else {
                var4 = 16 * (this.field_b.field_Mc % 4000) / 4000;
                this.field_b.a(102, this.field_i.field_e[var4]);
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
              }
            }
          } else {
            this.field_b.a(28, (pib) null);
          }
          if (decompiledFrameRemainder0) {
            this.field_b.h(33984, 0);
            if ((param0 & 64) != 0) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
            } else {
              meb.field_c[2] = this.field_b.field_pc * this.field_b.field_i;
              meb.field_c[1] = this.field_b.field_nc * this.field_b.field_pc;
              meb.field_c[0] = this.field_b.field_nb * this.field_b.field_pc;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
            }
          }
          var4Lifetime3 = param0 & 3;
          if (var4Lifetime3 != 2) {
            if (3 == var4Lifetime3) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
            } else {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
            }
          } else {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
          }
          return;
        }
        this.field_e = (bt) null;
        if (0 == (128 & param0)) {
          if ((param2 & 1) != 1) {
            if (this.field_i.field_d) {
              this.field_b.a(param1 + 25256, this.field_i.field_b);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
              this.field_b.h(33984, 0);
              if ((param0 & 64) == 0) {
                meb.field_c[2] = this.field_b.field_pc * this.field_b.field_i;
                meb.field_c[1] = this.field_b.field_nc * this.field_b.field_pc;
                meb.field_c[0] = this.field_b.field_nb * this.field_b.field_pc;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              }
              var4Lifetime1 = param0 & 3;
              if (var4Lifetime1 != 2) {
                if (3 == var4Lifetime1) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                }
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
              }
              return;
            }
            this.field_b.a(87, this.field_i.field_e[0]);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
          } else {
            if (this.field_i.field_d) {
              this.field_b.a(26, this.field_i.field_b);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_k, 0.0f, 0.0f, 1.0f);
            } else {
              var4Lifetime1 = 16 * (this.field_b.field_Mc % 4000) / 4000;
              this.field_b.a(102, this.field_i.field_e[var4Lifetime1]);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            }
          }
        } else {
          this.field_b.a(28, (pib) null);
        }
        this.field_b.h(33984, 0);
        if ((param0 & 64) != 0) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
        } else {
          meb.field_c[2] = this.field_b.field_pc * this.field_b.field_i;
          meb.field_c[1] = this.field_b.field_nc * this.field_b.field_pc;
          meb.field_c[0] = this.field_b.field_nb * this.field_b.field_pc;
          jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, meb.field_c, 0);
        }
        var4Lifetime2 = param0 & 3;
        if (var4Lifetime2 == 2) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
        } else {
          if (3 != var4Lifetime2) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
          } else {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          field_d = true;
        }
    }

    private final void b(byte param0) {
        this.field_e = new bt(this.field_b, 2);
        this.field_e.a(-85, 0);
        this.field_b.h(33984, 1);
        this.field_b.b(true, -16777216);
        this.field_b.b(260, 7681, false);
        this.field_b.b(0, 770, 34166, 34184);
        this.field_b.h(33984, 0);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_j.field_b);
        int var2 = 78 % ((17 - param0) / 32);
        jaggl.OpenGL.glEnable(34336);
        this.field_e.b(4864);
        this.field_e.a(-116, 1);
        this.field_b.h(33984, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_b.c(0, 0);
        this.field_b.b(0, 770, 5890, 34184);
        this.field_b.h(33984, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.field_e.b(4864);
    }

    static {
        field_d = false;
    }
}
