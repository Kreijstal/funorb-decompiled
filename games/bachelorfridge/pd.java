/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    si field_g;
    String field_c;
    String field_h;
    int field_b;
    boolean field_e;
    int field_a;
    int field_f;
    static int field_d;

    final static int a(byte param0, CharSequence param1) {
        Object var3 = null;
        if (param0 != 47) {
          var3 = null;
          int discarded$2 = pd.a((byte) 78, (CharSequence) null);
          return kna.a(10, param1, true, 24808);
        } else {
          return kna.a(10, param1, true, 24808);
        }
    }

    pd(int param0, String param1, String param2, int param3, si param4, int param5, boolean param6) {
        ((pd) this).field_h = param1;
        ((pd) this).field_a = param5;
        ((pd) this).field_b = param0;
        ((pd) this).field_e = param6 ? true : false;
        ((pd) this).field_c = param2;
        ((pd) this).field_g = param4;
        ((pd) this).field_f = param3;
        Random var8 = new Random((long)param0);
        int discarded$0 = kla.a(10, var8, -2147483648);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 605;
    }
}
