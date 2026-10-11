/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int[][] field_a;
    static int field_d;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static int field_i;
    static int field_b;
    static volatile int field_g;
    static int field_h;

    final static void a(byte param0, ka[] param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 <= 0) {
            field_i = 2;
          }
          while (param1.length > var2_int) {
            param1[var2_int].h();
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("qb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var12Lifetime1;
        int var13Lifetime1;
        var7 = param3 % 32 - 32 * param0 / 256;
        var8 = -(param3 / 32) + param4;
        var9 = -var7 + 32 * var8;
        var10 = 328;
        if (var9 >= 0) {
          var11 = 1;
        } else {
          var11 = -1;
        }
        var9 = var9 * var11;
        if (var9 > 1024 &&
          var9 < 2048) {
          var11 = -var11;
        }
        if (2048 > var9) {
          var12 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << 16) >> 16) * var11;
          var13 = param5 * 64 / 256 + (param1 * 64 - param2);
          dl.field_n[1] = var12;
          dl.field_n[0] = var12;
          if (param6 != -2140919664) {
            field_d = -116;
          }
          dl.field_n[2] = var13;
          return;
        }
        var9 -= 2048;
        if (var9 > 1024) {
          var11 = -var11;
        }
        var12Lifetime1 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << 16) >> 16) * var11;
        var13Lifetime1 = param5 * 64 / 256 + (param1 * 64 - param2);
        dl.field_n[1] = var12Lifetime1;
        dl.field_n[0] = var12Lifetime1;
        if (param6 != -2140919664) {
          field_d = -116;
        }
        dl.field_n[2] = var13Lifetime1;
        return;
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          qb.a(-29);
          if (param0 < 48) {
            return false;
          }
          if (param0 <= 57) {
            return true;
          }
          return false;
        }
        if (param0 < 48) {
          return false;
        }
        if (param0 <= 57) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 == 2316) {
          field_a = (int[][]) null;
          field_f = null;
          return;
        }
        qb.a('\177', false);
        field_a = (int[][]) null;
        field_f = null;
    }

    static {
        field_f = "That name is not available";
        field_d = 0;
        field_a = new int[][]{new int[]{171, 61}, new int[]{157, 61}, new int[]{175, 61}};
        field_i = -1;
        field_g = -1;
        field_h = -1;
        field_b = 200;
        field_e = "Retry";
    }
}
