/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    private long field_e;
    static boolean field_b;
    private long field_d;
    private RandomAccessFile field_c;
    static int field_a;

    final void a(long param0, byte param1) throws IOException {
        Object var5 = null;
        if (param1 != -24) {
          var5 = null;
          boolean discarded$2 = ri.a((byte) -93, (String) null);
          ((ri) this).field_c.seek(param0);
          ((ri) this).field_d = param0;
          return;
        } else {
          ((ri) this).field_c.seek(param0);
          ((ri) this).field_d = param0;
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        if ((((ri) this).field_e ^ -1L) <= (((ri) this).field_d + (long)param0 ^ -1L)) {
          ((ri) this).field_c.write(param1, param3, param0);
          if (!param2) {
            ((ri) this).field_c = null;
            ((ri) this).field_d = ((ri) this).field_d + (long)param0;
            return;
          } else {
            ((ri) this).field_d = ((ri) this).field_d + (long)param0;
            return;
          }
        } else {
          ((ri) this).field_c.seek(((ri) this).field_e);
          ((ri) this).field_c.write(1);
          throw new EOFException();
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (param1 != 4836) {
          return -82;
        } else {
          L0: {
            var5 = ((ri) this).field_c.read(param0, param2, param3);
            if (var5 > 0) {
              ((ri) this).field_d = ((ri) this).field_d + (long)var5;
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        }
    }

    final long b(int param0) throws IOException {
        if (param0 != 0) {
            boolean discarded$0 = ri.c(97);
            return ((ri) this).field_c.length();
        }
        return ((ri) this).field_c.length();
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = wizardrun.field_H;
        var2 = 0;
        L0: while (true) {
          if (param1.length() <= var2) {
            if (param0 != -56) {
              var5 = null;
              boolean discarded$1 = ri.a((byte) -90, (String) null);
              return false;
            } else {
              return false;
            }
          } else {
            var3 = param1.charAt(var2);
            if (f.a((char) var3, true)) {
              var2++;
              var2++;
              var2++;
              continue L0;
            } else {
              if (!vl.a((char) var3, -5717)) {
                return true;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    protected final void finalize() throws Throwable {
        if (null != ((ri) this).field_c) {
            System.out.println("");
            ((ri) this).a(-1);
        }
    }

    final void a(int param0) throws IOException {
        if (null == ((ri) this).field_c) {
          if (param0 != -1) {
            ((ri) this).field_d = 71L;
            return;
          } else {
            return;
          }
        } else {
          ((ri) this).field_c.close();
          ((ri) this).field_c = null;
          if (param0 == -1) {
            return;
          } else {
            ((ri) this).field_d = 71L;
            return;
          }
        }
    }

    ri(File param0, String param1, long param2) throws IOException {
        int var5 = 0;
        L0: {
          if (-1L != param2) {
            break L0;
          } else {
            param2 = 9223372036854775807L;
            break L0;
          }
        }
        L1: {
          if ((param2 ^ -1L) <= (param0.length() ^ -1L)) {
            break L1;
          } else {
            boolean discarded$2 = param0.delete();
            break L1;
          }
        }
        ((ri) this).field_c = new RandomAccessFile(param0, param1);
        ((ri) this).field_e = param2;
        ((ri) this).field_d = 0L;
        var5 = ((ri) this).field_c.read();
        if ((var5 ^ -1) == 0) {
          ((ri) this).field_c.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((ri) this).field_c.seek(0L);
            return;
          } else {
            ((ri) this).field_c.seek(0L);
            ((ri) this).field_c.write(var5);
            ((ri) this).field_c.seek(0L);
            return;
          }
        }
    }

    final static void a(nj param0, int param1, byte param2) {
        mg var3 = null;
        Object var4 = null;
        if (param2 != 121) {
          var4 = null;
          boolean discarded$1 = ri.a((byte) -79, (String) null);
          var3 = n.field_b;
          var3.c((byte) 113, param1);
          var3.b((byte) 11, 5);
          var3.b((byte) 11, 0);
          var3.b(-1947079288, param0.field_l);
          var3.b((byte) 11, param0.field_j);
          var3.b((byte) 11, param0.field_o);
          return;
        } else {
          var3 = n.field_b;
          var3.c((byte) 113, param1);
          var3.b((byte) 11, 5);
          var3.b((byte) 11, 0);
          var3.b(-1947079288, param0.field_l);
          var3.b((byte) 11, param0.field_j);
          var3.b((byte) 11, param0.field_o);
          return;
        }
    }

    final static boolean c(int param0) {
        if (param0 < 18) {
            return false;
        }
        return ib.a((byte) 46, jg.f(1));
    }

    static {
    }
}
