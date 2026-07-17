/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hd extends nb {
    static int[] field_u;
    static String[] field_p;
    int field_q;
    int field_v;
    int field_t;
    int field_r;
    static int field_y;
    int field_w;
    static int[] field_s;
    int field_x;

    final static void a(int param0, int param1, int param2) {
        dp.field_h = param0;
        Object var4 = null;
        mn.a(-1, (String) null, true);
        int var3 = -120 / ((-77 - param1) / 47);
    }

    public static void d(byte param0) {
        field_p = null;
        field_s = null;
        field_u = null;
    }

    final static dj a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            om var8 = null;
            dj stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            dj stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null == lc.field_a.field_e) {
                    break L1;
                  } else {
                    da.field_j = new sf(lc.field_a.field_e, 5200, 0);
                    lc.field_a.field_e = null;
                    var6 = (Object) (Object) new na(255, da.field_j, new sf(lc.field_a.field_i, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (da.field_j == null) {
                    break L2;
                  } else {
                    L3: {
                      if (lg.field_v == null) {
                        lg.field_v = new sf[lc.field_a.field_q.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null != lg.field_v[param2]) {
                        break L4;
                      } else {
                        lg.field_v[param2] = new sf(lc.field_a.field_q[param2], 12000, 0);
                        lc.field_a.field_q[param2] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new na(param2, da.field_j, lg.field_v[param2], 2097152);
                    break L2;
                  }
                }
                var8 = ep.field_l.a((na) var7, (byte) -106, false, param2, (na) var6);
                L5: {
                  if (!param5) {
                    break L5;
                  } else {
                    var8.a(false);
                    break L5;
                  }
                }
                stackOut_13_0 = new dj((w) (Object) var8, true, param3);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[16];
        field_p = new String[]{"Showing by rating", "Showing by win percentage"};
        field_y = 131072;
    }
}
