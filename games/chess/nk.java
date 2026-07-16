/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends p {
    static String field_u;
    private int field_s;
    private ke field_p;
    static int[][] field_r;
    static jc field_t;
    static String field_v;
    static String[] field_x;
    static fa field_w;
    static int field_q;

    final void m(int param0) {
        ((nk) this).field_s = 8 * ((nk) this).field_l;
        if (param0 != -27123) {
            field_r = null;
        }
    }

    final int e(int param0, int param1) {
        int var7 = Chess.field_G;
        int var3 = ((nk) this).field_s >> 1350325475;
        int var4 = 8 + -(((nk) this).field_s & 7);
        ((nk) this).field_s = ((nk) this).field_s + param1;
        int var5 = 0;
        int var6 = -116 / ((65 - param0) / 33);
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((nk) this).field_o[incrementValue$0] & mi.field_s[var4]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 != param1) {
            var5 = var5 + (((nk) this).field_o[var3] >> var4 - param1 & mi.field_s[param1]);
        } else {
            var5 = var5 + (mi.field_s[var4] & ((nk) this).field_o[var3]);
        }
        return var5;
    }

    nk(int param0) {
        super(param0);
    }

    final void g(byte param0) {
        if (param0 < 44) {
          ((nk) this).g((byte) -48);
          ((nk) this).field_l = (7 + ((nk) this).field_s) / 8;
          return;
        } else {
          ((nk) this).field_l = (7 + ((nk) this).field_s) / 8;
          return;
        }
    }

    nk(byte[] param0) {
        super(param0);
    }

    final int n(int param0) {
        if (param0 >= -15) {
          field_x = null;
          int fieldTemp$4 = ((nk) this).field_l;
          ((nk) this).field_l = ((nk) this).field_l + 1;
          return ((nk) this).field_o[fieldTemp$4] + -((nk) this).field_p.b(-1) & 255;
        } else {
          int fieldTemp$5 = ((nk) this).field_l;
          ((nk) this).field_l = ((nk) this).field_l + 1;
          return ((nk) this).field_o[fieldTemp$5] + -((nk) this).field_p.b(-1) & 255;
        }
    }

    final void a(int[] param0, byte param1) {
        ((nk) this).field_p = new ke(param0);
        if (param1 != -92) {
            int discarded$0 = ((nk) this).n(-19);
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        var5 = 0;
        L0: while (true) {
          if (param0 <= var5) {
            if (param2) {
              field_v = null;
              return;
            } else {
              return;
            }
          } else {
            int fieldTemp$2 = ((nk) this).field_l;
            ((nk) this).field_l = ((nk) this).field_l + 1;
            param1[param3 + var5] = (byte)(((nk) this).field_o[fieldTemp$2] + -((nk) this).field_p.b(-1));
            var5++;
            continue L0;
          }
        }
    }

    final static dm a(boolean param0, String param1, String param2, boolean param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          var4 = 0L;
          var6 = null;
          if (-1 == param2.indexOf('@')) {
            var7 = (CharSequence) (Object) param2;
            var4 = jl.a(var7, false);
            break L0;
          } else {
            var6 = (Object) (Object) param2;
            break L0;
          }
        }
        if (!param3) {
          return null;
        } else {
          return l.a(param0, param1, (byte) 36, (String) var6, var4);
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((nk) this).field_l;
        ((nk) this).field_l = ((nk) this).field_l + 1;
        ((nk) this).field_o[fieldTemp$0] = (byte)(param0 + ((nk) this).field_p.b(-1));
        if (param1 > -49) {
            Object var4 = null;
            dm discarded$1 = nk.a(true, (String) null, (String) null, true);
        }
    }

    public static void l(int param0) {
        Object var2 = null;
        field_r = null;
        field_u = null;
        field_t = null;
        if (param0 != 8) {
          var2 = null;
          dm discarded$2 = nk.a(false, (String) null, (String) null, true);
          field_x = null;
          field_v = null;
          return;
        } else {
          field_x = null;
          field_v = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_w = null;
        field_x = new String[3];
        field_v = "Only show game chat from my friends";
    }
}
