/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dua extends me {
    static String field_j;

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 66 / ((29 - param2) / 57);
        return false;
    }

    final void a(byte param0) {
        if (param0 > -107) {
            boolean discarded$0 = ((dua) this).a(false);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            field_j = null;
            return false;
        }
        return false;
    }

    dua(qh param0) {
        super(param0);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        String var17 = null;
        int var18 = 0;
        int var19 = 0;
        dt var20 = null;
        la var21 = null;
        la var22 = null;
        dt var23 = null;
        la var24 = null;
        la var25 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var18 = TombRacer.field_G ? 1 : 0;
        var2 = ((dua) this).field_i.l(92);
        if (param0 < -13) {
          if (var2 == -1) {
            return;
          } else {
            L0: {
              var3 = 26;
              var4 = 26;
              if (((dua) this).field_g.d((byte) 113)) {
                break L0;
              } else {
                var4 = var4 * 2;
                break L0;
              }
            }
            L1: {
              var23 = ((dua) this).field_g.f(0, 0);
              var6 = 0;
              var7 = var23.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackOut_40_0 = var4;
                stackIn_41_0 = stackOut_40_0;
                break L1;
              } else {
                stackOut_39_0 = var4 >> 241727201;
                stackIn_41_0 = stackOut_39_0;
                break L1;
              }
            }
            L2: {
              var9 = -stackIn_41_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackOut_43_0 = var4 >> 33748577;
                stackIn_44_0 = stackOut_43_0;
                break L2;
              } else {
                stackOut_42_0 = var4;
                stackIn_44_0 = stackOut_42_0;
                break L2;
              }
            }
            var10 = -stackIn_44_0 + var8 - var4 * (var7 >> 1484710817);
            var11 = var9;
            tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
            var12 = var6;
            L3: while (true) {
              if (var7 <= var12) {
                var9 = var11;
                var19 = 0;
                var12 = var19;
                L4: while (true) {
                  if (((dua) this).field_g.field_P <= var19) {
                    tga.field_a.la();
                    return;
                  } else {
                    var13 = ((dua) this).field_g.field_c.field_e[var19];
                    var25 = ((dua) this).field_g.field_H[var13].f((byte) 113);
                    if (var25.c(72) >= var6) {
                      if (var25.c(-87) < var7) {
                        var15 = 16;
                        var16 = var9 + -(var4 * ((dua) this).field_g.i(1, var13));
                        var16 = var16 + var4 * ((dua) this).field_g.field_H[var13].f(false) / var25.s(-113);
                        var15 = var15 + var3 * ((dua) this).field_g.field_H[var13].w(63) / var25.m((byte) -86);
                        ((dua) this).field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
                        var19++;
                        continue L4;
                      } else {
                        var19++;
                        continue L4;
                      }
                    } else {
                      var19++;
                      continue L4;
                    }
                  }
                }
              } else {
                var24 = var23.a(true, var12);
                if (var24 != null) {
                  if (!var24.j(0)) {
                    var13 = 16;
                    var14 = var3;
                    var16 = var9;
                    ega.field_e.a(var13 - 4, var16 + -5);
                    var9 = var9 - (var4 << -1266057759);
                    if (!var24.j(0)) {
                      L5: {
                        if (var23.d(28091)) {
                          var17 = String.valueOf(1 + var12 / 2);
                          break L5;
                        } else {
                          var17 = String.valueOf(1 + var12);
                          break L5;
                        }
                      }
                      int discarded$2 = dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  } else {
                    var12++;
                    continue L3;
                  }
                } else {
                  var12++;
                  continue L3;
                }
              }
            }
          }
        } else {
          field_j = null;
          if (var2 == -1) {
            return;
          } else {
            L6: {
              var3 = 26;
              var4 = 26;
              if (((dua) this).field_g.d((byte) 113)) {
                break L6;
              } else {
                var4 = var4 * 2;
                break L6;
              }
            }
            L7: {
              var20 = ((dua) this).field_g.f(0, 0);
              var6 = 0;
              var7 = var20.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackOut_8_0 = var4;
                stackIn_9_0 = stackOut_8_0;
                break L7;
              } else {
                stackOut_7_0 = var4 >> 241727201;
                stackIn_9_0 = stackOut_7_0;
                break L7;
              }
            }
            L8: {
              var9 = -stackIn_9_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackOut_11_0 = var4 >> 33748577;
                stackIn_12_0 = stackOut_11_0;
                break L8;
              } else {
                stackOut_10_0 = var4;
                stackIn_12_0 = stackOut_10_0;
                break L8;
              }
            }
            L9: {
              var10 = -stackIn_12_0 + var8 - var4 * (var7 >> 1484710817);
              var11 = var9;
              tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
              var12 = var6;
              if (var7 <= var12) {
                break L9;
              } else {
                L10: {
                  L11: {
                    L12: {
                      var21 = var20.a(true, var12);
                      if (var21 == null) {
                        var12++;
                        break L12;
                      } else {
                        if (var21.j(0)) {
                          break L12;
                        } else {
                          var13 = 16;
                          var14 = var3;
                          var16 = var9;
                          ega.field_e.a(var13 - 4, var16 + -5);
                          var9 = var9 - (var4 << -1266057759);
                          if (var21.j(0)) {
                            break L11;
                          } else {
                            L13: {
                              if (var20.d(28091)) {
                                var17 = String.valueOf(1 + var12 / 2);
                                break L13;
                              } else {
                                var17 = String.valueOf(1 + var12);
                                break L13;
                              }
                            }
                            int discarded$3 = dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
                            break L10;
                          }
                        }
                      }
                    }
                    var12++;
                    break L11;
                  }
                  var12++;
                  break L10;
                }
                var12++;
                var12++;
                var12++;
                var12++;
                var12++;
                break L9;
              }
            }
            L14: {
              var9 = var11;
              var19 = 0;
              var12 = var19;
              if (((dua) this).field_g.field_P <= var19) {
                break L14;
              } else {
                L15: {
                  L16: {
                    var13 = ((dua) this).field_g.field_c.field_e[var19];
                    var22 = ((dua) this).field_g.field_H[var13].f((byte) 113);
                    if (var22.c(72) < var6) {
                      var19++;
                      break L16;
                    } else {
                      if (var22.c(-87) < var7) {
                        var15 = 16;
                        var16 = var9 + -(var4 * ((dua) this).field_g.i(1, var13));
                        var16 = var16 + var4 * ((dua) this).field_g.field_H[var13].f(false) / var22.s(-113);
                        var15 = var15 + var3 * ((dua) this).field_g.field_H[var13].w(63) / var22.m((byte) -86);
                        ((dua) this).field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var19++;
                  break L15;
                }
                var19++;
                var19++;
                var19++;
                var19++;
                break L14;
              }
            }
            tga.field_a.la();
            return;
          }
        }
    }

    public static void d(byte param0) {
        if (param0 > -125) {
            return;
        }
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Email is valid";
    }
}
