/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class au {
    private long field_b;
    private long field_d;
    private RandomAccessFile field_a;
    static int field_c;

    protected final void finalize() throws Throwable {
        if (null != ((au) this).field_a) {
            System.out.println("");
            ((au) this).a(false);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (((au) this).field_b >= ((au) this).field_d + (long)param0) {
          ((au) this).field_a.write(param2, param3, param0);
          if (param1 != -14394) {
            return;
          } else {
            ((au) this).field_d = ((au) this).field_d + (long)param0;
            return;
          }
        } else {
          ((au) this).field_a.seek(((au) this).field_b);
          ((au) this).field_a.write(1);
          throw new EOFException();
        }
    }

    final int a(byte param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        L0: {
          var5 = ((au) this).field_a.read(param2, param3, param1);
          if (-1 > (var5 ^ -1)) {
            ((au) this).field_d = ((au) this).field_d + (long)var5;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -60) {
          return -39;
        } else {
          return var5;
        }
    }

    final void a(boolean param0) throws IOException {
        if (((au) this).field_a != null) {
            ((au) this).field_a.close();
            ((au) this).field_a = null;
            if (param0) {
                return;
            }
            return;
        }
        if (param0) {
            return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        ((au) this).field_a.seek(param1);
        ((au) this).field_d = param1;
        if (param0 != -38) {
            field_c = -3;
            return;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            field_c = 127;
            return ((au) this).field_a.length();
        }
        return ((au) this).field_a.length();
    }

    au(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((au) this).field_a = new RandomAccessFile(param0, param1);
        ((au) this).field_b = param2;
        ((au) this).field_d = 0L;
        int var5 = ((au) this).field_a.read();
        if (-1 != var5) {
            // ifne L108
            ((au) this).field_a.seek(0L);
            ((au) this).field_a.write(var5);
        } else {
            ((au) this).field_a.seek(0L);
            ((au) this).field_a.seek(0L);
        }
        ((au) this).field_a.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 2;
    }
}
