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
        boolean discarded$0 = false;
        if (param0 > -107) {
            discarded$0 = this.a(false);
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
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        dt var19 = null;
        la var20 = null;
        la var21 = null;
        dt var22 = null;
        la var23 = null;
        la var24 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
              var22 = this.field_g.f(0, 0);
              var6 = 0;
              var7 = var22.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackOut_42_0 = var4;
                stackIn_43_0 = stackOut_42_0;
                break L1;
              } else {
                stackOut_41_0 = var4 >> 241727201;
                stackIn_43_0 = stackOut_41_0;
                break L1;
              }
            }
            L2: {
              var9 = -stackIn_43_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackOut_45_0 = var4 >> 33748577;
                stackIn_46_0 = stackOut_45_0;
                break L2;
              } else {
                stackOut_44_0 = var4;
                stackIn_46_0 = stackOut_44_0;
                break L2;
              }
            }
            var10 = -stackIn_46_0 + var8 - var4 * (var7 >> 1484710817);
            var11 = var9;
            tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
            var12 = var6;
            L3: while (true) {
              L4: {
                if (var7 <= var12) {
                  var9 = var11;
                  break L4;
                } else {
                  var23 = var22.a(true, var12);
                  if (var18 != 0) {
                    break L4;
                  } else {
                    L5: {
                      if (var23 == null) {
                        break L5;
                      } else {
                        if (var23.j(0)) {
                          break L5;
                        } else {
                          var13 = 16;
                          var14 = var3;
                          var16 = var9;
                          ega.field_e.a(var13 - 4, var16 + -5);
                          var9 = var9 - (var4 << -1266057759);
                          if (var23.j(0)) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                if (var22.d(28091)) {
                                  break L7;
                                } else {
                                  var17 = String.valueOf(1 + var12);
                                  if (var18 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var17 = String.valueOf(1 + var12 / 2);
                              break L6;
                            }
                            discarded$2 = dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
                            break L5;
                          }
                        }
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
              var12 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (this.field_g.field_P <= var12) {
                      break L10;
                    } else {
                      var13 = this.field_g.field_c.field_e[var12];
                      var24 = this.field_g.field_H[var13].f((byte) 113);
                      if (var18 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (var24.c(72) < var6) {
                            break L11;
                          } else {
                            L12: {
                              if (var24.c(-87) < var7) {
                                break L12;
                              } else {
                                if (var18 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var15 = 16;
                            var16 = var9 + -(var4 * this.field_g.i(1, var13));
                            var16 = var16 + var4 * this.field_g.field_H[var13].f(false) / var24.s(-113);
                            var15 = var15 + var3 * this.field_g.field_H[var13].w(63) / var24.m((byte) -86);
                            this.field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
                            break L11;
                          }
                        }
                        var12++;
                        if (var18 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  tga.field_a.la();
                  break L9;
                }
                return;
              }
            }
          }
        } else {
          field_j = (String) null;
          if (var2 == -1) {
            return;
          } else {
            L13: {
              var3 = 26;
              var4 = 26;
              if (this.field_g.d((byte) 113)) {
                break L13;
              } else {
                var4 = var4 * 2;
                break L13;
              }
            }
            L14: {
              var19 = this.field_g.f(0, 0);
              var6 = 0;
              var7 = var19.l(-7);
              var8 = koa.b(0) >> 1707283137;
              if (var7 % 2 == 0) {
                stackOut_8_0 = var4;
                stackIn_9_0 = stackOut_8_0;
                break L14;
              } else {
                stackOut_7_0 = var4 >> 241727201;
                stackIn_9_0 = stackOut_7_0;
                break L14;
              }
            }
            L15: {
              var9 = -stackIn_9_0 + var8 + var4 * (var7 >> 505415649);
              if (-1 != (var7 % 2 ^ -1)) {
                stackOut_11_0 = var4 >> 33748577;
                stackIn_12_0 = stackOut_11_0;
                break L15;
              } else {
                stackOut_10_0 = var4;
                stackIn_12_0 = stackOut_10_0;
                break L15;
              }
            }
            var10 = -stackIn_12_0 + var8 - var4 * (var7 >> 1484710817);
            var11 = var9;
            tga.field_a.KA(10, -6 + var10, var3 + 16 - -6, var10 + var7 * var4 - -4);
            var12 = var6;
            L16: while (true) {
              L17: {
                if (var7 <= var12) {
                  var9 = var11;
                  break L17;
                } else {
                  var20 = var19.a(true, var12);
                  if (var18 != 0) {
                    break L17;
                  } else {
                    L18: {
                      if (var20 == null) {
                        break L18;
                      } else {
                        if (var20.j(0)) {
                          break L18;
                        } else {
                          var13 = 16;
                          var14 = var3;
                          var16 = var9;
                          ega.field_e.a(var13 - 4, var16 + -5);
                          var9 = var9 - (var4 << -1266057759);
                          if (var20.j(0)) {
                            break L18;
                          } else {
                            L19: {
                              L20: {
                                if (var19.d(28091)) {
                                  break L20;
                                } else {
                                  var17 = String.valueOf(1 + var12);
                                  if (var18 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var17 = String.valueOf(1 + var12 / 2);
                              break L19;
                            }
                            discarded$3 = dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
                            break L18;
                          }
                        }
                      }
                    }
                    var12++;
                    continue L16;
                  }
                }
              }
              var12 = 0;
              L21: while (true) {
                L22: {
                  L23: {
                    if (this.field_g.field_P <= var12) {
                      break L23;
                    } else {
                      var13 = this.field_g.field_c.field_e[var12];
                      var21 = this.field_g.field_H[var13].f((byte) 113);
                      if (var18 != 0) {
                        break L22;
                      } else {
                        L24: {
                          if (var21.c(72) < var6) {
                            break L24;
                          } else {
                            L25: {
                              if (var21.c(-87) < var7) {
                                break L25;
                              } else {
                                if (var18 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            var15 = 16;
                            var16 = var9 + -(var4 * this.field_g.i(1, var13));
                            var16 = var16 + var4 * this.field_g.field_H[var13].f(false) / var21.s(-113);
                            var15 = var15 + var3 * this.field_g.field_H[var13].w(63) / var21.m((byte) -86);
                            this.field_g.field_H[var13].n((byte) -111).a(var15, 124, var16);
                            break L24;
                          }
                        }
                        var12++;
                        if (var18 == 0) {
                          continue L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  tga.field_a.la();
                  break L22;
                }
                return;
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
