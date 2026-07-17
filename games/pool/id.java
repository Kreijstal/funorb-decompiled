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
        vh var13 = null;
        RuntimeException var13_ref = null;
        vh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var13 = new vh(0L, (vh) null);
            var13.field_F = jr.a(param12, (byte) 20, param4);
            var13.field_Gb = jr.a(param7, (byte) 20, param10);
            var13.field_X = jr.a(param0, (byte) 20, param11);
            var13.field_Kb = jr.a(param3, (byte) 20, param6);
            var13.field_Y = jr.a(param5, (byte) 20, param8);
            var13.field_N = param2;
            var13.field_I = param9;
            stackOut_0_0 = (vh) var13;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var13_ref;
            stackOut_2_1 = new StringBuilder().append("id.G(").append(param0).append(44).append(0).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param9 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
        return stackIn_1_0;
    }

    final static iq a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            iq var5 = null;
            jf var5_ref = null;
            iq stackIn_1_0 = null;
            jf stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            iq stackOut_0_0 = null;
            jf stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("vo");
                var5 = (iq) var4.newInstance();
                var5.a(param1, param0, -6980, param3);
                stackOut_0_0 = (iq) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new jf();
                ((iq) (Object) var5_ref).a(param1, param0, -6980, param3);
                stackOut_2_0 = (jf) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (iq) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("id.E(").append(param0).append(44).append(param1).append(44).append(-44).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param3 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
            }
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
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var26 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 >= 95) {
                break L1;
              } else {
                id.a(33, true);
                break L1;
              }
            }
            L2: {
              var27 = kn.field_e;
              var2 = var27.g(-107);
              if (var2 == 0) {
                var3 = var27.d(-1034);
                var4 = (eh) (Object) wg.field_Lb.c((byte) -36);
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var3 != var4.field_A) {
                        var4 = (eh) (Object) wg.field_Lb.f((byte) -5);
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 == null) {
                    dn.c(118);
                    return;
                  } else {
                    L5: {
                      var5 = var27.g(-79);
                      if (0 == var5) {
                        break L5;
                      } else {
                        var6 = var4.field_r;
                        rq.field_y[0].field_b = null;
                        rq.field_y[0].field_c = false;
                        rq.field_y[0].field_f = di.field_j;
                        var7 = var4.field_v;
                        var8_int = 1;
                        L6: while (true) {
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
                              L7: while (true) {
                                if (var18 <= var19) {
                                  break L5;
                                } else {
                                  L8: {
                                    var20 = var27.g(-105);
                                    var21 = rq.field_y[var20].field_f;
                                    var22 = var27.h(-412303328);
                                    var24 = var27.field_v;
                                    if (var6 <= var19) {
                                      break L8;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rq.field_y[var20].field_b;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var25 >= var7) {
                                          break L8;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var27.b(true);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var21 == null) {
                                      break L10;
                                    } else {
                                      if (or.a((byte) 3, var21)) {
                                        var8[1][var13] = di.field_j;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var27.field_v = var24;
                                        var13++;
                                        var25 = 0;
                                        L11: while (true) {
                                          if (var7 <= var25) {
                                            break L10;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var27.b(true);
                                            var25++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var6 <= var14) {
                                      break L12;
                                    } else {
                                      if (!rq.field_y[var20].field_c) {
                                        rq.field_y[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rq.field_y[var20].field_b;
                                        var10[2][var14] = var22;
                                        var27.field_v = var24;
                                        var14++;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var27.b(true);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L5;
                            }
                          } else {
                            L14: {
                              rq.field_y[var8_int].field_f = var27.j(-76);
                              rq.field_y[var8_int].field_c = false;
                              if (1 != var27.g(-60)) {
                                rq.field_y[var8_int].field_b = null;
                                break L14;
                              } else {
                                rq.field_y[var8_int].field_b = var27.j(-126);
                                break L14;
                              }
                            }
                            var8_int++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var4.field_u = true;
                    var4.a((byte) -117);
                    break L2;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var27.d(-1034);
                  var4_long = var27.h(-412303328);
                  var6_ref_oj = (oj) (Object) ta.field_i.c((byte) 71);
                  L15: while (true) {
                    L16: {
                      if (var6_ref_oj == null) {
                        break L16;
                      } else {
                        if (var6_ref_oj.field_B != var3) {
                          var6_ref_oj = (oj) (Object) ta.field_i.f((byte) -5);
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (var6_ref_oj == null) {
                      dn.c(-101);
                      return;
                    } else {
                      var6_ref_oj.field_w = var4_long;
                      var6_ref_oj.a((byte) -117);
                      break L2;
                    }
                  }
                } else {
                  tc.a((Throwable) null, "HS1: " + t.a(112), -8555);
                  dn.c(-101);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "id.F(" + param0 + 41);
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
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
                          vj.field_c[~var2] = false;
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
                      if (var2 >= 112) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1_ref, "id.C(" + 127 + 41);
        }
    }

    abstract int b(int param0);

    final static void a(int param0, int param1, dd[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var5_int = param2[0].field_w;
                  var6 = param2[2].field_w;
                  var7 = param2[1].field_w;
                  param2[0].c(param3, param0);
                  param2[2].c(-var6 + (param1 + param3), param0);
                  qh.a(sq.field_a);
                  qh.d(param3 - -var5_int, param0, -var6 + (param3 + param1), param0 - -param2[1].field_y);
                  var8 = param3 - -var5_int;
                  var9 = param1 + param3 + -var6;
                  param3 = var8;
                  L2: while (true) {
                    if (param3 >= var9) {
                      qh.b(sq.field_a);
                      break L0;
                    } else {
                      param2[1].c(param3, param0);
                      param3 = param3 + var7;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("id.H(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + 23 + 41);
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    public static void a() {
        field_a = null;
        field_c = null;
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
