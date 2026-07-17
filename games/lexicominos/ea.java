/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea {
    static int field_b;
    static int field_d;
    private long field_e;
    private long field_a;
    private RandomAccessFile field_c;

    final long a(int param0) throws IOException {
        if (param0 >= -2) {
            return -41L;
        }
        return ((ea) this).field_c.length();
    }

    final void a(byte param0, long param1) throws IOException {
        Object var5 = null;
        ((ea) this).field_c.seek(param1);
        ((ea) this).field_a = param1;
        if (param0 != -55) {
          var5 = null;
          String discarded$2 = ea.a((CharSequence) null, 115);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
            if (param0 != 1) {
                ((ea) this).field_e = 104L;
            }
            if (~((ea) this).field_e > ~(((ea) this).field_a + (long)param3)) {
                ((ea) this).field_c.seek(((ea) this).field_e);
                ((ea) this).field_c.write(1);
                throw new EOFException();
            }
            ((ea) this).field_c.write(param2, param1, param3);
            ((ea) this).field_a = ((ea) this).field_a + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ea.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final int a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 6 % ((param2 - 74) / 34);
              var6 = ((ea) this).field_c.read(param3, param1, param0);
              if (var6 <= 0) {
                break L1;
              } else {
                ((ea) this).field_a = ((ea) this).field_a + (long)var6;
                break L1;
              }
            }
            stackOut_2_0 = var6;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ea.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int a(byte param0) {
        nh.field_a.d(72);
        if (kb.field_b.a((byte) 80)) {
            return 0;
        }
        return pc.e(0);
    }

    final void a(boolean param0) throws IOException {
        Object var3 = null;
        if (!param0) {
          L0: {
            var3 = null;
            String discarded$8 = ea.a((CharSequence) null, -68);
            if (((ea) this).field_c != null) {
              ((ea) this).field_c.close();
              ((ea) this).field_c = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ea) this).field_c != null) {
              ((ea) this).field_c.close();
              ((ea) this).field_c = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_b = 98;
                break L1;
              }
            }
            stackOut_2_0 = wd.a(false, param0, (byte) -101);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ea.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ea(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((ea) this).field_c = new RandomAccessFile(param0, param1);
            ((ea) this).field_e = param2;
            ((ea) this).field_a = 0L;
            var5_int = ((ea) this).field_c.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ea) this).field_c.seek(0L);
                    ((ea) this).field_c.write(var5_int);
                }
            }
            ((ea) this).field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ea.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ea) this).field_c)) {
            System.out.println("");
            ((ea) this).a(true);
        }
    }

    static {
    }
}
