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
        this.field_q = (this.field_y + 7) / param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$5 = 0;
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
                fieldTemp$5 = this.field_q;
                this.field_q = this.field_q + 1;
                param3[var5_int + param2] = (byte)(this.field_m[fieldTemp$5] + -this.field_w.d(126));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("pa.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var4 = null;
            String var8 = null;
            String var5 = null;
            e.field_i = param0;
            try {
                var7 = param2.getParameter("cookieprefix");
                var4 = param2.getParameter("cookiehost");
                var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                if (!(-1 != (param0.length() ^ -1))) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ff.a(param2, "document.cookie=\"" + var5 + "\"", (byte) 1);
            } catch (Throwable throwable) {
            }
            ok.a(param2, -1);
            if (param1 != 8) {
                ka[] var6 = (ka[]) null;
                pa.a(-68, (ka[]) null);
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
                field_t = (String) null;
                break L1;
              }
            }
            L2: {
              gi.field_f = param1;
              if (null == gi.field_f) {
                break L2;
              } else {
                if (3 > param1.length) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("pa.D(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void n(int param0) {
        field_z = null;
        if (param0 != 6) {
            return;
        }
        field_t = null;
        field_s = (boolean[][]) null;
        field_u = null;
        field_v = (int[][][]) null;
    }

    final int o(int param0) {
        if (param0 != 11650) {
            this.m(-112);
        }
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        return this.field_m[fieldTemp$0] - this.field_w.d(-102) & 255;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_m[fieldTemp$0] = (byte)(param1 + this.field_w.d(127));
        if (param0 != 25) {
            field_z = (int[]) null;
        }
    }

    final void l(int param0) {
        this.field_y = param0 * this.field_q;
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        int var3 = this.field_y >> -320247805;
        int var4 = -(7 & this.field_y) + 8;
        int var6 = -20 % ((param1 - 57) / 37);
        int var5 = 0;
        this.field_y = this.field_y + param0;
        while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_m[incrementValue$0] & ah.field_e[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_m[var3] >> -param0 + var4 & ah.field_e[param0]);
        } else {
            var5 = var5 + (this.field_m[var3] & ah.field_e[var4]);
        }
        return var5;
    }

    pa(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int[] param1) {
        try {
            if (param0 != 61) {
                field_u = (String) null;
            }
            this.field_w = new ed(param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "pa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(byte param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
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
                    try {
                      L4: {
                        jj.field_b.a((byte) -57);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
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
                    field_z = (int[]) null;
                    break L6;
                  }
                }
                L7: {
                  if (null != ij.field_y) {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= ij.field_y.length) {
                        break L7;
                      } else {
                        L9: {
                          if (null != ij.field_y[var1_int]) {
                            try {
                              L10: {
                                ij.field_y[var1_int].a((byte) -57);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2_ref = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw oj.a((Throwable) ((Object) var1), "pa.H(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_u = "Unfortunately you are not eligible to create an account.";
        field_t = "Player Name: ";
        field_s = new boolean[3][6];
        field_v = new int[][][]{new int[][]{new int[]{45, 58, 26, 27}, new int[]{3, 16, 26, 27}}, new int[][]{new int[]{38, 43, 25, 25}, new int[]{60, 1, 25, 25}, new int[]{18, 23, 25, 25}}, new int[][]{new int[]{51, 52, 23, 23}, new int[]{9, 10, 23, 23}, new int[]{29, 32, 23, 23}}};
    }
}
