/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends nv {
    private int field_n;
    private int field_q;
    private boolean field_s;
    private int field_u;
    private hj field_t;
    private int field_o;
    private boolean field_r;
    private boolean field_p;

    final static jea b(int param0) {
        if (param0 > -31) {
            jea discarded$0 = mo.b(47);
        }
        return dn.field_b.field_tb;
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            return -114;
        }
        return param0;
    }

    final void a(int param0, boolean param1) {
        if (param0 != 16) {
            int discarded$0 = ((mo) this).a(-128, 105);
        }
        ((mo) this).field_p = param1 ? true : false;
    }

    final void k(int param0) {
        if (param0 != 5418) {
            int discarded$0 = ((mo) this).a(true);
        }
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        la var7_ref = null;
        int var7 = 0;
        tqa var8_ref = null;
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
        Object var18 = null;
        hca var19 = null;
        var18 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        super.a(param0, (byte) 54, param2, param3);
        if (param3 != 1) {
          return;
        } else {
          if (!(param2 instanceof hca)) {
            if (((mo) this).field_n != 0) {
              var5 = param2.d(3);
              var6 = param2.e(9648);
              var7 = param2.c(-93);
              var8 = param2.a((byte) 55);
              var9 = var5 + -(var7 / 2) + -((mo) this).field_g.r((byte) -95) + -((mo) this).field_o;
              var10 = var6 - var8 / 2 + (-((mo) this).field_g.Q(2) + -((mo) this).field_q);
              var11 = var9 + (var7 - 1);
              var12 = var10 + var8 + -1;
              var9 = var9 / ((mo) this).field_u;
              var11 = var11 / ((mo) this).field_u;
              var12 = var12 / ((mo) this).field_u;
              var10 = var10 / ((mo) this).field_u;
              if (param1 > 18) {
                var13 = param2.b(-124);
                var15 = var9;
                L0: while (true) {
                  if (var11 < var15) {
                    return;
                  } else {
                    var16 = var10;
                    L1: while (true) {
                      if (var16 > var12) {
                        var15++;
                        continue L0;
                      } else {
                        if (((mo) this).field_t.a(var15, var16, (byte) -128)) {
                          var14 = ((mo) this).field_t.b((byte) -5, var16, var15);
                          if (-1 != var14) {
                            if (((mo) this).field_r) {
                              L2: {
                                var14 = var14 + var13;
                                if (var14 >= ((mo) this).field_n) {
                                  var14 = -1;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                              ((mo) this).field_t.a(var16, var14, 0, var15);
                              var16++;
                              continue L1;
                            } else {
                              if (((mo) this).field_n <= var13) {
                                if ((((mo) this).field_n ^ -1) <= -1) {
                                  ((mo) this).field_t.a(var16, -1, 0, var15);
                                  var16++;
                                  continue L1;
                                } else {
                                  var16++;
                                  continue L1;
                                }
                              } else {
                                var16++;
                                continue L1;
                              }
                            }
                          } else {
                            var16++;
                            continue L1;
                          }
                        } else {
                          var16++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              var5 = param2.d(3);
              var6 = param2.e(9648);
              var7_ref = ((mo) this).b(true);
              var8_ref = var7_ref.f((byte) 93);
              var9 = var8_ref.a(var5, false);
              var10 = var8_ref.a(var6, false);
              var11 = var6 % ((mo) this).field_u;
              var12 = var5 % ((mo) this).field_u;
              var13 = ((mo) this).field_u / 2;
              if (var11 <= var13) {
                break L3;
              } else {
                if (var8_ref.a(79, var9, 1 + var10).a(-111, new int[2])) {
                  break L3;
                } else {
                  return;
                }
              }
            }
            L4: {
              if (var11 >= var13) {
                break L4;
              } else {
                if (!var8_ref.a(74, var9, var10 - 1).a(-126, new int[2])) {
                  return;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (var12 >= var13) {
                break L5;
              } else {
                if (var8_ref.a(-108, var9 + -1, var10).a(-117, new int[2])) {
                  break L5;
                } else {
                  return;
                }
              }
            }
            L6: {
              if (var12 <= var13) {
                break L6;
              } else {
                if (!var8_ref.a(-112, var9 + 1, var10).a(-111, new int[2])) {
                  return;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var19 = (hca) (Object) param2;
              if (((mo) this).field_s) {
                var19.a(10, (byte) -19);
                break L7;
              } else {
                if (((mo) this).field_p) {
                  var19.a(4, (byte) -18, 6);
                  break L7;
                } else {
                  var19.a(4, (byte) 102, 5);
                  break L7;
                }
              }
            }
            return;
          }
        }
    }

    mo(la param0, boolean param1) {
        super(param0, param1);
        ((mo) this).field_u = jm.field_l;
        ((mo) this).field_n = 0;
        ((mo) this).field_p = false;
        ((mo) this).field_s = false;
        ((mo) this).field_r = false;
        ((mo) this).field_u = jm.field_l;
        this.c(0);
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        ((mo) this).field_g.b((byte) -102, 4);
        ((mo) this).field_g.a(true, (byte) -25, 0);
        ((mo) this).field_g.a((byte) -114, true, 1);
        ((mo) this).field_g.b((byte) 17, param0);
        int var3 = ((mo) this).field_g.c(-56) / ((mo) this).field_u;
        int var4 = ((mo) this).field_g.a((byte) 55) / ((mo) this).field_u;
        ((mo) this).field_t = new hj(var3, var4, 0);
        ((mo) this).field_o = (((mo) this).field_g.c(-92) + -(((mo) this).field_t.field_f * ((mo) this).field_u)) / 2;
        ((mo) this).field_q = (((mo) this).field_g.a((byte) 55) + -(((mo) this).field_t.field_a * ((mo) this).field_u)) / 2;
        ((mo) this).field_g.f((byte) -93).a(1, -1, ((mo) this).field_g.d(3), ((mo) this).field_g.e(9648), ((mo) this).field_g.c(-27), ((mo) this).field_g.a((byte) 55), 123);
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return 0;
        } else {
          if (!io.a(((mo) this).field_u * ((mo) this).field_t.field_f, param2, (byte) -115, ((mo) this).field_u * ((mo) this).field_t.field_a, param5, ((mo) this).field_g.e(9648), param1, param0, ((mo) this).field_g.d(3))) {
            return 0;
          } else {
            L0: {
              var7 = 0;
              var8 = ((mo) this).field_g.r((byte) -95) - -((mo) this).field_o;
              if (param4 >= 79) {
                break L0;
              } else {
                int discarded$1 = ((mo) this).a(false);
                break L0;
              }
            }
            var9 = ((mo) this).field_g.Q(2) - -((mo) this).field_q;
            var10 = -(param0 / 2) - (var8 - param5);
            var11 = param2 - param1 / 2 - var9;
            var12 = -1 + (param0 + var10);
            var13 = var11 - (-param1 - -1);
            var10 = var10 / ((mo) this).field_u;
            var11 = var11 / ((mo) this).field_u;
            var13 = var13 / ((mo) this).field_u;
            var12 = var12 / ((mo) this).field_u;
            var14 = var10;
            L1: while (true) {
              if (var12 < var14) {
                return var7;
              } else {
                var15 = var11;
                L2: while (true) {
                  if (var15 > var13) {
                    var14++;
                    continue L1;
                  } else {
                    if (((mo) this).field_t.a(var14, var15, (byte) -128)) {
                      if (((mo) this).field_t.b((byte) -5, var15, var14) != -1) {
                        var7 = var7 + foa.a(param1, param5, var15 * ((mo) this).field_u + (((mo) this).field_u / 2 + var9), param2, ((mo) this).field_u, (byte) 75, param0, ((mo) this).field_u, 16, var8 - (-(((mo) this).field_u / 2) - ((mo) this).field_u * var14));
                        var15++;
                        continue L2;
                      } else {
                        var15++;
                        continue L2;
                      }
                    } else {
                      var15++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    mo(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((mo) this).field_u = jm.field_l;
        ((mo) this).field_n = 0;
        ((mo) this).field_p = false;
        ((mo) this).field_s = false;
        ((mo) this).field_r = false;
        ((mo) this).field_n = param1.b((byte) 44, 8);
        ((mo) this).field_r = 1 == param1.b((byte) 44, 1) ? true : false;
        if (param0.field_E >= 4) {
            ((mo) this).field_u = param1.b((byte) 44, 10) << -327303504;
        } else {
            ((mo) this).field_u = jm.field_l;
        }
        if (-12 >= param0.field_E) {
            ((mo) this).field_s = -2 == param1.b((byte) 44, 1) ? true : false;
        }
        this.c(0);
    }

    final int a(boolean param0) {
        if (param0) {
            ((mo) this).field_t = null;
        }
        return 8;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 71, ((mo) this).field_n, 8);
        param1.a((byte) 34, ((mo) this).field_r ? 1 : 0, 1);
        param1.a((byte) 69, ((mo) this).field_u >> 169596400, 10);
        param1.a((byte) -128, !((mo) this).field_s ? 0 : 1, 1);
    }

    private final void c(int param0) {
        if (param0 != 0) {
            ((mo) this).field_t = null;
        }
        if (!(!((mo) this).field_s)) {
            ((mo) this).field_n = 0;
        }
        if (!(dsa.field_b <= ((mo) this).field_u)) {
            ((mo) this).field_u = dsa.field_b;
        }
    }

    static {
    }
}
