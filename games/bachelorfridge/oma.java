/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oma {
    static int[] field_a;

    public static void a(byte param0) {
        if (param0 != 51) {
            field_a = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, Random param1, eaa param2, gw param3, int param4, dha param5) {
        cia var9 = null;
        boolean discarded$0 = false;
        int var8 = BachelorFridge.field_y;
        try {
            var9 = (cia) ((Object) param2.b((byte) 90));
            while (var9 != null) {
                discarded$0 = var9.b(true);
                var9 = (cia) ((Object) param2.c(0));
            }
            int var7 = -10 / ((param4 - -9) / 53);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oma.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
