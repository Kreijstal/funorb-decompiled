/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends java.awt.Canvas {
    static mk field_a;
    private java.awt.Component field_d;
    static String[] field_e;
    static String field_c;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -104) {
            Object var2 = null;
            pg.a((byte) 1, (db) null, false, (db) null, (db) null);
        }
        field_e = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = CrazyCrystals.field_B;
        if (param2 != -2) {
            field_a = null;
        }
        int var3 = 1;
        while ((param1 ^ -1) < -2) {
            if (!(0 == (1 & param1))) {
                var3 = var3 * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
        }
        if (!(param1 != 1)) {
            return param0 * var3;
        }
        return var3;
    }

    final static void a(byte param0, db param1, boolean param2, db param3, db param4) {
        if (param0 >= -96) {
            Object var6 = null;
            pg.a((byte) 43, (db) null, false, (db) null, (db) null);
        }
        gk.field_e = lc.a("", (byte) 51);
        gk.field_e.a(106, false);
        e.a(4, param1, param4, param3);
        hm.a(-3121);
        sg.field_b = tl.field_e;
        lc.field_c = tl.field_e;
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, un param4, int param5) {
        al[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        al[] var10 = null;
        gb var11 = null;
        var9 = CrazyCrystals.field_B;
        if (param4.b(5)) {
          L0: {
            if (param5 != 0) {
              break L0;
            } else {
              var10 = ri.a(param4, (byte) 27);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param2 == var10[var8].field_i) {
                      if (param1 == var10[var8].field_g) {
                        L2: {
                          if (0 == param3) {
                            break L2;
                          } else {
                            if (var10[var8].field_e == param3) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param5 < var10[var8].field_b) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param5 = var10[var8].field_b;
                        var7_int = 1;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param4.a(param2, param1, param5, param3, (byte) 4);
          L4: while (true) {
            if (0 != var11.field_a) {
              var7 = (java.awt.Frame) var11.field_b;
              if (var7 != null) {
                var8 = 101 % ((param0 - 14) / 62);
                if (2 != var11.field_a) {
                  return var7;
                } else {
                  bo.a(param4, var7, 1);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              fh.a(true, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((pg) this).field_d.update(param0);
    }

    pg(java.awt.Component param0) {
        ((pg) this).field_d = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((pg) this).field_d.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Teleroom", "Sacrifice", "Crystal Beyond", "Shufflesworth", "City", "Double Trouble", "Mining", "Bomb Tower", "The Pit", "Come Again Rock", "Which Way?", "Stop Pushing!"};
        field_c = "Create your own free Jagex account";
        field_b = "Play free version";
        field_a = new mk();
    }
}
