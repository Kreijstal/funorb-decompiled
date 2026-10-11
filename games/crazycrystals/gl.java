/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gl {
    static int field_j;
    private long field_g;
    static int[] field_d;
    static int field_e;
    static String field_l;
    static boolean field_c;
    private long field_k;
    static char[] field_a;
    private RandomAccessFile field_b;
    static String field_f;
    static long field_i;
    static wa field_h;

    final long a(int param0) throws IOException {
        if (param0 != 48) {
          return 29L;
        }
        return this.field_b.length();
    }

    final static void b(int param0) {
        String var2 = (String) null;
        da.a("", 79, (String) null);
        int var1 = 2 / ((1 - param0) / 38);
    }

    final static boolean c(int param0) {
        if (param0 != -11) {
          gl.b(-7);
          if (hp.field_s < 10) {
            return false;
          }
          if (!field_c) {
            return !of.a(param0 + 11) ? true : false;
          }
          return false;
        }
        if (hp.field_s < 10) {
          return false;
        }
        if (!field_c) {
          return !of.a(param0 + 11) ? true : false;
        }
        return false;
    }

    final int a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.read(param0, param1, param2);
          if (param3 > -57) {
            field_e = -58;
          }
          if (var5_int > 0) {
            this.field_k = this.field_k + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gl.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    gl(File param0, String param1, long param2) throws IOException {
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
          this.field_k = 0L;
          var5_int = this.field_b.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_b.seek(0L);
            this.field_b.write(var5_int);
          }
          this.field_b.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 < -86) {
          this.field_b.seek(param0);
          this.field_k = param0;
          return;
        }
        field_l = (String) null;
        this.field_b.seek(param0);
        this.field_k = param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
          if (this.field_g < (this.field_k + (long)param2)) {
            this.field_b.seek(this.field_g);
            this.field_b.write(1);
            throw new EOFException();
          }
          if (param0 != 120) {
            field_c = true;
          }
          this.field_b.write(param3, param1, param2);
          this.field_k = this.field_k + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_b != null) {
          System.out.println("");
          this.d(89);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_l = null;
        if (param0 != -117) {
          field_j = -58;
        }
    }

    final void d(int param0) throws IOException {
        if (null != this.field_b) {
          this.field_b.close();
          this.field_b = null;
        }
        if (param0 < 85) {
          gl.b(-69);
          return;
        }
    }

    static {
        field_j = 5;
        field_d = new int[8192];
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_f = "Backspace";
        field_l = "Unpacking sound effects";
        field_h = null;
        field_c = true;
    }
}
