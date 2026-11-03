/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PetAttackSpecial extends SpecialOrder {
    final static void a(int param0, int param1, int param2, String param3, String param4, int param5) {
        BitPacketBuffer var9 = null;
        int var7 = 0;
        try {
          var9 = sja.field_fb;
          BitPacketBuffer var6 = var9;
          var9.writeCipheredByte(param5, (byte) 98);
          var9.position = var9.position + 1;
          if (param2 <= 39) {
            String var8 = (String) null;
            PetAttackSpecial.a(86, -49, 36, (String) null, (String) null, 123);
          }
          var7 = var9.position;
          var9.writeByte(param1, 0);
          if (param1 == 2) {
            var9.writeString((byte) -50, param4);
          }
          if (param3 == null) {
            var9.b(param0, -127);
          } else {
            nu.a(param3, var9, -21840);
          }
          var9.writeLengthByte((byte) -38, -var7 + var9.position);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "no.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    PetAttackSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        PetAttackEvent var4 = null;
        String var5 = null;
        PetAttackEvent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(31, param0);
          var4 = new PetAttackEvent(this.moveId, new CreatureRef(var3));
          var4.field_t = this.field_n;
          var4.field_u = this.field_k;
          if (param1 != 3) {
            var5 = (String) null;
            PetAttackSpecial.a(89, 77, 35, (String) null, (String) null, -3);
          }
          var4.effects.a(new dh(), true);
          stackIn_3_0 = var4;
          return (CreatureEvent) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("no.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
