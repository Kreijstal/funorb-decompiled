/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ep extends le {
    byte[] field_j;
    static volatile int field_m;
    static java.util.zip.CRC32 field_h;
    static bp field_l;
    static int field_i;
    int field_k;

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = ZombieDawn.field_J;
        wo.field_yb.a(true);
        for (var1_int = 0; var1_int < 32; var1_int++) {
            ji.field_c[var1_int] = 0L;
        }
        if (param0 != -50) {
            return;
        }
        try {
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ZombieDawn.field_E[var1_int] = 0L;
            }
            fc.field_Ob = 0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ep.C(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        pk.field_N = param1;
        b.field_l = param0;
        if (null != wo.field_xb) {
            wo.field_xb.b(param0, false, param1);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_l = null;
    }

    private ep() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_h = new java.util.zip.CRC32();
    }
}
