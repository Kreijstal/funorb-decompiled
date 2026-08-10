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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        int var14 = 0;
        se var15 = null;
        int[][] var19 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 > 73) {
              var13 = cd.field_t;
              var15 = var13;
              var2 = var15.b((byte) 90);
              var3 = (d) ((Object) md.field_h.b((byte) -66));
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (var3.field_f == var2) {
                      break L2;
                    } else {
                      var3 = (d) ((Object) md.field_h.d(853));
                      continue L1;
                    }
                  }
                }
                if (var3 != null) {
                  L3: {
                    var4 = var15.b((byte) 90);
                    if (-1 != (var4 ^ -1)) {
                      var5 = var3.field_i;
                      qd.field_c[0] = gb.field_h;
                      var6_int = 1;
                      L4: while (true) {
                        if (var4 <= var6_int) {
                          tl.a(var4, 12105912, var5);
                          var6_int = 0;
                          L5: while (true) {
                            if (var6_int >= var4) {
                              fe.a(var5, true);
                              var6 = new String[2][var5];
                              var19 = new int[2][var5 * 4];
                              var8 = rc.field_d;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var9 >= var8) {
                                  var9 = 0;
                                  var14 = 0;
                                  var10 = var14;
                                  L7: while (true) {
                                    if (var9 < var8) {
                                      L8: {
                                        var11 = bc.field_o[var9 + var5];
                                        var6[1][var14] = qd.field_c[var11];
                                        var19[1][var14 * 4] = tl.field_d[var11];
                                        var19[1][1 + 4 * var14] = vl.field_g[var11];
                                        var19[1][var14 * 4 + 2] = th.field_f[var11];
                                        var19[1][var14 * 4 - -3] = ld.field_b[var11];
                                        if (!fc.a((byte) 124, qd.field_c[var11])) {
                                          break L8;
                                        } else {
                                          if (-1 != (ld.field_b[var11] + (vl.field_g[var11] - -th.field_f[var11]) ^ -1)) {
                                            break L8;
                                          } else {
                                            var6[1][var14] = null;
                                            var14--;
                                            break L8;
                                          }
                                        }
                                      }
                                      var9++;
                                      var14++;
                                      continue L7;
                                    } else {
                                      var3.b(57);
                                      break L3;
                                    }
                                  }
                                } else {
                                  L9: {
                                    var11 = bc.field_o[var9];
                                    var6[0][var10] = qd.field_c[var11];
                                    var19[0][4 * var10] = tl.field_d[var11];
                                    var19[0][1 + 4 * var10] = vl.field_g[var11];
                                    var19[0][var10 * 4 + 2] = th.field_f[var11];
                                    var19[0][var10 * 4 + 3] = ld.field_b[var11];
                                    if (fc.a((byte) -125, qd.field_c[var11])) {
                                      if (-1 == (ld.field_b[var11] + (th.field_f[var11] + vl.field_g[var11]) ^ -1)) {
                                        var6[0][var10] = null;
                                        var10--;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var10++;
                                  var9++;
                                  continue L6;
                                }
                              }
                            } else {
                              L10: {
                                uj.a((byte) -85, var15);
                                if (-1 != (var6_int ^ -1)) {
                                  a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                                  break L10;
                                } else {
                                  a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                                  break L10;
                                }
                              }
                              var6_int++;
                              continue L5;
                            }
                          }
                        } else {
                          qd.field_c[var6_int] = var13.g(2);
                          var6_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var3.b(57);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  th.a(122);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
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
        if (param0 == -72) {
          L0: {
            L1: {
              if (pc.field_cb) {
                break L1;
              } else {
                if (!n.b((byte) -96)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
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
