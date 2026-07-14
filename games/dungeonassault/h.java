/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    cf field_a;
    eh field_u;
    int field_r;
    eh field_t;
    static String[] field_y;
    int field_o;
    eh field_l;
    static String field_i;
    int field_z;
    int field_c;
    int field_s;
    static ae field_h;
    static cn field_E;
    String field_F;
    int[] field_A;
    static int field_j;
    int field_B;
    int field_w;
    int field_b;
    int field_x;
    int field_m;
    static cn field_f;
    String field_G;
    String[] field_C;
    String[] field_d;
    cf field_g;
    String[][] field_k;
    cf field_p;
    static String field_n;
    eh field_e;
    static int field_q;
    eh field_v;
    String[][] field_D;

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        int var5 = pi.field_b.field_y;
        jh.c();
        gf.e(param2, param4, var5 + param2, param4 + param1);
        int var6 = 0;
        while (var6 < param1) {
            pi.field_b.c(param2, var6 + param4);
            var6 = var6 + pi.field_b.field_v;
        }
        if (!param3) {
            return;
        }
        if (!(!param0)) {
            for (var6 = 0; 8 > var6; var6++) {
                var7 = 192 + -(24 * var6);
                gf.d(param2, param4 - -var6, var5, 0, var7);
                gf.d(param2, param4 + (param1 - 1 - var6), var5, 0, var7);
            }
        }
        jh.b();
    }

    final boolean a(int param0, int param1) {
        int var5 = DungeonAssault.field_K;
        if (!(param0 != ((h) this).field_s)) {
            return true;
        }
        int var3 = 0;
        int var4 = 70 / ((-8 - param1) / 57);
        while (((h) this).field_A.length > var3) {
            if (!(((h) this).field_A[var3] != param0)) {
                return true;
            }
            var3++;
        }
        return false;
    }

    final static int a(int param0) {
        if ((dk.field_c ^ -1) <= param0) {
          L0: {
            if (hc.field_d != 0) {
              L1: {
                if (null == ia.field_U) {
                  break L1;
                } else {
                  if (ia.field_U.a(-14354)) {
                    if (!ia.field_U.c("", param0 + 3)) {
                      return 29;
                    } else {
                      if (!ia.field_U.a(false, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (fi.field_u.a(-14354)) {
                if (!fi.field_u.a(false, "commonui")) {
                  return 57;
                } else {
                  if (!kg.field_b.a(-14354)) {
                    return 71;
                  } else {
                    if (kg.field_b.a(false, "commonui")) {
                      if (!ib.field_b.a(-14354)) {
                        return 82;
                      } else {
                        if (ib.field_b.a((byte) 59)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              } else {
                return 43;
              }
            } else {
              if (!fi.field_u.a(-14354)) {
                return 20;
              } else {
                if (!fi.field_u.a(false, "commonui")) {
                  return 40;
                } else {
                  if (kg.field_b.a(-14354)) {
                    if (kg.field_b.a(false, "commonui")) {
                      if (ib.field_b.a(-14354)) {
                        if (!ib.field_b.a((byte) 59)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_n = null;
        field_i = null;
        field_y = null;
        field_E = null;
        if (param0 != 16) {
            h.a(true, 65, -49, false, 20);
        }
    }

    final static void a(int param0, nh param1, nh param2, boolean param3, nh param4) {
        im.field_b = oh.a("", -8);
        im.field_b.a(false, false);
        p.a(param2, 37, param4, param1);
        if (param0 != 8171) {
            h.a((byte) 32);
        }
        qj.a((byte) 102);
        wd.field_d = sp.field_e;
        ol.field_i = sp.field_e;
    }

    h(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ((h) this).field_B = param2;
        ((h) this).field_m = param5;
        ((h) this).field_b = param7;
        ((h) this).field_w = param0;
        ((h) this).field_z = param1;
        ((h) this).field_x = param4;
        ((h) this).field_o = param8;
        ((h) this).field_c = param3;
        ((h) this).field_r = param6;
        ((h) this).field_s = -1;
        var11 = 0;
        var12 = 0;
        L0: while (true) {
          if (var12 >= param9.length) {
            ((h) this).field_A = new int[var11];
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (param9.length <= var12) {
              } else {
                var13 = param9[var12];
                if (0 == ob.field_cc[var13]) {
                  var11++;
                  ((h) this).field_A[var11] = var13;
                  var12++;
                  continue L1;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          } else {
            var13 = param9[var12];
            if (-1 != ob.field_cc[var13]) {
              if (0 == ((h) this).field_s) {
                ((h) this).field_s = var13;
                var12++;
                continue L0;
              } else {
                throw new RuntimeException("Multiple active abilities declared for: " + ((h) this).field_w);
              }
            } else {
              var11++;
              var12++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{"Moving", "To move through the dungeon, simply <col=FF0000>left-click on an unexplored room</col>. Rooms are connected by doors. Rooms that are accessible from the party's current location are <%highlight>outlined with an orange glow</col>.<br><br><%command>Enter a new room now.</col>"};
        field_i = "Monster wins!";
        field_n = "Trolls are found throughout the swamps, making their homes in dank caves. Slow and lumbering, they are nevertheless devastating in combat and nearly impossible to kill.";
        field_h = new ae(1);
    }
}
