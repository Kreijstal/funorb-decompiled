/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static tp field_e;
    static int field_a;
    private tc field_c;
    private at field_b;
    static String field_d;
    private bb field_f;
    static je field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = op.field_c[0][param1];
        var6 = var5 << 1763283489 & 105984 | (13566159 & var5) << 1511467521;
        param0 += 16;
        var7 = 3;
        if (param3 >= 62) {
          L0: {
            if (cu.field_a) {
              break L0;
            } else {
              var7 = 2;
              break L0;
            }
          }
          var8 = -64;
          L1: while (true) {
            if (-17 >= (var8 ^ -1)) {
              if (!cu.field_a) {
                return;
              } else {
                var8 = -59;
                L2: while (true) {
                  if (8 <= var8) {
                    return;
                  } else {
                    L3: {
                      var9 = var8;
                      if (var9 < 0) {
                        var9 = 256 - -(var9 << -1389438334);
                        break L3;
                      } else {
                        var9 = -(var9 * var9 << 334418115) + 256;
                        break L3;
                      }
                    }
                    var10 = var8 / 4;
                    var11 = param0 + (-var10 + -16 + -var8 / 2 << -1722981456 >> 699101424);
                    var12 = param4 - -(var8 * 2);
                    var13 = 1 + var9 / 5 - var10;
                    var14 = var9 >> -1712527101;
                    qn.c(var11, var12, var13, var6, var14);
                    qn.c(var11, 1 + var12, var13, var6, var14);
                    var15 = var11;
                    var15 = var15 + var11 >> -482271679 << 404661096;
                    var16 = (var13 << -174655928) / 6;
                    var17 = var15 - (-(var16 / 2) - (4 * ae.b(var8 + param2 << -754370428, 100) >> 601195080));
                    var18 = var9 >> -1396750812;
                    var19 = 0;
                    L4: while (true) {
                      if (3 <= var19) {
                        var17 = var16 / 4 + var15 - -(var16 / 2);
                        var16 = var16 / 2;
                        var19 = 0;
                        L5: while (true) {
                          if ((var19 ^ -1) <= -4) {
                            var8++;
                            continue L2;
                          } else {
                            qn.c(var17 >> -563956472, var12, var16 >> -262271448, var5, var18);
                            qn.c(var17 >> -502887960, 1 + var12, var16 >> 530893992, var5, var18);
                            var17 = var17 + 4 * var16;
                            var19++;
                            continue L5;
                          }
                        }
                      } else {
                        qn.c(var17 >> 1717850536, var12, var16 >> -1423110008, var5, var18);
                        qn.c(var17 >> 1451373352, 1 + var12, var16 >> -89927480, var5, var18);
                        var17 = var17 + var16 * 2;
                        var19++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              L6: {
                var9 = var8;
                if (var9 >= 0) {
                  var9 = 256 + -(var9 * var9 << -1705581981);
                  break L6;
                } else {
                  var9 = (var9 << -13702590) + 256;
                  break L6;
                }
              }
              var10 = var8 / 4;
              var11 = (-var10 + -16 + -var8 / 2 << 2124988688 >> 2125083056) + param0;
              var12 = param4 + var8 * 2;
              var13 = -var10 + (var9 / 5 - -1);
              var14 = var9 >> var7;
              qn.c(var11, var12, var13, var6, var14);
              qn.c(var11, var12 - -1, var13, var6, var14);
              var15 = var11;
              var15 = var11 + var15 >> -1132735871 << -1409960376;
              var16 = (var13 << -888062488) / 6;
              var17 = var16 / 2 + (var15 - -(g.a(-1, param2 + var8 << -1670655771) * 4 >> -1822470552));
              var18 = var9 >> -881556477;
              var19 = 0;
              L7: while (true) {
                if (3 <= var19) {
                  var17 = var16 / 4 + (var16 / 2 + var15);
                  var16 = var16 / 2;
                  var19 = 0;
                  L8: while (true) {
                    if ((var19 ^ -1) <= -4) {
                      var8++;
                      continue L1;
                    } else {
                      qn.c(var17 >> 1677268744, var12, var16 >> 1514228776, var5, var18);
                      qn.c(var17 >> 1649702504, 1 + var12, var16 >> -2139668024, var5, var18);
                      var17 = var17 + var16 * 4;
                      var19++;
                      continue L8;
                    }
                  }
                } else {
                  qn.c(var17 >> 275736552, var12, var16 >> -1134759544, var5, var18);
                  qn.c(var17 >> -1665991000, 1 + var12, var16 >> -1418505912, var5, var18);
                  var17 = var17 + 2 * var16;
                  var19++;
                  continue L7;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final tc d(byte param0) {
        if (param0 < 42) {
            Object var3 = null;
            ((eu) this).a(57, (jd) null);
        }
        return ((eu) this).field_c;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -55) {
            eu.a((byte) 5);
        }
        field_e = null;
    }

    private final boolean c(byte param0) {
        if (null != ((eu) this).field_c) {
            // ifnull L21
        } else {
            ((eu) this).field_c = null;
            return true;
        }
        if (param0 != -33) {
            field_g = null;
            return false;
        }
        return false;
    }

    final void a(int param0, jd param1) {
        if (param0 > -90) {
            return;
        }
        if (!((Object) (Object) ((eu) this).field_c == (Object) (Object) param1)) {
            ((eu) this).field_c = (tc) (Object) param1;
        }
    }

    final void a(int param0) {
        if (param0 <= 11) {
            ((eu) this).field_f = null;
        }
        this.c(10201);
        if (null != ((eu) this).field_c) {
            tc discarded$0 = ((eu) this).field_f.a(((eu) this).field_c, true);
            ((eu) this).field_c = ((eu) this).field_f.b(50);
        }
        if (((eu) this).field_c == null) {
            ((eu) this).field_c = ((eu) this).field_f.c(50);
        }
    }

    final int b(byte param0) {
        if (param0 <= 31) {
            int discarded$0 = ((eu) this).b((byte) 71);
        }
        return ((eu) this).field_b.b(false);
    }

    final static void a(int param0, int param1, int param2, jd param3) {
        cd.a(27, param2 + -16, param1, 2);
        int var4 = 110 / ((49 - param0) / 39);
    }

    final void b(int param0) {
        this.c(10201);
        if (null != ((eu) this).field_c) {
            tc discarded$0 = ((eu) this).field_f.a(false, ((eu) this).field_c);
            ((eu) this).field_c = ((eu) this).field_f.b((byte) -112);
        }
        if (param0 >= -50) {
            boolean discarded$1 = this.c((byte) 124);
        }
        if (!(((eu) this).field_c != null)) {
            ((eu) this).field_c = ((eu) this).field_f.a(50);
        }
    }

    private final void c(int param0) {
        if (param0 != 10201) {
            boolean discarded$0 = this.c((byte) -44);
        }
        if (!(!this.c((byte) -33))) {
            ((eu) this).field_f = new bb(((eu) this).field_b);
        }
    }

    eu(at param0) {
        ((eu) this).field_b = param0;
        ((eu) this).field_f = new bb(((eu) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Secret achievement";
        field_a = 20;
    }
}
