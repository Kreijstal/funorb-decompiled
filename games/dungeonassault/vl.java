/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends hl {
    private String field_n;
    private String field_o;
    static int field_m;
    static String field_l;

    final void a(ec param0, byte param1) {
        if (param1 >= -5) {
            return;
        }
        try {
            param0.a(2, ((vl) this).field_o);
            param0.a(((vl) this).field_n, (byte) 101);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "vl.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static String c() {
        if (ql.field_f != ol.field_i) {
          if (ql.field_f == wd.field_d) {
            return bf.field_o;
          } else {
            if (!im.field_b.b(36)) {
              return bf.field_o;
            } else {
              return co.field_C;
            }
          }
        } else {
          return ho.field_i;
        }
    }

    public static void a() {
        field_l = null;
    }

    final static q[] d() {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        q[] var1 = new q[dk.field_d];
        for (var2 = 0; dk.field_d > var2; var2++) {
            var1[var2] = new q(ce.field_x, tb.field_i, hg.field_t[var2], fe.field_g[var2], jc.field_f[var2], jn.field_k[var2], ub.field_q[var2], uo.field_b);
        }
        int discarded$0 = 500;
        sb.a();
        return var1;
    }

    final fd b(int param0) {
        int var2 = -64 / ((param0 - -56) / 41);
        return pe.field_j;
    }

    final static void a(int param0, byte param1) {
        if (!(ed.c(true))) {
            if (!(1 > gm.field_d.field_K)) {
                return;
            }
            gm.field_d.field_K = 1;
            ac.field_B.d((byte) -78, 72);
            ac.field_B.a(6, gm.field_d.field_K);
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -58) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              if ((param2[param0 >> 5] & 1 << (param0 & 31)) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vl.G(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    vl(String param0, String param1) {
        try {
            ((vl) this).field_o = param0;
            ((vl) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_l = "This target is much less powerful than you, and is <%0>% more likely to wake.<br>(Renown gambled: <%1>)";
    }
}
