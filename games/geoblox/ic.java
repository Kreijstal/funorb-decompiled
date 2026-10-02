/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic {
    static String field_b;
    static String field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          if (param1 > param0) {
            var3_int = param0;
            param0 = param1;
            param1 = var3_int;
          }
          L1: while (param1 != 0) {
            var3_int = param0 % param1;
            param0 = param1;
            param1 = var3_int;
          }
          if (param2 > -120) {
            ic.a(6);
          }
          stackIn_8_0 = param0;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 16424) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, int param8, String param9, int param10, d param11, int param12, int param13) {
        try {
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              eh.field_d = new pk(param8);
              fj.field_q = new pk(param2);
              ja.field_D = param11;
              ok.field_f = param3;
              lb.field_c = param1;
              sd.field_x = param13;
              ac.field_s = param7;
              f.field_ib = param0;
              rb.field_c = param4;
              mk.field_l = param10;
              ol.field_I = param9;
              ll.field_e = param5;
              qe.field_b = param6;
              if (ja.field_D.field_n != null) {
                try {
                  af.field_b = new sk(ja.field_D.field_n, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var15 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var15.toString());
                }
              }
              if (param12 == 64) {
                return;
              }
              field_b = (String) null;
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var15_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_16_0 = (RuntimeException) (var15_ref);
              stackIn_16_1 = new StringBuilder().append("ic.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
              if (param9 == null) {
                stackIn_17_2 = "null";
              } else {
                stackIn_17_2 = "{...}";
              }
              stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param10).append(',');
              if (param11 == null) {
                stackIn_20_2 = "null";
              } else {
                stackIn_20_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (param0 != 65) {
              field_a = (String) null;
            }
            if (null != af.field_b) {
              try {
                af.field_b.a(22, 0L);
                af.field_b.a(24, eh.field_d.field_f, eh.field_d.field_j, false);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
              }
            }
            eh.field_d.field_f = eh.field_d.field_f + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Create your own free Jagex account";
        field_a = "Bonus: <%0>";
    }
}
