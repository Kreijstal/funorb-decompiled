/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends ArrayWidgetContainer implements ButtonListener {
    static String field_H;
    static IndexedSprite[] field_S;
    static String field_K;
    private wl field_P;
    static String field_I;
    private TextButton field_L;
    static int[] field_M;
    static byte[] field_O;
    static IndexedSprite[] field_N;
    static String field_J;
    static String field_Q;

    public final void a(boolean param0, int param1, int param2, int param3, TextButton param4) {
        if (this.field_P.getValidationProvider(0).getValidationState(-114) != CacheEntry.field_s) {
          return;
        }
        try {
          qo.a(this.field_P.h(32), this.field_P.g(72), this.field_P.e(param0), (byte) -126);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "cn.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_L.field_B = this.field_P.getValidationProvider(0).getValidationState(param2 - 287) == CacheEntry.field_s ? true : false;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "cn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        super.drawLayer((byte) -94, param1, param2, param3);
        vc.field_e.drawText(sm.field_b, 4 + param1 + this.field_n, vc.field_e.field_C + (param3 + (this.field_j + 4)), 16777215, -1);
        if (param0 > -52) {
          field_J = (String) null;
        }
    }

    cn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_P = new wl(new ib(10000536), TextButton.field_E, 0, 0, 140, 25);
        this.field_P.a(new bl(), (byte) -48);
        this.field_L = new TextButton(qn.field_lb, (UiListener) (this));
        this.field_z = new UiComponent[]{(UiComponent) ((Object) this.field_P), (UiComponent) ((Object) this.field_L)};
        this.field_L.field_r = (WidgetPainter) ((Object) new mm());
        this.refreshLayout((byte) 45);
    }

    final void layoutChildren(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 > 17) {
          var2 = 250;
          this.field_P.setBounds(25, this.field_k - 5 >> 1, 140, this.field_v - var2 >> 1, -126);
          this.field_L.setBounds(30, 2 + (-30 + (20 + this.field_k) >> 1), 100, (-var2 + this.field_v >> 1) + 150, -118);
          return;
        }
        TextButton var3 = (TextButton) null;
        this.a(true, -29, 36, -108, (TextButton) null);
        var2Lifetime1 = 250;
        this.field_P.setBounds(25, this.field_k - 5 >> 1, 140, this.field_v - var2Lifetime1 >> 1, -126);
        this.field_L.setBounds(30, 2 + (-30 + (20 + this.field_k) >> 1), 100, (-var2Lifetime1 + this.field_v >> 1) + 150, -118);
    }

    public static void releaseStatics(byte param0) {
        field_N = null;
        field_M = null;
        field_J = null;
        field_S = null;
        if (param0 >= 95) {
          field_H = null;
          field_I = null;
          field_O = null;
          field_K = null;
          field_Q = null;
          return;
        }
        cn.c(true);
        field_H = null;
        field_I = null;
        field_O = null;
        field_K = null;
        field_Q = null;
    }

    final static boolean a(int param0, int param1) {
        if (param0 <= 103) {
          return true;
        }
        if (param1 < 0) {
          return (1 + param1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return 0 == param1 % 4 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (0 != param1 % 100) {
          return true;
        }
        if (0 != param1 % 400) {
          return false;
        }
        return true;
    }

    final static void c(boolean param0) {
        int var1_int = 0;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!param0) {
            field_O = (byte[]) null;
          }
          for (var1_int = 0; SecondaryNodeDeque.field_f > var1_int; var1_int++) {
            g.field_d[var1_int] = null;
          }
          SecondaryNodeDeque.field_f = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "cn.F(" + param0 + ')');
        }
    }

    static {
        field_H = "Email: ";
        field_I = "Blue Team";
        field_M = new int[8192];
        field_Q = "<%0> has left.";
        field_O = new byte[]{(byte)2, (byte)9, (byte) 1};
        field_J = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game. After learning the basics, enter the lobby and join a Rated game to earn wands. Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_K = "Offer draw";
    }
}
