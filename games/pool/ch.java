/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ei implements lj {
    static hj field_K;
    ko field_F;
    static String field_L;
    static int field_G;
    static int[] field_J;
    static int field_H;
    static int field_I;
    static int[] field_M;

    final boolean d(int param0) {
        int var2 = 22 / ((7 - param0) / 48);
        return null != ((ch) this).f((byte) 117) ? true : false;
    }

    ei f(byte param0) {
        aa var2 = null;
        int var3 = 0;
        ei var4 = null;
        var3 = 90 / ((param0 - 51) / 61);
        var2 = new aa(((ch) this).field_F);
        var4 = (ei) (Object) var2.b((byte) -92);
        L0: while (true) {
          if (var4 != null) {
            if (!var4.d(83)) {
              var4 = (ei) (Object) var2.b(-87);
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(ei param0, byte param1) {
        aa var3 = new aa(((ch) this).field_F);
        int var4 = -98 / ((param1 - -43) / 47);
        ei var5 = (ei) (Object) var3.b((byte) -92);
        while (var5 != null) {
            if (var5.a(param0, (byte) 72)) {
                return true;
            }
            var5 = (ei) (Object) var3.b(-125);
        }
        return false;
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        int var8 = 0;
        aa var5 = new aa(((ch) this).field_F);
        int var6 = 16 / ((22 - param0) / 49);
        ei var7 = (ei) (Object) var5.b((byte) -92);
        while (var7 != null) {
            StringBuilder discarded$0 = param1.append(10);
            for (var8 = 0; param2 >= var8; var8++) {
                StringBuilder discarded$1 = param1.append(32);
            }
            StringBuilder discarded$2 = var7.a(param1, 1 + param2, param3, 104);
            var7 = (ei) (Object) var5.b(-88);
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var10 = Pool.field_O;
        aa var8 = new aa(((ch) this).field_F);
        if (!param2) {
            field_H = 45;
        }
        ei var9 = (ei) (Object) var8.b((byte) -92);
        while (var9 != null) {
            // ifeq L108
            if (!(!var9.a(param0, param1 - -((ch) this).field_C, true, param3, param4, ((ch) this).field_D + param5, param6))) {
                return true;
            }
            var9 = (ei) (Object) var8.b(-119);
        }
        return false;
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var7 = Pool.field_O;
        super.a(param0, param1, param2, param3);
        aa var5 = new aa(((ch) this).field_F);
        ei var6 = (ei) (Object) var5.b((byte) -92);
        while (var6 != null) {
            // ifeq L92
            var6.a(param0, param1 ^ 0, param2 - -((ch) this).field_C, ((ch) this).field_D + param3);
            var6 = (ei) (Object) var5.b(-89);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        int var9 = Pool.field_O;
        aa var7 = new aa(((ch) this).field_F);
        ei var8 = (ei) (Object) var7.b((byte) -92);
        if (param4 <= 62) {
            field_I = 75;
        }
        while (var8 != null) {
            // ifeq L100
            var8.a(param0 - -((ch) this).field_C, param1, ((ch) this).field_D + param2, param3, (byte) 94, param5);
            var8 = (ei) (Object) var7.b(-82);
        }
    }

    final void d(byte param0) {
        int var4 = Pool.field_O;
        aa var2 = new aa(((ch) this).field_F);
        ei var3 = (ei) (Object) var2.b((byte) -92);
        if (param0 != 99) {
            field_J = null;
        }
        while (var3 != null) {
            var3.d((byte) 99);
            var3 = (ei) (Object) var2.b(-90);
        }
    }

    final static void a(boolean param0, oj param1, int param2) {
        int var5 = 0;
        oq var6 = ej.field_j;
        oq var7 = var6;
        var7.b(false, param2);
        var7.field_v = var7.field_v + 1;
        int var4 = var7.field_v;
        var7.a(1, false);
        var7.a((byte) -81, param1.field_B);
        var7.a((byte) -81, param1.field_l);
        var7.a((byte) -81, param1.field_p);
        var7.a(true, param1.field_n);
        var7.a(!param0 ? true : false, param1.field_x);
        var7.a(!param0 ? true : false, param1.field_A);
        var7.a(true, param1.field_v);
        var7.a(param1.field_z.length, param0);
        for (var5 = 0; param1.field_z.length > var5; var5++) {
            var6.a(true, param1.field_z[var5]);
        }
        int discarded$0 = var7.d(-1, var4);
        var7.b(-var4 + var7.field_v, true);
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param0 == 0) {
            if (((ch) this).field_z != null) {
                ((ch) this).field_z.a(true, param2, (byte) 105, param3, (ei) this);
            }
        }
        aa var5 = new aa(((ch) this).field_F);
        ei var6 = (ei) (Object) var5.a(0);
        while (var6 != null) {
            var6.a(param0, (byte) 92, param2 + ((ch) this).field_C, ((ch) this).field_D + param3);
            var6 = (ei) (Object) var5.c((byte) -71);
        }
        int var7 = 69 / ((-42 - param1) / 53);
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var10 = Pool.field_O;
        aa var8 = new aa(((ch) this).field_F);
        if (param4 >= -126) {
            this.g(-115);
        }
        ei var9 = (ei) (Object) var8.b((byte) -92);
        while (var9 != null) {
            // ifeq L107
            if (var9.d(-122)) {
                if (var9.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
                    return true;
                }
            }
            var9 = (ei) (Object) var8.b(-103);
        }
        return false;
    }

    final void a(boolean param0, ei param1) {
        ((ch) this).field_F.b((byte) -123, (ma) (Object) param1);
        if (!param0) {
            field_I = -128;
        }
    }

    private final void g(int param0) {
        aa var2 = new aa(((ch) this).field_F);
        if (param0 != 22555) {
            Object var4 = null;
            StringBuilder discarded$0 = ((ch) this).a((StringBuilder) null, -32, (Hashtable) null, 81);
        }
        ei var3 = (ei) (Object) var2.b((byte) -92);
        while (var3 != null) {
            var3.e((byte) -119);
            var3 = (ei) (Object) var2.b(-94);
        }
    }

    String e(int param0) {
        String var4 = null;
        int var5 = Pool.field_O;
        aa var2 = new aa(((ch) this).field_F);
        ei var3 = (ei) (Object) var2.b((byte) -92);
        while (var3 != null) {
            var4 = var3.e(-76);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (ei) (Object) var2.b(-115);
        }
        if (param0 <= -10) {
            return null;
        }
        field_K = null;
        return null;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(22555);
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Pool.field_O;
        int var2 = 0;
        aa var3 = new aa(((ch) this).field_F);
        if (param0 <= 33) {
            Object var7 = null;
            String discarded$0 = ch.a(false, (CharSequence) null);
        }
        ei var4 = (ei) (Object) var3.b((byte) -92);
        while (var4 != null) {
            var5 = var4.c(38);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ei) (Object) var3.b(-122);
        }
        return var2;
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        int var7 = Pool.field_O;
        aa var5 = new aa(((ch) this).field_F);
        ei var8 = (ei) (Object) var5.b((byte) -92);
        while (var8 != null) {
            // ifeq L88
            if (var8.d(109)) {
                if (!(!var8.a(param0, param1, false, param3))) {
                    return true;
                }
            }
            var8 = (ei) (Object) var5.b(-80);
        }
        int var6 = param1;
        if (-81 == (var6 ^ -1)) {
            return vj.field_c[81] ? ((ch) this).a(param3, 3) : ((ch) this).b(param3, 0);
        }
        if (param2) {
            return true;
        }
        return false;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (((ch) this).b(param1, param2, param0, -1)) {
            ((ch) this).a(1, param2, param0, param1);
            this.a((byte) -54, param0, param1, param2);
        }
        if (param3 < 13) {
            boolean discarded$0 = ((ch) this).d(-124);
        }
        return param0;
    }

    ch(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
        ((ch) this).field_F = new ko();
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = sl.a(param0, td.a((byte) 52, param1));
        if (param0) {
            field_J = null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    final boolean a(ei param0, int param1) {
        aa var5 = null;
        ei var6 = null;
        int var7 = Pool.field_O;
        if (!(!((ch) this).field_F.c(0))) {
            return false;
        }
        if (param1 != 3) {
            Object var8 = null;
            this.a((byte) 29, (StringBuilder) null, -124, (Hashtable) null);
        }
        aa var9 = new aa(((ch) this).field_F);
        ei var4 = (ei) (Object) var9.a(0);
        while (var4 != null) {
            if (!(!var4.d(-108))) {
                var5 = new aa(((ch) this).field_F);
                ma discarded$0 = var5.a((ma) (Object) var4, param1 ^ -123);
                var6 = (ei) (Object) var5.c((byte) -71);
                while (var6 != null) {
                    if (!(!var6.a(param0, (byte) 73))) {
                        return true;
                    }
                    var6 = (ei) (Object) var5.c((byte) -71);
                }
            }
            var4 = (ei) (Object) var9.c((byte) -71);
        }
        return false;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        if (param2) {
            field_H = 62;
        }
        if (param1) {
            return gj.field_R.b(param0);
        }
        return dq.field_f.b(param0);
    }

    public static void f(int param0) {
        field_M = null;
        field_L = null;
        field_K = null;
        field_J = null;
        if (param0 != 2) {
            field_K = null;
        }
    }

    final boolean b(ei param0, int param1) {
        aa var5 = null;
        ei var6 = null;
        int var7 = Pool.field_O;
        if (((ch) this).field_F.c(param1)) {
            return false;
        }
        aa var3 = new aa(((ch) this).field_F);
        ei var4 = (ei) (Object) var3.b((byte) -92);
        while (var4 != null) {
            if (!(!var4.d(-112))) {
                var5 = new aa(((ch) this).field_F);
                ma discarded$0 = var5.a((ma) (Object) var4, false);
                var6 = (ei) (Object) var5.b(-90);
                while (var6 != null) {
                    if (!(!var6.a(param0, (byte) -108))) {
                        return true;
                    }
                    var6 = (ei) (Object) var5.b(-90);
                }
            }
            var4 = (ei) (Object) var3.b(param1 ^ -123);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "New Game";
        field_K = new hj(13, 0, 1, 0);
        field_J = new int[]{1, 1, 2, 2, 5, 3, 1, 2, 3, 2, 5, 5, 3, 2, 10, 5, 5, 3, 5, 10, 3, 2, 3, 5, 3, 5, 2};
        field_M = new int[8192];
    }
}
