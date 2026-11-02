/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttackUpAllAnimation extends EventAnimation {
    static int field_x;
    static IndexedSprite[] field_y;
    static String field_w;
    static int field_z;
    private AttackUpAllEvent field_v;

    private final void g(int param0) {
        if (param0 > -41) {
          AttackUpAllAnimation.d(112);
        }
    }

    AttackUpAllAnimation(BattleScreen param0, AttackUpAllEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_l > 75) {
          if (this.field_l % 10 != 0) {
            fieldTemp$0 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (fieldTemp$0 >= 0) {
              if (this.field_l == 75) {
                this.f(-2602);
                return false;
              }
              return false;
            }
            var2 = 89 / ((71 - param0) / 47);
            this.g(-114);
            return true;
          }
          MartyrAnimation.a(3, (byte) 126);
        }
        int fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$1 >= 0) {
          if (this.field_l == 75) {
            this.f(-2602);
          }
          return false;
        }
        var2Lifetime1 = 89 / ((71 - param0) / 47);
        this.g(-114);
        return true;
    }

    private final void f(int param0) {
        BattleCreature var7 = null;
        CreatureActor var8 = null;
        CreatureActor var10 = null;
        DamageEffect var3_ref = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        DamageEffect var3_refLifetime1;
        if (param0 != -2602) {
          field_x = -4;
          var7 = this.field_v.creature.a(63, this.screen.field_h);
          if (!var7.isDown(-100)) {
            var3_ref = (DamageEffect) (this.field_v.effects.b((byte) 90));
            al.a(106, this.field_v.moveId);
            while (var3_ref != null) {
              var3_ref.apply(var7, this.screen.field_h, 12);
              var8 = var3_ref.target.a(param0 ^ 24849, this.screen);
              if (var8 != null) {
                this.addChild(27799, new ActorAnimation(this.screen, var8));
                this.addChild(27799, new iu(3));
                this.addChild(27799, new cb(var8, 7));
                this.addChild(27799, new wn(var8, kna.field_g[18], 24831));
              }
              var3_ref = (DamageEffect) (this.field_v.effects.c(0));
            }
            return;
          }
          return;
        }
        BattleCreature var9 = this.field_v.creature.a(63, this.screen.field_h);
        if (!var9.isDown(-100)) {
          var3_refLifetime1 = (DamageEffect) (this.field_v.effects.b((byte) 90));
          al.a(106, this.field_v.moveId);
          while (var3_refLifetime1 != null) {
            var3_refLifetime1.apply(var9, this.screen.field_h, 12);
            var10 = var3_refLifetime1.target.a(param0 ^ 24849, this.screen);
            if (var10 != null) {
              this.addChild(27799, new ActorAnimation(this.screen, var10));
              this.addChild(27799, new iu(3));
              this.addChild(27799, new cb(var10, 7));
              this.addChild(27799, new wn(var10, kna.field_g[18], 24831));
            }
            var3_refLifetime1 = (DamageEffect) (this.field_v.effects.c(0));
          }
          return;
        }
    }

    final static void d(int param0) {
        if (null != gja.field_m) {
          gja.field_m.g((byte) 127);
          if (param0 != 18) {
            return;
          }
          if (null != hp.field_d) {
            hp.field_d.d((byte) 47);
            va.a((byte) 75);
            return;
          }
          va.a((byte) 75);
          return;
        }
        if (param0 != 18) {
          return;
        }
        if (null == hp.field_d) {
          va.a((byte) 75);
          return;
        }
        hp.field_d.d((byte) 47);
        va.a((byte) 75);
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        if (param0 < 90) {
          return;
        }
        field_w = null;
    }

    final static boolean e(int param0) {
        if (param0 != -29919) {
          return false;
        }
        return qo.field_c;
    }

    static {
        field_w = "Food. Have a look at your first food in the fridge.";
        field_z = 5;
    }
}
