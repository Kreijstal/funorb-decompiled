/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BachelorFridge extends NetworkGameClient {
    private boolean field_x;
    public static int field_y;

    private final void a(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_112_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_y;
        try {
          boolean decompiledFrameRemainder2 = true;
          if (~ha.field_l == ~ha.field_k) {
            boolean decompiledFrameRemainder1 = true;
            if (!kha.field_f) {
              lo.a(75);
              kha.field_f = this.i((byte) -120);
              if ((kha.field_f) &&
                (decompiledFrameRemainder1 = (mg.field_m == null))) {
                if (!AttackUpAllAnimation.e(-29919)) {
                  BuffVendorEvent.d((byte) -123);
                  decompiledFrameRemainder1 = (var8 != 0);
                }
                if (decompiledFrameRemainder1) {
                  uq.g((byte) 67);
                  decompiledFrameRemainder1 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                return;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameRemainder0 = true;
            var3_int = 0;
            var4 = 0;
            if (!param0) {
              if (kaa.field_m == OhNoEvent.field_s) {
                if (-1 != OhNoEvent.field_s) {
                  if (OhNoEvent.field_s != -3) {
                    if ((OhNoEvent.field_s != -2) &&
                      (decompiledFrameRemainder0 = !(!tn.a(OhNoEvent.field_s, 124)))) {
                      LevitateSpecial.field_p[OhNoEvent.field_s].e(8456);
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      var3_int = 1;
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    gs.field_f.a(false, true);
                    while (kaa.b(127)) {
                      gs.field_f.b((byte) 94);
                      if (var8 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted2)) {
                  if (!hm.field_b) {
                    dj.field_c.a(true, false);
                    while (kaa.b(127)) {
                      dj.field_c.h(480);
                      if (var8 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted1)) {
                    var4 = 1;
                    var3_int = 1;
                    if ((var8 != 0) &&
                      (this.k((byte) -55))) {
                      rs.a(true);
                    }
                  }
                }
              } else {
                if (this.k((byte) -55)) {
                  rs.a(true);
                }
              }
            }
            if ((decompiledFrameCompleted2) && (decompiledFrameCompleted1) && (hm.field_b &&
              !bka.field_h &&
              !pha.field_a)) {
              if (vs.field_d &&
                lna.field_q) {
                var3_int = 0;
              }
              pma.a((byte) 122, var3_int != 0);
              if (gja.field_n) {
                sna.field_fb.a(var4 != 0, false);
              }
              if (vs.field_d &&
                dj.field_c != null) {
                uda.b(var4 != 0, 180, 320, 110);
                dj.field_c.a(var4 != 0, false);
              }
              while (kaa.b(127)) {
                if (wj.field_g) {
                  if (!vs.field_d) {
                    wb.a(13, 15, false, 12);
                  } else {
                    if (HomingMissileAnimation.a(12, 13, 15, (byte) -125)) {
                      continue;
                    }
                  }
                }
                if (null != sna.field_fb &&
                  gja.field_n) {
                  sna.field_fb.h(480);
                }
                if (null == dj.field_c) {
                  continue;
                }
                stackIn_112_0 = vs.field_d;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (!stackIn_112_0) {
                  continue;
                }
                dj.field_c.h(480);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_112_0 = hm.field_b;
            }
            if (!stackIn_112_0) {
              eia.b((byte) -116);
            }
            if (!wj.field_g) {
              if (!(0 >= HazmatEvent.field_q)) {
                HazmatEvent.field_q = HazmatEvent.field_q - 1;
                if ((var8 != 0) &&
                  (saa.field_b > HazmatEvent.field_q)) {
                  HazmatEvent.field_q = HazmatEvent.field_q + 1;
                }
              }
            } else {
              if (saa.field_b > HazmatEvent.field_q) {
                HazmatEvent.field_q = HazmatEvent.field_q + 1;
              }
            }
            var5 = saa.field_b * saa.field_b;
            var6 = var5 - HazmatEvent.field_q * HazmatEvent.field_q;
            var7 = 360 + 120 * var6 / var5;
            bka.a(-14305, var7);
            if (mka.field_f.b((byte) 90) != null) {
              fieldTemp$0 = t.field_v + 1;
              t.field_v = t.field_v + 1;
              if (fieldTemp$0 == 335) {
                t.field_v = 0;
                mka.field_f.a(false);
              }
            }
            decompiledFrameRemainder2 = (var8 != 0);
          }
          if (decompiledFrameRemainder2) {
            if (DreamsEvent.field_s != ha.field_k) {
              if (HailAnimation.field_x != ha.field_k) {
                StampedeAnimation.field_A = StampedeAnimation.field_A - 1;
                decompiledFrameRemainder2 = (0 == StampedeAnimation.field_A);
                if (decompiledFrameRemainder2) {
                  ha.field_k = ha.field_l;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!AttackUpAllAnimation.e(-29919)) {
                  mg.field_m = null;
                  BuffVendorEvent.d((byte) -125);
                  SuperSpeedAllSpecial.b(-122);
                  kaa.field_m = taa.field_l;
                  if (ge.field_L) {
                    oq.a(false, false);
                  }
                  if (SuperSpeedEvent.field_r) {
                    lg.a(true, -4, false);
                  }
                  if (tn.a(kaa.field_m, 127)) {
                    rs.a(true);
                  }
                }
                ha.field_k = mj.field_i;
                decompiledFrameRemainder2 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              StampedeAnimation.field_A = StampedeAnimation.field_A + 1;
              if (StampedeAnimation.field_A == 16) {
                if (ge.field_L) {
                  ft.c((byte) -41);
                  if (var8 != 0) {
                    wg.a(false);
                  }
                } else {
                  wg.a(false);
                }
                ha.field_k = HailAnimation.field_x;
              }
            }
          }
          if (14 != kaa.field_m) {
          }
          if (-4 == kaa.field_m) {
            sja.field_fb.writeCipheredByte(9, (byte) 118);
            bka.field_h = true;
            kaa.field_m = OhNoEvent.field_s;
            HazmatEvent.field_q = saa.field_b;
          }
          if (param1 < 86) {
            return;
          }
          if (kaa.field_m == -5) {
            rja.a(11, SnowAnimation.field_w.f((byte) -62), 1);
            kaa.field_m = OhNoEvent.field_s;
            pha.field_a = true;
          }
          jja.c(20757);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "BachelorFridge.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean k(byte param0) {
        int fieldTemp$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -55) {
            this.field_x = false;
          }
          var2_int = 32;
          if (OhNoEvent.field_s == 0 &&
            -3 == kaa.field_m) {
            var2_int = 64;
            gs.field_f.a(false, false);
          }
          if (null != gs.field_f && (-3 == OhNoEvent.field_s ||
            1 == OhNoEvent.field_s) && kaa.field_m == 0) {
            var2_int = 64;
            gs.field_f.a(false, false);
          }
          fieldTemp$1 = SplitAnimation.field_v + 1;
          SplitAnimation.field_v = SplitAnimation.field_v + 1;
          stackIn_25_0 = !(var2_int >= fieldTemp$1);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.G(" + param0 + ')');
        }
    }

    private final void a(float param0, boolean param1) {
        try {
          ShieldSpecial.field_r = param0;
          if (!param1) {
            this.a((byte) 111);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "BachelorFridge.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        int stackIn_69_0 = 0;
        boolean stackIn_70_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        ji var3 = null;
        int var3_int = 0;
        Runtime var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = field_y;
        try {
          var2 = pha.a(109);
          if (sn.c(83)) {
            bn.a(0, var2, gja.b(-16103));
            return;
          }
          if (!ZombiesSpecial.field_r) {
            jq.a(var2, -128);
            return;
          }
          if (!BattleUpdate.b(true)) {
            dea.a(SetFriendlyEffect.field_i, 100.0f, 116);
            jq.a(var2, -128);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!kha.field_f) {
            ClamsEvent.e(117);
            decompiledFrameRemainder0 = (var6 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (kaa.field_m != OhNoEvent.field_s) {
              this.h((byte) 103);
              if (var6 != 0) {
                cf.a(true, OhNoEvent.field_s, vla.field_w, (byte) 46);
              }
            } else {
              cf.a(true, OhNoEvent.field_s, vla.field_w, (byte) 46);
            }
            if (!vla.field_w ||
              !sia.field_h) {
              ji.a(aja.e(11), 62);
            }
            var3 = (ji) (mka.field_f.b((byte) 90));
            if (var3 != null) {
              var5 = t.field_v;
              if (80 <= var5) {
                if (var5 >= 230) {
                  var4 = -(var5 / 2) + 123;
                  if (var6 != 0) {
                    var4 = 8;
                    var4 = var5 / 2 - 32;
                  }
                } else {
                  var4 = 8;
                  if (var6 != 0) {
                    var4 = var5 / 2 - 32;
                  }
                }
              } else {
                var4 = var5 / 2 - 32;
              }
              SoftwareRasterizer.a(4, 8 + var4, aha.field_D.a(EventEffect.field_g[var3.field_h]) + 56, aha.field_D.field_B + aha.field_D.field_u, 5, 0, 128);
              og.field_a[var3.field_h].drawQuarterSize(8, var4);
              aha.field_D.drawText(EventEffect.field_g[var3.field_h], 48, -2 + (8 + var4) + aha.field_D.field_u, 12320512, -1);
            }
            if (vs.a(23864)) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c);
              gla.a(-101, uma.field_J[0].field_p, uma.field_J[0].field_q, uma.field_J);
            }
            if (nba.b((byte) -125) &&
              !vs.a(23864) &&
              !paa.a(15000)) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c);
              RageSpecial.a(uma.field_J[0].field_q, uma.field_J, (byte) 15, uma.field_J[0].field_p);
            }
          }
          if (param0 < 1) {
            this.field_x = true;
          }
          if (!vs.a(23864) &&
            paa.a(15000)) {
            stackIn_69_0 = -1;
            if (null != kga.field_c) {
              stackIn_70_1 = true;
            } else {
              stackIn_70_1 = kt.field_i;
            }
            SetFriendlyEffect.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_70_1);
          }
          if (ha.field_l != ha.field_k) {
            var3_int = StampedeAnimation.field_A * 256 / 16;
            if (var3_int > 0) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c, 0, var3_int);
            }
          }
          if (aha.field_D != null &&
            BananarangSpecial.field_r >= 2) {
            var3_ref = Runtime.getRuntime();
            var4Lifetime1 = (int)(var3_ref.totalMemory() - var3_ref.freeMemory()) >> 10;
            aha.field_D.drawText(pr.field_i + " fps; " + var4Lifetime1 + "KiB", 20, 20, 16777215, 0);
          }
          if (kha.field_f &&
            mk.field_p != -1 &&
            -1 != gd.field_m) {
            vv.field_c[kr.field_vb].draw(mk.field_p - vv.field_c[kr.field_vb].field_t, gd.field_m - vv.field_c[kr.field_vb].field_u);
          }
          IncomingEvent.a(0, -106, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "BachelorFridge.B(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nha.field_c) {
            aha.a((byte) 54, nha.field_c);
            nha.field_c = null;
            mia.b(32);
          }
          fga.field_h = daa.c(param0 + 98, 3);
          vb.field_j = DiveBomberSpecial.a(5, false, false, -78, false);
          BoardTile.field_b = daa.c(-94, 6);
          HomingMissileAnimation.field_w = daa.c(param0 + 103, 7);
          FullHealAnimation.field_B = daa.c(param0 + 96, 8);
          fda.field_l = daa.c(param0 ^ 73, 9);
          JaggrabDownloader.field_m = daa.c(param0 ^ 52, 10);
          fda.field_k = daa.c(83, param0);
          ria.field_i = daa.c(103, 12);
          pr.field_j = daa.c(-60, 13);
          iga.field_d = DiveBomberSpecial.a(14, false, false, 114, false);
          wba.field_f = daa.c(107, 15);
          wb.field_l = daa.c(-127, 16);
          vd.field_y = daa.c(80, 17);
          fw.field_j = daa.c(68, 18);
          uda.field_U = daa.c(69, 19);
          rt.a(TBomberAnimation.field_y, (byte) 120, DiveBomberEvent.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.N(" + param0 + ')');
        }
    }

    final void d(int param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 76) {
            discarded$1 = this.i((byte) 56);
          }
          eia.a((byte) -15);
          if (kga.field_c != null) {
            lga.c((byte) 116);
          }
          jea.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.A(" + param0 + ')');
        }
    }

    private final void a(vr param0, byte param1, float param2, float param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ShieldSpecial.field_r = (float)param0.a(true) * (-param2 + param3) / 100.0f + param2;
          var5_int = 12 % ((param1 - 57) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("BachelorFridge.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public BachelorFridge() {
        this.field_x = false;
    }

    public final void init() {
        try {
          this.a(-8771, "bachelorfridge", 21);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "BachelorFridge.init()");
        }
    }

    private final void a(float param0, vr param1, float param2, int param3, String param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ShieldSpecial.field_r = (param2 - param0) * (float)param1.a(0, param4) / 100.0f + param0;
          if (param3 > -109) {
            this.field_x = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("BachelorFridge.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean j(byte param0) {
        BinaryBitmapFont dupTemp$0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        IndexedSprite[] var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          IndexedSpriteState.a(25);
          if (!this.field_x) {
            if (vb.field_j.a(param0 - 7) &&
              vb.field_j.a("minimal", 20637)) {
              if ((BoardTile.field_b.a(0) &&
                BoardTile.field_b.a("minimal", 20637)) &&
                (decompiledFrameRemainder0 = (!(ria.field_i.a(param0 ^ 7)) ||
                !(ria.field_i.b((byte) 95))))) {
                dea.a(MassPoisonEvent.a(ria.field_i, (byte) -57, kj.field_a, iea.field_b), 80.0f, 115);
                return false;
              }
              if (decompiledFrameRemainder0) {
                dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, param0 + 111);
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, 118);
              return false;
            }
          }
          this.field_x = true;
          var2 = BoardTile.field_b.a((byte) 123, "smallfont", "minimal");
          var3 = RageSpecial.a(param0 ^ 29612, "minimal", "smallfont", vb.field_j);
          dupTemp$0 = RasterBuffer.a(var3, var2, 0);
          aha.field_D = dupTemp$0;
          jha.field_g = dupTemp$0;
          hfa.field_z = ll.a(var2, -8659, var3);
          fn.field_n = qca.a(var2, 1, false, var3, 0, 0);
          fn.field_n.field_M = bfa.field_c;
          iu.a(-1638641311, ria.field_i);
          qha.a(124, vb.field_j);
          if (param0 != 7) {
            this.field_x = true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "BachelorFridge.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        GameKeyHandler.b(0);
        jr.a(86);
        fo.a(-15135);
        ri.a(false);
        vc.a(-96);
        sv.a(24173);
        TriangleRasterizer.b();
        wi.b(true);
        ji.a(125);
        IntrusiveDeque.b(7);
        ga.a((byte) -123);
        og.a((byte) 16);
        gj.p(-1);
        saa.d((byte) -128);
        us.b(12745);
        iw.a(-119);
        db.a(0);
        ml.a((byte) 63);
        vm.a((byte) -87);
        kb.a(92);
        BufferedCacheFile.a(-203);
        BufferedSocket.a(96);
        vr.b(-19779);
        oja.a(-32341);
        dj.a((byte) -75);
        cba.a((byte) -44);
        GameAppletShell.e(-12132);
        dl.d((byte) -39);
        pn.a((byte) -60);
        SoftwareRasterizer.releaseRasterStorage();
        gr.b(12653);
        AudioOutput.d();
        i.a((byte) -122);
        au.a(-31824);
        NetworkGameClient.g((byte) 109);
        ClientException.a(101);
        JaggrabDownloader.a((byte) -84);
        MouseInputHandler.a(0);
        MouseWheelInput.b((byte) -33);
        BitmapFont.a();
        vda.a((byte) -62);
        PacketBuffer.d((byte) -19);
        f.a(true);
        um.a((byte) 106);
        vw.b(7130);
        rt.a((byte) -91);
        ka.a((byte) 40);
        dt.a((byte) -125);
        im.a((byte) -66);
        gs.a(0);
        jn.a(-22089);
        oma.a((byte) 51);
        tn.a(0);
        RasterBuffer.a(0);
        qha.a(124);
        FullscreenFocusCanvas.a((byte) 36);
        qe.a((byte) 93);
        jla.b(true);
        da.a(-47);
        mu.a(9072);
        IntrusiveNode.b((byte) 127);
        dga.a((byte) -97);
        jd.a((byte) 89);
        lda.a((byte) -127);
        oaa.a(-3681);
        tb.a(-7778);
        fba.a(2);
        hi.a((byte) 97);
        sna.e((byte) -110);
        uha.g((byte) 110);
        ema.f(0);
        eu.a(false);
        rf.b(-67);
        vaa.a(-1);
        tja.a(8192);
        mba.a(-90);
        DualLinkNode.c((byte) 114);
        st.a((byte) 120);
        rp.e((byte) 104);
        tea.q(10462);
        hga.o(8405024);
        sja.o(33);
        dka.a(26727);
        ph.j(31826);
        hh.b(-1);
        qh.a(23312);
        ed.a(69);
        lr.a(34);
        jca.a(-8270);
        ie.a(0);
        tw.a(97);
        to.a(53);
        is.a(12836);
        hs.a((byte) -127);
        BitPacketBuffer.l(-6199);
        CreatureProfile.c((byte) 114);
        tj.a((byte) -114);
        nha.a(-18307);
        it.d(119);
        jfa.c(false);
        m.a((byte) 113);
        w.a(66);
        vi.a(-117);
        gma.a(-5377);
        on.e(-29639);
        go.e(98);
        lt.b((byte) -104);
        ae.a(30317);
        ala.a(-84);
        cw.h(-41);
        pna.f(1);
        ok.f(7576);
        ik.a((byte) 38);
        uq.f(87);
        oda.b(14124);
        kca.a((byte) 32);
        lm.a((byte) -52);
        fja.a(6220);
        pga.a(470);
        rfa.a((byte) -101);
        ModelMesh.a();
        rba.a(-52);
        il.a(4);
        lf.b(123);
        ina.f((byte) -101);
        lna.a((byte) 126);
        qaa.b(false);
        ec.a(-29584);
        dma.a(false);
        mda.a(15);
        dq.a(-19100);
        wba.a(-96);
        iga.a(false);
        dn.a(-114);
        IsaacRandom.a((byte) -73);
        we.a((byte) -124);
        ola.d((byte) -120);
        jna.a(30862);
        uf.a((byte) 24);
        d.d((byte) 7);
        BattleState.e((byte) 53);
        bia.a(56);
        pja.a((byte) -120);
        dba.a((byte) 62);
        dfa.a(false);
        BoardTile.b(788454);
        as.a((byte) 121);
        wo.c((byte) 96);
        pu.c((byte) 123);
        or.c((byte) -77);
        kj.a((byte) -110);
        vs.b(10530);
        aj.a(76);
        ng.c(-621);
        pfa.b(false);
        fs.c((byte) -59);
        ad.c(false);
        mk.a(1);
        ua.a(-9);
        cl.b(false);
        DualLinkDeque.b(-1);
        qfa.g(97);
        SectorCacheStore.a(255);
        DiskCacheRequest.f(103);
        fp.d(12);
        fg.a((byte) 127);
        gg.a((byte) -106);
        cga.b(true);
        kn.b(50);
        id.b(35);
        MidiNote.c((byte) 73);
        MidiFileReader.b();
        jja.c((byte) -90);
        kc.a((byte) 94);
        rm.a(-101);
        ti.b(3);
        BoardChangeBatch.c(false);
        BoardChange.c((byte) 107);
        EventEffect.c((byte) -75);
        bf.c((byte) -79);
        vg.c((byte) 97);
        EffectBatch.b(-4);
        PlayerRoster.a(-102);
        paa.b(2);
        ve.d((byte) -45);
        rha.c(-62);
        lw.a(true);
        cia.c((byte) -96);
        vca.a(488250252);
        CreatureEvent.b(-225);
        md.b(28075);
        sq.c();
        qi.a(10);
        jt.b(true);
        ula.a(0);
        nl.a(-85);
        pv.a(-15565);
        gba.i(2);
        wl.f(0);
        lha.a(1);
        mq.a(213);
        SocketConnector.c(1);
        en.a(-10132);
        ur.a(107);
        cr.a(21592);
        nu.a(76);
        Bzip2Decoder.a();
        bv.a(98);
        rh.a(0);
        oe.a(false);
        nv.f(20038);
        cc.a((byte) -122);
        wk.a(-24);
        jc.e(127);
        DelegatingCanvas.a(true);
        rda.a(true);
        g.c((byte) -124);
        MusicPatch.a(123);
        un.a(2);
        SynthInstrument.releaseScratch();
        VorbisSample.c();
        VorbisFloor.b();
        hm.a(-123);
        em.o(-22799);
        gha.a((byte) -124);
        ai.a(22309);
        ma.a(0);
        iea.a(24166);
        cla.a(-60);
        eea.a((byte) -79);
        ls.a(-118);
        vl.a((byte) 91);
        fka.a(-2779);
        sd.a(0);
        nca.a((byte) 87);
        sea.a((byte) -78);
        wd.c(1);
        via.a(1);
        vv.b(0);
        wj.c(1023);
        hfa.g(-81);
        am.c(true);
        vf.j(-99);
        vd.i(20742);
        IntrusiveDequeCursor.a(7);
        gk.a(false);
        qw.a((byte) -119);
        pda.e(-3);
        pha.a(true);
        ru.b(42);
        ImageProducerRasterBuffer.b((byte) 81);
        lba.a((byte) -68);
        bi.d((byte) -97);
        ge.e((byte) -111);
        vn.k(-9063);
        lka.g((byte) -127);
        uda.n(114);
        de.a(1);
        dd.a(0);
        aha.b(true);
        nf.d((byte) -127);
        dia.a(14213);
        bfa.a(true);
        MeshObject.a((byte) 93);
        jea.a(1);
        sr.b((byte) 127);
        eia.a(124);
        pr.a(-96);
        qb.d(124);
        kma.e(-1);
        qo.a(3);
        oa.f(116);
        qg.a(4096);
        co.a(true);
        faa.a((byte) -113);
        gl.d(-44);
        uma.m(-30829);
        lq.a(71);
        sh.e((byte) -92);
        lla.d((byte) 0);
        sha.b(3);
        sa.b(0);
        ena.b(false);
        qt.b(-29205);
        gca.c((byte) 113);
        oq.a((byte) -47);
        aa.b(-124);
        ld.b(true);
        qs.b(-5232);
        wm.b(false);
        ds.b(-1182);
        qba.b(2753);
        ll.d((byte) 63);
        gd.d((byte) -49);
        wv.b(-91);
        gn.d((byte) -66);
        ep.b(1);
        jf.b(0);
        di.d((byte) -53);
        vj.b(106);
        dja.b(-14190);
        hp.a(-107);
        oc.b(32586);
        sb.b(2630);
        sla.a((byte) 52);
        aq.a((byte) -125);
        kaa.d((byte) 114);
        he.d((byte) 119);
        rw.a((byte) -121);
        hv.a(false);
        bha.d((byte) 60);
        r.b(-1);
        mn.b(102);
        ij.d((byte) 123);
        fr.d((byte) 3);
        sn.b(-103);
        wja.d((byte) -106);
        jka.b(11178);
        nda.b(-110);
        ol.d((byte) -123);
        p.b(0);
        cp.a(64);
        uv.e((byte) -12);
        pe.d(-33);
        ig.d(0);
        jia.b(false);
        cd.d(0);
        ska.e((byte) 20);
        afa.d(103);
        ada.d(-15840);
        wq.d(110);
        et.d(-61);
        qa.b(false);
        jh.d(4096);
        bh.e((byte) -93);
        sk.d(-124);
        wt.d(19564);
        an.f((byte) 86);
        ag.d(108);
        jq.b(true);
        rc.d(-2);
        aea.d(106);
        sj.d(0);
        wla.d(1);
        hda.e(122);
        gt.d(-118);
        ama.e((byte) -118);
        ef.b(false);
        oj.e((byte) -116);
        fn.f((byte) 121);
        qna.e((byte) -106);
        dc.b(true);
        qea.a(-454605656);
        qk.d(89);
        lfa.e((byte) -128);
        qca.d(-98);
        ProxySocketConnector.b((byte) -100);
        gla.a((byte) -62);
        IterableNodeHashTable.a(-1);
        IterableDualLinkDeque.b(-124);
        ul.b(false);
        SoundFilter.a();
        tq.c(-15298);
        raa.h(2);
        re.h(-124);
        du.a(8192);
        oea.g(-8333);
        uca.a(false);
        kda.a(-1);
        ao.a((byte) -44);
        ca.c(-64);
        if (param0 <= 49) {
          return;
        }
        try {
          ov.c(-5);
          gb.b(-22615);
          ne.a(18072);
          cq.c((byte) 67);
          ff.c(16777215);
          pka.a(-8155);
          oka.b((byte) 115);
          cm.c(-75);
          pt.a(65);
          hl.h(2);
          gu.a(true);
          nea.f(18178);
          ap.a(54);
          kka.a(-1);
          n.a((byte) 103);
          qia.b(-127);
          bs.a(122);
          af.a(9680);
          eq.a(0);
          ft.d((byte) -73);
          ika.a(true);
          si.a(-28415);
          kga.a(15238);
          hja.a((byte) 124);
          rs.a(2);
          qc.a((byte) 80);
          oha.b(-256);
          t.c((byte) -107);
          tv.a(true);
          hd.d(1);
          a.c(16763049);
          gfa.a(17733);
          nla.a(false);
          dha.a(true);
          gw.a(25354);
          cea.a(65536);
          su.a(true);
          ho.a(82);
          mka.b(false);
          mc.a(-57);
          lga.b(-4);
          kha.a(-118);
          kr.f(-127);
          uu.f((byte) 20);
          fj.c((byte) 22);
          kja.b(1900);
          hk.a(true);
          ot.b((byte) -91);
          bd.c((byte) -124);
          jda.a(0);
          es.b(true);
          CreatureRef.c((byte) -115);
          AnimationNode.a(5849);
          iha.d(111);
          BattleUpdate.a(-51);
          ida.b(true);
          qf.d(28766);
          taa.d((byte) -41);
          fu.d((byte) 70);
          fha.d((byte) 9);
          wn.d(10);
          cb.d((byte) 106);
          iu.e(-15434);
          MoveOrder.b(false);
          MoveEvent.c(15);
          SpecialOrder.b(false);
          SpecialEvent.c(15);
          ew.d(16776);
          EventAnimation.d((byte) 127);
          ra.d(11919);
          AttackOrder.d((byte) -74);
          fl.b(false);
          ek.d(8);
          vla.f((byte) -103);
          mv.e((byte) 126);
          rea.c((byte) -108);
          fga.a(false);
          sia.c(10371);
          uea.c((byte) -113);
          bu.c(123);
          jha.c((byte) 126);
          eda.c(60);
          fa.c(117);
          ip.c((byte) -36);
          nd.a(false);
          nj.c(256);
          qla.c(-24);
          dw.a(false);
          bma.d((byte) -102);
          aca.c(-111);
          bn.c(109);
          pi.a(false);
          oia.c(126);
          mw.c(16);
          jj.b(false);
          hw.b(false);
          mj.b((byte) 87);
          gaa.d(350);
          ub.d(1);
          iia.a(1314859432);
          ej.b(0);
          oca.d((byte) -122);
          tga.a(-111);
          ow.a(-1);
          lv.d((byte) -47);
          wp.b(80);
          fi.d((byte) -80);
          bg.b(5);
          bja.a(-10744);
          ns.a(-11);
          DamageEffect.a(-124);
          lia.d((byte) 42);
          qq.a(5);
          PlaceCreatureEffect.e((byte) 85);
          MoveCreatureEffect.d((byte) -13);
          SetFriendlyEffect.d((byte) 29);
          ela.d((byte) 80);
          DamageTileEffect.d((byte) 116);
          bm.d((byte) 3);
          ClearTileFlagEffect.a(101);
          o.e((byte) -7);
          dh.d((byte) -78);
          fda.d((byte) 25);
          ic.b(false);
          kq.d((byte) -91);
          kt.a(-23401);
          mh.a(-15947);
          pea.e((byte) 116);
          jk.d((byte) -115);
          dla.a(1097);
          jma.d(24831);
          LevitateSpecial.c((byte) -72);
          LevitateEvent.c(false);
          LevitateAnimation.d(32);
          c.a(-20330);
          wa.d((byte) -74);
          wb.d(10046);
          li.d(-46);
          dp.d(-114);
          nia.b(false);
          cha.d(-30518);
          bda.d(-18);
          dea.d(-35);
          iq.d((byte) -106);
          sc.d(-31258);
          lh.b(-12847);
          ha.c(true);
          jv.c((byte) 79);
          ut.b(-8696);
          gja.c(4177);
          hba.e((byte) 92);
          ba.f((byte) -45);
          HailSpecial.c((byte) -74);
          HailEvent.d((byte) 20);
          HailAnimation.d(-128);
          kw.c((byte) 80);
          uaa.c((byte) -126);
          wda.a(4);
          kna.a(36);
          ona.f(1);
          aja.b(-50);
          ug.c((byte) 10);
          qd.c((byte) 81);
          laa.d(false);
          ni.b(-83);
          ia.c(300);
          uc.c((byte) -102);
          vma.b(-93);
          vu.c((byte) 106);
          lo.a((byte) -93);
          rg.a(0);
          gea.b(4096);
          fm.a(101);
          bga.b(false);
          mla.a((byte) 93);
          tt.e((byte) 84);
          wg.d(22753);
          el.f((byte) -24);
          hna.d(99);
          hka.d(-111);
          hb.d(-98);
          kf.b((byte) 110);
          aia.c((byte) -127);
          pk.c(-106);
          fw.a(-8668);
          uw.f(6144);
          PetAttackEvent.d((byte) -89);
          PetAttackAnimation.e((byte) -35);
          gka.e(-3);
          mr.c(0);
          FloodAnimation.d(32);
          mi.d((byte) -119);
          SnowEvent.d((byte) 52);
          SnowAnimation.d(-124);
          SuperSpeedSpecial.b(1);
          SuperSpeedEvent.d(-17509);
          SuperSpeedAnimation.e((byte) 72);
          SleepSpecial.c(true);
          SleepEvent.d((byte) 125);
          SleepAnimation.g(0);
          ria.a(127);
          ShieldSpecial.c(-36);
          ShieldEvent.d(-1);
          ShieldAnimation.f((byte) 121);
          RaiseSpecial.b(-125);
          RaiseEvent.d(-72);
          RaiseAnimation.e((byte) 65);
          DiveBomberSpecial.b(80);
          DiveBomberEvent.e((byte) -67);
          DiveBomberAnimation.d(119);
          MartyrEvent.d((byte) 110);
          MartyrAnimation.e(2);
          IncomingSpecial.b(-19353);
          IncomingAnimation.e(-38);
          qn.c((byte) 108);
          SpiltMilkSpecial.d((byte) 45);
          SpiltMilkAnimation.e(25);
          DreamsEvent.d(-17811);
          DreamsAnimation.d(-13837);
          SlowAllEvent.d(-1);
          SlowAllAnimation.e((byte) 123);
          InsanoSauceSpecial.b(-1452);
          InsanoSauceAnimation.b(false);
          SuperSpeedAllSpecial.c((byte) 98);
          SuperSpeedAllAnimation.e(4);
          ShuffleSpecial.c((byte) -91);
          ShuffleEvent.c(false);
          FullHealSpecial.c(true);
          FullHealEvent.c(false);
          FullHealAnimation.f((byte) 21);
          InvincibleSpecial.c(true);
          InvincibleEvent.d((byte) -69);
          InvincibleAnimation.f((byte) 39);
          ClamsSpecial.b(-14431);
          ClamsEvent.d(true);
          ClamsAnimation.g(-1111);
          DisableSpecial.c(true);
          DisableEvent.d((byte) -113);
          DisableAnimation.d(-61);
          FishRainSpecial.c((byte) -48);
          FishRainEvent.d(9);
          gf.a(false);
          MassPoisonSpecial.b(95);
          MassPoisonAnimation.d(-36);
          ZombiesSpecial.c((byte) 113);
          ZombiesEvent.d((byte) -102);
          ZombiesAnimation.d(-26);
          FlySpecial.c(false);
          FlyEvent.d(-23353);
          TBomberEvent.d(2);
          TBomberAnimation.e((byte) -87);
          te.c(35);
          StickyAnimation.e((byte) -75);
          FlirtEvent.d(-98);
          FlirtAnimation.f((byte) -120);
          HomingMissileSpecial.c((byte) 127);
          HomingMissileEvent.e((byte) 49);
          cf.a(0);
          HomingMissileAnimation.e((byte) -95);
          dda.a(false);
          BananarangSpecial.c(-116);
          BananarangEvent.d(119);
          BananarangAnimation.g(-122);
          StampedeSpecial.b(78);
          StampedeEvent.d((byte) -85);
          StampedeAnimation.e(25280);
          mg.e(-62);
          ScavengerSpecial.b(1687);
          ScavengerEvent.d(-103);
          ScavengerAnimation.e(101);
          AttackUpAllEvent.d(19691);
          AttackUpAllAnimation.e((byte) 119);
          SauceOfFlameSpecial.c(false);
          SauceOfFlameEvent.d((byte) -113);
          SauceOfFlameAnimation.e((byte) 26);
          SplitSpecial.c((byte) -96);
          SplitEvent.d((byte) -119);
          SplitAnimation.c(false);
          CranberrySpecial.b(-4);
          CranberryEvent.d((byte) -36);
          CranberryAnimation.f(121);
          ffa.c(22533);
          BuffVendorSpecial.b(0);
          BuffVendorEvent.d(100);
          BuffVendorAnimation.b(false);
          HazmatSpecial.c((byte) 126);
          HazmatEvent.d(-100);
          HazmatAnimation.d(75);
          BagpipeSpecial.c(14);
          BagpipeAnimation.e((byte) -3);
          vt.b(0);
          b.b(5910);
          ResetSpecial.b(0);
          ResetAnimation.f(-6887);
          TeleportSpecial.b(0);
          TeleportAnimation.d(4);
          AirstrikeSpecial.b(-26857);
          AirstrikeEvent.c(false);
          AirstrikeAnimation.d(0);
          rr.f(-13421);
          PizzaPartySpecial.b(-115);
          PizzaPartyAnimation.d(0);
          OhNoAnimation.e(-1);
          RefreshingSpecial.b(0);
          RefreshingAnimation.d(-1);
          RageSpecial.b(42);
          RageEvent.d(0);
          RageAnimation.e(1);
          GasCloudSpecial.d((byte) -107);
          GasCloudEvent.d((byte) 84);
          GasCloudAnimation.e((byte) -40);
          ob.c(0);
          OneSpecial.c((byte) -87);
          OneEvent.d((byte) -118);
          OneAnimation.b(false);
          ce.e((byte) 120);
          vo.a((byte) -128);
          nga.a(-20804);
          rj.b((byte) -122);
          vb.a(-126);
          fe.a(-127);
          rga.a((byte) -84);
          this.field_r = null;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "BachelorFridge.D(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (OhNoEvent.field_s == 0 &&
            kaa.field_m == -3) {
            gb.a(SplitAnimation.field_v << 2, 16777215);
            return;
          }
          if (gs.field_f != null && (OhNoEvent.field_s == -3 ||
            OhNoEvent.field_s == 1) && kaa.field_m == 0) {
            gb.a(-(SplitAnimation.field_v << 2) + 256, 16777215);
            return;
          }
          if (param0 < 26) {
            return;
          }
          if (16 <= SplitAnimation.field_v) {
            cf.a(false, kaa.field_m, sia.field_h, (byte) 47);
            kp.a(3959817, -SplitAnimation.field_v + 32);
            if (field_y == 0) {
              return;
            }
          }
          cf.a(false, OhNoEvent.field_s, vla.field_w, (byte) 61);
          kp.b(3959817, SplitAnimation.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.M(" + param0 + ')');
        }
    }

    private final boolean i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        IndexedSprite[] var3 = null;
        Sprite[][] var4 = null;
        Sprite[][] var5 = null;
        int var6_int = 0;
        String[][] var6 = null;
        int var7 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        IndexedSprite[] var3Lifetime1;
        IndexedSprite[] var3Lifetime2;
        var7 = field_y;
        try {
          iha.e(5);
          IndexedSpriteState.a(25);
          if (HomingMissileAnimation.field_w != null) {
            if (ScavengerSpecial.field_p.a(0) &&
              ScavengerSpecial.field_p.a("basic", 20637)) {
              waa.a(0, 0);
              if (ScavengerSpecial.field_p.a(0) &&
                ScavengerSpecial.field_p.a("lobby", 20637)) {
                waa.a(0, 1);
                if (ClamsSpecial.field_p.a(0) &&
                  ClamsSpecial.field_p.a("lobby", 20637)) {
                  waa.a(0, 2);
                  if (HomingMissileAnimation.field_w.a(0) &&
                    HomingMissileAnimation.field_w.b((byte) 120)) {
                    waa.a(0, 3);
                    if (FullHealAnimation.field_B.a(0) &&
                      FullHealAnimation.field_B.b((byte) 105)) {
                      waa.a(0, 4);
                      if (fda.field_l.a(0) &&
                        fda.field_l.b((byte) 113)) {
                        waa.a(0, 5);
                        if (JaggrabDownloader.field_m.a(0) &&
                          JaggrabDownloader.field_m.b((byte) 120)) {
                          waa.a(0, 6);
                          if (vb.field_j.a(0) &&
                            vb.field_j.a("basic", 20637)) {
                            waa.a(0, 7);
                            if (vb.field_j.a(0) &&
                              vb.field_j.a("bacteria_components", 20637)) {
                              waa.a(0, 8);
                              if (BoardTile.field_b.a(0) &&
                                BoardTile.field_b.a("basic", 20637)) {
                                waa.a(0, 9);
                                if (ria.field_i.a(0) &&
                                  ria.field_i.b((byte) 123)) {
                                  waa.a(0, 10);
                                  if (uda.field_U.a(0) &&
                                    uda.field_U.b((byte) 106)) {
                                    waa.a(0, 11);
                                    if (vd.field_y.a(0) &&
                                      vd.field_y.b((byte) 115)) {
                                      waa.a(0, 12);
                                      if (fw.field_j.a(0) &&
                                        fw.field_j.b((byte) 118)) {
                                        waa.a(0, 13);
                                        if (pr.field_j.a(0) &&
                                          pr.field_j.b((byte) 104)) {
                                          waa.a(0, 14);
                                          if (fga.field_h.a(0) &&
                                            fga.field_h.b((byte) 120)) {
                                            waa.a(0, 15);
                                            if (iga.field_d.a(0) &&
                                              iga.field_d.b((byte) 113)) {
                                              waa.a(0, 16);
                                              if (wba.field_f.a(0) &&
                                                wba.field_f.b((byte) 100)) {
                                                waa.a(0, 17);
                                                if (wb.field_l.a(0) &&
                                                  wb.field_l.b((byte) 99)) {
                                                  waa.a(0, 18);
                                                  if (fda.field_k.a(0) &&
                                                    fda.field_k.b((byte) 101)) {
                                                    waa.a(0, 19);
                                                    SlowAllSpecial.b(108);
                                                    this.a(78.5999984741211f, true);
                                                    this.a((byte) 50);
                                                    waa.a(0, 20);
                                                    pu.a(JaggrabDownloader.field_m, fda.field_l, -21201, HomingMissileAnimation.field_w, FullHealAnimation.field_B);
                                                    oe.a(230, (byte) 108);
                                                    ke.b(34);
                                                    HomingMissileAnimation.field_w = null;
                                                    this.a(81.0999984741211f, true);
                                                    waa.a(0, 21);
                                                    return false;
                                                  }
                                                  this.a(fda.field_k, (byte) -6, 78.5f, 78.5999984741211f);
                                                  return false;
                                                }
                                                this.a(wb.field_l, (byte) 110, 78.0999984741211f, 78.5f);
                                                return false;
                                              }
                                              this.a(wba.field_f, (byte) -62, 78.0f, 78.0999984741211f);
                                              return false;
                                            }
                                            this.a(iga.field_d, (byte) 110, 60.79999923706055f, 78.0f);
                                            return false;
                                          }
                                          this.a(fga.field_h, (byte) -7, 60.70000076293945f, 60.79999923706055f);
                                          return false;
                                        }
                                        this.a(pr.field_j, (byte) -108, 60.5f, 60.70000076293945f);
                                        return false;
                                      }
                                      this.a(fw.field_j, (byte) -121, 60.400001525878906f, 60.5f);
                                      return false;
                                    }
                                    this.a(vd.field_y, (byte) 109, 60.29999923706055f, 60.400001525878906f);
                                    return false;
                                  }
                                  this.a(uda.field_U, (byte) 120, 60.0f, 60.29999923706055f);
                                  return false;
                                }
                                this.a(ria.field_i, (byte) 127, 60.0f, 60.0f);
                                return false;
                              }
                              this.a(59.79999923706055f, BoardTile.field_b, 60.0f, -113, "basic");
                              return false;
                            }
                            this.a(55.5f, vb.field_j, 59.79999923706055f, -119, "bacteria_components");
                            return false;
                          }
                          this.a(25.399999618530273f, vb.field_j, 55.5f, -121, "basic");
                          return false;
                        }
                        this.a(JaggrabDownloader.field_m, (byte) 115, 23.299999237060547f, 25.399999618530273f);
                        return false;
                      }
                      this.a(fda.field_l, (byte) -100, 23.299999237060547f, 23.299999237060547f);
                      return false;
                    }
                    this.a(FullHealAnimation.field_B, (byte) -91, 0.8999999761581421f, 23.299999237060547f);
                    return false;
                  }
                  this.a(HomingMissileAnimation.field_w, (byte) -102, 0.6000000238418579f, 0.8999999761581421f);
                  return false;
                }
                this.a(0.5f, ClamsSpecial.field_p, 0.6000000238418579f, -119, "lobby");
                return false;
              }
              this.a(0.20000000298023224f, ScavengerSpecial.field_p, 0.5f, -115, "lobby");
              return false;
            }
            this.a(0.0f, ScavengerSpecial.field_p, 0.20000000298023224f, -116, "basic");
            return false;
          }
          this.a(84.5999984741211f, true);
          waa.a(0, 22);
          if (null != wba.field_f) {
            ce.a(wba.field_f, 15);
            wba.field_f = null;
            return false;
          }
          this.a(84.9000015258789f, true);
          waa.a(0, 23);
          if (wb.field_l != null) {
            qla.d(-64);
            FlySpecial.a(wb.field_l, (byte) 2);
            CranberryAnimation.e(0);
            wb.field_l = null;
          }
          this.a(85.30000305175781f, true);
          waa.a(0, 24);
          if (null != FullHealAnimation.field_B) {
            this.a((byte) 100);
            FullHealAnimation.field_B = null;
            mia.b(32);
            return false;
          }
          this.a(85.9000015258789f, true);
          waa.a(0, 25);
          if (null != JaggrabDownloader.field_m) {
            this.a((byte) 125);
            if (lha.b(18)) {
              JaggrabDownloader.field_m = null;
            }
            mia.b(32);
            return false;
          }
          this.a(94.0999984741211f, true);
          waa.a(0, 26);
          if (iga.field_d != null) {
            BufferedSocket.a(true, iga.field_d);
            iga.field_d = null;
            return false;
          }
          this.a(94.30000305175781f, true);
          waa.a(0, 27);
          if (null == BoardTile.field_b) {
            this.a(99.0f, true);
            waa.a(0, 30);
            if (null != ria.field_i) {
              bka.a(ria.field_i, true);
              ria.field_i = null;
              return false;
            }
            this.a(99.30000305175781f, true);
            waa.a(0, 31);
            if (pr.field_j != null) {
              iia.a(-167571320, pr.field_j);
              pr.field_j = null;
              return false;
            }
            this.a(99.5999984741211f, true);
            waa.a(0, 32);
            if (fga.field_h != null) {
              ika.a((byte) 18, new il(fga.field_h.a((byte) 123, "huffman", "")));
              fga.field_h = null;
              mia.b(32);
              return false;
            }
            this.a(99.69999694824219f, true);
            waa.a(0, 33);
            ek.d((byte) -19);
            uw.g(-128);
            DiveBomberEvent.field_r.a((java.awt.Component) ((Object) TBomberAnimation.field_y), false, 123);
            var2_int = 0;
            if (param0 >= -117) {
              return false;
            }
            do {
              if (var2_int >= 16) {
                OhNoEvent.field_s = 0;
                kaa.field_m = 0;
                jca.a(50, -14350);
                ala.a(26219, HazmatSpecial.field_p);
                mia.b(32);
                waa.a(0, 34);
                tia.b(false);
                break;
              }
              LevitateSpecial.field_p[var2_int] = ClamsSpecial.a(19341, var2_int);
              var2_int++;
            } while (var7 == 0);
            return true;
          }
          this.a((byte) 3);
          var2 = BoardTile.field_b.a((byte) 123, "menufont", "basic");
          var3 = RageSpecial.a(29611, "basic", "menufont", vb.field_j);
          p.a(2, var2, 256);
          taa.field_u = RaiseEvent.a(4676, var3, var2);
          kca.field_c = qca.a(var2, 2, false, var3, 0, 0);
          kca.field_c.field_M = bfa.field_c;
          dja.field_l = jr.a("basic", (byte) 110, vb.field_j, "fridgefont", BoardTile.field_b);
          TBomberEvent.a(3, dja.field_l);
          DiveBomberAnimation.field_w = jr.a("basic", (byte) 124, vb.field_j, "smallfridgefont", BoardTile.field_b);
          iia.a(DiveBomberAnimation.field_w, 1);
          fha.field_j = new String[2][2];
          DiveBomberAnimation.field_w.a(fu.field_l[0], new int[]{60}, fha.field_j[0]);
          DiveBomberAnimation.field_w.a(fu.field_l[1], new int[]{60}, fha.field_j[1]);
          var2Lifetime1 = BoardTile.field_b.a((byte) 123, "tinyfont", "basic");
          var3Lifetime1 = RageSpecial.a(29611, "basic", "tinyfont", vb.field_j);
          ad.field_h = hl.a(16777215, (byte) 107, var3Lifetime1, 65793, var2Lifetime1);
          ad.field_h.field_M = ce.field_w;
          wt.field_k = RaiseEvent.a(4676, var3Lifetime1, var2Lifetime1);
          g.field_g = ClamsSpecial.a("midfont", vb.field_j, -50, "basic", BoardTile.field_b);
          var2Lifetime2 = BoardTile.field_b.a((byte) 123, "arenafont", "basic");
          var3Lifetime2 = RageSpecial.a(29611, "basic", "arenafont", vb.field_j);
          b.field_t = hl.a(16777215, (byte) 107, var3Lifetime2, 65793, var2Lifetime2);
          b.field_t.field_M = ce.field_w;
          fu.a(vb.field_j, false);
          uq.field_zb = an.a((byte) -127, vb.field_j, "basic", "generic_frame");
          uma.field_J = an.a((byte) -123, vb.field_j, "basic", "generic_frame");
          og.field_a = pi.a(vb.field_j, -8845, "basic", "achievements_large");
          ona.field_yb = hca.a("basic", ScavengerSpecial.field_p, 71, "unachieved");
          rc.field_l = hca.a("basic", ScavengerSpecial.field_p, 84, "orbcoin");
          FullHealSpecial.a((byte) -33, ona.field_yb);
          FullHealSpecial.a((byte) -33, rc.field_l);
          TriangleRasterizer.a(new wi(vd.field_y, fw.field_j, uda.field_U, 32, false));
          SleepSpecial.field_p = new Sprite(32, 32);
          SleepSpecial.field_p.b();
          rc.field_l.e(0, 0, 32, 32);
          hga.field_U.a((byte) -97);
          rc.field_l = null;
          var4 = new Sprite[1 + ena.field_o.length][];
          var5 = new Sprite[1 + ena.field_o.length][];
          var6_int = 0;
          while (ena.field_o.length > var6_int) {
            if (null != ena.field_o[var6_int]) {
              var4[var6_int] = gw.a("basic", ena.field_o[var6_int], vb.field_j, -113);
              var5[var6_int] = null;
              if (var7 != 0) {
                var4[var6_int] = null;
                var5[var6_int] = null;
              }
            } else {
              var4[var6_int] = null;
              var5[var6_int] = null;
            }
            var6_int++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var6 = lna.field_y;
          r.a(InsanoSauceAnimation.field_y, -1, ScavengerSpecial.field_p, lna.field_y, tj.field_c, jha.field_j, pt.field_b, 4, fda.field_k, ClamsSpecial.field_p, var6, var4, true, var5, 5);
          nda.field_l = hca.a("basic", vb.field_j, -99, "lobby_game_logo");
          iw.a(200, (byte) -89);
          SpecialEvent.a(-114, ScavengerSpecial.field_p, ClamsSpecial.field_p);
          BagpipeAnimation.a(0, lga.field_n, 0, 16777215, 0, (java.applet.Applet) (this));
          vb.field_j = null;
          BoardTile.field_b = null;
          ClamsSpecial.field_p = null;
          mia.b(32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "BachelorFridge.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        boolean stackIn_74_1 = false;
        boolean stackIn_120_0 = false;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cfa var3_ref_cfa = null;
        int[] var3_ref_int__ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        jna[] var4_ref_jna__ = null;
        BitPacketBuffer var5_ref_pf = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_y;
        try {
          GasCloudAnimation.e(30);
          md.field_l = jfa.e(-93);
          if (null != kga.field_c &&
            kga.field_c.field_f) {
            lga.c((byte) 108);
            BananarangSpecial.b(4);
          }
          stackIn_11_1 = -30;
          stackIn_12_2 = (null != kga.field_c);
          this.b(stackIn_11_1, stackIn_12_2);
          if (ed.field_a) {
            this.r(11);
            ed.field_a = false;
          }
          vr.field_b = vr.field_b + 1;
          var2_int = 89 % ((40 - param0) / 49);
          if (sn.c(63)) {
            if (!SnowAnimation.field_z) {
              DiveBomberEvent.field_r.a((java.awt.Component) ((Object) TBomberAnimation.field_y), true, 124);
              SnowAnimation.field_z = true;
            }
            this.l(10);
            if (sn.c(106)) {
              return;
            }
          }
          if (ZombiesSpecial.field_r && (sia.field_i != TBomberAnimation.field_y ||
            SnowAnimation.field_z)) {
            DiveBomberEvent.field_r.a((java.awt.Component) ((Object) TBomberAnimation.field_y), false, 124);
            sia.field_i = TBomberAnimation.field_y;
            SnowAnimation.field_z = false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (ZombiesSpecial.field_r) {
            if (!BattleUpdate.b(true)) {
              bs.c((byte) -117);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (vs.a(23864)) {
                if (ha.field_k == ha.field_l) {
                  var3 = PlayerRoster.a(true);
                  switch (var3) {
                    case 2:
                      lga.c((byte) 109);
                    default:
                      break;
                    case 4:
                      ge.field_L = true;
                      au.a(0, im.field_a, false);
                      if (var8 == 0) {
                        break;
                      }
                    case 3:
                      oq.a(true, false);
                      break;
                  }
                  this.a(true, (byte) 91);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.a(false, (byte) 93);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (paa.a(15000)) {
                  stackIn_74_1 = (kga.field_c != null);
                  var3 = this.a(stackIn_74_1, -48);
                  if (1 == var3 ||
                    var3 == 2) {
                    if (null != kga.field_c) {
                      lga.c((byte) 118);
                    }
                    if (var3 == 2) {
                      dh.a((java.applet.Applet) (this), 59);
                    }
                  }
                  this.a(true, (byte) 115);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (nba.b((byte) -99)) {
                    if (ha.field_l == ha.field_k) {
                      var3 = jk.d(2);
                      if (var3 == 1) {
                        SuperSpeedEvent.field_r = true;
                        au.a(0, gba.field_Ib, false);
                      }
                      this.a(true, (byte) 126);
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.a(false, (byte) 98);
                      if (var8 != 0) {
                        this.a(false, (byte) 125);
                        aca.a((byte) -118, vc.field_a);
                        if (this.j((byte) 7)) {
                          ZombiesSpecial.field_r = true;
                        }
                      }
                    }
                  } else {
                    this.a(false, (byte) 125);
                    if (var8 != 0) {
                      aca.a((byte) -118, vc.field_a);
                      if (this.j((byte) 7)) {
                        ZombiesSpecial.field_r = true;
                      }
                    }
                  }
                }
              }
            }
          } else {
            aca.a((byte) -118, vc.field_a);
            if (this.j((byte) 7)) {
              ZombiesSpecial.field_r = true;
            }
          }
          regionExit1: {
            boolean decompiledFrameCompleted0 = true;
            if (!AttackUpAllAnimation.e(-29919)) {
              while (true) {
                var3_ref_cfa = (cfa) (AirstrikeEvent.field_q.a(false));
                if (var3_ref_cfa == null) {
                  break;
                }
                rm.a(4, 122, var3_ref_cfa);
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              while (true) {
                stackIn_120_0 = uv.a((byte) 122, GameKeyHandler.field_b);
                if (stackIn_120_0) {
                  stackIn_223_0 = ri.field_a;
                  stackIn_223_1 = 9;
                  if (var8 == 0) {
                    if (stackIn_223_0 == stackIn_223_1) {
                      rs.a(true);
                      bka.field_h = false;
                      kaa.field_m = 10;
                      LevitateEvent.field_s = ig.field_m.readString(-84);
                      continue;
                    }
                    if (ri.field_a == 14) {
                      rs.a(true);
                      dfa.a(150, ul.a(-58, 4), ul.a(-51, 2000), 0, jha.field_j, InsanoSauceAnimation.field_y.length, mia.d((byte) -104), StickySpecial.c(true), 1024, NetworkGameClient.n(96));
                      MusicPatch.a(vv.a(31185), -83, jha.c(-31068));
                      wj.field_g = true;
                      hm.field_b = true;
                      bka.field_h = false;
                      kaa.field_m = -2;
                      ip.a((byte) 22, kaa.field_m);
                      AirstrikeEvent.d(-91);
                      continue;
                    }
                    if (ri.field_a == 15) {
                      if (hm.field_b) {
                        rs.a(true);
                        ih.d((byte) -83);
                        fu.d(13042);
                        if (hp.field_c == -3) {
                          kj.b((byte) -88);
                          hp.field_c = 0;
                        } else {
                          vs.field_d = false;
                          gja.field_n = false;
                          kaa.field_m = 0;
                          sia.field_h = false;
                          nu.field_b = true;
                          ge.field_D = true;
                        }
                        hm.field_b = false;
                        rf.a(-128);
                      }
                      pha.field_a = false;
                      bka.field_h = false;
                      continue;
                    }
                    if (10 == ri.field_a &&
                      hm.field_b) {
                      sa.d(-7);
                      continue;
                    }
                    if (68 == ri.field_a) {
                      var3_ref_int__ = vv.a((byte) 124);
                      var4_ref_int__ = var3_ref_int__;
                      var5_ref_pf = ig.field_m;
                      var6 = ((PacketBuffer) ((Object) var5_ref_pf)).readUnsignedByte(16711935);
                      var7 = 0;
                      while (var6 > var7) {
                        var4_ref_int__[var7] = ((PacketBuffer) ((Object) var5_ref_pf)).readInt(-111);
                        var7++;
                      }
                      var4_ref_int__ = var3_ref_int__;
                      var5_ref_int__ = ZombiesSpecial.field_q;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = dda.a(var4_ref_int__[var6], ~var5_ref_int__[var6]);
                        var6++;
                      }
                      if (dma.field_a) {
                        var4 = 0;
                        while (!(EventEffect.field_g.length <= var4)) {
                          stackIn_120_0 = hp.a(var4, (byte) -66, var3_ref_int__);
                          if (stackIn_120_0) {
                            mka.field_f.a(new ji(var4), true);
                          }
                          var4++;
                        }
                      }
                      var4_ref_int__ = ZombiesSpecial.field_q;
                      var5_ref_int__ = var3_ref_int__;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = MassPoisonSpecial.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                      }
                      var4_ref_int__ = nga.field_i;
                      var5_ref_int__ = var3_ref_int__;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = MassPoisonSpecial.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                      }
                      continue;
                    }
                    if (69 == ri.field_a) {
                      if (!kha.field_f) {
                        continue;
                      }
                      mg.field_m = new mu(ig.field_m);
                      rba.a(mg.field_m, (byte) 125);
                      ep.field_m = ig.field_m.readUnsignedShort((byte) 65);
                      continue;
                    }
                    if (ri.field_a == 76) {
                      ig.field_m.a(3);
                      ig.field_m.a(3);
                      var3 = ig.field_m.readUnsignedByte(16711935);
                      var4_ref_jna__ = new jna[var3];
                      var5 = 0;
                      while (var5 < var3) {
                        var4_ref_jna__[var5] = TeleportEvent.a(ig.field_m, true);
                        var5++;
                      }
                      continue;
                    }
                    if (ri.field_a == 59) {
                      if (vs.field_d ||
                        gja.field_n) {
                        rs.a(true);
                        vs.field_d = false;
                        DualLinkNodeHashTable.field_b = 0;
                        gja.field_n = false;
                        kaa.field_m = -2;
                        wj.field_g = true;
                        sia.field_h = false;
                        nu.field_b = true;
                        rf.a(-128);
                      }
                      pha.field_a = false;
                      continue;
                    }
                    if (lo.b((byte) -102)) {
                      continue;
                    }
                    if (lfa.d(-124)) {
                      continue;
                    }
                    this.a(true);
                    continue;
                  }
                } else {
                  stackIn_223_0 = 0;
                  stackIn_223_1 = 96;
                }
                hna.a(stackIn_223_0, stackIn_223_1);
                break;
              }
            }
          }
          if (wj.field_g) {
            DualLinkNodeHashTable.field_b = 0;
          }
          if (FlirtAnimation.d(11154)) {
            var3 = this.g(-127);
            if (0 == var3 ||
              var3 == 1) {
              if (1 == var3) {
                bka.field_h = true;
                pha.field_a = true;
              }
              if (1 != var3 ||
                var8 != 0) {
                if (OhNoEvent.field_s != -3 &&
                  OhNoEvent.field_s != 12) {
                  if (hm.field_b) {
                    nu.field_b = true;
                    ge.field_D = true;
                    sia.field_h = false;
                    if (!vs.field_d) {
                      lg.a(true, 0, false);
                      if (var8 != 0) {
                        LevitateEvent.field_s = GameAppletShell.field_f;
                        hb.a(2, 10, 0, false);
                      }
                    } else {
                      LevitateEvent.field_s = GameAppletShell.field_f;
                      hb.a(2, 10, 0, false);
                    }
                    rs.a(true);
                    LevitateSpecial.field_p[OhNoEvent.field_s].a(false, 32);
                    hm.field_b = false;
                    gja.field_n = false;
                    vs.field_d = false;
                    rf.a(-128);
                    if (var8 != 0) {
                      nu.field_b = true;
                      sia.field_h = false;
                      lg.a(true, 0, false);
                    }
                  }
                } else {
                  nu.field_b = true;
                  sia.field_h = false;
                  lg.a(true, 0, false);
                }
                bka.field_h = false;
                pha.field_a = false;
              }}
            var4 = 0;
            if (2 == var3) {
              var4 = 1;
            }
            if (gs.field_f != null ||
              hm.field_b ||
              bka.field_h ||
              pha.field_a) {
              var4 = 1;
            }
            if (!FlirtAnimation.d(11154)) {
              var4 = 0;
            }
            if (var4 != 0) {
              ih.e(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.C(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(70, 4, 0, 1, false, false, 2, 20);
          nja.field_a = 16711935;
          jc.field_t = 2603264;
          fa.field_f = 16777215;
          ScavengerSpecial.field_v = 2603264;
          ru.field_c = 16711935;
          wk.field_f = 16777215;
          this.a(false, (byte) 62, true, true, false, false, false);
          GameKeyHandler.field_b[64] = 1;
          GameKeyHandler.field_b[63] = 1;
          GameKeyHandler.field_b[57] = -2;
          GameKeyHandler.field_b[79] = -2;
          GameKeyHandler.field_b[9] = -1;
          GameKeyHandler.field_b[58] = -2;
          GameKeyHandler.field_b[61] = 4;
          GameKeyHandler.field_b[84] = 1;
          GameKeyHandler.field_b[65] = 1;
          if (param0 < 50) {
            this.field_x = true;
          }
          GameKeyHandler.field_b[66] = 1;
          GameKeyHandler.field_b[69] = -2;
          GameKeyHandler.field_b[60] = 7;
          GameKeyHandler.field_b[68] = -1;
          GameKeyHandler.field_b[78] = -2;
          GameKeyHandler.field_b[70] = 8;
          GameKeyHandler.field_b[73] = -2;
          GameKeyHandler.field_b[62] = -1;
          GameKeyHandler.field_b[67] = 1;
          GameKeyHandler.field_b[82] = -2;
          GameKeyHandler.field_b[59] = 0;
          GameKeyHandler.field_b[10] = -1;
          GameKeyHandler.field_b[80] = -2;
          GameKeyHandler.field_b[76] = -2;
          GameKeyHandler.field_b[75] = 2;
          GameKeyHandler.field_b[74] = -2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "BachelorFridge.K(" + param0 + ')');
        }
    }

    static {
    }
}
