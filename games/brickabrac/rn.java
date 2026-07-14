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
        int var5 = 0;
        var5 = ((rn) this).field_f.read(param1, param0, param2);
        if (param3 < 102) {
          L0: {
            field_l = -103;
            if (0 < var5) {
              ((rn) this).field_j = ((rn) this).field_j + (long)var5;
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            if (0 < var5) {
              ((rn) this).field_j = ((rn) this).field_j + (long)var5;
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
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
        if ((((rn) this).field_k ^ -1L) <= ((long)param3 + ((rn) this).field_j ^ -1L)) {
          ((rn) this).field_f.write(param2, param0, param3);
          if (param1 > -99) {
            return;
          } else {
            ((rn) this).field_j = ((rn) this).field_j + (long)param3;
            return;
          }
        } else {
          ((rn) this).field_f.seek(((rn) this).field_k);
          ((rn) this).field_f.write(1);
          throw new EOFException();
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
        if (param0 != 57) {
          field_a = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_m = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          field_m = null;
          return;
        }
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
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((rn) this).field_f = new RandomAccessFile(param0, param1);
        ((rn) this).field_j = 0L;
        ((rn) this).field_k = param2;
        int var5 = ((rn) this).field_f.read();
        if (-1 != var5) {
            // ifne L114
            ((rn) this).field_f.seek(0L);
            ((rn) this).field_f.write(var5);
        } else {
            ((rn) this).field_f.seek(0L);
            ((rn) this).field_f.seek(0L);
        }
        ((rn) this).field_f.seek(0L);
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
