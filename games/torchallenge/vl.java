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
        if (param0 != -88) {
            field_a = (uj) null;
        }
        fh.field_g = true;
        wb.a(false, (byte) -80);
        gj.field_c = 0;
    }

    final static void b(byte param0) {
        fg.i(126);
        eb.field_m = true;
        ga.field_y = true;
        int var1 = 45 / ((-48 - param0) / 48);
        t.field_b.i(8389905);
        gh.a((byte) -116, ub.field_g, false);
    }

    final static void a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
                          L3: {
                            if (param1 >= 6) {
                              break L3;
                            } else {
                              field_d = (boolean[][][]) null;
                              break L3;
                            }
                          }
                          var3 = hf.field_d.length;
                          var4 = 0;
                          L4: while (true) {
                            if (var4 >= var3) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              hf.field_d[var4] = (byte)p.a((int) hf.field_d[var4], (int) param0[var4]);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("vl.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = (boolean[][][]) null;
        if (param0 != 0) {
            field_c = (String) null;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_d = new boolean[][][]{new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false, false, false}, new boolean[]{true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}};
    }
}
