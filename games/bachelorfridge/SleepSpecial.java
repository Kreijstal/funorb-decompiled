/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SleepSpecial extends SpecialOrder {
    static Sprite field_p;

    final CreatureEvent createEvent(BattleState param0, int param1) {
        CreatureEvent stackIn_3_0 = null;
        SleepEvent stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        SleepEvent var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        BattleCreature var9 = null;
        int var10 = 0;
        BattleCreature var11 = null;
        var10 = BachelorFridge.field_y;
        try {
          var11 = this.creature.a(68, param0);
          var4 = new SleepEvent(this.moveId, new CreatureRef(var11));
          var4.field_q = this.field_i;
          var4.a(this.field_i, (byte) 106, var11, param0);
          var5 = var11.tileX;
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          var6 = var11.tileY;
          var7 = var5;
          var8 = var6;
          if (this.field_i == 2) {
            var7--;
          } else {
            if (4 == this.field_i) {
              var7++;
            } else {
              if (1 != this.field_i) {
                if (3 == this.field_i) {
                  var8++;
                }
              } else {
                var8--;
              }
            }
          }
          var9 = param0.tiles[var7][var8].occupant;
          if (var9 != null &&
            !var9.isDown(107)) {
            var4.effects.a(new DamageEffect(new CreatureRef(var9), false, 1, 0, 29), true);
          }
          stackIn_18_0 = var4;
          return (CreatureEvent) ((Object) stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("sw.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    SleepSpecial(int param0, BattleCreature param1, int param2) {
        super(param0, param1);
        try {
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "sw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 != 4) {
            field_p = (Sprite) null;
          }
          var4_int = param0.length();
          param0.setLength(param2);
          for (var5 = var4_int; var5 < param2; var5++) {
            param0.setCharAt(var5, param3);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("sw.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_p = (Sprite) null;
        }
        field_p = null;
    }

    static {
    }
}
