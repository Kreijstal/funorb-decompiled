/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_a;
    static hh field_b;

    final static void a(int param0, int param1, byte param2) {
        bg.field_f = param1;
        oj.field_M = param0;
        if (param2 > -53) {
            ri.a(-74);
        }
    }

    final static StringBuilder a(int param0, char param1, StringBuilder param2, byte param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var4 = param2.length();
        param2.setLength(param0);
        if (param3 != 56) {
            ri.a(-23);
        }
        for (var5 = var4; var5 < param0; var5++) {
            param2.setCharAt(var5, param1);
        }
        return param2;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -23) {
            field_b = null;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        rl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        c var15 = null;
        int[][] var19 = null;
        L0: {
          var12 = EscapeVector.field_A;
          var15 = om.field_g;
          var2 = var15.e(0);
          if (param0 == 113) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var3 = (rl) (Object) cd.field_s.a(false);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_i != var2) {
                var3 = (rl) (Object) cd.field_s.b((byte) 70);
                continue L1;
              } else {
                break L2;
              }
            }
          }
          if (var3 != null) {
            L3: {
              var4 = var15.e(0);
              if (0 == var4) {
                break L3;
              } else {
                var5 = var3.field_g;
                bl.field_l[0] = ck.field_r;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    wk.a(var4, param0 + -58, var5);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        na.b(var5, 0);
                        var6 = new String[2][var5];
                        var19 = new int[2][var5 * 4];
                        var8 = jf.field_J;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L7: while (true) {
                              if (var13 >= var8) {
                                break L3;
                              } else {
                                var11 = cd.field_q[var13 + var5];
                                var6[1][var14] = bl.field_l[var11];
                                var19[1][var14 * 4] = fl.field_k[var11];
                                var19[1][var14 * 4 + 1] = pc.field_c[var11];
                                var19[1][var14 * 4 - -2] = mi.field_k[var11];
                                var19[1][3 + var14 * 4] = tm.field_fb[var11];
                                if (ic.a(bl.field_l[var11], (byte) 117)) {
                                  if (0 == tm.field_fb[var11] + pc.field_c[var11] - -mi.field_k[var11]) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var14++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                } else {
                                  var14++;
                                  var13++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = cd.field_q[var9];
                            var6[0][var10] = bl.field_l[var11];
                            var19[0][var10 * 4] = fl.field_k[var11];
                            var19[0][1 + 4 * var10] = pc.field_c[var11];
                            var19[0][var10 * 4 - -2] = mi.field_k[var11];
                            var19[0][3 + var10 * 4] = tm.field_fb[var11];
                            if (ic.a(bl.field_l[var11], (byte) 123)) {
                              if (-1 == (tm.field_fb[var11] + pc.field_c[var11] + mi.field_k[var11] ^ -1)) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L6;
                              } else {
                                var9++;
                                var10++;
                                continue L6;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        km.a((n) (Object) var15, 1238559653);
                        if (-1 != (var6_int ^ -1)) {
                          af.a(1, hk.field_n, wk.field_d, oc.field_u, var6_int, bk.field_s);
                          var6_int++;
                          continue L5;
                        } else {
                          af.a(param0 + -112, hk.field_n, wk.field_d, oc.field_u, var6_int, bk.field_s);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    bl.field_l[var6_int] = var15.c(false);
                    var6_int++;
                    continue L4;
                  }
                }
              }
            }
            var3.c((byte) -100);
            return;
          } else {
            nm.a(16);
            return;
          }
        }
    }

    final static void a(int param0) {
        if (!(null != df.field_d)) {
            return;
        }
        bo.a((java.awt.Canvas) (Object) df.field_d, (byte) -59);
        df.field_d.a(g.field_r, true);
        df.field_d = null;
        if (!(null == km.field_n)) {
            km.field_n.a(param0 ^ -25123);
        }
        if (param0 != -25123) {
            field_a = null;
        }
        of.field_d.requestFocus();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
    }
}
