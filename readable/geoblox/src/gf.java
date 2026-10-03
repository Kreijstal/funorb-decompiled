/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int matchChainLength;
    static int heldPointerButtonSnapshot;
    static int[] queuedKeyStateChanges;
    static int[] cameraMeshVertexZ;
    static qh field_d;
    static String createPasswordContainsNameAlertText;

    final static void preparePendingActionPanel(byte methodGuard) {
        int sentinelDivisionGuard = 78 % ((-69 - methodGuard) / 46);
        PendingActionMarker pendingActionMarker = (PendingActionMarker) ((Object) ArchiveRequest.pendingActionMarkers.firstForIteration(0));
        pendingActionMarker = pendingActionMarker;
        if (pendingActionMarker == null) {
            return;
        }
        eh.pendingActionPanelTop = 480;
        kj.pendingActionPanelPhase = 0;
        jf.pendingActionPanelWidth = 72 + FadingDialog.uiPaletteFont.measureMaximumWrappedWidth(pg.achievementTitles[pendingActionMarker.actionId], 100);
        tl.pendingActionPanelHeight = 30 * FadingDialog.uiPaletteFont.countWrappedLines(pg.achievementTitles[pendingActionMarker.actionId], 100) + 30;
        if (62 > tl.pendingActionPanelHeight) {
            tl.pendingActionPanelHeight = 62;
            return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        cameraMeshVertexZ = null;
        if (param0) {
            queuedKeyStateChanges = null;
            createPasswordContainsNameAlertText = null;
            return;
        }
        String var2 = (String) null;
        gf.formatArchiveGroupProgress((String) null, (ResourceArchive) null, (String) null, (String) null, true);
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
                gf.a((java.applet.Applet) null, 60);
            }
            td.rotatedEntityScreenY = (int)(240.0 + (Math.sin((double)boardAngleRadians) * (double)boardCenterOffsetX + (double)boardCenterOffsetY * Math.cos((double)boardAngleRadians)) + 0.5);
            vf.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            entity.entitySprite.rotateNearest(entity.entitySprite.fullWidth << 3, entity.entitySprite.fullHeight << 3, vf.spriteScratchRaster.fullWidth << 3, vf.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * ((double)(-boardAngleRadians + entity.spriteAngleRadians) / 6.283185307179586)), 4096);
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        } catch (RuntimeException collisionSpriteRenderFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) collisionSpriteRenderFailure), "gf.F(" + (entity != null ? "{...}" : "null") + ',' + methodGuard + ',' + boardAngleRadians + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param1 != 62) {
                matchChainLength = 11;
              }
              try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(wf.a(var2, 102, param0), "_top");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = var2_ref2;
              stackIn_8_1 = new StringBuilder().append("gf.D(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        PacketBuffer var2 = null;
        if (param1 >= 28) {
            var2 = fj.field_q;
            var2.writeCipherByte(param0, (byte) -103);
            var2.writeByte((byte) 127, 1);
            var2.writeByte((byte) -20, 0);
            return;
        }
        createPasswordContainsNameAlertText = (String) null;
        var2 = fj.field_q;
        var2.writeCipherByte(param0, (byte) -103);
        var2.writeByte((byte) 127, 1);
        var2.writeByte((byte) -20, 0);
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

    final static String a(int param0) {
        if (param0 != 240) {
            cameraMeshVertexZ = (int[]) null;
            return v.field_e;
        }
        return v.field_e;
    }

    static {
        matchChainLength = 0;
        queuedKeyStateChanges = new int[128];
        heldPointerButtonSnapshot = 0;
        cameraMeshVertexZ = new int[8192];
        createPasswordContainsNameAlertText = "This password contains your Player Name, and would be easy to guess";
    }
}
