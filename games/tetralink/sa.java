/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static a field_f;
    private long field_e;
    static java.awt.Frame field_b;
    static String field_a;
    static int field_g;
    static hl field_h;
    private RandomAccessFile field_d;
    private long field_c;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if ((this.field_c + (long)param3) > this.field_e) {
            this.field_d.seek(this.field_e);
            this.field_d.write(1);
            throw new EOFException();
          }
          int var5_int = -65 / ((-20 - param0) / 33);
          this.field_d.write(param2, param1, param3);
          this.field_c = this.field_c + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sa.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(byte param0) {
        if (ll.field_C == ma.field_d) {
          return jl.field_c;
        }
        if (ll.field_C == pi.field_a) {
          return ak.field_b;
        }
        if (!oa.field_y.c(false)) {
          return ak.field_b;
        }
        if (param0 < -30) {
          return mk.field_d;
        }
        field_a = (String) null;
        return mk.field_d;
    }

    final int a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -122 % ((-48 - param3) / 47);
          var5_int = this.field_d.read(param2, param1, param0);
          if (var5_int > 0) {
            this.field_c = this.field_c + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        this.field_d.seek(param0);
        this.field_c = param0;
        if (param1) {
          sa.a((byte) -89);
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        ok.field_d = mh.field_c;
        im.field_e = uk.field_x;
        if (param1) {
          wk.field_s = uk.field_x;
          dg.field_j = mh.field_c;
        }
        cl.field_g = 2;
        if (param0 < -53) {
          return;
        }
        field_f = (a) null;
    }

    final void b(int param0) throws IOException {
        if (null != this.field_d) {
          this.field_d.close();
          this.field_d = null;
          if (param0 != 0) {
            this.field_d = (RandomAccessFile) null;
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        this.field_d = (RandomAccessFile) null;
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        if (param0 != -112) {
          return;
        }
        field_a = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.b(0);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
          sa.b((byte) -82);
          return this.field_d.length();
        }
        return this.field_d.length();
    }

    sa(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_c = 0L;
          var5_int = this.field_d.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = 0;
        field_a = "If you are not, please change your password to something more obscure!";
        field_f = new a();
    }
}
