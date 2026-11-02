/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CranberryAnimation extends EventAnimation {
    private CranberryEvent field_w;
    static Sprite[] field_v;
    private taa field_x;

    final boolean c(byte param0) {
        ad var3 = null;
        ffa var4 = null;
        int var2 = 56 / ((71 - param0) / 47);
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_x.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_l == 100) {
          var3 = this.field_w.field_q.a(-27449, this.screen);
          var4 = new ffa(this.screen, this.field_w, var3.field_s.tileX, var3.field_s.tileY);
          ((kj) ((Object) var4)).a(0);
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$0) {
          return false;
        }
        this.d(-66);
        return true;
    }

    private final void d(int param0) {
        if (param0 > -43) {
          field_v = (Sprite[]) null;
        }
    }

    CranberryAnimation(gj param0, CranberryEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
          this.field_x = new taa(this.screen, this.field_w.field_q.a(-27449, this.screen));
          this.a(27799, this.field_x);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(byte param0) {
        ol.a(bi.field_i[1], true);
        if (param0 < 86) {
          field_v = (Sprite[]) null;
        }
    }

    final static void e(int param0) {
        AttackUpAllEvent.e((byte) 113);
        if (param0 != 0) {
          field_v = (Sprite[]) null;
          gha.b(16);
          og.a(12);
          return;
        }
        gha.b(16);
        og.a(12);
    }

    public static void f(int param0) {
        if (param0 <= 78) {
          CranberryAnimation.e((byte) -99);
          field_v = null;
          return;
        }
        field_v = null;
    }

    static {
    }
}
