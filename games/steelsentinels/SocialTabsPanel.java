/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialTabsPanel {
    static NodeDeque field_f;
    static int[] field_b;
    static int[] field_a;
    TabbedPanel field_d;
    static int field_h;
    static String field_e;
    static int field_c;
    static LoginConnectionStage field_g;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 != 24) {
          field_b = (int[]) null;
        }
    }

    final static int countSetBitsInArray(int param0, int[] param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var2_int = 0;
          if (param0 < 54) {
            field_b = (int[]) null;
          }
          for (var3 = 0; var3 < param1.length; var3++) {
            var2_int = var2_int + ClockAndCookieHelpers.countSetBits((byte) 124, param1[var3]);
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("uf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    SocialTabsPanel(String param0, SceneWidget param1) {
        String[] var3 = null;
        SceneWidget[] var4 = null;
        try {
          var3 = new String[]{param0, LoadoutHelpers.field_a, StatSubmission.field_A};
          var4 = new SceneWidget[]{param1, WhirlpoolHasher.field_m, (SceneWidget) ((Object) AccountRegistrationPanel.field_W)};
          this.field_d = new TabbedPanel(0L, ModalStack.field_U, var3, UrlAndReplyHelpers.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void layout(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_d.setBoundsAndLayout(10, param0, var7, param2, param4, var6, param1);
        DisplayMode.field_h.setBounds(0, 0, SocketConnector.field_b, 0, WhirlpoolHasher.field_m.field_zb);
        ClockAndCookieHelpers.field_a.setBounds(0, 2 + SocketConnector.field_b, 18, 0, -2 + (-80 + WhirlpoolHasher.field_m.field_zb + (-ReflectionCheck.field_G - 2)));
        SceneWidgetNode.field_E.setBounds(0, SocketConnector.field_b + 2, 18, -ReflectionCheck.field_G + (WhirlpoolHasher.field_m.field_zb - 82), 82 + ReflectionCheck.field_G);
        ClientGlobals.field_j.setLayout(WhirlpoolHasher.field_m.field_zb, -20 + WhirlpoolHasher.field_m.field_Lb + (-SocketConnector.field_b - 2), 2, 0, 20, 122, ReflectionCheck.field_G, param3 + (SocketConnector.field_b + 20));
        AccountRegistrationPanel.field_W.layoutControls(2, 20, param3 ^ 46, ReflectionCheck.field_G);
    }

    static {
        field_b = new int[8192];
        field_e = "<%0> has been removed.";
        field_f = new NodeDeque();
        field_c = 0;
        field_g = new LoginConnectionStage();
    }
}
