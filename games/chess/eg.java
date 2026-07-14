/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eg {
    static String field_d;
    private long field_b;
    private long field_a;
    static int field_h;
    static ci field_f;
    static String field_j;
    static int field_i;
    static long field_e;
    private RandomAccessFile field_c;
    static String field_g;

    protected final void finalize() throws Throwable {
        if (!(null == ((eg) this).field_c)) {
            System.out.println("");
            ((eg) this).a(10992);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (((long)param3 + ((eg) this).field_a ^ -1L) < (((eg) this).field_b ^ -1L)) {
          ((eg) this).field_c.seek(((eg) this).field_b);
          ((eg) this).field_c.write(1);
          throw new EOFException();
        } else {
          if (param1 != -1036) {
            field_i = -36;
            ((eg) this).field_c.write(param2, param0, param3);
            ((eg) this).field_a = ((eg) this).field_a + (long)param3;
            return;
          } else {
            ((eg) this).field_c.write(param2, param0, param3);
            ((eg) this).field_a = ((eg) this).field_a + (long)param3;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, le param3, le param4, int param5) {
        ig.field_b = param3;
        mf.field_z = param1;
        uc.field_g = param4;
        fh.field_e = param2;
        if (param5 != 4) {
            return;
        }
        gm.field_e = param0;
    }

    final long a(byte param0) throws IOException {
        int var2 = 73 / ((-1 - param0) / 50);
        return ((eg) this).field_c.length();
    }

    public static void b(int param0) {
        field_d = null;
        field_g = null;
        field_j = null;
        if (param0 != -1) {
            return;
        }
        field_f = null;
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = -41 % ((-26 - param3) / 49);
        var5 = ((eg) this).field_c.read(param1, param0, param2);
        if ((var5 ^ -1) < -1) {
          ((eg) this).field_a = ((eg) this).field_a + (long)var5;
          return var5;
        } else {
          return var5;
        }
    }

    final void a(long param0, int param1) throws IOException {
        ((eg) this).field_c.seek(param0);
        ((eg) this).field_a = param0;
        if (param1 != -11526) {
            field_f = null;
            return;
        }
    }

    final static void a(int[] param0, String[] param1, int param2, boolean param3, um param4, km[][] param5, String[][] param6, um param7, byte[] param8, int param9, um param10, String[][] param11, byte[] param12, int param13, km[][] param14) {
        if (param2 > -108) {
            eg.a((int[]) null, (String[]) null, 1, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 64, (um) null, (String[][]) null, (byte[]) null, -39, (km[][]) null);
        }
        Object var17 = null;
        Object var16 = null;
        ak.a(param5, param8, (int[]) null, param10, param12, param9, (rk[]) null, param13, param1, param11, param0, 22193, param14, param4, param7, param3, param6);
    }

    final static int a(int param0, int param1, int param2) {
        if (-1 >= (param0 ^ -1)) {
          if (param1 == 0) {
            if (param2 == param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            eg.a((int[]) null, (String[]) null, -25, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 53, (um) null, (String[][]) null, (byte[]) null, -67, (km[][]) null);
            if (param2 == param0) {
              return 0;
            } else {
              return 1;
            }
          }
        } else {
          return param0;
        }
    }

    final void a(int param0) throws IOException {
        L0: {
          if (null != ((eg) this).field_c) {
            ((eg) this).field_c.close();
            ((eg) this).field_c = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10992) {
          field_f = null;
          return;
        } else {
          return;
        }
    }

    eg(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((eg) this).field_c = new RandomAccessFile(param0, param1);
        ((eg) this).field_b = param2;
        ((eg) this).field_a = 0L;
        int var5 = ((eg) this).field_c.read();
        if (-1 != var5) {
            // ifne L114
            ((eg) this).field_c.seek(0L);
            ((eg) this).field_c.write(var5);
        } else {
            ((eg) this).field_c.seek(0L);
            ((eg) this).field_c.seek(0L);
        }
        ((eg) this).field_c.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 4;
        field_j = null;
        field_g = "That name is not available";
        field_d = "<%0> has resigned and left.";
    }
}
