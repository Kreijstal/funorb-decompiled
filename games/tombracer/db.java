/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vg implements fo, ffa, gma, noa, qn {
    private int field_n;
    private la field_m;
    private int field_p;
    static vna field_f;
    static mp field_h;
    static String field_j;
    static int field_l;
    private int field_r;
    private vna field_k;
    private int field_g;
    private int field_q;
    static jea field_s;
    private bca field_o;
    private boolean field_i;

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            int discarded$0 = ((db) this).g(25);
            return 0;
        }
        return 0;
    }

    private final void t(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var4 = (dg) (Object) ((db) this).field_k.f(-80);
        while (var4 != null) {
            var4.i((byte) -30);
            var4 = (dg) (Object) ((db) this).field_k.e(param0 ^ 112);
        }
        if (param0 != 0) {
            ((db) this).field_o = null;
        }
        ((db) this).field_k.d(param0 + 8);
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            boolean discarded$0 = ((db) this).j(-31);
        }
        return ((db) this).field_g;
    }

    public final boolean a(int param0, gma param1) {
        if (param0 >= -77) {
            return true;
        }
        return false;
    }

    final void a(uw param0, byte param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = -41 % ((param1 - 62) / 37);
        if (this.r(24269)) {
            param0.a(9, (fo) this, (byte) -33);
        }
        dg var4 = (dg) (Object) ((db) this).field_k.f(-80);
        while (var4 != null) {
            var4.a(param0, 111);
            var4 = (dg) (Object) ((db) this).field_k.e(124);
        }
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            int discarded$0 = ((db) this).g(-111);
            return 0;
        }
        return 0;
    }

    public final boolean a(int param0) {
        int var2 = -91 / ((param0 - 6) / 46);
        return true;
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            field_s = null;
        }
        return ((db) this).field_p;
    }

    public final void a(int param0, iq param1) {
        if (param0 < 103) {
            int discarded$0 = ((db) this).a((byte) -57);
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            Object var3 = null;
            int discarded$0 = ((db) this).a((up) null, (ep) null, 117);
        }
    }

    public final boolean b(boolean param0) {
        if (!param0) {
            ((db) this).field_m = null;
            return false;
        }
        return false;
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            Object var3 = null;
            boolean discarded$0 = ((db) this).a(69, (gma) null);
        }
        return ((db) this).field_r;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            int discarded$0 = ((db) this).i(29);
        }
        return ((db) this).field_q;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 <= 68) {
            field_h = null;
            return false;
        }
        return false;
    }

    public final boolean l(int param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = null;
            this.a((dg) null, false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((db) this).field_m.o((byte) -82)) {
              break L2;
            } else {
              if (((db) this).b(((db) this).field_m.i(param0 ^ 6029), 1569)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, la param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        param1.field_u.a((ffa) this, (byte) 105);
        if (param0 > -74) {
            ((db) this).field_k = null;
        }
        ((db) this).field_p = param1.m((byte) -86) / 2 - (((db) this).field_p - param1.m((byte) -86) / 2);
        param1.field_u.b((ffa) this, 7073);
        dg var5 = (dg) (Object) ((db) this).field_k.f(-80);
        while (var5 != null) {
            var5.h(61);
            var5 = (dg) (Object) ((db) this).field_k.e(108);
        }
    }

    public final int a(up param0, ep param1, int param2) {
        if (param2 >= -97) {
            return -79;
        }
        return 0;
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            ((db) this).field_n = -92;
            return false;
        }
        return false;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        if (param0 != -1) {
            field_s = null;
        }
        int var5 = eha.a(((db) this).field_g, 12, ((db) this).field_r, ((db) this).field_q, param3, ((db) this).field_p, 2);
        if (0 == (var5 ^ -1)) {
            return false;
        }
        int var6 = wm.a(4096, var5, param0 + -59);
        param3.a(var6, (byte) 47);
        return true;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        if (!(this != (Object) (Object) param1)) {
            return false;
        }
        if (!(4 >= param7)) {
            return false;
        }
        if (param2 <= 55) {
            return true;
        }
        return ((db) this).a((byte) 110, param4, param6, param0, param3);
    }

    public final boolean a(gma param0, int param1) {
        if (param1 != 0) {
            boolean discarded$0 = ((db) this).j(-123);
            return false;
        }
        return false;
    }

    final void c(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var4 = (dg) (Object) ((db) this).field_k.f(-80);
        while (var4 != null) {
            var4.e(-41);
            var4 = (dg) (Object) ((db) this).field_k.e(118);
        }
        if (!param0) {
            ((db) this).field_i = false;
        }
    }

    final void a(boolean param0, kh param1) {
        dg var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        param1.a((byte) -1, ((db) this).field_p / 1048576, 7);
        param1.a((byte) -8, ((db) this).field_r / 1048576, 7);
        param1.a((byte) 74, ((db) this).field_g / 2097152, 6);
        param1.a((byte) -7, ((db) this).field_q / 2097152, 6);
        if (!param0) {
            ((db) this).field_i = false;
        }
        if ((((db) this).field_m.field_E ^ -1) <= -10) {
            param1.a((byte) -36, ((db) this).field_k.a((byte) -16), 2);
            var5 = (dg) (Object) ((db) this).field_k.f(-80);
            while (var5 != null) {
                rm.field_a.a(15682, param1, var5);
                var5 = (dg) (Object) ((db) this).field_k.e(127);
            }
        }
        ((db) this).field_o.a((byte) -79, param1);
    }

    public final int b(int param0) {
        int var2 = -5 / ((1 - param0) / 45);
        return 0;
    }

    private final void n(int param0) {
        this.t(0);
        if (param0 != -8195) {
            return;
        }
        this.a(rm.field_a.a((gr) null, (gma) this, -116), true);
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            field_f = null;
            return 0;
        }
        return 0;
    }

    public final int a(up param0, int param1, pc param2) {
        if (param1 != 12) {
            return -101;
        }
        return 0;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          ((db) this).field_m.field_u.a((ffa) this, (byte) 104);
          ((db) this).field_p = ((db) this).field_p + param1;
          ((db) this).field_r = ((db) this).field_r + param1;
          var3 = -(((db) this).field_g / 2) + ((db) this).field_p;
          var4 = -(((db) this).field_q / 2) + ((db) this).field_r;
          if (param0 < -122) {
            break L0;
          } else {
            int discarded$1 = ((db) this).c((byte) 50);
            break L0;
          }
        }
        L1: {
          var5 = ((db) this).field_g / 2 + ((db) this).field_p;
          var6 = ((db) this).field_q / 2 + ((db) this).field_r;
          if (param1 >= var4) {
            var4 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var3 > param1) {
            break L2;
          } else {
            var3 = 0;
            break L2;
          }
        }
        L3: {
          var7 = ((db) this).field_m.m((byte) -86);
          var8 = ((db) this).field_m.s(34);
          if (-param1 + var7 <= var5) {
            var5 = var7;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          ((db) this).field_p = (var5 + -var3) / 2 + var3;
          if (var6 < var8 + -param1) {
            break L4;
          } else {
            var6 = var8;
            break L4;
          }
        }
        ((db) this).field_q = var6 - var4;
        ((db) this).field_r = (var6 + -var4) / 2 + var4;
        ((db) this).field_g = -var3 + var5;
        ((db) this).field_m.field_u.b((ffa) this, 7073);
    }

    public static void h(byte param0) {
        field_h = null;
        field_j = null;
        field_s = null;
        if (param0 >= -22) {
            return;
        }
        field_f = null;
    }

    private final boolean r(int param0) {
        if (param0 != 24269) {
            boolean discarded$0 = ((db) this).a(58, true, 114, 87, -117, -85);
        }
        return ((db) this).field_m.o((byte) -82);
    }

    public final int a(boolean param0) {
        if (!param0) {
            ((db) this).field_q = -83;
        }
        return 5 + 5 * ((db) this).field_n;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
            return -56;
        }
        return ((db) this).field_r;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
            ((db) this).a(82, -58);
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = -80 % ((param0 - -23) / 53);
        return ((db) this).field_p;
    }

    public final la f(byte param0) {
        int var2 = 110 / ((param0 - 0) / 61);
        return ((db) this).field_m;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
            return false;
        }
        return io.a(param4, ((db) this).e(9648), (byte) -80, param3, ((db) this).d(3), param1, ((db) this).field_q, ((db) this).field_g, param2);
    }

    final void s(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var2 = (dg) (Object) ((db) this).field_k.f(-80);
        if (param0 != 0) {
            ((db) this).field_p = 88;
        }
        while (var2 != null) {
            var2.d(-1);
            var2 = (dg) (Object) ((db) this).field_k.e(124);
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            field_h = null;
            return false;
        }
        return false;
    }

    final void a(byte param0, uw param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(!this.r(24269))) {
            param1.a((byte) -106, 9, (fo) this);
        }
        if (param0 <= 6) {
            return;
        }
        dg var5 = (dg) (Object) ((db) this).field_k.f(-80);
        while (var5 != null) {
            var5.b(0, param1);
            var5 = (dg) (Object) ((db) this).field_k.e(112);
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            Object var4 = null;
            this.a((dg) null, true);
        }
        return false;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            field_l = 26;
            return 0;
        }
        return 0;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 1569) {
            Object var4 = null;
            boolean discarded$0 = ((db) this).a((gma) null, -24);
        }
        return ((db) this).field_o.a(param0, 14530);
    }

    final void m(int param0) {
        if (!(!((db) this).field_i)) {
            return;
        }
        ((db) this).field_i = true;
        this.t(param0);
    }

    private final void a(dg param0, boolean param1) {
        if (!(param0 != null)) {
            return;
        }
        ((db) this).field_k.b((byte) -73, (vg) (Object) param0);
        if (!param1) {
            ((db) this).field_r = -69;
        }
        param0.a((gr) null, (gma) this, (byte) 36);
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
            return false;
        }
        return false;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            ((db) this).field_g = -15;
        }
        return ((db) this).field_r;
    }

    public final int d(int param0) {
        if (param0 != 3) {
            return -6;
        }
        return ((db) this).field_p;
    }

    db(la param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        dg var5 = null;
        L0: {
          ((db) this).field_k = new vna();
          ((db) this).field_o = new bca();
          ((db) this).field_i = false;
          ((db) this).field_m = param0;
          if (-21 > (param0.field_E ^ -1)) {
            ((db) this).field_p = 1048576 * param1.b((byte) 44, 7);
            ((db) this).field_r = param1.b((byte) 44, 7) * 1048576;
            ((db) this).field_g = param1.b((byte) 44, 6) * 2097152;
            ((db) this).field_q = param1.b((byte) 44, 6) * 2097152;
            break L0;
          } else {
            ((db) this).field_p = param1.b((byte) 44, 12) << 1304186320;
            ((db) this).field_r = param1.b((byte) 44, 12) << -1070925264;
            ((db) this).field_q = param1.b((byte) 44, 10) << 475970320;
            ((db) this).field_g = param1.b((byte) 44, 10) << 1636956496;
            break L0;
          }
        }
        L1: {
          if (8 >= param0.field_E) {
            this.n(-8195);
            break L1;
          } else {
            var3 = param1.b((byte) 44, 2);
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3) {
                break L1;
              } else {
                var5 = rm.field_a.a(param0, param1, false);
                this.a(var5, true);
                var4++;
                continue L2;
              }
            }
          }
        }
        ((db) this).field_o = new bca(param0.field_E, param1);
        fi.field_c = fi.field_c + 1;
        ((db) this).field_n = fi.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_j = "Unable to add friend - system busy";
        field_l = 5;
        field_h = new mp();
    }
}
