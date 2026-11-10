/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CNewRoomPacket implements GamePacket {
    private int roomTicks;
    private int courseTicks;
    private int roomId;
    private int field_i;
    private boolean force;
    private int[] treasure;
    private int playerId;
    private int disregard;
    static String field_g;

    final void apply(MatchProtocol param0, int param1, MatchScreen param2) {
        Player var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!param2.isInPlayPhase(param1 ^ param1)) {
          return;
        }
        try {
          if (this.force ||
            !param0.a(this.playerId, 54) ||
            param2.matchState.a(false, this.playerId, this.roomId)) {
            this.a(param2.matchState, (byte) -98);
            var7 = param2.matchState.players[this.playerId];
            Player var4 = var7;
            for (var5 = 0; 3 > var5; var5++) {
              var7.setTreasure(true, var5, this.treasure[var5]);
            }
            if (param2.field_x == this.playerId) {
              param0.f(10);
            } else {
              param2.c(this.playerId, 51);
              param0.a(this.disregard, (byte) 125, this.playerId);
            }
          }
          param2.field_r = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bqa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitWrite(8);
          param1.writeBits((byte) 3, this.force ? 1 : 0, 1);
          param1.writeBits((byte) -125, this.playerId, 3);
          param1.writeBits((byte) -125, this.roomId, 5);
          param1.writeBits((byte) 113, this.courseTicks, 24);
          param1.writeBits((byte) -128, this.roomTicks, 24);
          param1.writeBits((byte) -126, this.disregard, 5);
          for (var3_int = 0; this.treasure.length > var3_int; var3_int++) {
            param1.writeBits((byte) -125, this.treasure[var3_int], 8);
          }
          if (param0 != 200) {
            this.roomTicks = -62;
          }
          param1.writeBits((byte) -126, 1 + this.field_i, 32);
          param1.endBitWrite(-1826190686);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bqa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "S2CNewRoomPacket (force:" + this.force + ", playerid:" + this.playerId + ", roomid:" + this.roomId + ", course ticks:" + this.courseTicks + ", room ticks:" + this.roomTicks + ", disregard:" + this.disregard + ", treasure: " + this.formatTreasure(1) + ")";
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.beginBitAccess((byte) 125);
        this.force = param0.readBits((byte) 44, 1) != 1 ? false : true;
        this.playerId = param0.readBits((byte) 44, 3);
        this.roomId = param0.readBits((byte) 44, 5);
        this.courseTicks = param0.readBits((byte) 44, 24);
        this.roomTicks = param0.readBits((byte) 44, 24);
        this.disregard = param0.readBits((byte) 44, 5);
        for (var3_int = 0; this.treasure.length > var3_int; var3_int++) {
          this.treasure[var3_int] = param0.readBits((byte) 44, 8);
        }
        if (param1 != -19) {
          return;
        }
        try {
          this.field_i = -1 + param0.readBits((byte) 44, 32);
          param0.endBitAccess((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bqa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 540800) {
          return false;
        }
        return 0 != (param1 & 540800) ? true : false;
    }

    private final void a(MatchState param0, byte param1) {
        if (param1 >= -75) {
          return;
        }
        try {
          param0.resyncPlayerToRoom(this.roomId, this.playerId, 1, this.courseTicks, this.roomTicks);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bqa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -48) {
          return;
        }
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        qja.a(true, param0, -127);
        if (param1 < 103) {
          field_g = (String) null;
        }
    }

    private final String formatTreasure(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        String var2 = String.valueOf(this.treasure[0]);
        for (var3 = param0; var3 < 3; var3++) {
          var2 = var2 + "," + this.treasure[var3];
        }
        return var2;
    }

    S2CNewRoomPacket() {
        this.field_i = -1;
        this.treasure = new int[3];
    }

    static {
        field_g = "2nd";
    }
}
