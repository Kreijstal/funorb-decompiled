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
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          if (param0 != -13405) {
            field_m = false;
          }
          lc.field_c = io.field_P;
          if (param2 == 255) {
            stackIn_13_0 = !(ro.field_n >= 13);
            qc.field_i = oe.a(stackIn_13_0, (byte) 119);
            return;
          }
          if (param2 < 100) {
            qc.field_i = me.a(param3, 20, param2);
            return;
          }
          if (param2 <= 105) {
            qc.field_i = en.a(param1, 169);
            return;
          }
          qc.field_i = me.a(param3, 20, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("r.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param0) {
          for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param1;
          }
          return new String(var6);
        }
        return (String) null;
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
        if (ul.field_g == 1) {
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
          this.field_c = (l) ((Object) new hl(this));
          return;
        }
        if (ul.field_g != 2) {
          if (ul.field_g == 3) {
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
            this.field_c = (l) ((Object) new hl(this));
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
          this.field_c = (l) ((Object) new hl(this));
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
        this.field_c = (l) ((Object) new hl(this));
    }

    static {
        field_m = false;
    }
}
