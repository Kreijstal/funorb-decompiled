/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pe extends ub implements bg {
    static String[] field_z;
    oi field_A;
    static int field_B;
    static long field_D;
    static md field_y;
    static int[] field_C;

    final void a(ub param0, byte param1) {
        if (param1 <= 15) {
            field_y = null;
        }
        ((pe) this).field_A.a((wl) (Object) param0, false);
    }

    private final void b(int param0, int param1, Hashtable param2, StringBuilder param3) {
        int var8 = 0;
        int var9 = wizardrun.field_H;
        int var6 = -90 % ((param1 - 30) / 43);
        pf var5 = new pf(((pe) this).field_A);
        ub var7 = (ub) (Object) var5.a((byte) 31);
        while (var7 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var8 = 0; param0 >= var8; var8++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var7.a(param2, (byte) 102, 1 + param0, param3);
            var7 = (ub) (Object) var5.b(35);
        }
    }

    public static void a(byte param0) {
        if (param0 > -23) {
            field_z = null;
        }
        field_z = null;
        field_y = null;
        field_C = null;
    }

    final void b(boolean param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(((pe) this).field_A);
        if (param0) {
            field_B = -77;
        }
        ub var3 = (ub) (Object) var2.a((byte) 31);
        while (var3 != null) {
            var3.b(param0);
            var3 = (ub) (Object) var2.b(35);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = wizardrun.field_H;
        if (param2 == 0) {
            if (!(((pe) this).field_w == null)) {
                ((pe) this).field_w.a(param0, param3, (ub) this, true, true);
            }
        }
        pf var5 = new pf(((pe) this).field_A);
        ub var6 = (ub) (Object) var5.b((byte) 103);
        while (var6 != null) {
            var6.a(param0 - -((pe) this).field_o, 0, param2, param3 + ((pe) this).field_l);
            var6 = (ub) (Object) var5.a(true);
        }
        if (param1 != 0) {
            Object var8 = null;
            this.b(67, 85, (Hashtable) null, (StringBuilder) null);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = wizardrun.field_H;
        ed.f(param4, param2, 1 + param3, 10000536);
        if (param1 != -14) {
            return;
        }
        ed.f(param4, param0 + param2, 1 + param3, 12105912);
        int var5 = 1;
        int var6 = param0;
        if (!(param2 - -var5 >= ed.field_i)) {
            var5 = ed.field_i + -param2;
        }
        if (var6 + param2 > ed.field_b) {
            var6 = -param2 + ed.field_b;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = var7 * 48 / param0 + 152;
            var9 = var8 << 112111600 | var8 << 474831688 | var8;
            ed.field_k[param4 + ed.field_h * (param2 - -var7)] = var9;
            ed.field_k[param3 + (param4 + ed.field_h * (var7 + param2))] = var9;
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (param1 != 102) {
            field_y = null;
        }
        if (((pe) this).a(param3, param0, param2, true)) {
            ((pe) this).a(83, param2, param0, param3);
            this.b(param2, -21, param0, param3);
        }
        return param3;
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 152) {
            return null;
        }
        if (null != he.field_u) {
            return (java.awt.Container) (Object) he.field_u;
        }
        return (java.awt.Container) (Object) jg.f(1);
    }

    final boolean b(ub param0, int param1) {
        pf var5 = null;
        ub var6 = null;
        int var7 = wizardrun.field_H;
        if (((pe) this).field_A.f(8192)) {
            return false;
        }
        if (param1 != 1) {
            field_D = -109L;
        }
        pf var3 = new pf(((pe) this).field_A);
        ub var4 = (ub) (Object) var3.a((byte) 31);
        while (var4 != null) {
            if (var4.d((byte) 53)) {
                var5 = new pf(((pe) this).field_A);
                wl discarded$0 = var5.a((wl) (Object) var4, -79);
                var6 = (ub) (Object) var5.b(35);
                while (var6 != null) {
                    if (var6.a(param0, param1 ^ 9)) {
                        return true;
                    }
                    var6 = (ub) (Object) var5.b(35);
                }
            }
            var4 = (ub) (Object) var3.b(35);
        }
        return false;
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        int var7 = wizardrun.field_H;
        pf var8 = new pf(((pe) this).field_A);
        ub var9 = (ub) (Object) var8.a((byte) 31);
        if (param2 > -96) {
            field_z = null;
        }
        while (var9 != null) {
            // ifeq L105
            if (var9.d((byte) 53)) {
                if (!(!var9.a(param0, param1, (byte) -126, param3))) {
                    return true;
                }
            }
            var9 = (ub) (Object) var8.b(35);
        }
        int var6 = param1;
        if (var6 == 80) {
            return hi.field_p[81] ? ((pe) this).a((byte) -117, param3) : ((pe) this).b(param3, 1);
        }
        return false;
    }

    void a(int param0, int param1, int param2, ub param3) {
        int var7 = wizardrun.field_H;
        super.a(param0, param1, param2, param3);
        pf var5 = new pf(((pe) this).field_A);
        ub var6 = (ub) (Object) var5.a((byte) 31);
        while (var6 != null) {
            // ifeq L90
            var6.a(10000536, ((pe) this).field_l + param1, ((pe) this).field_o + param2, param3);
            var6 = (ub) (Object) var5.b(35);
        }
    }

    final boolean a(byte param0, ub param1) {
        pf var5 = null;
        ub var6 = null;
        int var7 = wizardrun.field_H;
        if (((pe) this).field_A.f(8192)) {
            return false;
        }
        pf var3 = new pf(((pe) this).field_A);
        if (param0 != -117) {
            return false;
        }
        ub var4 = (ub) (Object) var3.b((byte) 51);
        while (var4 != null) {
            if (!(!var4.d((byte) 53))) {
                var5 = new pf(((pe) this).field_A);
                wl discarded$0 = var5.a(-80, (wl) (Object) var4);
                var6 = (ub) (Object) var5.a(true);
                while (var6 != null) {
                    if (var6.a(param1, param0 ^ -125)) {
                        return true;
                    }
                    var6 = (ub) (Object) var5.a(true);
                }
            }
            var4 = (ub) (Object) var3.a(true);
        }
        return false;
    }

    final static o[] a(String param0, kl param1, String param2, int param3) {
        int var4 = param1.b(-1, param0);
        int var5 = param1.a(var4, param2, -11986);
        if (param3 < 86) {
            field_B = -113;
        }
        return cf.a(var4, 30736, param1, var5);
    }

    pe(int param0, int param1, int param2, int param3, bf param4) {
        super(param0, param1, param2, param3, param4, (ce) null);
        ((pe) this).field_A = new oi();
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var11 = wizardrun.field_H;
        pf var8 = new pf(((pe) this).field_A);
        int var9 = 18 % ((param1 - 12) / 36);
        ub var10 = (ub) (Object) var8.a((byte) 31);
        while (var10 != null) {
            // ifeq L107
            if (!(!var10.a(((pe) this).field_o + param0, (byte) 83, param2, ((pe) this).field_l + param3, param4, param5, param6))) {
                return true;
            }
            var10 = (ub) (Object) var8.b(35);
        }
        return false;
    }

    final String c(boolean param0) {
        pf var2 = null;
        ub var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = wizardrun.field_H;
        if (!param0) {
          var2 = new pf(((pe) this).field_A);
          var3 = (ub) (Object) var2.a((byte) 31);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c(false);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (ub) (Object) var2.b(35);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        int var9 = wizardrun.field_H;
        pf var7 = new pf(((pe) this).field_A);
        if (param5 != 0) {
            ((pe) this).field_A = null;
        }
        ub var8 = (ub) (Object) var7.a((byte) 31);
        while (var8 != null) {
            // ifeq L102
            var8.a(((pe) this).field_o + param0, param1, ((pe) this).field_l + param2, param3, param4, param5 ^ 0);
            var8 = (ub) (Object) var7.b(35);
        }
    }

    private final void f(int param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(((pe) this).field_A);
        ub var3 = (ub) (Object) var2.a((byte) 31);
        while (var3 != null) {
            var3.c(param0 ^ 124);
            var3 = (ub) (Object) var2.b(35);
        }
        if (param0 != 1) {
            Object var5 = null;
            ((pe) this).a(-40, 28, -74, -73, (ub) null, -112);
        }
    }

    ub d(int param0) {
        pf var2 = null;
        ub var3 = null;
        int var4 = 0;
        L0: {
          var4 = wizardrun.field_H;
          var2 = new pf(((pe) this).field_A);
          if (param0 == -16) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        var3 = (ub) (Object) var2.a((byte) 31);
        L1: while (true) {
          if (var3 != null) {
            if (var3.d((byte) 53)) {
              return var3;
            } else {
              var3 = (ub) (Object) var2.b(35);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = wizardrun.field_H;
        pf var12 = new pf(((pe) this).field_A);
        ub var9 = (ub) (Object) var12.a((byte) 31);
        while (var9 != null) {
            // ifeq L93
            if (var9.d((byte) 53)) {
                if (var9.a(param0, -23023, param2, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (ub) (Object) var12.b(35);
        }
        if (param1 != -23023) {
            Object var11 = null;
            StringBuilder discarded$0 = ((pe) this).a((Hashtable) null, (byte) 115, 4, (StringBuilder) null);
            return false;
        }
        return false;
    }

    final boolean a(ub param0, int param1) {
        int var5 = wizardrun.field_H;
        pf var3 = new pf(((pe) this).field_A);
        if (param1 != 8) {
            field_C = null;
        }
        ub var4 = (ub) (Object) var3.a((byte) 31);
        while (var4 != null) {
            if (!(!var4.a(param0, param1 ^ 0))) {
                return true;
            }
            var4 = (ub) (Object) var3.b(35);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(114, param1, param2, param3, param4);
        if (param0 < 108) {
            boolean discarded$0 = ((pe) this).d((byte) 109);
        }
        this.f(1);
    }

    final int e(byte param0) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        int var2 = 0;
        pf var3 = new pf(((pe) this).field_A);
        ub var4 = (ub) (Object) var3.a((byte) 31);
        while (var4 != null) {
            var5 = var4.e((byte) 93);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ub) (Object) var3.b(35);
        }
        if (param0 < 23) {
            return -1;
        }
        return var2;
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
            return false;
        }
        return ((pe) this).d(-16) != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new String[16];
    }
}
