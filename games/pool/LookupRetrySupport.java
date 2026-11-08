/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LookupRetrySupport {
    static int field_b;
    static UiComponent field_i;
    static int[] field_h;
    static String field_g;
    static LobbyGame field_e;
    static String privatechatFriendNotlisted;
    static String statusVersus;
    static String muLobbyNameRm;
    static String gameoptNeedchanging2;

    public static void releaseStatics(int param0) {
        field_g = null;
        gameoptNeedchanging2 = null;
        if (param0 == 0) {
          field_h = null;
          statusVersus = null;
          field_i = null;
          privatechatFriendNotlisted = null;
          field_e = null;
          muLobbyNameRm = null;
          return;
        }
        field_g = (String) null;
        field_h = null;
        statusVersus = null;
        field_i = null;
        privatechatFriendNotlisted = null;
        field_e = null;
        muLobbyNameRm = null;
    }

    final static void resendLookupQueries(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        LookupQuery var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var4 = (LookupQuery) (BallSkin.field_i.last((byte) 73));
          while (var4 != null) {
            LookupProtocolSupport.a(param1, var4, (byte) -51);
            var4 = (LookupQuery) (BallSkin.field_i.previous((byte) -5));
          }
          if (param0) {
            return;
          }
          muLobbyNameRm = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "tp.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = 0;
        field_h = new int[12];
        statusVersus = "<col=bbbbcc>Versus</col>";
        muLobbyNameRm = "Remove name";
        privatechatFriendNotlisted = "You cannot chat to <%0> because <%0> is not in your friend list.";
        gameoptNeedchanging2 = "The following settings need to be changed:  ";
    }
}
