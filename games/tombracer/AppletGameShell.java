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

    final int t(int param0) {
        int var2;
        if (param0 != 8) {
          return 102;
        }
        var2 = this.e((byte) -46);
        if (var2 == 0 ||
          var2 == 1) {
          if (hd.field_a[1]) {
            ql.a(2, -28521);
          }
          if (hd.field_a[2]) {
            PlantModel.b(false, 3);
          }
          if (hd.field_a[3]) {
            S2CNextRoundPacket.b(4, 2);
          }
          if (hd.field_a[4]) {
            ArchiveNetworkClient.resendQueuedListRequests(5, -21);
          }
          if (hd.field_a[5]) {
            PlantComponent.b(param0 ^ -109, 6);
          }
          if (hd.field_a[6]) {
            Puddle.b(7, (byte) -105);
          }
          if (hd.field_a[8]) {
            nf.a((byte) 5);
          }
        }
        return var2;
    }

    private final void k(int param0) {
        if (param0 <= 95) {
          this.field_v = 64;
        }
        String var2 = LegacyTurbulentWaterNoise.f(12);
        cc.a(55, di.a(78), var2);
    }

    private final void f(byte param0) {
        int var2 = WeaveOperator.field_q.readUnsignedByte(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d - 1;
        if (param0 != -15) {
          AppletGameShell.n(39);
        }
        byte[] var5 = new byte[var4];
        WeaveOperator.field_q.a(0, param0 - 103, var5, var4);
        SimpleBlockBehaviour.a(param0 ^ -16, di.a(param0 + 82), jaa.decodeText((byte) 64, var5), var3 != 0);
    }

    final static boolean isFreeChatAllowed(int param0) {
        if (param0 != -1) {
          AppletGameShell.isFreeChatAllowed(12);
        }
        return !PowerDownItemBehaviour.field_s ? true : false;
    }

    final void p(int param0) {
        int var2 = -114 / ((param0 - 66) / 34);
        hd.field_a[6] = true;
    }

    private final int a(byte param0, boolean param1, boolean param2) {
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
            var5 = RasterBuffer.a(pla.a(-1), RotaterMountComponent.A(49), 2);
            if (-1 != var5) {
              WaveformOperator.a(PressureSwitchBehaviour.field_s, var5, io.field_b, (byte) 100);
              io.field_b = null;
              PressureSwitchBehaviour.field_s = null;
            }
            var12 = VoronoiNoiseOperator.e((byte) 78);
            if (var12 != null) {
              kb.a(2753, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = pe.a(vk.b(69), toa.a(false), ArchiveRequest.a(false), this.field_u, cs.a((byte) 105), cja.a(0), (byte) 53);
            if (var5Lifetime1 != -1) {
              ura.a(var5Lifetime1, PressureSwitchBehaviour.field_s, (byte) -103, io.field_b);
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
              var5Lifetime2 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) 81), false);
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 == 0) {
                  ic.field_b = tr.field_g;
                  LoadLevelCommand.g(0);
                  Transform3D.field_c = 10;
                  HorizontalGradientOperator.field_m = false;
                } else {
                  epa.a(var5Lifetime2, (byte) -84, io.field_b);
                  io.field_b = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!ft.field_a) {
              HorizontalGradientOperator.field_m = true;
              Transform3D.field_c = 10;
            } else {
              cua.a((byte) -26, di.a(118));
            }
          }
          if (5 == var4) {
            ArchiveRequest.openQuitPage(di.a(104), (byte) -117);
          }
          if (var4 == 6 &&
            GameAssetLoader.field_t) {
            Transform3D.field_c = 10;
          }
          if (var4 == 7) {
            ft.a(89, di.a(113));
          }
          if (8 == var4) {
            cua.a((byte) -65, di.a(37));
          }
          if (9 == var4) {
            IsaacCipher.openSupportPage(di.a(104), -87);
          }
          if (var4 == 10) {
            ql.field_k.writeCipheredOpcode(17, -2988);
          }
          if (11 == var4) {
            nt.a(di.a(41), -1978);
          }
          var5Lifetime3 = 70 / ((param0 + 35) / 35);
          if (var4 == 12) {
            SimpleHoverMountComponent.a(mn.g(-128), di.a(28), (byte) -74);
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
              ssa.a("S1", (byte) 121, (Throwable) ((Object) var6));
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

    private final void a(byte param0, int param1, boolean param2) {
        this.initializeSharedServices(MultiplayerLoginMenu.field_r.field_c, ReportAbuseDialog.field_Eb.field_c, EffectEvent.field_l.field_c, C2SSubmitSettingsPacket.field_d.field_c, 5000, param1, rm.field_d.field_c, param2);
        if (param0 >= -25) {
          this.field_w = 116L;
        }
    }

    final void dispatchServerPacket(int param0) {
        int stackIn_24_0 = 0;
        boolean stackIn_25_1 = false;
        int var2;
        gqa var3;
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
              CrossedSineBandsOperator.d(-95);
            } else {
              if (var2 == 3) {
                au.a(3);
              } else {
                if (var2 == 4) {
                  ScrollPane.f(0);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      WhirlpoolDigest.a((byte) -44);
                    } else {
                      if (var2 != 7) {
                        if (8 == var2) {
                          kq.a(uca.field_d, dsa.field_c, (byte) 72, WeaveOperator.field_q);
                        } else {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                SweepRotateLocomotor.e(14180);
                                return;
                              }
                              if (var2 == 17) {
                                this.f((byte) -15);
                                return;
                              }
                              if (var2 == 18) {
                                HardwareUnlitEffect.c((byte) 101);
                                return;
                              }
                              ssa.a("MGS1: " + kk.a(32), (byte) 123, (Throwable) null);
                              dea.a(60);
                              return;
                            }
                            stackIn_24_0 = -18787;
                            stackIn_25_1 = (var2 == 12);
                            var3 = ila.a(stackIn_24_0, stackIn_25_1);
                            k.a((byte) 113, var3);
                          } else {
                            fq.a((byte) -68);
                          }
                        }
                      } else {
                        this.k(116);
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
        ssa.a("MGS2: " + kk.a(32), (byte) 120, (Throwable) null);
        dea.a(60);
    }

    private final int e(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!uma.b(-1)) {
          return -1;
        }
        if (TrackingCrusherComponent.field_G) {
          return -1;
        }
        int var2 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) -118), true);
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
            dw.b(param0);
            epa.a(var2, (byte) -84, io.field_b);
            TrackingCrusherComponent.field_G = true;
            oga.field_f = bva.currentTimeMillis((byte) -107) + 15000L;
            return var2;
          }
          if (Transform3D.field_c == 11 &&
            0 == Trap.field_m) {
            LoadLevelCommand.g(param0 + 46);
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        if (param0 > -26) {
          return 16;
        }
        return this.a((byte) 73, true, param1);
    }

    final void o(int param0) {
        hd.field_a[5] = true;
        if (param0 != 9822) {
          this.field_A = false;
        }
    }

    final void j(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
          this.field_t = -50;
        }
    }

    final void a(int param0, int param1) {
        this.a((byte) -86, param1, false);
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

    final void d(byte param0) {
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
        FacePlayerLocomotor.b(ApproachPlayerLocomotor.field_t, (byte) 65);
        IsaacCipher.configureClientConnection(this.field_s, this.field_v, dsa.field_c, this.field_p, this.field_x, this.field_t, 5000, param4, -1367135824, param7, this.field_A, ApproachPlayerLocomotor.field_t, param5, this.field_w);
        av.a(ApproachPlayerLocomotor.field_t, dsa.field_c, 103, this.field_x, this.field_v, param5, this.field_p, this.field_s, this.field_t);
        wka.patchJavaKeyCodeMap(520);
        tja.field_q = dka.createMouseWheelInput((byte) -86);
        fpa.a(nma.field_l, (byte) 75);
        bi.field_c = param2;
        MonochromeFillOperator.field_p = param3;
        tj.field_c = param6;
        fq.field_g = param1;
        fm.field_j = param0;
        this.initializePacketLengths(16);
        MirrorMoverLocomotor.f(29320);
    }

    final void g(byte param0) {
        hd.field_a[4] = true;
        if (param0 >= -45) {
          this.s(120);
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
              this.s(118);
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
            ssa.a((String) null, (byte) 126, (Throwable) ((Object) var6_ref));
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
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void n(int param0) {
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
          AppletGameShell.n(-80);
        }
        if (QuickChatPhraseDefinition.c((byte) 49)) {
          discarded$1 = this.a((byte) -72, false, null != dq.field_f ? true : false);
        } else {
          if (cga.field_f < 10) {
          } else {
            if (!LegacyOpenGlSpriteTexture.i(250)) {
              PressureSwitchComponent.C(-5);
            } else {
              if (0 == Transform3D.field_c) {
                discarded$3 = this.a((byte) -111, false, false);
              } else {
                tc.a(pg.field_y, -2886);
              }
            }
          }
        }
    }

    final void c(byte param0, boolean param1) {
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
          if (null == dq.field_f) {
            var6 = tj.b(25128);
            var4_ref_java_awt_Dimension = var6.getSize();
            OpenGlSceneLight.field_o.a(var4_ref_java_awt_Dimension.width, false, var4_ref_java_awt_Dimension.height);
          }
          OpenGlSceneLight.field_o.a(false);
        }
        DisplaySettingsDialog.j(3321);
        BoulderComponent.snapshotMouseInput((byte) -44);
        if (!ColourGradientOperator.c(-112) &&
          Transform3D.field_c != 11) {
          sw.h(100);
        }
        if (null != tja.field_q) {
          pg.field_y = tja.field_q.b(65);
        }
        if (o.e(540800)) {
          var3 = aqa.a(1188664449) * 1200;
          if (this.field_y ||
            !(rg.g((byte) 118) <= var3) &&
            !(var3 >= ada.b(false))) {
            this.field_y = false;
            dea.a(60);
            dw.b((byte) -84);
            epa.a(2, (byte) -84, WindZoneBehaviour.field_n);
            LineNoiseOperator.c(9033);
            TrackingCrusherComponent.field_G = true;
            oga.field_f = 15000L + bva.currentTimeMillis((byte) -107);
          }
        }
        if (Trap.field_m == -1 ||
          0 == Trap.field_m) {
          stackIn_26_0 = (Trap.field_m != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          Trap.field_m = BlockComponent.A(61);
          if (var3Lifetime1 != 0 &&
            Trap.field_m == 0 &&
            Transform3D.field_c == 11 &&
            !uma.b(-1)) {
            LoadLevelCommand.g(0);
          }
          if (Trap.field_m != -1 &&
            Trap.field_m != 0) {
            oga.field_f = bva.currentTimeMillis((byte) -107) + 15000L;
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
              dw.b((byte) -123);
              if (Trap.field_m != 3) {
                if (Trap.field_m != 4) {
                  if (Trap.field_m != 2) {
                    if (Trap.field_m != 5) {
                      epa.a(256, (byte) -84, GasTrapComponent.field_H);
                    } else {
                      epa.a(5, (byte) -84, wq.field_a);
                    }
                  } else {
                    epa.a(256, (byte) -84, NativeSceneLight.field_r);
                  }
                } else {
                  epa.a(256, (byte) -84, ConsoleWindow.field_e);
                }
              } else {
                epa.a(256, (byte) -84, MatchingTextValidator.field_l);
              }
              TrackingCrusherComponent.field_G = true;
            }
          }
        }
        if ((Trap.field_m != -1 &&
          Trap.field_m != 0 ||
          uma.b(-1)) &&
          oga.field_f <= bva.currentTimeMillis((byte) -107)) {
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
          FuseBehaviour.k((byte) -117)) {
          cga.field_f = 1;
        }
        if (cga.field_f == 1) {
          if (0 != ApproachPlayerLocomotor.field_t) {
            InvisibleTouchSwitchComponent.field_J = SoftReferenceCache.openArchive(MonochromeFillOperator.field_p, 1);
          }
          tk.field_b = FacePointLocomotor.a(true, fq.field_g, false, 1, (byte) -95);
          OpenGlTexture2D.field_n = FacePointLocomotor.a(true, bi.field_c, false, 1, (byte) -109);
          WeaveOperator.field_p = FacePointLocomotor.a(true, fm.field_j, false, 1, (byte) -79);
          cga.field_f = 2;
          PitComponent.field_G = tk.field_b;
          ota.field_b = OpenGlTexture2D.field_n;
        }
        if (cga.field_f == 2) {
          if (null != InvisibleTouchSwitchComponent.field_J &&
            InvisibleTouchSwitchComponent.field_J.b(-79)) {
            if (InvisibleTouchSwitchComponent.field_J.a("", 108)) {
              if (InvisibleTouchSwitchComponent.field_J.c("", -127)) {
                TextResourceLoader.loadStrings((byte) -45, InvisibleTouchSwitchComponent.field_J);
                InvisibleTouchSwitchComponent.field_J = null;
                C2SActionPacket.a(-33);
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
          S2CActionPacket.a(WeaveOperator.field_p, (byte) -53)) {
          ee.a(-1);
          SimulationObserver.composeAgreementText((byte) -27);
          ura.field_b = nl.field_c;
          GameAssetLoader.field_t = false;
          cra.a(tk.field_b, OpenGlTexture2D.field_n, 1, ft.field_a, WeaveOperator.field_p);
          if (ofa.field_I ||
            null != BrickOperator.field_s) {
            stackIn_101_0 = !(ofa.field_I);
            stackIn_104_1 = !(ofa.field_I);
            ag.a(stackIn_101_0, stackIn_104_1, false, BrickOperator.field_s);
          }
          if (NotLoggedInMenu.field_r) {
            S2CPlayerProfilePacket.b(true);
          }
          if (null == sma.field_c) {
            sma.field_c = epa.d((byte) -91);
            TextureOperator.field_k = fta.c(-93);
          }
          wk.a(sma.field_c, TextureOperator.field_k, 11861, WeaveOperator.field_p);
          OpenGlTexture2D.field_n = null;
          tk.field_b = null;
          WeaveOperator.field_p = null;
          StatefulWidgetPainter.checkAppletUsername((java.applet.Applet) (this), (byte) -128);
          C2SActionPacket.a(-33);
          cga.field_f = 10;
        }
        if (10 == cga.field_f) {
          if (ApproachPlayerLocomotor.field_t != 0) {
            ConstrainToFacingArcLocomotor.field_v = SoftReferenceCache.openArchive(tj.field_c, 1);
          }
          cga.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        var3Lifetime2 = 69 % ((param0 + 63) / 62);
        if (cga.field_f == 11) {
          if (ConstrainToFacingArcLocomotor.field_v != null && (!ConstrainToFacingArcLocomotor.field_v.b(-100) ||
            !ConstrainToFacingArcLocomotor.field_v.a(0))) {
            ima.a(0.0f, S2CEventPacket.a(CrossedSineBandsOperator.field_s, hra.field_c, ConstrainToFacingArcLocomotor.field_v, (byte) 92), -80);
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
            stackIn_133_0 = (!RidgedNoise3D.field_r.a((byte) 37)) ? 0 : 1;
            var4 = stackIn_133_0;
            ima.a(RidgedNoise3D.field_r.field_i, RidgedNoise3D.field_r.field_b, -65);
          }
          if (var4 != 0) {
            cga.field_f = 20;
          }
        }
        if (!param1 &&
          ReportAbuseDialog.field_Cb) {
          pq.a(nma.field_l, false);
          this.recreateCanvas((byte) 14);
          fpa.a(nma.field_l, (byte) 75);
        }
        if (hd.field_a[8]) {
          dra.a(true);
        }
    }

    final void b(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
          this.d((byte) 96);
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

    final void s(int param0) {
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
