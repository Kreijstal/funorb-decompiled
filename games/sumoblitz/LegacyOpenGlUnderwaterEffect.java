/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlUnderwaterEffect extends LegacyOpenGlEffect {
    private boolean active;
    static HuffmanDecoder field_g;
    private boolean lighting;
    private LegacyOpenGlAssemblyProgram groundUnlitProgram;
    private LegacyOpenGlAssemblyProgram modelLitProgram;
    private boolean supported;
    private LegacyOpenGlAssemblyProgram modelUnlitProgram;
    static AccountConnectionPhase CONNECTED;
    private boolean usingFallbackTexture;
    private LegacyOpenGlTexture2D fogRamp;
    private LegacyOpenGlAssemblyProgram groundLitProgram;
    static int field_h;

    final static MenuScreen createMenuScreen(int screenId, byte guard) {
        if (screenId == 7) {
          return (MenuScreen) ((Object) new LevelSelectScreen());
        }
        if (screenId == 9) {
          return (MenuScreen) ((Object) new ReassignUpgradesScreen());
        }
        if (screenId == 10) {
          return (MenuScreen) ((Object) new LevelCompleteUpgradeScreen());
        }
        int var2 = -9 % ((-5 - guard) / 35);
        if (11 == screenId) {
          return (MenuScreen) ((Object) new GameOverScreen());
        }
        if (screenId != 12) {
          return new MenuScreen(screenId);
        }
        return (MenuScreen) ((Object) new VictoryScreen());
    }

    public static void releaseStatics(boolean param0) {
        CONNECTED = null;
        field_g = null;
        if (!param0) {
          field_h = -28;
        }
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        RuntimeException var4 = null;
        LegacyOpenGlTexture var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 35) {
            var5 = (LegacyOpenGlTexture) null;
            this.bindTexture((byte) -126, 112, (LegacyOpenGlTexture) null);
          }
          if (texture == null) {
            if (this.usingFallbackTexture) {
              return;
            }
            this.toolkit.bindTexture(guard + 43, this.toolkit.field_n);
            this.toolkit.setTextureCombineMode(1, true);
            this.toolkit.setTextureCombineSources(34168, 768, 0, -116);
            this.toolkit.setTextureCombineOperands(guard + 75, 0, 34168, 770);
            this.usingFallbackTexture = true;
            return;
          }
          if (!this.usingFallbackTexture) {
            this.toolkit.bindTexture(76, texture);
            this.toolkit.setTextureCombineMode(combineMode, true);
            return;
          }
          this.toolkit.setTextureCombineSources(5890, 768, 0, 29);
          this.toolkit.setTextureCombineOperands(120, 0, 5890, 770);
          this.usingFallbackTexture = false;
          this.toolkit.bindTexture(76, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ga.A(").append(guard).append(',').append(combineMode).append(',');
          if (texture == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    LegacyOpenGlUnderwaterEffect(LegacyOpenGlGraphicsToolkit owner) {
        super(owner);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.usingFallbackTexture = false;
        try {
          if (!this.toolkit.supportsVertexPrograms) {
            this.supported = false;
            return;
          }
          this.groundUnlitProgram = CheckboxWidget.compileAssemblyProgram(this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
          this.groundLitProgram = CheckboxWidget.compileAssemblyProgram(this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -24674);
          this.modelUnlitProgram = CheckboxWidget.compileAssemblyProgram(this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
          this.modelLitProgram = CheckboxWidget.compileAssemblyProgram(this.toolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -24674);
          stackIn_6_0 = (null == this.modelLitProgram) ? 0 : 1;
          if (this.groundUnlitProgram == null) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = 1;
          }
          if (null == this.groundLitProgram) {
            stackIn_12_2 = 0;
          } else {
            stackIn_12_2 = 1;
          }
          stackIn_14_1 = stackIn_9_1 & stackIn_12_2;
          if (null == this.modelUnlitProgram) {
            stackIn_15_2 = 0;
          } else {
            stackIn_15_2 = 1;
          }
          if ((stackIn_6_0 & (stackIn_14_1 & stackIn_15_2)) == 0) {
            this.supported = false;
            return;
          }
          this.fogRamp = new LegacyOpenGlTexture2D(owner, 3553, 6406, 2, 1, false, new byte[]{(byte) 0, (byte)-1}, 6406, false);
          this.fogRamp.setWrap(false, false, -27365);
          this.supported = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ga.<init>(");
          if (owner == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void enable(byte guard, boolean lighting) {
        this.lighting = lighting ? true : false;
        this.toolkit.setActiveTextureUnit(1, 123);
        this.toolkit.bindTexture(67, this.fogRamp);
        this.toolkit.setTextureCombineOperations(20685, 7681, 34165);
        this.toolkit.setTextureCombineSources(34166, 768, 0, -116);
        this.toolkit.setTextureCombineSources(5890, 770, 2, -118);
        this.toolkit.setTextureCombineOperands(124, 0, 34168, 770);
        this.toolkit.setActiveTextureUnit(0, 120);
        if (guard < 33) {
          this.updateFogParameters((byte) 68);
        } else {
          this.bindProgramForWaterPlane((byte) -107);
          return;
        }
        this.bindProgramForWaterPlane((byte) -107);
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        if (guard < 39) {
          this.disable(88);
        }
    }

    private final void bindProgramForWaterPlane(byte guard) {
        LegacyOpenGlTransform3D var2 = this.toolkit.field_M;
        if (!this.lighting) {
          jaggl.OpenGL.glBindProgramARB(34336, this.toolkit.field_yb == 2147483647 ? this.groundUnlitProgram.programId : this.modelUnlitProgram.programId);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != this.toolkit.field_yb ? this.modelLitProgram.programId : this.groundLitProgram.programId);
        }
        var2.a(TextLayout.field_c, 26839, -1.0f, 0.0f, (float)this.toolkit.field_yb, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, TextLayout.field_c[0], TextLayout.field_c[1], TextLayout.field_c[2], TextLayout.field_c[3]);
        jaggl.OpenGL.glEnable(34336);
        this.active = true;
        int var3 = 106 % ((-55 - guard) / 52);
        this.updateFogParameters((byte) 87);
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard >= -30) {
          this.enable((byte) 75, true);
        }
    }

    private final void updateFogParameters(byte guard) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (this.active) {
          var2 = this.toolkit.farPlane();
          var3 = this.toolkit.nearPlane();
          var4 = -((float)(var2 - var3) * 0.125f) + (float)var2;
          var5 = -((float)(var2 - var3) * 0.25f) + (float)var2;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.toolkit.field_u, (float)this.toolkit.field_Mb / 255.0f);
          this.toolkit.setActiveTextureUnit(1, guard + 37);
          this.toolkit.setTextureConstantArgb(0, this.toolkit.field_k);
          this.toolkit.setActiveTextureUnit(0, guard ^ 11);
        }
        if (guard == 87) {
          return;
        }
        this.fogRamp = (LegacyOpenGlTexture2D) null;
    }

    final boolean isSupported(byte guard) {
        if (guard >= -64) {
          field_h = 99;
          return this.supported;
        }
        return this.supported;
    }

    final void disable(int guard) {
        if (this.active) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.active = false;
        }
        this.toolkit.setActiveTextureUnit(1, 103);
        if (guard < -125) {
          this.toolkit.bindTexture(110, (LegacyOpenGlTexture) null);
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.setTextureCombineSources(5890, 768, 0, 3);
          this.toolkit.setTextureCombineSources(34166, 770, 2, 83);
          this.toolkit.setTextureCombineOperands(120, 0, 5890, 770);
          this.toolkit.setActiveTextureUnit(0, 92);
          if (this.usingFallbackTexture) {
            this.toolkit.setTextureCombineSources(5890, 768, 0, -124);
            this.toolkit.setTextureCombineOperands(111, 0, 5890, 770);
            this.usingFallbackTexture = false;
          }
          return;
        }
        this.groundUnlitProgram = (LegacyOpenGlAssemblyProgram) null;
        this.toolkit.bindTexture(110, (LegacyOpenGlTexture) null);
        this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
        this.toolkit.setTextureCombineSources(5890, 768, 0, 3);
        this.toolkit.setTextureCombineSources(34166, 770, 2, 83);
        this.toolkit.setTextureCombineOperands(120, 0, 5890, 770);
        this.toolkit.setActiveTextureUnit(0, 92);
        if (this.usingFallbackTexture) {
          this.toolkit.setTextureCombineSources(5890, 768, 0, -124);
          this.toolkit.setTextureCombineOperands(111, 0, 5890, 770);
          this.usingFallbackTexture = false;
        }
    }

    static {
        CONNECTED = new AccountConnectionPhase();
    }
}
