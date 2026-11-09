/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteStripButtonRenderer extends TextWidgetRenderer {
    private int normalColor;
    private int highlightColor;
    private int disabledColor;
    static SpriteData field_p;
    static volatile boolean field_o;
    private Sprite[] backgroundStrip;

    public SpriteStripButtonRenderer() {
        this(2188450, 2591221, 9543);
    }

    public static void releaseStatics(int param0) {
        if (param0 < 100) {
          field_o = true;
        }
        field_p = null;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!widget.hovered) {
            stackIn_6_0 = (widget.hasFocus(-1)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (guard != 5592405) {
            this.highlightColor = 88;
          }
          if (widget instanceof InteractiveWidget) {
            isEnabled = isEnabled & ((InteractiveWidget) (widget)).enabled;
          }
          if (!isEnabled) {
            stackIn_16_0 = this.disabledColor;
          } else {
            if (var6_int != 0) {
              stackIn_16_0 = this.highlightColor;
            } else {
              stackIn_16_0 = this.normalColor;
            }
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (!isEnabled) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          ByteArrayStorage.drawHorizontalSpriteStrip(var7, widget.width, widget.y + (parentY + (-this.backgroundStrip[0].paddedHeight + widget.height >> 1)), 67, this.backgroundStrip, widget.x + parentX);
          this.font.drawParagraph(widget.text, parentX + widget.x, widget.y + (parentY - 2), widget.width, widget.height, var8, -1, 1, 1, this.font.ascent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ue.A(");
          if (widget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static void decodeHiscoreResponse(byte guard) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        HiscoreRequest var4_ref_of = null;
        int var5 = 0;
        SessionStatisticsSubmission var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        IsaacPacketBuffer var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -70) {
            SpriteStripButtonRenderer.releaseStatics(-111);
          }
          var28 = NativeLibraryExtractor.incomingPacket;
          var2 = var28.readUnsignedByte(-31302);
          if (0 == var2) {
            var3 = var28.readUnsignedShort(255);
            var4_ref_of = (HiscoreRequest) (HiscoreRequestQueue.pending.first(74));
            while (var4_ref_of != null) {
              if (var3 != var4_ref_of.tableId) {
                var4_ref_of = (HiscoreRequest) (HiscoreRequestQueue.pending.next((byte) 18));
                continue;
              }
              break;
            }
            if (var4_ref_of == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -124);
              return;
            }
            var5 = var28.readUnsignedByte(-31302);
            if (0 != var5) {
              var6_int = var4_ref_of.rowCount;
              var7 = var4_ref_of.columnCount;
              DraggableWidget.field_B[0].secondaryName = null;
              DraggableWidget.field_B[0].primaryName = QueuedIntArrayRequest.accountDisplayName;
              DraggableWidget.field_B[0].included = false;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                DraggableWidget.field_B[var8_int].primaryName = var28.readCp1252String(-1);
                DraggableWidget.field_B[var8_int].included = false;
                if (var28.readUnsignedByte(-31302) == 1) {
                  DraggableWidget.field_B[var8_int].secondaryName = var28.readCp1252String(guard + 69);
                } else {
                  DraggableWidget.field_B[var8_int].secondaryName = null;
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_of.names = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_of.entryIds = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_of.values = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.readUnsignedByte(-31302);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.readUnsignedByte(-31302);
                  var21 = DraggableWidget.field_B[var20].primaryName;
                  var22 = var28.readLong((byte) 113);
                  var24 = var28.position;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = DraggableWidget.field_B[var20].secondaryName;
                    var10[0][var12] = var22;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt(true);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    AccountUiBootstrap.isCurrentUserName(var21, (byte) -25)) {
                    var8[1][var13] = QueuedIntArrayRequest.accountDisplayName;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt(true);
                    }
                  }
                  if (var6_int > var14 &&
                    !DraggableWidget.field_B[var20].included) {
                    DraggableWidget.field_B[var20].included = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = DraggableWidget.field_B[var20].secondaryName;
                    var10[2][var14] = var22;
                    var28.position = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt(true);
                    }
                  }
                }
              }
            }
            var4_ref_of.complete = true;
            var4_ref_of.unlink(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.readUnsignedShort(255);
            var4 = var28.readLong((byte) 111);
            var6 = (SessionStatisticsSubmission) (HuffmanDecoder.field_f.first(127));
            while (var6 != null) {
              if (var6.requestId != var3Lifetime1) {
                var6 = (SessionStatisticsSubmission) (HuffmanDecoder.field_f.next((byte) 18));
                continue;
              }
              break;
            }
            if (var6 == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -121);
              return;
            }
            var6.entryId = var4;
            var6.unlink(false);
            return;
          }
          IntrusiveNode.reportClientError("HS1: " + VictoryScreen.accountPacketDiagnostic((byte) -124), (Throwable) null, 0);
          LegacyOpenGlTextureCache.closeAccountSocket((byte) -121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ue.C(" + guard + ')');
        }
    }

    private SpriteStripButtonRenderer(int normalTint, int highlightTint, int disabledTint) {
        this.disabledColor = disabledTint;
        this.backgroundStrip = LevelCompleteUpgradeScreen.field_j;
        this.font = LegacyOpenGlDisplayLists.field_a;
        this.highlightColor = highlightTint;
        this.normalColor = normalTint;
    }

    static {
        field_o = true;
    }
}
