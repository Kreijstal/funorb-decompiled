/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fm {
    private RandomAccessFile field_e;
    static ej field_a;
    private long field_d;
    private long field_c;
    static int field_b;

    final long a(byte param0) throws IOException {
        if (param0 != -115) {
            fm.a(-61, -87);
            return ((fm) this).field_e.length();
        }
        return ((fm) this).field_e.length();
    }

    final static void a(int param0, int param1) {
        hb var2 = vh.field_a;
        var2.b(true, param1);
        var2.f(87, 1);
        var2.f(115, 2);
        int var3 = 61 / ((param0 - 61) / 46);
    }

    final void a(int param0, long param1) throws IOException {
        ((fm) this).field_e.seek(param1);
        int var4 = -33 / ((47 - param0) / 50);
        ((fm) this).field_c = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((((fm) this).field_c + (long)param1 ^ -1L) >= (((fm) this).field_d ^ -1L)) {
          ((fm) this).field_e.write(param2, param3, param1);
          if (param0 != -20832) {
            return;
          } else {
            ((fm) this).field_c = ((fm) this).field_c + (long)param1;
            return;
          }
        } else {
          ((fm) this).field_e.seek(((fm) this).field_d);
          ((fm) this).field_e.write(1);
          throw new EOFException();
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((fm) this).field_e)) {
            System.out.println("");
            ((fm) this).b(0);
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 0) {
          L0: {
            ((fm) this).field_e = null;
            if (((fm) this).field_e != null) {
              ((fm) this).field_e.close();
              ((fm) this).field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((fm) this).field_e != null) {
              ((fm) this).field_e.close();
              ((fm) this).field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (!param0) {
          var5 = ((fm) this).field_e.read(param1, param2, param3);
          if (var5 > 0) {
            ((fm) this).field_c = ((fm) this).field_c + (long)var5;
            return var5;
          } else {
            return var5;
          }
        } else {
          fm.a(53);
          var5 = ((fm) this).field_e.read(param1, param2, param3);
          if (var5 <= 0) {
            return var5;
          } else {
            ((fm) this).field_c = ((fm) this).field_c + (long)var5;
            return var5;
          }
        }
    }

    fm(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((fm) this).field_e = new RandomAccessFile(param0, param1);
        ((fm) this).field_c = 0L;
        ((fm) this).field_d = param2;
        int var5 = ((fm) this).field_e.read();
        if (0 != (var5 ^ -1)) {
            // ifne L108
            ((fm) this).field_e.seek(0L);
            ((fm) this).field_e.write(var5);
        } else {
            ((fm) this).field_e.seek(0L);
            ((fm) this).field_e.seek(0L);
        }
        ((fm) this).field_e.seek(0L);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ej();
    }
}
