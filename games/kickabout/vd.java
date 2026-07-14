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
          jm.a(1, param0 + 9863, param0);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 11277) {
          if (param2 >= param0) {
            return no.b((param0 << 1514405456) / param2, param1 ^ 4565);
          } else {
            return 2048 - no.b((param2 << 795101264) / param0, 15832);
          }
        } else {
          return -52;
        }
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
        int var1 = 0;
        if (param0 == 82) {
          L0: {
            if (null == um.field_e) {
              break L0;
            } else {
              if (5 != um.field_e.field_o.field_u) {
                break L0;
              } else {
                return true;
              }
            }
          }
          L1: {
            if (um.field_e != null) {
              break L1;
            } else {
              if (null != ra.field_G) {
                break L1;
              } else {
                var1 = cq.field_h.field_c;
                if (-5 == var1) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        } else {
          field_b = null;
          if (null != um.field_e) {
            if (5 != um.field_e.field_o.field_u) {
              if (um.field_e == null) {
                if (null == ra.field_G) {
                  var1 = cq.field_h.field_c;
                  if (-5 == var1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
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
                if (-5 == var1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
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
