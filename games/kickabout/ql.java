/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_a;
    static String field_d;
    static String[] field_c;
    static String field_b;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = -123 % ((param1 - 43) / 55);
        if (!(0 == (param0 & 7))) {
            var2 = 8 - (7 & param0);
        }
        int var4 = var2 + param0;
        return var4;
    }

    final static void a(int param0) {
        Object var2 = null;
        if (param0 != 31663) {
          var2 = null;
          ql.a((byte) 32, false, (String) null);
          np.field_Jb.a((gn) (Object) new ha(), 3);
          return;
        } else {
          np.field_Jb.a((gn) (Object) new ha(), 3);
          return;
        }
    }

    final static av a(String param0, int param1, int param2) {
        dq var3 = null;
        Object var4 = null;
        var3 = new dq();
        if (param2 != -13067) {
          var4 = null;
          ql.a(true, (String) null, (String) null, 68);
          ((av) (Object) var3).field_a = param1;
          ((av) (Object) var3).field_c = param0;
          return (av) (Object) var3;
        } else {
          ((av) (Object) var3).field_a = param1;
          ((av) (Object) var3).field_c = param0;
          return (av) (Object) var3;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != 7) {
          var2 = null;
          av discarded$2 = ql.a((String) null, 72, 40);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1, String param2) {
        eq.field_a = we.field_c;
        sq.field_G = param1 ? true : false;
        if (param0 <= 11) {
            Object var4 = null;
            ql.a(true, (String) null, (String) null, -26);
        }
    }

    final static void a(boolean param0, String param1, String param2, int param3) {
        if (param3 != 3960) {
            return;
        }
        ep.field_b = param2;
        ma.field_y = param1;
        ku.a(dh.field_g, 4, param0);
    }

    final static void a(byte param0, boolean param1, int[] param2) {
        int var3 = 0;
        if (param0 == 96) {
          var3 = al.a(false, (byte) 71);
          if (4 != vt.field_c.field_u) {
            if (u.field_c) {
              kt.b((byte) -85);
              return;
            } else {
              return;
            }
          } else {
            sk.a(1, var3);
            od.a(param2, var3, vt.field_c.field_R, 14839);
            if (vu.field_Cb == -2) {
              ig.a(param1, 16777215, var3);
              if (u.field_c) {
                kt.b((byte) -85);
                return;
              } else {
                return;
              }
            } else {
              if (!vt.field_c.field_R[vu.field_Cb].d(3511)) {
                ig.a(param1, 16777215, var3);
                if (u.field_c) {
                  kt.b((byte) -85);
                  return;
                } else {
                  return;
                }
              } else {
                if (u.field_c) {
                  kt.b((byte) -85);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          field_d = null;
          var3 = al.a(false, (byte) 71);
          if (4 == vt.field_c.field_u) {
            sk.a(1, var3);
            od.a(param2, var3, vt.field_c.field_R, 14839);
            if (vu.field_Cb == -2) {
              ig.a(param1, 16777215, var3);
              if (!u.field_c) {
                return;
              } else {
                kt.b((byte) -85);
                return;
              }
            } else {
              if (!vt.field_c.field_R[vu.field_Cb].d(3511)) {
                ig.a(param1, 16777215, var3);
                if (!u.field_c) {
                  return;
                } else {
                  kt.b((byte) -85);
                  return;
                }
              } else {
                if (!u.field_c) {
                  return;
                } else {
                  kt.b((byte) -85);
                  return;
                }
              }
            }
          } else {
            if (!u.field_c) {
              return;
            } else {
              kt.b((byte) -85);
              return;
            }
          }
        }
    }

    final static void a(Object[] param0, sr param1, byte param2) {
        oh.a(param1, -1 + param0.length, param0, 29921, 0);
        int var3 = -63 % ((77 - param2) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
        field_b = "Email address is unavailable";
        field_d = "Reload game";
        field_c = new String[]{"Last 30 mins", "Under 1 hr", "Under 2 hrs", "Under 3 hrs", "Under 4 hrs", "Under 6 hrs", "Under 12 hrs", "Under 24 hrs", "Under 2 days", "Under 3 days", "Over 3 days"};
    }
}
