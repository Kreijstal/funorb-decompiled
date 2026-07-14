/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends nv {
    static int field_p;
    private fsa field_r;
    private int field_v;
    private fsa field_A;
    private int field_s;
    private fsa field_o;
    private int field_q;
    private int field_y;
    private boolean field_u;
    private int field_x;
    static boolean field_n;
    private int field_t;
    private hj field_z;
    private int field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
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
        if (((vd) this).field_u) {
          if (null == ((vd) this).field_z) {
            return false;
          } else {
            L0: {
              var8 = ((vd) this).field_g.d(3) - ((vd) this).field_g.c(-29) / 2;
              var9 = ((vd) this).field_g.e(9648) + -(((vd) this).field_g.a((byte) 55) / 2);
              param3 = param3 - (((vd) this).field_y + param1 / 2);
              param4 = param4 - (((vd) this).field_w + param0 / 2);
              var10 = -var8 + param3;
              var11 = param1 + (param3 + -var8);
              var12 = -var9 + param4;
              var13 = -var9 + (param4 + param0);
              if (0 > var10) {
                var10 = var10 - (((vd) this).field_t - 1);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var12 ^ -1) <= -1) {
                break L1;
              } else {
                var12 = var12 - (((vd) this).field_t - 1);
                break L1;
              }
            }
            L2: {
              if ((var11 ^ -1) > -1) {
                var11 = var11 - (((vd) this).field_t + -1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var12 / ((vd) this).field_t;
              var10 = var10 / ((vd) this).field_t;
              if (0 <= var13) {
                break L3;
              } else {
                var13 = var13 - (-1 + ((vd) this).field_t);
                break L3;
              }
            }
            var11 = var11 / ((vd) this).field_t;
            var13 = var13 / ((vd) this).field_t;
            var10 = za.a(0, (byte) 113, ((vd) this).field_z.field_f - param2, var10);
            var11 = za.a(0, (byte) 99, ((vd) this).field_z.field_f + -1, var11);
            var14 = var10;
            L4: while (true) {
              if (var11 < var14) {
                return false;
              } else {
                var15 = var12;
                L5: while (true) {
                  if (var13 < var15) {
                    var14++;
                    continue L4;
                  } else {
                    if (((vd) this).field_z.a(var14, var15, (byte) -128)) {
                      if ((((vd) this).field_z.b((byte) -5, var15, var14) ^ -1) < -1) {
                        return true;
                      } else {
                        var15++;
                        continue L5;
                      }
                    } else {
                      var15++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        if (!(-5 >= (((vd) this).b(true).field_E ^ -1))) {
            param1.h(4, 0);
        }
    }

    final static int b(int param0, int param1) {
        if (!((param1 ^ -1) <= -1)) {
            param1 = -param1;
        }
        int var2 = 0;
        if (!(param1 >= -65536)) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (!(-256 >= param1)) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if (param1 > 15) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if (param1 > 3) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if (param1 > param0) {
            var2 = var2 | 1;
            param1 = param1 >>> 1;
        }
        return var2;
    }

    final void a(fsa param0, byte param1) {
        ((vd) this).field_r = param0;
        int var3 = -100 % ((param1 - -10) / 56);
    }

    final void a(fsa param0, int param1) {
        if (param1 != 2) {
            return;
        }
        ((vd) this).field_o = param0;
    }

    final int a(boolean param0) {
        if (param0) {
            ((vd) this).field_t = 114;
        }
        return 11;
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, pc param4, int param5) {
        int var9 = 0;
        int var7 = 16;
        if (param0) {
            return false;
        }
        int var8 = hm.a(param4.field_a, (byte) -15, param2, param2 + param5, param1 + param3, var7, param4.field_e, param4.field_k, param4.field_d, param3);
        if ((var8 ^ -1) < -1) {
            var9 = wm.a(1 << var7, var8, -75);
            param4.a(var9, (byte) 47);
            return true;
        }
        return false;
    }

    private final boolean a(pc param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          var3 = ((vd) this).field_g.d(param1 + 4) + -(((vd) this).field_g.c(param1 + -54) / 2);
          var4 = ((vd) this).field_g.e(9648) - ((vd) this).field_g.a((byte) 55) / 2;
          var5 = -((vd) this).field_y + (-var3 + param0.field_d);
          var6 = param0.field_e + -var3 - ((vd) this).field_y;
          var7 = param0.field_k - (((vd) this).field_w + var4);
          var8 = param0.field_a + -((vd) this).field_w + -var4;
          if (param1 == -1) {
            break L0;
          } else {
            var18 = null;
            boolean discarded$1 = ((vd) this).a(10, -109, (pc) null, 116);
            break L0;
          }
        }
        var9 = new nf();
        var9.a(var6, var7, ((vd) this).field_z.field_a, ((vd) this).field_t, var5, 0, ((vd) this).field_z.field_f, var8);
        L1: while (true) {
          if (var9.field_d) {
            return false;
          } else {
            L2: {
              var10 = var9.b((byte) 75);
              var11 = var9.b(2);
              if (((vd) this).field_z.b((byte) -5, var11, var10) <= 0) {
                break L2;
              } else {
                var12 = 16;
                var13 = ((vd) this).field_t * var10;
                var14 = ((vd) this).field_t * var11;
                var15 = hm.a(var8, (byte) -15, var13, ((vd) this).field_t + var13, var14 + ((vd) this).field_t, var12, var6, var7, var5, var14);
                if ((var15 ^ -1) < -1) {
                  var16 = wm.a(1 << var12, var15, -51);
                  param0.a(var16, (byte) 47);
                  return true;
                } else {
                  break L2;
                }
              }
            }
            var9.d(param1 ^ -102);
            continue L1;
          }
        }
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            ((vd) this).field_x = 97;
        }
        ((vd) this).field_v = param1;
    }

    private final void c(int param0) {
        qea var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        av var11 = null;
        int var12 = 0;
        loa var12_ref = null;
        int var13 = 0;
        int[][] var13_ref_int____ = null;
        int var14 = 0;
        kh var15 = null;
        kh var16 = null;
        kh var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        av var24 = null;
        int[][] var25 = null;
        la var26 = null;
        kh var27 = null;
        kh var28 = null;
        kh var29 = null;
        int[][] var32 = null;
        int[][] var35 = null;
        int[][] var38 = null;
        int[][] var39 = null;
        int[][] var40 = null;
        var22 = TombRacer.field_G ? 1 : 0;
        if (((vd) this).field_g == null) {
          return;
        } else {
          L0: {
            var26 = ((vd) this).b(true);
            var3 = ((vd) this).o((byte) 46);
            var4 = ((vd) this).field_g.c(-34) / ((vd) this).field_t;
            var5 = ((vd) this).field_g.a((byte) 55) / ((vd) this).field_t;
            if (var4 / 2 * 2 != var4) {
              break L0;
            } else {
              var4--;
              break L0;
            }
          }
          L1: {
            if (var5 == 2 * (var5 / 2)) {
              var5--;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!((vd) this).field_u) {
              break L2;
            } else {
              if (((vd) this).field_t * var4 <= ((vd) this).field_g.c(-109) - 2097152) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var6 = var4 / 2;
            var7 = -2 + var5;
            if (var6 == 2 * (var6 / 2)) {
              if (((vd) this).b(true).h((byte) -77)) {
                var6++;
                break L3;
              } else {
                var6--;
                break L3;
              }
            } else {
              break L3;
            }
          }
          var8 = 1;
          if (param0 > 123) {
            if (-4 < var4) {
              return;
            } else {
              if (-4 > var5) {
                return;
              } else {
                var9 = 0;
                var10 = 0;
                var11 = null;
                L4: while (true) {
                  L5: {
                    if (var9 != 0) {
                      break L5;
                    } else {
                      var12_ref = lba.a((byte) 27, var3, ((vd) this).field_s);
                      ((vd) this).field_z = var12_ref.a(var5, var6, var4, -122, var8);
                      ((vd) this).field_z.a(1 + var7, 0, 0, var6);
                      ((vd) this).field_z.a(0, 0, 0, var6);
                      var24 = new av(((vd) this).field_z);
                      var11 = var24;
                      var24.a(var7 - -1, 0, var6, 124, var6);
                      var38 = var24.b((byte) 125);
                      var35 = var38;
                      var32 = var35;
                      var25 = var32;
                      var13_ref_int____ = var25;
                      if (var13_ref_int____ == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5 < 5) {
                            break L6;
                          } else {
                            if (5 > var4) {
                              break L6;
                            } else {
                              if (var5 >= var38.length) {
                                var9 = 0;
                                var10++;
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (0 == ((vd) this).field_x) {
                            break L7;
                          } else {
                            if (var38.length >= -(var10 * 2) + ((vd) this).field_x) {
                              break L7;
                            } else {
                              var10++;
                              continue L4;
                            }
                          }
                        }
                        L8: {
                          if (0 == ((vd) this).field_q) {
                            break L8;
                          } else {
                            if (var10 * 2 + ((vd) this).field_q > var38.length) {
                              break L8;
                            } else {
                              var10++;
                              continue L4;
                            }
                          }
                        }
                        var9 = 1;
                        var10++;
                        continue L4;
                      }
                    }
                  }
                  ((vd) this).field_y = (((vd) this).field_g.c(-30) + -(((vd) this).field_t * ((vd) this).field_z.field_f)) / 2;
                  ((vd) this).field_w = (((vd) this).field_g.a((byte) 55) + -(((vd) this).field_z.field_a * ((vd) this).field_t)) / 2;
                  var12 = ((vd) this).field_y + -(((vd) this).field_g.c(-12) / 2) + ((vd) this).field_t / 2;
                  var13 = ((vd) this).field_w + -(((vd) this).field_g.a((byte) 55) / 2) - -(((vd) this).field_t / 2);
                  if (!((vd) this).field_u) {
                    L9: {
                      var14 = var26.field_E;
                      var26.field_E = 26;
                      var15 = null;
                      var16 = null;
                      var17 = null;
                      if (((vd) this).field_r == null) {
                        break L9;
                      } else {
                        if (!((vd) this).field_r.J(90)) {
                          var27 = new kh(30000);
                          var15 = var27;
                          var27.i(8);
                          ((vd) this).field_r.a(var27, 125);
                          var27.k(-1826190686);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (null == ((vd) this).field_A) {
                        break L10;
                      } else {
                        if (!((vd) this).field_A.J(51)) {
                          var28 = new kh(30000);
                          var16 = var28;
                          var28.i(8);
                          ((vd) this).field_A.a(var28, 84);
                          var28.k(-1826190686);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (null == ((vd) this).field_o) {
                        break L11;
                      } else {
                        if (!((vd) this).field_o.J(73)) {
                          var29 = new kh(30000);
                          var17 = var29;
                          var29.i(8);
                          ((vd) this).field_o.a(var29, -112);
                          var29.k(-1826190686);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var18 = 0;
                    L12: while (true) {
                      if (((vd) this).field_z.field_f <= var18) {
                        L13: {
                          if (((vd) this).field_v > 0) {
                            var39 = var11.a((byte) -72);
                            var40 = new int[((vd) this).field_v][2];
                            var20 = 0;
                            L14: while (true) {
                              if (var20 >= ((vd) this).field_v) {
                                var23 = 0;
                                var20 = var23;
                                L15: while (true) {
                                  if (((vd) this).field_v <= var23) {
                                    break L13;
                                  } else {
                                    this.a(var40[var23][0], var13, var40[var23][1], -113, var17, var12);
                                    var23++;
                                    continue L15;
                                  }
                                }
                              } else {
                                if (var39.length <= var20) {
                                  L16: while (true) {
                                    if (0 != ((vd) this).field_z.b((byte) -5, var40[var20][1], var40[var20][0])) {
                                      var40[var20][0] = 1 - -var3.a(-2 + ((vd) this).field_z.field_f, 0);
                                      var40[var20][1] = 1 - -var3.a(-2 + ((vd) this).field_z.field_a, 0);
                                      continue L16;
                                    } else {
                                      var20++;
                                      continue L14;
                                    }
                                  }
                                } else {
                                  var21 = var3.a(var39.length, 0);
                                  L17: while (true) {
                                    if ((var39[var21][0] ^ -1) != 0) {
                                      var40[var20][0] = var39[var21][0];
                                      var40[var20][1] = var39[var21][1];
                                      var39[var21][0] = -1;
                                      var20++;
                                      continue L14;
                                    } else {
                                      var21++;
                                      if (var21 < var39.length) {
                                        continue L17;
                                      } else {
                                        var21 = 0;
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        var26.field_E = var14;
                        return;
                      } else {
                        var19 = 0;
                        L18: while (true) {
                          if (((vd) this).field_z.field_a <= var19) {
                            var18++;
                            continue L12;
                          } else {
                            if (-1 > (((vd) this).field_z.b((byte) -5, var19, var18) ^ -1)) {
                              this.a(var18, var13, var19, -58, var15, var12);
                              var19++;
                              continue L18;
                            } else {
                              this.a(var18, var13, var19, -44, var16, var12);
                              var19++;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    vd(la param0, boolean param1) {
        super(param0, param1);
        ((vd) this).field_u = false;
        ((vd) this).field_t = 2097152;
        ((vd) this).field_r = new fsa(param0, false);
        wd.a((byte) -98, 1, true, param0, ((vd) this).field_r, false);
        ((vd) this).field_r.b(false, 11468);
        ((vd) this).field_A = new fsa(param0, false);
        ((vd) this).field_o = new fsa(param0, false);
        this.d(true);
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        if (((vd) this).field_u) {
          if (null == ((vd) this).field_z) {
            return false;
          } else {
            L0: {
              var5 = 0;
              if (0 >= ((vd) this).field_y) {
                break L0;
              } else {
                L1: {
                  var6 = ((vd) this).field_g.d(3) - ((vd) this).field_g.c(-49) / 2;
                  var7 = ((vd) this).field_g.e(9648) - (((vd) this).field_g.a((byte) 55) / 2 - ((vd) this).field_w);
                  var8 = ((vd) this).field_t * ((vd) this).field_z.field_f;
                  var9 = ((vd) this).field_z.field_a * ((vd) this).field_t;
                  var10 = ((vd) this).field_y + var8;
                  if (!this.a(false, var9, var6, var7, param2, ((vd) this).field_y)) {
                    if (var5 != 0) {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L1;
                    }
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_12_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var5 = stackIn_12_0;
                  if (!this.a(false, var9, var10 + var6, var7, param2, ((vd) this).field_g.c(-45) + -var10)) {
                    if (var5 != 0) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L2;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L2;
                    }
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_18_0 = stackOut_13_0;
                    break L2;
                  }
                }
                var5 = stackIn_18_0;
                break L0;
              }
            }
            L3: {
              if (param1 == 1) {
                break L3;
              } else {
                var11 = null;
                boolean discarded$1 = ((vd) this).a(-49, 56, -14, 110, -69, 19, (ffa) null);
                break L3;
              }
            }
            L4: {
              if (this.a(param2, param1 ^ -2)) {
                stackOut_25_0 = 1;
                stackIn_27_0 = stackOut_25_0;
                break L4;
              } else {
                if (var5 != 0) {
                  stackOut_24_0 = 1;
                  stackIn_27_0 = stackOut_24_0;
                  break L4;
                } else {
                  stackOut_23_0 = 0;
                  stackIn_27_0 = stackOut_23_0;
                  break L4;
                }
              }
            }
            var5 = stackIn_27_0;
            return var5 != 0;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, kh param4, int param5) {
        if (!(param4 != null)) {
            return;
        }
        la var7 = ((vd) this).b(true);
        param4.field_h = 0;
        if (param3 >= -41) {
            return;
        }
        param4.h((byte) 123);
        fsa var8 = new fsa(var7, param4, true);
        param4.i((byte) 98);
        var8.d((byte) -97, true);
        var8.m(1, param5 - -(((vd) this).field_t * param0));
        var8.c(param1 + ((vd) this).field_t * param2, -19879);
        ((vd) this).field_g.a(-97, var8);
    }

    vd(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          ((vd) this).field_u = false;
          ((vd) this).field_t = 2097152;
          ((vd) this).field_s = param1.b((byte) 44, 2);
          if ((param0.field_E ^ -1) <= -5) {
            L1: {
              ((vd) this).field_t = param1.b((byte) 44, 10) << 1083569648;
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (1 == param1.b((byte) 44, 1)) {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((vd) this).field_u = stackIn_5_1 != 0;
            break L0;
          } else {
            ((vd) this).field_t = 2097152;
            ((vd) this).field_u = true;
            break L0;
          }
        }
        L2: {
          if (-12 < (param0.field_E ^ -1)) {
            break L2;
          } else {
            ((vd) this).field_x = param1.b((byte) 44, 7);
            ((vd) this).field_q = param1.b((byte) 44, 7);
            ((vd) this).field_v = param1.b((byte) 44, 3);
            break L2;
          }
        }
        L3: {
          ((vd) this).field_o = null;
          if (((vd) this).field_u) {
            ((vd) this).field_r = new fsa(param0, false);
            wd.a((byte) -120, 1, true, param0, ((vd) this).field_r, false);
            ((vd) this).field_A = new fsa(param0, false);
            break L3;
          } else {
            ((vd) this).field_r = new fsa(param0, param1, false);
            ((vd) this).field_A = new fsa(param0, param1, false);
            if ((((vd) this).field_v ^ -1) >= -1) {
              break L3;
            } else {
              if (14 > param0.field_E) {
                break L3;
              } else {
                ((vd) this).field_o = new fsa(param0, param1, false);
                break L3;
              }
            }
          }
        }
        L4: {
          if (((vd) this).field_o != null) {
            break L4;
          } else {
            ((vd) this).field_o = new fsa(param0, false);
            wd.a((byte) -93, 7, true, param0, ((vd) this).field_o, false);
            break L4;
          }
        }
        this.d(true);
    }

    private final void d(boolean param0) {
        if (1048576 > ((vd) this).field_t) {
            ((vd) this).field_t = 1048576;
        }
        ((vd) this).field_r.c((byte) 77, false);
        ((vd) this).field_r.b((byte) -11, ((vd) this).field_t, ((vd) this).field_t);
        ((vd) this).field_A.c((byte) 59, false);
        ((vd) this).field_A.b((byte) -11, ((vd) this).field_t, ((vd) this).field_t);
        if (!param0) {
            ((vd) this).field_o = null;
        }
    }

    final void a(byte param0, fsa param1) {
        if (param0 > -115) {
            return;
        }
        ((vd) this).field_A = param1;
    }

    final void a(boolean param0, int param1) {
        ((vd) this).field_s = param1;
        if (param0) {
            ((vd) this).n((byte) 51);
        }
    }

    final void h(int param0) {
        super.h(param0);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -41, ((vd) this).field_s, 2);
        param1.a((byte) 42, ((vd) this).field_t >> 1444174896, 10);
        param1.a((byte) 125, ((vd) this).field_u ? 1 : 0, 1);
        param1.a((byte) -128, ((vd) this).field_x, 7);
        param1.a((byte) 113, ((vd) this).field_q, 7);
        param1.a((byte) -127, ((vd) this).field_v, 3);
        if (!((vd) this).field_u) {
            ((vd) this).field_r.a(param1, 85);
            ((vd) this).field_A.a(param1, 126);
            if ((((vd) this).field_v ^ -1) < -1) {
                ((vd) this).field_o.a(param1, -10);
            }
        }
    }

    final void b(byte param0, boolean param1) {
        ((vd) this).field_u = param1 ? true : false;
        if (param0 < 60) {
            ((vd) this).field_A = null;
        }
    }

    final static void b(int param0) {
        if (!una.a((byte) 105)) {
            return;
        }
        qna.a(param0, false, 4);
    }

    final void k(int param0) {
        if (param0 != 5418) {
            Object var3 = null;
            boolean discarded$0 = this.a(false, -81, 38, -44, (pc) null, -15);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            ((vd) this).field_A = null;
        }
        return param0;
    }

    final void n(byte param0) {
        super.n((byte) 105);
        this.c(127);
        if (param0 <= 68) {
            ((vd) this).field_r = null;
        }
    }

    static {
    }
}
