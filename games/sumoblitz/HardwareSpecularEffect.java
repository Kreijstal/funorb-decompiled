/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class HardwareSpecularEffect extends ShaderEffect {
    private CubeTexture[] specularMaps;
    static ToolkitSprite[] field_f;
    private boolean active;
    private boolean useTwoUnits;
    static String noHighscoresText;

    final void refreshState(boolean lighting, byte guard) {
        this.toolkit.a((byte) -83, lf.REPLACE, SlowBurstParticle.MODULATE);
        if (guard > -71) {
          this.specularMaps = (CubeTexture[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != 0) {
          return;
        }
        noHighscoresText = null;
    }

    final boolean isSupported(byte guard) {
        if (guard >= -8) {
          return true;
        }
        return true;
    }

    final static void e(int param0) {
        if (param0 > -9) {
          return;
        }
        LevelCompleteUpgradeScreen.b((byte) 126);
    }

    final void disable(boolean guard) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (guard) {
          this.setParameters(114, 98, -46);
        }
        if (!this.active) {
          this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
        } else {
          this.toolkit.setActiveTextureUnit(1, -109);
          this.toolkit.a((GpuTexture) null, 102);
          this.toolkit.applyTexCoordGeneration(13754, lf.DISABLED);
          this.toolkit.resetTextureTransform(0);
          if (!this.useTwoUnits) {
            this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.toolkit.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
            this.toolkit.setActiveTextureUnit(2, -117);
            this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.toolkit.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
            this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 1, 0);
            this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
            this.toolkit.a((GpuTexture) null, 110);
          } else {
            this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.toolkit.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
            this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
          }
          this.toolkit.setActiveTextureUnit(0, -126);
          this.active = false;
        }
        this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        if (guard != 34023) {
          return;
        }
        if (this.active) {
          this.toolkit.setActiveTextureUnit(1, -122);
          this.toolkit.a(this.specularMaps[-1 + parameters0], 93);
          this.toolkit.setActiveTextureUnit(0, -119);
        }
    }

    final static ResourceArchive a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
          int var6_int = 0;
          IOException var6 = null;
          Object var7 = null;
          Object var8 = null;
          CachedArchiveProvider var9 = null;
          ResourceArchive stackIn_11_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6_int = 100 % ((param1 + 29) / 42);
            var7 = null;
            if (CompactMeshGeometry.field_u.field_l != null) {
              DiskCacheDataFile.dataFile = new BufferedCacheFile(CompactMeshGeometry.field_u.field_l, 5200, 0);
              CompactMeshGeometry.field_u.field_l = null;
              var7 = new SectorCacheStore(255, DiskCacheDataFile.dataFile, new BufferedCacheFile(CompactMeshGeometry.field_u.field_d, 12000, 0), 2097152);
            }
            var8 = null;
            if (null != DiskCacheDataFile.dataFile) {
              if (null == ProgressDialog.field_O) {
                ProgressDialog.field_O = new BufferedCacheFile[CompactMeshGeometry.field_u.field_i.length];
              }
              if (ProgressDialog.field_O[param3] == null) {
                ProgressDialog.field_O[param3] = new BufferedCacheFile(CompactMeshGeometry.field_u.field_i[param3], 12000, 0);
                CompactMeshGeometry.field_u.field_i[param3] = null;
              }
              var8 = new SectorCacheStore(param3, DiskCacheDataFile.dataFile, ProgressDialog.field_O[param3], 2097152);
            }
            var9 = LegacyOpenGlSpecularEffect.field_i.archiveProvider(false, param3, (SectorCacheStore) (var7), param5, (SectorCacheStore) (var8));
            if (param4) {
              var9.enablePrefetch((byte) -81);
            }
            stackIn_11_0 = new ResourceArchive(var9, param2, param0);
            return stackIn_11_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(var6.toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        if (guard != 18834) {
          return;
        }
        try {
          this.toolkit.a(texture, 125);
          this.toolkit.h(84, combineMode);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ng.E(" + combineMode + ',' + guard + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    HardwareSpecularEffect(HardwareGraphicsToolkit owner) {
        super(owner);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.active = false;
        try {
          if (owner.field_W) {
            stackIn_5_1 = !(owner.textureUnitCount >= 3);
            this.useTwoUnits = stackIn_5_1;
            stackIn_8_0 = (!this.useTwoUnits) ? 127 : 48;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                var11 = var11 * var13;
                var12 = var12 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (1 != var16) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 != 4) {
                            var10 = -var13;
                          } else {
                            var10 = var13;
                          }
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (var10 > 0.0f) {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  } else {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.specularMaps = new CubeTexture[3];
            this.specularMaps[0] = this.toolkit.a(64, (byte) -105, var27, false);
            this.specularMaps[1] = this.toolkit.a(64, (byte) -84, var28, false);
            this.specularMaps[2] = this.toolkit.a(64, (byte) 122, var29, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("ng.<init>(");
          if (owner == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void enable(boolean lighting, int guard) {
        int var4;
        GpuTexture var5;
        AffineTransform3D var6;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.specularMaps == null) {
          this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
        } else {
          if (!lighting) {
            this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
          } else {
            this.toolkit.setActiveTextureUnit(1, -118);
            this.toolkit.applyTexCoordGeneration(guard ^ 31584, BeveledTextInputRenderer.NORMAL_MAP);
            var6 = this.toolkit.textureTransform(0);
            var6.setRotationX((byte) 79, 1024);
            this.toolkit.setTextureTransformMode(LegacyRidgedWaterNoise.TEXTURE_COUNT3, 28880);
            if (!this.useTwoUnits) {
              this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, lf.REPLACE);
              this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 0, guard ^ 20186);
              this.toolkit.setActiveTextureUnit(2, guard - 20295);
              this.toolkit.a((byte) -83, lf.REPLACE, LoginForm.ADD);
              this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 0, 0);
              this.toolkit.setColorCombineSource((byte) 102, 1, true, false, FontMetrics.PREVIOUS);
              this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
              this.toolkit.a(this.toolkit.field_D, guard - 20079);
            } else {
              this.toolkit.a((byte) -83, lf.REPLACE, LoginForm.ADD);
              this.toolkit.setColorCombineSource((byte) -66, 0, true, false, LegacyVertexAttribute.TEXTURE);
              this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
            }
            this.toolkit.setActiveTextureUnit(0, -113);
            this.active = true;
          }
        }
        if (guard != 20186) {
          var5 = (GpuTexture) null;
          this.bindTexture(105, 46, (GpuTexture) null);
        }
    }

    static {
        noHighscoresText = "No highscores";
    }
}
