/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static hl field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = 30 / ((param0 + 27) / 49);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != -14074) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = new byte[var2_int];
          rd.a(param1, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ak.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != wa.field_e && (param1 < 0 ||
            qi.field_p == li.field_a)) {
            if (param0 > -37) {
              ak.a(69);
            }
            if (0 == nd.field_Lb.field_t &&
              (rj.field_n + 10000L) < k.a(0)) {
              nd.field_Lb.f(param1, (byte) -92);
            }
            if (nd.field_Lb.field_t > 0) {
              try {
                wa.field_e.a(true, nd.field_Lb.field_t, nd.field_Lb.field_u, 0);
                rj.field_n = k.a(0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                mk.a(false);
              }
              nd.field_Lb.field_t = 0;
            }
            return;
          }
          nd.field_Lb.field_t = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, float param2) {
        try {
          if (param0 != 0) {
            field_b = (String) null;
          }
          bn.field_a = param1;
          md.field_v = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ak.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != 3058) {
          field_b = (String) null;
          if (null != hd.field_s) {
            return true;
          }
          if (vb.e(param0 - 34020)) {
            return true;
          }
          if (null != mm.field_y) {
            return true;
          }
          if (!d.c((byte) 66)) {
            return false;
          }
          return true;
        }
        if (null != hd.field_s) {
          return true;
        }
        if (vb.e(param0 - 34020)) {
          return true;
        }
        if (null != mm.field_y) {
          return true;
        }
        if (!d.c((byte) 66)) {
          return false;
        }
        return true;
    }

    static {
    }
}
