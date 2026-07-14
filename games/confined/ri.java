/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static od field_c;
    static bi field_b;
    static String[] field_a;

    public static void a(byte param0) {
        int var1 = -117 / ((param0 - -52) / 52);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < ci.field_c) {
            im.field_d = im.field_d + (ci.field_c + -var1);
        }
        ci.field_c = var1;
        if (param0 != -3) {
            field_a = null;
        }
        return im.field_d + var1;
    }

    final static void a(rk param0, int param1, rk param2) {
        if (null != param2.field_a) {
            param2.a(true);
        }
        param2.field_a = param0.field_a;
        param2.field_h = param0;
        if (param1 != 0) {
        }
        param2.field_a.field_h = param2;
        param2.field_h.field_a = param2;
    }

    final static void b(int param0) {
        qh.c(4);
        if (fb.field_b != null) {
            fa.a(fb.field_b, -122);
        }
        hl.b((byte) -58);
        vd.b((byte) 18);
        vm.h((byte) 37);
        if (param0 <= 101) {
            return;
        }
        if (!(!pa.a(false))) {
            vh.field_a.b(true, 1);
            tb.a(0, 125);
        }
        dc.d(115);
    }

    final static int a(String[] args, int param1, String param2, ok param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Confined.field_J ? 1 : 0;
          var5 = param3.c(param2);
          if (param4 < var5) {
            break L0;
          } else {
            if ((param2.indexOf("<br>") ^ -1) == 0) {
              args[0] = (String) (Object) args;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (var5 - -param4 - 1) / param4;
        param4 = var5 / var6;
        var7 = -45 / ((-40 - param1) / 37);
        var6 = 0;
        var8 = 0;
        var9 = param2.length();
        var10 = 0;
        L1: while (true) {
          if (var10 >= var9) {
            L2: {
              if (var8 < var9) {
                var6++;
                args[var6] = param2.substring(var8, var9).trim();
                break L2;
              } else {
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var11 = param2.charAt(var10);
                if (var11 == 32) {
                  break L4;
                } else {
                  if (45 == var11) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var12 = param2.substring(var8, var10 - -1).trim();
              var13 = param3.c(var12);
              if (param4 <= var13) {
                var8 = var10 - -1;
                var6++;
                args[var6] = var12;
                break L3;
              } else {
                break L3;
              }
            }
            if (var11 == 62) {
              if (param2.regionMatches(var10 + -3, "<br>", 0, 4)) {
                var6++;
                args[var6] = param2.substring(var8, -3 + var10).trim();
                var8 = var10 + 1;
                var10++;
                continue L1;
              } else {
                var10++;
                continue L1;
              }
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
