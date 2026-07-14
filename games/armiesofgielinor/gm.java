/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements lv {
    static tu field_f;
    static String field_b;
    static String[] field_a;
    private jd[] field_c;
    static String field_e;
    static int field_d;
    static int[][] field_h;
    static int field_i;
    static String field_g;

    final static d a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        if (param1 < 71) {
            field_f = null;
        }
        d var2 = new d(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
        rj.d((byte) 107);
        return var2;
    }

    final static int f(int param0) {
        if (param0 != 3) {
            field_i = -52;
        }
        return (va.field_D << 1609583458) + (ol.field_B << -459892476) - -cd.field_c;
    }

    public final boolean b(int param0) {
        int var3 = 0;
        jd var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        jd[] var6 = ((gm) this).field_c;
        jd[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!(var4.field_G)) {
                return false;
            }
        }
        return true;
    }

    gm(int param0, jd[] param1) {
        ((gm) this).field_c = param1;
    }

    final static String a(int param0, int param1, String param2) {
        if (!(param0 != 3)) {
            return vf.field_e;
        }
        if (param1 == param0) {
            return mo.field_l;
        }
        if (!(-8 != param0)) {
            return qm.field_H;
        }
        if (8 == param0) {
            return cd.field_b;
        }
        if (9 == param0) {
            return ke.field_d;
        }
        if (-11 == param0) {
            return wh.field_h;
        }
        if (!(11 != param0)) {
            return qt.field_b;
        }
        if (!((param0 ^ -1) != -15)) {
            return fo.a(param1 ^ 4806, ra.field_i, new String[1]);
        }
        return null;
    }

    public static void e(int param0) {
        field_a = null;
        field_b = null;
        field_h = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != 25931) {
            int discarded$0 = gm.f(-9);
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        wj var4 = null;
        aj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        bv var27 = null;
        long[][] var31 = null;
        L0: {
          var26 = ArmiesOfGielinor.field_M ? 1 : 0;
          var27 = mg.field_e;
          if (param0 == 9) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var2 = var27.k(0);
          if (0 != var2) {
            if ((var2 ^ -1) == -2) {
              var3 = var27.e((byte) -104);
              var4_ref = (aj) (Object) oj.field_r.e((byte) 99);
              L2: while (true) {
                L3: {
                  if (var4_ref == null) {
                    break L3;
                  } else {
                    if (var4_ref.field_s != var3) {
                      var4_ref = (aj) (Object) oj.field_r.a((byte) 123);
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var4_ref != null) {
                  var4_ref.d(param0 ^ -103);
                  break L1;
                } else {
                  dj.a((byte) -126);
                  return;
                }
              }
            } else {
              af.a((Throwable) null, 76, "HS1: " + cm.b(false));
              dj.a((byte) -127);
              break L1;
            }
          } else {
            var3 = var27.e((byte) -104);
            var4 = (wj) (Object) lf.field_c.e((byte) 100);
            L4: while (true) {
              L5: {
                if (var4 == null) {
                  break L5;
                } else {
                  if (var4.field_r == var3) {
                    break L5;
                  } else {
                    var4 = (wj) (Object) lf.field_c.a((byte) 123);
                    continue L4;
                  }
                }
              }
              if (var4 == null) {
                dj.a((byte) -126);
                return;
              } else {
                L6: {
                  var5 = var27.k(param0 + -9);
                  if (0 == var5) {
                    break L6;
                  } else {
                    var6 = var4.field_k;
                    th.field_b[0].field_d = false;
                    var7 = var4.field_p;
                    th.field_b[0].field_f = mv.field_d;
                    th.field_b[0].field_c = null;
                    var8_int = 1;
                    L7: while (true) {
                      if (var8_int >= var5) {
                        var4.field_s = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var31 = new long[3][var6];
                        var4.field_m = new int[3][var7 * var6];
                        var11 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.k(0);
                        if (-1 <= (var18 ^ -1)) {
                          break L6;
                        } else {
                          var19 = 0;
                          L8: while (true) {
                            if (var19 >= var18) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var27.k(0);
                                var21 = th.field_b[var20].field_f;
                                var22 = var27.j((byte) -2);
                                var24 = var27.field_q;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = th.field_b[var20].field_c;
                                  var31[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 <= var25) {
                                      break L9;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var27.i(1);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (gt.a(var21, (byte) 125)) {
                                    var8[1][var13] = mv.field_d;
                                    var9[1][var13] = null;
                                    var31[1][var13] = var22;
                                    var13++;
                                    var27.field_q = var24;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var7 <= var25) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var27.i(kf.b(param0, 8));
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!th.field_b[var20].field_d) {
                                  th.field_b[var20].field_d = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = th.field_b[var20].field_c;
                                  var31[2][var14] = var22;
                                  var14++;
                                  var27.field_q = var24;
                                  var25 = 0;
                                  L13: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var27.i(param0 + -8);
                                      var25++;
                                      continue L13;
                                    } else {
                                      var19++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L8;
                                }
                              } else {
                                var19++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        th.field_b[var8_int].field_f = var27.g(param0 ^ 8);
                        th.field_b[var8_int].field_d = false;
                        if (var27.k(0) == 1) {
                          th.field_b[var8_int].field_c = var27.g(1);
                          var8_int++;
                          continue L7;
                        } else {
                          th.field_b[var8_int].field_c = null;
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var4.field_o = true;
                var4.d(86);
                break L1;
              }
            }
          }
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return null;
        }
        return "Win: Leader Escort";
    }

    public final boolean c(int param0) {
        if (param0 >= -121) {
            gm.d(68);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
        field_d = 1;
        field_b = "Loads more Achievements in Rated games.";
        field_e = "No";
        field_g = "Accept";
        field_h = new int[][]{new int[16], new int[16], new int[16], new int[16], new int[16], new int[16], new int[16], new int[16]};
    }
}
