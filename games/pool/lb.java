/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends PauseMenuScreen {
    static QuickChatDynamicCommand field_N;
    static String createUsernameAvailable;
    static Sprite[] field_O;
    static String[][] field_P;

    final void darkenBackground(byte param0) {
        if (param0 != 108) {
          this.darkenBackground((byte) 24);
        }
    }

    public static void releaseStatics(int param0) {
        createUsernameAvailable = null;
        field_O = null;
        field_N = null;
        field_P = (String[][]) null;
        if (param0 >= -70) {
          String var2 = (String) null;
          lb.loadSprite((ResourceArchive) null, 82, (String) null, (String) null);
        }
    }

    final static Sprite loadSprite(ResourceArchive param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Sprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 27 / ((29 - param1) / 34);
          var4_int = param0.getGroupId(param2, -1);
          var6 = param0.getFileId(var4_int, 0, param3);
          stackIn_1_0 = DisplayNamePanel.a(var6, (byte) 119, param0, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lb.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    lb(Sprite param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    static {
        field_N = new QuickChatDynamicCommand(1, 2, 2, 0);
        createUsernameAvailable = "Name is available";
    }
}
