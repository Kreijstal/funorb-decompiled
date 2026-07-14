/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends hg {
    static String[] field_o;
    private String[] field_i;
    private int field_q;
    static String[] field_g;
    private int field_s;
    static long field_p;
    private ih field_l;
    private int field_j;
    static String field_n;
    private int field_r;
    private int field_m;
    private String field_h;
    private int field_k;

    private final int a(byte param0, int param1) {
        int var3 = this.d(param0 + -4093);
        int var4 = param1 - -var3;
        int var5 = this.h(param0 ^ -31);
        if (param0 != 106) {
            Object var7 = null;
            ((me) this).a((ih) null, -7, (byte) 1, 49);
        }
        int var6 = var4 < var5 ? var5 : var4;
        return var6;
    }

    private final int a(byte param0) {
        int var2 = this.d((byte) 102);
        int var3 = 46;
        int var4 = ((me) this).field_l.a((char) var3);
        if (param0 != -65) {
            ((me) this).a(21, 106, -114);
        }
        int var5 = this.d(-3987);
        int var6 = var5 + var4 + 2 * var2;
        return var6;
    }

    private final int f(int param0) {
        int var2 = un.a(((me) this).field_l, 31512);
        int var3 = 0;
        if (param0 != -1) {
            return -113;
        }
        var3 = var3 + var2;
        var3 += 2;
        return var3;
    }

    final void a(ih param0, int param1, byte param2, int param3) {
        ((me) this).field_l = param0;
        ((me) this).field_r = param1;
        if (param2 > -25) {
            int discarded$0 = this.e(-42);
        }
        ((me) this).field_m = param3;
    }

    public static void k(int param0) {
        if (param0 != 0) {
            field_o = null;
        }
        field_g = null;
        field_n = null;
        field_o = null;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = param4 == param0 ? 1 : 0;
        int var8 = var7 == 0 ? ((me) this).field_m : ((me) this).field_r;
        if (null != ((me) this).field_i[param4]) {
            ((me) this).field_l.a(((me) this).field_i[param4], param2, param3, var8, -1);
        }
        if (param5 != -17751) {
            ((me) this).field_k = -120;
        }
        param3 = param3 + param1;
        return param3;
    }

    private final int i(int param0) {
        int var2 = gi.a((byte) -96, ((me) this).field_l);
        if (param0 != -407) {
            Object var3 = null;
            ((me) this).a(100, (boolean[]) null, (byte) 94);
        }
        return this.a((byte) 106, var2);
    }

    private final int g(int param0) {
        int var2 = un.a(((me) this).field_l, 31512);
        int var3 = 0;
        var3 = var3 + param0;
        var3 = var3 + var2;
        var3 += 2;
        var3 += 2;
        return var3;
    }

    private final void a(int param0, boolean param1, boolean[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = EscapeVector.field_A;
          var4 = ((me) this).field_k;
          var5 = this.g(2);
          var6 = this.f(-1);
          var7 = var5 + (((me) this).field_j - -uc.a(-1, ((me) this).field_l));
          if (param1) {
            break L0;
          } else {
            int discarded$2 = this.d((byte) 22);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var8 >= ((me) this).field_i.length) {
            return;
          } else {
            var9 = param2[var8] ? 1 : 0;
            if (var9 != 0) {
              var7 = this.a(param0, var6, var4, var7, var8, -17751);
              var8++;
              continue L1;
            } else {
              var7 = var7 + var6;
              var8++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        this.j(-115);
        if (param0 != -6131) {
            ((me) this).field_r = -63;
        }
        this.b(3, param1);
    }

    final void a(int param0, boolean[] param1, byte param2) {
        if (param2 != 48) {
            return;
        }
        if (param1 != null) {
            // if_icmpne L23
        } else {
            ((me) this).a(-6131, param0);
            return;
        }
        this.j(-128);
        this.a(param0, true, param1);
    }

    final int e(byte param0) {
        if (!(0 != ((me) this).field_q)) {
            return this.a((byte) -65);
        }
        if (!((((me) this).field_q ^ -1) != -2)) {
            return this.i(param0 + -280);
        }
        if (param0 != -127) {
            int discarded$0 = this.g(21);
        }
        if (-3 == (((me) this).field_q ^ -1)) {
            return this.g((byte) -124);
        }
        if (3 == ((me) this).field_q) {
            return this.e(param0 ^ -126);
        }
        return 0;
    }

    final int f(byte param0) {
        if (param0 <= 78) {
            ((me) this).field_k = 56;
        }
        int var2 = 0;
        var2 = var2 + this.g(2);
        int var3 = this.f(-1);
        var2 = var2 + ((me) this).field_s * var3;
        return var2;
    }

    private final void j(int param0) {
        if (param0 >= -22) {
            ((me) this).field_q = 104;
        }
        if (((me) this).field_h == null) {
            return;
        }
        int var2 = ((me) this).field_k;
        int var3 = ((me) this).field_j - (-2 + -uc.a(-1, ((me) this).field_l));
        ((me) this).field_l.a(((me) this).field_h, var2, var3, ((me) this).field_m, -1);
        int var4 = ((me) this).field_l.b(((me) this).field_h);
        em.a(var2, var3, var4, 2, ((me) this).field_m);
    }

    private final int g(byte param0) {
        int var2 = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var2 = 0;
        var4 = -23 % ((-68 - param0) / 56);
        var3 = ((me) this).field_i;
        var5 = 0;
        L0: while (true) {
          if (var3.length <= var5) {
            return this.a((byte) 106, var2);
          } else {
            var6 = var3[var5];
            var7 = ((me) this).field_l.b(var6);
            if (var2 < var7) {
              var2 = var7;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-10 > (var3 ^ -1)) {
            L1: {
              if (param0 > 92) {
                break L1;
              } else {
                int discarded$1 = this.e(7);
                break L1;
              }
            }
            return var2;
          } else {
            var4 = Character.forDigit(var3, 10);
            var5 = ((me) this).field_l.a((char) var4);
            if (var5 > var2) {
              var2 = var5;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final int e(int param0) {
        int var2 = this.d((byte) 123);
        int var3 = this.d(param0 + -3990);
        if (param0 != 3) {
            ((me) this).field_h = null;
        }
        int var4 = var3 + var2 * 2;
        int var5 = this.h(param0 + -113);
        int var6 = var5 <= var4 ? var4 : var5;
        return var6;
    }

    private final void b(int param0, int param1) {
        int var8 = EscapeVector.field_A;
        int var3 = ((me) this).field_k;
        int var4 = this.g(2);
        int var5 = this.f(-1);
        int var6 = var4 + ((me) this).field_j + uc.a(-1, ((me) this).field_l);
        int var7 = 0;
        if (param0 != 3) {
            int discarded$0 = this.a(-111, -60, -104, -15, 22, -100);
        }
        while (((me) this).field_i.length > var7) {
            var6 = this.a(param1, var5, var3, var6, var7, -17751);
            var7++;
        }
    }

    private final int d(int param0) {
        int var2 = 32;
        if (param0 != -3987) {
            int discarded$0 = this.i(-81);
        }
        int var3 = ((me) this).field_l.a((char) var2);
        return var3 * 2;
    }

    final void a(int param0, int param1, int param2) {
        ((me) this).field_k = param0;
        if (param2 != 0) {
            return;
        }
        ((me) this).field_j = param1;
    }

    private final int h(int param0) {
        if (!(null != ((me) this).field_h)) {
            return 0;
        }
        int var2 = ((me) this).field_l.b(((me) this).field_h);
        if (param0 > -102) {
            return 31;
        }
        int var3 = this.d(-3987);
        return var2 - -var3;
    }

    me(int param0) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        ((me) this).field_s = param0;
        ((me) this).field_q = 0;
        ((me) this).field_i = new String[((me) this).field_s];
        String var2 = ".";
        for (var3 = 0; ((me) this).field_s > var3; var3++) {
            var4 = 1 + var3;
            var5 = Integer.toString(var4) + var2;
            ((me) this).field_i[var3] = var5;
        }
    }

    me(String param0, String[] param1, int param2) {
        ((me) this).field_q = 2;
        ((me) this).field_h = param0;
        ((me) this).field_i = param1;
        if (-2 == (param2 ^ -1)) {
            ((me) this).field_q = 1;
        }
        ((me) this).field_s = ((me) this).field_i.length;
    }

    me(String param0, int[] param1) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        ((me) this).field_q = 3;
        ((me) this).field_h = param0;
        ((me) this).field_s = param1.length;
        ((me) this).field_i = new String[((me) this).field_s];
        for (var3 = 0; var3 < ((me) this).field_s; var3++) {
            var4 = param1[var3];
            var5 = Integer.toString(var4);
            if (var4 < 0) {
                var5 = null;
            }
            ((me) this).field_i[var3] = var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Congratulations, commander. You have recovered Earth's most advanced technologies from the mysterious aliens.", "Unfortunately, the aliens had time to analyze and duplicate some of our stolen weapons technology.", "They are now quickly amassing an armada, ready to strike at Earth.", "Earth's defences need time to prepare for repelling the alien invasion.", "Given your location in the alien home system, you have been ordered to do all in your powers to delay the alien arms build-up, and give Earth time to prepare."};
        field_p = 0L;
        field_g = new String[]{"Excellent work, commander. You have retrieved all of our technology from the sun-baked moon orbiting the innermost planet.", "Our next destination is an icy moon orbiting the aliens' home world.<br><br>Information about this moon is sketchy, but you should expect the alien defences to be considerably stronger here."};
        field_n = "This entry doesn't match";
    }
}
