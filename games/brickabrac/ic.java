/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static long optionChangeDeadlineMillis;
    static ResourceArchive specialMusicPatchArchive;
    static VerticalScrollbar field_c;

    final static void insertSortedLobbyGame(boolean obfuscationGuard, LobbyGame game) {
        LobbyGame existingGame = null;
        RuntimeException failure = null;
        int clientBranchFlag = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            optionChangeDeadlineMillis = 8L;
          }
          game.unlink((byte) 111);
          existingGame = (LobbyGame) (rq.lobbyGames.first(-76));
          while (existingGame != null) {
            if (existingGame.comesBeforeGame(game, true)) {
              existingGame = (LobbyGame) (rq.lobbyGames.next((byte) 116));
              continue;
            }
            break;
          }
          if (existingGame == null) {
            rq.lobbyGames.addLast(game, (byte) 3);
            return;
          }
          BubbleDistortion.insertNodeBefore(game, -90, existingGame);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_13_0 = failure;
          stackIn_13_1 = new StringBuilder().append("ic.A(").append(obfuscationGuard).append(',');
          if (game == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        specialMusicPatchArchive = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    final static void disableKeyboardInput(byte obfuscationGuard) {
        Object var1 = null;
        Throwable var2 = null;
        LobbyGame var3 = null;
        Throwable decompiledCaughtException = null;
        if (DualLinkDeque.keyboardInput != null) {
          var1 = DualLinkDeque.keyboardInput;
          synchronized (var1) {
            DualLinkDeque.keyboardInput = null;
          }
        }
        if (obfuscationGuard > -63) {
          var3 = (LobbyGame) null;
          ic.insertSortedLobbyGame(true, (LobbyGame) null);
        }
    }

    static {
    }
}
