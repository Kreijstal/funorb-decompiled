/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static fe field_c;
    static int[] field_b;
    static int field_a;
    static int[][] field_d;

    public static void a(byte param0) {
        if (param0 >= 60) {
          field_d = (int[][]) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_d = (int[][]) null;
        field_d = (int[][]) null;
        field_c = null;
        field_b = null;
    }

    final static nl a(byte param0, String param1, int param2) {
        bc var3 = null;
        RuntimeException var3_ref = null;
        bc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new bc();
          if (param0 >= -119) {
            field_c = (fe) null;
          }
          ((nl) ((Object) var3)).field_g = param2;
          ((nl) ((Object) var3)).field_c = param1;
          stackIn_3_0 = var3;
          return (nl) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("og.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
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
        var13 = stellarshard.field_B;
        try {
          if (param1 != 105) {
            return;
          }
          var5_int = param2 + param0;
          var6 = param4 + param3;
          if (ti.field_e >= param0) {
            stackIn_6_0 = ti.field_e;
          } else {
            stackIn_6_0 = param0;
          }
          var7 = stackIn_6_0;
          if (param4 > ti.field_f) {
            stackIn_9_0 = param4;
          } else {
            stackIn_9_0 = ti.field_f;
          }
          var8 = stackIn_9_0;
          if (var5_int >= ti.field_c) {
            stackIn_12_0 = ti.field_c;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (ti.field_l > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = ti.field_l;
          }
          var10 = stackIn_15_0;
          if (ti.field_e <= param0 &&
            param0 < ti.field_c) {
            var11 = param0 + var8 * ti.field_i;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              ti.field_a[var11] = 16777215;
              var11 = var11 + 2 * ti.field_i;
            }
          }
          if (ti.field_f <= param4 &&
            ti.field_l > var6) {
            var11Lifetime1 = param4 * ti.field_i + var7;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              ti.field_a[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (ti.field_e <= var5_int &&
            ti.field_c > var5_int) {
            var11Lifetime2 = var5_int + ti.field_i * (var8 + (1 & var5_int - param0));
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ti.field_a[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * ti.field_i;
            }
          }
          if (param4 >= ti.field_f) {
            if (var6 >= ti.field_l) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              ti.field_a[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "og.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = new int[4];
        field_d = new int[][]{new int[]{64, 64, 4032, 4032, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, 64, 64, 4032, 4032}, new int[]{64, 64, -1, -1, 4032, 4032, -1, -1}, new int[]{-1, 64, 64, -1, -1, 4032, 4032, -1}, new int[]{-1, -1, 64, 64, -1, -1, 4032, 4032}, new int[]{64, -1, -1, 64, 4032, -1, -1, 4032}};
    }
}
