/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static oh field_c;
    static int[] field_b;
    static ba field_a;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = of.a(param1, var3, false);
                ib.a(true, var3.toString(), param1, (byte) -25);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param2 > -103) {
                field_a = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 67) {
            Object var2 = null;
            gk.a((String[]) null, (byte) 65);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        jf var3 = null;
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
        la var15 = null;
        int[][] var19 = null;
        var12 = TrackController.field_F ? 1 : 0;
        var15 = ne.field_a;
        var2 = var15.h(16383);
        var3 = (jf) (Object) ei.field_m.b(param0 + 128);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_m == var2) {
                break L1;
              } else {
                var3 = (jf) (Object) ei.field_m.a(10);
                continue L0;
              }
            }
          }
          L2: {
            if (param0 == -126) {
              break L2;
            } else {
              field_c = null;
              break L2;
            }
          }
          if (var3 == null) {
            lj.a((byte) 116);
            return;
          } else {
            L3: {
              var4 = var15.h(16383);
              if (var4 != 0) {
                pf.field_C[0] = ue.field_a;
                var5 = var3.field_k;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    tk.a(var4, -14032, var5);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        bj.a(0, var5);
                        var6 = new String[2][var5];
                        var19 = new int[2][4 * var5];
                        var8 = oe.field_c;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L7: while (true) {
                              if (var8 <= var13) {
                                break L3;
                              } else {
                                var11 = lf.field_Y[var13 + var5];
                                var6[1][var14] = pf.field_C[var11];
                                var19[1][4 * var14] = g.field_u[var11];
                                var19[1][var14 * 4 + 1] = ii.field_q[var11];
                                var19[1][2 + var14 * 4] = qf.field_a[var11];
                                var19[1][var14 * 4 + 3] = qi.field_b[var11];
                                if (rb.a(false, pf.field_C[var11])) {
                                  if (qf.field_a[var11] + ii.field_q[var11] + qi.field_b[var11] == 0) {
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
                            var11 = lf.field_Y[var9];
                            var6[0][var10] = pf.field_C[var11];
                            var19[0][var10 * 4] = g.field_u[var11];
                            var19[0][1 + 4 * var10] = ii.field_q[var11];
                            var19[0][4 * var10 - -2] = qf.field_a[var11];
                            var19[0][3 + var10 * 4] = qi.field_b[var11];
                            if (rb.a(false, pf.field_C[var11])) {
                              if (-1 == (qf.field_a[var11] + ii.field_q[var11] + qi.field_b[var11] ^ -1)) {
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
                        mf.a(14, (be) (Object) var15);
                        if (-1 == (var6_int ^ -1)) {
                          sg.a(kf.field_c, var6_int, ai.field_d, fe.field_Q, nh.field_a, -733);
                          var6_int++;
                          continue L5;
                        } else {
                          sg.a(kf.field_c, var6_int, ai.field_d, fe.field_Q, nh.field_a, -733);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    pf.field_C[var6_int] = var15.g(0);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.a(-61);
            return;
          }
        }
    }

    final static void a(String[] args, byte param1) {
        if (!(null == mc.field_H)) {
            mc.field_H.field_N.a(args, (byte) -58);
        }
        if (param1 >= -24) {
            gk.a(117);
        }
        if (!(null == ne.field_d)) {
            ne.field_d.field_I.a(args, (byte) -58);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[16384];
        field_a = new ba();
    }
}
