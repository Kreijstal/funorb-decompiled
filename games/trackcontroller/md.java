/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_f;
    static char field_d;
    static int[] field_b;
    static String field_c;
    static double field_a;
    static ba field_e;

    final static void a(kd param0, int param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              pl.field_a[0] = ta.field_c.nextInt();
              pl.field_a[1] = ta.field_c.nextInt();
              pl.field_a[3] = (int)h.field_d;
              pl.field_a[2] = (int)(h.field_d >> 32);
              ui.field_p.field_k = 0;
              ui.field_p.b(false, pl.field_a[0]);
              ui.field_p.b(false, pl.field_a[1]);
              ui.field_p.b(false, pl.field_a[2]);
              ui.field_p.b(false, pl.field_a[3]);
              int discarded$2 = -69;
              vd.a(ui.field_p);
              ui.field_p.b(param1, (byte) -124);
              param0.a((byte) -6, ui.field_p);
              ra.field_C.field_k = 0;
              if (!param2) {
                ra.field_C.a(16, (byte) -96);
                break L1;
              } else {
                ra.field_C.a(18, (byte) -105);
                break L1;
              }
            }
            L2: {
              ra.field_C.field_k = ra.field_C.field_k + 2;
              var5_int = ra.field_C.field_k;
              ra.field_C.b(false, db.field_Z);
              ra.field_C.a(sb.field_a, 2147483647);
              var6 = 0;
              if (oc.field_i) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (mk.field_c) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (kg.field_a == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              ra.field_C.a(var6, (byte) -77);
              int discarded$3 = -22004;
              var7 = bg.a(gd.b((byte) 77));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ra.field_C.a((byte) -57, var7);
              if (null == kg.field_a) {
                break L7;
              } else {
                ra.field_C.b(kg.field_a, 126);
                break L7;
              }
            }
            ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, 0, ui.field_p);
            ra.field_C.c(ra.field_C.field_k - var5_int, (byte) -96);
            me.a(-1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("md.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 44 + -1 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, cf param1, int param2) {
        la var6 = null;
        int var5 = 0;
        try {
            var6 = ra.field_C;
            var6.c(param0, 7);
            int var4 = 81 / ((-12 - param2) / 48);
            var6.field_k = var6.field_k + 1;
            var5 = var6.field_k;
            var6.a(1, (byte) -87);
            var6.a(param1.field_j, (byte) -91);
            var6.a(param1.field_k, (byte) -77);
            var6.b(false, param1.field_i);
            var6.b(false, param1.field_n);
            var6.b(false, param1.field_l);
            var6.b(false, param1.field_o);
            int discarded$0 = var6.a(var5, false);
            var6.a(true, -var5 + var6.field_k);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "md.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
        field_c = "To Customer Support";
        field_f = "Create a free Account";
        field_a = Math.atan2(1.0, 0.0);
        field_e = new ba();
    }
}
