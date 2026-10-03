/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private int field_l;
    private int field_o;
    private String field_n;
    private int field_m;
    private BitmapFont field_p;
    private int field_k;
    static String field_g;
    static Sprite menuForegroundSprite;
    private int field_e;
    private boolean field_d;
    static int field_h;
    static int wheelRotationSnapshot;
    static MouseWheelInput mouseWheelInput;

    final static void compactDepthBucketFaceOrder(int guard) {
        int depthBucketIndex = 0;
        int destinationFaceOffset = 0;
        int bucketFaceCount = 0;
        int controlFlagSnapshot = 0;
        RuntimeException caughtCompactionFailure = null;
        RuntimeException compactionFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (guard != 2971) {
            return;
          }
          destinationFaceOffset = GameApplet.meshFaceCountsByDepthBucket[0];
          for (depthBucketIndex = 1; depthBucketIndex < GameApplet.meshFaceCountsByDepthBucket.length; depthBucketIndex++) {
            bucketFaceCount = GameApplet.meshFaceCountsByDepthBucket[depthBucketIndex];
            ArrayOperations.copyInts(InstrumentNoteMask.meshFaceOrder, depthBucketIndex << 4, InstrumentNoteMask.meshFaceOrder, destinationFaceOffset, bucketFaceCount);
            destinationFaceOffset = destinationFaceOffset + bucketFaceCount;
          }
          return;
        } catch (java.lang.RuntimeException caughtCompactionParameter) {
          caughtCompactionFailure = caughtCompactionParameter;
          compactionFailure = caughtCompactionFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) compactionFailure), "vc.G(" + guard + ')');
        }
    }

    final void a(int param0, int param1, byte param2, BitmapFont param3, String param4) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        BitmapFont var7 = null;
        TextLayoutLine var9 = null;
        TextLayoutLine var10 = null;
        try {
          if (param4 == null) {
            this.field_a = null;
            return;
          }
          if ((this.field_p == param3) &&
              (this.field_d) &&
              (this.field_k == 2) &&
              (null != this.field_n) &&
              (this.field_n.equals(param4))) {
            return;
          }
          this.field_p = param3;
          this.field_n = param4;
          this.field_d = true;
          this.field_k = 2;
          var9 = this.a(-1, param1, param3, param4);
          var10 = var9;
          var10.field_c[0] = param0 - param3.measureTextWidth(param4);
          var10.field_c[param4.length()] = param0;
          DialWidget.a(0, var10, param4, 60, param3);
          if (param2 >= -12) {
            var7 = (BitmapFont) null;
            this.a(98, 34, (String) null, 56, (BitmapFont) null, 65, 122, -79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, byte param3, BitmapFont param4) {
        TextLayoutLine var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_a = null;
            return;
        }
        if (param3 != 58) {
            CachedTextLayout.compactDepthBucketFaceOrder(-90);
        }
        if (this.field_p == param4 && this.field_d && this.field_k == 1 && null != this.field_n && this.field_n.equals(param0)) {
            return;
        }
        try {
            this.field_k = 1;
            this.field_d = true;
            this.field_p = param4;
            var8 = this.a(-1, param1, param4, param0);
            var7 = param4.measureTextWidth(param0);
            var8.field_c[0] = param2 - (var7 >> 1);
            var8.field_c[param0.length()] = (var7 >> 1) + param2;
            DialWidget.a(0, var8, param0, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, BitmapFont param4) {
        TextLayoutLine var7 = null;
        TextLayoutLine var8 = null;
        if (param2 == null) {
            this.field_a = null;
            return;
        }
        if (param3 > -89) {
            menuForegroundSprite = (Sprite) null;
        }
        if ((this.field_p == param4 && this.field_d && 0 == this.field_k && this.field_n != null) &&
            (!(!this.field_n.equals(param2)))) {
            return;
        }
        try {
            this.field_n = param2;
            this.field_k = 0;
            this.field_d = true;
            this.field_p = param4;
            var7 = this.a(-1, param0, param4, param2);
            var8 = var7;
            var7.field_c[0] = param1;
            var8.field_c[param2.length()] = param4.measureTextWidth(param2) + param1;
            DialWidget.a(0, var8, param2, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, BitmapFont param4, int param5, int param6, int param7) {
        TextLayoutLine stackIn_35_0;
        TextLayoutLine stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        TextLayoutLine stackIn_36_0 = null;
        TextLayoutLine stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        TextLayoutLine var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Geoblox.clientControlFlowFlag;
        try {
          if (param3 == 0) {
            param3 = param4.lineAdvance;
          }
          if (param2 == null) {
            this.field_a = null;
            return;
          }
          if ((param4 == this.field_p) &&
              (!this.field_d) &&
              (this.field_k == param6) &&
              (this.field_m == param0) &&
              (this.field_e == param3) &&
              (param7 == this.field_o) &&
              (param5 == this.field_l) &&
              (null != this.field_n) &&
              (this.field_n.equals(param2))) {
            return;
          }
          this.field_o = param7;
          this.field_k = param6;
          this.field_m = param0;
          this.field_e = param3;
          this.field_l = param5;
          this.field_n = param2;
          this.field_d = false;
          this.field_p = param4;
          var16 = new String[param1 + param4.countWrappedLines(param2, param5)];
          var17 = var16;
          var10 = Math.max(1, param4.wrapText(param2, new int[]{param5}, var17));
          if ((this.field_m == 3) &&
              (var10 == 1)) {
            this.field_m = 1;
          }
          this.field_a = new TextLayoutLine[var10];
          if (this.field_m != 0) {
            if (this.field_m != 1) {
              if (this.field_m == 2) {
                var11 = -param4.maxDescent + this.field_o - var10 * this.field_e;
              } else {
                var12 = (-(this.field_e * var10) + this.field_o) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_e = this.field_e + var12;
                var11 = param4.maxAscent + var12;
              }
            } else {
              var11 = param4.maxAscent + (this.field_o - this.field_e * var10 >> 1);
            }
          } else {
            var11 = param4.maxAscent;
          }
          for (var12 = 0; var12 < var10; var12++) {
            var13 = var16[var12];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param4.maxAscent + var11;
            stackIn_35_3 = var11 + param4.maxDescent;
            if (var13 == null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            }
            var14 = new TextLayoutLine(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param4.measureTextWidth(var13);
              if (param6 != 3) {
                stackIn_40_0 = 0;
              } else {
                stackIn_40_0 = this.a(-116, param4.measureTextWidth(var13), param5, var13);
              }
              DialWidget.a(stackIn_40_0, var14, var13, 60, param4);
            }
            this.field_a[var12] = var14;
            var11 = var11 + param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void drawPendingActionPanel(int methodGuard) {
        int pendingActionDrawTop = 0;
        if (methodGuard != -1) {
            field_h = 119;
        }
        PendingActionMarker pendingActionMarkerForDrawing = (PendingActionMarker) ((Object) ArchiveRequest.pendingActionMarkers.firstForIteration(0));
        PendingActionMarker pendingActionMarkerBeforeNullCheck = pendingActionMarkerForDrawing;
        if (pendingActionMarkerBeforeNullCheck != null) {
            pendingActionDrawTop = LogoCompositor.pendingActionPanelTop;
            DelayedIncomingPacket.drawNineSlicePanel(pendingActionDrawTop, 10, RasterTargetSnapshot.pendingActionPanelHeight, (byte) -92, MultiHandleSliderRenderer.pendingActionPanelWidth, ll.frameNineSliceSprites);
            UsernameAvailabilityQuery.achievementSprites[pendingActionMarkerForDrawing.actionId].drawQuarterSize(25, pendingActionDrawTop + (-32 + (RasterTargetSnapshot.pendingActionPanelHeight - 15)) / 2);
            FadingDialog.uiPaletteFont.drawParagraph(GameplaySetupSupport.achievementTitles[pendingActionMarkerForDrawing.actionId], 67, 15 + pendingActionDrawTop, MultiHandleSliderRenderer.pendingActionPanelWidth - 42 - 30, RasterTargetSnapshot.pendingActionPanelHeight - 30, 0, -1, 1, 1, 30);
        }
    }

    private final TextLayoutLine a(int param0, int param1, BitmapFont param2, String param3) {
        TextLayoutLine var5 = null;
        RuntimeException var5_ref = null;
        BitmapFont var6 = null;
        TextLayoutLine var7 = null;
        TextLayoutLine stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new TextLayoutLine(param1 - param2.maxAscent, param1 + param2.maxDescent, param3.length());
          var5 = var7;
          if (param0 != -1) {
            var6 = (BitmapFont) null;
            this.a(-65, -103, (String) null, -76, (BitmapFont) null, -99, 20, -32);
          }
          this.field_a = new TextLayoutLine[]{var7};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        menuForegroundSprite = null;
        mouseWheelInput = null;
        int var1 = 78 % ((-20 - param0) / 33);
    }

    public CachedTextLayout() {
    }

    static {
        field_h = 0;
    }
}
