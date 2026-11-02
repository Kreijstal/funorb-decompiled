/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SlowAllSpecial extends SpecialOrder {
    final static Sprite a(Sprite param0, int[] param1, boolean param2, int param3, int param4, int param5) {
        int var14 = 0;
        int var18 = 0;
        int var19 = 0;
        Sprite stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        Sprite var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var28 = null;
        int var12Lifetime1;
        int var13Lifetime1;
        var20 = BachelorFridge.field_y;
        try {
          var22 = new Sprite(param0.field_q + (param5 + param5), param5 + param0.field_p + param5);
          var22.field_t = -param5 + param0.field_t;
          var22.field_o = param5 + param0.field_o + param5;
          var22.field_u = param0.field_u - param5;
          var7 = 107 / ((param4 - 43) / 36);
          var22.field_n = param5 + (param0.field_n + param5);
          var26 = var22.field_v;
          var24 = var26;
          var8 = var24;
          var28 = param0.field_v;
          var10 = param5 * param5;
          var11 = (param5 << 1) + var10 + 1 << 1;
          for (var12 = -param5; var12 <= param5; var12++) {
            var11 = var11 + (-1 + var12 * 2);
            var13 = var11;
            for (var14 = -param5; var14 <= param5; var14++) {
              var13 = var13 + (-1 + var14 * 2);
              if (var10 >= var13) {
                var15 = (-var13 + var10) * param3 / var10;
                if (param2 &&
                  var14 == 0 &&
                  var12 == 0) {
                  var15 = 2147483647;
                }
                var16 = 0;
                var17 = var14 - (-param5 - (param5 + var12) * var22.field_q);
                for (var18 = 0; var18 < param0.field_p; var18++) {
                  for (var19 = 0; var19 < param0.field_q; var19++) {
                    if (var28[var16] != 0 &&
                      var26[var17] < var15) {
                      var26[var17] = var15;
                    }
                    var16++;
                    var17++;
                  }
                  var17 = var17 + (param5 << 1);
                }
              }
            }
          }
          var21 = 0;
          var12Lifetime1 = var21;
          while (var26.length > var21) {
            var13Lifetime1 = var26[var21];
            if (var13Lifetime1 != 2147483647) {
              if (0 != var13Lifetime1) {
                var8[var21] = param1[var13Lifetime1];
              }
            } else {
              var26[var21] = 0;
            }
            var21++;
          }
          stackIn_34_0 = var22;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_37_0 = var6;
          stackIn_37_1 = new StringBuilder().append("of.B(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var6 = 0;
        SlowAllEvent var4 = null;
        int var5 = 0;
        int var8 = 0;
        BattleCreature var9 = null;
        CreatureEvent stackIn_3_0 = null;
        BattleState stackIn_6_0 = null;
        SlowAllEvent stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BattleCreature var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.creature.a(19, param0);
          var4 = new SlowAllEvent(this.moveId, new CreatureRef(var9));
          var5 = 0;
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          stackIn_6_0 = (BattleState) (param0);
          while (stackIn_6_0.width > var5) {
            for (var6 = 0; var6 < param0.height; var6++) {
              if (param0.tiles[var5][var6].occupant != null) {
                var7 = param0.tiles[var5][var6].occupant;
                var4.effects.a(new DamageEffect(new CreatureRef(var7), false, 1, 0, 5), true);
              }
            }
            var5++;
            stackIn_6_0 = (BattleState) (param0);
          }
          stackIn_16_0 = var4;
          return (CreatureEvent) ((Object) stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("of.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        AttackUpAllAnimation.d(18);
        if (param0 < 79) {
          int[] var2 = (int[]) null;
          SlowAllSpecial.a((Sprite) null, (int[]) null, false, -80, -115, 44);
        }
    }

    SlowAllSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    static {
    }
}
