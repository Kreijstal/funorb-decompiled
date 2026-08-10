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
        if (null != this.field_d) {
            System.out.println("");
            this.d(100);
        }
    }

    final static void a(int param0, int param1, boolean param2, hj[] param3) {
        try {
            ui.field_b = new pf(param3);
            ak.field_z = param1;
            df.field_d = param0;
            jm.b(-1178583839);
            if (param2) {
                gl.c(74);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "gl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        int var1;
        int var2;
        if (vh.field_q[0] != null) {
          return false;
        } else {
          kg.a(170, 470, 34, (byte) -92, new int[]{26, 0, 3, 12, 13, 4, 2, 14, 11}, 0, 160);
          kg.a(50, 288, 32, (byte) -87, new int[]{1, 12, 13, 3, 25, 7}, 1, 200);
          kg.a(200, 440, 32, (byte) -90, new int[]{15, 5}, 2, 400);
          kg.a(170, 470, 32, (byte) -79, new int[]{17, 6, 18}, 3, 430);
          kg.a(260, 512, 32, (byte) -103, new int[]{15, 5}, 4, 400);
          kg.a(260, 498, 32, (byte) -121, new int[]{2, 5}, 5, 400);
          kg.a(170, 470, 32, (byte) -96, new int[]{15, 16}, 6, 200);
          kg.a(50, 288, 32, (byte) -116, new int[]{}, 7, 400);
          kg.a(100, 540, 32, (byte) -122, new int[]{19, 20, 21, 22, 23, 24, 15, 5}, 8, 300);
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
            field_h = (String) null;
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
        try {
            int var5_int = 5 / ((65 - param1) / 60);
            if (!((this.field_g + (long)param2 ^ -1L) >= (this.field_e ^ -1L))) {
                this.field_d.seek(this.field_e);
                this.field_d.write(1);
                throw new EOFException();
            }
            this.field_d.write(param3, param0, param2);
            this.field_g = this.field_g + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "gl.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_d.read(param3, param0, param1);
              if (var5_int <= 0) {
                break L1;
              } else {
                this.field_g = this.field_g + (long)var5_int;
                break L1;
              }
            }
            L2: {
              if (param2 == -4837) {
                break L2;
              } else {
                gl.c(7);
                break L2;
              }
            }
            stackIn_5_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final void d(int param0) throws IOException {
        if (null == this.field_d) {
          if (param0 < 6) {
            field_f = (String) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_d.close();
          this.field_d = null;
          if (param0 >= 6) {
            return;
          } else {
            field_f = (String) null;
            return;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -9025) {
          gl.b(-115);
          this.field_d.seek(param1);
          this.field_g = param1;
          return;
        } else {
          this.field_d.seek(param1);
          this.field_g = param1;
          return;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            gl.c(-119);
            return this.field_d.length();
        }
        return this.field_d.length();
    }

    gl(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if ((param2 ^ -1L) == 0L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                param0.delete();
            }
            this.field_d = new RandomAccessFile(param0, param1);
            this.field_e = param2;
            this.field_g = 0L;
            var5_int = this.field_d.read();
            if (var5_int != -1 && !param1.equals("r")) {
                this.field_d.seek(0L);
                this.field_d.write(var5_int);
            }
            this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = new ba(9, 0, 4, 1);
        field_c = "BARRIER";
        field_i = new int[128];
        field_a = "Music: ";
        field_h = "Email: ";
        field_k = "Just play";
        field_f = "Highscores";
    }
}
