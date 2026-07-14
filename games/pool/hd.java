/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ob {
    static int field_J;
    static int field_H;
    static String field_K;
    static int field_I;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_K = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = Pool.field_O;
          pn.field_l.a(0, 0);
          if (cm.f((byte) 109)) {
            ae.a(-2);
            if (!ea.field_l) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= cr.field_m.field_D.length) {
                  ea.field_l = true;
                  ae.a(-2);
                  break L0;
                } else {
                  if ((cr.field_m.field_D[var2] & -16777216) == 0) {
                    if (0 != (cr.field_m.field_D[var2] & 16777215)) {
                      cr.field_m.field_D[var2] = md.a(cr.field_m.field_D[var2], -16777216);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 > 36) {
            break L2;
          } else {
            var4 = null;
            hd.a(-122, -16, 103, (dd) null, 91, -103, -122, -85);
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int[] param3, int[] param4, int[] param5, int[] param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = Pool.field_O;
        if (!param2) {
            return;
        }
        for (var7 = param1; param0 > var7; var7++) {
            var8 = param3[var7];
            var9 = param5[var7];
            var10 = param4[var7];
            param3[var7] = (var8 * param6[3] - (-(param6[4] * var9) + -(var10 * param6[5])) >> -1991863984) + param6[0];
            param5[var7] = (param6[6] * var8 + param6[7] * var9 - -(var10 * param6[8]) >> -735994096) + param6[1];
            param4[var7] = param6[2] + (param6[11] * var10 + (var9 * param6[10] + var8 * param6[9]) >> 297706256);
        }
    }

    hd(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void d(int param0) {
        int var2 = 0;
        if (param0 == -1) {
            var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        } else {
            hd.b(false);
            var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        }
        if (3 == var2) {
            if (!(ne.field_u == null)) {
                tq.d((byte) -106);
            }
            s.a(hk.d(58), 2056898529);
        }
        if (!((var2 ^ -1) != -2)) {
            fq.a(-3405, 0, sq.field_b, false);
        }
        if (!((var2 ^ -1) != -3)) {
            fq.a(-3405, 0, sq.field_b, true);
        }
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = Pool.field_O;
          if (qh.field_b > param6) {
            param5 = param5 - (-param6 + qh.field_b);
            param6 = qh.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (qh.field_j < param6 + param5) {
            param5 = qh.field_j + -param6;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param7 >= qh.field_c) {
            break L2;
          } else {
            param2 = param2 - (qh.field_c + -param7);
            param7 = qh.field_c;
            break L2;
          }
        }
        L3: {
          if (param2 + param7 <= qh.field_g) {
            break L3;
          } else {
            param2 = qh.field_g + -param7;
            break L3;
          }
        }
        L4: {
          if (-1 <= (param5 ^ -1)) {
            break L4;
          } else {
            if (0 >= param2) {
              break L4;
            } else {
              var21 = param3.d();
              var32 = qh.field_d;
              var10 = qh.field_l;
              var11 = qh.field_f;
              var30 = new int[param4];
              qh.a(var30);
              param3.e();
              qh.d(var30[0], var30[1], var30[2], var30[3]);
              var13 = param6 - -(param3.field_z * param7);
              var14 = param3.field_z + -param5;
              var31 = var21.field_D;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param7;
              L5: while (true) {
                if (var16 >= param7 + param2) {
                  var21.c(-param3.field_G, -param3.field_B);
                  qh.a(var32, var10, var11);
                  qh.b(var30);
                  return;
                } else {
                  var17 = param6;
                  L6: while (true) {
                    if (var17 >= param5 + param6) {
                      var13 = var13 + var14;
                      var16++;
                      continue L5;
                    } else {
                      var18 = var31[var13];
                      if (-1 != var18) {
                        L7: {
                          L8: {
                            if (-1 >= var17) {
                              break L8;
                            } else {
                              if (0 == var15[-1 + var13]) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var16 <= 0) {
                              break L9;
                            } else {
                              if (var15[var13 + -param3.field_z] == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var17 >= param3.field_z + -1) {
                              break L10;
                            } else {
                              if (0 == var15[1 + var13]) {
                                break L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (var16 < param3.field_A + -1) {
                            if (0 == var15[param3.field_z + var13]) {
                              break L7;
                            } else {
                              var13++;
                              var17++;
                              continue L6;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L6;
                          }
                        }
                        qh.a(var17, var16, param1, param0);
                        var13++;
                        var17++;
                        continue L6;
                      } else {
                        var13++;
                        var17++;
                        continue L6;
                      }
                    }
                  }
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
        field_K = "Security";
    }
}
