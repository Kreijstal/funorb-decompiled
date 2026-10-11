/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb {
    int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(wi param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          wi var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          byte[] var11 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = Bounce.field_N;
          try {
            var10 = new byte[24];
            var8 = var10;
            var7 = var8;
            var11 = var7;
            var9 = var11;
            var2 = var9;
            if (null != gf.field_g) {
              try {
                gf.field_g.a((byte) 57, 0L);
                gf.field_g.a(0, var10);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var11[var3_int]) {
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
                  var2[var4] = (byte)-1;
                }
              }
            }
            param0.a(0, true, 24, var11);
            if (param1 != 25) {
              var6 = (wi) null;
              sb.a((wi) null, (byte) -47);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("sb.A(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    sb(int param0) {
        this.field_a = param0;
    }

    static {
    }
}
