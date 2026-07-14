/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr extends wj implements vh {
    static String field_I;
    private ur field_C;
    private String[] field_H;
    private wi[] field_F;
    static String field_B;
    static int field_G;
    static hd field_E;

    final static int a(ea param0, int[][][] param1, boolean param2) {
        if (!param2) {
            return 115;
        }
        return -param1[param0.field_c][param0.field_i][param0.field_k] + param1[param0.field_c][param0.field_d][param0.field_k] + (-param1[param0.field_c][param0.field_d][param0.field_e] + param1[param0.field_l][param0.field_i][param0.field_k]) + (-param1[param0.field_l][param0.field_i][param0.field_e] + (param1[param0.field_l][param0.field_d][param0.field_e] + -param1[param0.field_l][param0.field_d][param0.field_k]) - -param1[param0.field_c][param0.field_i][param0.field_e]);
    }

    public static void a(int param0) {
        field_B = null;
        if (param0 != 0) {
            field_G = 118;
        }
        field_E = null;
        field_I = null;
    }

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        cr var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          ((fr) this).field_y.b(22997);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length == 0) {
              break L0;
            } else {
              var3 = param0.length;
              ((fr) this).field_H = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  L2: {
                    if (param1 < -27) {
                      break L2;
                    } else {
                      ((fr) this).field_H = null;
                      break L2;
                    }
                  }
                  var4 = new cr(gf.field_a, 0, 1);
                  ((fr) this).field_F = new wi[var3 - -1];
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((fr) this).field_F[var3] = new wi(va.field_K, (jv) this);
                      ((fr) this).field_F[var3].field_r = (gj) (Object) var4;
                      ((fr) this).field_F[var3].a(15, 1, 0, 100, 20 - -(16 * (var3 + 1)));
                      ((fr) this).a(-52, (fd) (Object) ((fr) this).field_F[var3]);
                      return;
                    } else {
                      ((fr) this).field_F[var5] = new wi(((fr) this).field_H[var5], (jv) this);
                      ((fr) this).field_F[var5].field_r = (gj) (Object) var4;
                      ((fr) this).field_F[var5].field_u = lb.field_G;
                      ((fr) this).field_F[var5].a(15, 1, 0, 80, var5 * 16 + 20);
                      ((fr) this).a(-23, (fd) (Object) ((fr) this).field_F[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((fr) this).field_H[var4_int] = hv.a(false, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((fr) this).field_H = null;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (param1 > -60) {
            fr.a((byte) -18);
        }
        if (!(!super.a(param0, (byte) -87, param2, param3))) {
            return true;
        }
        if (!(param3 != 98)) {
            return ((fr) this).a(param2, (byte) -100);
        }
        if (99 != param3) {
            return false;
        }
        return ((fr) this).b(param2, (byte) 127);
    }

    fr(ur param0) {
        super(0, 0, 0, 0, (gj) null);
        ((fr) this).field_C = param0;
    }

    final static void a(byte param0) {
        wm.field_u = new ae();
        if (param0 != -76) {
            field_B = null;
        }
        we.field_a.a((byte) -118, (fd) (Object) wm.field_u);
    }

    final static qv h(byte param0) {
        if (param0 != 66) {
            return null;
        }
        if (!(null != n.field_e)) {
            n.field_e = new qv(qo.field_k, 20, 0, 0, 0, 11579568, -1, 0, 0, qo.field_k.field_G, -1, 2147483647, true);
        }
        return n.field_e;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
            return;
        }
        hu var5 = gf.field_a;
        if (null != ((fr) this).field_H) {
            int discarded$0 = var5.a(md.field_d, param2 - -((fr) this).field_t, param3 + ((fr) this).field_g, ((fr) this).field_n, 20, 16777215, -1, 0, 0, var5.field_G - -var5.field_p);
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        if (param3 > 64) {
          var6 = 0;
          L0: while (true) {
            if (((fr) this).field_H.length <= var6) {
              L1: {
                if (param1 == ((fr) this).field_F[((fr) this).field_H.length]) {
                  ((fr) this).field_C.a(-1);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              if (param1 == ((fr) this).field_F[var6]) {
                ((fr) this).field_C.a(((fr) this).field_H[var6], 15);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Status";
        field_I = "Use the buttons to choose your formation. Click OK when ready.";
    }
}
