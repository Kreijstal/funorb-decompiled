/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailLoginCredentials extends LoginCredentials {
    private String password;
    static int[] fireworkBaseColors;
    static String field_m;
    private String email;
    static int[][] fireworkColorRamps;
    static String[][] field_p;
    static int fullscreenDialogButtonPaint;
    static boolean field_l;

    public static void a(boolean param0) {
        fireworkColorRamps = (int[][]) null;
        if (param0) {
          PacketBuffer var2 = (PacketBuffer) null;
          EmailLoginCredentials.decodeLobbyGame((LobbyGame) null, (PacketBuffer) null, -20, false);
        }
        field_m = null;
        field_p = (String[][]) null;
        fireworkBaseColors = null;
    }

    final LoginCredentialKind getCredentialKind(int obfuscationGuard) {
        if (obfuscationGuard != 13) {
          return (LoginCredentialKind) null;
        }
        return RadialSelectorWidget.emailLoginKind;
    }

    final static void decodeLobbyGame(LobbyGame game, PacketBuffer packet, int obfuscationGuard, boolean includePlayerCount) {
        int playerIndex = 0;
        LobbyGame stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        LobbyGame stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        LobbyGame stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        LobbyGame stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        LobbyGame stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        LobbyGame stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int flags = 0;
        RuntimeException failure = null;
        int hasConcludedDuration = 0;
        int hasPlayerNames = 0;
        int firstNamePosition = 0;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (includePlayerCount) {
            game.playerCount = packet.readUnsignedByte(255);
          }
          game.maxPlayers = packet.readUnsignedByte(255);
          game.joinSortPriority = packet.readUnsignedByte(obfuscationGuard ^ 255);
          flags = packet.readUnsignedByte(255);
          stackIn_6_0 = (LobbyGame) (game);
          stackIn_7_1 = ((flags & 128) != 0);
          stackIn_6_0.directJoinEnabled = stackIn_7_1;
          stackIn_9_0 = (LobbyGame) (game);
          stackIn_10_1 = ((64 & flags) != obfuscationGuard);
          stackIn_9_0.started = stackIn_10_1;
          stackIn_12_0 = (LobbyGame) (game);
          stackIn_13_1 = (0 != (flags & 32));
          stackIn_12_0.rated = stackIn_13_1;
          stackIn_15_0 = (LobbyGame) (game);
          stackIn_16_1 = ((flags & 8) != 0);
          stackIn_15_0.protocolFlag8 = stackIn_16_1;
          stackIn_19_0 = (LobbyGame) (game);
          stackIn_20_1 = (game.directJoinEnabled) && (game.playerCount < game.maxPlayers);
          stackIn_19_0.directJoinAvailable = stackIn_20_1;
          stackIn_22_0 = (LobbyGame) (game);
          if (0 != (flags & 16)) {
            stackIn_23_1 = 2;
          } else {
            stackIn_23_1 = 1;
          }
          stackIn_22_0.spectatorMode = stackIn_23_1;
          stackIn_26_0 = ((4 & flags) == 0) ? 0 : 1;
          hasConcludedDuration = stackIn_26_0;
          packet.readBytes(0, game.settings, obfuscationGuard ^ 125, game.settings.length);
          stackIn_29_0 = ((flags & 2) == 0) ? 0 : 1;
          hasPlayerNames = stackIn_29_0;
          game.protocolWord16 = packet.readUnsignedShort(65280);
          game.activityTimeMillis = MonotonicTime.nowMillis(false) - (long)packet.readInt(255);
          if (hasConcludedDuration != 0) {
            game.concludedDurationMillis = packet.readInt(255);
          } else {
            game.concludedDurationMillis = -1;
          }
          game.protocolId64 = packet.readLong(-32768);
          firstNamePosition = packet.position;
          game.displayName = packet.readCp1252String(~obfuscationGuard);
          if (hasPlayerNames != 0) {
            game.playerNames = new String[game.playerCount];
            packet.position = firstNamePosition;
            for (playerIndex = 0; game.playerCount > playerIndex; playerIndex++) {
              game.playerNames[playerIndex] = packet.readCp1252String(-1);
            }
            return;
          }
          game.playerNames = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_40_0 = failure;
          stackIn_40_1 = new StringBuilder().append("eb.D(");
          if (game == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (packet == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(obfuscationGuard).append(',').append(includePlayerCount).append(')').toString());
        }
    }

    EmailLoginCredentials(String email, String password) {
        try {
          this.password = password;
          this.email = email;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eb.<init>(" + (email != null ? "{...}" : "null") + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    final void writeCredentials(int obfuscationGuard, PacketBuffer packet) {
        try {
          packet.writePrefixedCp1252String(obfuscationGuard, this.email);
          packet.writeBase38Name(false, this.password);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eb.B(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        fireworkBaseColors = new int[]{16777215, 56780, 7536682, 3359829, 12232538, 10081269};
        field_m = "Nice!";
        fireworkColorRamps = new int[fireworkBaseColors.length][256];
        for (var0 = 0; var0 < fireworkBaseColors.length; var0++) {
          var1 = 16711935 & fireworkBaseColors[var0];
          var2 = (fireworkBaseColors[var0] & 65280) >> 8;
          for (var3 = 0; var3 < 256; var3++) {
            var4 = Math.exp((-128.0 + (double)var3) / 32.0);
            var4 = 255.0 * var4 / (var4 + 1.0);
            var6 = (int)Math.rint(var4);
            if (var6 > 255) {
              var6 = 255;
            }
            if (var6 < 0) {
              var6 = 0;
            }
            fireworkColorRamps[var0][var3] = IntrusiveHashIterator.a(var6 * var2, 65280) + IntrusiveHashIterator.a(var1 * var6 >> 8, 16711934) + 1;
          }
        }
    }
}
