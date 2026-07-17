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
    static jp[] field_a;
    private RandomAccessFile field_f;

    protected final void finalize() throws Throwable {
        if (!(null == ((rn) this).field_f)) {
            System.out.println("");
            ((rn) this).c(81);
        }
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((rn) this).field_f.read(param1, param0, param2);
              if (param3 >= 102) {
                break L1;
              } else {
                field_l = -103;
                break L1;
              }
            }
            L2: {
              if (0 < var5_int) {
                ((rn) this).field_j = ((rn) this).field_j + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("rn.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0) {
        tf.field_a[59] = 57;
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
        if (~((rn) this).field_k > ~((long)param3 + ((rn) this).field_j)) {
            ((rn) this).field_f.seek(((rn) this).field_k);
            ((rn) this).field_f.write(1);
            throw new EOFException();
        }
        ((rn) this).field_f.write(param2, param0, param3);
        if (param1 > -99) {
            return;
        }
        try {
            ((rn) this).field_j = ((rn) this).field_j + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "rn.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final long d(int param0) throws IOException {
        if (param0 > -91) {
            field_e = null;
            return ((rn) this).field_f.length();
        }
        return ((rn) this).field_f.length();
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_m = null;
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 > -10) {
          field_h = -109;
          ((rn) this).field_f.seek(param1);
          ((rn) this).field_j = param1;
          return;
        } else {
          ((rn) this).field_f.seek(param1);
          ((rn) this).field_j = param1;
          return;
        }
    }

    final void c(int param0) throws IOException {
        int var2 = 0;
        if (null != ((rn) this).field_f) {
          ((rn) this).field_f.close();
          ((rn) this).field_f = null;
          var2 = 74 % ((param0 - 5) / 49);
          return;
        } else {
          var2 = 74 % ((param0 - 5) / 49);
          return;
        }
    }

    rn(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((rn) this).field_f = new RandomAccessFile(param0, param1);
            ((rn) this).field_j = 0L;
            ((rn) this).field_k = param2;
            var5_int = ((rn) this).field_f.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((rn) this).field_f.seek(0L);
                    ((rn) this).field_f.write(var5_int);
                }
            }
            ((rn) this).field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Service unavailable";
        field_n = false;
        field_b = "Type your password again to make sure it's correct";
        field_h = 360;
    }
}
