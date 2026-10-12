/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends IntrusiveNode {
    static je field_p;
    static String field_m;
    static int field_n;
    static int field_l;
    int field_o;
    IntrusiveNode field_k;
    aa field_q;

    final static void a(int param0, long param1, byte param2) {
        int var5 = 0;
        CipherPacketBuffer var4 = vl.outgoingPacket;
        int var5Lifetime1;
        if (param2 >= 88) {
          var4.writeCipheredOpcode(32161, param0);
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte(1, 7);
          var4.a(param1, 38359632);
          var4.writeByteLengthPrefix(-var5 + var4.position, 5930);
          return;
        }
        te.b(-87, -88);
        var4.writeCipheredOpcode(32161, param0);
        var4.position = var4.position + 1;
        var5Lifetime1 = var4.position;
        var4.writeByte(1, 7);
        var4.a(param1, 38359632);
        var4.writeByteLengthPrefix(-var5Lifetime1 + var4.position, 5930);
    }

    final static String b(int param0, int param1) {
        GameplayController var2;
        int var3;
        GameplayController var5;
        GameplayController var6;
        GameplayController var7;
        GameplayController var8;
        int var3Lifetime1;
        if (param0 == 128) {
          var8 = rd.field_j;
          var7 = var8;
          if (var7 == null) {
            return "No game in progress.";
          }
          var3 = var7.field_h;
          if (0 <= var3 &&
            var3 < var7.battlefield.tiles.length) {
            if (-1 <= param1 &&
              var7.battlefield.playerCount > param1) {
              var8.battlefield.tiles[var3].ownerPlayer = param1;
              return "Done.";
            }
            return "Invalid owner; use -1 to " + var7.battlefield.playerCount;
          }
          return "Please select a tile before using this.";
        }
        field_l = 113;
        var6 = rd.field_j;
        var5 = var6;
        var2 = var5;
        if (var5 == null) {
          return "No game in progress.";
        }
        var3Lifetime1 = var5.field_h;
        if (0 > var3Lifetime1) {
          return "Please select a tile before using this.";
        }
        if (var3Lifetime1 >= var5.battlefield.tiles.length) {
          return "Please select a tile before using this.";
        }
        if (-1 > param1) {
          return "Invalid owner; use -1 to " + var5.battlefield.playerCount;
        }
        if (var5.battlefield.playerCount <= param1) {
          return "Invalid owner; use -1 to " + var5.battlefield.playerCount;
        }
        var6.battlefield.tiles[var3Lifetime1].ownerPlayer = param1;
        return "Done.";
    }

    public static void a(byte param0) {
        field_m = null;
        field_p = null;
        if (param0 >= -33) {
          bj var2 = (bj) null;
          te.a(54, (bj) null, -6);
        }
    }

    final static void a(int param0, bj param1, int param2) {
        CipherPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = vl.outgoingPacket;
          var3.writeCipheredOpcode(32161, param0);
          var3.writeByte(1, param1.field_n);
          var3.writeShort(true, param1.field_m);
          if (param2 == -17006) {
            return;
          }
          te.a(102, 77L, (byte) -50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("te.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    te(aa param0, IntrusiveNode param1) {
        try {
          this.field_q = param0;
          this.field_o = param0.l();
          this.field_k = param1;
          this.field_q.i(128 + ResourceProtocolClient.field_e * this.field_o >> 8);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 256;
        field_m = "To server list";
        field_l = 640;
    }
}
