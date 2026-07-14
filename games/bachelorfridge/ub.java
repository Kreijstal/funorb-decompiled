/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends at {
    static volatile boolean field_l;
    static sna field_k;
    gj field_o;
    static int field_j;
    private lc field_n;
    private int field_m;

    public static void d(int param0) {
        if (param0 != 1) {
            return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1) {
        int var3 = BachelorFridge.field_y;
        nc var4 = (nc) (Object) tb.field_c.b((byte) 90);
        while (var4 != null) {
            qn.a(param0, var4, -8692);
            var4 = (nc) (Object) tb.field_c.c(0);
        }
        if (param1 != 1) {
            return;
        }
        mha var5 = (mha) (Object) wba.field_g.b((byte) 90);
        while (var5 != null) {
            sja.a(param0, var5, true);
            var5 = (mha) (Object) wba.field_g.c(param1 + -1);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, uha param5, int param6, int param7) {
        int var8_int = 0;
        gna[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gna var13 = null;
        int var14 = 0;
        int var15 = 0;
        gna[] var16 = null;
        int[] var17 = null;
        gna[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        gna[][] stackIn_34_0 = null;
        gna[][] stackIn_35_0 = null;
        gna[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        gna[][] stackOut_33_0 = null;
        gna[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        gna[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        L0: {
          var15 = BachelorFridge.field_y;
          if (param7 > param4) {
            L1: {
              stackOut_33_0 = gd.field_n;
              stackIn_35_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if ((param4 ^ -1) == 0) {
                stackOut_35_0 = (gna[][]) (Object) stackIn_35_0;
                stackOut_35_1 = 1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L1;
              } else {
                stackOut_34_0 = (gna[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 4 + param4;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                break L1;
              }
            }
            L2: {
              var16 = (gna[]) (Object) stackIn_36_0[stackIn_36_1];
              var18 = var16;
              var8 = var18;
              var9 = 1;
              if (param1) {
                if (0 == (param4 ^ -1)) {
                  var10 = 0;
                  L3: while (true) {
                    if (qha.field_c.length <= var10) {
                      break L2;
                    } else {
                      if ((fia.field_r[var10 / 8] & 1 << (7 & var10)) != 0) {
                        var9 = 0;
                        break L2;
                      } else {
                        var10++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= var16.length - 1) {
                        break L5;
                      } else {
                        if (0 == (sca.field_c[(var10 + param0) / 8] & 1 << (7 & param0 + var10))) {
                          var10++;
                          continue L4;
                        } else {
                          var9 = 0;
                          break L5;
                        }
                      }
                    }
                    param0 = param0 + (mja.field_s[param4] & 255);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var18 = var8;
            var10 = 0;
            var11 = 0;
            L6: while (true) {
              L7: {
                stackOut_52_0 = var11;
                stackIn_54_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (param4 == -1) {
                  stackOut_54_0 = stackIn_54_0;
                  stackOut_54_1 = qha.field_c.length;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L7;
                } else {
                  stackOut_53_0 = stackIn_53_0;
                  stackOut_53_1 = var18.length - 1;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  break L7;
                }
              }
              if (stackIn_55_0 >= stackIn_55_1) {
                if (var10 == 0) {
                  var11 = 0;
                  L8: while (true) {
                    if (var18.length - 1 <= var11) {
                      break L0;
                    } else {
                      L9: {
                        if (0 == (param4 ^ -1)) {
                          param6 = var11;
                          break L9;
                        } else {
                          bja.field_o[param4] = (byte)var11;
                          break L9;
                        }
                      }
                      ub.a(param0, param1, -93, param3, param4 - -1, param5, param6, param7);
                      if (fla.field_q) {
                        return;
                      } else {
                        var11++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                L10: {
                  if (-1 != param4) {
                    bja.field_o[param4] = (byte)var11;
                    break L10;
                  } else {
                    param6 = var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (param4 != -1) {
                      break L12;
                    } else {
                      if (-2 == (qha.field_c.length ^ -1)) {
                        var12 = 1;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (param1) {
                    if (!var13.field_t) {
                      if (var9 != 0) {
                        if (var13.field_u) {
                          var12 = 1;
                          break L11;
                        } else {
                          var12 = 0;
                          break L11;
                        }
                      } else {
                        var12 = 0;
                        break L11;
                      }
                    } else {
                      var12 = 1;
                      break L11;
                    }
                  } else {
                    if (-1 != param4) {
                      L13: {
                        if (var11 != (255 & pw.field_w.field_Eb[param4])) {
                          stackOut_69_0 = 0;
                          stackIn_70_0 = stackOut_69_0;
                          break L13;
                        } else {
                          stackOut_68_0 = 1;
                          stackIn_70_0 = stackOut_68_0;
                          break L13;
                        }
                      }
                      var12 = stackIn_70_0;
                      break L11;
                    } else {
                      if (pw.field_w.field_Pb != qha.field_c[var11]) {
                        var12 = 0;
                        break L11;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (var12 != 0) {
                    var10 = 1;
                    ub.a(param0, param1, -73, param3, param4 - -1, param5, param6, param7);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (fla.field_q) {
                  return;
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L15: while (true) {
              if (pha.field_h.length <= var9) {
                if (var8_int != 0) {
                  fla.field_q = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var21 = pha.field_h[var9];
                var20 = var21;
                var19 = var20;
                var17 = var19;
                var10_ref_int__ = var17;
                var11 = 0;
                var12 = 0;
                L16: while (true) {
                  if (var12 >= var21.length) {
                    L17: {
                      if (var11 != 0) {
                        break L17;
                      } else {
                        if (ld.field_q == param4) {
                          break L17;
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var12 = 0;
                    L18: while (true) {
                      if (var21.length <= var12) {
                        var8_int = 0;
                        var9++;
                        continue L15;
                      } else {
                        var13_int = var21[var12];
                        if (var13_int != -1) {
                          if (var13_int < param4) {
                            ala.field_b[var13_int] = true;
                            var12 += 2;
                            continue L18;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        } else {
                          uu.field_yb = true;
                          var12 += 2;
                          continue L18;
                        }
                      }
                    }
                  } else {
                    L19: {
                      var13_int = var21[var12];
                      var14 = var10_ref_int__[var12 + 1];
                      if ((var13_int ^ -1) != 0) {
                        L20: {
                          if (param4 != var13_int) {
                            break L20;
                          } else {
                            if (var14 != param3) {
                              break L20;
                            } else {
                              var11 = 1;
                              var12 += 2;
                              continue L16;
                            }
                          }
                        }
                        if (param4 > var13_int) {
                          if ((255 & bja.field_o[var13_int]) != var14) {
                            break L19;
                          } else {
                            var12 += 2;
                            continue L16;
                          }
                        } else {
                          var9++;
                          continue L15;
                        }
                      } else {
                        if (qha.field_c[param6] != var14) {
                          break L19;
                        } else {
                          var12 += 2;
                          continue L16;
                        }
                      }
                    }
                    var9++;
                    continue L15;
                  }
                }
              }
            }
          }
        }
        L21: {
          if (param2 < -64) {
            break L21;
          } else {
            ub.a(25, 91);
            break L21;
          }
        }
    }

    final boolean c(byte param0) {
        int var4 = BachelorFridge.field_y;
        ((ub) this).field_m = ((ub) this).field_m - 1;
        if ((((ub) this).field_m - 1 ^ -1) < -1) {
            return false;
        }
        ((ub) this).field_o.field_h.a(23189);
        jm var5 = (jm) (Object) ((ub) this).field_n.field_k.b((byte) 90);
        while (var5 != null) {
            var5.a((ub) this, -107);
            var5 = (jm) (Object) ((ub) this).field_n.field_k.c(0);
        }
        int var3 = 81 % ((71 - param0) / 47);
        return true;
    }

    ub(gj param0, lc param1) {
        ((ub) this).field_m = 25;
        ((ub) this).field_o = param0;
        ((ub) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
