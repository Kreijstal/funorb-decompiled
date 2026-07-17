/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wk {
    private long field_c;
    static long field_d;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
              var5_int = ((wk) this).field_a.read(param1, param2, param0);
              if (~var5_int < param3) {
                ((wk) this).field_b = ((wk) this).field_b + (long)var5_int;
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
            stackOut_5_1 = new StringBuilder().append("wk.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
            return;
        }
        if (param0 > -88) {
            return;
        }
        if (param1 % 10L != 0L) {
            ie.a((byte) 10, param1);
        } else {
            ie.a((byte) 10, param1 + -1L);
            ie.a((byte) 10, 1L);
            return;
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param3.length();
              if (param1 > 11) {
                break L1;
              } else {
                wk.a(false);
                break L1;
              }
            }
            L2: {
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 == 0) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (var10 < 0) {
                StringBuilder discarded$3 = var8.append(param2.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$5 = var8.append(param3);
                var9 = var10 - -1;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("wk.B(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
    }

    final long a(int param0) throws IOException {
        if (param0 != 11311) {
            return 27L;
        }
        return ((wk) this).field_a.length();
    }

    protected final void finalize() throws Throwable {
        if (!(((wk) this).field_a == null)) {
            System.out.println("");
            ((wk) this).a((byte) 87);
        }
    }

    final static boolean b(byte param0) {
        if (null == cb.field_j) {
            return false;
        }
        if (!ra.field_b.c(0)) {
            return false;
        }
        return true;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            return;
        }
        ((wk) this).field_a.seek(param0);
        ((wk) this).field_b = param0;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Main.field_T;
        try {
          L0: {
            if (!ia.a((byte) -79)) {
              L1: {
                if (null == gj.field_a) {
                  break L1;
                } else {
                  if (gj.field_a.field_b) {
                    ga.a(true);
                    s.field_d.b((lk) (Object) new ol(s.field_d, tk.field_b), (byte) -15);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$7 = s.field_d.a((byte) -116, hk.field_b, e.field_c, true);
              s.field_d.l(-2054);
              L2: while (true) {
                if (!ge.b((byte) -114)) {
                  break L0;
                } else {
                  boolean discarded$8 = s.field_d.a(fd.field_n, 34, tb.field_d);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "wk.H(" + 0 + 41);
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param2 != 0) {
            return;
        }
        try {
            if (!(((wk) this).field_b + (long)param3 <= ((wk) this).field_c)) {
                ((wk) this).field_a.seek(((wk) this).field_c);
                ((wk) this).field_a.write(1);
                throw new EOFException();
            }
            ((wk) this).field_a.write(param1, param0, param3);
            ((wk) this).field_b = ((wk) this).field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "wk.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0) throws IOException {
        if (null == ((wk) this).field_a) {
          if (param0 > 9) {
            return;
          } else {
            wk.a((byte) -90, 9L);
            return;
          }
        } else {
          ((wk) this).field_a.close();
          ((wk) this).field_a = null;
          if (param0 > 9) {
            return;
          } else {
            wk.a((byte) -90, 9L);
            return;
          }
        }
    }

    wk(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((wk) this).field_a = new RandomAccessFile(param0, param1);
            ((wk) this).field_b = 0L;
            ((wk) this).field_c = param2;
            var5_int = ((wk) this).field_a.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((wk) this).field_a.seek(0L);
                    ((wk) this).field_a.write(var5_int);
                }
            }
            ((wk) this).field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "wk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
