/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PopupMenuHelpers {
    static NodeDeque field_d;
    static String field_g;
    static boolean field_e;
    static boolean field_h;
    static boolean field_f;
    static String field_c;
    static SpriteFrame field_b;
    static String field_a;

    final static int measureText(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -62) {
            stackIn_2_0 = 94;
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_7_0 = MouseWheelInput.field_a.textWidth(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = NumericDateInputWidget.field_ib.textWidth(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void padToFourPixelAlignment(boolean param0, RgbSprite param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        String var10 = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if ((3 & (param1.field_D | (param1.field_F | param1.field_A) | param1.field_H)) == 0) {
            return;
          }
          var2_int = param1.field_A + (param1.field_D & 3);
          var2_int = var2_int + 4 - (3 & var2_int);
          var3 = (param1.field_H & 3) + param1.field_F;
          var3 = 4 - ((var3 & 3) - var3);
          if (param0) {
            var10 = (String) null;
            PopupMenuHelpers.measureText((String) null, false, (byte) -11);
          }
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (3 & param1.field_H) * var2_int + (param1.field_D & 3);
          for (var7 = 0; param1.field_F > var7; var7++) {
            for (var8 = 0; var8 < param1.field_A; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_E[incrementValue$1];
            }
            var6 = var6 + (var2_int - param1.field_A);
          }
          param1.field_E = var4;
          param1.field_A = var2_int;
          param1.field_H = param1.field_H & -4;
          param1.field_F = var3;
          param1.field_D = param1.field_D & -4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("rg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 <= 123) {
          field_e = true;
        }
        field_c = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static int getCurrentYear(int param0) {
        if (param0 != -1900) {
          return 43;
        }
        return new Date().getYear() + 1900;
    }

    final static void drawPopupMenuLines(int param0) {
        int var4 = 0;
        String stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        SpriteFrame stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        SpriteFrame var10 = null;
        int var11 = 0;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var1_int = IterableDualNodeDeque.field_b - PendingIntArrayRequest.field_q;
          PendingIntArrayRequest.field_q = ProxyAuthenticationException.field_f - (var1_int >> 1);
          ValidationIndicator.field_W = MarkerSliderPainter.field_a - (SceneWidget.field_hb >> 1);
          IterableDualNodeDeque.field_b = var1_int + PendingIntArrayRequest.field_q;
          var3 = -104 % ((26 - param0) / 62);
          var2 = ValidationIndicator.field_W;
          for (var4 = 0; var4 < AudioService.field_g.length; var4++) {
            var5 = TextAndMenuHelpers.field_g[var4];
            if (var5 >= 0) {
              if (var5 != PopupMenuSupport.field_c.field_e) {
                var6 = LoginDialog.field_Fb;
              } else {
                var6 = SocialStateHelpers.field_b;
              }
            } else {
              var6 = ProxyAuthenticationException.field_c;
            }
            var7 = AudioService.field_g[var4];
            stackIn_10_0 = var7;
            stackIn_11_1 = !(var5 < 0);
            var8 = PopupMenuHelpers.measureText(stackIn_10_0, stackIn_11_1, (byte) -94);
            var9 = ProxyAuthenticationException.field_f - (var8 >> 1);
            if (var5 >= 0) {
              var2 = var2 + ChatHistoryHelpers.field_c;
              if (var5 == PopupMenuSupport.field_c.field_e) {
                stackIn_16_0 = (SpriteFrame) (field_b);
              } else {
                stackIn_16_0 = IconTextComponent.field_Xb;
              }
              var10 = stackIn_16_0;
              if (var10 != null) {
                var10.drawFrame(var8 + (DraggableWidget.field_U << 1), -15203, var9 - DraggableWidget.field_U, (IconLabelControl.field_ac << 1) + WhirlpoolHasher.field_e, var2);
              }
              var2 = var2 + IconLabelControl.field_ac;
            }
            if (var5 >= 0) {
              MouseWheelInput.field_a.drawLeft(var7, var9, var2 + MenuInputState.field_g, var6, -1);
              var2 = var2 + (WhirlpoolHasher.field_e + (ChatHistoryHelpers.field_c + IconLabelControl.field_ac));
            } else {
              NumericDateInputWidget.field_ib.drawLeft(var7, var9, var2 + IntKeyLookup.field_d, var6, -1);
              var2 = var2 + IntrusiveNode.field_e;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    final static void drawScreenshotSlideshow(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RgbSprite var6 = null;
        RgbSprite var7 = null;
        RgbSprite var8 = null;
        RgbSprite var7Lifetime1;
        RgbSprite var7Lifetime2;
        int var3Lifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 30) {
            field_b = (SpriteFrame) null;
          }
          SoftwareRaster.drawRectangleOutline(243, 197, 369, 143, 16777215);
          SoftwareRaster.fillRectangle(244, 198, 367, 141, 0);
          if (Explosion.field_S == null) {
            if (null != ChatPanelSetupHelpers.field_a) {
              ChatPanelSetupHelpers.field_a.drawParagraph(AgeValidator.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = Explosion.field_S[UiComponent.field_r];
          var7 = var6;
          var7Lifetime1 = var6;
          if (var6 == null) {
            if (ChatPanelSetupHelpers.field_a != null) {
              ChatPanelSetupHelpers.field_a.drawParagraph(AgeValidator.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.drawTransparent(245, 199);
          }
          if (NodeDeque.field_g < LoginActionHelpers.field_i) {
            var7Lifetime2 = Explosion.field_S[QuickChatPhraseCache.field_e];
            if (var7Lifetime2 != null) {
              var2_int = (var7Lifetime2.field_z + 60) * NodeDeque.field_g / LoginActionHelpers.field_i;
              var3 = var2_int - 30;
              if (LoginConnectionStage.field_b) {
                FullscreenFocusCanvas.drawHorizontalFadeSprite(245, -256 * var3 / 30, (var7Lifetime2.field_z - var3) * 256 / 30, 199, var7Lifetime2, -1);
              } else {
                FullscreenFocusCanvas.drawHorizontalFadeSprite(245, (var7Lifetime2.field_z - var3) * 256 / 30, var3 * -256 / 30, 199, var7Lifetime2, -1);
              }
            }
          }
          if (null != ChatPanelSetupHelpers.field_a) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (Explosion.field_S.length > var5) {
              var8 = Explosion.field_S[var5];
              if (var8 != null && (365 != var8.field_z ||
                139 != var8.field_B)) {
                if (var2 == null) {
                  var2 = Integer.toString(var5);
                } else {
                  var2 = (String) (var2) + ", " + var5;
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            ChatPanelSetupHelpers.field_a.drawParagraph("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "rg.D(" + param0 + ')');
        }
    }

    static {
        field_d = new NodeDeque();
        field_g = "Play the game without logging in just yet";
        field_f = true;
        field_a = "Connection restored.";
    }
}
