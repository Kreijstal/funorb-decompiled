/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qp {
    static String field_c;
    private RandomAccessFile field_g;
    static String field_e;
    static cn field_a;
    private long field_d;
    private long field_b;
    static String[] field_f;

    final void a(int param0) throws IOException {
        if (((qp) this).field_g != null) {
            ((qp) this).field_g.close();
            ((qp) this).field_g = null;
        }
        if (param0 != 0) {
            ((qp) this).field_g = null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((((qp) this).field_b + (long)param3 ^ -1L) < (((qp) this).field_d ^ -1L)) {
            ((qp) this).field_g.seek(((qp) this).field_d);
            ((qp) this).field_g.write(1);
            throw new EOFException();
        }
        ((qp) this).field_g.write(param2, param0, param3);
        if (param1 < 36) {
            cn discarded$0 = qp.a(true);
        }
        ((qp) this).field_b = ((qp) this).field_b + (long)param3;
    }

    final static cn a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        var5 = DungeonAssault.field_K;
        var6 = new cn(20, 20);
        jh.a(var6);
        gf.b(0, 0, 20, 20, 16711680);
        gf.f(10, 10, 6, 0);
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -21) {
              var2 = 0;
              var3 = 0;
              L1: while (true) {
                if (20 <= var3) {
                  jh.b();
                  return var6;
                } else {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= 20) {
                      var3++;
                      continue L1;
                    } else {
                      if (((-10 + var3) * (var3 - 10) + (var4 - 10) * (var4 + -10) ^ -1) < -101) {
                        var6.field_B[var2] = 0;
                        var2++;
                        var4++;
                        continue L2;
                      } else {
                        var2++;
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              gf.b(-var2 + 18, var2, 4, 16711680);
              var2++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 46) {
            return -31L;
        }
        return ((qp) this).field_g.length();
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 18) {
            ((qp) this).field_g = null;
        }
        ((qp) this).field_g.seek(param0);
        ((qp) this).field_b = param0;
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param1 != -11274) {
            return 73;
        }
        int var5 = ((qp) this).field_g.read(param3, param0, param2);
        if (var5 > 0) {
            ((qp) this).field_b = ((qp) this).field_b + (long)var5;
        }
        return var5;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 56) {
            cn discarded$0 = qp.a(false);
        }
        field_c = null;
        field_f = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((qp) this).field_g)) {
            System.out.println("");
            ((qp) this).a(0);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        if (param0 != -24) {
            field_c = null;
        }
        if ((param1 ^ -1) != 0) {
            bf.field_f[param1].a(param2);
        } else {
            tb.a(param2, 1);
        }
    }

    qp(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((qp) this).field_g = new RandomAccessFile(param0, param1);
        ((qp) this).field_d = param2;
        ((qp) this).field_b = 0L;
        int var5 = ((qp) this).field_g.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((qp) this).field_g.seek(0L);
                ((qp) this).field_g.write(var5);
            }
        }
        ((qp) this).field_g.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "to return to the normal view.";
        field_c = "Create a free Account";
        field_f = new String[]{"Fire Immunity", "A creature of the lower planes, the <%0> cannot be harmed by any form of fire - such as that of a dragon."};
    }
}
