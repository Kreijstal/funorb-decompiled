/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameConnectionShell extends AppletGameShell {
    private int gameCrc;
    static RgbSprite[][] halloweenSegsSprites;
    String host;
    static RgbSprite[] field_D;
    private int languageId;
    private int affiliateId;
    static int clientStage;
    private long instanceId;
    static String field_z;
    private boolean reconnectRequested;
    private boolean jagexHost;
    private boolean memberAccount;
    private int gamePortOne;
    static boolean field_t;
    private int serverNumber;
    private int gamePortTwo;

    private final void f(boolean param0) {
        String var2 = go.a((byte) 120);
        ArchiveNetworkRequest.a(var2, 70, uc.e((byte) -116));
        if (!param0) {
          this.g(false);
        }
    }

    private final void initializePacketLengths(int obfuscationGuard) {
        ch.incomingPacketLengths[6] = -2;
        if (obfuscationGuard <= 116) {
          return;
        }
        ch.incomingPacketLengths[1] = 16;
        ch.incomingPacketLengths[18] = 1;
        ch.incomingPacketLengths[11] = -1;
        ch.incomingPacketLengths[9] = -1;
        ch.incomingPacketLengths[2] = -2;
        ch.incomingPacketLengths[5] = -1;
        ch.incomingPacketLengths[10] = -1;
        ch.incomingPacketLengths[7] = -1;
        ch.incomingPacketLengths[12] = -1;
        ch.incomingPacketLengths[13] = -1;
        ch.incomingPacketLengths[17] = -1;
        ch.incomingPacketLengths[8] = -2;
        ch.incomingPacketLengths[4] = -1;
        ch.incomingPacketLengths[3] = -1;
        ch.incomingPacketLengths[16] = -1;
    }

    final void initializeApplet(String gameName, int gameVersion, int obfuscationGuard) {
        try {
          this.loadAppletParameters(103, gameName, gameVersion, 640, 480);
          if (obfuscationGuard != 1686) {
            field_D = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qg.EA(" + (gameName != null ? "{...}" : "null") + ',' + gameVersion + ',' + obfuscationGuard + ')');
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        cd.field_e = this.languageId;
        hk.a(cd.field_e, (byte) 125);
        GzipInflater.a(param7, this.host, this.memberAccount, this.serverNumber, 5000, 5000, cd.field_e, this.gameCrc, lp.field_ub, (byte) 123, param3, this.instanceId, this.gamePortTwo, this.gamePortOne);
        cr.a(param7, cd.field_e, param0 + 3, this.gamePortOne, lp.field_ub, this.host, this.gamePortTwo, this.gameCrc, this.serverNumber);
        BoundedFile.patchJavaKeyCodeMap(59);
        NinjaBackground.mouseWheelSource = ea.createMouseWheelSource(60);
        ap.a((byte) 117, CacheIoRequest.field_D);
        nd.field_c = param4;
        LevelPackCard.field_i = param5;
        PacketBuffer.field_j = param1;
        o.field_f = param6;
        ea.field_c = param2;
        if (param0 != 39) {
          this.g(false);
        }
        this.initializePacketLengths(123);
        oc.c((byte) -35);
    }

    final static RgbSprite a(RgbSprite param0, int param1) {
        int var12 = 0;
        int var13 = 0;
        RgbSprite stackIn_39_0 = null;
        RgbSprite stackIn_47_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var14 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.height;
          var3 = param0.width;
          var4 = param0.pixels;
          var5 = var2_int - 1;
          scanLoop1: while (true) {
            if (var5 >= 0) {
              var6 = var5 * var3;
              for (var7 = 0; var7 < var3; var7++) {
                if (var4[var7 + var6] != 16777215) {
                  break scanLoop1;
                }
              }
              var5--;
              continue;
            }
            break;
          }
          var6Lifetime1 = 0;
          scanLoop2: while (true) {
            if (var6Lifetime1 < var5) {
              var7Lifetime1 = var3 * var6Lifetime1;
              for (var8 = 0; var8 < var3; var8++) {
                if (var4[var8 + var7Lifetime1] != 16777215) {
                  break scanLoop2;
                }
              }
              var6Lifetime1++;
              continue;
            }
            break;
          }
          var7Lifetime2 = -1 + var3;
          if (param1 != 1) {
            field_z = (String) null;
          }
          scanLoop3: while (true) {
            if (var7Lifetime2 >= 0) {
              for (var8Lifetime1 = var6Lifetime1; var5 >= var8Lifetime1; var8Lifetime1++) {
                if (16711422 != var4[var7Lifetime2 + var8Lifetime1 * var3]) {
                  break scanLoop3;
                }
              }
              var7Lifetime2--;
              continue;
            }
            break;
          }
          var8Lifetime2 = 0;
          scanLoop4: while (true) {
            if (var7Lifetime2 > var8Lifetime2) {
              for (var9 = var6Lifetime1; var5 >= var9; var9++) {
                if (var4[var9 * var3 + var8Lifetime2] != 16711422) {
                  break scanLoop4;
                }
              }
              var8Lifetime2++;
              continue;
            }
            break;
          }
          if (var8Lifetime2 == 0 &&
            var7Lifetime2 == var3 - 1 &&
            var6Lifetime1 == 0 &&
            var2_int - 1 == var5) {
            stackIn_39_0 = (RgbSprite) (param0);
            return stackIn_39_0;
          }
          var9Lifetime1 = -var8Lifetime2 + (1 + var7Lifetime2);
          var10 = -var6Lifetime1 + 1 + var5;
          var11 = new int[var10 * var9Lifetime1];
          for (var12 = 0; var12 < var10; var12++) {
            for (var13 = 0; var13 < var9Lifetime1; var13++) {
              var11[var9Lifetime1 * var12 + var13] = var4[var3 * (var12 + var6Lifetime1) + var8Lifetime2 + var13];
            }
          }
          param0.width = var9Lifetime1;
          param0.offsetX = param0.offsetX + var8Lifetime2;
          param0.height = var10;
          param0.pixels = var11;
          param0.offsetY = param0.offsetY + var6Lifetime1;
          stackIn_47_0 = (RgbSprite) (param0);
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("qg.KA(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int n(int param0) {
        if (this.field_d) {
          return -1;
        }
        if (!ui.a(false)) {
          return -1;
        }
        if (n.field_e) {
          return -1;
        }
        int var2 = wp.a(LevelSelectScreen.d(true), true, true, this.jagexHost, this.affiliateId, MotionWaypoint.b(false));
        if (var2 == param0) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (AchievementIcon.field_j == 11 &&
            tm.field_a == 0) {
            ei.b(~param0);
          }
          return var2;
        }
        if (!hk.field_R) {
          this.a("reconnect", 4000);
        }
        FarmBackground.g(108);
        tf.a(DirectByteStorage.field_e, (byte) -61, var2);
        n.field_e = true;
        NanoGameClock.field_i = MonotonicTime.nowMillis(false) + 15000L;
        return var2;
    }

    final void enablePacketOne(int obfuscationGuard) {
        uf.enabledCommonPackets[1] = true;
        if (obfuscationGuard != 12) {
          this.affiliateId = 30;
        }
    }

    final int o(int param0) {
        int var2 = this.n(-1);
        if (var2 == 0 ||
          var2 == 1) {
          if (uf.enabledCommonPackets[1]) {
            ie.a(2, (byte) -46);
          }
          if (uf.enabledCommonPackets[2]) {
            ff.a((byte) -61, 3);
          }
          if (uf.enabledCommonPackets[3]) {
            TooltipSprite.resendPendingAchievements(4, 13330);
          }
          if (uf.enabledCommonPackets[4]) {
            ui.a(5, (byte) 115);
          }
          if (uf.enabledCommonPackets[5]) {
            hj.b(6, 0);
          }
          if (uf.enabledCommonPackets[6]) {
            qn.a((byte) 119, 7);
          }
          if (uf.enabledCommonPackets[8]) {
            we.a((byte) -46);
          }
        }
        int var3 = -122 % ((-43 - param0) / 60);
        return var2;
    }

    final int b(boolean param0, byte param1) {
        if (param1 != -118) {
          this.o(30);
        }
        return this.a(param0, (byte) 46, true);
    }

    final void enablePacketSix(int obfuscationGuard) {
        if (obfuscationGuard <= 28) {
          this.initializePacketLengths(-5);
        }
        uf.enabledCommonPackets[6] = true;
    }

    final void enablePacketsElevenToThirteen(byte obfuscationGuard) {
        uf.enabledCommonPackets[12] = true;
        uf.enabledCommonPackets[11] = true;
        if (obfuscationGuard != -19) {
          return;
        }
        uf.enabledCommonPackets[13] = true;
    }

    final static void a(int param0, int param1, byte param2) {
        NewAchievementsScreen.field_J = param0;
        ea.field_e = param1;
        if (param2 > -110) {
          field_z = (String) null;
        }
    }

    final void enablePacketFive(boolean enabled) {
        uf.enabledCommonPackets[5] = enabled;
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = BrickABrac.field_J ? 1 : 0;
          var4 = df.a(-27790, GameplayAudioEvent.mouseWheelDelta, cd.field_e, param0);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = ek.a(ChocolateBackground.f(param1 ^ 67), sq.a(64), (byte) -16);
            if (var5_int != -1) {
              ef.a(DirectByteStorage.field_e, -106, var5_int, co.field_f);
              DirectByteStorage.field_e = null;
              co.field_f = null;
            }
            var11 = df.a(0);
            if (var11 != null) {
              to.a(var11.booleanValue(), -128);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = GameCanvas.a(MotionWaypoint.b(false), (byte) -74, be.a((byte) -44), IndexedSpriteGeometry.a(param1 ^ 115), aa.a(480), LevelSelectScreen.d(true), this.affiliateId);
            if (-1 != var5_intLifetime1) {
              vh.a(var5_intLifetime1, (byte) -123, DirectByteStorage.field_e, co.field_f);
              DirectByteStorage.field_e = null;
              co.field_f = null;
            }
          }
          if (var4 == 3) {
            if (tm.field_a != -1 &&
              0 != tm.field_a) {
              tm.field_a = -1;
              pp.a((byte) 79);
            }
            if (!param2) {
              var5_intLifetime2 = wp.a(LevelSelectScreen.d(true), false, true, this.jagexHost, this.affiliateId, MotionWaypoint.b(false));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  tf.a(DirectByteStorage.field_e, (byte) -77, var5_intLifetime2);
                  DirectByteStorage.field_e = null;
                } else {
                  sb.field_e = sl.field_v;
                  ei.b(0);
                  AchievementIcon.field_j = 10;
                  LevelPackSelectScreen.field_s = false;
                }
              }
            } else {
              n.field_e = false;
            }
          }
          if (4 == var4) {
            if (!FarmBackground.field_u) {
              AchievementIcon.field_j = 10;
              LevelPackSelectScreen.field_s = true;
            } else {
              jc.a(uc.e((byte) -97), (byte) 97);
            }
          }
          if (var4 == 5) {
            nk.a(2048, uc.e((byte) -110));
          }
          if (var4 == 6 &&
            SpaceBackground.field_t) {
            AchievementIcon.field_j = 10;
          }
          if (7 == var4) {
            pf.a(uc.e((byte) -76), false);
          }
          if (param1 != 46) {
            this.gameCrc = 120;
          }
          if (var4 == 8) {
            jc.a(uc.e((byte) -70), (byte) 97);
          }
          if (var4 == 9) {
            NodeDeque.a(uc.e((byte) -108), (byte) -106);
          }
          if (var4 == 10) {
            k.outgoingPackets.writeCipheredOpcode(-13413, 17);
          }
          if (var4 == 11) {
            mi.a((byte) -123, uc.e((byte) -93));
          }
          if (12 == var4) {
            kf.a(oh.b((byte) -49), (byte) -125, uc.e((byte) -97));
          }
          if (var4 == 13) {
            try {
              if (null == po.countryListRequest) {
                po.countryListRequest = new CappedUrlRequest(lp.field_ub, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (po.countryListRequest.poll(1)) {
                var12 = po.countryListRequest.getResult((byte) 100);
                if (var12 != null) {
                  var7 = df.decodeCp1252(var12.position, 97, var12.data, 0);
                  hi.a(85, var7);
                } else {
                  var9 = (String) null;
                  hi.a(85, (String) null);
                }
                po.countryListRequest = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              rk.a("S1", (Throwable) ((Object) var5), 28);
              hi.a(param1 ^ 123, (String) null);
              po.countryListRequest = null;
            }
          }
          if (var4 == 15) {
            AchievementIcon.field_j = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 != var4) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void g(boolean param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3;
        boolean stackIn_13_1 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
          this.serverNumber = -15;
        }
        if (kb.i(7457)) {
          stackIn_13_1 = (ua.field_d != null);
          discarded$1 = this.a(stackIn_13_1, (byte) 46, false);
        } else {
          if (clientStage >= 10) {
            if (BubbleDistortion.e((byte) -126)) {
              if (AchievementIcon.field_j == 0) {
                discarded$2 = this.a(false, (byte) 46, false);
              } else {
                MouseWheelSource.a(GameplayAudioEvent.mouseWheelDelta, (byte) 124);
              }
            } else {
              hk.a((byte) -122);
            }
          }
        }
    }

    public static void k(int param0) {
        halloweenSegsSprites = (RgbSprite[][]) null;
        field_D = null;
        if (param0 > -103) {
          field_D = (RgbSprite[]) null;
        }
        field_z = null;
    }

    final void dispatchCommonPacket(boolean obfuscationGuard) {
        boolean stackIn_22_1 = false;
        int stackIn_31_0 = 0;
        boolean stackIn_32_1 = false;
        int var2;
        gb var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = IntrusiveHashTable.currentPacketOpcode;
        if (var2 < 64 &&
          uf.enabledCommonPackets[var2]) {
          if (obfuscationGuard) {
            return;
          }
          if (0 == var2) {
            return;
          }
          if (var2 == 1) {
            ba.f(-1);
          } else {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 == 4) {
                  jm.handleCommonDataResponse((byte) 22);
                } else {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            ArchiveSource.a(27423);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                ch.a((byte) 63);
                                return;
                              }
                              if (var2 == 17) {
                                this.handleBrowserPayload((byte) 120);
                                return;
                              }
                              if (var2 == 18) {
                                g.e((byte) -114);
                                return;
                              }
                              rk.a("MGS1: " + eq.c((byte) -71), (Throwable) null, 119);
                              hn.a((byte) 101);
                              return;
                            }
                            stackIn_31_0 = 67;
                            stackIn_32_1 = (var2 == 12);
                            var3 = BallPulseEffect.$cfr$intArgs$a$a948187ac0af(stackIn_31_0, stackIn_32_1);
                            PowerUpWarning.a(var3, 79);
                          }
                        } else {
                          um.a(ga.incomingPacketLength, jl.incomingPackets, (byte) 107, lp.field_ub);
                        }
                      } else {
                        stackIn_22_1 = !(obfuscationGuard);
                        this.f(stackIn_22_1);
                      }
                    } else {
                      wl.c(false);
                    }
                  } else {
                    MenuSelection.f((byte) -71);
                  }
                }
              } else {
                qi.handleAchievementResponse(-1);
              }
            } else {
              f.handleTableResponse((byte) 7);
            }
          }
          return;
        }
        rk.a("MGS2: " + eq.c((byte) -66), (Throwable) null, 89);
        hn.a((byte) 71);
    }

    private final void loadAppletParameters(int obfuscationGuard, String gameName, int gameVersion, int width, int height) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        String hostLowercase = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String serverParameter = null;
        String languageParameter = null;
        String affiliateParameter = null;
        String var10 = null;
        try {
          try {
            if (!this.e(-128)) {
              return;
            }
            this.host = this.getCodeBase().getHost();
            hostLowercase = this.host.toLowerCase();
            stackIn_7_1 = (hostLowercase.equals("jagex.com")) || (hostLowercase.endsWith(".jagex.com"));
            this.jagexHost = stackIn_7_1;
            this.gamePortOne = Integer.parseInt(this.getParameter("gameport1"));
            if (obfuscationGuard < 86) {
              clientStage = -93;
            }
            this.gamePortTwo = Integer.parseInt(this.getParameter("gameport2"));
            serverParameter = this.getParameter("servernum");
            if (serverParameter != null) {
              this.serverNumber = Integer.parseInt(serverParameter);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.memberAccount = this.getParameter("member").equals("yes");
            languageParameter = this.getParameter("lang");
            if (languageParameter != null) {
              this.languageId = Integer.parseInt(languageParameter);
            }
            if (this.languageId >= 5) {
              this.languageId = 0;
            }
            affiliateParameter = this.getParameter("affid");
            if (affiliateParameter != null) {
              this.affiliateId = Integer.parseInt(affiliateParameter);
            }
            MatchResultScreen.field_u = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, 123, height, width, this.gameCrc, gameName, gameVersion);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            rk.a((String) null, (Throwable) ((Object) var6_ref), 58);
            this.a("crash", 4000);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("qg.LA(").append(obfuscationGuard).append(',');
          if (gameName == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(gameVersion).append(',').append(width).append(',').append(height).append(')').toString());
        }
    }

    final void configureCommonPackets(int opcode, boolean enabled) {
        uf.enabledCommonPackets[16] = true;
        uf.enabledCommonPackets[opcode] = enabled;
        uf.enabledCommonPackets[7] = true;
        uf.enabledCommonPackets[0] = true;
        uf.enabledCommonPackets[3] = true;
        uf.enabledCommonPackets[18] = true;
        uf.enabledCommonPackets[17] = true;
    }

    final static RgbSprite[] a(RgbSprite[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RgbSprite var3 = null;
        int var4 = 0;
        RgbSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 > -101) {
            field_D = (RgbSprite[]) null;
          }
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].offsetY = 0;
            var3.offsetX = 0;
            param0[var2_int].canvasWidth = param0[var2_int].width;
            param0[var2_int].canvasHeight = param0[var2_int].height;
          }
          stackIn_7_0 = (RgbSprite[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("qg.EB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    GameConnectionShell() {
    }

    final void updateConnection(boolean obfuscationGuard, int guardCode) {
        int stackIn_23_0 = 0;
        boolean stackIn_99_0 = false;
        boolean stackIn_102_1 = false;
        int stackIn_132_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (jj.field_a != null) {
          if (null == ua.field_d) {
            var6 = ea.b(0);
            var4 = var6.getSize();
            jj.field_a.a(44, var4.width, var4.height);
          }
          jj.field_a.c(guardCode + 118);
        }
        wn.snapshotKeyboardInput((byte) -97);
        sg.snapshotMouseInput(70);
        if (!r.c((byte) -114) &&
          AchievementIcon.field_j != 11) {
          GameplayAudioEvent.c(27144);
        }
        if (NinjaBackground.mouseWheelSource != null) {
          GameplayAudioEvent.mouseWheelDelta = NinjaBackground.mouseWheelSource.pollRotation(500);
        }
        if (ik.a(false)) {
          var3 = wn.a((byte) -98) * 1200;
          if (this.reconnectRequested ||
            !(wi.c(1) <= var3) &&
            !(var3 >= so.a((byte) -35))) {
            this.reconnectRequested = false;
            hn.a((byte) 91);
            FarmBackground.g(120);
            tf.a(NinjaBackground.field_s, (byte) -113, 2);
            rj.b(guardCode ^ -111);
            n.field_e = true;
            NanoGameClock.field_i = 15000L + MonotonicTime.nowMillis(false);
          }
        }
        if (tm.field_a == -1 ||
          tm.field_a == 0) {
          stackIn_23_0 = (tm.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          tm.field_a = GameCanvas.a(false);
          if (var3Lifetime1 != 0 &&
            tm.field_a == 0 &&
            AchievementIcon.field_j == 11 &&
            !ui.a(false)) {
            ei.b(0);
          }
          if (-1 != tm.field_a &&
            tm.field_a != 0) {
            NanoGameClock.field_i = 15000L + MonotonicTime.nowMillis(false);
          }
        }
        if (tm.field_a != -1 &&
          tm.field_a != 0) {
          if (10 <= clientStage) {
            if (10 <= AchievementIcon.field_j) {
              FarmBackground.g(114);
              if (tm.field_a == 3) {
                tf.a(nk.field_d, (byte) -49, 256);
              } else {
                if (tm.field_a != 4) {
                  if (tm.field_a != 2) {
                    if (5 == tm.field_a) {
                      tf.a(u.field_b, (byte) -48, 5);
                    } else {
                      tf.a(np.field_e, (byte) -55, 256);
                    }
                  } else {
                    tf.a(AppletGameShell.field_k, (byte) -54, 256);
                  }
                } else {
                  tf.a(vh.field_M, (byte) -103, 256);
                }
              }
              n.field_e = true;
            }
          } else {
            if (tm.field_a != 3) {
              if (4 != tm.field_a) {
                if (tm.field_a != 2) {
                  if (5 != tm.field_a) {
                    this.a("js5connect", 4000);
                  } else {
                    this.a("outofdate", 4000);
                  }
                } else {
                  this.a("js5connect_full", 4000);
                }
              } else {
                this.a("js5io", 4000);
              }
            } else {
              this.a("js5crc", 4000);
            }
          }
        }
        if ((tm.field_a != -1 &&
          0 != tm.field_a ||
          ui.a(false)) &&
          NanoGameClock.field_i <= MonotonicTime.nowMillis(false)) {
          n.field_e = false;
          if (tm.field_a != -1 &&
            0 != tm.field_a) {
            tm.field_a = -1;
            pp.a((byte) -101);
          }
        }
        if (tm.field_a == 0 &&
          !ui.a(false)) {
          LevelCompleteScreen.field_C = false;
        }
        if (0 == clientStage &&
          o.d(guardCode ^ -572695520)) {
          clientStage = 1;
        }
        if (clientStage == guardCode) {
          if (cd.field_e != 0) {
            wl.field_K = aj.a(PacketBuffer.field_j, true);
          }
          ma.field_P = bq.a(-6, 1, true, nd.field_c, false);
          vh.field_S = bq.a(-6, 1, true, ea.field_c, false);
          ja.field_c = bq.a(-6, 1, true, o.field_f, false);
          wn.field_c = vh.field_S;
          clientStage = 2;
          gq.field_Rb = ma.field_P;
        }
        if (2 == clientStage) {
          if (null != wl.field_K &&
            wl.field_K.ensureIndex((byte) -127)) {
            if (!wl.field_K.hasGroupName(113, "")) {
              wl.field_K = null;
            } else {
              if (wl.field_K.ensureGroupAvailableByName("", -28138)) {
                nn.a(wl.field_K, 122);
                wl.field_K = null;
                hc.b(guardCode ^ 3);
              }
            }
          }
          if (wl.field_K == null) {
            clientStage = 3;
          }
        }
        if (3 == clientStage &&
          HuffmanCodec.a(vh.field_S, ma.field_P, ja.field_c, -111) &&
          rg.a(ja.field_c, (byte) 101)) {
          ui.a(384920353);
          CacheIoWorker.a(guardCode + 21677);
          SpaceBackground.field_t = false;
          ri.field_N = cm.field_t;
          MultiplayerExitScreen.a(FarmBackground.field_u, ja.field_c, ma.field_P, vh.field_S, guardCode ^ 23);
          if (cb.field_k ||
            null != LevelDecoder.field_a) {
            stackIn_99_0 = !(cb.field_k);
            stackIn_102_1 = !(cb.field_k);
            bf.a(stackIn_99_0, stackIn_102_1, guardCode ^ -15948, LevelDecoder.field_a);
          }
          if (MatchResultScreen.field_u) {
            NewAchievementsScreen.f(967);
          }
          if (null == sg.field_l) {
            sg.field_l = ni.h(114);
            ri.field_M = ar.a((byte) 120);
          }
          BallPulseEffect.a(ja.field_c, sg.field_l, ri.field_M, 107);
          vh.field_S = null;
          ma.field_P = null;
          ja.field_c = null;
          MenuScreen.a((java.applet.Applet) (this), -90);
          hc.b(2);
          clientStage = 10;
        }
        if (10 == clientStage) {
          if (0 != cd.field_e) {
            GameplayAudioEvent.field_k = aj.a(LevelPackCard.field_i, true);
          }
          clientStage = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (clientStage == 11) {
          if (null != GameplayAudioEvent.field_k && (!GameplayAudioEvent.field_k.ensureIndex((byte) -127) ||
            !GameplayAudioEvent.field_k.ensureAllGroupsAvailable(98))) {
            ParisBackground.a((byte) 24, 0.0f, be.a(GameplayAudioEvent.field_k, wn.field_a, 125, d.field_C));
            decompiledFrameRemainder0 = false;
          }
          else {
            clientStage = 12;
            lo.field_d = true;
          }
        }
        if (clientStage == 12 &&
          !lo.field_d) {
          clientStage = 13;
        }
        if (clientStage == 13) {
          var3Lifetime2 = 1;
          if (bh.field_tb != null) {
            stackIn_132_0 = (!bh.field_tb.d(-115)) ? 0 : 1;
            var3Lifetime2 = stackIn_132_0;
            ParisBackground.a((byte) 24, bh.field_tb.field_e, bh.field_tb.field_g);
          }
          if (var3Lifetime2 != 0) {
            clientStage = 20;
          }
        }
        if (!obfuscationGuard &&
          tn.field_A) {
          t.a(false, CacheIoRequest.field_D);
          this.c(false);
          ap.a((byte) 117, CacheIoRequest.field_D);
        }
        if (uf.enabledCommonPackets[8]) {
          HuffmanCodec.a(14114);
        }
    }

    final void enablePacketFour(byte obfuscationGuard) {
        if (obfuscationGuard != -67) {
          return;
        }
        uf.enabledCommonPackets[4] = true;
    }

    final void enableCommonPacket(int opcode) {
        uf.enabledCommonPackets[opcode] = true;
    }

    private final void handleBrowserPayload(byte obfuscationGuard) {
        int var2 = jl.incomingPackets.readUnsignedByte(255);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + ga.incomingPacketLength;
        byte[] var5 = new byte[var4];
        if (obfuscationGuard != 120) {
          return;
        }
        jl.incomingPackets.readCipheredBytes(false, 0, var4, var5);
        HuffmanCodec.a((byte) 114, uc.e((byte) -73), MenuButton.a(var5, (byte) 70), var3 != 0);
    }

    static {
        field_z = "Open in popup window";
        field_t = false;
    }
}
