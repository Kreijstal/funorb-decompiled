/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AppletGameShell extends GameApplet {
    private long field_w;
    private boolean field_A;
    private boolean field_y;
    private boolean field_q;
    private int field_s;
    String field_x;
    private int field_z;
    private int field_t;
    private static String[] mazeGeneratorTypeNames;
    private int field_u;
    private int field_p;
    private int field_v;

    final int updateConnection(int param0) {
        int var2;
        if (param0 != 8) {
          return 102;
        }
        var2 = this.attemptReconnect((byte) -46);
        if (var2 == 0 ||
          var2 == 1) {
          if (hd.field_a[1]) {
            ql.a(2, -28521);
          }
          if (hd.field_a[2]) {
            PlantModel.resendPendingSubmissions(false, 3);
          }
          if (hd.field_a[3]) {
            S2CNextRoundPacket.resendQueuedRequests(4, 2);
          }
          if (hd.field_a[4]) {
            ArchiveNetworkClient.resendQueuedListRequests(5, -21);
          }
          if (hd.field_a[5]) {
            PlantComponent.resendPendingRequests(param0 ^ -109, 6);
          }
          if (hd.field_a[6]) {
            Puddle.resendRatingTableRequests(7, (byte) -105);
          }
          if (hd.field_a[8]) {
            GridLineWalker.a((byte) 5);
          }
        }
        return var2;
    }

    private final void storeSessionCookie(int param0) {
        if (param0 <= 95) {
          this.field_v = 64;
        }
        String var2 = LegacyTurbulentWaterNoise.readIncomingString(12);
        CourseMapPath.writeSessionCookie(55, ToolkitSelector.getApplet(78), var2);
    }

    private final void readServerTextMessage(byte param0) {
        int var2 = WeaveOperator.field_q.readUnsignedByte(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d - 1;
        if (param0 != -15) {
          AppletGameShell.resetConnectionStatics(39);
        }
        byte[] var5 = new byte[var4];
        WeaveOperator.field_q.readCipheredBytes(0, param0 - 103, var5, var4);
        SimpleBlockBehaviour.openUrl(param0 ^ -16, ToolkitSelector.getApplet(param0 + 82), jaa.decodeText((byte) 64, var5), var3 != 0);
    }

    final static boolean isFreeChatAllowed(int param0) {
        if (param0 != -1) {
          AppletGameShell.isFreeChatAllowed(12);
        }
        return !PowerDownItemBehaviour.field_s ? true : false;
    }

    final void enableMessageGroup6(int param0) {
        int var2 = -114 / ((param0 - 66) / 34);
        hd.field_a[6] = true;
    }

    private final int pollLoginResponse(byte param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          PacketBuffer var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = TombRacer.field_G ? 1 : 0;
          var4 = BlockComponent.a(ApproachPlayerLocomotor.field_t, pg.field_y, 103, param2);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = RasterBuffer.a(IntIntHashTable.createCredentials(-1), RotaterMountComponent.A(49), 2);
            if (-1 != var5) {
              WaveformOperator.a(PressureSwitchBehaviour.field_s, var5, io.field_b, (byte) 100);
              io.field_b = null;
              PressureSwitchBehaviour.field_s = null;
            }
            var12 = VoronoiNoiseOperator.e((byte) 78);
            if (var12 != null) {
              ScoreSubmission.a(2753, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = pe.a(CourseLayoutFactory.b(69), toa.a(false), ArchiveRequest.a(false), this.field_u, cs.a((byte) 105), MatchOverlayQueue.a(0), (byte) 53);
            if (var5Lifetime1 != -1) {
              TextureTransformMode.a(var5Lifetime1, PressureSwitchBehaviour.field_s, (byte) -103, io.field_b);
              PressureSwitchBehaviour.field_s = null;
              io.field_b = null;
            }
          }
          if (var4 == 3) {
            if (-1 != Trap.field_m &&
              Trap.field_m != 0) {
              Trap.field_m = -1;
              TrapSpawner.b(true);
            }
            if (param1) {
              TrackingCrusherComponent.field_G = false;
            } else {
              var5Lifetime2 = ChatOverlay.a(this.field_q, MatchOverlayQueue.a(0), 50, this.field_u, cs.a((byte) 81), false);
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 == 0) {
                  StatReportingObserverFactory.field_b = QuickChatPhraseSource.field_g;
                  LoadLevelCommand.g(0);
                  Transform3D.field_c = 10;
                  HorizontalGradientOperator.field_m = false;
                } else {
                  epa.handleLoginResponseCode(var5Lifetime2, (byte) -84, io.field_b);
                  io.field_b = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!TextureFormat.field_a) {
              HorizontalGradientOperator.field_m = true;
              Transform3D.field_c = 10;
            } else {
              cua.clearSessionAndReload((byte) -26, ToolkitSelector.getApplet(118));
            }
          }
          if (5 == var4) {
            ArchiveRequest.openQuitPage(ToolkitSelector.getApplet(104), (byte) -117);
          }
          if (var4 == 6 &&
            GameAssetLoader.field_t) {
            Transform3D.field_c = 10;
          }
          if (var4 == 7) {
            TextureFormat.openServerList(89, ToolkitSelector.getApplet(113));
          }
          if (8 == var4) {
            cua.clearSessionAndReload((byte) -65, ToolkitSelector.getApplet(37));
          }
          if (9 == var4) {
            IsaacCipher.openSupportPage(ToolkitSelector.getApplet(104), -87);
          }
          if (var4 == 10) {
            ql.field_k.writeCipheredOpcode(17, -2988);
          }
          if (11 == var4) {
            nt.reloadPage(ToolkitSelector.getApplet(41), -1978);
          }
          var5Lifetime3 = 70 / ((param0 + 35) / 35);
          if (var4 == 12) {
            SimpleHoverMountComponent.openRelativeUrl(mn.getPendingUrl(-128), ToolkitSelector.getApplet(28), (byte) -74);
          }
          if (13 == var4) {
            try {
              if (DarknessBehaviour.field_o == null) {
                DarknessBehaviour.field_o = new UrlDownloadRequest(dsa.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (DarknessBehaviour.field_o.poll(false)) {
                var7 = DarknessBehaviour.field_o.getResult((byte) -123);
                if (var7 != null) {
                  var8 = MaskBlendOperator.decodeCp1252(var7.payload, 0, var7.position, 255);
                  NodeHashTableIterator.a(var8, -1);
                } else {
                  var10 = (String) null;
                  NodeHashTableIterator.a((String) null, -1);
                }
                DarknessBehaviour.field_o = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              ClipStack.reportClientError("S1", (byte) 121, (Throwable) ((Object) var6));
              var11 = (String) null;
              NodeHashTableIterator.a((String) null, -1);
              DarknessBehaviour.field_o = null;
            }
          }
          if (var4 == 15) {
            Transform3D.field_c = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void initializeServices(byte param0, int param1, boolean param2) {
        this.initializeSharedServices(MultiplayerLoginMenu.field_r.field_c, ReportAbuseDialog.field_Eb.field_c, EffectEvent.field_l.field_c, C2SSubmitSettingsPacket.field_d.field_c, 5000, param1, rm.field_d.field_c, param2);
        if (param0 >= -25) {
          this.field_w = 116L;
        }
    }

    final void dispatchServerPacket(int param0) {
        int stackIn_24_0 = 0;
        boolean stackIn_25_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = MembersUpsellMenu.field_z;
        if (param0 != -5) {
          this.field_z = 113;
        }
        if (var2 < 64 &&
          hd.field_a[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            BrickOperator.d((byte) 82);
          } else {
            if (var2 == 2) {
              CrossedSineBandsOperator.handleHighscoreResponse(-95);
            } else {
              if (var2 == 3) {
                au.a(3);
              } else {
                if (var2 == 4) {
                  ScrollPanel.handlePendingRequestReply(0);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      WhirlpoolDigest.handleRankingsResponse((byte) -44);
                    } else {
                      if (var2 != 7) {
                        if (8 == var2) {
                          PlayerInputQueue.readReflectionCheckRequest(uca.field_d, dsa.field_c, (byte) 72, WeaveOperator.field_q);
                        } else {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                SweepRotateLocomotor.handleIgnoreListPacket(14180);
                                return;
                              }
                              if (var2 == 17) {
                                this.readServerTextMessage((byte) -15);
                                return;
                              }
                              if (var2 == 18) {
                                HardwareUnlitEffect.c((byte) 101);
                                return;
                              }
                              ClipStack.reportClientError("MGS1: " + kk.formatPacketDump(32), (byte) 123, (Throwable) null);
                              DropAnimation.closeGameSocket(60);
                              return;
                            }
                            stackIn_24_0 = -18787;
                            stackIn_25_1 = (var2 == 12);
                            var3 = ChatOverlay.readChatMessage(stackIn_24_0, stackIn_25_1);
                            k.handleIncomingChatMessage((byte) 113, var3);
                          } else {
                            RoomHeader.readLocalPlayerName((byte) -68);
                          }
                        }
                      } else {
                        this.storeSessionCookie(116);
                      }
                    }
                  } else {
                    FocusableWidget.a(param0 + 9);
                  }
                }
              }
            }
          }
          return;
        }
        ClipStack.reportClientError("MGS2: " + kk.formatPacketDump(32), (byte) 120, (Throwable) null);
        DropAnimation.closeGameSocket(60);
    }

    private final int attemptReconnect(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!uma.b(-1)) {
          return -1;
        }
        if (TrackingCrusherComponent.field_G) {
          return -1;
        }
        int var2 = ChatOverlay.a(this.field_q, MatchOverlayQueue.a(0), 50, this.field_u, cs.a((byte) -118), true);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2) {
          if (Transform3D.field_c != 11) {
            return var2;
          }
          if (0 != Trap.field_m) {
            return var2;
          }
          LoadLevelCommand.g(param0 + 46);
        } else {
          if (var2 != 1) {
            if (!fpa.field_c) {
              this.reportError(-6738, "reconnect");
            }
            TextureMetadata.b(param0);
            epa.handleLoginResponseCode(var2, (byte) -84, io.field_b);
            TrackingCrusherComponent.field_G = true;
            LegacyOpenGlPostProcessEffect.field_f = bva.currentTimeMillis((byte) -107) + 15000L;
            return var2;
          }
          if (Transform3D.field_c == 11 &&
            0 == Trap.field_m) {
            LoadLevelCommand.g(param0 + 46);
          }
        }
        return var2;
    }

    final int pollLogin(int param0, boolean param1) {
        if (param0 > -26) {
          return 16;
        }
        return this.pollLoginResponse((byte) 73, true, param1);
    }

    final void enableMessageGroup5(int param0) {
        hd.field_a[5] = true;
        if (param0 != 9822) {
          this.field_A = false;
        }
    }

    final void enableMessageGroup2(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
          this.field_t = -50;
        }
    }

    final void initializeDefaultServices(int param0, int param1) {
        this.initializeServices((byte) -86, param1, false);
        int var3 = 53 % ((param0 - 38) / 36);
    }

    public static void releaseStatics(int param0) {
        mazeGeneratorTypeNames = null;
        if (param0 != -1) {
          mazeGeneratorTypeNames = (String[]) null;
        }
    }

    private final void initializePacketLengths(int param0) {
        S2CEventPacket.field_c[11] = -1;
        S2CEventPacket.field_c[9] = -1;
        S2CEventPacket.field_c[5] = -1;
        S2CEventPacket.field_c[10] = -1;
        S2CEventPacket.field_c[6] = -2;
        S2CEventPacket.field_c[7] = -1;
        S2CEventPacket.field_c[4] = -1;
        S2CEventPacket.field_c[3] = -1;
        S2CEventPacket.field_c[12] = -1;
        S2CEventPacket.field_c[18] = 1;
        S2CEventPacket.field_c[1] = param0;
        S2CEventPacket.field_c[17] = -1;
        S2CEventPacket.field_c[16] = -1;
        S2CEventPacket.field_c[2] = -2;
        S2CEventPacket.field_c[8] = -2;
        S2CEventPacket.field_c[13] = -1;
    }

    final void enableMessageGroups11To13(byte param0) {
        hd.field_a[11] = true;
        hd.field_a[13] = true;
        hd.field_a[12] = true;
        if (param0 != 87) {
          this.field_u = 29;
        }
    }

    private final void initializeSharedServices(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ApproachPlayerLocomotor.field_t = this.field_z;
        FacePlayerLocomotor.applyLanguage(ApproachPlayerLocomotor.field_t, (byte) 65);
        IsaacCipher.configureClientConnection(this.field_s, this.field_v, dsa.field_c, this.field_p, this.field_x, this.field_t, 5000, param4, -1367135824, param7, this.field_A, ApproachPlayerLocomotor.field_t, param5, this.field_w);
        MazeSolver.initializeArchiveServices(ApproachPlayerLocomotor.field_t, dsa.field_c, 103, this.field_x, this.field_v, param5, this.field_p, this.field_s, this.field_t);
        wka.patchJavaKeyCodeMap(520);
        HardCacheEntry.field_q = dka.createMouseWheelInput((byte) -86);
        fpa.attachCanvasInput(CurveShape.field_l, (byte) 75);
        bi.field_c = param2;
        MonochromeFillOperator.field_p = param3;
        VertexArrayPointer.field_c = param6;
        RoomHeader.field_g = param1;
        SoundEvent.field_j = param0;
        this.initializePacketLengths(16);
        MirrorMoverLocomotor.f(29320);
    }

    final void enableMessageGroup4(byte param0) {
        hd.field_a[4] = true;
        if (param0 >= -45) {
          this.enableMessageGroup1(120);
        }
    }

    final void readAppletParameters(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.isHostAllowed((byte) 51)) {
              return;
            }
            this.field_x = this.getCodeBase().getHost();
            var6 = this.field_x.toLowerCase();
            if (param4 != 20575) {
              this.enableMessageGroup1(118);
            }
            stackIn_10_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_q = stackIn_10_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_t = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_s = Integer.parseInt(var7);
            }
            this.field_v = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_A = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_u = Integer.parseInt(var9);
            }
            NotLoggedInMenu.field_r = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletShell(false, param2, param1, param0, this.field_v, 32, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ClipStack.reportClientError((String) null, (byte) 126, (Throwable) ((Object) var6_ref));
            this.reportError(-6738, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void resetConnectionStatics(int param0) {
        qoa.field_a = false;
        if (param0 != -18) {
          return;
        }
        ToggleMusicChannelCommand.field_o = null;
        cia.field_a = null;
        C2SActionPacket.field_k = null;
        pm.field_d = null;
    }

    final void r(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 89) {
          AppletGameShell.resetConnectionStatics(-80);
        }
        if (QuickChatPhraseDefinition.c((byte) 49)) {
          discarded$1 = this.pollLoginResponse((byte) -72, false, null != ColourRowCacheEntry.field_f ? true : false);
        } else {
          if (cga.field_f < 10) {
          } else {
            if (!LegacyOpenGlSpriteTexture.i(250)) {
              PressureSwitchComponent.C(-5);
            } else {
              if (0 == Transform3D.field_c) {
                discarded$3 = this.pollLoginResponse((byte) -111, false, false);
              } else {
                tc.a(pg.field_y, -2886);
              }
            }
          }
        }
    }

    final void serviceFramework(byte param0, boolean param1) {
        int stackIn_26_0 = 0;
        boolean stackIn_101_0 = false;
        boolean stackIn_104_1 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4_ref_java_awt_Dimension;
        int var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null != OpenGlSceneLight.field_o) {
          if (null == ColourRowCacheEntry.field_f) {
            var6 = VertexArrayPointer.getTopContainer(25128);
            var4_ref_java_awt_Dimension = var6.getSize();
            OpenGlSceneLight.field_o.setRequestedSize(var4_ref_java_awt_Dimension.width, false, var4_ref_java_awt_Dimension.height);
          }
          OpenGlSceneLight.field_o.update(false);
        }
        DisplaySettingsDialog.updateKeyboardStateForFrame(3321);
        BoulderComponent.snapshotMouseInput((byte) -44);
        if (!ColourGradientOperator.isLoginFlowIncomplete(-112) &&
          Transform3D.field_c != 11) {
          EditableTextField.h(100);
        }
        if (null != HardCacheEntry.field_q) {
          pg.field_y = HardCacheEntry.field_q.pollWheelRotation(65);
        }
        if (HeapIndexArray.e(540800)) {
          var3 = aqa.getFrameRate(1188664449) * 1200;
          if (this.field_y ||
            !(rg.g((byte) 118) <= var3) &&
            !(var3 >= ada.b(false))) {
            this.field_y = false;
            DropAnimation.closeGameSocket(60);
            TextureMetadata.b((byte) -84);
            epa.handleLoginResponseCode(2, (byte) -84, WindZoneBehaviour.field_n);
            LineNoiseOperator.c(9033);
            TrackingCrusherComponent.field_G = true;
            LegacyOpenGlPostProcessEffect.field_f = 15000L + bva.currentTimeMillis((byte) -107);
          }
        }
        if (Trap.field_m == -1 ||
          0 == Trap.field_m) {
          stackIn_26_0 = (Trap.field_m != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          Trap.field_m = BlockComponent.pollArchiveNetwork(61);
          if (var3Lifetime1 != 0 &&
            Trap.field_m == 0 &&
            Transform3D.field_c == 11 &&
            !uma.b(-1)) {
            LoadLevelCommand.g(0);
          }
          if (Trap.field_m != -1 &&
            Trap.field_m != 0) {
            LegacyOpenGlPostProcessEffect.field_f = bva.currentTimeMillis((byte) -107) + 15000L;
          }
        }
        if (-1 != Trap.field_m &&
          Trap.field_m != 0) {
          if (cga.field_f < 10) {
            if (Trap.field_m != 3) {
              if (Trap.field_m == 4) {
                this.reportError(-6738, "js5io");
              } else {
                if (Trap.field_m == 2) {
                  this.reportError(-6738, "js5connect_full");
                } else {
                  if (Trap.field_m != 5) {
                    this.reportError(-6738, "js5connect");
                  } else {
                    this.reportError(-6738, "outofdate");
                  }
                }
              }
            } else {
              this.reportError(-6738, "js5crc");
            }
          } else {
            if (Transform3D.field_c >= 10) {
              TextureMetadata.b((byte) -123);
              if (Trap.field_m != 3) {
                if (Trap.field_m != 4) {
                  if (Trap.field_m != 2) {
                    if (Trap.field_m != 5) {
                      epa.handleLoginResponseCode(256, (byte) -84, GasTrapComponent.field_H);
                    } else {
                      epa.handleLoginResponseCode(5, (byte) -84, wq.field_a);
                    }
                  } else {
                    epa.handleLoginResponseCode(256, (byte) -84, NativeSceneLight.field_r);
                  }
                } else {
                  epa.handleLoginResponseCode(256, (byte) -84, ConsoleWindow.field_e);
                }
              } else {
                epa.handleLoginResponseCode(256, (byte) -84, MatchingTextValidator.field_l);
              }
              TrackingCrusherComponent.field_G = true;
            }
          }
        }
        if ((Trap.field_m != -1 &&
          Trap.field_m != 0 ||
          uma.b(-1)) &&
          LegacyOpenGlPostProcessEffect.field_f <= bva.currentTimeMillis((byte) -107)) {
          TrackingCrusherComponent.field_G = false;
          if (-1 != Trap.field_m &&
            Trap.field_m != 0) {
            Trap.field_m = -1;
            TrapSpawner.b(true);
          }
        }
        if (Trap.field_m == 0 &&
          !uma.b(-1)) {
          UnlockOverlay.field_l = false;
        }
        if (cga.field_f == 0 &&
          FuseBehaviour.loadMasterIndex((byte) -117)) {
          cga.field_f = 1;
        }
        if (cga.field_f == 1) {
          if (0 != ApproachPlayerLocomotor.field_t) {
            InvisibleTouchSwitchComponent.field_J = SoftReferenceCache.openArchive(MonochromeFillOperator.field_p, 1);
          }
          tk.field_b = FacePointLocomotor.openArchive(true, RoomHeader.field_g, false, 1, (byte) -95);
          OpenGlTexture2D.field_n = FacePointLocomotor.openArchive(true, bi.field_c, false, 1, (byte) -109);
          WeaveOperator.field_p = FacePointLocomotor.openArchive(true, SoundEvent.field_j, false, 1, (byte) -79);
          cga.field_f = 2;
          PitComponent.field_G = tk.field_b;
          ota.field_b = OpenGlTexture2D.field_n;
        }
        if (cga.field_f == 2) {
          if (null != InvisibleTouchSwitchComponent.field_J &&
            InvisibleTouchSwitchComponent.field_J.ensureIndex(-79)) {
            if (InvisibleTouchSwitchComponent.field_J.hasGroupName("", 108)) {
              if (InvisibleTouchSwitchComponent.field_J.isGroupAvailableByName("", -127)) {
                TextResourceLoader.loadStrings((byte) -45, InvisibleTouchSwitchComponent.field_J);
                InvisibleTouchSwitchComponent.field_J = null;
                C2SActionPacket.resetFrameTiming(-33);
              }
            } else {
              InvisibleTouchSwitchComponent.field_J = null;
            }
          }
          if (null == InvisibleTouchSwitchComponent.field_J) {
            cga.field_f = 3;
          }
        }
        if (cga.field_f == 3 &&
          esa.areCommonUiArchivesReady(WeaveOperator.field_p, tk.field_b, -128, OpenGlTexture2D.field_n) &&
          S2CActionPacket.isArchiveComplete(WeaveOperator.field_p, (byte) -53)) {
          ee.releaseStatics(-1);
          SimulationObserver.composeAgreementText((byte) -27);
          TextureTransformMode.field_b = LoginMethod.field_c;
          GameAssetLoader.field_t = false;
          SequencePlayer.a(tk.field_b, OpenGlTexture2D.field_n, 1, TextureFormat.field_a, WeaveOperator.field_p);
          if (ResizingDialog.field_I ||
            null != BrickOperator.field_s) {
            stackIn_101_0 = !(ResizingDialog.field_I);
            stackIn_104_1 = !(ResizingDialog.field_I);
            FollowCamera.openLoginForm(stackIn_101_0, stackIn_104_1, false, BrickOperator.field_s);
          }
          if (NotLoggedInMenu.field_r) {
            S2CPlayerProfilePacket.b(true);
          }
          if (null == ScoreStandings.field_c) {
            ScoreStandings.field_c = epa.getPcmStreamMixer((byte) -91);
            TextureOperator.field_k = fta.c(-93);
          }
          MapWaypoint.initLogoAssets(ScoreStandings.field_c, TextureOperator.field_k, 11861, WeaveOperator.field_p);
          OpenGlTexture2D.field_n = null;
          tk.field_b = null;
          WeaveOperator.field_p = null;
          StatefulWidgetPainter.checkAppletUsername((java.applet.Applet) (this), (byte) -128);
          C2SActionPacket.resetFrameTiming(-33);
          cga.field_f = 10;
        }
        if (10 == cga.field_f) {
          if (ApproachPlayerLocomotor.field_t != 0) {
            ConstrainToFacingArcLocomotor.field_v = SoftReferenceCache.openArchive(VertexArrayPointer.field_c, 1);
          }
          cga.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        var3Lifetime2 = 69 % ((param0 + 63) / 62);
        if (cga.field_f == 11) {
          if (ConstrainToFacingArcLocomotor.field_v != null && (!ConstrainToFacingArcLocomotor.field_v.ensureIndex(-100) ||
            !ConstrainToFacingArcLocomotor.field_v.areAllGroupsAvailable(0))) {
            ima.setLoadingProgress(0.0f, S2CEventPacket.formatLoadingProgress(CrossedSineBandsOperator.field_s, hra.field_c, ConstrainToFacingArcLocomotor.field_v, (byte) 92), -80);
            decompiledFrameRemainder0 = false;
          }
          else {
            PlatformBehaviour.field_w = true;
            cga.field_f = 12;
          }
        }
        if (12 == cga.field_f &&
          !PlatformBehaviour.field_w) {
          cga.field_f = 13;
        }
        if (cga.field_f == 13) {
          var4 = 1;
          if (null != RidgedNoise3D.field_r) {
            stackIn_133_0 = (!RidgedNoise3D.field_r.pollLoaded((byte) 37)) ? 0 : 1;
            var4 = stackIn_133_0;
            ima.setLoadingProgress(RidgedNoise3D.field_r.field_i, RidgedNoise3D.field_r.field_b, -65);
          }
          if (var4 != 0) {
            cga.field_f = 20;
          }
        }
        if (!param1 &&
          ReportAbuseDialog.field_Cb) {
          CharacterChoiceFactory.detachCanvasInput(CurveShape.field_l, false);
          this.recreateCanvas((byte) 14);
          fpa.attachCanvasInput(CurveShape.field_l, (byte) 75);
        }
        if (hd.field_a[8]) {
          dra.sendReflectionCheckResponses(true);
        }
    }

    final void enableDefaultMessageGroups(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
          this.enableMessageGroups11To13((byte) 96);
        }
        hd.field_a[8] = param1;
        hd.field_a[7] = true;
        hd.field_a[16] = true;
        hd.field_a[0] = true;
        hd.field_a[17] = true;
        hd.field_a[18] = true;
    }

    AppletGameShell() {
    }

    final void enableMessageGroup1(int param0) {
        hd.field_a[1] = true;
        if (param0 != -1) {
          this.field_t = -30;
        }
    }

    static {
        mazeGeneratorTypeNames = new String[4];
        mazeGeneratorTypeNames[2] = "Prim's Algorithm";
        mazeGeneratorTypeNames[0] = "Recursive Backtracker";
        mazeGeneratorTypeNames[1] = "Striped";
        mazeGeneratorTypeNames[3] = "Division";
    }
}
