/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    String field_d;
    String field_c;
    static qh field_b;
    int field_a;
    String field_f;
    ki field_g;
    static hj field_e;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        d var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        se var13 = null;
        se var14 = null;
        int[][] var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_39_0 = 0;
        boolean stackOut_32_0 = false;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 > 73) {
              var13 = cd.field_t;
              var14 = var13;
              var2 = var14.b((byte) 90);
              var3 = (d) ((Object) md.field_h.b((byte) -66));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_5_0 = var3.field_f;
                      stackIn_12_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 == var2) {
                          break L3;
                        } else {
                          var3 = (d) ((Object) md.field_h.d(853));
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var3 != null) {
                    stackOut_11_0 = var14.b((byte) 90);
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    th.a(122);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                L4: {
                  var4 = stackIn_12_0;
                  if (-1 != (var4 ^ -1)) {
                    var5 = var3.field_i;
                    qd.field_c[0] = gb.field_h;
                    var6_int = 1;
                    L5: while (true) {
                      L6: {
                        if (var4 <= var6_int) {
                          tl.a(var4, 12105912, var5);
                          break L6;
                        } else {
                          qd.field_c[var6_int] = var13.g(2);
                          var6_int++;
                          if (var12 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      var6_int = 0;
                      L7: while (true) {
                        L8: {
                          if (var6_int >= var4) {
                            fe.a(var5, true);
                            stackOut_29_0 = 2;
                            stackOut_29_1 = var5;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L8;
                          } else {
                            uj.a((byte) -85, var14);
                            stackOut_22_0 = -1;
                            stackOut_22_1 = var6_int ^ -1;
                            stackIn_30_0 = stackOut_22_0;
                            stackIn_30_1 = stackOut_22_1;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            if (var12 != 0) {
                              break L8;
                            } else {
                              L9: {
                                if (stackIn_23_0 != stackIn_23_1) {
                                  a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                                  break L9;
                                } else {
                                  a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                                    break L9;
                                  }
                                }
                              }
                              var6_int++;
                              continue L7;
                            }
                          }
                        }
                        var6 = new String[stackIn_30_0][stackIn_30_1];
                        var18 = new int[2][var5 * 4];
                        var8 = rc.field_d;
                        var9 = 0;
                        var10 = 0;
                        L10: while (true) {
                          L11: {
                            if (var9 >= var8) {
                              var9 = 0;
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L11;
                            } else {
                              var11 = bc.field_o[var9];
                              var6[0][var10] = qd.field_c[var11];
                              var18[0][4 * var10] = tl.field_d[var11];
                              var18[0][1 + 4 * var10] = vl.field_g[var11];
                              var18[0][var10 * 4 + 2] = th.field_f[var11];
                              var18[0][var10 * 4 + 3] = ld.field_b[var11];
                              stackOut_32_0 = fc.a((byte) -125, qd.field_c[var11]);
                              stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var12 != 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (stackIn_33_0) {
                                    if (-1 == (ld.field_b[var11] + (th.field_f[var11] + vl.field_g[var11]) ^ -1)) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L10;
                              }
                            }
                          }
                          var10 = stackIn_40_0;
                          L13: while (true) {
                            if (var9 < var8) {
                              var11 = bc.field_o[var9 + var5];
                              var6[1][var10] = qd.field_c[var11];
                              var18[1][var10 * 4] = tl.field_d[var11];
                              var18[1][1 + 4 * var10] = vl.field_g[var11];
                              var18[1][var10 * 4 + 2] = th.field_f[var11];
                              var18[1][var10 * 4 - -3] = ld.field_b[var11];
                              if (var12 != 0) {
                                break L4;
                              } else {
                                L14: {
                                  if (!fc.a((byte) 124, qd.field_c[var11])) {
                                    break L14;
                                  } else {
                                    if (-1 != (ld.field_b[var11] + (vl.field_g[var11] - -th.field_f[var11]) ^ -1)) {
                                      break L14;
                                    } else {
                                      var6[1][var10] = null;
                                      var10--;
                                      break L14;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L13;
                              }
                            } else {
                              var3.b(57);
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3.b(57);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -72) {
          L0: {
            if (pc.field_cb) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!n.b((byte) -96)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 0) {
            return;
        }
        try {
            lh.a(param1, "", false);
            bm.a(12979, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            field_e = (hj) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    private ad() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new qh();
    }
}
