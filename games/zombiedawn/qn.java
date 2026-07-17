/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qn {
    private RandomAccessFile field_c;
    static boolean field_j;
    private long field_d;
    private long field_f;
    static vn[] field_k;
    static vn field_g;
    static dj field_i;
    static boolean field_h;
    static int field_e;
    static String field_a;
    static int field_b;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                field_b = -108;
                break L1;
              }
            }
            stackOut_2_0 = tb.field_K.a(param0, param1 + -85, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qn.C(");
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(byte param0, long param1) throws IOException {
        if (param0 > -63) {
          field_k = null;
          ((qn) this).field_c.seek(param1);
          ((qn) this).field_f = param1;
          return;
        } else {
          ((qn) this).field_c.seek(param1);
          ((qn) this).field_f = param1;
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (((qn) this).field_c != null) {
            System.out.println("");
            ((qn) this).c(-100);
        }
    }

    qn(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((qn) this).field_c = new RandomAccessFile(param0, param1);
            ((qn) this).field_d = param2;
            ((qn) this).field_f = 0L;
            var5_int = ((qn) this).field_c.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((qn) this).field_c.seek(0L);
                    ((qn) this).field_c.write(var5_int);
                }
            }
            ((qn) this).field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void c(int param0) throws IOException {
        if (null == ((qn) this).field_c) {
          if (param0 >= -68) {
            field_h = true;
            return;
          } else {
            return;
          }
        } else {
          ((qn) this).field_c.close();
          ((qn) this).field_c = null;
          if (param0 < -68) {
            return;
          } else {
            field_h = true;
            return;
          }
        }
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (param3 <= -63) {
                break L1;
              } else {
                var6 = null;
                byte[] discarded$2 = qn.a((String) null, -105);
                break L1;
              }
            }
            L2: {
              var5_int = ((qn) this).field_c.read(param1, param0, param2);
              if (0 >= var5_int) {
                break L2;
              } else {
                ((qn) this).field_f = ((qn) this).field_f + (long)var5_int;
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
            stackOut_6_1 = new StringBuilder().append("qn.G(").append(param0).append(44);
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
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_g = null;
        field_k = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
            if (param0 != 0) {
                field_g = null;
            }
            if (!(~((long)param1 - -((qn) this).field_f) >= ~((qn) this).field_d)) {
                ((qn) this).field_c.seek(((qn) this).field_d);
                ((qn) this).field_c.write(1);
                throw new EOFException();
            }
            ((qn) this).field_c.write(param2, param3, param1);
            ((qn) this).field_f = ((qn) this).field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qn.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final long b(int param0) throws IOException {
        int var2 = 106 % ((param0 - 30) / 37);
        return ((qn) this).field_c.length();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_h = true;
        field_g = new vn(300, 200);
        field_b = 0;
        field_a = "Email: ";
    }
}
