/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CredentialHelpers {
    static int field_b;
    static int field_c;
    static String field_f;
    static SpriteWidget field_a;
    static String field_d;
    static String field_e;

    final static void tickLobbyHighlights(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayerEntry var1 = null;
        LobbyGame var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        LobbyPlayerEntry var1Lifetime1;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.first((byte) -26));
          while (var1 != null) {
            if (0 < var1.field_Gb) {
              var1.field_Gb = var1.field_Gb - 1;
              if (var1.field_Gb == 0) {
                var1.field_Wb = 0;
                if (var1.isUnlinkedFromIndex(0)) {
                  var1.unlink(false);
                }
              }
            }
            var1 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.next(16213));
          }
          var1_ref = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.first((byte) -94));
          if (param0) {
            CredentialHelpers.tickLobbyHighlights(true);
          }
          while (var1_ref != null) {
            if (var1_ref.field_Mb > 0) {
              var1_ref.field_Mb = var1_ref.field_Mb - 1;
              if (0 != var1_ref.field_Mb) {
                var1_ref = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.next(16213));
                continue;
              }
              var1_ref.field_Eb = 0;
              if (var1_ref.isUnlisted((byte) -89)) {
                var1_ref.unlink(false);
              }
            }
            var1_ref = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.next(16213));
          }
          var1Lifetime1 = (LobbyPlayerEntry) (VerticalScrollbar.field_Mb.first((byte) -51));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Gb > 0) {
              var1Lifetime1.field_Gb = var1Lifetime1.field_Gb - 1;
              if (0 == var1Lifetime1.field_Gb) {
                var1Lifetime1.field_Wb = 0;
                if (var1Lifetime1.isUnlinkedFromIndex(0)) {
                  var1Lifetime1.unlink(false);
                }
              }
            }
            var1Lifetime1 = (LobbyPlayerEntry) (VerticalScrollbar.field_Mb.next(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1_ref2), "pl.B(" + param0 + ')');
        }
    }

    final static int parseDecimalInt(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -44) {
            field_f = (String) null;
          }
          stackIn_3_0 = IntrusiveDeque.parseInteger(param2, 4330, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static LoginCredentials createCredentials(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        PasswordLoginCredentials stackIn_3_0 = null;
        LongAndTextLoginPayload stackIn_6_0 = null;
        LongAndTextCredentials stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0L &&
            param1 != null) {
            stackIn_3_0 = new PasswordLoginCredentials(param1, param3);
            return (LoginCredentials) ((Object) stackIn_3_0);
          }
          if (param4) {
            stackIn_6_0 = new LongAndTextLoginPayload(param0, param3);
            return (LoginCredentials) ((Object) stackIn_6_0);
          }
          if (param2 <= 126) {
            field_d = (String) null;
          }
          stackIn_10_0 = new LongAndTextCredentials(param0, param3);
          return (LoginCredentials) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 < -88) {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    static {
        field_f = "You are offering to draw.";
        field_c = -1;
        field_d = "Loading models";
        field_e = "You are invited to <%0>'s game.";
    }
}
