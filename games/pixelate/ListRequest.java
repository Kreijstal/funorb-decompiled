/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ListRequest extends IntrusiveNode {
    int field_k;
    static String field_l;
    int field_m;

    public static void releaseStatics(byte param0) {
        field_l = null;
        if (param0 != -10) {
          field_l = (String) null;
        }
    }

    private ListRequest() throws Throwable {
        throw new Error();
    }

    final static void openSubscribePage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              var3 = 83 % ((param1 + 11) / 38);
              param0.getAppletContext().showDocument(LoginCookieHelpers.withSessionParameters(false, param0, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("m.C(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void reopenLoginFormAfterClose(byte param0) {
        if (!MainMenuScreen.field_s) {
          throw new IllegalStateException();
        }
        if (MainMenuScreen.field_r != null) {
          MainMenuScreen.field_r.close(param0 ^ 15);
        }
        String var1 = Puzzle.getLoginNameOrDefault(0);
        LoginFormGlobals.field_b = new LoginForm(var1, (String) null, true, false, false);
        if (param0 == -102) {
          SpriteBuildHelpers.field_c.showPanel(param0 - 6081, AchievementBannerEntry.field_l);
          AchievementBannerEntry.field_l.transitionToContent(LoginFormGlobals.field_b, param0 ^ 27);
          AchievementBannerEntry.field_l.finishAnimations(false);
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        ListRequest.openSubscribePage((java.applet.Applet) null, -43);
        SpriteBuildHelpers.field_c.showPanel(param0 - 6081, AchievementBannerEntry.field_l);
        AchievementBannerEntry.field_l.transitionToContent(LoginFormGlobals.field_b, param0 ^ 27);
        AchievementBannerEntry.field_l.finishAnimations(false);
    }

    static {
        field_l = "Only show game chat from my friends";
    }
}
