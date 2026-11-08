/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GreenGrowTheRushesBackground extends BackgroundScene {
    static int field_m;
    static int field_o;
    static SceneWidget field_n;

    final static int getIdleTimeoutLimit(int param0) {
        if (param0 != 13428) {
          field_m = -88;
          return oi.field_c;
        }
        return oi.field_c;
    }

    final static void createAccountUiLayer(boolean param0) {
        Checkbox.field_X = bi.getUiTheme(4);
        wa.field_c = new ModalStack();
        QueuedInput.a(true, -17130, true);
        if (param0) {
          GreenGrowTheRushesBackground.onLoginSucceeded(-24);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_n = (SceneWidget) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static boolean hasOpenNotice(int param0) {
        if (param0 < 94) {
          GreenGrowTheRushesBackground.releaseStatics(30);
          if (null == NetworkGameClient.field_x) {
            return false;
          }
          if (null != NetworkGameClient.field_x.getTopOpenPanel(640)) {
            return true;
          }
          return false;
        }
        if (null == NetworkGameClient.field_x) {
          return false;
        }
        if (null != NetworkGameClient.field_x.getTopOpenPanel(640)) {
          return true;
        }
        return false;
    }

    final void render(boolean param0) {
        if (param0) {
          return;
        }
        jk.field_a.drawOpaque(0, 0);
    }

    final static void setTuhstatbutCookie(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          EditableTextWidget.field_T = true;
          var2 = "tuhstatbut";
          if (param1 != -7624) {
            field_o = 58;
          }
          var3 = "rvnadlm";
          var4 = -1L;
          MatchHud.setBrowserCookie(param0, 78, var3, var2, var4);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ql.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void onLoginSucceeded(int param0) {
        int var1;
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        dk.field_c = false;
        wp.field_a = null;
        var1 = 32 / ((-65 - param0) / 51);
        if (MainMenuScreen.field_s) {
          MainMenuScreen.field_r.showNoticeContent(2121792);
        } else {
          var2 = ra.field_g;
          if (var2 > 0) {
            if (var2 == 1) {
              wp.field_a = MainMenuScreen.field_o;
            } else {
              wp.field_a = AlphaContainer.formatTemplate(SpriteState.field_v, 63, new String[]{Integer.toString(var2)});
            }
            wp.field_a = gi.joinCharSequences(0, new CharSequence[]{(CharSequence) ((Object) wp.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) GameApplet.field_d)});
          }
          MainMenuScreen.field_r.close(-100);
          AsyncValidationResult.showLoadingProgressDialog((byte) 81);
        }
    }

    GreenGrowTheRushesBackground(String param0, Sprite[] param1) {
        super(param0, param1);
    }

    static {
    }
}
