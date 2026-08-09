/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_b;
    static String field_c;
    static int[] field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        int var3;
        int var4;
        hn.field_n = true;
        if (param1 != -1230) {
          field_a = (int[]) null;
          ol.field_N = null;
          var3 = dh.field_b;
          rc.field_a = new ak(param2, var3);
          var4 = rc.field_a.h(param1 ^ -1209);
          di.field_d = new wc(var4);
          di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, bj.field_y), id.a(0));
          return;
        } else {
          ol.field_N = null;
          var3 = dh.field_b;
          rc.field_a = new ak(param2, var3);
          var4 = rc.field_a.h(param1 ^ -1209);
          di.field_d = new wc(var4);
          di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, bj.field_y), id.a(0));
          return;
        }
    }

    final static int a(String param0, int param1, String param2, String param3, boolean param4, int param5, int param6) {
        sn var7 = null;
        RuntimeException var7_ref = null;
        sn var8 = null;
        int stackIn_3_0 = 0;
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
              if (param6 == 0) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var7 = new sn(param0);
            var8 = new sn(param2);
            stackIn_3_0 = od.a((byte) -32, param4, param3, var8, var7, param1, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("kh.B(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 65) {
            field_b = -91;
        }
    }

    final static ed[] a(mf param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ed[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = 21 / ((param1 - 62) / 60);
            var4_int = param0.b(-1, param2);
            var5 = param0.a(var4_int, param3, true);
            stackIn_1_0 = cc.a(var4_int, param0, var5, (byte) 75);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("kh.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(int param0, char param1, byte param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        var5 = EscapeVector.field_A;
        var6 = new char[param0];
        var3 = var6;
        if (param2 < 4) {
          kh.a((byte) -54);
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param0 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = (255 & rl.field_k.field_k[param2]) + param1;
        rl.field_k.field_k[param2] = (byte)lb.a(var3, var3 << -1923269097 >> -1794459329);
        int var4 = -46 % ((-11 - param0) / 34);
    }

    static {
        field_b = 0;
        field_a = new int[12];
    }
}
