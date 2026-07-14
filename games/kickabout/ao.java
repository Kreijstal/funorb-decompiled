/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ao {
    static String[] field_f;
    static ew field_h;
    private long field_g;
    static hd field_a;
    static ut field_c;
    static int[] field_b;
    private RandomAccessFile field_j;
    static volatile int field_d;
    static int[][][] field_i;
    private long field_e;

    final void a(int param0, long param1) throws IOException {
        if (param0 != 15557) {
          field_h = null;
          ((ao) this).field_j.seek(param1);
          ((ao) this).field_e = param1;
          return;
        } else {
          ((ao) this).field_j.seek(param1);
          ((ao) this).field_e = param1;
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_h = null;
        field_f = null;
        if (param0 <= 111) {
            field_i = null;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 == 1) {
          if (((ao) this).field_g < (long)param3 - -((ao) this).field_e) {
            ((ao) this).field_j.seek(((ao) this).field_g);
            ((ao) this).field_j.write(1);
            throw new EOFException();
          } else {
            ((ao) this).field_j.write(param1, param2, param3);
            ((ao) this).field_e = ((ao) this).field_e + (long)param3;
            return;
          }
        } else {
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ao) this).field_j)) {
            System.out.println("");
            ((ao) this).a(-98);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        var5 = ((ao) this).field_j.read(param2, param3, param1);
        if (param0 == 33) {
          if (0 < var5) {
            ((ao) this).field_e = ((ao) this).field_e + (long)var5;
            return var5;
          } else {
            return var5;
          }
        } else {
          ao.b(58);
          if (0 >= var5) {
            return var5;
          } else {
            ((ao) this).field_e = ((ao) this).field_e + (long)var5;
            return var5;
          }
        }
    }

    final void a(int param0) throws IOException {
        int var2 = -76 / ((param0 - -38) / 60);
        if (!(null == ((ao) this).field_j)) {
            ((ao) this).field_j.close();
            ((ao) this).field_j = null;
        }
    }

    final static void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            return;
        }
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) lw.field_e);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lw.field_e);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) lw.field_e);
        field_d = 0;
    }

    final long c(int param0) throws IOException {
        if (param0 != 31114) {
            field_i = null;
            return ((ao) this).field_j.length();
        }
        return ((ao) this).field_j.length();
    }

    ao(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((ao) this).field_j = new RandomAccessFile(param0, param1);
        ((ao) this).field_g = param2;
        ((ao) this).field_e = 0L;
        int var5 = ((ao) this).field_j.read();
        if (var5 != -1) {
            // ifne L108
            ((ao) this).field_j.seek(0L);
            ((ao) this).field_j.write(var5);
        } else {
            ((ao) this).field_j.seek(0L);
            ((ao) this).field_j.seek(0L);
        }
        ((ao) this).field_j.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Modern Controls", "Oldschool Controls"};
        field_b = new int[6];
        field_d = 0;
        field_i = new int[33][33][33];
    }
}
