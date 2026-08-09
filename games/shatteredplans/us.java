/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static boolean field_c;
    static bi field_a;
    static qf field_d;
    static String field_e;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        if (param0) {
            field_b = -58;
            fa.field_X.b(param1, 97);
            return;
        }
        fa.field_X.b(param1, 97);
    }

    final static void a(int param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = ui.field_m ^ -1;

          if (p.field_n) {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = 2;
            break L0;
          } else {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = 3;
            break L0;
          }
        }
        if (stackIn_3_0 != (stackIn_3_1 ^ -1)) {
          if (!p.field_n) {
            ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
            if (param0 != 0) {
              us.a(false, true);
              return;
            } else {
              return;
            }
          } else {
            if (0 != (kc.field_i ^ -1)) {
              ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
              if (param0 != 0) {
                us.a(false, true);
                return;
              } else {
                return;
              }
            } else {
              i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
              if (param0 != 0) {
                us.a(false, true);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
          if (param0 != 0) {
            us.a(false, true);
            return;
          } else {
            return;
          }
        }
    }

    final static fs a(ob param0, fs[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fs stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                us.a(-12);
                break L1;
              }
            }
            var3_int = param0.j(-85);
            if (param1.length > var3_int) {
              if (0 <= var3_int) {
                stackIn_7_0 = param1[var3_int];
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("us.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static va b(int param0) {
        va var1;
        var1 = new va();
        var1.field_k = true;
        var1.field_h = 2;
        var1.field_a = 2;
        if (param0 != 0) {
          field_d = (qf) null;
          var1.field_f = true;
          var1.field_c = 2;
          return var1;
        } else {
          var1.field_f = true;
          var1.field_c = 2;
          return var1;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            us.a(-56);
        }
    }

    static {
        field_e = "<%0> is not on your friend list.";
    }
}
