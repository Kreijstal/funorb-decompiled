/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ng extends ShaderEffect {
    private CubeTexture[] field_i;
    static ToolkitSprite[] field_f;
    private boolean field_h;
    private boolean field_g;
    static String noHighscoresText;

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) -83, lf.REPLACE, SlowBurstParticle.MODULATE);
        if (param1 > -71) {
          this.field_i = (CubeTexture[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != 0) {
          return;
        }
        noHighscoresText = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
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

    final void c(boolean param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          this.a(114, 98, -46);
        }
        if (!this.field_h) {
          this.field_b.a(jq.TEXTURE, 0, true);
        } else {
          this.field_b.g(1, -109);
          this.field_b.a((GpuTexture) null, 102);
          this.field_b.applyTexCoordGeneration(13754, lf.DISABLED);
          this.field_b.l(0);
          if (!this.field_g) {
            this.field_b.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.field_b.a(jq.TEXTURE, 0, 0);
            this.field_b.g(2, -117);
            this.field_b.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.field_b.a(jq.TEXTURE, 0, 0);
            this.field_b.a(FontMetrics.PREVIOUS, 1, 0);
            this.field_b.a(jq.TEXTURE, 0, true);
            this.field_b.a((GpuTexture) null, 110);
          } else {
            this.field_b.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.field_b.a(jq.TEXTURE, 0, 0);
            this.field_b.a(jq.TEXTURE, 0, true);
          }
          this.field_b.g(0, -126);
          this.field_h = false;
        }
        this.field_b.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          return;
        }
        if (this.field_h) {
          this.field_b.g(1, -122);
          this.field_b.a(this.field_i[-1 + param2], 93);
          this.field_b.g(0, -119);
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
              bc.field_a = new BufferedCacheFile(CompactMeshGeometry.field_u.field_l, 5200, 0);
              CompactMeshGeometry.field_u.field_l = null;
              var7 = new SectorCacheStore(255, bc.field_a, new BufferedCacheFile(CompactMeshGeometry.field_u.field_d, 12000, 0), 2097152);
            }
            var8 = null;
            if (null != bc.field_a) {
              if (null == ProgressDialog.field_O) {
                ProgressDialog.field_O = new BufferedCacheFile[CompactMeshGeometry.field_u.field_i.length];
              }
              if (ProgressDialog.field_O[param3] == null) {
                ProgressDialog.field_O[param3] = new BufferedCacheFile(CompactMeshGeometry.field_u.field_i[param3], 12000, 0);
                CompactMeshGeometry.field_u.field_i[param3] = null;
              }
              var8 = new SectorCacheStore(param3, bc.field_a, ProgressDialog.field_O[param3], 2097152);
            }
            var9 = wt.field_i.archiveProvider(false, param3, (SectorCacheStore) (var7), param5, (SectorCacheStore) (var8));
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

    final void a(int param0, int param1, GpuTexture param2) {
        if (param1 != 18834) {
          return;
        }
        try {
          this.field_b.a(param2, 125);
          this.field_b.h(84, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ng(HardwareGraphicsToolkit param0) {
        super(param0);
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
        this.field_h = false;
        try {
          if (param0.field_W) {
            stackIn_5_1 = !(param0.field_cc >= 3);
            this.field_g = stackIn_5_1;
            stackIn_8_0 = (!this.field_g) ? 127 : 48;
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
            this.field_i = new CubeTexture[3];
            this.field_i[0] = this.field_b.a(64, (byte) -105, var27, false);
            this.field_i[1] = this.field_b.a(64, (byte) -84, var28, false);
            this.field_i[2] = this.field_b.a(64, (byte) 122, var29, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("ng.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        int var4;
        GpuTexture var5;
        AffineTransform3D var6;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_i == null) {
          this.field_b.a(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
        } else {
          if (!param0) {
            this.field_b.a(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
          } else {
            this.field_b.g(1, -118);
            this.field_b.applyTexCoordGeneration(param1 ^ 31584, nl.NORMAL_MAP);
            var6 = this.field_b.B(0);
            var6.setRotationX((byte) 79, 1024);
            this.field_b.a(LegacyRidgedWaterNoise.field_y, 28880);
            if (!this.field_g) {
              this.field_b.a((byte) -83, SlowBurstParticle.MODULATE, lf.REPLACE);
              this.field_b.a(FontMetrics.PREVIOUS, 0, param1 ^ 20186);
              this.field_b.g(2, param1 - 20295);
              this.field_b.a((byte) -83, lf.REPLACE, LoginForm.ADD);
              this.field_b.a(FontMetrics.PREVIOUS, 0, 0);
              this.field_b.setColorCombineSource((byte) 102, 1, true, false, FontMetrics.PREVIOUS);
              this.field_b.a(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
              this.field_b.a(this.field_b.field_D, param1 - 20079);
            } else {
              this.field_b.a((byte) -83, lf.REPLACE, LoginForm.ADD);
              this.field_b.setColorCombineSource((byte) -66, 0, true, false, jq.TEXTURE);
              this.field_b.a(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
            }
            this.field_b.g(0, -113);
            this.field_h = true;
          }
        }
        if (param1 != 20186) {
          var5 = (GpuTexture) null;
          this.a(105, 46, (GpuTexture) null);
        }
    }

    static {
        noHighscoresText = "No highscores";
    }
}
