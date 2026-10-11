/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static long field_d;
    static int field_c;
    static int[] field_b;
    static mg field_a;
    static int field_e;

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        var3 = kf.field_e;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
          var4 = 1;
          var5 = 0;
          if (1 == param1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (param0 < 75) {
            hh.a(105);
          }
          if (param1 == 11) {
            var4 = -1;
          }
          if (param1 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param1 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 14) {
            var5 = 1;
            var4 = -1;
          }
          if (param1 == 15) {
            var4 = 1;
            var5 = 1;
          }
          gl.field_c = pa.a(-126, var2 * var4, var2 * var5);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (1 == param1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param1 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param1 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param1 == 7 ||
            8 == param1) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        } else {
          if (var3 < 120) {
            var3 = -var3 + 120;
            var2 = -(8192 * var3 * var3 / 3300) + 8192;
          }
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (1 == param1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param1 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param1 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param1 == 7) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          } else {
            if (8 == param1) {
              var4Lifetime1 = -1;
              var5Lifetime1 = -1;
            }
          }
        }
        if (param0 < 75) {
          hh.a(105);
        }
        if (param1 == 11) {
          var4Lifetime1 = -1;
        }
        if (param1 == 12) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        }
        if (param1 == 13) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 14) {
          var5Lifetime1 = 1;
          var4Lifetime1 = -1;
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        gl.field_c = pa.a(-126, var2 * var4Lifetime1, var2 * var5Lifetime1);
    }

    final static uh a(int param0) {
        if (param0 == -30890) {
          return new uh(eh.d(-110), ci.i(24410));
        }
        hh.b((byte) 14);
        return new uh(eh.d(-110), ci.i(24410));
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -122) {
          return;
        }
        field_b = null;
    }

    final static String b(byte param0) {
        if (null == mi.field_d) {
          return "";
        }
        int var1 = -40 / ((param0 + 90) / 32);
        return mi.field_d;
    }

    static {
        field_b = new int[8192];
        field_c = 20;
        field_e = 0;
    }
}
