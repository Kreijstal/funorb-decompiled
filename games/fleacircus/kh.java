/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        qe stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qe stackOut_5_0 = null;
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
            if (param1 != null) {
              if (param1.length > 136) {
                var3 = new qe();
                ((hd) (Object) var3).a(-124, param1);
                stackOut_5_0 = (qe) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) rl.a(1, param1);
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("kh.A(").append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -137 + ')');
        }
        return (Object) (Object) stackIn_6_0;
    }

    public static void a() {
        field_a = null;
    }

    kh(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var2_int = 3;
            ((kh) this).field_f = param0[1];
            ((kh) this).field_e = param0[2];
            ((kh) this).field_c = new char[40][21];
            var3 = 0;
            L1: while (true) {
              if (var3 >= 40) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= 21) {
                    var3++;
                    continue L1;
                  } else {
                    ((kh) this).field_c[var3][var4] = (char)param0[var2_int];
                    var2_int++;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("kh.<init>(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (rl.field_e == null) {
              break L1;
            } else {
              if (rl.field_e.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          rl.field_e = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == jl.field_b) {
              break L3;
            } else {
              if (param1 > jl.field_b.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          jl.field_b = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == kk.field_b) {
              break L5;
            } else {
              if (param1 <= kk.field_b.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          kk.field_b = new int[param1 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (hg.field_q == null) {
              break L7;
            } else {
              if (param1 <= hg.field_q.length) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          hg.field_q = new int[param1 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (vh.field_i == null) {
              break L9;
            } else {
              if (vh.field_i.length >= param1) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          vh.field_i = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (null == uj.field_a) {
              break L11;
            } else {
              if (uj.field_a.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          uj.field_a = new int[2 * param1];
          break L10;
        }
        L12: {
          if (param2 == 26721) {
            break L12;
          } else {
            kh.a(-42, -43, 83);
            break L12;
          }
        }
        L13: {
          L14: {
            if (mh.field_y == null) {
              break L14;
            } else {
              if (param0 + param1 > mh.field_y.length) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          mh.field_y = new int[(param1 + param0) * 2];
          break L13;
        }
        L15: {
          L16: {
            if (null == se.field_d) {
              break L16;
            } else {
              if (se.field_d.length >= param1) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          se.field_d = new boolean[param1 * 2];
          break L15;
        }
        lc.field_u = -2147483648;
        ok.field_L = -2147483648;
        ak.field_f = 2147483647;
        ea.field_a = 2147483647;
        qh.field_D = 0;
    }

    static {
    }
}
