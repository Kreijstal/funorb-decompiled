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
        if (param1 != 0) {
          field_b = -108;
          return tb.field_K.a(param0, param1 + -85, "");
        } else {
          return tb.field_K.a(param0, param1 + -85, "");
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param0 > -63) {
          field_k = null;
          ((qn) this).field_c.seek(param1);
          ((qn) this).field_f = param1;
          return;
        } else {
          ((qn) this).field_c.seek(param1);
          ((qn) this).field_f = param1;
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (((qn) this).field_c != null) {
            System.out.println("");
            ((qn) this).c(-100);
        }
    }

    qn(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((qn) this).field_c = new RandomAccessFile(param0, param1);
        ((qn) this).field_d = param2;
        ((qn) this).field_f = 0L;
        int var5 = ((qn) this).field_c.read();
        if (var5 != -1) {
            // ifne L108
            ((qn) this).field_c.seek(0L);
            ((qn) this).field_c.write(var5);
        } else {
            ((qn) this).field_c.seek(0L);
            ((qn) this).field_c.seek(0L);
        }
        ((qn) this).field_c.seek(0L);
    }

    final void c(int param0) throws IOException {
        if (null == ((qn) this).field_c) {
          if (param0 >= -68) {
            field_h = true;
            return;
          } else {
            return;
          }
        } else {
          ((qn) this).field_c.close();
          ((qn) this).field_c = null;
          if (param0 < -68) {
            return;
          } else {
            field_h = true;
            return;
          }
        }
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5 = 0;
        Object var6 = null;
        if (param3 <= -63) {
          var5 = ((qn) this).field_c.read(param1, param0, param2);
          if (0 < var5) {
            ((qn) this).field_f = ((qn) this).field_f + (long)var5;
            return var5;
          } else {
            return var5;
          }
        } else {
          var6 = null;
          byte[] discarded$2 = qn.a((String) null, -105);
          var5 = ((qn) this).field_c.read(param1, param0, param2);
          if (0 >= var5) {
            return var5;
          } else {
            ((qn) this).field_f = ((qn) this).field_f + (long)var5;
            return var5;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_g = null;
        field_k = null;
        if (param0 != 0) {
            Object var2 = null;
            byte[] discarded$0 = qn.a((String) null, -58);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (param0 != 0) {
            field_g = null;
            if (!(((long)param1 - -((qn) this).field_f ^ -1L) >= (((qn) this).field_d ^ -1L))) {
                ((qn) this).field_c.seek(((qn) this).field_d);
                ((qn) this).field_c.write(1);
                throw new EOFException();
            }
            ((qn) this).field_c.write(param2, param3, param1);
            ((qn) this).field_f = ((qn) this).field_f + (long)param1;
            return;
        }
        if (!(((long)param1 - -((qn) this).field_f ^ -1L) >= (((qn) this).field_d ^ -1L))) {
            ((qn) this).field_c.seek(((qn) this).field_d);
            ((qn) this).field_c.write(1);
            throw new EOFException();
        }
        ((qn) this).field_c.write(param2, param3, param1);
        ((qn) this).field_f = ((qn) this).field_f + (long)param1;
    }

    final long b(int param0) throws IOException {
        int var2 = 106 % ((param0 - 30) / 37);
        return ((qn) this).field_c.length();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_h = true;
        field_g = new vn(300, 200);
        field_b = 0;
        field_a = "Email: ";
    }
}
