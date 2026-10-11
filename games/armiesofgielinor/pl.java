/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends SpellAreaEffect {
    static boolean field_A;
    static String field_t;
    static RgbSprite[] field_x;
    static String field_z;
    private Unit field_u;
    static String[] field_y;
    static String field_C;
    static int[] field_s;
    static RgbSprite[] field_D;
    static String field_v;
    private int field_w;

    public static void a(boolean param0) {
        field_y = null;
        field_s = null;
        field_v = null;
        field_x = null;
        field_C = null;
        field_t = null;
        field_D = null;
        field_z = null;
        if (!param0) {
          pl.a(-31, -19, 87, -24, -42);
        }
    }

    final void applyEffect(int obfuscationGuard, Battlefield battlefield) {
        RuntimeException var3 = null;
        Battlefield var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u.unitType == 39) {
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeathEvent(this.field_u)));
          }
          if (obfuscationGuard != 64) {
            var4 = (Battlefield) null;
            this.applyEffect(10, (Battlefield) null);
          }
          if (34 != this.field_u.unitType &&
            this.field_u.unitType != 7 &&
            17 != this.field_u.unitType) {
            return;
          }
          battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeployEvent(this.field_u.tileX, this.field_u.tileY, this.field_w)));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("pl.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static wj a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        wj var5 = (wj) (BattleCharacter.field_c.first((byte) 114));
        while (var5 != null) {
          if (param1 == var5.field_r) {
            return var5;
          }
          var5 = (wj) (BattleCharacter.field_c.next((byte) 123));
        }
        var5 = new wj();
        var5.field_p = param4;
        var5.field_k = param3;
        var5.field_r = param1;
        BattleCharacter.field_c.addLast((byte) -119, (IntrusiveNode) (var5));
        gn.a(param2, var5, 0);
        if (param0 == 34) {
          return var5;
        }
        field_s = (int[]) null;
        return var5;
    }

    pl(int param0, Unit param1, int param2) {
        try {
          this.field_u = param1;
          this.field_w = param2;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "pl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_t = "Email: ";
        field_y = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_z = "Show tutorial";
        field_s = new int[]{316};
        field_C = "Defeat all enemy units to win this battle.";
        field_v = "Return to lobby";
    }
}
