/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ao {
    static String[] field_f;
    static ew field_h;
    private long field_g;
    static hd field_a;
    static ut field_c;
    static int[] field_b;
    private RandomAccessFile field_j;
    static volatile int field_d;
    static int[][][] field_i;
    private long field_e;

    final void a(int param0, long param1) throws IOException {
        if (param0 != 15557) {
          field_h = null;
          ((ao) this).field_j.seek(param1);
          ((ao) this).field_e = param1;
          return;
        } else {
          ((ao) this).field_j.seek(param1);
          ((ao) this).field_e = param1;
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_h = null;
        field_f = null;
        if (param0 <= 111) {
            field_i = null;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 != 1) {
            return;
        }
        try {
            if (((ao) this).field_g < (long)param3 - -((ao) this).field_e) {
                ((ao) this).field_j.seek(((ao) this).field_g);
                ((ao) this).field_j.write(1);
                throw new EOFException();
            }
            ((ao) this).field_j.write(param1, param2, param3);
            ((ao) this).field_e = ((ao) this).field_e + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ao.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ao) this).field_j)) {
            System.out.println("");
            ((ao) this).a(-98);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
              var5_int = ((ao) this).field_j.read(param2, param3, param1);
              if (param0 == 33) {
                break L1;
              } else {
                ao.b(58);
                break L1;
              }
            }
            L2: {
              if (0 >= var5_int) {
                break L2;
              } else {
                ((ao) this).field_e = ((ao) this).field_e + (long)var5_int;
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
            stackOut_6_1 = new StringBuilder().append("ao.F(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final void a(int param0) throws IOException {
        int var2 = -76 / ((param0 - -38) / 60);
        if (!(null == ((ao) this).field_j)) {
            ((ao) this).field_j.close();
            ((ao) this).field_j = null;
        }
    }

    final static void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            return;
        }
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) lw.field_e);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lw.field_e);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) lw.field_e);
            field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ao.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final long c(int param0) throws IOException {
        if (param0 != 31114) {
            field_i = null;
            return ((ao) this).field_j.length();
        }
        return ((ao) this).field_j.length();
    }

    ao(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((ao) this).field_j = new RandomAccessFile(param0, param1);
            ((ao) this).field_g = param2;
            ((ao) this).field_e = 0L;
            var5_int = ((ao) this).field_j.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ao) this).field_j.seek(0L);
                    ((ao) this).field_j.write(var5_int);
                }
            }
            ((ao) this).field_j.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ao.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Modern Controls", "Oldschool Controls"};
        field_b = new int[6];
        field_d = 0;
        field_i = new int[33][33][33];
    }
}
