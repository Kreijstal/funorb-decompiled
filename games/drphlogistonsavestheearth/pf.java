/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private long field_b;
    static he[] field_c;
    static long field_a;
    static int field_f;
    private long field_d;
    private RandomAccessFile field_e;

    final void c(int param0) throws IOException {
        if (null != ((pf) this).field_e) {
            ((pf) this).field_e.close();
            ((pf) this).field_e = null;
        }
        int var2 = 18 / ((40 - param0) / 47);
    }

    protected final void finalize() throws Throwable {
        if (!(((pf) this).field_e == null)) {
            System.out.println("");
            ((pf) this).c(90);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 1536) {
            pf.b(127);
        }
        ((pf) this).field_e.seek(param1);
        ((pf) this).field_d = param1;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = rh.a(-72, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 > var4.length()) {
                        break L1;
                      } else {
                        L2: {
                          if (je.a(var4.charAt(0), 89)) {
                            break L2;
                          } else {
                            if (je.a(var4.charAt(var4.length() - 1), 117)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (~var6 <= ~param2.length()) {
                                  if (var5 <= 0) {
                                    stackOut_31_0 = 1;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L0;
                                  } else {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    return stackIn_30_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (je.a((char) var7, 107)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 > var5) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return stackIn_26_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("pf.F(").append(1).append(',').append(false).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0 != 0;
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
              var5_int = ((pf) this).field_e.read(param0, param3, param1);
              if (~var5_int < param2) {
                ((pf) this).field_d = ((pf) this).field_d + (long)var5_int;
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
            stackOut_5_1 = new StringBuilder().append("pf.H(");
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
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 > -73) {
            boolean discarded$0 = pf.a((byte) 42);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (~(((pf) this).field_d + (long)param1) < ~((pf) this).field_b) {
            ((pf) this).field_e.seek(((pf) this).field_b);
            ((pf) this).field_e.write(1);
            throw new EOFException();
        }
        if (param0 > -82) {
            return;
        }
        try {
            ((pf) this).field_e.write(param3, param2, param1);
            ((pf) this).field_d = ((pf) this).field_d + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "pf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pf(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((pf) this).field_e = new RandomAccessFile(param0, param1);
            ((pf) this).field_b = param2;
            ((pf) this).field_d = 0L;
            var5_int = ((pf) this).field_e.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((pf) this).field_e.seek(0L);
                    ((pf) this).field_e.write(var5_int);
                }
            }
            ((pf) this).field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 97) {
            field_c = null;
        }
        return sh.field_e;
    }

    final long a(int param0) throws IOException {
        if (param0 >= -38) {
            return -62L;
        }
        return ((pf) this).field_e.length();
    }

    static {
    }
}
