/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg {
    static hd field_a;
    static hd field_e;
    static boolean field_b;
    static String field_d;
    static long[] field_c;
    static boolean field_f;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 == 66) {
          field_e = null;
          field_c = null;
          return;
        }
        field_e = (hd) null;
        field_e = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        if (eq.a(false)) {
          param1 = false;
        }
        ji.a((byte) 123, param1);
        ma.k(1);
        if (param0 < -115) {
          return;
        }
        rg.a((byte) 9, true);
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = up.field_p;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = param1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
          }
          if (param0 == 1) {
            var5 = 1;
          }
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param0 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (15 == param0) {
            var5 = 1;
            var4 = 1;
          }
          hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = param1;
          var5Lifetime1 = 0;
          if (param0 == 3) {
            var4Lifetime1 = -1;
          }
          if (param0 == 1) {
            var5Lifetime1 = 1;
          }
          if (param0 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param0 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param0 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param0 == 11) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
          if (param0 == 13) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param0 == 14) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (15 == param0) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          hh.field_g = rf.a(var4Lifetime1 * var2, -125, var5Lifetime1 * var2);
          return;
        }
        if (var3 >= 120) {
          var4Lifetime2 = param1;
          var5Lifetime2 = 0;
          if (param0 == 3) {
            var4Lifetime2 = -1;
          }
          if (param0 == 1) {
            var5Lifetime2 = 1;
          }
          if (param0 == 4) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param0 == 5) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param0 == 6) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param0 == 11) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (param0 == 13) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param0 == 14) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (15 == param0) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          hh.field_g = rf.a(var4Lifetime2 * var2, -125, var5Lifetime2 * var2);
          return;
        }
        var3 = 120 - var3;
        var2Lifetime1 = -(var3 * var3 * 8192 / 3300) + 8192;
        var4Lifetime3 = param1;
        var5Lifetime3 = 0;
        if (param0 == 3) {
          var4Lifetime3 = -1;
        }
        if (param0 == 1) {
          var5Lifetime3 = 1;
        }
        if (param0 == 4) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param0 == 5) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param0 == 6) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (param0 == 7) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        } else {
          if (param0 == 8) {
            var4Lifetime3 = -1;
            var5Lifetime3 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (param0 == 13) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (param0 == 14) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (15 == param0) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        hh.field_g = rf.a(var4Lifetime3 * var2Lifetime1, -125, var5Lifetime3 * var2Lifetime1);
        return;
    }

    final static void a(int param0) {
        or.field_d.b(9, (byte) -52);
        if (param0 != -1822) {
          rg.a(-16, -37);
          ec.field_e = true;
          return;
        }
        ec.field_e = true;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void b(byte param0, java.awt.Component param1);

    abstract int b(byte param0);

    static {
        field_f = true;
        field_c = new long[1000];
        field_d = "Exp: <%0>";
    }
}
