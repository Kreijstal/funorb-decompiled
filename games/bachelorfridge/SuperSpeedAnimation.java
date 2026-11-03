/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SuperSpeedAnimation extends EventAnimation {
    private SuperSpeedEvent field_w;
    static String field_x;
    static int field_v;

    private final void b(boolean param0) {
        BattleCreature var2;
        DamageEffect var3;
        int var5;
        CreatureActor var6;
        CreatureActor var7;
        var5 = BachelorFridge.field_y;
        var2 = this.field_w.creature.a(62, this.screen.field_h);
        if (var2.isDown(-114)) {
          return;
        }
        var3 = (DamageEffect) (this.field_w.effects.b((byte) 90));
        al.a(-84, this.field_w.moveId);
        if (!param0) {
          while (var3 != null) {
            var3.apply(var2, this.screen.field_h, 12);
            var6 = var3.target.a(-27449, this.screen);
            var6.b(-1, 7);
            var6.a(24831, 98, kna.field_g[28]);
            var3 = (DamageEffect) (this.field_w.effects.c(0));
          }
        } else {
          this.isFinished((byte) -57);
          while (var3 != null) {
            var3.apply(var2, this.screen.field_h, 12);
            var7 = var3.target.a(-27449, this.screen);
            var7.b(-1, 7);
            var7.a(24831, 98, kna.field_g[28]);
            var3 = (DamageEffect) (this.field_w.effects.c(0));
          }
        }
    }

    SuperSpeedAnimation(BattleScreen param0, SuperSpeedEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "maa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_x = null;
        if (param0 >= 17) {
          return;
        }
        SuperSpeedAnimation.e((byte) 8);
    }

    private final void d(int param0) {
        if (param0 == 15642) {
          return;
        }
        this.field_w = (SuperSpeedEvent) null;
    }

    final boolean isFinished(byte param0) {
        int var2 = -91 % ((param0 - 71) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (25 != this.field_l) {
            return false;
          }
          jja.a(256, -1, 3);
          this.b(false);
          return false;
        }
        this.d(15642);
        return true;
    }

    static {
        field_x = "Log in / Create account";
    }
}
