/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class d {
    static String field_c;
    static am field_a;
    static bi[] field_b;
    static ln field_d;

    final static boolean a(ve param0, ve param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = param1.field_zb - param0.field_zb;
          if (param2 == -81) {
            break L0;
          } else {
            var5 = null;
            int discarded$2 = d.a((byte) -70, 114, 120, (Random) null);
            break L0;
          }
        }
        L1: {
          if (jo.field_d == param1.field_xb) {
            // wide iinc 3 -200
            break L1;
          } else {
            if (null != param1.field_xb) {
              break L1;
            } else {
              // wide iinc 3 200
              break L1;
            }
          }
        }
        if (param0.field_xb != jo.field_d) {
          if (param0.field_xb == null) {
            L2: {
              // wide iinc 3 -200
              if (-1 <= var3) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L2;
              }
            }
            return stackIn_19_0 != 0;
          } else {
            L3: {
              if (-1 <= (var3 ^ -1)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            return stackIn_15_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if (-1 >= var3) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          return stackIn_10_0 != 0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -28065) {
            Object var2 = null;
            boolean discarded$0 = d.a((ve) null, (ve) null, (byte) -8);
        }
    }

    final static void a(int param0, byte param1) {
        try {
            if (wg.field_f != null) {
                // if_icmpgt L33
                // if_acmpne L25
            } else {
                js.field_f.field_j = 0;
                return;
            }
            if (param1 != 82) {
                return;
            }
            if (js.field_f.field_j == 0) {
                if ((mj.field_Pb - -10000L ^ -1L) > (pr.a(param1 + 14192) ^ -1L)) {
                    js.field_f.h(param0, param1 ^ 173);
                }
            }
            if (!((js.field_f.field_j ^ -1) >= -1)) {
                try {
                    wg.field_f.a(js.field_f.field_j, 0, js.field_f.field_h, param1 ^ -14022);
                    mj.field_Pb = pr.a(14274);
                } catch (IOException iOException) {
                    q.g(-119);
                }
                js.field_f.field_j = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1, int param2, Random param3) {
        if (param0 != -12) {
          d.a(-116);
          return param1 + hi.a(1 + -param1 + param2, param3, -11);
        } else {
          return param1 + hi.a(1 + -param1 + param2, param3, -11);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> fleets remaining.";
    }
}
