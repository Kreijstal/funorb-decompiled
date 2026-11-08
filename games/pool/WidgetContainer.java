/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements ChildWidgetOwner {
    static QuickChatDynamicCommand field_K;
    IntrusiveDeque children;
    static String newgame;
    static int field_G;
    static int[] field_J;
    static int field_H;
    static int field_I;
    static int[] field_M;

    final boolean hasKeyboardFocus(int param0) {
        int var2 = 22 / ((7 - param0) / 48);
        return null != this.findFocusTarget((byte) 117) ? true : false;
    }

    UiWidget findFocusTarget(byte param0) {
        IntrusiveDequeCursor var2;
        int var3;
        UiWidget var4;
        var3 = 90 / ((param0 - 51) / 61);
        var2 = new IntrusiveDequeCursor(this.children);
        var4 = (UiWidget) (var2.last((byte) -92));
        while (var4 != null) {
          if (var4.hasKeyboardFocus(83)) {
            return var4;
          }
          var4 = (UiWidget) (var2.previous(-87));
        }
        return null;
    }

    final boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        UiWidget var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IntrusiveDequeCursor(this.children);
          var4 = -98 / ((param1 + 43) / 47);
          var5 = (UiWidget) (var3.last((byte) -92));
          while (true) {
            if (var5 == null) {
              return false;
            }
            if (!var5.requestKeyboardFocus(param0, (byte) 72)) {
              var5 = (UiWidget) (var3.previous(-125));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ch.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void appendChildrenDiagnostics(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$4 = null;
        IntrusiveDequeCursor var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = 16 / ((22 - param0) / 49);
          var7 = (UiWidget) (var5.last((byte) -92));
          while (var7 != null) {
            discarded$3 = param1.append('\n');
            for (var8 = 0; param2 >= var8; var8++) {
              discarded$4 = param1.append(' ');
            }
            var7.appendWidgetDiagnostics(param1, 1 + param2, param3, 104);
            var7 = (UiWidget) (var5.previous(-88));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("ch.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (!param2) {
            field_H = 45;
          }
          var9 = (UiWidget) (var8.last((byte) -92));
          while (var9 != null) {
            if (var9.isLinked(-109)) {
              if (var9.handlePointerPress(param0, param1 + this.widgetX, true, param3, param4, this.widgetY + param5, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.previous(-119));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ch.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = (UiWidget) (var5.last((byte) -92));
          while (var6 != null) {
            if (var6.isLinked(-107)) {
              var6.updatePointerState(param0, param1 ^ 0, param2 + this.widgetX, this.widgetY + param3);
              var6 = (UiWidget) (var5.previous(-89));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ch.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          var7 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var7.last((byte) -92));
          if (param4 <= 62) {
            field_I = 75;
          }
          while (var8 != null) {
            if (var8.isLinked(-128)) {
              var8.handlePointerRelease(param0 + this.widgetX, param1, this.widgetY + param2, param3, (byte) 94, param5);
              var8 = (UiWidget) (var7.previous(-82));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ch.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void clearKeyboardFocus(byte param0) {
        int var4 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.last((byte) -92));
        if (param0 != 99) {
          field_J = (int[]) null;
        }
        while (var3 != null) {
          var3.clearKeyboardFocus((byte) 99);
          var3 = (UiWidget) (var2.previous(-90));
        }
    }

    final static void sendHighScoreSubmission(boolean obfuscationGuard, HighScoreSubmission submission, int opcode) {
        int var5 = 0;
        CipherPacketBuffer stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        CipherPacketBuffer stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var6 = null;
        CipherPacketBuffer var7 = null;
        try {
          var6 = JaggrabDownloader.field_j;
          var7 = var6;
          var7.writeCipheredOpcode(false, opcode);
          var7.position = var7.position + 1;
          var4 = var7.position;
          var7.writeByte(1, false);
          var7.writeShort((byte) -81, submission.field_B);
          var7.writeShort((byte) -81, submission.field_l);
          var7.writeShort((byte) -81, submission.field_p);
          var7.writeInt(true, submission.field_n);
          stackIn_2_0 = var7;
          stackIn_3_1 = !(obfuscationGuard);
          ((CipherPacketBuffer) (Object) stackIn_2_0).writeInt(stackIn_3_1, submission.field_x);
          stackIn_5_0 = var7;
          stackIn_6_1 = !(obfuscationGuard);
          ((CipherPacketBuffer) (Object) stackIn_5_0).writeInt(stackIn_6_1, submission.field_A);
          var7.writeInt(true, submission.field_v);
          var7.writeByte(submission.field_z.length, obfuscationGuard);
          for (var5 = 0; submission.field_z.length > var5; var5++) {
            var6.writeInt(true, submission.field_z[var5]);
          }
          var7.appendChecksum(-1, var4);
          var7.writeByteLengthPrefix(-var4 + var7.position, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ch.LA(").append(obfuscationGuard).append(',');
          if (submission == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(opcode).append(')').toString());
        }
    }

    void renderWidget(int param0, byte param1, int param2, int param3) {
        if (param0 == 0 &&
          this.renderer != null) {
          this.renderer.paintWidget(true, param2, (byte) 105, param3, (UiWidget) (this));
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.children);
        UiWidget var6 = (UiWidget) (var5.first(0));
        while (var6 != null) {
          var6.renderWidget(param0, (byte) 92, param2 + this.widgetX, this.widgetY + param3);
          var6 = (UiWidget) (var5.next((byte) -71));
        }
        int var7 = 69 / ((-42 - param1) / 53);
    }

    final boolean handlePointerWheel(UiWidget param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (param4 >= -126) {
            this.refreshChildrenLayout(-115);
          }
          var9 = (UiWidget) (var8.last((byte) -92));
          while (var9 != null) {
            if (var9.isLinked(-116)) {
              if (var9.hasKeyboardFocus(-122) &&
                var9.handlePointerWheel(param0, param1, param2, param3, (byte) -127, param5, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.previous(-103));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ch.WA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void addChild(boolean param0, UiWidget param1) {
        try {
          this.children.addFirst((byte) -123, param1);
          if (!param0) {
            field_I = -128;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ch.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void refreshChildrenLayout(int param0) {
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        if (param0 != 22555) {
          Hashtable var4 = (Hashtable) null;
          this.appendWidgetDiagnostics((StringBuilder) null, -32, (Hashtable) null, 81);
        }
        UiWidget var3 = (UiWidget) (var2.last((byte) -92));
        while (var3 != null) {
          var3.refreshLayout((byte) -119);
          var3 = (UiWidget) (var2.previous(-94));
        }
    }

    String getHoverText(int param0) {
        String var4 = null;
        int var5 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.last((byte) -92));
        while (var3 != null) {
          var4 = var3.getHoverText(-76);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.previous(-115));
        }
        if (param0 <= -10) {
          return null;
        }
        field_K = (QuickChatDynamicCommand) null;
        return null;
    }

    void setWidgetBounds(int param0, int param1, int param2, boolean param3, int param4) {
        super.setWidgetBounds(param0, param1, param2, param3, param4);
        this.refreshChildrenLayout(22555);
    }

    final int getLastRenderPass(int param0) {
        int var5 = 0;
        int var6 = Pool.field_O;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.children);
        if (param0 <= 33) {
          CharSequence var7 = (CharSequence) null;
          WidgetContainer.normalizeBase37Name(false, (CharSequence) null);
        }
        UiWidget var4 = (UiWidget) (var3.last((byte) -92));
        while (var4 != null) {
          var5 = var4.getLastRenderPass(38);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.previous(-122));
        }
        return var2;
    }

    boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        IntrusiveDequeCursor var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var5.last((byte) -92));
          while (var8 != null) {
            if (var8.isLinked(-115)) {
              if (var8.hasKeyboardFocus(109) &&
                var8.handleKeyInput(param0, param1, false, param3)) {
                return true;
              }
              var8 = (UiWidget) (var5.previous(-80));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 != 80) {
            if (!param2) {
              return false;
            }
            return true;
          }
          if (!TextLineLayout.field_c[81]) {
            stackIn_14_0 = this.requestNextChildFocus(param3, 0);
          } else {
            stackIn_14_0 = this.requestPreviousChildFocus(param3, 3);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("ch.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(param1, param2, param0, -1)) {
            this.appendWidgetDiagnosticProperties(1, param2, param0, param1);
            this.appendChildrenDiagnostics((byte) -54, param0, param1, param2);
          }
          if (param3 < 13) {
            this.hasKeyboardFocus(-124);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ch.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final static String normalizeBase37Name(boolean obfuscationGuard, CharSequence name) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = TextInputWidget.decodeBase37Name(obfuscationGuard, Base37Support.encodeBase37((byte) 52, name));
          if (obfuscationGuard) {
            field_J = (int[]) null;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ch.QA(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean requestPreviousChildFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        Hashtable var8 = null;
        IntrusiveDequeCursor var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.children.isEmpty(0)) {
            return false;
          }
          if (param1 != 3) {
            var8 = (Hashtable) null;
            this.appendChildrenDiagnostics((byte) 29, (StringBuilder) null, -124, (Hashtable) null);
          }
          var9 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var9.first(0));
          while (var4 != null) {
            if (var4.hasKeyboardFocus(-108)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.firstFrom(var4, param1 ^ -123);
              var6 = (UiWidget) (var5.next((byte) -71));
              while (var6 != null) {
                if (var6.requestKeyboardFocus(param0, (byte) 73)) {
                  return true;
                }
                var6 = (UiWidget) (var5.next((byte) -71));
              }
            }
            var4 = (UiWidget) (var9.next((byte) -71));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ch.JA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int measureSharedTextWidth(String text, boolean useAlternateFont, boolean obfuscationGuard) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            field_H = 62;
          }
          if (!useAlternateFont) {
            stackIn_6_0 = TransformRotationSupport.field_f.stringWidth(text);
            return stackIn_6_0;
          }
          stackIn_4_0 = ProgressBarWidget.field_R.stringWidth(text);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ch.IA(");
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(useAlternateFont).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_M = null;
        newgame = null;
        field_K = null;
        field_J = null;
        if (param0 != 2) {
          field_K = (QuickChatDynamicCommand) null;
        }
    }

    final boolean requestNextChildFocus(UiWidget param0, int param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.children.isEmpty(param1)) {
            return false;
          }
          var3 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var3.last((byte) -92));
          while (var4 != null) {
            if (var4.hasKeyboardFocus(-112)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.startForwardAt(var4, false);
              var6 = (UiWidget) (var5.previous(-90));
              while (var6 != null) {
                if (var6.requestKeyboardFocus(param0, (byte) -108)) {
                  return true;
                }
                var6 = (UiWidget) (var5.previous(-90));
              }
            }
            var4 = (UiWidget) (var3.previous(param1 ^ -123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ch.NA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        newgame = "New Game";
        field_K = new QuickChatDynamicCommand(13, 0, 1, 0);
        field_J = new int[]{1, 1, 2, 2, 5, 3, 1, 2, 3, 2, 5, 5, 3, 2, 10, 5, 5, 3, 5, 10, 3, 2, 3, 5, 3, 5, 2};
        field_M = new int[8192];
    }
}
