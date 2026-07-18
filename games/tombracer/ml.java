/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ml {
    private long field_d;
    static String field_c;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
              if (param0 >= 22) {
                break L1;
              } else {
                int discarded$2 = ml.a(80);
                break L1;
              }
            }
            L2: {
              var5_int = ((ml) this).field_a.read(param1, param3, param2);
              if (var5_int <= 0) {
                break L2;
              } else {
                ((ml) this).field_d = ((ml) this).field_d + (long)var5_int;
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
            stackOut_6_1 = new StringBuilder().append("ml.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param1 != 0) {
            return;
        }
        try {
            if (~((ml) this).field_b > ~((long)param2 - -((ml) this).field_d)) {
                ((ml) this).field_a.seek(((ml) this).field_b);
                ((ml) this).field_a.write(1);
                throw new EOFException();
            }
            ((ml) this).field_a.write(param3, param0, param2);
            ((ml) this).field_d = ((ml) this).field_d + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ml.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (((ml) this).field_a != null) {
            System.out.println("");
            ((ml) this).b((byte) -102);
        }
    }

    final void b(byte param0) throws IOException {
        if (((ml) this).field_a == null) {
          if (param0 > -62) {
            int discarded$4 = ml.a(-10);
            return;
          } else {
            return;
          }
        } else {
          ((ml) this).field_a.close();
          ((ml) this).field_a = null;
          if (param0 <= -62) {
            return;
          } else {
            int discarded$5 = ml.a(-10);
            return;
          }
        }
    }

    final static int a(int param0) {
        if (param0 < 37) {
            return -3;
        }
        return sja.field_i.length;
    }

    public static void a(byte param0) {
        field_c = null;
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            ((ml) this).field_b = 5L;
            return ((ml) this).field_a.length();
        }
        return ((ml) this).field_a.length();
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
          ((ml) this).field_b = 46L;
          ((ml) this).field_a.seek(param1);
          ((ml) this).field_d = param1;
          return;
        } else {
          ((ml) this).field_a.seek(param1);
          ((ml) this).field_d = param1;
          return;
        }
    }

    ml(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((ml) this).field_a = new RandomAccessFile(param0, param1);
            ((ml) this).field_d = 0L;
            ((ml) this).field_b = param2;
            var5_int = ((ml) this).field_a.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ml) this).field_a.seek(0L);
                    ((ml) this).field_a.write(var5_int);
                }
            }
            ((ml) this).field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ml.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Game full";
    }
}
