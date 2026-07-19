/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    private int[] field_d;
    private int[] field_g;
    static hl field_a;
    private int field_k;
    private int field_i;
    private int field_e;
    static String field_h;
    static long field_c;
    static String field_f;
    static hl field_j;
    private int field_b;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(el param0, byte param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              gd.a((String) null, 255, (String) null, -1, ph.field_t, (int[]) null, 0L, param0, param0.j(-128));
              if (!param0.field_Kb) {
                break L1;
              } else {
                L2: {
                  if (2 == param0.field_Zb) {
                    break L2;
                  } else {
                    if (2 > dd.field_c) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = hd.field_s;
                var8 = sk.a(new String[]{param3}, md.field_y, 119);
                var7.field_j.a(var8, 1, 10);
                break L1;
              }
            }
            L3: {
              hd.field_s.b((byte) 79);
              if (param2) {
                if (nd.field_Nb != hd.field_s.field_c) {
                  var11 = hd.field_s;
                  var12 = sk.a(new String[]{param3}, vi.field_b, 120);
                  var11.field_j.a(var12, 1, 15);
                  break L3;
                } else {
                  var9 = hd.field_s;
                  var10 = sk.a(new String[]{param3}, wa.field_h, 127);
                  var9.field_j.a(var10, 1, 16);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var13 = hd.field_s;
            if (param1 >= 103) {
              var5 = ci.field_B;
              var6 = li.field_o;
              var13.field_j.a(0, var6, -117, 0, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("oj.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int[] param4) {
        int incrementValue$2 = 0;
        boolean discarded$3 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 <= param0) {
                break L1;
              } else {
                L2: {
                  var5_int = (param3 + param0) / 2;
                  var6 = param0;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param3];
                  param4[param3] = var7;
                  var8 = param1[var5_int];
                  param1[var5_int] = param1[param3];
                  param1[param3] = var8;
                  if (2147483647 != var7) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param0;
                L3: while (true) {
                  if (var10 >= param3) {
                    param4[param3] = param4[var6];
                    param4[var6] = var7;
                    param1[param3] = param1[var6];
                    param1[var6] = var8;
                    oj.a(param0, param1, (byte) -63, var6 + -1, param4);
                    oj.a(1 + var6, param1, (byte) -63, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (var7 + -(var10 & var9) < param4[var10]) {
                        var11 = param4[var10];
                        param4[var10] = param4[var6];
                        param4[var6] = var11;
                        var12 = param1[var10];
                        param1[var10] = param1[var6];
                        incrementValue$2 = var6;
                        var6++;
                        param1[incrementValue$2] = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param2 == -63) {
                break L5;
              } else {
                var14 = (String) null;
                discarded$3 = oj.a(126, (String) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("oj.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 == this.field_e) {
            this.a(-27169);
            this.field_e = 256;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_d[fieldTemp$0];
    }

    final static void b(byte param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        v var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        bc var13 = null;
        int var14 = 0;
        bc var15 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var13 = kb.field_q;
              var15 = var13;
              var2 = var15.d((byte) -99);
              if (param0 <= -95) {
                break L1;
              } else {
                oj.b((byte) -78);
                break L1;
              }
            }
            var3 = (v) ((Object) tc.field_p.c(false));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_n == var2) {
                    break L3;
                  } else {
                    var3 = (v) ((Object) tc.field_p.a((byte) -70));
                    continue L2;
                  }
                }
              }
              if (var3 != null) {
                L4: {
                  var4 = var15.d((byte) -99);
                  if (var4 == 0) {
                    break L4;
                  } else {
                    nj.field_a[0] = ph.field_w;
                    var5 = var3.field_q;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        lm.a(var5, var4, (byte) 71);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            ae.b(94, var5);
                            dupTemp$2 = new String[2][var5];
                            var3.field_p = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][var5 * 4];
                            var3.field_y = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = nd.field_Mb;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var8 <= var9) {
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = qd.field_W[var5 - -var9];
                                      var6[1][var14] = nj.field_a[var11];
                                      var7[1][4 * var14] = lb.field_P[var11];
                                      var7[1][4 * var14 - -1] = ac.field_b[var11];
                                      var7[1][var14 * 4 - -2] = ai.field_g[var11];
                                      var7[1][var14 * 4 - -3] = gl.field_n[var11];
                                      if (ej.a(nj.field_a[var11], 4)) {
                                        if (gl.field_n[var11] + ai.field_g[var11] + ac.field_b[var11] != 0) {
                                          break L9;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var14++;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = qd.field_W[var9];
                                  var6[0][var10] = nj.field_a[var11];
                                  var7[0][var10 * 4] = lb.field_P[var11];
                                  var7[0][var10 * 4 - -1] = ac.field_b[var11];
                                  var7[0][2 + var10 * 4] = ai.field_g[var11];
                                  var7[0][3 + 4 * var10] = gl.field_n[var11];
                                  if (!ej.a(nj.field_a[var11], 4)) {
                                    break L10;
                                  } else {
                                    if (ai.field_g[var11] + (ac.field_b[var11] + gl.field_n[var11]) != 0) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              lb.a(var15, false);
                              if (var6_int == 0) {
                                var3.field_B = tl.field_X;
                                var3.field_s = fd.field_F;
                                var3.field_o = om.field_Nb;
                                var3.field_t = l.field_j;
                                ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_int, l.field_j);
                                break L11;
                              } else {
                                ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_int, l.field_j);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        nj.field_a[var6_int] = var13.g((byte) 81);
                        var6_int++;
                        continue L5;
                      }
                    }
                  }
                }
                var3.field_u = true;
                var3.b(false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                mk.a(false);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "oj.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (ke.a(param1, false) == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final void a(int param0) {
        int discarded$4 = 0;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          if (param0 == -27169) {
            break L0;
          } else {
            discarded$4 = this.c(54);
            break L0;
          }
        }
        int fieldTemp$5 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        this.field_i = this.field_i + fieldTemp$5;
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L2: {
              var3 = this.field_g[var2];
              if (-1 == (2 & var2 ^ -1)) {
                if ((1 & var2) != 0) {
                  this.field_b = this.field_b ^ this.field_b >>> 29190470;
                  break L2;
                } else {
                  this.field_b = this.field_b ^ this.field_b << -122307251;
                  break L2;
                }
              } else {
                if (0 == (1 & var2)) {
                  this.field_b = this.field_b ^ this.field_b << 300803714;
                  break L2;
                } else {
                  this.field_b = this.field_b ^ this.field_b >>> -2050407312;
                  break L2;
                }
              }
            }
            this.field_b = this.field_b + this.field_g[255 & var2 - -128];
            dupTemp$6 = this.field_g[pl.a(1020, var3) >> -1842873086] - -this.field_b - -this.field_i;
            var4 = dupTemp$6;
            this.field_g[var2] = dupTemp$6;
            dupTemp$7 = this.field_g[pl.a(var4 >> 1658904392 >> -1774207230, 255)] - -var3;
            this.field_i = dupTemp$7;
            this.field_d[var2] = dupTemp$7;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        L0: {
          var11 = TetraLink.field_J;
          if (param0 == 3) {
            break L0;
          } else {
            var12 = (String) null;
            oj.a((el) null, (byte) -74, true, (String) null);
            break L0;
          }
        }
        var4 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var8 = -1640531527;
        var3 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(-27169);
                    this.field_e = 256;
                    return;
                  } else {
                    var7 = var7 + this.field_g[4 + var2];
                    var8 = var8 + this.field_g[var2 - -5];
                    var5 = var5 + this.field_g[var2 - -2];
                    var6 = var6 + this.field_g[var2 - -3];
                    var9 = var9 + this.field_g[var2 - -6];
                    var3 = var3 + this.field_g[var2];
                    var10 = var10 + this.field_g[7 + var2];
                    var4 = var4 + this.field_g[1 + var2];
                    var3 = var3 ^ var4 << -1018032245;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -225890622;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -1601846168;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 1149475280;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -876683414;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1932321020;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1712431368;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 1497120233;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_g[var2] = var3;
                    this.field_g[1 + var2] = var4;
                    this.field_g[var2 - -2] = var5;
                    this.field_g[var2 - -3] = var6;
                    this.field_g[4 + var2] = var7;
                    this.field_g[var2 - -5] = var8;
                    this.field_g[6 + var2] = var9;
                    this.field_g[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var4 = var4 + this.field_d[var2 + 1];
                var5 = var5 + this.field_d[2 + var2];
                var6 = var6 + this.field_d[3 + var2];
                var10 = var10 + this.field_d[7 + var2];
                var7 = var7 + this.field_d[var2 - -4];
                var9 = var9 + this.field_d[var2 + 6];
                var3 = var3 + this.field_d[var2];
                var8 = var8 + this.field_d[var2 + 5];
                var3 = var3 ^ var4 << 442481387;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 874404002;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1398672728;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -2142958608;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 232692394;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -1460382076;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -2033164696;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -755454071;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_g[var2] = var3;
                this.field_g[1 + var2] = var4;
                this.field_g[2 + var2] = var5;
                this.field_g[var2 + 3] = var6;
                this.field_g[4 + var2] = var7;
                this.field_g[5 + var2] = var8;
                this.field_g[var2 - -6] = var9;
                this.field_g[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 199334923;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1018823966;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1503936888;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1752384112;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -8474070;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -871322780;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 2052962120;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 82765673;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    oj(int[] param0) {
        int var2_int = 0;
        try {
            this.field_d = new int[256];
            this.field_g = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_d[var2_int] = param0[var2_int];
            }
            this.b(3);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_a = null;
        field_h = null;
        int var1 = -111 % ((68 - param0) / 57);
    }

    final static int a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param2 != 10121) {
            discarded$0 = oj.a(-107, -60, -22);
        }
        if ((param0 ^ -1) == -2) {
            if (!(!bn.a(param2 ^ 10120, param1))) {
                return 29;
            }
        }
        return ai.field_a[param0];
    }

    static {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_h = "On";
    }
}
