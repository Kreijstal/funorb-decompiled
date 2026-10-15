/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq {
    static NodeDeque lobbyGames;
    static ScrollPaneWithFooter field_b;
    static String field_d;
    static ConnectionPhase awaitingLoginReply;
    private static String field_z;

    public static void a(byte param0) {
        if (param0 == -118) {
          field_d = null;
          lobbyGames = null;
          field_b = null;
          awaitingLoginReply = null;
          return;
        }
        field_d = (String) null;
        field_d = null;
        lobbyGames = null;
        field_b = null;
        awaitingLoginReply = null;
    }

    static {
        field_z = "rq.A(";
        field_d = "This is your RuneScape clan if you have one.";
        awaitingLoginReply = new ConnectionPhase();
    }
}
