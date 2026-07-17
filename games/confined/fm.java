/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fm {
    private RandomAccessFile field_e;
    static ej field_a;
    private long field_d;
    private long field_c;
    static int field_b;

    final long a(byte param0) throws IOException {
        if (param0 != -115) {
            fm.a(-61, -87);
            return ((fm) this).field_e.length();
        }
        return ((fm) this).field_e.length();
    }

    final static void a(int param0, int param1) {
        hb var2 = vh.field_a;
        var2.b(true, param1);
        var2.f(87, 1);
        var2.f(115, 2);
        int var3 = 61 / ((param0 - 61) / 46);
    }

    final void a(int param0, long param1) throws IOException {
        ((fm) this).field_e.seek(param1);
        int var4 = -33 / ((47 - param0) / 50);
        ((fm) this).field_c = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (~(((fm) this).field_c + (long)param1) < ~((fm) this).field_d) {
            ((fm) this).field_e.seek(((fm) this).field_d);
            ((fm) this).field_e.write(1);
            throw new EOFException();
        }
        ((fm) this).field_e.write(param2, param3, param1);
        if (param0 != -20832) {
            return;
        }
        try {
            ((fm) this).field_c = ((fm) this).field_c + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fm.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((fm) this).field_e)) {
            System.out.println("");
            ((fm) this).b(0);
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 0) {
          L0: {
            ((fm) this).field_e = null;
            if (((fm) this).field_e != null) {
              ((fm) this).field_e.close();
              ((fm) this).field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((fm) this).field_e != null) {
              ((fm) this).field_e.close();
              ((fm) this).field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
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
              if (!param0) {
                break L1;
              } else {
                fm.a(53);
                break L1;
              }
            }
            L2: {
              var5_int = ((fm) this).field_e.read(param1, param2, param3);
              if (var5_int <= 0) {
                break L2;
              } else {
                ((fm) this).field_c = ((fm) this).field_c + (long)var5_int;
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
            stackOut_6_1 = new StringBuilder().append("fm.B(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    fm(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((fm) this).field_e = new RandomAccessFile(param0, param1);
            ((fm) this).field_c = 0L;
            ((fm) this).field_d = param2;
            var5_int = ((fm) this).field_e.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((fm) this).field_e.seek(0L);
                    ((fm) this).field_e.write(var5_int);
                }
            }
            ((fm) this).field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ej();
    }
}
