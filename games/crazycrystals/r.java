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
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = CrazyCrystals.field_B;
        if (param0 == -13405) {
          lc.field_c = io.field_P;
          if (param2 != 255) {
            if (param2 >= 100) {
              if ((param2 ^ -1) < -106) {
                qc.field_i = me.a(param3, 20, param2);
                return;
              } else {
                qc.field_i = en.a(param1, 169);
                return;
              }
            } else {
              qc.field_i = me.a(param3, 20, param2);
              return;
            }
          } else {
            L0: {
              if (-14 >= (ro.field_n ^ -1)) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            qc.field_i = oe.a(stackIn_16_0 != 0, (byte) 119);
            return;
          }
        } else {
          field_m = false;
          lc.field_c = io.field_P;
          if (param2 != 255) {
            if (param2 >= 100) {
              if ((param2 ^ -1) >= -106) {
                qc.field_i = en.a(param1, 169);
                return;
              } else {
                qc.field_i = me.a(param3, 20, param2);
                return;
              }
            } else {
              qc.field_i = me.a(param3, 20, param2);
              return;
            }
          } else {
            L1: {
              if (-14 >= (ro.field_n ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            qc.field_i = oe.a(stackIn_5_0 != 0, (byte) 119);
            return;
          }
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
          return null;
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
            field_i = null;
            field_i = null;
            return;
        }
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
        if (-2 != (ul.field_g ^ -1)) {
          if (-3 == (ul.field_g ^ -1)) {
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
          } else {
            if ((ul.field_g ^ -1) != -4) {
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
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
    }
}
