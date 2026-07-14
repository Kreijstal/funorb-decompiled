/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hn extends gm implements cj {
    static int field_z;
    static String field_A;
    ei field_y;
    static int field_x;

    final static void a(String param0, byte param1) {
        if (param1 >= -71) {
            field_x = 53;
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var7 = 0;
        int var8 = Torquing.field_u;
        if (param3 <= 55) {
            Object var9 = null;
            boolean discarded$0 = ((hn) this).a(-19, false, 4, -101, (gm) null, 68, 32);
        }
        re var10 = new re(((hn) this).field_y);
        gm var6 = (gm) (Object) var10.a((byte) 106);
        while (var6 != null) {
            StringBuilder discarded$1 = param0.append(10);
            for (var7 = 0; var7 <= param1; var7++) {
                StringBuilder discarded$2 = param0.append(32);
            }
            StringBuilder discarded$3 = var6.a(param0, (byte) 117, param2, 1 + param1);
            var6 = (gm) (Object) var10.b(true);
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        int var10 = Torquing.field_u;
        re var8 = new re(((hn) this).field_y);
        if (param1) {
            return true;
        }
        gm var9 = (gm) (Object) var8.a((byte) 124);
        while (var9 != null) {
            // ifeq L98
            if (var9.g(2)) {
                if (!(!var9.a(param0, false, param2, param3, param4, param5, param6))) {
                    return true;
                }
            }
            var9 = (gm) (Object) var8.b(true);
        }
        return false;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = Torquing.field_u;
        if (param1 > -7) {
            field_z = -92;
        }
        if (0 == param0) {
            if (!(((hn) this).field_q == null)) {
                ((hn) this).field_q.a(127, param2, param3, true, (gm) this);
            }
        }
        re var5 = new re(((hn) this).field_y);
        gm var6 = (gm) (Object) var5.a(17514);
        while (var6 != null) {
            var6.a(param0, (byte) -107, ((hn) this).field_k + param2, param3 - -((hn) this).field_w);
            var6 = (gm) (Object) var5.a(true);
        }
    }

    final void a(gm param0, int param1) {
        ((hn) this).field_y.a((byte) 54, (q) (Object) param0);
        if (param1 != -6938) {
            ((hn) this).a(69, (byte) -75, 83, -7);
        }
    }

    private final void a(boolean param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        if (!param0) {
            field_z = 36;
        }
        gm var3 = (gm) (Object) var2.a((byte) 66);
        while (var3 != null) {
            var3.e((byte) 88);
            var3 = (gm) (Object) var2.b(true);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        int var9 = Torquing.field_u;
        re var7 = new re(((hn) this).field_y);
        if (param3 <= 109) {
            ((hn) this).field_y = null;
        }
        gm var8 = (gm) (Object) var7.a((byte) 110);
        while (var8 != null) {
            // ifeq L101
            var8.a(((hn) this).field_k + param0, ((hn) this).field_w + param1, param2, (byte) 116, param4, param5);
            var8 = (gm) (Object) var7.b(true);
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        if (param1 != 117) {
            Object var6 = null;
            boolean discarded$0 = ((hn) this).a(-99, -92, -99, -25, -38, (gm) null, (byte) 51);
        }
        if (!(!((hn) this).a(-31866, param0, param2, param3))) {
            ((hn) this).a(param0, param3, true, param2);
            this.a(param0, param3, param2, (byte) 114);
        }
        return param0;
    }

    final boolean b(gm param0, int param1) {
        re var5 = null;
        gm var6 = null;
        int var7 = Torquing.field_u;
        if (!(!((hn) this).field_y.e(-93))) {
            return false;
        }
        re var8 = new re(((hn) this).field_y);
        gm var4 = (gm) (Object) var8.a((byte) 84);
        if (param1 != -9928) {
            field_z = 67;
        }
        while (var4 != null) {
            if (var4.g(2)) {
                var5 = new re(((hn) this).field_y);
                q discarded$0 = var5.a(param1 + 23699, (q) (Object) var4);
                var6 = (gm) (Object) var5.b(true);
                while (var6 != null) {
                    if (!(!var6.a(param0, false))) {
                        return true;
                    }
                    var6 = (gm) (Object) var5.b(true);
                }
            }
            var4 = (gm) (Object) var8.b(true);
        }
        return false;
    }

    final String b(int param0) {
        re var2 = null;
        gm var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var2 = new re(((hn) this).field_y);
          var3 = (gm) (Object) var2.a((byte) 63);
          if (param0 == 0) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (gm) (Object) var2.b(true);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(byte param0, gm param1) {
        re var6 = null;
        gm var7 = null;
        int var8 = Torquing.field_u;
        if (!(!((hn) this).field_y.e(-102))) {
            return false;
        }
        re var9 = new re(((hn) this).field_y);
        int var5 = -124 / ((param0 - -40) / 51);
        gm var4 = (gm) (Object) var9.a(17514);
        while (var4 != null) {
            if (!(!var4.g(2))) {
                var6 = new re(((hn) this).field_y);
                q discarded$0 = var6.a((q) (Object) var4, -27392);
                var7 = (gm) (Object) var6.a(true);
                while (var7 != null) {
                    if (var7.a(param1, false)) {
                        return true;
                    }
                    var7 = (gm) (Object) var6.a(true);
                }
            }
            var4 = (gm) (Object) var9.a(true);
        }
        return false;
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        int var2 = 0;
        re var3 = new re(((hn) this).field_y);
        if (param0 != 28) {
            return -77;
        }
        gm var4 = (gm) (Object) var3.a((byte) 126);
        while (var4 != null) {
            var5 = var4.d((byte) 28);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (gm) (Object) var3.b(true);
        }
        return var2;
    }

    void a(int param0, gm param1, int param2, int param3) {
        int var8 = Torquing.field_u;
        super.a(-123, param1, param2, param3);
        int var6 = -74 % ((param0 - -28) / 43);
        re var5 = new re(((hn) this).field_y);
        gm var7 = (gm) (Object) var5.a((byte) 29);
        while (var7 != null) {
            // ifeq L102
            var7.a(113, param1, ((hn) this).field_k + param2, ((hn) this).field_w + param3);
            var7 = (gm) (Object) var5.b(true);
        }
    }

    final void c(byte param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        if (param0 < 89) {
            ((hn) this).field_y = null;
        }
        gm var3 = (gm) (Object) var2.a((byte) 84);
        while (var3 != null) {
            var3.c((byte) 92);
            var3 = (gm) (Object) var2.b(true);
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            String discarded$0 = ((hn) this).b(57);
        }
        return ((hn) this).a(0) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 6, param1, param2, param3, param4);
        int var6 = -94 % ((param0 - 66) / 57);
        this.a(true);
    }

    hn(int param0, int param1, int param2, int param3, el param4) {
        super(param0, param1, param2, param3, param4, (ca) null);
        ((hn) this).field_y = new ei();
    }

    gm a(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        gm var3 = (gm) (Object) var2.a((byte) 49);
        while (var3 != null) {
            if (!(!var3.g(2))) {
                return var3;
            }
            var3 = (gm) (Object) var2.b(true);
        }
        if (param0 == 0) {
            return null;
        }
        String discarded$0 = ((hn) this).b(19);
        return null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var10 = Torquing.field_u;
        re var8 = new re(((hn) this).field_y);
        if (param6 <= 5) {
            hn.f((byte) 79);
        }
        gm var9 = (gm) (Object) var8.a((byte) 122);
        while (var9 != null) {
            // ifeq L107
            if (!(!var9.a(param0, param1 + ((hn) this).field_w, ((hn) this).field_k + param2, param3, param4, param5, (byte) 58))) {
                return true;
            }
            var9 = (gm) (Object) var8.b(true);
        }
        return false;
    }

    final boolean a(gm param0, boolean param1) {
        int var5 = Torquing.field_u;
        re var3 = new re(((hn) this).field_y);
        if (param1) {
            field_A = null;
        }
        gm var4 = (gm) (Object) var3.a((byte) 83);
        while (var4 != null) {
            if (var4.a(param0, false)) {
                return true;
            }
            var4 = (gm) (Object) var3.b(true);
        }
        return false;
    }

    public static void f(byte param0) {
        if (param0 != 2) {
            Object var2 = null;
            hn.a((String) null, (byte) -33);
        }
        field_A = null;
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var8 = Torquing.field_u;
        int var5 = -43 % ((param3 - -33) / 57);
        re var6 = new re(((hn) this).field_y);
        gm var9 = (gm) (Object) var6.a((byte) 125);
        while (var9 != null) {
            // ifeq L96
            if (var9.g(2)) {
                if (var9.a(param0, param1, param2, 41)) {
                    return true;
                }
            }
            var9 = (gm) (Object) var6.b(true);
        }
        int var7 = param0;
        if (-81 == (var7 ^ -1)) {
            return !i.field_P[81] ? ((hn) this).b(param1, -9928) : ((hn) this).a((byte) -125, param1);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Loading sound effects";
    }
}
