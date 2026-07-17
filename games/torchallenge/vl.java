/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_c;
    static int field_b;
    static uj field_a;
    static boolean[][][] field_d;

    final static void a(byte param0) {
        if (!(lj.field_q)) {
            throw new IllegalStateException();
        }
        fh.field_g = true;
        wb.a(false, (byte) -80);
        gj.field_c = 0;
    }

    final static void b(byte param0) {
        fg.i(126);
        eb.field_m = true;
        ga.field_y = true;
        int var1 = -22;
        t.field_b.i(8389905);
        gh.a((byte) -116, ub.field_g, false);
    }

    final static void a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (hf.field_d != null) {
                  L2: {
                    var2_int = 28;
                    if (var2_int > param0.length) {
                      break L2;
                    } else {
                      if (var2_int > hf.field_d.length) {
                        break L2;
                      } else {
                        if (hf.field_d.length == param0.length) {
                          var3 = hf.field_d.length;
                          var4 = 0;
                          L3: while (true) {
                            if (var4 >= var3) {
                              break L0;
                            } else {
                              hf.field_d[var4] = (byte)p.a((int) hf.field_d[var4], (int) param0[var4]);
                              var4++;
                              continue L3;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("vl.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 10 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_d = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
    }
}
