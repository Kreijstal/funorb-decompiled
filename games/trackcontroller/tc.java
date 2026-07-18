/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tc {
    private RandomAccessFile field_d;
    private long field_a;
    static String field_e;
    static int field_b;
    private long field_c;

    final void a(int param0) throws IOException {
        if (param0 != -31576) {
            return;
        }
        if (((tc) this).field_d != null) {
            ((tc) this).field_d.close();
            ((tc) this).field_d = null;
            return;
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 >= -78) {
            tc.b((byte) -126);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 != 0) {
            return;
        }
        try {
            if (~((long)param1 + ((tc) this).field_c) < ~((tc) this).field_a) {
                ((tc) this).field_d.seek(((tc) this).field_a);
                ((tc) this).field_d.write(1);
                throw new EOFException();
            }
            ((tc) this).field_d.write(param3, param2, param1);
            ((tc) this).field_c = ((tc) this).field_c + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "tc.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 != null) {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        eb.field_i = (int)(var3.longValue() / 1048576L) - -1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 >= 5) {
                  break L0;
                } else {
                  tc.c((byte) 29);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
              var5_int = ((tc) this).field_d.read(param0, param2, param3);
              if (param1 == 74) {
                break L1;
              } else {
                ((tc) this).field_c = -18L;
                break L1;
              }
            }
            L2: {
              if (0 < var5_int) {
                ((tc) this).field_c = ((tc) this).field_c + (long)var5_int;
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
            stackOut_7_1 = new StringBuilder().append("tc.D(");
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
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    protected final void finalize() throws Throwable {
        if (!(((tc) this).field_d == null)) {
            System.out.println("");
            ((tc) this).a(-31576);
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 < 118) {
            tc.c((byte) -25);
            return ((tc) this).field_d.length();
        }
        return ((tc) this).field_d.length();
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, long param1) throws IOException {
        ((tc) this).field_d.seek(param1);
        ((tc) this).field_c = param1;
        if (!param0) {
            field_e = null;
            return;
        }
    }

    tc(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((tc) this).field_d = new RandomAccessFile(param0, param1);
            ((tc) this).field_a = param2;
            ((tc) this).field_c = 0L;
            var5_int = ((tc) this).field_d.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((tc) this).field_d.seek(0L);
                    ((tc) this).field_d.write(var5_int);
                }
            }
            ((tc) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_e = "Level right first time: doubled to ";
    }
}
