/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qn {
    private RandomAccessFile field_c;
    static boolean field_j;
    private long field_d;
    private long field_f;
    static vn[] field_k;
    static vn field_g;
    static dj field_i;
    static boolean field_h;
    static int field_e;
    static String field_a;
    static int field_b;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_b = -108;
          }
          stackIn_3_0 = tb.field_K.a(param0, param1 - 85, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qn.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param0 <= -63) {
          this.field_c.seek(param1);
          this.field_f = param1;
          return;
        }
        field_k = (vn[]) null;
        this.field_c.seek(param1);
        this.field_f = param1;
    }

    protected final void finalize() throws Throwable {
        if (this.field_c != null) {
          System.out.println("");
          this.c(-100);
        }
    }

    qn(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_c = new RandomAccessFile(param0, param1);
          this.field_d = param2;
          this.field_f = 0L;
          var5_int = this.field_c.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_c.seek(0L);
            this.field_c.write(var5_int);
          }
          this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void c(int param0) throws IOException {
        if (null != this.field_c) {
          this.field_c.close();
          this.field_c = null;
          if (param0 >= -68) {
            field_h = true;
            return;
          }
          return;
        }
        if (param0 < -68) {
          return;
        }
        field_h = true;
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -63) {
            var6 = (String) null;
            qn.a((String) null, -105);
          }
          var5_int = this.field_c.read(param1, param0, param2);
          if (0 < var5_int) {
            this.field_f = this.field_f + (long)var5_int;
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("qn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_g = null;
        field_k = null;
        if (param0 != 0) {
          String var2 = (String) null;
          qn.a((String) null, -58);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if (param0 != 0) {
            field_g = (vn) null;
          }
          if (((long)param1 + this.field_f) > this.field_d) {
            this.field_c.seek(this.field_d);
            this.field_c.write(1);
            throw new EOFException();
          }
          this.field_c.write(param2, param3, param1);
          this.field_f = this.field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "qn.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final long b(int param0) throws IOException {
        int var2 = 106 % ((param0 - 30) / 37);
        return this.field_c.length();
    }

    static {
        field_j = false;
        field_h = true;
        field_g = new vn(300, 200);
        field_b = 0;
        field_a = "Email: ";
    }
}
