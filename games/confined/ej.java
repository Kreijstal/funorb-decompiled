/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_c;
    static boolean field_b;
    static double[] field_a;
    static String field_d;

    final static l a(String param0, mi param1, mi param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
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
              var5_int = param1.a(param4 ^ -37, param3);
              var6 = param1.a(var5_int, param0, -75);
              if (param4 == 0) {
                break L1;
              } else {
                field_b = true;
                break L1;
              }
            }
            stackIn_3_0 = te.a(param2, 10, var6, param1, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ej.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        String var2;
        if (!param0) {
          var2 = (String) null;
          ej.a((String) null, (mi) null, (mi) null, (String) null, -110);
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final boolean a(int param0) {
        String var3;
        int stackIn_7_0 = 0;
        if (param0 <= -125) {
          if (rh.field_ab != this) {
            if (this != fm.field_a) {
              if (wd.field_f == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = (String) null;
          ej.a((String) null, (mi) null, (mi) null, (String) null, 120);
          if (rh.field_ab != this) {
            if (this == fm.field_a) {
              return true;
            } else {
              L0: {
                if (wd.field_f != this) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
          field_d = (String) null;
          System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
          return;
        } else {
          System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
          return;
        }
    }

    static {
        field_b = true;
        field_c = "Create a free Account";
        field_a = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.3, 0.3, 0.1, 0.3, 0.1, 0.0, 0.0, 0.5, 0.2, 0.5, 0.2, 0.1, 0.2};
    }
}
