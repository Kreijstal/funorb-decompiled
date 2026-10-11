/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = 26;
          }
          si.a(66, 62, param0[0].a(36));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ek.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ek(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var10Lifetime9;
        int var10Lifetime10;
        int var10Lifetime11;
        int var10Lifetime12;
        int var10Lifetime13;
        int var10Lifetime14;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var11Lifetime9;
        int var11Lifetime10;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var12Lifetime8;
        int var12Lifetime9;
        int var12Lifetime10;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var10Lifetime1Lifetime3;
        int var10Lifetime1Lifetime4;
        int var10Lifetime1Lifetime5;
        int var10Lifetime1Lifetime6;
        int var10Lifetime1Lifetime7;
        int var10Lifetime1Lifetime8;
        int var10Lifetime1Lifetime9;
        int var10Lifetime2Lifetime1;
        int var10Lifetime2Lifetime2;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var11Lifetime1Lifetime3;
        int var11Lifetime1Lifetime4;
        int var11Lifetime1Lifetime5;
        int var11Lifetime1Lifetime6;
        int var11Lifetime1Lifetime7;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var12Lifetime1Lifetime3;
        int var12Lifetime1Lifetime4;
        int var12Lifetime1Lifetime5;
        int var12Lifetime1Lifetime6;
        int var12Lifetime1Lifetime7;
        int var10Lifetime15;
        int var10Lifetime16;
        int var10Lifetime1Lifetime10;
        int var10Lifetime1Lifetime11;
        int var10Lifetime6Lifetime1;
        int var10Lifetime6Lifetime2;
        int var10Lifetime7Lifetime1;
        int var10Lifetime7Lifetime2;
        int var10Lifetime8Lifetime1;
        int var10Lifetime8Lifetime2;
        int var10Lifetime9Lifetime1;
        int var10Lifetime9Lifetime2;
        int var10Lifetime10Lifetime1;
        int var10Lifetime10Lifetime2;
        int var10Lifetime11Lifetime1;
        int var10Lifetime11Lifetime2;
        int var10Lifetime1Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1Lifetime2;
        int var10Lifetime1Lifetime2Lifetime1;
        int var10Lifetime1Lifetime2Lifetime2;
        int var10Lifetime1Lifetime3Lifetime1;
        int var10Lifetime1Lifetime3Lifetime2;
        int var10Lifetime1Lifetime4Lifetime1;
        int var10Lifetime1Lifetime4Lifetime2;
        int var10Lifetime1Lifetime5Lifetime1;
        int var10Lifetime1Lifetime5Lifetime2;
        int var10Lifetime1Lifetime6Lifetime1;
        int var10Lifetime1Lifetime6Lifetime2;
        if (param2 < param7) {
          if (param7 > param9) {
            return -1;
          }
          if ((param3 <= param1 ||
            param4 >= param3) &&
            (param6 >= param2 ||
            param6 >= param9) &&
            (param1 <= param8 ||
            param4 <= param8)) {
            if (param2 < param7) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10 > param0) {
                param2 = param2 >> var10;
                param6 = param6 >> var10;
                param9 = param9 >> var10;
              }
              var10Lifetime15 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime15) {
                param4 = param4 >> var10Lifetime15;
                param1 = param1 >> var10Lifetime15;
                param8 = param8 >> var10Lifetime15;
              }
              var10Lifetime16 = -param1 + param4;
              var11 = param9 - param2;
              var12 = -1;
              if (var11 != 0) {
                var12 = dbb.a(var10Lifetime16, var11, var12, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime16 != 0) {
                var12 = dbb.a(var11, var10Lifetime16, var12, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11 != 0) {
                var12 = dbb.a(var10Lifetime16, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime16 != 0) {
                var12 = dbb.a(var11, var10Lifetime16, var12, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12;
            }
            if (param2 > param6) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime6 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime6 > param0) {
                param2 = param2 >> var10Lifetime6;
                param6 = param6 >> var10Lifetime6;
                param9 = param9 >> var10Lifetime6;
              }
              var10Lifetime6Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime6Lifetime1) {
                param4 = param4 >> var10Lifetime6Lifetime1;
                param1 = param1 >> var10Lifetime6Lifetime1;
                param8 = param8 >> var10Lifetime6Lifetime1;
              }
              var10Lifetime6Lifetime2 = -param1 + param4;
              var11Lifetime4 = param9 - param2;
              var12Lifetime4 = -1;
              if (var11Lifetime4 != 0) {
                var12Lifetime4 = dbb.a(var10Lifetime6Lifetime2, var11Lifetime4, var12Lifetime4, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime6Lifetime2 != 0) {
                var12Lifetime4 = dbb.a(var11Lifetime4, var10Lifetime6Lifetime2, var12Lifetime4, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime4 != 0) {
                var12Lifetime4 = dbb.a(var10Lifetime6Lifetime2, var11Lifetime4, var12Lifetime4, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime6Lifetime2 != 0) {
                var12Lifetime4 = dbb.a(var11Lifetime4, var10Lifetime6Lifetime2, var12Lifetime4, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime4;
            }
            if (param1 < param3) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime7 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime7 > param0) {
                param2 = param2 >> var10Lifetime7;
                param6 = param6 >> var10Lifetime7;
                param9 = param9 >> var10Lifetime7;
              }
              var10Lifetime7Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime7Lifetime1) {
                param4 = param4 >> var10Lifetime7Lifetime1;
                param1 = param1 >> var10Lifetime7Lifetime1;
                param8 = param8 >> var10Lifetime7Lifetime1;
              }
              var10Lifetime7Lifetime2 = -param1 + param4;
              var11Lifetime5 = param9 - param2;
              var12Lifetime5 = -1;
              if (var11Lifetime5 != 0) {
                var12Lifetime5 = dbb.a(var10Lifetime7Lifetime2, var11Lifetime5, var12Lifetime5, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime7Lifetime2 != 0) {
                var12Lifetime5 = dbb.a(var11Lifetime5, var10Lifetime7Lifetime2, var12Lifetime5, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime5 != 0) {
                var12Lifetime5 = dbb.a(var10Lifetime7Lifetime2, var11Lifetime5, var12Lifetime5, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime7Lifetime2 != 0) {
                var12Lifetime5 = dbb.a(var11Lifetime5, var10Lifetime7Lifetime2, var12Lifetime5, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime5;
            }
            if (param1 > param8) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime8 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime8 > param0) {
                param2 = param2 >> var10Lifetime8;
                param6 = param6 >> var10Lifetime8;
                param9 = param9 >> var10Lifetime8;
              }
              var10Lifetime8Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime8Lifetime1) {
                param4 = param4 >> var10Lifetime8Lifetime1;
                param1 = param1 >> var10Lifetime8Lifetime1;
                param8 = param8 >> var10Lifetime8Lifetime1;
              }
              var10Lifetime8Lifetime2 = -param1 + param4;
              var11Lifetime6 = param9 - param2;
              var12Lifetime6 = -1;
              if (var11Lifetime6 != 0) {
                var12Lifetime6 = dbb.a(var10Lifetime8Lifetime2, var11Lifetime6, var12Lifetime6, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime8Lifetime2 != 0) {
                var12Lifetime6 = dbb.a(var11Lifetime6, var10Lifetime8Lifetime2, var12Lifetime6, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime6 != 0) {
                var12Lifetime6 = dbb.a(var10Lifetime8Lifetime2, var11Lifetime6, var12Lifetime6, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime8Lifetime2 != 0) {
                var12Lifetime6 = dbb.a(var11Lifetime6, var10Lifetime8Lifetime2, var12Lifetime6, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime6;
            }
            if (param7 > param9) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime9 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime9 > param0) {
                param2 = param2 >> var10Lifetime9;
                param6 = param6 >> var10Lifetime9;
                param9 = param9 >> var10Lifetime9;
              }
              var10Lifetime9Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime9Lifetime1) {
                param4 = param4 >> var10Lifetime9Lifetime1;
                param1 = param1 >> var10Lifetime9Lifetime1;
                param8 = param8 >> var10Lifetime9Lifetime1;
              }
              var10Lifetime9Lifetime2 = -param1 + param4;
              var11Lifetime7 = param9 - param2;
              var12Lifetime7 = -1;
              if (var11Lifetime7 != 0) {
                var12Lifetime7 = dbb.a(var10Lifetime9Lifetime2, var11Lifetime7, var12Lifetime7, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime9Lifetime2 != 0) {
                var12Lifetime7 = dbb.a(var11Lifetime7, var10Lifetime9Lifetime2, var12Lifetime7, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime7 != 0) {
                var12Lifetime7 = dbb.a(var10Lifetime9Lifetime2, var11Lifetime7, var12Lifetime7, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime9Lifetime2 != 0) {
                var12Lifetime7 = dbb.a(var11Lifetime7, var10Lifetime9Lifetime2, var12Lifetime7, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime7;
            }
            if (param6 < param9) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime10 > param0) {
                param2 = param2 >> var10Lifetime10;
                param6 = param6 >> var10Lifetime10;
                param9 = param9 >> var10Lifetime10;
              }
              var10Lifetime10Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime10Lifetime1) {
                param4 = param4 >> var10Lifetime10Lifetime1;
                param1 = param1 >> var10Lifetime10Lifetime1;
                param8 = param8 >> var10Lifetime10Lifetime1;
              }
              var10Lifetime10Lifetime2 = -param1 + param4;
              var11Lifetime8 = param9 - param2;
              var12Lifetime8 = -1;
              if (var11Lifetime8 != 0) {
                var12Lifetime8 = dbb.a(var10Lifetime10Lifetime2, var11Lifetime8, var12Lifetime8, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime10Lifetime2 != 0) {
                var12Lifetime8 = dbb.a(var11Lifetime8, var10Lifetime10Lifetime2, var12Lifetime8, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime8 != 0) {
                var12Lifetime8 = dbb.a(var10Lifetime10Lifetime2, var11Lifetime8, var12Lifetime8, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime10Lifetime2 != 0) {
                var12Lifetime8 = dbb.a(var11Lifetime8, var10Lifetime10Lifetime2, var12Lifetime8, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime8;
            }
            if (param4 < param3) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime11 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime11 > param0) {
                param2 = param2 >> var10Lifetime11;
                param6 = param6 >> var10Lifetime11;
                param9 = param9 >> var10Lifetime11;
              }
              var10Lifetime11Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime11Lifetime1) {
                param4 = param4 >> var10Lifetime11Lifetime1;
                param1 = param1 >> var10Lifetime11Lifetime1;
                param8 = param8 >> var10Lifetime11Lifetime1;
              }
              var10Lifetime11Lifetime2 = -param1 + param4;
              var11Lifetime9 = param9 - param2;
              var12Lifetime9 = -1;
              if (var11Lifetime9 != 0) {
                var12Lifetime9 = dbb.a(var10Lifetime11Lifetime2, var11Lifetime9, var12Lifetime9, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime11Lifetime2 != 0) {
                var12Lifetime9 = dbb.a(var11Lifetime9, var10Lifetime11Lifetime2, var12Lifetime9, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime9 != 0) {
                var12Lifetime9 = dbb.a(var10Lifetime11Lifetime2, var11Lifetime9, var12Lifetime9, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime11Lifetime2 != 0) {
                var12Lifetime9 = dbb.a(var11Lifetime9, var10Lifetime11Lifetime2, var12Lifetime9, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime9;
            }
            if (param4 <= param8) {
              return 1 + (1 << param5);
            }
            param1 = param1 - param3;
            param8 = param8 - param3;
            param2 = param2 - param7;
            param4 = param4 - param3;
            param6 = param6 - param7;
            param9 = param9 - param7;
            var10Lifetime12 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
            if (var10Lifetime12 > param0) {
              param2 = param2 >> var10Lifetime12;
              param6 = param6 >> var10Lifetime12;
              param9 = param9 >> var10Lifetime12;
            }
            var10Lifetime13 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
            if (0 < var10Lifetime13) {
              param4 = param4 >> var10Lifetime13;
              param1 = param1 >> var10Lifetime13;
              param8 = param8 >> var10Lifetime13;
            }
            var10Lifetime14 = -param1 + param4;
            var11Lifetime10 = param9 - param2;
            var12Lifetime10 = -1;
            if (var11Lifetime10 != 0) {
              var12Lifetime10 = dbb.a(var10Lifetime14, var11Lifetime10, var12Lifetime10, param1, param4, param8, param5, 0, 0, param2);
            }
            if (var10Lifetime14 != 0) {
              var12Lifetime10 = dbb.a(var11Lifetime10, var10Lifetime14, var12Lifetime10, param2, param9, param6, param5, 0, 0, param1);
            }
            param9 = param9 - param6;
            param2 = param2 - param6;
            param1 = param1 - param8;
            param4 = param4 - param8;
            if (var11Lifetime10 != 0) {
              var12Lifetime10 = dbb.a(var10Lifetime14, var11Lifetime10, var12Lifetime10, param1, param4, 0, param5, 0, -param8, param2);
            }
            if (var10Lifetime14 != 0) {
              var12Lifetime10 = dbb.a(var11Lifetime10, var10Lifetime14, var12Lifetime10, param2, param9, 0, param5, 0, -param6, param1);
            }
            return var12Lifetime10;
          }
          return -1;
        }
        if (param3 > param1) {
          if (param4 < param3) {
            return -1;
          }
          if ((param6 >= param2 ||
            param6 >= param9) &&
            (param1 <= param8 ||
            param4 <= param8)) {
            if (param2 < param7) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1 > param0) {
                param2 = param2 >> var10Lifetime1;
                param6 = param6 >> var10Lifetime1;
                param9 = param9 >> var10Lifetime1;
              }
              var10Lifetime1Lifetime10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime10) {
                param4 = param4 >> var10Lifetime1Lifetime10;
                param1 = param1 >> var10Lifetime1Lifetime10;
                param8 = param8 >> var10Lifetime1Lifetime10;
              }
              var10Lifetime1Lifetime11 = -param1 + param4;
              var11Lifetime1 = param9 - param2;
              var12Lifetime1 = -1;
              if (var11Lifetime1 != 0) {
                var12Lifetime1 = dbb.a(var10Lifetime1Lifetime11, var11Lifetime1, var12Lifetime1, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime11 != 0) {
                var12Lifetime1 = dbb.a(var11Lifetime1, var10Lifetime1Lifetime11, var12Lifetime1, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1 != 0) {
                var12Lifetime1 = dbb.a(var10Lifetime1Lifetime11, var11Lifetime1, var12Lifetime1, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime11 != 0) {
                var12Lifetime1 = dbb.a(var11Lifetime1, var10Lifetime1Lifetime11, var12Lifetime1, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1;
            }
            if (param2 > param6) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime1 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime1 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime1;
                param6 = param6 >> var10Lifetime1Lifetime1;
                param9 = param9 >> var10Lifetime1Lifetime1;
              }
              var10Lifetime1Lifetime1Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime1Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime1Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime1Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime1Lifetime1;
              }
              var10Lifetime1Lifetime1Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime1 = param9 - param2;
              var12Lifetime1Lifetime1 = -1;
              if (var11Lifetime1Lifetime1 != 0) {
                var12Lifetime1Lifetime1 = dbb.a(var10Lifetime1Lifetime1Lifetime2, var11Lifetime1Lifetime1, var12Lifetime1Lifetime1, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime1 = dbb.a(var11Lifetime1Lifetime1, var10Lifetime1Lifetime1Lifetime2, var12Lifetime1Lifetime1, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime1 != 0) {
                var12Lifetime1Lifetime1 = dbb.a(var10Lifetime1Lifetime1Lifetime2, var11Lifetime1Lifetime1, var12Lifetime1Lifetime1, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime1 = dbb.a(var11Lifetime1Lifetime1, var10Lifetime1Lifetime1Lifetime2, var12Lifetime1Lifetime1, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime1;
            }
            if (param1 < param3) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime2 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime2 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime2;
                param6 = param6 >> var10Lifetime1Lifetime2;
                param9 = param9 >> var10Lifetime1Lifetime2;
              }
              var10Lifetime1Lifetime2Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime2Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime2Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime2Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime2Lifetime1;
              }
              var10Lifetime1Lifetime2Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime2 = param9 - param2;
              var12Lifetime1Lifetime2 = -1;
              if (var11Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = dbb.a(var10Lifetime1Lifetime2Lifetime2, var11Lifetime1Lifetime2, var12Lifetime1Lifetime2, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime2Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = dbb.a(var11Lifetime1Lifetime2, var10Lifetime1Lifetime2Lifetime2, var12Lifetime1Lifetime2, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = dbb.a(var10Lifetime1Lifetime2Lifetime2, var11Lifetime1Lifetime2, var12Lifetime1Lifetime2, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime2Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = dbb.a(var11Lifetime1Lifetime2, var10Lifetime1Lifetime2Lifetime2, var12Lifetime1Lifetime2, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime2;
            }
            if (param1 > param8) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime3 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime3 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime3;
                param6 = param6 >> var10Lifetime1Lifetime3;
                param9 = param9 >> var10Lifetime1Lifetime3;
              }
              var10Lifetime1Lifetime3Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime3Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime3Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime3Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime3Lifetime1;
              }
              var10Lifetime1Lifetime3Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime3 = param9 - param2;
              var12Lifetime1Lifetime3 = -1;
              if (var11Lifetime1Lifetime3 != 0) {
                var12Lifetime1Lifetime3 = dbb.a(var10Lifetime1Lifetime3Lifetime2, var11Lifetime1Lifetime3, var12Lifetime1Lifetime3, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime3Lifetime2 != 0) {
                var12Lifetime1Lifetime3 = dbb.a(var11Lifetime1Lifetime3, var10Lifetime1Lifetime3Lifetime2, var12Lifetime1Lifetime3, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime3 != 0) {
                var12Lifetime1Lifetime3 = dbb.a(var10Lifetime1Lifetime3Lifetime2, var11Lifetime1Lifetime3, var12Lifetime1Lifetime3, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime3Lifetime2 != 0) {
                var12Lifetime1Lifetime3 = dbb.a(var11Lifetime1Lifetime3, var10Lifetime1Lifetime3Lifetime2, var12Lifetime1Lifetime3, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime3;
            }
            if (param7 > param9) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime4 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime4 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime4;
                param6 = param6 >> var10Lifetime1Lifetime4;
                param9 = param9 >> var10Lifetime1Lifetime4;
              }
              var10Lifetime1Lifetime4Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime4Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime4Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime4Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime4Lifetime1;
              }
              var10Lifetime1Lifetime4Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime4 = param9 - param2;
              var12Lifetime1Lifetime4 = -1;
              if (var11Lifetime1Lifetime4 != 0) {
                var12Lifetime1Lifetime4 = dbb.a(var10Lifetime1Lifetime4Lifetime2, var11Lifetime1Lifetime4, var12Lifetime1Lifetime4, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime4Lifetime2 != 0) {
                var12Lifetime1Lifetime4 = dbb.a(var11Lifetime1Lifetime4, var10Lifetime1Lifetime4Lifetime2, var12Lifetime1Lifetime4, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime4 != 0) {
                var12Lifetime1Lifetime4 = dbb.a(var10Lifetime1Lifetime4Lifetime2, var11Lifetime1Lifetime4, var12Lifetime1Lifetime4, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime4Lifetime2 != 0) {
                var12Lifetime1Lifetime4 = dbb.a(var11Lifetime1Lifetime4, var10Lifetime1Lifetime4Lifetime2, var12Lifetime1Lifetime4, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime4;
            }
            if (param6 < param9) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime5 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime5 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime5;
                param6 = param6 >> var10Lifetime1Lifetime5;
                param9 = param9 >> var10Lifetime1Lifetime5;
              }
              var10Lifetime1Lifetime5Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime5Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime5Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime5Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime5Lifetime1;
              }
              var10Lifetime1Lifetime5Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime5 = param9 - param2;
              var12Lifetime1Lifetime5 = -1;
              if (var11Lifetime1Lifetime5 != 0) {
                var12Lifetime1Lifetime5 = dbb.a(var10Lifetime1Lifetime5Lifetime2, var11Lifetime1Lifetime5, var12Lifetime1Lifetime5, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime5Lifetime2 != 0) {
                var12Lifetime1Lifetime5 = dbb.a(var11Lifetime1Lifetime5, var10Lifetime1Lifetime5Lifetime2, var12Lifetime1Lifetime5, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime5 != 0) {
                var12Lifetime1Lifetime5 = dbb.a(var10Lifetime1Lifetime5Lifetime2, var11Lifetime1Lifetime5, var12Lifetime1Lifetime5, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime5Lifetime2 != 0) {
                var12Lifetime1Lifetime5 = dbb.a(var11Lifetime1Lifetime5, var10Lifetime1Lifetime5Lifetime2, var12Lifetime1Lifetime5, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime5;
            }
            if (param4 < param3) {
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime1Lifetime6 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime1Lifetime6 > param0) {
                param2 = param2 >> var10Lifetime1Lifetime6;
                param6 = param6 >> var10Lifetime1Lifetime6;
                param9 = param9 >> var10Lifetime1Lifetime6;
              }
              var10Lifetime1Lifetime6Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime1Lifetime6Lifetime1) {
                param4 = param4 >> var10Lifetime1Lifetime6Lifetime1;
                param1 = param1 >> var10Lifetime1Lifetime6Lifetime1;
                param8 = param8 >> var10Lifetime1Lifetime6Lifetime1;
              }
              var10Lifetime1Lifetime6Lifetime2 = -param1 + param4;
              var11Lifetime1Lifetime6 = param9 - param2;
              var12Lifetime1Lifetime6 = -1;
              if (var11Lifetime1Lifetime6 != 0) {
                var12Lifetime1Lifetime6 = dbb.a(var10Lifetime1Lifetime6Lifetime2, var11Lifetime1Lifetime6, var12Lifetime1Lifetime6, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime1Lifetime6Lifetime2 != 0) {
                var12Lifetime1Lifetime6 = dbb.a(var11Lifetime1Lifetime6, var10Lifetime1Lifetime6Lifetime2, var12Lifetime1Lifetime6, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime1Lifetime6 != 0) {
                var12Lifetime1Lifetime6 = dbb.a(var10Lifetime1Lifetime6Lifetime2, var11Lifetime1Lifetime6, var12Lifetime1Lifetime6, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime1Lifetime6Lifetime2 != 0) {
                var12Lifetime1Lifetime6 = dbb.a(var11Lifetime1Lifetime6, var10Lifetime1Lifetime6Lifetime2, var12Lifetime1Lifetime6, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime1Lifetime6;
            }
            if (param4 <= param8) {
              return 1 + (1 << param5);
            }
            param1 = param1 - param3;
            param8 = param8 - param3;
            param2 = param2 - param7;
            param4 = param4 - param3;
            param6 = param6 - param7;
            param9 = param9 - param7;
            var10Lifetime1Lifetime7 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
            if (var10Lifetime1Lifetime7 > param0) {
              param2 = param2 >> var10Lifetime1Lifetime7;
              param6 = param6 >> var10Lifetime1Lifetime7;
              param9 = param9 >> var10Lifetime1Lifetime7;
            }
            var10Lifetime1Lifetime8 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
            if (0 < var10Lifetime1Lifetime8) {
              param4 = param4 >> var10Lifetime1Lifetime8;
              param1 = param1 >> var10Lifetime1Lifetime8;
              param8 = param8 >> var10Lifetime1Lifetime8;
            }
            var10Lifetime1Lifetime9 = -param1 + param4;
            var11Lifetime1Lifetime7 = param9 - param2;
            var12Lifetime1Lifetime7 = -1;
            if (var11Lifetime1Lifetime7 != 0) {
              var12Lifetime1Lifetime7 = dbb.a(var10Lifetime1Lifetime9, var11Lifetime1Lifetime7, var12Lifetime1Lifetime7, param1, param4, param8, param5, 0, 0, param2);
            }
            if (var10Lifetime1Lifetime9 != 0) {
              var12Lifetime1Lifetime7 = dbb.a(var11Lifetime1Lifetime7, var10Lifetime1Lifetime9, var12Lifetime1Lifetime7, param2, param9, param6, param5, 0, 0, param1);
            }
            param9 = param9 - param6;
            param2 = param2 - param6;
            param1 = param1 - param8;
            param4 = param4 - param8;
            if (var11Lifetime1Lifetime7 != 0) {
              var12Lifetime1Lifetime7 = dbb.a(var10Lifetime1Lifetime9, var11Lifetime1Lifetime7, var12Lifetime1Lifetime7, param1, param4, 0, param5, 0, -param8, param2);
            }
            if (var10Lifetime1Lifetime9 != 0) {
              var12Lifetime1Lifetime7 = dbb.a(var11Lifetime1Lifetime7, var10Lifetime1Lifetime9, var12Lifetime1Lifetime7, param2, param9, 0, param5, 0, -param6, param1);
            }
            return var12Lifetime1Lifetime7;
          }
          return -1;
        }
        if (param6 >= param2) {
          if (param1 <= param8) {
            if (param2 >= param7 &&
              param2 <= param6 &&
              param1 >= param3 &&
              param1 <= param8 &&
              param7 <= param9 &&
              param6 >= param9 &&
              param4 >= param3) {
              if (param4 <= param8) {
                return 1 + (1 << param5);
              }
              param1 = param1 - param3;
              param8 = param8 - param3;
              param2 = param2 - param7;
              param4 = param4 - param3;
              param6 = param6 - param7;
              param9 = param9 - param7;
              var10Lifetime2 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
              if (var10Lifetime2 > param0) {
                param2 = param2 >> var10Lifetime2;
                param6 = param6 >> var10Lifetime2;
                param9 = param9 >> var10Lifetime2;
              }
              var10Lifetime2Lifetime1 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
              if (0 < var10Lifetime2Lifetime1) {
                param4 = param4 >> var10Lifetime2Lifetime1;
                param1 = param1 >> var10Lifetime2Lifetime1;
                param8 = param8 >> var10Lifetime2Lifetime1;
              }
              var10Lifetime2Lifetime2 = -param1 + param4;
              var11Lifetime2 = param9 - param2;
              var12Lifetime2 = -1;
              if (var11Lifetime2 != 0) {
                var12Lifetime2 = dbb.a(var10Lifetime2Lifetime2, var11Lifetime2, var12Lifetime2, param1, param4, param8, param5, 0, 0, param2);
              }
              if (var10Lifetime2Lifetime2 != 0) {
                var12Lifetime2 = dbb.a(var11Lifetime2, var10Lifetime2Lifetime2, var12Lifetime2, param2, param9, param6, param5, 0, 0, param1);
              }
              param9 = param9 - param6;
              param2 = param2 - param6;
              param1 = param1 - param8;
              param4 = param4 - param8;
              if (var11Lifetime2 != 0) {
                var12Lifetime2 = dbb.a(var10Lifetime2Lifetime2, var11Lifetime2, var12Lifetime2, param1, param4, 0, param5, 0, -param8, param2);
              }
              if (var10Lifetime2Lifetime2 != 0) {
                var12Lifetime2 = dbb.a(var11Lifetime2, var10Lifetime2Lifetime2, var12Lifetime2, param2, param9, 0, param5, 0, -param6, param1);
              }
              return var12Lifetime2;
            }
          } else {
            if (param4 > param8) {
              return -1;
            }
            if (param2 >= param7 &&
              param2 <= param6 &&
              param1 >= param3 &&
              param1 <= param8 &&
              param7 <= param9 &&
              param6 >= param9 &&
              param4 >= param3 &&
              param4 <= param8) {
              return 1 + (1 << param5);
            }
          }
        } else {
          if (param6 < param9) {
            return -1;
          }
          if (param1 > param8 &&
            param4 > param8) {
            return -1;
          }
          if (param2 >= param7 &&
            param2 <= param6 &&
            param1 >= param3 &&
            param1 <= param8 &&
            param7 <= param9 &&
            param6 >= param9 &&
            param4 >= param3 &&
            param4 <= param8) {
            return 1 + (1 << param5);
          }
        }
        param1 = param1 - param3;
        param8 = param8 - param3;
        param2 = param2 - param7;
        param4 = param4 - param3;
        param6 = param6 - param7;
        param9 = param9 - param7;
        var10Lifetime3 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
        if (var10Lifetime3 > param0) {
          param2 = param2 >> var10Lifetime3;
          param6 = param6 >> var10Lifetime3;
          param9 = param9 >> var10Lifetime3;
        }
        var10Lifetime4 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
        if (0 < var10Lifetime4) {
          param4 = param4 >> var10Lifetime4;
          param1 = param1 >> var10Lifetime4;
          param8 = param8 >> var10Lifetime4;
        }
        var10Lifetime5 = -param1 + param4;
        var11Lifetime3 = param9 - param2;
        var12Lifetime3 = -1;
        if (var11Lifetime3 != 0) {
          var12Lifetime3 = dbb.a(var10Lifetime5, var11Lifetime3, var12Lifetime3, param1, param4, param8, param5, 0, 0, param2);
        }
        if (var10Lifetime5 != 0) {
          var12Lifetime3 = dbb.a(var11Lifetime3, var10Lifetime5, var12Lifetime3, param2, param9, param6, param5, 0, 0, param1);
        }
        param9 = param9 - param6;
        param2 = param2 - param6;
        param1 = param1 - param8;
        param4 = param4 - param8;
        if (var11Lifetime3 != 0) {
          var12Lifetime3 = dbb.a(var10Lifetime5, var11Lifetime3, var12Lifetime3, param1, param4, 0, param5, 0, -param8, param2);
        }
        if (var10Lifetime5 != 0) {
          var12Lifetime3 = dbb.a(var11Lifetime3, var10Lifetime5, var12Lifetime3, param2, param9, 0, param5, 0, -param6, param1);
        }
        return var12Lifetime3;
    }

    final static void b(boolean param0) {
        wia.field_a = param0 ? true : false;
    }

    static {
        field_o = 5;
    }
}
