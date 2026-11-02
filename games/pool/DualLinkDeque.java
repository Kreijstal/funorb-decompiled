/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    static String[] doubleplusgoodShot;
    static boolean field_c;
    private DualLinkNode field_d;
    private DualLinkNode field_e;
    static of field_f;
    static int field_a;
    static nl field_g;

    final DualLinkNode a(byte param0) {
        int var3 = -47 % ((param0 - 25) / 39);
        DualLinkNode var2 = this.field_d.field_q;
        if (this.field_d != var2) {
          this.field_e = var2.field_q;
          return var2;
        }
        this.field_e = null;
        return null;
    }

    final int b(int param0) {
        int var4 = Pool.field_O;
        int var2 = param0;
        DualLinkNode var3 = this.field_d.field_q;
        while (this.field_d != var3) {
          var2++;
          var3 = var3.field_q;
        }
        return var2;
    }

    final void a(DualLinkNode param0, boolean param1) {
        try {
          if (param1) {
            this.field_e = (DualLinkNode) null;
          }
          if (param0.field_n != null) {
            param0.a(param1);
          }
          param0.field_q = this.field_d;
          param0.field_n = this.field_d.field_n;
          param0.field_n.field_q = param0;
          param0.field_q.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wo.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, di param1) {
        vh var5 = null;
        vh var6 = null;
        vh var3 = null;
        try {
          oi.field_o = pf.a("basic", (byte) 54, "display_name_changed", param1);
          aj.field_Mb = new ao(0L, em.field_J, wg.muLobbyFriendAdd, PacketBuffer.muLobbyFriendRm);
          cp.field_c = new ao(0L, em.field_J, ag.muLobbyNameAdd, tp.muLobbyNameRm);
          SingleChildWidget.field_J = new vh(0L, (vh) null);
          AccountContentDialog.field_sb = new vh(0L, uo.field_Lb);
          AccountContentDialog.field_sb.field_Fb = param0;
          PoolUiText.field_e = new vh(0L, lf.field_d, jh.muLobbyName);
          mb.field_f = new vh(0L, Under13NoticePanel.field_Q, f.muLobbyLocation);
          rc.field_b = new vh(0L, UiWidget.field_A);
          SingleChildWidget.field_J.a(param0 - 103, AccountContentDialog.field_sb);
          SingleChildWidget.field_J.a(92, PoolUiText.field_e);
          SingleChildWidget.field_J.a(14, mb.field_f);
          SingleChildWidget.field_J.a(127, aj.field_Mb);
          SingleChildWidget.field_J.a(param0 ^ -107, rc.field_b);
          aj.field_Mb.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
          aj.field_Mb.field_Sb.field_Sb.field_cb = 1;
          var5 = aj.field_Mb.field_Sb.field_Sb;
          var6 = var5;
          var6.field_Fb = 1;
          cp.field_c.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
          var3 = cp.field_c.field_Sb.field_Sb;
          cp.field_c.field_Sb.field_Sb.field_cb = 1;
          var3.field_Fb = 1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = this.field_d.field_q;
        if (this.field_d == var2) {
          return null;
        }
        var2.a(false);
        if (param0 == 0) {
          return var2;
        }
        this.a((byte) -4);
        return var2;
    }

    public DualLinkDeque() {
        this.field_d = new DualLinkNode();
        this.field_d.field_q = this.field_d;
        this.field_d.field_n = this.field_d;
    }

    final DualLinkNode b(byte param0) {
        if (param0 > -66) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_e;
        if (var2 == this.field_d) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_q;
        return var2;
    }

    public static void a(boolean param0) {
        doubleplusgoodShot = null;
        if (!param0) {
          return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        doubleplusgoodShot = new String[]{"Awesome shot!", "Pure skill!"};
        field_a = 5;
        field_g = new nl();
    }
}
