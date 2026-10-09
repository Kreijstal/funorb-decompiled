/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntityCollisionSupport {
    static int matchChainLength;
    static int heldPointerButtonSnapshot;
    static int[] queuedKeyStateChanges;
    static int[] cameraMeshVertexZ;
    static AccountCreationForm activeAccountCreationForm;
    static String createPasswordContainsNameAlertText;

    final static void preparePendingActionPanel(byte methodGuard) {
        int sentinelDivisionGuard = 78 % ((-69 - methodGuard) / 46);
        PendingActionMarker pendingActionMarker = (PendingActionMarker) ((Object) ArchiveRequest.pendingActionMarkers.firstForIteration(0));
        pendingActionMarker = pendingActionMarker;
        if (pendingActionMarker == null) {
            return;
        }
        LogoCompositor.pendingActionPanelTop = 480;
        MidiPcmStream.pendingActionPanelPhase = 0;
        MultiHandleSliderRenderer.pendingActionPanelWidth = 72 + FadingDialog.uiPaletteFont.measureMaximumWrappedWidth(GameplaySetupSupport.achievementTitles[pendingActionMarker.actionId], 100);
        RasterTargetSnapshot.pendingActionPanelHeight = 30 * FadingDialog.uiPaletteFont.countWrappedLines(GameplaySetupSupport.achievementTitles[pendingActionMarker.actionId], 100) + 30;
        if (62 > RasterTargetSnapshot.pendingActionPanelHeight) {
            RasterTargetSnapshot.pendingActionPanelHeight = 62;
            return;
        }
    }

    public static void releaseStaticReferences(boolean skipArchiveProgressGuard) {
        activeAccountCreationForm = null;
        cameraMeshVertexZ = null;
        if (skipArchiveProgressGuard) {
            queuedKeyStateChanges = null;
            createPasswordContainsNameAlertText = null;
            return;
        }
        String unusedNullProgressLabelSnapshot = (String) null;
        EntityCollisionSupport.formatArchiveGroupProgress((String) null, (ResourceArchive) null, (String) null, (String) null, true);
        queuedKeyStateChanges = null;
        createPasswordContainsNameAlertText = null;
    }

    final static void renderEntityCollisionSprite(GameplayEntity entity, int methodGuard, float boardAngleRadians) {
        float boardCenterOffsetX = 0.0f;
        float boardCenterOffsetY = 0.0f;
        try {
            boardCenterOffsetX = -320.0f + entity.positionX;
            boardCenterOffsetY = entity.positionY - 240.0f;
            DialogLayer.rotatedEntityScreenX = (int)(0.5 + (Math.cos((double)boardAngleRadians) * (double)boardCenterOffsetX - Math.sin((double)boardAngleRadians) * (double)boardCenterOffsetY + 320.0));
            if (methodGuard != -1232328029) {
                java.applet.Applet nullAppletForInvalidGuard = (java.applet.Applet) null;
                EntityCollisionSupport.openQuitPage((java.applet.Applet) null, 60);
            }
            ValidationIconWidget.rotatedEntityScreenY = (int)(240.0 + (Math.sin((double)boardAngleRadians) * (double)boardCenterOffsetX + (double)boardCenterOffsetY * Math.cos((double)boardAngleRadians)) + 0.5);
            HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            entity.entitySprite.rotateNearest(entity.entitySprite.fullWidth << 3, entity.entitySprite.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * ((double)(-boardAngleRadians + entity.spriteAngleRadians) / 6.283185307179586)), 4096);
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        } catch (RuntimeException collisionSpriteRenderFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) collisionSpriteRenderFailure), "gf.F(" + (entity != null ? "{...}" : "null") + ',' + methodGuard + ',' + boardAngleRadians + ')');
        }
    }

    final static void openQuitPage(java.applet.Applet applet, int methodGuard) {
        try {
            java.net.URL quitPageUrl = null;
            Exception navigationFailureForPrint = null;
            RuntimeException navigationFailureForContext = null;
            RuntimeException contextCause = null;
            StringBuilder contextMessagePrefix = null;
            String appletArgumentDescription = null;
            Throwable caughtNavigationFailure = null;
            try {
              if (methodGuard != 62) {
                matchChainLength = 11;
              }
              try {
                quitPageUrl = new java.net.URL(applet.getCodeBase(), "quit.ws");
                applet.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(quitPageUrl, 102, applet), "_top");
                return;
              } catch (java.lang.Exception printedNavigationFailure) {
                caughtNavigationFailure = printedNavigationFailure;
                navigationFailureForPrint = (Exception) (Object) caughtNavigationFailure;
                navigationFailureForPrint.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException contextNavigationFailure) {
              caughtNavigationFailure = contextNavigationFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationFailure;
              contextCause = navigationFailureForContext;
              contextMessagePrefix = new StringBuilder().append("gf.D(");
              if (applet == null) {
                appletArgumentDescription = "null";
              } else {
                appletArgumentDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contextCause), ((StringBuilder) (Object) contextMessagePrefix).append(appletArgumentDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedNavigationFailure) {
            throw uncheckedNavigationFailure;
        } catch (Throwable checkedNavigationFailure) {
            throw new RuntimeException(checkedNavigationFailure);
        }
    }

    final static void writeOpcodeWithOneZeroPayload(int packetOpcode, int methodGuard) {
        PacketBuffer firstOutputPacketSnapshot = null;
        PacketBuffer secondOutputPacketSnapshot;
        if (methodGuard >= 28) {
            firstOutputPacketSnapshot = CacheReference.outgoingSessionBuffer;
            firstOutputPacketSnapshot.writeCipherByte(packetOpcode, (byte) -103);
            firstOutputPacketSnapshot.writeByte((byte) 127, 1);
            firstOutputPacketSnapshot.writeByte((byte) -20, 0);
            return;
        }
        createPasswordContainsNameAlertText = (String) null;
        secondOutputPacketSnapshot = CacheReference.outgoingSessionBuffer;
        secondOutputPacketSnapshot.writeCipherByte(packetOpcode, (byte) -103);
        secondOutputPacketSnapshot.writeByte((byte) 127, 1);
        secondOutputPacketSnapshot.writeByte((byte) -20, 0);
    }

    final static String formatArchiveGroupProgress(String fallbackMessage, ResourceArchive archive, String groupName, String progressLabel, boolean methodGuard) {
        RuntimeException progressFailureForContext = null;
        String fallbackBeforeReturn = null;
        String formattedProgressMessage = null;
        RuntimeException progressFailureBeforeArgumentDescriptions = null;
        StringBuilder progressMessagePrefix = null;
        String fallbackArgumentDescription = null;
        StringBuilder progressMessageBeforeArchiveDescription = null;
        String archiveArgumentDescription = null;
        StringBuilder progressMessageBeforeGroupDescription = null;
        String groupArgumentDescription = null;
        StringBuilder progressMessageBeforeLabelDescription = null;
        String labelArgumentDescription = null;
        RuntimeException caughtProgressFailure = null;
        try {
          if (!methodGuard) {
            cameraMeshVertexZ = (int[]) null;
          }
          if (!archive.ensureIndexLoaded(0)) {
            fallbackBeforeReturn = (String) (fallbackMessage);
            return fallbackBeforeReturn;
          }
          formattedProgressMessage = progressLabel + " - " + archive.getGroupProgressByName(0, groupName) + "%";
          return formattedProgressMessage;
        } catch (java.lang.RuntimeException archiveProgressFailure) {
          caughtProgressFailure = archiveProgressFailure;
          progressFailureForContext = caughtProgressFailure;
          progressFailureBeforeArgumentDescriptions = progressFailureForContext;
          progressMessagePrefix = new StringBuilder().append("gf.E(");
          if (fallbackMessage == null) {
            fallbackArgumentDescription = "null";
          } else {
            fallbackArgumentDescription = "{...}";
          }
          progressMessageBeforeArchiveDescription = ((StringBuilder) (Object) progressMessagePrefix).append(fallbackArgumentDescription).append(',');
          if (archive == null) {
            archiveArgumentDescription = "null";
          } else {
            archiveArgumentDescription = "{...}";
          }
          progressMessageBeforeGroupDescription = ((StringBuilder) (Object) progressMessageBeforeArchiveDescription).append(archiveArgumentDescription).append(',');
          if (groupName == null) {
            groupArgumentDescription = "null";
          } else {
            groupArgumentDescription = "{...}";
          }
          progressMessageBeforeLabelDescription = ((StringBuilder) (Object) progressMessageBeforeGroupDescription).append(groupArgumentDescription).append(',');
          if (progressLabel == null) {
            labelArgumentDescription = "null";
          } else {
            labelArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressFailureBeforeArgumentDescriptions), ((StringBuilder) (Object) progressMessageBeforeLabelDescription).append(labelArgumentDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static String getSharedNavigationTarget(int methodGuard) {
        if (methodGuard != 240) {
            cameraMeshVertexZ = (int[]) null;
            return CanvasResizeController.pendingNavigationTarget;
        }
        return CanvasResizeController.pendingNavigationTarget;
    }

    static {
        matchChainLength = 0;
        queuedKeyStateChanges = new int[128];
        heldPointerButtonSnapshot = 0;
        cameraMeshVertexZ = new int[8192];
        createPasswordContainsNameAlertText = "This password contains your Player Name, and would be easy to guess";
    }
}
