/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dqa extends shb implements nea {
    ij field_t;
    static String field_u;

    boolean e(byte param0) {
        if (param0 != -120) {
            Object var3 = null;
            boolean discarded$0 = ((dqa) this).a((shb) null, -32);
        }
        return null != ((dqa) this).g((byte) -123) ? true : false;
    }

    final boolean a(boolean param0, shb param1) {
        wc var5 = null;
        shb var6 = null;
        int var7 = VoidHunters.field_G;
        if (!param0) {
            dqa.b(false);
        }
        if (((dqa) this).field_t.b(115)) {
            return false;
        }
        wc var3 = new wc(((dqa) this).field_t);
        shb var4 = (shb) (Object) var3.c(570);
        while (var4 != null) {
            if (var4.e((byte) -120)) {
                var5 = new wc(((dqa) this).field_t);
                ksa discarded$0 = var5.a((ksa) (Object) var4, -28791);
                var6 = (shb) (Object) var5.a(19072);
                while (var6 != null) {
                    if (!(!var6.a(0, param1))) {
                        return true;
                    }
                    var6 = (shb) (Object) var5.a(19072);
                }
            }
            var4 = (shb) (Object) var3.a(19072);
        }
        return false;
    }

    void b(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (param1 == 0) {
            if (!(null == ((dqa) this).field_q)) {
                ((dqa) this).field_q.a(13, (shb) this, param0, param3, true);
            }
        }
        wc var5 = new wc(((dqa) this).field_t);
        if (param2 < 47) {
            return;
        }
        shb var6 = (shb) (Object) var5.b((byte) 105);
        while (var6 != null) {
            var6.b(param0 - -((dqa) this).field_g, param1, 112, param3 + ((dqa) this).field_r);
            var6 = (shb) (Object) var5.a((byte) 108);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        int var10 = VoidHunters.field_G;
        int var8 = -69 % ((param0 - 52) / 52);
        wc var7 = new wc(((dqa) this).field_t);
        shb var9 = (shb) (Object) var7.c(570);
        while (var9 != null) {
            // ifeq L100
            var9.a((byte) -109, param1 - -((dqa) this).field_g, param2, ((dqa) this).field_r + param3, param4, param5);
            var9 = (shb) (Object) var7.a(19072);
        }
    }

    void f(byte param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(((dqa) this).field_t);
        shb var3 = (shb) (Object) var2.c(570);
        while (var3 != null) {
            var3.f((byte) -34);
            var3 = (shb) (Object) var2.a(param0 ^ -19106);
        }
        if (param0 != -34) {
            field_u = null;
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (param0) {
            field_u = null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var10 = VoidHunters.field_G;
        wc var8 = new wc(((dqa) this).field_t);
        shb var9 = (shb) (Object) var8.c(570);
        while (var9 != null) {
            // ifeq L98
            if (!(!var9.a(param0, param1 - -((dqa) this).field_g, param2, param3, param4, param5 - -((dqa) this).field_r, (byte) -61))) {
                return true;
            }
            var9 = (shb) (Object) var8.a(19072);
        }
        if (param6 > -17) {
            String discarded$0 = ((dqa) this).d((byte) -101);
            return false;
        }
        return false;
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = param0;
        wc var3 = new wc(((dqa) this).field_t);
        shb var4 = (shb) (Object) var3.c(570);
        while (var4 != null) {
            var5 = var4.c(param0 ^ 0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (shb) (Object) var3.a(19072);
        }
        return var2;
    }

    dqa(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4, (sba) null);
        ((dqa) this).field_t = new ij();
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h((byte) 13);
    }

    String d(byte param0) {
        String var4 = null;
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(((dqa) this).field_t);
        shb var3 = (shb) (Object) var2.c(570);
        while (var3 != null) {
            var4 = var3.d((byte) 125);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (shb) (Object) var2.a(19072);
        }
        if (param0 == 125) {
            return null;
        }
        ((dqa) this).field_t = null;
        return null;
    }

    final static void a(int param0, boolean param1, boolean param2, oib param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          nfa.field_e[0] = jeb.field_b.nextInt();
          nfa.field_e[1] = jeb.field_b.nextInt();
          nfa.field_e[2] = (int)(iqb.field_p >> -1292461600);
          ss.field_p.field_e = 0;
          nfa.field_e[3] = (int)iqb.field_p;
          ss.field_p.d(nfa.field_e[0], 332614536);
          ss.field_p.d(nfa.field_e[1], 332614536);
          ss.field_p.d(nfa.field_e[2], 332614536);
          ss.field_p.d(nfa.field_e[3], 332614536);
          nq.a((byte) -91, ss.field_p);
          ss.field_p.a(param4, true);
          param3.a(ss.field_p, -26216);
          dpa.field_p.field_e = 0;
          if (!param2) {
            dpa.field_p.c(0, 16);
            break L0;
          } else {
            dpa.field_p.c(0, 18);
            break L0;
          }
        }
        L1: {
          dpa.field_p.field_e = dpa.field_p.field_e + 2;
          var5 = dpa.field_p.field_e;
          dpa.field_p.d(fk.field_c, 332614536);
          dpa.field_p.a(rda.field_o, 90);
          var6 = 0;
          if (bua.field_o) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!js.field_q) {
            break L2;
          } else {
            var6 = var6 | 4;
            break L2;
          }
        }
        L3: {
          if (param1) {
            var6 = var6 | 8;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (vda.field_o == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          dpa.field_p.c(0, var6);
          var7 = kh.a(-6465, vpa.b((byte) -121));
          if (var7 == null) {
            var7 = "";
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 < -64) {
            break L6;
          } else {
            field_u = null;
            break L6;
          }
        }
        L7: {
          dpa.field_p.a(true, var7);
          if (vda.field_o == null) {
            break L7;
          } else {
            dpa.field_p.b((byte) 0, vda.field_o);
            break L7;
          }
        }
        ufa.a((ds) (Object) dpa.field_p, (byte) -126, jnb.field_p, bib.field_g, ss.field_p);
        dpa.field_p.a(dpa.field_p.field_e - var5, -125);
        lnb.b(-1, 111);
    }

    final void b(int param0, shb param1) {
        ((dqa) this).field_t.b(-10258, (ksa) (Object) param1);
        if (param0 != -18756) {
            ((dqa) this).field_t = null;
        }
    }

    private final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        wc var5 = new wc(((dqa) this).field_t);
        shb var6 = (shb) (Object) var5.c(570);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(false, param0, 1 + param3, param2);
            var6 = (shb) (Object) var5.a(19072);
        }
        if (param1 >= -8) {
            Object var9 = null;
            boolean discarded$3 = ((dqa) this).a(false, (shb) null);
        }
    }

    boolean a(int param0, shb param1) {
        int var5 = VoidHunters.field_G;
        if (param0 != 0) {
            return true;
        }
        wc var3 = new wc(((dqa) this).field_t);
        shb var4 = (shb) (Object) var3.c(570);
        while (var4 != null) {
            if (!(!var4.a(param0 ^ 0, param1))) {
                return true;
            }
            var4 = (shb) (Object) var3.a(param0 + 19072);
        }
        return false;
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        int var7 = VoidHunters.field_G;
        wc var8 = new wc(((dqa) this).field_t);
        shb var6_ref_shb = (shb) (Object) var8.c(570);
        while (var6_ref_shb != null) {
            // ifeq L94
            if (var6_ref_shb.e((byte) -120)) {
                if (!(!var6_ref_shb.a(param0 ^ 0, param1, param2, param3))) {
                    return true;
                }
            }
            var6_ref_shb = (shb) (Object) var8.a(param0 + 34906);
        }
        if (param0 != -15834) {
            ((dqa) this).field_t = null;
        }
        int var6 = param1;
        if ((var6 ^ -1) != -81) {
            return false;
        }
        return si.field_o[81] ? ((dqa) this).a(param2, 0) : ((dqa) this).a(true, param2);
    }

    private final void h(byte param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 13) {
            return;
        }
        wc var2 = new wc(((dqa) this).field_t);
        shb var3 = (shb) (Object) var2.c(570);
        while (var3 != null) {
            var3.a(false);
            var3 = (shb) (Object) var2.a(param0 + 19059);
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        int var7 = VoidHunters.field_G;
        super.a(param0, param1, param2 + 0, param3);
        wc var5 = new wc(((dqa) this).field_t);
        shb var6 = (shb) (Object) var5.c(param2 + 1551);
        while (var6 != null) {
            // ifeq L98
            var6.a(((dqa) this).field_r + param0, param1 - -((dqa) this).field_g, -981, param3);
            var6 = (shb) (Object) var5.a(19072);
        }
        if (param2 != -981) {
            Object var8 = null;
            boolean discarded$0 = ((dqa) this).a(-120, 53, 71, (shb) null, 57, 10, 54);
        }
    }

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((dqa) this).a(param1, param2, (byte) 123, param3)) {
            ((dqa) this).a(90, param2, param1, param3);
            this.a(param1, (byte) -89, param3, param2);
        }
        if (param0) {
            boolean discarded$0 = ((dqa) this).e((byte) -25);
        }
        return param3;
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        int var10 = VoidHunters.field_G;
        if (param1 != -6006) {
            return true;
        }
        wc var8 = new wc(((dqa) this).field_t);
        shb var9 = (shb) (Object) var8.c(570);
        while (var9 != null) {
            // ifeq L107
            if (var9.e((byte) -120)) {
                if (!(!var9.a(param0, -6006, param2, param3, param4, param5, param6))) {
                    return true;
                }
            }
            var9 = (shb) (Object) var8.a(19072);
        }
        return false;
    }

    shb g(byte param0) {
        wc var2 = null;
        shb var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 <= -3) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ((dqa) this).a(5, -105, 25, 32, (shb) null, 72, (byte) 42);
            break L0;
          }
        }
        var2 = new wc(((dqa) this).field_t);
        var3 = (shb) (Object) var2.c(570);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e((byte) -120)) {
              var3 = (shb) (Object) var2.a(19072);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(shb param0, int param1) {
        wc var5 = null;
        shb var6 = null;
        int var7 = VoidHunters.field_G;
        if (param1 != 0) {
            return false;
        }
        if (((dqa) this).field_t.b(param1 ^ 113)) {
            return false;
        }
        wc var3 = new wc(((dqa) this).field_t);
        shb var4 = (shb) (Object) var3.b((byte) 70);
        while (var4 != null) {
            if (var4.e((byte) -120)) {
                var5 = new wc(((dqa) this).field_t);
                ksa discarded$0 = var5.a((byte) 88, (ksa) (Object) var4);
                var6 = (shb) (Object) var5.a((byte) 108);
                while (var6 != null) {
                    if (var6.a(0, param0)) {
                        return true;
                    }
                    var6 = (shb) (Object) var5.a((byte) 108);
                }
            }
            var4 = (shb) (Object) var3.a((byte) 108);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Play the game without logging in just yet";
    }
}
