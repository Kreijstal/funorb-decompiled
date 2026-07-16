/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class an {
    static int[] field_a;
    static int field_f;
    static boolean field_d;
    private RandomAccessFile field_e;
    static String field_g;
    static int field_h;
    private long field_c;
    private long field_b;

    final int b(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var5 = 17 / ((param0 - -73) / 36);
        var6 = ((an) this).field_e.read(param2, param3, param1);
        if (var6 > 0) {
          ((an) this).field_b = ((an) this).field_b + (long)var6;
          return var6;
        } else {
          return var6;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
            field_d = false;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        rj.field_c = 1000000000L / (long)param1;
        int var2 = 31 % ((param0 - 76) / 38);
    }

    final static pe a(byte param0, String param1) {
        int var2 = 0;
        Object var3 = null;
        pe var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = MinerDisturbance.field_ab;
        if (null != tc.field_o) {
          L0: {
            var2 = -65 / ((-21 - param0) / 63);
            var7 = (CharSequence) (Object) param1;
            var3 = (Object) (Object) cl.a(-95, var7);
            if (var3 != null) {
              break L0;
            } else {
              var3 = (Object) (Object) var7;
              break L0;
            }
          }
          var4 = (pe) (Object) tc.field_o.a(-7895, (long)((String) var3).hashCode());
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_ob;
                var5 = cl.a(-95, var8);
                if (var5 == null) {
                  var5 = var4.field_ob;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var5.equals(var3)) {
                return var4;
              } else {
                var4 = (pe) (Object) tc.field_o.c(1);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 48) {
            return -46L;
        }
        return ((an) this).field_e.length();
    }

    protected final void finalize() throws Throwable {
        if (!(((an) this).field_e == null)) {
            System.out.println("");
            ((an) this).b(-121);
        }
    }

    final static boolean c(int param0) {
        if (param0 == 0) {
          if (ij.field_o != null) {
            if (!ij.field_o.d(-127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = -6;
          if (ij.field_o != null) {
            if (!ij.field_o.d(-127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((an) this).field_e.seek(param1);
        if (param0 != 0) {
            return;
        }
        ((an) this).field_b = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((((an) this).field_b + (long)param1 ^ -1L) >= (((an) this).field_c ^ -1L)) {
          if (param3 <= 79) {
            return;
          } else {
            ((an) this).field_e.write(param2, param0, param1);
            ((an) this).field_b = ((an) this).field_b + (long)param1;
            return;
          }
        } else {
          ((an) this).field_e.seek(((an) this).field_c);
          ((an) this).field_e.write(1);
          throw new EOFException();
        }
    }

    an(File param0, String param1, long param2) throws IOException {
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
        ((an) this).field_e = new RandomAccessFile(param0, param1);
        ((an) this).field_c = param2;
        ((an) this).field_b = 0L;
        var5 = ((an) this).field_e.read();
        if (0 == (var5 ^ -1)) {
          ((an) this).field_e.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((an) this).field_e.seek(0L);
            return;
          } else {
            ((an) this).field_e.seek(0L);
            ((an) this).field_e.write(var5);
            ((an) this).field_e.seek(0L);
            return;
          }
        }
    }

    final void b(int param0) throws IOException {
        Object var3 = null;
        L0: {
          if (((an) this).field_e != null) {
            ((an) this).field_e.close();
            ((an) this).field_e = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -98) {
          var3 = null;
          pe discarded$2 = an.a((byte) 1, (String) null);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_g = "ESCAPED: <times> 2";
    }
}
