/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn {
    static int[] field_m;
    static int[][] field_e;
    private long field_k;
    static int field_c;
    static String field_d;
    static int field_l;
    static mh field_g;
    static int field_i;
    static boolean field_n;
    static String field_b;
    private long field_j;
    static int field_h;
    static RgbSprite[] field_a;
    private RandomAccessFile field_f;

    protected final void finalize() throws Throwable {
        if (null != this.field_f) {
          System.out.println("");
          this.c(81);
        }
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_f.read(param1, param0, param2);
          if (param3 < 102) {
            field_l = -103;
          }
          if (0 < var5_int) {
            this.field_j = this.field_j + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        tf.field_a[param0] = 57;
        tf.field_a[93] = 43;
        tf.field_a[91] = 42;
        tf.field_a[47] = 73;
        tf.field_a[46] = 72;
        tf.field_a[61] = 27;
        tf.field_a[92] = 74;
        tf.field_a[44] = 71;
        tf.field_a[45] = 26;
        tf.field_a[192] = 28;
        tf.field_a[520] = 59;
        tf.field_a[222] = 58;
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        if (this.field_k < ((long)param3 + this.field_j)) {
          this.field_f.seek(this.field_k);
          this.field_f.write(1);
          throw new EOFException();
        }
        this.field_f.write(param2, param0, param3);
        if (param1 > -99) {
          return;
        }
        try {
          this.field_j = this.field_j + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "rn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final long d(int param0) throws IOException {
        if (param0 > -91) {
          field_e = (int[][]) null;
          return this.field_f.length();
        }
        return this.field_f.length();
    }

    public static void b(int param0) {
        field_g = null;
        field_e = (int[][]) null;
        if (param0 == 57) {
          field_b = null;
          field_d = null;
          field_a = null;
          field_m = null;
          return;
        }
        field_a = (RgbSprite[]) null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_m = null;
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 <= -10) {
          this.field_f.seek(param1);
          this.field_j = param1;
          return;
        }
        field_h = -109;
        this.field_f.seek(param1);
        this.field_j = param1;
    }

    final void c(int param0) throws IOException {
        int var2 = 0;
        int var2Lifetime1;
        if (null == this.field_f) {
          var2 = 74 % ((param0 - 5) / 49);
          return;
        }
        this.field_f.close();
        this.field_f = null;
        var2Lifetime1 = 74 % ((param0 - 5) / 49);
    }

    rn(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_f = new RandomAccessFile(param0, param1);
          this.field_j = 0L;
          this.field_k = param2;
          var5_int = this.field_f.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_f.seek(0L);
            this.field_f.write(var5_int);
          }
          this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Service unavailable";
        field_n = false;
        field_b = "Type your password again to make sure it's correct";
        field_h = 360;
    }
}
