/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CRoundResultPacket implements GamePacket {
    private int winner;
    static String field_f;
    private int field_j;
    private int[] totals;
    static String field_c;
    private int playerCount;
    private int[][] field_i;
    private int[] field_a;
    static String field_e;
    private int[] field_h;

    public static void releaseStatics(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 != 10) {
          field_c = (String) null;
        }
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitWrite(param0 - 192);
          param1.writeBits((byte) 115, this.playerCount, 3);
          for (var3_int = 0; this.playerCount > var3_int; var3_int++) {
            for (var4 = 0; var4 < 3; var4++) {
              param1.writeBits((byte) -128, this.field_i[var3_int][var4], 8);
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < this.playerCount; var3_intLifetime1++) {
            param1.writeBits((byte) -127, this.totals[var3_intLifetime1], 10);
          }
          if (param0 != 200) {
            field_f = (String) null;
          }
          for (var3_intLifetime2 = 0; this.playerCount > var3_intLifetime2; var3_intLifetime2++) {
            param1.writeBits((byte) 69, this.field_a[var3_intLifetime2] + 1, 4);
            param1.writeBits((byte) -128, this.field_h[var3_intLifetime2], 10);
          }
          param1.writeBits((byte) 55, this.winner + 1, 3);
          param1.writeBits((byte) -125, 1 + this.field_j, 16);
          param1.endBitWrite(param0 ^ -1826190742);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("cf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CRoundResultPacket:";
        var1 = var1 + " winner:" + this.winner;
        var1 = var1 + " totals:";
        for (var2 = 0; this.playerCount > var2; var2++) {
          var1 = var1 + this.totals[var2] + " ";
        }
        return var1;
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        BitPacketBuffer var6 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param0.beginBitAccess((byte) -71);
          this.playerCount = param0.readBits((byte) 44, 3);
          this.field_i = new int[this.playerCount][3];
          for (var3_int = 0; this.playerCount > var3_int; var3_int++) {
            for (var4 = 0; var4 < 3; var4++) {
              this.field_i[var3_int][var4] = param0.readBits((byte) 44, 8);
            }
          }
          if (param1 != -19) {
            var6 = (BitPacketBuffer) null;
            this.encode(41, (BitPacketBuffer) null);
          }
          this.totals = new int[this.playerCount];
          for (var3_intLifetime1 = 0; this.playerCount > var3_intLifetime1; var3_intLifetime1++) {
            this.totals[var3_intLifetime1] = param0.readBits((byte) 44, 10);
          }
          this.field_a = new int[this.playerCount];
          this.field_h = new int[this.playerCount];
          for (var3_intLifetime2 = 0; var3_intLifetime2 < this.playerCount; var3_intLifetime2++) {
            this.field_a[var3_intLifetime2] = -1 + param0.readBits((byte) 44, 4);
            this.field_h[var3_intLifetime2] = param0.readBits((byte) 44, 10);
          }
          this.winner = param0.readBits((byte) 44, 3) - 1;
          this.field_j = -1 + param0.readBits((byte) 44, 16);
          param0.endBitAccess((byte) 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("cf.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 > -100) {
          field_c = (String) null;
        }
        MatchState.field_w = param0;
        if (null != fq.field_e) {
          fq.field_e.a(param0, -83);
        }
        if (null != tva.field_d) {
          tva.field_d.a((byte) 91, param0);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -16390) {
            S2CRoundResultPacket.releaseStatics(-31);
          }
          var4_int = -param2 + param3;
          if (var4_int > 0) {
            while (var4_int < -param0 / 2) {
              var4_int = var4_int + param0;
            }
            while (var4_int > param0 / 2) {
              var4_int = var4_int - param0;
            }
          }
          stackIn_10_0 = var4_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "cf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(qh param0, int param1) {
        MatchState var8 = null;
        int var4 = 0;
        Player var5 = null;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = param0.field_k;
          for (var4 = param1; var8.players.length > var4; var4++) {
            var5 = var8.players[var4];
            for (var6 = 0; 3 > var6; var6++) {
              var5.a(true, var6, this.field_i[var4][var6]);
            }
            var5.a((byte) 126, this.totals[var4]);
            var5.b(18202625, this.field_a[var4]);
            var5.f(this.field_h[var4], -25915);
          }
          param0.field_k.field_E = this.field_j;
          param0.a((byte) 101, this.field_i, this.winner);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    S2CRoundResultPacket(int param0) {
        this.playerCount = param0;
        this.field_a = new int[this.playerCount];
        this.field_h = new int[this.playerCount];
        this.field_i = new int[this.playerCount][3];
        this.totals = new int[this.playerCount];
    }

    static {
        field_f = "<%0> has joined your game.";
        field_c = "You can ask to join this game";
    }
}
