/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hk {
    static int field_a;
    static String[] field_b;
    static int field_d;
    static long field_c;

    final static void a(byte param0) {
        if (fl.field_u != null) {
            fl.field_u.r(-128);
        }
        ko.field_q = new fn();
        mm.field_u.e((na) (Object) ko.field_q, -27667);
        if (param0 > -50) {
            field_d = -89;
        }
    }

    final static void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        bh var17 = null;
        bh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = TetraLink.field_J;
          if (param1 <= -35) {
            break L0;
          } else {
            var16 = null;
            hk.a((byte[]) null, 72);
            break L0;
          }
        }
        var17 = new bh(param0);
        var18 = var17;
        var18.field_t = -2 + param0.length;
        vj.field_n = var18.e(127);
        gm.field_g = new boolean[vj.field_n];
        ga.field_a = new byte[vj.field_n][];
        sn.field_e = new int[vj.field_n];
        qa.field_x = new int[vj.field_n];
        je.field_h = new int[vj.field_n];
        i.field_t = new int[vj.field_n];
        jg.field_i = new byte[vj.field_n][];
        var18.field_t = -(vj.field_n * 8) + -7 + param0.length;
        wm.field_l = var18.e(127);
        mm.field_w = var18.e(127);
        var3 = 1 + (255 & var18.d((byte) -99));
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= vj.field_n) {
              break L2;
            } else {
              qa.field_x[var4] = var17.e(127);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (vj.field_n <= var4) {
                break L4;
              } else {
                i.field_t[var4] = var17.e(127);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (vj.field_n <= var4) {
                  break L6;
                } else {
                  je.field_h[var4] = var17.e(127);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (vj.field_n <= var4) {
                    break L8;
                  } else {
                    sn.field_e[var4] = var17.e(127);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_t = 3 - 3 * var3 + (param0.length - (7 + vj.field_n * 8));
                ti.field_c = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        ti.field_c[var4] = var17.d(-1);
                        if (ti.field_c[var4] != 0) {
                          break L11;
                        } else {
                          ti.field_c[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var18.field_t = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (vj.field_n <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = je.field_h[var4];
                            var6 = sn.field_e[var4];
                            var7 = var6 * var5;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            ga.field_a[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            jg.field_i[var4] = var26;
                            var10 = 0;
                            var11 = var18.d((byte) -99);
                            if (-1 == (1 & var11 ^ -1)) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var5 <= var12) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var6 <= var13) {
                                          break L19;
                                        } else {
                                          var8[var13 * var5 + var12] = var17.g(-1772093437);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if (0 != (2 & var11)) {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var6 <= var13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var5 * var13 + var12] = var17.g(-1772093437);
                                                var14 = var17.g(-1772093437);
                                                stackOut_39_0 = var10;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackIn_40_0 = stackOut_39_0;
                                                if (0 == (var14 ^ -1)) {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 0;
                                                  stackIn_42_0 = stackOut_41_0;
                                                  stackIn_42_1 = stackOut_41_1;
                                                  break L24;
                                                } else {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 1;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_42_1 = stackOut_40_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_42_0 | stackIn_42_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L25: while (true) {
                            L26: {
                              if (var12 >= var7) {
                                break L26;
                              } else {
                                var8[var12] = var17.g(-1772093437);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if ((2 & var11) == 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L27: while (true) {
                                if (var12 >= var7) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var17.g(-1772093437);
                                    var13 = var17.g(-1772093437);
                                    stackOut_52_0 = var10;
                                    stackIn_54_0 = stackOut_52_0;
                                    stackIn_53_0 = stackOut_52_0;
                                    if (var13 == -1) {
                                      stackOut_54_0 = stackIn_54_0;
                                      stackOut_54_1 = 0;
                                      stackIn_55_0 = stackOut_54_0;
                                      stackIn_55_1 = stackOut_54_1;
                                      break L28;
                                    } else {
                                      stackOut_53_0 = stackIn_53_0;
                                      stackOut_53_1 = 1;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_55_1 = stackOut_53_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_55_0 | stackIn_55_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        gm.field_g[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 8) {
            return;
        }
        field_b = null;
    }

    abstract byte[] b(int param0, int param1);

    abstract int a(int param0, int param1);

    abstract t a(int param0);

    static {
    }
}
