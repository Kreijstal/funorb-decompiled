/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MassPoisonAnimation extends EventAnimation {
    private MassPoisonEvent field_v;
    static String field_w;

    public static void releaseStatics(int param0) {
        int var1 = 100 / ((param0 - 59) / 61);
        field_w = null;
    }

    private final void e(int param0) {
        BattleCreature var7 = null;
        CreatureActor var8 = null;
        CreatureActor var10 = null;
        DamageEffect var3_ref = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        DamageEffect var3_refLifetime1;
        if (param0 != 1) {
          this.isFinished((byte) -34);
          var7 = this.field_v.creature.a(98, this.screen.field_h);
          if (!var7.isDown(-123)) {
            var3_ref = (DamageEffect) (this.field_v.effects.b((byte) 90));
            al.a(param0 + 106, this.field_v.moveId);
            while (var3_ref != null) {
              var3_ref.apply(var7, this.screen.field_h, 12);
              var8 = var3_ref.target.a(param0 - 27450, this.screen);
              var8.b(-1, 6);
              var8.a(24831, param0 ^ 98, kna.field_g[1]);
              var3_ref = (DamageEffect) (this.field_v.effects.c(param0 ^ 1));
            }
            return;
          }
          return;
        }
        BattleCreature var9 = this.field_v.creature.a(98, this.screen.field_h);
        if (!var9.isDown(-123)) {
          var3_refLifetime1 = (DamageEffect) (this.field_v.effects.b((byte) 90));
          al.a(param0 + 106, this.field_v.moveId);
          while (var3_refLifetime1 != null) {
            var3_refLifetime1.apply(var9, this.screen.field_h, 12);
            var10 = var3_refLifetime1.target.a(param0 - 27450, this.screen);
            var10.b(-1, 6);
            var10.a(24831, param0 ^ 98, kna.field_g[1]);
            var3_refLifetime1 = (DamageEffect) (this.field_v.effects.c(param0 ^ 1));
          }
          return;
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          this.f(11642);
          int var2 = -109 % ((param0 - 71) / 47);
          return true;
        }
        if (this.field_l != 25) {
          return false;
        }
        jja.a(256, -1, 35);
        this.e(1);
        return false;
    }

    private final void f(int param0) {
        if (param0 != 11642) {
          this.isFinished((byte) 8);
        }
    }

    MassPoisonAnimation(BattleScreen param0, MassPoisonEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Match by...";
    }
}
