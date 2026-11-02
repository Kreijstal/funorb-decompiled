/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HailSpecial extends SpecialOrder {
    static String field_q;
    static qha field_t;
    static int field_s;
    static String field_p;
    static String[] field_r;

    public static void c(byte param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        if (param0 > -65) {
          int[] var2 = (int[]) null;
          HailSpecial.a((int[]) null, -88, -52);
        }
        field_r = null;
    }

    final CreatureEvent a(BattleState param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        CreatureEvent stackIn_18_0 = null;
        HailEvent stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        HailEvent var4 = null;
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
          var18 = this.creature.a(59, param0);
          var4 = new HailEvent(this.moveId, new CreatureRef(var18));
          var4.field_q = this.field_k;
          var4.field_t = this.field_n;
          var22 = var4.d(1);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> 1;
          var9 = -1 + var7 >> 1;
          for (var10 = 0; var6 > var10; var10++) {
            for (var11 = 0; var11 < var7; var11++) {
              if (1 == var22[var10][var11]) {
                var12 = var10 - (var8 - this.field_k);
                var13 = this.field_n - var9 + var11;
                if (param0.a(var12, var13, (byte) -48)) {
                  var14 = param0.tiles[var12][var13];
                  var15 = var14.occupant;
                  if (var15 != null) {
                    var16 = new DamageEffect(new CreatureRef(var15), false, 1, 75, 0);
                    var4.effects.a(var16, true);
                  }
                }
              }
            }
          }
          if (param1 == 3) {
            stackIn_20_0 = var4;
            return (CreatureEvent) ((Object) stackIn_20_0);
          }
          stackIn_18_0 = (CreatureEvent) null;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ql.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
          uma.field_P[param1] = new kga(param1, param0);
          if (param2 != 0) {
            int[] var4 = (int[]) null;
            HailSpecial.a((int[]) null, 60, -103);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ql.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    HailSpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ql.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_p = "<%0> wants to join";
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_q = "Offensive account name";
    }
}
