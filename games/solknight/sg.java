/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    private long field_c;
    private long field_e;
    private RandomAccessFile field_a;
    static int[] field_b;
    static int field_d;

    final static String b(int param0) {
        if (param0 != -1) {
            return null;
        }
        if (!(ma.field_o != gf.field_Z)) {
            return ug.field_d;
        }
        if (!td.field_h.a(false)) {
            return td.field_h.b(28903);
        }
        if (!(gf.field_Z != gb.field_i)) {
            return td.field_h.b(28903);
        }
        return me.field_h;
    }

    protected final void finalize() throws Throwable {
        if (!(((sg) this).field_a == null)) {
            System.out.println("");
            ((sg) this).a((byte) -125);
        }
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 <= 103) {
            field_d = 122;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (((sg) this).field_c < (long)param0 + ((sg) this).field_e) {
          ((sg) this).field_a.seek(((sg) this).field_c);
          ((sg) this).field_a.write(1);
          throw new EOFException();
        } else {
          ((sg) this).field_a.write(param1, param3, param0);
          ((sg) this).field_e = ((sg) this).field_e + (long)param0;
          if (param2 != -1) {
            field_d = -9;
            return;
          } else {
            return;
          }
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            sg.c(114);
            return ((sg) this).field_a.length();
        }
        return ((sg) this).field_a.length();
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = ((sg) this).field_a.read(param3, param1, param2);
        if (!((var5 ^ -1) >= param0)) {
            ((sg) this).field_e = ((sg) this).field_e + (long)var5;
        }
        return var5;
    }

    final void a(byte param0) throws IOException {
        int var2 = 0;
        if (null != ((sg) this).field_a) {
          ((sg) this).field_a.close();
          ((sg) this).field_a = null;
          var2 = -25 / ((-85 - param0) / 36);
          return;
        } else {
          var2 = -25 / ((-85 - param0) / 36);
          return;
        }
    }

    sg(File param0, String param1, long param2) throws IOException {
        int var5 = 0;
        L0: {
          if (param2 != -1L) {
            break L0;
          } else {
            param2 = 9223372036854775807L;
            break L0;
          }
        }
        L1: {
          if ((param0.length() ^ -1L) >= (param2 ^ -1L)) {
            break L1;
          } else {
            boolean discarded$2 = param0.delete();
            break L1;
          }
        }
        ((sg) this).field_a = new RandomAccessFile(param0, param1);
        ((sg) this).field_c = param2;
        ((sg) this).field_e = 0L;
        var5 = ((sg) this).field_a.read();
        if (0 == (var5 ^ -1)) {
          ((sg) this).field_a.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((sg) this).field_a.seek(0L);
            return;
          } else {
            ((sg) this).field_a.seek(0L);
            ((sg) this).field_a.write(var5);
            ((sg) this).field_a.seek(0L);
            return;
          }
        }
    }

    final void a(long param0, byte param1) throws IOException {
        ((sg) this).field_a.seek(param0);
        if (param1 <= 71) {
            field_b = null;
            ((sg) this).field_e = param0;
            return;
        }
        ((sg) this).field_e = param0;
    }

    final static boolean b(byte param0) {
        if (param0 >= -102) {
            return true;
        }
        return jg.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
