/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb extends td {
    static String field_q;
    static String field_r;
    static int field_t;
    static String field_s;
    static int[] field_p;

    eb(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        ii stackIn_3_0 = null;
        tba stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tba var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wia var15 = null;
        aga var16 = null;
        iv var17 = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var19 = this.field_h.a(21, param0);
            var4 = new tba(this.field_g, new nq(var19));
            var4.field_q = this.field_k;
            var4.field_s = this.field_n;
            var23 = var4.e(6);
            var6 = 17;
            var7 = 17;
            var8 = var6 - 1 >> -2054058559;
            var9 = -1 + var7 >> 1330438465;
            var10 = 0;
            var11 = 0;
            if (param1 == 3) {
              L1: while (true) {
                if (var11 >= var6) {
                  stackIn_28_0 = (tba) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var12 = 0;
                  L2: while (true) {
                    if (var12 >= var7) {
                      var11++;
                      continue L1;
                    } else {
                      L3: {
                        if (1 == var23[var11][var12]) {
                          var13 = -var8 - (-var11 - this.field_k);
                          var14 = -var9 - (-var12 - this.field_n);
                          if (var13 >= 0) {
                            if (param0.field_z > var13) {
                              if (-1 >= (var14 ^ -1)) {
                                if (var14 < param0.field_B) {
                                  var15 = param0.field_a[var13][var14];
                                  var16 = var15.field_l;
                                  if (6 > var10) {
                                    if (5 >= kla.a(10, param0.field_w, param1 + 2147483645)) {
                                      L4: {
                                        if (var16 != null) {
                                          var17 = new iv(new nq(var16), false, 1, 30, 12);
                                          var4.field_o.a(var17, true);
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var4.field_t[var10][0] = var13;
                                      var4.field_t[var10][1] = var14;
                                      var10++;
                                      break L3;
                                    } else {
                                      var12++;
                                      continue L2;
                                    }
                                  } else {
                                    var12++;
                                    continue L2;
                                  }
                                } else {
                                  var12++;
                                  continue L2;
                                }
                              } else {
                                var12++;
                                continue L2;
                              }
                            } else {
                              var12++;
                              continue L2;
                            }
                          } else {
                            var12++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var12++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("eb.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_28_0);
        }
    }

    final static void a(boolean param0, int param1) {
        fea stackIn_15_0;
        String stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        fea stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        kr var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            ps.field_q.d(0, 0);
            var2_int = 0;
            L1: while (true) {
              if (8 <= var2_int) {
                L2: {
                  qm.field_d.a(true, 7802);
                  jha.field_g.c(ak.field_t, 22, 146, 16370176, -1);
                  hfa.field_z.c(ak.field_t, 22, 146, 65793, -1);
                  if (mg.field_m.field_a >= dea.field_n) {
                    fba.field_a.a(48 + bw.field_a.field_kb, 4 + bw.field_a.field_rb);
                    if (bw.field_a.field_T) {
                      bn.field_h.a(48 + bw.field_a.field_kb, bw.field_a.field_rb + 4);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    hfa.field_z.a(vka.field_r, bw.field_a.field_kb - -(bw.field_a.field_sb >> 1554863713), 4 + bw.field_a.field_rb - -(bw.field_a.field_p >> -1473129951), 16204, -1);
                    jha.field_g.a(vka.field_r, bw.field_a.field_kb + (bw.field_a.field_sb >> -1776728159), 4 + ((bw.field_a.field_p >> -614602847) + bw.field_a.field_rb), 16777215, -1);
                    break L2;
                  }
                }
                L3: {
                  stackIn_15_0 = jha.field_g;

                  stackIn_15_1 = ow.field_n;

                  stackIn_15_2 = 530;

                  stackIn_15_3 = 446;

                  if (!lfa.field_l.field_T) {
                    stackIn_16_0 = (fea) ((Object) stackIn_15_0);
                    stackIn_16_1 = (String) ((Object) stackIn_15_1);
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = stackIn_15_3;
                    stackIn_16_4 = 16777215;
                    break L3;
                  } else {
                    stackIn_16_0 = (fea) ((Object) stackIn_15_0);
                    stackIn_16_1 = (String) ((Object) stackIn_15_1);
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = stackIn_15_3;
                    stackIn_16_4 = 16699649;
                    break L3;
                  }
                }
                L4: {
                  ((fea) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, -1);
                  hfa.field_z.a(ow.field_n, 530, 446, 16204, -1);
                  ug.field_q.a(true, param1 + 7766);
                  if (null != qg.field_b.field_z) {
                    dg.a(ug.field_q.field_kb, ug.field_q.field_rb, ug.field_q.field_sb + ug.field_q.field_kb, ug.field_q.field_p + ug.field_q.field_rb);
                    var2 = (kr) ((Object) qg.field_b.field_z.b((byte) 90));
                    L5: while (true) {
                      if (var2 == null) {
                        dg.c();
                        break L4;
                      } else {
                        jha.field_g.c(Integer.toString(var2.field_yb.field_g), ug.field_q.field_kb - (-var2.field_kb + -28), qg.field_b.field_rb + 32 + (ug.field_q.field_rb - -var2.field_rb), 16777215, -1);
                        hfa.field_z.c(Integer.toString(var2.field_yb.field_g), 28 + var2.field_kb + ug.field_q.field_kb, qg.field_b.field_rb + (32 + (var2.field_rb + ug.field_q.field_rb)), 65793, -1);
                        var2 = (kr) ((Object) qg.field_b.field_z.c(0));
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  jha.field_g.c(hka.field_g, 452, 306, 65793, -1);
                  var4 = lga.a(true, new String[]{ti.a((byte) -118, 2, (long)dea.field_n, kt.field_k, true)}, vla.field_u);
                  jha.field_g.b(var4, 600, 306, 16699649, -1);
                  hfa.field_z.b(var4, 600, 306, 65793, -1);
                  jha.field_g.c(jla.field_c, 452, 400, 65793, -1);
                  if (param1 == 36) {
                    break L6;
                  } else {
                    field_q = (String) null;
                    break L6;
                  }
                }
                L7: {
                  var5 = lga.a(true, new String[]{ti.a((byte) -120, 2, (long)mg.field_m.field_a, kt.field_k, true)}, vla.field_u);
                  jha.field_g.b(var5, 600, 400, 16699649, -1);
                  hfa.field_z.b(var5, 600, 400, 65793, -1);
                  lma.field_y.a(412, 161);
                  gha.field_b.a(412, 441);
                  lma.field_y.a(598, 166);
                  gha.field_b.a(598, 271);
                  if (!um.a(true)) {
                    kla.b(true);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                break L0;
              } else {
                L8: {
                  L9: {
                    jf.field_l.a(14 + var2_int * 77, 89);
                    if (se.field_s[var2_int].field_T) {
                      break L9;
                    } else {
                      if (baa.field_Q - 1 == var2_int) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  dr.field_p.a(77 * var2_int + 14, 89);
                  break L8;
                }
                nw.field_p[var2_int].e(77 * var2_int + 36, 91);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "eb.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_q = null;
        if (param0 > -23) {
            eb.a(false, -54);
        }
        field_r = null;
        field_p = null;
    }

    static {
        field_q = "Turn <%0> / <%1>";
        field_r = "Try out your first battle! If you wish to skip this section, click here.  <br><col=BBFF00> Next</col>";
        field_s = "Invalid date";
        field_p = new int[8192];
    }
}
