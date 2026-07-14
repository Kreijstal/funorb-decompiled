/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends gh {
    private gh field_Yb;
    static ul field_Vb;
    static String field_Xb;
    static String field_Zb;
    static dj field_Sb;
    static gk field_Wb;
    static c field_ac;
    static id field_Tb;
    static int[][] field_cc;
    static int field_bc;
    static int field_Ub;
    static int field_dc;

    final static qb d(byte param0) {
        mg.field_hc = mg.field_hc - 1;
        if (!(0 <= mg.field_hc - 1)) {
            mg.field_hc = mg.field_hc + 10000;
        }
        int var1 = -54 % ((-5 - param0) / 60);
        return k.field_Cb[mg.field_hc];
    }

    final static void l(int param0) {
        jf.c(true);
        if (param0 != 0) {
            field_bc = 91;
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
            ol.l(15);
            if ((nj.field_Q ^ -1) > -21) {
                return true;
            }
            if (!ri.c(6995)) {
                return true;
            }
            if (ua.field_o <= 0) {
                return false;
            }
            if (a.a(105)) {
                return false;
            }
            return true;
        }
        if ((nj.field_Q ^ -1) > -21) {
            return true;
        }
        if (!ri.c(6995)) {
            return true;
        }
        if (ua.field_o <= 0) {
            return false;
        }
        if (a.a(105)) {
            return false;
        }
        return true;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param0 - -param2) <= pb.field_j) {
            return param0 - -param2;
        }
        if (!(param1 > param0 - param3)) {
            return -param3 + param0;
        }
        return pb.field_j + -param3;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        if (param2 != 31) {
            return false;
        }
        return 0 == (param0[param1 >> -1978231579] & 1 << (param1 & 31)) ? true : false;
    }

    final static ud a(int param0, boolean param1, int param2, int param3) {
        int var5 = SteelSentinels.field_G;
        if (!param1) {
            return null;
        }
        ud var4 = (ud) (Object) uf.field_f.e(13058);
        while (var4 != null) {
            if (!((var4.field_t ^ -1) != (param2 ^ -1))) {
                return var4;
            }
            var4 = (ud) (Object) uf.field_f.a((byte) -86);
        }
        ud var4_ref = new ud();
        var4_ref.field_u = param3;
        var4_ref.field_t = param2;
        uf.field_f.a(3, (ck) (Object) var4_ref);
        r.a(27153, var4_ref, param0);
        return var4_ref;
    }

    public static void k(int param0) {
        field_Xb = null;
        field_cc = null;
        field_Sb = null;
        if (param0 >= -5) {
            return;
        }
        field_ac = null;
        field_Zb = null;
        field_Wb = null;
        field_Vb = null;
        field_Tb = null;
    }

    final boolean b(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 <= -125) {
          L0: {
            ((ol) this).a((byte) 11, true);
            if (0 == lb.field_gc) {
              if (0 == ((ol) this).field_Yb.field_Eb) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (((ol) this).field_Eb == 0) {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L0;
              } else {
                L1: {
                  if (0 == ((ol) this).field_Yb.field_Eb) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L1;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  }
                }
                return stackIn_17_0 != 0;
              }
            }
          }
          return stackIn_22_0 != 0;
        } else {
          field_ac = null;
          ((ol) this).a((byte) 11, true);
          if (0 != lb.field_gc) {
            if (((ol) this).field_Eb != 0) {
              L2: {
                if (0 == ((ol) this).field_Yb.field_Eb) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0 != 0;
            } else {
              return true;
            }
          } else {
            L3: {
              if (0 == ((ol) this).field_Yb.field_Eb) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    ol(gh param0, gh param1, gh param2, gh param3, gh param4, gh param5) {
        int var12 = 0;
        gh var13 = null;
        gh var14 = null;
        int var15 = 0;
        gh var17 = new gh(0L, param1, od.field_b.toUpperCase());
        var17.field_Kb = 1;
        ((ol) this).field_Yb = new gh(0L, param2);
        gh var8 = new gh(0L, param3);
        gh var9 = new gh(0L, param3, od.field_f);
        var9.field_Kb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; (h.field_X.length ^ -1) < (var12 ^ -1); var12++) {
            var13 = new gh(0L, param3, ci.field_b[var12]);
            var14 = new gh(0L, param3, h.field_X[var12]);
            var15 = param3.field_L.c(h.field_X[var12]);
            var13.a(0, var10, 15, 20, 65);
            if ((var11 ^ -1) > (var15 ^ -1)) {
                var11 = var15;
            }
            var14.a(0, var10, 15, 90, 640);
            var8.a(var13, 127);
            var8.a(var14, 120);
            var10 += 30;
        }
        var17.a(0, 0, 24, 0, 90 + (var11 + 20));
        var10 += 15;
        ((ol) this).a(0, 100, var10 - -var17.field_Lb, 100, var17.field_zb);
        ((ol) this).field_Yb.a(0, 5, 15, var17.field_zb + -20, 15);
        var8.a(0, var17.field_Lb, ((ol) this).field_Lb + -var17.field_Lb, 0, ((ol) this).field_zb);
        var9.a(0, 20, 15, 0, ((ol) this).field_zb);
        var8.field_I = se.a(3, 2105376, 11579568, var8.field_Lb, 8421504, 13574);
        var17.a(((ol) this).field_Yb, 127);
        var8.a(var9, 119);
        ((ol) this).a(var17, 123);
        ((ol) this).a(var8, 119);
        ((ol) this).field_Y = 320 - (((ol) this).field_zb >> 1983139873);
        var10 = -(((ol) this).field_Lb >> -1062311135) + 240;
    }

    final static void b(boolean param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        var3 = SteelSentinels.field_G;
        if (pm.field_T == vb.field_g) {
          return;
        } else {
          L0: {
            if (d.a(pm.field_T, 0)) {
              i.field_e[pm.field_T].s(126);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-15 == (pm.field_T ^ -1)) {
              um.f((byte) 3);
              break L1;
            } else {
              break L1;
            }
          }
          pm.field_T = vb.field_g;
          pc.field_w = ea.field_k;
          if (2 != (pm.field_T ^ -1)) {
            L2: {
              pm.field_U = 0;
              if (lc.field_e) {
                L3: {
                  if (me.field_f != ml.field_g) {
                    jn.a(true, (byte) 71, 200, me.field_f);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (fk.field_i == null) {
                  L4: {
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  fk.field_i = null;
                  si.field_A = null;
                  lc.field_e = false;
                  break L2;
                } else {
                  L5: {
                    fk.field_i.f((byte) -92);
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    fk.field_i = null;
                    si.field_A = null;
                    lc.field_e = false;
                    if (!td.field_Sb) {
                      break L6;
                    } else {
                      lc.field_c = null;
                      un.field_b = new ul();
                      var29 = ge.field_m;
                      var18 = var29;
                      var9 = var18;
                      var7 = var9;
                      var4 = var7;
                      var1 = var4;
                      var2 = 0;
                      L7: while (true) {
                        if (8 <= var2) {
                          var30 = ce.field_t;
                          var19 = var30;
                          var10 = var19;
                          var8 = var10;
                          var5 = var8;
                          var1 = var5;
                          var6 = 0;
                          var2 = var6;
                          L8: while (true) {
                            if (8 <= var6) {
                              td.field_Sb = false;
                              break L6;
                            } else {
                              var30[var6] = 0;
                              var6++;
                              continue L8;
                            }
                          }
                        } else {
                          var29[var2] = 0;
                          var2++;
                          continue L7;
                        }
                      }
                    }
                  }
                  if (param0) {
                    L9: {
                      if (!jc.field_d) {
                        break L9;
                      } else {
                        oa.f(-12161);
                        im.a(true);
                        ub.a(true);
                        jc.field_d = false;
                        break L9;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                break L2;
              }
            }
            L10: {
              if (!td.field_Sb) {
                break L10;
              } else {
                lc.field_c = null;
                un.field_b = new ul();
                var31 = ge.field_m;
                var20 = var31;
                var9 = var20;
                var7 = var9;
                var4 = var7;
                var1 = var4;
                var2 = 0;
                L11: while (true) {
                  if (8 <= var2) {
                    var32 = ce.field_t;
                    var21 = var32;
                    var10 = var21;
                    var8 = var10;
                    var5 = var8;
                    var1 = var5;
                    var6 = 0;
                    var2 = var6;
                    L12: while (true) {
                      if (8 <= var6) {
                        td.field_Sb = false;
                        break L10;
                      } else {
                        var32[var6] = 0;
                        var6++;
                        continue L12;
                      }
                    }
                  } else {
                    var31[var2] = 0;
                    var2++;
                    continue L11;
                  }
                }
              }
            }
            if (param0) {
              L13: {
                if (!jc.field_d) {
                  break L13;
                } else {
                  oa.f(-12161);
                  im.a(true);
                  ub.a(true);
                  jc.field_d = false;
                  break L13;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L14: {
              vl.field_v = false;
              pm.field_U = 0;
              if (lc.field_e) {
                L15: {
                  if (me.field_f != ml.field_g) {
                    jn.a(true, (byte) 71, 200, me.field_f);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (fk.field_i != null) {
                  L16: {
                    fk.field_i.f((byte) -92);
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  fk.field_i = null;
                  si.field_A = null;
                  lc.field_e = false;
                  break L14;
                } else {
                  L17: {
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    fk.field_i = null;
                    si.field_A = null;
                    lc.field_e = false;
                    if (!td.field_Sb) {
                      break L18;
                    } else {
                      lc.field_c = null;
                      un.field_b = new ul();
                      var22 = ge.field_m;
                      var11 = var22;
                      var9 = var11;
                      var7 = var9;
                      var4 = var7;
                      var1 = var4;
                      var2 = 0;
                      L19: while (true) {
                        if (8 <= var2) {
                          var23 = ce.field_t;
                          var12 = var23;
                          var10 = var12;
                          var8 = var10;
                          var5 = var8;
                          var1 = var5;
                          var6 = 0;
                          var2 = var6;
                          L20: while (true) {
                            if (8 <= var6) {
                              td.field_Sb = false;
                              break L18;
                            } else {
                              var23[var6] = 0;
                              var6++;
                              continue L20;
                            }
                          }
                        } else {
                          var22[var2] = 0;
                          var2++;
                          continue L19;
                        }
                      }
                    }
                  }
                  if (param0) {
                    L21: {
                      if (!jc.field_d) {
                        break L21;
                      } else {
                        oa.f(-12161);
                        im.a(true);
                        ub.a(true);
                        jc.field_d = false;
                        break L21;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                break L14;
              }
            }
            L22: {
              if (!td.field_Sb) {
                break L22;
              } else {
                lc.field_c = null;
                un.field_b = new ul();
                var27 = ge.field_m;
                var16 = var27;
                var9 = var16;
                var7 = var9;
                var4 = var7;
                var1 = var4;
                var2 = 0;
                L23: while (true) {
                  if (8 <= var2) {
                    var28 = ce.field_t;
                    var17 = var28;
                    var10 = var17;
                    var8 = var10;
                    var5 = var8;
                    var1 = var5;
                    var6 = 0;
                    var2 = var6;
                    L24: while (true) {
                      if (8 <= var6) {
                        td.field_Sb = false;
                        break L22;
                      } else {
                        var28[var6] = 0;
                        var6++;
                        continue L24;
                      }
                    }
                  } else {
                    var27[var2] = 0;
                    var2++;
                    continue L23;
                  }
                }
              }
            }
            if (param0) {
              L25: {
                if (!jc.field_d) {
                  break L25;
                } else {
                  oa.f(-12161);
                  im.a(true);
                  ub.a(true);
                  jc.field_d = false;
                  break L25;
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Xb = "EXCLUSIVE";
        field_Vb = new ul();
        field_Zb = "Not yet achieved";
        field_Sb = new dj(2);
        field_bc = -1;
        field_Ub = 0;
        field_dc = 0;
    }
}
