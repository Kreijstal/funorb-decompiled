/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pl extends ae implements je {
    static Random field_P;
    static pb field_T;
    static String field_V;
    private w field_X;
    static int[] field_S;
    static int field_U;
    private int field_O;
    static oj field_W;
    static long[] field_Q;
    static pb field_R;

    final void l(int param0) {
        super.l(param0);
        if (!(null == ((pl) this).field_X)) {
            ((pl) this).field_X.a(-95);
        }
    }

    public final w a(byte param0) {
        if (param0 < 19) {
            field_W = null;
        }
        return ((pl) this).field_X;
    }

    final String d(int param0) {
        if (!((pl) this).field_q) {
            return null;
        }
        if (null == ((pl) this).field_x) {
            return null;
        }
        if (param0 != 3690) {
            return null;
        }
        nc.b((byte) 98, ni.field_e - ((pl) this).field_O - -((pl) this).field_p, eb.field_a);
        return ((pl) this).field_x;
    }

    final void a(byte param0, w param1) {
        try {
            if (param0 != -2) {
                ((pl) this).field_O = 50;
            }
            ((pl) this).field_X = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pl.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    pl(String param0, lf param1, int param2) {
        super(param0, param1, param2);
    }

    final static void b(byte param0, int param1) {
        lk.field_h = (param1 & 54) >> 4;
        if (!(lk.field_h <= 2)) {
            lk.field_h = 2;
        }
        ka.field_p = (12 & param1) >> 2;
        rl.field_a = 3 & param1;
        if (2 < ka.field_p) {
            ka.field_p = 2;
        }
        if (2 < rl.field_a) {
            rl.field_a = 2;
        }
    }

    public static void q() {
        field_S = null;
        field_V = null;
        field_Q = null;
        field_T = null;
        field_R = null;
        field_W = null;
        field_P = null;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((pl) this).field_O = -((pl) this).field_w + ni.field_e - param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pl.N(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static int e() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        var2 = stellarshard.field_B;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 1000) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (null != a.field_h[var1_int]) {
                  var1_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = var1_int;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "pl.A(" + 63 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Your ships shields lose 20% of their charge each hit.<br>Their current strength is shown at the base of the screen.<br>Collect shield powerups to recharge your defences.";
        field_P = new Random();
        field_S = new int[8192];
        field_U = 0;
        field_W = new oj();
        field_Q = new long[1000];
    }
}
