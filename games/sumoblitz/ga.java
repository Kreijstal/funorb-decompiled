/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends bq {
    private boolean field_k;
    static ow field_g;
    private boolean field_p;
    private vk field_o;
    private vk field_f;
    private boolean field_n;
    private vk field_m;
    static qr field_j;
    private boolean field_l;
    private us field_i;
    private vk field_e;
    static int field_h;

    final static ak a(int param0, byte param1) {
        int var2;
        if ((param0 ^ -1) == -8) {
          return (ak) ((Object) new tr());
        } else {
          if (-10 != (param0 ^ -1)) {
            if (-11 == (param0 ^ -1)) {
              return (ak) ((Object) new jp());
            } else {
              var2 = -9 % ((-5 - param1) / 35);
              if (11 != param0) {
                if (-13 == (param0 ^ -1)) {
                  return (ak) ((Object) new di());
                } else {
                  return new ak(param0);
                }
              } else {
                return (ak) ((Object) new lp());
              }
            }
          } else {
            return (ak) ((Object) new bb());
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_g = null;
        if (!param0) {
            field_h = -28;
        }
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException var4 = null;
        ht var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 35) {
                break L1;
              } else {
                var5 = (ht) null;
                this.a((byte) -126, 112, (ht) null);
                break L1;
              }
            }
            if (param2 == null) {
              if (this.field_l) {
                break L0;
              } else {
                this.field_b.a(param0 + 43, this.field_b.field_n);
                this.field_b.c(1, true);
                this.field_b.b(34168, 768, 0, -116);
                this.field_b.a(param0 + 75, 0, 34168, 770);
                this.field_l = true;
                return;
              }
            } else {
              if (!this.field_l) {
                this.field_b.a(76, param2);
                this.field_b.c(param1, true);
                return;
              } else {
                this.field_b.b(5890, 768, 0, 29);
                this.field_b.a(120, 0, 5890, 770);
                this.field_l = false;
                this.field_b.a(76, param2);
                this.field_b.c(param1, true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    ga(fr param0) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_l = false;
        try {
          if (this.field_b.field_Ib) {
            L0: {
              this.field_o = wr.a(this.field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
              this.field_e = wr.a(this.field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
              this.field_m = wr.a(this.field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
              this.field_f = wr.a(this.field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
              if (null == this.field_f) {
                stackIn_6_0 = 0;
                break L0;
              } else {
                stackIn_6_0 = 1;
                break L0;
              }
            }
            L1: {


              if (this.field_o == null) {

                stackIn_9_1 = 0;
                break L1;
              } else {

                stackIn_9_1 = 1;
                break L1;
              }
            }
            L2: {




              if (null == this.field_e) {


                stackIn_12_2 = 0;
                break L2;
              } else {


                stackIn_12_2 = 1;
                break L2;
              }
            }
            L3: {


              stackIn_14_1 = stackIn_9_1 & stackIn_12_2;

              if (null == this.field_m) {

                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = 0;
                break L3;
              } else {

                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = 1;
                break L3;
              }
            }
            if ((stackIn_6_0 & (stackIn_15_1 & stackIn_15_2)) == 0) {
              this.field_n = false;
              return;
            } else {
              this.field_i = new us(param0, 3553, 6406, 2, 1, false, new byte[]{(byte) 0, (byte)-1}, 6406, false);
              this.field_i.a(false, false, -27365);
              this.field_n = true;
              return;
            }
          } else {
            this.field_n = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ga.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_p = param1 ? true : false;
        this.field_b.g(1, 123);
        this.field_b.a(67, this.field_i);
        this.field_b.a(20685, 7681, 34165);
        this.field_b.b(34166, 768, 0, -116);
        this.field_b.b(5890, 770, 2, -118);
        this.field_b.a(124, 0, 34168, 770);
        this.field_b.g(0, 120);
        if (param0 < 33) {
            this.d((byte) 68);
        } else {
            this.c((byte) -107);
            return;
        }
        this.c((byte) -107);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 39) {
            this.b(88);
        }
    }

    private final void c(byte param0) {
        dl var2 = this.field_b.field_M;
        if (!this.field_p) {
            jaggl.OpenGL.glBindProgramARB(34336, (this.field_b.field_yb ^ -1) == -2147483648 ? this.field_o.field_a : this.field_m.field_a);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != this.field_b.field_yb ? this.field_f.field_a : this.field_e.field_a);
        }
        var2.a(ag.field_c, 26839, -1.0f, 0.0f, (float)this.field_b.field_yb, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ag.field_c[0], ag.field_c[1], ag.field_c[2], ag.field_c[3]);
        jaggl.OpenGL.glEnable(34336);
        this.field_k = true;
        int var3 = 106 % ((-55 - param0) / 52);
        this.d((byte) 87);
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -30) {
            this.a((byte) 75, true);
        }
    }

    private final void d(byte param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        L0: {
          if (this.field_k) {
            var2 = this.field_b.XA();
            var3 = this.field_b.i();
            var4 = -((float)(var2 + -var3) * 0.125f) + (float)var2;
            var5 = -((float)(var2 + -var3) * 0.25f) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.field_u, (float)this.field_b.field_Mb / 255.0f);
            this.field_b.g(1, param0 + 37);
            this.field_b.e(0, this.field_b.field_k);
            this.field_b.g(0, param0 ^ 11);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 87) {
          this.field_i = (us) null;
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -64) {
            field_h = 99;
            return this.field_n;
        }
        return this.field_n;
    }

    final void b(int param0) {
        L0: {
          if (this.field_k) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_k = false;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_b.g(1, 103);
        if (param0 >= -125) {
          L1: {
            this.field_o = (vk) null;
            this.field_b.a(110, (ht) null);
            this.field_b.a(20685, 8448, 8448);
            this.field_b.b(5890, 768, 0, 3);
            this.field_b.b(34166, 770, 2, 83);
            this.field_b.a(120, 0, 5890, 770);
            this.field_b.g(0, 92);
            if (this.field_l) {
              this.field_b.b(5890, 768, 0, -124);
              this.field_b.a(111, 0, 5890, 770);
              this.field_l = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            this.field_b.a(110, (ht) null);
            this.field_b.a(20685, 8448, 8448);
            this.field_b.b(5890, 768, 0, 3);
            this.field_b.b(34166, 770, 2, 83);
            this.field_b.a(120, 0, 5890, 770);
            this.field_b.g(0, 92);
            if (this.field_l) {
              this.field_b.b(5890, 768, 0, -124);
              this.field_b.a(111, 0, 5890, 770);
              this.field_l = false;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_j = new qr();
    }
}
