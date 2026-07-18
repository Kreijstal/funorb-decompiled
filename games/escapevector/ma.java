/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ma {
    static int[] field_c;
    static long field_g;
    static wb field_b;
    private RandomAccessFile field_e;
    private long field_d;
    private long field_f;
    static oe field_a;

    final long c(int param0) throws IOException {
        if (param0 != -26510) {
            field_a = null;
            return ((ma) this).field_e.length();
        }
        return ((ma) this).field_e.length();
    }

    final static void a(int param0, int param1, fd param2, int param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
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
              if (param0 == 25398) {
                break L1;
              } else {
                var5 = null;
                ma.a(-36, 48, (fd) null, -113);
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
            stackOut_3_1 = new StringBuilder().append("ma.G(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
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
              if (param1 > 124) {
                break L1;
              } else {
                ma.b(103);
                break L1;
              }
            }
            L2: {
              var5_int = ((ma) this).field_e.read(param2, param3, param0);
              if (var5_int > 0) {
                ((ma) this).field_d = ((ma) this).field_d + (long)var5_int;
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
            stackOut_7_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 1) {
          ((ma) this).field_d = -21L;
          ((ma) this).field_e.seek(param0);
          ((ma) this).field_d = param0;
          return;
        } else {
          ((ma) this).field_e.seek(param0);
          ((ma) this).field_d = param0;
          return;
        }
    }

    final static oc a(int param0, boolean param1, int param2) {
        oc var3 = new oc(param0);
        var3.field_q = param1 ? true : false;
        return var3;
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          var2 = null;
          ma.a(-114, -57, (fd) null, 13);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static ee[] a(boolean param0) {
        return new ee[]{kf.field_q, oh.field_n, qj.field_g};
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (param3 != -15814) {
                field_c = null;
            }
            if (((ma) this).field_f < ((ma) this).field_d + (long)param1) {
                ((ma) this).field_e.seek(((ma) this).field_f);
                ((ma) this).field_e.write(1);
                throw new EOFException();
            }
            ((ma) this).field_e.write(param0, param2, param1);
            ((ma) this).field_d = ((ma) this).field_d + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, ll param2) {
        c var3 = om.field_c;
        var3.a(2, true);
        var3.f(param2.field_g, -123);
        if (param0 >= -42) {
            return;
        }
        try {
            var3.h(75, param2.field_i);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ma.C(" + param0 + ',' + 2 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(null == ((ma) this).field_e)) {
            ((ma) this).field_e.close();
            ((ma) this).field_e = null;
        }
    }

    ma(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((ma) this).field_e = new RandomAccessFile(param0, param1);
            ((ma) this).field_f = param2;
            ((ma) this).field_d = 0L;
            var5_int = ((ma) this).field_e.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ma) this).field_e.seek(0L);
                    ((ma) this).field_e.write(var5_int);
                }
            }
            ((ma) this).field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null != ((ma) this).field_e) {
            System.out.println("");
            ((ma) this).a(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{5, 11, 8};
    }
}
