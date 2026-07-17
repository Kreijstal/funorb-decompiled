/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends jc {
    static String field_n;
    private int field_r;
    private mm field_s;
    static String field_o;
    static char[] field_q;
    static km field_p;

    final void g(int param0, int param1) {
        int fieldTemp$2 = ((hg) this).field_l;
        ((hg) this).field_l = ((hg) this).field_l + 1;
        ((hg) this).field_g[fieldTemp$2] = (byte)(param0 + ((hg) this).field_s.a(5180));
        if (param1 == 8) {
          return;
        } else {
          field_o = null;
          return;
        }
    }

    hg(byte[] param0) {
        super(param0);
    }

    final void j(int param0) {
        ((hg) this).field_r = param0 * ((hg) this).field_l;
    }

    final void k(int param0) {
        ((hg) this).field_l = (param0 + ((hg) this).field_r) / 8;
    }

    final void a(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((hg) this).field_s = new mm(param0);
              if (!param1) {
                break L1;
              } else {
                int discarded$2 = ((hg) this).c((byte) -30, 7);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hg.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    hg(int param0) {
        super(param0);
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = ((hg) this).field_r >> 3;
        var4 = -(((hg) this).field_r & 7) + 8;
        ((hg) this).field_r = ((hg) this).field_r + param1;
        var5 = 0;
        if (param0 == -78) {
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (param1 == var4) {
                  var5 = var5 + (((hg) this).field_g[var3] & lh.field_b[var4]);
                  break L1;
                } else {
                  var5 = var5 + (((hg) this).field_g[var3] >> var4 + -param1 & lh.field_b[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((lh.field_b[var4] & ((hg) this).field_g[incrementValue$2]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((hg) this).field_r = 29;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (param1 == var4) {
                  var5 = var5 + (((hg) this).field_g[var3] & lh.field_b[var4]);
                  break L3;
                } else {
                  var5 = var5 + (((hg) this).field_g[var3] >> var4 + -param1 & lh.field_b[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((lh.field_b[var4] & ((hg) this).field_g[incrementValue$3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    public static void f() {
        field_o = null;
        field_p = null;
        field_q = null;
        field_n = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (param3 <= var5_int) {
                L2: {
                  if (param0 <= -103) {
                    break L2;
                  } else {
                    int discarded$4 = ((hg) this).c((byte) 114, 127);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$5 = ((hg) this).field_l;
                ((hg) this).field_l = ((hg) this).field_l + 1;
                param2[var5_int + param1] = (byte)(((hg) this).field_g[fieldTemp$5] + -((hg) this).field_s.a(5180));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hg.G(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final int e(boolean param0) {
        if (param0) {
          return -55;
        } else {
          int fieldTemp$2 = ((hg) this).field_l;
          ((hg) this).field_l = ((hg) this).field_l + 1;
          return ((hg) this).field_g[fieldTemp$2] + -((hg) this).field_s.a(5180) & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Play again";
        field_q = new char[128];
        field_o = "This game has started.";
    }
}
