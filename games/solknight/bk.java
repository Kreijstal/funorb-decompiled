/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk {
    static nj field_a;

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = param0; var2_int > var4; var4++) {
            var3 = el.a((byte) 91, param1.charAt(var4)) + (-var3 + (var3 << 5));
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0, Random param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = -6 % ((param2 + 2) / 44);
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ri.a(-6873, param0)) {
            stackIn_6_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> 32);
            return stackIn_6_0;
          }
          var4 = -(int)(4294967296L % (long)param0) + -2147483648;
          do {
            var5 = param1.nextInt();
          } while (var5 >= var4);
          stackIn_10_0 = te.b(25403, param0, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("bk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 82 % ((2 - param0) / 55);
        field_a = null;
    }

    final static int a(byte param0, String param1, mg param2, int param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          var5_int = param2.b(param1);
          if (var5_int <= param3 &&
            -1 == param1.indexOf("<br>")) {
            param4[0] = param1;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + (var5_int + param3)) / param3;
          param3 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param2.b(var11);
              if (var12 >= param3) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (62 == var10 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param1.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (param0 != 3) {
            bk.a((byte) -51);
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("bk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          field_a = (nj) null;
          return te.field_N.h(param0 + 109);
        }
        return te.field_N.h(param0 + 109);
    }

    static {
    }
}
