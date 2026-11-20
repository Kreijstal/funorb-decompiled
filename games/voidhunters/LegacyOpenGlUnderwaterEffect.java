/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlUnderwaterEffect extends LegacyOpenGlMaterialEffect {
    private ArbProgram unlitDepthProgram;
    private ArbProgram litDepthProgram;
    private ArbProgram unlitPlaneProgram;
    private ArbProgram litPlaneProgram;
    private boolean lightingEnabled;
    static int field_k;
    private boolean usingFallbackTexture;
    private boolean active;
    private OpenGlTexture2D fogRamp;
    static int field_m;
    private boolean supported;

    final static boolean compareStatesByMode(SerializableGameState param0, SerializableGameState param1, int param2, byte param3) {
        RuntimeException var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1) {
            stackIn_2_0 = param1.differsFrom((byte) 113, param0);
            return stackIn_2_0;
          }
          if (param2 == 2) {
            stackIn_5_0 = ((tva) (param1)).a(true, (tva) (param0));
            return stackIn_5_0;
          }
          if (3 == param2) {
            stackIn_9_0 = ((sjb) (param1)).a((sjb) (param0), -25725);
            return stackIn_9_0;
          }
          if (param3 >= -50) {
            field_m = 42;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param1 != -25139) {
          this.disable(60);
        }
    }

    final void updateProgramAndWaterPlane(int param0) {
        OpenGlTransform3D var2 = this.toolkit.field_F;
        if (!this.lightingEnabled) {
          jaggl.OpenGL.glBindProgramARB(34336, this.toolkit.field_V == 2147483647 ? this.unlitDepthProgram.field_b : this.unlitPlaneProgram.field_b);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, this.toolkit.field_V == 2147483647 ? this.litDepthProgram.field_b : this.litPlaneProgram.field_b);
        }
        var2.transformPlane(SetCountermeasureLauncherAimspeed.field_o, 0.0f, (float)this.toolkit.field_V, 0.0f, param0 - 34323, -1.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, SetCountermeasureLauncherAimspeed.field_o[0], SetCountermeasureLauncherAimspeed.field_o[1], SetCountermeasureLauncherAimspeed.field_o[2], SetCountermeasureLauncherAimspeed.field_o[3]);
        jaggl.OpenGL.glEnable(param0);
        this.active = true;
        this.updateFogParameters(param0 ^ 34386);
    }

    LegacyOpenGlUnderwaterEffect(OpenGlToolkit param0) {
        super(param0);
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.usingFallbackTexture = false;
        try {
          if (!this.toolkit.field_Zb) {
            this.supported = false;
            return;
          }
          this.unlitDepthProgram = IsaacPacketBuffer.compileArbProgram((byte) 115, this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
          this.litDepthProgram = IsaacPacketBuffer.compileArbProgram((byte) 115, this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
          this.unlitPlaneProgram = IsaacPacketBuffer.compileArbProgram((byte) 115, this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
          this.litPlaneProgram = IsaacPacketBuffer.compileArbProgram((byte) 115, this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
          stackIn_5_0 = (null == this.unlitPlaneProgram) ? 0 : 1;
          if (this.unlitDepthProgram == null) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (null == this.litDepthProgram) {
            stackIn_11_2 = 0;
          } else {
            stackIn_11_2 = 1;
          }
          stackIn_13_0 = stackIn_5_0 & (stackIn_8_1 & stackIn_11_2);
          if (this.litPlaneProgram == null) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if ((stackIn_13_0 & stackIn_14_1) == 0) {
            this.supported = false;
            return;
          }
          this.fogRamp = new OpenGlTexture2D(param0, 3553, 6406, 2, 1, false, new byte[]{(byte) 0, (byte)-1}, 6406, false);
          this.fogRamp.setWrap(false, false, 10497);
          this.supported = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("la.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void enable(boolean param0, int param1) {
        this.lightingEnabled = param0 ? true : false;
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(55, this.fogRamp);
        this.toolkit.setTextureCombineOperations(34165, 7681, false);
        this.toolkit.setRgbCombineArgument(0, 34192, 768, 34166);
        this.toolkit.setRgbCombineArgument(2, 34192, 770, 5890);
        if (param1 >= 18) {
          this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.updateProgramAndWaterPlane(34336);
          return;
        }
        field_k = -59;
        this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.updateProgramAndWaterPlane(34336);
    }

    private final void updateFogParameters(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var2Lifetime1;
        int var3Lifetime1;
        float var4Lifetime1;
        float var5Lifetime1;
        if (param0 > 108) {
          if (this.active) {
            var2 = this.toolkit.getFarPlane();
            var3 = this.toolkit.getNearPlane();
            var4 = (float)var2 - (float)(var2 - var3) * 0.125f;
            var5 = -((float)(-var3 + var2) * 0.25f) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.toolkit.field_Hc, (float)this.toolkit.field_M / 255.0f);
            this.toolkit.setActiveTextureUnit(33984, 1);
            this.toolkit.setTextureEnvironmentColor(true, this.toolkit.field_Fc);
            this.toolkit.setActiveTextureUnit(33984, 0);
          }
          return;
        }
        this.setParameters(-111, -111, -119);
        if (this.active) {
          var2Lifetime1 = this.toolkit.getFarPlane();
          var3Lifetime1 = this.toolkit.getNearPlane();
          var4Lifetime1 = (float)var2Lifetime1 - (float)(var2Lifetime1 - var3Lifetime1) * 0.125f;
          var5Lifetime1 = -((float)(-var3Lifetime1 + var2Lifetime1) * 0.25f) + (float)var2Lifetime1;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5Lifetime1, var4Lifetime1, 1.0f / (float)this.toolkit.field_Hc, (float)this.toolkit.field_M / 255.0f);
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.setTextureEnvironmentColor(true, this.toolkit.field_Fc);
          this.toolkit.setActiveTextureUnit(33984, 0);
        }
    }

    final void disable(int param0) {
        if (this.active) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.active = false;
          this.toolkit.setActiveTextureUnit(param0 ^ 37826, 1);
          this.toolkit.bindTexture(43, (OpenGlTexture) null);
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          this.toolkit.setRgbCombineArgument(0, 34192, 768, param0);
          this.toolkit.setRgbCombineArgument(2, 34192, 770, 34166);
          this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
          this.toolkit.setActiveTextureUnit(param0 ^ 37826, 0);
          if (this.usingFallbackTexture) {
            this.toolkit.setRgbCombineArgument(0, 34192, 768, 5890);
            this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
            this.usingFallbackTexture = false;
            return;
          }
          return;
        }
        this.toolkit.setActiveTextureUnit(param0 ^ 37826, 1);
        this.toolkit.bindTexture(43, (OpenGlTexture) null);
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
        this.toolkit.setRgbCombineArgument(0, 34192, 768, param0);
        this.toolkit.setRgbCombineArgument(2, 34192, 770, 34166);
        this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        this.toolkit.setActiveTextureUnit(param0 ^ 37826, 0);
        if (!this.usingFallbackTexture) {
          return;
        }
        this.toolkit.setRgbCombineArgument(0, 34192, 768, 5890);
        this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        this.usingFallbackTexture = false;
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          this.disable(25);
        }
    }

    final boolean isSupported(int param0) {
        if (param0 >= -87) {
          this.enable(false, 23);
          return this.supported;
        }
        return this.supported;
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 125) {
            return;
          }
          if (param2 != null) {
            if (this.usingFallbackTexture) {
              this.toolkit.setRgbCombineArgument(0, 34192, 768, 5890);
              this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
              this.usingFallbackTexture = false;
            }
            this.toolkit.bindTexture(48, param2);
            this.toolkit.setTextureCombineMode(param1 ^ 125, param0);
          } else {
            if (!this.usingFallbackTexture) {
              this.toolkit.bindTexture(58, this.toolkit.field_qb);
              this.toolkit.setTextureCombineMode(0, 1);
              this.toolkit.setRgbCombineArgument(0, 34192, 768, 34168);
              this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
              this.usingFallbackTexture = true;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_k = 2048;
        field_m = 10;
    }
}
