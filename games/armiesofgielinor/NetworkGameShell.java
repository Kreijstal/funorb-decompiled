/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameShell extends GameAppletShell {
    static RgbSprite[] boneShadowSprites;
    static String field_u;
    static int[] field_y;
    static String field_A;
    static String field_s;
    private boolean forceDisconnect;
    private int serverNumber;
    private boolean memberLaunch;
    static String[] field_F;
    private long instanceId;
    String serverHost;
    private boolean officialDomainHost;
    static int field_D;
    private int gameCrc;
    private int affiliateId;
    private int primaryGamePort;
    private int languageId;
    static int musicProfileTransitionMillis;
    private int secondaryGamePort;
    static String[] field_q;

    private final void initializeSharedServices(int gameLocalizationArchiveId, int secondaryCommonUiArchiveId, boolean launchFlag, byte obfuscationGuard, int buttonGraphicsArchiveId, int uiLocalizationArchiveId, int serviceId, int primaryCommonUiArchiveId) {
        java.awt.Frame temporaryFrame = new java.awt.Frame("Jagex");
        temporaryFrame.pack();
        temporaryFrame.dispose();
        this.setBackground(java.awt.Color.black);
        if (obfuscationGuard <= 73) {
          musicProfileTransitionMillis = 91;
        }
        ConsoleExpression.field_m = this.languageId;
        ChannelFadeTimeConsoleCommand.b(ConsoleExpression.field_m, 1);
        hq.a(serviceId, 5000, this.secondaryGamePort, 5000, launchFlag, ConsoleExpression.field_m, this.serverNumber, 0, this.primaryGamePort, this.memberLaunch, this.serverHost, IntPair.field_m, this.instanceId, this.gameCrc);
        qf.a(ConsoleExpression.field_m, this.serverHost, this.gameCrc, (byte) 103, this.serverNumber, serviceId, this.secondaryGamePort, this.primaryGamePort, IntPair.field_m);
        QuickChatPhraseRepository.configurePunctuationKeys((byte) 112);
        CampaignMission.field_I = jk.b(68);
        BitmapTextWidgetPainter.a(101, IndexedSpriteBase.field_b);
        ChatMessage.field_c = primaryCommonUiArchiveId;
        on.field_n = uiLocalizationArchiveId;
        BitmapTextWidgetPainter.field_p = gameLocalizationArchiveId;
        ModalDialog.field_E = secondaryCommonUiArchiveId;
        DualLinkedNode.field_t = buttonGraphicsArchiveId;
        this.configureSharedPacketLengths((byte) -51);
        LoginForm.l(0);
    }

    final static void resetIdleTracking(int obfuscationGuard) {
        EditableTextField.field_Lb = vi.monotonicMillis(-83);
        mu.field_d = 0;
        if (obfuscationGuard != -20873) {
          NetworkGameShell.releaseSharedShellGlobals(-23);
        }
    }

    private final void enableChatAndSocialPackets(int obfuscationGuard) {
        CheckBoxWidgetPainter.acceptedPacketOpcodes[12] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[13] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[11] = true;
        if (obfuscationGuard != -13) {
          this.enableOpcode2(true);
        }
    }

    public static void releaseSharedShellGlobals(int obfuscationGuard) {
        field_u = null;
        field_s = null;
        field_A = null;
        int var1 = -43 / ((-1 - obfuscationGuard) / 41);
        field_q = null;
        field_F = null;
        field_y = null;
        boneShadowSprites = null;
    }

    private final void configureCommonPacketHandlers(boolean enableOpcode7, boolean enableOpcode8) {
        CheckBoxWidgetPainter.acceptedPacketOpcodes[8] = enableOpcode8;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[7] = enableOpcode7;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[0] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[18] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[16] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[3] = true;
        CheckBoxWidgetPainter.acceptedPacketOpcodes[17] = true;
    }

    final int pollGameConnection(byte obfuscationGuard) {
        int connectionResult;
        if (this.errorReported) {
          return -1;
        }
        if (!MovementPresentation.j(-11)) {
          return -1;
        }
        if (MaskedTextEntryPainter.field_C) {
          return -1;
        }
        if (obfuscationGuard >= -15) {
          this.memberLaunch = true;
        }
        connectionResult = InstructionsPanel.a((byte) -53, this.affiliateId, this.officialDomainHost, RadialSummonItem.a(-1), CombatPresentation.i(-4938), true);
        if (connectionResult == -1) {
          return -1;
        }
        if (connectionResult == 0) {
          if (SoundCache.field_b != 11) {
            return connectionResult;
          }
          if (ModalDialogHost.field_K != 0) {
            return connectionResult;
          }
          DualLinkedNode.e(116);
          return connectionResult;
        }
        if (connectionResult != 1) {
          if (!TurnEffectEvent.field_C) {
            this.reportGameError("reconnect", (byte) -81);
          }
          er.b(-11);
          wv.a(BitmapTextWidgetPainter.field_r, 10, connectionResult);
          MaskedTextEntryPainter.field_C = true;
          jl.field_a = vi.monotonicMillis(-111) + 15000L;
        } else {
          if (SoundCache.field_b == 11 &&
            ModalDialogHost.field_K == 0) {
            DualLinkedNode.e(116);
          }
        }
        return connectionResult;
    }

    private final void enablePacketOpcode(int opcode) {
        CheckBoxWidgetPainter.acceptedPacketOpcodes[opcode] = true;
    }

    private final void persistSessionCookie(byte obfuscationGuard) {
        if (obfuscationGuard <= 119) {
          return;
        }
        String sessionText = UnitModelPreview.b((byte) 61);
        dj.a(CombatEvent.d((byte) 47), 0, sessionText);
    }

    private final void enableOpcode4(int obfuscationGuard) {
        if (obfuscationGuard != -7532) {
          field_u = (String) null;
        }
        CheckBoxWidgetPainter.acceptedPacketOpcodes[4] = true;
    }

    private final void enableOpcode5(int obfuscationGuard) {
        if (obfuscationGuard <= 77) {
          field_s = (String) null;
        }
        CheckBoxWidgetPainter.acceptedPacketOpcodes[5] = true;
    }

    private final void enableOpcode2(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return;
        }
        CheckBoxWidgetPainter.acceptedPacketOpcodes[2] = true;
    }

    private final void enableOpcode6(int obfuscationGuard) {
        CheckBoxWidgetPainter.acceptedPacketOpcodes[6] = true;
        if (obfuscationGuard != 9) {
          this.primaryGamePort = -103;
        }
    }

    final int processAccountUi(byte obfuscationGuard, boolean alternateUiMode) {
        int guardRemainder = 14 % ((-26 - obfuscationGuard) / 53);
        return this.processAccountUiAction(alternateUiMode, true, (byte) -109);
    }

    final void startDefaultApplet(byte obfuscationGuard, int cacheIndexCount, String cacheName) {
        try {
          this.startFromAppletParameters(cacheIndexCount, -26261, 480, 640, cacheName);
          int guardRemainder = -77 % ((obfuscationGuard + 5) / 34);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "wf.I(" + obfuscationGuard + ',' + cacheIndexCount + ',' + (cacheName != null ? "{...}" : "null") + ')');
        }
    }

    private final void handleBrowserNavigationPacket(int obfuscationGuard) {
        int flags = ByteStorage.incomingPacket.readUnsignedByte(0);
        int navigationFlag = (flags & 1) != 0 ? 1 : 0;
        int textLength = fk.packetPayloadLength - 1;
        byte[] encodedUrl = new byte[textLength];
        ByteStorage.incomingPacket.a(textLength, encodedUrl, false, 0);
        SpellCastAction.a(CombatEvent.d((byte) -125), 87, uu.a(encodedUrl, (byte) 127), navigationFlag != 0);
        if (obfuscationGuard != 16433) {
          this.dispatchSharedPacket(-76);
        }
    }

    private final int processAccountUiAction(boolean alternateUiMode, boolean normalUiMode, byte obfuscationGuard) {
        try {
          Throwable caughtFailure = null;
          int actionCode = 0;
          int actionOneResult = 0;
          Exception countryListFailure = null;
          String countryListText = null;
          int obfuscationControl = 0;
          String missingCountryList = null;
          String failedCountryList = null;
          Boolean optionalChoice = null;
          PacketBuffer countryResponse = null;
          int actionTwoResult;
          int connectionResult;
          obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (obfuscationGuard >= -68) {
            this.forceDisconnect = true;
          }
          actionCode = IntrusiveNode.a(el.field_d, alternateUiMode, true, ConsoleExpression.field_m);
          if (actionCode == 0) {
            throw new IllegalStateException();
          }
          if (1 == actionCode) {
            actionOneResult = ClientConnectionState.a(false, CampaignMission.c((byte) -27), IconLabelControl.l(-117));
            if (actionOneResult != -1) {
              AiPlanningStrategy.a(103, br.field_b, BitmapTextWidgetPainter.field_r, actionOneResult);
              BitmapTextWidgetPainter.field_r = null;
              br.field_b = null;
            }
            optionalChoice = r.l(-11506);
            if (optionalChoice != null) {
              UiSelectionState.a((byte) 32, optionalChoice.booleanValue());
            }
          }
          if (2 == actionCode) {
            actionTwoResult = DiskCacheWorker.a((byte) -46, CombatPresentation.i(-4938), cn.e(488997228), lb.b(0), this.affiliateId, DefeatPlayerWithMetricsConsoleCommand.e((byte) -127), RadialSummonItem.a(-1));
            if (actionTwoResult != -1) {
              CampaignMenuEntry.a(BitmapTextWidgetPainter.field_r, -14, br.field_b, actionTwoResult);
              BitmapTextWidgetPainter.field_r = null;
              br.field_b = null;
            }
          }
          if (3 == actionCode) {
            if (ModalDialogHost.field_K != -1 &&
              ModalDialogHost.field_K != 0) {
              ModalDialogHost.field_K = -1;
              lb.a((byte) -8);
            }
            if (normalUiMode) {
              MaskedTextEntryPainter.field_C = false;
            } else {
              connectionResult = InstructionsPanel.a((byte) -53, this.affiliateId, this.officialDomainHost, RadialSummonItem.a(-1), CombatPresentation.i(-4938), false);
              if (connectionResult != -1) {
                if (connectionResult != 0) {
                  wv.a(BitmapTextWidgetPainter.field_r, 10, connectionResult);
                  BitmapTextWidgetPainter.field_r = null;
                } else {
                  ck.field_b = dc.field_o;
                  DualLinkedNode.e(112);
                  QuickChatCategoryRepository.field_b = false;
                  SoundCache.field_b = 10;
                }
              }
            }
          }
          if (actionCode == 4) {
            if (BestScoreStrategy.field_l) {
              QuickChatCategoryRepository.a(CombatEvent.d((byte) -116), true);
            } else {
              QuickChatCategoryRepository.field_b = true;
              SoundCache.field_b = 10;
            }
          }
          if (5 == actionCode) {
            CampaignResult.a(CombatEvent.d((byte) -115), (byte) -3);
          }
          if (6 == actionCode &&
            it.field_b) {
            SoundCache.field_b = 10;
          }
          if (actionCode == 7) {
            ws.a(CombatEvent.d((byte) 53), -126);
          }
          if (actionCode == 8) {
            QuickChatCategoryRepository.a(CombatEvent.d((byte) -120), true);
          }
          if (9 == actionCode) {
            ov.a(CombatEvent.d((byte) 48), 11982);
          }
          if (10 == actionCode) {
            EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 17);
          }
          if (11 == actionCode) {
            t.a((byte) -118, CombatEvent.d((byte) 7));
          }
          if (actionCode == 12) {
            ActionSpell.a(CombatEvent.d((byte) -123), -69, GridWidgetContainer.j(-129));
          }
          if (actionCode == 13) {
            try {
              if (MusicPatchEnvelope.field_h == null) {
                MusicPatchEnvelope.field_h = new BoundedUrlRequest(IntPair.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (MusicPatchEnvelope.field_h.poll(0)) {
                countryResponse = MusicPatchEnvelope.field_h.getResultForState(3);
                if (countryResponse != null) {
                  countryListText = BattlefieldTheme.decodeSingleByteText(0, countryResponse.position, -127, countryResponse.payload);
                  LoginForm.a(countryListText, -73);
                } else {
                  missingCountryList = (String) null;
                  LoginForm.a((String) null, -108);
                }
                MusicPatchEnvelope.field_h = null;
              }
            } catch (java.lang.Exception caughtCountryFailure) {
              caughtFailure = caughtCountryFailure;
              countryListFailure = (Exception) (Object) caughtFailure;
              af.a((Throwable) ((Object) countryListFailure), -99, "S1");
              failedCountryList = (String) null;
              LoginForm.a((String) null, -119);
              MusicPatchEnvelope.field_h = null;
            }
          }
          if (15 == actionCode) {
            SoundCache.field_b = 10;
          }
          if (actionCode == 16) {
            return 1;
          }
          if (actionCode == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final void initializeDefaultSharedServices(int gameLocalizationArchiveId, int serviceId, int buttonGraphicsArchiveId, int secondaryCommonUiArchiveId, int obfuscationGuard, int uiLocalizationArchiveId, int primaryCommonUiArchiveId) {
        if (obfuscationGuard >= -60) {
          this.initializeDefaultSharedServices(85, -61, 12, -69, -2, -25, 37);
        }
        this.initializeSharedServices(gameLocalizationArchiveId, secondaryCommonUiArchiveId, false, (byte) 126, buttonGraphicsArchiveId, uiLocalizationArchiveId, serviceId, primaryCommonUiArchiveId);
    }

    private final void configureSharedPacketLengths(byte obfuscationGuard) {
        sh.opcodePayloadLengths[9] = -1;
        sh.opcodePayloadLengths[7] = -1;
        sh.opcodePayloadLengths[1] = 16;
        sh.opcodePayloadLengths[18] = 1;
        if (obfuscationGuard == -51) {
          sh.opcodePayloadLengths[13] = -1;
          sh.opcodePayloadLengths[4] = -1;
          sh.opcodePayloadLengths[12] = -1;
          sh.opcodePayloadLengths[6] = -2;
          sh.opcodePayloadLengths[5] = -1;
          sh.opcodePayloadLengths[3] = -1;
          sh.opcodePayloadLengths[11] = -1;
          sh.opcodePayloadLengths[16] = -1;
          sh.opcodePayloadLengths[8] = -2;
          sh.opcodePayloadLengths[17] = -1;
          sh.opcodePayloadLengths[10] = -1;
          sh.opcodePayloadLengths[2] = -2;
          return;
        }
    }

    final void advanceAccountUi(byte obfuscationGuard) {
        int discardedUiResult = 0;
        int discardedFullscreenUiResult = 0;
        int obfuscationControl;
        boolean fullscreenActive = false;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 4) {
          this.processAccountUi((byte) 113, true);
        }
        if (!AccountRequestResult.a((byte) 60)) {
          if (StrongCacheEntry.field_E >= 10) {
            if (!BitmapTextWidgetPainter.b(true)) {
              StateChangeEvent.e((byte) -84);
            } else {
              if (SoundCache.field_b == 0) {
                discardedUiResult = this.processAccountUiAction(false, false, (byte) -92);
              } else {
                ii.a(el.field_d, (byte) -89);
              }
            }
          }
        } else {
          fullscreenActive = (null != FixedQuaternion.fullscreenCanvas);
          discardedFullscreenUiResult = this.processAccountUiAction(fullscreenActive, false, (byte) -97);
        }
    }

    final void dispatchSharedPacket(int obfuscationGuard) {
        int chatDecodeGuard = 0;
        boolean systemMessage = false;
        int opcode;
        ChatMessage message;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        opcode = MusicCrossfadeStream.deliveredOpcode;
        if (opcode < 64 &&
          CheckBoxWidgetPainter.acceptedPacketOpcodes[opcode]) {
          if (0 == opcode) {
            return;
          }
          regionExit1: {
            switch (opcode) {
              case 2:
                LeaderEscortCondition.d(9);
                break;
              case 4:
                da.a((byte) -101);
                break;
              case 6:
                AiInfluenceMap.a(true);
                break;
              case 16:
                da.readLocalAccountName(67);
                break;
              default:
                if (opcode != 11 &&
                  opcode != 12) {
                  switch (opcode) {
                    case 13:
                      MatchConditionEntry.processSocialListUpdate(obfuscationGuard - 11);
                      break regionExit1;
                    case 17:
                      this.handleBrowserNavigationPacket(16433);
                      break regionExit1;
                    case 18:
                      MusicPatchEnvelope.b((byte) 119);
                      break regionExit1;
                    default:
                      af.a((Throwable) null, obfuscationGuard ^ -100, "MGS1: " + CampaignProgress.b(false));
                      dj.a((byte) -124);
                      break regionExit1;
                  }
                }
                chatDecodeGuard = -34;
                systemMessage = (opcode == 12);
                message = CommunityTabGroup.decodeChatMessageWithIntGuard(chatDecodeGuard, systemMessage);
                MapLayout.acceptReceivedChatMessage(message, -1);
                break;
              case 8:
                AgeValidator.a(ByteStorage.incomingPacket, IntPair.field_m, fk.packetPayloadLength, obfuscationGuard - 13);
                break;
              case 7:
                this.persistSessionCookie((byte) 127);
                break;
              case 5:
                cd.b(obfuscationGuard - 48);
                break;
              case 3:
                jg.e(0);
                break;
              case 1:
                InstructionsPanel.e(obfuscationGuard - 135);
                break;
            }
          }
          if (obfuscationGuard != 12) {
            boneShadowSprites = (RgbSprite[]) null;
          }
          return;
        }
        af.a((Throwable) null, -115, "MGS2: " + CampaignProgress.b(false));
        dj.a((byte) -126);
    }

    protected NetworkGameShell() {
    }

    final void configureOptionalPacketHandlers(boolean enableOpcode6, boolean enableOpcode4, boolean enableOpcode5, boolean enableChatAndSocial, int obfuscationGuard, boolean enableOpcode1, boolean enableOpcode2) {
        this.configureCommonPacketHandlers(true, true);
        if (enableOpcode1) {
          this.enablePacketOpcode(1);
        }
        if (enableOpcode2) {
          this.enableOpcode2(false);
        }
        if (enableOpcode4) {
          this.enableOpcode4(-7532);
        }
        if (enableOpcode5) {
          this.enableOpcode5(125);
        }
        if (enableOpcode6) {
          this.enableOpcode6(9);
        }
        if (enableChatAndSocial) {
          this.enableChatAndSocialPackets(-13);
        }
        if (obfuscationGuard <= 6) {
          boneShadowSprites = (RgbSprite[]) null;
        }
    }

    final void advanceSharedClient(int obfuscationGuard, boolean skipCanvasRecreation) {
        int previousResourceFailure = 0;
        int loginGuard = 0;
        String loginDescription = null;
        boolean showRegistration = false;
        boolean offerGuestPlay;
        int loaderReadyFlag = 0;
        int idleTickLimit;
        java.awt.Dimension containerSize;
        int obfuscationControl;
        java.awt.Container container;
        int hadResourceFailure;
        int resourcesReady;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != ActionSpell.viewportManager) {
          if (null == FixedQuaternion.fullscreenCanvas) {
            container = DualNodeIterator.a(0);
            containerSize = container.getSize();
            ActionSpell.viewportManager.setContainerSize(containerSize.height, containerSize.width, -30514);
          }
          ActionSpell.viewportManager.advanceViewport(0);
        }
        r.snapshotKeyboard(true);
        ds.capturePointerInput((byte) 118);
        if (obfuscationGuard <= 124) {
          return;
        }
        if (!PopupPresentation.h(31337) &&
          SoundCache.field_b != 11) {
          LoginMethod.a((byte) 73);
        }
        if (CampaignMission.field_I != null) {
          el.field_d = CampaignMission.field_I.a(9);
        }
        if (TeamRoster.a(99)) {
          idleTickLimit = DualNodeHashTable.getNominalTickRate(-113) * 1200;
          if (this.forceDisconnect ||
            !(idleTickLimit >= bs.a((byte) 99)) &&
            !(MusicPatchPcmStream.getPointerIdleTicks(4) <= idleTickLimit)) {
            this.forceDisconnect = false;
            dj.a((byte) -126);
            er.b(-11);
            wv.a(LobbyPlayer.field_bc, 10, 2);
            qf.b(56);
            MaskedTextEntryPainter.field_C = true;
            jl.field_a = 15000L + vi.monotonicMillis(-49);
          }
        }
        if (ModalDialogHost.field_K == -1 ||
          0 == ModalDialogHost.field_K) {
          previousResourceFailure = (ModalDialogHost.field_K != -1) ? 0 : 1;
          hadResourceFailure = previousResourceFailure;
          ModalDialogHost.field_K = IntrusiveNode.b(86);
          if (hadResourceFailure != 0 &&
            ModalDialogHost.field_K == 0 &&
            11 == SoundCache.field_b &&
            !MovementPresentation.j(-11)) {
            DualLinkedNode.e(112);
          }
          if (ModalDialogHost.field_K != -1 &&
            ModalDialogHost.field_K != 0) {
            jl.field_a = vi.monotonicMillis(98) + 15000L;
          }
        }
        if (ModalDialogHost.field_K != -1 &&
          ModalDialogHost.field_K != 0) {
          if (StrongCacheEntry.field_E < 10) {
            if (3 == ModalDialogHost.field_K) {
              this.reportGameError("js5crc", (byte) -107);
            } else {
              if (ModalDialogHost.field_K != 4) {
                if (ModalDialogHost.field_K == 2) {
                  this.reportGameError("js5connect_full", (byte) -37);
                } else {
                  if (ModalDialogHost.field_K == 5) {
                    this.reportGameError("outofdate", (byte) -67);
                  } else {
                    this.reportGameError("js5connect", (byte) -41);
                  }
                }
              } else {
                this.reportGameError("js5io", (byte) -113);
              }
            }
          } else {
            if (SoundCache.field_b >= 10) {
              er.b(-11);
              if (3 != ModalDialogHost.field_K) {
                if (ModalDialogHost.field_K != 4) {
                  if (ModalDialogHost.field_K != 2) {
                    if (ModalDialogHost.field_K == 5) {
                      wv.a(fk.field_f, 10, 5);
                    } else {
                      wv.a(wm.field_a, 10, 256);
                    }
                  } else {
                    wv.a(ResourceArchive.field_d, 10, 256);
                  }
                } else {
                  wv.a(CampaignMenu.field_k, 10, 256);
                }
              } else {
                wv.a(oq.field_k, 10, 256);
              }
              MaskedTextEntryPainter.field_C = true;
            }
          }
        }
        if ((ModalDialogHost.field_K != -1 &&
          ModalDialogHost.field_K != 0 ||
          MovementPresentation.j(-11)) &&
          jl.field_a <= vi.monotonicMillis(74)) {
          MaskedTextEntryPainter.field_C = false;
          if (ModalDialogHost.field_K != -1 &&
            ModalDialogHost.field_K != 0) {
            ModalDialogHost.field_K = -1;
            lb.a((byte) -8);
          }
        }
        if (ModalDialogHost.field_K == 0 &&
          !MovementPresentation.j(-11)) {
          dd.field_a = false;
        }
        if (StrongCacheEntry.field_E == 0 &&
          us.b(94)) {
          StrongCacheEntry.field_E = 1;
        }
        if (StrongCacheEntry.field_E == 1) {
          if (ConsoleExpression.field_m != 0) {
            IconTextComponent.field_Nb = SpriteButtonPainter.a(on.field_n, true);
          }
          ps.field_u = DamageEvent.a(1, ChatMessage.field_c, (byte) 119, false, true);
          CombatPresentation.field_M = DamageEvent.a(1, ModalDialog.field_E, (byte) 122, false, true);
          h.field_g = DamageEvent.a(1, DualLinkedNode.field_t, (byte) 127, false, true);
          PrintVictoryConditionsConsoleCommand.field_K = ps.field_u;
          StrongCacheEntry.field_E = 2;
          ResourceRequest.field_A = CombatPresentation.field_M;
        }
        if (StrongCacheEntry.field_E == 2) {
          if (null != IconTextComponent.field_Nb &&
            IconTextComponent.field_Nb.ensureIndex((byte) 82)) {
            if (!IconTextComponent.field_Nb.containsGroupName((byte) -128, "")) {
              IconTextComponent.field_Nb = null;
            } else {
              if (IconTextComponent.field_Nb.ensureGroupAvailableByName(28979, "")) {
                CampaignUnitOverride.a((byte) -82, IconTextComponent.field_Nb);
                IconTextComponent.field_Nb = null;
                ModalDialog.a(0);
              }
            }
          }
          if (IconTextComponent.field_Nb == null) {
            StrongCacheEntry.field_E = 3;
          }
        }
        if (StrongCacheEntry.field_E == 3 &&
          wh.a(ps.field_u, (byte) 127, h.field_g, CombatPresentation.field_M) &&
          wh.a(h.field_g, -27701)) {
          cd.a(12);
          EmailValidator.c((byte) 91);
          it.field_b = false;
          UnitSpell.field_e = ConsoleParseException.field_a;
          StateChangeEvent.a(CombatPresentation.field_M, ps.field_u, h.field_g, 0, BestScoreStrategy.field_l);
          if (ChatMessage.field_r ||
            pd.field_b != null) {
            loginGuard = 3;
            loginDescription = pd.field_b;
            showRegistration = !(ChatMessage.field_r);
            offerGuestPlay = !(ChatMessage.field_r);
            rn.openLoginDialog(loginGuard, loginDescription, showRegistration, offerGuestPlay);
          }
          if (hc.field_i) {
            MatchingTextValidator.c((byte) -128);
          }
          if (null == ContentTransitionDialog.field_eb) {
            ContentTransitionDialog.field_eb = MusicPatchEnvelope.getEffectsMixer(18757);
            ko.field_e = nb.c((byte) 111);
          }
          RegistrationAgreementPane.a(h.field_g, (byte) 76, ContentTransitionDialog.field_eb, ko.field_e);
          ps.field_u = null;
          CombatPresentation.field_M = null;
          h.field_g = null;
          SoundCache.a(-24602, (java.applet.Applet) (this));
          ModalDialog.a(0);
          StrongCacheEntry.field_E = 10;
        }
        if (StrongCacheEntry.field_E == 10) {
          if (0 != ConsoleExpression.field_m) {
            RegionAnchor.field_o = SpriteButtonPainter.a(BitmapTextWidgetPainter.field_p, true);
          }
          StrongCacheEntry.field_E = 11;
        }
        boolean loadingStageContinuation = true;
        if (StrongCacheEntry.field_E == 11) {
          if (RegionAnchor.field_o != null && (!RegionAnchor.field_o.ensureIndex((byte) 82) ||
            !RegionAnchor.field_o.ensureAllGroupsAvailable(-27927))) {
            bn.a((byte) -24, 0.0f, ao.a(db.field_b, true, LobbyPlayer.field_Jb, RegionAnchor.field_o));
            loadingStageContinuation = false;
          }
          else {
            TextLineLayout.field_l = true;
            StrongCacheEntry.field_E = 12;
          }
        }
        if (StrongCacheEntry.field_E == 12 &&
          !TextLineLayout.field_l) {
          StrongCacheEntry.field_E = 13;
        }
        if (13 == StrongCacheEntry.field_E) {
          resourcesReady = 1;
          if (null != CombatPresentation.field_G) {
            loaderReadyFlag = (!CombatPresentation.field_G.a(2189)) ? 0 : 1;
            resourcesReady = loaderReadyFlag;
            bn.a((byte) -24, CombatPresentation.field_G.field_d, CombatPresentation.field_G.field_b);
          }
          if (resourcesReady != 0) {
            StrongCacheEntry.field_E = 20;
          }
        }
        if (!skipCanvasRecreation &&
          tq.canvasRebuildRequested) {
          dt.a(IndexedSpriteBase.field_b, 23678);
          this.recreateCanvas((byte) 87);
          BitmapTextWidgetPainter.a(123, IndexedSpriteBase.field_b);
        }
        if (CheckBoxWidgetPainter.acceptedPacketOpcodes[8]) {
          pu.b(28704);
        }
    }

    private final void startFromAppletParameters(int cacheIndexCount, int obfuscationGuard, int height, int width, String cacheName) {
        int discardedUiResult = 0;
        boolean officialDomain = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String cacheNameDescription = null;
        Throwable caughtFailure = null;
        String lowercaseHost = null;
        Exception startupFailure = null;
        RuntimeException failure = null;
        String serverNumberText = null;
        String languageText = null;
        String affiliateText = null;
        String errorMessage = null;
        try {
          try {
            if (!this.e(obfuscationGuard + 26203)) {
              return;
            }
            this.serverHost = this.getCodeBase().getHost();
            lowercaseHost = this.serverHost.toLowerCase();
            officialDomain = (lowercaseHost.equals("jagex.com")) || (lowercaseHost.endsWith(".jagex.com"));
            this.officialDomainHost = officialDomain;
            this.primaryGamePort = Integer.parseInt(this.getParameter("gameport1"));
            this.secondaryGamePort = Integer.parseInt(this.getParameter("gameport2"));
            serverNumberText = this.getParameter("servernum");
            if (serverNumberText != null) {
              this.serverNumber = Integer.parseInt(serverNumberText);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            if (obfuscationGuard != -26261) {
              discardedUiResult = this.processAccountUiAction(true, true, (byte) -74);
            }
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.memberLaunch = this.getParameter("member").equals("yes");
            languageText = this.getParameter("lang");
            if (languageText != null) {
              this.languageId = Integer.parseInt(languageText);
            }
            if (this.languageId >= 5) {
              this.languageId = 0;
            }
            affiliateText = this.getParameter("affid");
            if (affiliateText != null) {
              this.affiliateId = Integer.parseInt(affiliateText);
            }
            hc.field_i = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletShell(width, 32, cacheName, 10, this.gameCrc, cacheIndexCount, height);
          } catch (java.lang.Exception caughtStartupFailure) {
            caughtFailure = caughtStartupFailure;
            startupFailure = (Exception) (Object) caughtFailure;
            errorMessage = (String) null;
            af.a((Throwable) ((Object) startupFailure), 98, (String) null);
            this.reportGameError("crash", (byte) -40);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = (RuntimeException) (Object) caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wf.S(").append(cacheIndexCount).append(',').append(obfuscationGuard).append(',').append(height).append(',').append(width).append(',');
          if (cacheName == null) {
            cacheNameDescription = "null";
          } else {
            cacheNameDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(cacheNameDescription).append(')').toString());
        }
    }

    final static String highlightConsoleSyntax(String source, int obfuscationGuard) {
        int tokenIndex = 0;
        StringBuilder stringAppendResult = null;
        StringBuilder punctuationAppendResult = null;
        StringBuilder booleanAppendResult = null;
        StringBuilder numberAppendResult = null;
        StringBuilder callAppendResult = null;
        StringBuilder characterAppendResult = null;
        int sliceEnd = 0;
        String result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String sourceDescription = null;
        RuntimeException caughtFailure = null;
        ConsoleExpression[] tokensAlias = null;
        RuntimeException failure = null;
        int guardRemainder = 0;
        StringBuilder output = null;
        ConsoleExpression token = null;
        int startOffset = 0;
        int endOffset = 0;
        String slice = null;
        int obfuscationControl = 0;
        ConsoleExpression[] tokens = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          guardRemainder = 107 % ((obfuscationGuard + 11) / 61);
          tokens = vv.cachedConsoleTokenArray(source, 119);
          tokensAlias = tokens;
          output = new StringBuilder();
          for (tokenIndex = 0; tokens.length > tokenIndex; tokenIndex++) {
            token = tokens[tokenIndex];
            startOffset = token.sourceOffset;
            if (tokenIndex == -1 + tokens.length) {
              sliceEnd = source.length();
            } else {
              sliceEnd = tokensAlias[1 + tokenIndex].sourceOffset;
            }
            endOffset = sliceEnd;
            slice = source.substring(startOffset, endOffset);
            if (token.kind == BattleTutorial.consoleStringKind) {
              stringAppendResult = output.append("<col=66ffff>").append(slice).append("</col>");
            } else {
              if (hf.consoleCharacterKind != token.kind) {
                if (token.kind != rn.consoleCallKind) {
                  if (token.kind != PrintVictoryConditionsConsoleCommand.consoleNumberKind) {
                    if (token.kind != EquipmentBattleTutorial.consoleBooleanKind) {
                      punctuationAppendResult = output.append(slice);
                    } else {
                      booleanAppendResult = output.append("<col=33ffaa>").append(slice).append("</col>");
                    }
                  } else {
                    numberAppendResult = output.append("<col=ffaaff>").append(slice).append("</col>");
                  }
                } else {
                  callAppendResult = output.append("<col=ffff99>").append(slice).append("</col>");
                }
              } else {
                characterAppendResult = output.append("<col=33bbff>").append(slice).append("</col>");
              }
            }
          }
          result = output.toString();
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wf.C(");
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sourceDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_s = "Players: ";
        field_A = "Attack";
        field_y = new int[]{14, 15, 8};
        field_F = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        musicProfileTransitionMillis = 3000;
        field_D = 0;
        field_u = "Public";
        field_q = new String[]{"Neutral", "Saradomin", "Zamorak", "Guthix", "Seren", "Bandos", "Menaphite pantheon"};
    }
}
