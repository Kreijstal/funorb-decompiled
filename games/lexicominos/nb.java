/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class nb extends w implements dh {
    ng field_A;
    static int field_x;
    static fh field_z;
    static String field_y;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 != -15992) {
            return null;
        }
        if (!(!((nb) this).a(param3 + 23365, param2, param1, param0))) {
            ((nb) this).a(param2, 0, param0, param1);
            this.a(param2, 124, param1, param0);
        }
        return param2;
    }

    w e(int param0) {
        ta var2 = null;
        w var3 = null;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          var2 = new ta(((nb) this).field_A);
          if (param0 == -21374) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        var3 = (w) (Object) var2.a(250);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.a(18337)) {
              var3 = (w) (Object) var2.c(param0 + 21287);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean c(byte param0, w param1) {
        ta var5 = null;
        w var6 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (param0 != 119) {
            this.f(8);
        }
        if (((nb) this).field_A.e(95)) {
            return false;
        }
        ta var3 = new ta(((nb) this).field_A);
        w var4 = (w) (Object) var3.a(250);
        while (var4 != null) {
            if (var4.a(18337)) {
                var5 = new ta(((nb) this).field_A);
                kd discarded$0 = var5.a((kd) (Object) var4, (byte) -127);
                var6 = (w) (Object) var5.c(-123);
                while (var6 != null) {
                    if (!(!var6.a((byte) 44, param1))) {
                        return true;
                    }
                    var6 = (w) (Object) var5.c(param0 + -228);
                }
            }
            var4 = (w) (Object) var3.c(-54);
        }
        return false;
    }

    final void c(byte param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((nb) this).field_A);
        if (param0 >= -35) {
            return;
        }
        w var3 = (w) (Object) var2.a(250);
        while (var3 != null) {
            var3.c((byte) -43);
            var3 = (w) (Object) var2.c(-107);
        }
    }

    private final void f(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 125) {
            ((nb) this).c((byte) 23);
        }
        ta var2 = new ta(((nb) this).field_A);
        w var3 = (w) (Object) var2.a(250);
        while (var3 != null) {
            var3.d(84);
            var3 = (w) (Object) var2.c(-91);
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 != 15508) {
            return -103;
        }
        int var2 = 0;
        ta var3 = new ta(((nb) this).field_A);
        w var4 = (w) (Object) var3.a(250);
        while (var4 != null) {
            var5 = var4.c(15508);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (w) (Object) var3.c(-61);
        }
        return var2;
    }

    final static int a(int param0, int param1) {
        if (param0 >= -40) {
            return 43;
        }
        param1 = param1 & 8191;
        if (4096 <= param1) {
            return -6145 >= param1 ? v.field_w[param1 - 6144] : -v.field_w[6144 + -param1];
        }
        return -2049 > param1 ? v.field_w[-param1 + 2048] : -v.field_w[param1 - 2048];
    }

    final boolean a(int param0, w param1) {
        ta var5 = null;
        w var6 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (!(!((nb) this).field_A.e(-114))) {
            return false;
        }
        ta var3 = new ta(((nb) this).field_A);
        w var4 = (w) (Object) var3.b(param0);
        while (var4 != null) {
            if (var4.a(18337)) {
                var5 = new ta(((nb) this).field_A);
                kd discarded$0 = var5.a((kd) (Object) var4, 127);
                var6 = (w) (Object) var5.e(param0 + 31842);
                while (var6 != null) {
                    if (!(!var6.a((byte) 44, param1))) {
                        return true;
                    }
                    var6 = (w) (Object) var5.e(31842);
                }
            }
            var4 = (w) (Object) var3.e(31842);
        }
        return false;
    }

    final String b(int param0) {
        ta var2 = null;
        w var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          var2 = new ta(((nb) this).field_A);
          if (param0 >= 121) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        var3 = (w) (Object) var2.a(250);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(125);
            if (var4 == null) {
              var3 = (w) (Object) var2.c(-93);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -115) {
            return;
        }
        if (param3 == 0) {
            if (!(((nb) this).field_i == null)) {
                ((nb) this).field_i.a(param1, param2, true, (w) this, -3284);
            }
        }
        ta var5 = new ta(((nb) this).field_A);
        w var6 = (w) (Object) var5.b(0);
        while (var6 != null) {
            var6.a((byte) -115, ((nb) this).field_o + param1, ((nb) this).field_t + param2, param3);
            var6 = (w) (Object) var5.e(31842);
        }
    }

    nb(int param0, int param1, int param2, int param3, rd param4) {
        super(param0, param1, param2, param3, param4, (vd) null);
        ((nb) this).field_A = new ng();
    }

    public static void d(boolean param0) {
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = nb.a(82, 41, (byte) -49, (sh) null);
        }
        field_y = null;
        field_z = null;
    }

    void a(byte param0, w param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        ta var5 = new ta(((nb) this).field_A);
        w var6 = (w) (Object) var5.a(250);
        while (var6 != null) {
            // ifeq L92
            var6.a((byte) -119, param1, param2 - -((nb) this).field_o, param3 - -((nb) this).field_t);
            var6 = (w) (Object) var5.c(-115);
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
            return false;
        }
        return ((nb) this).e(-21374) != null ? true : false;
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var8 = Lexicominos.field_L ? 1 : 0;
        ta var5 = new ta(((nb) this).field_A);
        w var9 = (w) (Object) var5.a(250);
        int var7 = -110 % ((-13 - param3) / 55);
        while (var9 != null) {
            // ifeq L102
            if (var9.a(18337)) {
                if (!(!var9.a(param0, param1, param2, (byte) -123))) {
                    return true;
                }
            }
            var9 = (w) (Object) var5.c(-92);
        }
        int var6 = param1;
        if (80 == var6) {
            return !wa.field_j[81] ? ((nb) this).c((byte) 119, param2) : ((nb) this).a(0, param2);
        }
        return false;
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        int var7 = 0;
        int var8 = Lexicominos.field_L ? 1 : 0;
        ta var5 = new ta(((nb) this).field_A);
        if (param1 < 112) {
            return;
        }
        w var6 = (w) (Object) var5.a(250);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(1 + param3, param2, param0, -15992);
            var6 = (w) (Object) var5.c(-74);
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var10 = Lexicominos.field_L ? 1 : 0;
        ta var8 = new ta(((nb) this).field_A);
        w var9 = (w) (Object) var8.a(250);
        while (var9 != null) {
            // ifeq L96
            if (!(!var9.a(param0 + 0, param1, param2, param3, ((nb) this).field_o + param4, param5 + ((nb) this).field_t, param6))) {
                return true;
            }
            var9 = (w) (Object) var8.c(-122);
        }
        if (param0 != -4808) {
            return true;
        }
        return false;
    }

    final boolean a(byte param0, w param1) {
        int var5 = Lexicominos.field_L ? 1 : 0;
        ta var3 = new ta(((nb) this).field_A);
        if (param0 != 44) {
            field_x = -19;
        }
        w var4 = (w) (Object) var3.a(param0 ^ 214);
        while (var4 != null) {
            if (!(!var4.a((byte) 44, param1))) {
                return true;
            }
            var4 = (w) (Object) var3.c(-63);
        }
        return false;
    }

    final static boolean a(int param0, int param1, byte param2, sh param3) {
        byte[] var6 = param3.a(param0, -27493, param1);
        byte[] var4 = var6;
        if (var6 == null) {
            return false;
        }
        gf.a((byte) 106, var6);
        int var5 = 105 % ((69 - param2) / 55);
        return true;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(126);
    }

    final void b(byte param0, w param1) {
        int var3 = 34 % ((-8 - param0) / 56);
        ((nb) this).field_A.b(116, (kd) (Object) param1);
    }

    final boolean a(int param0, int param1, int param2, int param3, w param4, int param5, int param6) {
        int var10 = Lexicominos.field_L ? 1 : 0;
        ta var8 = new ta(((nb) this).field_A);
        if (param5 != -29771) {
            return true;
        }
        w var9 = (w) (Object) var8.a(param5 + 30021);
        while (var9 != null) {
            // ifeq L106
            if (var9.a(18337)) {
                if (var9.a(param0, param1, param2, param3, param4, -29771, param6)) {
                    return true;
                }
            }
            var9 = (w) (Object) var8.c(-84);
        }
        return false;
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = Lexicominos.field_L ? 1 : 0;
        if (param3 != 0) {
            field_x = -28;
        }
        ta var7 = new ta(((nb) this).field_A);
        w var8 = (w) (Object) var7.a(250);
        while (var8 != null) {
            // ifeq L96
            var8.a(param0, param1, ((nb) this).field_o + param2, 0, ((nb) this).field_t + param4, param5);
            var8 = (w) (Object) var7.c(-85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Login: ";
    }
}
