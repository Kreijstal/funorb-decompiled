/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends tm {
    static boolean field_q;
    static jg field_l;
    static int field_p;
    static String field_n;
    static int field_o;
    static boolean[][] field_m;

    final void a(di param0, byte param1) {
        eg dupTemp$0 = null;
        eg dupTemp$1 = null;
        if (this.field_a != null) {
          return;
        }
        try {
          if (param1 != 117) {
            field_q = true;
          }
          this.field_a = new eg[16];
          this.field_a[0] = eg.a(param0, "", "balls/POLAR/polar_ball_white");
          dupTemp$0 = eg.a(param0, "", "balls/POLAR/polar_ball_1");
          this.field_a[7] = dupTemp$0;
          this.field_a[6] = dupTemp$0;
          this.field_a[5] = dupTemp$0;
          this.field_a[4] = dupTemp$0;
          this.field_a[3] = dupTemp$0;
          this.field_a[2] = dupTemp$0;
          this.field_a[1] = dupTemp$0;
          this.field_a[8] = eg.a(param0, "", "balls/POLAR/polar_ball_black");
          dupTemp$1 = eg.a(param0, "", "balls/POLAR/polar_ball_2");
          this.field_a[15] = dupTemp$1;
          this.field_a[14] = dupTemp$1;
          this.field_a[13] = dupTemp$1;
          this.field_a[12] = dupTemp$1;
          this.field_a[11] = dupTemp$1;
          this.field_a[10] = dupTemp$1;
          this.field_a[9] = dupTemp$1;
          this.field_a[0].a(8, 8, 8, 8);
          this.field_a[1].a(8, 8, 8, 8);
          this.field_a[8].a(8, 8, 8, 8);
          this.field_a[9].a(8, 8, 8, 8);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "to.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(int param0, byte param1) {
        if (param1 != -102) {
          field_o = 0;
          if (param0 == 0) {
            return 13158;
          }
          if (param0 != 1) {
            return 16777215;
          }
          return 6715289;
        }
        if (param0 == 0) {
          return 13158;
        }
        if (param0 != 1) {
          return 16777215;
        }
        return 6715289;
    }

    to() {
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          this.a((byte) -23, 90);
          return false;
        }
        return false;
    }

    public static void i(int param0) {
        field_l = null;
        field_n = null;
        if (param0 != 8) {
          to.a((byte) 80, true);
          field_m = (boolean[][]) null;
          return;
        }
        field_m = (boolean[][]) null;
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        var3 = param0;
        if (var3 == 0) {
          return 13421772;
        }
        if (1 == var3) {
          return this.b(0, (byte) -102);
        }
        if (2 == var3) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 3) {
          return this.b(0, (byte) -102);
        }
        if (4 == var3) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 5) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 6) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 7) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 8) {
          return 3355443;
        }
        if (var3 == 9) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 10) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 11) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 12) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 13) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 14) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 15) {
          return this.b(1, (byte) -102);
        }
        if (param1) {
          return 16711935;
        }
        field_q = true;
        return 16711935;
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
          return;
        }
        try {
          this.field_e = aj.a(0, "", param1, "top_bar_balls_polar");
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "to.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        wd.field_Ub.a(0, (byte) 92, 0);
        int var2 = -32 % ((37 - param0) / 60);
    }

    final String a(byte param0, int param1) {
        if (param0 >= 9) {
          return param1 == 0 ? ij.field_t : ld.field_h;
        }
        field_l = (jg) null;
        return param1 == 0 ? ij.field_t : ld.field_h;
    }

    final static ml[] a(byte param0) {
        if (param0 == -66) {
          return new ml[]{eo.field_Xb, ug.field_v, ve.field_l};
        }
        field_p = 19;
        return new ml[]{eo.field_Xb, ug.field_v, ve.field_l};
    }

    static {
        field_p = 0;
        field_q = false;
        field_n = "Password: ";
        field_m = new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false}};
    }
}
