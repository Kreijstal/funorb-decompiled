/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_a;
    static String field_b;

    final static void a(re param0, int param1, byte param2) {
        pk var3 = fj.field_q;
        var3.a(param1, (byte) -77);
        var3.d((byte) 123, param0.field_k);
        if (param2 < 80) {
            return;
        }
        try {
            var3.d((byte) -49, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ik.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          vb.c(param0, param2, param3 + 1, 10000536);
          vb.c(param0, param2 + param1, param3 + 1, 12105912);
          var5_int = 1;
          if (vb.field_i > param2 + var5_int) {
            var5_int = -param2 + vb.field_i;
          }
          var6 = param1;
          if (vb.field_d < var6 + param2) {
            var6 = -param2 + vb.field_d;
          }
          var7 = var5_int;
          if (param4 != -1540604944) {
            field_b = (String) null;
          }
          while (var7 < var6) {
            var8 = 152 + 48 * var7 / param1;
            var9 = var8 << 8 | var8 << 16 | var8;
            vb.field_c[param0 + vb.field_f * (var7 + param2)] = var9;
            vb.field_c[param3 + (param2 + var7) * vb.field_f + param0] = var9;
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "ik.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 48) {
            field_a = -51;
        }
        field_b = null;
    }

    final static boolean a(ja param0, ja param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        ja var5 = null;
        int var6_int = 0;
        ja var6 = null;
        int var7 = 0;
        ja var5Lifetime1;
        ja var6Lifetime1;
        var7 = Geoblox.field_C;
        try {
          for (var3_int = 0; var3_int < param1.field_L; var3_int++) {
            if (param1.field_n[var3_int] == param0) {
              return false;
            }
          }
          var3_int = param2 ? 1 : 0;
          var4 = 0;
          fieldTemp$0 = param1.field_L;
          param1.field_L = param1.field_L + 1;
          param1.field_n[fieldTemp$0] = param0;
          fieldTemp$1 = param0.field_L;
          param0.field_L = param0.field_L + 1;
          param0.field_n[fieldTemp$1] = param1;
          if (param1.field_z != 0 ||
              param0.field_z != 0) {
            var5_int = 0;
            var6_int = 0;
            stackIn_14_0 = (param1.field_z != 1) ? 0 : 1;
            if (param0.field_z != 1) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            if ((stackIn_14_0 ^ stackIn_17_1) != 0) {
              if (param1.field_z == 1 &&
                  param0.field_z == 0) {
                param1.a(320, param1.field_C, param0.field_M, 0);
              } else {
                if (param1.field_z == 0 &&
                    param0.field_z == 1) {
                  var5_int = 1;
                } else {
                  if (param0.field_z == 2 &&
                      param1.field_z == 1) {
                    var3_int = 1;
                    var4 = 1;
                    var6_int = 1;
                    param1.a(320, param1.field_C, param0.field_M, 0);
                  } else {
                    if (1 == param0.field_z &&
                        param1.field_z == 2) {
                      param1.a(320, param0.field_C, param1.field_M, 0);
                      var5_int = 1;
                      var3_int = 1;
                    }
                  }
                }
              }
            } else {
              if (2 == param1.field_z ||
                  param0.field_z == 2) {
                if (param1.field_z == 2 &&
                    2 != param0.field_z) {
                  param1.a(320, param0.field_C, param1.field_M, param0.field_z);
                  var3_int = 1;
                } else {
                  if (param0.field_z == 2 &&
                      2 != param1.field_z) {
                    var4 = 1;
                    var6_int = 1;
                    var3_int = 1;
                    param0.a(320, param1.field_C, param0.field_M, param1.field_z);
                  }
                }
              }
            }
            if (var5_int != 0 ||
                  var6_int != 0) {
              bh.a(var6_int != 0, param1, 1, param0, var5_int != 0);
            }
            if (param1.field_z == 1 &&
                param0.field_z == 1 &&
                param0.field_C == param1.field_C) {
              param1.field_N = param1.field_N + 1;
              param0.field_N = param0.field_N + 1;
            } else {
              if (param1.field_z == 2 &&
                  param0.field_z == 2 &&
                  param0.field_M == param1.field_M) {
                param1.field_m = param1.field_m + 1;
                param0.field_m = param0.field_m + 1;
              }
            }
          }
          if (param1.field_z == 0 &&
              param0.field_z == 0) {
            if (param1.field_C == param0.field_C) {
              param1.field_N = param1.field_N + 1;
              param0.field_N = param0.field_N + 1;
            }
            if (param0.field_M == param1.field_M) {
              param1.field_m = param1.field_m + 1;
              param0.field_m = param0.field_m + 1;
            }
          }
          if (var3_int != 0) {
            for (var5_int = 0; param1.field_L > var5_int; var5_int++) {
              param1.field_n[var5_int].a(param1, 0);
            }
            var5 = param1;
            param1.field_N = 0;
            var6 = param1;
            var6.field_m = 0;
            var5.field_L = 0;
            param1.field_K = ji.field_r;
            param1.field_B = true;
          }
          if (var4 != 0) {
            for (var5_int = 0; param0.field_L > var5_int; var5_int++) {
              param0.field_n[var5_int].a(param0, 0);
            }
            var5Lifetime1 = param0;
            param0.field_N = 0;
            var6Lifetime1 = param0;
            var5Lifetime1.field_L = 0;
            param0.field_t = false;
            param0.field_B = true;
            param0.field_K = ji.field_r;
            var6Lifetime1.field_m = 0;
          }
          stackIn_77_0 = var3_int;
          return stackIn_77_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_80_0 = var3;
          stackIn_80_1 = new StringBuilder().append("ik.D(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = "Waiting for fonts";
    }
}
