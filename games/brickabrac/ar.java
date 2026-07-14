/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    static String[] field_a;

    final static void a(boolean param0, om param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        rk[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        rk var13 = null;
        int var14 = 0;
        int var15 = 0;
        rk[] var16 = null;
        int[] var17 = null;
        rk[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        rk[][] stackIn_33_0 = null;
        rk[][] stackIn_34_0 = null;
        rk[][] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        rk[][] stackOut_32_0;
        rk[][] stackOut_34_0;
        int stackOut_34_1;
        rk[][] stackOut_33_0;
        int stackOut_33_1;
        int stackOut_52_0;
        int stackOut_54_0;
        int stackOut_54_1;
        int stackOut_53_0;
        int stackOut_53_1;
        int stackOut_69_0;
        int stackOut_68_0;
        L0: {
          var15 = BrickABrac.field_J ? 1 : 0;
          if (param4 < param6) {
            L1: {
              stackOut_32_0 = ab.field_A;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if ((param4 ^ -1) == 0) {
                stackOut_34_0 = (rk[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L1;
              } else {
                stackOut_33_0 = (rk[][]) (Object) stackIn_33_0;
                stackOut_33_1 = param4 + 4;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L1;
              }
            }
            L2: {
              var16 = (rk[]) (Object) stackIn_35_0[stackIn_35_1];
              var18 = var16;
              var8 = var18;
              var9 = 1;
              if (param0) {
                if ((param4 ^ -1) == 0) {
                  var10 = 0;
                  L3: while (true) {
                    if (w.field_n.length <= var10) {
                      break L2;
                    } else {
                      if (-1 != (rh.field_d[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
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
                      if (-1 + var16.length <= var10) {
                        break L5;
                      } else {
                        if (0 != (lj.field_p[(var10 + param7) / 8] & 1 << (param7 + var10 & 7))) {
                          var9 = 0;
                          break L5;
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                    param7 = param7 + (255 & jg.field_c[param4]);
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
                stackOut_52_0 = var11 ^ -1;
                stackIn_54_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (-1 == param4) {
                  stackOut_54_0 = stackIn_54_0;
                  stackOut_54_1 = w.field_n.length;
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
              if (stackIn_55_0 <= (stackIn_55_1 ^ -1)) {
                if (var10 != 0) {
                  break L0;
                } else {
                  var11 = 0;
                  L8: while (true) {
                    if (-1 + var18.length <= var11) {
                      break L0;
                    } else {
                      L9: {
                        if (-1 != param4) {
                          qo.field_J[param4] = (byte)var11;
                          break L9;
                        } else {
                          param3 = var11;
                          break L9;
                        }
                      }
                      ar.a(param0, param1, param2, param3, 1 + param4, 0, param6, param7);
                      if (!dc.field_g) {
                        var11++;
                        continue L8;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  if (param4 != -1) {
                    qo.field_J[param4] = (byte)var11;
                    break L10;
                  } else {
                    param3 = var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (param4 != 0) {
                      break L12;
                    } else {
                      if (-2 == w.field_n.length) {
                        var12 = 1;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = var8[1 - -var11];
                  if (param0) {
                    if (!var13.field_Nb) {
                      if (var9 != 0) {
                        if (var13.field_eb) {
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
                    if (param4 != -1) {
                      L13: {
                        if ((255 & o.field_e.field_Tb[param4]) != var11) {
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
                      if (o.field_e.field_jc != w.field_n[var11]) {
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
                    ar.a(param0, param1, param2, param3, param4 - -1, 0, param6, param7);
                    var10 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (dc.field_g) {
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
              if (br.field_bc.length <= var9) {
                if (var8_int != 0) {
                  dc.field_g = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var21 = br.field_bc[var9];
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
                        if (cq.field_p == param4) {
                          break L17;
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var8_int = 0;
                    var12 = 0;
                    L18: while (true) {
                      if (var21.length > var12) {
                        var13_int = var21[var12];
                        if ((var13_int ^ -1) != 0) {
                          if (param4 > var13_int) {
                            h.field_D[var13_int] = true;
                            var12 += 2;
                            continue L18;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        } else {
                          lk.field_s = true;
                          var12 += 2;
                          continue L18;
                        }
                      } else {
                        var9++;
                        continue L15;
                      }
                    }
                  } else {
                    L19: {
                      var13_int = var21[var12];
                      var14 = var10_ref_int__[1 + var12];
                      if (0 == (var13_int ^ -1)) {
                        if (var14 != w.field_n[param3]) {
                          break L19;
                        } else {
                          var12 += 2;
                          continue L16;
                        }
                      } else {
                        L20: {
                          if (var13_int != param4) {
                            break L20;
                          } else {
                            if (var14 != param2) {
                              break L20;
                            } else {
                              var11 = 1;
                              var12 += 2;
                              continue L16;
                            }
                          }
                        }
                        if (var13_int < param4) {
                          if (var14 != (qo.field_J[var13_int] & 255)) {
                            break L19;
                          } else {
                            var12 += 2;
                            continue L16;
                          }
                        } else {
                          var9++;
                          continue L15;
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
          if (param5 == 0) {
            break L21;
          } else {
            ar.a(33);
            break L21;
          }
        }
    }

    final static int a(byte param0) {
        if (param0 != 120) {
            return 9;
        }
        return af.field_u;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            ar.a(true, (om) null, -103, -124, -112, 116, 82, 7);
        }
        field_a = null;
    }

    static {
    }
}
