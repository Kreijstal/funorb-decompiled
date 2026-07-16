/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id {
    static jk field_c;
    static int field_b;
    static String field_d;
    static dd[] field_a;

    abstract void a(java.awt.Component param0, int param1);

    final static vh a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, lr param9, int param10, int param11, int param12) {
        vh var13 = new vh((long)param1, (vh) null);
        var13.field_F = jr.a(param12, (byte) 20, param4);
        var13.field_Gb = jr.a(param7, (byte) 20, param10);
        var13.field_X = jr.a(param0, (byte) 20, param11);
        var13.field_Kb = jr.a(param3, (byte) 20, param6);
        var13.field_Y = jr.a(param5, (byte) 20, param8);
        var13.field_N = param2;
        var13.field_I = param9;
        return var13;
    }

    final static iq a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            iq var5 = null;
            jf var5_ref = null;
            iq stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            iq stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  var4 = Class.forName("vo");
                  var5 = (iq) var4.newInstance();
                  if (param2 < -41) {
                    break L1;
                  } else {
                    field_c = null;
                    break L1;
                  }
                }
                var5.a(param1, param0, -6980, param3);
                stackOut_2_0 = (iq) var5;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new jf();
              ((iq) (Object) var5_ref).a(param1, param0, -6980, param3);
              return (iq) (Object) var5_ref;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= -8) {
            return;
        }
        ug.field_u = hj.field_l;
        uf.field_X = 0;
        rj.field_f = 0;
        li.field_d = 0;
        jc.field_j = new ia(2);
        jc.field_j.a(param1, -1, ho.a((byte) -84, wn.field_i, gg.field_f), true);
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        eh var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        oj var6_ref_oj = null;
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
        oq var27 = null;
        L0: {
          var26 = Pool.field_O;
          if (param0 >= 95) {
            break L0;
          } else {
            id.a(33, true);
            break L0;
          }
        }
        L1: {
          var27 = kn.field_e;
          var2 = var27.g(-107);
          if (var2 == 0) {
            var3 = var27.d(-1034);
            var4 = (eh) (Object) wg.field_Lb.c((byte) -36);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 != var4.field_A) {
                    var4 = (eh) (Object) wg.field_Lb.f((byte) -5);
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var4 == null) {
                dn.c(118);
                return;
              } else {
                L4: {
                  var5 = var27.g(-79);
                  if (0 == var5) {
                    break L4;
                  } else {
                    var6 = var4.field_r;
                    rq.field_y[0].field_b = null;
                    rq.field_y[0].field_c = false;
                    rq.field_y[0].field_f = di.field_j;
                    var7 = var4.field_v;
                    var8_int = 1;
                    L5: while (true) {
                      if (var5 <= var8_int) {
                        String[][] dupTemp$6 = new String[3][var6];
                        var4.field_m = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6];
                        long[][] dupTemp$7 = new long[3][var6];
                        var4.field_q = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var6 * var7];
                        var4.field_z = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.g(-112);
                        if (0 < var18) {
                          var19 = 0;
                          L6: while (true) {
                            if (var18 <= var19) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var27.g(-105);
                                var21 = rq.field_y[var20].field_f;
                                var22 = var27.h(-412303328);
                                var24 = var27.field_v;
                                if (var6 <= var19) {
                                  break L7;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = rq.field_y[var20].field_b;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var25 >= var7) {
                                      break L7;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var27.b(true);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (or.a((byte) 3, var21)) {
                                    var8[1][var13] = di.field_j;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var27.field_v = var24;
                                    var13++;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var27.b(true);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!rq.field_y[var20].field_c) {
                                  rq.field_y[var20].field_c = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = rq.field_y[var20].field_b;
                                  var10[2][var14] = var22;
                                  var27.field_v = var24;
                                  var14++;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var7 > var25) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var27.b(true);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        rq.field_y[var8_int].field_f = var27.j(-76);
                        rq.field_y[var8_int].field_c = false;
                        if (1 != var27.g(-60)) {
                          rq.field_y[var8_int].field_b = null;
                          var8_int++;
                          continue L5;
                        } else {
                          rq.field_y[var8_int].field_b = var27.j(-126);
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4.field_u = true;
                var4.a((byte) -117);
                break L1;
              }
            }
          } else {
            if (1 == var2) {
              var3 = var27.d(-1034);
              var4_long = var27.h(-412303328);
              var6_ref_oj = (oj) (Object) ta.field_i.c((byte) 71);
              L12: while (true) {
                L13: {
                  if (var6_ref_oj == null) {
                    break L13;
                  } else {
                    if (var6_ref_oj.field_B != var3) {
                      var6_ref_oj = (oj) (Object) ta.field_i.f((byte) -5);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var6_ref_oj == null) {
                  dn.c(-101);
                  return;
                } else {
                  var6_ref_oj.field_w = var4_long;
                  var6_ref_oj.a((byte) -117);
                  break L1;
                }
              }
            } else {
              tc.a((Throwable) null, "HS1: " + t.a(112), -8555);
              dn.c(-101);
              break L1;
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = Pool.field_O;
          if (param0 == 127) {
            break L0;
          } else {
            var5 = null;
            vh discarded$3 = id.a(61, -54, 2, 71, 91, -21, -24, 76, 60, (lr) null, -98, -116, 30);
            break L0;
          }
        }
        var1 = (Object) (Object) wn.field_a;
        synchronized (var1) {
          L1: {
            L2: {
              bl.field_s = ja.field_c;
              ti.field_e = ti.field_e + 1;
              if (0 <= qq.field_xb) {
                L3: while (true) {
                  if (jq.field_g == qq.field_xb) {
                    break L2;
                  } else {
                    var2 = fo.field_b[jq.field_g];
                    jq.field_g = 127 & 1 + jq.field_g;
                    if (0 > var2) {
                      vj.field_c[var2 ^ -1] = false;
                      continue L3;
                    } else {
                      vj.field_c[var2] = true;
                      continue L3;
                    }
                  }
                }
              } else {
                var2 = 0;
                L4: while (true) {
                  if ((var2 ^ -1) <= -113) {
                    qq.field_xb = jq.field_g;
                    break L2;
                  } else {
                    vj.field_c[var2] = false;
                    var2++;
                    continue L4;
                  }
                }
              }
            }
            ja.field_c = op.field_h;
            break L1;
          }
        }
    }

    abstract int b(int param0);

    final static void a(int param0, int param1, dd[] param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Pool.field_O;
        if (param2 != null) {
            if (-1 <= (param1 ^ -1)) {
                return;
            }
            var5 = param2[0].field_w;
            var6 = param2[2].field_w;
            var7 = param2[1].field_w;
            if (param4 != 23) {
                id.c(-44);
            }
            param2[0].c(param3, param0);
            param2[2].c(-var6 + (param1 + param3), param0);
            qh.a(sq.field_a);
            qh.d(param3 - -var5, param0, -var6 + (param3 + param1), param0 - -param2[1].field_y);
            var8 = param3 - -var5;
            var9 = param1 + param3 + -var6;
            param3 = var8;
            while (param3 < var9) {
                param2[1].c(param3, param0);
                param3 = param3 + var7;
            }
            qh.b(sq.field_a);
            return;
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 35) {
            id.c(109);
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_d = "Return to tutorial";
    }
}
