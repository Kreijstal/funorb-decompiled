/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogContent extends WidgetContainer implements ButtonActivationListener {
    private String messageText;
    private MessageDialog messageDialog;
    private ButtonWidget[] actionButtons;
    private int[] buttonActionIds;
    private BitmapFont messageFont;
    private int buttonSlotCount;
    static String createToUseText;
    static int field_I;

    private final void ensureButtonSlots(int methodGuard, int slotCount) {
        int var5 = 0;
        int var6 = Geoblox.clientControlFlowFlag;
        if (this.buttonSlotCount >= slotCount) {
            return;
        }
        ButtonWidget[] var7 = new ButtonWidget[slotCount];
        ButtonWidget[] var3 = var7;
        int[] var4 = new int[slotCount];
        for (var5 = 0; var5 < this.buttonSlotCount; var5++) {
            var7[var5] = this.actionButtons[var5];
            var4[var5] = this.buttonActionIds[var5];
        }
        this.actionButtons = var3;
        this.buttonActionIds = var4;
        this.buttonSlotCount = slotCount;
        if (methodGuard != -11272) {
            this.messageFont = (BitmapFont) null;
        }
    }

    final static void loadLogoMeshesAndMaterials(ResourceArchive archive, int methodGuard) {
        int meshCount = 0;
        int meshIndexOrInitialCursor = 0;
        TriangleMesh mesh = null;
        int[] meshCenter = null;
        int controlFlagSnapshot = 0;
        PacketBuffer logoInput = null;
        int centerMeshIndex = 0;
        PacketBuffer logoInputAlias = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String archiveContextDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          logoInput = new PacketBuffer(archive.getNamedFile(methodGuard + methodGuard, "", "logo.fo3d"));
          logoInputAlias = logoInput;
          meshCount = logoInputAlias.readUnsignedByte((byte) 34);
          logoInputAlias.beginBitAccess(methodGuard + 8);
          DirectByteStorage.meshMaterials = jc.readMeshMaterials(logoInputAlias, true);
          ArchiveIndex.logoMeshes = new TriangleMesh[meshCount];
          ValidationMessageWidget.logoMeshCenters = new int[meshCount][];
          for (meshIndexOrInitialCursor = 0; meshIndexOrInitialCursor < meshCount; meshIndexOrInitialCursor++) {
            ArchiveIndex.logoMeshes[meshIndexOrInitialCursor] = PasswordWidgetRenderer.a(logoInput, (byte) 113);
          }
          logoInputAlias.endBitAccess(-16989);
          centerMeshIndex = 0;
          meshIndexOrInitialCursor = centerMeshIndex;
          while (meshCount > centerMeshIndex) {
            mesh = ArchiveIndex.logoMeshes[centerMeshIndex];
            mesh.scaleVertices(6, 1, (byte) 89, 6, 6);
            mesh.refreshBounds((byte) -99);
            meshCenter = new int[]{mesh.minX + mesh.maxX >> 1, mesh.maxY + mesh.minY >> 1, mesh.maxZ + mesh.minZ >> 1};
            ValidationMessageWidget.logoMeshCenters[centerMeshIndex] = meshCenter;
            mesh.translateVertices(-meshCenter[0], -meshCenter[1], -9121, -meshCenter[2]);
            centerMeshIndex++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          failureContextBuilder = new StringBuilder().append("ni.KA(");
          if (archive == null) {
            archiveContextDescription = "null";
          } else {
            archiveContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(archiveContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final ButtonWidget appendButton(int verticalOffset, String label, WidgetListener listener) {
        ButtonWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ButtonWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ButtonWidget(label, listener);
          var4.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
          var5 = verticalOffset + this.widgetHeight;
          this.setWidgetBounds(34 + this.widgetHeight, this.widgetWidth, (byte) -53, 0, 0);
          var4.setWidgetBounds(30, this.widgetWidth - 14, (byte) -33, var5, 7);
          this.addChild((byte) -73, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ni.GA(").append(verticalOffset).append(',');
          if (label == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    MessageDialogContent(MessageDialog messageDialog, BitmapFont messageFont, String messageText) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.buttonSlotCount = 0;
        try {
            this.messageFont = messageFont;
            this.messageDialog = messageDialog;
            this.messageText = messageText;
            var4_int = null == this.messageText ? 0 : this.messageFont.measureWrappedHeight(this.messageText, 260, this.messageFont.maxAscent);
            this.setWidgetBounds(var4_int + 22, 288, (byte) -119, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ni.<init>(" + (messageDialog != null ? "{...}" : "null") + ',' + (messageFont != null ? "{...}" : "null") + ',' + (messageText != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawTransientEntities(int methodGuard) {
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity transientEntityToDraw = null;
        RuntimeException caughtTransientDrawFailure = null;
        RuntimeException transientDrawFailureForContext = null;
        clientControlFlowGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 484842465) {
            MessageDialogContent.drawTransientEntities(15);
          }
          transientEntityToDraw = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
          while (transientEntityToDraw != null) {
            transientEntityToDraw.drawRotatedEntityOnCurrentRaster(1915952803);
            transientEntityToDraw = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException transientDrawFailure) {
          caughtTransientDrawFailure = transientDrawFailure;
          transientDrawFailureForContext = caughtTransientDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) transientDrawFailureForContext), "ni.JA(" + methodGuard + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        super.renderWidget(parentX, parentY, (byte) 54, renderPass);
        this.messageFont.drawParagraph(this.messageText, this.widgetX + (parentX + 14), 10 + parentY + this.widgetY, this.widgetWidth - 28, this.widgetHeight, 16777215, -1, 0, 0, this.messageFont.maxAscent);
        int var5 = 35 / ((methodGuard - 1) / 43);
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          for (var6_int = 0; var6_int < this.buttonSlotCount; var6_int++) {
            if (param4 != this.actionButtons[var6_int]) {
              continue;
            }
            var7 = this.buttonActionIds[var6_int];
            if (var7 != -1) {
              MidiNote.a(this.buttonActionIds[var6_int], false);
            } else {
              this.messageDialog.dismissDialog((byte) -104);
            }
            break;
          }
          if (param1 != -20) {
            MessageDialogContent.a((byte) 87);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ni.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void appendActionButton(String label, int slotIncrement, int actionId) {
        int var4_int = 0;
        try {
            var4_int = this.buttonSlotCount;
            this.ensureButtonSlots(-11272, var4_int + slotIncrement);
            this.actionButtons[var4_int] = this.appendButton(-2, label, (WidgetListener) (this));
            this.buttonActionIds[var4_int] = actionId;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ni.IA(" + (label != null ? "{...}" : "null") + ',' + slotIncrement + ',' + actionId + ')');
        }
    }

    public static void a(byte param0) {
        createToUseText = null;
        if (param0 >= -19) {
            createToUseText = (String) null;
        }
    }

    final static PaletteBitmapFont buildPaletteFontFromDecodedSprites(byte[] metrics, int methodGuard) {
        PaletteBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (metrics == null) {
            return null;
          }
          font = new PaletteBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, md.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, ProgressBarWidget.decodedSpriteHeights, NanoFrameTimer.decodedSpritePalette, mj.decodedSpriteIndices);
          MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
          if (methodGuard >= -107) {
            createToUseText = (String) null;
          }
          fontBeforeReturn = font;
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("ni.MA(");
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createToUseText = "Create a free account to start using this feature";
    }
}
