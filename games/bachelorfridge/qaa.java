/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qaa {
    static int field_c;
    static String field_a;
    private RandomAccessFile field_b;
    static sna field_d;
    static int[] field_e;
    private long field_f;
    private long field_g;

    final long a(byte param0) throws IOException {
        if (param0 != 24) {
            qaa.b(true);
            return ((qaa) this).field_b.length();
        }
        return ((qaa) this).field_b.length();
    }

    final void a(long param0, boolean param1) throws IOException {
        ((qaa) this).field_b.seek(param0);
        ((qaa) this).field_f = param0;
        if (param1) {
            field_e = null;
            return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((qaa) this).field_b.read(param0, param2, param1);
              if (param3 < var5_int) {
                ((qaa) this).field_f = ((qaa) this).field_f + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = var5_int;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("qaa.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        try {
            if (!(~((qaa) this).field_g <= ~(((qaa) this).field_f + (long)param1))) {
                ((qaa) this).field_b.seek(((qaa) this).field_g);
                ((qaa) this).field_b.write(1);
                throw new EOFException();
            }
            if (param3 <= 56) {
                qaa.b(false);
            }
            ((qaa) this).field_b.write(param2, param0, param1);
            ((qaa) this).field_f = ((qaa) this).field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qaa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        if (param0) {
            field_a = null;
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (((qaa) this).field_b != null) {
            System.out.println("");
            ((qaa) this).a(true);
        }
    }

    final static kv[] a(int param0, int param1) {
        kv[] var2 = null;
        kv[] var3 = null;
        var3 = new kv[9];
        var2 = var3;
        if (param1 > -13) {
          return null;
        } else {
          var3[4] = ik.b(64, param0, 2);
          return var2;
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        if (!(((qaa) this).field_b == null)) {
            ((qaa) this).field_b.close();
            ((qaa) this).field_b = null;
        }
    }

    qaa(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((qaa) this).field_b = new RandomAccessFile(param0, param1);
            ((qaa) this).field_g = param2;
            ((qaa) this).field_f = 0L;
            var5_int = ((qaa) this).field_b.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((qaa) this).field_b.seek(0L);
                    ((qaa) this).field_b.write(var5_int);
                }
            }
            ((qaa) this).field_b.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qaa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter multiplayer lobby";
    }
}
