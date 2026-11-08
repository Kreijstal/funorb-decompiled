/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String field_b;
    static IntrusiveDeque field_a;

    final static void updateLobbyInput(int param0, int param1, int param2, boolean param3, int param4, String param5, int param6, int param7) {
        try {
          if (CredentialKind.field_d.field_U != 0) {
            if (wh.field_g) {
            } else {
              if (!AlternateUsernameCredentials.field_p) {
                SocketJs5Transport.field_r = true;
              } else {
                gj.resetLoginMode((byte) -124);
              }
            }
          }
          if (param4 != -7361) {
            field_b = (String) null;
          }
          if (SocketJs5Transport.field_r) {
            fn.layoutChatPanel(20, param5, param1, param1, (byte) -104, param2, param7, param0, param6);
            tm.field_d.updateInputFullScreen(param3, (byte) 52);
            if (param3) {
              if (MembershipOfferScreen.field_f.field_U != 0) {
                SocketJs5Transport.field_r = false;
              }
              if (0 == ih.field_d.field_U) {
                return;
              }
              ue.clearChatInput(10);
              SocketJs5Transport.field_r = false;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        int var1 = -17 / ((param0 + 33) / 42);
        field_b = null;
    }

    static {
        field_b = "Waiting for <%0> to start the game...";
    }
}
