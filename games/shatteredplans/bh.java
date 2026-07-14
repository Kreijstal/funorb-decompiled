/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends oh {
    static boolean field_j;
    static String field_r;
    static String field_n;
    int field_q;
    static cp field_p;
    static qr field_k;
    int field_l;
    int field_o;
    static bi[] field_m;
    static int field_h;
    int field_i;

    final boolean a(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 == 16548) {
          if (param2 >= ((bh) this).field_l) {
            if (((bh) this).field_q <= param1) {
              if (param2 < ((bh) this).field_o) {
                if (param1 >= ((bh) this).field_i) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var5 = null;
          String discarded$4 = bh.a((String) null, (bc) null, (byte) 81, (String) null, (String) null);
          if (param2 >= ((bh) this).field_l) {
            if (((bh) this).field_q <= param1) {
              if (param2 < ((bh) this).field_o) {
                if (param1 >= ((bh) this).field_i) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_n = null;
        field_m = null;
        if (param0 != 0) {
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_p = null;
          field_k = null;
          return;
        }
    }

    final static String a(String param0, bc param1, byte param2, String param3, String param4) {
        if (param2 <= 7) {
            Object var6 = null;
            String discarded$4 = bh.a((String) null, (bc) null, (byte) -117, (String) null, (String) null);
            if (!(param1.b((byte) -109))) {
                return param3;
            }
            return param4 + " - " + param1.a(param0, (byte) 33) + "%";
        }
        if (!(param1.b((byte) -109))) {
            return param3;
        }
        return param4 + " - " + param1.a(param0, (byte) 33) + "%";
    }

    final static String d(int param0) {
        Object var2 = null;
        if (ue.field_a != ee.field_l) {
          if (ue.field_a != fj.field_s) {
            if (!wh.field_a.b(14)) {
              return gp.field_b;
            } else {
              if (param0 >= -61) {
                var2 = null;
                String discarded$2 = bh.a((String) null, (bc) null, (byte) 30, (String) null, (String) null);
                return qh.field_B;
              } else {
                return qh.field_B;
              }
            }
          } else {
            return gp.field_b;
          }
        } else {
          return um.field_j;
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 < -36) {
          ai.a(param0, true, 0, wm.field_c, (byte) -60, ef.field_a, us.field_b);
          var2 = 0;
          L0: while (true) {
            if (wm.field_c <= var2) {
              ai.a(param0 + param0, false, param0, wm.field_c + param0, (byte) -60, ff.field_u, s.field_e);
              if (wm.field_c <= param0) {
                return;
              } else {
                wm.field_c = param0;
                return;
              }
            } else {
              lg.field_d[var2 + param0] = var2;
              var2++;
              continue L0;
            }
          }
        } else {
          var4 = null;
          String discarded$1 = bh.a((String) null, (bc) null, (byte) -45, (String) null, (String) null);
          ai.a(param0, true, 0, wm.field_c, (byte) -60, ef.field_a, us.field_b);
          var2 = 0;
          L1: while (true) {
            if (wm.field_c <= var2) {
              ai.a(param0 + param0, false, param0, wm.field_c + param0, (byte) -60, ff.field_u, s.field_e);
              if (wm.field_c <= param0) {
                return;
              } else {
                wm.field_c = param0;
                return;
              }
            } else {
              lg.field_d[var2 + param0] = var2;
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0, String param1, String param2) {
        ai.a(false, -1, param2, param1);
        int var3 = 19 % ((param0 - 37) / 41);
    }

    public bh() {
    }

    bh(int param0, int param1, int param2, int param3) {
        ((bh) this).field_q = param1;
        ((bh) this).field_i = param3;
        ((bh) this).field_l = param0;
        ((bh) this).field_o = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_r = "Rating";
        field_p = null;
        field_n = "Day";
    }
}
