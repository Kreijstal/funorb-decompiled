/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static a field_f;
    private long field_e;
    static java.awt.Frame field_b;
    static String field_a;
    static int field_g;
    static hl field_h;
    private RandomAccessFile field_d;
    private long field_c;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (!((((sa) this).field_c + (long)param3 ^ -1L) >= (((sa) this).field_e ^ -1L))) {
            ((sa) this).field_d.seek(((sa) this).field_e);
            ((sa) this).field_d.write(1);
            throw new EOFException();
        }
        int var5 = -65 / ((-20 - param0) / 33);
        ((sa) this).field_d.write(param2, param1, param3);
        ((sa) this).field_c = ((sa) this).field_c + (long)param3;
    }

    final static String a(byte param0) {
        if (ll.field_C == ma.field_d) {
          return jl.field_c;
        } else {
          if (ll.field_C != pi.field_a) {
            if (!oa.field_y.c(false)) {
              return ak.field_b;
            } else {
              if (param0 >= -30) {
                field_a = null;
                return mk.field_d;
              } else {
                return mk.field_d;
              }
            }
          } else {
            return ak.field_b;
          }
        }
    }

    final int a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = -122 % ((-48 - param3) / 47);
        var5 = ((sa) this).field_d.read(param2, param1, param0);
        if (-1 > (var5 ^ -1)) {
          ((sa) this).field_c = ((sa) this).field_c + (long)var5;
          return var5;
        } else {
          return var5;
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        ((sa) this).field_d.seek(param0);
        ((sa) this).field_c = param0;
        if (param1) {
            String discarded$0 = sa.a((byte) -89);
            return;
        }
    }

    final static void a(int param0, boolean param1) {
        L0: {
          ok.field_d = mh.field_c;
          im.field_e = uk.field_x;
          if (param1) {
            wk.field_s = uk.field_x;
            dg.field_j = mh.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        cl.field_g = 2;
        if (param0 >= -53) {
          field_f = null;
          return;
        } else {
          return;
        }
    }

    final void b(int param0) throws IOException {
        if (null == ((sa) this).field_d) {
          if (param0 != 0) {
            ((sa) this).field_d = null;
            return;
          } else {
            return;
          }
        } else {
          ((sa) this).field_d.close();
          ((sa) this).field_d = null;
          if (param0 == 0) {
            return;
          } else {
            ((sa) this).field_d = null;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        if (param0 != -112) {
            return;
        }
        field_a = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (!(((sa) this).field_d == null)) {
            System.out.println("");
            ((sa) this).b(0);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            sa.b((byte) -82);
            return ((sa) this).field_d.length();
        }
        return ((sa) this).field_d.length();
    }

    sa(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((sa) this).field_d = new RandomAccessFile(param0, param1);
        ((sa) this).field_e = param2;
        ((sa) this).field_c = 0L;
        int var5 = ((sa) this).field_d.read();
        if (-1 != var5) {
            // ifne L106
            ((sa) this).field_d.seek(0L);
            ((sa) this).field_d.write(var5);
        } else {
            ((sa) this).field_d.seek(0L);
            ((sa) this).field_d.seek(0L);
        }
        ((sa) this).field_d.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_a = "If you are not, please change your password to something more obscure!";
        field_f = new a();
    }
}
