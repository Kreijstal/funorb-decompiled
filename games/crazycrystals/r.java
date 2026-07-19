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
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -13405) {
                break L1;
              } else {
                field_m = false;
                break L1;
              }
            }
            lc.field_c = io.field_P;
            if (param2 == 255) {
              L2: {
                if (-14 >= (ro.field_n ^ -1)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              qc.field_i = oe.a(stackIn_13_0 != 0, (byte) 119);
              break L0;
            } else {
              if (param2 < 100) {
                qc.field_i = me.a(param3, 20, param2);
                return;
              } else {
                if ((param2 ^ -1) >= -106) {
                  qc.field_i = en.a(param1, 169);
                  return;
                } else {
                  qc.field_i = me.a(param3, 20, param2);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("r.I(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = CrazyCrystals.field_B;
        var6 = new char[param2];
        var3 = var6;
        if (!param0) {
          return (String) null;
        } else {
          var4 = 0;
          L0: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 != 27) {
            field_i = (int[]) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void b(int param0) {
        if (param0 != -1771219320) {
            this.b(26);
            this.a(this.field_l, true);
            return;
        }
        this.a(this.field_l, true);
    }

    r() {
        String[] var3 = null;
        String[] var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        dg.a(false, 60);
        tb.field_d.a(hb.field_k, 100, 128 * qd.field_r, 8192);
        if (-2 != (ul.field_g ^ -1)) {
          if (-3 == (ul.field_g ^ -1)) {
            this.field_h = 27;
            this.field_o = 33;
            this.field_l = 9.4;
            this.field_k = 15;
            this.field_g = 30;
            this.field_j = 3;
            var6 = new String[]{"@  @ @@@ @ @ @@@  @  @ @", "@@ @  @  @ @ @   @ @ @ @", "@ @@  @  @ @ @@  @@@ @ @", "@  @  @   @  @   @ @ @ @", "@  @ @@@  @  @@@ @ @ @@@", "                        ", "  @@@ @@@ @@@@ @@  @ @  ", "  @ @ @   @  @ @ @ @ @  ", "  @@@ @@  @@@  @ @ @ @  ", "  @   @   @  @ @ @ @ @  ", "  @   @@@ @  @ @@  @@@  "};
            this.field_n = (int)Math.ceil(this.field_l * (double)this.field_h * 0.5 - (double)(-7 + this.field_h) * this.field_l + 240.0);
            kk.field_a = dp.a(this.field_g, -27919, this.field_k, var6, this.field_j, this.field_h);
            jj.field_b = (int)Math.floor(-240.0 + (-((double)this.field_k * this.field_l) + this.field_l * (double)this.field_h * 0.5));
            this.field_c = (l) ((Object) new hl((r) (this)));
            return;
          } else {
            if ((ul.field_g ^ -1) != -4) {
              this.field_k = 13;
              this.field_h = 23;
              this.field_g = 25;
              this.field_l = 12.0;
              var5 = new String[]{"@   @@@ @ @ @@@ @  ", "@   @   @ @ @   @  ", "@   @@  @ @ @@  @  ", "@   @    @  @   @  ", "@@@ @@@  @  @@@ @@@", "                   ", "  @   @@@ @@@ @@@  ", "  @   @ @ @    @   ", "  @   @ @ @@@  @   ", "  @   @ @   @  @   ", "  @@@ @@@ @@@  @   "};
              this.field_j = 3;
              this.field_o = 30;
              this.field_n = (int)Math.ceil(this.field_l * (double)this.field_h * 0.5 - (double)(-7 + this.field_h) * this.field_l + 240.0);
              kk.field_a = dp.a(this.field_g, -27919, this.field_k, var5, this.field_j, this.field_h);
              jj.field_b = (int)Math.floor(-240.0 + (-((double)this.field_k * this.field_l) + this.field_l * (double)this.field_h * 0.5));
              this.field_c = (l) ((Object) new hl((r) (this)));
              return;
            } else {
              var4 = new String[]{"        @@@ @@@ @  @ @@@ @@@         ", "         @  @   @@ @  @  @           ", "         @  @@@ @ @@  @  @@@         ", "         @  @   @  @  @  @           ", "         @  @@@ @  @  @  @@@         ", "                                     ", "@  @ @@@ @ @  @  @ @ @@@ @  @ @@@ @@@", "@@ @ @ @ @ @ @ @ @@@ @   @@ @  @  @  ", "@ @@ @ @ @ @ @ @ @ @ @@@ @ @@  @  @@@", "@  @ @ @  @  @@@ @ @ @   @  @  @  @  ", "@  @ @@@  @  @ @ @ @ @@@ @  @  @  @@@"};
              this.field_j = 3;
              this.field_l = 6.0;
              this.field_o = 50;
              this.field_h = 27;
              this.field_g = 44;
              this.field_k = 15;
              this.field_n = (int)Math.ceil(this.field_l * (double)this.field_h * 0.5 - (double)(-7 + this.field_h) * this.field_l + 240.0);
              kk.field_a = dp.a(this.field_g, -27919, this.field_k, var4, this.field_j, this.field_h);
              jj.field_b = (int)Math.floor(-240.0 + (-((double)this.field_k * this.field_l) + this.field_l * (double)this.field_h * 0.5));
              this.field_c = (l) ((Object) new hl((r) (this)));
              return;
            }
          }
        } else {
          var3 = new String[]{"     @   @@@ @ @ @@@ @       ", "     @   @   @ @ @   @       ", "     @   @   @ @ @   @       ", "     @   @@  @ @ @@  @       ", "     @   @    @  @   @       ", "     @   @    @  @   @       ", "     @@@ @@@  @  @@@ @@@     ", "                             ", "@ @ @@ @@@ @  @@@ @@@ @@ @  @", "@ @ @  @ @ @  @ @ @ @ @  @@ @", "@ @ @  @ @ @  @ @ @ @ @  @@ @", "@ @ @@ @@  @  @ @ @@  @@ @ @@", " @  @  @ @ @  @ @ @ @ @  @ @@", " @  @  @ @ @  @ @ @ @ @  @  @", " @  @@ @ @ @@ @@@ @ @ @@ @  @"};
          this.field_g = 35;
          this.field_l = 7.8;
          this.field_k = 17;
          this.field_h = 33;
          this.field_o = 50;
          this.field_j = 3;
          this.field_n = (int)Math.ceil(this.field_l * (double)this.field_h * 0.5 - (double)(-7 + this.field_h) * this.field_l + 240.0);
          kk.field_a = dp.a(this.field_g, -27919, this.field_k, var3, this.field_j, this.field_h);
          jj.field_b = (int)Math.floor(-240.0 + (-((double)this.field_k * this.field_l) + this.field_l * (double)this.field_h * 0.5));
          this.field_c = (l) ((Object) new hl((r) (this)));
          return;
        }
    }

    static {
        field_m = false;
    }
}
