/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa extends uf {
    static String field_t;
    static String field_u;
    private int field_y;
    static int[][][] field_v;
    static boolean[][] field_s;
    static int[] field_z;
    static int field_x;
    private ed field_w;

    pa(int param0) {
        super(param0);
    }

    final void m(int param0) {
        ((pa) this).field_q = (((pa) this).field_y + 7) / param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param0 == -25038) {
                break L1;
              } else {
                pa.n(-36);
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((pa) this).field_q;
                ((pa) this).field_q = ((pa) this).field_q + 1;
                param3[var5_int + param2] = (byte)(((pa) this).field_m[fieldTemp$5] + -((pa) this).field_w.d(126));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("pa.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            e.field_i = param0;
            try {
                var3 = param2.getParameter("cookieprefix");
                var4 = param2.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!(param0.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                int discarded$0 = 1;
                ff.a(param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            ok.a(param2, -1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ka[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              gi.field_f = param1;
              if (null == gi.field_f) {
                break L1;
              } else {
                if (3 > param1.length) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pa.D(").append(-99).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void n(int param0) {
        field_z = null;
        if (param0 != 6) {
            return;
        }
        field_t = null;
        field_s = null;
        field_u = null;
        field_v = null;
    }

    final int o(int param0) {
        if (param0 != 11650) {
            ((pa) this).m(-112);
        }
        int fieldTemp$0 = ((pa) this).field_q;
        ((pa) this).field_q = ((pa) this).field_q + 1;
        return ((pa) this).field_m[fieldTemp$0] - ((pa) this).field_w.d(-102) & 255;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((pa) this).field_q;
        ((pa) this).field_q = ((pa) this).field_q + 1;
        ((pa) this).field_m[fieldTemp$0] = (byte)(param1 + ((pa) this).field_w.d(127));
        if (param0 != 25) {
            field_z = null;
        }
    }

    final void l(int param0) {
        ((pa) this).field_y = param0 * ((pa) this).field_q;
    }

    final int e(int param0, int param1) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        int var3 = ((pa) this).field_y >> 3;
        int var4 = -(7 & ((pa) this).field_y) + 8;
        int var6 = -20 % ((param1 - 57) / 37);
        int var5 = 0;
        ((pa) this).field_y = ((pa) this).field_y + param0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((pa) this).field_m[incrementValue$0] & ah.field_e[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((pa) this).field_m[var3] >> -param0 + var4 & ah.field_e[param0]);
        } else {
            var5 = var5 + (((pa) this).field_m[var3] & ah.field_e[var4]);
        }
        return var5;
    }

    pa(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int[] param1) {
        try {
            if (param0 != 61) {
                field_u = null;
            }
            ((pa) this).field_w = new ed(param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "pa.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void f() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != gb.field_d) {
                    gb.field_d.a(-19315);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (gi.field_a == null) {
                    break L2;
                  } else {
                    gi.field_a.a(4);
                    break L2;
                  }
                }
                L3: {
                  if (null != jj.field_b) {
                    {
                      L4: {
                        jj.field_b.a((byte) -57);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null != ij.field_y) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= ij.field_y.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null != ij.field_y[var1_int]) {
                            {
                              L9: {
                                ij.field_y[var1_int].a((byte) -57);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw oj.a((Throwable) (Object) var1, "pa.H(" + 109 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Unfortunately you are not eligible to create an account.";
        field_t = "Player Name: ";
        field_s = new boolean[3][6];
        field_v = new int[][][]{new int[2][], new int[3][], new int[3][]};
    }
}
