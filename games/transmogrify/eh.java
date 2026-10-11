/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private static long[] field_d;
    static h field_e;
    static ti[] field_c;
    static int field_a;
    static ii[] field_b;

    final static void a(ol param0, byte param1, String param2, kg param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param0.field_g[0] + param3.a(param2.substring(0, var7));
            }
            if (-1 != var6) {
              param0.field_g[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param4;
              }
              param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 8) - (-param3.a(param2.substring(0, var7 + 1)) + param3.a((char) var8)));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          if (param1 != 79) {
            eh.b((byte) 42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("eh.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 104 % ((-37 - param0) / 39);
        field_c = null;
        field_e = null;
    }

    final static void a(sj param0, int param1) {
        int var3 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        j var3_ref_j = null;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 < 52) {
            field_a = -6;
          }
          var2_int = param0.field_t;
          if (param0.field_k != null &&
            param0.field_k != od.field_g &&
            null == param0.field_k.field_e[param0.field_s]) {
            param0.a(param0.field_s, 28, param0.field_k);
            param0 = null;
          }
          if (param0 != null) {
            if (param0.field_h != 0) {
              var3_ref_j = wk.field_a;
              var4 = si.field_i;
            } else {
              var4 = wk.field_a;
              var3_ref_j = si.field_i;
            }
            for (var5 = 0; var3_ref_j.field_e.length > var5; var5++) {
              if (null != var3_ref_j.field_e[var5]) {
                continue;
              }
              param0.a(var5, 28, var3_ref_j);
              param0 = null;
              break;
            }
            if (param0 != null) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (var7 < var4.field_e.length) {
                if (var4.field_e[var7] == null) {
                  param0.a(var7, 28, var4);
                  break;
                }
                var7++;
              }
            }
          }
          for (var3 = 1 + var2_int; var3 < 12; var3++) {
            if (od.field_g.field_e[var3] != null) {
              od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("eh.D(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          int var3 = Transmogrify.field_A ? 1 : 0;
          if (null != oh.field_h) {
            oh.field_h.a(-2025316960);
          }
          if (fd.field_d != null) {
            fd.field_d.c(-20444);
          }
          if (kk.field_b != null) {
            try {
              kk.field_b.a((byte) -96);
            } catch (IOException iOException) {
            }
          }
          if (null != oa.field_m) {
            for (var1_int = 0; var1_int < oa.field_m.length; var1_int++) {
              if (oa.field_m[var1_int] != null) {
                try {
                  oa.field_m[var1_int].a((byte) -61);
                } catch (IOException var2_ref) {
                }
              }
            }
          }
          if (param0 < 97) {
            kg var4 = (kg) null;
            eh.$cfr$intArgs$a$d8024809bc20((ol) null, 4, (String) null, (kg) null, -68);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sa a(ii[] param0, int param1, byte[] param2, int param3, int param4) {
        int var11_int = 0;
        byte[] array$0 = null;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        sa stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        sa var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        var28 = Transmogrify.field_A ? 1 : 0;
        try {
          if (256 != param0.length) {
            throw new IllegalArgumentException();
          }
          var5 = new int[256];
          var6 = new int[256];
          var7 = new int[256];
          var8 = new int[256];
          var9 = new int[]{0, param3, param4};
          var10 = new byte[256][];
          for (var11_int = param1; var11_int < 256; var11_int++) {
            var5[var11_int] = param0[var11_int].field_c - 1;
            var6[var11_int] = -1 + param0[var11_int].field_b;
            var7[var11_int] = 2 + param0[var11_int].field_f;
            var8[var11_int] = param0[var11_int].field_g + 2;
            array$0 = new byte[var7[var11_int] * var8[var11_int]];
            var10[var11_int] = array$0;
            var12 = array$0;
            var13 = param0[var11_int].field_i;
            var14 = param0[var11_int].field_f;
            var15 = param0[var11_int].field_g;
            var16 = var7[var11_int];
            var17 = var16 - var14;
            var18 = 0;
            var19 = 1 + var7[var11_int];
            for (var20 = 0; var15 > var20; var20++) {
              for (var21 = 0; var14 > var21; var21++) {
                incrementValue$3 = var18;
                var18++;
                if (0 != var13[incrementValue$3]) {
                  var22 = var12;
                  var23 = -var16 + var19;
                  var24 = var12;
                  var25 = -1 + var19;
                  var26 = var12;
                  var27 = var19 + 1;
                  var12[var19 + var16] = (byte) 2;
                  var26[var27] = (byte) 2;
                  var24[var25] = (byte) 2;
                  var22[var23] = (byte) 2;
                }
                var19++;
              }
              var19 = var19 + var17;
            }
            var19Lifetime1 = var7[var11_int] + 1;
            var18Lifetime1 = 0;
            for (var20Lifetime1 = 0; var20Lifetime1 < var15; var20Lifetime1++) {
              for (var21Lifetime1 = 0; var14 > var21Lifetime1; var21Lifetime1++) {
                if (var13[var18Lifetime1++] == 0) {
                  var19Lifetime1++;
                } else {
                  incrementValue$2 = var19Lifetime1;
                  var19Lifetime1++;
                  var12[incrementValue$2] = (byte) 1;
                }
              }
              var19Lifetime1 = var19Lifetime1 + var17;
            }
          }
          var11 = new sa(param2, var5, var6, var7, var8, var9, var10);
          var11.field_D = var11.field_D - 1;
          var11.field_t = var11.field_t - 1;
          var11.field_y = var11.field_y - 1;
          stackIn_26_0 = var11;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_29_0 = var5_ref;
          stackIn_29_1 = new StringBuilder().append("eh.C(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_d = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_d[var2] = var0;
        }
        field_a = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$d8024809bc20(ol param0, int param1, String param2, kg param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param0.field_g[0] + param3.a(param2.substring(0, var7));
            }
            if (-1 != var6) {
              param0.field_g[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param4;
              }
              param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 8) - (-param3.a(param2.substring(0, var7 + 1)) + param3.a((char) var8)));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          if (param1 != 79) {
            eh.b((byte) 42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("eh.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }
}
