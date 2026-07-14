/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String[] field_b;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 >= -15) {
            field_b = null;
            im.field_b.a(param1, false);
            return;
        }
        im.field_b.a(param1, false);
    }

    final static void a(String[] args, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        var3 = -88 % ((-51 - param1) / 40);
        var2 = -1;
        var4 = 0;
        L0: while (true) {
          if (args.length <= var4) {
            return;
          } else {
            L1: {
              var5 = args[var4];
              if (0 == (var2 ^ -1)) {
                break L1;
              } else {
                args[var4] = jk.a(new String[1], "<col=<%0>>", 30496) + var5;
                break L1;
              }
            }
            var6 = en.a(var5, -8634, "<col=");
            var7 = en.a(var5, -8634, "</col>");
            if (var6 > var7) {
              var8 = var5.indexOf('>', var6);
              if (var8 != -1) {
                var9 = var5.substring(5 + var6, var8);
                var2 = hl.a(-120, (CharSequence) (Object) var9, 16);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              if ((var7 ^ -1) != 0) {
                var2 = -1;
                var4++;
                var4++;
                continue L0;
              } else {
                var4++;
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        if (param0 > -25) {
          return;
        } else {
          L0: {
            if (oo.field_d < -33) {
              L1: {
                var1 = oo.field_d % 32;
                if (-1 != var1) {
                  break L1;
                } else {
                  var1 = 32;
                  break L1;
                }
              }
              sf.d(62, -var1 + oo.field_d);
              break L0;
            } else {
              sf.d(-110, 0);
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -2898) {
            int discarded$0 = ig.b(-47);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (null != dd.field_E) {
          if (!dd.field_E.field_w) {
            if (param0 != 31131) {
              field_a = 4;
              return 0;
            } else {
              return 0;
            }
          } else {
            var1 = of.field_l + 20;
            var2 = var1 - 452;
            return var2 * dd.field_E.field_F / dd.field_E.field_G;
          }
        } else {
          if (param0 != 31131) {
            field_a = 4;
            return 0;
          } else {
            return 0;
          }
        }
    }

    static {
    }
}
