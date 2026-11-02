/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttackUpAllSpecial extends SpecialOrder {
    AttackUpAllSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final static hk[] c(byte param0) {
        if (param0 != -67) {
          return (hk[]) null;
        }
        return new hk[]{DiskCacheRequest.field_u, FlirtAnimation.field_x, ImageProducerRasterBuffer.field_k};
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var6 = 0;
        AttackUpAllEvent var4 = null;
        int var5 = 0;
        int var8 = 0;
        BattleCreature var9 = null;
        CreatureEvent stackIn_3_0 = null;
        BattleState stackIn_6_0 = null;
        AttackUpAllEvent stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BattleCreature var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.creature.a(32, param0);
          var4 = new AttackUpAllEvent(this.moveId, new CreatureRef(var9));
          var5 = 0;
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          stackIn_6_0 = (BattleState) (param0);
          while (stackIn_6_0.width > var5) {
            for (var6 = 0; var6 < param0.height; var6++) {
              if (null != param0.tiles[var5][var6].occupant) {
                var7 = param0.tiles[var5][var6].occupant;
                var4.effects.a(new DamageEffect(new CreatureRef(var7), false, 1, 0, 18), true);
              }
            }
            var5++;
            stackIn_6_0 = (BattleState) (param0);
          }
          stackIn_15_0 = var4;
          return (CreatureEvent) ((Object) stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("gh.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
