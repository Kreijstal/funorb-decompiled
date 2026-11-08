/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelSupport {
    static BrowserCookieSupport field_h;
    static int[] field_d;
    static int field_a;
    static String waitingToStartHint;
    static IndexedSprite[] field_c;
    static int field_b;
    static int field_e;
    static int field_f;

    final static BrowserCookieSupport a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        BrowserCookieSupport stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var2_int = param1.length();
          for (var3 = param0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_10_0 = MessageScreen.field_K;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("la.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, boolean param5, int param6, int param7) {
        try {
          if (AccountProtocolStage.field_d.pressedButton == 0) {
          } else {
            if (!RankingsRequest.field_z) {
              if (!ViewportController.field_y) {
                DualLinkNode.field_p = true;
              } else {
                EmailValidator.c((byte) 50);
              }
            }
          }
          int var8_int = -106 % ((param0 + 1) / 55);
          if (DualLinkNode.field_p) {
            SpaceBallSkin.layoutChatCompositionPanel(param1, param6, 20, 4, param2, param7, param4, param3, param3);
            Bzip2DecoderState.field_D.updateRoot(param5, false);
            if (!param5) {
              return;
            }
            if (0 != OptionsScreen.field_L.pressedButton) {
              DualLinkNode.field_p = false;
            }
            if (0 == ReflectionReplySupport.field_g.pressedButton) {
              return;
            }
            ProjectedLineSupport.resetChatComposition(14851);
            DualLinkNode.field_p = false;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 64 % ((53 - param0) / 52);
        field_d = null;
        waitingToStartHint = null;
    }

    static {
        field_h = new BrowserCookieSupport();
        field_b = 0;
        waitingToStartHint = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = 10;
    }
}
