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
        int var2 = 0;
        if (param0 == -8) {
          return (ak) (Object) new tr();
        } else {
          if (-10 != param0) {
            if (-11 == (param0 ^ -1)) {
              return (ak) (Object) new jp();
            } else {
              var2 = -9 % ((-5 - param1) / 35);
              if (11 != param0) {
                if (-13 == (param0 ^ -1)) {
                  return (ak) (Object) new di();
                } else {
                  return new ak(param0);
                }
              } else {
                return (ak) (Object) new lp();
              }
            }
          } else {
            return (ak) (Object) new bb();
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
        Object var5 = null;
        if (param0 == 35) {
          if (param2 == null) {
            if (!((ga) this).field_l) {
              ((ga) this).field_b.a(param0 + 43, (ht) (Object) ((ga) this).field_b.field_n);
              ((ga) this).field_b.c(1, true);
              ((ga) this).field_b.b(34168, 768, 0, -116);
              ((ga) this).field_b.a(param0 + 75, 0, 34168, 770);
              ((ga) this).field_l = true;
              return;
            } else {
              return;
            }
          } else {
            if (!((ga) this).field_l) {
              ((ga) this).field_b.a(76, param2);
              ((ga) this).field_b.c(param1, true);
              return;
            } else {
              ((ga) this).field_b.b(5890, 768, 0, 29);
              ((ga) this).field_b.a(120, 0, 5890, 770);
              ((ga) this).field_l = false;
              ((ga) this).field_b.a(76, param2);
              ((ga) this).field_b.c(param1, true);
              return;
            }
          }
        } else {
          var5 = null;
          ((ga) this).a((byte) -126, 112, (ht) null);
          if (param2 == null) {
            if (((ga) this).field_l) {
              return;
            } else {
              ((ga) this).field_b.a(param0 + 43, (ht) (Object) ((ga) this).field_b.field_n);
              ((ga) this).field_b.c(1, true);
              ((ga) this).field_b.b(34168, 768, 0, -116);
              ((ga) this).field_b.a(param0 + 75, 0, 34168, 770);
              ((ga) this).field_l = true;
              return;
            }
          } else {
            if (!((ga) this).field_l) {
              ((ga) this).field_b.a(76, param2);
              ((ga) this).field_b.c(param1, true);
              return;
            } else {
              ((ga) this).field_b.b(5890, 768, 0, 29);
              ((ga) this).field_b.a(120, 0, 5890, 770);
              ((ga) this).field_l = false;
              ((ga) this).field_b.a(76, param2);
              ((ga) this).field_b.c(param1, true);
              return;
            }
          }
        }
    }

    ga(fr param0) {
        super(param0);
        ((ga) this).field_l = false;
        if (!((ga) this).field_b.field_Ib) {
            ((ga) this).field_n = false;
        }
        ((ga) this).field_o = wr.a(((ga) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
        ((ga) this).field_e = wr.a(((ga) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
        ((ga) this).field_m = wr.a(((ga) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
        ((ga) this).field_f = wr.a(((ga) this).field_b, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
        if (((null != ((ga) this).field_f ? 1 : 0) & ((((ga) this).field_o != null ? 1 : 0) & (null != ((ga) this).field_e ? 1 : 0) & (null != ((ga) this).field_m ? 1 : 0))) != 0) {
            ((ga) this).field_i = new us(param0, 3553, 6406, 2, 1, false, new byte[2], 6406, false);
            ((ga) this).field_i.a(false, false, -27365);
            ((ga) this).field_n = true;
        }
        ((ga) this).field_n = false;
    }

    final void a(byte param0, boolean param1) {
        ((ga) this).field_p = param1 ? true : false;
        ((ga) this).field_b.g(1, 123);
        ((ga) this).field_b.a(67, (ht) (Object) ((ga) this).field_i);
        ((ga) this).field_b.a(20685, 7681, 34165);
        ((ga) this).field_b.b(34166, 768, 0, -116);
        ((ga) this).field_b.b(5890, 770, 2, -118);
        ((ga) this).field_b.a(124, 0, 34168, 770);
        ((ga) this).field_b.g(0, 120);
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
            ((ga) this).b(88);
        }
    }

    private final void c(byte param0) {
        dl var2 = ((ga) this).field_b.field_M;
        if (!((ga) this).field_p) {
            jaggl.OpenGL.glBindProgramARB(34336, (((ga) this).field_b.field_yb ^ -1) == -2147483648 ? ((ga) this).field_o.field_a : ((ga) this).field_m.field_a);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != ((ga) this).field_b.field_yb ? ((ga) this).field_f.field_a : ((ga) this).field_e.field_a);
        }
        var2.a(ag.field_c, 26839, -1.0f, 0.0f, (float)((ga) this).field_b.field_yb, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ag.field_c[0], ag.field_c[1], ag.field_c[2], ag.field_c[3]);
        jaggl.OpenGL.glEnable(34336);
        ((ga) this).field_k = true;
        int var3 = 106 % ((-55 - param0) / 52);
        this.d((byte) 87);
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -30) {
            ((ga) this).a((byte) 75, true);
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          if (((ga) this).field_k) {
            var2 = ((ga) this).field_b.XA();
            var3 = ((ga) this).field_b.i();
            var4 = -((float)(var2 + -var3) * 0.125f) + (float)var2;
            var5 = -((float)(var2 + -var3) * 0.25f) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((ga) this).field_b.field_u, (float)((ga) this).field_b.field_Mb / 255.0f);
            ((ga) this).field_b.g(1, param0 + 37);
            ((ga) this).field_b.e(0, ((ga) this).field_b.field_k);
            ((ga) this).field_b.g(0, param0 ^ 11);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 87) {
          ((ga) this).field_i = null;
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -64) {
            field_h = 99;
            return ((ga) this).field_n;
        }
        return ((ga) this).field_n;
    }

    final void b(int param0) {
        L0: {
          if (((ga) this).field_k) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            ((ga) this).field_k = false;
            break L0;
          } else {
            break L0;
          }
        }
        ((ga) this).field_b.g(1, 103);
        if (param0 >= -125) {
          L1: {
            ((ga) this).field_o = null;
            ((ga) this).field_b.a(110, (ht) null);
            ((ga) this).field_b.a(20685, 8448, 8448);
            ((ga) this).field_b.b(5890, 768, 0, 3);
            ((ga) this).field_b.b(34166, 770, 2, 83);
            ((ga) this).field_b.a(120, 0, 5890, 770);
            ((ga) this).field_b.g(0, 92);
            if (((ga) this).field_l) {
              ((ga) this).field_b.b(5890, 768, 0, -124);
              ((ga) this).field_b.a(111, 0, 5890, 770);
              ((ga) this).field_l = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            ((ga) this).field_b.a(110, (ht) null);
            ((ga) this).field_b.a(20685, 8448, 8448);
            ((ga) this).field_b.b(5890, 768, 0, 3);
            ((ga) this).field_b.b(34166, 770, 2, 83);
            ((ga) this).field_b.a(120, 0, 5890, 770);
            ((ga) this).field_b.g(0, 92);
            if (((ga) this).field_l) {
              ((ga) this).field_b.b(5890, 768, 0, -124);
              ((ga) this).field_b.a(111, 0, 5890, 770);
              ((ga) this).field_l = false;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new qr();
    }
}
