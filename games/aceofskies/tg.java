/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static ap[] field_a;

    final static vs a(gk param0, int param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        vs stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = param0.a(param2, (byte) -71, param3);
              var4 = var5;
              if (param1 == 8191) {
                break L1;
              } else {
                tg.a(-91, 82);
                break L1;
              }
            }
            if (var5 != null) {
              stackIn_6_0 = new vs(var5);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("tg.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
        return stackIn_6_0;
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param0 = param0 & 8191;
        if ((param0 ^ -1) <= param1) {
          L0: {
            if (param0 < 6144) {
              stackIn_8_0 = -lp.field_c[-4096 + param0];
              break L0;
            } else {
              stackIn_8_0 = -lp.field_c[-param0 + 8192];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (2048 > param0) {
              stackIn_4_0 = lp.field_c[param0];
              break L1;
            } else {
              stackIn_4_0 = lp.field_c[-param0 + 4096];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0) {
        if (param0 < -87) {
          if (ft.field_l != null) {
            if (ca.field_f != wq.field_e) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          tg.a(120, -95);
          if (ft.field_l != null) {
            if (ca.field_f != wq.field_e) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
            field_a = (ap[]) null;
        }
    }

    static {
    }
}
