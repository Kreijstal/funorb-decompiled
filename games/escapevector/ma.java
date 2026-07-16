/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ma {
    static int[] field_c;
    static long field_g;
    static wb field_b;
    private RandomAccessFile field_e;
    private long field_d;
    private long field_f;
    static oe field_a;

    final long c(int param0) throws IOException {
        if (param0 != -26510) {
            field_a = null;
            return ((ma) this).field_e.length();
        }
        return ((ma) this).field_e.length();
    }

    final static void a(int param0, int param1, fd param2, int param3) {
        if (param0 != 25398) {
            Object var5 = null;
            ma.a(-36, 48, (fd) null, -113);
        }
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        if (param1 <= 124) {
          L0: {
            ma.b(103);
            var5 = ((ma) this).field_e.read(param2, param3, param0);
            if (-1 > (var5 ^ -1)) {
              ((ma) this).field_d = ((ma) this).field_d + (long)var5;
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            var5 = ((ma) this).field_e.read(param2, param3, param0);
            if (-1 > (var5 ^ -1)) {
              ((ma) this).field_d = ((ma) this).field_d + (long)var5;
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 1) {
          ((ma) this).field_d = -21L;
          ((ma) this).field_e.seek(param0);
          ((ma) this).field_d = param0;
          return;
        } else {
          ((ma) this).field_e.seek(param0);
          ((ma) this).field_d = param0;
          return;
        }
    }

    final static oc a(int param0, boolean param1, int param2) {
        oc var3 = null;
        oc stackIn_1_0 = null;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        oc stackOut_0_0 = null;
        oc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        oc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var3 = new oc(param0);
          stackOut_0_0 = (oc) var3;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (oc) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (oc) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_q = stackIn_3_1 != 0;
        if (param2 != 8) {
          return null;
        } else {
          return var3;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          var2 = null;
          ma.a(-114, -57, (fd) null, 13);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static ee[] a(boolean param0) {
        if (param0) {
          field_b = null;
          return new ee[]{kf.field_q, oh.field_n, qj.field_g};
        } else {
          return new ee[]{kf.field_q, oh.field_n, qj.field_g};
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        if (param3 == -15814) {
          if (((ma) this).field_f < ((ma) this).field_d + (long)param1) {
            ((ma) this).field_e.seek(((ma) this).field_f);
            ((ma) this).field_e.write(1);
            throw new EOFException();
          } else {
            ((ma) this).field_e.write(param0, param2, param1);
            ((ma) this).field_d = ((ma) this).field_d + (long)param1;
            return;
          }
        } else {
          field_c = null;
          if (((ma) this).field_f < ((ma) this).field_d + (long)param1) {
            ((ma) this).field_e.seek(((ma) this).field_f);
            ((ma) this).field_e.write(1);
            throw new EOFException();
          } else {
            ((ma) this).field_e.write(param0, param2, param1);
            ((ma) this).field_d = ((ma) this).field_d + (long)param1;
            return;
          }
        }
    }

    final static void a(int param0, int param1, ll param2) {
        c var3 = null;
        var3 = om.field_c;
        var3.a(param1, true);
        var3.f(param2.field_g, -123);
        if (param0 >= -42) {
          return;
        } else {
          var3.h(75, param2.field_i);
          return;
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(null == ((ma) this).field_e)) {
            ((ma) this).field_e.close();
            ((ma) this).field_e = null;
        }
    }

    ma(File param0, String param1, long param2) throws IOException {
        int var5 = 0;
        L0: {
          if ((param2 ^ -1L) != 0L) {
            break L0;
          } else {
            param2 = 9223372036854775807L;
            break L0;
          }
        }
        L1: {
          if (param2 >= param0.length()) {
            break L1;
          } else {
            boolean discarded$2 = param0.delete();
            break L1;
          }
        }
        ((ma) this).field_e = new RandomAccessFile(param0, param1);
        ((ma) this).field_f = param2;
        ((ma) this).field_d = 0L;
        var5 = ((ma) this).field_e.read();
        if (0 == (var5 ^ -1)) {
          ((ma) this).field_e.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((ma) this).field_e.seek(0L);
            return;
          } else {
            ((ma) this).field_e.seek(0L);
            ((ma) this).field_e.write(var5);
            ((ma) this).field_e.seek(0L);
            return;
          }
        }
    }

    protected final void finalize() throws Throwable {
        if (null != ((ma) this).field_e) {
            System.out.println("");
            ((ma) this).a(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{5, 11, 8};
    }
}
