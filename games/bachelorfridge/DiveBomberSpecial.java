/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiveBomberSpecial extends SpecialOrder {
    static String field_p;

    final CreatureEvent a(BattleState param0, int param1) {
        int var12 = 0;
        int var13 = 0;
        CreatureEvent stackIn_3_0 = null;
        DiveBomberEvent stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        DiveBomberEvent var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int var15 = 0;
        BoardTile var16 = null;
        BattleCreature var17 = null;
        int var18 = 0;
        BattleCreature var19 = null;
        int[][] var23 = null;
        var18 = BachelorFridge.field_y;
        try {
          var19 = this.creature.a(34, param0);
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          var4 = new DiveBomberEvent(this.moveId, new CreatureRef(var19));
          var5 = 17;
          var6 = 17;
          var7 = -1 + var5 >> 1;
          var8 = var6 - 1 >> 1;
          var23 = var4.d((byte) 27);
          var10 = var19.tileX;
          var11 = var19.tileY;
          for (var12 = 0; var5 > var12; var12++) {
            for (var13 = 0; var13 < var6; var13++) {
              if (var23[var12][var13] == 1) {
                var14 = var12 - (var7 - var10);
                var15 = var13 - var8 + var11;
                if (var14 >= 0 &&
                  var14 < param0.width &&
                  var15 >= 0 &&
                  var15 < param0.height) {
                  var16 = param0.tiles[var14][var15];
                  var17 = var16.occupant;
                  if (var17 != null) {
                    var4.effects.a(new DamageEffect(new CreatureRef(var17), false, 1, 40, 0), true);
                  }
                }
              }
            }
          }
          stackIn_20_0 = var4;
          return (CreatureEvent) ((Object) stackIn_20_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ifa.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_p = null;
        int var1 = 9 / ((param0 + 60) / 39);
    }

    final static vr a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        int var5 = 76 / ((param3 - 1) / 56);
        return qma.a(param2, 2097152, false, param4 ? 1 : 0, param1, param0);
    }

    DiveBomberSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    static {
        field_p = "Try again";
    }
}
