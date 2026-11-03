/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BagpipeSpecial extends SpecialOrder {
    static PlatformTask field_p;
    static String field_q;

    final static IndexedSprite a(vr param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            var6 = (String) null;
            BagpipeSpecial.a((vr) null, -47, (String) null, (String) null);
          }
          var4_int = param0.a(param2, false);
          var5 = param0.a((byte) 6, var4_int, param3);
          stackIn_3_0 = aj.a(var5, var4_int, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ch.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        CreatureEvent stackIn_3_0 = null;
        BagpipeEvent stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BagpipeEvent var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        BoardTile var14 = null;
        BattleCreature var15 = null;
        DamageEffect var16 = null;
        int var17 = 0;
        BattleCreature var18 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          var18 = this.creature.a(49, param0);
          var4 = new BagpipeEvent(this.moveId, new CreatureRef(var18));
          this.field_k = var18.tileX;
          this.field_n = var18.tileY;
          var22 = var4.d(9);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> 1;
          var9 = -1 + var7 >> 1;
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          for (var10 = 0; var6 > var10; var10++) {
            for (var11 = 0; var11 < var7; var11++) {
              if (var22[var10][var11] == 1) {
                var12 = this.field_k + var10 - var8;
                var13 = var11 - var9 + this.field_n;
                if (var12 >= 0 &&
                  var12 < param0.width &&
                  0 <= var13 &&
                  param0.height > var13) {
                  var14 = param0.tiles[var12][var13];
                  var15 = var14.occupant;
                  if (var15 != null) {
                    var16 = new DamageEffect(new CreatureRef(var15), false, 1, 0, 40);
                    var4.effects.a(var16, true);
                  }
                }
              }
            }
          }
          stackIn_29_0 = var4;
          return (CreatureEvent) ((Object) stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ch.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        String var2 = TextInputWidget.field_E[param1][14];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        if (param0 != 91) {
          return -119;
        }
        if (var2.equals("")) {
          return -1;
        }
        return ((ji) (i.field_h.a(true, (long)var2.hashCode()))).field_h;
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 14) {
          BagpipeSpecial.b(56);
        }
    }

    final static boolean b(int param0) {
        if (param0 <= 63) {
          field_q = (String) null;
        }
        return gfa.field_i;
    }

    final static rj a(boolean param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (PacketBuffer) null;
            BagpipeSpecial.a(false, (PacketBuffer) null);
          }
          stackIn_3_0 = new rj(param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.readSignedShort((byte) -85), param1.a(3), param1.readUnsignedByte(16711935));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ch.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    BagpipeSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    static {
        field_q = "Previous";
    }
}
