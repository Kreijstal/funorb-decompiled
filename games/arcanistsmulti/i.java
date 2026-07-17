/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_b;
    static ho field_i;
    static ll[] field_g;
    static vn field_e;
    static int field_f;
    static String field_h;
    static ll[] field_a;
    tn field_c;
    static int field_d;

    final static qb a(boolean param0) {
        int[] var15 = null;
        int[] var8 = null;
        int var5_int = 0;
        Object var3 = null;
        byte[] var20 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var19 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var1 = jg.field_p[0] * ho.field_i[0];
        byte[] var18 = ln.field_I[0];
        if (!dn.field_Ib[0]) {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            for (var5_int = 0; var5_int < var1; var5_int++) {
                var8[var5_int] = ph.field_c[dg.a((int) var18[var5_int], 255)];
            }
            var3 = (Object) (Object) new qb(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var19);
        } else {
            var20 = vi.field_O[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            for (var6 = 0; var6 < var1; var6++) {
                var5[var6] = fj.b(dg.a(255, (int) var20[var6]) << 24, ph.field_c[dg.a((int) var18[var6], 255)]);
            }
            var3 = (Object) (Object) new od(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var21);
        }
        int discarded$0 = -18229;
        dk.a();
        return (qb) var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = param4;
        ((i) this).field_c.a(param0, param2, var7, var6, 0, param3, param1);
        lj.field_j.a(ec.field_d.field_x, 0, 0, ga.field_r, (byte) -120);
        p.field_d.a(-80 + (-2 + ec.field_d.field_x) - (nn.field_p + 2), 0, 2 + ga.field_r, 18, (byte) -120);
        nk.field_n.a(nn.field_p + 82, ec.field_d.field_x - (nn.field_p - -2) - 80, ga.field_r + 2, 18, (byte) -120);
        nl.field_Gb.a(20, 2, ec.field_d.field_I - ga.field_r - 22, ec.field_d.field_x, 2 + ga.field_r - -20, 0, -16624, nn.field_p);
        dd.field_c.a(2, 20, nn.field_p, false);
    }

    public static void a() {
        field_h = null;
        field_i = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final static void a(ll param0, int param1, int param2, byte param3, nf param4, qb param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                param2 = param2 + param5.field_x;
                param1 = param1 + param5.field_o;
                var7_int = param2 - -(param4.field_y * param1);
                var8 = 0;
                var9 = param5.field_y;
                var10 = param5.field_q;
                var11 = -var10 + param4.field_y;
                var12 = 0;
                if (param1 < 0) {
                  var13 = -param1;
                  var9 = var9 - var13;
                  param1 = 0;
                  var7_int = var7_int + param4.field_y * var13;
                  var8 = var8 + var13 * var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param2 >= 0) {
                  break L2;
                } else {
                  var13 = -param2;
                  param2 = 0;
                  var11 = var11 + var13;
                  var10 = var10 - var13;
                  var8 = var8 + var13;
                  var12 = var12 + var13;
                  var7_int = var7_int + var13;
                  break L2;
                }
              }
              L3: {
                if (param4.field_H + -1 >= var9 + param1) {
                  break L3;
                } else {
                  var9 = var9 - (var9 + (param1 + (-param4.field_H - -1)));
                  break L3;
                }
              }
              L4: {
                if (param4.field_y - 1 < param2 - -var10) {
                  var13 = param2 - -var10 - (-1 + param4.field_y);
                  var10 = var10 - var13;
                  var11 = var11 + var13;
                  var12 = var12 + var13;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 <= 0) {
                  break L5;
                } else {
                  if (0 < var9) {
                    fc.a(var7_int, param5.field_A, var11, 6725, var8, var12, (byte) 0, param0.field_m, var10, var9);
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var7;
            stackOut_18_1 = new StringBuilder().append("i.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44).append(param2).append(44).append(0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param5 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + 0 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            int discarded$31 = 0;
            if (bj.g()) {
              int discarded$32 = -47;
              i.a();
              boolean discarded$33 = pm.field_e.a(df.field_y, vi.field_L, true, (byte) -88);
              pm.field_e.i(4);
              L1: while (true) {
                if (!ib.b(false)) {
                  break L0;
                } else {
                  boolean discarded$34 = pm.field_e.a(ed.field_Bb, (byte) 33, vn.field_d);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (ka.field_m == null) {
                  break L2;
                } else {
                  if (!ka.field_m.field_e) {
                    break L2;
                  } else {
                    int discarded$35 = 6;
                    u.b();
                    pm.field_e.b((qm) (Object) new qn(pm.field_e, vi.field_C), 15637);
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "i.G(" + 0 + 41);
        }
    }

    final static void a(wk param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var5 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (pg.field_f != null) {
                      try {
                        L3: {
                          pg.field_f.a(0L, -97);
                          pg.field_f.a(-13848, var6);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (var3_int >= 24) {
                                break L5;
                              } else {
                                if (var2[var3_int] == 0) {
                                  var3_int++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var3_int >= 24) {
                              throw new IOException();
                            } else {
                              param0.a(var2, 0, (byte) -86, 24);
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L7: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte) -1;
                              var4++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param0.a(var2, 0, (byte) -86, 24);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var2_ref;
                stackOut_17_1 = new StringBuilder().append("i.B(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L8;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L8;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 24 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        lo.field_q = 200;
        int var1 = 63 % ((-66 - param0) / 47);
        vh.field_n = false;
    }

    i(String param0, kc param1) {
        String[] var3 = null;
        kc[] var4 = null;
        try {
            var3 = new String[]{param0, u.field_d, lm.field_g};
            var4 = new kc[]{param1, ec.field_d, (kc) (Object) dd.field_c};
            ((i) this).field_c = new tn(0L, ub.field_c, var3, mn.field_t, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "i.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have been removed from <%0>'s game.";
        field_h = "Wands:";
        field_e = new vn();
    }
}
