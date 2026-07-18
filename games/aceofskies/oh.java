/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oh extends wf {
    int[] field_f;
    int field_e;

    final static kc a(double param0, byte param1) {
        double var3 = (double)bs.a(-1, ci.field_i, (int)(param0 * 20000.0)) - 10000.0 * param0;
        double var5 = -(param0 * 10000.0) + (double)bs.a(-1, ci.field_i, (int)(param0 * 20000.0));
        return new kc(var3 / 10000.0, var5 / 10000.0);
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = param1 >>> 31;
        int var4 = -72 / ((-58 - param2) / 62);
        return -var3 + (var3 + param1) / param0;
    }

    final static boolean a(byte param0) {
        return !gm.field_x.a(false);
    }

    private oh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
