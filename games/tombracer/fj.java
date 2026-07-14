/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    private int field_d;
    static String field_a;
    static String field_b;
    static wla field_c;

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -2) {
            field_a = null;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
            iu[] discarded$0 = fj.c(17);
        }
        ((fj) this).field_d = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qh param5, int param6) {
        hca var9 = null;
        la var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        uw var15 = null;
        Object var16 = null;
        ag var16_ref = null;
        int var17 = 0;
        int var18 = 0;
        gda var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        ff var38 = null;
        ff var39 = null;
        var16 = null;
        var37 = TombRacer.field_G ? 1 : 0;
        if (0 <= param0) {
          if (!param5.f(-12963, param0)) {
            return;
          } else {
            var38 = param5.field_k;
            var39 = var38;
            if (!var39.b((byte) 90, param0)) {
              var9 = var38.field_H[param0];
              var10 = var9.f((byte) 73);
              var11 = -param1 + param2;
              var12 = param4 - param3;
              ij.a(param1, var12, var11, param3, 0, 6);
              var13 = var11 / 2 + param1;
              var14 = var12 / 2 + param3;
              var15 = var10.j((byte) -81);
              if (var15 == null) {
                return;
              } else {
                L0: {
                  var16_ref = (ag) (Object) var15.c(0);
                  var17 = (var12 + var11) / 2;
                  var18 = var17 * 2048 / 512;
                  var16_ref.a(var18, (byte) -88);
                  tga.field_a.ya();
                  if (ica.field_a) {
                    tga.field_a.DA(var13, var14, var17, var17);
                    break L0;
                  } else {
                    tga.field_a.DA(var13, var14, 10 * var17 / 8, var17 * 10 / 8);
                    break L0;
                  }
                }
                L1: {
                  var19 = tga.field_a.b();
                  var20 = 0;
                  if (0 != ((fj) this).field_d) {
                    var20 = ((fj) this).field_d;
                    break L1;
                  } else {
                    var21 = var10.a(false);
                    if (var21 == 0) {
                      var20 = 1;
                      break L1;
                    } else {
                      if (-2 == var21) {
                        var20 = 0;
                        break L1;
                      } else {
                        if (2 != var21) {
                          if (3 == var21) {
                            var20 = 3;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          var20 = 2;
                          break L1;
                        }
                      }
                    }
                  }
                }
                L2: {
                  var21 = -106 % ((param6 - -45) / 58);
                  var26 = 440;
                  if (var20 < 1) {
                    break L2;
                  } else {
                    var26 = var26 - 48 * var20;
                    break L2;
                  }
                }
                L3: {
                  var27 = 440;
                  if (var11 < var12) {
                    var26 = var11;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var16_ref.a(43, param1 + var26, param1, param3, var27 + (param3 + -(64 * var20)));
                    var16_ref.a(-30023, param1 + var26 / 2, param3 + var27 / 2);
                    var28 = var16_ref.c(-30661);
                    var29 = var16_ref.b((byte) 70);
                    param5.field_g[param0].a(var29 << 1397735120, 50, var28 << -1623472304);
                    param5.field_g[param0].b(var9.e(9648), var9.d(3), 89);
                    var22 = var28 << 1956728514;
                    var23 = var29 << -1928365598;
                    var30 = var20;
                    if (0 != var30) {
                      if (var30 == -2) {
                        var24 = 1800;
                        var25 = 3200;
                        // wide iinc 23 640
                        break L4;
                      } else {
                        if (var30 != 2) {
                          if (-4 != var30) {
                            if (4 == var30) {
                              // wide iinc 23 800
                              var25 = 500;
                              var24 = 200;
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            var24 = 1000;
                            // wide iinc 23 800
                            var25 = 2000;
                            break L4;
                          }
                        } else {
                          var25 = 2800;
                          // wide iinc 23 768
                          var24 = 1500;
                          break L4;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  var25 = 4096;
                  var24 = 1880;
                  break L4;
                }
                L6: {
                  if (param5.f((byte) 33)) {
                    var23 = var9.e(9648) >> -549734768;
                    var24 = 1600;
                    var25 = 4096;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var16_ref.a(false, var24 >> -1138960542, var23 >> -2033390718, var22 >> 156975970);
                  var30 = 0;
                  var19.a(var22, -var24, -var23, -var25, -var30, 0);
                  tga.field_a.a(var19);
                  ps.field_N = param3;
                  uw.field_e = param1;
                  iga.field_o.a(param2, param3, (byte) -12, param4, param1);
                  var10.c(false);
                  if (param5.f((byte) 33)) {
                    L8: {
                      var31 = 0;
                      var32 = 256;
                      var33 = 1600;
                      var34 = var33 + (var10.s(78) >> 1553199184) - 400;
                      var35 = 0;
                      var36 = 0;
                      if (var33 <= var23) {
                        if (var34 < var23) {
                          var36 = 1;
                          var31 = 256 * (-var34 + var23) / var32;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        var31 = 256 * (-var23 + var33) / var32;
                        var35 = 1;
                        break L8;
                      }
                    }
                    L9: {
                      if ((var31 ^ -1) < -257) {
                        var31 = 256;
                        if (var35 == 0) {
                          if (var36 == 0) {
                            break L9;
                          } else {
                            var9.b(var10.m((byte) -86) / 2, var34 - -var32 << -2145825744, 76473160);
                            break L9;
                          }
                        } else {
                          var9.b(16384, true);
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    if (-1 <= (var31 ^ -1)) {
                      break L7;
                    } else {
                      rba.a(var31 * 255 >> -350124024, param4, 0, param2, (byte) 25, param3, param1);
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                iga.field_o.a(109);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static iu[] c(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        iu[] var1 = new iu[fa.field_b];
        if (param0 != 1500) {
            field_c = null;
        }
        for (var2 = 0; fa.field_b > var2; var2++) {
            var3 = iga.field_m[var2] * mq.field_b[var2];
            var4 = ck.field_c[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = mga.field_g[sea.c(255, (int) var4[var6])];
            }
            var1[var2] = new iu(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var5);
        }
        loa.a((byte) -50);
        return var1;
    }

    final void a(int param0) {
        int var2 = -10 / ((param0 - 61) / 54);
    }

    fj() {
        ((fj) this).field_d = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Who can join";
        field_b = "Send private message to <%0>";
    }
}
