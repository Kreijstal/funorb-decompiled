/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vp field_a;
    static sc field_f;
    static th field_d;
    static String[] field_b;
    static int[] field_c;
    static String field_e;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 >= -2) {
            bh.a((byte) 84);
        }
        field_d = null;
        field_f = null;
    }

    final static String a(int param0, ka param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = null;
          if (param1.field_n == null) {
            break L0;
          } else {
            L1: {
              var6 = param1.field_n;
              var2 = var6;
              var2 = var6;
              if (1 == param1.field_h) {
                var2 = "<img=0>" + var6;
                break L1;
              } else {
                break L1;
              }
            }
            if (-3 != (param1.field_h ^ -1)) {
              break L0;
            } else {
              var2 = "<img=1>" + var2;
              break L0;
            }
          }
        }
        L2: {
          if (param0 < -125) {
            break L2;
          } else {
            var5 = null;
            bh.a(-58, -66, -108, (jh) null, true, 107, -83, 97);
            break L2;
          }
        }
        L3: {
          var3 = "";
          if (2 != param1.field_l) {
            L4: {
              if (-1 != (param1.field_l ^ -1)) {
                break L4;
              } else {
                if (sn.field_Hb) {
                  var3 = "[" + ne.field_vb + "] ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1.field_l != 1) {
                break L5;
              } else {
                var3 = "[" + vl.a(ae.field_g, new String[1], 2) + "] ";
                break L5;
              }
            }
            L6: {
              if (-5 != (param1.field_l ^ -1)) {
                break L6;
              } else {
                if (null == bp.field_t) {
                  break L6;
                } else {
                  var3 = "[" + bp.field_t + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if ((param1.field_l ^ -1) == -4) {
                var3 = "[#" + param1.field_g + "] ";
                break L7;
              } else {
                break L7;
              }
            }
            if (!param1.field_k) {
              var3 = var3 + var2 + ": ";
              break L3;
            } else {
              break L3;
            }
          } else {
            if (!param1.field_k) {
              L8: {
                if (param1.field_i != 0) {
                  break L8;
                } else {
                  if (param1.field_o != 0) {
                    break L8;
                  } else {
                    var3 = vl.a(v.field_c, new String[1], 2);
                    break L3;
                  }
                }
              }
              var3 = vl.a(lc.field_n, new String[1], 2);
              break L3;
            } else {
              break L3;
            }
          }
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, jh param3, boolean param4, int param5, int param6, int param7) {
        int var8 = 0;
        mo[] var8_ref_mo__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mo var13_ref_mo = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        mo[] var17 = null;
        mo[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        mo[][] stackIn_4_0 = null;
        mo[][] stackIn_5_0 = null;
        mo[][] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        mo[][] stackOut_3_0 = null;
        mo[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mo[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        L0: {
          var15 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -1712) {
            break L0;
          } else {
            var16 = null;
            String discarded$1 = bh.a(-40, (ka) null);
            break L0;
          }
        }
        L1: {
          if (param7 >= param5) {
            var8 = 1;
            var9 = 0;
            L2: while (true) {
              if (var9 >= iq.field_b.length) {
                if (var8 == 0) {
                  break L1;
                } else {
                  dj.field_l = true;
                  break L1;
                }
              } else {
                var22 = iq.field_b[var9];
                var21 = var22;
                var20 = var21;
                var19 = var20;
                var10 = var19;
                var11 = 0;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= var22.length) {
                    L4: {
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (kj.field_h == param7) {
                          break L4;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                    var8 = 0;
                    var12 = 0;
                    L5: while (true) {
                      if (var22.length > var12) {
                        var13 = var22[var12];
                        if ((var13 ^ -1) != 0) {
                          if (var13 < param7) {
                            ll.field_c[var13] = true;
                            var12 += 2;
                            continue L5;
                          } else {
                            var12 += 2;
                            continue L5;
                          }
                        } else {
                          lp.field_p = true;
                          var12 += 2;
                          continue L5;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  } else {
                    var13 = var22[var12];
                    var14 = var10[var12 - -1];
                    if (-1 != var13) {
                      L6: {
                        if (param7 != var13) {
                          break L6;
                        } else {
                          if (param1 == var14) {
                            var11 = 1;
                            var12 += 2;
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (param7 > var13) {
                        if (var14 != (255 & rl.field_v[var13])) {
                          var12 = var12;
                          var9++;
                          continue L2;
                        } else {
                          var12 += 2;
                          continue L3;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    } else {
                      if (var14 == qo.field_r[param6]) {
                        var12 += 2;
                        continue L3;
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            L7: {
              stackOut_3_0 = ma.field_b;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (-1 != param7) {
                stackOut_5_0 = (mo[][]) (Object) stackIn_5_0;
                stackOut_5_1 = 4 - -param7;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L7;
              } else {
                stackOut_4_0 = (mo[][]) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L7;
              }
            }
            L8: {
              var17 = stackIn_6_0[stackIn_6_1];
              var18 = var17;
              var8_ref_mo__ = var18;
              var9 = 1;
              if (!param4) {
                break L8;
              } else {
                if (-1 != param7) {
                  var17 = var18;
                  var10_int = 0;
                  L9: while (true) {
                    L10: {
                      if (var10_int >= var17.length - 1) {
                        break L10;
                      } else {
                        if (-1 != (tg.field_a[(param2 - -var10_int) / 8] & 1 << (param2 + var10_int & 7) ^ -1)) {
                          var9 = 0;
                          break L10;
                        } else {
                          var10_int++;
                          continue L9;
                        }
                      }
                    }
                    param2 = param2 + (od.field_Gb[param7] & 255);
                    break L8;
                  }
                } else {
                  var10_int = 0;
                  L11: while (true) {
                    if (qo.field_r.length <= var10_int) {
                      break L8;
                    } else {
                      if (0 == (fg.field_k[var10_int / 8] & 1 << (7 & var10_int))) {
                        var10_int++;
                        continue L11;
                      } else {
                        var9 = 0;
                        break L8;
                      }
                    }
                  }
                }
              }
            }
            var10_int = 0;
            var11 = 0;
            L12: while (true) {
              L13: {
                if (param7 == -1) {
                  stackOut_23_0 = qo.field_r.length;
                  stackIn_24_0 = stackOut_23_0;
                  break L13;
                } else {
                  stackOut_22_0 = var18.length - 1;
                  stackIn_24_0 = stackOut_22_0;
                  break L13;
                }
              }
              if (stackIn_24_0 <= var11) {
                if (var10_int != 0) {
                  break L1;
                } else {
                  var11 = 0;
                  L14: while (true) {
                    if (var11 >= -1 + var18.length) {
                      break L1;
                    } else {
                      L15: {
                        if ((param7 ^ -1) == 0) {
                          param6 = var11;
                          break L15;
                        } else {
                          rl.field_v[param7] = (byte)var11;
                          break L15;
                        }
                      }
                      bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                      if (dj.field_l) {
                        return;
                      } else {
                        var11++;
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                L16: {
                  if (-1 == param7) {
                    param6 = var11;
                    break L16;
                  } else {
                    rl.field_v[param7] = (byte)var11;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (0 != (param7 ^ -1)) {
                      break L18;
                    } else {
                      if (1 != qo.field_r.length) {
                        break L18;
                      } else {
                        var12 = 1;
                        break L17;
                      }
                    }
                  }
                  var13_ref_mo = var8_ref_mo__[var11 + 1];
                  if (param4) {
                    L19: {
                      if (!var13_ref_mo.field_Ab) {
                        if (var9 != 0) {
                          if (var13_ref_mo.field_Z) {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            break L19;
                          } else {
                            stackOut_45_0 = 0;
                            stackIn_48_0 = stackOut_45_0;
                            break L19;
                          }
                        } else {
                          stackOut_43_0 = 0;
                          stackIn_48_0 = stackOut_43_0;
                          break L19;
                        }
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_48_0 = stackOut_41_0;
                        break L19;
                      }
                    }
                    var12 = stackIn_48_0;
                    break L17;
                  } else {
                    if (0 != (param7 ^ -1)) {
                      L20: {
                        if ((mh.field_c.field_Zb[param7] & 255) != var11) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L20;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L20;
                        }
                      }
                      var12 = stackIn_39_0;
                      break L17;
                    } else {
                      if (qo.field_r[var11] != mh.field_c.field_mc) {
                        var12 = 0;
                        break L17;
                      } else {
                        var12 = 1;
                        break L17;
                      }
                    }
                  }
                }
                L21: {
                  if (var12 == 0) {
                    break L21;
                  } else {
                    var10_int = 1;
                    bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                    break L21;
                  }
                }
                if (dj.field_l) {
                  return;
                } else {
                  var11++;
                  continue L12;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Type your password again to make sure it's correct";
        field_c = new int[8192];
        field_d = new th();
    }
}
