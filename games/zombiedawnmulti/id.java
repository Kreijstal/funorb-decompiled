/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ff {
    int field_C;
    static String field_x;
    static String field_A;
    int field_z;
    static ak field_B;
    int field_y;
    static int field_D;
    int field_E;

    abstract void f(byte param0);

    abstract void a(int param0, nm param1);

    final static void d(byte param0) {
        br var1 = null;
        br var2 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            if (param0 != 20) {
                field_D = -84;
            }
            var1 = fd.field_M.c(49);
            while (var1 instanceof wj) {
                var2 = var1.field_d;
                if (!(!((wj) ((Object) var1)).field_m.k())) {
                    var1.a(true);
                }
                var1 = var2;
            }
            var1 = qo.field_q.c(param0 ^ 68);
            while (var1 instanceof wj) {
                var2 = var1.field_d;
                if (!(!((wj) ((Object) var1)).field_m.k())) {
                    var1.a(true);
                }
                var1 = var2;
            }
            var1 = jp.field_c.c(80);
            while (var1 instanceof wj) {
                var2 = var1.field_d;
                if (!(!((wj) ((Object) var1)).field_m.k())) {
                    var1.a(true);
                }
                var1 = var2;
            }
            wp.b(127);
            if (null != td.field_b && !wd.field_L.c(-37)) {
                fk.a(td.field_b, true);
                td.field_b = null;
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "id.S(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        field_B = null;
        if (param0 < 60) {
            field_x = (String) null;
            field_x = null;
            field_A = null;
            return;
        }
        field_x = null;
        field_A = null;
    }

    final int h(int param0) {
        int var2 = 60 / ((12 - param0) / 58);
        return this.field_E >> -500960720;
    }

    final static ld a(cj param0, cj param1, byte param2, int[] param3, cj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ld[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        tl var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_9_0 = null;
        ld stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var10 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new ld[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    L3: {
                      if (param2 == -65) {
                        break L3;
                      } else {
                        field_D = -90;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    var11 = bd.field_c.a(param3[var10_int], -11452);
                    var6[var10_int] = var11.e(-18572);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_9_0 = null;
              return (ld) ((Object) stackIn_9_0);
            }
            stackIn_11_0 = new ld(0L, param0, param4, param1, var8, param3, var6, var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("id.P(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        return stackIn_11_0;
    }

    final int g(int param0) {
        int var2 = -126 / ((param0 - 13) / 45);
        return this.field_z >> -735148080;
    }

    id(int param0, int param1, int param2) {
        this.field_C = param2;
        this.field_E = param1 << 1205882640;
        this.field_z = param0 << -268982768;
    }

    static {
        field_A = "Unable to delete name - system busy";
        field_x = "Hide chat";
    }
}
