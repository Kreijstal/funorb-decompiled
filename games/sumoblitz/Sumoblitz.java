/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Sumoblitz extends GameClientShell {
    static int[] field_G;
    static ToolkitSprite[] field_J;
    private boolean field_F;
    static int field_H;
    static int field_I;
    private Sprite field_K;
    public static boolean field_L;

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_L ? 1 : 0;
        try {
          ProxySocketConnector.field_e = DropTargetWidget.field_z;
          if (255 != param2) {
            if (param2 >= 100 &&
              param2 <= 105) {
              eg.field_l = qr.a(args, 8192);
              if (var5 != 0) {
                eg.field_l = au.a(40, param3, param2);
                stackIn_20_0 = !(13 <= lq.field_d);
                eg.field_l = LegacyOpenGlEffect.a(stackIn_20_0, 8192);
              }
            } else {
              eg.field_l = au.a(40, param3, param2);
              if (var5 != 0) {
                stackIn_20_0 = !(13 <= lq.field_d);
                eg.field_l = LegacyOpenGlEffect.a(stackIn_20_0, 8192);
              }
            }
          } else {
            stackIn_20_0 = !(13 <= lq.field_d);
            eg.field_l = LegacyOpenGlEffect.a(stackIn_20_0, 8192);
          }
          if (param1 != 13) {
            field_H = -63;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("Sumoblitz.SA(");
          if (args == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -15254) {
            this.initializeGameArchives(36);
          }
          oi.a(-27864);
          if (CompactMeshGeometry.field_o != null) {
            LegacyOpenGlNormalMapGenerator.c((byte) 81);
          }
          MessageDialog.m(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.L(" + param0 + ')');
        }
    }

    private final void advanceScreenTransition(byte param0) {
        int fieldTemp$0 = 0;
        GameplaySession stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_L ? 1 : 0;
        try {
          if (2 <= Bzip2State.field_j &&
            hw.field_b[41]) {
            LegacyOpenGlSpriteTexture.field_w = true;
            kh.field_e = 16777215;
          }
          var2_int = -73 / ((8 - param0) / 40);
          if (null != pl.field_v.first(-98)) {
            fieldTemp$0 = qn.field_g + 1;
            qn.field_g = qn.field_g + 1;
            if (fieldTemp$0 == 256) {
              qn.field_g = 0;
              pl.field_v.removeFirst(9);
            }
          }
          if (0 != ra.field_e) {
            if (ra.field_e == 1) {
              eh.field_a = eh.field_a + 1;
              if (eh.field_a != 30) {
                return;
              }
              if (!so.a((byte) -58)) {
                IntIndexHashTable.a(0);
                if (var3 != 0) {
                  wn.a(true);
                }
              } else {
                wn.a(true);
              }
              ra.field_e = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (2 == ra.field_e) {
              boolean decompiledSharedTail0 = !(vs.b((byte) 9));
              if (!decompiledSharedTail0) {
                nj.field_b = qw.field_b;
                decompiledSharedTail0 = (var3 != 0);
              }
              if (decompiledSharedTail0) {
                nq.field_g = ew.a((byte) 113, 4);
                if (ph.gameplaySession != null) {
                  ph.gameplaySession.submitSessionStatistics(-119);
                }
                nj.field_b = SecondaryNodeQueue.field_d;
                if (-2 == nj.field_b) {
                  nj.field_b = 0;
                  vb.a((byte) 122, false);
                }
              }
              ra.field_e = 3;
              OpenGlCubeTexture.field_k = nj.field_b;
              eh.field_a = 29;
              if (var3 == 0) {
                return;
              }
            }
            eh.field_a = eh.field_a - 1;
            if (eh.field_a != 0) {
              return;
            }
            ra.field_e = 0;
            if (var3 == 0) {
              return;
            }
          }
          stackIn_58_0 = ph.gameplaySession;
          stackIn_59_1 = (-1 == nj.field_b);
          ((GameplaySession) (Object) stackIn_58_0).update(stackIn_59_1, (byte) -88);
          if (~OpenGlCubeTexture.field_k != ~nj.field_b) {
            eh.field_a = eh.field_a + 1;
            if (eh.field_a != 30) {
              return;
            }
            if (nj.field_b == 2) {
              HardwareTextureCache.field_f = null;
            }
            eh.field_a = 0;
            nj.field_b = OpenGlCubeTexture.field_k;
            if (var3 == 0) {
              return;
            }
          }
          if (nj.field_b != -1) {
            LegacyOpenGlEffectManager.field_g[nj.field_b].update(-18556);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.TA(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        MidiPcmStream var2 = null;
        MusicCrossfadeStream var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != 28196) {
            Sumoblitz.playEntityCollisionSound(59, -122, (byte) 42);
          }
          this.a(100, 3, 1, 10, 2, 0, true);
          var2 = new MidiPcmStream();
          var2.setInitialProgram(177, 128, 9);
          var3 = new MusicCrossfadeStream(var2, new MidiPcmStream());
          SpriteMask.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) ((Object) qn.field_f));
          BufferedSocket.field_f = false;
          qc.field_e = var2;
          this.a(true, true, (byte) 60, true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.C(" + param0 + ')');
        }
    }

    final void renderFrame(int param0) {
        try {
          boolean stackIn_50_0 = false;
          Throwable decompiledCaughtException = null;
          java.awt.Canvas var2 = null;
          RuntimeException var2_ref = null;
          GraphicsToolkit var3 = null;
          int var4_int = 0;
          ge var4 = null;
          int var5_int = 0;
          Exception var5 = null;
          int var6 = 0;
          int var7 = 0;
          String var8_ref_String = null;
          int var8 = 0;
          pm var9 = null;
          int var10 = 0;
          int var4_intLifetime1;
          int var5_intLifetime1;
          int var5_intLifetime2;
          int var6Lifetime1;
          int var6Lifetime2;
          int var7Lifetime1;
          int var8Lifetime1;
          int var5_intLifetime1Lifetime1;
          int var6Lifetime1Lifetime1;
          int var7Lifetime1Lifetime1;
          var10 = field_L ? 1 : 0;
          try {
            var2 = hk.b(-97);
            SoftwareRasterizer.clear();
            if (FadingWidget.g(param0 ^ -99)) {
              LegacyOpenGlGraphicsHeap.a((byte) 122, var2, WhirlpoolDigest.a(param0 ^ 7));
              return;
            }
            if (!OpenGlTexture2D.field_j) {
              SoftwareRenderBuffer.a(-62, var2);
              return;
            }
            if (!ClientException.a(param0 ^ 0)) {
              NameSuggestionsPanel.a(param0 ^ 20, 100.0f, fl.waitingForExtraDataText);
              SoftwareRenderBuffer.a(-88, var2);
              return;
            }
            if (nq.field_h.a(false) &&
              !this.h((byte) -124)) {
              return;
            }
            var3 = nq.field_h.a(-115);
            var3.clear(0);
            ph.gameplaySession.render(param0 ^ 120, var3, false);
            if (OpenGlCubeTexture.field_k == nj.field_b) {
              if (-1 != nj.field_b) {
                LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var3, -2355);
                if (var10 != 0) {
                  var4_int = 255 * eh.field_a / 30;
                  if (-1 != nj.field_b) {
                    LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var4_int + 255, var3, -2355);
                  }
                  if (-1 != OpenGlCubeTexture.field_k) {
                    LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var4_int, var3, -2355);
                  }
                }
              }
            } else {
              var4_int = 255 * eh.field_a / 30;
              if (-1 != nj.field_b) {
                LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var4_int + 255, var3, -2355);
              }
              if (-1 != OpenGlCubeTexture.field_k) {
                LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var4_int, var3, -2355);
              }
            }
            if (so.a((byte) 103)) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
              OpenGlUnderwaterEffect.d((byte) -7);
            }
            if (param0 != ra.field_e) {
              var4_intLifetime1 = 256 * eh.field_a / 30;
              if (var4_intLifetime1 > 0) {
                SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var4_intLifetime1);
              }
            }
            if (sj.a(param0 - 85) &&
              !so.a((byte) -75)) {
              if (CompactMeshGeometry.field_o != null) {
                stackIn_50_0 = true;
              } else {
                stackIn_50_0 = ii.field_a;
              }
              SoftwareTransform3D.a(stackIn_50_0, 25);
            }
            if (Bzip2State.field_j >= 2 &&
              SceneryParticle.field_v) {
              LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -81, 1);
            }
            var4 = (ge) (pl.field_v.first(param0 - 121));
            if (null != var4) {
              var6 = qn.field_g;
              if (var6 >= 64) {
                if (var6 <= 192) {
                  var5_int = 255;
                  if (var10 != 0) {
                    var5_int = (-var6 + 192) * 255 / 64;
                    var5_int = 255 * var6 / 64;
                  }
                } else {
                  var5_int = (-var6 + 192) * 255 / 64;
                  if (var10 != 0) {
                    var5_int = 255 * var6 / 64;
                  }
                }
              } else {
                var5_int = 255 * var6 / 64;
              }
              var7 = 45;
              boolean decompiledSharedTail0 = !(var4.field_m < 0);
              if (!decompiledSharedTail0) {
                var8_ref_String = SpriteMask.arcadeModeUnlockedText;
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                var8_ref_String = ArchiveProvider.achievementNames[var4.field_m];
                if (qw.field_a.length > var4.field_m) {
                  var7 += 65;
                  qw.field_a[var4.field_m].drawScaled(-32 + ArchiveCatalog.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << 24, 1);
                }
              }
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24 | 16777215, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
            }
            boolean decompiledFrameRemainder0 = true;
            if (oj.a(false)) {
              var5_intLifetime1 = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
              var6Lifetime1 = 0 * (wq.field_b - SoftwareRasterizer.height) / 2;
              cf.a(var5_intLifetime1, var6Lifetime1, 59);
              SoftwareTransform3D.a(false, (byte) -122);
              this.field_F = true;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!sj.a(-44)) {
                if (!ws.b((byte) 52)) {
                  this.field_F = false;
                  if (var10 != 0) {
                    var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.width + gi.field_h) / 2;
                    var6Lifetime1Lifetime1 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                    VertexAttribute.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                    SoftwareTransform3D.a(false, param0 ^ 121);
                    this.field_F = true;
                  }
                }
              } else {
                var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.width + gi.field_h) / 2;
                var6Lifetime1Lifetime1 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                VertexAttribute.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                SoftwareTransform3D.a(false, param0 ^ 121);
                this.field_F = true;
              }
            }
            if (this.field_F) {
              var5_intLifetime2 = SoftwareRasterizer.width;
              var6Lifetime2 = SoftwareRasterizer.height;
              if (this.field_K != null) {
                var6Lifetime2 = this.field_K.field_u;
                var5_intLifetime2 = this.field_K.field_x;
              }
              var7Lifetime1 = (-var5_intLifetime2 + gi.field_h) / 2;
              var8 = (wq.field_b - var6Lifetime2) / 2;
              if (oj.a(false) &&
                this.field_K != null) {
                var7Lifetime1 = GraphicsToolkitManager.c(param0 ^ -10517);
                var8 = fd.b(3878);
              }
              var9 = wq.a(var3, (byte) 18);
              var9.a((byte) 111, var8, var8 + var6Lifetime2, var7Lifetime1, var7Lifetime1 + var5_intLifetime2);
              var7Lifetime1Lifetime1 = (-SoftwareRasterizer.width + gi.field_h) / 2;
              var8Lifetime1 = (wq.field_b - SoftwareRasterizer.height) / 2;
              var3.drawPixels(var7Lifetime1Lifetime1, var8Lifetime1, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
              var9.a(param0 + 29709);
            }
            try {
              var3.present(true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              var5.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.I(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void initializeGameArchives(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != vf.field_a) {
            ArchiveCatalog.a(vf.field_a, -5);
            vf.field_a = null;
            VertexAttribute.b(param0 - 21961);
          }
          if (param0 != 21961) {
            this.advanceScreenTransition((byte) -69);
          }
          GzipDecompressor.field_a = true;
          LegacyOpenGlRenderbuffer.field_v = wd.a(4, (byte) 125);
          dq.field_Z = wd.a(5, (byte) 125);
          SecondaryNodeDeque.field_d = wd.a(6, (byte) 125);
          er.field_c = wd.a(7, (byte) 125);
          gg.field_r = wd.a(8, (byte) 125);
          ForceFieldRingEffect.field_s = wd.a(9, (byte) 125);
          GraphicsToolkitManager.field_d = wd.a(12, (byte) 125);
          LegacyOpenGlEffectManager.field_b = new Random(wq.a(-52));
          if (null == nq.field_h) {
            nq.field_h = new GraphicsToolkitManager(11, -1, (TextureProvider) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.QA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_J = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_G = null;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "Sumoblitz.UA(" + param0 + ')');
        }
    }

    final void updateGame(int param0) {
        boolean discarded$0 = false;
        boolean stackIn_11_1 = false;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        hg var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          NetworkResourceRequest.e((byte) 76);
          if (CompactMeshGeometry.field_o != null &&
            CompactMeshGeometry.field_o.field_a) {
            LegacyOpenGlNormalMapGenerator.c((byte) 49);
            qw.a((byte) 35);
          }
          stackIn_11_1 = (null != CompactMeshGeometry.field_o);
          this.b(stackIn_11_1, -103);
          if (RidgedNoise3D.field_u) {
            this.initializeGameArchives(21961);
            RidgedNoise3D.field_u = false;
          }
          if (FadingWidget.g(-42)) {
            this.m(106);
            if (FadingWidget.g(-33)) {
              if (ScrollViewport.g(-1)) {
                discarded$0 = this.a(false, true);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = !(OpenGlTexture2D.field_j);
          if (!decompiledSharedTail0) {
            if (!ClientException.a(0)) {
              ou.d((byte) -112);
              decompiledFrameRemainder0 = !(!ClientException.a(0));
              if (decompiledFrameRemainder0) {
                oq.a(-24233);
                LegacyOpenGlGraphicsHeap.c(0);
                if (5 == nj.field_b &&
                  0 == OpenGlTransparentWaterEffect.field_e) {
                  nj.field_b = 2;
                  StrongCacheReference.switchMenuScreen(-7753, false, 2);
                }
                decompiledFrameRemainder0 = !(!so.a((byte) 119));
                if (decompiledFrameRemainder0) {
                  vb.a((byte) -111, true);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (so.a((byte) 107)) {
                if (0 == ra.field_e) {
                  var2_int = kt.a(-38);
                  switch (var2_int) {
                    case 2:
                      LegacyOpenGlNormalMapGenerator.c((byte) 71);
                      break;
                    case 3:
                      vb.a((byte) -21, true);
                      break;
                    case 4:
                      wn.a(true);
                      break;
                    default:
                      break;
                  }
                  if (!so.a((byte) 109)) {
                    LegacyOpenGlEffectManager.field_g[nj.field_b].resetSelection(-8628, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.advanceScreenTransition((byte) 96);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!sj.a(-123)) {
                  this.advanceScreenTransition((byte) -94);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_85_1 = -1;
                  stackIn_86_2 = (CompactMeshGeometry.field_o != null);
                  var2_int = this.a(stackIn_85_1, stackIn_86_2);
                  if (1 == var2_int ||
                    var2_int == 2) {
                    if (null != CompactMeshGeometry.field_o) {
                      LegacyOpenGlNormalMapGenerator.c((byte) 49);
                    }
                    if (2 == var2_int) {
                      jl.a(ra.c(2), false);
                    }
                  }
                  decompiledSharedTail0 = (var4 != 0);
                }
              }
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledSharedTail0)) {
            ModalDialog.a((byte) 55, OpenGlUnderwaterEffect.field_r);
            if (this.a(true, true)) {
              OpenGlTexture2D.field_j = true;
            }
          }
          var2_int = 35 % ((37 - param0) / 61);
          if (!vs.b((byte) 9)) {
            do {
              var3_ref_hg = (hg) (OpenGlUnderwaterEffect.field_q.removeFirst(9));
              if (var3_ref_hg == null) {
                if (var4 == 0) {
                  break;
                }
              } else {
                an.a(4, (byte) 30, var3_ref_hg);
              }
            } while (var4 == 0);
          }
          do {
            if (!vs.a(RasterBuffer.field_e, -126)) {
              MessageDialog.a(0, 0);
              break;
            }
            this.q(9289);
          } while (var4 == 0);
          if (FixedPointPerlinNoise3D.a(-23517)) {
            var3 = this.b(true);
            if (var3 == 2) {
              ScrollViewport.a((byte) 70);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.D(" + param0 + ')');
        }
    }

    private final boolean h(byte param0) {
        GraphicsToolkit var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            field_H = -36;
          }
          var2 = nq.field_h.a(-125);
          if (var2 == null) {
            return false;
          }
          if (var2.c()) {
            OpenGlTransparentWaterEffect.field_k = false;
            ul.field_f = 0;
            if (field_L) {
              ul.field_f = 1;
              OpenGlTransparentWaterEffect.field_k = true;
            }
          } else {
            ul.field_f = 1;
            OpenGlTransparentWaterEffect.field_k = true;
          }
          er.a(false);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.RA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, boolean param1) {
        try {
          boolean discarded$0 = false;
          GraphicsToolkitManager stackIn_95_0 = null;
          boolean stackIn_96_1 = false;
          boolean stackIn_134_0 = false;
          boolean stackIn_249_0 = false;
          boolean stackIn_276_0 = false;
          boolean stackIn_363_0 = false;
          GraphicsToolkitManager stackIn_450_0 = null;
          boolean stackIn_451_1 = false;
          boolean stackIn_492_0 = false;
          boolean stackIn_606_0 = false;
          Throwable decompiledCaughtException = null;
          java.awt.Canvas var3 = null;
          int var3_int = 0;
          RuntimeException var3_ref = null;
          GraphicsToolkit var4 = null;
          int var5_int = 0;
          ge var5 = null;
          int var6_int = 0;
          Exception var6 = null;
          int var7 = 0;
          int var8 = 0;
          String var9_ref_String = null;
          int var9 = 0;
          pm var10 = null;
          int var11 = 0;
          var11 = field_L ? 1 : 0;
          try {
            DroneChargeParticle.initializeMenuLabels(-69);
            if (null != SecondaryNodeDeque.field_d) {
              if (pi.field_c.loadIndex((byte) 127) &&
                pi.field_c.tryLoadNamedGroup("basic", 100)) {
                if (!pi.field_c.tryLoadNamedGroup("arialbold14", 100)) {
                  NameSuggestionsPanel.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ToolkitRasterBuffer.waitingForFontsText, true, ow.loadingFontsText));
                  return false;
                }
                if (vb.field_J.loadIndex((byte) 127) &&
                  vb.field_J.tryLoadNamedGroup("arialbold14", 100)) {
                  if (!pi.field_c.tryLoadNamedGroup("arial13", 100)) {
                    NameSuggestionsPanel.a(20, 4.0f, pt.a("arial13", pi.field_c, ToolkitRasterBuffer.waitingForFontsText, true, ow.loadingFontsText));
                    return false;
                  }
                  if (vb.field_J.loadIndex((byte) 127) &&
                    vb.field_J.tryLoadNamedGroup("arial13", 100)) {
                    if (SecondaryNodeDeque.field_d.loadIndex((byte) 127) &&
                      SecondaryNodeDeque.field_d.tryLoadAllGroups(true)) {
                      if (er.field_c.loadIndex((byte) 127) &&
                        er.field_c.tryLoadAllGroups(param1)) {
                        if (gg.field_r.loadIndex((byte) 127) &&
                          gg.field_r.tryLoadAllGroups(param1)) {
                          if (ForceFieldRingEffect.field_s.loadIndex((byte) 127) &&
                            ForceFieldRingEffect.field_s.tryLoadAllGroups(true)) {
                            if (LegacyOpenGlRenderbuffer.field_v.loadIndex((byte) 127) &&
                              LegacyOpenGlRenderbuffer.field_v.tryLoadAllGroups(true)) {
                              if (dq.field_Z.loadIndex((byte) 127) &&
                                dq.field_Z.tryLoadAllGroups(true)) {
                                if (GraphicsToolkitManager.field_d.loadIndex((byte) 127) &&
                                  GraphicsToolkitManager.field_d.tryLoadAllGroups(true)) {
                                  boolean decompiledFrameRemainder6 = true;
                                  NameSuggestionsPanel.a(20, 65.0f, hv.unpackingSoundEffectsText);
                                  var3 = hk.b(-22);
                                  SoftwareRasterizer.clear();
                                  if (FadingWidget.g(-61)) {
                                    LegacyOpenGlGraphicsHeap.a((byte) 85, var3, WhirlpoolDigest.a(7));
                                    decompiledFrameRemainder6 = (var11 != 0);
                                  }
                                  if (decompiledFrameRemainder6) {
                                    if (!OpenGlTexture2D.field_j) {
                                      SoftwareRenderBuffer.a(-117, var3);
                                      decompiledFrameRemainder6 = (var11 != 0);
                                    }
                                    if (decompiledFrameRemainder6) {
                                      if (!ClientException.a(0)) {
                                        NameSuggestionsPanel.a(20, 100.0f, fl.waitingForExtraDataText);
                                        SoftwareRenderBuffer.a(-117, var3);
                                        decompiledFrameRemainder6 = (var11 != 0);
                                      }
                                      if (decompiledFrameRemainder6) {
                                        stackIn_95_0 = nq.field_h;
                                        stackIn_96_1 = !(param1);
                                        if (!((GraphicsToolkitManager) (Object) stackIn_95_0).a(stackIn_96_1) ||
                                          this.h((byte) -105)) {
                                          var4 = nq.field_h.a(-97);
                                          var4.clear(0);
                                          ph.gameplaySession.render(124, var4, false);
                                          if (~OpenGlCubeTexture.field_k == ~nj.field_b) {
                                            if (-1 != nj.field_b) {
                                              LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var4, -2355);
                                              if (var11 != 0) {
                                                var5_int = 255 * eh.field_a / 30;
                                                if (-1 != nj.field_b) {
                                                  LegacyOpenGlEffectManager.field_g[nj.field_b].render(255 - var5_int, var4, -2355);
                                                }
                                                if (OpenGlCubeTexture.field_k != -1) {
                                                  LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                                                }
                                              }
                                            }
                                          } else {
                                            var5_int = 255 * eh.field_a / 30;
                                            if (-1 != nj.field_b) {
                                              LegacyOpenGlEffectManager.field_g[nj.field_b].render(255 - var5_int, var4, -2355);
                                            }
                                            if (OpenGlCubeTexture.field_k != -1) {
                                              LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                                            }
                                          }
                                          if (so.a((byte) 124)) {
                                            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                                            OpenGlUnderwaterEffect.d((byte) -7);
                                          }
                                          if (0 != ra.field_e) {
                                            var5_int = eh.field_a * 256 / 30;
                                            if (var5_int > 0) {
                                              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                                            }
                                          }
                                          if (sj.a(-67) &&
                                            !so.a((byte) 115)) {
                                            if (null != CompactMeshGeometry.field_o) {
                                              stackIn_134_0 = true;
                                            } else {
                                              stackIn_134_0 = ii.field_a;
                                            }
                                            SoftwareTransform3D.a(stackIn_134_0, 25);
                                          }
                                          if (Bzip2State.field_j >= 2 &&
                                            SceneryParticle.field_v) {
                                            LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -103, 1);
                                          }
                                          var5 = (ge) (pl.field_v.first(82));
                                          if (null != var5) {
                                            var7 = qn.field_g;
                                            if (var7 < 64) {
                                              var6_int = 255 * var7 / 64;
                                              if (var11 != 0) {
                                                if (var7 <= 192) {
                                                  var6_int = 255;
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                } else {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              }
                                            } else {
                                              if (var7 <= 192) {
                                                var6_int = 255;
                                                if (var11 != 0) {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              } else {
                                                var6_int = (-(255 * var7) + 48960) / 64;
                                              }
                                            }
                                            var8 = 45;
                                            if (0 <= var5.field_m) {
                                              var9_ref_String = ArchiveProvider.achievementNames[var5.field_m];
                                              if (!(qw.field_a.length <= var5.field_m)) {
                                                qw.field_a[var5.field_m].drawScaled(-32 + (85 + ArchiveCatalog.field_c - 180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                var8 += 65;
                                                if (var11 != 0) {
                                                  var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                                                }
                                              }
                                            } else {
                                              var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                                            }
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                          }
                                          boolean decompiledSharedTail8 = !(oj.a(false));
                                          if (!decompiledSharedTail8) {
                                            var6_int = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
                                            var7 = (-SoftwareRasterizer.height + wq.field_b) * 0 / 2;
                                            cf.a(var6_int, var7, 76);
                                            SoftwareTransform3D.a(false, (byte) -122);
                                            this.field_F = true;
                                            decompiledSharedTail8 = (var11 != 0);
                                          }
                                          if (decompiledSharedTail8) {
                                            if (sj.a(-126)) {
                                              var6_int = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
                                              var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                                              VertexAttribute.a(var6_int, -45, var7);
                                              SoftwareTransform3D.a(false, -66);
                                              this.field_F = true;
                                              if (var11 != 0 &&
                                                !ws.b((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            } else {
                                              if (!ws.b((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            }
                                          }
                                          if (this.field_F) {
                                            var6_int = SoftwareRasterizer.width;
                                            var7 = SoftwareRasterizer.height;
                                            if (this.field_K != null) {
                                              var6_int = this.field_K.field_x;
                                              var7 = this.field_K.field_u;
                                            }
                                            var8 = (-var6_int + gi.field_h) / 2;
                                            var9 = (-var7 + wq.field_b) / 2;
                                            if (oj.a(false) &&
                                              this.field_K != null) {
                                              var8 = GraphicsToolkitManager.c(-10517);
                                              var9 = fd.b(3878);
                                            }
                                            var10 = wq.a(var4, (byte) 126);
                                            var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                            var9 = (-SoftwareRasterizer.height + wq.field_b) / 2;
                                            var8 = (-SoftwareRasterizer.width + gi.field_h) / 2;
                                            var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                                            var10.a(29709);
                                          }
                                          try {
                                            var4.present(true);
                                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                                            decompiledCaughtException = decompiledCaughtParameter0;
                                            var6 = (Exception) (Object) decompiledCaughtException;
                                            var6.printStackTrace();
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (!param0) {
                                    return false;
                                  }
                                  eb.field_b = new SoundCache(SecondaryNodeDeque.field_d, er.field_c);
                                  TurbulenceNoise3D.loadGameSoundEffects((byte) -62, SecondaryNodeDeque.field_d);
                                  oq.a(-24233);
                                  SecondaryNodeDeque.field_d = null;
                                  VertexAttribute.b(0);
                                  return false;
                                }
                                NameSuggestionsPanel.a(20, 60.0f, ProxySocketConnector.a(ArenaPad.waitingForLevelsText, (byte) 85, 0, GraphicsToolkitManager.field_d, LegacyOpenGlNormalMapGenerator.loadingLevelsText));
                                return false;
                              }
                              NameSuggestionsPanel.a(20, 55.0f, pt.a("", dq.field_Z, ToolkitRasterBuffer.waitingForFontsText, true, ow.loadingFontsText));
                              return false;
                            }
                            NameSuggestionsPanel.a(20, 45.0f, pt.a("", LegacyOpenGlRenderbuffer.field_v, ProgressDialog.waitingForGraphicsText, true, es.loadingGraphicsText));
                            return false;
                          }
                          NameSuggestionsPanel.a(20, 40.0f, pt.a("", ForceFieldRingEffect.field_s, ve.waitingForMusicText, true, MessageDialog.loadingMusicText));
                          return false;
                        }
                        NameSuggestionsPanel.a(20, 30.0f, ProxySocketConnector.a(jf.waitingForInstrumentsText, (byte) 85, 0, gg.field_r, ArchiveIndex.loadingInstrumentsText));
                        return false;
                      }
                      NameSuggestionsPanel.a(20, 20.0f, pt.a("", er.field_c, GameClientShell.waitingForSoundEffectsText, true, VertexLayout.loadingSoundEffectsText));
                      return false;
                    }
                    NameSuggestionsPanel.a(20, 10.0f, pt.a("", SecondaryNodeDeque.field_d, GameClientShell.waitingForSoundEffectsText, true, VertexLayout.loadingSoundEffectsText));
                    return false;
                  }
                  NameSuggestionsPanel.a(20, 5.0f, pt.a("arial13", vb.field_J, ToolkitRasterBuffer.waitingForFontsText, true, ow.loadingFontsText));
                  return false;
                }
                NameSuggestionsPanel.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ToolkitRasterBuffer.waitingForFontsText, true, ow.loadingFontsText));
                return false;
              }
              NameSuggestionsPanel.a(20, 3.0f, pt.a("basic", pi.field_c, ProgressDialog.waitingForGraphicsText, true, es.loadingGraphicsText));
              return false;
            }
            if (null != er.field_c) {
              boolean decompiledFrameRemainder5 = true;
              NameSuggestionsPanel.a(20, 70.0f, hv.unpackingSoundEffectsText);
              var3 = hk.b(-103);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-96)) {
                LegacyOpenGlGraphicsHeap.a((byte) -45, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder5 = (var11 != 0);
              }
              if (decompiledFrameRemainder5) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-121, var3);
                  decompiledFrameRemainder5 = (var11 != 0);
                }
                if (decompiledFrameRemainder5) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.a(20, 100.0f, fl.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-68, var3);
                    decompiledFrameRemainder5 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder5) && (!nq.field_h.a(false) ||
                    this.h((byte) -99))) {
                    var4 = nq.field_h.a(-121);
                    var4.clear(0);
                    ph.gameplaySession.render(123, var4, false);
                    boolean decompiledSharedTail7 = (~OpenGlCubeTexture.field_k == ~nj.field_b);
                    if (!decompiledSharedTail7) {
                      var5_int = eh.field_a * 255 / 30;
                      if (nj.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var5_int + 255, var4, -2355);
                      }
                      if (OpenGlCubeTexture.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                      }
                      decompiledSharedTail7 = (var11 != 0);
                    }
                    if ((decompiledSharedTail7) &&
                      (nj.field_b != -1)) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var4, -2355);
                    }
                    if (so.a((byte) 118)) {
                      SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                      OpenGlUnderwaterEffect.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (var5_int > 0) {
                        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                      }
                    }
                    if (sj.a(-126) &&
                      !so.a((byte) 110)) {
                      if (CompactMeshGeometry.field_o != null) {
                        stackIn_249_0 = true;
                      } else {
                        stackIn_249_0 = ii.field_a;
                      }
                      SoftwareTransform3D.a(stackIn_249_0, 64);
                    }
                    if (2 <= Bzip2State.field_j &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -98, 1);
                    }
                    var5 = (ge) (pl.field_v.first(-100));
                    if (var5 != null) {
                      var7 = qn.field_g;
                      if (64 <= var7) {
                        if (192 >= var7) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - 255 * var7) / 64;
                            var6_int = var7 * 255 / 64;
                          }
                        } else {
                          var6_int = (48960 - 255 * var7) / 64;
                          if (var11 != 0) {
                            var6_int = var7 * 255 / 64;
                          }
                        }
                      } else {
                        var6_int = var7 * 255 / 64;
                      }
                      var8 = 45;
                      if (var5.field_m >= 0) {
                        var9_ref_String = ArchiveProvider.achievementNames[var5.field_m];
                        if (!(var5.field_m >= qw.field_a.length)) {
                          var8 += 65;
                          qw.field_a[var5.field_m].drawScaled(-180 + ArchiveCatalog.field_c + 85 - 32, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          if (var11 != 0) {
                            var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                          }
                        }
                      } else {
                        var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                      }
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    }
                    stackIn_276_0 = !param1;
                    boolean decompiledFrameRemainder4 = true;
                    if (oj.a(stackIn_276_0)) {
                      var6_int = 0 * (-SoftwareRasterizer.width + gi.field_h) / 2;
                      var7 = 0 * (-SoftwareRasterizer.height + wq.field_b) / 2;
                      cf.a(var6_int, var7, 126);
                      SoftwareTransform3D.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder4 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      if (!sj.a(-124)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
                            var7 = (-SoftwareRasterizer.height + wq.field_b) * 0 / 2;
                            VertexAttribute.a(var6_int, -66, var7);
                            SoftwareTransform3D.a(false, -124);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
                        var7 = (-SoftwareRasterizer.height + wq.field_b) * 0 / 2;
                        VertexAttribute.a(var6_int, -66, var7);
                        SoftwareTransform3D.a(false, -124);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.width;
                      var7 = SoftwareRasterizer.height;
                      if (null != this.field_K) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (-var6_int + gi.field_h) / 2;
                      var9 = (-var7 + wq.field_b) / 2;
                      if (oj.a(false) &&
                        null != this.field_K) {
                        var8 = GraphicsToolkitManager.c(-10517);
                        var9 = fd.b(3878);
                      }
                      var10 = wq.a(var4, (byte) 70);
                      var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-SoftwareRasterizer.height + wq.field_b) / 2;
                      var8 = (-SoftwareRasterizer.width + gi.field_h) / 2;
                      var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                      var10.a(29709);
                    }
                    try {
                      var4.present(true);
                    } catch (java.lang.Exception decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              dw.a(er.field_c, 105);
              er.field_c = null;
              VertexAttribute.b(0);
              return false;
            }
            if (null != ForceFieldRingEffect.field_s) {
              boolean decompiledFrameRemainder3 = true;
              NameSuggestionsPanel.a(20, 75.0f, ClientException.unpackingMusicText);
              var3 = hk.b(-103);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-98)) {
                LegacyOpenGlGraphicsHeap.a((byte) 95, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder3 = (var11 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-73, var3);
                  decompiledFrameRemainder3 = (var11 != 0);
                }
                if (decompiledFrameRemainder3) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.a(20, 100.0f, fl.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-111, var3);
                    decompiledFrameRemainder3 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder3) && (!nq.field_h.a(false) ||
                    this.h((byte) -48) ||
                    var11 != 0)) {
                    var4 = nq.field_h.a(-128);
                    var4.clear(0);
                    ph.gameplaySession.render(124, var4, false);
                    boolean decompiledSharedTail6 = (~nj.field_b == ~OpenGlCubeTexture.field_k);
                    if (!decompiledSharedTail6) {
                      var5_int = 255 * eh.field_a / 30;
                      if (nj.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var5_int + 255, var4, -2355);
                      }
                      if (OpenGlCubeTexture.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                      }
                      decompiledSharedTail6 = (var11 != 0);
                    }
                    if ((decompiledSharedTail6) &&
                      (-1 != nj.field_b)) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var4, -2355);
                    }
                    if (so.a((byte) 109)) {
                      SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                      OpenGlUnderwaterEffect.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (0 < var5_int) {
                        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                      }
                    }
                    if (sj.a(-28) &&
                      !so.a((byte) -55)) {
                      if (CompactMeshGeometry.field_o == null) {
                        stackIn_363_0 = ii.field_a;
                      } else {
                        stackIn_363_0 = true;
                      }
                      SoftwareTransform3D.a(stackIn_363_0, -122);
                    }
                    if (Bzip2State.field_j >= 2 &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -122, 1);
                    }
                    var5 = (ge) (pl.field_v.first(-85));
                    if (null != var5) {
                      var7 = qn.field_g;
                      if (64 <= var7) {
                        if (var7 <= 192) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - var7 * 255) / 64;
                            var6_int = 255 * var7 / 64;
                          }
                        } else {
                          var6_int = (48960 - var7 * 255) / 64;
                          if (var11 != 0) {
                            var6_int = 255 * var7 / 64;
                          }
                        }
                      } else {
                        var6_int = 255 * var7 / 64;
                      }
                      var8 = 45;
                      boolean decompiledSharedTail5 = !(var5.field_m < 0);
                      if (!decompiledSharedTail5) {
                        var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                        decompiledSharedTail5 = (var11 != 0);
                      }
                      if (decompiledSharedTail5) {
                        var9_ref_String = ArchiveProvider.achievementNames[var5.field_m];
                        if (qw.field_a.length > var5.field_m) {
                          var8 += 65;
                          qw.field_a[var5.field_m].drawScaled(ArchiveCatalog.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        }
                      }
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 - 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (oj.a(false)) {
                      var6_int = 0 * (gi.field_h - SoftwareRasterizer.width) / 2;
                      var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                      cf.a(var6_int, var7, 86);
                      SoftwareTransform3D.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder2 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder2) {
                      if (!sj.a(-63)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = 0 * (gi.field_h - SoftwareRasterizer.width) / 2;
                            var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                            VertexAttribute.a(var6_int, -82, var7);
                            SoftwareTransform3D.a(false, -100);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = 0 * (gi.field_h - SoftwareRasterizer.width) / 2;
                        var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                        VertexAttribute.a(var6_int, -82, var7);
                        SoftwareTransform3D.a(false, -100);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.width;
                      var7 = SoftwareRasterizer.height;
                      if (this.field_K != null) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (gi.field_h - var6_int) / 2;
                      var9 = (-var7 + wq.field_b) / 2;
                      if (oj.a(false) &&
                        this.field_K != null) {
                        var8 = GraphicsToolkitManager.c(-10517);
                        var9 = fd.b(3878);
                      }
                      var10 = wq.a(var4, (byte) 28);
                      var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                      var9 = (wq.field_b - SoftwareRasterizer.height) / 2;
                      var8 = (-SoftwareRasterizer.width + gi.field_h) / 2;
                      var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                      var10.a(29709);
                    }
                    try {
                      var4.present(true);
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              au.a(-1509, ForceFieldRingEffect.field_s);
              ForceFieldRingEffect.field_s = null;
              VertexAttribute.b(0);
              return false;
            }
            if (gg.field_r != null) {
              if (!il.a(false, gg.field_r)) {
                VertexAttribute.b(0);
                return false;
              }
              gg.field_r = null;
              VertexAttribute.b(0);
              return false;
            }
            if (GraphicsToolkitManager.field_d != null) {
              boolean decompiledFrameRemainder1 = true;
              NameSuggestionsPanel.a(20, 80.0f, om.unpackingLevelsText);
              var3 = hk.b(125);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-128)) {
                LegacyOpenGlGraphicsHeap.a((byte) -75, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-67, var3);
                  decompiledFrameRemainder1 = (var11 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.a(20, 100.0f, fl.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-52, var3);
                    decompiledFrameRemainder1 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_450_0 = nq.field_h;
                    stackIn_451_1 = !(param1);
                    if (!((GraphicsToolkitManager) (Object) stackIn_450_0).a(stackIn_451_1) ||
                      this.h((byte) -11) ||
                      var11 != 0) {
                      var4 = nq.field_h.a(-120);
                      var4.clear(0);
                      ph.gameplaySession.render(122, var4, false);
                      boolean decompiledSharedTail4 = (~nj.field_b == ~OpenGlCubeTexture.field_k);
                      if (!decompiledSharedTail4) {
                        var5_int = eh.field_a * 255 / 30;
                        if (-1 != nj.field_b) {
                          LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var5_int + 255, var4, -2355);
                        }
                        if (OpenGlCubeTexture.field_k != -1) {
                          LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                        }
                        decompiledSharedTail4 = (var11 != 0);
                      }
                      if ((decompiledSharedTail4) &&
                        (nj.field_b != -1)) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var4, -2355);
                      }
                      if (so.a((byte) -36)) {
                        SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                        OpenGlUnderwaterEffect.d((byte) -7);
                      }
                      if (ra.field_e != 0) {
                        var5_int = 256 * eh.field_a / 30;
                        if (var5_int > 0) {
                          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                        }
                      }
                      if (sj.a(-103) &&
                        !so.a((byte) 127)) {
                        if (null != CompactMeshGeometry.field_o) {
                          stackIn_492_0 = true;
                        } else {
                          stackIn_492_0 = ii.field_a;
                        }
                        SoftwareTransform3D.a(stackIn_492_0, 115);
                      }
                      if (Bzip2State.field_j >= 2 &&
                        SceneryParticle.field_v) {
                        LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -61, 1);
                      }
                      var5 = (ge) (pl.field_v.first(110));
                      if (null != var5) {
                        var7 = qn.field_g;
                        if (var7 < 64) {
                          var6_int = 255 * var7 / 64;
                          if (var11 != 0) {
                            if (var7 > 192) {
                              var6_int = (192 - var7) * 255 / 64;
                              var6_int = 255;
                            } else {
                              var6_int = 255;
                            }
                          }
                        } else {
                          if (var7 > 192) {
                            var6_int = (192 - var7) * 255 / 64;
                            if (var11 != 0) {
                              var6_int = 255;
                            }
                          } else {
                            var6_int = 255;
                          }
                        }
                        var8 = 45;
                        boolean decompiledSharedTail3 = !(0 > var5.field_m);
                        if (!decompiledSharedTail3) {
                          var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                          decompiledSharedTail3 = (var11 != 0);
                        }
                        if (decompiledSharedTail3) {
                          var9_ref_String = ArchiveProvider.achievementNames[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].drawScaled(-127 + ArchiveCatalog.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          }
                        }
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      }
                      boolean decompiledSharedTail2 = !(oj.a(false));
                      if (!decompiledSharedTail2) {
                        var6_int = (gi.field_h - SoftwareRasterizer.width) * 0 / 2;
                        var7 = (-SoftwareRasterizer.height + wq.field_b) * 0 / 2;
                        cf.a(var6_int, var7, -44);
                        SoftwareTransform3D.a(false, (byte) -122);
                        this.field_F = true;
                        decompiledSharedTail2 = (var11 != 0);
                      }
                      if (decompiledSharedTail2) {
                        if (sj.a(-61)) {
                          var6_int = (-SoftwareRasterizer.width + gi.field_h) * 0 / 2;
                          var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                          VertexAttribute.a(var6_int, -95, var7);
                          SoftwareTransform3D.a(false, -109);
                          this.field_F = true;
                          if (var11 != 0 &&
                            !ws.b((byte) 52)) {
                            this.field_F = false;
                          }
                        } else {
                          if (!ws.b((byte) 52)) {
                            this.field_F = false;
                          }
                        }
                      }
                      if (this.field_F) {
                        var6_int = SoftwareRasterizer.width;
                        var7 = SoftwareRasterizer.height;
                        if (this.field_K != null) {
                          var7 = this.field_K.field_u;
                          var6_int = this.field_K.field_x;
                        }
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (oj.a(false) &&
                          this.field_K != null) {
                          var8 = GraphicsToolkitManager.c(-10517);
                          var9 = fd.b(3878);
                        }
                        var10 = wq.a(var4, (byte) 83);
                        var10.a((byte) 71, var9, var9 + var7, var8, var8 + var6_int);
                        var9 = (wq.field_b - SoftwareRasterizer.height) / 2;
                        var8 = (gi.field_h - SoftwareRasterizer.width) / 2;
                        var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                        var10.a(29709);
                      }
                      try {
                        var4.present(true);
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var6 = (Exception) (Object) decompiledCaughtException;
                        var6.printStackTrace();
                      }
                    }
                  }
                }
              }
              sb.a(-9937, GraphicsToolkitManager.field_d);
              GraphicsToolkitManager.field_d = null;
              VertexAttribute.b(0);
              return false;
            }
            if (null == pi.field_c) {
              if (!param1) {
                discarded$0 = this.h((byte) -12);
              }
              if (SlowBurstParticle.f(5)) {
                var3_int = 0;
                while (true) {
                  if (13 > var3_int) {
                    LegacyOpenGlEffectManager.field_g[var3_int] = ga.createMenuScreen(var3_int, (byte) -100);
                    var3_int++;
                    if (var11 == 0) {
                      continue;
                    }
                  } else {
                    nj.field_b = 0;
                    OpenGlTexture.a(50, 26175);
                    ByteArrayStorage.compatibilityNoOp(50, -106);
                    mo.a(86, 0);
                    LegacyOpenGlTexture3D.playLoopingSound(true, 0);
                  }
                  break;
                }
                vl.field_a = 0;
              }
              if (nq.field_h.a(-113) == null) {
                nq.field_h.a(false);
                if (!this.h((byte) -124)) {
                  return false;
                }
              }
              ph.gameplaySession = new GameplaySession();
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            NameSuggestionsPanel.a(20, 90.0f, SoftwareTransform3D.unpackingGraphicsText);
            var3 = hk.b(78);
            SoftwareRasterizer.clear();
            if (FadingWidget.g(-70)) {
              LegacyOpenGlGraphicsHeap.a((byte) -86, var3, WhirlpoolDigest.a(7));
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!OpenGlTexture2D.field_j) {
                SoftwareRenderBuffer.a(-62, var3);
                decompiledFrameRemainder0 = (var11 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!ClientException.a(0)) {
                  NameSuggestionsPanel.a(20, 100.0f, fl.waitingForExtraDataText);
                  SoftwareRenderBuffer.a(-110, var3);
                  decompiledFrameRemainder0 = (var11 != 0);
                }
                if ((decompiledFrameRemainder0) && (!nq.field_h.a(false) ||
                  this.h((byte) -34) ||
                  var11 != 0)) {
                  var4 = nq.field_h.a(-125);
                  var4.clear(0);
                  ph.gameplaySession.render(119, var4, false);
                  boolean decompiledSharedTail1 = (~OpenGlCubeTexture.field_k == ~nj.field_b);
                  if (!decompiledSharedTail1) {
                    var5_int = eh.field_a * 255 / 30;
                    if (nj.field_b != -1) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].render(-var5_int + 255, var4, -2355);
                    }
                    if (-1 != OpenGlCubeTexture.field_k) {
                      LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                    }
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if ((decompiledSharedTail1) &&
                    (nj.field_b != -1)) {
                    LegacyOpenGlEffectManager.field_g[nj.field_b].render(255, var4, -2355);
                  }
                  if (so.a((byte) -50)) {
                    SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                    OpenGlUnderwaterEffect.d((byte) -7);
                  }
                  if (ra.field_e != 0) {
                    var5_int = eh.field_a * 256 / 30;
                    if (var5_int > 0) {
                      SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                    }
                  }
                  if (sj.a(-38) &&
                    !so.a((byte) 110)) {
                    if (null == CompactMeshGeometry.field_o) {
                      stackIn_606_0 = ii.field_a;
                    } else {
                      stackIn_606_0 = true;
                    }
                    SoftwareTransform3D.a(stackIn_606_0, -75);
                  }
                  if (Bzip2State.field_j >= 2 &&
                    SceneryParticle.field_v) {
                    LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -93, 1);
                  }
                  var5 = (ge) (pl.field_v.first(66));
                  if (null != var5) {
                    var7 = qn.field_g;
                    if (var7 >= 64) {
                      if (192 >= var7) {
                        var6_int = 255;
                        if (var11 != 0) {
                          var6_int = (192 - var7) * 255 / 64;
                          var6_int = var7 * 255 / 64;
                        }
                      } else {
                        var6_int = (192 - var7) * 255 / 64;
                        if (var11 != 0) {
                          var6_int = var7 * 255 / 64;
                        }
                      }
                    } else {
                      var6_int = var7 * 255 / 64;
                    }
                    var8 = 45;
                    if (var5.field_m >= 0) {
                      var9_ref_String = ArchiveProvider.achievementNames[var5.field_m];
                      if (!(var5.field_m >= qw.field_a.length)) {
                        var8 += 65;
                        qw.field_a[var5.field_m].drawScaled(-32 + (85 + (ArchiveCatalog.field_c - 180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        if (var11 != 0) {
                          var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                        }
                      }
                    } else {
                      var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                    }
                    LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    LegacyOpenGlEffect.field_c.a(150, 16777215 | var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                  }
                  boolean decompiledSharedTail0 = !(oj.a(false));
                  if (!decompiledSharedTail0) {
                    var6_int = 0 * (gi.field_h - SoftwareRasterizer.width) / 2;
                    var7 = (wq.field_b - SoftwareRasterizer.height) * 0 / 2;
                    cf.a(var6_int, var7, -105);
                    SoftwareTransform3D.a(false, (byte) -122);
                    this.field_F = true;
                    decompiledSharedTail0 = (var11 != 0);
                  }
                  if (decompiledSharedTail0) {
                    if (sj.a(-67)) {
                      var6_int = 0 * (gi.field_h - SoftwareRasterizer.width) / 2;
                      var7 = (-SoftwareRasterizer.height + wq.field_b) * 0 / 2;
                      VertexAttribute.a(var6_int, -53, var7);
                      SoftwareTransform3D.a(false, -101);
                      this.field_F = true;
                      if (var11 != 0 &&
                        !ws.b((byte) 52)) {
                        this.field_F = false;
                      }
                    } else {
                      if (!ws.b((byte) 52)) {
                        this.field_F = false;
                      }
                    }
                  }
                  if (this.field_F) {
                    var6_int = SoftwareRasterizer.width;
                    var7 = SoftwareRasterizer.height;
                    if (this.field_K != null) {
                      var6_int = this.field_K.field_x;
                      var7 = this.field_K.field_u;
                    }
                    var8 = (gi.field_h - var6_int) / 2;
                    var9 = (wq.field_b - var7) / 2;
                    if (oj.a(false) &&
                      null != this.field_K) {
                      var8 = GraphicsToolkitManager.c(-10517);
                      var9 = fd.b(3878);
                    }
                    var10 = wq.a(var4, (byte) 29);
                    var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                    var9 = (wq.field_b - SoftwareRasterizer.height) / 2;
                    var8 = (-SoftwareRasterizer.width + gi.field_h) / 2;
                    var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                    var10.a(29709);
                  }
                  try {
                    var4.present(true);
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var6.printStackTrace();
                  }
                }
              }
            }
            NameSuggestionsPanel.a(pi.field_c, dq.field_Z, 20, LegacyOpenGlRenderbuffer.field_v);
            NetworkResourceRequest.a(7966, dq.field_Z, LegacyOpenGlRenderbuffer.field_v);
            pi.field_c = null;
            LegacyOpenGlRenderbuffer.field_v = null;
            dq.field_Z = null;
            VertexAttribute.b(0);
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3_ref), "Sumoblitz.PA(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void releaseAllStatics(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          Sumoblitz.releaseStatics(0);
          GameApplet.b((byte) -19);
          ge.releaseStatics(6334);
          IntrusiveDeque.releaseStatics((byte) 117);
          GraphicsToolkit.releaseStatics(0);
          PacketBuffer.releaseStatics(-22);
          wq.releaseStatics(false);
          oi.releaseStatics(param0);
          GraphicsToolkitManager.releaseStatics(-1);
          hw.releaseStatics(5460);
          MusicCrossfadeStream.releaseStatics(-127);
          rn.releaseStatics(13921);
          ma.releaseStatics(20283);
          bi.releaseStatics((byte) 84);
          GameKeyHandler.releaseStatics(-2851);
          wv.releaseStatics(true);
          GameClientShell.releaseStatics(119);
          ClientException.releaseStatics((byte) -18);
          JaggrabDownloader.releaseStatics(126);
          MouseInputHandler.releaseStatics(8);
          MouseWheelInput.releaseStatics((byte) -75);
          SoftwareRasterizer.releaseStatics();
          ResourceArchive.clearStaticState((byte) 35);
          wf.releaseStatics(116);
          ws.releaseStatics((byte) -71);
          hk.releaseStatics(0);
          gs.releaseStatics((byte) 14);
          kt.releaseStatics((byte) -14);
          kd.releaseStatics((byte) 95);
          uq.releaseStatics((byte) -106);
          br.releaseStatics(23050);
          lb.releaseStatics(0);
          uc.releaseStatics(-1);
          vs.releaseStatics((byte) -68);
          uw.releaseStatics((byte) 96);
          RasterBuffer.releaseStatics((byte) 41);
          mn.releaseStatics((byte) 17);
          FullscreenCanvas.releaseStatics(true);
          SoundCache.releaseStatics(false);
          MenuScreen.releaseStatics(-6);
          GameplaySession.releaseStatics((byte) 42);
          kv.releaseStatics((byte) 30);
          vm.releaseStatics((byte) 118);
          Js5Client.releaseStatics(!param0);
          CacheIoWorker.releaseStatics(87);
          ArchiveCatalog.a(2);
          BufferedSocket.releaseStatics(68);
          IntrusiveNode.releaseStatics((byte) 80);
          FontMetrics.a(false);
          MidiPcmStream.releaseStatics(-95);
          IntrusiveNodeHashTable.releaseStatics(6406);
          MusicVoice.releaseStatics((byte) 115);
          MidiFileReader.releaseStatics();
          MidiNoteMixer.releaseStatics((byte) 81);
          AudioOutput.releaseStatics();
          dn.releaseStatics(-3);
          kp.releaseStatics(-1);
          ArchiveIndex.releaseStatics(-95);
          GzipDecompressor.releaseStatics((byte) 98);
          ArchiveProvider.releaseStatics((byte) -45);
          hc.releaseStatics((byte) 127);
          bk.releaseStatics(4);
          nj.releaseStatics((byte) 115);
          ig.releaseStatics(!param0);
          vp.releaseStatics((byte) -111);
          vd.releaseStatics((byte) -89);
          DialogLayer.releaseStatics(128);
          uk.releaseStatics(false);
          ProgressDialog.releaseStatics(true);
          ContentDialog.releaseStatics(105);
          MessageDialog.releaseStatics(124);
          js.g(0);
          LoginForm.releaseStatics(-118);
          vq.g(121);
          lj.releaseStatics((byte) 108);
          cp.releaseStatics((byte) 117);
          pc.releaseStatics(100);
          bc.releaseStatics(113);
          Drone.releaseStatics(0);
          vl.releaseStatics((byte) 113);
          ArenaPad.releaseStatics(1432625512);
          lg.releaseStatics(544);
          LevelSelectScreen.releaseStatics(1);
          LevelCompleteUpgradeScreen.releaseStatics(32);
          ReassignUpgradesScreen.releaseStatics((byte) 41);
          ii.releaseStatics((byte) -55);
          ps.releaseStatics(28);
          er.releaseStatics(true);
          TimedSceneEffect.releaseStatics(31295);
          ClientExceptionSupport.a(false);
          kh.releaseStatics(2);
          EnemyDrone.releaseStatics(false);
          PlayerDrone.releaseStatics((byte) -68);
          PowerupPickup.releaseStatics(91);
          bw.releaseStatics((byte) 122);
          IntrusiveDequeCursor.a(-1384583532);
          lq.releaseStatics(param0);
          RenderPresentationException.releaseStatics(1);
          GraphicsHeap.releaseStatics((byte) -103);
          pl.releaseStatics(24599);
          pi.releaseStatics(20437);
          ds.releaseStatics((byte) -1);
          qn.releaseStatics(0);
          ss.releaseStatics((byte) 102);
          LegacyBitmapFont.releaseStatics();
          hm.releaseStatics(-11418);
          rv.releaseStatics(true);
          qi.releaseStatics((byte) 16);
          se.releaseStatics(8192);
          SpriteMask.releaseStatics(!param0);
          sb.releaseStatics(true);
          SpriteState.releaseStatics(-109);
          DualLinkNode.releaseStatics(37);
          UpgradeStatNames.releaseStatics(1600);
          LimitedRandomAccessFile.releaseStatics(100);
          wo.a(92);
          wn.releaseStatics(0);
          kw.releaseStatics((byte) -88);
          ea.releaseStatics(-123);
          sj.releaseStatics(true);
          jo.releaseStatics((byte) -115);
          lw.releaseStatics(-1685);
          no.releaseStatics(10);
          vg.releaseStatics(false);
          fl.releaseStatics(0);
          ModalDialog.releaseStatics((byte) 95);
          TextLayout.releaseStatics(82);
          cd.releaseStatics((byte) -126);
          ResizingDialog.releaseStatics(101);
          DropDownWidget.releaseStatics((byte) 58);
          InteractiveWidget.releaseStatics((byte) 54);
          GridWidgetContainer.releaseStatics(-16099);
          WidgetContainer.releaseStatics(true);
          ArrayWidgetContainer.releaseStatics(0);
          ok.releaseStatics((byte) -122);
          AudioServiceThread.releaseStatics(2);
          SocketJs5Client.releaseStatics(1);
          SecondaryNodeQueue.releaseStatics(0);
          NetworkResourceRequest.clearStaticState((byte) 62);
          SectorCacheStore.releaseStatics((byte) -90);
          CacheIoRequest.releaseStatics((byte) 64);
          CachedArchiveProvider.releaseStatics((byte) -96);
          ResourceRequest.releaseStatics(true);
          fa.releaseStatics(false);
          nk.releaseStatics();
          VorbisSample.releaseStatics();
          eh.releaseStatics(-66);
          l.releaseStatics(-104);
          CompactMeshGeometry.releaseStatics(0);
          im.releaseStatics(true);
          gh.releaseStatics(-126);
          kr.releaseStatics(-119);
          up.releaseStatics(-127);
          jk.releaseStatics((byte) -104);
          dq.releaseStatics(-1);
          ci.releaseStatics(8192);
          IntIndexHashTable.releaseStatics(18260);
          ByteArrayStorage.releaseStatics(-100);
          Bzip2Decompressor.releaseStatics();
          Bzip2State.releaseStatics(true);
          rd.releaseStatics(false);
          pb.releaseStatics(3);
          ih.a((byte) 122);
          VorbisFloor1.releaseStatics();
          oq.g(-6811);
          qw.releaseStatics(-122);
          is.releaseStatics(false);
          SoftLruCache.releaseStatics(1);
          un.releaseStatics(true);
          ow.releaseStatics((byte) 123);
          sv.releaseStatics(1284);
          SocketConnector.releaseStatics(85);
          hh.releaseStatics(127);
          fd.releaseStatics(121);
          ImageProducerRasterBuffer.releaseStatics(-48);
          SoundInstrument.releaseStatics();
          qe.releaseStatics(0);
          WhirlpoolDigest.releaseStatics((byte) -58);
          InstrumentNoteMask.releaseStatics((byte) 125);
          MusicPatch.releaseStatics((byte) 111);
          MusicPatchEnvelope.releaseStatics((byte) 110);
          o.b(6);
          TextureMetadata.releaseStatics(param0);
          LabeledWidget.releaseStatics(-107);
          qq.releaseStatics(-15648);
          TextInputWidget.releaseStatics(82);
          ContentTransitionDialog.releaseStatics(0);
          pq.releaseStatics(-1346554936);
          NameSuggestionsPanel.releaseStatics(-18490);
          ar.releaseStatics((byte) -118);
          vr.releaseStatics(-21433);
          bn.releaseStatics((byte) -79);
          wr.releaseStatics(454);
          na.releaseStatics(false);
          WhirlpoolTables.releaseStatics(-109);
          th.f(false);
          vb.releaseStatics(0);
          fu.d(!param0);
          GameInstructions.releaseStatics(!param0);
          ToolkitRasterBuffer.releaseStatics(-73);
          SoftwareRenderTarget.releaseStatics(5423);
          SoftwareRenderContext.releaseStatics(param0);
          Transform3D.releaseStatics(false);
          LegacyOpenGlGraphicsToolkit.releaseStatics((byte) 66);
          kk.releaseStatics((byte) -24);
          LegacyOpenGlEffectManager.releaseStatics(255);
          eb.releaseStatics((byte) 0);
          gq.releaseStatics(false);
          ic.releaseStatics(106);
          LegacyOpenGlNormalMapGenerator.releaseStatics((byte) -69);
          cm.releaseStatics(0);
          LegacyOpenGlTransform3D.releaseStatics(0);
          LegacyOpenGlTexture.releaseStatics((byte) -81);
          LegacyOpenGlTexture2D.releaseStatics((byte) 28);
          bt.releaseStatics((byte) -21);
          LegacyOpenGlCubeTexture.releaseStatics(1);
          HardwareGraphicsToolkit.releaseStatics(8);
          VertexAttribute.releaseStatics(2);
          GpuDataType.releaseStatics(0);
          WaterTextureResources.releaseStatics(128);
          AffineTransform3D.releaseStatics((byte) 49);
          hv.releaseStatics(-7520);
          ko.d(0);
          tf.releaseStatics((byte) 17);
          HardwareTextureCache.releaseStatics((byte) -109);
          ShaderEffect.releaseStatics(-119);
          em.releaseStatics(true);
          il.releaseStatics(26238);
          jl.releaseStatics(786336);
          VertexLayout.releaseStatics((byte) 101);
          gu.releaseStatics(true);
          TextureCombineSource.releaseStatics(false);
          TextureCoordinateGeneration.releaseStatics((byte) -100);
          VertexStreamLayout.releaseStatics(61303);
          PrimitiveType.releaseStatics(-99);
          OpenGlVertexBuffer.releaseStatics(false);
          rs.releaseStatics(-26791);
          CachedTextLayout.d(0);
          DraggableWidget.releaseStatics(-1);
          DropTargetWidget.releaseStatics((byte) 118);
          ScrollPane.releaseStatics(param0);
          DisplayModeConfirmationDialog.releaseStatics((byte) -43);
          FullscreenMembershipDialog.k(50);
          ScrollViewport.releaseStatics(!param0);
          DirectByteArrayStorage.releaseStatics(17);
          ts.releaseStatics(-13252);
          SecondaryNodeDeque.releaseStatics(-103);
          CacheReferenceNode.releaseStatics((byte) 54);
          StrongCacheReference.releaseStatics(24);
          ProxySocketConnector.b(1183);
          AudioFilter.releaseStatics();
          k.releaseStatics(28322);
          SoftwareTransform3D.releaseStatics(-1);
          le.releaseStatics();
          ToolkitImageProducerBuffer.releaseStatics(119);
          ka.releaseStatics((byte) -59);
          r.releaseStatics(33);
          LegacyOpenGlShaderProgram.releaseStatics((byte) -62);
          LegacyOpenGlTexture3D.releaseStatics(-21551);
          ve.releaseStatics((byte) -58);
          LegacyOpenGlEffect.releaseStatics((byte) -76);
          LegacyWaterTextureResources.releaseStatics((byte) 60);
          lf.a(1821625704);
          LegacyOpenGlRenderbuffer.releaseStatics(-21057);
          LegacyOpenGlGraphicsHeap.releaseStatics(-20388);
          LegacyOpenGlSpriteTexture.releaseStatics(!param0);
          wh.releaseStatics(-1);
          uj.releaseStatics(true);
          jq.releaseStatics(107);
          LegacyOpenGlDisplayLists.releaseStatics((byte) -51);
          pt.releaseStatics((byte) 43);
          hn.releaseStatics(true);
          kb.releaseStatics(true);
          sl.releaseStatics(-124);
          wt.releaseStatics((byte) -38);
          es.releaseStatics(4);
          tt.releaseStatics(true);
          mo.releaseStatics(2);
          LegacyOpenGlAssemblyProgram.b(429166529);
          gi.releaseStatics(8192);
          LegacyOpenGlTexture1D.releaseStatics(7064);
          au.releaseStatics((byte) -127);
          ga.releaseStatics(true);
          lv.releaseStatics(3);
          gr.releaseStatics((byte) -19);
          LegacyOpenGlShader.releaseStatics(-25140);
          ei.releaseStatics(-124);
          TextureFilter.releaseStatics(0);
          HardwareGraphicsHeap.releaseStatics(124);
          jm.a(-23787);
          PerlinNoiseSliceGenerator.releaseStatics((byte) -69);
          pu.releaseStatics(1);
          ng.releaseStatics(0);
          ib.e(1);
          uo.releaseStatics((byte) 79);
          ni.d(false);
          RidgedNoise3D.releaseStatics((byte) 30);
          FixedPointPerlinNoise3D.releaseStatics((byte) 101);
          TurbulenceNoise3D.releaseStatics(param0);
          NoiseSliceGenerator.releaseStatics(64);
          sq.releaseStatics(-127);
          OpenGlCubeTexture.releaseStatics(124);
          OpenGlTexture3D.releaseStatics((byte) -17);
          OpenGlUnderwaterEffect.releaseStatics(12);
          OpenGlTransparentWaterEffect.d((byte) 79);
          OpenGlEnvironmentWaterEffect.releaseStatics(!param0);
          OpenGlShaderProgram.releaseStatics((byte) -60);
          OpenGlBuffer.releaseStatics((byte) 13);
          OpenGlIndexBuffer.releaseStatics(param0);
          OpenGlVertexLayout.releaseStatics(123);
          NodeHashTableIterator.releaseStatics(1);
          SecondaryNodeDequeIterator.releaseStatics(-95);
          LegacyOpenGlSpriteMask.releaseStatics(!param0);
          ph.releaseStatics(1882049616);
          OpenGlShader.releaseStatics((byte) -70);
          fw.releaseStatics(-114);
          bl.releaseStatics(false);
          of.a(-26437);
          id.releaseStatics(!param0);
          df.releaseStatics(false);
          PlayingSound.releaseStatics(1022768328);
          pd.releaseStatics((byte) -127);
          ue.releaseStatics(126);
          bv.b(118);
          nl.releaseStatics(2147483647);
          c.releaseStatics(22760);
          oj.releaseStatics(-4);
          FadingWidget.releaseStatics((byte) -84);
          uv.releaseStatics((byte) -31);
          cn.releaseStatics(0);
          km.releaseStatics(-11807);
          gn.releaseStatics(true);
          HudMessage.releaseStatics(false);
          eg.releaseStatics(!param0);
          hg.releaseStatics((byte) 12);
          lh.releaseStatics(12);
          cj.releaseStatics(0);
          mm.releaseStatics(90);
          an.releaseStatics((byte) 89);
          bj.releaseStatics(-121);
          qr.releaseStatics((byte) 119);
          om.releaseStatics((byte) 99);
          DroneDebris.releaseStatics(2);
          SceneryParticle.releaseStatics(false);
          PowerupTrailParticle.releaseStatics(3190);
          ForceFieldRingEffect.releaseStatics(6408);
          ShrinkingRingEffect.releaseStatics(0);
          SlowBurstParticle.releaseStatics(true);
          InwardSparkParticle.releaseStatics(83);
          DroneChargeParticle.releaseStatics(4);
          qc.releaseStatics((byte) 105);
          jj.releaseStatics(0);
          wd.releaseStatics((byte) 88);
          vf.b(1);
          rl.releaseStatics(480);
          sm.releaseStatics((byte) -30);
          TextLayoutLine.releaseStatics(122);
          fm.releaseStatics((byte) -115);
          tm.releaseStatics(false);
          dv.releaseStatics(59);
          FocusProxyWidget.releaseStatics(false);
          DropDownListWidget.releaseStatics(67);
          qv.releaseStatics(18);
          lt.releaseStatics(1);
          ou.releaseStatics((byte) -119);
          tc.releaseStatics(-1);
          wk.releaseStatics(false);
          jc.releaseStatics((byte) -91);
          nq.c((byte) -31);
          jf.releaseStatics((byte) 91);
          s.releaseStatics(18232);
          gf.releaseStatics(1431655765);
          HardwareRidgedWaterNoise.releaseStatics((byte) -75);
          HardwareTurbulentWaterNoise.releaseStatics(-11701);
          lr.releaseStatics(16766976);
          lm.releaseStatics(6);
          dk.releaseStatics(-102);
          LegacyRidgedWaterNoise.releaseStatics((byte) 110);
          ke.releaseStatics(true);
          gg.releaseStatics(0);
          this.field_D = null;
          this.field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.E(" + param0 + ')');
        }
    }

    public Sumoblitz() {
        this.field_F = false;
        this.field_K = null;
    }

    public final void init() {
        try {
          this.a(13, "sumoblitz", 480);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "Sumoblitz.init()");
        }
    }

    final static void playEntityCollisionSound(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            return;
          }
          if (param2 > -67) {
            return;
          }
          regionExit1: {
            regionExit2: {
              var3_int = 0;
              var4 = param1;
              if (var4 == 1) {
                var3_int = ExpandingRingEffect.nextRandomInt(5, HardwareGraphicsHeap.field_o, (byte) -96);
                PlayerDrone.playSample(-113, OpenGlCubeTexture.field_l[22 + var3_int]);
                if (var5 == 0) {
                  return;
                }
              } else {
                if ((2 != var4 ||
                  var5 != 0) &&
                  (3 != var4 ||
                  var5 != 0)) {
                  switch (var4) {
                    case 4:
                      break regionExit2;
                    case 6:
                      break regionExit1;
                    case 5:
                      break regionExit1;
                    default:
                      return;
                    case 0:
                      break;
                  }
                }
              }
              var3_int = ExpandingRingEffect.nextRandomInt(lg.field_d[param0][1].length, HardwareGraphicsHeap.field_o, (byte) -96);
              PlayerDrone.playSample(89, lg.field_d[param0][1][var3_int]);
              if (var5 == 0) {
                return;
              }
            }
            var3_int = ExpandingRingEffect.nextRandomInt(lg.field_d[param0][2].length, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(-121, lg.field_d[param0][2][var3_int]);
            if (var5 == 0) {
              return;
            }
          }
          var3_int = ExpandingRingEffect.nextRandomInt(lg.field_d[param0][0].length, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(42, lg.field_d[param0][0][var3_int]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "Sumoblitz.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_G = new int[16384];
        field_H = 0;
        field_I = 49;
    }
}
