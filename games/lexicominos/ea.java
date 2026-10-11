/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea {
    static int field_b;
    static int field_d;
    private long field_e;
    private long field_a;
    private RandomAccessFile field_c;

    final long a(int param0) throws IOException {
        if (param0 >= -2) {
          return -41L;
        }
        return this.field_c.length();
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_c.seek(param1);
        this.field_a = param1;
        if (param0 == -55) {
          return;
        }
        CharSequence var5 = (CharSequence) null;
        ea.a((CharSequence) null, 115);
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if (param0 != 1) {
            this.field_e = 104L;
          }
          if (this.field_e < (this.field_a + (long)param3)) {
            this.field_c.seek(this.field_e);
            this.field_c.write(1);
            throw new EOFException();
          }
          this.field_c.write(param2, param1, param3);
          this.field_a = this.field_a + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ea.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 6 % ((param2 - 74) / 34);
          var6 = this.field_c.read(param3, param1, param0);
          if (var6 > 0) {
            this.field_a = this.field_a + (long)var6;
          }
          stackIn_3_0 = var6;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ea.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 <= 98) {
          return -34;
        }
        nh.field_a.d(72);
        if (kb.field_b.a((byte) 80)) {
          return 0;
        }
        return pc.e(0);
    }

    final void a(boolean param0) throws IOException {
        if (param0) {
          if (this.field_c != null) {
            this.field_c.close();
            this.field_c = null;
          }
          return;
        }
        CharSequence var3 = (CharSequence) null;
        ea.a((CharSequence) null, -68);
        if (this.field_c != null) {
          this.field_c.close();
          this.field_c = null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_b = 98;
          }
          stackIn_3_0 = wd.a(false, param0, (byte) -101);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ea.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ea(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_c = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_a = 0L;
          var5_int = this.field_c.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_c.seek(0L);
            this.field_c.write(var5_int);
          }
          this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_c) {
          System.out.println("");
          this.a(true);
        }
    }

    static {
    }
}
