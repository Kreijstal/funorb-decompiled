/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameListSortHelpers {
    static boolean field_a;
    static int field_f;
    static long field_e;
    static String field_d;
    static boolean field_b;
    static String field_c;

    public static void releaseStatics(byte param0) {
        field_d = null;
        if (param0 <= 19) {
          GameListSortHelpers.releaseStatics((byte) 112);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void insertSortedGame(LobbyGameEntry param0, int param1) {
        LobbyGameEntry var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param0.unlink(true);
          var3 = 19 % ((-78 - param1) / 48);
          var2 = (LobbyGameEntry) (UiTheme.field_a.first(12623));
          while (var2 != null) {
            if (var2.sortsBefore(param0, 2)) {
              var2 = (LobbyGameEntry) (UiTheme.field_a.next(0));
              continue;
            }
            break;
          }
          if (var2 != null) {
            MusicAndClipHelpers.insertBefore(var2, 20, param0);
            return;
          }
          UiTheme.field_a.addLast(param0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("cb.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game.  After learning the basics, enter the lobby and join a Rated game to earn wands. <col=FF0000>(Members only)</col> Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_c = null;
    }
}
