/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingScreenHelpers {
    static String field_e;
    static String field_f;
    static SceneWidget[] field_b;
    static String field_c;
    static String field_a;
    static int field_d;

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0) {
          field_f = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        LoadingScreenHelpers.drawLoadingScreen((java.awt.Canvas) null, 17);
        field_f = null;
    }

    final static void configurePopupStyle(byte param0, SpriteFrame param1, int param2, int param3, SpriteFrame param4, int param5) {
        try {
          DraggableWidget.field_U = param3;
          IconTextComponent.field_Xb = param4;
          tf.field_c = param5;
          IconLabelControl.field_ac = param2;
          PopupMenuHelpers.field_b = param1;
          if (param0 > -46) {
            LoadingScreenHelpers.dismissLoadingUi(70);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "en.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private final static void showLoadingProgress(int param0, String param1, boolean param2, float param3) {
        try {
          if (ProxySocketConnector.field_r == null) {
            ProxySocketConnector.field_r = new LoadingProgressDialog(GradientOutlineTextPainter.field_p, QuickChatInputHelpers.field_f);
            GradientOutlineTextPainter.field_p.pushPanel(ProxySocketConnector.field_r, 79);
          }
          ProxySocketConnector.field_r.setProgress(114, param2, param1, param3);
          if (param0 > -77) {
            LoadingScreenHelpers.dismissLoadingUi(-66);
          }
          SoftwareRaster.clear();
          wn.a(0, true);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "en.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void drawLoadingScreen(java.awt.Canvas param0, int param1) {
        try {
          if (uj.field_d == 11) {
            sl.a((byte) 3);
          }
          if (param1 != -28003) {
            SpriteFrame var3 = (SpriteFrame) null;
            LoadingScreenHelpers.configurePopupStyle((byte) 126, (SpriteFrame) null, -34, -85, (SpriteFrame) null, -5);
          }
          LoadingScreenHelpers.showLoadingProgress(-84, ClientException.field_i, PopupMenuHelpers.field_h, IterableNodeHashTable.field_l);
          ScrollContainer.paintCanvasNow(0, 0, 28594, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "en.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void dismissLoadingUi(int param0) {
        int var1 = -81 % ((0 - param0) / 52);
        SpriteCheckboxPainter.a(10);
    }

    final static LobbyGame findLobbyGame(int param0, int param1) {
        if (param1 != 28858) {
          return (LobbyGame) null;
        }
        return fm.field_a != null ? (LobbyGame) (fm.field_a.get((long)param0, (byte) 98)) : null;
    }

    static {
        field_f = "Loading graphics";
        field_c = "Real-life threats";
        field_d = 500;
        field_a = "Invalid name";
    }
}
