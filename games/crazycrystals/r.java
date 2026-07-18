/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ff {
    static int[] field_i;
    private int field_j;
    int field_n;
    static boolean field_m;
    private double field_l;
    private int field_h;
    static long field_f;
    int field_o;
    private int field_g;
    private int field_k;

    final static void a(int param0, String[] param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            lc.field_c = io.field_P;
            if (param2 == 255) {
              L1: {
                if (ro.field_n >= 13) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              int discarded$4 = 119;
              qc.field_i = oe.a(stackIn_10_0 != 0);
              break L0;
            } else {
              L2: {
                if (param2 < 100) {
                  break L2;
                } else {
                  if (param2 <= 105) {
                    int discarded$5 = 169;
                    qc.field_i = en.a(param1);
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              qc.field_i = me.a(param3, 20, param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("r.I(").append(-13405).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    public static void d() {
        field_i = null;
    }

    final void b(int param0) {
        if (param0 != -1771219320) {
            ((r) this).b(26);
            ((r) this).a(((r) this).field_l, true);
            return;
        }
        ((r) this).a(((r) this).field_l, true);
    }

    r() {
        String[] var3 = null;
        String[] var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        dg.a(false, 60);
        tb.field_d.a(hb.field_k, 100, 128 * qd.field_r, 8192);
        if (ul.field_g != 1) {
          if (ul.field_g == 2) {
            ((r) this).field_h = 27;
            ((r) this).field_o = 33;
            ((r) this).field_l = 9.4;
            ((r) this).field_k = 15;
            ((r) this).field_g = 30;
            ((r) this).field_j = 3;
            var6 = new String[]{"@  @ @@@ @ @ @@@  @  @ @", "@@ @  @  @ @ @   @ @ @ @", "@ @@  @  @ @ @@  @@@ @ @", "@  @  @   @  @   @ @ @ @", "@  @ @@@  @  @@@ @ @ @@@", "                        ", "  @@@ @@@ @@@@ @@  @ @  ", "  @ @ @   @  @ @ @ @ @  ", "  @@@ @@  @@@  @ @ @ @  ", "  @   @   @  @ @ @ @ @  ", "  @   @@@ @  @ @@  @@@  "};
            ((r) this).field_n = (int)Math.ceil(((r) this).field_l * (double)((r) this).field_h * 0.5 - (double)(-7 + ((r) this).field_h) * ((r) this).field_l + 240.0);
            kk.field_a = dp.a(((r) this).field_g, -27919, ((r) this).field_k, var6, ((r) this).field_j, ((r) this).field_h);
            jj.field_b = (int)Math.floor(-240.0 + (-((double)((r) this).field_k * ((r) this).field_l) + ((r) this).field_l * (double)((r) this).field_h * 0.5));
            ((r) this).field_c = (l) (Object) new hl((r) this);
            return;
          } else {
            if (ul.field_g != 3) {
              ((r) this).field_k = 13;
              ((r) this).field_h = 23;
              ((r) this).field_g = 25;
              ((r) this).field_l = 12.0;
              var5 = new String[]{"@   @@@ @ @ @@@ @  ", "@   @   @ @ @   @  ", "@   @@  @ @ @@  @  ", "@   @    @  @   @  ", "@@@ @@@  @  @@@ @@@", "                   ", "  @   @@@ @@@ @@@  ", "  @   @ @ @    @   ", "  @   @ @ @@@  @   ", "  @   @ @   @  @   ", "  @@@ @@@ @@@  @   "};
              ((r) this).field_j = 3;
              ((r) this).field_o = 30;
              ((r) this).field_n = (int)Math.ceil(((r) this).field_l * (double)((r) this).field_h * 0.5 - (double)(-7 + ((r) this).field_h) * ((r) this).field_l + 240.0);
              kk.field_a = dp.a(((r) this).field_g, -27919, ((r) this).field_k, var5, ((r) this).field_j, ((r) this).field_h);
              jj.field_b = (int)Math.floor(-240.0 + (-((double)((r) this).field_k * ((r) this).field_l) + ((r) this).field_l * (double)((r) this).field_h * 0.5));
              ((r) this).field_c = (l) (Object) new hl((r) this);
              return;
            } else {
              var4 = new String[]{"        @@@ @@@ @  @ @@@ @@@         ", "         @  @   @@ @  @  @           ", "         @  @@@ @ @@  @  @@@         ", "         @  @   @  @  @  @           ", "         @  @@@ @  @  @  @@@         ", "                                     ", "@  @ @@@ @ @  @  @ @ @@@ @  @ @@@ @@@", "@@ @ @ @ @ @ @ @ @@@ @   @@ @  @  @  ", "@ @@ @ @ @ @ @ @ @ @ @@@ @ @@  @  @@@", "@  @ @ @  @  @@@ @ @ @   @  @  @  @  ", "@  @ @@@  @  @ @ @ @ @@@ @  @  @  @@@"};
              ((r) this).field_j = 3;
              ((r) this).field_l = 6.0;
              ((r) this).field_o = 50;
              ((r) this).field_h = 27;
              ((r) this).field_g = 44;
              ((r) this).field_k = 15;
              ((r) this).field_n = (int)Math.ceil(((r) this).field_l * (double)((r) this).field_h * 0.5 - (double)(-7 + ((r) this).field_h) * ((r) this).field_l + 240.0);
              kk.field_a = dp.a(((r) this).field_g, -27919, ((r) this).field_k, var4, ((r) this).field_j, ((r) this).field_h);
              jj.field_b = (int)Math.floor(-240.0 + (-((double)((r) this).field_k * ((r) this).field_l) + ((r) this).field_l * (double)((r) this).field_h * 0.5));
              ((r) this).field_c = (l) (Object) new hl((r) this);
              return;
            }
          }
        } else {
          var3 = new String[]{"     @   @@@ @ @ @@@ @       ", "     @   @   @ @ @   @       ", "     @   @   @ @ @   @       ", "     @   @@  @ @ @@  @       ", "     @   @    @  @   @       ", "     @   @    @  @   @       ", "     @@@ @@@  @  @@@ @@@     ", "                             ", "@ @ @@ @@@ @  @@@ @@@ @@ @  @", "@ @ @  @ @ @  @ @ @ @ @  @@ @", "@ @ @  @ @ @  @ @ @ @ @  @@ @", "@ @ @@ @@  @  @ @ @@  @@ @ @@", " @  @  @ @ @  @ @ @ @ @  @ @@", " @  @  @ @ @  @ @ @ @ @  @  @", " @  @@ @ @ @@ @@@ @ @ @@ @  @"};
          ((r) this).field_g = 35;
          ((r) this).field_l = 7.8;
          ((r) this).field_k = 17;
          ((r) this).field_h = 33;
          ((r) this).field_o = 50;
          ((r) this).field_j = 3;
          ((r) this).field_n = (int)Math.ceil(((r) this).field_l * (double)((r) this).field_h * 0.5 - (double)(-7 + ((r) this).field_h) * ((r) this).field_l + 240.0);
          kk.field_a = dp.a(((r) this).field_g, -27919, ((r) this).field_k, var3, ((r) this).field_j, ((r) this).field_h);
          jj.field_b = (int)Math.floor(-240.0 + (-((double)((r) this).field_k * ((r) this).field_l) + ((r) this).field_l * (double)((r) this).field_h * 0.5));
          ((r) this).field_c = (l) (Object) new hl((r) this);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
    }
}
