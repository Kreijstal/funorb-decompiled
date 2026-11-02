/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaiseAnimation extends EventAnimation {
    static int[] field_x;
    private RaiseEvent field_w;
    private taa field_v;

    private final void b(boolean param0) {
        ad var6 = null;
        ad var7 = null;
        EventEffect var3_ref = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_w.creature.a(23, this.screen.field_h);
        EventEffect var3_refLifetime1;
        if (!param0) {
          field_x = (int[]) null;
          if (var2.isDown(100)) {
            return;
          }
          var3_ref = (EventEffect) (this.field_w.effects.b((byte) 90));
          al.a(87, this.field_w.moveId);
          while (var3_ref != null) {
            var6 = var3_ref.target.a(-27449, this.screen);
            var6.b(-1, 19);
            var6.a(24831, 105, gb.field_i);
            var3_ref.a(var2, this.screen.field_h, 12);
            var3_ref = (EventEffect) (this.field_w.effects.c(0));
          }
          return;
        }
        if (var2.isDown(100)) {
          return;
        }
        var3_refLifetime1 = (EventEffect) (this.field_w.effects.b((byte) 90));
        al.a(87, this.field_w.moveId);
        while (var3_refLifetime1 != null) {
          var7 = var3_refLifetime1.target.a(-27449, this.screen);
          var7.b(-1, 19);
          var7.a(24831, 105, gb.field_i);
          var3_refLifetime1.a(var2, this.screen.field_h, 12);
          var3_refLifetime1 = (EventEffect) (this.field_w.effects.c(0));
        }
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 == 8192) {
          return fda.b(param0 ^ 8193);
        }
        RaiseAnimation.a(-21, 118, 114, true);
        return fda.b(param0 ^ 8193);
    }

    final boolean c(byte param0) {
        int var2 = -28 / ((param0 - 71) / 47);
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_v.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_l == 100) {
          jja.a(256, -1, 46);
          this.b(true);
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          return false;
        }
        this.f((byte) -91);
        return true;
    }

    public static void e(byte param0) {
        if (param0 <= 14) {
          field_x = (int[]) null;
          field_x = null;
          return;
        }
        field_x = null;
    }

    private final void f(byte param0) {
        if (param0 >= -90) {
          this.field_v = (taa) null;
        }
    }

    RaiseAnimation(gj param0, RaiseEvent param1) {
        super(param0, param1);
        ad var3 = null;
        try {
          this.field_w = param1;
          var3 = this.field_w.field_q.a(-27449, this.screen);
          this.field_v = new taa(this.screen, var3);
          this.a(27799, this.field_v);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "vea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new int[8192];
    }
}
