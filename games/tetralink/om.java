/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class om extends hl {
    private hl field_Vb;
    private hl field_bc;
    private hl field_Ub;
    static String field_Zb;
    private hl field_Wb;
    private int field_Tb;
    private hl field_Mb;
    private mi field_ac;
    private StringBuilder field_Kb;
    static int[] field_Yb;
    static int field_Nb;
    static int field_Rb;
    private hl field_Sb;
    static String field_Lb;
    private hl[] field_Qb;
    static String field_Pb;
    long field_Ob;
    static String field_Xb;

    final static boolean a(ud param0, byte param1, ud param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.field_Rb + -param2.field_Rb;
              if (param1 >= 98) {
                break L1;
              } else {
                field_Nb = -127;
                break L1;
              }
            }
            L2: {
              if (ul.field_e != param0.field_Ub) {
                if (null == param0.field_Ub) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (param2.field_Ub != ul.field_e) {
                if (param2.field_Ub != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("om.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final boolean h(int param0) {
        if (param0 != 5) {
            return true;
        }
        if (!(1 == (this.field_Tb ^ -1))) {
            return false;
        }
        if ((dg.field_e ^ -1) != -14) {
            return true;
        }
        this.field_Tb = -1;
        return true;
    }

    private final int a(int param0, int param1, hl param2, hl param3, String param4, int param5) {
        hl var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new hl(0L, param2, 0, param0, param5, 24, param4);
            param0 += 32;
            param3.a((byte) -89, var7);
            var8 = 105 / ((param1 - -48) / 59);
            stackOut_0_0 = param0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7_ref);
            stackOut_2_1 = new StringBuilder().append("om.I(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final boolean d(byte param0) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 85) {
            break L0;
          } else {
            var3 = (String) null;
            om.a(false, true, (String) null, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_ac == null) {
              break L2;
            } else {
              if (!this.field_ac.field_zb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_61_2 = null;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_67_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        String[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_59_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              f.field_z = param2;
              me.field_d = true;
              if (-1 == (f.field_z ^ -1)) {
                var3_int = t.a(uf.field_f, 121, ti.field_b, kn.field_f, dk.field_d);
                var4 = 3 + var3_int;
                ml.field_mb = new int[var4];
                pj.field_h = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    io.field_g = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_int) {
                        pj.field_h[-3 + var4] = "";
                        pj.field_h[-2 + var4] = ug.field_X;
                        ml.field_mb[-2 + var4] = 0;
                        io.field_g[0] = 4;
                        pj.field_h[var4 + -1] = d.field_a;
                        ml.field_mb[var4 + -1] = 1;
                        io.field_g[1] = 5;
                        break L1;
                      } else {
                        pj.field_h[var5] = kn.field_f[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ml.field_mb[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (f.field_z == 1) {
                  var3_int = t.a(uf.field_f, -12, ti.field_b, kn.field_f, dk.field_d);
                  var4 = var3_int + 2;
                  ml.field_mb = new int[var4];
                  pj.field_h = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var4 <= var5) {
                      io.field_g = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          pj.field_h[var4 - 2] = "";
                          pj.field_h[var4 - 1] = d.field_a;
                          ml.field_mb[var4 - 1] = 0;
                          io.field_g[0] = 5;
                          break L1;
                        } else {
                          pj.field_h[var5] = kn.field_f[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      ml.field_mb[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (-3 == (f.field_z ^ -1)) {
                    var3_int = t.a(uf.field_f, param1 ^ -59, sk.a(new String[]{"<br><%0><br>"}, jg.field_g, 126), kn.field_f, dk.field_d);
                    var4 = -1;
                    var5 = 0;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!"<%0>".equals(kn.field_f[var5])) {
                            var5++;
                            continue L6;
                          } else {
                            var4 = var5;
                            break L7;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        fi.field_Ab = new String[var4];
                        rd.a(kn.field_f, 0, fi.field_Ab, 0, var4);
                        qc.field_db = new String[-var4 + var3_int - 1];
                        rd.a(kn.field_f, 1 + var4, qc.field_db, 0, -1 + (var3_int + -var4));
                        var3_int = t.a(uf.field_f, param1 ^ -125, sk.a(new String[]{"<br><%0><br>"}, gb.field_p, 124), kn.field_f, dk.field_d);
                        var4 = -1;
                        var5 = 0;
                        L8: while (true) {
                          L9: {
                            if (var3_int <= var5) {
                              break L9;
                            } else {
                              if (!"<%0>".equals(kn.field_f[var5])) {
                                var5++;
                                continue L8;
                              } else {
                                var4 = var5;
                                break L9;
                              }
                            }
                          }
                          if (0 != (var4 ^ -1)) {
                            L10: {
                              jl.field_b = new String[var4];
                              rd.a(kn.field_f, 0, jl.field_b, 0, var4);
                              ah.field_j = new String[-1 + (-var4 + var3_int)];
                              rd.a(kn.field_f, var4 + 1, ah.field_j, 0, -var4 + (var3_int + -1));
                              if (fi.field_Ab.length < jl.field_b.length) {
                                stackOut_49_0 = jl.field_b.length;
                                stackIn_50_0 = stackOut_49_0;
                                break L10;
                              } else {
                                stackOut_48_0 = fi.field_Ab.length;
                                stackIn_50_0 = stackOut_48_0;
                                break L10;
                              }
                            }
                            L11: {
                              var5 = stackIn_50_0;
                              if (qc.field_db.length >= ah.field_j.length) {
                                stackOut_52_0 = qc.field_db.length;
                                stackIn_53_0 = stackOut_52_0;
                                break L11;
                              } else {
                                stackOut_51_0 = ah.field_j.length;
                                stackIn_53_0 = stackOut_51_0;
                                break L11;
                              }
                            }
                            var6 = stackIn_53_0;
                            var7 = var6 + var5 + 7;
                            ml.field_mb = new int[var7];
                            pj.field_h = new String[var7];
                            var8 = 0;
                            L12: while (true) {
                              if (var7 <= var8) {
                                pj.field_h[1] = wa.field_g;
                                ml.field_mb[1] = 0;
                                io.field_g = new int[2];
                                pj.field_h[0] = o.field_n;
                                ml.field_mb[3] = 1;
                                pj.field_h[5] = "";
                                io.field_g[0] = 5;
                                io.field_g[1] = 2;
                                pj.field_h[4] = bb.field_b;
                                pj.field_h[3] = ho.field_Q;
                                pj.field_h[2] = oi.field_g;
                                var8 = 0;
                                L13: while (true) {
                                  if (var8 >= var5) {
                                    pj.field_h[var5 + 6] = null;
                                    ml.field_mb[var5 + 6] = -2;
                                    var8 = 0;
                                    L14: while (true) {
                                      if (var8 >= var6) {
                                        tg.field_a = k.a(param1 ^ 10);
                                        break L1;
                                      } else {
                                        L15: {
                                          stackOut_64_0 = pj.field_h;
                                          stackOut_64_1 = var5 + 7 + var8;
                                          stackIn_66_0 = stackOut_64_0;
                                          stackIn_66_1 = stackOut_64_1;
                                          stackIn_65_0 = stackOut_64_0;
                                          stackIn_65_1 = stackOut_64_1;
                                          if (ah.field_j.length <= var8) {
                                            stackOut_66_0 = (String[]) ((Object) stackIn_66_0);
                                            stackOut_66_1 = stackIn_66_1;
                                            stackOut_66_2 = "";
                                            stackIn_67_0 = stackOut_66_0;
                                            stackIn_67_1 = stackOut_66_1;
                                            stackIn_67_2 = stackOut_66_2;
                                            break L15;
                                          } else {
                                            stackOut_65_0 = (String[]) ((Object) stackIn_65_0);
                                            stackOut_65_1 = stackIn_65_1;
                                            stackOut_65_2 = ah.field_j[var8];
                                            stackIn_67_0 = stackOut_65_0;
                                            stackIn_67_1 = stackOut_65_1;
                                            stackIn_67_2 = stackOut_65_2;
                                            break L15;
                                          }
                                        }
                                        stackIn_67_0[stackIn_67_1] = stackIn_67_2;
                                        var8++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    L16: {
                                      stackOut_58_0 = pj.field_h;
                                      stackOut_58_1 = var8 + 6;
                                      stackIn_60_0 = stackOut_58_0;
                                      stackIn_60_1 = stackOut_58_1;
                                      stackIn_59_0 = stackOut_58_0;
                                      stackIn_59_1 = stackOut_58_1;
                                      if (-1 >= (var8 - -jl.field_b.length - var5 ^ -1)) {
                                        stackOut_60_0 = (String[]) ((Object) stackIn_60_0);
                                        stackOut_60_1 = stackIn_60_1;
                                        stackOut_60_2 = jl.field_b[-var5 + var8 - -jl.field_b.length];
                                        stackIn_61_0 = stackOut_60_0;
                                        stackIn_61_1 = stackOut_60_1;
                                        stackIn_61_2 = stackOut_60_2;
                                        break L16;
                                      } else {
                                        stackOut_59_0 = (String[]) ((Object) stackIn_59_0);
                                        stackOut_59_1 = stackIn_59_1;
                                        stackOut_59_2 = "";
                                        stackIn_61_0 = stackOut_59_0;
                                        stackIn_61_1 = stackOut_59_1;
                                        stackIn_61_2 = stackOut_59_2;
                                        break L16;
                                      }
                                    }
                                    stackIn_61_0[stackIn_61_1] = stackIn_61_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                ml.field_mb[var8] = -1;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      }
                    }
                  } else {
                    if ((f.field_z ^ -1) == -4) {
                      L17: {
                        if (!nd.field_Pb.field_e) {
                          var3_int = t.a(uf.field_f, -103, wn.field_v, kn.field_f, dk.field_d);
                          break L17;
                        } else {
                          var3_int = t.a(uf.field_f, 119, lc.field_b, kn.field_f, dk.field_d);
                          break L17;
                        }
                      }
                      var4 = var3_int + 2;
                      pj.field_h = new String[var4];
                      ml.field_mb = new int[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (var5 >= var4) {
                          io.field_g = new int[1];
                          var5 = 0;
                          L19: while (true) {
                            if (var5 >= var3_int) {
                              pj.field_h[-2 + var4] = "";
                              pj.field_h[-1 + var4] = d.field_a;
                              ml.field_mb[var4 + -1] = 0;
                              io.field_g[0] = 5;
                              break L1;
                            } else {
                              pj.field_h[var5] = kn.field_f[var5];
                              var5++;
                              continue L19;
                            }
                          }
                        } else {
                          ml.field_mb[var5] = -1;
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      if (f.field_z == 4) {
                        var3_int = t.a(uf.field_f, -72, am.field_c, kn.field_f, dk.field_d);
                        var4 = var3_int + 2;
                        ml.field_mb = new int[var4];
                        pj.field_h = new String[var4];
                        var5 = 0;
                        L20: while (true) {
                          if (var4 <= var5) {
                            io.field_g = new int[1];
                            var5 = 0;
                            L21: while (true) {
                              if (var3_int <= var5) {
                                pj.field_h[var4 - 2] = "";
                                pj.field_h[-1 + var4] = d.field_a;
                                ml.field_mb[-1 + var4] = 0;
                                io.field_g[0] = 5;
                                break L1;
                              } else {
                                pj.field_h[var5] = kn.field_f[var5];
                                var5++;
                                continue L21;
                              }
                            }
                          } else {
                            ml.field_mb[var5] = -1;
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        if ((f.field_z ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = t.a(uf.field_f, param1 ^ -91, km.field_p, kn.field_f, dk.field_d);
                          var4 = var3_int + 3;
                          ml.field_mb = new int[var4];
                          pj.field_h = new String[var4];
                          var5 = 0;
                          L22: while (true) {
                            if (var5 >= var4) {
                              io.field_g = new int[2];
                              var5 = 0;
                              L23: while (true) {
                                if (var3_int <= var5) {
                                  pj.field_h[-3 + var4] = "";
                                  pj.field_h[-2 + var4] = mm.field_q;
                                  ml.field_mb[-2 + var4] = 0;
                                  io.field_g[0] = 3;
                                  pj.field_h[-1 + var4] = d.field_a;
                                  ml.field_mb[var4 + -1] = 1;
                                  io.field_g[1] = 5;
                                  break L1;
                                } else {
                                  pj.field_h[var5] = kn.field_f[var5];
                                  var5++;
                                  continue L23;
                                }
                              }
                            } else {
                              ml.field_mb[var5] = -1;
                              var5++;
                              continue L22;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            gm.field_h.field_g = io.field_g.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (pj.field_h.length <= var4) {
                L25: {
                  if (2 == f.field_z) {
                    var10 = fi.field_Ab;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var11 = qc.field_db;
                        var5 = 0;
                        L27: while (true) {
                          if (var11.length <= var5) {
                            break L25;
                          } else {
                            var13 = var11[var5];
                            var7 = fi.a(false, var13, (byte) -106);
                            if (var3_int < var7) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var12 = var10[var5];
                        var7 = fi.a(false, var12, (byte) -111);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                lg.field_X = (mn.field_c + da.field_e << -1977270687) * gm.field_h.field_g;
                ia.field_K = -(var3_int >> -1612166463) + var3_int + vg.field_Lb;
                lb.field_V = vg.field_Lb - (var3_int >> 151106721);
                var4 = 0;
                L28: while (true) {
                  if (var4 >= pj.field_h.length) {
                    pj.field_e = dh.field_i - (lg.field_X >> 549162945);
                    bl.field_Ob = new int[pj.field_h.length][];
                    if (param1 == 10) {
                      var4 = 0;
                      var5 = pj.field_e;
                      L29: while (true) {
                        if (var4 >= pj.field_h.length) {
                          L30: {
                            if ((f.field_z ^ -1) == -3) {
                              gm.field_h.a(-1, -1, param0, 101);
                              break L30;
                            } else {
                              gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), 0, param0, 99);
                              break L30;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L31: {
                            var6 = ml.field_mb[var4];
                            if ((var6 ^ -1) > -1) {
                              var5 = var5 + la.field_e;
                              break L31;
                            } else {
                              var7 = fi.a(true, pj.field_h[var4], (byte) -83);
                              var8 = -(var7 >> -915475423) + vg.field_Lb;
                              var5 = var5 + mn.field_c;
                              bl.field_Ob[var4] = new int[4];
                              bl.field_Ob[var4][0] = var8 + -io.field_a;
                              bl.field_Ob[var4][1] = var5;
                              bl.field_Ob[var4][2] = var7 - -(io.field_a << -142131391);
                              bl.field_Ob[var4][3] = (da.field_e << -341530111) + bj.field_d;
                              var5 = var5 + ((da.field_e << 2078700769) + mn.field_c - -bj.field_d);
                              break L31;
                            }
                          }
                          var4++;
                          continue L29;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    L32: {
                      stackOut_105_0 = lg.field_X;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_106_0 = stackOut_105_0;
                      if ((ml.field_mb[var4] ^ -1) <= -1) {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = bj.field_d;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        break L32;
                      } else {
                        stackOut_106_0 = stackIn_106_0;
                        stackOut_106_1 = la.field_e;
                        stackIn_108_0 = stackOut_106_0;
                        stackIn_108_1 = stackOut_106_1;
                        break L32;
                      }
                    }
                    lg.field_X = stackIn_108_0 + stackIn_108_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  if (ml.field_mb[var4] < 0) {
                    stackOut_87_0 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    break L33;
                  } else {
                    stackOut_86_0 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    break L33;
                  }
                }
                var5 = fi.a(stackIn_88_0 != 0, pj.field_h[var4], (byte) -77);
                if (var3_int < var5) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "om.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String e(byte param0) {
        int var2 = -124 % ((-17 - param0) / 43);
        return this.field_Kb.toString();
    }

    om(int param0, int param1, int param2, int param3, int param4, hl param5, hl param6, hl param7, hl param8, mi param9, hl param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        hl[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hl[] var28 = null;
        Object stackIn_6_0 = null;
        mi stackIn_6_1 = null;
        mi stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        mi stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        mi stackIn_7_1 = null;
        mi stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        mi stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        mi stackIn_8_1 = null;
        mi stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        mi stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        mi stackIn_9_1 = null;
        mi stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        mi stackIn_9_4 = null;
        String stackIn_9_5 = null;
        hl stackIn_14_0 = null;
        hl stackIn_15_0 = null;
        hl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        mi stackOut_5_1 = null;
        mi stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        mi stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        mi stackOut_6_1 = null;
        mi stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        mi stackOut_6_4 = null;
        Object stackOut_8_0 = null;
        mi stackOut_8_1 = null;
        mi stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        mi stackOut_8_4 = null;
        String stackOut_8_5 = null;
        Object stackOut_7_0 = null;
        mi stackOut_7_1 = null;
        mi stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        mi stackOut_7_4 = null;
        String stackOut_7_5 = null;
        hl stackOut_13_0 = null;
        hl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        this.field_Tb = -2;
        try {
          L0: {
            L1: {
              this.field_Ob = param12;
              this.field_Ub = new hl(0L, param6, da.field_h.toUpperCase());
              this.field_Ub.field_xb = 1;
              this.a((byte) 43, this.field_Ub);
              this.field_Wb = new hl(0L, param7);
              this.field_Ub.a((byte) 106, this.field_Wb);
              this.field_Mb = new hl(0L, (hl) null);
              this.a((byte) 19, this.field_Mb);
              if (param11 != null) {
                L2: {
                  L3: {
                    this.field_Vb = new hl(0L, param8, gi.field_b);
                    this.field_Vb.field_N = 11184810;
                    this.field_Vb.field_xb = 1;
                    this.field_Mb.a((byte) -94, this.field_Vb);
                    this.field_Sb = new hl(0L, param8, kb.field_p);
                    this.field_Sb.field_xb = 1;
                    this.field_Sb.field_N = 11184810;
                    this.field_Mb.a((byte) 100, this.field_Sb);
                    this.field_bc = new hl(0L, param8);
                    this.field_bc.field_N = 16764006;
                    this.field_Mb.a((byte) -120, this.field_bc);
                    this.field_bc.field_O = "|";
                    if (5 <= mb.field_z) {
                      break L3;
                    } else {
                      if ((dd.field_c ^ -1) > -3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = 0L;
                      stackOut_5_4 = (mi) (param9);
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_7_4 = stackOut_5_4;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      stackIn_6_4 = stackOut_5_4;
                      if (7 <= mb.field_z) {
                        break L5;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = null;
                        stackOut_6_2 = null;
                        stackOut_6_3 = stackIn_6_3;
                        stackOut_6_4 = (mi) ((Object) stackIn_6_4);
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_8_4 = stackOut_6_4;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        stackIn_7_4 = stackOut_6_4;
                        if (2 > dd.field_c) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = null;
                          stackOut_8_2 = null;
                          stackOut_8_3 = stackIn_8_3;
                          stackOut_8_4 = (mi) ((Object) stackIn_8_4);
                          stackOut_8_5 = lg.field_I;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          stackIn_9_3 = stackOut_8_3;
                          stackIn_9_4 = stackOut_8_4;
                          stackIn_9_5 = stackOut_8_5;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_7_0 = this;
                    stackOut_7_1 = null;
                    stackOut_7_2 = null;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = (mi) ((Object) stackIn_7_4);
                    stackOut_7_5 = ja.field_e;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    stackIn_9_5 = stackOut_7_5;
                    break L4;
                  }
                  ((om) (this)).field_ac = new mi(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  this.field_Mb.a((byte) 19, this.field_ac);
                  break L2;
                }
                var28 = new hl[3];
                var15_array = var28;
                var28[0] = new hl(0L, (hl) null);
                this.field_Mb.a((byte) 106, var28[0]);
                var28[1] = new hl(0L, (hl) null);
                this.field_Mb.a((byte) -88, var28[1]);
                var28[2] = new hl(0L, (hl) null);
                this.field_Mb.a((byte) 57, var28[2]);
                this.field_Qb = new hl[co.field_q];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= co.field_q) {
                    L7: {
                      this.field_Kb = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_Kb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_Ib.b(wl.field_b);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_Ib.b(la.field_j);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_Ib.b(me.field_f);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (co.field_q <= var17) {
                        L12: {
                          if (-141 <= (var16 ^ -1)) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(var18, -124, param6, var28[0], wl.field_b, var16);
                          var18 = this.a(-50, this.field_Qb[6], var18, var28[0], var16);
                          var18 = this.a(-113, this.field_Qb[9], var18, var28[0], var16);
                          var18 = this.a(-119, this.field_Qb[5], var18, var28[0], var16);
                          var18 = this.a(-107, this.field_Qb[7], var18, var28[0], var16);
                          var18 = this.a(-56, this.field_Qb[15], var18, var28[0], var16);
                          var18 = this.a(-51, this.field_Qb[4], var18, var28[0], var16);
                          if (var17 >= var18) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(var18, -127, param6, var28[1], la.field_j, var16);
                          var18 = this.a(-116, this.field_Qb[16], var18, var28[1], var16);
                          var18 = this.a(-103, this.field_Qb[17], var18, var28[1], var16);
                          var18 = this.a(-80, this.field_Qb[18], var18, var28[1], var16);
                          var18 = this.a(-38, this.field_Qb[19], var18, var28[1], var16);
                          var18 = this.a(-35, this.field_Qb[20], var18, var28[1], var16);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(var18, 102, param6, var28[2], me.field_f, var16);
                          var18 = this.a(-122, this.field_Qb[13], var18, var28[2], var16);
                          var18 = this.a(-74, this.field_Qb[21], var18, var28[2], var16);
                          var18 = this.a(-41, this.field_Qb[11], var18, var28[2], var16);
                          if (var18 <= var17) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + 3 * var16;
                          var20 = this.field_Ub.f(-40);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_ac) {
                            break L17;
                          } else {
                            var20 = this.field_ac.e(-122, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Ub.a((byte) -111, 13 - -var19 - -13, 0, 24, 0);
                          this.field_Wb.a((byte) -109, 15, 5, 15, -20 + this.field_Ub.field_Hb);
                          var21 = 10;
                          this.field_Vb.a((byte) -125, var19, var21, qe.field_d * 2, 13);
                          var21 = var21 + qe.field_d * 2;
                          this.field_Sb.a((byte) -127, var19, var21, 2 * qe.field_d, 13);
                          var21 = var21 + (qe.field_d * 2 - -10);
                          this.field_bc.a((byte) -79, 0, var21, qe.field_d, 0);
                          var21 = var21 + (qe.field_d + 10);
                          if (this.field_ac == null) {
                            break L18;
                          } else {
                            var20 = this.field_ac.e(-127, 4);
                            this.field_ac.a((-var20 + var19) / 2 + 13, var20, 3, qe.field_d, 4, var21);
                            var21 = var21 + (10 + qe.field_d);
                            break L18;
                          }
                        }
                        var28[0].a((byte) -103, var16, var21, var17, 13);
                        var28[1].a((byte) -92, var16, var21, var17, var16 + 13 - -13);
                        var28[2].a((byte) -79, var16, var21, var17, 13 + var16 * 2 + 26);
                        var22 = var21;
                        this.field_Mb.a((byte) -90, var19 + 13 + 13, 24, 10 + (var22 - -var17), 0);
                        this.field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
                        var23 = 13 + var19 + 13;
                        var24 = var17 + (var22 + 24 - -10);
                        var25 = eo.a(var23, (byte) 97, param0, param2);
                        var26 = mh.a(param3, param1, var24, -8748);
                        this.a((byte) -85, var23, var26, var24, var25);
                        break L1;
                      } else {
                        L19: {
                          if (null == this.field_Qb[var17]) {
                            break L19;
                          } else {
                            var18 = this.field_Qb[var17].f(-82);
                            if (var18 <= var16) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (null == bb.field_d[var16]) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Qb[var16] = new hl(0L, param10, bb.field_d[var16]);
                          this.field_Qb[var16].field_xb = 0;
                          stackOut_13_0 = this.field_Qb[var16];
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (param11 == null) {
                            stackOut_15_0 = (hl) ((Object) stackIn_15_0);
                            stackOut_15_1 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L21;
                          } else {
                            stackOut_14_0 = (hl) ((Object) stackIn_14_0);
                            stackOut_14_1 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L21;
                          }
                        }
                        stackIn_16_0.field_S = stackIn_16_1 != 0;
                        this.field_Mb.a((byte) 106, this.field_Qb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                this.field_Vb = new hl(0L, param8, lo.field_d);
                this.field_Vb.field_xb = 1;
                this.field_Vb.field_N = 11184810;
                this.field_Mb.a((byte) -105, this.field_Vb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Vb.field_Ib.c(this.field_Vb.field_jb, var15_int);
                this.field_Vb.a((byte) -114, var15_int, var16, qe.field_d * var17, 13);
                var16 = var16 + qe.field_d * var17;
                this.field_Mb.a((byte) -99, 13 + var15_int + 13, 24, var16 + 10, 0);
                this.field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
                var18 = 13 + (var15_int + 13);
                var19 = 34 - -var16;
                var20 = eo.a(var18, (byte) 89, param0, param2);
                var21 = mh.a(param3, param1, var19, -8748);
                this.a((byte) -116, var18, var21, var19, var20);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var15);
            stackOut_49_1 = new StringBuilder().append("om.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          L23: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L23;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L23;
            }
          }
          L24: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L24;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L24;
            }
          }
          L25: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param8 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L25;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L25;
            }
          }
          L26: {
            stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param9 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L26;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L26;
            }
          }
          L27: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param10 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L27;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L27;
            }
          }
          L28: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param11 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            bc var4 = null;
            bc var5 = null;
            if (cf.field_p == null) {
                cf.field_p = oi.field_l.a(ko.field_t, pd.field_r, (byte) 104);
            }
            if (param1 > -37) {
                return true;
            }
            if (!(0 != cf.field_p.field_d)) {
                return false;
            }
            long dupTemp$0 = k.a(0);
            rj.field_n = dupTemp$0;
            sj.field_k = dupTemp$0;
            if (-2 != (cf.field_p.field_d ^ -1)) {
                qi.field_p = hg.field_d;
            } else {
                try {
                    wa.field_e = new fl((java.net.Socket) (cf.field_p.field_f), oi.field_l);
                    var4 = kb.field_q;
                    var5 = var4;
                    nd.field_Lb.field_t = 0;
                    mh.field_g = param0 ? -2 : -1;
                    lk.field_sb = param0 ? -2 : -1;
                    md.field_A = param0 ? -2 : -1;
                    var5.field_t = 0;
                    qi.field_p = bc.field_z;
                    je.a(-85, wg.field_c, nd.field_Lb, wc.field_I, rl.field_a);
                    ak.a((byte) -60, -1);
                } catch (IOException iOException) {
                    qi.field_p = hg.field_d;
                }
            }
            cf.field_p = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, hl param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 <= -31) {
              param2 += 8;
              var6_int = param1.field_Ib.b(param1.field_jb, param4 - param1.field_V * 2, param1.field_Q);
              param1.a((byte) -86, param4, param2, var6_int, 0);
              param2 = param2 + (0 + var6_int);
              param3.a((byte) -96, param1);
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -86;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("om.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        mi stackIn_6_0 = null;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hl stackIn_14_0 = null;
        hl stackIn_15_0 = null;
        hl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        mi stackOut_5_0 = null;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        mi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hl stackOut_13_0 = null;
        hl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = TetraLink.field_J;
          this.a(0, param0);
          if (null != this.field_bc) {
            L1: {
              this.field_bc.field_jb = this.field_Kb.toString();
              this.field_bc.field_M = (this.field_Hb + -this.field_bc.field_Ib.b(this.field_bc.field_jb)) / 2;
              if (null != this.field_ac) {
                if (this.field_ac.field_F == 0) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = this.field_ac;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (this.field_ac.field_zb) {
                      stackOut_7_0 = (mi) ((Object) stackIn_7_0);
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (mi) ((Object) stackIn_6_0);
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_zb = stackIn_8_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            this.field_bc.field_Hb = this.field_Hb + -this.field_bc.field_M;
            var3 = 0;
            L3: while (true) {
              if (var3 >= co.field_q) {
                break L0;
              } else {
                if (null != this.field_Qb[var3]) {
                  L4: {
                    stackOut_13_0 = this.field_Qb[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (-1 <= (this.field_Kb.length() ^ -1)) {
                      stackOut_15_0 = (hl) ((Object) stackIn_15_0);
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (hl) ((Object) stackIn_14_0);
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_S = stackIn_16_1 != 0;
                  if (this.field_Qb[var3].field_S) {
                    if (-1 != (this.field_Qb[var3].field_F ^ -1)) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (!param1) {
            break L5;
          } else {
            field_Xb = (String) null;
            break L5;
          }
        }
        if (this.field_Wb.field_F != 0) {
          return -1;
        } else {
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (-1 == (tm.field_t ^ -1)) {
                break L6;
              } else {
                if (0 == this.field_F) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          return this.field_Tb;
        }
    }

    final static void a(boolean param0, boolean param1, String param2, String param3) {
        try {
            mk.field_d = param3;
            ll.field_w = param2;
            uf.a(ec.field_d, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "om.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        int var4 = 0;
        int var5 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          if (param0) {
            if (lb.field_P[param3] >= lb.field_P[param1]) {
              if (lb.field_P[param1] >= lb.field_P[param3]) {
                if (fe.field_b[param3] < fe.field_b[param1]) {
                  return true;
                } else {
                  if (fe.field_b[param1] >= fe.field_b[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (fe.field_b[param1] > fe.field_b[param3]) {
              return true;
            } else {
              if (fe.field_b[param1] < fe.field_b[param3]) {
                return false;
              } else {
                if (lb.field_P[param3] >= lb.field_P[param1]) {
                  if (lb.field_P[param1] >= lb.field_P[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
        L1: {
          if (param2 >= 112) {
            break L1;
          } else {
            discarded$1 = om.a(false, -3, -111, 88);
            break L1;
          }
        }
        var4 = ac.field_b[param3] - -ai.field_g[param3] - -gl.field_n[param3];
        var5 = ai.field_g[param1] + (ac.field_b[param1] - -gl.field_n[param1]);
        if (var5 > var4) {
          return true;
        } else {
          if (var5 < var4) {
            return false;
          } else {
            L2: {
              if (param1 <= param3) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L2;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L2;
              }
            }
            return stackIn_31_0 != 0;
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          if (!Character.isISOControl(param0)) {
            if (!ka.a(65, param0)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (95 != param0) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_Yb = (int[]) null;
        }
        field_Xb = null;
        field_Yb = null;
        field_Zb = null;
        field_Pb = null;
        field_Lb = null;
    }

    static {
        field_Zb = "Yes";
        field_Pb = "Confirm Email:";
        field_Lb = "Mouse over an icon for details";
        field_Xb = "Waiting for <%0> to start the game...";
    }
}
