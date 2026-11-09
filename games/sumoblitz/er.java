/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static int[] field_h;
    private int field_i;
    private int field_d;
    int field_e;
    private boolean field_f;
    static ResourceArchive field_c;
    private int field_a;
    private int field_b;
    int field_g;

    final static void a(boolean param0) {
        GraphicsToolkit var2 = nq.field_h.a(-117);
        LegacyOpenGlEffect.field_c = var2.createFont(SocketConnector.field_a, ci.field_g, true);
        MessageDialog.field_db = var2.createFont(VertexStreamLayout.field_c, mn.field_b, true);
        uq.field_a = var2.createFont(qr.field_a, OpenGlTransparentWaterEffect.field_i, true);
        qv.field_k = var2.createFont(sv.field_a, au.field_j, true);
        hc.field_e = var2.createFont(ma.field_b, DropDownWidget.field_F, true);
        ForceFieldRingEffect.field_t = var2.createFont(sq.field_b, ProxySocketConnector.field_f, true);
        up.field_c = DroneDebris.createToolkitSprites(NameSuggestionsPanel.field_F, var2, 28513);
        ResizingDialog.field_H = DroneDebris.createToolkitSprites(MidiNoteMixer.field_q, var2, 28513);
        qw.field_a = DroneDebris.createToolkitSprites(SoftwareRenderTarget.field_b, var2, 28513);
        pi.field_d = ResizingDialog.a(var2, CompactMeshGeometry.field_N, (byte) -11);
        uj.field_a = ResizingDialog.a(var2, MusicCrossfadeStream.field_p, (byte) -11);
        MouseWheelInput.field_b = ResizingDialog.a(var2, IntrusiveNode.field_d, (byte) -11);
        CacheReferenceNode.field_y = ResizingDialog.a(var2, OpenGlCubeTexture.field_i, (byte) -11);
        il.field_b = ResizingDialog.a(var2, hc.field_b, (byte) -11);
        CacheIoWorker.field_b = ResizingDialog.a(var2, oi.field_d, (byte) -11);
        vm.field_a = DroneDebris.createToolkitSprites(TextLayoutLine.field_c, var2, 28513);
        HudMessage.field_s = DroneDebris.createToolkitSprites(jj.field_c, var2, 28513);
        SpriteState.field_B = DroneDebris.createToolkitSprites(ResourceRequest.field_r, var2, 28513);
        SecondaryNodeDequeIterator.field_a = DroneDebris.createToolkitSprites(ok.field_d, var2, 28513);
        IntrusiveDeque.field_c = DroneDebris.createToolkitSprites(hh.field_a, var2, 28513);
        ok.field_j = DroneDebris.createToolkitSprites(WaterTextureResources.field_c, var2, 28513);
        LegacyOpenGlTexture1D.field_k = DroneDebris.createToolkitSprites(gq.field_o, var2, 28513);
        LegacyOpenGlSpriteMask.field_e = ResizingDialog.a(var2, IntrusiveDequeCursor.field_e, (byte) -11);
        HudMessage.field_m = ResizingDialog.a(var2, ve.field_k, (byte) -11);
        bt.field_e = ResizingDialog.a(var2, BufferedSocket.field_n, (byte) -11);
        LegacyOpenGlTexture.field_e = DroneDebris.createToolkitSprites(rl.field_l, var2, 28513);
        ContentDialog.field_ab = DroneDebris.createToolkitSprites(kk.field_e, var2, 28513);
        hv.field_d = DroneDebris.createToolkitSprites(HardwareTurbulentWaterNoise.field_w, var2, 28513);
        s.field_n = DroneDebris.createToolkitSprites(fl.field_r, var2, 28513);
        MenuScreen.field_a = DroneDebris.createToolkitSprites(kr.field_b, var2, 28513);
        HardwareTextureCache.field_e = DroneDebris.createToolkitSprites(DisplayModeConfirmationDialog.field_V, var2, 28513);
        if (param0) {
          field_c = (ResourceArchive) null;
          ts.field_e = DroneDebris.createToolkitSprites(ph.field_a, var2, 28513);
          hh.field_e = DroneDebris.createToolkitSprites(CachedTextLayout.field_h, var2, 28513);
          HardwareRidgedWaterNoise.field_A = DroneDebris.createToolkitSprites(bk.field_b, var2, 28513);
          up.field_e = DroneDebris.createToolkitSprites(cd.field_c, var2, 28513);
          th.field_B = ResizingDialog.a(var2, lh.field_k, (byte) -11);
          DroneDebris.createToolkitSprites(Transform3D.field_a, var2, 28513);
          IntrusiveDeque.field_d = ResizingDialog.a(var2, bl.field_a, (byte) -11);
          MusicCrossfadeStream.field_q = DroneDebris.createToolkitSprites(uj.field_c, var2, 28513);
          ResizingDialog.a(var2, df.field_d, (byte) -11);
          DroneDebris.createToolkitSprites(DroneChargeParticle.field_v, var2, 28513);
          uc.field_a = ResizingDialog.a(var2, FullscreenMembershipDialog.field_T, (byte) -11);
          CachedArchiveProvider.field_j = DroneDebris.createToolkitSprites(dq.field_v, var2, 28513);
          OpenGlBuffer.field_g = DroneDebris.createToolkitSprites(LegacyOpenGlRenderbuffer.field_w, var2, 28513);
          ResizingDialog.a(var2, bj.field_g, (byte) -11);
          ResizingDialog.a(var2, HardwareTurbulentWaterNoise.field_t, (byte) -11);
          ResizingDialog.a(var2, ShaderEffect.field_c, (byte) -11);
          im.field_a = ResizingDialog.a(var2, ue.field_p, (byte) -11);
          mn.field_j = ResizingDialog.a(var2, pc.field_c, (byte) -11);
          PlayingSound.field_l = ResizingDialog.a(var2, no.field_c, (byte) -11);
          hv.field_b = ResizingDialog.a(var2, LabeledWidget.field_E, (byte) -11);
          OpenGlEnvironmentWaterEffect.field_i = ResizingDialog.a(var2, mn.field_c, (byte) -11);
          an.field_f = ResizingDialog.a(var2, SceneryParticle.field_C, (byte) -11);
          TextureMetadata.field_a = ResizingDialog.a(var2, wf.field_a, (byte) -11);
          DirectByteArrayStorage.field_d = ResizingDialog.a(var2, RidgedNoise3D.field_p, (byte) -11);
          kw.field_a = ResizingDialog.a(var2, th.field_C, (byte) -11);
          OpenGlIndexBuffer.field_p = DroneDebris.createToolkitSprites(MouseInputHandler.field_b, var2, 28513);
          RidgedNoise3D.field_w = DroneDebris.createToolkitSprites(SoftLruCache.field_a, var2, 28513);
          ok.field_f = DroneDebris.createToolkitSprites(LegacyOpenGlCubeTexture.field_n, var2, 28513);
          TurbulenceNoise3D.field_k = DroneDebris.createToolkitSprites(ni.field_h, var2, 28513);
          ResizingDialog.a(var2, ArchiveCatalog.field_f, (byte) -11);
          ResizingDialog.a(var2, MusicVoice.field_o, (byte) -11);
          DirectByteArrayStorage.field_e = ResizingDialog.a(var2, lr.field_c, (byte) -11);
          DroneDebris.createToolkitSprites(ei.field_b, var2, 28513);
          kk.field_f = ResizingDialog.a(var2, rs.field_e, (byte) -11);
          OpenGlTexture3D.field_p = DroneDebris.createToolkitSprites(FullscreenMembershipDialog.field_S, var2, 28513);
          DroneDebris.createToolkitSprites(ByteArrayStorage.field_a, var2, 28513);
          ArchiveProvider.field_a = DroneDebris.createToolkitSprites(ScrollViewport.field_C, var2, 28513);
          uj.field_b = DroneDebris.createToolkitSprites(pc.field_b, var2, 28513);
          uc.field_e = DroneDebris.createToolkitSprites(ScrollPane.field_F, var2, 28513);
          o.field_b = DroneDebris.createToolkitSprites(om.field_m, var2, 28513);
          ng.field_f = DroneDebris.createToolkitSprites(ke.field_c, var2, 28513);
          OpenGlUnderwaterEffect.field_t = ResizingDialog.a(var2, tc.field_i, (byte) -11);
          LegacyOpenGlSpriteTexture.field_r = DroneDebris.createToolkitSprites(hc.field_a, var2, 28513);
          vl.field_c = ResizingDialog.a(var2, rl.field_o, (byte) -11);
          wo.field_b = new ToolkitSprite[]{mn.field_j, PlayingSound.field_l, hv.field_b};
          tc.field_j = new ToolkitSprite[]{an.field_f, TextureMetadata.field_a, DirectByteArrayStorage.field_d};
          Sumoblitz.field_J = DroneDebris.createToolkitSprites(pq.field_F, var2, 28513);
          return;
        }
        ts.field_e = DroneDebris.createToolkitSprites(ph.field_a, var2, 28513);
        hh.field_e = DroneDebris.createToolkitSprites(CachedTextLayout.field_h, var2, 28513);
        HardwareRidgedWaterNoise.field_A = DroneDebris.createToolkitSprites(bk.field_b, var2, 28513);
        up.field_e = DroneDebris.createToolkitSprites(cd.field_c, var2, 28513);
        th.field_B = ResizingDialog.a(var2, lh.field_k, (byte) -11);
        DroneDebris.createToolkitSprites(Transform3D.field_a, var2, 28513);
        IntrusiveDeque.field_d = ResizingDialog.a(var2, bl.field_a, (byte) -11);
        MusicCrossfadeStream.field_q = DroneDebris.createToolkitSprites(uj.field_c, var2, 28513);
        ResizingDialog.a(var2, df.field_d, (byte) -11);
        DroneDebris.createToolkitSprites(DroneChargeParticle.field_v, var2, 28513);
        uc.field_a = ResizingDialog.a(var2, FullscreenMembershipDialog.field_T, (byte) -11);
        CachedArchiveProvider.field_j = DroneDebris.createToolkitSprites(dq.field_v, var2, 28513);
        OpenGlBuffer.field_g = DroneDebris.createToolkitSprites(LegacyOpenGlRenderbuffer.field_w, var2, 28513);
        ResizingDialog.a(var2, bj.field_g, (byte) -11);
        ResizingDialog.a(var2, HardwareTurbulentWaterNoise.field_t, (byte) -11);
        ResizingDialog.a(var2, ShaderEffect.field_c, (byte) -11);
        im.field_a = ResizingDialog.a(var2, ue.field_p, (byte) -11);
        mn.field_j = ResizingDialog.a(var2, pc.field_c, (byte) -11);
        PlayingSound.field_l = ResizingDialog.a(var2, no.field_c, (byte) -11);
        hv.field_b = ResizingDialog.a(var2, LabeledWidget.field_E, (byte) -11);
        OpenGlEnvironmentWaterEffect.field_i = ResizingDialog.a(var2, mn.field_c, (byte) -11);
        an.field_f = ResizingDialog.a(var2, SceneryParticle.field_C, (byte) -11);
        TextureMetadata.field_a = ResizingDialog.a(var2, wf.field_a, (byte) -11);
        DirectByteArrayStorage.field_d = ResizingDialog.a(var2, RidgedNoise3D.field_p, (byte) -11);
        kw.field_a = ResizingDialog.a(var2, th.field_C, (byte) -11);
        OpenGlIndexBuffer.field_p = DroneDebris.createToolkitSprites(MouseInputHandler.field_b, var2, 28513);
        RidgedNoise3D.field_w = DroneDebris.createToolkitSprites(SoftLruCache.field_a, var2, 28513);
        ok.field_f = DroneDebris.createToolkitSprites(LegacyOpenGlCubeTexture.field_n, var2, 28513);
        TurbulenceNoise3D.field_k = DroneDebris.createToolkitSprites(ni.field_h, var2, 28513);
        ResizingDialog.a(var2, ArchiveCatalog.field_f, (byte) -11);
        ResizingDialog.a(var2, MusicVoice.field_o, (byte) -11);
        DirectByteArrayStorage.field_e = ResizingDialog.a(var2, lr.field_c, (byte) -11);
        DroneDebris.createToolkitSprites(ei.field_b, var2, 28513);
        kk.field_f = ResizingDialog.a(var2, rs.field_e, (byte) -11);
        OpenGlTexture3D.field_p = DroneDebris.createToolkitSprites(FullscreenMembershipDialog.field_S, var2, 28513);
        DroneDebris.createToolkitSprites(ByteArrayStorage.field_a, var2, 28513);
        ArchiveProvider.field_a = DroneDebris.createToolkitSprites(ScrollViewport.field_C, var2, 28513);
        uj.field_b = DroneDebris.createToolkitSprites(pc.field_b, var2, 28513);
        uc.field_e = DroneDebris.createToolkitSprites(ScrollPane.field_F, var2, 28513);
        o.field_b = DroneDebris.createToolkitSprites(om.field_m, var2, 28513);
        ng.field_f = DroneDebris.createToolkitSprites(ke.field_c, var2, 28513);
        OpenGlUnderwaterEffect.field_t = ResizingDialog.a(var2, tc.field_i, (byte) -11);
        LegacyOpenGlSpriteTexture.field_r = DroneDebris.createToolkitSprites(hc.field_a, var2, 28513);
        vl.field_c = ResizingDialog.a(var2, rl.field_o, (byte) -11);
        wo.field_b = new ToolkitSprite[]{mn.field_j, PlayingSound.field_l, hv.field_b};
        tc.field_j = new ToolkitSprite[]{an.field_f, TextureMetadata.field_a, DirectByteArrayStorage.field_d};
        Sumoblitz.field_J = DroneDebris.createToolkitSprites(pq.field_F, var2, 28513);
    }

    final boolean d(int param0) {
        if (param0 != -31260) {
          return false;
        }
        if (this.field_a != 0) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (this.field_b != 83) {
          return false;
        }
        return true;
    }

    final static void c(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Drone var3 = null;
        Drone var4 = null;
        Drone var5 = null;
        int var6 = 0;
        Drone var4Lifetime1;
        Drone var4Lifetime2;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = -63 / ((-56 - param0) / 60);
          if (null != SpriteMask.drones) {
            for (var2 = 0; db.droneSlotLimit > var2; var2++) {
              var3 = SpriteMask.drones[var2];
              var4 = var3;
              var4Lifetime1 = var3;
              if (var3 != null) {
                if (var3.destructionTicks == 0 && (!(-var3.radiusQ8 + var3.xQ8 >= 6656) ||
                  !(var3.yQ8 - var3.radiusQ8 >= 6656) ||
                  !(var3.xQ8 + var3.radiusQ8 <= 157184) ||
                  !(116224 >= var3.radiusQ8 + var3.yQ8)) && !var3.isBlastActive(91)) {
                  if (1 != var3.variant) {
                    SecondaryNodeQueue.a(var3, (byte) 113);
                  } else {
                    if (-var3.radiusQ8 + var3.xQ8 < 6656) {
                      wr.a(-1, var3);
                    } else {
                      if (6656 > -var3.radiusQ8 + var3.yQ8) {
                        wr.a(-1, var3);
                      } else {
                        if (157184 < var3.xQ8 + var3.radiusQ8) {
                          wr.a(-1, var3);
                        } else {
                          if (var3.radiusQ8 + var3.yQ8 > 116224) {
                            wr.a(-1, var3);
                          } else {
                            SecondaryNodeQueue.a(var3, (byte) 113);
                          }
                        }
                      }
                    }
                  }
                }
                if (var3.destructionTicks == 2 && (var3.droneType == 4 ||
                  var3.variant == 6)) {
                  var4Lifetime2 = uj.createEnemyDrone(var3.field_u, var3.xQ8, var3.field_e, (byte) 84, var3.yQ8);
                  var5 = uj.createEnemyDrone(var3.field_u, var3.xQ8, var3.field_e, (byte) 84, var3.yQ8);
                  oc.a(var4Lifetime2, false);
                  oc.a(var5, false);
                }
                if (var3.destructionTicks > 100) {
                  if (MessageDialog.arcadeMode) {
                    qw.a(94, var3);
                  }
                  SpriteMask.drones[var2] = null;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "er.K(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 == 103) {
          return this.field_b == 103 ? true : false;
        }
        this.field_g = -121;
        return this.field_b == 103 ? true : false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 25 / ((12 - param1) / 34);
        this.field_d = 0;
        this.field_f = param0 ? true : false;
        if (!this.field_f) {
          this.field_g = param3;
          return;
        }
        this.field_g = param2;
    }

    final boolean g(int param0) {
        if (param0 == 116224) {
          return this.field_b == 97 ? true : false;
        }
        field_h = (int[]) null;
        return this.field_b == 97 ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 == 52) {
          return this.field_d != 0 ? true : false;
        }
        this.a((byte) 47);
        return this.field_d != 0 ? true : false;
    }

    final boolean e(int param0) {
        if (param0 != 2542) {
          return false;
        }
        return this.field_b == 96 ? true : false;
    }

    final void a(int param0, int param1) {
        if (this.field_d == 0) {
          this.field_g = param1;
          this.field_f = false;
          if (param0 != -31865) {
            this.a(-89);
            return;
          }
          return;
        }
        if (param0 == -31865) {
          return;
        }
        this.a(-89);
    }

    final void a(byte param0) {
        this.field_b = 0;
        if (param0 < 28) {
          this.d(-107);
        }
        this.field_a = 0;
        if (this.field_d == 0 &&
          TextureCombineOperation.field_a == 98) {
          if (this.field_g <= 0) {
            this.field_g = this.field_e;
          }
          this.field_g = this.field_g - 1;
          this.field_f = false;
        }
        if (0 == this.field_d) {
          this.field_b = TextureCombineOperation.field_a;
        }
        if (this.field_d != 0) {
          return;
        }
        if (99 != TextureCombineOperation.field_a) {
          return;
        }
        this.field_g = this.field_g + 1;
        if (this.field_g >= this.field_e) {
          this.field_g = 0;
        }
        this.field_f = false;
    }

    final void a(int param0) {
        this.field_a = 0;
        this.field_b = 0;
        if (this.field_d == 0) {
          this.field_b = TextureCombineOperation.field_a;
        }
        if (param0 > -18) {
          this.a(-114, -72);
        }
        if (this.field_d == 0 &&
          TextureCombineOperation.field_a == 96) {
          if (this.field_g <= 0) {
            this.field_g = this.field_e;
          }
          this.field_g = this.field_g - 1;
          this.field_f = false;
        }
        if (0 != this.field_d) {
          return;
        }
        if (TextureCombineOperation.field_a != 97) {
          return;
        }
        this.field_g = this.field_g + 1;
        if (this.field_g >= this.field_e) {
          this.field_g = 0;
        }
        this.field_f = false;
    }

    final boolean c(int param0) {
        if (param0 != -103) {
          return true;
        }
        return this.field_b == 102 ? true : false;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_h = (int[]) null;
          field_c = null;
          field_h = null;
          return;
        }
        field_c = null;
        field_h = null;
    }

    final void f(int param0) {
        this.field_a = 0;
        this.field_b = 0;
        if (param0 >= -12) {
          return;
        }
        if (0 == this.field_d) {
          this.field_b = TextureCombineOperation.field_a;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (this.field_e <= param2) {
          throw new IllegalArgumentException();
        }
        if (this.field_e <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_a = 0;
        this.field_b = 0;
        if (hk.field_c != 0) {
          this.field_f = true;
          this.field_g = param1;
          this.field_a = hk.field_c;
          this.field_i = mm.field_f;
          this.field_d = hk.field_c;
        }
        if (this.field_d == 0) {
          if (!param0) {
            this.field_g = -114;
            if (hk.field_c == 0 &&
              0 == ar.field_G) {
              this.field_d = 0;
            }
            if (this.field_d == 0) {
              if (!this.field_f &&
                !sl.field_d) {
                return;
              }
              if (param2 < 0) {
                if (this.field_f) {
                  this.field_g = -1;
                }
              } else {
                if (this.field_g != param2) {
                  this.field_f = true;
                  this.field_g = param2;
                } else {
                  this.field_f = true;
                  this.field_g = param2;
                }
              }
            }
            return;
          }
          if (hk.field_c == 0 &&
            0 == ar.field_G) {
            this.field_d = 0;
            if (this.field_d == 0) {
              if (!this.field_f &&
                !sl.field_d) {
                return;
              }
              if (param2 < 0) {
                if (this.field_f) {
                  this.field_g = -1;
                }
              } else {
                if (this.field_g != param2) {
                  this.field_f = true;
                  this.field_g = param2;
                } else {
                  this.field_f = true;
                  this.field_g = param2;
                }
              }
            }
            return;
          }
          if (this.field_d != 0) {
            return;
          }
          if (this.field_f) {
            if (param2 < 0) {
              if (!this.field_f) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (this.field_g != param2) {
            }
            this.field_f = true;
            this.field_g = param2;
            return;
          }
          if (!sl.field_d) {
            return;
          }
          if (param2 < 0) {
            if (this.field_f) {
              this.field_g = -1;
            }
          } else {
            if (this.field_g != param2) {
            }
            this.field_f = true;
            this.field_g = param2;
          }
          return;
        }
        if (ar.field_G != 0) {
          if (this.field_i <= 0) {
            this.field_i = rs.field_h;
          }
          this.field_i = this.field_i - 1;
        }
        if (!param0) {
          this.field_g = -114;
          if (hk.field_c != 0) {
            if (this.field_d == 0) {
              if (!this.field_f &&
                !sl.field_d) {
                return;
              }
              if (param2 < 0) {
                if (this.field_f) {
                  this.field_g = -1;
                }
              } else {
                if (this.field_g != param2) {
                  this.field_f = true;
                  this.field_g = param2;
                } else {
                  this.field_f = true;
                  this.field_g = param2;
                }
              }
            }
            return;
          }
          if (0 == ar.field_G) {
            this.field_d = 0;
          }
          if (this.field_d == 0) {
            if (!this.field_f &&
              !sl.field_d) {
              return;
            }
            if (param2 < 0) {
              if (this.field_f) {
                this.field_g = -1;
              }
            } else {
              if (this.field_g != param2) {
                this.field_f = true;
                this.field_g = param2;
              } else {
                this.field_f = true;
                this.field_g = param2;
              }
            }
          }
          return;
        }
        if (hk.field_c == 0 &&
          0 == ar.field_G) {
          this.field_d = 0;
          if (this.field_d != 0) {
            return;
          }
          if (!this.field_f &&
            !sl.field_d) {
            return;
          }
        } else {
          if (this.field_d != 0) {
            return;
          }
          if (!this.field_f &&
            !sl.field_d) {
            return;
          }
        }
        if (param2 < 0) {
          if (!this.field_f) {
            return;
          }
          this.field_g = -1;
          return;
        }
        if (this.field_g != param2) {
        }
        this.field_f = true;
        this.field_g = param2;
    }

    er(int param0) {
        this.field_f = false;
        this.field_g = 0;
        this.field_e = param0;
    }

    static {
    }
}
