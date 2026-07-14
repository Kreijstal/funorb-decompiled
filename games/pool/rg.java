/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends ma {
    long field_m;
    static di field_r;
    static String field_l;
    static String field_t;
    rg field_q;
    static boolean field_s;
    rg field_n;
    static boolean field_p;
    static String field_o;
    static boolean field_v;
    static int field_u;

    final long a(int param0) {
        int var2 = -37 / ((-49 - param0) / 48);
        return ((rg) this).field_m;
    }

    final void a(long param0, int param1) {
        if (param1 != 45) {
            field_o = null;
        }
        if (null != ((rg) this).field_n) {
            throw new RuntimeException();
        }
        ((rg) this).field_m = param0;
    }

    public static void c(int param0) {
        field_o = null;
        field_l = null;
        field_r = null;
        if (param0 != -3604) {
            Object var2 = null;
            int discarded$0 = rg.a(-30, (String[]) null, (String) null, (lr) null, -45);
        }
        field_t = null;
    }

    final boolean d(int param0) {
        if (null == ((rg) this).field_n) {
            return false;
        }
        if (param0 < 31) {
            return false;
        }
        return true;
    }

    protected rg() {
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > -107) {
            rg.a(-20, 53, 78, true, 78, 37, 85);
        }
        return il.a(1, 1, param4, 3, 4, 1, param0, param3, param1);
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (!(null != ((rg) this).field_n)) {
            return;
        }
        ((rg) this).field_n.field_q = ((rg) this).field_q;
        ((rg) this).field_q.field_n = ((rg) this).field_n;
        ((rg) this).field_q = null;
        ((rg) this).field_n = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (param4 != 4010) {
            rg.a(33, -109, 29, false, 1, 26, 48);
        }
        if (hn.field_b != 2) {
            var7 = vd.field_f;
        } else {
            var7 = wb.field_f;
        }
        la.a(-57, param1, param2, param5, var7, param3, param0, param6);
    }

    final static int a(int param0, String[] param1, String param2, lr param3, int param4) {
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
          var13 = Pool.field_O;
          var5 = param3.b(param2);
          if (param0 < var5) {
            break L0;
          } else {
            if (param2.indexOf("<br>") != -1) {
              break L0;
            } else {
              param1[0] = (String) (Object) param1;
              return 1;
            }
          }
        }
        var6 = (-1 + var5 + param0) / param0;
        param0 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param2.length();
        var9 = param4;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var8 > var7) {
                var6++;
                param1[var6] = param2.substring(var7, var8).trim();
                break L2;
              } else {
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var10 = param2.charAt(var9);
                if (32 == var10) {
                  break L4;
                } else {
                  if (45 != var10) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param2.substring(var7, var9 - -1).trim();
              var12 = param3.b(var11);
              if (param0 > var12) {
                break L3;
              } else {
                var7 = var9 - -1;
                var6++;
                param1[var6] = var11;
                break L3;
              }
            }
            if (62 == var10) {
              if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param1[var6] = param2.substring(var7, -3 + var9).trim();
                var7 = var9 - -1;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Out of lives.";
        field_t = "Open table";
        field_p = true;
        field_s = true;
        field_o = "<%0> and <%1> want to draw.";
    }
}
