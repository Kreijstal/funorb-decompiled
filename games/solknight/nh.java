/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    final static void a(byte param0, boolean param1, boolean param2) {
        String var4;
        if (param1) {
          mi.a(0, 0, mi.field_a, mi.field_d, 0, 192);
          if (param0 < -28) {
            uf.a(false, param1);
            return;
          } else {
            var4 = (String) null;
            nh.a((da) null, (String) null, 2, (String) null);
            uf.a(false, param1);
            return;
          }
        } else {
          mi.a();
          if (!SolKnight.field_L) {
            if (param0 >= -28) {
              var4 = (String) null;
              nh.a((da) null, (String) null, 2, (String) null);
              uf.a(false, param1);
              return;
            } else {
              uf.a(false, param1);
              return;
            }
          } else {
            mi.a(0, 0, mi.field_a, mi.field_d, 0, 192);
            if (param0 < -28) {
              uf.a(false, param1);
              return;
            } else {
              var4 = (String) null;
              nh.a((da) null, (String) null, 2, (String) null);
              uf.a(false, param1);
              return;
            }
          }
        }
    }

    final static o[] a(da param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.c(param2 ^ 75, param3);
              if (param2 == 0) {
                break L1;
              } else {
                nh.a((byte) 67);
                break L1;
              }
            }
            var5 = param0.a(param1, param2 + -1, var4_int);
            stackIn_3_0 = de.a(var4_int, var5, -17042, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("nh.B(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        if (!lh.field_l) {
          throw new IllegalStateException();
        } else {
          if (param0 != 3) {
            nh.a((byte) 37, false, true);
            kk.field_c = true;
            qa.a(true, -98);
            fj.field_i = 0;
            return;
          } else {
            kk.field_c = true;
            qa.a(true, -98);
            fj.field_i = 0;
            return;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = -58 / ((0 - param0) / 57);
        if (null != ee.field_j) {
          var2 = ee.field_j;
          synchronized (var2) {
            L0: {
              ee.field_j = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
