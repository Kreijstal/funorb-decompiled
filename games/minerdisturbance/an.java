/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class an {
    static int[] field_a;
    static int field_f;
    static boolean field_d;
    private RandomAccessFile field_e;
    static String field_g;
    static int field_h;
    private long field_c;
    private long field_b;

    final int b(int param0, int param1, byte[] param2, int param3) throws IOException {
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
              var5_int = 17 / ((param0 - -73) / 36);
              var6 = ((an) this).field_e.read(param2, param3, param1);
              if (var6 <= 0) {
                break L1;
              } else {
                ((an) this).field_b = ((an) this).field_b + (long)var6;
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
            stackOut_4_1 = new StringBuilder().append("an.B(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
            field_d = false;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a() {
        rj.field_c = 20000000L;
        int var2 = 1;
    }

    final static pe a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        pe var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        pe stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if (null != tc.field_o) {
            L0: {
              var2_int = -65 / ((-21 - param0) / 63);
              var7 = (CharSequence) (Object) param1;
              var3 = (Object) (Object) cl.a(-95, var7);
              if (var3 != null) {
                break L0;
              } else {
                var3 = (Object) (Object) var7;
                break L0;
              }
            }
            var4 = (pe) (Object) tc.field_o.a(-7895, (long)((String) var3).hashCode());
            L1: while (true) {
              if (var4 != null) {
                L2: {
                  var8 = (CharSequence) (Object) var4.field_ob;
                  var5 = cl.a(-95, var8);
                  if (var5 == null) {
                    var5 = var4.field_ob;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var5.equals(var3)) {
                  stackOut_14_0 = (pe) var4;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var4 = (pe) (Object) tc.field_o.c(1);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("an.I(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 48) {
            return -46L;
        }
        return ((an) this).field_e.length();
    }

    protected final void finalize() throws Throwable {
        if (!(((an) this).field_e == null)) {
            System.out.println("");
            ((an) this).b(-121);
        }
    }

    final static boolean c() {
        if (ij.field_o == null) {
            return false;
        }
        if (!ij.field_o.d(-127)) {
            return false;
        }
        return true;
    }

    final void a(int param0, long param1) throws IOException {
        ((an) this).field_e.seek(param1);
        if (param0 != 0) {
            return;
        }
        ((an) this).field_b = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (~(((an) this).field_b + (long)param1) < ~((an) this).field_c) {
            ((an) this).field_e.seek(((an) this).field_c);
            ((an) this).field_e.write(1);
            throw new EOFException();
        }
        if (param3 <= 79) {
            return;
        }
        try {
            ((an) this).field_e.write(param2, param0, param1);
            ((an) this).field_b = ((an) this).field_b + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "an.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    an(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((an) this).field_e = new RandomAccessFile(param0, param1);
            ((an) this).field_c = param2;
            ((an) this).field_b = 0L;
            var5_int = ((an) this).field_e.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((an) this).field_e.seek(0L);
                    ((an) this).field_e.write(var5_int);
                }
            }
            ((an) this).field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "an.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void b(int param0) throws IOException {
        Object var3 = null;
        L0: {
          if (((an) this).field_e != null) {
            ((an) this).field_e.close();
            ((an) this).field_e = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -98) {
          var3 = null;
          pe discarded$2 = an.a((byte) 1, (String) null);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_g = "ESCAPED: <times> 2";
    }
}
