/*
 * Decompiled by CFR-JS 0.4.0.
 */
class r extends um {
    static int field_z;
    static String field_B;
    static int field_w;
    static int field_x;
    static boolean field_A;
    static String field_y;
    static String field_v;
    static int[] field_C;

    public static void d(byte param0) {
        field_C = null;
        field_v = null;
        field_y = null;
        field_B = null;
        if (param0 < 50) {
            field_v = null;
        }
    }

    final static String a(byte param0, String param1) {
        int var2 = 0;
        if (param0 < 72) {
          L0: {
            int discarded$1 = r.a((byte) 33, 79);
            var2 = qp.a(kb.field_Yb, gh.field_f, (byte) -22);
            if ((var2 ^ -1) != -2) {
              break L0;
            } else {
              param1 = "<img=0>" + param1;
              break L0;
            }
          }
          L1: {
            if (var2 == 2) {
              param1 = "<img=1>" + param1;
              break L1;
            } else {
              break L1;
            }
          }
          return param1;
        } else {
          L2: {
            var2 = qp.a(kb.field_Yb, gh.field_f, (byte) -22);
            if ((var2 ^ -1) != -2) {
              break L2;
            } else {
              param1 = "<img=0>" + param1;
              break L2;
            }
          }
          L3: {
            if (var2 == 2) {
              param1 = "<img=1>" + param1;
              break L3;
            } else {
              break L3;
            }
          }
          return param1;
        }
    }

    r(int param0) {
        this(a.field_u, param0);
    }

    final static boolean c(byte param0) {
        if (param0 < -80) {
          if (qg.field_A >= 20) {
            if (kb.i(7457)) {
              if (fp.field_x > 0) {
                if (am.i(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$5 = r.c((byte) 16);
          if (qg.field_A >= 20) {
            if (kb.i(7457)) {
              if (fp.field_x > 0) {
                if (am.i(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    r(dh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> -1879900607;
        var2 = var2 | var2 >>> -1868646719;
        if (param0 != -82) {
          field_B = null;
          var2 = var2 | var2 >>> 92808482;
          var2 = var2 | var2 >>> -2046828252;
          var2 = var2 | var2 >>> -411973752;
          var2 = var2 | var2 >>> -1182260144;
          return (var2 ^ -1) & param1;
        } else {
          var2 = var2 | var2 >>> 92808482;
          var2 = var2 | var2 >>> -2046828252;
          var2 = var2 | var2 >>> -411973752;
          var2 = var2 | var2 >>> -1182260144;
          return (var2 ^ -1) & param1;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        if (param1 != -20618) {
          return;
        } else {
          L0: {
            if (param0) {
              ig.b(param3.field_s, param3.field_o + param2, param3.field_t, param4 + param3.field_w, -17634);
              break L0;
            } else {
              break L0;
            }
          }
          super.a(param0, param1 ^ 0, param2, param3, param4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
        field_w = 480;
        field_y = "You are invited to <%0>'s game.";
        field_v = "Options";
        field_C = new int[5];
        field_B = "Report abuse";
    }
}
