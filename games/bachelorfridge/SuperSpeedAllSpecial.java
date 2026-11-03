/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SuperSpeedAllSpecial extends SpecialOrder {
    static String field_p;

    final static hba a(PacketBuffer param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hba stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 116 % ((param2 - 31) / 60);
          stackIn_1_0 = new hba(param1, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("nh.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, jc param1) {
        try {
          param1.field_o = new char[]{(char)63};
          if (param0 != 0) {
            PacketBuffer var3 = (PacketBuffer) null;
            SuperSpeedAllSpecial.a((PacketBuffer) null, 9, (byte) 2);
          }
          param1.field_q = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 98) {
          return;
        }
        field_p = null;
    }

    final static void b(int param0) {
        nla.field_f = false;
        int var1 = 50 % ((param0 + 71) / 47);
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        int var6 = 0;
        RuntimeException var3 = null;
        SuperSpeedAllEvent var4 = null;
        int var5 = 0;
        BattleCreature var7 = null;
        int var8 = 0;
        BattleCreature var9 = null;
        SuperSpeedAllEvent stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.creature.a(25, param0);
          var4 = new SuperSpeedAllEvent(this.moveId, new CreatureRef(var9));
          var5 = 0;
          if (param1 != 3) {
            SuperSpeedAllSpecial.releaseStatics((byte) 56);
          }
          while (var5 < param0.width) {
            for (var6 = 0; var6 < param0.height; var6++) {
              if (null != param0.tiles[var5][var6].occupant) {
                var7 = param0.tiles[var5][var6].occupant;
                var4.effects.a(new DamageEffect(new CreatureRef(var7), false, 1, 0, 17), true);
              }
            }
            var5++;
          }
          stackIn_12_0 = var4;
          return (CreatureEvent) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    SuperSpeedAllSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
