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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_13_0 = 0;
                  break L2;
                } else {
                  stackIn_13_0 = 1;
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
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("r.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
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
        dg.a(false, 60);
        tb.field_d.a(hb.field_k, 100, 128 * qd.field_r, 8192);
        if (-2 == (ul.field_g ^ -1)) {
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
        if (-3 != (ul.field_g ^ -1)) {
            if ((ul.field_g ^ -1) == -4) {
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
        }
        this.field_h = 27;
        this.field_o = 33;
        this.field_l = 9.4;
        this.field_k = 15;
        this.field_g = 30;
        this.field_j = 3;
        String[] var6 = new String[]{"@  @ @@@ @ @ @@@  @  @ @", "@@ @  @  @ @ @   @ @ @ @", "@ @@  @  @ @ @@  @@@ @ @", "@  @  @   @  @   @ @ @ @", "@  @ @@@  @  @@@ @ @ @@@", "                        ", "  @@@ @@@ @@@@ @@  @ @  ", "  @ @ @   @  @ @ @ @ @  ", "  @@@ @@  @@@  @ @ @ @  ", "  @   @   @  @ @ @ @ @  ", "  @   @@@ @  @ @@  @@@  "};
        this.field_n = (int)Math.ceil(this.field_l * (double)this.field_h * 0.5 - (double)(-7 + this.field_h) * this.field_l + 240.0);
        kk.field_a = dp.a(this.field_g, -27919, this.field_k, var6, this.field_j, this.field_h);
        jj.field_b = (int)Math.floor(-240.0 + (-((double)this.field_k * this.field_l) + this.field_l * (double)this.field_h * 0.5));
        this.field_c = (l) ((Object) new hl((r) (this)));
    }

    static {
        field_m = false;
    }
}
