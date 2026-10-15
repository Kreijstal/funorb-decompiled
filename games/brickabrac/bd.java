/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd implements ub {
    static String field_a;
    static al field_b;

    final static void a(int param0, boolean param1) {
        if (!param1) {
          bd.a(-34, 70);
          ch.field_b = param0;
          return;
        }
        ch.field_b = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (al) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, sp param2) {
        try {
          tm.field_f.a(param2, (byte) 3);
          if (param1 != 25) {
            bd.a(20, false);
          }
          ke.a(param0, param2, param1 + 14964);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "bd.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = gb.a(param0, 67);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ik.a((byte) -9, var4.charAt(0)) &&
              !ik.a((byte) -9, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = param1; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (!ik.a((byte) -9, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("bd.E(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static jp[] a(String param0, String param1, mf param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jp[] stackIn_2_0 = null;
        jp[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param0, false);
          if (param3 != -8) {
            stackIn_2_0 = (jp[]) null;
            return stackIn_2_0;
          }
          var5 = param2.a(var4_int, -46, param1);
          stackIn_4_0 = qa.a(var5, var4_int, param2, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bd.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        jp var8 = null;
        try {
          var6_int = param3.field_o + param2;
          var7 = param3.field_w + param4;
          if (param1 != -20618) {
            field_a = (String) null;
          }
          ig.b(param3.field_s, var6_int, param3.field_t, var7, -17634);
          var8 = df.field_a[1];
          if (param3 instanceof d &&
            ((d) (param3)).field_F) {
            var8.f((-var8.field_x + param3.field_t >> 1) + 1 + var6_int, (-var8.field_z + param3.field_s >> 1) + 1 + var7, 256);
          }
          if (!param3.f(param1 ^ 20732)) {
            return;
          }
          hj.a(var7 + 2, var6_int + 2, 124, -4 + param3.field_s, -4 + param3.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("bd.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        pi var2 = k.field_h;
        var2.e(-13413, param0);
        var2.a(-119, 1);
        var2.a(-127, 0);
        if (param1 >= 63) {
          return;
        }
        field_a = (String) null;
    }

    static {
        field_a = "Create a free Account";
    }
}
