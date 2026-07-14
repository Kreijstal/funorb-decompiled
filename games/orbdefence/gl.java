/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gl {
    static ba field_j;
    private RandomAccessFile field_d;
    static int field_b;
    static String field_c;
    private long field_e;
    static int[] field_i;
    static String field_a;
    static String field_k;
    static String field_h;
    private long field_g;
    static String field_f;

    protected final void finalize() throws Throwable {
        if (null != ((gl) this).field_d) {
            System.out.println("");
            ((gl) this).d(100);
        }
    }

    final static void a(int param0, int param1, boolean param2, hj[] param3) {
        ui.field_b = new pf(param3);
        ak.field_z = param1;
        df.field_d = param0;
        jm.b(-1178583839);
        if (param2) {
            gl.c(74);
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (vh.field_q[0] != null) {
          return false;
        } else {
          kg.a(170, 470, 34, (byte) -92, new int[9], 0, 160);
          kg.a(50, 288, 32, (byte) -87, new int[6], 1, 200);
          kg.a(200, 440, 32, (byte) -90, new int[2], 2, 400);
          kg.a(170, 470, 32, (byte) -79, new int[3], 3, 430);
          kg.a(260, 512, 32, (byte) -103, new int[2], 4, 400);
          kg.a(260, 498, 32, (byte) -121, new int[2], 5, 400);
          kg.a(170, 470, 32, (byte) -96, new int[2], 6, 200);
          kg.a(50, 288, 32, (byte) -116, new int[0], 7, 400);
          kg.a(100, 540, 32, (byte) -122, new int[8], 8, 300);
          if (param0 == 10489) {
            aa.field_c = cc.field_t.a(jg.field_n[12]);
            var1 = cc.field_t.a(jg.field_n[13]);
            if (var1 > aa.field_c) {
              aa.field_c = var1;
              var2 = cc.field_t.field_E - (-cc.field_t.field_B - 4);
              wd.field_o[6] = var2 + cc.field_t.field_B + (200 - -cc.field_t.field_H);
              ek.field_e[6] = 2 * var2 + 30;
              return true;
            } else {
              var2 = cc.field_t.field_E - (-cc.field_t.field_B - 4);
              wd.field_o[6] = var2 + cc.field_t.field_B + (200 - -cc.field_t.field_H);
              ek.field_e[6] = 2 * var2 + 30;
              return true;
            }
          } else {
            field_h = null;
            aa.field_c = cc.field_t.a(jg.field_n[12]);
            var1 = cc.field_t.a(jg.field_n[13]);
            if (var1 <= aa.field_c) {
              var2 = cc.field_t.field_E - (-cc.field_t.field_B - 4);
              wd.field_o[6] = var2 + cc.field_t.field_B + (200 - -cc.field_t.field_H);
              ek.field_e[6] = 2 * var2 + 30;
              return true;
            } else {
              aa.field_c = var1;
              var2 = cc.field_t.field_E - (-cc.field_t.field_B - 4);
              wd.field_o[6] = var2 + cc.field_t.field_B + (200 - -cc.field_t.field_H);
              ek.field_e[6] = 2 * var2 + 30;
              return true;
            }
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_i = null;
        field_f = null;
        field_k = null;
        field_j = null;
        if (param0 != 128) {
          gl.c(78);
          field_c = null;
          field_h = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          return;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int var5 = 5 / ((65 - param1) / 60);
        if (!((((gl) this).field_g + (long)param2 ^ -1L) >= (((gl) this).field_e ^ -1L))) {
            ((gl) this).field_d.seek(((gl) this).field_e);
            ((gl) this).field_d.write(1);
            throw new EOFException();
        }
        ((gl) this).field_d.write(param3, param0, param2);
        ((gl) this).field_g = ((gl) this).field_g + (long)param2;
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        var5 = ((gl) this).field_d.read(param3, param0, param1);
        if (var5 <= 0) {
          if (param2 != -4837) {
            gl.c(7);
            return var5;
          } else {
            return var5;
          }
        } else {
          ((gl) this).field_g = ((gl) this).field_g + (long)var5;
          if (param2 == -4837) {
            return var5;
          } else {
            gl.c(7);
            return var5;
          }
        }
    }

    final void d(int param0) throws IOException {
        if (null == ((gl) this).field_d) {
          if (param0 < 6) {
            field_f = null;
            return;
          } else {
            return;
          }
        } else {
          ((gl) this).field_d.close();
          ((gl) this).field_d = null;
          if (param0 >= 6) {
            return;
          } else {
            field_f = null;
            return;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -9025) {
          boolean discarded$2 = gl.b(-115);
          ((gl) this).field_d.seek(param1);
          ((gl) this).field_g = param1;
          return;
        } else {
          ((gl) this).field_d.seek(param1);
          ((gl) this).field_g = param1;
          return;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            gl.c(-119);
            return ((gl) this).field_d.length();
        }
        return ((gl) this).field_d.length();
    }

    gl(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((gl) this).field_d = new RandomAccessFile(param0, param1);
        ((gl) this).field_e = param2;
        ((gl) this).field_g = 0L;
        int var5 = ((gl) this).field_d.read();
        if (var5 != -1) {
            // ifne L108
            ((gl) this).field_d.seek(0L);
            ((gl) this).field_d.write(var5);
        } else {
            ((gl) this).field_d.seek(0L);
            ((gl) this).field_d.seek(0L);
        }
        ((gl) this).field_d.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ba(9, 0, 4, 1);
        field_c = "BARRIER";
        field_i = new int[128];
        field_a = "Music: ";
        field_h = "Email: ";
        field_k = "Just play";
        field_f = "Highscores";
    }
}
