/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends oh {
    private nj field_J;
    static ll field_I;
    static String[] field_M;
    static int[] field_P;
    static java.security.SecureRandom field_O;
    static int field_N;
    static String field_H;
    static String field_K;
    static int field_L;
    static String field_G;

    final void i(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(this.field_J);
        if (param0 != 0) {
            return;
        }
        nm var3 = (nm) ((Object) var2.d(4));
        while (var3 != null) {
            var3.field_I = false;
            var3 = (nm) ((Object) var2.c(2));
        }
        this.field_C = null;
    }

    public sd() {
        super(0, 0, gi.field_m, im.field_h, (ur) null, (uf) null);
        this.field_J = new nj();
    }

    final void h(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(this.field_J);
        nm var3 = (nm) ((Object) var2.d(4));
        if (param0 != 0) {
            return;
        }
        while (var3 != null) {
            if (!(!var3.a(-1))) {
                var3.c(2);
            }
            var3 = (nm) ((Object) var2.c(2));
        }
    }

    final iq a(int param0) {
        vp var2 = null;
        nm var3 = null;
        int var4 = 0;
        iq var5 = null;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          var2 = new vp(this.field_J);
          var3 = (nm) ((Object) var2.d(4));
          if (param0 == 15197) {
            break L0;
          } else {
            var5 = (iq) null;
            this.b((iq) null, 32);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_I) {
              var3 = (nm) ((Object) var2.c(2));
              continue L1;
            } else {
              return var3.b(true);
            }
          } else {
            return null;
          }
        }
    }

    final void l(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(this.field_J);
        nm var3 = (nm) ((Object) var2.d(4));
        while (var3 != null) {
            if (!(!var3.j(17))) {
                var3.c(param0 ^ 2);
            }
            var3 = (nm) ((Object) var2.c(2));
        }
        this.field_C = (iq) ((Object) this.k(param0 + param0));
    }

    final static void f(byte param0) {
        String var2 = (String) null;
        aj.a((String) null, "", (byte) 33);
        if (param0 != -1) {
            sd.f((byte) -45);
        }
    }

    final void b(iq param0, int param1) {
        nm var3 = null;
        boolean discarded$0 = false;
        try {
            if (!(param0 instanceof nm)) {
                throw new IllegalArgumentException();
            }
            var3 = (nm) ((Object) param0);
            this.field_J.a(var3, (byte) 27);
            var3.field_I = true;
            if (param1 != 0) {
                sd.f((byte) 122);
            }
            discarded$0 = var3.a((byte) 116, (iq) (this));
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        iq discarded$0 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (!(null == this.field_B)) {
            this.field_B.a(true, param2, true, (iq) (this), param3);
        }
        vp var5 = new vp(this.field_J);
        if (param0) {
            discarded$0 = this.a(45);
        }
        iq var6 = (iq) ((Object) var5.b(4));
        while (var6 != null) {
            var6.a(false, param1, param2 + this.field_o, this.field_t + param3);
            var6 = (iq) ((Object) var5.a((byte) 50));
        }
    }

    public static void j(int param0) {
        field_M = null;
        field_H = null;
        if (param0 != -25849) {
            sd.j(91);
        }
        field_O = null;
        field_P = null;
        field_I = null;
        field_G = null;
        field_K = null;
    }

    final nm k(int param0) {
        vp var2 = null;
        nm var3 = null;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            sd.f((byte) 76);
            break L0;
          }
        }
        var2 = new vp(this.field_J);
        var3 = (nm) ((Object) var2.d(4));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_I) {
              var3 = (nm) ((Object) var2.c(2));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    static {
        field_I = new ll();
        field_M = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_H = "To report a player, right-click on their name and select the option to report abuse.";
        field_N = 0;
        field_G = "Service unavailable";
        field_K = "To complete each level, you must paint all the blue blocks purple. You'll need to collect the paint pots scattered around the level to have enough paint.<br><br>There are numerous blocks that will help or hinder your progress. Play the tutorial for more information about each block.";
    }
}
