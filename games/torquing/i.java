/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class i extends im implements ng {
    static boolean[] field_P;
    static boolean field_R;
    private lg field_O;
    static vn field_N;
    static pk field_Q;

    public static void m(int param0) {
        field_Q = null;
        field_P = null;
        if (param0 != 50) {
            return;
        }
        field_N = null;
    }

    i(ln param0, hh param1) {
        super(param0, 200, 150);
        String var3 = null;
        gm var4 = null;
        L0: {
          var3 = null;
          if (ab.field_l == param1) {
            var3 = ak.field_h;
            break L0;
          } else {
            if (bl.field_b == param1) {
              ((i) this).field_o = ((i) this).field_o + 10;
              var3 = wj.field_j;
              if (!nh.a(-116)) {
                break L0;
              } else {
                ((i) this).field_o = ((i) this).field_o + 20;
                var3 = jg.field_v;
                break L0;
              }
            } else {
              if (param1 != ip.field_b) {
                break L0;
              } else {
                var3 = dn.field_c;
                ((i) this).field_o = ((i) this).field_o + 30;
                break L0;
              }
            }
          }
        }
        var4 = new gm(var3, (ca) null);
        var4.field_o = 80;
        var4.field_w = 0;
        var4.field_p = ((i) this).field_p;
        var4.field_k = 50;
        var4.field_q = (el) (Object) new pc(sp.field_R, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((i) this).a(var4, -6938);
        ((i) this).field_O = this.a((ca) this, true, qd.field_i);
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        if (!(((i) this).field_O != param1)) {
            this.b(true);
        }
        if (param0 > -85) {
            Object var7 = null;
            lg discarded$0 = this.a((ca) null, false, (String) null);
        }
    }

    final static byte[] b(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        n var2_ref = null;
        int var9 = Torquing.field_u;
        if (param0 != 10758) {
            i.m(-52);
        }
        n var2 = (n) (Object) rj.field_v.a((long)param1, 4604);
        if (!(var2 != null)) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param1);
            for (var5 = 0; -256 < (var5 ^ -1); var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; var5 < 255; var5++) {
                var6 = -var5 + 255;
                var7 = va.a(var6, (byte) 124, var4);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2_ref = new n(var11);
            rj.field_v.a((long)param1, (ta) (Object) var2_ref, 0);
        }
        return var2_ref.field_v;
    }

    private final void b(boolean param0) {
        if (!((i) this).field_D) {
            return;
        }
        if (!param0) {
            field_N = null;
        }
        ((i) this).field_D = false;
    }

    private final lg a(ca param0, boolean param1, String param2) {
        lg var4 = new lg(param2, param0);
        if (!param1) {
            field_R = true;
        }
        var4.field_q = (el) (Object) new rf();
        int var5 = -6 + ((i) this).field_o;
        ((i) this).field_o = ((i) this).field_o + 38;
        var4.a((byte) -85, 15, var5, 30, -16 + (-14 + ((i) this).field_p));
        ((i) this).a((gm) (Object) var4, -6938);
        ((i) this).e((byte) 88);
        return var4;
    }

    static int c(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = false;
        field_P = new boolean[112];
    }
}
