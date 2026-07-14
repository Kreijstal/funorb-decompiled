/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements jm {
    static tk field_a;
    static String[] field_b;
    static String field_c;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        int var2 = 0;
        r var3 = null;
        var2 = Chess.field_G;
        ud.field_b = false;
        pd.field_Rb = null;
        ib.field_d = null;
        if (param0) {
          L0: {
            if (null != bb.field_d) {
              bb.field_d.e(-31023);
              bb.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            d.field_Mb = null;
            if (null != nk.field_t) {
              nk.field_t.e(-31023);
              nk.field_t = null;
              break L1;
            } else {
              break L1;
            }
          }
          ae.field_f = null;
          if (null == pd.field_Sb) {
            cm.field_v = null;
            if (null != d.field_Mb) {
              var3 = (r) (Object) d.field_Mb.a(false);
              L2: while (true) {
                if (var3 == null) {
                  d.field_Mb = null;
                  return;
                } else {
                  var3.d(-1);
                  var3 = (r) (Object) d.field_Mb.a(0);
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            pd.field_Sb.e(-31023);
            pd.field_Sb = null;
            cm.field_v = null;
            if (null != d.field_Mb) {
              var3 = (r) (Object) d.field_Mb.a(false);
              L3: while (true) {
                if (var3 == null) {
                  d.field_Mb = null;
                  return;
                } else {
                  var3.d(-1);
                  var3 = (r) (Object) d.field_Mb.a(0);
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var6 = 0;
        int var7 = 0;
        km var8 = null;
        if (param0 >= 58) {
          var6 = param1 + param4.field_u;
          var7 = param4.field_r + param2;
          vj.a(var7, param4.field_C, param4.field_y, (byte) 119, var6);
          var8 = uh.field_p[1];
          if (param4 instanceof fb) {
            if (!((fb) (Object) param4).field_I) {
              L0: {
                if (param4.d((byte) -67)) {
                  rc.a(param4.field_C - 4, false, var6 - -2, param4.field_y - 4, 2 + var7);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var8.d((param4.field_y - var8.field_v >> 1488190753) + (var6 - -1), (-var8.field_u + param4.field_C >> 492452417) + 1 + var7, 256);
                if (param4.d((byte) -67)) {
                  rc.a(param4.field_C - 4, false, var6 - -2, param4.field_y - 4, 2 + var7);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param4.d((byte) -67)) {
                rc.a(param4.field_C - 4, false, var6 - -2, param4.field_y - 4, 2 + var7);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0) {
          field_e = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        in.a((byte) 123, param0, false);
        if (param1 > -121) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_a = new tk();
        field_c = "Go Back";
        field_d = "To <%0>: ";
        field_e = "Unable to delete name - system busy";
    }
}
