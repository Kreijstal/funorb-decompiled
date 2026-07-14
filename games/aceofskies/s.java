/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    int field_f;
    static String[] field_d;
    String field_j;
    static byte[] field_i;
    private int field_l;
    int[] field_k;
    int field_b;
    private String field_g;
    int field_a;
    private boolean field_e;
    static String field_h;
    private long field_c;

    final int a(int param0) {
        if (param0 == 0) {
          if (!((s) this).field_e) {
            L0: {
              if (2 != ((s) this).field_f) {
                break L0;
              } else {
                if (((s) this).field_l <= 0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if ((((s) this).field_c ^ -1L) != (lr.field_v ^ -1L)) {
              if (eo.field_a == 2) {
                if (vc.a(param0 + -8759, ((s) this).field_g)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          ((s) this).field_a = -18;
          if (!((s) this).field_e) {
            if (2 == ((s) this).field_f) {
              if (((s) this).field_l <= 0) {
                if ((((s) this).field_c ^ -1L) != (lr.field_v ^ -1L)) {
                  if (eo.field_a == 2) {
                    if (vc.a(param0 + -8759, ((s) this).field_g)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              if ((((s) this).field_c ^ -1L) != (lr.field_v ^ -1L)) {
                if (eo.field_a == 2) {
                  if (vc.a(param0 + -8759, ((s) this).field_g)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 2;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -86 % ((param0 - 49) / 51);
        field_h = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 118) {
          field_d = (String[]) null;
          L0: while (true) {
            param6--;
            if (0 <= param6) {
              var19 = param3;
              var17 = var19;
              var10 = var17;
              var11 = param7;
              var12 = param1;
              var13 = param9;
              var14 = param2;
              var15 = (var19[var11] & 16711422) >> 1559202625;
              var10[var11] = var15 + (pg.a(33423360, var12) >> 1176971969) + ((pg.a(33423495, var13) >> 2073497577) + pg.a(var14 >> 1114604145, 255));
              param1 = param1 + param8;
              param9 = param9 + param5;
              param2 = param2 + param4;
              param7++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param6--;
            if (0 <= param6) {
              var18 = param3;
              var17 = var18;
              var10 = var17;
              var11 = param7;
              var12 = param1;
              var13 = param9;
              var14 = param2;
              var15 = (var18[var11] & 16711422) >> 1559202625;
              var10[var11] = var15 + (pg.a(33423360, var12) >> 1176971969) + ((pg.a(33423495, var13) >> 2073497577) + pg.a(var14 >> 1114604145, 255));
              param1 = param1 + param8;
              param9 = param9 + param5;
              param2 = param2 + param4;
              param7++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        tn.a(1, param1, param0, param2);
    }

    s(boolean param0) {
        ((s) this).field_c = pe.field_g;
        ((s) this).field_j = ep.field_x;
        ((s) this).field_g = tn.field_t;
        ((s) this).field_a = jt.field_t;
        ((s) this).field_f = m.field_f;
        ((s) this).field_e = sj.field_b;
        ((s) this).field_l = km.field_b;
        if (param0) {
            ((s) this).field_k = ku.field_e;
        } else {
            ((s) this).field_k = null;
        }
        ((s) this).field_b = ot.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"explosion1", "explosion2", "explosion3", "big plane explosion", "ufo explosion_fall", "ufo explosion_impact"};
        field_i = new byte[520];
        field_h = "Resume Game";
    }
}
