/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends IOException {
    static hj[] field_d;
    static String field_a;
    static String field_b;
    static int field_e;
    static String field_c;
    static String[] field_f;

    final static void a(int param0, hj[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dm.field_b = param1;
          if (param0 != 90) {
            return;
          }
          if (dm.field_b != null &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    bk(String param0) {
        super(param0);
    }

    final static fh a(int param0, java.awt.Component param1, int param2, boolean param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          fh var5 = null;
          ij var5_ref = null;
          fh stackIn_3_0 = null;
          ij stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param3) {
                field_c = (String) null;
              }
              var4 = Class.forName("ch");
              var5 = (fh) (var4.newInstance());
              var5.a(88, param2, param0, param1);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ij();
              ((fh) ((Object) var5_ref)).a(-73, param2, param0, param1);
              stackIn_5_0 = var5_ref;
              return (fh) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, vg param2) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        se var7 = uk.field_b;
        se var8 = var7;
        var8.i(param1, -41);
        var8.field_i = var8.field_i + 1;
        int var4 = var8.field_i;
        if (!param0) {
          return;
        }
        try {
          var8.a(1, -62);
          var8.b((byte) -60, param2.field_t);
          var8.b((byte) -60, param2.field_g);
          var8.b((byte) -60, param2.field_k);
          var8.b(param2.field_n, -1);
          var8.b(param2.field_m, -1);
          var8.b(param2.field_f, -1);
          var8.b(param2.field_r, -1);
          var8.a(param2.field_o.length, -118);
          for (var5 = 0; var5 < param2.field_o.length; var5++) {
            var7.b(param2.field_o[var5], -1);
          }
          var8.e(-18951, var4);
          var8.c((byte) -15, var8.field_i - var4);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_26_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + var6 + 1);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + (var6 - 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          if (param0 < 121) {
            var8 = (byte[]) null;
            bk.a((byte[]) null, 109);
          }
          while (0L == var2_long % 37L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_26_0 = var2_long;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("bk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 48) {
          field_d = (hj[]) null;
        }
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        vg var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -12465) {
            var3 = (vg) null;
            bk.a(true, 92, (vg) null);
          }
          stackIn_3_0 = tj.a(param0.length, 0, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bk.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "AWESOMEO";
        field_a = "Waiting for fonts";
        field_e = 0;
        field_c = "BEST HISCORES";
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
