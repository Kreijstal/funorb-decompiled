/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md extends nj {
    static String field_j;
    static boolean field_k;
    private java.nio.ByteBuffer field_h;
    static int field_o;
    static lf[] field_g;
    static String field_f;
    static String field_m;
    static String field_l;
    static boolean field_i;
    static java.awt.Frame field_n;

    final static String a(String param0, gb param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a(-15879)) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          var4_int = 12 / ((3 - param3) / 60);
          stackIn_5_0 = param0 + " - " + param1.c(0) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("md.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1) {
        try {
          this.field_h = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_h.position(0);
          this.field_h.put(param1);
          if (param0 != 24) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "md.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = HostileSpawn.field_I ? 1 : 0;
          try {
            if (null != ig.field_N) {
              ig.field_N.a((byte) -128);
            }
            if (vc.field_c != null) {
              vc.field_c.a(3);
            }
            if (null != mk.field_K) {
              try {
                mk.field_K.f(0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (param0 <= 15) {
              md.b(-30);
            }
            if (null != oe.field_a) {
              for (var1_int = 0; oe.field_a.length > var1_int; var1_int++) {
                if (oe.field_a[var1_int] != null) {
                  try {
                    oe.field_a[var1_int].f(0);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw wg.a((Throwable) ((Object) var1_ref), "md.J(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        if (param0 >= -70) {
          field_l = (String) null;
          cj.a(bn.c(-1), 0);
          return;
        }
        cj.a(bn.c(-1), 0);
    }

    final byte[] a(byte param0) {
        byte[] var3 = null;
        if (param0 <= -25) {
          var3 = new byte[this.field_h.capacity()];
          byte[] var2 = var3;
          this.field_h.position(0);
          this.field_h.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 >= 42) {
          field_f = null;
          field_l = null;
          field_j = null;
          field_g = null;
          field_m = null;
          return;
        }
        md.c(87);
        field_f = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_m = null;
    }

    md() {
    }

    static {
        field_o = 0;
        field_k = true;
        field_m = "Completion time: <col=ffffff>";
        field_j = "Change display name";
        field_i = false;
        field_l = "The bridge console is in this room; walk up to it to download the data.";
    }
}
