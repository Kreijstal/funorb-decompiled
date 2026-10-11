/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qja extends bf {
    nq field_i;

    final static void a(int param0) {
        fr.field_n = false;
        wba.field_a = null;
        ta.field_b = null;
        if (param0 != 0) {
          return;
        }
        vka.field_p = null;
        mq.field_a = null;
    }

    final static void b(int param0, lu param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          RuntimeException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = BachelorFridge.field_y;
          try {
            var6 = new byte[param0];
            var2 = var6;
            if (vg.field_n != null) {
              try {
                vg.field_n.a(0L, (byte) -114);
                vg.field_n.a((byte) -102, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var6[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
                param1.a(0, param0 - 103, 24, var2);
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param1.a(0, param0 - 103, 24, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("qja.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(op param0, int param1) {
        try {
          if (param1 != -26281) {
            this.field_i = (nq) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qja.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qja(nq param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, lu param1) {
        try {
          er.a(this.field_i, 123, param1);
          int var3_int = -82 / ((param0 + 53) / 50);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qja.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qja(lu param0) {
        try {
          this.field_i = qi.a(param0, (byte) 19);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
