/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tc {
    private RandomAccessFile field_d;
    private long field_a;
    static String field_e;
    static int field_b;
    private long field_c;

    final void a(int param0) throws IOException {
        if (param0 != -31576) {
          return;
        }
        if (this.field_d != null) {
          this.field_d.close();
          this.field_d = null;
          return;
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 >= -78) {
          tc.b((byte) -126);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 != 0) {
          return;
        }
        try {
          if (((long)param1 + this.field_c) > this.field_a) {
            this.field_d.seek(this.field_a);
            this.field_d.write(1);
            throw new EOFException();
          }
          this.field_d.write(param3, param2, param1);
          this.field_c = this.field_c + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "tc.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                eb.field_i = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
            if (param0 < 5) {
              tc.c((byte) 29);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.read(param0, param2, param3);
          if (param1 != 74) {
            this.field_c = -18L;
          }
          if (0 < var5_int) {
            this.field_c = this.field_c + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tc.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.a(-31576);
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 < 118) {
          tc.c((byte) -25);
          return this.field_d.length();
        }
        return this.field_d.length();
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, long param1) throws IOException {
        this.field_d.seek(param1);
        this.field_c = param1;
        if (!param0) {
          field_e = (String) null;
          return;
        }
    }

    tc(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_a = param2;
          this.field_c = 0L;
          var5_int = this.field_d.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = -1;
        field_e = "Level right first time: doubled to ";
    }
}
