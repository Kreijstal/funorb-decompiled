/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static fh field_a;
    static dd field_c;
    static int[] field_d;
    static int[] field_b;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 == -42) {
          field_a = null;
          field_b = null;
          return;
        }
        field_d = (int[]) null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
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
        var13 = fleas.field_A ? 1 : 0;
        try {
          var5_int = param4 + param1;
          if (param3 != 1) {
            field_c = (dd) null;
          }
          var6 = param2 + param0;
          if (gb.field_l >= param1) {
            stackIn_6_0 = gb.field_l;
          } else {
            stackIn_6_0 = param1;
          }
          var7 = stackIn_6_0;
          if (param2 > gb.field_b) {
            stackIn_9_0 = param2;
          } else {
            stackIn_9_0 = gb.field_b;
          }
          var8 = stackIn_9_0;
          if (gb.field_h > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = gb.field_h;
          }
          var9 = stackIn_12_0;
          if (gb.field_i <= var6) {
            stackIn_15_0 = gb.field_i;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (gb.field_l <= param1 &&
            param1 < gb.field_h) {
            var11 = param1 + gb.field_d * var8;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              gb.field_a[var11] = 16777215;
              var11 = var11 + gb.field_d * 2;
            }
          }
          if (gb.field_b <= param2 &&
            var6 < gb.field_i) {
            var11Lifetime1 = param2 * gb.field_d + var7;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              gb.field_a[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (gb.field_l <= var5_int &&
            var5_int < gb.field_h) {
            var11Lifetime2 = var5_int + ((var5_int - param1 & 1) + var8) * gb.field_d;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              gb.field_a[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * gb.field_d;
            }
          }
          if (gb.field_b <= param2) {
            if (gb.field_i <= var6) {
              return;
            }
            var11Lifetime3 = var7 + var6 * gb.field_d + (1 & -param2 + var6);
            var12Lifetime3 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              gb.field_a[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var5), "ek.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!jg.field_d) {
          throw new IllegalStateException();
        }
        if (ok.field_x != null) {
          ok.field_x.n(param0 ^ 22641);
          var1 = ni.d(true);
          lg.field_b = new ul(var1, (String) null, true, false, false);
          nb.field_a.b(ak.field_a, (byte) -35);
          if (param0 != -6) {
            ek.a((byte) 6);
            ak.field_a.d(lg.field_b, 26034);
            ak.field_a.l(param0 ^ 5);
            return;
          }
          ak.field_a.d(lg.field_b, 26034);
          ak.field_a.l(param0 ^ 5);
          return;
        }
        var1Lifetime1 = ni.d(true);
        lg.field_b = new ul(var1Lifetime1, (String) null, true, false, false);
        nb.field_a.b(ak.field_a, (byte) -35);
        if (param0 == -6) {
          ak.field_a.d(lg.field_b, 26034);
          ak.field_a.l(param0 ^ 5);
          return;
        }
        ek.a((byte) 6);
        ak.field_a.d(lg.field_b, 26034);
        ak.field_a.l(param0 ^ 5);
    }

    final static void a(int param0, int param1) {
        cl.field_a = ol.field_b[param1];
        if (param0 != 10) {
          return;
        }
        sg.field_a = hg.field_p[param1];
        mk.field_a = sa.field_c[param1];
    }

    static {
        field_a = new fh(15, 0, 1, 0);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_b = new int[10];
    }
}
