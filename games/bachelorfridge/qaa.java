/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qaa {
    static int field_c;
    static String field_a;
    private RandomAccessFile field_b;
    static sna field_d;
    static int[] field_e;
    private long field_f;
    private long field_g;

    final long a(byte param0) throws IOException {
        if (param0 != 24) {
          qaa.b(true);
          return this.field_b.length();
        }
        return this.field_b.length();
    }

    final void a(long param0, boolean param1) throws IOException {
        this.field_b.seek(param0);
        this.field_f = param0;
        if (param1) {
          field_e = (int[]) null;
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.read(param0, param2, param1);
          if (param3 < var5_int) {
            this.field_f = this.field_f + (long)var5_int;
          }
          stackIn_4_0 = var5_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qaa.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        try {
          if (this.field_g < (this.field_f + (long)param1)) {
            this.field_b.seek(this.field_g);
            this.field_b.write(1);
            throw new EOFException();
          }
          if (param3 <= 56) {
            qaa.b(false);
          }
          this.field_b.write(param2, param0, param1);
          this.field_f = this.field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qaa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        if (param0) {
          field_a = (String) null;
          field_a = null;
          field_e = null;
          return;
        }
        field_a = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (this.field_b != null) {
          System.out.println("");
          this.a(true);
        }
    }

    final static kv[] a(int param0, int param1) {
        kv[] var3 = new kv[9];
        kv[] var2 = var3;
        if (param1 <= -13) {
          var3[4] = ik.b(64, param0, 2);
          return var2;
        }
        return (kv[]) null;
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          return;
        }
        if (this.field_b != null) {
          this.field_b.close();
          this.field_b = null;
        }
    }

    qaa(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_b = new RandomAccessFile(param0, param1);
          this.field_g = param2;
          this.field_f = 0L;
          var5_int = this.field_b.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_b.seek(0L);
            this.field_b.write(var5_int);
          }
          this.field_b.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qaa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Enter multiplayer lobby";
    }
}
