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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                if (var6 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("pa.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            Object var6 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                e.field_i = param0;
                try {
                  L1: {
                    L2: {
                      var3 = param2.getParameter("cookieprefix");
                      var4 = param2.getParameter("cookiehost");
                      var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                      if (param0.length() == 0) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ff.a(param2, "document.cookie=\"" + var5 + "\"", (byte) 1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    throwable = decompiledCaughtException;
                    break L3;
                  }
                }
                ok.a(param2, -1);
                if (param1 == 8) {
                  break L0;
                } else {
                  var6 = null;
                  pa.a(-68, (ka[]) null);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var3_ref;
                stackOut_10_1 = new StringBuilder().append("pa.K(");
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L4;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L4;
                }
              }
              L5: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
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
              throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ka[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 < -98) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            gi.field_f = param1;
            if (null == gi.field_f) {
              break L0;
            } else {
              if (3 > param1.length) {
                throw new IllegalArgumentException("");
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("pa.D(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void n(int param0) {
        field_z = null;
    }

    final int o(int param0) {
        if (param0 != 11650) {
          ((pa) this).m(-112);
          int fieldTemp$4 = ((pa) this).field_q;
          ((pa) this).field_q = ((pa) this).field_q + 1;
          return ((pa) this).field_m[fieldTemp$4] - ((pa) this).field_w.d(-102) & 255;
        } else {
          int fieldTemp$5 = ((pa) this).field_q;
          ((pa) this).field_q = ((pa) this).field_q + 1;
          return ((pa) this).field_m[fieldTemp$5] - ((pa) this).field_w.d(-102) & 255;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$2 = ((pa) this).field_q;
        ((pa) this).field_q = ((pa) this).field_q + 1;
        ((pa) this).field_m[fieldTemp$2] = (byte)(param1 + ((pa) this).field_w.d(127));
        if (param0 == 25) {
          return;
        } else {
          field_z = null;
          return;
        }
    }

    final void l(int param0) {
        ((pa) this).field_y = param0 * ((pa) this).field_q;
    }

    final int e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        var3 = ((pa) this).field_y >> 3;
        var4 = -(7 & ((pa) this).field_y) + 8;
        var6 = -20 % ((param1 - 57) / 37);
        var5 = 0;
        ((pa) this).field_y = ((pa) this).field_y + param0;
        L0: while (true) {
          if (param0 > var4) {
            int incrementValue$1 = var3;
            var3++;
            var5 = var5 + ((((pa) this).field_m[incrementValue$1] & ah.field_e[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
            if (var7 == 0) {
              continue L0;
            } else {
              var5 = var5 + (((pa) this).field_m[var3] & ah.field_e[var4]);
              return var5;
            }
          } else {
            L1: {
              L2: {
                if (param0 == var4) {
                  break L2;
                } else {
                  var5 = var5 + (((pa) this).field_m[var3] >> -param0 + var4 & ah.field_e[param0]);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var5 + (((pa) this).field_m[var3] & ah.field_e[var4]);
              break L1;
            }
            return var5;
          }
        }
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

    final static void f(byte param0) {
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
                    gb.field_d.a(param0 + -19424);
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
                  if (param0 == 109) {
                    break L6;
                  } else {
                    field_z = null;
                    break L6;
                  }
                }
                if (null != ij.field_y) {
                  var1_int = 0;
                  L7: while (true) {
                    if (var1_int >= ij.field_y.length) {
                      break L0;
                    } else {
                      if (var3 == 0) {
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
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw oj.a((Throwable) (Object) var1, "pa.H(" + param0 + 41);
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
