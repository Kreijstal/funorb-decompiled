/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class d {
    static String field_c;
    static am field_a;
    static bi[] field_b;
    static ln field_d;

    final static boolean a(ve param0, ve param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param1.field_zb - param0.field_zb;
          if (param2 != -81) {
            var5 = (Random) null;
            d.a((byte) -70, 114, 120, (Random) null);
          }
          if (jo.field_d == param1.field_xb) {
            var3_int -= 200;
          } else {
            if (null == param1.field_xb) {
              var3_int += 200;
            }
          }
          if (param0.field_xb == jo.field_d) {
            var3_int += 200;
          } else {
            if (param0.field_xb == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("d.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -28065) {
          ve var2 = (ve) null;
          d.a((ve) null, (ve) null, (byte) -8);
        }
    }

    final static void a(int param0, byte param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (wg.field_f != null && (param0 < 0 ||
            ih.field_f == cs.field_j)) {
            if (param1 != 82) {
              return;
            }
            if (js.field_f.field_j == 0 &&
              (mj.field_Pb + 10000L) < pr.a(param1 + 14192)) {
              js.field_f.h(param0, param1 ^ 173);
            }
            if (js.field_f.field_j > 0) {
              try {
                wg.field_f.a(js.field_f.field_j, 0, js.field_f.field_h, param1 ^ -14022);
                mj.field_Pb = pr.a(14274);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                q.g(-119);
              }
              js.field_f.field_j = 0;
            }
            return;
          }
          js.field_f.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1, int param2, Random param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -12) {
            d.a(-116);
          }
          stackIn_3_0 = param1 + hi.a(1 - param1 + param2, param3, -11);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("d.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_c = "<%0> fleets remaining.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$a6964d7afeb1(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (wg.field_f != null && (param0 < 0 ||
            ih.field_f == cs.field_j)) {
            if (param1 != 82) {
              return;
            }
            if (js.field_f.field_j == 0 &&
              (mj.field_Pb + 10000L) < pr.a(param1 + 14192)) {
              js.field_f.h(param0, param1 ^ 173);
            }
            if (js.field_f.field_j > 0) {
              try {
                wg.field_f.a(js.field_f.field_j, 0, js.field_f.field_h, param1 ^ -14022);
                mj.field_Pb = pr.a(14274);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                q.g(-119);
              }
              js.field_f.field_j = 0;
            }
            return;
          }
          js.field_f.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }
}
