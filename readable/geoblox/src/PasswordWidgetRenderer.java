/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordWidgetRenderer extends TextInputRenderer {
    static MidiPcmStream gameMusicStream;
    static int[] meshFacePriorityWriteOffsets;

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 0) {
            meshFacePriorityWriteOffsets = (int[]) null;
            gameMusicStream = null;
            meshFacePriorityWriteOffsets = null;
            return;
        }
        gameMusicStream = null;
        meshFacePriorityWriteOffsets = null;
    }

    final String getDisplayText(int methodGuard, UiWidget widget) {
        RuntimeException displayTextFailure = null;
        UiWidget unusedWidget = null;
        String maskedTextBeforeReturn = null;
        RuntimeException maskFailureForContext = null;
        StringBuilder maskContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtMaskFailure = null;
        try {
          if (methodGuard < 109) {
            unusedWidget = (UiWidget) null;
            this.getDisplayText(-111, (UiWidget) null);
          }
          maskedTextBeforeReturn = TextWidgetSupport.buildRepeatedCharacterRange(0, '*', widget.widgetText.length());
          return maskedTextBeforeReturn;
        } catch (java.lang.RuntimeException maskException) {
          caughtMaskFailure = maskException;
          displayTextFailure = caughtMaskFailure;
          maskFailureForContext = displayTextFailure;
          maskContextBuilder = new StringBuilder().append("uh.L(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) maskFailureForContext), ((StringBuilder) (Object) maskContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    PasswordWidgetRenderer(int textColor) {
        this(DialogLayer.sharedUiFont, textColor);
    }

    final static int getThemeForProgress(int methodGuard) {
        if (methodGuard == 16) {
            return WidgetContainer.themeCycleOrder[UiWidget.completedThemeCount % WidgetContainer.themeCycleOrder.length];
        }
        meshFacePriorityWriteOffsets = (int[]) null;
        return WidgetContainer.themeCycleOrder[UiWidget.completedThemeCount % WidgetContainer.themeCycleOrder.length];
    }

    private PasswordWidgetRenderer(BitmapFont font, int textColor) {
        super(font, textColor);
    }

    final static void pushWidgetClip(int topY, int leftX, int methodGuard, int bottomY, int rightX) {
        SpriteCheckboxRenderer.pushRasterTarget(-96);
        SoftwareRasterizer.intersectClip(leftX, topY, rightX, bottomY);
        if (methodGuard == -14045) {
            return;
        }
        PasswordWidgetRenderer.getThemeForProgress(-111);
    }

    final static TriangleMesh decodePackedTriangleMesh(PacketBuffer packet, byte methodGuard) {
        int facePriorityIndex = 0;
        TriangleMesh meshBeforeReturn = null;
        RuntimeException decodeFailureBeforeDescription = null;
        StringBuilder decodeMessagePrefix = null;
        String packetDescription = null;
        RuntimeException caughtDecodeFailure = null;
        int formatVersion = 0;
        RuntimeException decodeFailureForContext = null;
        int hasNormalsFlag = 0;
        int hasOptionalShortSectionFlag = 0;
        TriangleMesh mesh = null;
        int maximumUnsignedFacePriority = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          formatVersion = packet.readBits((byte) -17, 8);
          if (formatVersion > 0) {
            throw new IllegalStateException("" + formatVersion);
          }
          hasNormalsFlag = TextInputRenderer.readBooleanBit((byte) 81, packet) ? 1 : 0;
          hasOptionalShortSectionFlag = TextInputRenderer.readBooleanBit((byte) 7, packet) ? 1 : 0;
          mesh = new TriangleMesh();
          mesh.vertexCount = (short)packet.readBits((byte) -17, 16);
          mesh.vertexX = ArchiveNetworkClient.readPackedShortArray(mesh.vertexX, 16, 0, packet);
          mesh.vertexY = ArchiveNetworkClient.readPackedShortArray(mesh.vertexY, 16, 0, packet);
          mesh.vertexZ = ArchiveNetworkClient.readPackedShortArray(mesh.vertexZ, 16, 0, packet);
          mesh.faceCount = (short)packet.readBits((byte) -17, 16);
          mesh.faceVertexA = ArchiveNetworkClient.readPackedShortArray(mesh.faceVertexA, 16, 0, packet);
          if (methodGuard < 111) {
            gameMusicStream = (MidiPcmStream) null;
          }
          mesh.faceVertexB = ArchiveNetworkClient.readPackedShortArray(mesh.faceVertexB, 16, 0, packet);
          mesh.faceVertexC = ArchiveNetworkClient.readPackedShortArray(mesh.faceVertexC, 16, 0, packet);
          if (hasNormalsFlag != 0) {
            mesh.normalCount = (short)packet.readBits((byte) -17, 16);
            mesh.normalX = ArchiveNetworkClient.readPackedShortArray(mesh.normalX, 16, 0, packet);
            mesh.normalY = ArchiveNetworkClient.readPackedShortArray(mesh.normalY, 16, 0, packet);
            mesh.normalZ = ArchiveNetworkClient.readPackedShortArray(mesh.normalZ, 16, 0, packet);
            mesh.faceNormalA = ArchiveNetworkClient.readPackedShortArray(mesh.faceNormalA, 16, 0, packet);
            mesh.faceNormalB = ArchiveNetworkClient.readPackedShortArray(mesh.faceNormalB, 16, 0, packet);
            mesh.faceNormalC = ArchiveNetworkClient.readPackedShortArray(mesh.faceNormalC, 16, 0, packet);
          }
          if (hasOptionalShortSectionFlag != 0) {
            packet.readBits((byte) -17, 16);
            mesh.optionalPackedShortStreamOne = ArchiveNetworkClient.readPackedShortArray(mesh.optionalPackedShortStreamOne, 16, 0, packet);
            mesh.optionalPackedShortStreamTwo = ArchiveNetworkClient.readPackedShortArray(mesh.optionalPackedShortStreamTwo, 16, 0, packet);
            mesh.optionalPackedShortStreamThree = ArchiveNetworkClient.readPackedShortArray(mesh.optionalPackedShortStreamThree, 16, 0, packet);
            mesh.optionalPackedShortStreamFour = ArchiveNetworkClient.readPackedShortArray(mesh.optionalPackedShortStreamFour, 16, 0, packet);
            mesh.optionalPackedShortStreamFive = ArchiveNetworkClient.readPackedShortArray(mesh.optionalPackedShortStreamFive, 16, 0, packet);
          }
          if (TextInputRenderer.readBooleanBit((byte) 102, packet)) {
            mesh.faceMaterialIndices = ArchiveNetworkClient.readPackedShortArray(mesh.faceMaterialIndices, 16, 0, packet);
          }
          if (TextInputRenderer.readBooleanBit((byte) 37, packet)) {
            mesh.facePriorities = MouseWheelInput.readPackedByteArray(mesh.facePriorities, packet, 16, 8);
            maximumUnsignedFacePriority = 0;
            for (facePriorityIndex = 0; mesh.facePriorities.length > facePriorityIndex; facePriorityIndex++) {
              if ((255 & mesh.facePriorities[facePriorityIndex]) > maximumUnsignedFacePriority) {
                maximumUnsignedFacePriority = 255 & mesh.facePriorities[facePriorityIndex];
              }
            }
            if (maximumUnsignedFacePriority != 0) {
              mesh.facePriorityCount = (byte)(1 + maximumUnsignedFacePriority);
            } else {
              mesh.facePriorities = null;
            }
          }
          meshBeforeReturn = mesh;
          return meshBeforeReturn;
        } catch (java.lang.RuntimeException decodeFailure) {
          caughtDecodeFailure = decodeFailure;
          decodeFailureForContext = caughtDecodeFailure;
          decodeFailureBeforeDescription = decodeFailureForContext;
          decodeMessagePrefix = new StringBuilder().append("uh.BA(");
          if (packet == null) {
            packetDescription = "null";
          } else {
            packetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(packetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void drawSpawnQueueAndHighlight(int methodGuard) {
        float highlightAngleRadians = 0.0f;
        float spawnCenterOffsetX = 0.0f;
        float spawnCenterOffsetY = 0.0f;
        int highlightCenterX = 0;
        int highlightCenterY = 0;
        float highlightAngleStep = 0.0f;
        int highlightRgb = 0;
        float highlightPhaseRadians = 0.0f;
        int highlightDotX = 0;
        int highlightDotY = 0;
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity spawnEntityToDraw = null;
        GameplayEntity spawnQueueHead = null;
        RuntimeException caughtSpawnDrawFailure = null;
        RuntimeException spawnDrawFailureForContext = null;
        clientControlFlowGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 4740) {
            return;
          }
          spawnQueueHead = (GameplayEntity) (SecondaryDeque.spawnQueue.firstForIteration(0));
          if (spawnQueueHead == null) {
            return;
          }
          spawnCenterOffsetX = -320.0f + spawnQueueHead.positionX;
          spawnCenterOffsetY = -240.0f + spawnQueueHead.positionY;
          highlightCenterX = (int)((double)spawnCenterOffsetX * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) - Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) * (double)spawnCenterOffsetY + 320.0);
          highlightCenterY = (int)((double)spawnCenterOffsetX * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + (double)spawnCenterOffsetY * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) + 240.0);
          highlightAngleStep = 0.01666666753590107f;
          highlightRgb = 16764416;
          highlightPhaseRadians = (float)UiWidget.gameplaySession.updateTick * 0.03999999910593033f;
          SoftwareRasterizer.fillCircleAlpha(highlightCenterX, highlightCenterY, 16, 16777215, 100);
          SoftwareRasterizer.drawCircle(highlightCenterX, highlightCenterY, 16, 0);
          for (highlightAngleRadians = highlightPhaseRadians + 3.1415927410125732f; highlightPhaseRadians < highlightAngleRadians; highlightAngleRadians = highlightAngleRadians - highlightAngleStep) {
            highlightDotX = (int)((double)highlightCenterX + 16.0 * Math.cos((double)highlightAngleRadians));
            highlightDotY = (int)((double)highlightCenterY + Math.sin((double)highlightAngleRadians) * 16.0);
            SoftwareRasterizer.fillCircle(highlightDotX, highlightDotY, 2, highlightRgb);
            highlightAngleStep = highlightAngleStep + highlightAngleStep * 0.25f;
            highlightRgb += 778;
          }
          spawnEntityToDraw = (GameplayEntity) (SecondaryDeque.spawnQueue.firstForIteration(0));
          while (spawnEntityToDraw != null) {
            spawnEntityToDraw.drawFadingEntity(methodGuard - 4830);
            spawnEntityToDraw = (GameplayEntity) (SecondaryDeque.spawnQueue.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException spawnQueueDrawFailure) {
          caughtSpawnDrawFailure = spawnQueueDrawFailure;
          spawnDrawFailureForContext = caughtSpawnDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spawnDrawFailureForContext), "uh.DA(" + methodGuard + ')');
        }
    }

    static {
        meshFacePriorityWriteOffsets = new int[128];
    }
}
