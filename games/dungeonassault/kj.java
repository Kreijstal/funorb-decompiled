/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ne {
    int[] field_l;
    static ad field_p;
    static int field_n;
    static String field_m;
    int field_j;
    static String field_k;
    static String field_i;
    static wh field_o;

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        ep var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        ep stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ep stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var4 = null;
              Object discarded$4 = kj.a(false, true, (byte[]) null);
              if (136 < param2.length) {
                var3 = new ep();
                ((un) (Object) var3).a(param2, 105);
                stackOut_5_0 = (ep) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param2;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("kj.B(").append(0).append(44).append(0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return (Object) (Object) stackIn_6_0;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            ii.a(ln.field_d, (byte) 93, ib.field_e, 0, param0, lc.field_d, true);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= lc.field_d) {
                L2: {
                  ii.a(n.field_d, (byte) -65, da.field_B, param0, param0 + param0, lc.field_d - -param0, false);
                  if (param0 < lc.field_d) {
                    lc.field_d = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                ol.field_k[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "kj.C(" + param0 + 44 + 0 + 41);
        }
    }

    final static void a(String param0, boolean param1, int param2, float param3) {
        try {
            if (!(null != hg.field_r)) {
                hg.field_r = new wi(lg.field_w, ub.field_o);
                lg.field_w.a((lm) (Object) hg.field_r, -1);
            }
            hg.field_r.a(param1, param0, param3, (byte) 45);
            gf.a();
            int discarded$0 = -106;
            un.a(true);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kj.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -2958 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_m = null;
        field_p = null;
        field_o = null;
        field_k = null;
        field_i = null;
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_m = "Loading extra data";
        field_p = new ad(6, 0, 4, 2);
        field_k = "Checking";
        field_i = "A knight in very nasty-looking, black, skeletal armour, holding a shield with a skull on it and a magical sword. Through countless victorious battles, this raider has gained a mastery over death.";
    }
}
