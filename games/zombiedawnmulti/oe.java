/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_a;
    static String field_d;
    static String field_f;
    static String field_c;
    static String field_e;
    static String field_b;

    final static boolean a(int param0) {
        int var1 = 26 % ((-17 - param0) / 52);
        return gi.field_i != null ? true : false;
    }

    final static String a(int param0, byte[] param1, boolean param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          var12 = new char[param0];
          var11 = var12;
          var4 = var11;
          if (!param2) {
            break L0;
          } else {
            var10 = null;
            String discarded$2 = oe.a(-96, (byte[]) null, true, 87);
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param0) {
            return new String(var12, 0, var5);
          } else {
            var7 = 255 & param1[var6 + param3];
            if (-1 != (var7 ^ -1)) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if ((var7 ^ -1) <= -161) {
                    break L2;
                  } else {
                    L3: {
                      var8 = vg.field_s[-128 + var7];
                      if (0 != var8) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -9162) {
            field_f = null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, int param1, ja[] param2, byte param3) {
        qf.field_c = new pd(param2);
        if (param3 != -21) {
            field_d = null;
        }
        ic.field_g = param1;
        e.field_a = param0;
        ff.f(-4604);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You can spectate this game";
        field_d = "Shaun";
        field_e = "<%0> has entered a game.";
        field_b = "Quit to website";
    }
}
