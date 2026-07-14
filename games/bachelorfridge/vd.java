/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vd extends wj implements e {
    static Random field_z;
    static String[] field_B;
    eaa field_A;
    static vr field_y;

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        this.h(param2 ^ -104);
    }

    private final void h(int param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(((vd) this).field_A);
        wj var5 = (wj) (Object) var2.b((byte) 86);
        while (var5 != null) {
            var5.d(6);
            var5 = (wj) (Object) var2.a((byte) 0);
        }
        int var3 = -30 % ((param0 - -8) / 57);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        int var5 = 123 / ((-20 - param0) / 54);
        if (-1 == (param2 ^ -1)) {
            if (!(((vd) this).field_f == null)) {
                ((vd) this).field_f.a(param3, (wj) this, 32679, param1, true);
            }
        }
        rna var6 = new rna(((vd) this).field_A);
        wj var7 = (wj) (Object) var6.c((byte) 120);
        while (var7 != null) {
            var7.a((byte) -104, param1 - -((vd) this).field_v, param2, ((vd) this).field_s + param3);
            var7 = (wj) (Object) var6.d((byte) -124);
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        rna var5 = new rna(((vd) this).field_A);
        wj var6 = (wj) (Object) var5.b((byte) 40);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param0 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param1, 1 + param0, (byte) 113, param2);
            var6 = (wj) (Object) var5.a((byte) 0);
        }
        if (param3 > -77) {
            field_z = null;
        }
    }

    final static boolean a(byte param0, vr param1) {
        if (param0 != 89) {
            field_z = null;
        }
        return param1.b((byte) 107);
    }

    final static void a(double param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (param1 != 81) {
            field_z = null;
        }
        if (!(in.field_e == param0)) {
            for (var3 = 0; var3 > -257; var3++) {
                var4 = (int)(255.0 * Math.pow((double)var3 / 255.0, param0));
                jna.field_f[var3] = -256 >= var4 ? var4 : 255;
            }
            in.field_e = param0;
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != wt.field_n) {
            var3 = wt.field_n.a(param1, true);
            if (var3 != 1) {
                if (0 != var3) {
                    var4 = wt.field_n.g(0) ? 1 : 0;
                    ula.a(param2, (byte) 75, wt.field_n.h((byte) 82), var3, var4 != 0, wt.field_n.field_Eb);
                }
                wt.field_n = null;
                di.c(-121);
            }
        }
        if (param0 != -35) {
            vd.a((byte) 62, true, 65);
        }
    }

    wj g(int param0) {
        rna var2 = null;
        wj var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          var2 = new rna(((vd) this).field_A);
          if (param0 < -26) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = vd.a((byte) 113, (vr) null);
            break L0;
          }
        }
        var3 = (wj) (Object) var2.b((byte) 106);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e(1023)) {
              var3 = (wj) (Object) var2.a((byte) 0);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(wj param0, int param1) {
        int var5 = BachelorFridge.field_y;
        rna var3 = new rna(((vd) this).field_A);
        if (param1 > -78) {
            String discarded$0 = ((vd) this).c((byte) -5);
        }
        wj var4 = (wj) (Object) var3.b((byte) -117);
        while (var4 != null) {
            if (!(!var4.a(param0, -117))) {
                return true;
            }
            var4 = (wj) (Object) var3.a((byte) 0);
        }
        return false;
    }

    final boolean a(int param0, wj param1) {
        rna var5 = null;
        wj var6 = null;
        int var7 = BachelorFridge.field_y;
        if (!(!((vd) this).field_A.e(12917))) {
            return false;
        }
        rna var9 = new rna(((vd) this).field_A);
        if (param0 >= -121) {
            Object var8 = null;
            boolean discarded$0 = ((vd) this).b(-33, -39, 54, -107, -45, (wj) null, -22);
        }
        wj var4 = (wj) (Object) var9.c((byte) 121);
        while (var4 != null) {
            if (var4.e(1023)) {
                var5 = new rna(((vd) this).field_A);
                bw discarded$1 = var5.a((bw) (Object) var4, (byte) -86);
                var6 = (wj) (Object) var5.d((byte) -124);
                while (var6 != null) {
                    if (!(!var6.a(param1, -112))) {
                        return true;
                    }
                    var6 = (wj) (Object) var5.d((byte) -124);
                }
            }
            var4 = (wj) (Object) var9.d((byte) -124);
        }
        return false;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var10 = BachelorFridge.field_y;
        rna var11 = new rna(((vd) this).field_A);
        if (param1 != -7375) {
            ((vd) this).a(78, -90, (byte) 87, -47, 82);
        }
        wj var9 = (wj) (Object) var11.b((byte) -103);
        while (var9 != null) {
            // ifeq L118
            if (var9.b(param0, -7375, param2 - -((vd) this).field_s, param3, param4 - -((vd) this).field_v, param5, param6)) {
                return true;
            }
            var9 = (wj) (Object) var11.a((byte) 0);
        }
        return false;
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        int var7 = BachelorFridge.field_y;
        rna var5 = new rna(((vd) this).field_A);
        wj var8 = (wj) (Object) var5.b((byte) -109);
        while (var8 != null) {
            // ifeq L86
            if (var8.e(1023)) {
                if (var8.a(10, param1, param2, param3)) {
                    return true;
                }
            }
            var8 = (wj) (Object) var5.a((byte) 0);
        }
        if (param0 != 10) {
            field_y = null;
        }
        int var6 = param1;
        if (var6 != 80) {
            return false;
        }
        return !wga.field_q[81] ? ((vd) this).b(param3, 1) : ((vd) this).a(-128, param3);
    }

    void a(int param0, int param1, wj param2, int param3) {
        int var7 = BachelorFridge.field_y;
        this.a(param0, param1, param2, param3);
        rna var5 = new rna(((vd) this).field_A);
        wj var6 = (wj) (Object) var5.b((byte) 14);
        while (var6 != null) {
            // ifeq L88
            var6.a(param0 + ((vd) this).field_s, param1 + ((vd) this).field_v, param2, 20);
            var6 = (wj) (Object) var5.a((byte) 0);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (param2 < 20) {
            field_z = null;
        }
        if (!(!((vd) this).a(param0, param1, param3, (byte) 122))) {
            ((vd) this).a(9, param0, param3, param1);
            this.a(param1, param0, param3, (byte) -108);
        }
        return param3;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var10 = BachelorFridge.field_y;
        rna var8 = new rna(((vd) this).field_A);
        wj var9 = (wj) (Object) var8.b((byte) 127);
        while (var9 != null) {
            // ifeq L92
            if (var9.e(1023)) {
                if (var9.a(param0, 13, param2, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (wj) (Object) var8.a((byte) 0);
        }
        if (param1 != 13) {
            field_y = null;
            return false;
        }
        return false;
    }

    String c(byte param0) {
        rna var2 = null;
        wj var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          var2 = new rna(((vd) this).field_A);
          if (param0 == 16) {
            break L0;
          } else {
            var6 = null;
            this.a(-68, (Hashtable) null, (StringBuilder) null, (byte) -17);
            break L0;
          }
        }
        var3 = (wj) (Object) var2.b((byte) -122);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 16);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (wj) (Object) var2.a((byte) 0);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void c(wj param0, int param1) {
        ((vd) this).field_A.a((bw) (Object) param0, true);
        int var3 = 69 % ((param1 - -70) / 50);
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            int discarded$0 = ((vd) this).b(-75);
        }
        return ((vd) this).g(-29) != null ? true : false;
    }

    vd(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
        ((vd) this).field_A = new eaa();
    }

    final boolean b(wj param0, int param1) {
        rna var5 = null;
        wj var6 = null;
        int var7 = BachelorFridge.field_y;
        if (!(!((vd) this).field_A.e(12917))) {
            return false;
        }
        if (param1 != 1) {
            return false;
        }
        rna var3 = new rna(((vd) this).field_A);
        wj var4 = (wj) (Object) var3.b((byte) 30);
        while (var4 != null) {
            if (var4.e(1023)) {
                var5 = new rna(((vd) this).field_A);
                bw discarded$0 = var5.a(param1 + 5999, (bw) (Object) var4);
                var6 = (wj) (Object) var5.a((byte) 0);
                while (var6 != null) {
                    if (!(!var6.a(param0, -123))) {
                        return true;
                    }
                    var6 = (wj) (Object) var5.a((byte) 0);
                }
            }
            var4 = (wj) (Object) var3.a((byte) 0);
        }
        return false;
    }

    public static void i(int param0) {
        field_z = null;
        if (param0 != 20742) {
            vd.i(-83);
        }
        field_y = null;
        field_B = null;
    }

    final int b(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0 >= -3) {
            ((vd) this).field_A = null;
        }
        rna var3 = new rna(((vd) this).field_A);
        wj var4 = (wj) (Object) var3.b((byte) 36);
        while (var4 != null) {
            var5 = var4.b(-61);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (wj) (Object) var3.a((byte) 0);
        }
        return var2;
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        int var9 = BachelorFridge.field_y;
        rna var7 = new rna(((vd) this).field_A);
        wj var8 = (wj) (Object) var7.b((byte) -128);
        while (var8 != null) {
            // ifeq L85
            var8.a(param0 + ((vd) this).field_s, param1, (byte) -101, param3, param4, param5 - -((vd) this).field_v);
            var8 = (wj) (Object) var7.a((byte) 0);
        }
        if (param2 != -101) {
            boolean discarded$0 = ((vd) this).e(50);
        }
    }

    final void f(int param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != 31) {
            field_y = null;
        }
        rna var2 = new rna(((vd) this).field_A);
        wj var3 = (wj) (Object) var2.b((byte) 79);
        while (var3 != null) {
            var3.f(31);
            var3 = (wj) (Object) var2.a((byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new Random();
    }
}
