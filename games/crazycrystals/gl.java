/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gl {
    static int field_j;
    private long field_g;
    static int[] field_d;
    static int field_e;
    static String field_l;
    static boolean field_c;
    private long field_k;
    static char[] field_a;
    private RandomAccessFile field_b;
    static String field_f;
    static long field_i;
    static wa field_h;

    final long a(int param0) throws IOException {
        if (param0 != 48) {
            return 29L;
        }
        return ((gl) this).field_b.length();
    }

    final static void b(int param0) {
        Object var2 = null;
        da.a("", 79, (String) null);
        int var1 = 2 / ((1 - param0) / 38);
    }

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -11) {
          if (hp.field_s >= 10) {
            if (field_c) {
              return false;
            } else {
              L0: {
                if (of.a(param0 + 11)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          gl.b(-7);
          if (hp.field_s >= 10) {
            if (field_c) {
              return false;
            } else {
              L1: {
                if (of.a(param0 + 11)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((gl) this).field_b.read(param0, param1, param2);
              if (param3 <= -57) {
                break L1;
              } else {
                field_e = -58;
                break L1;
              }
            }
            L2: {
              if (var5_int > 0) {
                ((gl) this).field_k = ((gl) this).field_k + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gl.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    gl(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((gl) this).field_b = new RandomAccessFile(param0, param1);
            ((gl) this).field_g = param2;
            ((gl) this).field_k = 0L;
            var5_int = ((gl) this).field_b.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((gl) this).field_b.seek(0L);
                    ((gl) this).field_b.write(var5_int);
                }
            }
            ((gl) this).field_b.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 >= -86) {
          field_l = null;
          ((gl) this).field_b.seek(param0);
          ((gl) this).field_k = param0;
          return;
        } else {
          ((gl) this).field_b.seek(param0);
          ((gl) this).field_k = param0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
            if (!(~((gl) this).field_g <= ~(((gl) this).field_k + (long)param2))) {
                ((gl) this).field_b.seek(((gl) this).field_g);
                ((gl) this).field_b.write(1);
                throw new EOFException();
            }
            if (param0 != 120) {
                field_c = true;
            }
            ((gl) this).field_b.write(param3, param1, param2);
            ((gl) this).field_k = ((gl) this).field_k + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "gl.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    protected final void finalize() throws Throwable {
        if (((gl) this).field_b != null) {
            System.out.println("");
            ((gl) this).d(89);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_l = null;
    }

    final void d(int param0) throws IOException {
        if (!(null == ((gl) this).field_b)) {
            ((gl) this).field_b.close();
            ((gl) this).field_b = null;
        }
        if (param0 < 85) {
            gl.b(-69);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 5;
        field_d = new int[8192];
        field_a = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_f = "Backspace";
        field_l = "Unpacking sound effects";
        field_h = null;
        field_c = true;
    }
}
