/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements fp {
    static vh field_a;
    static int field_b;

    final static int a(int param0, float param1, byte param2) {
        int var3 = -90 / ((param2 - 82) / 36);
        return (int)(0.5f + (float)(1 << param0) * param1);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9;
        int var10;
        int var11;
        long var12;
        long var14;
        int var16;
        long var17;
        long var19;
        long var21;
        long var23;
        int var25;
        int var26;
        var9 = param6 - param1;
        var11 = -92 / ((param7 + 46) / 51);
        var10 = -param8 + param0;
        if (od.a((long)var9, (long)param2, false) + od.a((long)var10, (long)param3, false) >= 0L) {
          return -1;
        }
        var12 = bm.a(-112, od.a((long)var9, (long)var9, false) + od.a((long)var10, (long)var10, false));
        var14 = bm.a(-99, od.a((long)param2, (long)param2, false) + od.a((long)param3, (long)param3, false));
        if (0L < -(long)(param5 << 16) + (var12 - var14)) {
          return -1;
        }
        var16 = aj.a(param2, false, param2) + aj.a(param3, false, param3);
        if (var16 == 0) {
          return -1;
        }
        var17 = (od.a((long)var9, (long)param2, false) + od.a((long)var10, (long)param3, false)) * 2L;
        var19 = od.a((long)var9, (long)var9, false) + (od.a((long)var10, (long)var10, false) - (long)(param5 * param5 << 16));
        var21 = od.a(var17, var17, false) - 4L * od.a((long)var16, var19, false);
        if (var21 < 0L) {
          return -1;
        }
        var23 = bm.a(-113, var21);
        if (var23 > 2147483647L) {
          throw new IllegalStateException("Out of range: 0x" + Long.toString(var23, 16));
        }
        if (-2147483648L > var23) {
          throw new IllegalStateException("Out of range: 0x" + Long.toString(var23, 16));
        }
        var25 = lh.a(var16, (byte) -128, (long)(int)(var23 - var17)) / 2;
        var26 = lh.a(var16, (byte) -64, (long)(int)(-var23 - var17)) / 2;
        if (0 >= var25) {
          if (var26 <= 0) {
            if (var25 >= 0) {
              if (var26 >= 0) {
                return -1;
              }
              if (var25 <= 0) {
                return -1;
              }
              return param4;
            }
            if (var26 > 0) {
              return param4;
            }
            if (var26 >= 0) {
              return -1;
            }
            if (var25 > 0) {
              return param4;
            }
            return -1;
          }
          if (65536 - param4 >= var26) {
            return param4 + var26;
          }
        } else {
          if (var25 <= 65536 - param4 &&
            var25 <= var26) {
            return param4 + var25;
          }
          if (var26 > 0 &&
            65536 - param4 >= var26) {
            return param4 + var26;
          }
        }
        if (var25 >= 0) {
          if (var26 >= 0) {
            return -1;
          }
          if (var25 <= 0) {
            return -1;
          }
        } else {
          if (var26 <= 0) {
            if (var26 >= 0) {
              return -1;
            }
            if (var25 > 0) {
              return param4;
            }
            return -1;
          }
        }
        return param4;
    }

    public static void a(int param0) {
        if (param0 == 16) {
          field_a = null;
          return;
        }
        j.a(-121, 82, 21, -7, 28, 50, -82, (byte) 121, 119);
        field_a = null;
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        dd var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param4.field_C + param1;
          var7 = -103 / ((param2 - 2) / 41);
          var8 = param3 + param4.field_D;
          mh.a(var6_int, var8, param4.field_y, param4.field_l, false);
          var9 = bo.field_a[1];
          if (param4 instanceof fe &&
            ((fe) (param4)).field_G) {
            var9.c(var6_int + (1 + (param4.field_l - var9.field_w >> 1)), (param4.field_y - var9.field_y >> 1) + (1 + var8), 256);
          }
          if (!param4.d(126)) {
            return;
          }
          bj.a(2 + var8, param4.field_y - 4, param4.field_l - 4, 2 + var6_int, 2187);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
