/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_f;
    static volatile boolean field_d;
    static lh field_a;
    static String field_c;
    static String field_e;
    static String field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Chess.field_G;
        try {
          var5_int = param3 + param2;
          var6 = param4 + param0;
          if (wb.field_i >= param2) {
            stackIn_4_0 = wb.field_i;
          } else {
            stackIn_4_0 = param2;
          }
          var7 = stackIn_4_0;
          if (param4 <= wb.field_a) {
            stackIn_7_0 = wb.field_a;
          } else {
            stackIn_7_0 = param4;
          }
          var8 = stackIn_7_0;
          if (var5_int >= wb.field_j) {
            stackIn_10_0 = wb.field_j;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (var6 < wb.field_b) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = wb.field_b;
          }
          var10 = stackIn_13_0;
          if (wb.field_i <= param2 &&
            param2 < wb.field_j) {
            var11 = param2 + wb.field_h * var8;
            var12 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              wb.field_d[var11] = 16777215;
              var11 = var11 + 2 * wb.field_h;
            }
          }
          if (wb.field_a <= param4 &&
            wb.field_b > var6) {
            var11Lifetime1 = wb.field_h * param4 + var7;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              wb.field_d[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= wb.field_i &&
            var5_int < wb.field_j) {
            var11Lifetime2 = var5_int + (var8 + (-param2 + var5_int & 1)) * wb.field_h;
            var12Lifetime2 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              wb.field_d[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * wb.field_h;
            }
          }
          if (param4 >= wb.field_a &&
            var6 < wb.field_b) {
            var11Lifetime3 = (1 & -param4 + var6) + wb.field_h * var6 + var7;
            var12Lifetime3 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              wb.field_d[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          if (!param1) {
            return;
          }
          rc.a(-44, false, -98, -67, 79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var5), "rc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static pm a(String param0, int param1, String param2, um param3, um param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        pm stackIn_2_0 = null;
        pm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 19131) {
            stackIn_2_0 = (pm) null;
            return stackIn_2_0;
          }
          var5_int = param3.a(param0, 0);
          var6 = param3.a(param2, 7, var5_int);
          stackIn_4_0 = dn.a(var6, var5_int, (byte) 124, param3, param4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        an.field_c = false;
        if (null != tl.field_Fb) {
          tl.field_Fb.n(-116);
          if (param0 != vk.field_g) {
            ml.a(0);
            hf.field_g = 0;
            return;
          }
          hf.field_g = 0;
          return;
        }
        if (param0 == vk.field_g) {
          hf.field_g = 0;
          return;
        }
        ml.a(0);
        hf.field_g = 0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == 1) {
          field_f = null;
          field_b = null;
          field_e = null;
          field_a = null;
          return;
        }
        rc.b(38);
        field_f = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    static {
        field_f = "<%0> to move";
        field_e = "Login: ";
        field_d = false;
        field_c = "You have <%0> unread messages!";
        field_b = "Quit";
    }
}
