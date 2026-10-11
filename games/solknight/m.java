/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends gg {
    int field_i;
    int field_j;
    static nc field_h;

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = param0; var4 > var5; var5++) {
            if (param2.charAt(var5) == param1) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("m.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_h = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static rb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        rb var6 = null;
        rb var6Lifetime1;
        if (param3 == -6) {
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        }
        field_h = (nc) null;
        var6Lifetime1 = new rb(param0, param2, param1, param5, param4);
        pk.a((byte) 32, var6Lifetime1);
        return var6Lifetime1;
    }

    final static void b(boolean param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = SolKnight.field_L ? 1 : 0;
          try {
            if (il.field_c != null) {
              il.field_c.a((byte) 92);
            }
            if (param0) {
              return;
            }
            if (pf.field_d != null) {
              pf.field_d.a(5);
            }
            if (null != hc.field_c) {
              try {
                hc.field_c.d(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (tk.field_p == null) {
              return;
            }
            for (var1_int = 0; tk.field_p.length > var1_int; var1_int++) {
              if (null != tk.field_p[var1_int]) {
                try {
                  tk.field_p[var1_int].d(false);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw fc.a((Throwable) ((Object) var1_ref), "m.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = new nc();
    }
}
