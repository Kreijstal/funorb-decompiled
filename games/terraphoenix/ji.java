/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji extends uf {
    static int field_k;
    static ci[] field_j;
    int field_i;
    int field_h;

    final static int a(int param0, int param1, int param2, int param3, String param4, byte param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < 59) {
            var8 = (String) null;
            ji.a(74, (String) null, false, (String) null);
          }
          stackIn_3_0 = og.field_f.a(param4, param0, param3 - 20, -param0 + param6, 480, param2, -1, 0, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ji.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private ji() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, q param1, q param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          var3_int = -param2.field_Mb + param1.field_Mb;
          if (param1.field_Eb == ml.field_t) {
            var3_int -= 200;
          } else {
            if (param1.field_Eb == null) {
              var3_int += 200;
            }
          }
          if (param2.field_Eb == ml.field_t) {
            var3_int += 200;
          } else {
            if (null == param2.field_Eb) {
              var3_int -= 200;
            }
          }
          if (param0 != -19) {
            field_k = -9;
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ji.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, String param5, long param6, he param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          int var15_int = 0;
          RuntimeException var15 = null;
          IOException var16 = null;
          try {
            mk.field_j = new uc(param9);
            di.field_l = new uc(param8);
            nd.field_i = param13;
            jm.field_c = param1;
            sb.field_i = param2;
            hf.field_x = param3;
            gi.field_v = param11;
            pc.field_a = param6;
            pg.field_f = param0;
            var15_int = 61 % ((-9 - param4) / 59);
            ij.field_d = param12;
            wa.field_t = param5;
            da.field_g = param7;
            hb.field_i = param10;
            if (null == da.field_g.field_m) {
              return;
            }
            try {
              mh.field_b = new ak(da.field_g.field_m, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var16 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var16.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var15;
            stackIn_13_1 = new StringBuilder().append("ji.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static StringBuilder a(char param0, StringBuilder param1, byte param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          var4_int = param1.length();
          param1.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param1.setCharAt(var5, param0);
          }
          if (param2 != 110) {
            field_j = (ci[]) null;
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ji.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static nb a(int param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        nb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param0 == param1.indexOf('@')) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = qd.a(-81, var7);
          } else {
            var6 = param1;
          }
          stackIn_4_0 = nh.a(var4_long, param2, -63, param3, (String) (var6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ji.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 19061) {
          ji.a(-117);
          field_j = null;
          return;
        }
        field_j = null;
    }

    static {
    }
}
