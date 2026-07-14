/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea {
    static int field_b;
    static int field_d;
    private long field_e;
    private long field_a;
    private RandomAccessFile field_c;

    final long a(int param0) throws IOException {
        if (param0 >= -2) {
            return -41L;
        }
        return ((ea) this).field_c.length();
    }

    final void a(byte param0, long param1) throws IOException {
        Object var5 = null;
        ((ea) this).field_c.seek(param1);
        ((ea) this).field_a = param1;
        if (param0 != -55) {
          var5 = null;
          String discarded$2 = ea.a((CharSequence) null, 115);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (param0 == 1) {
          if ((((ea) this).field_e ^ -1L) > (((ea) this).field_a + (long)param3 ^ -1L)) {
            ((ea) this).field_c.seek(((ea) this).field_e);
            ((ea) this).field_c.write(1);
            throw new EOFException();
          } else {
            ((ea) this).field_c.write(param2, param1, param3);
            ((ea) this).field_a = ((ea) this).field_a + (long)param3;
            return;
          }
        } else {
          ((ea) this).field_e = 104L;
          if ((((ea) this).field_e ^ -1L) > (((ea) this).field_a + (long)param3 ^ -1L)) {
            ((ea) this).field_c.seek(((ea) this).field_e);
            ((ea) this).field_c.write(1);
            throw new EOFException();
          } else {
            ((ea) this).field_c.write(param2, param1, param3);
            ((ea) this).field_a = ((ea) this).field_a + (long)param3;
            return;
          }
        }
    }

    final int a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var5 = 6 % ((param2 - 74) / 34);
        var6 = ((ea) this).field_c.read(param3, param1, param0);
        if (-1 > (var6 ^ -1)) {
          ((ea) this).field_a = ((ea) this).field_a + (long)var6;
          return var6;
        } else {
          return var6;
        }
    }

    final static int a(byte param0) {
        if (param0 <= 98) {
            return -34;
        }
        nh.field_a.d(72);
        if (kb.field_b.a((byte) 80)) {
            return 0;
        }
        return pc.e(0);
    }

    final void a(boolean param0) throws IOException {
        Object var3 = null;
        if (!param0) {
          L0: {
            var3 = null;
            String discarded$8 = ea.a((CharSequence) null, -68);
            if (((ea) this).field_c != null) {
              ((ea) this).field_c.close();
              ((ea) this).field_c = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ea) this).field_c != null) {
              ((ea) this).field_c.close();
              ((ea) this).field_c = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != -1) {
            field_b = 98;
            return wd.a(false, param0, (byte) -101);
        }
        return wd.a(false, param0, (byte) -101);
    }

    ea(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((ea) this).field_c = new RandomAccessFile(param0, param1);
        ((ea) this).field_e = param2;
        ((ea) this).field_a = 0L;
        int var5 = ((ea) this).field_c.read();
        if ((var5 ^ -1) != 0) {
            // ifne L107
            ((ea) this).field_c.seek(0L);
            ((ea) this).field_c.write(var5);
        } else {
            ((ea) this).field_c.seek(0L);
            ((ea) this).field_c.seek(0L);
        }
        ((ea) this).field_c.seek(0L);
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ea) this).field_c)) {
            System.out.println("");
            ((ea) this).a(true);
        }
    }

    static {
    }
}
