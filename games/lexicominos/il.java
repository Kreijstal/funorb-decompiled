/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    static int field_c;
    static String field_a;
    static ng field_b;

    final static int a(int param0, String param1, String param2, String param3, boolean param4, int param5, int param6) {
        gb var7 = null;
        gb var8 = null;
        var7 = new gb(param1);
        var8 = new gb(param3);
        if (param5 < 88) {
          il.a(40);
          return hc.a(param6, param0, var8, -30762, var7, param2, param4);
        } else {
          return hc.a(param6, param0, var8, -30762, var7, param2, param4);
        }
    }

    final static sh a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
            dl var6 = null;
            IOException var6_ref = null;
            dl var7 = null;
            ug var8 = null;
            sh stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            sh stackOut_14_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (sa.field_g.field_t != null) {
                  wj.field_s = new be(sa.field_g.field_t, 5200, 0);
                  sa.field_g.field_t = null;
                  var6 = new dl(255, wj.field_s, new be(sa.field_g.field_o, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (null == wj.field_s) {
                  break L1;
                } else {
                  L2: {
                    if (bd.field_i != null) {
                      break L2;
                    } else {
                      bd.field_i = new be[sa.field_g.field_c.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (null == bd.field_i[param3]) {
                      bd.field_i[param3] = new be(sa.field_g.field_c[param3], 12000, 0);
                      sa.field_g.field_c[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = new dl(param3, wj.field_s, bd.field_i[param3], 2097152);
                  break L1;
                }
              }
              L4: {
                var8 = nh.field_a.a(param3, 3510, var7, var6, param2);
                if (param1 == 12317) {
                  break L4;
                } else {
                  sh discarded$2 = il.a(false, -117, false, -23, true, 38);
                  break L4;
                }
              }
              L5: {
                if (!param4) {
                  break L5;
                } else {
                  var8.c(11002);
                  break L5;
                }
              }
              stackOut_14_0 = new sh((hf) (Object) var8, param0, param5);
              stackIn_15_0 = stackOut_14_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_a = "Play the game without logging in just yet";
        field_b = new ng();
    }
}
