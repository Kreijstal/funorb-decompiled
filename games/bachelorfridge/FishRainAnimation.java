/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FishRainAnimation extends EventAnimation {
    private boolean field_v;
    private ActorAnimation field_w;
    private FishRainEvent field_x;

    private final void e(int param0) {
        Object var3;
        EventEffect var3_ref;
        int var5;
        BattleCreature var6;
        CreatureActor var7;
        BattleCreature var8;
        CreatureActor var9;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 > 9) {
          var8 = this.field_x.creature.a(8, this.screen.field_h);
          if (var8.isDown(-79)) {
            return;
          }
          var3_ref = (EventEffect) (this.field_x.effects.b((byte) 90));
          while (var3_ref != null) {
            var9 = var3_ref.target.a(-27449, this.screen);
            var9.b(-1, 6);
            var3_ref.apply(var8, this.screen.field_h, 12);
            if (var3_ref instanceof DamageEffect) {
              this.addChild(27799, new ek(this.screen, var9, var3_ref.field_f));
            }
            var3_ref = (EventEffect) (this.field_x.effects.c(0));
          }
          return;
        }
        this.f(104);
        var6 = this.field_x.creature.a(8, this.screen.field_h);
        if (var6.isDown(-79)) {
          return;
        }
        var3_ref = (EventEffect) (this.field_x.effects.b((byte) 90));
        while (var3_ref != null) {
          var7 = var3_ref.target.a(-27449, this.screen);
          var7.b(-1, 6);
          var3_ref.apply(var6, this.screen.field_h, 12);
          if (var3_ref instanceof DamageEffect) {
            this.addChild(27799, new ek(this.screen, var7, var3_ref.field_f));
          }
          var3_ref = (EventEffect) (this.field_x.effects.c(0));
        }
        return;
    }

    final boolean isFinished(byte param0) {
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_w.isLinked((byte) -106)) {
          return false;
        }
        if (!this.field_v) {
          this.d(-1);
          this.field_v = true;
        }
        int var2 = 93 / ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          this.f(-1);
          return true;
        }
        return false;
    }

    FishRainAnimation(BattleScreen param0, FishRainEvent param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
          this.field_w = new ActorAnimation(this.screen, this.field_x.field_q, this.field_x.field_s);
          this.addChild(27799, this.field_w);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "qr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        int var3;
        int var4;
        int var5;
        gf var6;
        int var7;
        BattleState var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        gf var6Lifetime1;
        var7 = BachelorFridge.field_y;
        var8 = this.screen.field_h;
        if (param0 == -1) {
          this.field_x.e(param0 ^ -7);
          for (var3 = 0; this.field_x.field_t.length > var3; var3++) {
            var4 = this.field_x.field_t[var3][0];
            var5 = this.field_x.field_t[var3][1];
            if (var4 >= 0 &&
              var4 < var8.width &&
              var5 >= 0 &&
              var8.height > var5) {
              var6 = new gf(this.screen, var4, var5);
              ((TileEffect) ((Object) var6)).a(0);
            }
          }
          return;
        }
        this.field_v = false;
        this.field_x.e(param0 ^ -7);
        for (var3Lifetime1 = 0; this.field_x.field_t.length > var3Lifetime1; var3Lifetime1++) {
          var4Lifetime1 = this.field_x.field_t[var3Lifetime1][0];
          var5Lifetime1 = this.field_x.field_t[var3Lifetime1][1];
          if (var4Lifetime1 >= 0 &&
            var4Lifetime1 < var8.width &&
            var5Lifetime1 >= 0 &&
            var8.height > var5Lifetime1) {
            var6Lifetime1 = new gf(this.screen, var4Lifetime1, var5Lifetime1);
            ((TileEffect) ((Object) var6Lifetime1)).a(0);
          }
        }
    }

    private final void f(int param0) {
        if (param0 != -1) {
          this.d(-112);
          this.e(75);
          return;
        }
        this.e(75);
    }

    static {
    }
}
