/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    private long field_g;
    private long field_f;
    static lc field_b;
    private RandomAccessFile field_h;
    static String field_d;
    static String field_a;
    static String field_c;
    static dk field_e;

    protected final void finalize() throws Throwable {
        if (null != ((ji) this).field_h) {
            System.out.println("");
            ((ji) this).b(0);
        }
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        try {
            if (param3) {
                ji.a(101);
            }
            if (((ji) this).field_f < ((ji) this).field_g + (long)param0) {
                ((ji) this).field_h.seek(((ji) this).field_f);
                ((ji) this).field_h.write(1);
                throw new EOFException();
            }
            ((ji) this).field_h.write(param1, param2, param0);
            ((ji) this).field_g = ((ji) this).field_g + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ji.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long a(byte param0) throws IOException {
        int var2 = -60 % ((32 - param0) / 41);
        return ((ji) this).field_h.length();
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
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
              var5_int = ((ji) this).field_h.read(param3, param1, param0);
              if (var5_int <= 0) {
                break L1;
              } else {
                ((ji) this).field_g = ((ji) this).field_g + (long)var5_int;
                break L1;
              }
            }
            if (param2 == 1) {
              stackOut_5_0 = var5_int;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 30;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ji.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, long param1) throws IOException {
        ((ji) this).field_h.seek(param1);
        ((ji) this).field_g = param1;
        int var4 = -46 % ((param0 - -3) / 59);
    }

    final void b(int param0) throws IOException {
        if (((ji) this).field_h == null) {
          if (param0 != 0) {
            ji.a(-9);
            return;
          } else {
            return;
          }
        } else {
          ((ji) this).field_h.close();
          ((ji) this).field_h = null;
          if (param0 == 0) {
            return;
          } else {
            ji.a(-9);
            return;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_a = null;
        if (param0 > -101) {
          var2 = null;
          String discarded$2 = ji.a(4, (CharSequence) null);
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(byte param0, int[] param1, int param2) {
        try {
            ag.field_j[param2] = param1;
            if (param0 >= -36) {
                field_b = null;
            }
            al.field_j[param2] = new oi(param2);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ji.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ji(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((ji) this).field_h = new RandomAccessFile(param0, param1);
            ((ji) this).field_f = param2;
            ((ji) this).field_g = 0L;
            var5_int = ((ji) this).field_h.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ji) this).field_h.seek(0L);
                    ((ji) this).field_h.write(var5_int);
                }
            }
            ((ji) this).field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ji.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
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
              if (param0 == 11) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              var2 = ci.a(jc.a(param1, (byte) -124), 75);
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("ji.D(").append(param0).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "<%0> is not on your friend list.";
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = new lc(11, 0, 1, 2);
    }
}
