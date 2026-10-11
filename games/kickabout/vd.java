/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vd {
    static tf field_a;
    static String field_b;
    static int field_c;

    final static void a(int param0, int param1) {
        if (param1 > rl.field_r) {
          rl.field_r = param1;
          dg.field_c = nv.field_I[dq.$cfr$intArgs$a$7f8aad568c81(115, nv.field_I.length, ru.field_l)];
          jm.a(1, param0 + 9863, param0);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 11277) {
          return -52;
        }
        if (param2 < param0) {
          return 2048 - no.b((param2 << 16) / param0, 15832);
        }
        return no.b((param0 << 16) / param2, param1 ^ 4565);
    }

    public static void a(int param0) {
        if (param0 != -5) {
          field_c = -62;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        int var1;
        int var1Lifetime1;
        if (param0 == 82) {
          if (null != um.field_e &&
            5 == um.field_e.field_o.field_u) {
            return true;
          }
          if (um.field_e == null &&
            null == ra.field_G) {
            var1 = cq.field_h.field_c;
            if (-5 == var1) {
              return false;
            }
            return true;
          }
          return false;
        }
        field_b = (String) null;
        if (null != um.field_e &&
          5 == um.field_e.field_o.field_u) {
          return true;
        }
        if (um.field_e != null) {
          return false;
        }
        if (null != ra.field_G) {
          return false;
        }
        var1Lifetime1 = cq.field_h.field_c;
        if (-5 == var1Lifetime1) {
          return false;
        }
        return true;
    }

    static {
        field_b = "Refresh Auctions";
        field_a = new tf();
    }
}
