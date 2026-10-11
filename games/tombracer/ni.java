/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ni {
    static boolean field_c;
    private qm field_a;
    private qm field_d;
    private eja field_b;

    final void a(byte param0) {
        this.field_a.a(12574);
        if (param0 < 22) {
          this.field_d = (qm) null;
        }
    }

    final static void a(uia param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = TombRacer.field_G ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (null != fua.field_b) {
              try {
                fua.field_b.a((byte) 2, 0L);
                fua.field_b.a(var6, 0);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var2[var3_int] == 0) {
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
            param0.a(0, var2, 24, 68);
            if (param1 <= 61) {
              field_c = true;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("ni.B(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(eo param0) {
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        jaclib.memory.Buffer var9 = null;
        int var5Lifetime1;
        try {
          param0.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b, gj.field_n}), new ne(gj.field_e)}, 0);
          this.field_a = param0.c(6, true);
          this.field_d = param0.c(6, false);
          this.field_d.a(393168, 12, true);
          this.field_b = param0.a(26, false);
          this.field_b.a(18, 49146);
          var7 = this.field_b.a(true, (byte) -44);
          if (var7 != null) {
            var8 = param0.a(var7, 125);
            if (jaclib.memory.Stream.b()) {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = var4_int * 4;
                var8.a(var5);
                var8.a(1 + var5);
                var8.a(2 + var5);
                var8.a(var5 + 2);
                var8.a(var5 + 3);
                var8.a(var5);
              }
            } else {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = var4_int * 4;
                var8.b(var5);
                var8.b(var5 + 1);
                var8.b(2 + var5);
                var8.b(2 + var5);
                var8.b(var5 + 3);
                var8.b(var5);
              }
            }
            var8.a();
            this.field_b.a((byte) -97);
          }
          var9 = this.field_d.a(-15730, true);
          if (var9 != null) {
            var4 = param0.a(var9, 127);
            if (!jaclib.memory.Stream.b()) {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
              }
            } else {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
              }
            }
            var4.a();
            this.field_d.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("ni.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0, eo param1) {
        try {
          this.field_a.a(786336, 24, true);
          int var3_int = -61 / ((param0 + 55) / 41);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ni.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = true;
    }
}
