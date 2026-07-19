/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wo extends wf {
    static char[] field_l;
    int field_k;
    int field_f;
    int field_m;
    static hd field_n;
    int[] field_g;
    static int field_o;
    int field_p;
    int field_j;
    int field_i;
    static String field_e;
    static String field_h;

    final static boolean a(int param0, boolean param1) {
        try {
            if (nm.field_c.field_g >= param0) {
                return true;
            }
            if (!(null != ft.field_l)) {
                return false;
            }
            if (!param1) {
                field_l = (char[]) null;
            }
            int var2_int = ft.field_l.b(-118);
            if (!(var2_int <= 0)) {
                if (!(var2_int <= param0 + -nm.field_c.field_g)) {
                    var2_int = param0 - nm.field_c.field_g;
                }
                ft.field_l.a(nm.field_c.field_g, var2_int, nm.field_c.field_f, true);
                ff.field_b = kh.a(-127);
                nm.field_c.field_g = nm.field_c.field_g + var2_int;
                if (!(nm.field_c.field_g >= param0)) {
                    return false;
                }
                nm.field_c.field_g = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (var2_int >= 0) {
                    if (-30001L <= (gm.g(-1) ^ -1L)) {
                        return false;
                    }
                }
                te.b(true);
            } catch (IOException iOException) {
                te.b(true);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_e = null;
        int var1 = 101 % ((param0 - -20) / 42);
        field_l = null;
        field_h = null;
    }

    wo() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        this.field_g = param6;
        this.field_j = param5;
        this.field_m = param4;
        if (param1 != 251) {
            return;
        }
        try {
            this.field_f = param0;
            this.field_i = param7;
            this.field_k = param3;
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wo.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        field_l = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_n = new hd(3);
        field_e = "Connection lost - attempting to reconnect";
        field_h = "Unfortunately we are unable to create an account for you at this time.";
    }
}
