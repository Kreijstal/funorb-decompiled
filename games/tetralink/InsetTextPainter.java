/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InsetTextPainter extends TextWidgetPainter {
    static WidgetContainer field_s;
    static Calendar field_t;
    static int field_u;
    static Sprite[] field_q;
    static Archive field_v;
    static String field_r;
    static Model field_w;

    final static boolean containsForwardOrReversed(byte param0, String param1, String param2) {
        int var3_int = 0;
        String var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -36 % ((param0 - 89) / 33);
          param1 = TextFieldValidator.replaceCharacter(param1, '_', false, "");
          var4 = NodeHashTable.reverseString(116, param2);
          stackIn_5_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var4) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
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
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    InsetTextPainter(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_N, -1, 2147483647, false);
    }

    final static void updateFullscreenModals(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TetraLink.field_J;
        try {
          if (UiComponent.isModalLayerOpen(true)) {
            TopLevelContainerHelpers.field_i.processPointerFrame(ContextMenu.field_Vb, true, BufferedFile.field_m, false);
            TopLevelContainerHelpers.field_i.animateAndRemoveHiddenLayers(param0 ^ param0);
            while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
              TopLevelContainerHelpers.field_i.processKeyInput(WidgetStyleLayer.field_e, AnimationSequence.field_m, param0 ^ -81);
            }
            return;
          }
          if (null != EmailAvailabilityValidator.field_u &&
            EmailAvailabilityValidator.field_u.field_c) {
            QuickChatCategory.exitFullscreen((byte) 59);
            TopLevelContainerHelpers.field_i.pushLayer(new FullscreenErrorDialog(TopLevelContainerHelpers.field_i, ChatMessageReader.field_d), false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "mf.I(" + param0 + ')');
        }
    }

    public final void drawWidget(UiWidget param0, int param1, int param2, boolean param3, boolean param4) {
        try {
          if (param4) {
            PageReloadHelpers.drawInsetBorder(param1 + param0.field_t, param0.field_w + param2, (byte) -110, param0.field_F, param0.field_u);
          }
          super.drawWidget(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mf.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_s = null;
        field_q = null;
        if (!param0) {
          field_t = null;
          field_r = null;
          field_v = null;
          field_w = null;
          return;
        }
        InsetTextPainter.updateFullscreenModals(-30);
        field_t = null;
        field_r = null;
        field_v = null;
        field_w = null;
    }

    final static int pollFullscreenPromptAction(int param0) {
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          var1_int = 0;
          var2 = 0;
          while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
            QuickChatMenuFactory.field_h.handleVerticalNavigation(93);
            if (QuickChatMenuFactory.field_h.isActivated(83)) {
              var1_int = 1;
            }
            if (WidgetStyleLayer.field_e != 13) {
              continue;
            }
            var2 = 1;
          }
          QuickChatMenuFactory.field_h.updatePointer(LobbyPlayerEntry.hitTestMenuOption(ContextMenu.field_Nb, ClientProtocolStage.field_a, 8395), LobbyPlayerEntry.hitTestMenuOption(PasswordFieldPainter.field_B, WhirlpoolHasher.field_o, 8395), (byte) 92);
          if (QuickChatMenuFactory.field_h.isActivated(83)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            QuickChatMenuFactory.field_h.field_b >= 0) {
            var3 = StartupFlagsHelpers.field_g[QuickChatMenuFactory.field_h.field_b];
            if (var3 == 2) {
              LongAndTextCredentials.resetSessionState(88);
            } else if (var3 == 5) {
              LongAndTextCredentials.resetSessionState(88);
            }
          } else {
            if (var2 != 0 &&
              AnimationFrameSet.field_z != 2) {
              LongAndTextCredentials.resetSessionState(param0 - 916);
            }
          }
          if (var3 == 0 &&
            2 == AnimationFrameSet.field_z) {
            var4 = -IntrusiveDequeCursor.field_a + ClockAndTextHelpers.monotonicMillis(0);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              ReportAbuseDialog.buildFullscreenDialog(true, 10, 5);
            }
          }
          if (param0 == 1000) {
            stackIn_30_0 = var3;
            return stackIn_30_0;
          }
          stackIn_28_0 = -33;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "mf.M(" + param0 + ')');
        }
    }

    InsetTextPainter(int param0) {
        this(NumericDateInputWidget.field_S, param0);
    }

    static {
        field_t = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = "Unpacking music";
    }
}
