/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ml {
    private long field_d;
    static String field_c;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (param0 >= 22) {
          var5 = ((ml) this).field_a.read(param1, param3, param2);
          if (var5 > 0) {
            ((ml) this).field_d = ((ml) this).field_d + (long)var5;
            return var5;
          } else {
            return var5;
          }
        } else {
          int discarded$2 = ml.a(80);
          var5 = ((ml) this).field_a.read(param1, param3, param2);
          if (var5 <= 0) {
            return var5;
          } else {
            ((ml) this).field_d = ((ml) this).field_d + (long)var5;
            return var5;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param1 == 0) {
          if ((((ml) this).field_b ^ -1L) > ((long)param2 - -((ml) this).field_d ^ -1L)) {
            ((ml) this).field_a.seek(((ml) this).field_b);
            ((ml) this).field_a.write(1);
            throw new EOFException();
          } else {
            ((ml) this).field_a.write(param3, param0, param2);
            ((ml) this).field_d = ((ml) this).field_d + (long)param2;
            return;
          }
        } else {
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (((ml) this).field_a != null) {
            System.out.println("");
            ((ml) this).b((byte) -102);
        }
    }

    final void b(byte param0) throws IOException {
        if (((ml) this).field_a == null) {
          if (param0 > -62) {
            int discarded$4 = ml.a(-10);
            return;
          } else {
            return;
          }
        } else {
          ((ml) this).field_a.close();
          ((ml) this).field_a = null;
          if (param0 <= -62) {
            return;
          } else {
            int discarded$5 = ml.a(-10);
            return;
          }
        }
    }

    final static int a(int param0) {
        if (param0 < 37) {
            return -3;
        }
        return sja.field_i.length;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -7) {
            int discarded$0 = ml.a(-107);
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            ((ml) this).field_b = 5L;
            return ((ml) this).field_a.length();
        }
        return ((ml) this).field_a.length();
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
          ((ml) this).field_b = 46L;
          ((ml) this).field_a.seek(param1);
          ((ml) this).field_d = param1;
          return;
        } else {
          ((ml) this).field_a.seek(param1);
          ((ml) this).field_d = param1;
          return;
        }
    }

    ml(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((ml) this).field_a = new RandomAccessFile(param0, param1);
        ((ml) this).field_d = 0L;
        ((ml) this).field_b = param2;
        int var5 = ((ml) this).field_a.read();
        if (var5 != -1) {
            // ifne L116
            ((ml) this).field_a.seek(0L);
            ((ml) this).field_a.write(var5);
        } else {
            ((ml) this).field_a.seek(0L);
            ((ml) this).field_a.seek(0L);
        }
        ((ml) this).field_a.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Game full";
    }
}
