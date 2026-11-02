/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShuffleSpecial extends SpecialOrder {
    static int field_p;
    static Sprite field_r;
    static String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 != -91) {
          field_r = (Sprite) null;
        }
        field_q = null;
    }

    ShuffleSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var7_int = 0;
        ShuffleEvent stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ShuffleEvent var4 = null;
        int[][] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int var8_int = 0;
        IsaacRandom var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        BattleCreature var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          var15 = this.creature.a(40, param0);
          var4 = new ShuffleEvent(this.moveId, new CreatureRef(var15));
          var18 = new int[param0.g((byte) 79)][2];
          var16 = var18;
          var5 = var16;
          var6 = 0;
          for (var7_int = 0; param0.playerCount > var7_int; var7_int++) {
            for (var8_int = 0; 7 > var8_int; var8_int++) {
              if (this.a(param0.rosters[var7_int].field_b[var8_int], -8, param0)) {
                var5[var6] = new int[]{param0.rosters[var7_int].field_b[var8_int].tileX, param0.rosters[var7_int].field_b[var8_int].tileY};
                var6++;
              }
            }
          }
          var19 = new int[var18.length];
          var17 = var19;
          var7 = var17;
          var13 = 0;
          var8_int = var13;
          while (var13 < var19.length) {
            var19[var13] = var13;
            var13++;
          }
          var8 = new IsaacRandom(new int[]{(int)f.b((byte) 73)});
          var6Lifetime1 = 0;
          for (var9 = 0; var19.length > var9; var9++) {
            var10 = var8.nextBounded(-21000, var19.length);
            var11 = var19[var10];
            var7[var10] = var19[var9];
            var19[var9] = var11;
          }
          var9Lifetime1 = 0;
          if (param1 != 3) {
            field_p = 40;
          }
          while (param0.playerCount > var9Lifetime1) {
            var14 = 0;
            var10Lifetime1 = var14;
            while (var14 < 7) {
              if (this.a(param0.rosters[var9Lifetime1].field_b[var14], -8, param0)) {
                var4.effects.a(new PlaceCreatureEffect(new CreatureRef(param0.rosters[var9Lifetime1].field_b[var14]), var5[var19[var6Lifetime1]][0], var5[var19[var6Lifetime1]][1]), true);
                var6Lifetime1++;
              }
              var14++;
            }
            var9Lifetime1++;
          }
          stackIn_26_0 = var4;
          return (CreatureEvent) ((Object) stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("fb.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(BattleCreature param0, int param1, BattleState param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return false;
          }
          if (param0.isDown(param1 + 116)) {
            return false;
          }
          if (param0.a(32, (byte) 60)) {
            return false;
          }
          if (param1 != -8) {
            return false;
          }
          if (param2.b(false, param2.tiles[param0.tileX][param0.tileY].terrain) == -1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("fb.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_q = "***No Target!***";
    }
}
