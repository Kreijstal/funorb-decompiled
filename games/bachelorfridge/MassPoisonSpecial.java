/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MassPoisonSpecial extends SpecialOrder {
    static String field_t;
    static String field_p;
    static String field_r;
    static int[] field_q;
    static Sprite field_s;

    MassPoisonSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_9_0 = false;
        if (!param0) {
          MassPoisonSpecial.b(-30);
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (45 == param1);
        return stackIn_9_0;
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        MassPoisonEvent var4 = null;
        int var8 = 0;
        BattleCreature var9 = null;
        CreatureEvent stackIn_3_0 = null;
        MassPoisonEvent stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BattleCreature var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.creature.a(39, param0);
          var4 = new MassPoisonEvent(this.moveId, new CreatureRef(var9));
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          for (var5 = 0; param0.width > var5; var5++) {
            for (var6 = 0; var6 < param0.height; var6++) {
              if (null != param0.tiles[var5][var6].occupant) {
                var7 = param0.tiles[var5][var6].occupant;
                var4.effects.a(new DamageEffect(new CreatureRef(var7), false, 1, 0, 1), true);
              }
            }
          }
          stackIn_15_0 = var4;
          return (CreatureEvent) ((Object) stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("mp.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        long stackIn_25_0 = 0L;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              90 >= var6) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          if (param1) {
            stackIn_25_0 = var2_long;
            return stackIn_25_0;
          }
          stackIn_23_0 = 97L;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("mp.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 95) {
          field_q = (int[]) null;
        }
        field_p = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_t = null;
    }

    static {
        field_r = "Password: ";
        field_t = "Options Menu";
        field_q = new int[]{100, 40, 20};
    }
}
