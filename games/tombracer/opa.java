/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opa extends qra {
    private boolean field_o;
    private gsa[] field_r;
    private boolean field_m;
    private boolean field_p;
    private boolean field_q;
    private boolean field_s;
    static mi[] field_n;

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5) {
        kh var6 = null;
        int var7 = 0;
        try {
            var6 = ql.field_k;
            var6.k(param2, -2988);
            var6.field_h = var6.field_h + 1;
            var7 = var6.field_h;
            var6.i(param0, 0);
            if (!(param0 != 2)) {
                var6.a(param4, false);
            }
            if (param1 != null) {
                int discarded$1 = 0;
                int discarded$2 = wq.a(param1, (uia) (Object) var6);
            } else {
                var6.f(-1477662136, param5);
            }
            var6.d(-var7 + var6.field_h, (byte) 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "opa.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + 32371 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
            ((opa) this).field_m = false;
            return false;
        }
        return false;
    }

    public static void f(int param0) {
        field_n = null;
        if (param0 < 73) {
            field_n = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 > param1) {
              if (param1 + 1 < param2) {
                L1: {
                  if (param2 <= param1 - -5) {
                    break L1;
                  } else {
                    if (param0 == param5) {
                      break L1;
                    } else {
                      var7_int = (1 & (param5 & param0)) + (param5 >> 1) + (param0 >> 1);
                      var8 = param1;
                      var9 = param0;
                      var10 = param5;
                      var11 = param1;
                      L2: while (true) {
                        if (param2 <= var11) {
                          opa.a(param0, param1, var8, param3, (byte) -100, var9, param6);
                          opa.a(var10, var8, param2, param3, param4, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = boa.field_n[var11];
                            if (!param6) {
                              stackOut_21_0 = ic.field_c[var12];
                              stackIn_22_0 = stackOut_21_0;
                              break L3;
                            } else {
                              stackOut_20_0 = jk.field_h[var12];
                              stackIn_22_0 = stackOut_20_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_22_0;
                          if (var7_int < var13) {
                            L4: {
                              boa.field_n[var11] = boa.field_n[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              boa.field_n[incrementValue$1] = var12;
                              if (var13 >= var9) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var10 >= var13) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L6: while (true) {
                  if (var7_int <= param1) {
                    return;
                  } else {
                    var8 = param1;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = boa.field_n[var8];
                          var10 = boa.field_n[var8 + 1];
                          if (!cl.a(param6, (byte) 119, var10, var9)) {
                            break L8;
                          } else {
                            boa.field_n[var8] = var10;
                            boa.field_n[var8 - -1] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "opa.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            ((opa) this).field_m = true;
            return true;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13_int = 0;
        String var13 = null;
        gsa var14_ref_gsa = null;
        int var14 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        String var20_ref_String = null;
        int var20 = 0;
        int var21_int = 0;
        nh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        nh var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_95_0 = 0;
        StringBuilder stackIn_96_0 = null;
        StringBuilder stackIn_97_0 = null;
        StringBuilder stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_118_0 = 0;
        StringBuilder stackIn_119_0 = null;
        StringBuilder stackIn_120_0 = null;
        StringBuilder stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_141_0 = 0;
        StringBuilder stackIn_142_0 = null;
        StringBuilder stackIn_143_0 = null;
        StringBuilder stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_158_2 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        StringBuilder stackOut_141_0 = null;
        StringBuilder stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        StringBuilder stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_156_2 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        StringBuilder stackOut_118_0 = null;
        StringBuilder stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        StringBuilder stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        StringBuilder stackOut_95_0 = null;
        StringBuilder stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        StringBuilder stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        L0: {
          var27 = TombRacer.field_G ? 1 : 0;
          if (param0 < -50) {
            break L0;
          } else {
            ((opa) this).field_s = false;
            break L0;
          }
        }
        ura.a(-10985);
        la.field_j.a(0, 0);
        ik.field_h.a(0, 0);
        ng.field_b[1].a(50, -10);
        var3 = -250 + aaa.a(false);
        var4 = -10 + ng.field_b[1].c() + -70;
        ng.field_b[1].a(var3, -10);
        nm.field_l.a(var3, 0);
        nm.field_l.a(var3, var4);
        var5 = 3;
        var6 = (var3 + -50) / (var5 - -1);
        var7 = 0;
        L1: while (true) {
          if (var5 <= var7) {
            var7 = 0;
            L2: while (true) {
              if (3 <= var7) {
                var7 = ((opa) this).field_c.field_E;
                var8 = 0;
                L3: while (true) {
                  if (((opa) this).field_c.field_k <= var8) {
                    var8 = 0;
                    L4: while (true) {
                      if (var8 >= ((opa) this).field_c.field_k) {
                        int discarded$1 = -6;
                        se.f();
                        ((opa) this).d(-27142);
                        return;
                      } else {
                        L5: {
                          stackOut_59_0 = 95 * var8 + 105;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (((opa) this).field_c.field_k < 3) {
                            stackOut_61_0 = stackIn_61_0;
                            stackOut_61_1 = 95;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            break L5;
                          } else {
                            stackOut_60_0 = stackIn_60_0;
                            stackOut_60_1 = 0;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            break L5;
                          }
                        }
                        L6: {
                          var9 = stackIn_62_0 + stackIn_62_1;
                          if (-100 + fd.field_e > var7) {
                            break L6;
                          } else {
                            if (var8 == ((opa) this).field_c.e(2)) {
                              L7: {
                                if (((opa) this).field_c.field_L == ((opa) this).field_c.field_v[var8]) {
                                  oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9 + -22, (var3 + 50 >> 1) - -20, -1);
                                  break L7;
                                } else {
                                  oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9 - 22, (var3 + 50 >> 1) + 20, -1);
                                  break L7;
                                }
                              }
                              var10 = 0;
                              var11 = 0;
                              L8: while (true) {
                                if (((opa) this).field_r.length <= var11) {
                                  if (var10 != 0) {
                                    oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9, 20 + (50 + var3 >> 1), -1);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  if (var11 != var8) {
                                    if (((opa) this).field_r[var8].field_x == ((opa) this).field_r[var11].field_x) {
                                      var10 = 1;
                                      var11++;
                                      continue L8;
                                    } else {
                                      var11++;
                                      continue L8;
                                    }
                                  } else {
                                    var11++;
                                    continue L8;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        L9: {
                          tga.field_a.KA(0, var9 - 100, (int)(2.0 + ((opa) this).field_r[var8].field_q), var9 - -50);
                          var10 = wga.field_a[var8];
                          gca.field_a.a(62, 10 + var9 + -95, 0, var10 | -1006632960, 1);
                          tga.field_a.la();
                          ((opa) this).field_c.field_H[var8].n((byte) -42).a(-1, (int)((opa) this).field_r[var8].field_q, 1400, 1536, var9);
                          oka.a(((opa) this).field_c.field_l[var8].toUpperCase(), var10, kn.field_p, -1, var9, (int)((opa) this).field_r[var8].field_q, -1);
                          if (((opa) this).field_p) {
                            break L9;
                          } else {
                            if (var7 < var8 * 50 + efa.field_y) {
                              break L9;
                            } else {
                              if (var7 < 50 + efa.field_y - -(((opa) this).field_c.field_k * 50)) {
                                L10: {
                                  if (var8 * 50 + efa.field_y - -25 > var7) {
                                    stackOut_140_0 = 0;
                                    stackIn_141_0 = stackOut_140_0;
                                    break L10;
                                  } else {
                                    stackOut_139_0 = 1;
                                    stackIn_141_0 = stackOut_139_0;
                                    break L10;
                                  }
                                }
                                L11: {
                                  var11 = stackIn_141_0;
                                  var12 = Integer.toString(((opa) this).field_r[var8].field_p);
                                  stackOut_141_0 = new StringBuilder().append("$");
                                  stackIn_143_0 = stackOut_141_0;
                                  stackIn_142_0 = stackOut_141_0;
                                  if (var11 == 0) {
                                    stackOut_143_0 = (StringBuilder) (Object) stackIn_143_0;
                                    stackOut_143_1 = 0;
                                    stackIn_144_0 = stackOut_143_0;
                                    stackIn_144_1 = stackOut_143_1;
                                    break L11;
                                  } else {
                                    stackOut_142_0 = (StringBuilder) (Object) stackIn_142_0;
                                    stackOut_142_1 = ((opa) this).field_r[var8].field_u;
                                    stackIn_144_0 = stackOut_142_0;
                                    stackIn_144_1 = stackOut_142_1;
                                    break L11;
                                  }
                                }
                                L12: {
                                  var13 = Integer.toString(stackIn_144_1 + ((opa) this).field_r[var8].field_v);
                                  var14 = ((opa) this).field_c.field_H[var8].z(-124);
                                  if (var11 != 0) {
                                    if (((opa) this).field_r[var8].field_u > 0) {
                                      if (var14 < 0) {
                                        stackOut_150_0 = 0;
                                        stackIn_152_0 = stackOut_150_0;
                                        break L12;
                                      } else {
                                        stackOut_149_0 = 1;
                                        stackIn_152_0 = stackOut_149_0;
                                        break L12;
                                      }
                                    } else {
                                      stackOut_147_0 = 0;
                                      stackIn_152_0 = stackOut_147_0;
                                      break L12;
                                    }
                                  } else {
                                    stackOut_145_0 = 0;
                                    stackIn_152_0 = stackOut_145_0;
                                    break L12;
                                  }
                                }
                                L13: {
                                  var15 = stackIn_152_0;
                                  if (var15 == 0) {
                                    stackOut_154_0 = 0;
                                    stackIn_155_0 = stackOut_154_0;
                                    break L13;
                                  } else {
                                    stackOut_153_0 = 20;
                                    stackIn_155_0 = stackOut_153_0;
                                    break L13;
                                  }
                                }
                                L14: {
                                  var16 = stackIn_155_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) -103), wb.field_a.a("+" + var13, (byte) 87) + 70);
                                  stackOut_155_0 = 40;
                                  stackOut_155_1 = (int)((opa) this).field_r[var8].field_q;
                                  stackIn_157_0 = stackOut_155_0;
                                  stackIn_157_1 = stackOut_155_1;
                                  stackIn_156_0 = stackOut_155_0;
                                  stackIn_156_1 = stackOut_155_1;
                                  if ((double)(-var16 + var3) <= ((opa) this).field_r[var8].field_q) {
                                    stackOut_157_0 = stackIn_157_0;
                                    stackOut_157_1 = stackIn_157_1;
                                    stackOut_157_2 = var16;
                                    stackIn_158_0 = stackOut_157_0;
                                    stackIn_158_1 = stackOut_157_1;
                                    stackIn_158_2 = stackOut_157_2;
                                    break L14;
                                  } else {
                                    stackOut_156_0 = stackIn_156_0;
                                    stackOut_156_1 = stackIn_156_1;
                                    stackOut_156_2 = 0;
                                    stackIn_158_0 = stackOut_156_0;
                                    stackIn_158_1 = stackOut_156_1;
                                    stackIn_158_2 = stackOut_156_2;
                                    break L14;
                                  }
                                }
                                var17 = stackIn_158_0 + (stackIn_158_1 - stackIn_158_2);
                                var18 = var9 + -70;
                                eca.field_c[0].a(var17, -5 + var18, eca.field_c[0].a() >> 1, eca.field_c[0].c() >> 1);
                                ts.a(0, -123, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -51, 17 + var18, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -103, var18 - -55, "+", var17 - -2, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -65, var18 - -55, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                                if (var15 != 0) {
                                  var19 = 25 + wb.field_a.a("x" + var12, (byte) 31) + var17;
                                  var20 = -11 + var18;
                                  var21 = sta.field_y[bta.field_f[var14]];
                                  var21.a(var19, var20, var21.a() >> 1, var21.c() >> 1);
                                  var8++;
                                  continue L4;
                                } else {
                                  var8++;
                                  continue L4;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L15: {
                          if (((opa) this).field_m) {
                            break L15;
                          } else {
                            if (var7 < var8 * 50 + nta.field_d) {
                              break L15;
                            } else {
                              if (50 + (((opa) this).field_c.field_k * 50 + nta.field_d) > var7) {
                                L16: {
                                  if (25 + (nta.field_d + var8 * 50) > var7) {
                                    stackOut_117_0 = 0;
                                    stackIn_118_0 = stackOut_117_0;
                                    break L16;
                                  } else {
                                    stackOut_116_0 = 1;
                                    stackIn_118_0 = stackOut_116_0;
                                    break L16;
                                  }
                                }
                                L17: {
                                  var11 = stackIn_118_0;
                                  var12 = Integer.toString(((opa) this).field_r[var8].field_r);
                                  stackOut_118_0 = new StringBuilder().append("$");
                                  stackIn_120_0 = stackOut_118_0;
                                  stackIn_119_0 = stackOut_118_0;
                                  if (var11 != 0) {
                                    stackOut_120_0 = (StringBuilder) (Object) stackIn_120_0;
                                    stackOut_120_1 = ((opa) this).field_r[var8].field_z;
                                    stackIn_121_0 = stackOut_120_0;
                                    stackIn_121_1 = stackOut_120_1;
                                    break L17;
                                  } else {
                                    stackOut_119_0 = (StringBuilder) (Object) stackIn_119_0;
                                    stackOut_119_1 = 0;
                                    stackIn_121_0 = stackOut_119_0;
                                    stackIn_121_1 = stackOut_119_1;
                                    break L17;
                                  }
                                }
                                L18: {
                                  var13 = Integer.toString(stackIn_121_1 + ((opa) this).field_r[var8].field_n);
                                  var14 = ((opa) this).field_c.field_H[var8].z(39);
                                  if (var11 != 0) {
                                    if (((opa) this).field_r[var8].field_z > 0) {
                                      if (var14 >= 0) {
                                        stackOut_127_0 = 1;
                                        stackIn_129_0 = stackOut_127_0;
                                        break L18;
                                      } else {
                                        stackOut_126_0 = 0;
                                        stackIn_129_0 = stackOut_126_0;
                                        break L18;
                                      }
                                    } else {
                                      stackOut_124_0 = 0;
                                      stackIn_129_0 = stackOut_124_0;
                                      break L18;
                                    }
                                  } else {
                                    stackOut_122_0 = 0;
                                    stackIn_129_0 = stackOut_122_0;
                                    break L18;
                                  }
                                }
                                L19: {
                                  var15 = stackIn_129_0;
                                  stackOut_129_0 = Math.max(95 + wb.field_a.a("x" + var12, (byte) 49), 70 + wb.field_a.a("+" + var13, (byte) 99));
                                  stackIn_131_0 = stackOut_129_0;
                                  stackIn_130_0 = stackOut_129_0;
                                  if (var15 != 0) {
                                    stackOut_131_0 = stackIn_131_0;
                                    stackOut_131_1 = 20;
                                    stackIn_132_0 = stackOut_131_0;
                                    stackIn_132_1 = stackOut_131_1;
                                    break L19;
                                  } else {
                                    stackOut_130_0 = stackIn_130_0;
                                    stackOut_130_1 = 0;
                                    stackIn_132_0 = stackOut_130_0;
                                    stackIn_132_1 = stackOut_130_1;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var16 = stackIn_132_0 - -stackIn_132_1;
                                  stackOut_132_0 = (int)((opa) this).field_r[var8].field_q - -40;
                                  stackIn_134_0 = stackOut_132_0;
                                  stackIn_133_0 = stackOut_132_0;
                                  if ((double)(-var16 + var3) <= ((opa) this).field_r[var8].field_q) {
                                    stackOut_134_0 = stackIn_134_0;
                                    stackOut_134_1 = var16;
                                    stackIn_135_0 = stackOut_134_0;
                                    stackIn_135_1 = stackOut_134_1;
                                    break L20;
                                  } else {
                                    stackOut_133_0 = stackIn_133_0;
                                    stackOut_133_1 = 0;
                                    stackIn_135_0 = stackOut_133_0;
                                    stackIn_135_1 = stackOut_133_1;
                                    break L20;
                                  }
                                }
                                var17 = stackIn_135_0 + -stackIn_135_1;
                                var18 = var9 - 70;
                                eca.field_c[1].a(var17, -5 + var18, eca.field_c[1].a() >> 2, eca.field_c[1].c() >> 2);
                                ts.a(0, -42, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -124, var18 - -17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -92, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -119, 55 + var18, var13, var17 + 25, qr.field_v, wga.field_a[var8]);
                                if (var15 != 0) {
                                  var19 = var17 + (wb.field_a.a("x" + var12, (byte) -122) + 25);
                                  var20 = var18 + -11;
                                  var21 = sta.field_y[bta.field_f[var14]];
                                  var21.a(var19, var20, var21.a() >> 1, var21.c() >> 1);
                                  var8++;
                                  continue L4;
                                } else {
                                  var8++;
                                  continue L4;
                                }
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        if (!((opa) this).field_o) {
                          if (var7 >= var8 * 50 + iv.field_ub) {
                            if (var7 < ((opa) this).field_c.field_k * 50 + iv.field_ub - -50) {
                              L21: {
                                if (50 * var8 + iv.field_ub + 25 > var7) {
                                  stackOut_94_0 = 0;
                                  stackIn_95_0 = stackOut_94_0;
                                  break L21;
                                } else {
                                  stackOut_93_0 = 1;
                                  stackIn_95_0 = stackOut_93_0;
                                  break L21;
                                }
                              }
                              L22: {
                                var11 = stackIn_95_0;
                                var12 = Integer.toString(((opa) this).field_r[var8].field_c);
                                stackOut_95_0 = new StringBuilder().append("$");
                                stackIn_97_0 = stackOut_95_0;
                                stackIn_96_0 = stackOut_95_0;
                                if (var11 == 0) {
                                  stackOut_97_0 = (StringBuilder) (Object) stackIn_97_0;
                                  stackOut_97_1 = 0;
                                  stackIn_98_0 = stackOut_97_0;
                                  stackIn_98_1 = stackOut_97_1;
                                  break L22;
                                } else {
                                  stackOut_96_0 = (StringBuilder) (Object) stackIn_96_0;
                                  stackOut_96_1 = ((opa) this).field_r[var8].field_f;
                                  stackIn_98_0 = stackOut_96_0;
                                  stackIn_98_1 = stackOut_96_1;
                                  break L22;
                                }
                              }
                              L23: {
                                var13 = Integer.toString(stackIn_98_1 + ((opa) this).field_r[var8].field_a);
                                var14 = ((opa) this).field_c.field_H[var8].z(-113);
                                if (var11 != 0) {
                                  if (0 < ((opa) this).field_r[var8].field_f) {
                                    if (var14 >= 0) {
                                      stackOut_104_0 = 1;
                                      stackIn_106_0 = stackOut_104_0;
                                      break L23;
                                    } else {
                                      stackOut_103_0 = 0;
                                      stackIn_106_0 = stackOut_103_0;
                                      break L23;
                                    }
                                  } else {
                                    stackOut_101_0 = 0;
                                    stackIn_106_0 = stackOut_101_0;
                                    break L23;
                                  }
                                } else {
                                  stackOut_99_0 = 0;
                                  stackIn_106_0 = stackOut_99_0;
                                  break L23;
                                }
                              }
                              L24: {
                                var15 = stackIn_106_0;
                                if (var15 == 0) {
                                  stackOut_108_0 = 0;
                                  stackIn_109_0 = stackOut_108_0;
                                  break L24;
                                } else {
                                  stackOut_107_0 = 20;
                                  stackIn_109_0 = stackOut_107_0;
                                  break L24;
                                }
                              }
                              L25: {
                                var16 = stackIn_109_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) 45), 70 + wb.field_a.a("+" + var13, (byte) 98));
                                stackOut_109_0 = 40;
                                stackOut_109_1 = (int)((opa) this).field_r[var8].field_q;
                                stackIn_111_0 = stackOut_109_0;
                                stackIn_111_1 = stackOut_109_1;
                                stackIn_110_0 = stackOut_109_0;
                                stackIn_110_1 = stackOut_109_1;
                                if ((double)(-var16 + var3) > ((opa) this).field_r[var8].field_q) {
                                  stackOut_111_0 = stackIn_111_0;
                                  stackOut_111_1 = stackIn_111_1;
                                  stackOut_111_2 = 0;
                                  stackIn_112_0 = stackOut_111_0;
                                  stackIn_112_1 = stackOut_111_1;
                                  stackIn_112_2 = stackOut_111_2;
                                  break L25;
                                } else {
                                  stackOut_110_0 = stackIn_110_0;
                                  stackOut_110_1 = stackIn_110_1;
                                  stackOut_110_2 = var16;
                                  stackIn_112_0 = stackOut_110_0;
                                  stackIn_112_1 = stackOut_110_1;
                                  stackIn_112_2 = stackOut_110_2;
                                  break L25;
                                }
                              }
                              var17 = stackIn_112_0 + (stackIn_112_1 + -stackIn_112_2);
                              var18 = -70 + var9;
                              eca.field_c[2].a(var17, var18 + -5, eca.field_c[2].a() >> 2, eca.field_c[2].c() >> 2);
                              ts.a(0, -30, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                              ts.a(0, -100, var18 + 17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                              ts.a(0, -126, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                              ts.a(0, -24, 55 + var18, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                              if (var15 != 0) {
                                var19 = var17 - -wb.field_a.a("x" + var12, (byte) 36) - -25;
                                var20 = -11 + var18;
                                var21 = sta.field_y[bta.field_f[var14]];
                                var21.a(var19, var20, var21.a() >> 1, var21.c() >> 1);
                                var8++;
                                continue L4;
                              } else {
                                var8++;
                                continue L4;
                              }
                            } else {
                              var8++;
                              continue L4;
                            }
                          } else {
                            var8++;
                            continue L4;
                          }
                        } else {
                          var8++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L26: {
                      var9 = var3 + 32;
                      stackOut_10_0 = 95 * var8;
                      stackOut_10_1 = 70;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (((opa) this).field_c.field_k >= 3) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L26;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 95;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L26;
                      }
                    }
                    L27: {
                      var10 = stackIn_13_0 + (stackIn_13_1 - -stackIn_13_2);
                      var11 = -50 + var10;
                      var12_int = var10 - 25;
                      eca.field_c[2].a(3 + var9, var11, eca.field_c[2].a() >> 2, eca.field_c[2].c() >> 2);
                      var13_int = var10;
                      eca.field_c[1].a(var9, var12_int, eca.field_c[1].a() >> 2, eca.field_c[1].c() >> 2);
                      eca.field_c[0].a(2 + var9, var13_int, eca.field_c[0].a() / 3, eca.field_c[0].c() / 3);
                      var14_ref_gsa = ((opa) this).field_r[var8];
                      if (!var14_ref_gsa.field_l) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L27;
                      } else {
                        stackOut_14_0 = var14_ref_gsa.field_c;
                        stackIn_16_0 = stackOut_14_0;
                        break L27;
                      }
                    }
                    L28: {
                      var15 = stackIn_16_0;
                      var16_ref_String = Integer.toString(var15);
                      if (var15 < 10) {
                        var16_ref_String = "0" + var16_ref_String;
                        var20_ref_String = var16_ref_String;
                        var20_ref_String = var16_ref_String;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      ts.a(-1, -73, 20 + var11, var16_ref_String.toUpperCase(), 24 + var9, eda.field_f, 2431750);
                      if (var14_ref_gsa.field_d) {
                        stackOut_21_0 = var14_ref_gsa.field_r;
                        stackIn_22_0 = stackOut_21_0;
                        break L29;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_22_0 = stackOut_20_0;
                        break L29;
                      }
                    }
                    L30: {
                      var17 = stackIn_22_0;
                      var18_ref_String = Integer.toString(var17);
                      if (10 > var17) {
                        var18_ref_String = "0" + var18_ref_String;
                        var20_ref_String = var18_ref_String;
                        var20_ref_String = var18_ref_String;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      ts.a(-1, -28, var12_int - -17, var18_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                      if (var14_ref_gsa.field_k) {
                        stackOut_27_0 = var14_ref_gsa.field_p;
                        stackIn_28_0 = stackOut_27_0;
                        break L31;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_28_0 = stackOut_26_0;
                        break L31;
                      }
                    }
                    L32: {
                      var19 = stackIn_28_0;
                      var20_ref_String = Integer.toString(var19);
                      if (var19 >= 10) {
                        break L32;
                      } else {
                        var20_ref_String = "0" + var20_ref_String;
                        break L32;
                      }
                    }
                    L33: {
                      ts.a(-1, -29, var13_int + 14, var20_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                      var21_int = ((opa) this).field_c.field_H[var8].z(-104);
                      var22 = 0;
                      if (var21_int < 0) {
                        break L33;
                      } else {
                        if (2 != bta.field_n[var21_int]) {
                          break L33;
                        } else {
                          if (var14_ref_gsa.field_o) {
                            var22 = 1;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                    L34: {
                      if (0 > var21_int) {
                        break L34;
                      } else {
                        if (bta.field_n[var21_int] != -2) {
                          break L34;
                        } else {
                          if (!var14_ref_gsa.field_h) {
                            break L34;
                          } else {
                            var22 = 1;
                            break L34;
                          }
                        }
                      }
                    }
                    L35: {
                      if (-1 > var21_int) {
                        break L35;
                      } else {
                        if (0 != bta.field_n[var21_int]) {
                          break L35;
                        } else {
                          if (var14_ref_gsa.field_b) {
                            var22 = 1;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                      }
                    }
                    L36: {
                      if (var21_int < 0) {
                        break L36;
                      } else {
                        if (var22 != 0) {
                          L37: {
                            var23 = 43 + var9;
                            if (bta.field_n[var21_int] != 2) {
                              if (bta.field_n[var21_int] != 1) {
                                stackOut_51_0 = var13_int - 10;
                                stackIn_52_0 = stackOut_51_0;
                                break L37;
                              } else {
                                stackOut_50_0 = -6 + var12_int;
                                stackIn_52_0 = stackOut_50_0;
                                break L37;
                              }
                            } else {
                              stackOut_48_0 = -4 + var11;
                              stackIn_52_0 = stackOut_48_0;
                              break L37;
                            }
                          }
                          var24 = stackIn_52_0;
                          var25_ref = sta.field_y[bta.field_f[var21_int]];
                          var25_ref.a(var23, var24, var25_ref.a() >> 1, var25_ref.c() >> 1);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L38: {
                      var23 = 80 + var9;
                      var24 = 32 + var10;
                      var25 = String.valueOf(((opa) this).field_r[var8].field_m);
                      ts.a(-1, -59, var24, "$", var23, qr.field_v, 2431750);
                      ts.a(0, -28, -1 + var24, var25.toUpperCase(), 18 + var23, qr.field_v, wga.field_a[var8]);
                      var26 = ((opa) this).field_c.field_v[var8];
                      if (var8 != ((opa) this).field_c.e(2)) {
                        break L38;
                      } else {
                        if (var7 >= -100 + fd.field_e) {
                          break L38;
                        } else {
                          var26--;
                          break L38;
                        }
                      }
                    }
                    oka.a(Integer.toString(var26), wga.field_a[var8], qr.field_v, -1, -47 + (var24 + -1), 55, 0);
                    oka.a(Integer.toString(((opa) this).field_c.field_L), wga.field_a[var8], qr.field_v, -1, -12 + (var24 + -1), 55, 0);
                    oka.a("_", wga.field_a[var8], qr.field_v, -1, -40 + var24, 55, 0);
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var8 = -30 + (var3 + -50 >> 2) * 3;
                var9 = (var7 + 1) * (var4 / 4) + 20;
                ng.field_b[0].a((float)var8, (float)var9, 4096, 16384, 3, 1610612736, 1);
                ng.field_b[0].a((float)(var8 - -150), (float)var9, 4096, 16384, 3, 1610612736, 1);
                var7++;
                continue L2;
              }
            }
          } else {
            var8 = 50 - -((1 + var7) * var6);
            ng.field_b[0].a(var8, 0);
            var7++;
            continue L1;
          }
        }
    }

    final static String a(String param0) {
        RuntimeException var2 = null;
        mi[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_array = ih.a((byte) 126, param0);
            var3 = new StringBuilder();
            var4 = -1;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_array.length) {
                stackOut_18_0 = var3.toString();
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L2: {
                  var6 = var2_array[var5];
                  var7 = var6.field_h;
                  if (var5 != var2_array.length + -1) {
                    stackOut_5_0 = var2_array[var5 - -1].field_h;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = param0.length();
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var9 = param0.substring(var7, var8);
                  if (var6.field_p == ma.field_e) {
                    StringBuilder discarded$6 = var3.append("<col=66ffff>").append(var9).append("</col>");
                    break L3;
                  } else {
                    if (nl.field_d == var6.field_p) {
                      StringBuilder discarded$7 = var3.append("<col=33bbff>").append(var9).append("</col>");
                      break L3;
                    } else {
                      if (var6.field_p != tr.field_f) {
                        if (dc.field_o != var6.field_p) {
                          if (var6.field_p != dja.field_r) {
                            StringBuilder discarded$8 = var3.append(var9);
                            break L3;
                          } else {
                            StringBuilder discarded$9 = var3.append("<col=33ffaa>").append(var9).append("</col>");
                            break L3;
                          }
                        } else {
                          StringBuilder discarded$10 = var3.append("<col=ffaaff>").append(var9).append("</col>");
                          break L3;
                        }
                      } else {
                        StringBuilder discarded$11 = var3.append("<col=ffff99>").append(var9).append("</col>");
                        break L3;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("opa.H(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -110 + 41);
        }
        return stackIn_19_0;
    }

    opa(qh param0, v param1, int[][] param2) {
        super(param0, param1);
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        gsa var14 = null;
        double var15 = 0.0;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        gsa var18_ref_gsa = null;
        double var18 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double stackIn_21_0 = 0.0;
        double stackIn_25_0 = 0.0;
        double stackIn_29_0 = 0.0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_20_0 = 0.0;
        double stackOut_19_0 = 0.0;
        double stackOut_24_0 = 0.0;
        double stackOut_23_0 = 0.0;
        double stackOut_27_0 = 0.0;
        double stackOut_28_0 = 0.0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        try {
          L0: {
            var4_int = ((opa) this).field_c.field_H.length;
            ((opa) this).field_r = new gsa[var4_int];
            var5_int = 0;
            L1: while (true) {
              if (var4_int <= var5_int) {
                er.b(1, 0);
                ((opa) this).field_s = false;
                mr.field_w = new w();
                var5 = 0.0;
                var7 = 0.0;
                var9 = 0.0;
                var11 = 0.0;
                var13_int = 0;
                L2: while (true) {
                  if (var13_int >= ((opa) this).field_r.length) {
                    var13 = (double)(aaa.a(false) + -250);
                    var15 = -50.0 + var13;
                    var17 = 0;
                    L3: while (true) {
                      if (((opa) this).field_r.length <= var17) {
                        L4: {
                          var17 = 50;
                          if (0.0 >= var7) {
                            ((opa) this).field_p = true;
                            break L4;
                          } else {
                            efa.field_y = var17;
                            var17 = var4_int * 50 + (var17 - -50);
                            ona.field_H = var17;
                            var17 += 100;
                            var17 += 50;
                            break L4;
                          }
                        }
                        L5: {
                          if (var9 > 0.0) {
                            nta.field_d = var17;
                            var17 = 50 + var4_int * 50 + var17;
                            og.field_m = var17;
                            var17 += 100;
                            var17 += 50;
                            break L5;
                          } else {
                            ((opa) this).field_m = true;
                            break L5;
                          }
                        }
                        L6: {
                          if (0.0 < var11) {
                            iv.field_ub = var17;
                            var17 = var17 - -(var4_int * 50) + 50;
                            ema.field_b = var17;
                            var17 += 100;
                            break L6;
                          } else {
                            ((opa) this).field_o = true;
                            break L6;
                          }
                        }
                        L7: {
                          if (!((opa) this).field_p) {
                            break L7;
                          } else {
                            if (!((opa) this).field_m) {
                              break L7;
                            } else {
                              if (!((opa) this).field_o) {
                                break L7;
                              } else {
                                ona.field_H = var17;
                                var17 += 100;
                                var18 = var15 / 100.0;
                                ((opa) this).field_r[((opa) this).field_c.e(2)].field_i = var18;
                                break L7;
                              }
                            }
                          }
                        }
                        var17 += 100;
                        fd.field_e = var17;
                        break L0;
                      } else {
                        L8: {
                          L9: {
                            var18_ref_gsa = ((opa) this).field_r[var17];
                            var19 = (double)(var18_ref_gsa.field_u + var18_ref_gsa.field_v);
                            if (var19 == 0.0) {
                              break L9;
                            } else {
                              if (0.0 != var5) {
                                stackOut_20_0 = var19 / var5 * 100.0;
                                stackIn_21_0 = stackOut_20_0;
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          stackOut_19_0 = 0.0;
                          stackIn_21_0 = stackOut_19_0;
                          break L8;
                        }
                        L10: {
                          L11: {
                            var21 = stackIn_21_0;
                            var23 = var21 * (var15 / 100.0) / 100.0;
                            var25 = (double)(var18_ref_gsa.field_n + var18_ref_gsa.field_z);
                            if (0.0 == var25) {
                              break L11;
                            } else {
                              if (var5 != 0.0) {
                                stackOut_24_0 = 100.0 * (var25 / var5);
                                stackIn_25_0 = stackOut_24_0;
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          stackOut_23_0 = 0.0;
                          stackIn_25_0 = stackOut_23_0;
                          break L10;
                        }
                        L12: {
                          L13: {
                            var21 = stackIn_25_0;
                            var27 = var21 * (var15 / 100.0) / 100.0;
                            var29 = (double)(var18_ref_gsa.field_f + var18_ref_gsa.field_a);
                            if (var29 == 0.0) {
                              break L13;
                            } else {
                              if (0.0 == var5) {
                                break L13;
                              } else {
                                stackOut_27_0 = 100.0 * (var29 / var5);
                                stackIn_29_0 = stackOut_27_0;
                                break L12;
                              }
                            }
                          }
                          stackOut_28_0 = 0.0;
                          stackIn_29_0 = stackOut_28_0;
                          break L12;
                        }
                        var21 = stackIn_29_0;
                        var31 = var21 * (var15 / 100.0) / 100.0;
                        var18_ref_gsa.a(var27, var31, var23, true);
                        var17++;
                        continue L3;
                      }
                    }
                  } else {
                    L14: {
                      var14 = ((opa) this).field_r[var13_int];
                      var18_ref_gsa = var14;
                      var18_ref_gsa = var14;
                      var15_int = var14.field_v + var14.field_u;
                      var16 = var14.field_n + var14.field_z;
                      var17 = var14.field_a - -var14.field_f;
                      if (var9 >= (double)var16) {
                        break L14;
                      } else {
                        var9 = (double)var16;
                        break L14;
                      }
                    }
                    L15: {
                      if (var7 >= (double)var15_int) {
                        break L15;
                      } else {
                        var7 = (double)var15_int;
                        break L15;
                      }
                    }
                    L16: {
                      if ((double)(var15_int - (-var16 + -var17)) <= var5) {
                        break L16;
                      } else {
                        var5 = (double)(var17 + (var15_int - -var16));
                        break L16;
                      }
                    }
                    L17: {
                      if (var11 >= (double)var17) {
                        break L17;
                      } else {
                        var11 = (double)var17;
                        break L17;
                      }
                    }
                    var13_int++;
                    continue L2;
                  }
                }
              } else {
                ((opa) this).field_r[var5_int] = new gsa(((opa) this).field_c.field_H[var5_int], param2[var5_int]);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var4;
            stackOut_45_1 = new StringBuilder().append("opa.<init>(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L18;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L18;
            }
          }
          L19: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L19;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L19;
            }
          }
          L20: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param2 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L20;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L20;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 80) {
            ((opa) this).b(76, true);
        }
        for (var3 = 0; var3 < ((opa) this).field_c.field_H.length; var3++) {
            if (!((opa) this).field_q) {
                ((opa) this).field_c.field_H[var3].n((byte) -98).a(26, 4, true);
            }
            ((opa) this).field_c.field_H[var3].n((byte) -127).a(param0 + 21383);
            ((opa) this).field_c.field_H[var3].n((byte) -54).f(-4366);
        }
        ((opa) this).field_q = true;
        if (!(!param1)) {
            ((opa) this).c(7);
        }
        ((opa) this).field_c.field_E = ((opa) this).field_c.field_E + 1;
        var3 = ((opa) this).field_c.field_E;
        if (fd.field_e <= var3) {
            if (!(((opa) this).field_s)) {
                if (((opa) this).field_f != null) {
                    ((opa) this).field_f.a(6418);
                }
                ((opa) this).field_s = true;
            }
        }
        for (var4 = 0; ((opa) this).field_r.length > var4; var4++) {
            ((opa) this).field_r[var4].a(0, var3, var4);
        }
        mr.field_w.a(param0 + 35, !param1 ? true : false);
    }

    static {
    }
}
