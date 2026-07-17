/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb {
    static int field_f;
    private long field_e;
    static byte[] field_b;
    static ae field_d;
    static long field_a;
    private long field_g;
    private RandomAccessFile field_h;
    static ue field_c;

    final static byte[] a(String param0) {
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
            stackOut_2_0 = ri.field_c.a("", (byte) -128, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("cb.C(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -124 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, long param1) throws IOException {
        ((cb) this).field_h.seek(param1);
        if (param0 != 0) {
            cb.b(17);
        }
        ((cb) this).field_e = param1;
    }

    final long c(int param0) throws IOException {
        int var2 = -109 % ((44 - param0) / 55);
        return ((cb) this).field_h.length();
    }

    final void a(int param0) throws IOException {
        if (null != ((cb) this).field_h) {
            ((cb) this).field_h.close();
            ((cb) this).field_h = null;
        }
        if (param0 != 1) {
            String discarded$0 = cb.b(false);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        try {
            if (param2 != 494) {
                field_b = null;
            }
            if (!(((cb) this).field_g >= (long)param3 + ((cb) this).field_e)) {
                ((cb) this).field_h.seek(((cb) this).field_g);
                ((cb) this).field_h.write(1);
                throw new EOFException();
            }
            ((cb) this).field_h.write(param1, param0, param3);
            ((cb) this).field_e = ((cb) this).field_e + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cb.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
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
              if (param3 <= -72) {
                break L1;
              } else {
                cb.a((byte) 54);
                break L1;
              }
            }
            L2: {
              var5_int = ((cb) this).field_h.read(param0, param1, param2);
              if (var5_int <= 0) {
                break L2;
              } else {
                ((cb) this).field_e = ((cb) this).field_e + (long)var5_int;
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
            stackOut_6_1 = new StringBuilder().append("cb.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        oj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ia var12 = null;
        int var13 = 0;
        int var14 = 0;
        ia var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var12 = se.field_p;
            var15 = var12;
            var2 = var15.j(7909);
            var3 = (oj) (Object) uc.field_b.c(-3905);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_i == var2) {
                    break L2;
                  } else {
                    var3 = (oj) (Object) uc.field_b.a(-16913);
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  if (param0 <= -93) {
                    break L3;
                  } else {
                    String discarded$4 = cb.b(false);
                    break L3;
                  }
                }
                L4: {
                  var4 = var15.j(7909);
                  if (0 != var4) {
                    var5 = var3.field_h;
                    ef.field_f[0] = we.field_i;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        ai.a(var5, false, var4);
                        var6_int = 0;
                        L6: while (true) {
                          if (var4 <= var6_int) {
                            kk.a(var5, 42);
                            var6 = new String[2][var5];
                            var19 = new int[2][var5 * 4];
                            var8 = ed.field_p;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var8 > var13) {
                                    L9: {
                                      var11 = jk.field_c[var13 + var5];
                                      var6[1][var14] = ef.field_f[var11];
                                      var19[1][4 * var14] = tk.field_f[var11];
                                      var19[1][1 + 4 * var14] = nf.field_b[var11];
                                      var19[1][2 + 4 * var14] = gj.field_f[var11];
                                      var19[1][4 * var14 - -3] = ab.field_G[var11];
                                      int discarded$5 = 0;
                                      if (!mc.a(ef.field_f[var11])) {
                                        break L9;
                                      } else {
                                        if (nf.field_b[var11] + gj.field_f[var11] - -ab.field_G[var11] != 0) {
                                          break L9;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        }
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L8;
                                  } else {
                                    var3.b(4);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = jk.field_c[var9];
                                  var6[0][var10] = ef.field_f[var11];
                                  var19[0][var10 * 4] = tk.field_f[var11];
                                  var19[0][1 + var10 * 4] = nf.field_b[var11];
                                  var19[0][2 + 4 * var10] = gj.field_f[var11];
                                  var19[0][4 * var10 - -3] = ab.field_G[var11];
                                  int discarded$6 = 0;
                                  if (mc.a(ef.field_f[var11])) {
                                    if (0 == nf.field_b[var11] + (gj.field_f[var11] - -ab.field_G[var11])) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              o.a(-20954, (rb) (Object) var15);
                              if (var6_int != 0) {
                                fa.a(mc.field_f, var6_int, og.field_f, rb.field_i, ta.field_e, -106);
                                break L11;
                              } else {
                                fa.a(mc.field_f, var6_int, og.field_f, rb.field_i, ta.field_e, 12);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        ef.field_f[var6_int] = var12.a(-103);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.b(4);
                    break L4;
                  }
                }
                break L0;
              } else {
                int discarded$7 = 27;
                ec.a();
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "cb.H(" + param0 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static String b(boolean param0) {
        if (we.field_i == null) {
            return "";
        }
        if (!param0) {
            field_c = null;
        }
        return we.field_i;
    }

    protected final void finalize() throws Throwable {
        if (null != ((cb) this).field_h) {
            System.out.println("");
            ((cb) this).a(1);
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            boolean discarded$0 = cb.a(true);
        }
        return nd.b(true);
    }

    cb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((cb) this).field_h = new RandomAccessFile(param0, param1);
            ((cb) this).field_g = param2;
            ((cb) this).field_e = 0L;
            var5_int = ((cb) this).field_h.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((cb) this).field_h.seek(0L);
                    ((cb) this).field_h.write(var5_int);
                }
            }
            ((cb) this).field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[520];
        field_d = new ae();
    }
}
