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
            this.a(false);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            field_j = (String) null;
            return false;
        }
        return false;
    }

    dua(qh param0) {
        super(param0);
    }

    final void b(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String var17;
        int var18;
        int var19;
        dt var20;
        la var21;
        la var22;
        dt var23;
        la var24;
        la var25;
        var18 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_i.l(92);
        if (param0 < -13) {
          if (var2 == -1) {
            return;
          } else {
            L0: {
              var3 = 26;
              var4 = 26;
              if (this.field_g.d((byte) 113)) {
                break L0;
              } else {
                var4 = var4 * 2;
                break L0;
              }
            }
            L1: {
              var23 = this.field_g.f(0, 0);
              var6 = 0;
              var7 = var23.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackIn_42_0 = var4;
                break L1;
              } else {
                stackIn_42_0 = var4 >> 241727201;
                break L1;
              }
            }
            L2: {
              var9 = -stackIn_42_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackIn_45_0 = var4 >> 33748577;
                break L2;
              } else {
                stackIn_45_0 = var4;
                break L2;
              }
            }
            var10 = -stackIn_45_0 + var8 - var4 * (var7 >> 1484710817);
            var11 = var9;
            tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
            var12 = var6;
            L3: while (true) {
              if (var7 <= var12) {
                var9 = var11;
                var19 = 0;
                var12 = var19;
                L4: while (true) {
                  if (this.field_g.field_P <= var19) {
                    tga.field_a.la();
                    return;
                  } else {
                    var13 = this.field_g.field_c.field_e[var19];
                    var25 = this.field_g.field_H[var13].f((byte) 113);
                    if (var25.c(72) >= var6) {
                      if (var25.c(-87) < var7) {
                        var15 = 16;
                        var16 = var9 + -(var4 * this.field_g.i(1, var13));
                        var16 = var16 + var4 * this.field_g.field_H[var13].f(false) / var25.s(-113);
                        var15 = var15 + var3 * this.field_g.field_H[var13].w(63) / var25.m((byte) -86);
                        this.field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
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
                      dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
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
          field_j = (String) null;
          if (var2 == -1) {
            return;
          } else {
            L6: {
              var3 = 26;
              var4 = 26;
              if (this.field_g.d((byte) 113)) {
                break L6;
              } else {
                var4 = var4 * 2;
                break L6;
              }
            }
            L7: {
              var20 = this.field_g.f(0, 0);
              var6 = 0;
              var7 = var20.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackIn_9_0 = var4;
                break L7;
              } else {
                stackIn_9_0 = var4 >> 241727201;
                break L7;
              }
            }
            L8: {
              var9 = -stackIn_9_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackIn_12_0 = var4 >> 33748577;
                break L8;
              } else {
                stackIn_12_0 = var4;
                break L8;
              }
            }
            var10 = -stackIn_12_0 + var8 - var4 * (var7 >> 1484710817);
            var11 = var9;
            tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
            var12 = var6;
            L9: while (true) {
              if (var7 <= var12) {
                var9 = var11;
                var19 = 0;
                var12 = var19;
                L10: while (true) {
                  if (this.field_g.field_P <= var19) {
                    tga.field_a.la();
                    return;
                  } else {
                    var13 = this.field_g.field_c.field_e[var19];
                    var22 = this.field_g.field_H[var13].f((byte) 113);
                    if (var22.c(72) >= var6) {
                      if (var22.c(-87) < var7) {
                        var15 = 16;
                        var16 = var9 + -(var4 * this.field_g.i(1, var13));
                        var16 = var16 + var4 * this.field_g.field_H[var13].f(false) / var22.s(-113);
                        var15 = var15 + var3 * this.field_g.field_H[var13].w(63) / var22.m((byte) -86);
                        this.field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
                        var19++;
                        continue L10;
                      } else {
                        var19++;
                        continue L10;
                      }
                    } else {
                      var19++;
                      continue L10;
                    }
                  }
                }
              } else {
                var21 = var20.a(true, var12);
                if (var21 != null) {
                  if (!var21.j(0)) {
                    var13 = 16;
                    var14 = var3;
                    var16 = var9;
                    ega.field_e.a(var13 - 4, var16 + -5);
                    var9 = var9 - (var4 << -1266057759);
                    if (!var21.j(0)) {
                      L11: {
                        if (var20.d(28091)) {
                          var17 = String.valueOf(1 + var12 / 2);
                          break L11;
                        } else {
                          var17 = String.valueOf(1 + var12);
                          break L11;
                        }
                      }
                      dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
                      var12++;
                      continue L9;
                    } else {
                      var12++;
                      continue L9;
                    }
                  } else {
                    var12++;
                    continue L9;
                  }
                } else {
                  var12++;
                  continue L9;
                }
              }
            }
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
        field_j = "Email is valid";
    }
}
