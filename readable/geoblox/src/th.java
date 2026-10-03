/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends lf {
    static int[] field_h;
    static String defaultPlayerNameText;
    static IndexedSprite sportsBackgroundSprite;

    th(long param0, String param1) {
        super(param0, param1);
    }

    final static od a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        od[] var3 = null;
        od var5 = null;
        int var6 = 0;
        od stackIn_5_0 = null;
        od stackIn_11_0 = null;
        od stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 != 200) {
            th.d((byte) 21);
          }
          var2 = qi.a("jagex-last-login-method", param0, -114);
          if (var2 == null) {
            stackIn_5_0 = td.field_I;
            return stackIn_5_0;
          }
          var3 = ak.a(false);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(115, var2)) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
          }
          stackIn_14_0 = td.field_I;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("th.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_h = null;
        sportsBackgroundSprite = null;
        defaultPlayerNameText = null;
        if (param0 != -109) {
            sportsBackgroundSprite = (IndexedSprite) null;
        }
    }

    final LoginPayloadKind a(byte param0) {
        if (param0 != -32) {
            this.a((byte) 104);
            return vh.field_D;
        }
        return vh.field_D;
    }

    static {
        field_h = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        defaultPlayerNameText = "Player";
    }
}
