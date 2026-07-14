/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends bca {
    static int field_s;
    static String field_t;
    static String field_r;
    static String field_q;

    kk(int param0, nq param1) {
        super(param0, param1);
    }

    kk(lu param0) {
        super(param0);
        ((kk) this).field_k = param0.e((byte) 100);
        ((kk) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((kk) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (param0 <= 102) {
          kk.d(26);
          var1 = 0;
          L0: while (true) {
            if (9 <= var1) {
              return;
            } else {
              vma.a((byte) -103, var1);
              var1++;
              continue L0;
            }
          }
        } else {
          var1 = 0;
          L1: while (true) {
            if (9 <= var1) {
              return;
            } else {
              vma.a((byte) -103, var1);
              var1++;
              continue L1;
            }
          }
        }
    }

    final void a(op param0, int param1) {
        ((kk) this).a(param0, (byte) -2);
        int var3 = 65 / ((12 - param1) / 35);
    }

    final static boolean d(byte param0) {
        if (param0 < 72) {
            return true;
        }
        return tc.a(24215, nia.d(-31768));
    }

    public static void d(int param0) {
        field_t = null;
        field_q = null;
        field_r = null;
        if (param0 != 19691) {
            kk.e((byte) 4);
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_q = null;
            return (at) (Object) new bp(param1, (kk) this);
        }
        return (at) (Object) new bp(param1, (kk) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_t = "Show private chat from my friends and opponents";
        field_r = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_q = "These are all collectible powerups. Moving on to one of these squares will pick up the powerup, and add a temporary bonus to your stats! Hearts will boost your Stamina, Speed arrows will boost your Speed, Boxing Gloves will boost your Fisticuffs, and Up arrows will boost your Flingstuff.";
    }
}
