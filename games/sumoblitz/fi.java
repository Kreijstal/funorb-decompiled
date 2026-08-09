/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends nt {
    private boolean field_s;

    fi(int param0, int param1, int param2) {
        super(100, param0, param1, param2);
        this.field_s = true;
    }

    final static int a(int param0, Random param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == -96) {
              if (param0 > 0) {
                if (!rm.a(param0, param2 ^ 55)) {
                  var3_int = -2147483648 - (int)(4294967296L % (long)param0);
                  L1: while (true) {
                    var4 = param1.nextInt();
                    if (var3_int <= var4) {
                      continue L1;
                    } else {
                      stackIn_12_0 = eb.a(param0, param2 ^ -44, var4);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> 124152800);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              stackIn_3_0 = 54;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("fi.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final void a(ha param0, int param1) {
        int var3_int = 0;
        if (param1 >= -121) {
            return;
        }
        try {
            if (!this.field_s) {
                var3_int = (int)(4096.0 * ((double)this.field_p / 100.0));
            } else {
                var3_int = (int)((double)(100 - this.field_p) / 100.0 * 4096.0);
            }
            var3_int = var3_int * (-this.field_p + 100);
            kw.field_a.a((float)(this.field_k >> -1358736184), (float)(this.field_o >> -2086129336), var3_int, 0, 1, this.field_q, 2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fi.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static String a(long param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        aj.field_y.setTime(new Date(param0));
        var3 = aj.field_y.get(7);
        var4 = aj.field_y.get(5);
        var5 = aj.field_y.get(2);
        var6 = aj.field_y.get(1);
        if (!param1) {
          return (String) null;
        } else {
          var7 = aj.field_y.get(11);
          var8 = aj.field_y.get(12);
          var9 = aj.field_y.get(13);
          return dk.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bq.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static {
    }
}
