/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevitateAnimation extends EventAnimation {
    private LevitateEvent field_w;
    static String field_x;
    static Sprite[] field_v;

    public static void releaseStatics(int param0) {
        field_x = null;
        if (param0 != 32) {
          LevitateAnimation.releaseStatics(-106);
          field_v = null;
          return;
        }
        field_v = null;
    }

    private final void e(int param0) {
        DamageEffect var3;
        int var5;
        BattleCreature var6;
        CreatureActor var7;
        CreatureActor var8;
        var5 = BachelorFridge.field_y;
        var6 = this.field_w.creature.a(14, this.screen.field_h);
        if (var6.isDown(80)) {
          return;
        }
        var3 = (DamageEffect) (this.field_w.effects.b((byte) 90));
        al.a(-44, this.field_w.moveId);
        if (param0 == -23403) {
          while (var3 != null) {
            var3.apply(var6, this.screen.field_h, param0 ^ -23399);
            var7 = var3.target.a(param0 - 4046, this.screen);
            var7.b(param0 ^ 23402, 7);
            var7.a(24831, 9, kna.field_g[32]);
            var3 = (DamageEffect) (this.field_w.effects.c(0));
          }
        } else {
          LevitateAnimation.releaseStatics(-10);
          while (var3 != null) {
            var3.apply(var6, this.screen.field_h, param0 ^ -23399);
            var8 = var3.target.a(param0 - 4046, this.screen);
            var8.b(param0 ^ 23402, 7);
            var8.a(24831, 9, kna.field_g[32]);
            var3 = (DamageEffect) (this.field_w.effects.c(0));
          }
        }
    }

    private final void f(int param0) {
        if (param0 == 7) {
          return;
        }
        this.e(48);
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            jja.a(256, -1, 33);
            this.e(-23403);
            return false;
          }
          return false;
        }
        int var2 = -38 / ((param0 - 71) / 47);
        this.f(7);
        return true;
    }

    LevitateAnimation(BattleScreen param0, LevitateEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "FULL ACCESS";
    }
}
