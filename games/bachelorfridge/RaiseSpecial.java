/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaiseSpecial extends SpecialOrder {
    static UiComponent field_q;
    static int field_p;
    static String field_r;

    final static void a(gb param0, boolean param1, int param2) {
        BitPacketBuffer var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = sja.field_fb;
          var3.writeCipheredByte(param2, (byte) 127);
          var3.writeByte(param0.field_g, 0);
          var3.b(param0.field_h, -127);
          if (!param1) {
            field_p = -86;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("io.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var8 = null;
        char[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var7 = 0;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (hm.a((byte) 110, param1)) {
            return true;
          }
          var9 = HailEvent.field_s;
          var8 = var9;
          var6 = var8;
          var2 = var6;
          for (var3 = 0; var9.length > var3; var3++) {
            var4 = var9[var3];
            if (~param1 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = ra.field_r;
          if (!param0) {
            RaiseSpecial.a(false, '5');
          }
          var7 = 0;
          var3Lifetime1 = var7;
          while (var7 < var2Lifetime1.length) {
            var4Lifetime1 = var2Lifetime1[var7];
            if (var4Lifetime1 == param1) {
              return true;
            }
            var7++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "io.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -114) {
          RaiseSpecial.a(false, 'Z');
        }
        field_q = null;
        field_r = null;
    }

    RaiseSpecial(int param0, BattleCreature param1, CreatureRef param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "io.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        RuntimeException var3 = null;
        BattleCreature var4 = null;
        RaiseEvent var5 = null;
        BattleCreature var6 = null;
        RaiseEvent stackIn_6_0 = null;
        ew stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            RaiseSpecial.releaseStatics(87);
          }
          var6 = this.creature.a(71, param0);
          var4 = this.field_j.a(67, param0);
          if (var4 != null &&
            null == param0.tiles[var4.tileX][var4.tileY].occupant &&
            var4.field_A) {
            var5 = new RaiseEvent(this.moveId, new CreatureRef(var6), this.field_j);
            var5.effects.a(new DamageEffect(new CreatureRef(var4), false, 1, -(var4.field_t >> 1), 0), true);
            var5.effects.a(new PlaceCreatureEffect(new CreatureRef(var4), var4.tileX, var4.tileY), true);
            stackIn_6_0 = var5;
            return (CreatureEvent) ((Object) stackIn_6_0);
          }
          stackIn_8_0 = new ew(new CreatureRef(var6));
          return (CreatureEvent) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("io.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "Advertising websites";
    }
}
