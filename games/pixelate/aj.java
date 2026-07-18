/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fa {
    int[] field_r;
    static gp field_k;
    static long field_m;
    static int field_t;
    int[] field_u;
    int field_p;
    static int field_n;
    int field_s;
    ei[] field_v;
    byte[][][] field_w;
    int[] field_q;
    ei[] field_l;
    static int[] field_o;

    final static Object a(boolean param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bh var4 = null;
        Object stackIn_2_0 = null;
        bh stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        bh stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var3_int = -39 / ((param2 - -35) / 52);
              if (param1.length <= 136) {
                stackOut_6_0 = (byte[]) param1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4 = new bh();
                ((gf) (Object) var4).a(param1, true);
                stackOut_4_0 = (bh) var4;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("aj.D(").append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return (Object) (Object) stackIn_7_0;
    }

    public static void a() {
        field_o = null;
        field_k = null;
    }

    final static void a(fm param0, fm param1) {
        try {
            nk.a(eg.field_k, (jl) (Object) c.field_Y, ug.field_s, sc.field_g, (byte) 125, kj.field_l, dn.field_c, bl.field_d, qk.field_d, true, mg.field_h, l.field_q);
            h.field_V = eh.a("chatfilter", "lobby", (byte) 47, param1);
            rg.field_a[1] = a.field_J;
            int var4_int = -1;
            rg.field_a[0] = kc.field_m;
            rg.field_a[2] = wd.field_e;
            ck.a(65793, (jl) (Object) ig.field_d, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "aj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ',' + -94 + ')');
        }
    }

    final static boolean b(byte param0) {
        Object var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -42) {
          if (!ik.field_a) {
            if (jg.a((byte) 78)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!db.field_U) {
              L0: {
                if (!jg.a((byte) 78)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          var2 = null;
          Object discarded$5 = aj.a(false, (byte[]) null, -36);
          if (ik.field_a) {
            if (db.field_U) {
              return true;
            } else {
              L1: {
                if (!jg.a((byte) 78)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!jg.a((byte) 78)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    aj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{303, 375, 440, 498, 560};
    }
}
