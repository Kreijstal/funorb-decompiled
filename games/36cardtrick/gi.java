/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends qb {
    int field_j;
    static String field_g;
    qb field_i;
    li field_h;

    public static void a(int param0) {
        if (param0 != 1159353185) {
          field_g = (String) null;
        }
        field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Main.field_T;
        try {
          while (true) {
            param7--;
            if (param7 < 0) {
              if (param3 != 8355711) {
                field_g = (String) null;
              }
              return;
            }
            var17 = param6;
            var10 = var17;
            var11 = param0;
            var12 = param2;
            var13 = param1;
            var14 = param4;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = var15 + (bc.a(var12, 33423360) >> 1) + ((bc.a(var13, 33423391) >> 9) + bc.a(var14 >> 17, 255));
            param2 = param2 + param8;
            param4 = param4 + param9;
            param0++;
            param1 = param1 + param5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("gi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = gi.a(124, param2);
          if (param1 >= -122) {
            return false;
          }
          if (param0.indexOf(param2) != -1) {
            return true;
          }
          if (param0.indexOf(var3) != -1) {
            return true;
          }
          stackIn_15_0 = (param0.startsWith(param2)) || (param0.startsWith(var3)) || (param0.endsWith(param2)) || (param0.endsWith(var3));
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("gi.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 <= 89) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + var2_int - 1] = param1.charAt(var4);
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    gi(li param0, qb param1) {
        try {
          this.field_h = param0;
          this.field_j = param0.g();
          this.field_i = param1;
          this.field_h.f(this.field_j * mf.field_i / 80);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Main.field_T;
        if (param9 != 0) {
          field_g = (String) null;
        }
        if (param10 > param7) {
          if (param10 >= param11) {
            if (param11 > param7) {
              e.a(param7, param4, param6, param0, param15, param13, param5, vj.field_j, param11, param14, param12, param10, (byte) 88, param1, param3, param8, param2);
            } else {
              e.a(param11, param0, param13, param4, param3, param6, param5, vj.field_j, param7, param14, param2, param10, (byte) 96, param1, param15, param8, param12);
            }
          } else {
            e.a(param7, param4, param6, param5, param15, param14, param0, vj.field_j, param10, param13, param12, param11, (byte) 104, param3, param1, param2, param8);
          }
        } else {
          if (param7 < param11) {
            e.a(param10, param5, param14, param4, param1, param6, param0, vj.field_j, param7, param13, param8, param11, (byte) 13, param3, param15, param2, param12);
          } else {
            if (param10 < param11) {
              e.a(param10, param5, param14, param0, param1, param13, param4, vj.field_j, param11, param6, param8, param7, (byte) 62, param15, param3, param12, param2);
            } else {
              e.a(param11, param0, param13, param5, param3, param14, param4, vj.field_j, param10, param6, param2, param7, (byte) 83, param15, param1, param12, param8);
            }
          }
        }
    }

    static {
        field_g = "Email is valid";
    }
}
