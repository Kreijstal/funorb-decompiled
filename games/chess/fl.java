/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends o {
    nl[] field_u;
    static int field_n;
    static String field_k;
    int field_t;
    int[] field_v;
    nl[] field_w;
    static boolean field_j;
    static int field_p;
    int[] field_o;
    int[] field_q;
    byte[][][] field_r;
    int field_l;
    static int field_x;
    static String field_s;
    static um field_m;

    final static ci c(byte param0) {
        return fg.field_d.field_Fb;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) bj.field_cb;
        synchronized (var1) {
          L0: {
            wh.field_f = nd.field_l;
            qf.field_a = qf.field_a + 1;
            hn.field_k = o.field_b;
            rf.field_b = cb.field_b;
            lf.field_O = rc.field_d;
            rc.field_d = false;
            th.field_d = bl.field_g;
            re.field_m = ub.field_b;
            ag.field_f = pd.field_Eb;
            bl.field_g = 0;
            break L0;
          }
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        field_m = null;
        field_k = null;
    }

    final static boolean a(int[] param0, long param1, int param2, String param3, byte param4) {
        di var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!ph.a(param2, (byte) -43, param3, param1, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (1 != param2) {
                  break L1;
                } else {
                  param2 = 0;
                  break L1;
                }
              }
              L2: {
                if (param4 > 99) {
                  break L2;
                } else {
                  var7 = null;
                  boolean discarded$2 = fl.a((int[]) null, -126L, 111, (String) null, (byte) 60);
                  break L2;
                }
              }
              vk.field_g = param2;
              ij.field_c = param3;
              var8 = (CharSequence) (Object) param3;
              ec.field_f = ad.a(var8, -2);
              re.field_p = param1;
              var6 = dn.a(va.field_d, param0, vj.field_g, wk.field_c, 13911);
              pg.a((byte) -18, var6);
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("fl.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
        return stackIn_9_0 != 0;
    }

    fl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Start Game";
        field_j = true;
        field_x = 0;
        field_s = "Solicitation";
    }
}
