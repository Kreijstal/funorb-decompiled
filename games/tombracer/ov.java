/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends nv implements mra {
    private pc field_s;
    private up field_r;
    private mg field_n;
    private int field_u;
    private boolean field_q;
    private int field_w;
    private boolean field_v;
    private boolean field_t;
    private int field_o;
    static int field_p;

    public final boolean b(int param0) {
        int var2 = -21 % ((37 - param0) / 45);
        return ((ov) this).field_t;
    }

    final void a(up param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ov) this).field_r = param0;
              if (param1) {
                break L1;
              } else {
                ((ov) this).field_u = -49;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ov.W(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        la var9 = null;
        int var10 = 0;
        pc var11 = null;
        int var12 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (!((ov) this).field_q) {
            break L0;
          } else {
            if (((ov) this).m((byte) 19).u(-25561)) {
              ((ov) this).field_t = false;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!((ov) this).i(12340).g(108)) {
            if (null != ((ov) this).field_n) {
              ((ov) this).field_n.d(0);
              if (!((ov) this).field_n.c(0)) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((ov) this).field_v) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((ov) this).field_v = stackIn_12_1 != 0;
                ((ov) this).field_o = 0;
                break L1;
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        ((ov) this).field_t = ((ov) this).field_v;
        if (!((ov) this).field_v) {
          return;
        } else {
          L3: {
            var2 = ((ov) this).field_w;
            if (0 != var2) {
              break L3;
            } else {
              var2 = 268435456;
              break L3;
            }
          }
          L4: {
            if (0 >= ((ov) this).field_u) {
              ((ov) this).field_o = var2;
              break L4;
            } else {
              ((ov) this).field_o = ((ov) this).field_o + ((ov) this).field_u;
              if (((ov) this).field_o <= var2) {
                break L4;
              } else {
                ((ov) this).field_o = var2;
                break L4;
              }
            }
          }
          L5: {
            var3 = ((ov) this).field_g.g(-25787) >> 2;
            var4 = hua.a((byte) 111, var3);
            var5 = bua.a(0, var3);
            var6 = 131072 + iia.d(((ov) this).field_g.c(param0 + -5467), ((ov) this).field_g.a((byte) 55), param0 ^ 5416) / 2;
            var7 = ((ov) this).field_g.d(3) + gqa.a(var4, (byte) 24, var6);
            var8 = ((ov) this).field_g.e(9648) + gqa.a(var5, (byte) 24, var6);
            ((ov) this).field_s.a(var7, gqa.a(var4, (byte) 24, ((ov) this).field_o) + var7, var8, gqa.a(var5, (byte) 24, ((ov) this).field_o) + var8, 44);
            ((ov) this).field_s.field_b = ((ov) this).field_o;
            ((ov) this).field_s.field_i = ((ov) this).field_g.P(param0 ^ param0) << 16;
            var9_int = ((ov) this).field_r.field_j;
            if (3 == var9_int) {
              ((ov) this).field_s.field_j = 6;
              break L5;
            } else {
              if (var9_int == 2) {
                ((ov) this).field_s.field_j = 7;
                break L5;
              } else {
                ((ov) this).field_s.field_j = 5;
                break L5;
              }
            }
          }
          L6: {
            var9 = ((ov) this).b(true);
            var10 = var9.a(1, (gma) (Object) ((ov) this).field_g, -66, ((ov) this).field_s, (gma) (Object) ((ov) this).e(6), ((ov) this).field_r) ? 1 : 0;
            var9.b(false).a((byte) 120, ((ov) this).field_s, ((ov) this).field_r);
            if (var10 == 0) {
              break L6;
            } else {
              var11 = ((ov) this).field_s;
              L7: while (true) {
                if (var11 == null) {
                  break L6;
                } else {
                  if (!var11.field_l) {
                    break L6;
                  } else {
                    L8: {
                      if (null != var11.field_h) {
                        break L8;
                      } else {
                        var9.b(false).a(var11, (gma) (Object) ((ov) this).field_g, (byte) -123);
                        int discarded$1 = var9.a(param0 ^ 5463, var11.field_a, ((ov) this).field_r, 524288, 524288, var11.field_e);
                        break L8;
                      }
                    }
                    var11 = var11.field_h;
                    continue L7;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final pc c(int param0) {
        if (param0 < 99) {
            return null;
        }
        return ((ov) this).field_s;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              int discarded$6 = 11955;
              if (!q.a(param1)) {
                var6 = aba.field_c;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    L2: {
                      if (param0 > 1) {
                        break L2;
                      } else {
                        field_p = -59;
                        break L2;
                      }
                    }
                    var7 = hb.field_x;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L3: while (true) {
                      if (var8 >= var7.length) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (var4 == param1) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "ov.R(" + param0 + 44 + param1 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            if (param0) {
                ((ov) this).field_u = -117;
            }
            ((ov) this).field_n.a(15637, param1);
            param1.a((byte) -23, ((ov) this).field_w >> 16, 10);
            ((ov) this).field_r.a(param1, (byte) 125);
            param1.a((byte) 85, !((ov) this).field_q ? 0 : 1, 1);
            param1.a((byte) 45, ((ov) this).field_u >> 16, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ov.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((ov) this).field_q = false;
        }
        return 4;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ufa.a(-57, param1);
              var7_int = 0;
              var8 = -param0 + param1;
              if (0 > var8) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            L2: {
              if (param2 < gca.field_d) {
                break L2;
              } else {
                if (param2 <= hc.field_h) {
                  var39 = vaa.field_a[param2];
                  var16 = rp.a(ss.field_c, -16226, pka.field_b, param6 - param1);
                  var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -param1);
                  var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 + -var8);
                  var19 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var8);
                  nra.a((byte) -55, param4, var18, var39, var16);
                  nra.a((byte) -55, param5, var19, var39, var18);
                  nra.a((byte) -55, param4, var17, var39, var19);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var14 = -1;
            L3: while (true) {
              if (var9 <= var7_int) {
                break L0;
              } else {
                L4: {
                  var14 += 2;
                  var13 += 2;
                  var10 = var10 + var13;
                  var12 = var12 + var14;
                  if (0 > var12) {
                    break L4;
                  } else {
                    if (var11 >= 1) {
                      var11--;
                      var12 = var12 - (var11 << 1);
                      pqa.field_m[var11] = var7_int;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7_int++;
                  if (0 <= var10) {
                    var9--;
                    var10 = var10 - (var9 << 1);
                    var15 = param2 - var9;
                    var16 = param2 + var9;
                    if (var16 < gca.field_d) {
                      break L5;
                    } else {
                      if (hc.field_h >= var15) {
                        if (var8 <= var9) {
                          L6: {
                            var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7_int);
                            var18 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                            if (var16 > hc.field_h) {
                              break L6;
                            } else {
                              nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                              break L6;
                            }
                          }
                          if (gca.field_d <= var15) {
                            nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          L7: {
                            var17 = pqa.field_m[var9];
                            var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7_int);
                            var19 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                            var20 = rp.a(ss.field_c, -16226, pka.field_b, var17 + param6);
                            var21 = rp.a(ss.field_c, -16226, pka.field_b, -var17 + param6);
                            if (var16 <= hc.field_h) {
                              var40 = vaa.field_a[var16];
                              nra.a((byte) -55, param4, var21, var40, var19);
                              nra.a((byte) -55, param5, var20, var40, var21);
                              nra.a((byte) -55, param4, var18, var40, var20);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (var15 >= gca.field_d) {
                            var41 = vaa.field_a[var15];
                            nra.a((byte) -55, param4, var21, var41, var19);
                            nra.a((byte) -55, param5, var20, var41, var21);
                            nra.a((byte) -55, param4, var18, var41, var20);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var15 = param2 + -var7_int;
                var16 = param2 - -var7_int;
                if (var16 < gca.field_d) {
                  continue L3;
                } else {
                  if (hc.field_h < var15) {
                    continue L3;
                  } else {
                    var17 = var9 + param6;
                    var18 = param6 + -var9;
                    if (var17 < pka.field_b) {
                      continue L3;
                    } else {
                      if (var18 > ss.field_c) {
                        continue L3;
                      } else {
                        var17 = rp.a(ss.field_c, -16226, pka.field_b, var17);
                        var18 = rp.a(ss.field_c, -16226, pka.field_b, var18);
                        if (var8 <= var7_int) {
                          L8: {
                            if (hc.field_h >= var16) {
                              nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          if (gca.field_d <= var15) {
                            nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                            continue L3;
                          } else {
                            continue L3;
                          }
                        } else {
                          L9: {
                            if (var11 < var7_int) {
                              stackOut_40_0 = pqa.field_m[var7_int];
                              stackIn_41_0 = stackOut_40_0;
                              break L9;
                            } else {
                              stackOut_39_0 = var11;
                              stackIn_41_0 = stackOut_39_0;
                              break L9;
                            }
                          }
                          L10: {
                            var19 = stackIn_41_0;
                            var20 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var19);
                            var21 = rp.a(ss.field_c, -16226, pka.field_b, -var19 + param6);
                            if (var16 <= hc.field_h) {
                              var42 = vaa.field_a[var16];
                              nra.a((byte) -55, param4, var21, var42, var18);
                              nra.a((byte) -55, param5, var20, var42, var21);
                              nra.a((byte) -55, param4, var17, var42, var20);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          if (var15 < gca.field_d) {
                            continue L3;
                          } else {
                            var43 = vaa.field_a[var15];
                            nra.a((byte) -55, param4, var21, var43, var18);
                            nra.a((byte) -55, param5, var20, var43, var21);
                            nra.a((byte) -55, param4, var17, var43, var20);
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "ov.AA(" + param0 + 44 + param1 + 44 + param2 + 44 + 0 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    ov(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((ov) this).field_s = new pc();
        ((ov) this).field_o = 0;
        try {
          L0: {
            L1: {
              ((ov) this).field_n = new mg(param0.field_E, param1);
              ((ov) this).field_w = param1.b((byte) 44, 10) << 16;
              ((ov) this).field_r = ad.a((byte) 87, param1);
              if (8 > param0.field_E) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param1.b((byte) 44, 1) != -2) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((ov) this).field_q = stackIn_5_1 != 0;
                break L1;
              }
            }
            L3: {
              if (-12 > param0.field_E) {
                break L3;
              } else {
                ((ov) this).field_u = param1.b((byte) 44, 8) << 16;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ov.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        return uk.a(param2, (byte) 2, param1) || pr.a(param1, -23611, param2);
    }

    final static boolean b() {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -1;
            if (hb.field_t == null) {
              break L1;
            } else {
              if (hb.field_t.field_c != -1) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int a(int param0, int param1) {
        param0 = upa.a(((ov) this).field_v, param0, (byte) -106);
        param0 = fs.a((byte) 127, param0, ((ov) this).field_o);
        if (param1 >= -48) {
            return 84;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 12 % ((param0 - 28) / 49);
        if (!(!((ov) this).field_k)) {
            return;
        }
        super.m(78);
        if (!(((ov) this).field_f)) {
            ((ov) this).field_t = false;
        }
    }

    public final void a(int param0, mg param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ov) this).field_n = param1;
              if (param0 >= 81) {
                break L1;
              } else {
                boolean discarded$2 = ((ov) this).p((byte) -109);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ov.H(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              ((ov) this).field_r.a((gma) (Object) ((ov) this).e(6), 2348);
              if (param0) {
                break L1;
              } else {
                ((ov) this).field_q = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ov.Q(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            Object var3 = null;
            ((ov) this).a(true, (fsa) null);
        }
        return false;
    }

    ov(la param0, boolean param1) {
        super(param0, param1);
        ((ov) this).field_s = new pc();
        ((ov) this).field_o = 0;
        try {
            ((ov) this).field_n = new mg();
            ((ov) this).field_r = new up(1, 10);
            ((ov) this).field_r.b(1, 13);
            ((ov) this).field_w = 0;
            ((ov) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ov.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.b(117, param1);
              if (param0 >= 112) {
                break L1;
              } else {
                int discarded$2 = ((ov) this).a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ov.NB(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
    }
}
