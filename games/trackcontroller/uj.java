/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj {
    static aa field_a;
    static jb field_b;
    static rd field_c;

    final static String a(int param0) {
        String var1 = "";
        if (param0 < -98) {
          if (ra.field_y != null) {
            var1 = ra.field_y.d(true);
          }
          if (var1.length() == 0) {
            var1 = li.d(-579139480);
          }
          if (0 == var1.length()) {
            var1 = ib.field_b;
          }
          return var1;
        }
        return (String) null;
    }

    final static qj[] a(String param0, kk param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        qj[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 108 % ((-60 - param2) / 39);
          var4_int = param1.a(true, param3);
          var6 = param1.a(param0, var4_int, -1);
          stackIn_1_0 = jd.a(4764, var6, var4_int, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uj.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
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
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 0) {
          field_c = (rd) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(String param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, uf param9, boolean param10, int param11, int param12, boolean param13) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ne.field_a = new la(param7);
            ra.field_C = new la(param4);
            ke.field_c = param6;
            dc.field_o = param0;
            ma.field_c = param2;
            kj.field_k = param11;
            db.field_Z = param12;
            rg.field_b = param5;
            gf.field_o = param9;
            uk.field_b = param3;
            if (!param8) {
              field_c = (rd) null;
            }
            oc.field_i = param13;
            mk.field_c = param10;
            sb.field_a = param1;
            if (null == gf.field_o.field_p) {
              return;
            }
            try {
              pl.field_b = new il(gf.field_o.field_p, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var15_ref;
            stackIn_13_1 = new StringBuilder().append("uj.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new aa(13, 0, 1, 0);
        field_b = new jb();
    }
}
