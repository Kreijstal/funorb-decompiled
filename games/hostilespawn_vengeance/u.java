/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static je field_d;
    static String field_c;
    int field_i;
    static String field_g;
    static int field_e;
    static String field_a;
    static String field_j;
    static String[] field_f;
    static bd field_h;
    static String field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_g = null;
        field_c = null;
        field_d = null;
        if (!param0) {
          return;
        } else {
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    final static void a(oc param0, oc param1, int param2, int param3) {
        if (!q.field_g.a((byte) -117)) {
          qj.a(-114, param2, param0, param1);
          t.c(param3 + -19706);
          if (null != vi.field_p[0]) {
            if (8 == vi.field_p[0].field_i) {
              if ((vi.field_p[0].field_I ^ -1) < -1) {
                if (!vi.field_p[0].field_n) {
                  nl.field_b = 180;
                  if (param3 != 0) {
                    u.a(true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  nl.field_b = 256;
                  if (param3 != 0) {
                    u.a(true);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param3 != 0) {
                  u.a(true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param3 != 0) {
                u.a(true);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 != 0) {
              u.a(true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 0) {
            u.a(true);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, oc param1, boolean param2, int param3, og param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var6 = 256 / param3;
        var7 = (int)((double)var6 * Math.random());
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            if (!param2) {
              u.a(true);
              return;
            } else {
              return;
            }
          } else {
            jn.field_F[ib.field_c].field_c = (double)(var7 + var8);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
            jn.field_F[ib.field_c].field_l.a(param4, -28860);
            jn.field_F[ib.field_c].field_l.b(12.0, (double)var8, 118);
            jn.field_F[ib.field_c].b((byte) 117);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = param5;
            ib.field_c = ib.field_c + 1;
            jn.field_F[ib.field_c].field_c = (double)(var8 + var7);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
            jn.field_F[ib.field_c].field_l.a(param4, -28860);
            jn.field_F[ib.field_c].field_l.b(12.0, (double)var8, 126);
            jn.field_F[ib.field_c].b((byte) 117);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = param0;
            ib.field_c = ib.field_c + 1;
            var8 = var8 + var6;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Opens the pause console, which also provides you with a map.";
        field_d = new je();
        field_g = "Enter the name you'd prefer. This is the name displayed to other players.";
        bd discarded$0 = new bd(640, 480);
        field_a = "Create a free account to start using this feature";
        field_e = 0;
        field_b = "More eggs. I might have to do something about these.";
    }
}
