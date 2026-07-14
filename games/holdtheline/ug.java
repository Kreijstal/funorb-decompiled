/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements dh {
    private int field_l;
    static bm[] field_d;
    private qi field_c;
    private int field_k;
    private int field_e;
    private int field_h;
    static ah field_g;
    private int field_j;
    private int field_a;
    static String field_i;
    static String field_f;
    static String field_m;
    static uf field_b;

    final static void a(String param0, int param1) {
        ok.field_f = param0;
        if (param1 != 0) {
            field_i = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_g = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_d = null;
    }

    final static void b(int param0) {
        kf.field_F = kf.field_F - 1;
        tc.a(tn.field_h[kf.field_F], gd.field_c[kf.field_F], bd.field_V[kf.field_F]);
        tc.field_d = ce.field_q[kf.field_F];
        tc.field_e = dm.field_b[kf.field_F];
        tc.field_a = m.field_c[kf.field_F];
        tc.field_i = mk.field_n[kf.field_F];
        if (param0 != -1) {
            field_g = null;
        }
    }

    final static void a(byte param0, byte[] param1) {
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
        th var16 = null;
        th var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        L0: {
          var15 = HoldTheLine.field_D;
          var16 = new th(param1);
          var17 = var16;
          var17.field_l = -2 + param1.length;
          vn.field_d = var17.k(72);
          qe.field_f = new boolean[vn.field_d];
          nk.field_K = new int[vn.field_d];
          if (param0 == -97) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        wc.field_i = new byte[vn.field_d][];
        la.field_j = new int[vn.field_d];
        lk.field_e = new byte[vn.field_d][];
        wb.field_g = new int[vn.field_d];
        ad.field_d = new int[vn.field_d];
        var17.field_l = -7 + param1.length + -(8 * vn.field_d);
        bo.field_b = var17.k(-85);
        ih.field_o = var17.k(59);
        var3 = 1 + (var17.f((byte) -64) & 255);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= vn.field_d) {
              break L2;
            } else {
              la.field_j[var4] = var16.k(123);
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
              if (vn.field_d <= var4) {
                break L4;
              } else {
                wb.field_g[var4] = var16.k(-56);
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
                if (var4 >= vn.field_d) {
                  break L6;
                } else {
                  nk.field_K[var4] = var16.k(79);
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
                  if (vn.field_d <= var4) {
                    break L8;
                  } else {
                    ad.field_d[var4] = var16.k(101);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_l = -((-1 + var3) * 3) + -(vn.field_d * 8) + (param1.length - 7);
                dd.field_E = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        dd.field_E[var4] = var16.c(false);
                        if (dd.field_E[var4] != 0) {
                          break L11;
                        } else {
                          dd.field_E[var4] = 1;
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
                  var17.field_l = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= vn.field_d) {
                        break L13;
                      } else {
                        var5 = nk.field_K[var4];
                        var6 = ad.field_d[var4];
                        var7 = var5 * var6;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        lk.field_e[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        wc.field_i[var4] = var25;
                        var10 = 0;
                        var11 = var17.f((byte) -59);
                        stackOut_25_0 = 0;
                        stackOut_25_1 = 1 & var11;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        L14: {
                          L15: {
                            if (stackIn_27_0 == stackIn_27_1) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var5) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var13 >= var6) {
                                          break L19;
                                        } else {
                                          var8[var12 - -(var5 * var13)] = var16.f(0);
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
                                if (-1 != (var11 & 2 ^ -1)) {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var13 >= var6) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var13 * var5 + var12] = var16.f(0);
                                                var14 = var16.f(0);
                                                stackOut_41_0 = var10;
                                                stackIn_43_0 = stackOut_41_0;
                                                stackIn_42_0 = stackOut_41_0;
                                                if (var14 == -1) {
                                                  stackOut_43_0 = stackIn_43_0;
                                                  stackOut_43_1 = 0;
                                                  stackIn_44_0 = stackOut_43_0;
                                                  stackIn_44_1 = stackOut_43_1;
                                                  break L24;
                                                } else {
                                                  stackOut_42_0 = stackIn_42_0;
                                                  stackOut_42_1 = 1;
                                                  stackIn_44_0 = stackOut_42_0;
                                                  stackIn_44_1 = stackOut_42_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_44_0 | stackIn_44_1;
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
                              if (var7 <= var12) {
                                break L26;
                              } else {
                                var8[var12] = var16.f(0);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (0 == (var11 & 2)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L27: while (true) {
                                if (var12 >= var7) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var16.f(0);
                                    var13 = var16.f(0);
                                    stackOut_54_0 = var10;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_55_0 = stackOut_54_0;
                                    if (-1 == var13) {
                                      stackOut_56_0 = stackIn_56_0;
                                      stackOut_56_1 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      stackIn_57_1 = stackOut_56_1;
                                      break L28;
                                    } else {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      stackIn_57_1 = stackOut_55_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_57_0 | stackIn_57_1;
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
                        qe.field_f[var4] = var10 != 0;
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

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        km var12 = null;
        n stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        n stackOut_1_0 = null;
        L0: {
          var11 = HoldTheLine.field_D;
          if (!(param3 instanceof km)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (n) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (n) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (km) (Object) stackIn_3_0;
          tc.f(param1 - -param3.field_k, param4 + param3.field_o, param3.field_x, param3.field_u, ((ug) this).field_h);
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param3.field_x - var12.field_I * 2;
        if (param2 > -48) {
          return;
        } else {
          var8 = param3.field_k + param1 - -var12.field_I;
          var9 = var12.field_H + (param4 + param3.field_o);
          tc.d(var8, var9, var7 + var8, var9, ((ug) this).field_j);
          var10 = var12.a((byte) 104) - 1;
          L2: while (true) {
            if (var10 < 0) {
              L3: {
                if (((ug) this).field_c != null) {
                  ((ug) this).field_c.b(var12.field_q, var7 / 2 + var8, var12.field_H + (var9 + ((ug) this).field_c.field_F), ((ug) this).field_k, ((ug) this).field_a);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              tc.d(var8 - -(var7 * var12.a(false, var10) / var12.a(0)), var9, ((ug) this).field_e, ((ug) this).field_l);
              var10--;
              continue L2;
            }
          }
        }
    }

    final static void a(da param0, int param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          L1: {
            var10 = HoldTheLine.field_D;
            var4 = jn.a(14, (byte) -96, param0);
            var5 = jn.a(13, (byte) -96, param0);
            var6 = param0.h(2, 7);
            var7 = hk.field_c[param2][param1];
            var8 = on.field_v[param2][param1];
            if ((var7 ^ -1) == 0) {
              break L1;
            } else {
              L2: {
                if (var4 > var7) {
                  break L2;
                } else {
                  if (-1 != var4) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ad.field_a = true;
              break L0;
            }
          }
          hk.field_c[param2][param1] = var4;
          ha.field_j[param2][param1] = var6;
          break L0;
        }
        L3: {
          L4: {
            if ((var8 ^ -1) == 0) {
              break L4;
            } else {
              if (var8 >= var5) {
                if (var5 != -1) {
                  break L4;
                } else {
                  ad.field_a = true;
                  break L3;
                }
              } else {
                ad.field_a = true;
                break L3;
              }
            }
          }
          on.field_v[param2][param1] = var5;
          break L3;
        }
        var9 = 92 / ((33 - param3) / 57);
    }

    ug(qi param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ug) this).field_a = param2;
        ((ug) this).field_h = param4;
        ((ug) this).field_c = param0;
        ((ug) this).field_e = param5;
        ((ug) this).field_l = param6;
        ((ug) this).field_j = param3;
        ((ug) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Game Achievements";
        field_g = new ah();
        field_m = "<col=2>This is a members-only setting. If you are a member, log in to select.";
        field_f = "Loading...";
    }
}
