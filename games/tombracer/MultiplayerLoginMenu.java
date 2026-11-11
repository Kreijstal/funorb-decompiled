/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiplayerLoginMenu extends MenuScreen {
    private DropAnimation field_q;
    static ur field_r;

    public static void releaseStatics(int param0) {
        if (param0 > -126) {
          return;
        }
        field_r = null;
    }

    final void update(boolean param0, boolean param1, int param2) {
        super.update(param0, param1, param2);
        this.field_q.updateFall((byte) -120, param0, !param1 ? true : false);
    }

    final int getItemRight(int param0, byte param1) {
        if (param1 == -48) {
          return this.getItemX((byte) 122, param0) + this.items[param0].getWidth(-163);
        }
        field_r = (ur) null;
        return this.getItemX((byte) 122, param0) + this.items[param0].getWidth(-163);
    }

    final int getItemY(int param0, int param1) {
        if (param1 != 30) {
          this.update(false, false, 33);
          return this.firstItemY;
        }
        return this.firstItemY;
    }

    final static boolean b(boolean param0) {
        if (param0) {
          field_r = (ur) null;
          if (!TextWidgetPainter.a(47)) {
            return ReportAbuseDialog.field_ub <= 0 ? true : false;
          }
          return true;
        }
        if (TextWidgetPainter.a(47)) {
          return true;
        }
        if (ReportAbuseDialog.field_ub > 0) {
          return false;
        }
        return true;
    }

    final void draw(byte param0, boolean param1) {
        int var3 = this.field_q.getPosition(param0 + 111);
        gg.field_f.draw(aaa.a(false) - gg.field_f.width() >> 1, var3 + gg.field_f.height() / 2);
        this.h(var3, 3);
        super.draw(param0, param1);
    }

    final int getItemX(byte param0, int param1) {
        if (param0 >= 111) {
          return aaa.a(false) / 2 + (-(this.items.length * this.items[param1].getWidth(-163) / 2) + param1 * this.items[param1].getWidth(-163));
        }
        this.field_q = (DropAnimation) null;
        return aaa.a(false) / 2 + (-(this.items.length * this.items[param1].getWidth(-163) / 2) + param1 * this.items[param1].getWidth(-163));
    }

    private final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        GameFont var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        if (param1 == 3) {
          var3 = 500;
          var4 = aaa.a(false) / 2 - var3 / 2;
          var5 = param0 + 100;
          MembersUpsellMenu.drawCentredTextWithShadow(ClampOperator.field_o.toUpperCase(), 2497287, SingleChildWidget.field_v, -1, -30 + gg.field_f.height() / 2 + var5, aaa.a(false) / 2, -1);
          var6 = kn.field_p;
          var7 = kv.field_a.field_h + (kv.field_a.field_g + 4);
          var8 = 3 * var7;
          var9 = aaa.field_e;
          SocketConnector.drawWrappedText(var9, 1, var6, 2431750, var7, var8, 1, gg.field_f.height() / 2 + var5, var4, -1, (byte) 60, var3);
          return;
        }
    }

    MultiplayerLoginMenu(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_q = new DropAnimation();
        try {
          this.field_o = false;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new ur(6);
    }
}
