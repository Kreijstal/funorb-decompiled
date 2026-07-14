/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_h;
    int[] field_f;
    int field_g;
    static int field_k;
    static int field_l;
    static dj field_c;
    static qb field_b;
    static String field_j;
    static vn field_d;
    static int field_i;
    int field_e;
    static String field_a;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (((vd) this).field_f != null) {
            // if_icmpeq L26
        } else {
            return 0;
        }
        for (var3 = 1; var3 < ((vd) this).field_f.length; var3++) {
            if (param0 < ((vd) this).field_f[var3] + ((vd) this).field_f[var3 + -1] >> -959517631) {
                return -1 + var3;
            }
        }
        if (param1 <= 15) {
            field_i = -71;
        }
        return -1 + ((vd) this).field_f.length;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 < 120) {
            Object var5 = null;
            vd.a(true, (wk) null, (java.math.BigInteger) null, (wk) null, (java.math.BigInteger) null);
        }
        qn.a(ra.field_h, -115, ga.field_r, param2, param3, param0, dh.field_Gb);
    }

    final static void a(boolean param0, wk param1, java.math.BigInteger param2, wk param3, java.math.BigInteger param4) {
        we.a(param4, 0, param3.field_j, param1, 0, param2, param3.field_g);
        if (param0) {
            vd.a(-96, -100, -118, true);
        }
    }

    final static void a(jg param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        if (param1 == -74) {
          L0: while (true) {
            if (3 <= var2) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= gb.field_f) {
                  bm.field_d[param0.b(-21)] = bm.field_d[param0.b(-21)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (var3 >= gb.field_f) {
                      gb.field_f = var2;
                      gb.field_f = gb.field_f + 1;
                      g.field_d[gb.field_f] = param0;
                      return;
                    } else {
                      L3: {
                        if (param0.field_m != g.field_d[var3].field_m) {
                          break L3;
                        } else {
                          var4 = g.field_d[var3].b(-109);
                          if (bm.field_d[var4] > hj.field_b) {
                            bm.field_d[var4] = bm.field_d[var4] - 1;
                            var3++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2++;
                      g.field_d[var2] = g.field_d[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (g.field_d[var2].field_m == param0.field_m) {
                    bm.field_d[g.field_d[var2].b(-62)] = bm.field_d[g.field_d[var2].b(-62)] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              bm.field_d[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            Object var2 = null;
            vd.a((jg) null, (byte) -101);
        }
        field_d = null;
    }

    vd(int param0, int param1, int param2) {
        ((vd) this).field_f = new int[1 + param2];
        ((vd) this).field_e = param1;
        ((vd) this).field_g = param0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -107) {
            break L0;
          } else {
            vd.a(-125);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((vd) this).field_f == null) {
              break L2;
            } else {
              if (0 != ((vd) this).field_f.length) {
                stackOut_6_0 = ((vd) this).field_f[((vd) this).field_f.length + -1];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_k = 480;
        field_j = "Well done! You have completed your training and are now ready for online play. The sandbox is open to you to test out your spells. Any spell your Arcanist has been equipped with on the 'Spell Selection' screen will be available for you to try out here. Have fun!";
        field_a = "Suggest muting this player";
    }
}
