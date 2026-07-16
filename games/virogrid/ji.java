/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    private long field_g;
    private long field_f;
    static lc field_b;
    private RandomAccessFile field_h;
    static String field_d;
    static String field_a;
    static String field_c;
    static dk field_e;

    protected final void finalize() throws Throwable {
        if (null != ((ji) this).field_h) {
            System.out.println("");
            ((ji) this).b(0);
        }
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        if (!param3) {
          if (((ji) this).field_f < ((ji) this).field_g + (long)param0) {
            ((ji) this).field_h.seek(((ji) this).field_f);
            ((ji) this).field_h.write(1);
            throw new EOFException();
          } else {
            ((ji) this).field_h.write(param1, param2, param0);
            ((ji) this).field_g = ((ji) this).field_g + (long)param0;
            return;
          }
        } else {
          ji.a(101);
          if (((ji) this).field_f < ((ji) this).field_g + (long)param0) {
            ((ji) this).field_h.seek(((ji) this).field_f);
            ((ji) this).field_h.write(1);
            throw new EOFException();
          } else {
            ((ji) this).field_h.write(param1, param2, param0);
            ((ji) this).field_g = ((ji) this).field_g + (long)param0;
            return;
          }
        }
    }

    final long a(byte param0) throws IOException {
        int var2 = -60 % ((32 - param0) / 41);
        return ((ji) this).field_h.length();
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        var5 = ((ji) this).field_h.read(param3, param1, param0);
        if (var5 <= 0) {
          if (param2 != 1) {
            return 30;
          } else {
            return var5;
          }
        } else {
          ((ji) this).field_g = ((ji) this).field_g + (long)var5;
          if (param2 != 1) {
            return 30;
          } else {
            return var5;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((ji) this).field_h.seek(param1);
        ((ji) this).field_g = param1;
        int var4 = -46 % ((param0 - -3) / 59);
    }

    final void b(int param0) throws IOException {
        if (((ji) this).field_h == null) {
          if (param0 != 0) {
            ji.a(-9);
            return;
          } else {
            return;
          }
        } else {
          ((ji) this).field_h.close();
          ((ji) this).field_h = null;
          if (param0 == 0) {
            return;
          } else {
            ji.a(-9);
            return;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_a = null;
        if (param0 > -101) {
          var2 = null;
          String discarded$2 = ji.a(4, (CharSequence) null);
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(byte param0, int[] param1, int param2) {
        ag.field_j[param2] = param1;
        if (param0 >= -36) {
          field_b = null;
          al.field_j[param2] = new oi(param2);
          return;
        } else {
          al.field_j[param2] = new oi(param2);
          return;
        }
    }

    ji(File param0, String param1, long param2) throws IOException {
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
        ((ji) this).field_h = new RandomAccessFile(param0, param1);
        ((ji) this).field_f = param2;
        ((ji) this).field_g = 0L;
        var5 = ((ji) this).field_h.read();
        if (var5 == -1) {
          ((ji) this).field_h.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((ji) this).field_h.seek(0L);
            return;
          } else {
            ((ji) this).field_h.seek(0L);
            ((ji) this).field_h.write(var5);
            ((ji) this).field_h.seek(0L);
            return;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        if (param0 != 11) {
          L0: {
            field_c = null;
            var2 = ci.a(jc.a(param1, (byte) -124), 75);
            if (var2 != null) {
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = ci.a(jc.a(param1, (byte) -124), 75);
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "<%0> is not on your friend list.";
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = new lc(11, 0, 1, 2);
    }
}
