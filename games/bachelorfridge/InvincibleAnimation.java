/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InvincibleAnimation extends EventAnimation {
    static String field_w;
    static int field_v;
    private InvincibleEvent field_x;

    private final void e(byte param0) {
        int var2 = 120 / ((param0 + 3) / 44);
    }

    final boolean isFinished(byte param0) {
        int var2 = 44 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (25 != this.field_l) {
            return false;
          }
          jja.a(256, -1, 31);
          this.d(15084);
          return false;
        }
        this.e((byte) -61);
        return true;
    }

    private final void d(int param0) {
        Object var3;
        DamageEffect var3_ref;
        int var5;
        BattleCreature var6;
        CreatureActor var7;
        BattleCreature var8;
        CreatureActor var9;
        DamageEffect var3_refLifetime1;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == 15084) {
          var8 = this.field_x.creature.a(79, this.screen.field_h);
          if (var8.isDown(-82)) {
            return;
          }
          var3_ref = (DamageEffect) (this.field_x.effects.b((byte) 90));
          al.a(param0 - 14993, this.field_x.moveId);
          while (var3_ref != null) {
            var3_ref.apply(var8, this.screen.field_h, 12);
            var9 = var3_ref.target.a(-27449, this.screen);
            var9.b(-1, 6);
            var9.a(24831, 101, kna.field_g[33]);
            var3_ref = (DamageEffect) (this.field_x.effects.c(0));
          }
          return;
        }
        InvincibleAnimation.g((byte) -55);
        var6 = this.field_x.creature.a(79, this.screen.field_h);
        if (var6.isDown(-82)) {
          return;
        }
        var3_refLifetime1 = (DamageEffect) (this.field_x.effects.b((byte) 90));
        al.a(param0 - 14993, this.field_x.moveId);
        while (var3_refLifetime1 != null) {
          var3_refLifetime1.apply(var6, this.screen.field_h, 12);
          var7 = var3_refLifetime1.target.a(-27449, this.screen);
          var7.b(-1, 6);
          var7.a(24831, 101, kna.field_g[33]);
          var3_refLifetime1 = (DamageEffect) (this.field_x.effects.c(0));
        }
        return;
    }

    final static boolean g(byte param0) {
        int var1 = -88 % ((0 - param0) / 39);
        if (NetworkGameClient.field_u != null) {
          return true;
        }
        if (em.d((byte) -104)) {
          return true;
        }
        if (wt.field_n != null) {
          return true;
        }
        if (!MoveInfoPanel.b(92)) {
          return false;
        }
        return true;
    }

    InvincibleAnimation(BattleScreen param0, InvincibleEvent param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_w = null;
        if (param0 != 39) {
          field_w = (String) null;
        }
    }

    static {
        field_v = 640;
    }
}
