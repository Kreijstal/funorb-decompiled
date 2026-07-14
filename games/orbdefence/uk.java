/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_c;
    static int field_a;
    static se field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static e a(boolean param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        e var5 = null;
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (0 != param1.length()) {
              var2 = param1.indexOf('@');
              if (0 != (var2 ^ -1)) {
                L1: {
                  var3 = param1.substring(0, var2);
                  var4 = param1.substring(1 + var2);
                  if (!param0) {
                    break L1;
                  } else {
                    uk.a((byte) -20);
                    break L1;
                  }
                }
                var5 = gk.a(var3, (byte) -127);
                if (var5 == null) {
                  return sg.a(-1326, var4);
                } else {
                  return var5;
                }
              } else {
                return oc.field_M;
              }
            } else {
              break L0;
            }
          }
        }
        return oh.field_e;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        gj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        vg var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        se var27 = null;
        var26 = OrbDefence.field_D ? 1 : 0;
        if (param0 == 68) {
          L0: {
            var27 = cd.field_t;
            var2 = var27.b((byte) 90);
            if (var2 == 0) {
              var3 = var27.j(98203176);
              var4 = (gj) (Object) cb.field_b.b((byte) -126);
              L1: while (true) {
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (var4.field_o != var3) {
                      var4 = (gj) (Object) cb.field_b.d(param0 + 785);
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var4 != null) {
                  L3: {
                    var5 = var27.b((byte) 90);
                    if (var5 != 0) {
                      var6 = var4.field_m;
                      ce.field_e[0].field_a = null;
                      ce.field_e[0].field_c = false;
                      var7 = var4.field_n;
                      ce.field_e[0].field_d = gb.field_h;
                      var8_int = 1;
                      L4: while (true) {
                        if (var8_int >= var5) {
                          var4.field_i = new String[3][var6];
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var4.field_p = new long[3][var6];
                          var10 = new long[3][var6];
                          var4.field_l = new int[3][var7 * var6];
                          var11 = new int[3][var7 * var6];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var27.b((byte) 90);
                          if (-1 <= (var18 ^ -1)) {
                            break L3;
                          } else {
                            var19 = 0;
                            L5: while (true) {
                              if (var18 <= var19) {
                                break L3;
                              } else {
                                L6: {
                                  var20 = var27.b((byte) 90);
                                  var21 = ce.field_e[var20].field_d;
                                  var22 = var27.c((byte) -89);
                                  var24 = var27.field_i;
                                  if (var6 > var19) {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = ce.field_e[var20].field_a;
                                    var10[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L7: while (true) {
                                      if (var7 <= var25) {
                                        break L6;
                                      } else {
                                        var15++;
                                        var11[0][var15] = var27.l(0);
                                        var25++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                L8: {
                                  if (var21 == null) {
                                    break L8;
                                  } else {
                                    if (!fc.a((byte) -127, var21)) {
                                      break L8;
                                    } else {
                                      var8[1][var13] = gb.field_h;
                                      var9[1][var13] = null;
                                      var10[1][var13] = var22;
                                      var27.field_i = var24;
                                      var13++;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var25 >= var7) {
                                          break L8;
                                        } else {
                                          var16++;
                                          var11[1][var16] = var27.l(0);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var6 > var14) {
                                  if (!ce.field_e[var20].field_c) {
                                    ce.field_e[var20].field_c = true;
                                    var8[2][var14] = var21;
                                    var9[2][var14] = ce.field_e[var20].field_a;
                                    var10[2][var14] = var22;
                                    var14++;
                                    var27.field_i = var24;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var25 < var7) {
                                        var17++;
                                        var11[2][var17] = var27.l(0);
                                        var25++;
                                        continue L10;
                                      } else {
                                        var19++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    var19++;
                                    continue L5;
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          ce.field_e[var8_int].field_d = var27.g(2);
                          ce.field_e[var8_int].field_c = false;
                          if (-2 == (var27.b((byte) 90) ^ -1)) {
                            ce.field_e[var8_int].field_a = var27.g(2);
                            var8_int++;
                            continue L4;
                          } else {
                            ce.field_e[var8_int].field_a = null;
                            var8_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4.field_h = true;
                  var4.b(param0 ^ 125);
                  break L0;
                } else {
                  th.a(120);
                  return;
                }
              }
            } else {
              if ((var2 ^ -1) != -2) {
                pe.a((byte) -13, (Throwable) null, "HS1: " + sj.b(true));
                th.a(param0 + 48);
                break L0;
              } else {
                var3 = var27.j(98203176);
                var4_long = var27.c((byte) -89);
                var6_ref_vg = (vg) (Object) kk.field_X.b((byte) 124);
                L11: while (true) {
                  L12: {
                    if (var6_ref_vg == null) {
                      break L12;
                    } else {
                      if (var3 != var6_ref_vg.field_t) {
                        var6_ref_vg = (vg) (Object) kk.field_X.d(853);
                        continue L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (var6_ref_vg != null) {
                    var6_ref_vg.field_h = var4_long;
                    var6_ref_vg.b(param0 + -11);
                    break L0;
                  } else {
                    th.a(param0 + 58);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
