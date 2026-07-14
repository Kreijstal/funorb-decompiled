/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends qg {
    private vab field_d;
    private vab field_c;
    private vab field_g;
    private vab field_i;
    private boolean field_l;
    static int field_k;
    private boolean field_f;
    private boolean field_e;
    private aia field_h;
    static int field_m;
    private boolean field_j;

    final static boolean a(tv param0, tv param1, int param2, byte param3) {
        if (param2 != 1) {
          if (param2 != 2) {
            if (3 == param2) {
              return ((sjb) (Object) param1).a((sjb) (Object) param0, -25725);
            } else {
              if (param3 >= -50) {
                field_m = 42;
                throw new IllegalArgumentException("" + param2);
              } else {
                throw new IllegalArgumentException("" + param2);
              }
            }
          } else {
            return ((tva) (Object) param1).a(true, (tva) (Object) param0);
          }
        } else {
          return param1.a((byte) 113, param0);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25139) {
            ((la) this).a(60);
        }
    }

    final void e(int param0) {
        epb var2 = ((la) this).field_b.field_F;
        if (!((la) this).field_l) {
            jaggl.OpenGL.glBindProgramARB(34336, ((la) this).field_b.field_V == -2147483648 ? ((la) this).field_d.field_b : ((la) this).field_g.field_b);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, -2147483648 == ((la) this).field_b.field_V ? ((la) this).field_c.field_b : ((la) this).field_i.field_b);
        }
        var2.a(dn.field_o, 0.0f, (float)((la) this).field_b.field_V, 0.0f, param0 + -34323, -1.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, dn.field_o[0], dn.field_o[1], dn.field_o[2], dn.field_o[3]);
        jaggl.OpenGL.glEnable(param0);
        ((la) this).field_e = true;
        this.d(param0 ^ 34386);
    }

    la(qfa param0) {
        super(param0);
        ((la) this).field_f = false;
        if (((la) this).field_b.field_Zb) {
            ((la) this).field_d = faa.a((byte) 115, ((la) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            ((la) this).field_c = faa.a((byte) 115, ((la) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
            ((la) this).field_g = faa.a((byte) 115, ((la) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            ((la) this).field_i = faa.a((byte) 115, ((la) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
            if (((null != ((la) this).field_g ? 1 : 0) & ((((la) this).field_d != null ? 1 : 0) & (null != ((la) this).field_c ? 1 : 0)) & (((la) this).field_i != null ? 1 : 0)) == 0) {
                ((la) this).field_j = false;
            }
            ((la) this).field_h = new aia(param0, 3553, 6406, 2, 1, false, new byte[2], 6406, false);
            ((la) this).field_h.a(false, false, 10497);
            ((la) this).field_j = true;
        }
        ((la) this).field_j = false;
    }

    final void a(boolean param0, int param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((la) this).field_l = stackIn_3_1 != 0;
        ((la) this).field_b.h(33984, 1);
        ((la) this).field_b.a(55, (pib) (Object) ((la) this).field_h);
        ((la) this).field_b.b(34165, 7681, false);
        ((la) this).field_b.c(0, 34192, 768, 34166);
        ((la) this).field_b.c(2, 34192, 770, 5890);
        if (param1 < 18) {
          field_k = -59;
          ((la) this).field_b.b(0, 770, 34168, 34184);
          ((la) this).field_b.h(33984, 0);
          ((la) this).e(34336);
          return;
        } else {
          ((la) this).field_b.b(0, 770, 34168, 34184);
          ((la) this).field_b.h(33984, 0);
          ((la) this).e(34336);
          return;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (param0 <= 108) {
          L0: {
            ((la) this).a(-111, -111, -119);
            if (!((la) this).field_e) {
              break L0;
            } else {
              var2 = ((la) this).field_b.XA();
              var3 = ((la) this).field_b.i();
              var4 = (float)var2 - (float)(var2 - var3) * 0.125f;
              var5 = -((float)(-var3 + var2) * 0.25f) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((la) this).field_b.field_Hc, (float)((la) this).field_b.field_M / 255.0f);
              ((la) this).field_b.h(33984, 1);
              ((la) this).field_b.b(true, ((la) this).field_b.field_Fc);
              ((la) this).field_b.h(33984, 0);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!((la) this).field_e) {
              break L1;
            } else {
              var2 = ((la) this).field_b.XA();
              var3 = ((la) this).field_b.i();
              var4 = (float)var2 - (float)(var2 - var3) * 0.125f;
              var5 = -((float)(-var3 + var2) * 0.25f) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((la) this).field_b.field_Hc, (float)((la) this).field_b.field_M / 255.0f);
              ((la) this).field_b.h(33984, 1);
              ((la) this).field_b.b(true, ((la) this).field_b.field_Fc);
              ((la) this).field_b.h(33984, 0);
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        if (!((la) this).field_e) {
          ((la) this).field_b.h(param0 ^ 37826, 1);
          ((la) this).field_b.a(43, (pib) null);
          ((la) this).field_b.b(8448, 8448, false);
          ((la) this).field_b.c(0, 34192, 768, param0);
          ((la) this).field_b.c(2, 34192, 770, 34166);
          ((la) this).field_b.b(0, 770, 5890, 34184);
          ((la) this).field_b.h(param0 ^ 37826, 0);
          if (((la) this).field_f) {
            ((la) this).field_b.c(0, 34192, 768, 5890);
            ((la) this).field_b.b(0, 770, 5890, 34184);
            ((la) this).field_f = false;
            return;
          } else {
            return;
          }
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          ((la) this).field_e = false;
          ((la) this).field_b.h(param0 ^ 37826, 1);
          ((la) this).field_b.a(43, (pib) null);
          ((la) this).field_b.b(8448, 8448, false);
          ((la) this).field_b.c(0, 34192, 768, param0);
          ((la) this).field_b.c(2, 34192, 770, 34166);
          ((la) this).field_b.b(0, 770, 5890, 34184);
          ((la) this).field_b.h(param0 ^ 37826, 0);
          if (!((la) this).field_f) {
            return;
          } else {
            ((la) this).field_b.c(0, 34192, 768, 5890);
            ((la) this).field_b.b(0, 770, 5890, 34184);
            ((la) this).field_f = false;
            return;
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ((la) this).a(25);
        }
    }

    final boolean b(int param0) {
        if (param0 >= -87) {
            ((la) this).a(false, 23);
            return ((la) this).field_j;
        }
        return ((la) this).field_j;
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 == 125) {
          if (param2 != null) {
            if (!((la) this).field_f) {
              ((la) this).field_b.a(48, param2);
              ((la) this).field_b.c(param1 ^ 125, param0);
              return;
            } else {
              ((la) this).field_b.c(0, 34192, 768, 5890);
              ((la) this).field_b.b(0, 770, 5890, 34184);
              ((la) this).field_f = false;
              ((la) this).field_b.a(48, param2);
              ((la) this).field_b.c(param1 ^ 125, param0);
              return;
            }
          } else {
            if (!((la) this).field_f) {
              ((la) this).field_b.a(58, (pib) (Object) ((la) this).field_b.field_qb);
              ((la) this).field_b.c(0, 1);
              ((la) this).field_b.c(0, 34192, 768, 34168);
              ((la) this).field_b.b(0, 770, 34168, 34184);
              ((la) this).field_f = true;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 2048;
        field_m = 10;
    }
}
