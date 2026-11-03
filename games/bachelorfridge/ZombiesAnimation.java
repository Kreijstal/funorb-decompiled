/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ZombiesAnimation extends EventAnimation {
    static Sprite field_y;
    private ZombiesEvent field_v;
    static String field_x;
    static String field_w;

    private final void f(byte param0) {
        EventEffect var3_ref = null;
        CreatureActor var7 = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var6 = this.field_v.creature.a(9, this.screen.field_h);
        if (param0 >= -47) {
          ZombiesAnimation.releaseStatics(-41);
        }
        if (!var6.isDown(89)) {
          var3_ref = (EventEffect) (this.field_v.effects.b((byte) 90));
          al.a(-121, this.field_v.moveId);
          while (var3_ref != null) {
            var3_ref.apply(var6, this.screen.field_h, 12);
            if (var3_ref instanceof DamageEffect) {
              var7 = var3_ref.target.a(-27449, this.screen);
              this.addChild(27799, new ActorAnimation(this.screen, var7));
              this.addChild(27799, new iu(67, 256));
              this.addChild(27799, new cb(var7, 19));
              this.addChild(27799, new wn(var7, kna.field_g[35], 24831));
            }
            var3_ref = (EventEffect) (this.field_v.effects.c(0));
          }
          return;
        }
    }

    ZombiesAnimation(BattleScreen param0, ZombiesEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "cka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_y = null;
        field_w = null;
        field_x = null;
        if (param0 != -26) {
          ZombiesAnimation.releaseStatics(109);
        }
    }

    private final void e(byte param0) {
        if (param0 < 83) {
          this.isFinished((byte) 86);
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            this.f((byte) -109);
            return false;
          }
          return false;
        }
        int var2 = 125 % ((71 - param0) / 47);
        this.e((byte) 107);
        return true;
    }

    static {
        field_x = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_w = "RESIGNED";
    }
}
