/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static tg field_a;
    static int field_d;
    static String field_c;
    static String field_e;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + ak.a(param0 ^ 123, "%0a", "\n", param1));
        if (param0 != 100) {
            field_d = -84;
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            vc.field_F = he.field_p;
            if (param0 == param3) {
              L1: {
                stackIn_8_0 = 5579;

                if (13 <= cg.field_a) {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = 0;
                  break L1;
                } else {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = 1;
                  break L1;
                }
              }
              oa.field_c = r.a(stackIn_9_0, stackIn_9_1 != 0);
              var6 = (String[]) null;
              oh.a((byte) -29, (String[]) null);
              break L0;
            } else {
              L2: {
                if (100 > param0) {
                  break L2;
                } else {
                  if (-106 > (param0 ^ -1)) {
                    break L2;
                  } else {
                    var4 = param1;
                    oh.a((byte) -29, var4);
                    oa.field_c = qj.a(false, param1);
                    return;
                  }
                }
              }
              oa.field_c = wb.a(param0, param3 + -254, param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("ej.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 36 % ((53 - param0) / 44);
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 < 0) {
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (String) null;
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_e = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
    }
}
