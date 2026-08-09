/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static int field_a;
    static String field_c;
    static bc field_h;
    static String field_g;
    static int field_e;
    static ds field_b;
    static bi[][] field_i;
    static boolean field_f;
    static bi field_d;

    final static void a(boolean param0) {
        k.field_b = false;
        if (!param0) {
            oi.a(-116, (byte) -74);
        }
    }

    final static void a(byte param0, bc param1) {
        int var2_int = 0;
        int var3 = 0;
        bc var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ln.field_K = mf.a(param1, "", "starfield", false);
            mp.field_e = new bi[6];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 6) {
                L2: {
                  ce.field_v = mf.a(param1, "", "win", false);
                  dp.field_s = mf.a(param1, "", "lose", false);
                  if (param0 == -126) {
                    break L2;
                  } else {
                    var4 = (bc) null;
                    oi.a((byte) -117, (bc) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                mp.field_e[var2_int] = vr.a(param1, var2_int - -1, 1);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("oi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -1) {
            oi.a(52);
        }
        field_d = null;
        field_i = (bi[][]) null;
        field_g = null;
        field_c = null;
    }

    final static bi a(int param0, byte param1) {
        bi dupTemp$0 = null;
        bi var3 = null;
        bi var2 = bd.field_C[param0];
        if (!(var2 != null)) {
            dupTemp$0 = new bi(32, 32);
            var3 = dupTemp$0;
            var2 = var3;
            bd.field_C[param0] = dupTemp$0;
            bs.a(var3, 77);
            jd.field_j[param0].g(0, 0);
            cg.i(0);
        }
        if (param1 != 66) {
            oi.a(-57);
        }
        return var2;
    }

    static {
        field_g = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new ds(2);
    }
}
