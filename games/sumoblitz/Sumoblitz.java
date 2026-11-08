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
          ProxySocketConnector.field_e = st.field_z;
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
            b.c((byte) 81);
          }
          gt.m(0);
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
          if (2 <= ku.field_j &&
            hw.field_b[41]) {
            f.field_w = true;
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
                bf.a(0);
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
                if (ph.field_b != null) {
                  ph.field_b.e(-119);
                }
                nj.field_b = ro.field_d;
                if (-2 == nj.field_b) {
                  nj.field_b = 0;
                  vb.a((byte) 122, false);
                }
              }
              ra.field_e = 3;
              rc.field_k = nj.field_b;
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
          stackIn_58_0 = ph.field_b;
          stackIn_59_1 = (-1 == nj.field_b);
          ((GameplaySession) (Object) stackIn_58_0).a(stackIn_59_1, (byte) -88);
          if (~rc.field_k != ~nj.field_b) {
            eh.field_a = eh.field_a + 1;
            if (eh.field_a != 30) {
              return;
            }
            if (nj.field_b == 2) {
              mr.field_f = null;
            }
            eh.field_a = 0;
            nj.field_b = rc.field_k;
            if (var3 == 0) {
              return;
            }
          }
          if (nj.field_b != -1) {
            LegacyOpenGlEffectManager.field_g[nj.field_b].b(-18556);
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
          var2.a(177, 128, 9);
          var3 = new MusicCrossfadeStream(var2, new MidiPcmStream());
          aa.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) ((Object) qn.field_f));
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
            SoftwareRasterizer.b();
            if (in.g(param0 ^ -99)) {
              ad.a((byte) 122, var2, np.a(param0 ^ 7));
              return;
            }
            if (!sa.field_j) {
              od.a(-62, var2);
              return;
            }
            if (!ClientException.a(param0 ^ 0)) {
              pe.a(param0 ^ 20, 100.0f, fl.waitingForExtraDataText);
              od.a(-88, var2);
              return;
            }
            if (nq.field_h.a(false) &&
              !this.h((byte) -124)) {
              return;
            }
            var3 = nq.field_h.a(-115);
            var3.GA(0);
            ph.field_b.a(param0 ^ 120, var3, false);
            if (rc.field_k == nj.field_b) {
              if (-1 != nj.field_b) {
                LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var3, -2355);
                if (var10 != 0) {
                  var4_int = 255 * eh.field_a / 30;
                  if (-1 != nj.field_b) {
                    LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
                  }
                  if (-1 != rc.field_k) {
                    LegacyOpenGlEffectManager.field_g[rc.field_k].a(var4_int, var3, -2355);
                  }
                }
              }
            } else {
              var4_int = 255 * eh.field_a / 30;
              if (-1 != nj.field_b) {
                LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
              }
              if (-1 != rc.field_k) {
                LegacyOpenGlEffectManager.field_g[rc.field_k].a(var4_int, var3, -2355);
              }
            }
            if (so.a((byte) 103)) {
              SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
              OpenGlUnderwaterEffect.d((byte) -7);
            }
            if (param0 != ra.field_e) {
              var4_intLifetime1 = 256 * eh.field_a / 30;
              if (var4_intLifetime1 > 0) {
                SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var4_intLifetime1);
              }
            }
            if (sj.a(param0 - 85) &&
              !so.a((byte) -75)) {
              if (CompactMeshGeometry.field_o != null) {
                stackIn_50_0 = true;
              } else {
                stackIn_50_0 = ii.field_a;
              }
              kn.a(stackIn_50_0, 25);
            }
            if (ku.field_j >= 2 &&
              SceneryParticle.field_v) {
              LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -81, 1);
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
                var8_ref_String = aa.arcadeModeUnlockedText;
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                var8_ref_String = rb.achievementNames[var4.field_m];
                if (qw.field_a.length > var4.field_m) {
                  var7 += 65;
                  qw.field_a[var4.field_m].a(-32 + ArchiveCatalog.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << 24, 1);
                }
              }
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
              LegacyOpenGlEffect.field_c.a(150, var5_int << 24 | 16777215, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
            }
            boolean decompiledFrameRemainder0 = true;
            if (oj.a(false)) {
              var5_intLifetime1 = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
              var6Lifetime1 = 0 * (wq.field_b - SoftwareRasterizer.field_c) / 2;
              cf.a(var5_intLifetime1, var6Lifetime1, 59);
              kn.a(false, (byte) -122);
              this.field_F = true;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!sj.a(-44)) {
                if (!ws.b((byte) 52)) {
                  this.field_F = false;
                  if (var10 != 0) {
                    var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                    var6Lifetime1Lifetime1 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                    ls.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                    kn.a(false, param0 ^ 121);
                    this.field_F = true;
                  }
                }
              } else {
                var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                var6Lifetime1Lifetime1 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                ls.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                kn.a(false, param0 ^ 121);
                this.field_F = true;
              }
            }
            if (this.field_F) {
              var5_intLifetime2 = SoftwareRasterizer.field_b;
              var6Lifetime2 = SoftwareRasterizer.field_c;
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
              var7Lifetime1Lifetime1 = (-SoftwareRasterizer.field_b + gi.field_h) / 2;
              var8Lifetime1 = (wq.field_b - SoftwareRasterizer.field_c) / 2;
              var3.SA(var7Lifetime1Lifetime1, var8Lifetime1, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
              var9.a(param0 + 29709);
            }
            try {
              var3.a(true);
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
            ls.b(param0 - 21961);
          }
          if (param0 != 21961) {
            this.advanceScreenTransition((byte) -69);
          }
          jg.field_a = true;
          kf.field_v = wd.a(4, (byte) 125);
          dq.field_Z = wd.a(5, (byte) 125);
          SecondaryNodeDeque.field_d = wd.a(6, (byte) 125);
          er.field_c = wd.a(7, (byte) 125);
          gg.field_r = wd.a(8, (byte) 125);
          be.field_s = wd.a(9, (byte) 125);
          GraphicsToolkitManager.field_d = wd.a(12, (byte) 125);
          LegacyOpenGlEffectManager.field_b = new Random(wq.a(-52));
          if (null == nq.field_h) {
            nq.field_h = new GraphicsToolkitManager(11, -1, (d) null);
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
          fv.e((byte) 76);
          if (CompactMeshGeometry.field_o != null &&
            CompactMeshGeometry.field_o.field_a) {
            b.c((byte) 49);
            qw.a((byte) 35);
          }
          stackIn_11_1 = (null != CompactMeshGeometry.field_o);
          this.b(stackIn_11_1, -103);
          if (ml.field_u) {
            this.initializeGameArchives(21961);
            ml.field_u = false;
          }
          if (in.g(-42)) {
            this.m(106);
            if (in.g(-33)) {
              if (we.g(-1)) {
                discarded$0 = this.a(false, true);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = !(sa.field_j);
          if (!decompiledSharedTail0) {
            if (!ClientException.a(0)) {
              ou.d((byte) -112);
              decompiledFrameRemainder0 = !(!ClientException.a(0));
              if (decompiledFrameRemainder0) {
                oq.a(-24233);
                ad.c(0);
                if (5 == nj.field_b &&
                  0 == OpenGlTransparentWaterEffect.field_e) {
                  nj.field_b = 2;
                  av.a(-7753, false, 2);
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
                      b.c((byte) 71);
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
                    LegacyOpenGlEffectManager.field_g[nj.field_b].b(-8628, true);
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
                      b.c((byte) 49);
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
            rg.a((byte) 55, OpenGlUnderwaterEffect.field_r);
            if (this.a(true, true)) {
              sa.field_j = true;
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
              gt.a(0, 0);
              break;
            }
            this.q(9289);
          } while (var4 == 0);
          if (en.a(-23517)) {
            var3 = this.b(true);
            if (var3 == 2) {
              we.a((byte) 70);
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
            cl.e(-69);
            if (null != SecondaryNodeDeque.field_d) {
              if (pi.field_c.b((byte) 127) &&
                pi.field_c.a("basic", 100)) {
                if (!pi.field_c.a("arialbold14", 100)) {
                  pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.waitingForFontsText, true, ow.loadingFontsText));
                  return false;
                }
                if (vb.field_J.b((byte) 127) &&
                  vb.field_J.a("arialbold14", 100)) {
                  if (!pi.field_c.a("arial13", 100)) {
                    pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.waitingForFontsText, true, ow.loadingFontsText));
                    return false;
                  }
                  if (vb.field_J.b((byte) 127) &&
                    vb.field_J.a("arial13", 100)) {
                    if (SecondaryNodeDeque.field_d.b((byte) 127) &&
                      SecondaryNodeDeque.field_d.a(true)) {
                      if (er.field_c.b((byte) 127) &&
                        er.field_c.a(param1)) {
                        if (gg.field_r.b((byte) 127) &&
                          gg.field_r.a(param1)) {
                          if (be.field_s.b((byte) 127) &&
                            be.field_s.a(true)) {
                            if (kf.field_v.b((byte) 127) &&
                              kf.field_v.a(true)) {
                              if (dq.field_Z.b((byte) 127) &&
                                dq.field_Z.a(true)) {
                                if (GraphicsToolkitManager.field_d.b((byte) 127) &&
                                  GraphicsToolkitManager.field_d.a(true)) {
                                  boolean decompiledFrameRemainder6 = true;
                                  pe.a(20, 65.0f, hv.unpackingSoundEffectsText);
                                  var3 = hk.b(-22);
                                  SoftwareRasterizer.b();
                                  if (in.g(-61)) {
                                    ad.a((byte) 85, var3, np.a(7));
                                    decompiledFrameRemainder6 = (var11 != 0);
                                  }
                                  if (decompiledFrameRemainder6) {
                                    if (!sa.field_j) {
                                      od.a(-117, var3);
                                      decompiledFrameRemainder6 = (var11 != 0);
                                    }
                                    if (decompiledFrameRemainder6) {
                                      if (!ClientException.a(0)) {
                                        pe.a(20, 100.0f, fl.waitingForExtraDataText);
                                        od.a(-117, var3);
                                        decompiledFrameRemainder6 = (var11 != 0);
                                      }
                                      if (decompiledFrameRemainder6) {
                                        stackIn_95_0 = nq.field_h;
                                        stackIn_96_1 = !(param1);
                                        if (!((GraphicsToolkitManager) (Object) stackIn_95_0).a(stackIn_96_1) ||
                                          this.h((byte) -105)) {
                                          var4 = nq.field_h.a(-97);
                                          var4.GA(0);
                                          ph.field_b.a(124, var4, false);
                                          if (~rc.field_k == ~nj.field_b) {
                                            if (-1 != nj.field_b) {
                                              LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var4, -2355);
                                              if (var11 != 0) {
                                                var5_int = 255 * eh.field_a / 30;
                                                if (-1 != nj.field_b) {
                                                  LegacyOpenGlEffectManager.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                }
                                                if (rc.field_k != -1) {
                                                  LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                }
                                              }
                                            }
                                          } else {
                                            var5_int = 255 * eh.field_a / 30;
                                            if (-1 != nj.field_b) {
                                              LegacyOpenGlEffectManager.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                            }
                                            if (rc.field_k != -1) {
                                              LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                                            }
                                          }
                                          if (so.a((byte) 124)) {
                                            SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
                                            OpenGlUnderwaterEffect.d((byte) -7);
                                          }
                                          if (0 != ra.field_e) {
                                            var5_int = eh.field_a * 256 / 30;
                                            if (var5_int > 0) {
                                              SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var5_int);
                                            }
                                          }
                                          if (sj.a(-67) &&
                                            !so.a((byte) 115)) {
                                            if (null != CompactMeshGeometry.field_o) {
                                              stackIn_134_0 = true;
                                            } else {
                                              stackIn_134_0 = ii.field_a;
                                            }
                                            kn.a(stackIn_134_0, 25);
                                          }
                                          if (ku.field_j >= 2 &&
                                            SceneryParticle.field_v) {
                                            LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
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
                                              var9_ref_String = rb.achievementNames[var5.field_m];
                                              if (!(qw.field_a.length <= var5.field_m)) {
                                                qw.field_a[var5.field_m].a(-32 + (85 + ArchiveCatalog.field_c - 180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                var8 += 65;
                                                if (var11 != 0) {
                                                  var9_ref_String = aa.arcadeModeUnlockedText;
                                                }
                                              }
                                            } else {
                                              var9_ref_String = aa.arcadeModeUnlockedText;
                                            }
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                          }
                                          boolean decompiledSharedTail8 = !(oj.a(false));
                                          if (!decompiledSharedTail8) {
                                            var6_int = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
                                            var7 = (-SoftwareRasterizer.field_c + wq.field_b) * 0 / 2;
                                            cf.a(var6_int, var7, 76);
                                            kn.a(false, (byte) -122);
                                            this.field_F = true;
                                            decompiledSharedTail8 = (var11 != 0);
                                          }
                                          if (decompiledSharedTail8) {
                                            if (sj.a(-126)) {
                                              var6_int = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
                                              var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                                              ls.a(var6_int, -45, var7);
                                              kn.a(false, -66);
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
                                            var6_int = SoftwareRasterizer.field_b;
                                            var7 = SoftwareRasterizer.field_c;
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
                                            var9 = (-SoftwareRasterizer.field_c + wq.field_b) / 2;
                                            var8 = (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                                            var4.SA(var8, var9, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
                                            var10.a(29709);
                                          }
                                          try {
                                            var4.a(true);
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
                                  eb.field_b = new og(SecondaryNodeDeque.field_d, er.field_c);
                                  ff.a((byte) -62, SecondaryNodeDeque.field_d);
                                  oq.a(-24233);
                                  SecondaryNodeDeque.field_d = null;
                                  ls.b(0);
                                  return false;
                                }
                                pe.a(20, 60.0f, ProxySocketConnector.a(nm.waitingForLevelsText, (byte) 85, 0, GraphicsToolkitManager.field_d, b.loadingLevelsText));
                                return false;
                              }
                              pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.waitingForFontsText, true, ow.loadingFontsText));
                              return false;
                            }
                            pe.a(20, 45.0f, pt.a("", kf.field_v, m.waitingForGraphicsText, true, es.loadingGraphicsText));
                            return false;
                          }
                          pe.a(20, 40.0f, pt.a("", be.field_s, ve.waitingForMusicText, true, gt.loadingMusicText));
                          return false;
                        }
                        pe.a(20, 30.0f, ProxySocketConnector.a(jf.waitingForInstrumentsText, (byte) 85, 0, gg.field_r, sg.loadingInstrumentsText));
                        return false;
                      }
                      pe.a(20, 20.0f, pt.a("", er.field_c, GameClientShell.waitingForSoundEffectsText, true, hq.loadingSoundEffectsText));
                      return false;
                    }
                    pe.a(20, 10.0f, pt.a("", SecondaryNodeDeque.field_d, GameClientShell.waitingForSoundEffectsText, true, hq.loadingSoundEffectsText));
                    return false;
                  }
                  pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.waitingForFontsText, true, ow.loadingFontsText));
                  return false;
                }
                pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.waitingForFontsText, true, ow.loadingFontsText));
                return false;
              }
              pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.waitingForGraphicsText, true, es.loadingGraphicsText));
              return false;
            }
            if (null != er.field_c) {
              boolean decompiledFrameRemainder5 = true;
              pe.a(20, 70.0f, hv.unpackingSoundEffectsText);
              var3 = hk.b(-103);
              SoftwareRasterizer.b();
              if (in.g(-96)) {
                ad.a((byte) -45, var3, np.a(7));
                decompiledFrameRemainder5 = (var11 != 0);
              }
              if (decompiledFrameRemainder5) {
                if (!sa.field_j) {
                  od.a(-121, var3);
                  decompiledFrameRemainder5 = (var11 != 0);
                }
                if (decompiledFrameRemainder5) {
                  if (!ClientException.a(0)) {
                    pe.a(20, 100.0f, fl.waitingForExtraDataText);
                    od.a(-68, var3);
                    decompiledFrameRemainder5 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder5) && (!nq.field_h.a(false) ||
                    this.h((byte) -99))) {
                    var4 = nq.field_h.a(-121);
                    var4.GA(0);
                    ph.field_b.a(123, var4, false);
                    boolean decompiledSharedTail7 = (~rc.field_k == ~nj.field_b);
                    if (!decompiledSharedTail7) {
                      var5_int = eh.field_a * 255 / 30;
                      if (nj.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                      }
                      if (rc.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                      }
                      decompiledSharedTail7 = (var11 != 0);
                    }
                    if ((decompiledSharedTail7) &&
                      (nj.field_b != -1)) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var4, -2355);
                    }
                    if (so.a((byte) 118)) {
                      SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
                      OpenGlUnderwaterEffect.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (var5_int > 0) {
                        SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var5_int);
                      }
                    }
                    if (sj.a(-126) &&
                      !so.a((byte) 110)) {
                      if (CompactMeshGeometry.field_o != null) {
                        stackIn_249_0 = true;
                      } else {
                        stackIn_249_0 = ii.field_a;
                      }
                      kn.a(stackIn_249_0, 64);
                    }
                    if (2 <= ku.field_j &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
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
                        var9_ref_String = rb.achievementNames[var5.field_m];
                        if (!(var5.field_m >= qw.field_a.length)) {
                          var8 += 65;
                          qw.field_a[var5.field_m].a(-180 + ArchiveCatalog.field_c + 85 - 32, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          if (var11 != 0) {
                            var9_ref_String = aa.arcadeModeUnlockedText;
                          }
                        }
                      } else {
                        var9_ref_String = aa.arcadeModeUnlockedText;
                      }
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    }
                    stackIn_276_0 = !param1;
                    boolean decompiledFrameRemainder4 = true;
                    if (oj.a(stackIn_276_0)) {
                      var6_int = 0 * (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                      var7 = 0 * (-SoftwareRasterizer.field_c + wq.field_b) / 2;
                      cf.a(var6_int, var7, 126);
                      kn.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder4 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      if (!sj.a(-124)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
                            var7 = (-SoftwareRasterizer.field_c + wq.field_b) * 0 / 2;
                            ls.a(var6_int, -66, var7);
                            kn.a(false, -124);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
                        var7 = (-SoftwareRasterizer.field_c + wq.field_b) * 0 / 2;
                        ls.a(var6_int, -66, var7);
                        kn.a(false, -124);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.field_b;
                      var7 = SoftwareRasterizer.field_c;
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
                      var9 = (-SoftwareRasterizer.field_c + wq.field_b) / 2;
                      var8 = (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
                      var10.a(29709);
                    }
                    try {
                      var4.a(true);
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
              ls.b(0);
              return false;
            }
            if (null != be.field_s) {
              boolean decompiledFrameRemainder3 = true;
              pe.a(20, 75.0f, ClientException.unpackingMusicText);
              var3 = hk.b(-103);
              SoftwareRasterizer.b();
              if (in.g(-98)) {
                ad.a((byte) 95, var3, np.a(7));
                decompiledFrameRemainder3 = (var11 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (!sa.field_j) {
                  od.a(-73, var3);
                  decompiledFrameRemainder3 = (var11 != 0);
                }
                if (decompiledFrameRemainder3) {
                  if (!ClientException.a(0)) {
                    pe.a(20, 100.0f, fl.waitingForExtraDataText);
                    od.a(-111, var3);
                    decompiledFrameRemainder3 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder3) && (!nq.field_h.a(false) ||
                    this.h((byte) -48) ||
                    var11 != 0)) {
                    var4 = nq.field_h.a(-128);
                    var4.GA(0);
                    ph.field_b.a(124, var4, false);
                    boolean decompiledSharedTail6 = (~nj.field_b == ~rc.field_k);
                    if (!decompiledSharedTail6) {
                      var5_int = 255 * eh.field_a / 30;
                      if (nj.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                      }
                      if (rc.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                      }
                      decompiledSharedTail6 = (var11 != 0);
                    }
                    if ((decompiledSharedTail6) &&
                      (-1 != nj.field_b)) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var4, -2355);
                    }
                    if (so.a((byte) 109)) {
                      SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
                      OpenGlUnderwaterEffect.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (0 < var5_int) {
                        SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var5_int);
                      }
                    }
                    if (sj.a(-28) &&
                      !so.a((byte) -55)) {
                      if (CompactMeshGeometry.field_o == null) {
                        stackIn_363_0 = ii.field_a;
                      } else {
                        stackIn_363_0 = true;
                      }
                      kn.a(stackIn_363_0, -122);
                    }
                    if (ku.field_j >= 2 &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
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
                        var9_ref_String = aa.arcadeModeUnlockedText;
                        decompiledSharedTail5 = (var11 != 0);
                      }
                      if (decompiledSharedTail5) {
                        var9_ref_String = rb.achievementNames[var5.field_m];
                        if (qw.field_a.length > var5.field_m) {
                          var8 += 65;
                          qw.field_a[var5.field_m].a(ArchiveCatalog.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        }
                      }
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 - 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (oj.a(false)) {
                      var6_int = 0 * (gi.field_h - SoftwareRasterizer.field_b) / 2;
                      var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                      cf.a(var6_int, var7, 86);
                      kn.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder2 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder2) {
                      if (!sj.a(-63)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = 0 * (gi.field_h - SoftwareRasterizer.field_b) / 2;
                            var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                            ls.a(var6_int, -82, var7);
                            kn.a(false, -100);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = 0 * (gi.field_h - SoftwareRasterizer.field_b) / 2;
                        var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                        ls.a(var6_int, -82, var7);
                        kn.a(false, -100);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.field_b;
                      var7 = SoftwareRasterizer.field_c;
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
                      var9 = (wq.field_b - SoftwareRasterizer.field_c) / 2;
                      var8 = (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
                      var10.a(29709);
                    }
                    try {
                      var4.a(true);
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              au.a(-1509, be.field_s);
              be.field_s = null;
              ls.b(0);
              return false;
            }
            if (gg.field_r != null) {
              if (!il.a(false, gg.field_r)) {
                ls.b(0);
                return false;
              }
              gg.field_r = null;
              ls.b(0);
              return false;
            }
            if (GraphicsToolkitManager.field_d != null) {
              boolean decompiledFrameRemainder1 = true;
              pe.a(20, 80.0f, om.unpackingLevelsText);
              var3 = hk.b(125);
              SoftwareRasterizer.b();
              if (in.g(-128)) {
                ad.a((byte) -75, var3, np.a(7));
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (!sa.field_j) {
                  od.a(-67, var3);
                  decompiledFrameRemainder1 = (var11 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (!ClientException.a(0)) {
                    pe.a(20, 100.0f, fl.waitingForExtraDataText);
                    od.a(-52, var3);
                    decompiledFrameRemainder1 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_450_0 = nq.field_h;
                    stackIn_451_1 = !(param1);
                    if (!((GraphicsToolkitManager) (Object) stackIn_450_0).a(stackIn_451_1) ||
                      this.h((byte) -11) ||
                      var11 != 0) {
                      var4 = nq.field_h.a(-120);
                      var4.GA(0);
                      ph.field_b.a(122, var4, false);
                      boolean decompiledSharedTail4 = (~nj.field_b == ~rc.field_k);
                      if (!decompiledSharedTail4) {
                        var5_int = eh.field_a * 255 / 30;
                        if (-1 != nj.field_b) {
                          LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        }
                        if (rc.field_k != -1) {
                          LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                        }
                        decompiledSharedTail4 = (var11 != 0);
                      }
                      if ((decompiledSharedTail4) &&
                        (nj.field_b != -1)) {
                        LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var4, -2355);
                      }
                      if (so.a((byte) -36)) {
                        SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
                        OpenGlUnderwaterEffect.d((byte) -7);
                      }
                      if (ra.field_e != 0) {
                        var5_int = 256 * eh.field_a / 30;
                        if (var5_int > 0) {
                          SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var5_int);
                        }
                      }
                      if (sj.a(-103) &&
                        !so.a((byte) 127)) {
                        if (null != CompactMeshGeometry.field_o) {
                          stackIn_492_0 = true;
                        } else {
                          stackIn_492_0 = ii.field_a;
                        }
                        kn.a(stackIn_492_0, 115);
                      }
                      if (ku.field_j >= 2 &&
                        SceneryParticle.field_v) {
                        LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
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
                          var9_ref_String = aa.arcadeModeUnlockedText;
                          decompiledSharedTail3 = (var11 != 0);
                        }
                        if (decompiledSharedTail3) {
                          var9_ref_String = rb.achievementNames[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].a(-127 + ArchiveCatalog.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          }
                        }
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        LegacyOpenGlEffect.field_c.a(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      }
                      boolean decompiledSharedTail2 = !(oj.a(false));
                      if (!decompiledSharedTail2) {
                        var6_int = (gi.field_h - SoftwareRasterizer.field_b) * 0 / 2;
                        var7 = (-SoftwareRasterizer.field_c + wq.field_b) * 0 / 2;
                        cf.a(var6_int, var7, -44);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        decompiledSharedTail2 = (var11 != 0);
                      }
                      if (decompiledSharedTail2) {
                        if (sj.a(-61)) {
                          var6_int = (-SoftwareRasterizer.field_b + gi.field_h) * 0 / 2;
                          var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                          ls.a(var6_int, -95, var7);
                          kn.a(false, -109);
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
                        var6_int = SoftwareRasterizer.field_b;
                        var7 = SoftwareRasterizer.field_c;
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
                        var9 = (wq.field_b - SoftwareRasterizer.field_c) / 2;
                        var8 = (gi.field_h - SoftwareRasterizer.field_b) / 2;
                        var4.SA(var8, var9, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
                        var10.a(29709);
                      }
                      try {
                        var4.a(true);
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
              ls.b(0);
              return false;
            }
            if (null == pi.field_c) {
              if (!param1) {
                discarded$0 = this.h((byte) -12);
              }
              if (vi.f(5)) {
                var3_int = 0;
                while (true) {
                  if (13 > var3_int) {
                    LegacyOpenGlEffectManager.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                    var3_int++;
                    if (var11 == 0) {
                      continue;
                    }
                  } else {
                    nj.field_b = 0;
                    bp.a(50, 26175);
                    nn.b(50, -106);
                    mo.a(86, 0);
                    ek.b(true, 0);
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
              ph.field_b = new GameplaySession();
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            pe.a(20, 90.0f, kn.unpackingGraphicsText);
            var3 = hk.b(78);
            SoftwareRasterizer.b();
            if (in.g(-70)) {
              ad.a((byte) -86, var3, np.a(7));
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!sa.field_j) {
                od.a(-62, var3);
                decompiledFrameRemainder0 = (var11 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!ClientException.a(0)) {
                  pe.a(20, 100.0f, fl.waitingForExtraDataText);
                  od.a(-110, var3);
                  decompiledFrameRemainder0 = (var11 != 0);
                }
                if ((decompiledFrameRemainder0) && (!nq.field_h.a(false) ||
                  this.h((byte) -34) ||
                  var11 != 0)) {
                  var4 = nq.field_h.a(-125);
                  var4.GA(0);
                  ph.field_b.a(119, var4, false);
                  boolean decompiledSharedTail1 = (~rc.field_k == ~nj.field_b);
                  if (!decompiledSharedTail1) {
                    var5_int = eh.field_a * 255 / 30;
                    if (nj.field_b != -1) {
                      LegacyOpenGlEffectManager.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                    }
                    if (-1 != rc.field_k) {
                      LegacyOpenGlEffectManager.field_g[rc.field_k].a(var5_int, var4, -2355);
                    }
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if ((decompiledSharedTail1) &&
                    (nj.field_b != -1)) {
                    LegacyOpenGlEffectManager.field_g[nj.field_b].a(255, var4, -2355);
                  }
                  if (so.a((byte) -50)) {
                    SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c);
                    OpenGlUnderwaterEffect.d((byte) -7);
                  }
                  if (ra.field_e != 0) {
                    var5_int = eh.field_a * 256 / 30;
                    if (var5_int > 0) {
                      SoftwareRasterizer.b(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, 0, var5_int);
                    }
                  }
                  if (sj.a(-38) &&
                    !so.a((byte) 110)) {
                    if (null == CompactMeshGeometry.field_o) {
                      stackIn_606_0 = ii.field_a;
                    } else {
                      stackIn_606_0 = true;
                    }
                    kn.a(stackIn_606_0, -75);
                  }
                  if (ku.field_j >= 2 &&
                    SceneryParticle.field_v) {
                    LegacyOpenGlEffect.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
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
                      var9_ref_String = rb.achievementNames[var5.field_m];
                      if (!(var5.field_m >= qw.field_a.length)) {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(-32 + (85 + (ArchiveCatalog.field_c - 180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        if (var11 != 0) {
                          var9_ref_String = aa.arcadeModeUnlockedText;
                        }
                      }
                    } else {
                      var9_ref_String = aa.arcadeModeUnlockedText;
                    }
                    LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    LegacyOpenGlEffect.field_c.a(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    LegacyOpenGlEffect.field_c.a(150, 16777215 | var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                  }
                  boolean decompiledSharedTail0 = !(oj.a(false));
                  if (!decompiledSharedTail0) {
                    var6_int = 0 * (gi.field_h - SoftwareRasterizer.field_b) / 2;
                    var7 = (wq.field_b - SoftwareRasterizer.field_c) * 0 / 2;
                    cf.a(var6_int, var7, -105);
                    kn.a(false, (byte) -122);
                    this.field_F = true;
                    decompiledSharedTail0 = (var11 != 0);
                  }
                  if (decompiledSharedTail0) {
                    if (sj.a(-67)) {
                      var6_int = 0 * (gi.field_h - SoftwareRasterizer.field_b) / 2;
                      var7 = (-SoftwareRasterizer.field_c + wq.field_b) * 0 / 2;
                      ls.a(var6_int, -53, var7);
                      kn.a(false, -101);
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
                    var6_int = SoftwareRasterizer.field_b;
                    var7 = SoftwareRasterizer.field_c;
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
                    var9 = (wq.field_b - SoftwareRasterizer.field_c) / 2;
                    var8 = (-SoftwareRasterizer.field_b + gi.field_h) / 2;
                    var4.SA(var8, var9, SoftwareRasterizer.field_b, SoftwareRasterizer.field_c, SoftwareRasterizer.field_a, 0, SoftwareRasterizer.field_b);
                    var10.a(29709);
                  }
                  try {
                    var4.a(true);
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var6.printStackTrace();
                  }
                }
              }
            }
            pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
            fv.a(7966, dq.field_Z, kf.field_v);
            pi.field_c = null;
            kf.field_v = null;
            dq.field_Z = null;
            ls.b(0);
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
          ResourceArchive.a((byte) 35);
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
          og.releaseStatics(false);
          MenuScreen.releaseStatics(-6);
          GameplaySession.a((byte) 42);
          kv.releaseStatics((byte) 30);
          vm.releaseStatics((byte) 118);
          gd.releaseStatics(!param0);
          ti.releaseStatics(87);
          ArchiveCatalog.a(2);
          BufferedSocket.releaseStatics(68);
          IntrusiveNode.releaseStatics((byte) 80);
          ta.a(false);
          MidiPcmStream.releaseStatics(-95);
          IntrusiveNodeHashTable.releaseStatics(6406);
          MusicVoice.releaseStatics((byte) 115);
          MidiFileReader.releaseStatics();
          MidiNoteMixer.releaseStatics((byte) 81);
          AudioOutput.releaseStatics();
          dn.releaseStatics(-3);
          kp.releaseStatics(-1);
          sg.releaseStatics(-95);
          jg.releaseStatics((byte) 98);
          rb.releaseStatics((byte) -45);
          hc.releaseStatics((byte) 127);
          bk.releaseStatics(4);
          nj.releaseStatics((byte) 115);
          ig.releaseStatics(!param0);
          vp.releaseStatics((byte) -111);
          vd.releaseStatics((byte) -89);
          dg.releaseStatics(128);
          uk.releaseStatics(false);
          m.releaseStatics(true);
          dc.releaseStatics(105);
          gt.releaseStatics(124);
          js.g(0);
          cv.releaseStatics(-118);
          vq.g(121);
          lj.releaseStatics((byte) 108);
          cp.releaseStatics((byte) 117);
          pc.releaseStatics(100);
          bc.releaseStatics(113);
          ah.releaseStatics(0);
          vl.releaseStatics((byte) 113);
          nm.c(1432625512);
          lg.releaseStatics(544);
          tr.releaseStatics(1);
          jp.releaseStatics(32);
          bb.releaseStatics((byte) 41);
          ii.releaseStatics((byte) -55);
          ps.releaseStatics(28);
          er.releaseStatics(true);
          TimedSceneEffect.releaseStatics(31295);
          ClientExceptionSupport.a(false);
          kh.releaseStatics(2);
          dr.releaseStatics(false);
          fe.n((byte) -68);
          tl.releaseStatics(91);
          bw.releaseStatics((byte) 122);
          IntrusiveDequeCursor.a(-1384583532);
          lq.releaseStatics(param0);
          rf.releaseStatics(1);
          za.releaseStatics((byte) -103);
          pl.releaseStatics(24599);
          pi.releaseStatics(20437);
          ds.releaseStatics((byte) -1);
          qn.releaseStatics(0);
          ss.releaseStatics((byte) 102);
          vn.releaseStatics();
          hm.releaseStatics(-11418);
          rv.releaseStatics(true);
          qi.releaseStatics((byte) 16);
          se.releaseStatics(8192);
          aa.releaseStatics(!param0);
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
          rg.releaseStatics((byte) 95);
          ag.releaseStatics(82);
          cd.releaseStatics((byte) -126);
          hf.releaseStatics(101);
          ld.releaseStatics((byte) 58);
          wp.releaseStatics((byte) 54);
          nd.releaseStatics(-16099);
          WidgetContainer.releaseStatics(true);
          ao.releaseStatics(0);
          ok.releaseStatics((byte) -122);
          pp.releaseStatics(2);
          t.releaseStatics(1);
          ro.releaseStatics(0);
          fv.d((byte) 62);
          wl.releaseStatics((byte) -90);
          ql.releaseStatics((byte) 64);
          am.releaseStatics((byte) -96);
          rw.releaseStatics(true);
          fa.releaseStatics(false);
          nk.releaseStatics();
          q.releaseStatics();
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
          bf.releaseStatics(18260);
          nn.releaseStatics(-100);
          w.releaseStatics();
          ku.releaseStatics(true);
          rd.releaseStatics(false);
          pb.releaseStatics(3);
          ih.a((byte) 122);
          lo.releaseStatics();
          oq.g(-6811);
          qw.releaseStatics(-122);
          is.releaseStatics(false);
          sd.releaseStatics(1);
          un.releaseStatics(true);
          ow.releaseStatics((byte) 123);
          sv.releaseStatics(1284);
          SocketConnector.releaseStatics(85);
          hh.releaseStatics(127);
          fd.releaseStatics(121);
          ImageProducerRasterBuffer.releaseStatics(-48);
          qg.releaseStatics();
          qe.releaseStatics(0);
          np.releaseStatics((byte) -58);
          InstrumentNoteMask.releaseStatics((byte) 125);
          MusicPatch.releaseStatics((byte) 111);
          MusicPatchEnvelope.releaseStatics((byte) 110);
          o.b(6);
          wm.releaseStatics(param0);
          rt.releaseStatics(-107);
          qq.releaseStatics(-15648);
          dh.releaseStatics(82);
          ur.releaseStatics(0);
          pq.releaseStatics(-1346554936);
          pe.releaseStatics(-18490);
          ar.releaseStatics((byte) -118);
          vr.releaseStatics(-21433);
          bn.releaseStatics((byte) -79);
          wr.releaseStatics(454);
          na.releaseStatics(false);
          ll.releaseStatics(-109);
          th.f(false);
          vb.releaseStatics(0);
          fu.d(!param0);
          GameInstructions.releaseStatics(!param0);
          ce.releaseStatics(-73);
          hi.releaseStatics(5423);
          rp.b(param0);
          eu.releaseStatics(false);
          LegacyOpenGlGraphicsToolkit.releaseStatics((byte) 66);
          kk.releaseStatics((byte) -24);
          LegacyOpenGlEffectManager.releaseStatics(255);
          eb.releaseStatics((byte) 0);
          gq.releaseStatics(false);
          ic.releaseStatics(106);
          b.releaseStatics((byte) -69);
          cm.releaseStatics(0);
          dl.releaseStatics(0);
          ht.releaseStatics((byte) -81);
          us.releaseStatics((byte) 28);
          bt.releaseStatics((byte) -21);
          hp.releaseStatics(1);
          HardwareGraphicsToolkit.releaseStatics(8);
          ls.releaseStatics(2);
          io.releaseStatics(0);
          sk.releaseStatics(128);
          ut.releaseStatics((byte) 49);
          hv.releaseStatics(-7520);
          ko.d(0);
          tf.releaseStatics((byte) 17);
          mr.releaseStatics((byte) -109);
          ShaderEffect.releaseStatics(-119);
          em.releaseStatics(true);
          il.releaseStatics(26238);
          jl.releaseStatics(786336);
          hq.releaseStatics((byte) 101);
          gu.releaseStatics(true);
          mi.releaseStatics(false);
          mp.releaseStatics((byte) -100);
          hu.releaseStatics(61303);
          ck.releaseStatics(-99);
          sc.releaseStatics(false);
          rs.releaseStatics(-26791);
          jd.d(0);
          jh.releaseStatics(-1);
          st.releaseStatics((byte) 118);
          mc.releaseStatics(param0);
          qk.releaseStatics((byte) -43);
          kq.k(50);
          we.releaseStatics(!param0);
          si.releaseStatics(17);
          ts.releaseStatics(-13252);
          SecondaryNodeDeque.releaseStatics(-103);
          jt.d((byte) 54);
          av.releaseStatics(24);
          ProxySocketConnector.b(1183);
          re.releaseStatics();
          k.releaseStatics(28322);
          kn.releaseStatics(-1);
          le.releaseStatics();
          li.releaseStatics(119);
          ka.releaseStatics((byte) -59);
          r.releaseStatics(33);
          sn.releaseStatics((byte) -62);
          ek.releaseStatics(-21551);
          ve.releaseStatics((byte) -58);
          LegacyOpenGlEffect.releaseStatics((byte) -76);
          ch.releaseStatics((byte) 60);
          lf.a(1821625704);
          kf.releaseStatics(-21057);
          ad.releaseStatics(-20388);
          f.releaseStatics(!param0);
          wh.releaseStatics(-1);
          uj.releaseStatics(true);
          jq.releaseStatics(107);
          tq.releaseStatics((byte) -51);
          pt.releaseStatics((byte) 43);
          hn.releaseStatics(true);
          kb.releaseStatics(true);
          sl.releaseStatics(-124);
          wt.releaseStatics((byte) -38);
          es.releaseStatics(4);
          tt.releaseStatics(true);
          mo.releaseStatics(2);
          vk.b(429166529);
          gi.releaseStatics(8192);
          pr.releaseStatics(7064);
          au.releaseStatics((byte) -127);
          ga.releaseStatics(true);
          lv.releaseStatics(3);
          gr.releaseStatics((byte) -19);
          mk.releaseStatics(-25140);
          ei.releaseStatics(-124);
          ji.releaseStatics(0);
          he.releaseStatics(124);
          jm.a(-23787);
          vu.releaseStatics((byte) -69);
          pu.releaseStatics(1);
          ng.releaseStatics(0);
          ib.e(1);
          uo.releaseStatics((byte) 79);
          ni.d(false);
          ml.releaseStatics((byte) 30);
          en.releaseStatics((byte) 101);
          ff.releaseStatics(param0);
          ab.releaseStatics(64);
          sq.releaseStatics(-127);
          rc.releaseStatics(124);
          go.releaseStatics((byte) -17);
          OpenGlUnderwaterEffect.releaseStatics(12);
          OpenGlTransparentWaterEffect.d((byte) 79);
          OpenGlEnvironmentWaterEffect.releaseStatics(!param0);
          oh.releaseStatics((byte) -60);
          ua.releaseStatics((byte) 13);
          ju.releaseStatics(param0);
          fq.releaseStatics(123);
          NodeHashTableIterator.releaseStatics(1);
          SecondaryNodeDequeIterator.releaseStatics(-95);
          lu.releaseStatics(!param0);
          ph.releaseStatics(1882049616);
          qj.releaseStatics((byte) -70);
          fw.releaseStatics(-114);
          bl.releaseStatics(false);
          of.a(-26437);
          id.releaseStatics(!param0);
          df.releaseStatics(false);
          dj.releaseStatics(1022768328);
          pd.releaseStatics((byte) -127);
          ue.releaseStatics(126);
          bv.b(118);
          nl.releaseStatics(2147483647);
          c.releaseStatics(22760);
          oj.releaseStatics(-4);
          in.releaseStatics((byte) -84);
          uv.releaseStatics((byte) -31);
          cn.releaseStatics(0);
          km.a(-11807);
          gn.releaseStatics(true);
          to.releaseStatics(false);
          eg.releaseStatics(!param0);
          hg.releaseStatics((byte) 12);
          lh.releaseStatics(12);
          cj.releaseStatics(0);
          mm.releaseStatics(90);
          an.releaseStatics((byte) 89);
          bj.releaseStatics(-121);
          qr.releaseStatics((byte) 119);
          om.releaseStatics((byte) 99);
          aj.e(2);
          SceneryParticle.releaseStatics(false);
          eq.releaseStatics(3190);
          be.releaseStatics(6408);
          gb.releaseStatics(0);
          vi.releaseStatics(true);
          as.releaseStatics(83);
          cl.releaseStatics(4);
          qc.releaseStatics((byte) 105);
          jj.releaseStatics(0);
          wd.releaseStatics((byte) 88);
          vf.b(1);
          rl.releaseStatics(480);
          sm.releaseStatics((byte) -30);
          tk.releaseStatics(122);
          fm.releaseStatics((byte) -115);
          tm.releaseStatics(false);
          dv.releaseStatics(59);
          ac.releaseStatics(false);
          hd.releaseStatics(67);
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
          ct.releaseStatics((byte) -75);
          ks.d(-11701);
          lr.releaseStatics(16766976);
          lm.releaseStatics(6);
          dk.releaseStatics(-102);
          ip.releaseStatics((byte) 110);
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
                var3_int = fi.a(5, he.field_o, (byte) -96);
                fe.a(-113, rc.field_l[22 + var3_int]);
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
              var3_int = fi.a(lg.field_d[param0][1].length, he.field_o, (byte) -96);
              fe.a(89, lg.field_d[param0][1][var3_int]);
              if (var5 == 0) {
                return;
              }
            }
            var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
            fe.a(-121, lg.field_d[param0][2][var3_int]);
            if (var5 == 0) {
              return;
            }
          }
          var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
          fe.a(42, lg.field_d[param0][0][var3_int]);
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
