/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static int field_f;
    static bi field_a;
    static boolean field_b;
    private df field_e;
    static String field_d;
    private df field_c;

    final int c(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        df var3 = ((db) this).field_e.field_h;
        int var4 = -48 / ((param0 - -34) / 39);
        while (var3 != ((db) this).field_e) {
            var2++;
            var3 = var3.field_h;
        }
        return var2;
    }

    public static void d(int param0) {
        if (param0 != 31992) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, int param1) {
        if (param0 <= 26) {
            field_d = null;
        }
        int var2 = param1 >>> -2101520191;
        var2 = var2 | var2 >>> 1815869857;
        var2 = var2 | var2 >>> 1293249538;
        var2 = var2 | var2 >>> 1574283332;
        var2 = var2 | var2 >>> 1805205928;
        var2 = var2 | var2 >>> 1571760688;
        return param1 & (var2 ^ -1);
    }

    final df b(int param0) {
        df var2 = ((db) this).field_c;
        if (param0 != 32) {
            return null;
        }
        if (!(var2 != ((db) this).field_e)) {
            ((db) this).field_c = null;
            return null;
        }
        ((db) this).field_c = var2.field_h;
        return var2;
    }

    final void b(byte param0) {
        df var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
            var2 = ((db) this).field_e.field_h;
            if (var2 == ((db) this).field_e) {
                break;
            }
            var2.a(16);
        }
        ((db) this).field_c = null;
        if (param0 < 23) {
            field_f = -54;
        }
    }

    final df a(int param0) {
        df var2 = ((db) this).field_e.field_h;
        if (((db) this).field_e == var2) {
            return null;
        }
        var2.a(16);
        int var3 = 32 / ((49 - param0) / 38);
        return var2;
    }

    final boolean a(byte param0) {
        if (param0 != 25) {
            return true;
        }
        return ((db) this).field_e.field_h == ((db) this).field_e ? true : false;
    }

    final void a(df param0, int param1) {
        if (!(null == param0.field_j)) {
            param0.a(16);
        }
        param0.field_h = ((db) this).field_e;
        param0.field_j = ((db) this).field_e.field_j;
        param0.field_j.field_h = param0;
        param0.field_h.field_j = param0;
        if (param1 != 32) {
            ((db) this).field_e = null;
        }
    }

    final df c(int param0) {
        df var2 = ((db) this).field_e.field_h;
        if (!(((db) this).field_e != var2)) {
            ((db) this).field_c = null;
            return null;
        }
        ((db) this).field_c = var2.field_h;
        if (param0 >= -126) {
            Object var3 = null;
            int discarded$0 = db.a(95, (nq) null, (String) null, (String[]) null, 64);
        }
        return var2;
    }

    final static int a(int param0, nq param1, String param2, String[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = param1.c(param2);
          if (param4 == 3) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (var5 > param0) {
            break L1;
          } else {
            if (-1 == param2.indexOf("<br>")) {
              param3[0] = (String) (Object) param3;
              return 1;
            } else {
              break L1;
            }
          }
        }
        var6 = (-1 + param0 + var5) / param0;
        param0 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param2.length();
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var7 < var8) {
                var6++;
                param3[var6] = param2.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param2.charAt(var9);
                if (32 == var10) {
                  break L5;
                } else {
                  if (45 == var10) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param2.substring(var7, 1 + var9).trim();
              var12 = param1.c(var11);
              if (var12 >= param0) {
                var7 = 1 + var9;
                var6++;
                param3[var6] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                var6++;
                param3[var6] = param2.substring(var7, var9 - 3).trim();
                var7 = 1 + var9;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    public db() {
        ((db) this).field_e = new df();
        ((db) this).field_e.field_h = ((db) this).field_e;
        ((db) this).field_e.field_j = ((db) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "C: Hide Chat";
    }
}
