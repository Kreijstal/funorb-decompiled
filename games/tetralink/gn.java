/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gn extends na implements nf {
    static hl field_I;
    je field_J;

    final void c(na param0, int param1) {
        if (param1 != 10) {
            Object var4 = null;
            boolean discarded$0 = ((gn) this).a(-79, 'Y', -110, (na) null);
        }
        ((gn) this).field_J.a((mc) (Object) param0, false);
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = TetraLink.field_J;
        tg var8 = new tg(((gn) this).field_J);
        na var9 = (na) (Object) var8.a(true);
        if (param0 != -19137) {
            return false;
        }
        while (var9 != null) {
            // ifeq L107
            if (var9.c(param0 ^ -19140)) {
                if (!(!var9.a(-19137, param1, param2, param3, param4, param5, param6))) {
                    return true;
                }
            }
            var9 = (na) (Object) var8.b((byte) -58);
        }
        return false;
    }

    void a(na param0, int param1, int param2, boolean param3) {
        int var7 = TetraLink.field_J;
        super.a(param0, param1, param2, true);
        tg var5 = new tg(((gn) this).field_J);
        na var6 = (na) (Object) var5.a(param3);
        while (var6 != null) {
            // ifeq L88
            var6.a(param0, ((gn) this).field_t + param1, param2 - -((gn) this).field_w, true);
            var6 = (na) (Object) var5.b((byte) -58);
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        int var7 = 0;
        int var8 = TetraLink.field_J;
        if (param0 != 14) {
            gn.d(true);
        }
        tg var5 = new tg(((gn) this).field_J);
        na var6 = (na) (Object) var5.a(true);
        while (var6 != null) {
            StringBuilder discarded$0 = param1.append(10);
            for (var7 = 0; param2 >= var7; var7++) {
                StringBuilder discarded$1 = param1.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3, param1, 1 + param2, -372494750);
            var6 = (na) (Object) var5.b((byte) -58);
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
            field_I = null;
        }
        return null != ((gn) this).d((byte) 5) ? true : false;
    }

    final boolean a(na param0, int param1) {
        int var5 = TetraLink.field_J;
        tg var3 = new tg(((gn) this).field_J);
        if (param1 != -384169950) {
            return true;
        }
        na var4 = (na) (Object) var3.a(true);
        while (var4 != null) {
            if (var4.a(param0, -384169950)) {
                return true;
            }
            var4 = (na) (Object) var3.b((byte) -58);
        }
        return false;
    }

    final boolean b(na param0, int param1) {
        tg var5 = null;
        na var6 = null;
        int var7 = TetraLink.field_J;
        if (param1 <= 107) {
            return true;
        }
        if (!(!((gn) this).field_J.b(true))) {
            return false;
        }
        tg var3 = new tg(((gn) this).field_J);
        na var4 = (na) (Object) var3.a(true);
        while (var4 != null) {
            if (var4.c(3)) {
                var5 = new tg(((gn) this).field_J);
                mc discarded$0 = var5.a(-106, (mc) (Object) var4);
                var6 = (na) (Object) var5.b((byte) -58);
                while (var6 != null) {
                    if (!(!var6.a(param0, -384169950))) {
                        return true;
                    }
                    var6 = (na) (Object) var5.b((byte) -58);
                }
            }
            var4 = (na) (Object) var3.b((byte) -58);
        }
        return false;
    }

    private final void g(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((gn) this).field_J);
        na var3 = (na) (Object) var2.a(true);
        while (var3 != null) {
            var3.b((byte) 123);
            var3 = (na) (Object) var2.b((byte) -58);
        }
        if (param0 <= 39) {
            ((gn) this).field_J = null;
        }
    }

    String e(int param0) {
        tg var2 = null;
        na var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          var2 = new tg(((gn) this).field_J);
          var3 = (na) (Object) var2.a(true);
          if (param0 == 0) {
            break L0;
          } else {
            ((gn) this).field_J = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.e(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (na) (Object) var2.b((byte) -58);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 67 % ((-61 - param2) / 51);
        super.a(param0, param1, 15, param3, param4);
        this.g(55);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TetraLink.field_J;
        if (param0 != 0) {
            return;
        }
        if (-1 == (param3 ^ -1)) {
            if (((gn) this).field_H != null) {
                ((gn) this).field_H.a((na) this, param1, param2, true, true);
            }
        }
        tg var5 = new tg(((gn) this).field_J);
        na var6 = (na) (Object) var5.b(param0 + 90);
        while (var6 != null) {
            var6.a(0, ((gn) this).field_t + param1, param2 - -((gn) this).field_w, param3);
            var6 = (na) (Object) var5.a((byte) -66);
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        int var2 = 0;
        tg var3 = new tg(((gn) this).field_J);
        na var4 = (na) (Object) var3.a(true);
        while (var4 != null) {
            var5 = var4.d(-128);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (na) (Object) var3.b((byte) -58);
        }
        if (param0 > -114) {
            field_I = null;
        }
        return var2;
    }

    na d(byte param0) {
        tg var2 = null;
        na var3 = null;
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          if (param0 == 5) {
            break L0;
          } else {
            ((gn) this).field_J = null;
            break L0;
          }
        }
        var2 = new tg(((gn) this).field_J);
        var3 = (na) (Object) var2.a(true);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.c(3)) {
              var3 = (na) (Object) var2.b((byte) -58);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    gn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
        ((gn) this).field_J = new je();
    }

    final static void a(int param0, int param1, int param2, byte[] param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TetraLink.field_J;
        for (var5 = param0; var5 < ug.field_bb.length; var5++) {
            param1 = ug.field_bb[var5];
            var6 = var5 << 1329856036;
            while (true) {
                param1--;
                if (0 == param1) {
                    break;
                }
                var6++;
                param2 = lg.field_ab[var6];
                param4[param3[param2]] = param4[param3[param2]] + 1;
                lg.field_ab[param4[param3[param2]]] = param2;
            }
        }
    }

    final boolean d(na param0, int param1) {
        tg var6 = null;
        na var7 = null;
        int var8 = TetraLink.field_J;
        if (!(!((gn) this).field_J.b(true))) {
            return false;
        }
        tg var3 = new tg(((gn) this).field_J);
        int var4 = 71 % ((-40 - param1) / 53);
        na var5 = (na) (Object) var3.b(-55);
        while (var5 != null) {
            if (var5.c(3)) {
                var6 = new tg(((gn) this).field_J);
                mc discarded$0 = var6.a(true, (mc) (Object) var5);
                var7 = (na) (Object) var6.a((byte) -66);
                while (var7 != null) {
                    if (!(!var7.a(param0, -384169950))) {
                        return true;
                    }
                    var7 = (na) (Object) var6.a((byte) -66);
                }
            }
            var5 = (na) (Object) var3.a((byte) -66);
        }
        return false;
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = TetraLink.field_J;
        tg var12 = new tg(((gn) this).field_J);
        if (param4 != -32738) {
            Object var11 = null;
            boolean discarded$0 = ((gn) this).b((na) null, 58);
        }
        na var9 = (na) (Object) var12.a(true);
        while (var9 != null) {
            // ifeq L120
            if (!(!var9.a(param0, param1 + ((gn) this).field_t, param2, param3 - -((gn) this).field_w, -32738, param5, param6))) {
                return true;
            }
            var9 = (na) (Object) var12.b((byte) -58);
        }
        return false;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        if (!(!((gn) this).a(param0, param2, param3 ^ -372494754, param1))) {
            ((gn) this).a(param3 + 372494636, param1, param0, param2);
            this.a((byte) 14, param1, param2, param0);
        }
        if (param3 != -372494750) {
            return null;
        }
        return param1;
    }

    final void f(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((gn) this).field_J);
        na var3 = (na) (Object) var2.a(true);
        while (var3 != null) {
            var3.f(-126);
            var3 = (na) (Object) var2.b((byte) -58);
        }
        if (param0 >= -63) {
            ((gn) this).field_J = null;
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_I = null;
        }
        field_I = null;
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        int var9 = TetraLink.field_J;
        tg var7 = new tg(((gn) this).field_J);
        if (param1) {
            Object var10 = null;
            ((gn) this).a((na) null, 63, -119, false);
        }
        na var8 = (na) (Object) var7.a(true);
        while (var8 != null) {
            // ifeq L106
            var8.a(param0, false, param2, param3 + ((gn) this).field_w, param4, param5 + ((gn) this).field_t);
            var8 = (na) (Object) var7.b((byte) -58);
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        int var7 = TetraLink.field_J;
        if (param2 != 1) {
            return false;
        }
        tg var5 = new tg(((gn) this).field_J);
        na var8 = (na) (Object) var5.a(true);
        while (var8 != null) {
            // ifeq L93
            if (var8.c(3)) {
                if (!(!var8.a(param0, param1, 1, param3))) {
                    return true;
                }
            }
            var8 = (na) (Object) var5.b((byte) -58);
        }
        int var6 = param0;
        if (var6 != 80) {
            return false;
        }
        return sn.field_a[81] ? ((gn) this).d(param3, -99) : ((gn) this).b(param3, param2 ^ 114);
    }

    static {
    }
}
