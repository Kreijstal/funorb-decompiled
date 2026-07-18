/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_b;
    static int[] field_i;
    static ak field_g;
    private String field_f;
    static byte[][] field_e;
    static ob field_h;
    static mo field_d;
    static String field_a;
    static String field_c;

    final String a(int param0) {
        if (param0 != -30491) {
            field_c = null;
            return ((sc) this).field_f;
        }
        return ((sc) this).field_f;
    }

    final static boolean b(int param0) {
        if (param0 != -10093) {
            boolean discarded$6 = sc.b(-27);
            return he.field_f != null ? true : false;
        }
        return he.field_f != null ? true : false;
    }

    final static String c() {
        if (!(hf.field_q >= 2)) {
            return td.field_d;
        }
        if (!(null == hn.field_e)) {
            if (hn.field_e.b(-3)) {
                return wa.field_a;
            }
            return hm.field_a;
        }
        if (!(wk.field_j.b(-3))) {
            return im.field_Mb;
        }
        if (!wk.field_j.a("commonui", -1)) {
            return g.field_q + " - " + wk.field_j.c(119, "commonui") + "%";
        }
        if (!(io.field_g.b(-3))) {
            return ha.field_f;
        }
        if (!(io.field_g.a("commonui", -1))) {
            return pc.field_x + " - " + io.field_g.c(105, "commonui") + "%";
        }
        if (!(qo.field_u.b(-3))) {
            return jd.field_p;
        }
        if (!(qo.field_u.a((byte) 92))) {
            return em.field_a + " - " + qo.field_u.c(0) + "%";
        }
        return wd.field_b;
    }

    sc(String param0) {
        this(param0, false);
    }

    sc(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              ((sc) this).field_f = param0;
              if (null != ((sc) this).field_f) {
                break L1;
              } else {
                ((sc) this).field_f = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((sc) this).field_b = stackIn_6_1 != 0;
            if (((sc) this).field_f.length() == 0) {
              ((sc) this).field_b = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("sc.<init>(");
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
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0) {
        int var2 = -65 / ((59 - param0) / 43);
        return ((sc) this).field_b;
    }

    public static void a() {
        field_a = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_i = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[1000][];
        field_i = new int[128];
        field_c = "Accept rematch";
    }
}
