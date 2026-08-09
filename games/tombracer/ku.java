/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends qe {
    private pva field_g;
    private pva field_k;
    private rt field_l;
    private boolean field_e;
    private boolean field_f;
    private pva field_d;
    static int[] field_j;
    private boolean field_i;
    private boolean field_c;
    private pva field_h;

    final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                if (!this.field_c) {
                  this.field_a.a(true, this.field_a.field_lc);
                  this.field_a.d(1, 1);
                  this.field_a.c(0, param1 + -32221, 34168, 768);
                  this.field_a.b(34168, param1 + -32218, 0, 770);
                  this.field_c = true;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                L2: {
                  if (this.field_c) {
                    this.field_a.c(0, 0, 5890, 768);
                    this.field_a.b(5890, 3, 0, 770);
                    this.field_c = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_a.a(true, param2);
                this.field_a.d(1, param0);
                break L1;
              }
            }
            if (param1 == 32221) {
              break L0;
            } else {
              this.b(-28);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ku.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_e = param0 ? true : false;
        this.field_a.e(1, true);
        this.field_a.a(true, this.field_l);
        this.field_a.b(34165, 8960, 7681);
        int var3 = 90 % ((param1 - 56) / 48);
        this.field_a.c(0, 0, 34166, 768);
        this.field_a.c(2, 0, 5890, 770);
        this.field_a.b(34168, 3, 0, 770);
        this.field_a.e(0, true);
        this.a((byte) -120);
    }

    public static void d(int param0) {
        field_j = null;
        if (param0 <= 101) {
            field_j = (int[]) null;
        }
    }

    ku(cka param0) {
        super(param0);
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_c = false;
        try {
          if (!this.field_a.field_G) {
            this.field_f = false;
            return;
          } else {
            L0: {
              this.field_h = ea.a(17, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", this.field_a);
              this.field_d = ea.a(17, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", this.field_a);
              this.field_g = ea.a(17, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", this.field_a);
              this.field_k = ea.a(17, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", this.field_a);
              if (null == this.field_k) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            L1: {


              if (this.field_d == null) {

                stackIn_8_1 = 0;
                break L1;
              } else {

                stackIn_8_1 = 1;
                break L1;
              }
            }
            L2: {




              if (this.field_h == null) {


                stackIn_11_2 = 0;
                break L2;
              } else {


                stackIn_11_2 = 1;
                break L2;
              }
            }
            L3: {


              stackIn_13_1 = stackIn_8_1 & stackIn_11_2;

              if (null == this.field_g) {

                stackIn_14_1 = stackIn_13_1;
                stackIn_14_2 = 0;
                break L3;
              } else {

                stackIn_14_1 = stackIn_13_1;
                stackIn_14_2 = 1;
                break L3;
              }
            }
            if ((stackIn_5_0 & (stackIn_14_1 & stackIn_14_2)) == 0) {
              this.field_f = false;
              return;
            } else {
              this.field_l = new rt(param0, 3553, 6406, 2, 1, false, new byte[]{(byte) 0, (byte)-1}, 6406, false);
              this.field_l.a(false, false, -3554);
              this.field_f = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ku.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 <= 117) {
            this.b(false, 0);
        }
    }

    final void a(boolean param0) {
        cka stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cka stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        cka stackIn_8_0 = null;
        cka stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cka stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cka stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        cka stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cka stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        L0: {
          if (this.field_i) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_i = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          stackIn_5_0 = this.field_a;

          stackIn_5_1 = 1;

          if (param0) {
            stackIn_6_0 = (cka) ((Object) stackIn_5_0);
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 0;
            break L1;
          } else {
            stackIn_6_0 = (cka) ((Object) stackIn_5_0);
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 1;
            break L1;
          }
        }
        L2: {
          ((cka) (Object) stackIn_6_0).e(stackIn_6_1, stackIn_6_2 != 0);
          stackIn_8_0 = this.field_a;

          if (param0) {
            stackIn_9_0 = (cka) ((Object) stackIn_8_0);
            stackIn_9_1 = 0;
            break L2;
          } else {
            stackIn_9_0 = (cka) ((Object) stackIn_8_0);
            stackIn_9_1 = 1;
            break L2;
          }
        }
        ((cka) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (kl) null);
        if (!param0) {
          L3: {
            this.field_a.b(8448, 8960, 8448);
            this.field_a.c(0, 0, 5890, 768);
            this.field_a.c(2, 0, 34166, 770);
            this.field_a.b(5890, 3, 0, 770);
            stackIn_19_0 = this.field_a;

            stackIn_19_1 = 0;

            if (param0) {
              stackIn_20_0 = (cka) ((Object) stackIn_19_0);
              stackIn_20_1 = stackIn_19_1;
              stackIn_20_2 = 0;
              break L3;
            } else {
              stackIn_20_0 = (cka) ((Object) stackIn_19_0);
              stackIn_20_1 = stackIn_19_1;
              stackIn_20_2 = 1;
              break L3;
            }
          }
          ((cka) (Object) stackIn_20_0).e(stackIn_20_1, stackIn_20_2 != 0);
          if (this.field_c) {
            this.field_a.c(0, 0, 5890, 768);
            this.field_a.b(5890, 3, 0, 770);
            this.field_c = false;
            return;
          } else {
            return;
          }
        } else {
          L4: {
            field_j = (int[]) null;
            this.field_a.b(8448, 8960, 8448);
            this.field_a.c(0, 0, 5890, 768);
            this.field_a.c(2, 0, 34166, 770);
            this.field_a.b(5890, 3, 0, 770);
            stackIn_12_0 = this.field_a;

            stackIn_12_1 = 0;

            if (param0) {
              stackIn_13_0 = (cka) ((Object) stackIn_12_0);
              stackIn_13_1 = stackIn_12_1;
              stackIn_13_2 = 0;
              break L4;
            } else {
              stackIn_13_0 = (cka) ((Object) stackIn_12_0);
              stackIn_13_1 = stackIn_12_1;
              stackIn_13_2 = 1;
              break L4;
            }
          }
          ((cka) (Object) stackIn_13_0).e(stackIn_13_1, stackIn_13_2 != 0);
          if (this.field_c) {
            this.field_a.c(0, 0, 5890, 768);
            this.field_a.b(5890, 3, 0, 770);
            this.field_c = false;
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        oba var2;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        L0: {
          var2 = this.field_a.field_j;
          if (!this.field_e) {
            L1: {
              stackIn_7_0 = 34336;

              if (this.field_a.field_N != 2147483647) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_g.field_a;
                break L1;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_h.field_a;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackIn_3_0 = 34336;

              if (this.field_a.field_N != 2147483647) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_k.field_a;
                break L2;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_d.field_a;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        var2.a(sla.field_f, 0.0f, (float)this.field_a.field_N, 0.0f, -9479, -1.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, sla.field_f[0], sla.field_f[1], sla.field_f[2], sla.field_f[3]);
        jaggl.OpenGL.glEnable(34336);
        this.field_i = true;
        if (param0 != -120) {
          this.c(-94);
          this.c(param0 ^ 19);
          return;
        } else {
          this.c(param0 ^ 19);
          return;
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        L0: {
          if (this.field_i) {
            var2 = this.field_a.XA();
            var3 = this.field_a.i();
            var4 = -(0.125f * (float)(var2 + -var3)) + (float)var2;
            var5 = -((float)(var2 - var3) * 0.25f) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_a.field_vb, (float)this.field_a.field_nb / 255.0f);
            this.field_a.e(1, true);
            this.field_a.h(1104971864, this.field_a.field_xc);
            this.field_a.e(0, true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -48) {
          this.a(true, -105);
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
            this.b(9);
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            this.field_c = false;
            return this.field_f;
        }
        return this.field_f;
    }

    static {
        field_j = new int[]{0, 512, 512, 0};
    }
}
