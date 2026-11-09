/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTurbulentTextureEffect extends LegacyOpenGlEffect {
    private LegacyWaterTextureResources waterTextures;
    private int lastAnimationTime;
    private LegacyOpenGlAssemblyProgram program;
    private float volumeTime;
    private LegacyOpenGlDisplayLists stateLists;
    private float[] animatedNoise;
    static String loadingGraphicsText;

    final boolean isSupported(byte guard) {
        if (guard > -64) {
          this.waterTextures = (LegacyWaterTextureResources) null;
          return true;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 4) {
          return;
        }
        loadingGraphicsText = null;
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        int var5;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.stateLists == null) {
          return;
        }
        this.toolkit.setActiveTextureUnit(1, 126);
        if (guard <= 39) {
          return;
        }
        if ((parameters0 & 128) != 0) {
          this.toolkit.bindTexture(32, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, 122);
          if ((parameters0 & 64) != 0) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
            var4 = parameters0 & 3;
            if (var4 == 2) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
            } else {
              if (var4 == 3) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
              }
            }
            return;
          }
          AchievementThresholds.field_d[1] = this.toolkit.field_cb * this.toolkit.field_z;
          AchievementThresholds.field_d[2] = this.toolkit.field_cb * this.toolkit.field_ac;
          AchievementThresholds.field_d[0] = this.toolkit.field_Fc * this.toolkit.field_cb;
          jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, AchievementThresholds.field_d, 0);
          var4Lifetime2 = parameters0 & 3;
          if (var4Lifetime2 == 2) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
          } else {
            if (var4Lifetime2 == 3) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
            } else {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
            }
          }
          return;
        }
        if ((1 & parameters1) != 1) {
          if (!this.waterTextures.useVolumeTextures) {
            this.toolkit.bindTexture(86, this.waterTextures.ridgedSlices[0]);
          } else {
            this.toolkit.bindTexture(54, this.waterTextures.ridgedVolume);
          }
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
          this.toolkit.setActiveTextureUnit(0, 122);
          if ((parameters0 & 64) != 0) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
          } else {
            AchievementThresholds.field_d[1] = this.toolkit.field_cb * this.toolkit.field_z;
            AchievementThresholds.field_d[2] = this.toolkit.field_cb * this.toolkit.field_ac;
            AchievementThresholds.field_d[0] = this.toolkit.field_Fc * this.toolkit.field_cb;
            jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, AchievementThresholds.field_d, 0);
          }
          var4Lifetime1 = parameters0 & 3;
          if (var4Lifetime1 == 2) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
          } else {
            if (var4Lifetime1 != 3) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
            } else {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
            }
          }
        } else {
          if (this.waterTextures.useVolumeTextures) {
            this.toolkit.bindTexture(36, this.waterTextures.ridgedVolume);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.volumeTime, 0.0f, 0.0f, 1.0f);
            this.toolkit.setActiveTextureUnit(0, 122);
            if ((parameters0 & 64) != 0) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              var4Lifetime1 = parameters0 & 3;
              if (var4Lifetime1 == 2) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
              } else {
                if (var4Lifetime1 != 3) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                }
              }
            } else {
              AchievementThresholds.field_d[1] = this.toolkit.field_cb * this.toolkit.field_z;
              AchievementThresholds.field_d[2] = this.toolkit.field_cb * this.toolkit.field_ac;
              AchievementThresholds.field_d[0] = this.toolkit.field_Fc * this.toolkit.field_cb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, AchievementThresholds.field_d, 0);
              var4Lifetime1 = parameters0 & 3;
              if (var4Lifetime1 == 2) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
              } else {
                if (var4Lifetime1 == 3) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                }
              }
            }
          } else {
            var4Lifetime1 = 16 * (this.toolkit.animationTime % 4000) / 4000;
            this.toolkit.bindTexture(13, this.waterTextures.ridgedSlices[var4Lifetime1]);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            this.toolkit.setActiveTextureUnit(0, 122);
            if ((parameters0 & 64) != 0) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
            } else {
              AchievementThresholds.field_d[1] = this.toolkit.field_cb * this.toolkit.field_z;
              AchievementThresholds.field_d[2] = this.toolkit.field_cb * this.toolkit.field_ac;
              AchievementThresholds.field_d[0] = this.toolkit.field_Fc * this.toolkit.field_cb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, AchievementThresholds.field_d, 0);
            }
            var4Lifetime1 = parameters0 & 3;
            if (var4Lifetime1 == 2) {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
            } else {
              if (var4Lifetime1 == 3) {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
              }
            }
          }
        }
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard > -30) {
          this.volumeTime = 2.270503520965576f;
        }
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        try {
          this.toolkit.bindTexture(guard ^ 9, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
          if (guard != 35) {
            this.buildStateLists(false);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "es.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final void disable(int guard) {
        if (null == this.stateLists) {
          return;
        }
        this.stateLists.callList((byte) 121, '\001');
        this.toolkit.setActiveTextureUnit(1, 119);
        this.toolkit.bindTexture(16, (LegacyOpenGlTexture) null);
        this.toolkit.setActiveTextureUnit(0, 118);
        if (guard > -125) {
          this.refreshState(53, false);
        }
    }

    LegacyOpenGlTurbulentTextureEffect(LegacyOpenGlGraphicsToolkit owner, LegacyWaterTextureResources textures) {
        super(owner);
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
          this.waterTextures = textures;
          if (this.toolkit.supportsVertexPrograms &&
            this.toolkit.maxTextureUnits >= 2) {
            this.program = CheckboxWidget.compileAssemblyProgram(this.toolkit, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -24674);
            if (null == this.program) {
              return;
            }
            var16 = PerlinNoiseFactory.generateNoise(false, 3, 0, 4, 4096, 4, 64, 256, 0.4000000059604645f);
            var12 = var16;
            var11 = var12;
            var3 = var11;
            var23 = PerlinNoiseFactory.generateNoise(false, 3, 8, 4, 4096, 4, 64, 256, 0.4000000059604645f);
            var5 = 0;
            this.animatedNoise = new float[32768];
            for (var6 = 0; 256 > var6; var6++) {
              var24 = var16[var6];
              var25 = var23[var6];
              for (var9 = 0; 64 > var9; var9++) {
                incrementValue$0 = var5;
                var5++;
                this.animatedNoise[incrementValue$0] = (float)var24[var9] / 4096.0f;
                incrementValue$1 = var5;
                var5++;
                this.animatedNoise[incrementValue$1] = (float)var25[var9] / 4096.0f;
              }
            }
            this.buildStateLists(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("es.<init>(");
          if (owner == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (textures == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void buildStateLists(boolean guard) {
        this.stateLists = new LegacyOpenGlDisplayLists(this.toolkit, 2);
        this.stateLists.beginList(0, 4864);
        this.toolkit.setActiveTextureUnit(1, 90);
        this.toolkit.setTextureConstantArgb(0, -16777216);
        this.toolkit.setTextureCombineOperations(20685, 7681, 260);
        this.toolkit.setTextureCombineOperands(121, 0, 34166, 770);
        this.toolkit.setActiveTextureUnit(0, 96);
        jaggl.OpenGL.glBindProgramARB(34336, this.program.programId);
        jaggl.OpenGL.glEnable(34336);
        this.stateLists.endList(true);
        this.stateLists.beginList(1, 4864);
        this.toolkit.setActiveTextureUnit(1, 100);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.toolkit.setTextureCombineMode(0, guard);
        this.toolkit.setTextureCombineOperands(122, 0, 5890, 770);
        this.toolkit.setActiveTextureUnit(0, 99);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.stateLists.endList(true);
    }

    final void enable(byte guard, boolean lighting) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.stateLists == null) {
          return;
        }
        this.stateLists.callList((byte) 121, '\0');
        this.toolkit.setActiveTextureUnit(1, 115);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.toolkit.field_mc.b((byte) 57), 0);
        if (guard >= 33) {
          jaggl.OpenGL.glMatrixMode(5888);
          this.toolkit.setActiveTextureUnit(0, 115);
          if (this.lastAnimationTime == this.toolkit.animationTime) {
          } else {
            var3 = 128 * (this.toolkit.animationTime % 5000) / 5000;
            for (var4 = 0; 64 > var4; var4++) {
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.animatedNoise, var3);
              var3 += 2;
            }
            if (this.waterTextures.useVolumeTextures) {
              this.volumeTime = (float)(this.toolkit.animationTime % 4000) / 4000.0f;
            } else {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            this.lastAnimationTime = this.toolkit.animationTime;
          }
          return;
        }
    }

    static {
        loadingGraphicsText = "Loading graphics";
    }
}
