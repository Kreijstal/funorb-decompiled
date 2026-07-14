/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_e;
    static String field_d;
    static int field_c;
    static String field_a;
    static int field_b;

    final static va a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        va var5 = null;
        if (param1 != null) {
          if (param1.length() != 0) {
            var2 = param1.indexOf('@');
            if (-1 == var2) {
              return vf.field_q;
            } else {
              var3 = param1.substring(param0, var2);
              var4 = param1.substring(var2 + 1);
              var5 = ll.a(var3, true);
              if (var5 != null) {
                return var5;
              } else {
                return ll.a((byte) 57, var4);
              }
            }
          } else {
            return pe.field_p;
          }
        } else {
          return pe.field_p;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_a = null;
        if (param0) {
          var2 = null;
          nl.a((ok) null, -61, (ok) null, 56);
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, nf[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        if (param2 != null) {
          if ((param3 ^ -1) < -1) {
            var5 = param2[0].field_t;
            var6 = param2[2].field_t;
            var7 = param2[1].field_t;
            param2[0].d(param1, param4);
            param2[2].d(param1 + param3 + -var6, param4);
            fn.b(hj.field_l);
            if (param0 > 101) {
              fn.f(var5 + param1, param4, param1 + (param3 - var6), param4 - -param2[1].field_x);
              var8 = param1 - -var5;
              var9 = -var6 + (param1 + param3);
              param1 = var8;
              L0: while (true) {
                if (param1 >= var9) {
                  fn.a(hj.field_l);
                  return;
                } else {
                  param2[1].d(param1, param4);
                  param1 = param1 + var7;
                  continue L0;
                }
              }
            } else {
              field_e = null;
              fn.f(var5 + param1, param4, param1 + (param3 - var6), param4 - -param2[1].field_x);
              var8 = param1 - -var5;
              var9 = -var6 + (param1 + param3);
              param1 = var8;
              L1: while (true) {
                if (param1 >= var9) {
                  fn.a(hj.field_l);
                  return;
                } else {
                  param2[1].d(param1, param4);
                  param1 = param1 + var7;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(ok param0, int param1, ok param2, int param3) {
        dn.field_f = param2;
        wg.field_a = param1;
        rn.field_e = param0;
        ud.a(fn.field_g / 2, (byte) -12, fn.field_l / param3);
        ue.a(param0.field_D + param0.field_y, param2.field_y - -param2.field_D, param2.field_y, param0.field_y, 243);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Members";
        field_d = "Waiting for extra data";
        field_b = 65;
        field_a = "Play the game without logging in just yet";
    }
}
