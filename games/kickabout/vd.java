/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vd {
    static tf field_a;
    static String field_b;
    static int field_c;

    final static void a(int param0, int param1) {
        if (param1 <= rl.field_r) {
          return;
        } else {
          rl.field_r = param1;
          dg.field_c = nv.field_I[dq.a((byte) 115, nv.field_I.length, ru.field_l)];
          jm.a(1, 9863, 0);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 11277) {
          if (param2 >= param0) {
            return no.b((param0 << 16) / param2, param1 ^ 4565);
          } else {
            return 2048 - no.b((param2 << 16) / param0, 15832);
          }
        } else {
          return -52;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (null != um.field_e) {
          if (5 != um.field_e.field_o.field_u) {
            if (um.field_e == null) {
              if (null != ra.field_G) {
                return false;
              } else {
                L0: {
                  var1 = cq.field_h.field_c;
                  if (-5 == var1) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  }
                }
                return stackIn_17_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (um.field_e == null) {
            if (null == ra.field_G) {
              var1 = cq.field_h.field_c;
              if (-5 != var1) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Refresh Auctions";
        field_a = new tf();
    }
}
