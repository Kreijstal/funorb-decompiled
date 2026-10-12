/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrianglePulse {
    static String field_a;
    private TickCounter counter;
    private int minimum;
    int maximum;
    static RgbSprite field_d;
    static String field_j;
    static nc field_i;
    static int field_c;
    static int[] statusProtectionMasks;
    private int value;
    static RgbSprite field_f;

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_j = null;
        field_f = null;
        statusProtectionMasks = null;
        if (param0 != 16) {
          return;
        }
        field_a = null;
    }

    final static void openDefaultQuickChatMenu(byte obfuscationGuard) {
        vs.showQuickChatMenu(256, AdaptiveMidiPcmStream.defaultQuickChatMenu);
        if (obfuscationGuard < 113) {
          field_d = (RgbSprite) null;
        }
    }

    final void advance(byte obfuscationGuard) {
        if (obfuscationGuard != -66) {
          return;
        }
        if (this.counter == null) {
          this.value = 127;
          return;
        }
        if (this.counter.advanceAndCheck(obfuscationGuard ^ 65)) {
          this.counter.reset(17);
        }
        int halfPhase = this.counter.elapsedTicks;
        int halfPeriod = this.counter.limit;
        halfPeriod = halfPeriod >> 1;
        int risingHalf = halfPhase <= halfPeriod ? 1 : 0;
        halfPhase = risingHalf != 0 ? halfPhase : -halfPeriod + halfPhase;
        int phaseStart = risingHalf == 0 ? this.maximum : this.minimum;
        int phaseEnd = risingHalf == 0 ? this.minimum : this.maximum;
        this.value = phaseStart + halfPhase * (-phaseStart + phaseEnd) / halfPeriod;
        if (this.value < this.minimum) {
          this.value = this.minimum;
        }
        if (this.maximum < this.value) {
          this.value = this.maximum;
        }
    }

    final static void selectMusicTrackWithDefaultGain(int obfuscationGuard, int fadeRate, MusicTrack track, boolean loop) {
        if (obfuscationGuard != -16147) {
          return;
        }
        try {
          lk.musicCrossfadeStream.selectTrack(256, !loop ? true : false, track, -1, fadeRate, 1000000);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hh.H(" + obfuscationGuard + ',' + fadeRate + ',' + (track != null ? "{...}" : "null") + ',' + loop + ')');
        }
    }

    private final void configure(int minimum, byte obfuscationGuard, int maximum, int period) {
        if (period < 0) {
          period = 100;
        }
        if (minimum < 0 ||
          minimum > 255) {
          minimum = 32;
        }
        this.counter = new TickCounter(period);
        if (obfuscationGuard < 117) {
          return;
        }
        this.minimum = minimum;
        if (maximum < 0 ||
          maximum > 255 ||
          maximum < minimum) {
          maximum = 224;
        }
        this.maximum = maximum;
        this.value = this.maximum + this.minimum >> 1;
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (0 == param2) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param2 == 1) {
            var10 = param0[param3];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = param1;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param3; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("hh.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void decodeLobbyRoom(LobbyRoom room, boolean includePlayerCount, PacketBuffer packet, int obfuscationGuard) {
        int playerIndex = 0;
        LobbyRoom stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        LobbyRoom stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        LobbyRoom stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        LobbyRoom stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        LobbyRoom stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        LobbyRoom stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int packedFlags = 0;
        RuntimeException var4 = null;
        int hasCompletedDuration = 0;
        int hasPlayerNames = 0;
        int namesStart = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (includePlayerCount) {
            room.playerCount = packet.readUnsignedByte(0);
          }
          room.playerCapacity = packet.readUnsignedByte(0);
          room.gameType = packet.readUnsignedByte(0);
          packedFlags = packet.readUnsignedByte(0);
          stackIn_5_0 = (LobbyRoom) (room);
          stackIn_6_1 = (0 != (128 & packedFlags));
          stackIn_5_0.openToJoin = stackIn_6_1;
          stackIn_8_0 = (LobbyRoom) (room);
          stackIn_9_1 = ((packedFlags & 64) != 0);
          stackIn_8_0.playing = stackIn_9_1;
          stackIn_11_0 = (LobbyRoom) (room);
          if ((16 & packedFlags) != 0) {
            stackIn_12_1 = 2;
          } else {
            stackIn_12_1 = 1;
          }
          stackIn_11_0.spectatorMode = stackIn_12_1;
          stackIn_15_0 = (LobbyRoom) (room);
          stackIn_16_1 = (room.openToJoin) && (room.playerCount < room.playerCapacity);
          stackIn_15_0.joinable = stackIn_16_1;
          stackIn_18_0 = (LobbyRoom) (room);
          stackIn_19_1 = (0 != (8 & packedFlags));
          stackIn_18_0.allowsAdmissionRequests = stackIn_19_1;
          stackIn_21_0 = (LobbyRoom) (room);
          stackIn_22_1 = ((32 & packedFlags) != 0);
          stackIn_21_0.rated = stackIn_22_1;
          stackIn_25_0 = (0 == (packedFlags & 4)) ? 0 : 1;
          hasCompletedDuration = stackIn_25_0;
          stackIn_28_0 = ((packedFlags & 2) == 0) ? 0 : 1;
          hasPlayerNames = stackIn_28_0;
          packet.readBytes(0, room.gameOptions.length, 0, room.gameOptions);
          room.displayRating = packet.readUnsignedShort((byte) -104);
          room.activityStartedMillis = vi.monotonicMillis(39) - (long)packet.readInt(1);
          if (hasCompletedDuration == 0) {
            room.completedDurationMillis = -1;
          } else {
            room.completedDurationMillis = packet.readInt(1);
          }
          room.ownerAccountId = packet.readLong((byte) -2);
          namesStart = packet.position;
          if (obfuscationGuard < 73) {
            return;
          }
          room.ownerName = packet.readNullTerminatedString(1);
          if (hasPlayerNames != 0) {
            room.playerNames = new String[room.playerCount];
            packet.position = namesStart;
            for (playerIndex = 0; playerIndex < room.playerCount; playerIndex++) {
              room.playerNames[playerIndex] = packet.readNullTerminatedString(1);
            }
            return;
          }
          room.playerNames = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("hh.E(");
          if (room == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(includePlayerCount).append(',');
          if (packet == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isRisingHalf(int obfuscationGuard) {
        if (obfuscationGuard > -121) {
          this.getValue(103);
        }
        return this.counter.elapsedTicks <= this.counter.limit >> 1 ? true : false;
    }

    final int getValue(int obfuscationGuard) {
        if (obfuscationGuard != -1953891327) {
          return 4;
        }
        if (this.value >= 0 &&
          this.value <= 255) {
          return this.value;
        }
        return 127;
    }

    TrianglePulse(int minimum, int maximum, int period) {
        this.configure(minimum, (byte) 127, maximum, period);
    }

    static {
        field_a = "You have 1 unread message!";
        field_j = "Confirm Email:";
        statusProtectionMasks = new int[]{0, 1, 2, 4, 8, 31, 16, 0, 0};
        field_c = 0;
    }
}
