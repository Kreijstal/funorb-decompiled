/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    private String field_g;
    static int field_e;
    static int field_f;
    static String field_b;
    private boolean field_a;
    static String field_d;
    private boolean field_c;

    public static void c(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            field_f = 58;
        }
    }

    final boolean b(int param0) {
        if (param0 != 96) {
            field_e = -42;
            return ((ac) this).field_a;
        }
        return ((ac) this).field_a;
    }

    final static id a(long param0, int param1) {
        if (param1 != 2) {
            return null;
        }
        return (id) (Object) BrickABrac.field_F.a(param0, -1);
    }

    final void a(boolean param0, int param1) {
        ((ac) this).field_c = param0 ? true : false;
        ((ac) this).field_a = true;
        if (param1 != 20892) {
            field_f = -25;
        }
    }

    final String a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((ac) this).field_g;
    }

    final boolean a(boolean param0) {
        if (param0) {
            String discarded$0 = ((ac) this).a(62);
            return ((ac) this).field_c;
        }
        return ((ac) this).field_c;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, byte param9, boolean param10, int param11, int param12, int param13) {
        ep.field_e = null;
        bl.f(0);
        param3 = h.a(param11, param0, param1, (byte) -126, param8, param3, param7);
        c.a(param13, param12, param11, param6, param2, (byte) 126, param4, param10, param3, param5);
        sq.a(param2, param13, -126);
        if (param9 != -113) {
          return;
        } else {
          wg.a(param13, param7, -1, param3);
          return;
        }
    }

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param0 != null) {
          if (param3 > 0) {
            var6 = param0[0].field_x;
            var7 = param0[2].field_x;
            var8 = param0[1].field_x;
            param0[0].e(param2, param1, param4);
            param0[2].e(param3 + (param2 - var7), param1, param4);
            lb.a(pb.field_n);
            lb.d(param2 + var6, param1, -var7 + param2 + param3, param1 - -param0[1].field_z);
            var9 = param2 - -var6;
            var10 = -var7 + param3 + param2;
            if (param5 <= 121) {
              field_f = 55;
              param2 = var9;
              L0: while (true) {
                if (param2 >= var10) {
                  lb.b(pb.field_n);
                  return;
                } else {
                  param0[1].e(param2, param1, param4);
                  param2 = param2 + var8;
                  continue L0;
                }
              }
            } else {
              param2 = var9;
              L1: while (true) {
                if (param2 >= var10) {
                  lb.b(pb.field_n);
                  return;
                } else {
                  param0[1].e(param2, param1, param4);
                  param2 = param2 + var8;
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

    ac(String param0) {
        ((ac) this).field_a = false;
        ((ac) this).field_c = false;
        ((ac) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_f = 96;
        field_b = "Hide private chat and appear offline to friends";
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
