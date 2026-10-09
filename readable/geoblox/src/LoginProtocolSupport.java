/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginProtocolSupport {
    static String waitingForBootstrapText;
    static String[] achievementDescriptions;
    static boolean lockBootstrapLoginPanelActions;

    final static int advanceLoginHandshake(boolean useLongLoginPayload, String primaryLoginText, int affiliateId, boolean enableLoginFlagBitEight, String secondaryLoginText, int methodGuard) {
        try {
            int connectionPendingResult = 0;
            int closedResponseResult = 0;
            boolean responseFlagFourSet = false;
            boolean responseFlagEightSet = false;
            int connectedResponseResult = 0;
            int retryPendingResult = 0;
            int failedResponseResult = 0;
            int retryFailureResult = 0;
            int pendingHandshakeResult = 0;
            RuntimeException loginFailureCause = null;
            StringBuilder loginFailurePrefix = null;
            String primaryTextDescription = null;
            StringBuilder messageBeforeSecondaryTextDescription = null;
            String secondaryTextDescription = null;
            Throwable caughtLoginOrScriptFailure = null;
            int responseByteThenPortSwapValue = 0;
            String settingsCookieValue = null;
            RuntimeException loginFailureForContext = null;
            int loginResponseFlags = 0;
            int extensionByteIndexThenCipherSeedIndex = 0;
            Throwable ignoredScriptFailure = null;
            int unusedClientControlSnapshot = 0;
            String unusedNullPrimaryTextSnapshot = null;
            String unusedNullLongPayloadTextSnapshot = null;
            CharSequence receivedNameCharacters = null;
            int loginResultResponseByte;
            int previousLoginServerPort;
            int loginCipherSeedIndex;
            unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              if (null == SpriteCheckboxRenderer.sessionSocket &&
                  !SessionSocketSupport.pollSessionSocketOpening(useLongLoginPayload, 52)) {
                connectionPendingResult = -1;
                return connectionPendingResult;
              }
              if (PacketBuffer.currentProtocolStage == IterableNodeHashTable.requestReadyStage) {
                if (!useLongLoginPayload) {
                  EntityContactSupport.pendingLoginPayload = HotspotTextWidget.createLoginPayloadForIdentifier(false, primaryLoginText, secondaryLoginText, false);
                } else {
                  unusedNullLongPayloadTextSnapshot = (String) null;
                  EntityContactSupport.pendingLoginPayload = SecondaryDeque.createLoginPayload(true, ClientClockSupport.loginResponseLongValue, (String) null, primaryLoginText, false);
                }
                CacheReference.outgoingSessionBuffer.position = 0;
                CacheReference.outgoingSessionBuffer.writeByte((byte) -102, 14);
                CacheReference.outgoingSessionBuffer.writeByte((byte) -78, EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32).wireId);
                NanoFrameTimer.flushSessionWrites(-1, -1);
                PacketBuffer.currentProtocolStage = ResizableDialog.awaitingInitialLoginReplyStage;
              }
              if (ResizableDialog.awaitingInitialLoginReplyStage == PacketBuffer.currentProtocolStage &&
                  UiWidget.readSessionBytesIfAvailable(30000, 1)) {
                responseByteThenPortSwapValue = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                LogoCompositor.sessionPacketBuffer.position = 0;
                if (responseByteThenPortSwapValue != 0) {
                  AchievementSubmission.sessionPacketPayloadLength = -1;
                  PacketBuffer.currentProtocolStage = TextInputRenderer.awaitingLoginFailureTextStage;
                  ScorePopup.currentPacketOpcode = responseByteThenPortSwapValue;
                } else {
                  PacketBuffer.currentProtocolStage = MessageDialog.awaitingLoginLongState;
                }
              }
              if (MessageDialog.awaitingLoginLongState == PacketBuffer.currentProtocolStage &&
                  UiWidget.readSessionBytesIfAvailable(30000, 8)) {
                TextValidationSupport.loginHandshakeServerSeed = LogoCompositor.sessionPacketBuffer.readLongBE(2901);
                LogoCompositor.sessionPacketBuffer.position = 0;
                UsernameAvailabilityValidator.writeEncryptedLoginRequest(26, affiliateId, useLongLoginPayload, EntityContactSupport.pendingLoginPayload, enableLoginFlagBitEight);
                PacketBuffer.currentProtocolStage = ClientOptionSupport.awaitingLoginResultStage;
              }
              if (methodGuard != 0) {
                unusedNullPrimaryTextSnapshot = (String) null;
                LoginProtocolSupport.advanceLoginHandshake(false, (String) null, 95, false, (String) null, 13);
              }
              loginResultDispatch: {
                if (ClientOptionSupport.awaitingLoginResultStage == PacketBuffer.currentProtocolStage &&
                    UiWidget.readSessionBytesIfAvailable(30000, 1)) {
                  loginResultResponseByte = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.position = 0;
                  GameSoundResources.optionalLoginText = null;
                  ScorePopup.currentPacketOpcode = loginResultResponseByte;
                  if (loginResultResponseByte != 0 &&
                      loginResultResponseByte != 1) {
                    if (loginResultResponseByte != 8) {
                      PacketBuffer.currentProtocolStage = TextInputRenderer.awaitingLoginFailureTextStage;
                      AchievementSubmission.sessionPacketPayloadLength = -1;
                      break loginResultDispatch;
                    }
                    Bzip2DecoderState.closeSessionSocket((byte) -116);
                    TextTemplateArgumentType.loginRetryAttempted = false;
                    closedResponseResult = loginResultResponseByte;
                    return closedResponseResult;
                  }
                  AchievementSubmission.sessionPacketPayloadLength = -1;
                  PacketBuffer.currentProtocolStage = ClientOptionSupport.awaitingLoginDetailsStage;
                }
              }
              if (ClientOptionSupport.awaitingLoginDetailsStage == PacketBuffer.currentProtocolStage &&
                  TriangleMesh.readSessionPacketPayload(false)) {
                ClientClockSupport.loginResponseLongValue = LogoCompositor.sessionPacketBuffer.readLongBE(2901);
                SpriteCheckboxRenderer.loginDebugPermissionLevel = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                TextTemplateDefinition.loginMembershipGateValue = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
                settingsCookieValue = LogoCompositor.sessionPacketBuffer.readNullableNullTerminatedText((byte) 53);
                loginResponseFlags = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                if ((1 & loginResponseFlags) != 0) {
                  SessionBootstrapSupport.persistSessionSeedBytes((byte) 65);
                }
                if (!useLongLoginPayload) {
                  responseFlagFourSet = !((loginResponseFlags & 4) == 0);
                  GzipInflater.loginResponseFlagFourSet = responseFlagFourSet;
                  responseFlagEightSet = !((loginResponseFlags & 8) == 0);
                  TextHotspotBounds.loginResponseFlagEightSet = responseFlagEightSet;
                  if (!TextHotspotBounds.loginResponseFlagEightSet) {
                  }
                }
                if (GameGraphicsResources.loginResponseExtensionEnabled) {
                  LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.readIntBE((byte) -48);
                  PacketBuffer.loginResponseExtensionLength = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
                  ValidatedTextInputWidget.loginResponseExtensionBytes = new byte[PacketBuffer.loginResponseExtensionLength];
                  for (extensionByteIndexThenCipherSeedIndex = 0; PacketBuffer.loginResponseExtensionLength > extensionByteIndexThenCipherSeedIndex; extensionByteIndexThenCipherSeedIndex++) {
                    ValidatedTextInputWidget.loginResponseExtensionBytes[extensionByteIndexThenCipherSeedIndex] = LogoCompositor.sessionPacketBuffer.readSignedByte((byte) 72);
                  }
                }
                SecondaryDeque.receivedSessionName = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 105);
                receivedNameCharacters = (CharSequence) ((Object) SecondaryDeque.receivedSessionName);
                SecondaryNodeHashTable.normalizedSessionName = ResizableDialog.normalizeSessionName(receivedNameCharacters, 12);
                EntityLinkSupport.sessionAccessLevelByte = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                PacketBuffer.currentProtocolStage = LogoCompositor.connectedSessionStage;
                if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) != RatingPresentationResources.loginPayloadKindThree) {
                  if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) == Geoblox.longAndNameLoginType) {
                    ProgressDialog.usernameLoginMethod.rememberMethod(NodeHashTableIterator.getActiveApplet(108), 0);
                  }
                } else {
                  LoginTextValue.emailLoginMethod.rememberMethod(NodeHashTableIterator.getActiveApplet(122), 0);
                }
                TextTemplateArgumentType.loginRetryAttempted = false;
                if (settingsCookieValue != null) {
                  SettingsCookieSupport.storeSettingsCookie(100, settingsCookieValue, NodeHashTableIterator.getActiveApplet(112));
                }
                if (TextTemplateDefinition.loginMembershipGateValue <= 0 &&
                    !GzipInflater.loginResponseFlagFourSet) {
                  try {
                    AppletJavaScriptBridge.callWithoutArguments((byte) -6, NodeHashTableIterator.getActiveApplet(107), "unzap");
                  } catch (java.lang.Throwable unzapScriptFailure) {
                    caughtLoginOrScriptFailure = unzapScriptFailure;
                    ignoredScriptFailure = caughtLoginOrScriptFailure;
                  }
                } else {
                  try {
                    AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{UnderlinedButtonRenderer.decodeBase37DisplayName(ClientClockSupport.loginResponseLongValue, methodGuard + 97)}, NodeHashTableIterator.getActiveApplet(methodGuard + 119), "zap");
                  } catch (java.lang.Throwable zapScriptFailure) {
                    caughtLoginOrScriptFailure = zapScriptFailure;
                    ignoredScriptFailure = caughtLoginOrScriptFailure;
                  }
                }
                if (TextTemplateDefinition.loginMembershipGateValue > 0) {
                  FontLoadingSupport.memberAccountMode = true;
                }
                CacheReference.outgoingSessionBuffer.initializeCipher(ProgressBarWidget.loginCipherSeedWords, false);
                for (loginCipherSeedIndex = 0; loginCipherSeedIndex < 4; loginCipherSeedIndex++) {
                  ProgressBarWidget.loginCipherSeedWords[loginCipherSeedIndex] = ProgressBarWidget.loginCipherSeedWords[loginCipherSeedIndex] + 50;
                }
                LogoCompositor.sessionPacketBuffer.initializeCipher(ProgressBarWidget.loginCipherSeedWords, false);
                connectedResponseResult = ScorePopup.currentPacketOpcode;
                return connectedResponseResult;
              }
              if (PacketBuffer.currentProtocolStage == TextInputRenderer.awaitingLoginFailureTextStage &&
                  TriangleMesh.readSessionPacketPayload(false)) {
                Bzip2DecoderState.closeSessionSocket((byte) -118);
                if (ScorePopup.currentPacketOpcode == 7 &&
                    !TextTemplateArgumentType.loginRetryAttempted) {
                  TextTemplateArgumentType.loginRetryAttempted = true;
                  retryPendingResult = -1;
                  return retryPendingResult;
                }
                if (ScorePopup.currentPacketOpcode == 7) {
                  ScorePopup.currentPacketOpcode = 3;
                }
                AudioService.sessionResponseText = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 101);
                TextTemplateArgumentType.loginRetryAttempted = false;
                failedResponseResult = ScorePopup.currentPacketOpcode;
                return failedResponseResult;
              }
              if (null == SpriteCheckboxRenderer.sessionSocket) {
                if (TextTemplateArgumentType.loginRetryAttempted) {
                  if (30000L >= GameGraphicsResources.elapsedSinceSessionActivity((byte) 12)) {
                    AudioService.sessionResponseText = FullscreenFailureReason.loginMessage2Text;
                  } else {
                    AudioService.sessionResponseText = IntrusiveNode.loginMessage3Text;
                  }
                  TextTemplateArgumentType.loginRetryAttempted = false;
                  retryFailureResult = 3;
                  return retryFailureResult;
                }
                previousLoginServerPort = NetworkArchiveRequest.sessionServerPort;
                NetworkArchiveRequest.sessionServerPort = TextInputRenderer.alternateSessionServerPort;
                TextInputRenderer.alternateSessionServerPort = previousLoginServerPort;
                TextTemplateArgumentType.loginRetryAttempted = true;
              }
              pendingHandshakeResult = -1;
              return pendingHandshakeResult;
            } catch (java.lang.RuntimeException loginFailure) {
              caughtLoginOrScriptFailure = loginFailure;
              loginFailureForContext = (RuntimeException) (Object) caughtLoginOrScriptFailure;
              loginFailureCause = loginFailureForContext;
              loginFailurePrefix = new StringBuilder().append("ri.B(").append(useLongLoginPayload).append(',');
              if (primaryLoginText == null) {
                primaryTextDescription = "null";
              } else {
                primaryTextDescription = "{...}";
              }
              messageBeforeSecondaryTextDescription = ((StringBuilder) (Object) loginFailurePrefix).append(primaryTextDescription).append(',').append(affiliateId).append(',').append(enableLoginFlagBitEight).append(',');
              if (secondaryLoginText == null) {
                secondaryTextDescription = "null";
              } else {
                secondaryTextDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFailureCause), ((StringBuilder) (Object) messageBeforeSecondaryTextDescription).append(secondaryTextDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedLoginFailure) {
            throw uncheckedLoginFailure;
        } catch (Throwable checkedLoginFailure) {
            throw new RuntimeException(checkedLoginFailure);
        }
    }

    final static void drawAvatarFaceLayers(int avatarX, int avatarY, int methodGuard) {
        int faceOriginOffsetX = 2 + (MeshDepthSupport.avatarMaskRaster.fullWidth >> 1);
        if (methodGuard != 29497) {
            return;
        }
        int faceOriginOffsetY = (MeshDepthSupport.avatarMaskRaster.fullHeight >> 1) + 2;
        EndingAnimationSupport.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarX - faceOriginOffsetX, avatarY - faceOriginOffsetY, DisplayModeInfo.avatarTintColor);
        UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(-faceOriginOffsetX + avatarX, -faceOriginOffsetY + avatarY, DisplayModeInfo.avatarTintColor);
    }

    public static void releaseStaticReferences(int methodGuard) {
        waitingForBootstrapText = null;
        if (methodGuard != 5366) {
            achievementDescriptions = (String[]) null;
        }
        achievementDescriptions = null;
    }

    static {
        lockBootstrapLoginPanelActions = false;
        achievementDescriptions = new String[]{"Clear 3 geoblox of the same colour and shape", "Clear the geoblox avatar", "Finish a stage with the avatar clear of geoblox", "Achieve a 6x bonus multiplier", "Achieve a 7x bonus multiplier", "Achieve an 8x bonus multiplier", "Destroy 5 black orbs", "Destroy 3 black orbs with one shock", "Pass the sun stage", "Pass the sweet stage", "Pass the jewellery stage", "Pass the germ stage", "Pass the space stage", "Pass the sport stage", "Pass the bakery stage", "Get past all stages twice!", "Score 7,000 points during Halloween"};
    }
}
