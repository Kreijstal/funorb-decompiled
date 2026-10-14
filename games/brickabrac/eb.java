/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ff {
    private String field_o;
    static int[] field_q;
    static String field_m;
    private String field_k;
    static int[][] field_r;
    static String[][] field_p;
    static int field_n;
    static boolean field_l;

    public static void a(boolean param0) {
        field_r = (int[][]) null;
        if (param0) {
          PacketBuffer var2 = (PacketBuffer) null;
          eb.decodeLobbyGame((LobbyGame) null, (PacketBuffer) null, -20, false);
        }
        field_m = null;
        field_p = (String[][]) null;
        field_q = null;
    }

    final cd a(int param0) {
        if (param0 != 13) {
          return (cd) null;
        }
        return RadialSelectorWidget.field_X;
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

    eb(String param0, String param1) {
        try {
          this.field_o = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, PacketBuffer param1) {
        try {
          param1.writePrefixedCp1252String(param0, this.field_k);
          param1.writeBase38Name(false, this.field_o);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        field_q = new int[]{16777215, 56780, 7536682, 3359829, 12232538, 10081269};
        field_m = "Nice!";
        field_r = new int[field_q.length][256];
        for (var0 = 0; var0 < field_q.length; var0++) {
          var1 = 16711935 & field_q[var0];
          var2 = (field_q[var0] & 65280) >> 8;
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
            field_r[var0][var3] = IntrusiveHashIterator.a(var6 * var2, 65280) + IntrusiveHashIterator.a(var1 * var6 >> 8, 16711934) + 1;
          }
        }
    }
}
