/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wm {
    private rk field_s;
    private rk field_u;
    static String field_t;
    static int field_w;
    static volatile int field_r;
    static int field_p;
    static boolean[] field_v;
    static String field_q;

    final String a(String param0, byte param1) {
        String var7 = ((te) this).field_s.field_E.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (client.a(param1 + 111, var5)) {
            return pe.field_c;
        }
        if (!(!qf.a(var5, 0))) {
            return uk.field_y;
        }
        if (mc.a(var5, (byte) -121)) {
            return lf.field_b;
        }
        if (this.c(param0, (byte) 14)) {
            return bg.field_f;
        }
        if (param1 != -11) {
            Object var6 = null;
            String discarded$0 = ((te) this).a((String) null, (byte) -103);
        }
        if (var7.length() > 0) {
            if (nn.a(false, var7, var5)) {
                return rb.field_g;
            }
            if (ij.a(var5, var7, (byte) -126)) {
                return ng.field_j;
            }
            if (he.a(var7, (byte) -11, var5)) {
                return rb.field_g;
            }
            return pe.field_c;
        }
        return e.field_c;
    }

    te(rk param0, rk param1, rk param2) {
        super(param0);
        ((te) this).field_u = param2;
        ((te) this).field_s = param1;
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = te.a((String) null, 15, -79, (String[]) null, (mm) null);
        }
        field_v = null;
        field_t = null;
    }

    private final boolean c(String param0, byte param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param1 != 14) {
            te.e(-108);
        }
        String var3 = ((te) this).field_u.field_E.toLowerCase();
        String var4 = param0.toLowerCase();
        if (0 < var3.length()) {
            if (var4.length() > 0) {
                var5 = var3.lastIndexOf("@");
                if (var5 >= 0) {
                    if (var5 < -1 + var3.length()) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(var5 - -1);
                        if (!((var4.indexOf(var6) ^ -1) > -1)) {
                            return true;
                        }
                        if (var4.indexOf(var7) >= 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    final static int a(String param0, int param1, int param2, String[] param3, mm param4) {
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
          var13 = client.field_A ? 1 : 0;
          var5 = param4.a(param0);
          if (var5 > param2) {
            break L0;
          } else {
            if (param0.indexOf("<br>") == -1) {
              param3[0] = (String) (Object) param3;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (param2 + var5 + -1) / param2;
        param2 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param0.length();
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var7 >= var8) {
                break L2;
              } else {
                int incrementValue$3 = var6;
                var6++;
                param3[incrementValue$3] = param0.substring(var7, var8).trim();
                break L2;
              }
            }
            L3: {
              if (param1 > 65) {
                break L3;
              } else {
                field_t = null;
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param0.charAt(var9);
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
              var11 = param0.substring(var7, var9 + 1).trim();
              var12 = param4.a(var11);
              if (param2 <= var12) {
                var7 = var9 + 1;
                int incrementValue$4 = var6;
                var6++;
                param3[incrementValue$4] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (62 == var10) {
              if (param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
                int incrementValue$5 = var6;
                var6++;
                param3[incrementValue$5] = param0.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
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

    final tb b(String param0, byte param1) {
        String var3 = ((te) this).field_s.field_E.toLowerCase();
        String var4 = param0.toLowerCase();
        if (0 == var4.length()) {
            return vm.field_u;
        }
        if (!gf.a(-118, var3, var4)) {
            return vm.field_u;
        }
        if (param1 != -40) {
            field_w = -71;
        }
        if (this.c(param0, (byte) 14)) {
            return vm.field_u;
        }
        return dc.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = null;
        field_r = -1;
        field_v = new boolean[64];
    }
}
