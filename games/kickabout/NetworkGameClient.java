/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameAppletShell {
    private int field_p;
    private long field_v;
    String field_z;
    private int field_r;
    static String field_w;
    private int field_u;
    private int field_s;
    static LoadingSequence field_t;
    private boolean field_A;
    private int field_B;
    private int field_x;
    static String field_y;
    private boolean field_q;
    private boolean field_o;

    final void i(int param0) {
        LookupRecordUpdate.field_h[11] = true;
        LookupRecordUpdate.field_h[param0] = true;
        LookupRecordUpdate.field_h[12] = true;
    }

    final static UiLayoutNode f(int param0) {
        if (param0 != 0) {
          return (UiLayoutNode) null;
        }
        return LineupView.field_u.field_Ab;
    }

    private final void initializeAccountPacketLengths(int param0) {
        IntTripleCommand.field_A[8] = -2;
        IntTripleCommand.field_A[6] = -2;
        IntTripleCommand.field_A[5] = -1;
        IntTripleCommand.field_A[9] = -1;
        IntTripleCommand.field_A[12] = -1;
        IntTripleCommand.field_A[11] = -1;
        IntTripleCommand.field_A[13] = -1;
        IntTripleCommand.field_A[3] = -1;
        IntTripleCommand.field_A[4] = -1;
        IntTripleCommand.field_A[10] = -1;
        IntTripleCommand.field_A[18] = 1;
        IntTripleCommand.field_A[16] = -1;
        IntTripleCommand.field_A[17] = -1;
        IntTripleCommand.field_A[7] = -1;
        IntTripleCommand.field_A[1] = 16;
        if (param0 != 0) {
          return;
        }
        IntTripleCommand.field_A[2] = -2;
    }

    final void enableHandlerGroup5(int param0) {
        if (param0 != 10) {
          return;
        }
        LookupRecordUpdate.field_h[5] = true;
    }

    final int pollLoginResult(byte param0) {
        if (param0 > -53) {
          return 89;
        }
        int var2 = this.pollLogin((byte) 121);
        if (var2 == 0 ||
          1 == var2) {
          if (LookupRecordUpdate.field_h[1]) {
            MusicPatchNode.a(0, 2);
          }
          if (LookupRecordUpdate.field_h[2]) {
            SumIntegersCommand.a(115, 3);
          }
          if (LookupRecordUpdate.field_h[3]) {
            LobbyGameRecord.a(4, -56);
          }
          if (LookupRecordUpdate.field_h[4]) {
            PromotionDialog.a(5, (byte) -122);
          }
          if (LookupRecordUpdate.field_h[5]) {
            ProxySocketConnector.a(-1, 6);
          }
          if (LookupRecordUpdate.field_h[6]) {
            SquadGridWidget.a(7, (byte) -128);
          }
          if (LookupRecordUpdate.field_h[8]) {
            ResourceArchive.b(-1);
          }
        }
        return var2;
    }

    final void enableHandlerGroup2(int param0) {
        if (param0 != -1) {
          String var3 = (String) null;
          this.readAppletParameters((String) null, 31, 32, -108, 43);
        }
        LookupRecordUpdate.field_h[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
          if (param2 != -60) {
            this.field_A = true;
          }
          this.readAppletParameters(param0, param1, 480, 640, -93);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ma.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void enableHandlerGroup(int param0) {
        LookupRecordUpdate.field_h[param0] = true;
    }

    final void initialiseClient(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ArchiveRequest.field_r = this.field_p;
        TextFieldNode.b(ArchiveRequest.field_r, 31900);
        PlayerContextMenu.a(127, this.field_x, this.field_A, this.field_s, this.field_B, param7, param1, 5000, PlatformTaskState.field_c, ArchiveRequest.field_r, this.field_v, this.field_u, 5000, this.field_z);
        AppScreen.setServerConnectionParameters(this.field_z, param1, PlatformTaskState.field_c, ArchiveRequest.field_r, this.field_u, this.field_x, this.field_B, this.field_s, false);
        CipherPacketBuffer.o(255);
        SoundStreamHandle.field_f = TutorialChoiceDialog.createMouseWheelInput((byte) 3);
        CanvasInputBindings.attachInputHandlers(RegistrationRequestState.field_d, (byte) -64);
        LeagueWinnerDialog.field_F = param4;
        ClubState.field_y = param3;
        if (param5 >= -3) {
          field_t = (LoadingSequence) null;
        }
        SellPlayerDialog.field_G = param0;
        ModalPanel.field_E = param2;
        AuctionsScreen.field_Q = param6;
        this.initializeAccountPacketLengths(0);
        TournamentLobbyScreen.d(-1);
    }

    final void enableBaseResponses(boolean param0, int param1) {
        LookupRecordUpdate.field_h[0] = true;
        if (param1 != -1) {
          return;
        }
        LookupRecordUpdate.field_h[16] = true;
        LookupRecordUpdate.field_h[3] = true;
        LookupRecordUpdate.field_h[17] = true;
        LookupRecordUpdate.field_h[7] = true;
        LookupRecordUpdate.field_h[8] = param0;
        LookupRecordUpdate.field_h[18] = true;
    }

    private final void saveSessionCookie(boolean param0) {
        String var2 = ConsoleLexer.readServerString(param0);
        AccountNameAvailabilityValidator.writeSessionCookie(AppletContextSupport.getActiveApplet(19), var2, (byte) 15);
    }

    public static void d(boolean param0) {
        field_y = null;
        field_t = null;
        if (!param0) {
          field_y = (String) null;
        }
        field_w = null;
    }

    final static void b(boolean param0) {
        String var2 = null;
        if (QuickChatMenuBuilder.field_f != null) {
          var2 = QuickChatMenuBuilder.field_f;
          String var1 = var2;
          ArchiveManager.a(126, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, EmailSyntaxValidator.field_j, new String[]{var2}));
          QuickChatMenuBuilder.field_f = null;
        }
        if (!param0) {
          NetworkGameClient.k((byte) 24);
        }
    }

    final static void k(byte param0) {
        if (VerticalScrollbar.field_Ab != ColorQuantizationBox.field_f.field_e) {
          ClientPacketFlushSupport.field_c = ClientPacketFlushSupport.field_c + (ColorQuantizationBox.field_f.field_e - VerticalScrollbar.field_Ab);
          VerticalScrollbar.field_Ab = ColorQuantizationBox.field_f.field_e;
        }
        if (param0 != -118) {
          return;
        }
        if (!(SharedPanelFactory.field_b <= 0)) {
          SharedPanelFactory.field_b = SharedPanelFactory.field_b - 1;
        }
        if (!(SharedPanelFactory.field_b <= 0)) {
          WeightedLruCache.a(0);
        }
    }

    final static String validateAccountName(byte param0, CharSequence param1, boolean param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Kickabout.field_G;
        try {
          if (param0 >= -108) {
            field_w = (String) null;
          }
          var3 = SharedWidgetFactory.validateAccountName(0, param2, param1);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < param1.length(); var4++) {
            if (!CheckboxLabelWidget.a(param1.charAt(var4), 160)) {
              stackIn_13_0 = GameOptionMenuSupport.field_c;
              return stackIn_13_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ma.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void enableHandlerGroup1(byte param0) {
        LookupRecordUpdate.field_h[1] = true;
        int var2 = 110 / ((39 - param0) / 57);
    }

    final void dispatchServerPacket(int param0) {
        int stackIn_26_0 = 0;
        boolean stackIn_27_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Kickabout.field_G;
        if (param0 < 83) {
          NetworkGameClient.b(false);
        }
        var2 = AppletContextSupport.field_b;
        if (var2 < 64 &&
          LookupRecordUpdate.field_h[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (3 == var2) {
                ModelMaterial.readAchievementResponse((byte) 53);
              } else {
                if (var2 == 4) {
                  HighScoreSubmission.readLookupResponse((byte) 103);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      PlayerInputEvent.a(true);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (16 == var2) {
                            IntrusiveNode.readAccountNameUpdate(-49);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                SocialListProtocolSupport.readSocialListUpdate((byte) 77);
                                return;
                              }
                              if (var2 == 17) {
                                this.j((byte) -1);
                                return;
                              }
                              if (var2 == 18) {
                                SelectionMarkerSupport.c(25957);
                                return;
                              }
                              UnreadMessagesScreen.a("MGS1: " + ClientUiOverlay.describeCurrentPacket(0), (Throwable) null, 1);
                              FormationView.b((byte) -116);
                              return;
                            }
                            stackIn_26_0 = 113;
                            stackIn_27_1 = (12 == var2);
                            var3 = TextFieldValidator.$cfr$intArgs$a$e7eed804270c(stackIn_26_0, stackIn_27_1);
                            SectorCacheStore.a((byte) -112, var3);
                          }
                        } else {
                          TextWidgetPainter.a(ByteArrayPool.field_e, MusicVolumeSupport.field_b, -1, PlatformTaskState.field_c);
                        }
                      } else {
                        this.saveSessionCookie(false);
                      }
                    }
                  } else {
                    IconLabel.a(0);
                  }
                }
              }
            } else {
              ConsoleTokenParser.readHighScoreResponse(2);
            }
          } else {
            LoadingProgressSupport.a(true);
          }
          return;
        }
        UnreadMessagesScreen.a("MGS2: " + ClientUiOverlay.describeCurrentPacket(0), (Throwable) null, 1);
        FormationView.b((byte) -116);
    }

    final void n(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Kickabout.field_G;
        int var2 = 31 / ((param0 - 61) / 48);
        if (FullscreenFailureReason.b((byte) 97)) {
          discarded$1 = this.a(false, true, null != SplashScreen.field_m ? true : false);
        } else {
          if (10 > DateInputValidator.field_d) {
          } else {
            if (!TournamentChampionDialog.i(-92)) {
              PanelSpriteFactory.a((byte) -126);
            } else {
              if (RasterGlowSupport.field_c != 0) {
                CachedListingRow.a(59, StatefulTextPainter.field_v);
              } else {
                discarded$2 = this.a(false, true, false);
              }
            }
          }
        }
    }

    final void c(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        int stackIn_102_0 = 0;
        boolean stackIn_103_1 = false;
        boolean stackIn_106_2 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Kickabout.field_G;
        if (null != ArchiveIndex.field_h) {
          if (null == SplashScreen.field_m) {
            var6 = PlayingView.getAppletHostContainer((byte) -13);
            var4 = var6.getSize();
            ArchiveIndex.field_h.setAvailableSize(768, var4.width, var4.height);
          }
          ArchiveIndex.field_h.updateCanvasSize(0);
        }
        AgeValidator.g(param0);
        BufferedCacheFile.a((byte) 58);
        if (!RegistrationUiSupport.c(608) &&
          11 != RasterGlowSupport.field_c) {
          MeshPreviewSupport.a(127);
        }
        if (null != SoundStreamHandle.field_f) {
          StatefulTextPainter.field_v = SoundStreamHandle.field_f.pollRotation((byte) -22);
        }
        if (WorldSpriteDecoration.b(-14954)) {
          var3 = 1200 * GameSoundEffect.b((byte) 126);
          if (this.field_q ||
            !(FootballerAiOverlaySupport.getKeyboardIdleTicks(true) <= var3) &&
            !(var3 >= ConsoleTokenParser.getMouseIdleTicks(-126))) {
            this.field_q = false;
            FormationView.b((byte) -116);
            AccountNameCharacterSupport.a((byte) -31);
            LoginResponseUiSupport.showLoginResponse(IntTripleCommand.field_D, 2, -56);
            TeamSelectionAgent.c(30929);
            LoginResponseUiSupport.field_d = true;
            GoalStateAgent.field_g = 15000L + MonotonicClock.monotonicMillis(-48);
          }
        }
        if (RowRangeRequest.field_h == -1 ||
          RowRangeRequest.field_h == 0) {
          stackIn_24_0 = (RowRangeRequest.field_h != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          RowRangeRequest.field_h = AudioService.pollResourceConnection(522);
          if (var3Lifetime1 != 0 &&
            RowRangeRequest.field_h == 0 &&
            11 == RasterGlowSupport.field_c &&
            !ClientInteractionSupport.a((byte) 10)) {
            UnreadMessagesScreen.buildUnreadMessagesNotice(-1);
          }
          if (RowRangeRequest.field_h != -1 &&
            0 != RowRangeRequest.field_h) {
            GoalStateAgent.field_g = MonotonicClock.monotonicMillis(-65) + 15000L;
          }
        }
        if (RowRangeRequest.field_h != -1 &&
          RowRangeRequest.field_h != 0) {
          if (10 > DateInputValidator.field_d) {
            if (RowRangeRequest.field_h != 3) {
              if (RowRangeRequest.field_h != 4) {
                if (RowRangeRequest.field_h != 2) {
                  if (5 == RowRangeRequest.field_h) {
                    this.showGameErrorPage((byte) -66, "outofdate");
                  } else {
                    this.showGameErrorPage((byte) -123, "js5connect");
                  }
                } else {
                  this.showGameErrorPage((byte) -101, "js5connect_full");
                }
              } else {
                this.showGameErrorPage((byte) -124, "js5io");
              }
            } else {
              this.showGameErrorPage((byte) 27, "js5crc");
            }
          } else {
            if (10 <= RasterGlowSupport.field_c) {
              AccountNameCharacterSupport.a((byte) -13);
              if (RowRangeRequest.field_h != 3) {
                if (RowRangeRequest.field_h != 4) {
                  if (2 != RowRangeRequest.field_h) {
                    if (RowRangeRequest.field_h == 5) {
                      LoginResponseUiSupport.showLoginResponse(SortCriterion.field_m, 5, -94);
                    } else {
                      LoginResponseUiSupport.showLoginResponse(FormationMaskSupport.field_b, 256, 69);
                    }
                  } else {
                    LoginResponseUiSupport.showLoginResponse(DialogOverlay.field_h, 256, param0 ^ 102);
                  }
                } else {
                  LoginResponseUiSupport.showLoginResponse(CachedTextLayout.field_o, 256, 79);
                }
              } else {
                LoginResponseUiSupport.showLoginResponse(DateInputWidget.field_F, 256, 96);
              }
              LoginResponseUiSupport.field_d = true;
            }
          }
        }
        if ((RowRangeRequest.field_h != -1 &&
          RowRangeRequest.field_h != 0 ||
          ClientInteractionSupport.a((byte) 10)) &&
          MonotonicClock.monotonicMillis(param0 ^ 34) >= GoalStateAgent.field_g) {
          LoginResponseUiSupport.field_d = false;
          if (-1 != RowRangeRequest.field_h &&
            RowRangeRequest.field_h != 0) {
            RowRangeRequest.field_h = -1;
            ScrollPane.b(23877);
          }
        }
        if (0 == RowRangeRequest.field_h &&
          !ClientInteractionSupport.a((byte) 10)) {
          WhirlpoolHasher.field_h = false;
        }
        if (DateInputValidator.field_d == 0 &&
          TeamSelectionView.h(param0 - 96)) {
          DateInputValidator.field_d = 1;
        }
        if (DateInputValidator.field_d == 1) {
          if (ArchiveRequest.field_r != 0) {
            LoginRequiredDialog.field_H = ImageProducerRasterBuffer.a((byte) -128, ModalPanel.field_E);
          }
          SceneSpriteFactory.field_b = ContextMenu.a(false, SellPlayerDialog.field_G, 1, true, 118);
          SelectionMarkerSupport.field_c = ContextMenu.a(false, ClubState.field_y, 1, true, param0 ^ 125);
          PlayerStats.field_k = ContextMenu.a(false, LeagueWinnerDialog.field_F, 1, true, param0 ^ 127);
          DateInputValidator.field_d = 2;
          CanvasResizePolicy.field_g = SceneSpriteFactory.field_b;
          IterableNodeHashTable.field_b = SelectionMarkerSupport.field_c;
        }
        if (DateInputValidator.field_d == 2) {
          if (LoginRequiredDialog.field_H != null &&
            LoginRequiredDialog.field_H.ensureIndex(param0 ^ -43)) {
            if (LoginRequiredDialog.field_H.a("", (byte) -81)) {
              if (LoginRequiredDialog.field_H.a(false, "")) {
                AuctionListing.a(true, LoginRequiredDialog.field_H);
                LoginRequiredDialog.field_H = null;
                AnimationPlayer.a((byte) 51);
              }
            } else {
              LoginRequiredDialog.field_H = null;
            }
          }
          if (LoginRequiredDialog.field_H == null) {
            DateInputValidator.field_d = 3;
          }
        }
        if (DateInputValidator.field_d == 3 &&
          AppletContextSupport.a(SceneSpriteFactory.field_b, true, SelectionMarkerSupport.field_c, PlayerStats.field_k) &&
          LoggedGoal.a(-2, PlayerStats.field_k)) {
          IntValueNode.a(115);
          CachedArchiveSource.releaseStatics(param0 + 1);
          PitchCoordinateSupport.field_b = CheckboxLabelWidget.field_yb;
          TutorialChoiceDialog.field_H = false;
          MusicPatchNode.a(PlayerStats.field_k, GrowableIntList.field_c, SceneSpriteFactory.field_b, SelectionMarkerSupport.field_c, -120);
          if (TriangleMesh.field_m ||
            IntKeyLookup.field_c != null) {
            stackIn_102_0 = -101;
            stackIn_103_1 = !(TriangleMesh.field_m);
            stackIn_106_2 = !(TriangleMesh.field_m);
            TriangleMesh.$cfr$intArgs$a$842e35442ba4(stackIn_102_0, stackIn_103_1, stackIn_106_2, IntKeyLookup.field_c);
          }
          if (DualLinkDeque.field_d) {
            BufferedSocket.a(true);
          }
          if (null == ButtonMenuScreen.field_y) {
            ButtonMenuScreen.field_y = FaceNormal.getSoundMixer(55);
            DemoIntegersCommand.field_D = TutorialCaptionSupport.a((byte) -88);
          }
          KitStyleTile.a(DemoIntegersCommand.field_D, PlayerStats.field_k, param0 + 98, ButtonMenuScreen.field_y);
          SceneSpriteFactory.field_b = null;
          SelectionMarkerSupport.field_c = null;
          PlayerStats.field_k = null;
          PasswordValidator.a((byte) -127, (java.applet.Applet) (this));
          AnimationPlayer.a((byte) 120);
          DateInputValidator.field_d = 10;
        }
        if (DateInputValidator.field_d == 10) {
          if (0 != ArchiveRequest.field_r) {
            Trinket.field_b = ImageProducerRasterBuffer.a((byte) -125, AuctionsScreen.field_Q);
          }
          DateInputValidator.field_d = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == DateInputValidator.field_d) {
          if (null != Trinket.field_b && (!Trinket.field_b.ensureIndex(-50) ||
            !Trinket.field_b.ensureAllGroupsAvailable(false))) {
            ValidationHelpWidget.a(0.0f, ManagerAction.a(TutorialMessages.field_e, HuffmanCodec.field_g, param0 - 25, Trinket.field_b), (byte) 30);
            decompiledFrameRemainder0 = false;
          }
          else {
            DateInputValidator.field_d = 12;
            PitchBoundaryCacheState.field_c = true;
          }
        }
        if (DateInputValidator.field_d == 12 &&
          !PitchBoundaryCacheState.field_c) {
          DateInputValidator.field_d = 13;
        }
        if (DateInputValidator.field_d == 13) {
          var3Lifetime2 = 1;
          if (BlobSubmission.field_h != null) {
            stackIn_134_0 = (!BlobSubmission.field_h.a(param0 + 1183118480)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            ValidationHelpWidget.a(BlobSubmission.field_h.field_h, BlobSubmission.field_h.field_a, (byte) 30);
          }
          if (var3Lifetime2 != 0) {
            DateInputValidator.field_d = 20;
          }
        }
        if (!param1 &&
          SquadGridWidget.field_Ib) {
          SumIntegersCommand.a(-113, RegistrationRequestState.field_d);
          this.replaceCanvas((byte) -88);
          CanvasInputBindings.attachInputHandlers(RegistrationRequestState.field_d, (byte) -64);
        }
        if (LookupRecordUpdate.field_h[8]) {
          HuffmanTextSupport.b(5);
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 5) {
          this.enableHandlerGroup5(-23);
        }
        return this.a(true, true, param1);
    }

    final void enableHandlerGroup4(int param0) {
        if (param0 != 13) {
          return;
        }
        LookupRecordUpdate.field_h[4] = true;
    }

    final static void a(int param0, byte param1, GameSetupPanel param2, boolean param3) {
        ContextMenuItem dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        ContextMenuItem stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        ContextMenuItem stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        ContextMenuItem stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        ContextMenuItem stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        boolean stackIn_99_2 = false;
        ContextMenuItem stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        boolean stackIn_104_1 = false;
        ContextMenuItem stackIn_108_0 = null;
        boolean stackIn_109_1 = false;
        int stackIn_113_0 = 0;
        ContextMenuItem stackIn_127_0 = null;
        boolean stackIn_128_1 = false;
        ContextMenuItem stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        ContextMenuItem stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        ContextMenuItem stackIn_140_0 = null;
        boolean stackIn_141_1 = false;
        String stackIn_154_0 = null;
        ContextMenuItem stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        ContextMenuItem stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_168_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_226_0 = 0;
        ContextMenuItem stackIn_329_0 = null;
        boolean stackIn_330_1 = false;
        ContextMenuItem stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        boolean stackIn_337_2 = false;
        ContextMenuItem stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_339_3 = 0;
        boolean stackIn_342_1 = false;
        ContextMenuItem stackIn_346_0 = null;
        boolean stackIn_347_1 = false;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        String stackIn_357_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        ContextMenuItem[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ContextMenuItem var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        ContextMenuItem var28 = null;
        ContextMenuItem var29 = null;
        ContextMenuItem[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Kickabout.field_G;
        try {
          if (!param3) {
            if (ScrollPane.a(99)) {
              stackIn_12_0 = (!param2.field_Cb) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (InstrumentNoteMask.field_k) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param3) {
            if (param1 >= -48) {
              field_t = (LoadingSequence) null;
            }
            decompiledFrameRemainder1 = !(2 > VertexNormal.field_d.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_24_0 = (StrongCacheEntry.field_t != -1) ? 1 : 0;
              } else {
                stackIn_24_0 = 0;
              }
              var6 = stackIn_24_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = StrongCacheEntry.field_t;
                for (var8_int = 0; var8_int < TextHotspotRegion.field_h.length; var8_int++) {
                  TextHotspotRegion.field_h[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; 5 > var6; var6++) {
              if (var4_int != 0 &&
                SocialTabsPanel.field_c[0][var6 + 1].field_sb != 0 &&
                param2.field_Wb != var6) {
                var5 = 1;
                param2.field_Wb = var6;
              }
              stackIn_37_0 = SocialTabsPanel.field_c[0][var6 + 1];
              stackIn_38_1 = (var4_int != 0);
              stackIn_37_0.field_lb = stackIn_38_1;
              if (!NetworkArchiveRequest.field_t &&
                3 == var6) {
                SocialTabsPanel.field_c[0][1 + var6].field_lb = false;
              }
              stackIn_43_0 = SocialTabsPanel.field_c[0][1 + var6];
              stackIn_44_1 = (param2.field_Wb == var6);
              stackIn_43_0.field_I = stackIn_44_1;
            }
            if (SocialTabsPanel.field_c[0][2].field_Q) {
              if (!ScrollPane.a(77)) {
                UrlRequest.field_e = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ClubState.field_v, new String[]{PlayerContextMenu.field_i.field_ec});
              } else {
                UrlRequest.field_e = DateOfBirthPanel.field_B;
              }
            }
            if (param1 >= -48) {
              field_t = (LoadingSequence) null;
            }
            decompiledFrameRemainder1 = !(2 > VertexNormal.field_d.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_60_0 = (StrongCacheEntry.field_t != -1) ? 1 : 0;
              } else {
                stackIn_60_0 = 0;
              }
              var6 = stackIn_60_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = StrongCacheEntry.field_t;
                for (var8_int = 0; var8_int < TextHotspotRegion.field_h.length; var8_int++) {
                  TextHotspotRegion.field_h[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            TextHotspotRegion.field_h[var7 / 8] = (byte)PainterStyle.bitwiseOr((int) TextHotspotRegion.field_h[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_68_0 = (param3) ? -1 : 0;
            for (var7 = stackIn_68_0; var7 < VertexNormal.field_d.length; var7++) {
              if (var6 != 0) {
                stackIn_76_0 = (StrongCacheEntry.field_t != var7) ? 1 : 0;
              } else {
                stackIn_76_0 = 0;
              }
              var8_intLifetime1 = stackIn_76_0;
              if (var4_int != 0 &&
                SocialTabsPanel.field_c[1][var7 + 1].field_sb != 0) {
                if (param3) {
                  if (var6 == 0) {
                    if (-1 == var7) {
                      for (var9 = 0; var9 < TextHotspotRegion.field_h.length; var9++) {
                        TextHotspotRegion.field_h[var9] = (byte) 0;
                      }
                    } else {
                      TextHotspotRegion.field_h[var7 / 8] = (byte)TrinketShopDialog.bitwiseXor((int) TextHotspotRegion.field_h[var7 / 8], 1 << TextLayoutLine.bitwiseAnd(7, var7));
                    }
                  }
                } else {
                  var9 = VertexNormal.field_d[var7];
                  if (var9 != param2.field_bc) {
                    param2.field_bc = var9;
                    var5 = 1;
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  SocialTabsPanel.field_c[1][var7 + 1].field_I = true;
                  for (var9 = 0; VertexNormal.field_d.length > var9; var9++) {
                    dupTemp$0 = SocialTabsPanel.field_c[1][1 + var7];
                    stackIn_98_0 = dupTemp$0;
                    stackIn_98_1 = dupTemp$0.field_I;
                    stackIn_99_2 = ((TextHotspotRegion.field_h[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_98_0.field_I = stackIn_98_1 & stackIn_99_2;
                  }
                } else {
                  stackIn_101_0 = SocialTabsPanel.field_c[1][var7 + 1];
                  stackIn_101_1 = ~(TextHotspotRegion.field_h[var7 / 8] & 1 << (var7 & 7));
                  stackIn_101_2 = -1;
                  stackIn_104_1 = (stackIn_101_1 != stackIn_101_2);
                  stackIn_101_0.field_I = stackIn_104_1;
                }
              } else {
                var9 = VertexNormal.field_d[var7];
                stackIn_91_0 = SocialTabsPanel.field_c[1][1 + var7];
                stackIn_92_1 = (param2.field_bc == var9);
                stackIn_91_0.field_I = stackIn_92_1;
              }
              stackIn_108_0 = SocialTabsPanel.field_c[1][var7 + 1];
              stackIn_109_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_108_0.field_lb = stackIn_109_1;
            }
          }
          stackIn_113_0 = (param3) ? 0 : 1;
          for (var6Lifetime1 = stackIn_113_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = SocialTabsPanel.field_c[2][var6Lifetime1];
            if (var4_int != 0 &&
              0 != var28.field_sb) {
              if (param3) {
                if (var6Lifetime1 == 0) {
                  MidiPcmStream.field_C = 0;
                } else {
                  MidiPcmStream.field_C = MidiPcmStream.field_C ^ var6Lifetime1;
                }
              } else {
                if (param2.field_Mb != var6Lifetime1) {
                  var5 = 1;
                  param2.field_Mb = var6Lifetime1;
                }
              }
            }
            if (param3) {
              if (var6Lifetime1 == 0) {
                stackIn_136_0 = var28;
                stackIn_137_1 = (0 == MidiPcmStream.field_C);
                stackIn_136_0.field_I = stackIn_137_1;
              } else {
                stackIn_132_0 = var28;
                stackIn_133_1 = ((MidiPcmStream.field_C & var6Lifetime1) != 0);
                stackIn_132_0.field_I = stackIn_133_1;
              }
            } else {
              stackIn_127_0 = var28;
              stackIn_128_1 = ((param2.field_Mb & var6Lifetime1) != 0);
              stackIn_127_0.field_I = stackIn_128_1;
            }
            stackIn_140_0 = var28;
            stackIn_141_1 = (var4_int != 0);
            stackIn_140_0.field_lb = stackIn_141_1;
          }
          if (param3 &&
            1 < MouseInputHandler.field_f) {
            for (var6Lifetime2 = 0; MouseInputHandler.field_f + 1 > var6Lifetime2; var6Lifetime2++) {
              var29 = SocialTabsPanel.field_c[3][var6Lifetime2];
              if (var4_int != 0 &&
                var29.field_sb != 0) {
                ConsoleExpression.field_l = var6Lifetime2;
              }
              if (var29.field_Q &&
                var6Lifetime2 > 0) {
                if (null != IntValueNode.field_f) {
                  stackIn_154_0 = IntValueNode.field_f[-1 + var6Lifetime2];
                } else {
                  stackIn_154_0 = null;
                }
                var8 = stackIn_154_0;
                if (var8 != null) {
                  UrlRequest.field_e = var8;
                }
              }
              stackIn_158_0 = var29;
              stackIn_159_1 = (var6Lifetime2 == ConsoleExpression.field_l);
              stackIn_158_0.field_I = stackIn_159_1;
              stackIn_161_0 = var29;
              stackIn_162_1 = (var4_int != 0);
              stackIn_161_0.field_lb = stackIn_162_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = 0; UiKeyRoutingSupport.field_j > var7; var7++) {
            var30 = SocialTabsPanel.field_c[var7 + 4];
            var8_array = var30;
            stackIn_168_0 = (!param3) ? 0 : -1;
            for (var9 = stackIn_168_0; -1 + var30.length > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (SumIntegersCommand.field_D != null &&
                  null != SumIntegersCommand.field_D[var7] &&
                  (~StringCursor.field_a & SumIntegersCommand.field_D[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = LoginCredentials.highestOneBit((byte) -126, SumIntegersCommand.field_D[var7][var9] & ~StringCursor.field_a);
                }
                if (null != ModelMaterialDecoder.field_h &&
                  null != ModelMaterialDecoder.field_h[var7] &&
                  0 >= WeightedLruCache.field_d &&
                  ModelMaterialDecoder.field_h[var7][var9]) {
                  var10 = 1;
                }
                if (BroadcastServerCommand.field_E != null &&
                  null != BroadcastServerCommand.field_E[var7]) {
                  var16 = BroadcastServerCommand.field_E[var7][var9];
                  if (var16 != 0 &&
                    !TooltipOverlay.field_d &&
                    WeightedLruCache.field_d <= 0) {
                    var10 = 1;
                  }
                  if (var16 > 0 &&
                    var16 > ConsoleArgumentSupport.field_d) {
                    var12 = 1;
                  }
                }
                if (param3) {
                  if (IndexedSpriteState.field_e != null) {
                    if (null != IndexedSpriteState.field_e[var7]) {
                      stackIn_202_0 = (IndexedSpriteState.field_e[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_202_0 = 0;
                    }
                  } else {
                    stackIn_202_0 = 0;
                  }
                } else {
                  stackIn_202_0 = 0;
                }
                var13 = stackIn_202_0;
                if (null != AppletContextSupport.field_f &&
                  null != AppletContextSupport.field_f[var7]) {
                  var16Lifetime2 = AppletContextSupport.field_f[var7][var9];
                  if (0 != var16Lifetime2 &&
                    !TooltipOverlay.field_d &&
                    0 >= WeightedLruCache.field_d) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    MusicPatchNode.field_o < var16Lifetime2) {
                    var11 = 1;
                  }
                }
              }
              if (ScrollContainer.field_Ib >= 2 &&
                GameplayHelpScreen.field_G[12]) {
                var13 = 0;
                var10 = 0;
                var11 = 0;
                var14 = 0;
                var12 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_226_0 = 0;
              } else {
                stackIn_226_0 = 1;
              }
              var16Lifetime1 = stackIn_226_0;
              SocialListProtocolSupport.field_c = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                PlayArea.field_k != null && (!param3 ||
                !InstrumentNoteMask.field_k)) {
                if (null == SumIntegersCommand.field_G) {
                  WhirlpoolHasher.field_f = new boolean[UiKeyRoutingSupport.field_j];
                  SumIntegersCommand.field_G = new byte[UiKeyRoutingSupport.field_j];
                }
                SocialListProtocolSupport.field_c = false;
                GameMediaSupport.field_e = false;
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  WhirlpoolHasher.field_f[var17_int] = false;
                }
                GameOptionMenuSupport.a(0, var7, param2, -1, (byte) -125, var9, -1, param3);
                if (ScrollContainer.field_Ib >= 2 &&
                  GameplayHelpScreen.field_G[12]) {
                  SocialListProtocolSupport.field_c = true;
                }
                if (!SocialListProtocolSupport.field_c) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_sb != 0) {
                if (param3) {
                  if (-1 == var9) {
                    for (var18 = var6Lifetime3; var6Lifetime3 - (-var30.length + 1) > var18; var18++) {
                      SocialTabsPanel.field_d[var18 / 8] = (byte)TextLayoutLine.bitwiseAnd((int) SocialTabsPanel.field_d[var18 / 8], ~(1 << TextLayoutLine.bitwiseAnd(var18, 7)));
                    }
                  } else {
                    SocialTabsPanel.field_d[(var9 + var6Lifetime3) / 8] = (byte)TrinketShopDialog.bitwiseXor((int) SocialTabsPanel.field_d[(var9 + var6Lifetime3) / 8], 1 << TextLayoutLine.bitwiseAnd(var6Lifetime3 + var9, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    param2.field_Eb[var7] != (byte)var9) {
                    var5 = 1;
                    param2.field_Eb[var7] = (byte)var9;
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                SocialTabsPanel.field_d[(var6Lifetime3 + var9) / 8] = (byte)TextLayoutLine.bitwiseAnd((int) SocialTabsPanel.field_d[(var6Lifetime3 + var9) / 8], ~(1 << TextLayoutLine.bitwiseAnd(7, var9 + var6Lifetime3)));
              }
              if (var9 >= 0 &&
                var17.field_Q) {
                if (null == LoadingProgressDialog.field_Q) {
                  var18_ref = null;
                } else {
                  if (LoadingProgressDialog.field_Q[var7] != null) {
                    var18_ref = LoadingProgressDialog.field_Q[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (GradientRasterSupport.field_g != null) {
                  if (GradientRasterSupport.field_g[var7] != null) {
                    var19 = GradientRasterSupport.field_g[var7][var9];
                  } else {
                    var19 = null;
                  }
                } else {
                  var19 = null;
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = -MusicPatchNode.field_o + AppletContextSupport.field_f[var7][var9];
                      if (var22_int != 1) {
                        var21 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, DiagnosticsOverlaySupport.field_c, new String[]{Integer.toString(var22_int)});
                      } else {
                        var21 = UiKeyRoutingSupport.field_d;
                      }
                    }
                    if (var12 != 0) {
                      var31 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, IsaacRandom.field_h, new String[]{Integer.toString(ConsoleArgumentSupport.field_d), Integer.toString(BroadcastServerCommand.field_E[var7][var9])});
                      var21 = var31;
                      var21 = var31;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31;
                      } else {
                        var21 = var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = AccountRequestDialog.field_bb;
                      if (var15 > 0 &&
                        MachineTokenStorageSupport.field_a != null &&
                        MachineTokenStorageSupport.field_a.length >= var15 &&
                        MachineTokenStorageSupport.field_a[-1 + var15] != null) {
                        var22 = MachineTokenStorageSupport.field_a[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  } else {
                    var21 = TeamSelectionAgent.field_n;
                  }
                } else {
                  var21 = DialogOverlay.field_c;
                }
                if (var4_int != 0 &&
                  !SocialListProtocolSupport.field_c) {
                  var22 = null;
                  if (GameMediaSupport.field_e) {
                    var22 = "</col>" + Checkbox.field_H + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (WhirlpoolHasher.field_f[var24]) {
                      var25_ref = "</col>" + Cp1252EncodingSupport.field_b[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 == null) {
                        var22 = var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = PlayerModelPreview.field_m + (String) (var22);
                  } else {
                    var21 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ChatComposeSupport.field_d, new String[]{(String) (var22)});
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = WidgetContainer.a("<br>", "<br><col=A00000>", true, var32);
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  UrlRequest.field_e = (String) (var20);
                }
              }
              if (param3) {
                if (var9 == -1) {
                  var17.field_I = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (var27 < var6Lifetime3 + var30.length - 1) {
                    stackIn_336_0 = var17;
                    stackIn_336_1 = var17.field_I;
                    stackIn_337_2 = (0 == (SocialTabsPanel.field_d[var27 / 8] & 1 << (var27 & 7)));
                    stackIn_336_0.field_I = stackIn_336_1 & stackIn_337_2;
                    var27++;
                  }
                } else {
                  stackIn_339_0 = var17;
                  stackIn_339_1 = -1;
                  stackIn_339_2 = SocialTabsPanel.field_d[(var6Lifetime3 + var9) / 8] & 1 << (var6Lifetime3 + var9 & 7);
                  stackIn_339_3 = -1;
                  stackIn_342_1 = (stackIn_339_1 != (stackIn_339_2 ^ stackIn_339_3));
                  stackIn_339_0.field_I = stackIn_342_1;
                }
              } else {
                stackIn_329_0 = var17;
                stackIn_330_1 = (SocialListProtocolSupport.field_c) && ((byte)var9 == param2.field_Eb[var7]);
                stackIn_329_0.field_I = stackIn_330_1;
              }
              stackIn_346_0 = var17;
              stackIn_347_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_346_0.field_lb = stackIn_347_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & PasswordFieldPainter.field_x[var7]);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            SpriteState.a(6773, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_356_0 = var4;
          stackIn_356_1 = new StringBuilder().append("ma.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_357_2 = "null";
          } else {
            stackIn_357_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_356_0), ((StringBuilder) (Object) stackIn_356_1).append(stackIn_357_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Kickabout.field_G;
          var4 = StripedProgressBar.b(StatefulTextPainter.field_v, -1951459327, ArchiveRequest.field_r, param2);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = QuickChatKeysHelpPanel.a(RotaryDialWidget.j(61), (byte) -98, PlayingView.createAccountNameStatus(-1));
            if (-1 != var5_int) {
              LeagueWinnerDialog.a(ValidatedTextWidget.field_X, var5_int, ListingRowCache.field_b, -1);
              ListingRowCache.field_b = null;
              ValidatedTextWidget.field_X = null;
            }
            var11 = EntityAfterimage.takePendingBooleanResult(83);
            if (var11 != null) {
              FaceNormal.completePendingAvailabilityCheck(var11.booleanValue(), -23249);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = ContentTransitionDialog.a(12, LoginRequiredDialog.g((byte) -17), BigCommand.g(-26370), LongPlusOneCommand.h(10326), LobbyPlayerRow.getCurrentAccountNameText(320), PlayArea.b(820907312), this.field_r);
            if (var5_intLifetime1 != -1) {
              PlayerPortraitCacheEntry.completeAccountRegistration(ListingRowCache.field_b, ValidatedTextWidget.field_X, (byte) 122, var5_intLifetime1);
              ValidatedTextWidget.field_X = null;
              ListingRowCache.field_b = null;
            }
          }
          if (var4 == 3) {
            if (RowRangeRequest.field_h != -1 &&
              RowRangeRequest.field_h != 0) {
              RowRangeRequest.field_h = -1;
              ScrollPane.b(23877);
            }
            if (param0) {
              LoginResponseUiSupport.field_d = false;
            } else {
              var5_intLifetime2 = AppScreen.stepLoginHandshake(0, BigCommand.g(-26370), this.field_o, false, LongPlusOneCommand.h(10326), this.field_r);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  LoginResponseUiSupport.showLoginResponse(ListingRowCache.field_b, var5_intLifetime2, 125);
                  ListingRowCache.field_b = null;
                } else {
                  SocialUiState.field_a = DiagnosticsOverlaySupport.field_d;
                  UnreadMessagesScreen.buildUnreadMessagesNotice(-1);
                  RasterGlowSupport.field_c = 10;
                  GameSoundEffect.field_f = false;
                }
              }
            }
          }
          if (var4 == 4) {
            if (GrowableIntList.field_c) {
              DiskCacheRequest.a(AppletContextSupport.getActiveApplet(108), param1);
            } else {
              RasterGlowSupport.field_c = 10;
              GameSoundEffect.field_f = true;
            }
          }
          if (5 == var4) {
            AppScreen.openQuitPage(20338, AppletContextSupport.getActiveApplet(-111));
          }
          if (var4 == 6 &&
            TutorialChoiceDialog.field_H) {
            RasterGlowSupport.field_c = 10;
          }
          if (var4 == 7) {
            PitchSurfaceLoader.openServerList(AppletContextSupport.getActiveApplet(35), 23607);
          }
          if (!param1) {
            this.field_u = -76;
          }
          if (var4 == 8) {
            DiskCacheRequest.a(AppletContextSupport.getActiveApplet(124), param1);
          }
          if (var4 == 9) {
            MatchScreen.openSupportPage(AppletContextSupport.getActiveApplet(-93), 0);
          }
          if (10 == var4) {
            FootballerAiOverlaySupport.field_d.b(17, (byte) -87);
          }
          if (var4 == 11) {
            MatchUiLayoutSupport.reloadAppletPage((byte) 125, AppletContextSupport.getActiveApplet(51));
          }
          if (var4 == 12) {
            ListRow.openUrlInBrowser(AppletContextSupport.getActiveApplet(-85), 114, IsaacRandom.c(71));
          }
          if (13 == var4) {
            try {
              if (null == WorldSpriteSequence.field_d) {
                WorldSpriteSequence.field_d = new JaggrabDownloader(PlatformTaskState.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (WorldSpriteSequence.field_d.a((byte) 58)) {
                var12 = WorldSpriteSequence.field_d.b(0);
                if (var12 == null) {
                  var9 = (String) null;
                  NamedValueEntry.a((String) null, (byte) -118);
                } else {
                  var7 = PainterStyle.decodeCp1252((byte) -122, var12.field_n, 0, var12.field_f);
                  NamedValueEntry.a(var7, (byte) -49);
                }
                WorldSpriteSequence.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              UnreadMessagesScreen.a("S1", (Throwable) ((Object) var5), 1);
              var10 = (String) null;
              NamedValueEntry.a((String) null, (byte) 119);
              WorldSpriteSequence.field_d = null;
            }
          }
          if (15 == var4) {
            RasterGlowSupport.field_c = 10;
          }
          if (var4 == 16) {
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

    private final void readAppletParameters(String param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_7_1 = false;
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
            if (!this.isHostAllowed((byte) 118)) {
              return;
            }
            this.field_z = this.getCodeBase().getHost();
            var6 = this.field_z.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_o = stackIn_7_1;
            this.field_s = Integer.parseInt(this.getParameter("gameport1"));
            this.field_u = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_v = Long.parseLong(this.getParameter("instanceid"));
            this.field_A = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_p = Integer.parseInt(var8);
            }
            if (param4 >= -78) {
              this.i(38);
            }
            if (this.field_p >= 5) {
              this.field_p = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            DualLinkDeque.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletShell(param1, param3, this.field_B, (byte) -126, param2, param0, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            UnreadMessagesScreen.a((String) null, (Throwable) ((Object) var6_ref), 1);
            this.showGameErrorPage((byte) 87, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("ma.BB(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void k(int param0) {
        if (DebugConsole.field_s) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.field_b, SoftwareRasterizer.field_e, SoftwareRasterizer.field_c - SoftwareRasterizer.field_b, SoftwareRasterizer.field_h - SoftwareRasterizer.field_e);
          LeaguesHelpScreen.field_E.draw(46, false);
        }
        if (param0 != 1) {
          CharSequence var2 = (CharSequence) null;
          NetworkGameClient.validateAccountName((byte) -6, (CharSequence) null, true);
        }
    }

    NetworkGameClient() {
    }

    private final void j(byte param0) {
        int var2 = ByteArrayPool.field_e.readUnsignedByte((byte) -122);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = MusicVolumeSupport.field_b - 1;
        byte[] var5 = new byte[var4];
        ByteArrayPool.field_e.a((byte) -30, 0, var5, var4);
        AccountNameAvailabilityValidator.openExternalUrl(0, BlackFadeScreen.a(var5, true), var3 != 0, AppletContextSupport.getActiveApplet(55));
        int var6 = 115 % ((-74 - param0) / 48);
    }

    private final int pollLogin(byte param0) {
        if (this.field_e) {
          return -1;
        }
        if (!ClientInteractionSupport.a((byte) 10)) {
          return -1;
        }
        if (LoginResponseUiSupport.field_d) {
          return -1;
        }
        int var2 = AppScreen.stepLoginHandshake(0, BigCommand.g(-26370), this.field_o, true, LongPlusOneCommand.h(10326), this.field_r);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (RasterGlowSupport.field_c == 11 &&
            RowRangeRequest.field_h == 0) {
            UnreadMessagesScreen.buildUnreadMessagesNotice(-1);
          }
          return var2;
        }
        if (!DisplayModeSupport.field_e) {
          this.showGameErrorPage((byte) 61, "reconnect");
        }
        AccountNameCharacterSupport.a((byte) -74);
        LoginResponseUiSupport.showLoginResponse(ListingRowCache.field_b, var2, 71);
        LoginResponseUiSupport.field_d = true;
        GoalStateAgent.field_g = MonotonicClock.monotonicMillis(121) + 15000L;
        if (param0 < 114) {
          field_t = (LoadingSequence) null;
        }
        return var2;
    }

    static {
        field_w = "Secret achievement";
    }
}
