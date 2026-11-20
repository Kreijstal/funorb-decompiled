/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSliderRenderer implements WidgetRenderer {
    private int field_l;
    static IndexedSprite[] field_d;
    private BitmapFont field_c;
    private int field_k;
    private int field_e;
    private int field_h;
    static IntrusiveDeque field_g;
    private int field_j;
    private int field_a;
    static String field_i;
    static String field_f;
    static String field_m;
    static SpriteAsset field_b;

    final static void setRequestedDisplayName(String param0, int param1) {
        try {
          TutorialTransition.field_f = param0;
          if (param1 != 0) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ug.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -1) {
          return;
        }
        field_g = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_d = null;
    }

    final static void restoreRasterTarget(int param0) {
        MidiPcmStream.field_F = MidiPcmStream.field_F - 1;
        SoftwareRasterizer.bindRaster(GrowableStringList.field_h[MidiPcmStream.field_F], TextFieldValidator.field_c[MidiPcmStream.field_F], ValidationHelpWidget.field_V[MidiPcmStream.field_F]);
        SoftwareRasterizer.clipLeft = OutlinedRoadStripRenderer.field_q[MidiPcmStream.field_F];
        SoftwareRasterizer.clipRight = RasterStateRestoration.field_b[MidiPcmStream.field_F];
        SoftwareRasterizer.clipTop = RasterClipTopStack.field_c[MidiPcmStream.field_F];
        SoftwareRasterizer.clipBottom = NanoTickClock.field_n[MidiPcmStream.field_F];
        if (param0 != -1) {
          field_g = (IntrusiveDeque) null;
        }
    }

    final static void decodeSpriteSheet(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = HoldTheLine.field_D;
        try {
          var16 = new PacketBuffer(param1);
          var17 = var16;
          var17.position = -2 + param1.length;
          NineSlicePanel.field_d = var17.readUnsignedShort(72);
          SocketConnector.field_f = new boolean[NineSlicePanel.field_d];
          EditableTextField.field_K = new int[NineSlicePanel.field_d];
          if (param0 != -97) {
            field_m = (String) null;
          }
          TrackCurve.field_i = new byte[NineSlicePanel.field_d][];
          DirectByteStorage.field_j = new int[NineSlicePanel.field_d];
          IterableSecondaryNodeDeque.field_e = new byte[NineSlicePanel.field_d][];
          Vector2i.field_g = new int[NineSlicePanel.field_d];
          ReflectionCheckSupport.field_d = new int[NineSlicePanel.field_d];
          var17.position = -7 + param1.length - 8 * NineSlicePanel.field_d;
          SpriteDecodeGlobals.field_b = var17.readUnsignedShort(-85);
          AchievementUnlockRequest.field_o = var17.readUnsignedShort(59);
          var3 = 1 + (var17.readUnsignedByte((byte) -64) & 255);
          for (var4 = 0; var4 < NineSlicePanel.field_d; var4++) {
            DirectByteStorage.field_j[var4] = var16.readUnsignedShort(123);
          }
          for (var4Lifetime1 = 0; NineSlicePanel.field_d > var4Lifetime1; var4Lifetime1++) {
            Vector2i.field_g[var4Lifetime1] = var17.readUnsignedShort(-56);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < NineSlicePanel.field_d; var4Lifetime2++) {
            EditableTextField.field_K[var4Lifetime2] = var17.readUnsignedShort(79);
          }
          for (var4Lifetime3 = 0; NineSlicePanel.field_d > var4Lifetime3; var4Lifetime3++) {
            ReflectionCheckSupport.field_d[var4Lifetime3] = var17.readUnsignedShort(101);
          }
          var17.position = -((-1 + var3) * 3) - NineSlicePanel.field_d * 8 + (param1.length - 7);
          StraightRoadSegment.field_E = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            StraightRoadSegment.field_E[var4Lifetime4] = var17.readUnsignedMedium(false);
            if (StraightRoadSegment.field_E[var4Lifetime4] == 0) {
              StraightRoadSegment.field_E[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < NineSlicePanel.field_d; var4Lifetime5++) {
            var5 = EditableTextField.field_K[var4Lifetime5];
            var6 = ReflectionCheckSupport.field_d[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            IterableSecondaryNodeDeque.field_e[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            TrackCurve.field_i[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte((byte) -59);
            stackIn_24_0 = 0;
            stackIn_24_1 = 1 & var11;
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.readByte(0);
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.readByte(0);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_50_0 = var10;
                  if (-1 == var13) {
                    stackIn_51_1 = 0;
                  } else {
                    stackIn_51_1 = 1;
                  }
                  var10 = stackIn_50_0 | stackIn_51_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5 * var13] = var17.readByte(0);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var17.readByte(0);
                    var9[var13 * var5 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_39_0 = var10;
                    if (var14 == -1) {
                      stackIn_40_1 = 0;
                    } else {
                      stackIn_40_1 = 1;
                    }
                    var10 = stackIn_39_0 | stackIn_40_1;
                  }
                }
              }
            }
            SocketConnector.field_f[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_56_0 = var2;
          stackIn_56_1 = new StringBuilder().append("ug.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        MarkerSlider var12 = null;
        var11 = HoldTheLine.field_D;
        try {
          if (!(param3 instanceof MarkerSlider)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (UiWidget) (param3);
          }
          var12 = (MarkerSlider) (stackIn_4_0);
          SoftwareRasterizer.fillRectangle(param1 + param3.x, param4 + param3.y, param3.width, param3.height, this.field_h);
          if (var12 == null) {
          }
          var7 = param3.width - var12.field_I * 2;
          if (param2 > -48) {
            return;
          }
          var8 = param3.x + param1 + var12.field_I;
          var9 = var12.field_H + (param4 + param3.y);
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.field_j);
          for (var10 = var12.getMarkerCount((byte) 104) - 1; var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var8 + var7 * var12.getMarker(false, var10) / var12.getMaximum(0), var9, this.field_e, this.field_l);
          }
          if (this.field_c != null) {
            this.field_c.drawCentered(var12.text, var7 / 2 + var8, var12.field_H + (var9 + this.field_c.baseline), this.field_k, this.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void readCourseBestTimes(IsaacPacketBuffer param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var10 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder1 = true;
          var4_int = MenuSelectionController.readOptionalBits(14, (byte) -96, param0);
          var5 = MenuSelectionController.readOptionalBits(13, (byte) -96, param0);
          var6 = param0.readBits(2, 7);
          var7 = RoadControlPathBuilder.field_c[param2][param1];
          var8 = QuickChatPhraseDefinition.field_v[param2][param1];
          if (var7 != -1 && (var4_int > var7 ||
            -1 == var4_int)) {
            ReflectionCheckSupport.field_a = true;
            decompiledFrameRemainder1 = false;
          }
          else {
            RoadControlPathBuilder.field_c[param2][param1] = var4_int;
            BoundaryIntersection.field_j[param2][param1] = var6;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var8 != -1 && (var8 < var5 ||
            var5 == -1)) {
            ReflectionCheckSupport.field_a = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            QuickChatPhraseDefinition.field_v[param2][param1] = var5;
          }
          var9 = 92 / ((33 - param3) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ug.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    MarkerSliderRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_a = param2;
          this.field_h = param4;
          this.field_c = param0;
          this.field_e = param5;
          this.field_l = param6;
          this.field_j = param3;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_i = "Game Achievements";
        field_g = new IntrusiveDeque();
        field_m = "<col=2>This is a members-only setting. If you are a member, log in to select.";
        field_f = "Loading...";
    }
}
