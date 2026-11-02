/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpiltMilkAnimation extends EventAnimation {
    static vr field_v;
    private SpiltMilkEvent field_x;
    static String field_w;

    public static void e(int param0) {
        if (param0 != 25) {
          return;
        }
        field_w = null;
        field_v = null;
    }

    SpiltMilkAnimation(gj param0, SpiltMilkEvent param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(boolean param0) {
        ad var6 = null;
        ad var7 = null;
        DamageEffect var3_ref = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_x.creature.a(124, this.screen.field_h);
        DamageEffect var3_refLifetime1;
        if (var2.isDown(-74)) {
          return;
        }
        if (!param0) {
          field_w = (String) null;
        } else {
          var3_ref = (DamageEffect) (this.field_x.effects.b((byte) 90));
          al.a(-36, this.field_x.moveId);
          while (var3_ref != null) {
            var3_ref.a(var2, this.screen.field_h, 12);
            var6 = var3_ref.target.a(-27449, this.screen);
            var6.b(-1, 7);
            var6.a(24831, 53, kna.field_g[43]);
            var3_ref = (DamageEffect) (this.field_x.effects.c(0));
          }
          return;
        }
        var3_refLifetime1 = (DamageEffect) (this.field_x.effects.b((byte) 90));
        al.a(-36, this.field_x.moveId);
        while (var3_refLifetime1 != null) {
          var3_refLifetime1.a(var2, this.screen.field_h, 12);
          var7 = var3_refLifetime1.target.a(-27449, this.screen);
          var7.b(-1, 7);
          var7.a(24831, 53, kna.field_g[43]);
          var3_refLifetime1 = (DamageEffect) (this.field_x.effects.c(0));
        }
    }

    final boolean c(byte param0) {
        int var2 = -106 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          this.d(7);
          return true;
        }
        if (25 != this.field_l) {
          return false;
        }
        MartyrAnimation.a(69, (byte) 127);
        this.b(true);
        return false;
    }

    private final void d(int param0) {
        if (param0 != 7) {
          field_w = (String) null;
        }
    }

    static {
        field_w = "You must play 1 more rated game before playing with the current options.";
    }
}
