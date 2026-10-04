/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements ChildWidgetOwner {
    static AwtRasterBuffer mainRasterBuffer;
    static int[] projectedMeshVertexX;
    static String field_z;
    UiWidget child;

    boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 124 % ((-3 - methodGuard) / 38);
          stackIn_4_0 = (this.child != null) && (this.child.handlePointerPress(this.widgetY + parentY, -96, this.widgetX + parentX, pointerButton, pointerX, pointerY, eventContext));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("sh.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 <= param0) {
            return;
          }
          if (param5 <= param0 + 1) {
            return;
          }
          if ((param0 + 5 < param5) &&
              (param3 != param2)) {
            var7_int = (1 & (param3 & param2)) + (param2 >> 1) + (param3 >> 1);
            var8 = param0;
            var9 = param3;
            if (param4 < 106) {
              return;
            }
            var10 = param2;
            for (var11 = param0; var11 < param5; var11++) {
              var12 = AchievementQuery.field_i[var11];
              if (!param6) {
                stackIn_24_0 = ClientProtocolStage.rankedEntryKeyOne[var12];
              } else {
                stackIn_24_0 = hg.rankedEntryKeyTwo[var12];
              }
              var13 = stackIn_24_0;
              if (var13 > var7_int) {
                AchievementQuery.field_i[var11] = AchievementQuery.field_i[var8];
                incrementValue$0 = var8;
                var8++;
                AchievementQuery.field_i[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var10 >= var13) {
                  continue;
                }
                var10 = var13;
              }
            }
            SingleChildWidget.a(param0, param1, var9, param3, (byte) 118, var8, param6);
            SingleChildWidget.a(var8, param1, param2, var10, (byte) 107, param5, param6);
            return;
          }
          for (var7_int = -1 + param5; var7_int > param0; var7_int--) {
            for (var8 = param0; var8 < var7_int; var8++) {
              var9 = AchievementQuery.field_i[var8];
              var10 = AchievementQuery.field_i[1 + var8];
              if (RankedComparisonSupport.isRightRankedEntryBeforeLeft(param6, var10, (byte) -125, var9)) {
                AchievementQuery.field_i[var8] = var10;
                AchievementQuery.field_i[var8 + 1] = var9;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var7), "sh.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final boolean a(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 22439) {
            var4 = (UiWidget) null;
            this.handlePointerRelease(73, 123, false, (UiWidget) null, 48, 45);
          }
          stackIn_7_0 = (this.child != null) && (!this.child.hasKeyboardFocus((byte) 54)) && (this.child.requestKeyboardFocus((byte) -117, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sh.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        DelayedIncomingPacket var5_ref_ma = null;
        int var5 = 0;
        DelayedIncomingPacket var6 = null;
        int var8 = 0;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var2_int = -108 / ((-71 - param0) / 45);
          if (LogoCompositor.connectedSessionStage != PacketBuffer.currentProtocolStage) {
            return false;
          }
          var3 = ClientClockSupport.correctedCurrentTimeMillis(-12520);
          if ((EntityMotionSupport.field_b != 0) &&
              (MidiNote.field_f < 0)) {
            var5_ref_ma = (DelayedIncomingPacket) ((Object) MeshPrioritySupport.field_c.firstForIteration(0));
            if ((var5_ref_ma != null) &&
                (var3 > var5_ref_ma.deliveryTimeMillis)) {
              var5_ref_ma.unlinkNode(false);
              AchievementSubmission.field_k = var5_ref_ma.payload.length;
              LogoCompositor.sessionPacketBuffer.position = 0;
              for (var6_int = 0; var6_int < AchievementSubmission.field_k; var6_int++) {
                LogoCompositor.sessionPacketBuffer.bytes[var6_int] = var5_ref_ma.payload[var6_int];
              }
              MidiNoteMixer.field_o = AttachedEntityRenderer.field_b;
              AttachedEntityRenderer.field_b = VisualPropertyNode.field_n;
              VisualPropertyNode.field_n = ScorePopup.field_l;
              ScorePopup.field_l = var5_ref_ma.packetOpcode;
              return true;
            }
          }
          while (true) {
            if (MidiNote.field_f < 0) {
              LogoCompositor.sessionPacketBuffer.position = 0;
              if (!UiWidget.b(30000, 1)) {
                return false;
              }
              MidiNote.field_f = LogoCompositor.sessionPacketBuffer.readCipherByte((byte) 122);
              LogoCompositor.sessionPacketBuffer.position = 0;
              AchievementSubmission.field_k = param1[MidiNote.field_f];
            }
            if (!TriangleMesh.a(false)) {
              return false;
            }
            if (EntityMotionSupport.field_b == 0) {
              MidiNoteMixer.field_o = AttachedEntityRenderer.field_b;
              AttachedEntityRenderer.field_b = VisualPropertyNode.field_n;
              VisualPropertyNode.field_n = ScorePopup.field_l;
              ScorePopup.field_l = MidiNote.field_f;
              MidiNote.field_f = -1;
              return true;
            }
            var5 = EntityMotionSupport.field_b;
            if (0.0 != EndingAnimationSupport.field_a) {
              var5 = (int)((double)var5 + DelegatingCanvas.field_d.nextGaussian() * EndingAnimationSupport.field_a);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new DelayedIncomingPacket((long)var5 + var3, MidiNote.field_f, new byte[AchievementSubmission.field_k]);
            for (var7 = 0; AchievementSubmission.field_k > var7; var7++) {
              var6.payload[var7] = LogoCompositor.sessionPacketBuffer.bytes[var7];
            }
            MeshPrioritySupport.field_c.addLast(-108, var6);
            MidiNote.field_f = -1;
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("sh.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            this.b(param3, param1, param2, 0);
          }
          if (param0 != 0) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sh.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    UiWidget findFocusTarget(int methodGuard) {
        UiWidget childSnapshot = this.child;
        if ((childSnapshot != null) &&
            (!(!childSnapshot.hasKeyboardFocus((byte) 54)))) {
            return childSnapshot;
        }
        if (methodGuard == -4863) {
            return null;
        }
        UiWidget guardedNullWidgetSnapshot = (UiWidget) null;
        this.handlePointerPress(114, -49, -37, 74, 126, 94, (UiWidget) null);
        return null;
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        if ((0 == renderPass) &&
            (!(this.renderer == null))) {
            this.renderer.drawWidget(parentX, -50, parentY, true, (UiWidget) (this));
        }
        int var5 = 85 % ((methodGuard - 1) / 43);
        if (this.child != null) {
            this.child.renderWidget(this.widgetX + parentX, parentY + this.widgetY, (byte) -74, renderPass);
        }
    }

    void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        if (!releaseGuard) {
            return;
        }
        try {
            if (null != this.child) {
                this.child.handlePointerRelease(this.widgetX + parentX, pointerX, true, eventContext, parentY + this.widgetY, pointerY);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "sh.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
        }
    }

    final int d(byte param0) {
        if (param0 <= 82) {
            UiWidget var3 = (UiWidget) null;
            this.handlePointerWheel(-119, 24, -30, 98, 113, (UiWidget) null, 116);
        }
        return this.child != null ? this.child.d((byte) 123) : 0;
    }

    final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$10 = null;
        int var5_int = 0;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$11 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          discarded$10 = param1.append('\n');
          for (var5_int = param3; param0 >= var5_int; var5_int++) {
            discarded$12 = param1.append(' ');
          }
          if (this.child != null) {
            this.child.a(0, param1, param2, param0 + 1);
          } else {
            discarded$11 = param1.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("sh.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    String getHoverText(byte methodGuard) {
        String var3 = null;
        String var2 = super.getHoverText(methodGuard);
        if (!(this.child == null)) {
            var3 = this.child.getHoverText((byte) 69);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    private final boolean a(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -11 % ((param1 + 73) / 40);
          stackIn_5_0 = (null != this.child) && (!this.child.hasKeyboardFocus((byte) 54)) && (this.child.requestKeyboardFocus((byte) -85, param0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sh.U(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard > -30) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          stackIn_6_0 = (null != this.child) && (this.child.requestKeyboardFocus((byte) -34, focusContext));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sh.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            UiWidget guardedNullWidgetSnapshot = (UiWidget) null;
            this.updatePointerState(false, 15, (UiWidget) null, 31);
        }
        return this.findFocusTarget(-4863) != null ? true : false;
    }

    final boolean handlePointerWheel(int parentY, int wheelRotation, int parentX, int methodGuard, int pointerX, UiWidget eventContext, int pointerY) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard != -1) {
            return true;
          }
          stackIn_8_0 = (null != this.child) && (this.child.hasKeyboardFocus((byte) 54)) && (this.child.handlePointerWheel(parentY, wheelRotation, parentX, -1, pointerX, eventContext, pointerY));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("sh.EB(").append(parentY).append(',').append(wheelRotation).append(',').append(parentX).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (eventContext == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(pointerY).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int methodGuard) {
        if (null != this.child) {
            this.child.clearKeyboardFocus(-123);
        }
        if (methodGuard >= -122) {
            SingleChildWidget.a((byte) 83);
        }
    }

    void refreshChildLayout(boolean layoutGuard) {
        if (null != this.child) {
            this.child.refreshLayout(-73);
        }
        if (!layoutGuard) {
            projectedMeshVertexX = (int[]) null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            return;
        }
        mainRasterBuffer = null;
        field_z = null;
        projectedMeshVertexX = null;
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            if (this.child != null) {
                this.child.updatePointerState(false, this.widgetY + parentY, eventContext, this.widgetX + parentX);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "sh.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((null != this.child) &&
              (this.child.hasKeyboardFocus((byte) 54)) &&
              (this.child.handleKeyInput(param0, 13, param2, param3))) {
            return true;
          }
          if (param1 != 13) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (!MidiPcmStream.heldInternalKeys[81]) {
            stackIn_11_0 = this.a(param3, 22439);
          } else {
            stackIn_11_0 = this.a(param3, (byte) -119);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("sh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    SingleChildWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        super(x, y, width, height, renderer, listener);
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        super.setWidgetBounds(height, width, (byte) -40, y, x);
        if (methodGuard > -6) {
            field_z = (String) null;
        }
        this.refreshChildLayout(true);
    }

    static {
        projectedMeshVertexX = new int[8192];
        field_z = "FPS: <%0>";
    }
}
