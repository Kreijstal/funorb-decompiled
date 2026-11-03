/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SauceOfFlameAnimation extends EventAnimation {
    static PlatformTask field_x;
    static Sprite field_y;
    static IndexedSprite[][] field_v;
    static Sprite[] field_w;
    private SauceOfFlameEvent field_z;

    final static void a(boolean param0, int param1, vr param2, vr param3, vr param4) {
        try {
          ut.field_m = MovementAnimation.a("", -203);
          if (param1 != -12472) {
            SauceOfFlameAnimation.releaseStatics((byte) -127);
          }
          ut.field_m.a(false, param1 ^ -1537021683);
          StampedeAnimation.a(param2, param3, 111, param4);
          nga.b((byte) 113);
          FridgeScreen.field_p = GameClock.field_a;
          ReportAbusePanel.field_G = GameClock.field_a;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aw.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(byte param0) {
        int var12 = 0;
        int var13 = 0;
        ip discarded$0 = null;
        uea discarded$1 = null;
        BattleState var3;
        BattleCreature var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var14;
        int var15;
        int var16;
        Object var18;
        SpecialMoveDefinition var18_ref;
        int[][] var21;
        var18 = null;
        var16 = BachelorFridge.field_y;
        var18_ref = (SpecialMoveDefinition) (al.a(-111, this.field_z.moveId));
        var3 = this.screen.field_h;
        var4 = this.field_z.creature.a(92, this.screen.field_h);
        if (param0 > -56) {
          field_v = (IndexedSprite[][]) null;
        }
        var21 = this.field_z.a(this.screen.field_h, 0, -99, var4);
        var6 = this.field_z.field_s;
        var7 = this.field_z.field_q;
        var8 = 17;
        var9 = 17;
        var10 = -1 + var8 >> 1;
        var11 = -1 + var9 >> 1;
        for (var12 = 0; var12 < var8; var12++) {
          for (var13 = 0; var13 < var9; var13++) {
            if (var21[var12][var13] == 1) {
              var14 = -var10 + var12 + var6;
              var15 = -var11 + var13 + var7;
              if (var14 >= 0 &&
                var3.width > var14 &&
                var15 >= 0 &&
                var15 < var3.height) {
                discarded$0 = new ip(this.screen, var14, var15);
                discarded$1 = new uea(this.screen, var14, var15, gma.field_e[var18_ref.field_q].field_a);
              }
            }
          }
        }
    }

    final boolean isFinished(byte param0) {
        int var2 = 90 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            this.f((byte) -124);
            this.g((byte) 69);
          }
          return false;
        }
        this.d(17);
        return true;
    }

    private final void d(int param0) {
        if (param0 != 17) {
          this.d(-75);
        }
    }

    private final void g(byte param0) {
        CreatureActor var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var6 = this.field_z.creature.a(106, this.screen.field_h);
        if (var6.isDown(-69)) {
          return;
        }
        if (param0 != 69) {
          return;
        }
        EventEffect var3 = (EventEffect) (this.field_z.effects.b((byte) 90));
        al.a(param0 ^ 19, this.field_z.moveId);
        while (var3 != null) {
          var4 = var3.target.a(-27449, this.screen);
          this.addChild(27799, new ActorAnimation(this.screen, var4));
          this.addChild(27799, new cb(var4, 6));
          this.addChild(27799, new TileEffectAnimation(new ip(this.screen, var4.field_s.tileX, var4.field_s.tileY)));
          this.addChild(27799, new TileEffectAnimation(new oia(this.screen, var4.field_s.tileX, var4.field_s.tileY)));
          var3.apply(var6, this.screen.field_h, 12);
          var3 = (EventEffect) (this.field_z.effects.c(param0 - 69));
        }
    }

    public static void releaseStatics(byte param0) {
        field_x = null;
        field_y = null;
        field_v = (IndexedSprite[][]) null;
        field_w = null;
        if (param0 != 26) {
          field_y = (Sprite) null;
        }
    }

    SauceOfFlameAnimation(BattleScreen param0, SauceOfFlameEvent param1) {
        super(param0, param1);
        try {
          this.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
