/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static String[] field_b;
    static ic field_e;
    static float[][][] field_c;
    static String[] field_d;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = (float[][][]) null;
        field_d = null;
        field_e = null;
        if (param0 > -37) {
          return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var6Lifetime4;
        int var7Lifetime4;
        int var7Lifetime5;
        var8 = Kickabout.field_G;
        if (up.field_p < 0) {
          return;
        }
        if (param2 < 31) {
          field_a = (String) null;
          var3 = param0 - 135;
          var4 = -35 + param1;
          var5 = 256;
          if (up.field_p < 75) {
            var5 = (up.field_p << 8) / 75;
          }
          if (up.field_p > 200) {
            var5 = (-up.field_p + 250 << 8) / 50;
          }
          iw.a(110, ti.field_f);
          t.c();
          on.b();
          fp.a((byte) 47);
          if (256 > var5) {
            on.a(0, 0, on.field_g, on.field_f, 0, 256 - var5);
          }
          ta.e(122);
          if (up.field_p >= 150) {
            js.field_a.b(var3 + 15, var4 + 10, var5);
          } else {
            ti.field_f.f(var3, var4);
          }
          var6 = -125 + up.field_p;
          if (0 < var6) {
            if (var6 >= 50) {
              var6 = -140 + up.field_p;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                po.field_e.b(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
              return;
            }
            if (20 > var6) {
              var7Lifetime5 = var6 * 256 / 20;
              tm.field_v.c(var3, var4, var7Lifetime5);
            } else {
              if (var6 >= 30) {
                var7Lifetime5 = (-(var6 * 256) + 12800) / 20;
                tm.field_v.c(var3, var4, var7Lifetime5);
              } else {
                tm.field_v.c(var3, var4, 256);
              }
            }
          }
          var6Lifetime4 = -140 + up.field_p;
          if (0 < var6Lifetime4) {
            var7Lifetime4 = 256;
            if (var6Lifetime4 < 20) {
              var7Lifetime4 = 256 * var6Lifetime4 / 20;
            }
            po.field_e.b(15 + var3, 10 + var4, var5 * var7Lifetime4 >> 8);
          }
          return;
        }
        var3Lifetime1 = param0 - 135;
        var4Lifetime1 = -35 + param1;
        var5Lifetime1 = 256;
        if (up.field_p < 75) {
          var5Lifetime1 = (up.field_p << 8) / 75;
        }
        if (up.field_p > 200) {
          var5Lifetime1 = (-up.field_p + 250 << 8) / 50;
        }
        iw.a(110, ti.field_f);
        t.c();
        on.b();
        fp.a((byte) 47);
        if (256 > var5Lifetime1) {
          on.a(0, 0, on.field_g, on.field_f, 0, 256 - var5Lifetime1);
        }
        ta.e(122);
        if (up.field_p >= 150) {
          js.field_a.b(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1);
          var6Lifetime1 = -125 + up.field_p;
          if (0 >= var6Lifetime1) {
            var6Lifetime1 = -140 + up.field_p;
            if (0 < var6Lifetime1) {
              var7Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1 = 256 * var6Lifetime1 / 20;
              }
              po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime1 >> 8);
            }
          } else {
            if (var6Lifetime1 >= 50) {
              var6Lifetime1 = -140 + up.field_p;
              if (0 < var6Lifetime1) {
                var7Lifetime1 = 256;
                if (var6Lifetime1 < 20) {
                  var7Lifetime1 = 256 * var6Lifetime1 / 20;
                }
                po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime1 >> 8);
              }
            } else {
              if (20 > var6Lifetime1) {
                var7Lifetime1 = var6Lifetime1 * 256 / 20;
                tm.field_v.c(var3Lifetime1, var4Lifetime1, var7Lifetime1);
                var6Lifetime1 = -140 + up.field_p;
                if (0 < var6Lifetime1) {
                  var7Lifetime1 = 256;
                  if (var6Lifetime1 < 20) {
                    var7Lifetime1 = 256 * var6Lifetime1 / 20;
                  }
                  po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime1 >> 8);
                }
              } else {
                if (var6Lifetime1 < 30) {
                  tm.field_v.c(var3Lifetime1, var4Lifetime1, 256);
                  var6Lifetime1 = -140 + up.field_p;
                  if (0 < var6Lifetime1) {
                    var7Lifetime1 = 256;
                    if (var6Lifetime1 < 20) {
                      var7Lifetime1 = 256 * var6Lifetime1 / 20;
                    }
                    po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime1 >> 8);
                  }
                } else {
                  var7Lifetime1 = (-(var6Lifetime1 * 256) + 12800) / 20;
                  tm.field_v.c(var3Lifetime1, var4Lifetime1, var7Lifetime1);
                  var6Lifetime1 = -140 + up.field_p;
                  if (0 < var6Lifetime1) {
                    var7Lifetime1 = 256;
                    if (var6Lifetime1 < 20) {
                      var7Lifetime1 = 256 * var6Lifetime1 / 20;
                    }
                    po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime1 >> 8);
                  }
                }
              }
            }
          }
          return;
        }
        ti.field_f.f(var3Lifetime1, var4Lifetime1);
        var6Lifetime2 = -125 + up.field_p;
        if (0 < var6Lifetime2 &&
          var6Lifetime2 < 50) {
          if (20 > var6Lifetime2) {
            var7Lifetime2 = var6Lifetime2 * 256 / 20;
            tm.field_v.c(var3Lifetime1, var4Lifetime1, var7Lifetime2);
          } else {
            if (var6Lifetime2 < 30) {
              tm.field_v.c(var3Lifetime1, var4Lifetime1, 256);
            } else {
              var7Lifetime2 = (-(var6Lifetime2 * 256) + 12800) / 20;
              tm.field_v.c(var3Lifetime1, var4Lifetime1, var7Lifetime2);
            }
          }
        }
        var6Lifetime3 = -140 + up.field_p;
        if (0 < var6Lifetime3) {
          var7Lifetime3 = 256;
          if (var6Lifetime3 < 20) {
            var7Lifetime3 = 256 * var6Lifetime3 / 20;
          }
          po.field_e.b(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1 * var7Lifetime3 >> 8);
        }
        return;
    }

    static {
        field_b = new String[]{"Empty", "POW +2", "POW +4", "POW +7", "TCK +2", "TCK +4", "TCK +7", "SPD +2", "SPD +4", "SPD +7", "POW +2 TCK -2", "POW +4 TCK -2", "POW +4 TCK +2", "POW +7 TCK -2", "POW +7 TCK +2", "POW +7 TCK +4", "POW +2 SPD -2", "POW +4 SPD -2", "POW +4 SPD +2", "POW +7 SPD -2", "POW +7 SPD +2", "POW +7 SPD +4", "SPD +2 TCK -2", "SPD +4 TCK -2", "SPD +4 TCK +2", "SPD +7 TCK -2", "SPD +7 TCK +2", "SPD +7 TCK +4", "SPD +2 POW -2", "SPD +4 POW -2", "SPD +4 POW +2", "SPD +7 POW -2", "SPD +7 POW +2", "SPD +7 POW +4", "TCK +2 SPD -2", "TCK +4 SPD -2", "TCK +4 SPD +2", "TCK +7 SPD -2", "TCK +7 SPD +2", "TCK +7 SPD +4", "TCK +2 POW -2", "TCK +4 POW -2", "TCK +4 POW +2", "TCK +7 POW -2", "TCK +7 POW +2", "TCK +7 POW +4", "EXP +2%", "EXP +4%", "EXP +6%", "EXP +8%", "MONEY +1%", "MONEY +2%", "MONEY +3%", "MONEY +4%", "SAFE TACKLER", "IMMUNITY", "SHIN PADS", "STUDS UP", "KNOCK-OUT", "TANK CLONE", "HOTSHOT CLONE", "RANGER CLONE", "SLALOM", "CHEAT: WHEREAMI", "CHEAT: MUSHROOM", "CHEAT: MOONWALK", "CHEAT: AIRPLANE", "CHEAT: ATOMBALL", "CHEAT: TRAMLINE", "CHEAT: TORQUING", "CHEAT: MOONBALL", "CHEAT: ASTEROID", "CHEAT: PUMPKINS", "COSTUME: HORROR"};
        field_e = new ic();
        field_c = new float[3][4][6];
        field_c[0][0][4] = 2.0f;
        field_c[0][0][5] = 1.0f;
        field_c[0][0][0] = 0.05000000074505806f;
        field_c[0][0][3] = 4.0f;
        field_c[0][0][1] = 0.699999988079071f;
        field_c[0][0][2] = 50.0f;
        field_c[0][1][0] = 0.05000000074505806f;
        field_c[0][1][5] = 1.0f;
        field_c[0][1][2] = 50.0f;
        field_c[0][1][4] = 2.0f;
        field_c[0][1][3] = 4.0f;
        field_c[0][1][1] = 0.699999988079071f;
        field_c[0][2][2] = 35.0f;
        field_c[0][2][3] = 4.0f;
        field_c[0][2][5] = 1.0f;
        field_c[0][2][1] = 0.8500000238418579f;
        field_c[0][2][0] = 0.05000000074505806f;
        field_c[0][2][4] = 2.0f;
        field_c[0][3][3] = 4.0f;
        field_c[0][3][1] = 0.8500000238418579f;
        field_c[0][3][2] = 35.0f;
        field_c[0][3][5] = 1.0f;
        field_c[0][3][4] = 2.0f;
        field_c[0][3][0] = 0.05000000074505806f;
        field_c[1][0][2] = 50.0f;
        field_c[1][0][0] = 0.05000000074505806f;
        field_c[1][0][3] = 4.0f;
        field_c[1][0][1] = 0.699999988079071f;
        field_c[1][0][4] = 3.0f;
        field_c[1][0][5] = 0.5f;
        field_c[1][1][3] = 4.0f;
        field_c[1][1][1] = 0.699999988079071f;
        field_c[1][1][5] = 0.5f;
        field_c[1][1][2] = 50.0f;
        field_c[1][1][4] = 3.0f;
        field_c[1][1][0] = 0.05000000074505806f;
        field_c[1][2][1] = 0.8500000238418579f;
        field_c[1][2][2] = 35.0f;
        field_c[1][2][5] = 1.0f;
        field_c[1][2][4] = 2.0f;
        field_c[1][2][0] = 0.05000000074505806f;
        field_c[1][2][3] = 4.0f;
        field_c[1][3][0] = 0.05000000074505806f;
        field_c[1][3][4] = 2.0f;
        field_c[1][3][2] = 35.0f;
        field_c[1][3][5] = 1.0f;
        field_c[1][3][3] = 4.0f;
        field_c[1][3][1] = 0.8500000238418579f;
        field_c[2][0][0] = 0.05000000074505806f;
        field_c[2][0][4] = 2.0f;
        field_c[2][0][1] = 0.800000011920929f;
        field_c[2][0][2] = 50.0f;
        field_c[2][0][3] = 4.0f;
        field_c[2][0][5] = 1.0f;
        field_c[2][1][1] = 0.800000011920929f;
        field_c[2][1][5] = 1.0f;
        field_c[2][1][0] = 0.05000000074505806f;
        field_c[2][1][4] = 2.0f;
        field_c[2][1][3] = 4.0f;
        field_c[2][1][2] = 50.0f;
        field_c[2][2][2] = 35.0f;
        field_c[2][2][5] = 1.0f;
        field_c[2][2][0] = 0.05000000074505806f;
        field_c[2][2][4] = 2.0f;
        field_c[2][2][3] = 4.0f;
        field_c[2][2][1] = 0.8500000238418579f;
        field_c[2][3][0] = 0.05000000074505806f;
        field_c[2][3][3] = 4.0f;
        field_c[2][3][1] = 0.8500000238418579f;
        field_c[2][3][4] = 2.0f;
        field_c[2][3][5] = 1.0f;
        field_c[2][3][2] = 35.0f;
        field_a = "Tournament starts in <%0> seconds...";
    }
}
