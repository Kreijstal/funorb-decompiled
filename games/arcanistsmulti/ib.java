/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ib extends jm {
    static String[] field_v;
    static int field_r;
    static aj field_q;
    static kc field_s;
    static String field_t;
    static int field_u;
    static String field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        lj.field_k = param2;
        u.field_l = param1;
        tm.field_b = param3;
        mh.field_H = param0;
    }

    final static void a(int param0, int param1) {
        ab var2 = he.field_e;
        var2.b((byte) -79, param0);
        var2.f(1, (byte) -92);
        var2.f(param1, (byte) -32);
    }

    ib(int param0) {
        this(ia.field_c, param0);
    }

    public static void a(boolean param0) {
        field_p = null;
        field_q = null;
        field_s = null;
        field_t = null;
        field_v = null;
    }

    final static boolean b(boolean param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) ch.field_a;
        synchronized (var1_ref) {
          L0: {
            if (gn.field_b != vk.field_u) {
              L1: {
                vn.field_d = v.field_p[vk.field_u];
                ed.field_Bb = qa.field_i[vk.field_u];
                vk.field_u = 1 + vk.field_u & 127;
                if (!param0) {
                  break L1;
                } else {
                  ib.a(false, -118);
                  break L1;
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static km a(int param0, String param1) {
        RuntimeException var2 = null;
        km stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_4_0 = null;
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
              if (!wn.field_z.a((byte) -94)) {
                break L1;
              } else {
                if (!param1.equals((Object) (Object) wn.field_z.a(true))) {
                  wn.field_z = nj.a(param1, -100);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = wn.field_z;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ib.FA(").append(2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(boolean param0, int param1) {
        if (pm.field_b != null) {
          if (pm.field_b.c(param0, (byte) 48)) {
            pm.field_b = null;
            if (param1 != 2) {
              ib.a(41, -89);
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 2) {
              ib.a(41, -89);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 2) {
            ib.a(41, -89);
            return;
          } else {
            return;
          }
        }
    }

    ib(dj param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        try {
            if (!(!param4)) {
                kh.a(param0.field_v, param0.field_n + param2, param3 - -param0.field_j, param0.field_k, 82);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ib.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new aj(8, 0, 4, 1);
        field_p = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_t = "Create a free Account";
    }
}
