/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SuperSpeedAllAnimation extends EventAnimation {
    static String field_x;
    static IndexedSprite[] field_z;
    static String[] field_y;
    static String field_w;
    private SuperSpeedAllEvent field_v;

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_z = null;
        if (param0 != 4) {
          return;
        }
        field_w = null;
    }

    private final void d(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var6 = this.field_v.creature.a(99, this.screen.field_h);
        if (var6.isDown(-118)) {
          return;
        }
        DamageEffect var3 = (DamageEffect) (this.field_v.effects.b((byte) 90));
        al.a(-46, this.field_v.moveId);
        while (var3 != null) {
          var3.a(var6, this.screen.field_h, 12);
          var4 = var3.target.a(-27449, this.screen);
          this.a(27799, new taa(this.screen, var4));
          this.a(27799, new cb(var4, 7));
          this.a(27799, new wn(var4, kna.field_g[17], 24831));
          var3 = (DamageEffect) (this.field_v.effects.c(0));
        }
        if (param0 == 24831) {
          return;
        }
        this.f(3);
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        int var2 = 12 % ((param0 - 71) / 47);
        if (this.field_l > 75) {
          if (this.field_l % 10 != 0) {
            fieldTemp$0 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (0 <= fieldTemp$0) {
              if (this.field_l == 75) {
                this.d(24831);
                return false;
              }
              return false;
            }
            this.f(-6020);
            return true;
          }
          MartyrAnimation.a(3, (byte) 126);
        }
        int fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$1) {
          if (this.field_l != 75) {
            return false;
          }
          this.d(24831);
          return false;
        }
        this.f(-6020);
        return true;
    }

    SuperSpeedAllAnimation(gj param0, SuperSpeedAllEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(int param0) {
        if (param0 != -6020) {
          this.f(92);
        }
    }

    final static void e(byte param0) {
        if (param0 <= 77) {
          return;
        }
        bi.o(2);
        ep.a(4, 8192);
    }

    static {
        field_x = "Go Back";
        field_w = "Offer draw";
    }
}
