/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class aj extends qg implements pb {
    qj field_u;
    static String field_v;
    static java.awt.Frame field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 9 / ((-29 - param0) / 53);
        super.a(-93, param1, param2, param3, param4);
        this.j(-110);
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        int var9 = Transmogrify.field_A ? 1 : 0;
        tl var7 = new tl(((aj) this).field_u);
        if (param3 != -1) {
            return;
        }
        qg var8 = (qg) (Object) var7.c(param3 + -90);
        while (var8 != null) {
            // ifeq L93
            var8.a(((aj) this).field_n + param0, param1, param2, -1, param4, ((aj) this).field_p + param5);
            var8 = (qg) (Object) var7.a(405142401);
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        int var7 = Transmogrify.field_A ? 1 : 0;
        super.a(param0, param1, param2, param3);
        tl var5 = new tl(((aj) this).field_u);
        qg var6 = (qg) (Object) var5.c(-95);
        while (var6 != null) {
            // ifeq L93
            var6.a(param0 + ((aj) this).field_n, (byte) -12, param2, param3 - -((aj) this).field_p);
            var6 = (qg) (Object) var5.a(param1 ^ -405142411);
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var10 = Transmogrify.field_A ? 1 : 0;
        tl var8 = new tl(((aj) this).field_u);
        if (param4 != -30386) {
            String discarded$0 = ((aj) this).f(-5);
        }
        qg var9 = (qg) (Object) var8.c(-108);
        while (var9 != null) {
            // ifeq L111
            if (var9.b(param0, param1, param2, param3 - -((aj) this).field_p, -30386, param5, ((aj) this).field_n + param6)) {
                return true;
            }
            var9 = (qg) (Object) var8.a(405142401);
        }
        return false;
    }

    final boolean a(qg param0, int param1) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        tl var3 = new tl(((aj) this).field_u);
        if (param1 > -11) {
            return true;
        }
        qg var4 = (qg) (Object) var3.c(-117);
        while (var4 != null) {
            if (!(!var4.a(param0, -87))) {
                return true;
            }
            var4 = (qg) (Object) var3.a(405142401);
        }
        return false;
    }

    final boolean b(byte param0) {
        int var2 = -52 % ((param0 - -57) / 46);
        return null != ((aj) this).i(-124) ? true : false;
    }

    qg i(int param0) {
        tl var2 = null;
        qg var3 = null;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(((aj) this).field_u);
        var3 = (qg) (Object) var2.c(-123);
        if (param0 < -112) {
          L0: while (true) {
            if (var3 != null) {
              if (!var3.b((byte) 78)) {
                var3 = (qg) (Object) var2.a(405142401);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (!(!((aj) this).a((byte) -70, param3, param2, param0))) {
            ((aj) this).a(param2, 68, param0, param3);
            this.a(-12060, param3, param2, param0);
        }
        if (param1 > -20) {
            Object var6 = null;
            ((aj) this).a((qg) null, (byte) -109);
        }
        return param2;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final int g(int param0) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 >= -41) {
            return -79;
        }
        int var2 = 0;
        tl var3 = new tl(((aj) this).field_u);
        qg var4 = (qg) (Object) var3.c(-127);
        while (var4 != null) {
            var5 = var4.g(-68);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (qg) (Object) var3.a(405142401);
        }
        return var2;
    }

    final void a(qg param0, byte param1) {
        ((aj) this).field_u.a((wf) (Object) param0, -111);
        if (param1 >= -77) {
            field_t = null;
        }
    }

    final static void k(int param0) {
        oh.field_h.field_p = param0;
        oh.field_h.field_k = 0;
    }

    final static void a(java.awt.Component param0, int param1, int param2, lc param3, boolean param4, int param5, fe param6, int param7) {
        qh.a(param5, param4, 10);
        re.field_h = qh.a(param6, param0, 0, param1);
        u.field_a = qh.a(param6, param0, 1, param7);
        of.field_a = new jc();
        pc.field_b = param7 * 1000 / param5;
        u.field_a.b((ag) (Object) of.field_a);
        jk.field_D = param3;
        jk.field_D.a((byte) 107, lb.field_a);
        re.field_h.b((ag) (Object) jk.field_D);
        if (param2 != 22290) {
            Object var9 = null;
            aj.a((ci) null, (ci) null, (ci) null, -25);
        }
    }

    final String f(int param0) {
        tl var2 = null;
        qg var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == 4) {
            break L0;
          } else {
            String discarded$2 = aj.a(false, true, true, true);
            break L0;
          }
        }
        var2 = new tl(((aj) this).field_u);
        var3 = (qg) (Object) var2.c(-95);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.f(4);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (qg) (Object) var2.a(param0 + 405142397);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void h(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 32) {
            aj.k(-45);
        }
    }

    final static void a(ci param0, ci param1, ci param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        ii[] var14 = null;
        int var11_int = 0;
        int var13 = Transmogrify.field_A ? 1 : 0;
        ua.field_f = kl.a(param2, (byte) 127, "commonui", "frame_top");
        rh.field_l = kl.a(param2, (byte) 125, "commonui", "frame_bottom");
        vf.field_a = pc.a("commonui", "jagex_logo_grey", param2, 113);
        mc.field_b = kl.a(param2, (byte) 125, "commonui", "button");
        ai.field_b = ik.a("commonui", param2, (byte) -46, "validation");
        al.field_i = (kg) (Object) ua.a(param2, "commonui", 32, param1, "arezzo12");
        vd.field_h = (kg) (Object) ua.a(param2, "commonui", 32, param1, "arezzo14");
        rh.field_q = (kg) (Object) ua.a(param2, "commonui", param3 + -2394310, param1, "arezzo14bold");
        ti var17 = new ti(param0.a("", (byte) 100, "button.gif"), (java.awt.Component) (Object) gd.field_k);
        ii discarded$0 = gk.a("commonui", param3 ^ -2392393, param2, "dropdown");
        ii[] var5 = ej.a((byte) -43, param2, "screen_options", "commonui");
        kf.field_h = new ii[4];
        fj.field_a = new ii[4];
        eh.field_b = new ii[4];
        ii[][] var6 = new ii[][]{fj.field_a, kf.field_h, eh.field_b};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_j;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_i[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = param3;
        var21[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            ii[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = qf.a(var5[var9], var21[var11_int], -2);
            }
        }
        var9 = var17.field_m;
        og.a((byte) 108);
        var17.e();
        sb.b(0, 0, sb.field_c, sb.field_g);
        ti var15 = new ti(var9, var9);
        ti var18 = var15;
        var18.e();
        var17.f(0, 0);
        ti var11 = new ti(var9, var9);
        var11.e();
        var17.f(-var17.field_n + var9, 0);
        ti var12 = new ti(-(2 * var9) + var17.field_n, var9);
        var12.e();
        var17.f(-var9, 0);
        fi.c(true);
        mc.field_b = new ti[]{var15, var12, var11};
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        if (!param0) {
            return null;
        }
        return rf.field_cb[var4];
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var6 = 26 % ((65 - param2) / 55);
        tl var5 = new tl(((aj) this).field_u);
        qg var9 = (qg) (Object) var5.c(-117);
        while (var9 != null) {
            // ifeq L98
            if (var9.b((byte) -103)) {
                if (var9.a(param0, param1, (byte) 125, param3)) {
                    return true;
                }
            }
            var9 = (qg) (Object) var5.a(405142401);
        }
        int var7 = param0;
        if (80 == var7) {
            return !ve.field_B[81] ? ((aj) this).b(param1, 56) : ((aj) this).a(2, param1);
        }
        return false;
    }

    private final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(((aj) this).field_u);
        if (param0 > -72) {
            return;
        }
        qg var3 = (qg) (Object) var2.c(-125);
        while (var3 != null) {
            var3.c((byte) 38);
            var3 = (qg) (Object) var2.a(405142401);
        }
    }

    final boolean b(qg param0, int param1) {
        tl var5 = null;
        qg var6 = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        if (((aj) this).field_u.d(-1)) {
            return false;
        }
        tl var3 = new tl(((aj) this).field_u);
        if (param1 <= 44) {
            return true;
        }
        qg var4 = (qg) (Object) var3.c(-117);
        while (var4 != null) {
            if (var4.b((byte) -118)) {
                var5 = new tl(((aj) this).field_u);
                wf discarded$0 = var5.a((wf) (Object) var4, 95);
                var6 = (qg) (Object) var5.a(405142401);
                while (var6 != null) {
                    if (!(!var6.a(param0, -30))) {
                        return true;
                    }
                    var6 = (qg) (Object) var5.a(405142401);
                }
            }
            var4 = (qg) (Object) var3.a(405142401);
        }
        return false;
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = Transmogrify.field_A ? 1 : 0;
        tl var9 = new tl(((aj) this).field_u);
        if (param0 != -12060) {
            ((aj) this).field_u = null;
        }
        qg var6 = (qg) (Object) var9.c(param0 + 11962);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(1 + param3, -43, param2, param1);
            var6 = (qg) (Object) var9.a(405142401);
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var6 = -80 % ((77 - param3) / 34);
        if (-1 == (param2 ^ -1)) {
            if (!(((aj) this).field_q == null)) {
                ((aj) this).field_q.a(param0, param1, true, (byte) 103, (qg) this);
            }
        }
        tl var5 = new tl(((aj) this).field_u);
        qg var7 = (qg) (Object) var5.a((byte) 62);
        while (var7 != null) {
            var7.a(param0 - -((aj) this).field_p, param1 + ((aj) this).field_n, param2, (byte) 9);
            var7 = (qg) (Object) var5.b(-29339);
        }
    }

    final boolean a(int param0, qg param1) {
        tl var5 = null;
        qg var6 = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        if (((aj) this).field_u.d(-1)) {
            return false;
        }
        tl var8 = new tl(((aj) this).field_u);
        if (param0 != 2) {
            boolean discarded$0 = ((aj) this).a(-95, (qg) null, (byte) -47, '￈');
        }
        qg var4 = (qg) (Object) var8.a((byte) 62);
        while (var4 != null) {
            if (var4.b((byte) -112)) {
                var5 = new tl(((aj) this).field_u);
                wf discarded$1 = var5.a((wf) (Object) var4, true);
                var6 = (qg) (Object) var5.b(-29339);
                while (var6 != null) {
                    if (var6.a(param1, -69)) {
                        return true;
                    }
                    var6 = (qg) (Object) var5.b(-29339);
                }
            }
            var4 = (qg) (Object) var8.b(-29339);
        }
        return false;
    }

    aj(int param0, int param1, int param2, int param3, ui param4) {
        super(param0, param1, param2, param3, param4, (ma) null);
        ((aj) this).field_u = new qj();
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var10 = Transmogrify.field_A ? 1 : 0;
        tl var8 = new tl(((aj) this).field_u);
        qg var9 = (qg) (Object) var8.c(param5 ^ 114);
        while (var9 != null) {
            // ifeq L97
            if (var9.b((byte) -119)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, -17, param6))) {
                    return true;
                }
            }
            var9 = (qg) (Object) var8.a(405142401);
        }
        if (param5 != -17) {
            return false;
        }
        return false;
    }

    final void e(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(((aj) this).field_u);
        qg var3 = (qg) (Object) var2.c(-114);
        if (param0 != -29113) {
            ((aj) this).field_u = null;
        }
        while (var3 != null) {
            var3.e(-29113);
            var3 = (qg) (Object) var2.a(param0 ^ -405113402);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Mouse over an icon for details";
    }
}
