/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordWidgetRenderer extends TextInputRenderer {
    static MidiPcmStream gameMusicStream;
    static int[] meshFacePriorityWriteOffsets;

    public static void c(int param0) {
        if (param0 != 0) {
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

    final static TriangleMesh a(PacketBuffer param0, byte param1) {
        int var7 = 0;
        TriangleMesh stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var2_int = param0.readBits((byte) -17, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = TextInputRenderer.a((byte) 81, param0) ? 1 : 0;
          var4 = TextInputRenderer.a((byte) 7, param0) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.vertexCount = (short)param0.readBits((byte) -17, 16);
          var5.vertexX = ArchiveNetworkClient.a(var5.vertexX, 16, 0, param0);
          var5.vertexY = ArchiveNetworkClient.a(var5.vertexY, 16, 0, param0);
          var5.vertexZ = ArchiveNetworkClient.a(var5.vertexZ, 16, 0, param0);
          var5.faceCount = (short)param0.readBits((byte) -17, 16);
          var5.faceVertexA = ArchiveNetworkClient.a(var5.faceVertexA, 16, 0, param0);
          if (param1 < 111) {
            gameMusicStream = (MidiPcmStream) null;
          }
          var5.faceVertexB = ArchiveNetworkClient.a(var5.faceVertexB, 16, 0, param0);
          var5.faceVertexC = ArchiveNetworkClient.a(var5.faceVertexC, 16, 0, param0);
          if (var3 != 0) {
            var5.normalCount = (short)param0.readBits((byte) -17, 16);
            var5.normalX = ArchiveNetworkClient.a(var5.normalX, 16, 0, param0);
            var5.normalY = ArchiveNetworkClient.a(var5.normalY, 16, 0, param0);
            var5.normalZ = ArchiveNetworkClient.a(var5.normalZ, 16, 0, param0);
            var5.faceNormalA = ArchiveNetworkClient.a(var5.faceNormalA, 16, 0, param0);
            var5.faceNormalB = ArchiveNetworkClient.a(var5.faceNormalB, 16, 0, param0);
            var5.faceNormalC = ArchiveNetworkClient.a(var5.faceNormalC, 16, 0, param0);
          }
          if (var4 != 0) {
            param0.readBits((byte) -17, 16);
            var5.field_J = ArchiveNetworkClient.a(var5.field_J, 16, 0, param0);
            var5.field_z = ArchiveNetworkClient.a(var5.field_z, 16, 0, param0);
            var5.field_h = ArchiveNetworkClient.a(var5.field_h, 16, 0, param0);
            var5.field_k = ArchiveNetworkClient.a(var5.field_k, 16, 0, param0);
            var5.field_g = ArchiveNetworkClient.a(var5.field_g, 16, 0, param0);
          }
          if (TextInputRenderer.a((byte) 102, param0)) {
            var5.faceMaterialIndices = ArchiveNetworkClient.a(var5.faceMaterialIndices, 16, 0, param0);
          }
          if (TextInputRenderer.a((byte) 37, param0)) {
            var5.facePriorities = MouseWheelInput.readPackedByteArray(var5.facePriorities, param0, 16, 8);
            var6 = 0;
            for (var7 = 0; var5.facePriorities.length > var7; var7++) {
              if (~(255 & var5.facePriorities[var7]) < ~var6) {
                var6 = 255 & var5.facePriorities[var7];
              }
            }
            if (var6 != 0) {
              var5.facePriorityCount = (byte)(1 + var6);
            } else {
              var5.facePriorities = null;
            }
          }
          stackIn_28_0 = var5;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("uh.BA(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
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
          spawnQueueHead = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
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
          spawnEntityToDraw = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
          while (spawnEntityToDraw != null) {
            spawnEntityToDraw.drawFadingEntity(methodGuard - 4830);
            spawnEntityToDraw = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.nextForIteration(1));
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
