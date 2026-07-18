/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends hg {
    int field_l;
    static String field_p;
    int field_r;
    int field_s;
    static String field_g;
    int field_q;
    int field_i;
    int field_h;
    static ee field_n;
    int field_o;
    int field_m;
    static String field_k;
    int field_j;

    final static void a(vj param0, boolean param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              rh.field_O[0] = gk.field_a.nextInt();
              rh.field_O[1] = gk.field_a.nextInt();
              qj.field_a.field_m = 0;
              rh.field_O[2] = (int)(va.field_b >> 32);
              rh.field_O[3] = (int)va.field_b;
              qj.field_a.a((byte) 126, rh.field_O[0]);
              qj.field_a.a((byte) 123, rh.field_O[1]);
              qj.field_a.a((byte) 124, rh.field_O[2]);
              qj.field_a.a((byte) 126, rh.field_O[3]);
              jm.a(0, qj.field_a);
              qj.field_a.h(13, param2);
              param0.a(qj.field_a, (byte) -121);
              om.field_c.field_m = 0;
              if (!param1) {
                om.field_c.f(16, -123);
                break L1;
              } else {
                om.field_c.f(18, -123);
                break L1;
              }
            }
            L2: {
              om.field_c.field_m = om.field_c.field_m + 2;
              var5_int = om.field_c.field_m;
              om.field_c.a((byte) 123, jm.field_L);
              om.field_c.a(ck.field_q, (byte) -23);
              var6 = 0;
              if (!ej.field_d) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (!jc.field_b) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param3) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == p.field_i) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              om.field_c.f(var6, -123);
              var7 = tf.a(-1, oc.d((byte) -120));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            om.field_c.a(var7, 101);
            L7: {
              if (p.field_i != null) {
                om.field_c.a((byte) 100, p.field_i);
                break L7;
              } else {
                break L7;
              }
            }
            bn.a(0, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
            om.field_c.i(-var5_int + om.field_c.field_m, 32614);
            rn.a(-1, 30785);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("oh.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + -99 + ')');
        }
    }

    public static void a() {
        field_p = null;
        field_k = null;
        field_n = null;
        field_g = null;
    }

    oh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Extra thrust";
        field_n = new ee("usename");
        field_k = " - activate shield";
    }
}
