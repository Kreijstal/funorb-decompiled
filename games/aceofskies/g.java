/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends hh {
    static java.awt.Color field_h;
    private boolean field_i;
    private uf field_n;
    private boolean field_j;
    private uf field_g;
    private uf field_m;
    private boolean field_e;
    static boolean field_k;
    private nr field_l;
    private uf field_d;
    private boolean field_f;

    final void a(boolean param0, boolean param1) {
        ((g) this).field_i = param1 ? true : false;
        ((g) this).field_a.a(param0, 1);
        ((g) this).field_a.a((rt) (Object) ((g) this).field_l, 1);
        ((g) this).field_a.a(34165, -26625, 7681);
        ((g) this).field_a.a(34166, 768, 34176, 0);
        ((g) this).field_a.a(5890, 770, 34176, 2);
        ((g) this).field_a.a(770, 34168, 0, (byte) 95);
        ((g) this).field_a.a(false, 0);
        this.c(-120);
    }

    final void b(byte param0) {
        L0: {
          if (((g) this).field_e) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            ((g) this).field_e = false;
            break L0;
          } else {
            break L0;
          }
        }
        ((g) this).field_a.a(false, 1);
        ((g) this).field_a.a((rt) null, 1);
        if (param0 >= 5) {
          ((g) this).field_a.a(8448, -26625, 8448);
          ((g) this).field_a.a(5890, 768, 34176, 0);
          ((g) this).field_a.a(34166, 770, 34176, 2);
          ((g) this).field_a.a(770, 5890, 0, (byte) 93);
          ((g) this).field_a.a(false, 0);
          if (((g) this).field_j) {
            ((g) this).field_a.a(5890, 768, 34176, 0);
            ((g) this).field_a.a(770, 5890, 0, (byte) 109);
            ((g) this).field_j = false;
            return;
          } else {
            return;
          }
        } else {
          g.b(-66);
          ((g) this).field_a.a(8448, -26625, 8448);
          ((g) this).field_a.a(5890, 768, 34176, 0);
          ((g) this).field_a.a(34166, 770, 34176, 2);
          ((g) this).field_a.a(770, 5890, 0, (byte) 93);
          ((g) this).field_a.a(false, 0);
          if (!((g) this).field_j) {
            return;
          } else {
            ((g) this).field_a.a(5890, 768, 34176, 0);
            ((g) this).field_a.a(770, 5890, 0, (byte) 109);
            ((g) this).field_j = false;
            return;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -12 % ((0 - param0) / 54);
        field_h = null;
    }

    private final void c() {
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var2 = -42;
        if (((g) this).field_e) {
            var3 = ((g) this).field_a.XA();
            var4 = ((g) this).field_a.i();
            var5 = (float)var3 - (float)(-var4 + var3) * 0.125f;
            var6 = (float)var3 - 0.25f * (float)(-var4 + var3);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, var5, 1.0f / (float)((g) this).field_a.field_U, (float)((g) this).field_a.field_Lb / 255.0f);
            ((g) this).field_a.a(false, 1);
            ((g) this).field_a.c(2, ((g) this).field_a.field_Dc);
            ((g) this).field_a.a(false, 0);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            Object var4 = null;
            ((g) this).a(-78, -62, (rt) null);
        }
    }

    g(wl param0) {
        super(param0);
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        ((g) this).field_j = false;
        try {
          if (!((g) this).field_a.field_x) {
            ((g) this).field_f = false;
            return;
          } else {
            L0: {
              ((g) this).field_m = nk.a((byte) 32, 34336, ((g) this).field_a, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
              ((g) this).field_g = nk.a((byte) 34, 34336, ((g) this).field_a, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
              ((g) this).field_n = nk.a((byte) 113, 34336, ((g) this).field_a, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
              ((g) this).field_d = nk.a((byte) 107, 34336, ((g) this).field_a, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
              if (((g) this).field_d == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            L1: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (null == ((g) this).field_m) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            L2: {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = stackIn_8_1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (((g) this).field_g == null) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L2;
              }
            }
            L3: {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = stackIn_11_1 & stackIn_11_2;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (((g) this).field_n == null) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L3;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L3;
              }
            }
            if ((stackIn_14_0 & (stackIn_14_1 & stackIn_14_2)) == 0) {
              ((g) this).field_f = false;
              return;
            } else {
              ((g) this).field_l = new nr(param0, 3553, 6406, 2, 1, false, new byte[2], 6406, false);
              ((g) this).field_l.a(false, 11779, false);
              ((g) this).field_f = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("g.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final void a(int param0, int param1, rt param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                if (!((g) this).field_j) {
                  ((g) this).field_a.a((rt) (Object) ((g) this).field_a.field_Vb, 1);
                  ((g) this).field_a.a(1, (byte) -39);
                  ((g) this).field_a.a(34168, 768, 34176, 0);
                  ((g) this).field_a.a(770, 34168, 0, (byte) 80);
                  ((g) this).field_j = true;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                L2: {
                  if (((g) this).field_j) {
                    ((g) this).field_a.a(5890, 768, 34176, 0);
                    ((g) this).field_a.a(770, 5890, 0, (byte) 79);
                    ((g) this).field_j = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((g) this).field_a.a(param2, param1 + 1486691001);
                ((g) this).field_a.a(param0, (byte) -39);
                break L1;
              }
            }
            if (param1 == -1486691000) {
              break L0;
            } else {
              ((g) this).a(48, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("g.J(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) ho.field_b);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ho.field_b);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) ho.field_b);
            mp.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "g.I(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -65) {
            field_k = false;
        }
    }

    final boolean a(byte param0) {
        int var2 = -79 / ((-11 - param0) / 63);
        return ((g) this).field_f;
    }

    private final void c(int param0) {
        tj var2 = ((g) this).field_a.field_h;
        if (((g) this).field_i) {
            jaggl.OpenGL.glBindProgramARB(34336, 2147483647 == ((g) this).field_a.field_E ? ((g) this).field_g.field_a : ((g) this).field_d.field_a);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, ((g) this).field_a.field_E == 2147483647 ? ((g) this).field_m.field_a : ((g) this).field_n.field_a);
        }
        var2.a((float)((g) this).field_a.field_E, 0.0f, ua.field_c, -1.0f, -99, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ua.field_c[0], ua.field_c[1], ua.field_c[2], ua.field_c[3]);
        int var3 = 0;
        jaggl.OpenGL.glEnable(34336);
        ((g) this).field_e = true;
        int discarded$0 = 24;
        this.c();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new java.awt.Color(10040319);
    }
}
