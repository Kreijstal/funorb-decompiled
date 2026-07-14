/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends ej implements ai {
    static int field_Q;
    private s field_P;
    static int[] field_O;
    static int field_N;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, kc param7, kc param8, int param9, int param10, int param11, pf param12, int param13, int param14, pf param15, int param16, pf param17, int param18, int param19, int param20) {
        ta.a(0, param8, param7, param13);
        nc.a(-101, param3, param10, param9, param1);
        jk.b(param11, param18, 249);
        if (param16 >= -78) {
          return;
        } else {
          fe.a(param2, param5, param12, param15, param20, -81);
          e.a(false, param4, param6, param17);
          l.a(0, param14, param19, param0);
          return;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) nk.field_q);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nk.field_q);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) nk.field_q);
        if (param0 != -56) {
            field_Q = 118;
        }
    }

    gg(sk param0, i param1) {
        super(param0, 200, 150);
        Object var5 = null;
        pj var6 = null;
        String var7 = null;
        pj var8 = null;
        String var9 = null;
        pj var10 = null;
        String var11 = null;
        pj var12 = null;
        String var13 = null;
        pj var14 = null;
        var5 = null;
        if (jm.field_a == param1) {
          var13 = dg.field_C;
          var14 = new pj(var13, (ag) null);
          var14.field_n = 50;
          var14.field_m = ((gg) this).field_m;
          var14.field_r = 80;
          var14.field_s = 0;
          var14.field_j = (td) (Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((gg) this).a(var14, (byte) 74);
          ((gg) this).field_P = this.a(th.field_d, 6, (ag) this);
        } else {
          if (hh.field_d == param1) {
            ((gg) this).field_r = ((gg) this).field_r + 10;
            var9 = fi.field_a;
            if (rc.b(-38)) {
              var11 = va.field_a;
              ((gg) this).field_r = ((gg) this).field_r + 20;
              var12 = new pj(var11, (ag) null);
              var12.field_n = 50;
              var12.field_m = ((gg) this).field_m;
              var12.field_r = 80;
              var12.field_s = 0;
              var12.field_j = (td) (Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gg) this).a(var12, (byte) 74);
              ((gg) this).field_P = this.a(th.field_d, 6, (ag) this);
            } else {
              var10 = new pj(var9, (ag) null);
              var10.field_n = 50;
              var10.field_m = ((gg) this).field_m;
              var10.field_r = 80;
              var10.field_s = 0;
              var10.field_j = (td) (Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gg) this).a(var10, (byte) 74);
              ((gg) this).field_P = this.a(th.field_d, 6, (ag) this);
            }
          } else {
            if (param1 == pa.field_c) {
              var7 = lh.field_a;
              ((gg) this).field_r = ((gg) this).field_r + 30;
              var8 = new pj(var7, (ag) null);
              var8.field_n = 50;
              var8.field_m = ((gg) this).field_m;
              var8.field_r = 80;
              var8.field_s = 0;
              var8.field_j = (td) (Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gg) this).a(var8, (byte) 74);
              ((gg) this).field_P = this.a(th.field_d, 6, (ag) this);
            } else {
              var6 = new pj((String) var5, (ag) null);
              var6.field_n = 50;
              var6.field_m = ((gg) this).field_m;
              var6.field_r = 80;
              var6.field_s = 0;
              var6.field_j = (td) (Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gg) this).a(var6, (byte) 74);
              ((gg) this).field_P = this.a(th.field_d, 6, (ag) this);
            }
          }
        }
    }

    public static void f(boolean param0) {
        if (!param0) {
            field_N = 83;
            field_O = null;
            return;
        }
        field_O = null;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = -74 % ((param0 - -3) / 62);
        if (!(param3 != ((gg) this).field_P)) {
            this.p(126);
        }
    }

    private final void p(int param0) {
        if (!((gg) this).field_A) {
            return;
        }
        int var2 = -69 / ((param0 - 52) / 48);
        ((gg) this).field_A = false;
    }

    private final s a(String param0, int param1, ag param2) {
        s var4 = new s(param0, param2);
        var4.field_j = (td) (Object) new vk();
        int var5 = ((gg) this).field_r - param1;
        ((gg) this).field_r = ((gg) this).field_r + 38;
        var4.a(15, var5, 30, (byte) -90, -14 + ((gg) this).field_m - 16);
        ((gg) this).a((pj) (Object) var4, (byte) 74);
        ((gg) this).c(-26385);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = 0;
    }
}
