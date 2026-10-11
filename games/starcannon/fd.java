/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd {
    static String field_d;
    static String field_b;
    static b field_a;
    static long field_c;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = StarCannon.field_A;
        try {
          if (param4 > -93) {
            field_a = (b) null;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= jf.field_a.length) {
              return;
            }
            param1 = jf.field_a[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = ih.field_d[incrementValue$1];
              dupTemp$2 = param2[param0];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              ih.field_d[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(rb param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          byte[] var5 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          try {
            var5 = new byte[24];
            var2 = var5;
            if (param1 > -108) {
              return;
            }
            if (null != mf.field_c) {
              try {
                mf.field_c.a(0L, 0);
                mf.field_c.a(var5, 15);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var5[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var5[var4] = (byte)-1;
                }
              }
              param0.a(var2, 24, -20144, 0);
            } else {
              param0.a(var2, 24, -20144, 0);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("fd.E(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
          fd.a(98, 30);
        }
        md.field_a = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != -12241) {
          return;
        }
        field_b = null;
    }

    final static short[] a(int param0, short[] param1, int param2, ia param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = StarCannon.field_A;
        try {
          var4_int = param3.e(8, param0);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new short[var4_int];
          }
          var5 = param3.e(8, 4);
          var6 = -78 / ((param2 - 34) / 53);
          var7 = (short)param3.e(8, 16);
          if (var5 <= 0) {
            for (var8 = 0; var8 < var4_int; var8++) {
              param1[var8] = (short)var7;
            }
          } else {
            for (var8 = 0; var8 < var4_int; var8++) {
              param1[var8] = (short)(param3.e(8, var5) + var7);
            }
          }
          stackIn_16_0 = (short[]) (param1);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_d = "GFX - MEDIUM";
        field_b = "Return to game";
        field_c = 20000000L;
    }
}
