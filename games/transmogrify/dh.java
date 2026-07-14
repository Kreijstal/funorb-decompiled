/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends aj implements df {
    private tc field_z;
    private String[] field_y;
    private lj[] field_C;
    static ti field_B;
    static volatile int field_w;
    static int field_x;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          if (param1 == 17) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((dh) this).field_y.length <= var6) {
            L2: {
              if (((dh) this).field_C[((dh) this).field_y.length] == param0) {
                ((dh) this).field_z.a((byte) -69);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (((dh) this).field_C[var6] == param0) {
              ((dh) this).field_z.a(false, ((dh) this).field_y[var6]);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        ek var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          ((dh) this).field_u.g(-1);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length == 0) {
              break L0;
            } else {
              var3 = param0.length;
              ((dh) this).field_y = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  L2: {
                    var4 = new ek(vd.field_h, 0, 1);
                    ((dh) this).field_C = new lj[var3 + 1];
                    if (param1 == 17036) {
                      break L2;
                    } else {
                      var7 = null;
                      java.net.URL discarded$1 = dh.a((java.applet.Applet) null, (byte) -123, (java.net.URL) null);
                      break L2;
                    }
                  }
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((dh) this).field_C[var3] = new lj(nj.field_p, (ma) this);
                      ((dh) this).field_C[var3].field_q = (ui) (Object) var4;
                      ((dh) this).field_C[var3].a(-127, 16 * var3 - -16 + 20, 0, 100, 15);
                      ((dh) this).a((qg) (Object) ((dh) this).field_C[var3], (byte) -92);
                      return;
                    } else {
                      ((dh) this).field_C[var5] = new lj(((dh) this).field_y[var5], (ma) this);
                      ((dh) this).field_C[var5].field_q = (ui) (Object) var4;
                      ((dh) this).field_C[var5].field_j = ae.field_c;
                      ((dh) this).field_C[var5].a(param1 ^ 17099, var5 * 16 + 20, 0, 80, 15);
                      ((dh) this).a((qg) (Object) ((dh) this).field_C[var5], (byte) -125);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((dh) this).field_y[var4_int] = ca.a((CharSequence) (Object) param0[var4_int], true).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((dh) this).field_y = null;
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        if (super.a(param0, param1, (byte) 121, param3)) {
            return true;
        }
        if (98 == param0) {
            return ((dh) this).a(2, param1);
        }
        int var5 = 101 / ((65 - param2) / 55);
        if (99 == param0) {
            return ((dh) this).b(param1, 49);
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var18 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Transmogrify.field_A ? 1 : 0;
        while (true) {
            param9--;
            if (0 > param9) {
                break;
            }
            var18 = param3;
            var10 = var18;
            var11 = param5;
            var12 = param4;
            var13 = param6;
            var14 = param8;
            var15 = (16711422 & var18[var11]) >> 1499236065;
            var10[var11] = (vg.c(var14, 33529506) >> 882301777) + (vg.c(16711680, var12 >> -252506815) - -vg.c(65280, var13 >> -120026807) + var15);
            param4 = param4 + param1;
            param5++;
            param8 = param8 + param7;
            param6 = param6 + param0;
        }
        if (param2 != 99) {
            Object var17 = null;
            java.net.URL discarded$0 = dh.a((java.applet.Applet) null, (byte) -5, (java.net.URL) null);
        }
    }

    public static void l(int param0) {
        if (param0 != -1) {
            return;
        }
        field_B = null;
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        if (md.field_j != null) {
            if (!(md.field_j.equals((Object) (Object) param0.getParameter("settings")))) {
                var3 = md.field_j;
                var4 = var3;
                var4 = var3;
            }
        }
        if (mg.field_e != null) {
            if (!mg.field_e.equals((Object) (Object) param0.getParameter("session"))) {
                var4 = mg.field_e;
            }
        }
        int var5 = 46 % ((param1 - -42) / 44);
        return fd.a(-1, var4, 130, param2, var3);
    }

    dh(tc param0) {
        super(0, 0, 0, 0, (ui) null);
        ((dh) this).field_z = param0;
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param2 >>> -2040649985;
        if (param0 != 15) {
            dh.l(125);
        }
        return (param2 + var3) / param1 + -var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 121);
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        int var5 = -1 % ((77 - param3) / 34);
        kg var6 = vd.field_h;
        if (!(null == ((dh) this).field_y)) {
            int discarded$0 = var6.a(ae.field_d, param0 - -((dh) this).field_p, ((dh) this).field_n + param1, ((dh) this).field_l, 20, 16777215, -1, 0, 0, var6.field_t + var6.field_y);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
    }
}
