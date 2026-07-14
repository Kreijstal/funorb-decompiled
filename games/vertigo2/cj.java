/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class cj extends iq implements dq {
    nj field_C;
    static int field_D;

    boolean a(char param0, int param1, int param2, iq param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        vp var8 = new vp(((cj) this).field_C);
        if (param1 != 13) {
            ((cj) this).field_C = null;
        }
        iq var6_ref_iq = (iq) (Object) var8.d(param1 + -9);
        while (var6_ref_iq != null) {
            // ifeq L108
            if (var6_ref_iq.f(102)) {
                if (!(!var6_ref_iq.a(param0, param1 ^ 0, param2, param3))) {
                    return true;
                }
            }
            var6_ref_iq = (iq) (Object) var8.c(2);
        }
        int var6 = param2;
        if ((var6 ^ -1) != -81) {
            return false;
        }
        return cr.field_eb[81] ? ((cj) this).a(32345, param3) : ((cj) this).b((byte) -89, param3);
    }

    final void d(byte param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(((cj) this).field_C);
        if (param0 != 2) {
            field_D = 47;
        }
        iq var3 = (iq) (Object) var2.d(param0 ^ 6);
        while (var3 != null) {
            var3.d((byte) 2);
            var3 = (iq) (Object) var2.c(param0 + 0);
        }
    }

    String a(boolean param0) {
        vp var2 = null;
        iq var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            iq discarded$2 = ((cj) this).b(true);
            break L0;
          }
        }
        var2 = new vp(((cj) this).field_C);
        var3 = (iq) (Object) var2.d(4);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.a(false);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (iq) (Object) var2.c(2);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean b(byte param0, iq param1) {
        vp var5 = null;
        iq var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (((cj) this).field_C.a(false)) {
            return false;
        }
        vp var3 = new vp(((cj) this).field_C);
        iq var4 = (iq) (Object) var3.d(4);
        while (var4 != null) {
            if (var4.f(34)) {
                var5 = new vp(((cj) this).field_C);
                li discarded$0 = var5.a(-108, (li) (Object) var4);
                var6 = (iq) (Object) var5.c(2);
                while (var6 != null) {
                    if (var6.a((byte) 116, param1)) {
                        return true;
                    }
                    var6 = (iq) (Object) var5.c(2);
                }
            }
            var4 = (iq) (Object) var3.c(2);
        }
        if (param0 >= -63) {
            iq discarded$1 = ((cj) this).b(false);
            return false;
        }
        return false;
    }

    private final void h(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(((cj) this).field_C);
        if (param0 != -641) {
            ((cj) this).field_C = null;
        }
        iq var3 = (iq) (Object) var2.d(4);
        while (var3 != null) {
            var3.g(param0 + 553);
            var3 = (iq) (Object) var2.c(param0 + 643);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        int var11 = Vertigo2.field_L ? 1 : 0;
        vp var8 = new vp(((cj) this).field_C);
        iq var9 = (iq) (Object) var8.d(4);
        while (var9 != null) {
            // ifeq L92
            if (var9.f(61)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, (byte) -123, param6))) {
                    return true;
                }
            }
            var9 = (iq) (Object) var8.c(2);
        }
        int var10 = 39 % ((-87 - param5) / 35);
        return false;
    }

    cj(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
        ((cj) this).field_C = new nj();
    }

    final boolean f(int param0) {
        if (param0 < 3) {
            ((cj) this).a(true, 15, -89, 98);
        }
        return null != ((cj) this).b(true) ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        vp var3 = new vp(((cj) this).field_C);
        iq var4 = (iq) (Object) var3.d(4);
        if (param0 > -97) {
            Object var7 = null;
            ((cj) this).a((byte) 126, 47, 97, (iq) null);
        }
        while (var4 != null) {
            var5 = var4.c((byte) -121);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (iq) (Object) var3.c(2);
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var10 = Vertigo2.field_L ? 1 : 0;
        if (param5 > -107) {
            Object var11 = null;
            boolean discarded$0 = ((cj) this).a(77, -56, -46, (iq) null, 32, (byte) 26, 97);
        }
        vp var12 = new vp(((cj) this).field_C);
        iq var9 = (iq) (Object) var12.d(4);
        while (var9 != null) {
            // ifeq L127
            if (!(!var9.a(param0, param1 - -((cj) this).field_o, param2 + ((cj) this).field_t, param3, param4, (byte) -108, param6))) {
                return true;
            }
            var9 = (iq) (Object) var12.c(2);
        }
        return false;
    }

    void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(-641);
    }

    private final void a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        int var7 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        vp var5 = new vp(((cj) this).field_C);
        if (param1) {
            return;
        }
        iq var6 = (iq) (Object) var5.d(4);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param0 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3, 1 + param0, (byte) -79, param2);
            var6 = (iq) (Object) var5.c(2);
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 46) {
            return;
        }
        vp var7 = new vp(((cj) this).field_C);
        iq var8 = (iq) (Object) var7.d(4);
        while (var8 != null) {
            // ifeq L94
            var8.a(param0, (byte) 46, param2 - -((cj) this).field_o, ((cj) this).field_t + param3, param4, param5);
            var8 = (iq) (Object) var7.c(param1 + -44);
        }
    }

    final boolean a(int param0, iq param1) {
        vp var5 = null;
        iq var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (!(!((cj) this).field_C.a(false))) {
            return false;
        }
        vp var8 = new vp(((cj) this).field_C);
        if (param0 != 32345) {
            ((cj) this).field_C = null;
        }
        iq var4 = (iq) (Object) var8.b(param0 + -32341);
        while (var4 != null) {
            if (var4.f(85)) {
                var5 = new vp(((cj) this).field_C);
                li discarded$0 = var5.a((li) (Object) var4, param0 + -32342);
                var6 = (iq) (Object) var5.a((byte) 76);
                while (var6 != null) {
                    if (var6.a((byte) 116, param1)) {
                        return true;
                    }
                    var6 = (iq) (Object) var5.a((byte) 121);
                }
            }
            var4 = (iq) (Object) var8.a((byte) 101);
        }
        return false;
    }

    final void c(byte param0, iq param1) {
        int var3 = 36 / ((param0 - 35) / 38);
        ((cj) this).field_C.a((li) (Object) param1, false);
    }

    iq b(boolean param0) {
        vp var2 = null;
        iq var3 = null;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            String discarded$2 = ((cj) this).a(false);
            break L0;
          }
        }
        var2 = new vp(((cj) this).field_C);
        var3 = (iq) (Object) var2.d(4);
        L1: while (true) {
          if (var3 != null) {
            if (var3.f(93)) {
              return var3;
            } else {
              var3 = (iq) (Object) var2.c(2);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (-1 == (param1 ^ -1)) {
            if (!(((cj) this).field_B == null)) {
                ((cj) this).field_B.a(true, param2, true, (iq) this, param3);
            }
        }
        vp var5 = new vp(((cj) this).field_C);
        if (param0) {
            ((cj) this).a(true, 10, -73, -106);
        }
        iq var6 = (iq) (Object) var5.b(4);
        while (var6 != null) {
            var6.a(false, param1, param2 - -((cj) this).field_o, ((cj) this).field_t + param3);
            var6 = (iq) (Object) var5.a((byte) 15);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (!(!((cj) this).a(param3, param2 ^ 78, param1, param0))) {
            ((cj) this).a(param0, param3, true, param1);
            this.a(param1, false, param3, param0);
        }
        if (param2 != -79) {
            return null;
        }
        return param3;
    }

    void a(byte param0, int param1, int param2, iq param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        super.a((byte) 66, param1, param2, param3);
        vp var5 = new vp(((cj) this).field_C);
        if (param0 <= 6) {
            Object var8 = null;
            boolean discarded$0 = ((cj) this).b((byte) 25, (iq) null);
        }
        iq var6 = (iq) (Object) var5.d(4);
        while (var6 != null) {
            // ifeq L112
            var6.a((byte) 73, param1 + ((cj) this).field_o, ((cj) this).field_t + param2, param3);
            var6 = (iq) (Object) var5.c(2);
        }
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        if (!pm.field_a) {
            return;
        }
        ql.field_L.a(0, param0);
        int var4 = ji.field_n.l(0) ? 1 : 0;
        if (param1 != (kf.field_c ^ -1)) {
            if (!(var4 != 0)) {
                param0 = false;
                on.a(9110);
            }
        }
        if (param0) {
            ji.field_n.a(param2, 538, param3);
        }
        if (!(var4 == 0)) {
            ql.field_L.a(0, param0);
        }
        int var5 = ji.field_n.k(12282) + ji.field_n.field_ob;
        if (-641 > (var5 ^ -1)) {
            gr.field_Y = gr.field_Y + 5;
        } else {
            if (635 > var5) {
                if (!(0 >= gr.field_Y)) {
                    gr.field_Y = gr.field_Y - 5;
                }
            }
        }
    }

    final boolean a(byte param0, iq param1) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 116) {
            return true;
        }
        vp var3 = new vp(((cj) this).field_C);
        iq var4 = (iq) (Object) var3.d(param0 + -112);
        while (var4 != null) {
            if (!(!var4.a((byte) 116, param1))) {
                return true;
            }
            var4 = (iq) (Object) var3.c(2);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 100;
    }
}
