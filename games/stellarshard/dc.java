/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    final static int a(int param0) {
        if (4 == nc.field_H) {
          return -1;
        }
        if (stellarshard.field_U[2] >= 2 &&
          5 <= stellarshard.field_U[0]) {
          stellarshard.field_U[2] = stellarshard.field_U[2] - 2;
          stellarshard.field_U[0] = stellarshard.field_U[0] - 5;
          return 2;
        }
        if (0 < mk.field_k &&
          2 <= stellarshard.field_U[6] &&
          5 <= stellarshard.field_U[1]) {
          stellarshard.field_U[1] = stellarshard.field_U[1] - 5;
          stellarshard.field_U[6] = stellarshard.field_U[6] - 2;
          return 6;
        }
        if (mk.field_k > 0 &&
          stellarshard.field_U[7] >= 3 &&
          stellarshard.field_U[3] >= 3) {
          stellarshard.field_U[3] = stellarshard.field_U[3] - 3;
          stellarshard.field_U[7] = stellarshard.field_U[7] - 3;
          return 7;
        }
        if (param0 > -100) {
          return 26;
        }
        if (2 <= stellarshard.field_U[11] &&
          2 <= stellarshard.field_U[10]) {
          stellarshard.field_U[11] = stellarshard.field_U[11] - 2;
          stellarshard.field_U[10] = stellarshard.field_U[10] - 2;
          return 11;
        }
        if (stellarshard.field_U[10] >= 2 &&
          2 <= stellarshard.field_U[8]) {
          stellarshard.field_U[10] = stellarshard.field_U[10] - 2;
          stellarshard.field_U[8] = stellarshard.field_U[8] - 2;
          return 10;
        }
        if (mk.field_k > 0 &&
          stellarshard.field_U[13] >= 2 &&
          stellarshard.field_U[12] >= 2) {
          stellarshard.field_U[13] = stellarshard.field_U[13] - 2;
          stellarshard.field_U[12] = stellarshard.field_U[12] - 2;
          return 13;
        }
        if (mk.field_k > 0 &&
          stellarshard.field_U[12] >= 2 &&
          stellarshard.field_U[9] >= 2) {
          stellarshard.field_U[12] = stellarshard.field_U[12] - 2;
          stellarshard.field_U[9] = stellarshard.field_U[9] - 2;
          return 12;
        }
        if (mk.field_k > 0 &&
          stellarshard.field_U[15] >= 2 &&
          stellarshard.field_U[14] >= 2) {
          stellarshard.field_U[14] = stellarshard.field_U[14] - 2;
          stellarshard.field_U[15] = stellarshard.field_U[15] - 2;
          return 15;
        }
        if (mk.field_k > 0 &&
          stellarshard.field_U[14] >= 2 &&
          stellarshard.field_U[4] >= 10) {
          stellarshard.field_U[4] = stellarshard.field_U[4] - 10;
          stellarshard.field_U[14] = stellarshard.field_U[14] - 2;
          return 14;
        }
        if (stellarshard.field_U[0] >= 5) {
          stellarshard.field_U[0] = stellarshard.field_U[0] - 5;
          return 0;
        }
        if (stellarshard.field_U[1] >= 5) {
          stellarshard.field_U[1] = stellarshard.field_U[1] - 5;
          return 1;
        }
        if (stellarshard.field_U[3] >= 5) {
          stellarshard.field_U[3] = stellarshard.field_U[3] - 5;
          return 3;
        }
        if (stellarshard.field_U[4] >= 10) {
          stellarshard.field_U[4] = stellarshard.field_U[4] - 10;
          return 4;
        }
        if (stellarshard.field_U[5] >= 10) {
          stellarshard.field_U[5] = stellarshard.field_U[5] - 10;
          return 5;
        }
        if (2 <= stellarshard.field_U[8]) {
          stellarshard.field_U[8] = stellarshard.field_U[8] - 2;
          return 8;
        }
        if (5 > stellarshard.field_U[9]) {
          return -1;
        }
        stellarshard.field_U[9] = stellarshard.field_U[9] - 5;
        return 9;
    }

    final static int a(am param0, int param1, am param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -53) {
            stackIn_2_0 = -119;
            return stackIn_2_0;
          }
          var4 = (String) null;
          stackIn_4_0 = gk.a(0, false, param2, (String) null, 0, param0, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dc.D(");
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          if (!param0) {
            stackIn_3_0 = 31;
            return stackIn_3_0;
          }
          var1_int = 2999;
          while (true) {
            if (var1_int < 0) {
              stackIn_11_0 = -1;
              return stackIn_11_0;
            }
            if (wk.field_b[var1_int] != null) {
              var1_int--;
              continue;
            }
            break;
          }
          stackIn_8_0 = var1_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "dc.A(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          if (param1 != 2) {
            dc.a(true);
          }
          var3_int = 0;
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param0.charAt(var5) == param2) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dc.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
