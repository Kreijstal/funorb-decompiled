/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetContainer extends UiComponent implements UiContainerMarker {
    UiComponent[] children;
    static NoticeKind field_F;
    static String field_M;
    static java.awt.Image field_K;
    static Sprite field_H;
    static char[] field_I;
    static int field_J;

    final boolean containsFocus(boolean param0) {
        if (!param0) {
          field_H = (Sprite) null;
        }
        return null != this.getFocusedChild(0) ? true : false;
    }

    final boolean focusNext(UiComponent param0, int param1) {
        int var4 = 0;
        UiComponent[] var3 = null;
        RuntimeException var3_ref = null;
        UiComponent var5 = null;
        int var6 = 0;
        UiComponent[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != 27) {
            return true;
          }
          var7 = this.children;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.focusNext(param0, 27)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("jg.HA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void appendDebugChildren(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        UiComponent var7 = null;
        int var9 = 0;
        UiComponent[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.children) {
            return;
          }
          var10 = this.children;
          if (param2 <= 126) {
            field_J = -27;
          }
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$6 = param0.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$8 = param0.append(' ');
            }
            if (var7 != null) {
              var7.appendWidgetDiagnostics(param0, false, param3 + 1, param1);
            } else {
              discarded$7 = param0.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("jg.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean isAccountUiActive(byte param0) {
        if (param0 < 56) {
          field_F = (NoticeKind) null;
        }
        return IconTextComponent.field_Nb;
    }

    final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        super.setBounds(param0, (byte) 75, param2, param3, param4);
        this.layoutChildren(14210);
        if (param1 < 19) {
          field_H = (Sprite) null;
        }
    }

    final static boolean handleAccountNamePromptKey(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return true;
        }
        stackIn_6_0 = (null != CanvasInputHelpers.field_f) && (CanvasInputHelpers.field_f.handleNormalizedNameKey((byte) -87));
        return stackIn_6_0;
    }

    private final boolean focusNextChild(byte param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -95) {
            this.setBounds(-13, (byte) -36, 75, -82, -49);
          }
          stackIn_3_0 = this.focusBackwardBy(-18125, 1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        int var6 = 0;
        UiComponent[] var5 = null;
        UiComponent var7 = null;
        int var8 = 0;
        UiComponent[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (this.children == null) {
            return;
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.updatePointer(param0 + 0, this.field_p + param1, param2 + this.field_z, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("jg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final String getTooltip(byte param0) {
        UiComponent[] var2;
        int var3;
        Object var5;
        int var6;
        UiComponent[] var7;
        UiComponent var4;
        String var5_ref;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null == this.children) {
          return null;
        }
        var7 = this.children;
        var2 = var7;
        var3 = 0;
        if (param0 < 16) {
          return (String) null;
        }
        while (var7.length > var3) {
          var4 = var7[var3];
          if (var4 != null) {
            var5_ref = var4.getTooltip((byte) 36);
            if (var5_ref != null) {
              return var5_ref;
            }
          }
          var3++;
        }
        return null;
    }

    final static void setSoundVolume(int param0, int param1) {
        SocketJs5Transport.field_u = param0;
        if (null != MainMenuScreen.field_q) {
          MainMenuScreen.field_q.setMasterVolume((byte) 30, param0);
        }
        int var2 = -13 % ((52 - param1) / 59);
        if (ChatHistoryAllocator.field_a != null) {
          ChatHistoryAllocator.field_a.setVolume(param0, (byte) 2);
        }
    }

    final boolean handlePointerPress(byte param0, UiComponent param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        UiComponent[] var8 = null;
        RuntimeException var8_ref = null;
        UiComponent var10 = null;
        int var11 = 0;
        UiComponent[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -58) {
            this.containsFocus(true);
          }
          if (this.children == null) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.handlePointerPress((byte) -58, param1, param2, param3 + this.field_p, param4, this.field_z + param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("jg.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_F = (NoticeKind) null;
          }
          if (this.beginDebugDescription(-90, param2, param0, param3)) {
            this.appendDebugBody(param2, (byte) -2, param3, param0);
            this.appendDebugChildren(param0, param3, (byte) 127, param2);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jg.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int pollAccountUiResult(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          SpriteBuildHelpers.field_c.handlePointerEvents(AchievementRecord.field_w, true, (byte) 99, AchievementBannerEntry.field_o);
          SpriteBuildHelpers.field_c.updatePanels((byte) 112);
          while (DirectByteStorage.pollKeyEvent(120)) {
            SpriteBuildHelpers.field_c.processKey(DualLinkDeque.field_f, KeyEventGlobals.field_a, false);
          }
          if (QuickChatPhraseCache.field_h != -1) {
            var1_int = QuickChatPhraseCache.field_h;
            QuickChatMenu.setPendingUiResult(-1, -2671);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 <= 51) {
            ArrayWidgetContainer.isAccountUiActive((byte) -82);
          }
          if (NineSliceFrameHelpers.field_c) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (MatchingTextValidator.field_n == Js5NetworkRequest.field_F) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!CaretLayoutHelpers.field_e.isComplete(123)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (MarkerSlider.field_X != Js5NetworkRequest.field_F) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "jg.M(" + param0 + ')');
        }
    }

    final void blur(int param0) {
        int var3 = 0;
        UiComponent[] var2;
        UiComponent var4;
        int var5;
        UiComponent[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        var6 = this.children;
        var2 = var6;
        if (param0 != 2) {
          field_K = (java.awt.Image) null;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.blur(2);
          }
        }
    }

    final int getTopLayer(int param0) {
        int var4 = 0;
        int var2;
        UiComponent[] var3;
        UiComponent var5;
        int var7;
        int var6;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        var3 = this.children;
        if (param0 <= 31) {
          this.children = (UiComponent[]) null;
        }
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.getTopLayer(61);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    private final boolean focusForwardFromFocused(UiComponent param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          var4_int = 0;
          if (param1 != -44) {
            this.getTopLayer(-60);
          }
          while (this.children.length > var4_int) {
            var5 = this.children[var4_int];
            if (null != var5 &&
              var5.containsFocus(true)) {
              for (var4_int = var4_int + param2; var4_int < this.children.length; var4_int = var4_int + param2) {
                var6 = this.children[var4_int];
                if (null != var6 &&
                  var6.focusNext(param0, 27)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("jg.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_I = null;
        field_M = null;
        field_F = null;
        if (param0 > -65) {
          return;
        }
        field_K = null;
        field_H = null;
    }

    final void handlePointerRelease(int param0, int param1, UiComponent param2, int param3, int param4, int param5) {
        int var8 = 0;
        UiComponent[] var7 = null;
        UiComponent var9 = null;
        int var10 = 0;
        UiComponent[] var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.children) {
            return;
          }
          var11 = this.children;
          var7 = var11;
          for (var8 = param3; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.handlePointerRelease(param0, param1 + this.field_z, param2, 0, param4 + this.field_p, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("jg.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final UiComponent getFocusedChild(int param0) {
        int var3 = 0;
        UiComponent[] var2;
        UiComponent var4;
        int var5;
        UiComponent[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null == this.children) {
          return null;
        }
        var6 = this.children;
        var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.containsFocus(true)) {
            return var4;
          }
        }
        return null;
    }

    void drawLayer(int param0, int param1, int param2, byte param3) {
        int var5;
        UiComponent var6;
        int var7;
        int var5Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0 &&
          null != this.field_y) {
          this.field_y.drawWidget((UiComponent) (this), (byte) -124, param0, param2, true);
        }
        if (null != this.children) {
          for (var5 = this.children.length - 1; 0 <= var5; var5--) {
            var6 = this.children[var5];
            if (var6 != null) {
              var6.drawLayer(this.field_p + param0, param1, param2 + this.field_z, (byte) -95);
            }
          }
        }
        var5Lifetime1 = -65 / ((param3 - 70) / 49);
    }

    ArrayWidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
    }

    abstract void layoutChildren(int param0);

    private final boolean focusPreviousChild(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -17753) {
            stackIn_4_0 = this.focusForwardFromFocused(param0, (byte) -44, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jg.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean focusBackwardBy(int param0, int param1, UiComponent param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        UiComponent stackIn_8_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiComponent var6Lifetime1;
        UiComponent var6Lifetime2;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          var4_int = -1 + this.children.length;
          while (var4_int >= 0) {
            var5 = this.children[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            stackIn_8_0 = var5;
            if (stackIn_8_0 != null &&
              var5.containsFocus(true)) {
              for (var4_int = var4_int - param1; var4_int >= 0; var4_int = var4_int - param1) {
                var6Lifetime2 = this.children[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.focusNext(param2, 27)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param0 == -18125) {
            return false;
          }
          field_J = -62;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("jg.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        int var6 = 0;
        UiComponent[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiComponent var7 = null;
        int var8 = 0;
        UiComponent[] var9 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          var9 = this.children;
          var5 = var9;
          if (param1 != 3) {
            ArrayWidgetContainer.isAccountUiActive((byte) 125);
          }
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.containsFocus(true) &&
              var7.onFocusedKey(param0, 3, param2, param3)) {
              return true;
            }
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (!EmailValidator.field_m[81]) {
            stackIn_20_0 = this.focusPreviousChild(param2, -17753);
          } else {
            stackIn_20_0 = this.focusNextChild((byte) -126, param2);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("jg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean onMouseWheel(int param0, byte param1, int param2, int param3, int param4, int param5, UiComponent param6) {
        int var9 = 0;
        UiComponent[] var8 = null;
        RuntimeException var8_ref = null;
        UiComponent var10 = null;
        int var11 = 0;
        UiComponent[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          if (param1 < 61) {
            this.blur(91);
          }
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.containsFocus(true) &&
              var10.onMouseWheel(param0, (byte) 105, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("jg.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_F = new NoticeKind();
        field_M = "<%0> disconnected.";
        field_I = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
