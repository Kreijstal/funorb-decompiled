/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    private long field_e;
    static boolean field_b;
    private long field_d;
    private RandomAccessFile field_c;
    static int field_a;

    final void a(long param0, byte param1) throws IOException {
        Object var5 = null;
        if (param1 != -24) {
          var5 = null;
          boolean discarded$2 = ri.a((byte) -93, (String) null);
          ((ri) this).field_c.seek(param0);
          ((ri) this).field_d = param0;
          return;
        } else {
          ((ri) this).field_c.seek(param0);
          ((ri) this).field_d = param0;
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        try {
            if (~((ri) this).field_e > ~(((ri) this).field_d + (long)param0)) {
                ((ri) this).field_c.seek(((ri) this).field_e);
                ((ri) this).field_c.write(1);
                throw new EOFException();
            }
            ((ri) this).field_c.write(param1, param3, param0);
            if (!param2) {
                ((ri) this).field_c = null;
            }
            ((ri) this).field_d = ((ri) this).field_d + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ri.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 4836) {
              L1: {
                var5_int = ((ri) this).field_c.read(param0, param2, param3);
                if (var5_int > 0) {
                  ((ri) this).field_d = ((ri) this).field_d + (long)var5_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -82;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ri.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final long b(int param0) throws IOException {
        if (param0 != 0) {
            boolean discarded$0 = ri.c(97);
            return ((ri) this).field_c.length();
        }
        return ((ri) this).field_c.length();
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                if (param0 == -56) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var5 = null;
                  boolean discarded$2 = ri.a((byte) -90, (String) null);
                  return false;
                }
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (f.a((char) var3, true)) {
                    break L2;
                  } else {
                    if (vl.a((char) var3, -5717)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ri.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    protected final void finalize() throws Throwable {
        if (null != ((ri) this).field_c) {
            System.out.println("");
            ((ri) this).a(-1);
        }
    }

    final void a(int param0) throws IOException {
        if (null == ((ri) this).field_c) {
          if (param0 != -1) {
            ((ri) this).field_d = 71L;
            return;
          } else {
            return;
          }
        } else {
          ((ri) this).field_c.close();
          ((ri) this).field_c = null;
          if (param0 == -1) {
            return;
          } else {
            ((ri) this).field_d = 71L;
            return;
          }
        }
    }

    ri(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((ri) this).field_c = new RandomAccessFile(param0, param1);
            ((ri) this).field_e = param2;
            ((ri) this).field_d = 0L;
            var5_int = ((ri) this).field_c.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ri) this).field_c.seek(0L);
                    ((ri) this).field_c.write(var5_int);
                }
            }
            ((ri) this).field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ri.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(nj param0, int param1, byte param2) {
        mg var3 = null;
        try {
            var3 = n.field_b;
            var3.c((byte) 113, param1);
            var3.b((byte) 11, 5);
            var3.b((byte) 11, 0);
            var3.b(-1947079288, param0.field_l);
            var3.b((byte) 11, param0.field_j);
            var3.b((byte) 11, param0.field_o);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ri.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 121 + 41);
        }
    }

    final static boolean c(int param0) {
        if (param0 < 18) {
            return false;
        }
        return ib.a((byte) 46, jg.f(1));
    }

    static {
    }
}
