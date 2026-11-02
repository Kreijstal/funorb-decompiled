/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OhNoAnimation extends EventAnimation {
    static af field_w;
    private OhNoEvent field_v;

    private final void f(int param0) {
        SpecialMoveDefinition var4 = (SpecialMoveDefinition) (al.a(103, this.field_v.moveId));
        var4 = var4;
        this.field_v.creature.a(19, this.screen.field_h);
        this.field_v.d((byte) 2);
        uea discarded$2 = new uea(this.screen, this.field_v.field_q, this.field_v.field_r, gma.field_e[var4.field_q].field_a);
        this.field_v.apply(this.screen.field_h, false);
        if (param0 == -1) {
          return;
        }
        OhNoAnimation.releaseStatics(80);
    }

    OhNoAnimation(BattleScreen param0, OhNoEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          int var2 = -41 % ((71 - param0) / 47);
          this.d(-26);
          return true;
        }
        if (this.field_l == 25) {
          this.f(-1);
          return false;
        }
        return false;
    }

    final static void g(int param0) {
        MoveOrder.field_k = false;
        if (da.field_d != null) {
          da.field_d.f((byte) -118);
          if (param0 == -26) {
            if (gk.field_d != 0) {
              ClamsEvent.d(param0 - 96);
            }
            FullHealAnimation.field_x = 0;
            return;
          }
          return;
        }
        if (param0 == -26) {
          if (gk.field_d != 0) {
            ClamsEvent.d(param0 - 96);
          }
          FullHealAnimation.field_x = 0;
          return;
        }
    }

    private final void d(int param0) {
        if (param0 != -26) {
          this.field_v = (OhNoEvent) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_w = null;
        if (param0 != -1) {
          field_w = (af) null;
        }
    }

    static {
        field_w = new af();
    }
}
