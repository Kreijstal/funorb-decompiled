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
            {
                if (var2_int >= 0) {
                    int discarded$3 = -1;
                    if (gm.g() <= 30000L) {
                        return false;
                    }
                }
                int discarded$4 = 1;
                te.b();
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_n = null;
        field_e = null;
        int var1 = 1;
        field_l = null;
        field_h = null;
    }

    wo() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        ((wo) this).field_g = param6;
        ((wo) this).field_j = param5;
        ((wo) this).field_m = param4;
        if (param1 != 251) {
            return;
        }
        try {
            ((wo) this).field_f = param0;
            ((wo) this).field_i = param7;
            ((wo) this).field_k = param3;
            ((wo) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wo.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_n = new hd(3);
        field_e = "Connection lost - attempting to reconnect";
        field_h = "Unfortunately we are unable to create an account for you at this time.";
    }
}
