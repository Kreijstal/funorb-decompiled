/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qaa {
    static int field_c;
    static String field_a;
    private RandomAccessFile field_b;
    static sna field_d;
    static int[] field_e;
    private long field_f;
    private long field_g;

    final long a(byte param0) throws IOException {
        if (param0 != 24) {
            qaa.b(true);
            return ((qaa) this).field_b.length();
        }
        return ((qaa) this).field_b.length();
    }

    final void a(long param0, boolean param1) throws IOException {
        ((qaa) this).field_b.seek(param0);
        ((qaa) this).field_f = param0;
        if (param1) {
            field_e = null;
            return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = ((qaa) this).field_b.read(param0, param2, param1);
        if (!(param3 >= var5)) {
            ((qaa) this).field_f = ((qaa) this).field_f + (long)var5;
        }
        return var5;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        if ((((qaa) this).field_g ^ -1L) > (((qaa) this).field_f + (long)param1 ^ -1L)) {
          ((qaa) this).field_b.seek(((qaa) this).field_g);
          ((qaa) this).field_b.write(1);
          throw new EOFException();
        } else {
          if (param3 <= 56) {
            qaa.b(false);
            ((qaa) this).field_b.write(param2, param0, param1);
            ((qaa) this).field_f = ((qaa) this).field_f + (long)param1;
            return;
          } else {
            ((qaa) this).field_b.write(param2, param0, param1);
            ((qaa) this).field_f = ((qaa) this).field_f + (long)param1;
            return;
          }
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        if (param0) {
            field_a = null;
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (((qaa) this).field_b != null) {
            System.out.println("");
            ((qaa) this).a(true);
        }
    }

    final static kv[] a(int param0, int param1) {
        kv[] var2 = null;
        kv[] var3 = null;
        var3 = new kv[9];
        var2 = var3;
        if (param1 > -13) {
          return null;
        } else {
          var3[4] = ik.b(64, param0, 2);
          return var2;
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        if (!(((qaa) this).field_b == null)) {
            ((qaa) this).field_b.close();
            ((qaa) this).field_b = null;
        }
    }

    qaa(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((qaa) this).field_b = new RandomAccessFile(param0, param1);
        ((qaa) this).field_g = param2;
        ((qaa) this).field_f = 0L;
        int var5 = ((qaa) this).field_b.read();
        if ((var5 ^ -1) != 0) {
            // ifne L109
            ((qaa) this).field_b.seek(0L);
            ((qaa) this).field_b.write(var5);
        } else {
            ((qaa) this).field_b.seek(0L);
            ((qaa) this).field_b.seek(0L);
        }
        ((qaa) this).field_b.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter multiplayer lobby";
    }
}
