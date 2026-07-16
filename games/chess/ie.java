/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int field_a;
    static le field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 != -1962602524) {
            field_a = 6;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1157703521;
        var2 = var2 | var2 >>> 427432513;
        var2 = var2 | var2 >>> -1363131230;
        var2 = var2 | var2 >>> -1962602524;
        if (param1 != -59) {
            field_c = null;
        }
        var2 = var2 | var2 >>> -704762520;
        var2 = var2 | var2 >>> 931016496;
        return param0 & (var2 ^ -1);
    }

    final static void b(int param0) {
        int var3 = 0;
        int var4 = Chess.field_G;
        km var1 = new km(param0, 140);
        tl.a((byte) -67, var1);
        nh.a();
        wb.b();
        sl.field_a = 0;
        di.k(9);
        km var2 = var1.c();
        for (var3 = 0; (var3 ^ -1) > -16; var3++) {
            var2.c(-2, -2, 16777215);
            wb.e(4, 4, 0, 0, 540, 140);
        }
        tg.field_u.e();
        var1.c(0, 0);
        fd.a(28773);
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = Chess.field_G;
        int var3 = 0;
        if (param1 != -1) {
            return 77;
        }
        while (-1 > (param0 ^ -1)) {
            var3 = param2 & 1 | var3 << 1862290177;
            param2 = param2 >>> 1;
            param0--;
        }
        return var3;
    }

    final static sa a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        if (param1 == -55) {
          var2 = param0.length();
          if (var2 == 0) {
            return ef.field_j;
          } else {
            if (63 >= var2) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2) {
                  var4 = param0.charAt(var3);
                  if (var4 == 45) {
                    L1: {
                      if (0 == var3) {
                        break L1;
                      } else {
                        if (var3 == -1 + var2) {
                          break L1;
                        } else {
                          var3++;
                          continue L0;
                        }
                      }
                    }
                    return wh.field_b;
                  } else {
                    if (-1 == oc.field_m.indexOf(var4)) {
                      return wh.field_b;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return ok.field_Ob;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, byte param1, int param2) {
        dh var4_ref_dh = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        ve var3 = ca.a(param0, param2, -128);
        if (!(var3 == null)) {
            pi.field_d.a(0, false);
            var4_ref_dh = pi.field_d;
            var5_ref_String = ef.field_m;
            var4_ref_dh.field_b.a((byte) -12, var5_ref_String, 5);
            var4_ref_dh = pi.field_d;
            var5 = re.field_m;
            var6 = ag.field_f;
            var4_ref_dh.field_b.a(true, var5, 0, var6, 0);
        }
        int var4 = 89 / ((param1 - -25) / 46);
        vc.a((byte) 68, param0, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email is valid";
        field_a = 0;
    }
}
