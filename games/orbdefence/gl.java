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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ui.field_b = new pf(param3);
              ak.field_z = param1;
              df.field_d = param0;
              jm.b(-1178583839);
              if (!param2) {
                break L1;
              } else {
                gl.c(74);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gl.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
        try {
            int var5_int = 5 / ((65 - param1) / 60);
            if (!(~(((gl) this).field_g + (long)param2) >= ~((gl) this).field_e)) {
                ((gl) this).field_d.seek(((gl) this).field_e);
                ((gl) this).field_d.write(1);
                throw new EOFException();
            }
            ((gl) this).field_d.write(param3, param0, param2);
            ((gl) this).field_g = ((gl) this).field_g + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gl.G(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((gl) this).field_d.read(param3, param0, param1);
              if (var5_int <= 0) {
                break L1;
              } else {
                ((gl) this).field_g = ((gl) this).field_g + (long)var5_int;
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
            stackOut_4_0 = var5_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("gl.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
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
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((gl) this).field_d = new RandomAccessFile(param0, param1);
            ((gl) this).field_e = param2;
            ((gl) this).field_g = 0L;
            var5_int = ((gl) this).field_d.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((gl) this).field_d.seek(0L);
                    ((gl) this).field_d.write(var5_int);
                }
            }
            ((gl) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
