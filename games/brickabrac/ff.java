/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static String field_g;
    static int[] field_f;
    static String field_j;
    static String[][] field_i;
    static w field_c;
    static long field_b;
    static String field_a;
    static int[] field_h;
    static NodeDeque field_d;
    static String field_e;

    abstract void a(int param0, PacketBuffer param1);

    final static GameCanvas a(int param0, int param1, int param2, int param3, boolean param4, PlatformServices param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        GameCanvas var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        GameCanvas stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = eh.a(param0, param5, param3, 119, param1, param2);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (GameCanvas) (stackIn_2_0);
          }
          var7 = new GameCanvas();
          var7.window = var8;
          var7.window.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param2, param3);
          var7.addFocusListener(var7);
          if (!param4) {
            ff.a((byte) 7, -111);
          }
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    abstract cd a(int param0);

    public static void a(byte param0) {
        field_h = null;
        field_i = (String[][]) null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_g = null;
        field_e = null;
        int var1 = -5 % ((param0 - 66) / 48);
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        TableRowSubmission var4 = null;
        TableDataRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = (TableRowSubmission) (tm.pendingTableSubmissions.first(-84));
          while (var4 != null) {
            AppletGameShell.sendTableRow(param1, var4, 14989);
            var4 = (TableRowSubmission) (tm.pendingTableSubmissions.next((byte) 116));
          }
          if (param0 > -34) {
            return;
          }
          var5 = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.first(-71));
          while (var5 != null) {
            uo.sendTableRequest(var5, param1, (byte) 68);
            var5 = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var2), "ff.G(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new int[8192];
        field_h = new int[]{13, 12};
        field_e = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = "Cancel rematch";
    }
}
