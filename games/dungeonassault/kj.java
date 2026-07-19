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
        Object discarded$2 = null;
        ep var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ep stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ep stackOut_7_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var4 = (byte[]) null;
                  discarded$2 = kj.a(false, true, (byte[]) null);
                  break L1;
                }
              }
              if (136 < param2.length) {
                var3 = new ep();
                ((un) ((Object) var3)).a(param2, 105);
                stackOut_7_0 = (ep) (var3);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param1) {
                  stackOut_12_0 = gg.a((byte) 49, param2);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_10_0 = (byte[]) (param2);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("kj.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            ii.a(ln.field_d, (byte) 93, ib.field_e, param1, param0, lc.field_d, true);
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
          throw vk.a((Throwable) ((Object) var2), "kj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, boolean param1, int param2, float param3) {
        try {
            if (!(null != hg.field_r)) {
                hg.field_r = new wi(lg.field_w, ub.field_o);
                lg.field_w.a(hg.field_r, -1);
            }
            hg.field_r.a(param1, param0, param3, (byte) 45);
            if (param2 != -2958) {
                kj.a(93);
            }
            gf.a();
            un.a(true, (byte) -106);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_p = null;
        field_o = null;
        if (param0 > -26) {
            field_n = -19;
        }
        field_k = null;
        field_i = null;
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        field_n = 0;
        field_m = "Loading extra data";
        field_p = new ad(6, 0, 4, 2);
        field_k = "Checking";
        field_i = "A knight in very nasty-looking, black, skeletal armour, holding a shield with a skull on it and a magical sword. Through countless victorious battles, this raider has gained a mastery over death.";
    }
}
