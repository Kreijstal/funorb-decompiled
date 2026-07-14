/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fd extends fi implements ja {
    static String field_x;
    static km field_y;
    static String[] field_A;
    static int[] field_B;
    p field_z;
    static int field_C;

    fd(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
        ((fd) this).field_z = new p();
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        ma var3 = new ma(((fd) this).field_z);
        if (param0 != -39) {
            field_x = null;
        }
        fi var4 = (fi) (Object) var3.c(12677);
        while (var4 != null) {
            var5 = var4.b((byte) -39);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (fi) (Object) var3.b(41);
        }
        return var2;
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        if (param3 < 48) {
            field_C = 97;
        }
        ma var5 = new ma(((fd) this).field_z);
        fi var6 = (fi) (Object) var5.c(12677);
        while (var6 != null) {
            StringBuilder discarded$0 = param1.append(10);
            for (var7 = 0; var7 <= param2; var7++) {
                StringBuilder discarded$1 = param1.append(32);
            }
            StringBuilder discarded$2 = var6.a(param0, (byte) 121, 1 + param2, param1);
            var6 = (fi) (Object) var5.b(41);
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (param1 <= 118) {
            field_B = null;
        }
        if (!(!((fd) this).a(param0, param2, 34, param3))) {
            ((fd) this).a(param2, param0, (byte) 127, param3);
            this.a(param0, param3, param2, 54);
        }
        return param3;
    }

    public static void e(int param0) {
        if (param0 != 1) {
            field_B = null;
        }
        field_x = null;
        field_B = null;
        field_y = null;
        field_A = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param1 != 6752) {
            return;
        }
        int var7 = 3;
        df.c(param3, param5, param2, param6, (param6 >> -1770988735) - 2, !param4 ? 1063506 : 1264494);
        int var8 = 2 * var7;
        df.c(param3 - -var7, var7 + param5, -var8 + param2, param6 + -var8, -var7 + ((param6 >> -2000939999) - 2), 2);
    }

    final void a(fi param0, byte param1) {
        ((fd) this).field_z.a((l) (Object) param0, (byte) -58);
        if (param1 != -78) {
            String discarded$0 = ((fd) this).d(-16);
        }
    }

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = Virogrid.field_F ? 1 : 0;
        ma var8 = new ma(((fd) this).field_z);
        if (param5 != 0) {
            boolean discarded$0 = ((fd) this).f(false);
        }
        fi var9 = (fi) (Object) var8.c(param5 ^ 12677);
        while (var9 != null) {
            // ifeq L109
            if (var9.f(true)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, 0, param6))) {
                    return true;
                }
            }
            var9 = (fi) (Object) var8.b(41);
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ke.field_r[ka.field_m] = param4;
        lk.field_Tb[ka.field_m] = ka.field_m;
        wh.field_c[ka.field_m] = param1;
        if (rk.field_e > param1) {
            ka.field_k = param1;
        }
        if (!(param1 <= bl.field_F)) {
            dj.field_c = param1;
        }
        vc.field_jb[ka.field_m] = param3;
        tg.field_A[ka.field_m] = param0;
        kf.field_j[ka.field_m] = param5;
        int var6 = param5 + (param0 + param3);
        int var7 = param2 == var6 ? 0 : 1000 * param3 / var6;
        vl.field_i[ka.field_m] = var7;
        if (!(dj.field_c >= var7)) {
            dj.field_c = var7;
        }
        ka.field_m = ka.field_m + 1;
        if (!(ka.field_k <= var7)) {
            ka.field_k = var7;
        }
    }

    final boolean b(int param0, fi param1) {
        ma var5 = null;
        fi var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param0 != 2) {
            return true;
        }
        if (!(!((fd) this).field_z.b((byte) 32))) {
            return false;
        }
        ma var8 = new ma(((fd) this).field_z);
        fi var4 = (fi) (Object) var8.a((byte) 48);
        while (var4 != null) {
            if (!(!var4.f(true))) {
                var5 = new ma(((fd) this).field_z);
                l discarded$0 = var5.b(1, (l) (Object) var4);
                var6 = (fi) (Object) var5.a(-1);
                while (var6 != null) {
                    if (var6.a(param1, param0 + -8517)) {
                        return true;
                    }
                    var6 = (fi) (Object) var5.a(param0 + -3);
                }
            }
            var4 = (fi) (Object) var8.a(param0 ^ -3);
        }
        return false;
    }

    private final void d(byte param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(((fd) this).field_z);
        fi var3 = (fi) (Object) var2.c(12677);
        if (param0 >= -17) {
            field_A = null;
        }
        while (var3 != null) {
            var3.d(false);
            var3 = (fi) (Object) var2.b(41);
        }
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var8 = Virogrid.field_F ? 1 : 0;
        ma var10 = new ma(((fd) this).field_z);
        fi var9 = (fi) (Object) var10.c(12677);
        while (var9 != null) {
            // ifeq L87
            if (var9.f(true)) {
                if (!(!var9.a(param0, param1, param2, -122))) {
                    return true;
                }
            }
            var9 = (fi) (Object) var10.b(41);
        }
        int var6 = 48 % ((-75 - param3) / 36);
        int var7 = param2;
        if ((var7 ^ -1) == -81) {
            return !dc.field_Y[81] ? ((fd) this).a(-16234, param0) : ((fd) this).b(2, param0);
        }
        return false;
    }

    final boolean a(fi param0, int param1) {
        int var5 = Virogrid.field_F ? 1 : 0;
        ma var3 = new ma(((fd) this).field_z);
        fi var4 = (fi) (Object) var3.c(12677);
        if (param1 != -8515) {
            boolean discarded$0 = ((fd) this).f(false);
        }
        while (var4 != null) {
            if (!(!var4.a(param0, -8515))) {
                return true;
            }
            var4 = (fi) (Object) var3.b(41);
        }
        return false;
    }

    final static void a(boolean param0, int param1) {
        wb.a(true, (byte) 125, param0);
        if (param1 != -20248) {
            field_C = 51;
        }
    }

    void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) -102);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param0 != 37) {
            Object var8 = null;
            boolean discarded$0 = ((fd) this).a(-9, (fi) null);
        }
        if (param3 == 0) {
            if (!(((fd) this).field_w == null)) {
                ((fd) this).field_w.a(param1, (fi) this, true, param2, -23294);
            }
        }
        ma var5 = new ma(((fd) this).field_z);
        fi var6 = (fi) (Object) var5.a((byte) 48);
        while (var6 != null) {
            var6.a((byte) 37, ((fd) this).field_l + param1, ((fd) this).field_u + param2, param3);
            var6 = (fi) (Object) var5.a(-1);
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            ((fd) this).field_z = null;
        }
        return ((fd) this).c((byte) -3) != null ? true : false;
    }

    final boolean a(int param0, fi param1) {
        ma var5 = null;
        fi var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (!(!((fd) this).field_z.b((byte) 95))) {
            return false;
        }
        if (param0 != -16234) {
            return false;
        }
        ma var8 = new ma(((fd) this).field_z);
        fi var4 = (fi) (Object) var8.c(12677);
        while (var4 != null) {
            if (var4.f(true)) {
                var5 = new ma(((fd) this).field_z);
                l discarded$0 = var5.a(param0 + 16150, (l) (Object) var4);
                var6 = (fi) (Object) var5.b(41);
                while (var6 != null) {
                    if (!(!var6.a(param1, param0 + 7719))) {
                        return true;
                    }
                    var6 = (fi) (Object) var5.b(41);
                }
            }
            var4 = (fi) (Object) var8.b(41);
        }
        return false;
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var10 = Virogrid.field_F ? 1 : 0;
        ma var8 = new ma(((fd) this).field_z);
        if (param2) {
            this.d((byte) -71);
        }
        fi var9 = (fi) (Object) var8.c(12677);
        while (var9 != null) {
            // ifeq L108
            if (!(!var9.a(param0, param1, false, ((fd) this).field_l + param3, param4, param5 - -((fd) this).field_u, param6))) {
                return true;
            }
            var9 = (fi) (Object) var8.b(41);
        }
        return false;
    }

    final void c(int param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(((fd) this).field_z);
        if (param0 != -1) {
            return;
        }
        fi var3 = (fi) (Object) var2.c(12677);
        while (var3 != null) {
            var3.c(-1);
            var3 = (fi) (Object) var2.b(41);
        }
    }

    String d(int param0) {
        String var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(((fd) this).field_z);
        fi var3 = (fi) (Object) var2.c(12677);
        while (var3 != null) {
            var4 = var3.d(70);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (fi) (Object) var2.b(41);
        }
        if (param0 > 35) {
            return null;
        }
        this.d((byte) -64);
        return null;
    }

    fi c(byte param0) {
        ma var2 = null;
        fi var3 = null;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          var2 = new ma(((fd) this).field_z);
          if (param0 == -3) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        var3 = (fi) (Object) var2.c(param0 + 12680);
        L1: while (true) {
          if (var3 != null) {
            if (var3.f(true)) {
              return var3;
            } else {
              var3 = (fi) (Object) var2.b(41);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        super.a(param0, 114, param2, param3);
        ma var5 = new ma(((fd) this).field_z);
        if (param1 < 113) {
            field_C = 3;
        }
        fi var6 = (fi) (Object) var5.c(12677);
        while (var6 != null) {
            // ifeq L104
            var6.a(param0 + ((fd) this).field_l, 124, param2, ((fd) this).field_u + param3);
            var6 = (fi) (Object) var5.b(41);
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        int var9 = Virogrid.field_F ? 1 : 0;
        ma var7 = new ma(((fd) this).field_z);
        fi var8 = (fi) (Object) var7.c(12677);
        while (var8 != null) {
            // ifeq L85
            var8.a(param0, param1, param2 - -((fd) this).field_l, param3, ((fd) this).field_u + param4, 104);
            var8 = (fi) (Object) var7.b(41);
        }
        if (param5 < 73) {
            field_A = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
