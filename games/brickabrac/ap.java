/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static mh field_e;
    static jp[] field_c;
    static jp field_a;
    static jp field_f;
    static String field_d;
    static vj field_b;

    final static void a(int param0, int param1, byte param2) {
        ll.field_b = param1;
        oo.field_v = param0;
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = qc.a(ah.a(true, param1), (byte) 3);
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            stackOut_2_0 = (String) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ap.E(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = -102 / ((-11 - param1) / 37);
        if ((long)param0 < 65536L) {
          if ((long)param0 >= 256L) {
            if ((long)param0 < 4096L) {
              if ((long)param0 < 1024L) {
                return lj.field_l[param0 >> 2] >> 11;
              } else {
                return lj.field_l[param0 >> 4] >> 10;
              }
            } else {
              if (16384L > (long)param0) {
                return lj.field_l[param0 >> 6] >> 9;
              } else {
                return lj.field_l[param0 >> 8] >> 8;
              }
            }
          } else {
            if (param0 >= 0) {
              return lj.field_l[param0] >> 12;
            } else {
              return -1;
            }
          }
        } else {
          if ((long)param0 >= 16777216L) {
            if ((long)param0 < 268435456L) {
              if ((long)param0 < 67108864L) {
                return lj.field_l[param0 >> 18] >> 3;
              } else {
                return lj.field_l[param0 >> 20] >> 2;
              }
            } else {
              if (1073741824L <= (long)param0) {
                return lj.field_l[param0 >> 24];
              } else {
                return lj.field_l[param0 >> 22] >> 1;
              }
            }
          } else {
            if ((long)param0 < 1048576L) {
              if ((long)param0 < 262144L) {
                return lj.field_l[param0 >> 10] >> 7;
              } else {
                return lj.field_l[param0 >> 12] >> 6;
              }
            } else {
              if ((long)param0 < 4194304L) {
                return lj.field_l[param0 >> 14] >> 5;
              } else {
                return lj.field_l[param0 >> 16] >> 4;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0) {
            ap.a(true);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            md.a(-118, (java.awt.Component) (Object) param1);
            pl.a((java.awt.Component) (Object) param1, 7282);
            if (null == qa.field_x) {
              break L0;
            } else {
              qa.field_x.a((byte) 44, (java.awt.Component) (Object) param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ap.D(").append(117).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
