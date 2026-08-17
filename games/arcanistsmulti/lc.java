/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_i;
    private so field_g;
    private int field_h;
    static vn field_j;
    private int field_n;
    static String field_r;
    private qb field_b;
    private int field_l;
    private int field_m;
    private double field_f;
    static String field_c;
    static String field_a;
    static on[] field_q;
    private int field_d;
    static String field_o;
    static String field_k;
    static String field_e;
    static String field_p;

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!ArcanistsMulti.i((byte) -120)) {
              L1: {
                L2: {
                  if (-1 > (param1 ^ -1)) {
                    L3: {
                      mi.field_B.a(ic.field_b, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
                      param0 += 24;
                      param2 += 16;
                      mi.field_B.a(ug.field_l + param1, param2, param0, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                      param2 += 90;
                      if (-100 <= (param1 ^ -1)) {
                        break L3;
                      } else {
                        param2 += 8;
                        break L3;
                      }
                    }
                    var5_int = 0;
                    L4: while (true) {
                      if ((var5_int ^ -1) <= (param1 ^ -1)) {
                        break L2;
                      } else {
                        stackIn_28_0 = param1;

                        stackIn_28_1 = 5 + var5_int;

                        L5: {
                          if (stackIn_28_0 <= stackIn_28_1) {
                            tg.field_b[7].a(param2, param0);
                            param2 += 9;
                            break L5;
                          } else {
                            param2 -= 4;
                            tg.field_b[8].a(param2, param0);
                            param2 += 15;
                            var5_int += 4;
                            if ((var5_int ^ -1) != ((-(param1 % 10) + param1) / 2 + -1 ^ -1)) {
                              break L5;
                            } else {
                              if ((param1 ^ -1) >= -51) {
                                break L5;
                              } else {
                                param0 += 8;
                                param2 = param2 - var5_int * 2;
                                break L5;
                              }
                            }
                          }
                        }
                        var5_int++;
                        continue L4;
                      }
                    }
                  } else {
                    mi.field_B.a(rl.field_i, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
                    mi.field_B.a(aa.field_j, param2, param0 + 24, 300, 32, 0, -1, 1, 1, mi.field_B.field_C);
                    break L2;
                  }
                }
                stackIn_28_0 = 97;
                stackIn_28_1 = (param3 - 56) / 48;
                break L1;
              }
              var5_int = stackIn_28_0 % stackIn_28_1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "lc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (6 == this.field_l) {
              if (!lc.a((byte) 112)) {
                L1: {
                  stackIn_9_0 = this.b(param1, 200);

                  if ((param1 ^ -1) <= -3) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 300;
                    break L1;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 150;
                    break L1;
                  }
                }
                stackIn_11_0 = stackIn_10_0 + stackIn_10_1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = this.b(param1, 200) - -320;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              if (7 == this.field_l) {
                stackIn_16_0 = 200 + this.b(param1, 200);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (-12 != (this.field_l ^ -1)) {
                  if (this.field_l != 12) {
                    if (this.field_l != 14) {
                      if (3 != this.field_l) {
                        if (-10 == (this.field_l ^ -1)) {
                          stackIn_51_0 = 440;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          L2: {
                            if ((this.field_l ^ -1) == param0) {
                              if (-1 == (param1 ^ -1)) {
                                stackIn_59_0 = 220;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if ((param1 ^ -1) == -2) {
                                  stackIn_64_0 = 420;
                                  decompiledRegionSelector0 = 13;
                                  break L0;
                                } else {
                                  if (param1 != 2) {
                                    break L2;
                                  } else {
                                    stackIn_67_0 = 620;
                                    decompiledRegionSelector0 = 14;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                          stackIn_69_0 = eo.field_b[this.field_l];
                          decompiledRegionSelector0 = 15;
                          break L0;
                        }
                      } else {
                        stackIn_46_0 = 560;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      stackIn_43_0 = this.b(param1, param0 ^ -193) + 200;
                      decompiledRegionSelector0 = 9;
                      break L0;
                    }
                  } else {
                    if (param1 == 0) {
                      stackIn_35_0 = 271;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (-2 != (param1 ^ -1)) {
                        stackIn_40_0 = 200 + this.b(param1, 200);
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        stackIn_38_0 = 619;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (-1 == (param1 ^ -1)) {
                    stackIn_23_0 = 295;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-2 != (param1 ^ -1)) {
                      stackIn_28_0 = 200 + this.b(param1, 200);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_26_0 = 611;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.V(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_38_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_40_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_43_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_46_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_51_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_59_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_64_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_67_0;
                                    } else {
                                      return stackIn_69_0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = qe.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "lc.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void f(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (re.field_r != 1) {
                break L1;
              } else {
                var2_int = dd.field_g;
                if (ke.field_K != var2_int) {
                  if (var2_int == -1) {
                    break L1;
                  } else {
                    ke.field_K = var2_int;
                    break L1;
                  }
                } else {
                  ke.field_K = -1;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                this.field_g = (so) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.C(" + param0 + ')');
        }
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -82) {
              if (!param0) {
                stackIn_7_0 = ob.field_T.b(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = vd.field_c.b(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -107;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final void b(byte param0) {
        boolean discarded$0 = false;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var12_int = 0;
        int var23 = 0;
        String stackIn_48_0 = null;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        String[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3 = uc.field_a + 96;
                var4 = 64 + bi.field_I;
                var5 = var4;
                var6 = 512;
                var12_int = fh.field_e;
                if (var12_int != 0) {
                  if (var12_int != 1) {
                    if ((var12_int ^ -1) == -3) {
                      var2 = lf.field_d;
                      var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                      var7 = var4;
                      var9 = 45 + bi.field_I;
                      var8 = 550;
                      var10 = 230 - -bi.field_I;
                      de.e(var9, var3, var8, 60, 16777215, 128);
                      var2 = cf.field_e;
                      var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                      bb.field_g[0].c(var4, var3);
                      var4 += 40;
                      bb.field_g[12].b(var4, var3);
                      var3 += 20;
                      bb.field_g[14].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[38].b(var4, var3);
                      var3 += 20;
                      bb.field_g[43].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      bb.field_g[44].b(var4, var3);
                      var3 += 20;
                      bb.field_g[49].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      bb.field_g[51].b(var4, var3);
                      var3 += 20;
                      bb.field_g[61].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      bb.field_g[64].b(var4, var3);
                      var3 += 20;
                      bb.field_g[96].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      bb.field_g[100].b(var4, var3);
                      var3 += 20;
                      bb.field_g[108].b(var4, var3);
                      var4 += 20;
                      var3 += 30;
                      var2 = pm.field_g;
                      var4 = var7;
                      mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                      de.e(var9, var3, var8, 60, 16777215, 128);
                      var2 = p.field_h;
                      var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      bb.field_g[1].c(var4, var3);
                      var4 += 40;
                      bb.field_g[8].b(var4, var3);
                      var3 += 20;
                      bb.field_g[10].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      bb.field_g[19].b(var4, var3);
                      var3 += 20;
                      bb.field_g[26].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[31].b(var4, var3);
                      var3 += 20;
                      bb.field_g[34].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[45].b(var4, var3);
                      var3 += 20;
                      bb.field_g[56].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[132].b(var4, var3);
                      var3 += 20;
                      bb.field_g[97].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[101].b(var4, var3);
                      var3 += 20;
                      bb.field_g[115].b(var4, var3);
                      var3 -= 20;
                      var4 += 20;
                      var3 += 50;
                      var2 = field_o;
                      mi.field_B.a(var2, var10, var3 - 65, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                      var4 = var7;
                      de.e(var9, var3, var8, 60, 16777215, 128);
                      var2 = ma.field_S;
                      var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      bb.field_g[7].c(var4, var3);
                      var4 += 40;
                      bb.field_g[20].b(var4, var3);
                      var3 += 20;
                      bb.field_g[72].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[135].b(var4, var3);
                      var3 += 20;
                      var3 += 30;
                      var2 = oj.field_a;
                      var4 = var7;
                      mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                      de.e(var9, var3, var8, 60, 16777215, 128);
                      var2 = mn.field_q;
                      var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                      bb.field_g[3].c(var4, var3);
                      var4 += 40;
                      bb.field_g[13].b(var4, var3);
                      var3 += 20;
                      bb.field_g[24].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[36].b(var4, var3);
                      var3 += 20;
                      bb.field_g[98].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      bb.field_g[99].b(var4, var3);
                      var3 += 20;
                      bb.field_g[114].b(var4, var3);
                      var4 += 20;
                      var3 -= 20;
                      var2 = am.field_b;
                      var3 += 30;
                      var4 = var7;
                      mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                      break L2;
                    } else {
                      if (3 == var12_int) {
                        var9 = 45 + bi.field_I;
                        var10 = bi.field_I - -290;
                        var2 = jf.field_i;
                        var8 = 550;
                        var7 = var4;
                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                        var7 = var4;
                        de.e(var9, var3, var8, 60, 16777215, 128);
                        var2 = qj.field_b;
                        var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                        bb.field_g[2].c(var4, var3);
                        var4 += 40;
                        bb.field_g[15].b(var4, var3);
                        var3 += 20;
                        bb.field_g[25].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[32].b(var4, var3);
                        var3 += 20;
                        bb.field_g[33].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[35].b(var4, var3);
                        var3 += 20;
                        bb.field_g[37].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[53].b(var4, var3);
                        var3 += 20;
                        bb.field_g[54].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[59].b(var4, var3);
                        var3 += 20;
                        bb.field_g[65].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[66].b(var4, var3);
                        var3 += 20;
                        bb.field_g[71].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[76].b(var4, var3);
                        var3 += 20;
                        bb.field_g[77].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[133].b(var4, var3);
                        var3 += 20;
                        var2 = hn.field_i;
                        var3 += 30;
                        mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                        var4 = var7;
                        de.e(var9, var3, var8, 60, 16777215, 128);
                        var2 = rc.field_f;
                        var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                        bb.field_g[4].c(var4, var3);
                        var4 += 40;
                        bb.field_g[5].b(var4, var3);
                        var3 += 20;
                        bb.field_g[9].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[11].b(var4, var3);
                        var3 += 20;
                        bb.field_g[17].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[21].b(var4, var3);
                        var3 += 20;
                        bb.field_g[29].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[39].b(var4, var3);
                        var3 += 20;
                        bb.field_g[41].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[42].b(var4, var3);
                        var3 += 20;
                        bb.field_g[52].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[55].b(var4, var3);
                        var3 += 20;
                        bb.field_g[63].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[67].b(var4, var3);
                        var3 += 20;
                        bb.field_g[68].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[74].b(var4, var3);
                        var3 += 20;
                        bb.field_g[106].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[109].b(var4, var3);
                        var3 += 20;
                        bb.field_g[112].b(var4, var3);
                        var3 += 30;
                        var4 += 20;
                        var2 = sn.field_J;
                        var4 = var7;
                        mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                        de.e(var9, var3, var8, 60, 16777215, 128);
                        var2 = me.field_P;
                        var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                        bb.field_g[73].c(var4, var3);
                        var4 += 40;
                        bb.field_g[22].b(var4, var3);
                        var3 += 20;
                        bb.field_g[46].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[48].b(var4, var3);
                        var3 += 20;
                        bb.field_g[60].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[103].b(var4, var3);
                        var3 += 20;
                        var3 += 30;
                        var2 = jd.field_e;
                        mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                        var4 = var7;
                        de.e(var9, var3, var8, 60, 16777215, 128);
                        de.h(0, var3 - -60, an.field_f, an.field_j);
                        de.c(var9, var3, var8, 105, 25, 16777215, 128);
                        de.a();
                        var2 = om.field_L;
                        var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                        bb.field_g[75].c(var4, var3);
                        var4 += 40;
                        bb.field_g[6].b(var4, var3);
                        var3 += 20;
                        bb.field_g[16].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[18].b(var4, var3);
                        var3 += 20;
                        bb.field_g[23].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[27].b(var4, var3);
                        var3 += 20;
                        bb.field_g[28].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[30].b(var4, var3);
                        var3 += 20;
                        bb.field_g[40].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[47].b(var4, var3);
                        var3 += 20;
                        bb.field_g[50].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[57].b(var4, var3);
                        var3 += 20;
                        bb.field_g[58].b(var4, var3);
                        var3 -= 20;
                        var4 += 20;
                        bb.field_g[62].b(var4, var3);
                        var3 += 20;
                        bb.field_g[69].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[70].b(var4, var3);
                        var3 += 20;
                        bb.field_g[102].b(var4, var3);
                        var4 += 20;
                        var3 -= 20;
                        bb.field_g[104].b(var4, var3);
                        var3 += 20;
                        bb.field_g[110].b(var4, var3);
                        var4 += 20;
                        var3 += 30;
                        var2 = gb.field_e;
                        mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                        var2 = jn.field_b;
                        mi.field_B.a(var2, var5, -5 + var3, var6, 60, 0, -1, 1, 0, mi.field_B.field_C + mi.field_B.field_m);
                        var4 = var7;
                        break L2;
                      } else {
                        if ((var12_int ^ -1) == -5) {
                          L3: {
                            var2 = n.field_e;
                            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                            var4 = 320 + (bi.field_I + -80);
                            var3 = -70 + uc.field_a + 240;
                            de.a(-1 + var4, var3 + -1, 162, 122, 0);
                            md.field_f[2].c(var4, -24 + var3, 160, 160);
                            de.b(var4 - 170, var3 + 22, var4 - 10, 22 + var3, 16711680);
                            de.b(var4 + 5, 5 + var3 - -15, -10 + var4, var3 - -22, 16711680);
                            mi.field_B.a(ue.field_a, -180 + var4, 20 + var3, 0, 16711680);
                            de.a(var4 + 5, var3 + 5, 50, 30, 6, 16711680);
                            de.c(5 + var4, var3 - -5, 50, 30, 6, 16711680, 64);
                            de.b(-170 + var4, -18 + var3, var4 + 40, -18 + var3, 65280);
                            de.b(10 + (var4 - -70), var3, var4 - -40, var3 + -18, 65280);
                            mi.field_B.a(lh.field_h, var4 - 180, -20 + var3, 0, 65280);
                            de.a(70 + var4, var3, 20, 15, 4, 65280);
                            de.c(70 + var4, var3, 20, 15, 4, 65280, 64);
                            de.b(180 + (160 + var4), var3 - -22, 10 + (160 + var4), var3 - -22, 33023);
                            de.b(var4 + 145 - -10, var3 + 10, 160 + var4 + 10, var3 - -22, 33023);
                            mi.field_B.c(u.field_m, 160 + var4 + 180, 20 + var3, 0, 33023);
                            de.a(145 + var4, 5 + var3, 10, 10, 4, 33023);
                            de.c(var4 - -145, 5 + var3, 10, 10, 4, 33023, 64);
                            de.b(-170 + var4, 122 + var3, -10 + var4, 122 + var3, 16711935);
                            de.b(var4 + 5, 7 + (var3 + 105), -10 + var4, var3 - -122, 16711935);
                            mi.field_B.a(hc.field_a, var4 - 180, var3 - -120, 0, 16711935);
                            de.a(var4 + 5, var3 + 105, 110, 15, 6, 16711935);
                            de.c(var4 + 5, 105 + var3, 110, 15, 6, 16711935, 64);
                            de.b(180 + var4 - -160, var3 - -102, var4 - -170, 102 + var3, 16776960);
                            de.b(40 + var4 - -125, 7 + (105 + var3), 170 + var4, 102 + var3, 16776960);
                            mi.field_B.c(oa.field_b, 180 + (var4 - -160), 100 + var3, 0, 16776960);
                            de.a(125 + var4, var3 + 105, 40, 15, 6, 16776960);
                            de.c(125 + var4, var3 - -105, 40, 15, 6, 16776960, 64);
                            var3 += 140;
                            var2 = tk.field_m;
                            var4 = bi.field_I + 64;
                            var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var4, var3, 512, 128, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                            var2 = tn.field_Kb;
                            var3 += 16;
                            var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var4, var3, 192, 128, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                            var12_int = 0;
                            var13_int = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 16;
                            var17 = 0;
                            var18 = -16;
                            var3 = 32;
                            var19 = 0;
                            var4 = 32;
                            var20 = new qb(128, 128);
                            var20.a();
                            de.i(64, 64, 32, 7829367);
                            gn.a(32, (byte) 62, 128, 64, 64);
                            pc.a(kg.field_d[2], var17 + var3, kg.field_d[3], kg.field_d[0], (byte) 118, kg.field_d[1], qe.field_i[so.field_c[3]], var4 + var16);
                            if (-47 != (so.field_c[0] ^ -1)) {
                              pc.a(kg.field_d[2], var3 - -var13_int, kg.field_d[3], kg.field_d[0], (byte) -123, kg.field_d[1], fn.field_b[0], var4 - -var12_int);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 109, kg.field_d[1], jd.field_j[so.field_c[0]], var4);
                            var3 -= 8;
                            var3 -= 16;
                            pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 47, kg.field_d[1], kc.field_kb[so.field_c[1]], var4);
                            var3 += 16;
                            pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], hn.field_d[so.field_c[5]], var4);
                            if (-54 == (so.field_c[5] ^ -1)) {
                              break L4;
                            } else {
                              if (-56 == (so.field_c[5] ^ -1)) {
                                break L4;
                              } else {
                                pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -90, kg.field_d[1], bo.field_a[0], var4);
                                break L4;
                              }
                            }
                          }
                          L5: {
                            var3 -= 16;
                            pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], tj.field_A[so.field_c[4]], var4);
                            var3 += 8;
                            var3 += 16;
                            if (46 == so.field_c[0]) {
                              break L5;
                            } else {
                              pc.a(kg.field_d[2], var3 + var15, kg.field_d[3], kg.field_d[0], (byte) -117, kg.field_d[1], h.field_I[0], var14 + var4);
                              break L5;
                            }
                          }
                          pc.a(kg.field_d[2], var3 - -var19, kg.field_d[3], kg.field_d[0], (byte) 20, kg.field_d[1], ea.field_u[so.field_c[2]], var4 + var18);
                          ce.field_m.a(true);
                          var21 = 320 + bi.field_I;
                          var22 = 350 + uc.field_a;
                          var20.b(var21, var22);
                          de.h(var21, 46 + var22, 64 + var21, an.field_j);
                          kh.field_d.a(var21 + -32, -92 + (10 + var22));
                          de.a();
                          mi.field_B.b("250", var21 + 32, var22 + 8, 16777215, -1);
                          break L2;
                        } else {
                          if (-6 != (var12_int ^ -1)) {
                            if (var12_int == 6) {
                              var2 = gl.field_a;
                              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                              var2 = hl.field_i;
                              var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 8);
                              var2 = jl.field_f;
                              var3 = var3 + (8 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                              var2 = nm.field_d;
                              var3 = var3 + (16 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5 + 32, var3, var6 + -64, 480, 16777215, 0, 1, 0, mi.field_B.field_m + mi.field_B.field_C)));
                              var2 = va.field_a;
                              var3 = var3 + (8 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                              break L2;
                            } else {
                              if ((var12_int ^ -1) == -8) {
                                L6: {
                                  var2 = db.field_d;
                                  if (ArcanistsMulti.i((byte) -99)) {
                                    var12_int = 74 + bi.field_I + tj.field_t.b(var2);
                                    ii.field_d.c(var12_int, -2 + var3, 32, 32);
                                    mi.field_B.a(kc.field_M, var12_int + 40, (mi.field_B.field_C + tj.field_t.field_C) / 2 + var3, 16711680, -1);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                var2 = nb.field_c;
                                var3 = var3 + (8 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
                                var2 = kl.field_F;
                                var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 6);
                                var11 = new int[]{16711935, 16711680, 16746632, 16776960, 65535, 34816, 16777215, 4521762, 1364125, 16755302};
                                var2 = uh.field_q;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                var2 = tj.a(-115, new String[]{Integer.toString(var11[1], 16)}, ve.field_s);
                                var3 = var3 + (2 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
                                var2 = ik.field_a;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                                var2 = tj.a(-51, new String[]{Integer.toString(var11[2], 16)}, ra.field_b);
                                var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                                var2 = field_p;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                var2 = tj.a(-116, new String[]{Integer.toString(var11[3], 16)}, hm.field_a);
                                var3 = var3 + (2 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                                var2 = pk.field_b;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                var2 = tj.a(-47, new String[]{Integer.toString(var11[4], 16)}, pc.field_a);
                                var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                                var2 = sl.field_M;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                var2 = tj.a(-120, new String[]{Integer.toString(var11[5], 16)}, di.field_b);
                                var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                                var2 = pb.field_l;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                                var2 = tj.a(122, new String[]{Integer.toString(var11[6], 16)}, go.field_f);
                                var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                                var2 = dk.field_f;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                                var2 = tj.a(-71, new String[]{Integer.toString(var11[7], 16)}, ra.field_e);
                                var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                                var2 = fg.field_i;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                                var2 = tj.a(113, new String[]{Integer.toString(var11[8], 16)}, fo.field_i);
                                var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                                var2 = mf.field_e;
                                mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                var2 = tj.a(-33, new String[]{Integer.toString(var11[9], 16)}, ie.field_Rb);
                                var3 = var3 + (6 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                                var2 = vn.field_a;
                                var3 = var3 + (8 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                                break L2;
                              } else {
                                if (var12_int == 8) {
                                  var2 = an.field_m;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  this.a(var3, var4, (byte) -102, 3);
                                  var2 = ne.field_j;
                                  mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                  var2 = na.field_Tb;
                                  var3 += 128;
                                  var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                  this.a(var3, var4, (byte) -77, 0);
                                  var2 = kn.field_pb;
                                  mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                  bb.field_g[5].c(var4, var3 + 80);
                                  break L2;
                                } else {
                                  if (-10 != (var12_int ^ -1)) {
                                    if (-11 == (var12_int ^ -1)) {
                                      var2 = oo.field_q;
                                      var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                                      this.a(var3, var4, (byte) -47, 4);
                                      var2 = sc.field_S;
                                      mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                      bb.field_g[29].c(var4, 120 + (-40 + var3));
                                      var2 = wn.field_A;
                                      var3 += 128;
                                      var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                      this.a(var3, var4, (byte) -86, 5);
                                      var2 = lm.field_d;
                                      mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                      bb.field_g[55].c(var4, 80 + var3);
                                      break L2;
                                    } else {
                                      if (-12 == (var12_int ^ -1)) {
                                        var2 = ck.field_c;
                                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                        this.a(var3, var4, (byte) -36, 6);
                                        var2 = qj.field_f;
                                        mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                        bb.field_g[67].c(var4, var3 + 80);
                                        var3 += 128;
                                        var2 = b.field_c;
                                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                        this.a(var3, var4, (byte) -42, 7);
                                        var2 = uh.field_l;
                                        mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                        bb.field_g[85].c(var4, 120 + (-40 + var3));
                                        break L2;
                                      } else {
                                        if (12 == var12_int) {
                                          var2 = lo.field_t;
                                          var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                          var2 = ao.field_b;
                                          var12 = new String[50];
                                          var13 = new int[]{480};
                                          var14 = mi.field_B.a(var2, var13, var12);
                                          var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                                          var24 = 0;
                                          var15 = var24;
                                          L7: while (true) {
                                            if (var14 <= var24) {
                                              break L2;
                                            } else {
                                              mi.field_B.a(var12[var24], var4, var3, 0, -1);
                                              stackIn_94_0 = var12[var24].length();

                                              stackIn_94_1 = 2;

                                              L8: {
                                                if (stackIn_94_0 <= stackIn_94_1) {
                                                  break L8;
                                                } else {
                                                  if (45 == var12[var24].charAt(1)) {
                                                    gj.field_f[0].a(-2 + var4, -12 + var3);
                                                    break L8;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                                              var24++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = rk.field_J;
                                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                    this.a(var3, var4, (byte) -49, 1);
                                    var2 = ah.field_e;
                                    mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                                    bb.field_g[17].c(var4, var3 + 80);
                                    var2 = hn.field_o;
                                    var3 += 128;
                                    var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                    this.a(var3, var4, (byte) -71, 2);
                                    var2 = dn.field_Bb;
                                    mi.field_B.a(var2, bi.field_I - -320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                                    bb.field_g[42].c(var4, 80 + var3);
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            L9: {
                              var2 = i.field_h;
                              if (ArcanistsMulti.i((byte) -92)) {
                                var12_int = bi.field_I + (74 + tj.field_t.b(var2));
                                ii.field_d.c(var12_int, -2 + var3, 32, 32);
                                mi.field_B.a(tk.field_o, 40 + var12_int, var3 + (tj.field_t.field_C - -mi.field_B.field_C) / 2, 16711680, -1);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                            var2 = km.field_b;
                            var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 8);
                            var2 = hh.field_a;
                            var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, 32 + var5, var3, 448, 480, 16777215, 0, 1, 0, mi.field_B.field_C - -mi.field_B.field_m) + 16);
                            var3 += 24;
                            var4 += 320;
                            var3 += 16;
                            de.h(0, var3, an.field_f, an.field_j);
                            fe.field_g.c(bi.field_I + 43, var3 - 32);
                            fe.field_g.c(106 + bi.field_I, -32 + var3);
                            de.a();
                            tg.field_b[7].a(var4, -2 + var3);
                            mi.field_B.a("= 1" + wn.field_x, 20 + var4, 20 + var3, 16776960, 0);
                            tg.field_b[8].a(var4 + 100, -2 + var3);
                            mi.field_B.a("= 5" + dk.field_g, 20 + var4 - -100, var3 - -20, 16776960, 0);
                            var2 = an.field_n;
                            var4 -= 320;
                            var2 = tj.a(127, new String[]{ji.field_l}, var2);
                            var3 -= 48;
                            var3 = var3 + (16 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 312, 480, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                            var3 += 48;
                            var3 += 24;
                            var2 = fo.field_j;
                            var3 -= 32;
                            rm.field_o[9].b(64 + bi.field_I, var3);
                            rm.field_o[2].b(bi.field_I + 64, var3);
                            tk.field_x[4].b(56 + bi.field_I, var3);
                            var3 += 16;
                            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, 136 + bi.field_I, var3, 440, an.field_j, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 16);
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    var2 = fj.field_g;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                    var2 = md.field_e;
                    var3 = var3 + (16 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
                    var2 = qm.field_l;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                    var2 = cc.field_b;
                    var2 = tj.a(118, new String[]{fn.field_g[84], fn.field_g[85], fn.field_g[82], fn.field_g[81]}, var2);
                    var3 = var3 + (16 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                    var2 = ch.field_e;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                    var2 = vf.field_p;
                    var2 = tj.a(124, new String[]{fn.field_g[69], fn.field_g[ao.field_f]}, var2);
                    var3 = var3 + (32 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
                    break L2;
                  }
                } else {
                  L10: {
                    var2 = wm.field_J;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 16);
                    var2 = nj.field_j;
                    var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
                    var2 = ud.field_u;
                    var3 = var3 + (16 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                    if (ArcanistsMulti.i((byte) -121)) {
                      stackIn_48_0 = cb.field_d;
                      break L10;
                    } else {
                      stackIn_48_0 = cn.field_J;
                      break L10;
                    }
                  }
                  var2 = stackIn_48_0;
                  var2 = tj.a(119, new String[]{ie.field_Lb, ji.field_l}, var2);
                  var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
                  var2 = fd.field_c;
                  var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 32);
                  break L2;
                }
              }
              stackIn_94_0 = param0;
              stackIn_94_1 = 71;
              break L1;
            }
            L11: {
              if (stackIn_94_0 >= stackIn_94_1) {
                break L11;
              } else {
                discarded$0 = this.g(-45, -88);
                break L11;
              }
            }
            tj.field_t.c(ul.a(fh.field_e, (byte) 69), 590 + bi.field_I, uc.field_a - -112, 0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.GA(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                lc.c(true);
                break L1;
              }
            }
            L2: {
              gi.field_c = param1;
              mf.field_c = param0;
              if (null == pm.field_e) {
                break L2;
              } else {
                pm.field_e.a(-120, param1, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if ((this.field_g.field_h ^ -1) != 0) {
                param1 = this.field_g.field_h;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-11 == (this.field_l ^ -1)) {
                param1 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_g.a(param0, param1, false, this.a((byte) 88, an.field_g, me.field_I));
              ke.field_K = -1;
              if (param2 < -113) {
                break L3;
              } else {
                field_r = (String) null;
                break L3;
              }
            }
            dd.field_g = -1;
            oj.field_e = jb.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackIn_621_0 = 0;
        int stackIn_728_0 = 0;
        int stackIn_728_1 = 0;
        int stackIn_732_0 = 0;
        int stackIn_732_1 = 0;
        int stackIn_781_0 = 0;
        int stackIn_781_1 = 0;
        int stackIn_785_0 = 0;
        int stackIn_785_1 = 0;
        int stackIn_839_0 = 0;
        int stackIn_839_1 = 0;
        int stackIn_843_0 = 0;
        int stackIn_843_1 = 0;
        int stackIn_862_0 = 0;
        int stackIn_862_1 = 0;
        int stackIn_866_0 = 0;
        int stackIn_866_1 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16_ref = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18_int = 0;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int[] var33 = null;
        int[] var34 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.c(-26733);
                    this.field_m = -1;
                    var3 = 142;
                    var4_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4_int >= 7) {
                        statePc = 18;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_6_0 = this;
                    stackIn_4_0 = stackIn_6_0;
                    if (this.field_h != var4_int) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (!this.a(stackIn_7_1 != 0, 65, (byte) -127, true, 32 + (bi.field_I + 86 * var4_int), 65, uc.field_a + 104)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var5 = stackIn_10_0;
                    mc.field_a[var4_int].c(86 * var4_int + (32 + bi.field_I), 104 + uc.field_a);
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-7 == (var4_int ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_i = var4_int;
                    this.field_m = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    this.field_m = 7;
                    var6 = -128 + (var4_int * 86 + 32 + bi.field_I);
                    var7 = 103 + (uc.field_a + -16);
                    mi.field_B.a(nj.field_l, var6, var7 - 1, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a(nj.field_l, var6 + -1, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a(nj.field_l, 1 + var6, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a(nj.field_l, var6, 1 + var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a(nj.field_l, var6, var7, 192, 192, 16777215, 0, 1, 0, mi.field_B.field_C);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var4_int++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 18: {
                    var4 = null;
                    if (0 != this.field_h) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var4 = jd.field_j;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-2 != (this.field_h ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = kc.field_kb;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (2 == this.field_h) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var4 = ea.field_u;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((this.field_h ^ -1) == -4) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = qe.field_i;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_h ^ -1) != -5) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var4 = tj.field_A;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (-6 == (this.field_h ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var4 = hn.field_d;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    discarded$0 = this.a(true, 180, (byte) -106, false, bi.field_I + 32, 114, 182 + uc.field_a);
                    var3 = 210 + uc.field_a;
                    var2_int = bi.field_I + 90;
                    var13 = -1;
                    var14 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (4 < var14) {
                        statePc = 50;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_51_0 = 12;
                    stackIn_39_0 = stackIn_51_0;
                    stackIn_51_1 = b.field_f[var14];
                    stackIn_39_1 = stackIn_51_1;
                    if (false) {
                        statePc = 51;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 > stackIn_39_1) {
                        statePc = 49;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (0 != b.field_f[var14] % 12) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (b.field_f[11 + var14] != 11 + b.field_f[var14]) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var13 = b.field_f[var14] / 12 - 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var14++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = var13;
                    stackIn_51_1 = -1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if ((stackIn_51_0 ^ stackIn_51_1) == 0) {
                        statePc = 112;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var2_int -= 40;
                    var14 = 0;
                    var15 = 0;
                    var16_ref = null;
                    if (0 == var13) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var15 = 1;
                    var16_ref = lf.field_c;
                    var14 = 1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if ((var13 ^ -1) == -2) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var16_ref = tf.field_j;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var13 != 2) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var16_ref = ij.field_Pb;
                    var15 = 1;
                    var14 = 1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((var13 ^ -1) != -4) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var16_ref = fo.field_g;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (-5 == (var13 ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var16_ref = fc.field_e;
                    var14 = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (5 != var13) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var14 = 1;
                    var15 = 1;
                    var16_ref = ji.field_h;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var13 == 6) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var16_ref = rc.field_k;
                    var14 = 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (7 == var13) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var16_ref = eo.field_a;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if ((var13 ^ -1) != -9) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var15 = 1;
                    var14 = 1;
                    var16_ref = ae.field_a;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var14 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var17_int = var2_int;
                    var18_int = var3;
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    var24 = 0;
                    var25 = 0;
                    var26 = 0;
                    var27 = (int)(8.0 * Math.cos(this.field_f * 2.0));
                    var28 = (int)(Math.sin(2.0 * this.field_f) * 8.0);
                    if (var27 <= 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var22 = -var27;
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    var22 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var21 = var28;
                    if ((var27 ^ -1) > -1) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var26 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 86: {
                    var26 = var27;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var25 = -var28;
                    var24 = -(var28 >> -882302462);
                    var26 += 2;
                    var23 = -6 + -(var27 >> 692979265);
                    var20 = var28 >> 613862466;
                    var19 = 6 + (var27 >> 1114345761);
                    var22 -= 2;
                    var29 = 0;
                    if (var15 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var30 = -5;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (5 < var30) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var31 = (int)(2.0 * Math.sqrt((double)(-(var30 * var30) + 25)));
                    de.e(-var31 + (var2_int + 32), var30 + (var3 - -64), var31 * 2, 0, 128);
                    var30++;
                    statePc = 89;
                    continue stateLoop;
                }
                case 92: {
                    var29 = var29 + ((int)(4.0 * Math.sin(this.field_f)) + 32);
                    statePc = 97;
                    continue stateLoop;
                }
                case 93: {
                    var30 = -8;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if ((var30 ^ -1) < -9) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var31 = (int)(Math.sqrt((double)(-(var30 * var30) + 64)) * 2.0);
                    de.e(32 + (var2_int + -var31), 64 + var3 - -var30, var31 * 2, 0, 128);
                    var30++;
                    statePc = 94;
                    continue stateLoop;
                }
                case 97: {
                    var2_int += 20;
                    var3 += 40;
                    var3 = var3 - var29;
                    pc.a(kg.field_d[2], var20 + var3, kg.field_d[3], kg.field_d[0], (byte) -82, kg.field_d[1], (qb) (((Object[]) (var16_ref))[5]), var19 + var2_int);
                    pc.a(kg.field_d[2], var3 + var22, kg.field_d[3], kg.field_d[0], (byte) -105, kg.field_d[1], (qb) (((Object[]) (var16_ref))[4]), var21 + var2_int);
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], (qb) (((Object[]) (var16_ref))[3]), var2_int);
                    var3 -= 3;
                    var3 -= 6;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -77, kg.field_d[1], (qb) (((Object[]) (var16_ref))[2]), var2_int);
                    var3 += 6;
                    var3 -= 6;
                    var3 += 3;
                    var3 += 6;
                    pc.a(kg.field_d[2], var26 + var3, kg.field_d[3], kg.field_d[0], (byte) 51, kg.field_d[1], (qb) (((Object[]) (var16_ref))[1]), var2_int - -var25);
                    pc.a(kg.field_d[2], var24 + var3, kg.field_d[3], kg.field_d[0], (byte) 37, kg.field_d[1], (qb) (((Object[]) (var16_ref))[0]), var23 + var2_int);
                    var2_int = var17_int;
                    var3 = var18_int;
                    statePc = 111;
                    continue stateLoop;
                }
                case 98: {
                    if (var15 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var17_int = -8;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var17_int > 8) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var18_int = (int)(2.0 * Math.sqrt((double)(64 - var17_int * var17_int)));
                    de.e(32 + (var2_int + -var18_int), 64 + (var17_int + var3), var18_int * 2, 0, 128);
                    var17_int++;
                    statePc = 102;
                    continue stateLoop;
                }
                case 105: {
                    var17_int = fo.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                    pc.a(kg.field_d[2], var3 + -((qb) (((Object[]) (var16_ref))[var17_int])).field_w - (-32 - -(int)(Math.sin(this.field_f) * 4.0)), kg.field_d[3], kg.field_d[0], (byte) 100, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                    statePc = 111;
                    continue stateLoop;
                }
                case 106: {
                    var17_int = -12;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (-13 > (var17_int ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var18_int = (int)(Math.sqrt((double)(144 + -(var17_int * var17_int))) * 2.0);
                    de.e(-var18_int + (var2_int + 32), var3 + var17_int + 64, 2 * var18_int, 0, 128);
                    var17_int++;
                    statePc = 107;
                    continue stateLoop;
                }
                case 110: {
                    var17_int = fo.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                    pc.a(kg.field_d[2], 64 + -((qb) (((Object[]) (var16_ref))[var17_int])).field_w + var3, kg.field_d[3], kg.field_d[0], (byte) 117, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var2_int += 64;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var14 = -16;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var14 > 16) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var15 = (int)(Math.sqrt((double)(256 - var14 * var14)) * 2.0);
                    de.e(-var15 + (var2_int - -32), 64 + (var14 + var3), var15 * 2, 0, 128);
                    var14++;
                    statePc = 113;
                    continue stateLoop;
                }
                case 116: {
                    if (6.28 >= this.field_f) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_f = this.field_f - 6.28;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (0.0 <= this.field_f) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    this.field_f = this.field_f + 6.28;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    var14 = (int)(Math.cos(this.field_f) * 16.0);
                    var15 = (int)(16.0 * Math.sin(this.field_f));
                    var5 = -var15;
                    var6 = var15;
                    if ((var14 ^ -1) >= -1) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var8 = -var14;
                    statePc = 125;
                    continue stateLoop;
                }
                case 124: {
                    var8 = 0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (var14 < 0) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var7 = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    var7 = var14;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var10 = 16 + (var14 >> 960548385);
                    var11 = -(var15 >> -581740510);
                    var12 = var15 >> -304914974;
                    var9 = -(var14 >> -1972095295) + -16;
                    var8 -= 2;
                    var7 += 2;
                    var16 = -ea.field_u[so.field_c[2]].field_o + (-ea.field_u[so.field_c[2]].field_y + ea.field_u[so.field_c[2]].field_w);
                    if (var11 > var16) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var11 = var16;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var16 = -qe.field_i[so.field_c[3]].field_o - qe.field_i[so.field_c[3]].field_y + qe.field_i[so.field_c[3]].field_w;
                    if (var16 < var12) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var12 = var16;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var34 = new int[6];
                    var33 = var34;
                    var17 = var33;
                    var18_int = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (-7 >= (var18_int ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var17[var18_int] = so.field_c[var18_int];
                    var18_int++;
                    statePc = 137;
                    continue stateLoop;
                }
                case 140: {
                    pc.a(kg.field_d[2], var12 + var3, kg.field_d[3], kg.field_d[0], (byte) -121, kg.field_d[1], qe.field_i[so.field_c[3]], var2_int + var10);
                    if (46 != so.field_c[0]) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    pc.a(kg.field_d[2], var8 + var3, kg.field_d[3], kg.field_d[0], (byte) 105, kg.field_d[1], fn.field_b[0], var6 + var2_int);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], jd.field_j[so.field_c[0]], var2_int);
                    var3 -= 8;
                    var3 -= 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], kc.field_kb[so.field_c[1]], var2_int);
                    var3 += 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], hn.field_d[so.field_c[5]], var2_int);
                    if ((so.field_c[5] ^ -1) == -54) {
                        statePc = 150;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (so.field_c[5] != 55) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], bo.field_a[0], var2_int);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var3 -= 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -109, kg.field_d[1], tj.field_A[so.field_c[4]], var2_int);
                    var3 += 8;
                    var3 += 16;
                    if (46 == so.field_c[0]) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    pc.a(kg.field_d[2], var3 + var7, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], h.field_I[0], var2_int + var5);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    pc.a(kg.field_d[2], var11 + var3, kg.field_d[3], kg.field_d[0], (byte) -95, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var2_int);
                    var18_int = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-7 >= (var18_int ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    so.field_c[var18_int] = var34[var18_int];
                    var18_int++;
                    statePc = 154;
                    continue stateLoop;
                }
                case 157: {
                    if ((this.field_n ^ -1) >= -1) {
                        statePc = 174;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if ((bi.field_I - -225 ^ -1) < (an.field_g ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if ((an.field_g ^ -1) <= (to.field_q.field_n + bi.field_I - -225 ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if ((me.field_I ^ -1) > (uc.field_a - -182 ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if ((me.field_I ^ -1) <= (to.field_q.field_w + (uc.field_a - -182) ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 16777215);
                    to.field_q.c(bi.field_I + 225, 182 + uc.field_a, 128);
                    this.field_i = -3;
                    this.field_m = 6;
                    statePc = 177;
                    continue stateLoop;
                }
                case 172: {
                    to.field_q.c(225 + bi.field_I, uc.field_a + 182);
                    statePc = 177;
                    continue stateLoop;
                }
                case 174: {
                    to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 0);
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    to.field_q.c(225 + bi.field_I, uc.field_a - -182, 128);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (this.field_n >= -27 + mb.a(this.field_h, 813231272)) {
                        statePc = 189;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (mi.a(to.field_q.field_w, uc.field_a - -182, to.field_q.field_n, param0 ^ -12, 590 + bi.field_I)) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    to.field_q.e(bi.field_I - -590, uc.field_a - -182);
                    statePc = 191;
                    continue stateLoop;
                }
                case 183: {
                    if (this.field_b == null) {
                        statePc = 187;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 187: {
                    this.field_b = to.field_q.b();
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    this.field_b.a(bi.field_I - -590, 182 + uc.field_a, 16777215);
                    this.field_b.c(bi.field_I - -590, uc.field_a - -182, 128);
                    this.field_i = 3;
                    this.field_m = 6;
                    statePc = 191;
                    continue stateLoop;
                }
                case 189: {
                    this.field_b.a(590 + bi.field_I, uc.field_a + 182, 0);
                    this.field_b.c(590 + bi.field_I, 182 + uc.field_a, 128);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    discarded$1 = this.a(false, 330, (byte) -24, false, bi.field_I + 254, 114, 182 + uc.field_a);
                    if (var4 != null) {
                        statePc = 194;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var18_int = mb.a(this.field_h, 813231272);
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (0 <= this.field_n) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_n = this.field_n + var18_int;
                    statePc = 195;
                    continue stateLoop;
                }
                case 198: {
                    if ((var18_int ^ -1) < (this.field_n ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    this.field_n = this.field_n - var18_int;
                    statePc = 198;
                    continue stateLoop;
                }
                case 200: {
                    var18 = null;
                    var19 = 0;
                    var20 = 0;
                    var3 = uc.field_a + 188;
                    var2_int = 264 + bi.field_I;
                    if (param0 == 12) {
                        statePc = 203;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    discarded$2 = this.a((byte) 5, -89);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var21 = this.field_n;
                    var22 = 35;
                    var23 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    stackIn_205_0 = var23;
                    stackIn_205_1 = 9;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (stackIn_205_0 >= stackIn_205_1) {
                        statePc = 674;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var24 = 0;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (-4 >= (var24 ^ -1)) {
                        statePc = 673;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    stackIn_205_0 = mb.a(this.field_h, 813231272);
                    stackIn_209_0 = stackIn_205_0;
                    stackIn_205_1 = var21;
                    stackIn_209_1 = stackIn_205_1;
                    if (false) {
                        statePc = 205;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (stackIn_209_0 <= stackIn_209_1) {
                        statePc = 672;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    de.a(-1 + (var22 * var23 + var2_int), var24 * var22 + var3 - 1, 34, 34, 8745077);
                    de.a(var2_int - -(var22 * var23), var3 + var24 * var22, 32, 32, 5720140);
                    var25 = 14207693;
                    var26 = 0;
                    var27 = -1;
                    var28 = 64;
                    var29 = -1;
                    if (this.field_h != 0) {
                        statePc = 322;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var28 = 48;
                    if (12 > var21) {
                        statePc = 217;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (-16 < (var21 ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if ((var21 ^ -1) > -16) {
                        statePc = 222;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var21 >= 18) {
                        statePc = 222;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var27 = 1;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if ((var21 ^ -1) > -19) {
                        statePc = 228;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (var21 < 21) {
                        statePc = 227;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var27 = 2;
                    var25 = var25 + 2105376;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if ((var21 ^ -1) > -22) {
                        statePc = 234;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (-25 < (var21 ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var27 = 3;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (-25 < (var21 ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (var21 < 27) {
                        statePc = 239;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var25 = var25 + 2105376;
                    var27 = 4;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    if ((var21 ^ -1) > -28) {
                        statePc = 246;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (30 > var21) {
                        statePc = 245;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var27 = 5;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (-31 == (var21 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (33 == var21) {
                        statePc = 251;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var25 = var25 + 2105376;
                    var27 = 6;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (31 == var21) {
                        statePc = 257;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (var21 == 34) {
                        statePc = 257;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var27 = 7;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (-33 == (var21 ^ -1)) {
                        statePc = 262;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (var21 != 35) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var25 = var25 + 2105376;
                    var27 = 8;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (-37 == (var21 ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (var21 == 39) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var27 = 9;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (-38 == (var21 ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (-41 == (var21 ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var27 = 10;
                    var25 = var25 + 2105376;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    if (38 == var21) {
                        statePc = 280;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (var21 == 41) {
                        statePc = 280;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var27 = 11;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (-43 == (var21 ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (-46 != (var21 ^ -1)) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var27 = 16;
                    var25 = var25 + 2105376;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (-44 == (var21 ^ -1)) {
                        statePc = 291;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (-47 == (var21 ^ -1)) {
                        statePc = 291;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var27 = 17;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (44 != var21) {
                        statePc = 294;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var25 = var25 + 2105376;
                    var27 = 26;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (-48 != (var21 ^ -1)) {
                        statePc = 296;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    var27 = 28;
                    var25 = var25 + 2105376;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (var21 != 48) {
                        statePc = 298;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if (-50 == (var21 ^ -1)) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (50 == var21) {
                        statePc = 305;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var25 = var25 + 2105376;
                    var29 = 1;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if ((var21 ^ -1) != -52) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var29 = 2;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if ((var21 ^ -1) != -53) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var29 = 2;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (-54 == (var21 ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var29 = 2;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (54 != var21) {
                        statePc = 316;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var27 = 55;
                    var25 = var25 + 2105376;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (-56 != (var21 ^ -1)) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var25 = var25 + 2105376;
                    var27 = 55;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if ((var21 ^ -1) == -57) {
                        statePc = 321;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var27 = 55;
                    var25 = var25 + 2105376;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if ((this.field_h ^ -1) != -3) {
                        statePc = 402;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var28 = 48;
                    if (-13 < (var21 ^ -1)) {
                        statePc = 328;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if ((var21 ^ -1) <= -16) {
                        statePc = 328;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var25 = var25 + 2105376;
                    var27 = 0;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (-16 < (var21 ^ -1)) {
                        statePc = 333;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (18 <= var21) {
                        statePc = 333;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var27 = 1;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (var21 < 18) {
                        statePc = 339;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (21 > var21) {
                        statePc = 338;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var27 = 2;
                    var25 = var25 + 2105376;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if (var21 < 21) {
                        statePc = 344;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if ((var21 ^ -1) <= -25) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var27 = 3;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (-25 < (var21 ^ -1)) {
                        statePc = 350;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (27 > var21) {
                        statePc = 349;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var27 = 4;
                    var25 = var25 + 2105376;
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    if (var21 < 27) {
                        statePc = 356;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    if (var21 < 30) {
                        statePc = 355;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var27 = 5;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (var21 == 30) {
                        statePc = 360;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (-34 != (var21 ^ -1)) {
                        statePc = 361;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (-32 == (var21 ^ -1)) {
                        statePc = 365;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if ((var21 ^ -1) != -35) {
                        statePc = 366;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    var27 = 7;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    if (var21 == 32) {
                        statePc = 371;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    if (-36 == (var21 ^ -1)) {
                        statePc = 371;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var27 = 8;
                    var25 = var25 + 2105376;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if (-37 == (var21 ^ -1)) {
                        statePc = 377;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (var21 == 39) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    var27 = 9;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    switch (var21) {
                        case 37: statePc = -1; break;
                        case 40: statePc = -1; break;
                        case 38: statePc = -1; break;
                        case 41: statePc = -1; break;
                        case 42: statePc = -1; break;
                        case 45: statePc = -1; break;
                        case 43: statePc = 381; break;
                        case 46: statePc = 381; break;
                        default: statePc = 382; break;
                    }
                    continue stateLoop;
                }
                case 381: {
                    var27 = 17;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (-45 == (var21 ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var27 = 26;
                    var25 = var25 + 2105376;
                    statePc = 386;
                    continue stateLoop;
                }
                case 386: {
                    if (-48 != (var21 ^ -1)) {
                        statePc = 388;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    var25 = var25 + 2105376;
                    var27 = 28;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (48 != var21) {
                        statePc = 390;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if (49 != var21) {
                        statePc = 392;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 392;
                    continue stateLoop;
                }
                case 392: {
                    if (50 != var21) {
                        statePc = 394;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if ((var21 ^ -1) != -52) {
                        statePc = 396;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    var29 = 2;
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if (var21 == 52) {
                        statePc = 399;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var29 = 2;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if (-54 != (var21 ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var29 = 2;
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    if (this.field_h == 3) {
                        statePc = 405;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (-13 < (var21 ^ -1)) {
                        statePc = 411;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (-16 < (var21 ^ -1)) {
                        statePc = 410;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    var28 = 48;
                    if ((var21 ^ -1) > -16) {
                        statePc = 416;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (var21 >= 18) {
                        statePc = 416;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    var27 = 1;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    if (-19 < (var21 ^ -1)) {
                        statePc = 422;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if ((var21 ^ -1) > -22) {
                        statePc = 421;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var25 = var25 + 2105376;
                    var27 = 2;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (var21 < 21) {
                        statePc = 428;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if (24 > var21) {
                        statePc = 427;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var27 = 3;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if (var21 < 24) {
                        statePc = 434;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if ((var21 ^ -1) > -28) {
                        statePc = 433;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 433: {
                    var27 = 4;
                    var25 = var25 + 2105376;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if ((var21 ^ -1) > -28) {
                        statePc = 439;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if (-31 >= (var21 ^ -1)) {
                        statePc = 439;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var27 = 5;
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    if (var21 == 30) {
                        statePc = 444;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    if (-34 == (var21 ^ -1)) {
                        statePc = 444;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 444: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 445;
                    continue stateLoop;
                }
                case 445: {
                    if (var21 == 31) {
                        statePc = 450;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (34 == var21) {
                        statePc = 450;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 450: {
                    var27 = 7;
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    if (-33 == (var21 ^ -1)) {
                        statePc = 456;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    if ((var21 ^ -1) == -36) {
                        statePc = 456;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 456: {
                    var27 = 8;
                    var25 = var25 + 2105376;
                    statePc = 457;
                    continue stateLoop;
                }
                case 457: {
                    switch (var21) {
                        case 36: statePc = -1; break;
                        case 39: statePc = -1; break;
                        case 37: statePc = -1; break;
                        case 40: statePc = -1; break;
                        case 38: statePc = -1; break;
                        case 41: statePc = -1; break;
                        case 42: statePc = 460; break;
                        case 45: statePc = 460; break;
                        default: statePc = 461; break;
                    }
                    continue stateLoop;
                }
                case 460: {
                    var25 = var25 + 2105376;
                    var27 = 16;
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    if (var21 == 43) {
                        statePc = 466;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    if ((var21 ^ -1) == -47) {
                        statePc = 466;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var27 = 17;
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    if (var21 == 44) {
                        statePc = 470;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 470: {
                    var27 = 26;
                    var25 = var25 + 2105376;
                    statePc = 471;
                    continue stateLoop;
                }
                case 471: {
                    if ((var21 ^ -1) == -48) {
                        statePc = 474;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 474: {
                    var25 = var25 + 2105376;
                    var27 = 28;
                    statePc = 475;
                    continue stateLoop;
                }
                case 475: {
                    if (var21 == 48) {
                        statePc = 478;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 478: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    if (-50 != (var21 ^ -1)) {
                        statePc = 481;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 481;
                    continue stateLoop;
                }
                case 481: {
                    if (50 != var21) {
                        statePc = 483;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 483;
                    continue stateLoop;
                }
                case 483: {
                    if (-52 != (var21 ^ -1)) {
                        statePc = 485;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    var29 = 2;
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    if (var21 != 52) {
                        statePc = 487;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var29 = 2;
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    if (-54 != (var21 ^ -1)) {
                        statePc = 489;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 488: {
                    var29 = 2;
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    if (1 == this.field_h) {
                        statePc = 492;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 492: {
                    var28 = 54;
                    statePc = 493;
                    continue stateLoop;
                }
                case 493: {
                    if (4 == this.field_h) {
                        statePc = 496;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (42 == var21) {
                        statePc = 499;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 499: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 500;
                    continue stateLoop;
                }
                case 500: {
                    var28 = 66;
                    if (var21 == 43) {
                        statePc = 503;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 503: {
                    var27 = 1;
                    statePc = 504;
                    continue stateLoop;
                }
                case 504: {
                    if (-45 != (var21 ^ -1)) {
                        statePc = 506;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var25 = var25 + 2105376;
                    var27 = 2;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    if ((var21 ^ -1) != -46) {
                        statePc = 508;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    var27 = 3;
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    if (46 == var21) {
                        statePc = 511;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 511: {
                    var25 = var25 + 2105376;
                    var27 = 4;
                    statePc = 512;
                    continue stateLoop;
                }
                case 512: {
                    if (47 == var21) {
                        statePc = 515;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 515: {
                    var27 = 5;
                    statePc = 516;
                    continue stateLoop;
                }
                case 516: {
                    if ((var21 ^ -1) == -49) {
                        statePc = 521;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    if ((var21 ^ -1) == -52) {
                        statePc = 521;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 521: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    if ((var21 ^ -1) == -50) {
                        statePc = 527;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    if (-53 == (var21 ^ -1)) {
                        statePc = 527;
                    } else {
                        statePc = 528;
                    }
                    continue stateLoop;
                }
                case 527: {
                    var27 = 7;
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (var21 == 50) {
                        statePc = 532;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if (53 != var21) {
                        statePc = 533;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    var25 = var25 + 2105376;
                    var27 = 8;
                    statePc = 533;
                    continue stateLoop;
                }
                case 533: {
                    if ((var21 ^ -1) == -55) {
                        statePc = 538;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (-58 == (var21 ^ -1)) {
                        statePc = 538;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 538: {
                    var27 = 9;
                    statePc = 539;
                    continue stateLoop;
                }
                case 539: {
                    if (var21 == 55) {
                        statePc = 543;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (-59 != (var21 ^ -1)) {
                        statePc = 544;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var25 = var25 + 2105376;
                    var27 = 10;
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    if (56 == var21) {
                        statePc = 548;
                    } else {
                        statePc = 545;
                    }
                    continue stateLoop;
                }
                case 545: {
                    if ((var21 ^ -1) != -60) {
                        statePc = 549;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    var27 = 11;
                    statePc = 549;
                    continue stateLoop;
                }
                case 549: {
                    if (-61 == (var21 ^ -1)) {
                        statePc = 554;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    if (var21 == 63) {
                        statePc = 554;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 554: {
                    var27 = 16;
                    var25 = var25 + 2105376;
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    if (var21 == 61) {
                        statePc = 560;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    if (var21 == 64) {
                        statePc = 560;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 560: {
                    var27 = 17;
                    statePc = 561;
                    continue stateLoop;
                }
                case 561: {
                    if ((var21 ^ -1) != -63) {
                        statePc = 563;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    var27 = 27;
                    var25 = var25 + 2105376;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    if (65 != var21) {
                        statePc = 565;
                    } else {
                        statePc = 564;
                    }
                    continue stateLoop;
                }
                case 564: {
                    var27 = 29;
                    var25 = var25 + 2105376;
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    if (var21 != 66) {
                        statePc = 567;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 567;
                    continue stateLoop;
                }
                case 567: {
                    if (-68 != (var21 ^ -1)) {
                        statePc = 569;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 569;
                    continue stateLoop;
                }
                case 569: {
                    if (var21 != 68) {
                        statePc = 571;
                    } else {
                        statePc = 570;
                    }
                    continue stateLoop;
                }
                case 570: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    if (69 == var21) {
                        statePc = 574;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 574: {
                    var29 = 2;
                    statePc = 575;
                    continue stateLoop;
                }
                case 575: {
                    if ((var21 ^ -1) == -71) {
                        statePc = 578;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 578: {
                    var29 = 2;
                    statePc = 579;
                    continue stateLoop;
                }
                case 579: {
                    if (71 == var21) {
                        statePc = 582;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 582: {
                    var29 = 2;
                    statePc = 583;
                    continue stateLoop;
                }
                case 583: {
                    if (-6 == (this.field_h ^ -1)) {
                        statePc = 586;
                    } else {
                        statePc = 614;
                    }
                    continue stateLoop;
                }
                case 586: {
                    var28 = 51;
                    if ((var21 ^ -1) != -49) {
                        statePc = 588;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    var25 = var25 + 2105376;
                    var27 = 27;
                    statePc = 588;
                    continue stateLoop;
                }
                case 588: {
                    if (49 != var21) {
                        statePc = 590;
                    } else {
                        statePc = 589;
                    }
                    continue stateLoop;
                }
                case 589: {
                    var27 = 29;
                    var25 = var25 + 2105376;
                    statePc = 590;
                    continue stateLoop;
                }
                case 590: {
                    if ((var21 ^ -1) != -51) {
                        statePc = 592;
                    } else {
                        statePc = 591;
                    }
                    continue stateLoop;
                }
                case 591: {
                    var27 = 30;
                    var25 = var25 + 2105376;
                    statePc = 592;
                    continue stateLoop;
                }
                case 592: {
                    if (-52 == (var21 ^ -1)) {
                        statePc = 595;
                    } else {
                        statePc = 596;
                    }
                    continue stateLoop;
                }
                case 595: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 596;
                    continue stateLoop;
                }
                case 596: {
                    if (52 == var21) {
                        statePc = 599;
                    } else {
                        statePc = 600;
                    }
                    continue stateLoop;
                }
                case 599: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 600;
                    continue stateLoop;
                }
                case 600: {
                    if (53 != var21) {
                        statePc = 602;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 602;
                    continue stateLoop;
                }
                case 602: {
                    if (var21 == 54) {
                        statePc = 605;
                    } else {
                        statePc = 606;
                    }
                    continue stateLoop;
                }
                case 605: {
                    var29 = 2;
                    statePc = 606;
                    continue stateLoop;
                }
                case 606: {
                    if (-56 == (var21 ^ -1)) {
                        statePc = 609;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 609: {
                    var29 = 2;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    if (56 == var21) {
                        statePc = 613;
                    } else {
                        statePc = 614;
                    }
                    continue stateLoop;
                }
                case 613: {
                    var29 = 2;
                    statePc = 614;
                    continue stateLoop;
                }
                case 614: {
                    if ((var27 ^ -1) != 0) {
                        statePc = 617;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 617: {
                    var30 = var27 >> -418342139;
                    var31 = -(var30 << -821304027) + var27;
                    if ((ad.field_f[var30] & 1 << var31) != 0) {
                        statePc = 620;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    stackIn_621_0 = 1;
                    statePc = 621;
                    continue stateLoop;
                }
                case 620: {
                    stackIn_621_0 = 0;
                    statePc = 621;
                    continue stateLoop;
                }
                case 621: {
                    var26 = stackIn_621_0;
                    statePc = 622;
                    continue stateLoop;
                }
                case 622: {
                    if (0 == (var29 ^ -1)) {
                        statePc = 628;
                    } else {
                        statePc = 623;
                    }
                    continue stateLoop;
                }
                case 623: {
                    if (!this.g(var29, 0)) {
                        statePc = 627;
                    } else {
                        statePc = 628;
                    }
                    continue stateLoop;
                }
                case 627: {
                    var26 = 1;
                    statePc = 628;
                    continue stateLoop;
                }
                case 628: {
                    de.d(var2_int - -(var22 * var23) + 1, var22 * var24 + var3 - -1, 30, 30, var25);
                    if (var21 == so.field_c[this.field_h]) {
                        statePc = 631;
                    } else {
                        statePc = 632;
                    }
                    continue stateLoop;
                }
                case 631: {
                    de.d(1 + var2_int + var23 * var22, var3 + var22 * var24 + 1, 30, 30, 16711935 | var25);
                    statePc = 632;
                    continue stateLoop;
                }
                case 632: {
                    if ((var28 ^ -1) < (var21 ^ -1)) {
                        statePc = 639;
                    } else {
                        statePc = 633;
                    }
                    continue stateLoop;
                }
                case 633: {
                    if (var26 == 0) {
                        statePc = 639;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    if (-1 == var27) {
                        statePc = 646;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 639: {
                    if (var26 != 0) {
                        statePc = 644;
                    } else {
                        statePc = 642;
                    }
                    continue stateLoop;
                }
                case 642: {
                    ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_x / 2) + (var23 * var22 + var2_int) - (-16 + ((qb) (((Object[]) (var4))[var21])).field_q / 4), -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (16 + var3) + var22 * var24 + -(((qb) (((Object[]) (var4))[var21])).field_o / 2), 32, 32);
                    statePc = 648;
                    continue stateLoop;
                }
                case 644: {
                    de.d(1 + (var22 * var23 + var2_int), 1 + var22 * var24 + var3, 30, 30, 9996941);
                    ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + 16 + var2_int + var23 * var22 + -(((qb) (((Object[]) (var4))[var21])).field_x / 2), -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (-(((qb) (((Object[]) (var4))[var21])).field_o / 2) + var3) - (-(var24 * var22) - 16), 32, 32);
                    de.e(var2_int + var22 * var23 + 1, var3 + (var22 * var24 - -1), 30, 30, 0, 192);
                    vd.field_b.b(var2_int + var22 * var23 + 20, var24 * var22 + var3 - -20, 12, 12);
                    statePc = 648;
                    continue stateLoop;
                }
                case 646: {
                    de.d(1 + var23 * var22 + var2_int, var3 - -(var22 * var24) + 1, 30, 30, 9996941);
                    ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + (16 + var22 * var23) + var2_int - ((qb) (((Object[]) (var4))[var21])).field_x / 2, -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + var3 + (var24 * var22 + (16 - ((qb) (((Object[]) (var4))[var21])).field_o / 2)), 32, 32);
                    de.e(var2_int - -(var22 * var23) - -1, 1 + (var3 + var24 * var22), 30, 30, 0, 192);
                    di.field_d.b(20 + (var2_int - -(var22 * var23)), 20 + (var3 + var22 * var24), 12, 12);
                    statePc = 648;
                    continue stateLoop;
                }
                case 648: {
                    if (-3 < (qf.field_d ^ -1)) {
                        statePc = 650;
                    } else {
                        statePc = 649;
                    }
                    continue stateLoop;
                }
                case 649: {
                    var26 = 0;
                    statePc = 650;
                    continue stateLoop;
                }
                case 650: {
                    if ((var2_int + var23 * var22 ^ -1) < (an.field_g ^ -1)) {
                        statePc = 672;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 651: {
                    if ((an.field_g ^ -1) <= (32 + var2_int + var22 * var23 ^ -1)) {
                        statePc = 672;
                    } else {
                        statePc = 654;
                    }
                    continue stateLoop;
                }
                case 654: {
                    if ((me.field_I ^ -1) > (var22 * var24 + var3 ^ -1)) {
                        statePc = 672;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    if (me.field_I >= var3 + var24 * var22 + 32) {
                        statePc = 672;
                    } else {
                        statePc = 660;
                    }
                    continue stateLoop;
                }
                case 660: {
                    gn.a(15, (byte) 101, 128, var2_int - (1 + (-(var23 * var22) - 17)), var24 * var22 + (var3 - -16));
                    this.field_i = var21;
                    this.field_m = 0;
                    if (var26 == 0) {
                        statePc = 665;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 663: {
                    this.field_m = 8;
                    statePc = 665;
                    continue stateLoop;
                }
                case 665: {
                    if (var26 != 0) {
                        statePc = 668;
                    } else {
                        statePc = 672;
                    }
                    continue stateLoop;
                }
                case 668: {
                    var19 = var23;
                    if (var29 == -1) {
                        statePc = 670;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    var18 = vg.field_n;
                    statePc = 671;
                    continue stateLoop;
                }
                case 670: {
                    var18 = tj.a(123, new String[]{rb.field_n[var27]}, kl.field_y);
                    statePc = 671;
                    continue stateLoop;
                }
                case 671: {
                    var20 = var24;
                    statePc = 672;
                    continue stateLoop;
                }
                case 672: {
                    var21++;
                    var24++;
                    statePc = 207;
                    continue stateLoop;
                }
                case 673: {
                    var23++;
                    statePc = 204;
                    continue stateLoop;
                }
                case 674: {
                    if (var18 != null) {
                        statePc = 677;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 677: {
                    mi.field_B.a((String) (var18), 96 + var19 * var22 + (var2_int + -256), var22 * var20 + (var3 + -1) - 16, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a((String) (var18), 96 + (-1 + (var19 * var22 + (var2_int + -256))), -16 + (var3 + var22 * var20), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a((String) (var18), 97 + (var2_int + var22 * var19) + -256, -16 + var22 * var20 + var3, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a((String) (var18), -256 + (var2_int - -(var19 * var22)) - -96, var22 * var20 + (var3 + -15), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    mi.field_B.a((String) (var18), -160 + var2_int - -(var22 * var19), -16 + (var3 - -(var22 * var20)), 256, 64, 16777215, 0, 1, 0, mi.field_B.field_C);
                    statePc = 678;
                    continue stateLoop;
                }
                case 678: {
                    discarded$3 = this.a(false, 180, (byte) 111, false, bi.field_I + 32, 98, 309 + uc.field_a);
                    discarded$4 = this.a(false, 166, (byte) 79, false, 39 + bi.field_I, 29, 390 + uc.field_a);
                    tj.field_t.a(gg.field_f, -1 + (32 + bi.field_I + 7), 389 + uc.field_a, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(gg.field_f, bi.field_I + 39, uc.field_a - -390 - 2, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(gg.field_f, bi.field_I - -39, uc.field_a - -390 + -1, 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    if (kg.field_d[3] != hi.field_b[0]) {
                        statePc = 684;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    if (kg.field_d[0] != ld.field_n[2]) {
                        statePc = 684;
                    } else {
                        statePc = 682;
                    }
                    continue stateLoop;
                }
                case 682: {
                    kg.field_d[0] = ld.field_n[3];
                    statePc = 684;
                    continue stateLoop;
                }
                case 684: {
                    if (kg.field_d[3] != hi.field_b[0]) {
                        statePc = 690;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 685: {
                    if (kg.field_d[1] == ud.field_z[2]) {
                        statePc = 689;
                    } else {
                        statePc = 690;
                    }
                    continue stateLoop;
                }
                case 689: {
                    kg.field_d[1] = ud.field_z[3];
                    statePc = 690;
                    continue stateLoop;
                }
                case 690: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 696;
                    } else {
                        statePc = 691;
                    }
                    continue stateLoop;
                }
                case 691: {
                    if (kg.field_d[0] == ld.field_n[12]) {
                        statePc = 695;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 695: {
                    kg.field_d[0] = ld.field_n[13];
                    statePc = 696;
                    continue stateLoop;
                }
                case 696: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 702;
                    } else {
                        statePc = 697;
                    }
                    continue stateLoop;
                }
                case 697: {
                    if (ud.field_z[12] == kg.field_d[1]) {
                        statePc = 701;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 701: {
                    kg.field_d[1] = ud.field_z[13];
                    statePc = 702;
                    continue stateLoop;
                }
                case 702: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 708;
                    } else {
                        statePc = 703;
                    }
                    continue stateLoop;
                }
                case 703: {
                    if (ud.field_z[12] != kg.field_d[1]) {
                        statePc = 708;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    kg.field_d[1] = ud.field_z[14];
                    statePc = 708;
                    continue stateLoop;
                }
                case 708: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 714;
                    } else {
                        statePc = 709;
                    }
                    continue stateLoop;
                }
                case 709: {
                    if (ld.field_n[12] != kg.field_d[0]) {
                        statePc = 714;
                    } else {
                        statePc = 712;
                    }
                    continue stateLoop;
                }
                case 712: {
                    kg.field_d[0] = ld.field_n[14];
                    statePc = 714;
                    continue stateLoop;
                }
                case 714: {
                    if (kg.field_d[3] != hi.field_b[3]) {
                        statePc = 720;
                    } else {
                        statePc = 715;
                    }
                    continue stateLoop;
                }
                case 715: {
                    if (ud.field_z[13] == kg.field_d[1]) {
                        statePc = 719;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 719: {
                    kg.field_d[1] = ud.field_z[14];
                    statePc = 720;
                    continue stateLoop;
                }
                case 720: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 726;
                    } else {
                        statePc = 721;
                    }
                    continue stateLoop;
                }
                case 721: {
                    if (ld.field_n[13] == kg.field_d[0]) {
                        statePc = 725;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 725: {
                    kg.field_d[0] = ld.field_n[14];
                    statePc = 726;
                    continue stateLoop;
                }
                case 726: {
                    de.a(bi.field_I - -58, uc.field_a + 317, 131, 67, 16777215);
                    de.d(59 + bi.field_I, uc.field_a + 318, 129, 65, 0);
                    var23 = 0;
                    statePc = 727;
                    continue stateLoop;
                }
                case 727: {
                    stackIn_728_0 = var23 ^ -1;
                    stackIn_728_1 = -9;
                    statePc = 728;
                    continue stateLoop;
                }
                case 728: {
                    if (stackIn_728_0 <= stackIn_728_1) {
                        statePc = 779;
                    } else {
                        statePc = 729;
                    }
                    continue stateLoop;
                }
                case 729: {
                    var24 = 0;
                    statePc = 730;
                    continue stateLoop;
                }
                case 730: {
                    if (4 <= var24) {
                        statePc = 778;
                    } else {
                        statePc = 731;
                    }
                    continue stateLoop;
                }
                case 731: {
                    var25 = var24 * 8 + var23;
                    var3 = uc.field_a - -319 + var24 * 16;
                    var2_int = var23 * 16 + bi.field_I + 60;
                    var26 = (ld.field_n[var25][0] << -651613456) + (ld.field_n[var25][2] - -(ld.field_n[var25][1] << 519488136));
                    de.d(var2_int, var3, 15, 15, var26);
                    stackIn_728_0 = -3;
                    stackIn_732_0 = stackIn_728_0;
                    stackIn_728_1 = var25 ^ -1;
                    stackIn_732_1 = stackIn_728_1;
                    if (false) {
                        statePc = 728;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    if (stackIn_732_0 != stackIn_732_1) {
                        statePc = 738;
                    } else {
                        statePc = 733;
                    }
                    continue stateLoop;
                }
                case 733: {
                    if (kg.field_d[3] == hi.field_b[0]) {
                        statePc = 737;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 737: {
                    var26 = 0;
                    statePc = 738;
                    continue stateLoop;
                }
                case 738: {
                    if (12 != var25) {
                        statePc = 743;
                    } else {
                        statePc = 739;
                    }
                    continue stateLoop;
                }
                case 739: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 743;
                    } else {
                        statePc = 742;
                    }
                    continue stateLoop;
                }
                case 742: {
                    var26 = 0;
                    statePc = 743;
                    continue stateLoop;
                }
                case 743: {
                    if (-13 != (var25 ^ -1)) {
                        statePc = 748;
                    } else {
                        statePc = 744;
                    }
                    continue stateLoop;
                }
                case 744: {
                    if (kg.field_d[3] != hi.field_b[3]) {
                        statePc = 748;
                    } else {
                        statePc = 747;
                    }
                    continue stateLoop;
                }
                case 747: {
                    var26 = 0;
                    statePc = 748;
                    continue stateLoop;
                }
                case 748: {
                    if (-14 != (var25 ^ -1)) {
                        statePc = 754;
                    } else {
                        statePc = 749;
                    }
                    continue stateLoop;
                }
                case 749: {
                    if (kg.field_d[3] == hi.field_b[3]) {
                        statePc = 753;
                    } else {
                        statePc = 754;
                    }
                    continue stateLoop;
                }
                case 753: {
                    var26 = 0;
                    statePc = 754;
                    continue stateLoop;
                }
                case 754: {
                    if (var26 == 0) {
                        statePc = 757;
                    } else {
                        statePc = 758;
                    }
                    continue stateLoop;
                }
                case 757: {
                    de.b(var2_int, var3, var2_int - -14, var3 + 14, 16711680);
                    de.b(var2_int + 1, var3, var2_int - -14, var3 + 13, 0);
                    de.b(var2_int, 1 + var3, var2_int + 13, var3 + 14, 0);
                    de.b(var2_int, var3 + 14, var2_int - -14, var3, 16711680);
                    de.b(var2_int + 1, var3 - -14, 14 + var2_int, 1 + var3, 0);
                    de.b(var2_int, 13 + var3, 13 + var2_int, var3, 0);
                    statePc = 758;
                    continue stateLoop;
                }
                case 758: {
                    if (an.field_g < var2_int) {
                        statePc = 773;
                    } else {
                        statePc = 759;
                    }
                    continue stateLoop;
                }
                case 759: {
                    if (me.field_I < var3) {
                        statePc = 773;
                    } else {
                        statePc = 762;
                    }
                    continue stateLoop;
                }
                case 762: {
                    if ((an.field_g ^ -1) <= (var2_int + 15 ^ -1)) {
                        statePc = 773;
                    } else {
                        statePc = 765;
                    }
                    continue stateLoop;
                }
                case 765: {
                    if (me.field_I >= var3 - -15) {
                        statePc = 773;
                    } else {
                        statePc = 768;
                    }
                    continue stateLoop;
                }
                case 768: {
                    if (-1 != (var26 ^ -1)) {
                        statePc = 772;
                    } else {
                        statePc = 773;
                    }
                    continue stateLoop;
                }
                case 772: {
                    de.a(var2_int + -1, var3 - 1, 17, 17, 16777215);
                    this.field_m = 2;
                    this.field_i = var25;
                    statePc = 773;
                    continue stateLoop;
                }
                case 773: {
                    if (ld.field_n[var25] == kg.field_d[0]) {
                        statePc = 776;
                    } else {
                        statePc = 777;
                    }
                    continue stateLoop;
                }
                case 776: {
                    de.a(var2_int - 1, var3 + -1, 17, 17, 2, 16777215, 128);
                    statePc = 777;
                    continue stateLoop;
                }
                case 777: {
                    var24++;
                    statePc = 730;
                    continue stateLoop;
                }
                case 778: {
                    var23++;
                    statePc = 727;
                    continue stateLoop;
                }
                case 779: {
                    discarded$5 = this.a(false, 180, (byte) 106, false, bi.field_I - -225, 98, 309 + uc.field_a);
                    discarded$6 = this.a(false, 166, (byte) -98, false, 232 + bi.field_I, 29, uc.field_a + 390);
                    tj.field_t.a(ce.field_j, 6 + (bi.field_I + 225), -1 + (uc.field_a - -390), 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(ce.field_j, 7 + (225 + bi.field_I), -2 + uc.field_a - -390, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(ce.field_j, bi.field_I - -225 - -7, -1 + (uc.field_a - -390), 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(248 + bi.field_I, 317 + uc.field_a, 131, 67, 16777215);
                    de.d(249 + bi.field_I, 318 + uc.field_a, 129, 65, 0);
                    var23 = 0;
                    statePc = 780;
                    continue stateLoop;
                }
                case 780: {
                    stackIn_781_0 = var23;
                    stackIn_781_1 = 8;
                    statePc = 781;
                    continue stateLoop;
                }
                case 781: {
                    if (stackIn_781_0 >= stackIn_781_1) {
                        statePc = 833;
                    } else {
                        statePc = 782;
                    }
                    continue stateLoop;
                }
                case 782: {
                    var24 = 0;
                    statePc = 783;
                    continue stateLoop;
                }
                case 783: {
                    if (-5 >= (var24 ^ -1)) {
                        statePc = 832;
                    } else {
                        statePc = 784;
                    }
                    continue stateLoop;
                }
                case 784: {
                    var25 = 8 * var24 + var23;
                    var26 = (ud.field_z[var25][0] << -1104353136) + (ud.field_z[var25][2] - -(ud.field_z[var25][1] << 1324992264));
                    var3 = var24 * 16 + 319 + uc.field_a;
                    var2_int = 250 + bi.field_I + 16 * var23;
                    de.d(var2_int, var3, 15, 15, var26);
                    stackIn_781_0 = 2;
                    stackIn_785_0 = stackIn_781_0;
                    stackIn_781_1 = var25;
                    stackIn_785_1 = stackIn_781_1;
                    if (false) {
                        statePc = 781;
                    } else {
                        statePc = 785;
                    }
                    continue stateLoop;
                }
                case 785: {
                    if (stackIn_785_0 != stackIn_785_1) {
                        statePc = 791;
                    } else {
                        statePc = 786;
                    }
                    continue stateLoop;
                }
                case 786: {
                    if (kg.field_d[3] == hi.field_b[0]) {
                        statePc = 790;
                    } else {
                        statePc = 791;
                    }
                    continue stateLoop;
                }
                case 790: {
                    var26 = 0;
                    statePc = 791;
                    continue stateLoop;
                }
                case 791: {
                    if (-13 != (var25 ^ -1)) {
                        statePc = 797;
                    } else {
                        statePc = 792;
                    }
                    continue stateLoop;
                }
                case 792: {
                    if (kg.field_d[3] == hi.field_b[2]) {
                        statePc = 796;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 796: {
                    var26 = 0;
                    statePc = 797;
                    continue stateLoop;
                }
                case 797: {
                    if ((var25 ^ -1) != -13) {
                        statePc = 803;
                    } else {
                        statePc = 798;
                    }
                    continue stateLoop;
                }
                case 798: {
                    if (kg.field_d[3] == hi.field_b[3]) {
                        statePc = 802;
                    } else {
                        statePc = 803;
                    }
                    continue stateLoop;
                }
                case 802: {
                    var26 = 0;
                    statePc = 803;
                    continue stateLoop;
                }
                case 803: {
                    if (-14 != (var25 ^ -1)) {
                        statePc = 809;
                    } else {
                        statePc = 804;
                    }
                    continue stateLoop;
                }
                case 804: {
                    if (hi.field_b[3] == kg.field_d[3]) {
                        statePc = 808;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 808: {
                    var26 = 0;
                    statePc = 809;
                    continue stateLoop;
                }
                case 809: {
                    if (-1 != (var26 ^ -1)) {
                        statePc = 812;
                    } else {
                        statePc = 810;
                    }
                    continue stateLoop;
                }
                case 810: {
                    de.b(var2_int, var3, 14 + var2_int, var3 - -14, 16711680);
                    de.b(1 + var2_int, var3, 14 + var2_int, var3 - -13, 0);
                    de.b(var2_int, var3 + 1, var2_int - -13, var3 + 14, 0);
                    de.b(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                    de.b(var2_int + 1, var3 - -14, 14 + var2_int, var3 - -1, 0);
                    de.b(var2_int, var3 - -13, 13 + var2_int, var3, 0);
                    statePc = 812;
                    continue stateLoop;
                }
                case 812: {
                    if ((an.field_g ^ -1) > (var2_int ^ -1)) {
                        statePc = 827;
                    } else {
                        statePc = 813;
                    }
                    continue stateLoop;
                }
                case 813: {
                    if ((me.field_I ^ -1) > (var3 ^ -1)) {
                        statePc = 827;
                    } else {
                        statePc = 816;
                    }
                    continue stateLoop;
                }
                case 816: {
                    if ((15 + var2_int ^ -1) >= (an.field_g ^ -1)) {
                        statePc = 827;
                    } else {
                        statePc = 819;
                    }
                    continue stateLoop;
                }
                case 819: {
                    if ((var3 - -15 ^ -1) >= (me.field_I ^ -1)) {
                        statePc = 827;
                    } else {
                        statePc = 822;
                    }
                    continue stateLoop;
                }
                case 822: {
                    if (var26 == 0) {
                        statePc = 827;
                    } else {
                        statePc = 825;
                    }
                    continue stateLoop;
                }
                case 825: {
                    de.a(-1 + var2_int, -1 + var3, 17, 17, 16777215);
                    this.field_i = var25;
                    this.field_m = 3;
                    statePc = 827;
                    continue stateLoop;
                }
                case 827: {
                    if (kg.field_d[1] == ud.field_z[var25]) {
                        statePc = 830;
                    } else {
                        statePc = 831;
                    }
                    continue stateLoop;
                }
                case 830: {
                    de.a(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                    statePc = 831;
                    continue stateLoop;
                }
                case 831: {
                    var24++;
                    statePc = 783;
                    continue stateLoop;
                }
                case 832: {
                    var23++;
                    statePc = 780;
                    continue stateLoop;
                }
                case 833: {
                    var23 = 79;
                    var24 = 424;
                    if ((gm.field_f ^ -1) == -4) {
                        statePc = 836;
                    } else {
                        statePc = 837;
                    }
                    continue stateLoop;
                }
                case 836: {
                    var23 += 14;
                    var24 -= 7;
                    statePc = 837;
                    continue stateLoop;
                }
                case 837: {
                    discarded$7 = this.a(false, 93, (byte) -106, false, bi.field_I - -417, 98, uc.field_a - -309);
                    discarded$8 = this.a(false, var23, (byte) -96, false, var24 + bi.field_I, 29, uc.field_a + 390);
                    tj.field_t.a(th.field_j, -1 + bi.field_I - -var24, uc.field_a - -390 - 1, var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(th.field_j, var24 + bi.field_I, 390 + (uc.field_a + -2), var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(th.field_j, var24 + bi.field_I, -1 + (uc.field_a - -390), var23, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(431 + bi.field_I, uc.field_a - -317, 67, 67, 16777215);
                    de.d(bi.field_I - -432, uc.field_a - -318, 65, 65, 0);
                    var25 = 0;
                    statePc = 838;
                    continue stateLoop;
                }
                case 838: {
                    stackIn_839_0 = -5;
                    stackIn_839_1 = var25 ^ -1;
                    statePc = 839;
                    continue stateLoop;
                }
                case 839: {
                    if (stackIn_839_0 >= stackIn_839_1) {
                        statePc = 860;
                    } else {
                        statePc = 840;
                    }
                    continue stateLoop;
                }
                case 840: {
                    var26 = 0;
                    statePc = 841;
                    continue stateLoop;
                }
                case 841: {
                    if (var26 >= 4) {
                        statePc = 859;
                    } else {
                        statePc = 842;
                    }
                    continue stateLoop;
                }
                case 842: {
                    var27 = var25 + var26 * 4;
                    var2_int = var25 * 16 + (bi.field_I - -433);
                    var28 = (ug.field_d[var27][0] << -1028253840) + (ug.field_d[var27][2] + (ug.field_d[var27][1] << -1153120760));
                    var3 = 16 * var26 + 319 + uc.field_a;
                    de.d(var2_int, var3, 15, 15, var28);
                    stackIn_839_0 = an.field_g ^ -1;
                    stackIn_843_0 = stackIn_839_0;
                    stackIn_839_1 = var2_int ^ -1;
                    stackIn_843_1 = stackIn_839_1;
                    if (false) {
                        statePc = 839;
                    } else {
                        statePc = 843;
                    }
                    continue stateLoop;
                }
                case 843: {
                    if (stackIn_843_0 > stackIn_843_1) {
                        statePc = 855;
                    } else {
                        statePc = 844;
                    }
                    continue stateLoop;
                }
                case 844: {
                    if (var3 > me.field_I) {
                        statePc = 855;
                    } else {
                        statePc = 847;
                    }
                    continue stateLoop;
                }
                case 847: {
                    if (15 + var2_int <= an.field_g) {
                        statePc = 855;
                    } else {
                        statePc = 850;
                    }
                    continue stateLoop;
                }
                case 850: {
                    if (me.field_I >= var3 - -15) {
                        statePc = 855;
                    } else {
                        statePc = 853;
                    }
                    continue stateLoop;
                }
                case 853: {
                    de.a(var2_int + -1, var3 - 1, 17, 17, 16777215);
                    this.field_i = var27;
                    this.field_m = 4;
                    statePc = 855;
                    continue stateLoop;
                }
                case 855: {
                    if (kg.field_d[2] != ug.field_d[var27]) {
                        statePc = 858;
                    } else {
                        statePc = 856;
                    }
                    continue stateLoop;
                }
                case 856: {
                    de.a(var2_int - 1, -1 + var3, 17, 17, 2, 16777215, 128);
                    statePc = 858;
                    continue stateLoop;
                }
                case 858: {
                    var26++;
                    statePc = 841;
                    continue stateLoop;
                }
                case 859: {
                    var25++;
                    statePc = 838;
                    continue stateLoop;
                }
                case 860: {
                    discarded$9 = this.a(false, 93, (byte) 93, false, 520 + bi.field_I, 98, 309 + uc.field_a);
                    discarded$10 = this.a(false, 79, (byte) 121, false, 7 + bi.field_I + 520, 29, 390 + uc.field_a);
                    tj.field_t.a(ka.field_l, 7 + bi.field_I + 520 + -1, 389 + uc.field_a, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(ka.field_l, bi.field_I + 527, 390 + uc.field_a + -2, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(ka.field_l, bi.field_I + 520 + 7, -1 + uc.field_a + 390, 79, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(535 + bi.field_I, uc.field_a + 333, 67, 35, 16777215);
                    de.d(bi.field_I + 536, uc.field_a - -318 - -16, 65, 33, 0);
                    var25 = 0;
                    statePc = 861;
                    continue stateLoop;
                }
                case 861: {
                    stackIn_862_0 = 4;
                    stackIn_862_1 = var25;
                    statePc = 862;
                    continue stateLoop;
                }
                case 862: {
                    if (stackIn_862_0 <= stackIn_862_1) {
                        statePc = 885;
                    } else {
                        statePc = 863;
                    }
                    continue stateLoop;
                }
                case 863: {
                    var26 = 0;
                    statePc = 864;
                    continue stateLoop;
                }
                case 864: {
                    if (var26 >= 2) {
                        statePc = 882;
                    } else {
                        statePc = 865;
                    }
                    continue stateLoop;
                }
                case 865: {
                    var27 = 4 * var26 + var25;
                    var3 = var26 * 16 + uc.field_a - -335;
                    var2_int = var25 * 16 + bi.field_I + 537;
                    var28 = (hi.field_b[var27][0] << 862087536) + (hi.field_b[var27][1] << 901584712) + hi.field_b[var27][2];
                    de.d(var2_int, var3, 15, 15, var28);
                    stackIn_862_0 = an.field_g ^ -1;
                    stackIn_866_0 = stackIn_862_0;
                    stackIn_862_1 = var2_int ^ -1;
                    stackIn_866_1 = stackIn_862_1;
                    if (false) {
                        statePc = 862;
                    } else {
                        statePc = 866;
                    }
                    continue stateLoop;
                }
                case 866: {
                    if (stackIn_866_0 > stackIn_866_1) {
                        statePc = 878;
                    } else {
                        statePc = 867;
                    }
                    continue stateLoop;
                }
                case 867: {
                    if (var3 > me.field_I) {
                        statePc = 878;
                    } else {
                        statePc = 870;
                    }
                    continue stateLoop;
                }
                case 870: {
                    if ((an.field_g ^ -1) <= (15 + var2_int ^ -1)) {
                        statePc = 878;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 873: {
                    if ((var3 + 15 ^ -1) < (me.field_I ^ -1)) {
                        statePc = 877;
                    } else {
                        statePc = 878;
                    }
                    continue stateLoop;
                }
                case 877: {
                    de.a(var2_int + -1, -1 + var3, 17, 17, 16777215);
                    this.field_i = var27;
                    this.field_m = 5;
                    statePc = 878;
                    continue stateLoop;
                }
                case 878: {
                    if (hi.field_b[var27] != kg.field_d[3]) {
                        statePc = 881;
                    } else {
                        statePc = 879;
                    }
                    continue stateLoop;
                }
                case 879: {
                    de.a(-1 + var2_int, -1 + var3, 17, 17, 2, 16777215, 128);
                    statePc = 881;
                    continue stateLoop;
                }
                case 881: {
                    var26++;
                    statePc = 864;
                    continue stateLoop;
                }
                case 882: {
                    var25++;
                    statePc = 861;
                    continue stateLoop;
                }
                case 885: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int stackIn_125_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        so stackIn_187_0 = null;
        so stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_279_0 = 0;
        so stackIn_299_0 = null;
        so stackIn_300_0 = null;
        int stackIn_300_1 = 0;
        so stackIn_309_0 = null;
        so stackIn_310_0 = null;
        int stackIn_310_1 = 0;
        so stackIn_329_0 = null;
        so stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        so stackIn_355_0 = null;
        so stackIn_356_0 = null;
        int stackIn_356_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                this.a(false, 127, (byte) 126);
                break L1;
              }
            }
            L2: {
              var4_int = wl.field_L[this.field_l][param1];
              var6 = var4_int;
              if ((var6 ^ -1) != -1) {
                if (1 != var6) {
                  L3: {
                    if (var6 != 2) {
                      if ((var6 ^ -1) == -8) {
                        if (this.field_g.b(true)) {
                          L4: {
                            var6 = param0 ? 1 : 0;
                            stackIn_134_0 = var6;

                            if (param2) {
                              stackIn_135_0 = stackIn_134_0;
                              stackIn_135_1 = 0;
                              break L4;
                            } else {
                              stackIn_135_0 = stackIn_134_0;
                              stackIn_135_1 = 1;
                              break L4;
                            }
                          }
                          gj.a(stackIn_135_0 != 0, stackIn_135_1 != 0, 0, mn.field_r);
                          io.field_A = false;
                          fi.field_h = true;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        if (var6 == 24) {
                          if (this.field_g.b(true)) {
                            var6 = param0 ? 1 : 0;
                            gj.a(var6 != 0, true, 10, mn.field_r);
                            tn.field_Cb = true;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (var6 != 22) {
                            if (-15 != (var6 ^ -1)) {
                              if (15 == var6) {
                                if (!this.field_g.b(true)) {
                                  break L3;
                                } else {
                                  L5: {
                                    if (lc.a((byte) 112)) {
                                      break L5;
                                    } else {
                                      if ((ah.field_c ^ -1) >= -1) {
                                        break L5;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  var6 = param0 ? 1 : 0;
                                  gj.a(var6 != 0, true, 16, mn.field_r);
                                  break L2;
                                }
                              } else {
                                if ((var6 ^ -1) != -6) {
                                  if (8 != var6) {
                                    if (-5 != (var6 ^ -1)) {
                                      if ((var6 ^ -1) != -28) {
                                        if ((var6 ^ -1) != -29) {
                                          if (20 == var6) {
                                            L6: {
                                              var5 = 0;
                                              if (!this.field_g.a(-13722)) {
                                                break L6;
                                              } else {
                                                if (-1 <= (si.field_l ^ -1)) {
                                                  break L6;
                                                } else {
                                                  mf.a(0, 21298);
                                                  var5 = 1;
                                                  break L6;
                                                }
                                              }
                                            }
                                            L7: {
                                              if (!this.field_g.d((byte) 112)) {
                                                break L7;
                                              } else {
                                                if ((si.field_l ^ -1) <= -257) {
                                                  break L7;
                                                } else {
                                                  var5 = 1;
                                                  mf.a(256, 21298);
                                                  break L7;
                                                }
                                              }
                                            }
                                            L8: {
                                              if (this.field_g.c((byte) -26)) {
                                                var6 = this.d(41, param1) + (this.a(param1, (byte) 103) + (ff.field_c - 120)) >> -2113586175;
                                                var7 = -var6 + an.field_g;
                                                var8 = var7 * 256 / 120;
                                                var5 = 1;
                                                if (0 >= var8) {
                                                  mf.a(0, 21298);
                                                  break L8;
                                                } else {
                                                  if (256 > var8) {
                                                    mf.a(var8, 21298);
                                                    break L8;
                                                  } else {
                                                    mf.a(256, 21298);
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                break L8;
                                              }
                                            }
                                            L9: {
                                              if (!this.field_g.b((byte) -40)) {
                                                break L9;
                                              } else {
                                                if (-1 > (si.field_l ^ -1)) {
                                                  var5 = 1;
                                                  ob.j((byte) -109);
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (!this.field_g.b(-65)) {
                                                break L10;
                                              } else {
                                                if (-257 < (si.field_l ^ -1)) {
                                                  var5 = 1;
                                                  s.a(false);
                                                  break L10;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            if (var5 != 0) {
                                              L11: {
                                                if (!this.field_g.c((byte) -102)) {
                                                  break L11;
                                                } else {
                                                  if (oj.field_e >= jb.field_v) {
                                                    break L3;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              L12: {
                                                if (null != cf.field_h[nn.field_n[0][2]]) {
                                                  ti.a((byte) -30, to.field_r[nn.field_n[0][2]], cf.field_h[nn.field_n[0][2]]);
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              oj.field_e = 20 + jb.field_v;
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            if (-22 != (var6 ^ -1)) {
                                              if ((var6 ^ -1) == -7) {
                                                if (!this.field_g.b(true)) {
                                                  break L3;
                                                } else {
                                                  L13: {
                                                    if (param2) {
                                                      stackIn_279_0 = 0;
                                                      break L13;
                                                    } else {
                                                      stackIn_279_0 = 1;
                                                      break L13;
                                                    }
                                                  }
                                                  wl.f(stackIn_279_0 != 0);
                                                  break L2;
                                                }
                                              } else {
                                                if (var6 != 9) {
                                                  if (var6 == 10) {
                                                    if (this.field_g.b(true)) {
                                                      jb.field_z.a(true);
                                                      var6 = param0 ? 1 : 0;
                                                      gj.a(var6 != 0, true, -1, mn.field_r);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  } else {
                                                    if (-12 != (var6 ^ -1)) {
                                                      if (-13 == (var6 ^ -1)) {
                                                        L14: {
                                                          stackIn_299_0 = this.field_g;

                                                          if (param2) {
                                                            stackIn_300_0 = (so) ((Object) stackIn_299_0);
                                                            stackIn_300_1 = 0;
                                                            break L14;
                                                          } else {

                                                            stackIn_300_0 = (so) ((Object) stackIn_299_0);
                                                            stackIn_300_1 = 1;
                                                            break L14;
                                                          }
                                                        }
                                                        if (((so) (Object) stackIn_300_0).b(stackIn_300_1 != 0)) {
                                                          jb.field_z.g((byte) -61);
                                                          var6 = param0 ? 1 : 0;
                                                          gj.a(var6 != 0, true, -1, mn.field_r);
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        if (var6 != 13) {
                                                          if (-18 == (var6 ^ -1)) {
                                                            if (!this.field_g.b(true)) {
                                                              break L3;
                                                            } else {
                                                              ie.field_Sb = 0;
                                                              break L2;
                                                            }
                                                          } else {
                                                            if (var6 != 18) {
                                                              if (var6 != 23) {
                                                                if (var6 == 25) {
                                                                  L15: {
                                                                    stackIn_355_0 = this.field_g;

                                                                    if (param2) {
                                                                      stackIn_356_0 = (so) ((Object) stackIn_355_0);
                                                                      stackIn_356_1 = 0;
                                                                      break L15;
                                                                    } else {

                                                                      stackIn_356_0 = (so) ((Object) stackIn_355_0);
                                                                      stackIn_356_1 = 1;
                                                                      break L15;
                                                                    }
                                                                  }
                                                                  if (!((so) (Object) stackIn_356_0).b(stackIn_356_1 != 0)) {
                                                                    break L3;
                                                                  } else {
                                                                    if (this.a((byte) -46, param1)) {
                                                                      L16: {
                                                                        if (si.field_g == 8) {
                                                                          vn.field_g = vn.field_g - 1;
                                                                          if (0 <= vn.field_g) {
                                                                            break L16;
                                                                          } else {
                                                                            vn.field_g = 3;
                                                                            break L16;
                                                                          }
                                                                        } else {
                                                                          break L16;
                                                                        }
                                                                      }
                                                                      L17: {
                                                                        if (si.field_g != 7) {
                                                                          break L17;
                                                                        } else {
                                                                          fh.field_e = fh.field_e - 1;
                                                                          break L17;
                                                                        }
                                                                      }
                                                                      if (14 != si.field_g) {
                                                                        break L3;
                                                                      } else {
                                                                        L18: {
                                                                          var6 = -1 + mj.field_p;
                                                                          if (-1 <= (var6 ^ -1)) {
                                                                            var6 = 0;
                                                                            if (!param0) {
                                                                              this.field_g.field_h = 1;
                                                                              break L18;
                                                                            } else {
                                                                              break L18;
                                                                            }
                                                                          } else {
                                                                            break L18;
                                                                          }
                                                                        }
                                                                        df.a((byte) 120, var6);
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (26 == var6) {
                                                                    if (!this.field_g.b(true)) {
                                                                      break L3;
                                                                    } else {
                                                                      if (!this.a((byte) -46, param1)) {
                                                                        break L3;
                                                                      } else {
                                                                        L19: {
                                                                          if (si.field_g == 8) {
                                                                            vn.field_g = vn.field_g + 1;
                                                                            if ((vn.field_g ^ -1) < -4) {
                                                                              vn.field_g = 0;
                                                                              break L19;
                                                                            } else {
                                                                              break L19;
                                                                            }
                                                                          } else {
                                                                            break L19;
                                                                          }
                                                                        }
                                                                        L20: {
                                                                          if (si.field_g == 7) {
                                                                            fh.field_e = fh.field_e + 1;
                                                                            break L20;
                                                                          } else {
                                                                            break L20;
                                                                          }
                                                                        }
                                                                        if (14 != si.field_g) {
                                                                          break L3;
                                                                        } else {
                                                                          L21: {
                                                                            var6 = 1 + mj.field_p;
                                                                            if ((var6 ^ -1) > -8) {
                                                                              break L21;
                                                                            } else {
                                                                              var6 = 7;
                                                                              if (param0) {
                                                                                break L21;
                                                                              } else {
                                                                                this.field_g.field_h = 0;
                                                                                break L21;
                                                                              }
                                                                            }
                                                                          }
                                                                          df.a((byte) -127, var6);
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (var6 == 19) {
                                                                      if (!this.field_g.b(true)) {
                                                                        break L3;
                                                                      } else {
                                                                        im.a((byte) 79, cd.e(120));
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      if (30 == var6) {
                                                                        if (this.field_g.b(true)) {
                                                                          df.a((byte) 89, 7);
                                                                          break L2;
                                                                        } else {
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        if ((var6 ^ -1) == -30) {
                                                                          if (this.field_g.b(true)) {
                                                                            var6 = param0 ? 1 : 0;
                                                                            gj.a(var6 != 0, true, -1, mn.field_r);
                                                                            break L3;
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (!this.field_g.b(true)) {
                                                                  break L3;
                                                                } else {
                                                                  L22: {
                                                                    if (-9 == (this.field_l ^ -1)) {
                                                                      break L22;
                                                                    } else {
                                                                      if (-7 != (si.field_g ^ -1)) {
                                                                        if (10 != this.field_l) {
                                                                          break L3;
                                                                        } else {
                                                                          ko.a(cd.e(103), (byte) -60);
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        break L22;
                                                                      }
                                                                    }
                                                                  }
                                                                  ul.a(ud.field_o, (byte) 45, this.field_l);
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              L23: {
                                                                stackIn_329_0 = this.field_g;

                                                                if (param2) {
                                                                  stackIn_330_0 = (so) ((Object) stackIn_329_0);
                                                                  stackIn_330_1 = 0;
                                                                  break L23;
                                                                } else {

                                                                  stackIn_330_0 = (so) ((Object) stackIn_329_0);
                                                                  stackIn_330_1 = 1;
                                                                  break L23;
                                                                }
                                                              }
                                                              if (((so) (Object) stackIn_330_0).b(stackIn_330_1 != 0)) {
                                                                ie.field_Sb = 1;
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          L24: {
                                                            stackIn_309_0 = this.field_g;

                                                            if (param2) {
                                                              stackIn_310_0 = (so) ((Object) stackIn_309_0);
                                                              stackIn_310_1 = 0;
                                                              break L24;
                                                            } else {

                                                              stackIn_310_0 = (so) ((Object) stackIn_309_0);
                                                              stackIn_310_1 = 1;
                                                              break L24;
                                                            }
                                                          }
                                                          if (!((so) (Object) stackIn_310_0).b(stackIn_310_1 != 0)) {
                                                            break L3;
                                                          } else {
                                                            L25: {
                                                              if (!hi.field_a) {
                                                                break L25;
                                                              } else {
                                                                var6 = param0 ? 1 : 0;
                                                                gj.a(var6 != 0, true, -5, mn.field_r);
                                                                break L25;
                                                              }
                                                            }
                                                            L26: {
                                                              if (!mj.field_w) {
                                                                break L26;
                                                              } else {
                                                                qe.a(0, (byte) -35, 11);
                                                                break L26;
                                                              }
                                                            }
                                                            fi.field_h = true;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if (!this.field_g.b(true)) {
                                                        break L3;
                                                      } else {
                                                        jb.field_z.p(26873);
                                                        var6 = param0 ? 1 : 0;
                                                        gj.a(var6 != 0, true, -1, mn.field_r);
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_g.b(true)) {
                                                    break L3;
                                                  } else {
                                                    jb.field_z.a(-111, param0);
                                                    fi.field_h = true;
                                                    io.field_A = false;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              L27: {
                                                if (!this.field_g.a(-13722)) {
                                                  break L27;
                                                } else {
                                                  eb.a(0, false);
                                                  break L27;
                                                }
                                              }
                                              L28: {
                                                if (!this.field_g.d((byte) 125)) {
                                                  break L28;
                                                } else {
                                                  eb.a(256, false);
                                                  break L28;
                                                }
                                              }
                                              L29: {
                                                if (!this.field_g.c((byte) 85)) {
                                                  break L29;
                                                } else {
                                                  var6 = -120 + this.d(41, param1) - (-this.a(param1, (byte) 103) - ff.field_c) >> -741220799;
                                                  var7 = -var6 + an.field_g;
                                                  var8 = 256 * var7 / 120;
                                                  if (-1 > (var8 ^ -1)) {
                                                    if (var8 >= 256) {
                                                      eb.a(256, false);
                                                      break L29;
                                                    } else {
                                                      eb.a(var8, false);
                                                      break L29;
                                                    }
                                                  } else {
                                                    eb.a(0, param2);
                                                    break L29;
                                                  }
                                                }
                                              }
                                              L30: {
                                                if (this.field_g.b((byte) -40)) {
                                                  jm.b(60);
                                                  break L30;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                              if (this.field_g.b(-74)) {
                                                ck.a((byte) 115);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_g.b(true)) {
                                            var6 = param0 ? 1 : 0;
                                            gj.a(var6 != 0, true, 12, mn.field_r);
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      } else {
                                        L31: {
                                          stackIn_187_0 = this.field_g;

                                          if (param2) {
                                            stackIn_188_0 = (so) ((Object) stackIn_187_0);
                                            stackIn_188_1 = 0;
                                            break L31;
                                          } else {

                                            stackIn_188_0 = (so) ((Object) stackIn_187_0);
                                            stackIn_188_1 = 1;
                                            break L31;
                                          }
                                        }
                                        if (!((so) (Object) stackIn_188_0).b(stackIn_188_1 != 0)) {
                                          break L3;
                                        } else {
                                          var6 = param0 ? 1 : 0;
                                          gj.a(var6 != 0, true, 11, mn.field_r);
                                          break L2;
                                        }
                                      }
                                    } else {
                                      if (!this.field_g.b(true)) {
                                        break L3;
                                      } else {
                                        var6 = param0 ? 1 : 0;
                                        gj.a(var6 != 0, true, 6, mn.field_r);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (this.field_g.b(true)) {
                                      var6 = th.field_f;
                                      var7 = param0 ? 1 : 0;
                                      gj.a(var7 != 0, true, var6, mn.field_r);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  if (this.field_g.b(true)) {
                                    fh.field_e = 0;
                                    var6 = param0 ? 1 : 0;
                                    gj.a(var6 != 0, true, 7, mn.field_r);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              if (this.field_g.b(true)) {
                                L32: {
                                  var6 = param0 ? 1 : 0;
                                  stackIn_155_0 = var6;

                                  if (param2) {
                                    stackIn_156_0 = stackIn_155_0;
                                    stackIn_156_1 = 0;
                                    break L32;
                                  } else {
                                    stackIn_156_0 = stackIn_155_0;
                                    stackIn_156_1 = 1;
                                    break L32;
                                  }
                                }
                                gj.a(stackIn_156_0 != 0, stackIn_156_1 != 0, 15, mn.field_r);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            if (this.field_g.b(true)) {
                              var6 = param0 ? 1 : 0;
                              gj.a(var6 != 0, true, 8, mn.field_r);
                              if (param0) {
                                break L3;
                              } else {
                                this.field_g.field_h = 1;
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      if (!this.field_g.b(true)) {
                        break L3;
                      } else {
                        L33: {
                          var6 = param0 ? 1 : 0;
                          stackIn_125_0 = var6;

                          if (param2) {
                            stackIn_126_0 = stackIn_125_0;
                            stackIn_126_1 = 0;
                            break L33;
                          } else {
                            stackIn_126_0 = stackIn_125_0;
                            stackIn_126_1 = 1;
                            break L33;
                          }
                        }
                        gj.a(stackIn_126_0 != 0, stackIn_126_1 != 0, -1, mn.field_r);
                        break L2;
                      }
                    }
                  }
                  break L2;
                } else {
                  if (this.field_g.b(true)) {
                    if (lc.a((byte) 112)) {
                      ke.a(wd.field_h, param0, mi.field_B, 1, ve.field_t, 0, an.field_j / 2, 16, mi.field_B.field_o, 10, an.field_f / 2, ud.field_o, true, mi.field_B.field_o - -mi.field_B.field_m, -21071);
                      break L2;
                    } else {
                      var6 = param0 ? 1 : 0;
                      gj.a(var6 != 0, true, -4, mn.field_r);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                if (this.field_g.b(true)) {
                  var6 = param0 ? 1 : 0;
                  gj.a(var6 != 0, true, -3, mn.field_r);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0) {
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = null;
                        var3 = null;
                        var4 = -32 + 3 * uc.field_a / 4 - -240;
                        fe.field_o.c(-(fe.field_o.field_n / 2) + (an.field_f >> -270906271), -(fe.field_o.field_w / 2) + -20 + var4);
                        var5 = (an.field_f >> 204869921) + -120;
                        if (mj.field_p != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = aj.field_f;
                        var3 = jo.field_d;
                        bb.field_g[0].c(var5 + -28, -48 + var4);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0 != mj.field_p) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = rj.field_d;
                        var3 = gm.field_b;
                        bb.field_g[1].c(var5 + -28, -32 + var4);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((mj.field_p ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = pc.field_f;
                        var2 = mg.field_F;
                        bb.field_g[72].c(-28 + var5, -48 + var4);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (3 == mj.field_p) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = gi.field_h;
                        var2 = hn.field_c;
                        bb.field_g[4].c(var5 + -28, var4);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((mj.field_p ^ -1) == -5) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2 = gj.field_b;
                        var3 = lm.field_h;
                        bb.field_g[76].c(-28 + var5, -32 + var4);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (mj.field_p != 5) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = bj.field_pb;
                        var2 = ih.field_a;
                        bb.field_g[75].c(-28 + var5, var4 + -48);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (mj.field_p == 6) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2 = gn.field_j;
                        jb.field_z.field_z = 6050;
                        var3 = na.field_lc;
                        bb.field_g[0].c(var5 - 48, var4);
                        bb.field_g[1].c(-8 + var5, var4);
                        gb.field_c[5].a(var5 + -(gb.field_c[0].field_g / 2) - 4, -80 + var4);
                        gb.field_c[4].a(-4 + (var5 + -(gb.field_c[0].field_g / 2)), -80 + var4);
                        gb.field_c[3].a(-(gb.field_c[0].field_g / 2) + (var5 + -4), var4 - 80);
                        gb.field_c[2].a(-4 + (var5 - gb.field_c[0].field_g / 2), -80 + var4);
                        gb.field_c[1].a(var5 - gb.field_c[0].field_g / 2 + -4, var4 - 80);
                        gb.field_c[0].a(-(gb.field_c[0].field_g / 2) + var5 - 16, var4 + -80);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (7 != mj.field_p) {
                            statePc = 33;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = kj.field_d;
                        var2 = bm.field_c;
                        var6 = 0;
                        var7 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = -5;
                        stackIn_24_1 = var7 ^ -1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= stackIn_24_1) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (4 <= var8) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_24_0 = 0;
                        stackIn_28_0 = stackIn_24_0;
                        stackIn_24_1 = b.field_f[var6] ^ -1;
                        stackIn_28_1 = stackIn_24_1;
                        if (false) {
                            statePc = 24;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        bb.field_g[dd.field_f[b.field_f[var6]]].c((-2 + var7) * 40 + var5 - 8, -30 + (var4 + (var8 + -2) * 40));
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6++;
                        var8++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = var4 + -144;
                        if (var2 == null) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        tj.field_t.a((String) (var2), (an.field_f >> -804725599) + -233, var6, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_C - -tj.field_t.field_m);
                        tj.field_t.a((String) (var2), -232 - -(an.field_f >> 1506256577), var6 + -1, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
                        tj.field_t.a((String) (var2), (an.field_f >> -985018495) + -232, var6, 208, 288, 12569299, -1, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var3 != null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        mi.field_B.a((String) (var3), 16 + (an.field_f >> -781556319) + 8, var6, 224, 288, 0, -1, 1, 0, mi.field_B.field_m + mi.field_B.field_C);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var2 = caughtException;
                    throw aa.a((Throwable) (var2), "lc.E(" + param0 + ')');
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(boolean param0) {
        int[][][] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var24 = 0;
        int[] var25 = null;
        boolean[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var31 = null;
        int[] var32 = null;
        qb stackIn_35_0 = null;
        int stackIn_37_0 = 0;
        boolean stackIn_41_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        RuntimeException var2 = null;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String[] var29 = null;
        String[] var30 = null;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var26 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, true, false, true, false, false, false, true, true, true, param0, true, true, true, false, false, false};
              if (lk.a(0, (byte) -116)) {
                var26[55] = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = new int[][][]{new int[][]{new int[]{13, 14}, new int[]{0, 2, 4}, new int[]{1, 3, 5}, new int[]{31, 47}, new int[]{49, 51, 53}, new int[]{50, 52}}, new int[][]{new int[]{46, 56, 87}, new int[]{43, 36, 37, 38, 35}, new int[]{57, 58, 59, 60, 61, 45}, new int[]{41, 44, 12, 72, 73}, new int[]{26, 27, 28, 29}, new int[]{48, 55}}, new int[][]{new int[]{54, 80}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{16, 17, 32}, new int[]{18, 19, 20, 21, 23, 22}, new int[]{24, 25, 33}, new int[]{30}}, new int[][]{new int[]{42, 34, 40, 39, 15}, new int[]{62, 71, 79, 82, 86, 88}, new int[]{65, 66, 67, 69, 85, 92}, new int[]{63, 64, 68, 70, 94, 84}, new int[]{74, 78, 83, 81, 93, 89}, new int[]{91}}};
              var31 = ad.field_f;
              var27 = var31;
              var4 = var27;
              if (2 <= var31.length) {
                break L2;
              } else {
                var32 = new int[2];
                var28 = var32;
                var25 = var28;
                var4 = var25;
                var25[0] = ad.field_f[0];
                var32[1] = 0;
                break L2;
              }
            }
            L3: {
              var5 = lk.a(0, (byte) -33) ? 1 : 0;
              if ((65536 & var4[1] ^ -1) != -1) {
                if (var5 != 0) {
                  break L3;
                } else {
                  if ((8388608 & var4[1] ^ -1) == -1) {
                    var3[1][5] = new int[]{48};
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                var3[1][5] = new int[]{55};
                if (var5 != 0) {
                  break L3;
                } else {
                  if ((8388608 & var4[1]) != 0) {
                    break L3;
                  } else {
                    var3[1][5] = new int[]{};
                    break L3;
                  }
                }
              }
            }
            L4: {
              if ((134217728 & var4[2] ^ -1) != -1) {
                break L4;
              } else {
                var3[3] = new int[][]{var3[3][0], var3[3][1], var3[3][2], var3[3][3], var3[3][4]};
                break L4;
              }
            }
            L5: {
              if (-1 == (8388608 & var4[2] ^ -1)) {
                var3[1][0] = new int[]{46, 56};
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var6 = 80;
              var7 = 100;
              if (ArcanistsMulti.i((byte) -127)) {
                stackIn_35_0 = ii.field_d;
                break L6;
              } else {
                stackIn_35_0 = vd.field_b;
                break L6;
              }
            }
            var8 = stackIn_35_0;
            var9 = 60;
            var10 = 280;
            var11 = 60;
            var12 = 220;
            var13 = dd.field_g;
            dd.field_g = -1;
            var14 = vn.field_g;
            var15 = 0;
            L7: while (true) {
              stackIn_37_0 = var3[var14].length;
              L8: while (true) {
                if (stackIn_37_0 <= var15) {
                  L9: {
                    if (-1 != ke.field_K) {
                      stackIn_75_0 = ke.field_K;
                      break L9;
                    } else {
                      stackIn_75_0 = dd.field_g;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var15 = stackIn_75_0;
                      if (-1 != var15) {
                        L12: {
                          var16 = tj.field_t.field_o + tj.field_t.field_m;
                          mi.field_B.b(rb.field_n[var15], 447 + bi.field_I, uc.field_a + 126, 0, -1);
                          if (-1 == (var4[var15 >> -1047223579] & 1 << (31 & var15) ^ -1)) {
                            stackIn_85_0 = 0;
                            break L12;
                          } else {
                            stackIn_85_0 = 1;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = stackIn_85_0;
                          if (var17 != 0) {
                            mi.field_B.b(rk.field_H, bi.field_I - -447, -8 + uc.field_a + (126 + var16), 0, -1);
                            break L13;
                          } else {
                            mi.field_B.b(ld.field_l, bi.field_I + 447, var16 + uc.field_a - -118, 16711680, -1);
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 126 - -var16;
                          if (var17 != 0) {
                            mo.field_a[var15].c(340 + bi.field_I, var18 + uc.field_a);
                            break L14;
                          } else {
                            vd.field_b.c(340 + bi.field_I, var18 + uc.field_a);
                            break L14;
                          }
                        }
                        L15: {
                          var18 = var18 + tj.field_t.field_C;
                          var18 = var18 + tj.field_t.field_C;
                          if (var17 != 0) {
                            break L15;
                          } else {
                            if (var26[var15]) {
                              var30 = new String[16];
                              var20 = mi.field_B.a(wk.field_k, new int[]{220}, var30);
                              var21 = 0;
                              L16: while (true) {
                                if (var20 <= var21) {
                                  break L11;
                                } else {
                                  mi.field_B.a(var30[var21], 12 + (340 + bi.field_I), 95 + uc.field_a - -var18, 0, -1);
                                  var18 = var18 + mi.field_B.field_C;
                                  var21++;
                                  continue L16;
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var29 = new String[16];
                        var20 = mi.field_B.a(af.field_Bb[var15], new int[]{220}, var29);
                        var21 = 0;
                        L17: while (true) {
                          if (var20 <= var21) {
                            L18: {
                              mi.field_B.b(lo.field_x, bi.field_I - -530, uc.field_a + 170, 0, -1);
                              mi.field_B.b("" + 100 * eh.field_g[var15], bi.field_I + 530, 185 + uc.field_a, 0, -1);
                              mi.field_B.b(uk.field_c, 530 + bi.field_I, uc.field_a + 220, 0, -1);
                              var21 = 514;
                              var22 = 224;
                              if (10 == eh.field_g[var15]) {
                                var21 -= 24;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var23 = 0;
                            L19: while (true) {
                              L20: {
                                if (var23 >= eh.field_g[var15]) {
                                  break L20;
                                } else {
                                  L21: {
                                    ih.field_e.c(var21 + bi.field_I, var22 + uc.field_a);
                                    if (eh.field_g[var15] != 10) {
                                      break L21;
                                    } else {
                                      ih.field_e.c(var21 + bi.field_I - -32, uc.field_a + var22);
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    var21 -= 8;
                                    if (0 != var23 % 3) {
                                      break L22;
                                    } else {
                                      var21 += 16;
                                      break L22;
                                    }
                                  }
                                  var22 += 8;
                                  if (var23 == 4) {
                                    break L20;
                                  } else {
                                    var23++;
                                    continue L19;
                                  }
                                }
                              }
                              break L11;
                            }
                          } else {
                            mi.field_B.a(var29[var21], 340 + (bi.field_I - -12), -8 + (uc.field_a + var18) - -120, 0, -1);
                            var18 = var18 + mi.field_B.field_C;
                            var21++;
                            continue L17;
                          }
                        }
                      } else {
                        mi.field_B.a(qo.field_c, -16 + (bi.field_I - -320) - -50, 134 + uc.field_a, 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                        if (lc.a((byte) 112)) {
                          mi.field_B.a(hg.field_c, -16 + (50 + bi.field_I) + 320, -16 + (250 + uc.field_a), 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                          break L11;
                        } else {
                          mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a - -325, 0, -1);
                          break L10;
                        }
                      }
                    }
                    mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a - -325, 0, -1);
                    break L10;
                  }
                  break L0;
                } else {
                  var7 = var9 - (-(var10 * (1 + var15) / (var3[var14].length - -1)) - uc.field_a);
                  var16 = 0;
                  L23: while (true) {
                    if (var3[var14][var15].length <= var16) {
                      var15++;
                      continue L7;
                    } else {
                      var17 = var3[var14][var15][var16];
                      var6 = bi.field_I + var11 + var12 * (1 + var16) / (1 + var3[var14][var15].length);
                      stackOut_40_0 = mi.a(32, var7, 32, -8, var6);
                      stackIn_37_0 = stackOut_40_0 ? 1 : 0;
                      stackIn_41_0 = stackOut_40_0;
                      L24: {
                        if (stackIn_41_0) {
                          dd.field_g = var17;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (0 != (var4[var17 >> -1553004731] & 1 << (var17 & 31))) {
                          if ((var17 ^ -1) == (ke.field_K ^ -1)) {
                            mo.field_a[var17].f(2 + var6, -2 + var7);
                            break L25;
                          } else {
                            if (var17 != var13) {
                              mo.field_a[var17].f(var6, var7);
                              break L25;
                            } else {
                              mo.field_a[var17].f(1 + var6, var7 + -1);
                              break L25;
                            }
                          }
                        } else {
                          if ((var17 ^ -1) == (ke.field_K ^ -1)) {
                            var8.f(var6 - -2, var7 - 2);
                            break L25;
                          } else {
                            if (var17 != var13) {
                              var8.f(var6, var7);
                              break L25;
                            } else {
                              var8.f(var6 + 1, var7 - 1);
                              break L25;
                            }
                          }
                        }
                      }
                      var16++;
                      continue L23;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              de.a(param1 + -4, param0 + -4, 248, 127, 0);
              de.a(param1 - 3, -3 + param0, 246, 125, 8547138);
              if (param2 <= -27) {
                break L1;
              } else {
                this.field_f = 0.4045710406434804;
                break L1;
              }
            }
            L2: {
              de.a(-2 + param1, param0 - 2, 244, 123, 11833896);
              de.a(param1 + -1, param0 + -1, 242, 121, 0);
              de.c(param1, param0, 240, 119, wm.a(param3, (byte) -122), ng.b((byte) -37, param3));
              if (e.field_M[param3] == null) {
                ue.field_d.field_f = 0;
                e.field_M[param3] = af.a(tj.a(-46, new String[]{Integer.toString(param3)}, "background<%0>"), "", 19412, ue.field_d);
                e.field_M[param3].c(param1, param0);
                e.field_M[param3] = null;
                break L2;
              } else {
                e.field_M[param3].c(param1, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "lc.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!ArcanistsMulti.i((byte) -73)) {
              L1: {
                var2_int = 80;
                if (gm.field_f == 3) {
                  var2_int += 20;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = an.field_f - var2_int;
              de.a(-3 + var3, 3, var2_int, 48, 0);
              de.a(var3 - 2, 2, var2_int, 48, 6837813);
              de.a(-1 + var3, 1, var2_int, 48, 8547138);
              de.a(var3, 0, var2_int, 48, 11768360);
              de.d(1 + var3, -1, var2_int, 48, 0);
              var4 = jf.field_j + -ua.field_P;
              if (param0 == -26733) {
                L2: {
                  if (-6 < (var4 ^ -1)) {
                    if (0 < var4) {
                      L3: {
                        if (4 != (4 & var4)) {
                          break L3;
                        } else {
                          tg.field_b[7].a(10 + (var3 - 5), 6);
                          tg.field_b[7].a(15 + var3, 6);
                          tg.field_b[7].a(-3 + (10 + var3), 10);
                          tg.field_b[7].a(3 + (var3 + 10), 10);
                          break L3;
                        }
                      }
                      L4: {
                        if (-3 == (var4 & 2 ^ -1)) {
                          tg.field_b[7].a(10 + (var3 + -5), 8);
                          tg.field_b[7].a(var3 + 15, 8);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if ((var4 & 1) == 1) {
                          tg.field_b[7].a(var3 - -10, 8);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (ad.field_d <= 0) {
                        if ((ad.field_d ^ -1) >= -1) {
                          mi.field_B.a(mh.field_I + var4, var3 + 25, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
                          break L2;
                        } else {
                          rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[ad.field_d - 1].field_o + 33, 16711680);
                          mi.field_B.a(mh.field_I + var4, var3 - -23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                          break L2;
                        }
                      } else {
                        rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[-1 + ad.field_d].field_y / 2) + (-rb.field_o[-1 + ad.field_d].field_o + 33), 16711680);
                        mi.field_B.a(mh.field_I + var4, var3 + 23, 4, 50, 44, 16777215, -1, 2, 1, 14);
                        break L2;
                      }
                    } else {
                      if (ad.field_d > 0) {
                        L6: {
                          var5 = 19;
                          if (-4 == (gm.field_f ^ -1)) {
                            var5 -= 7;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[-1 + ad.field_d].field_o + var5, 16711680);
                        mi.field_B.a(jl.field_l, var3 - -5, 4, -10 + var2_int, 38, 16777215, -1, 1, 2, 14);
                        break L2;
                      } else {
                        mi.field_B.a(jl.field_l, 5 + var3, 4, -10 + var2_int, 44, 16777215, -1, 1, 1, 14);
                        break L2;
                      }
                    }
                  } else {
                    L7: {
                      tg.field_b[8].a(10 + (var3 + -4), 8);
                      if (-6 <= (var4 ^ -1)) {
                        break L7;
                      } else {
                        mi.field_B.a('+', 17 + var3, 30, 16711935);
                        break L7;
                      }
                    }
                    if (ad.field_d <= 0) {
                      mi.field_B.a(mh.field_I + var4, 23 + var3, 4, var2_int + -30, 44, 16777215, -1, 1, 1, 14);
                      break L2;
                    } else {
                      rb.field_o[-1 + ad.field_d].d(23 + var3, -(rb.field_o[ad.field_d + -1].field_y / 2) + (33 - rb.field_o[-1 + ad.field_d].field_o), 16711680);
                      mi.field_B.a(mh.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                      break L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 41) {
                break L1;
              } else {
                this.g(-83);
                break L1;
              }
            }
            stackIn_4_0 = this.b(param1, param0 + 159) + bi.field_I;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.KA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 75) {
              stackIn_4_0 = 30;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -10;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.NA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void h(int param0) {
        le var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var27 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_85_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        RuntimeException var2_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        qb[][] var12 = null;
        double[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        String var20_ref_String = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        int var26 = 0;
        int[] var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2 = jb.field_z;
                    if (var2 != null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = r.field_b;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var3 = var2.field_V.s(0);
                    var6 = an.field_f / 2;
                    var7 = an.field_j / 2;
                    var8_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var8_int ^ -1) <= -301) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = 3.141592653589793 * (double)var8_int * 2.0 / 300.0;
                    var9_int = var6 - -(int)(Math.sin(var4) * 240.0);
                    var10_int = var7 + (int)(Math.cos(var4) * 160.0);
                    de.c(var9_int, var10_int, 8, 0);
                    var8_int++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    var8_int = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-301 >= (var8_int ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = 2.0 * ((double)var8_int * 3.141592653589793) / 300.0;
                    var9_int = var6 - -(int)(240.0 * Math.sin(var4));
                    var10_int = (int)(Math.cos(var4) * 160.0) + var7;
                    de.i(var9_int, var10_int, 7, 7891535);
                    var8_int++;
                    statePc = 8;
                    continue stateLoop;
                }
                case 11: {
                    var8_int = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((var8_int ^ -1) <= -301) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = 2.0 * (3.141592653589793 * (double)var8_int) / 300.0;
                    var9_int = (int)(Math.sin(var4) * 239.0) + var6;
                    var10_int = (int)(160.0 * Math.cos(var4)) + var7;
                    de.i(var9_int, -1 + var10_int, 4, 11510925);
                    var8_int++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 15: {
                    de.a();
                    var8 = new int[]{255, 0, 0};
                    if (param0 == 32) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_n = -74;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var9 = new int[]{0, 255, 0};
                    var10 = new int[]{0, 0, 255};
                    var11 = new int[]{255, 255, 255};
                    var12 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                    var13 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
                    var14 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = var3;
                    stackIn_20_1 = var14;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 <= stackIn_20_1) {
                        statePc = 94;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = 3.141592653589793 * var13[var14];
                    var15 = var6 - -(int)(240.0 * Math.sin(var4));
                    var16 = uc.field_a * 3 / 4 - (-240 - (int)(140.0 * Math.cos(var4)));
                    var17 = nj.field_n[var14];
                    var18 = -32;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var18 ^ -1) <= -33) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    de.h(0, var16 + var18, an.field_f, var18 + var16 - -8);
                    de.i(var15, -(var18 / 2) + var16, 32, 7891535);
                    de.c(var15, -(var18 / 2) + var16, 32, 0);
                    var18++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 25: {
                    var18 = -32;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (32 <= var18) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    de.h(0, var18 + var16, an.field_f, 8 + (var18 + var16));
                    de.i(var15, -4 + -(var18 / 2) + var16, 28, 13484723);
                    de.c(var15, -4 + -(var18 / 2) + var16, 28, 0);
                    var18++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 30: {
                    de.a();
                    var18 = -5 + var7;
                    var19 = ae.field_d;
                    if (var2.field_I == var2.field_V.d(false)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var19 = qe.field_s;
                    statePc = 36;
                    continue stateLoop;
                }
                case 32: {
                    if (250 <= o.field_s) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var20_ref_String = Integer.toString(5 + -((o.field_s - 1) / 50));
                    tj.field_t.b(var20_ref_String, var6 + -1, var18 + 64, 0, 0);
                    tj.field_t.b(var20_ref_String, var6, var18 + 64 - 1, 0, 0);
                    tj.field_t.b(var20_ref_String, var6, var18 - -64, 16777215, -1);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    mi.field_B.a(var19, var6 - 128 - 1, -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                    mi.field_B.a(var19, -129 + var6, var18 + 1, 256, 64, 0, -1, 1, 0, 14);
                    mi.field_B.a(var19, var6 - 128 + 1, 1 + var18, 256, 64, 0, -1, 1, 0, 14);
                    mi.field_B.a(var19, 1 + (var6 - 128), -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                    mi.field_B.a(var19, -1 + (var6 - 128), var18, 256, 64, 0, 0, 1, 0, 14);
                    mi.field_B.a(var19, var6 + -128, var18 + -1, 256, 64, 0, 0, 1, 0, 14);
                    var16 -= 64;
                    var15 -= 32;
                    mi.field_B.a(var19, -128 + var6, var18, 256, 64, 16777215, -1, 1, 0, 14);
                    var20 = 0;
                    if ((var14 ^ -1) == (jb.field_v / 50 % var3 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var20 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var8[0] = var2.field_V.field_N[var14][0];
                    var8[1] = var2.field_V.field_N[var14][1];
                    var8[2] = var2.field_V.field_N[var14][2];
                    var9[0] = var2.field_V.field_N[var14][3];
                    var9[1] = var2.field_V.field_N[var14][4];
                    var9[2] = var2.field_V.field_N[var14][5];
                    var10[0] = var2.field_V.field_N[var14][6];
                    var10[1] = var2.field_V.field_N[var14][7];
                    var10[2] = var2.field_V.field_N[var14][8];
                    var11[0] = var2.field_V.field_N[var14][9];
                    var11[1] = var2.field_V.field_N[var14][10];
                    var11[2] = var2.field_V.field_N[var14][11];
                    pc.a(var10, var16 - 2, var11, var8, (byte) -101, var9, var12[8][0], 0 + var15);
                    pc.a(var10, var16 + var20 - 0, var11, var8, (byte) 34, var9, var12[3][var2.field_V.field_N[var14][15]], var15 + 12);
                    pc.a(var10, 0 + var16, var11, var8, (byte) 56, var9, var12[1][var2.field_V.field_N[var14][12]], 0 + var15);
                    pc.a(var10, var16 + 2, var11, var8, (byte) 39, var9, var12[7][0], var15 + 0);
                    pc.a(var10, -40 + var16 - -16, var11, var8, (byte) -121, var9, var12[0][var2.field_V.field_N[var14][13]], 0 + var15);
                    pc.a(var10, -8 + var16, var11, var8, (byte) 37, var9, var12[4][var2.field_V.field_N[var14][17]], 0 + var15);
                    if (53 == var2.field_V.field_N[var14][17]) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (55 == var2.field_V.field_N[var14][17]) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    pc.a(var10, -40 + var16 - -32, var11, var8, (byte) -118, var9, var12[6][var14], 0 + var15);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    pc.a(var10, 16 + var16 + -40, var11, var8, (byte) -105, var9, var12[5][var2.field_V.field_N[var14][16]], var15 + 0);
                    pc.a(var10, var20 - -var16 - 0, var11, var8, (byte) 118, var9, var12[2][var2.field_V.field_N[var14][14]], -12 + var15);
                    var15 += 32;
                    var16 += 64;
                    var21 = var2.field_V.field_k[var14];
                    var16 += 16;
                    var22 = mi.field_B.b("Wmmmmmmmmmmm");
                    var15 = var15 - (var22 / 2 + 7);
                    var23 = 15 + var22;
                    de.c(var15 + 3, -8 + (var16 - -3), -6 + var23, 15, var17, (8421504 | var17) ^ 8421504);
                    de.h(var15 - -3, -8 + var16 + 3, 3 + var15 + (var23 + -6), -10 + var16 - -20);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (0 >= var23) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var23 = var23 - g.field_a.field_n;
                    g.field_a.b(3 + var15 + var23, -10 + (3 + (-8 + var16)), 64);
                    statePc = 47;
                    continue stateLoop;
                }
                case 50: {
                    de.a();
                    var23 = var22 + 15;
                    de.a(var15, -8 + var16, var23, 21, 6, 0);
                    de.a(var15 + 2, -8 + (var16 - -2), -4 + var23, 17, 4, 0);
                    de.a(var15 + 1, -8 + (var16 + 1), -2 + var23, 19, 6, 16777215);
                    de.a(2 + var15, var16 - -2 - 8, -4 + var23, 17, 6, 0);
                    var15 = var15 + (7 + var22 / 2);
                    mi.field_B.b(var21, -1 + var15, 1 + var16 + mi.field_B.field_C / 2, 0, 0);
                    mi.field_B.b(var21, var15, -1 + (var16 - (-1 + -(mi.field_B.field_C / 2))), 0, 0);
                    mi.field_B.b(var21, var15, mi.field_B.field_C / 2 + (1 + var16), 16777215, -1);
                    var16 -= 20;
                    var15 -= 40;
                    var16 -= 10;
                    var23 = 1;
                    var31 = var2.field_V.e(3, var14);
                    var25 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if ((var25 ^ -1) <= -17) {
                        statePc = 91;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var26 = var31[var25];
                    stackIn_20_0 = var26 ^ -1;
                    stackIn_53_0 = stackIn_20_0;
                    stackIn_20_1 = -13;
                    stackIn_53_1 = stackIn_20_1;
                    if (false) {
                        statePc = 20;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 > stackIn_53_1) {
                        statePc = 90;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (((-12 + var26) % 12 ^ -1) <= -11) {
                        statePc = 58;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((var26 ^ -1) > -1) {
                        statePc = 90;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (((-6 + var26) / 12 ^ -1) != -1) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    de.c(var15 - -10, 10 + var16, 10, 8912896, 256);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (-2 != ((var26 - 6) / 12 ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    de.c(10 + var15, 10 + var16, 10, 8404992, 256);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((var26 - 6) / 12 == 2) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    de.c(10 + var15, 10 + var16, 10, 8947712, 256);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (-4 != ((-6 + var26) / 12 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    de.c(10 + var15, 10 + var16, 10, 34952, 256);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (4 == (-6 + var26) / 12) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    de.c(var15 - -10, 10 + var16, 10, 8947848, 256);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (5 != (-6 + var26) / 12) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    de.c(10 + var15, var16 - -10, 10, 65280, 256);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    gn.a(10, (byte) 99, 256, var15 + 10, var16 + 10);
                    if (var23 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_85_0 = 1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var23 = stackIn_85_0;
                    bb.field_g[dd.field_f[var26]].b(var15, var16);
                    if (var23 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var15 += 20;
                    statePc = 90;
                    continue stateLoop;
                }
                case 88: {
                    var15 -= 20;
                    var16 -= 20;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var25++;
                    statePc = 51;
                    continue stateLoop;
                }
                case 91: {
                    var14++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var11_int = 0;
        int var33 = 0;
        int stackIn_73_0 = 0;
        int[] stackIn_114_0;
        int stackIn_114_1;
        int[] stackIn_114_2;
        int[] stackIn_114_3;
        int stackIn_114_4;
        int[] stackIn_114_5;
        qb[] stackIn_114_6;
        int[] stackIn_115_0;
        int stackIn_115_1;
        int[] stackIn_115_2;
        int[] stackIn_115_3;
        int stackIn_115_4;
        int[] stackIn_115_5;
        qb[] stackIn_115_6;
        int stackIn_115_7;
        StringBuilder stackIn_137_0 = null;
        StringBuilder stackIn_138_0 = null;
        String stackIn_138_1 = null;
        StringBuilder stackIn_141_0 = null;
        StringBuilder stackIn_142_0 = null;
        String stackIn_142_1 = null;
        int stackIn_157_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        qb[][] var13 = null;
        StringBuilder var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        int var28 = 0;
        Object var29 = null;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        var33 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = jb.field_z;
              if (var2 == null) {
                var2 = r.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = var2.field_V.s(0);
              var4 = var2.field_V.d(false);
              if (0 <= var4) {
                if (!var2.field_V.field_d) {
                  break L2;
                } else {
                  var4 = var4 & 1;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var7 = an.field_f / 2;
            var8 = an.field_j / 2;
            var9_int = 0;
            L3: while (true) {
              if (var9_int >= 300) {
                var9_int = 0;
                L4: while (true) {
                  if (300 <= var9_int) {
                    var9_int = 0;
                    L5: while (true) {
                      if (300 <= var9_int) {
                        L6: {
                          de.a();
                          var9 = new int[]{255, 0, 0};
                          var10 = new int[]{0, 255, 0};
                          var11 = new int[]{0, 0, 255};
                          var12 = new int[]{255, 255, 255};
                          var13 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                          var14 = new StringBuilder(20);
                          if (null == var2.field_w) {
                            break L6;
                          } else {
                            var2.field_V = var2.field_w;
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 >= (var4 ^ -1)) {
                            if (var2.field_V.field_d) {
                              L8: {
                                if (0 != var4) {
                                  break L8;
                                } else {
                                  discarded$0 = var14.append(rn.field_K + b.field_d + "<br><br>");
                                  break L8;
                                }
                              }
                              if (1 != var4) {
                                break L7;
                              } else {
                                discarded$1 = var14.append(rn.field_K + cn.field_I + "<br><br>");
                                break L7;
                              }
                            } else {
                              discarded$2 = var14.append(rn.field_K + var2.field_V.field_k[var4] + "<br><br>");
                              break L7;
                            }
                          } else {
                            if (-2 == var4) {
                              discarded$3 = var14.append(ff.field_d);
                              break L7;
                            } else {
                              discarded$4 = var14.append(th.field_a);
                              break L7;
                            }
                          }
                        }
                        L9: {
                          var15 = var14.toString();
                          if (var2.field_V.d(1)) {
                            var16 = 0;
                            incrementValue$5 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$5, lo.field_v);
                            incrementValue$6 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$6, tm.field_e);
                            incrementValue$7 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$7, qa.field_p);
                            incrementValue$8 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$8, ej.field_N);
                            incrementValue$9 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$9, tl.field_e);
                            incrementValue$10 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$10, be.field_a);
                            incrementValue$11 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$11, q.field_J);
                            incrementValue$12 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$12, wk.field_h);
                            incrementValue$13 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$13, ed.field_Eb);
                            incrementValue$14 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$14, ob.field_X);
                            incrementValue$15 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$15, ao.field_a);
                            incrementValue$16 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$16, co.field_b);
                            incrementValue$17 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$17, gi.field_i);
                            incrementValue$18 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$18, nj.field_i);
                            incrementValue$19 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$19, rk.field_S);
                            incrementValue$20 = var16;
                            var16++;
                            var15 = lk.a(var15, 10, incrementValue$20, gk.field_a);
                            if (lk.a(0, (byte) -36)) {
                              incrementValue$21 = var16;
                              var16++;
                              var15 = lk.a(var15, 10, incrementValue$21, lj.field_q);
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var15 = nj.field_b;
                            break L9;
                          }
                        }
                        var16 = 128 + 14 * mi.field_B.a(var15, 256);
                        var17 = jb.field_v / 3 % var16 - 128;
                        var18 = uc.field_a + 180;
                        de.h(0, var18, an.field_f, 128 + var18);
                        mi.field_B.a(var15, -128 + var7 - 1, -var17 + -1 + var18, 256, 256, 0, -1, 1, 0, 14);
                        mi.field_B.a(var15, var7 + -129, -var17 + var18 + 1, 256, 256, 0, -1, 1, 0, 14);
                        mi.field_B.a(var15, -128 + var7 - -1, -var17 + (var18 - -1), 256, 256, 0, -1, 1, 0, 14);
                        mi.field_B.a(var15, -128 + var7 - -1, -var17 + var18 + -1, 256, 256, 0, -1, 1, 0, 14);
                        mi.field_B.a(var15, var7 - 129, -var17 + var18, 256, 256, 0, 0, 1, 0, 14);
                        mi.field_B.a(var15, var7 + -128, -1 + (var18 + -var17), 256, 256, 0, 0, 1, 0, 14);
                        mi.field_B.a(var15, -128 + var7, -var17 + var18, 256, 256, 16777215, -1, 1, 0, 14);
                        de.a();
                        de.d(3, 2, -128 + var7, -1 + var18, 256, 2);
                        de.d(2, 1, -128 + var7, var18 - -1, 256, 1);
                        de.d(1, 1, -128 + var7, 2 + var18, 256, 1);
                        de.d(1, 1, -128 + var7, -3 + (128 + var18), 256, 1);
                        de.d(2, 1, -128 + var7, -2 + (128 + var18), 256, 1);
                        de.d(3, 2, var7 - 128, var18 + 127, 256, 2);
                        var19 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
                        var20 = 0;
                        if (param0) {
                          L10: while (true) {
                            if ((var20 ^ -1) <= (var3 ^ -1)) {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              L11: {
                                L12: {
                                  L13: {
                                    var5 = var19[var20] * 3.141592653589793;
                                    if (var2.field_V.field_d) {
                                      break L13;
                                    } else {
                                      if (var4 == var20) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (!var2.field_V.field_d) {
                                      break L14;
                                    } else {
                                      if ((var4 ^ -1) != (var20 & 1 ^ -1)) {
                                        break L14;
                                      } else {
                                        if (-1 != (1 << var20 & var2.field_J ^ -1)) {
                                          break L14;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  stackIn_73_0 = 0;
                                  break L11;
                                }
                                stackIn_73_0 = 1;
                                break L11;
                              }
                              L15: {
                                var21 = stackIn_73_0;
                                var22 = (int)(240.0 * Math.sin(var5)) + var7;
                                var23 = uc.field_a / 2 + (240 - -(int)(140.0 * Math.cos(var5)));
                                var24 = nj.field_n[var20];
                                if (var21 == 0) {
                                  var25 = -32;
                                  L16: while (true) {
                                    if (-33 >= (var25 ^ -1)) {
                                      var25 = -32;
                                      L17: while (true) {
                                        if (var25 >= 32) {
                                          break L15;
                                        } else {
                                          de.h(0, var23 - -var25, an.field_f, var25 + var23 - -8);
                                          de.i(var22, -4 + var23 - var25 / 2, 28, 13484723);
                                          de.c(var22, -4 + -(var25 / 2) + var23, 28, 0);
                                          var25++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      de.h(0, var23 + var25, an.field_f, 8 + var25 + var23);
                                      de.i(var22, var23 - var25 / 2, 32, 7891535);
                                      de.c(var22, -(var25 / 2) + var23, 32, 0);
                                      var25++;
                                      continue L16;
                                    }
                                  }
                                } else {
                                  var25 = -48;
                                  L18: while (true) {
                                    if (-49 >= (var25 ^ -1)) {
                                      var23 -= 16;
                                      break L15;
                                    } else {
                                      de.h(0, var25 + (var23 - 16), an.field_f, 24 + var23 - -var25);
                                      de.i(var22, -4 + (-(var25 / 2) + var23 + -16), 28, 13484723);
                                      gn.a(48, (byte) 90, 32, var22, -16 + (-(var25 / 2) + var23 + -4));
                                      de.c(var22, -16 + -(var25 / 2) + var23 + -4, 28, 0);
                                      var25++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                              L19: {
                                var23 -= 64;
                                var22 -= 32;
                                de.a();
                                var25 = 0;
                                var26 = 0;
                                if (var21 != 0) {
                                  var25 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                                  if (-1 == (jb.field_v / 50 % 5 ^ -1)) {
                                    var26 = var25;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                var9[0] = var2.field_V.field_N[var20][0];
                                var9[1] = var2.field_V.field_N[var20][1];
                                var9[2] = var2.field_V.field_N[var20][2];
                                var10[0] = var2.field_V.field_N[var20][3];
                                var10[1] = var2.field_V.field_N[var20][4];
                                var10[2] = var2.field_V.field_N[var20][5];
                                var11[0] = var2.field_V.field_N[var20][6];
                                var11[1] = var2.field_V.field_N[var20][7];
                                var11[2] = var2.field_V.field_N[var20][8];
                                var12[0] = var2.field_V.field_N[var20][9];
                                var12[1] = var2.field_V.field_N[var20][10];
                                var12[2] = var2.field_V.field_N[var20][11];
                                if (46 != var2.field_V.field_N[var20][12]) {
                                  pc.a(var11, -2 + (var23 - -var26), var12, var9, (byte) 29, var10, var13[8][0], var22 + 0);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                pc.a(var11, var23 + var25 - (0 - var26 / 2), var12, var9, (byte) -82, var10, var13[3][var2.field_V.field_N[var20][15]], 12 + var22);
                                pc.a(var11, 0 + var23 + var26 * 3 / 2, var12, var9, (byte) -81, var10, var13[1][var2.field_V.field_N[var20][12]], var22 + 0);
                                if (-47 == (var2.field_V.field_N[var20][12] ^ -1)) {
                                  break L21;
                                } else {
                                  pc.a(var11, 2 + var23, var12, var9, (byte) -93, var10, var13[7][0], var22 - 0);
                                  break L21;
                                }
                              }
                              L22: {
                                if (var21 != 0) {
                                  break L22;
                                } else {
                                  var23 += 16;
                                  var22 += 8;
                                  break L22;
                                }
                              }
                              L23: {
                                pc.a(var11, -40 + (var23 + (16 - -(var26 * 3 / 2))), var12, var9, (byte) 92, var10, var13[0][var2.field_V.field_N[var20][13]], var22 + 0);
                                pc.a(var11, var23 - (-32 + (40 + -(var26 * 3 / 2))), var12, var9, (byte) -125, var10, var13[4][var2.field_V.field_N[var20][17]], var22 - 0);
                                if (-54 == (var2.field_V.field_N[var20][17] ^ -1)) {
                                  break L23;
                                } else {
                                  if (-56 == (var2.field_V.field_N[var20][17] ^ -1)) {
                                    break L23;
                                  } else {
                                    L24: {
                                      stackIn_114_0 = (int[]) (var11);

                                      stackIn_114_1 = var23 - -32 + (-40 - -(var26 * 3 / 2));

                                      stackIn_114_2 = (int[]) (var12);

                                      stackIn_114_3 = (int[]) (var9);

                                      stackIn_114_4 = 20;

                                      stackIn_114_5 = (int[]) (var10);

                                      stackIn_114_6 = var13[6];

                                      if (var21 != 0) {
                                        stackIn_115_0 = (int[]) ((Object) stackIn_114_0);
                                        stackIn_115_1 = stackIn_114_1;
                                        stackIn_115_2 = (int[]) ((Object) stackIn_114_2);
                                        stackIn_115_3 = (int[]) ((Object) stackIn_114_3);
                                        stackIn_115_4 = stackIn_114_4;
                                        stackIn_115_5 = (int[]) ((Object) stackIn_114_5);
                                        stackIn_115_6 = (qb[]) ((Object) stackIn_114_6);
                                        stackIn_115_7 = 8;
                                        break L24;
                                      } else {







                                        stackIn_115_0 = (int[]) ((Object) stackIn_114_0);
                                        stackIn_115_1 = stackIn_114_1;
                                        stackIn_115_2 = (int[]) ((Object) stackIn_114_2);
                                        stackIn_115_3 = (int[]) ((Object) stackIn_114_3);
                                        stackIn_115_4 = stackIn_114_4;
                                        stackIn_115_5 = (int[]) ((Object) stackIn_114_5);
                                        stackIn_115_6 = (qb[]) ((Object) stackIn_114_6);
                                        stackIn_115_7 = 16;
                                        break L24;
                                      }
                                    }
                                    pc.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_115_3, (byte) stackIn_115_4, stackIn_115_5, stackIn_115_6[stackIn_115_7 + (var20 + jb.field_v / 200) % 8], var22 - 0);
                                    break L23;
                                  }
                                }
                              }
                              L25: {
                                pc.a(var11, 3 * var26 / 2 + var23 + 16 - 40, var12, var9, (byte) -102, var10, var13[5][var2.field_V.field_N[var20][16]], var22 + 0);
                                if (var21 != 0) {
                                  break L25;
                                } else {
                                  var23 -= 16;
                                  var22 -= 8;
                                  break L25;
                                }
                              }
                              L26: {
                                pc.a(var11, var26 * 2 + (var25 - -var23 + 0), var12, var9, (byte) -88, var10, var13[2][var2.field_V.field_N[var20][14]], var22 + -12);
                                var22 += 32;
                                var23 += 64;
                                var27 = var2.field_V.field_k[var20];
                                var28 = mi.field_B.b("Wmmmmmmmmmmm");
                                if (var4 != var20) {
                                  break L26;
                                } else {
                                  var23 += 16;
                                  break L26;
                                }
                              }
                              var22 = var22 - (var28 / 2 + 7);
                              var23 += 16;
                              var16 = 15 + var28;
                              de.c(var22 + 3, -8 + (var23 - -3), var16 + -6, 15, var24, 8421504 ^ (8421504 | var24));
                              de.h(var22 - -3, -5 + var23, var16 + 3 + var22 + -6, -2 + (17 + (var23 + -8)) - -3);
                              L27: while (true) {
                                if ((var16 ^ -1) >= -1) {
                                  L28: {
                                    de.a();
                                    var16 = 15 + var28;
                                    de.a(var22, var23 - 8, var16, 21, 6, 0);
                                    de.a(2 + var22, -6 + var23, -4 + var16, 17, 4, 0);
                                    de.a(1 + var22, 1 + var23 - 8, var16 + -2, 19, 6, 16777215);
                                    de.a(var22 + 2, -8 + (2 + var23), -4 + var16, 17, 6, 0);
                                    var22 = var22 + (7 + var28 / 2);
                                    var29 = null;
                                    if ((1 << var20 & var2.field_b) != 0) {
                                      var29 = hf.field_b;
                                      break L28;
                                    } else {
                                      if (-1 > ((var2.field_a ^ -1) & var2.field_b ^ -1)) {
                                        if ((1 << var20 & var2.field_a ^ -1) != -1) {
                                          var29 = ea.field_I;
                                          break L28;
                                        } else {
                                          L29: {
                                            stackIn_137_0 = new StringBuilder().append(field_r);

                                            if (((jb.field_v & 11) >> 364106947 ^ -1) != -1) {
                                              stackIn_138_0 = (StringBuilder) ((Object) stackIn_137_0);
                                              stackIn_138_1 = ".";
                                              break L29;
                                            } else {

                                              stackIn_138_0 = (StringBuilder) ((Object) stackIn_137_0);
                                              stackIn_138_1 = "";
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            stackIn_141_0 = ((StringBuilder) (Object) stackIn_138_0).append(stackIn_138_1);

                                            if ((2 & jb.field_v >> -1490343933 ^ -1) == -1) {
                                              stackIn_142_0 = (StringBuilder) ((Object) stackIn_141_0);
                                              stackIn_142_1 = "";
                                              break L30;
                                            } else {
                                              stackIn_142_0 = (StringBuilder) ((Object) stackIn_141_0);
                                              stackIn_142_1 = "..";
                                              break L30;
                                            }
                                          }
                                          var29 = stackIn_142_1;
                                          break L28;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (var29 == null) {
                                      break L31;
                                    } else {
                                      if (0 != (128 & jb.field_v)) {
                                        break L31;
                                      } else {
                                        var27 = var29;
                                        break L31;
                                      }
                                    }
                                  }
                                  L32: {
                                    mi.field_B.b((String) (var27), var22 + -1, var23 + 1 + mi.field_B.field_C / 2, 0, 0);
                                    mi.field_B.b((String) (var27), var22, -1 + (mi.field_B.field_C / 2 + 1) + var23, 0, 0);
                                    mi.field_B.b((String) (var27), var22, mi.field_B.field_C / 2 + var23 + 1, 16777215, -1);
                                    var22 -= 16;
                                    var23 -= 32;
                                    if (var2.field_V.d(1)) {
                                      L33: {
                                        if (!var2.field_i) {
                                          stackIn_157_0 = 0;
                                          break L33;
                                        } else {
                                          stackIn_157_0 = var2.field_V.d(-108, var20);
                                          break L33;
                                        }
                                      }
                                      var30 = stackIn_157_0;
                                      var31 = new qb(32 + (24 + var30 * 8), 80);
                                      var31.a();
                                      var32 = 0;
                                      L34: while (true) {
                                        if ((var32 ^ -1) <= (var30 ^ -1)) {
                                          de.d(4, 4, 0, 0, 8 * var30 + 24 - -32, 80);
                                          ce.field_m.a(true);
                                          var31.b(-(var30 * 8) + (var22 + -36), -24 + var23 - 16, 256);
                                          var31.b(-14 + (var22 + (-(8 * var30) - 16)) + 6, -16 + (-24 + var23), 256);
                                          var31.b(var22 - (8 * var30 + 30), -24 + var23 + -22, 256);
                                          var31.b(-16 + -(var30 * 8) + var22 + -14, -34 + var23, 256);
                                          var32 = 0;
                                          L35: while (true) {
                                            if (var32 >= var30) {
                                              break L32;
                                            } else {
                                              tg.field_b[7].a(-14 + -(var32 * 8) + var22, var23 + -16);
                                              var32++;
                                              continue L35;
                                            }
                                          }
                                        } else {
                                          tg.field_b[7].a(16 + 8 * var32 - -8, 24, 0, 16744703);
                                          var32++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var20++;
                                  continue L10;
                                } else {
                                  var16 = var16 - g.field_a.field_n;
                                  g.field_a.b(var22 + (3 - -var16), 3 + (var23 + -18), 64);
                                  continue L27;
                                }
                              }
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
                        var10_int = (int)(239.0 * Math.sin(var5)) + var7;
                        var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                        de.i(var10_int, -1 + var11_int, 4, 11510925);
                        var9_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var5 = 3.141592653589793 * (double)var9_int * 2.0 / 300.0;
                    var10_int = (int)(240.0 * Math.sin(var5)) + var7;
                    var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                    de.i(var10_int, var11_int, 7, 7891535);
                    var9_int++;
                    continue L4;
                  }
                }
              } else {
                var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
                var10_int = var7 - -(int)(Math.sin(var5) * 240.0);
                var11_int = var8 + (int)(160.0 * Math.cos(var5));
                de.c(var10_int, var11_int, 8, 0);
                var9_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.JA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_0;
        int stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_29_0;
        int stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_30_0;
        int stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param3) {
                  break L2;
                } else {
                  if (an.field_g < param4) {
                    break L2;
                  } else {
                    if ((param1 + param4 ^ -1) >= (an.field_g ^ -1)) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) < (me.field_I ^ -1)) {
                        break L2;
                      } else {
                        if (me.field_I >= param5 + param6) {
                          break L2;
                        } else {
                          stackIn_16_0 = 1;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 0;
              break L1;
            }
            L3: {
              var8_int = stackIn_16_0;
              de.a(param4, param6, param1, param5, 14802120);
              param6++;
              param5 -= 2;
              param4++;
              param1 -= 2;
              de.a(param4, param6, param1, param5, 1572892);
              param1 -= 2;
              param5 -= 2;
              param4++;
              param6++;
              de.a(param4, param6, param1, param5, 7887708);
              param4++;
              param1 -= 2;
              var9 = -96 % ((32 - param2) / 42);
              param6++;
              param5 -= 2;
              if (param0) {
                L4: {
                  stackIn_29_0 = param4;

                  stackIn_29_1 = param6;

                  stackIn_29_2 = param1;

                  stackIn_29_3 = param5;

                  if (var8_int == 0) {
                    stackIn_30_0 = stackIn_29_0;
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = stackIn_29_2;
                    stackIn_30_3 = stackIn_29_3;
                    stackIn_30_4 = 13220778;
                    break L4;
                  } else {




                    stackIn_30_0 = stackIn_29_0;
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = stackIn_29_2;
                    stackIn_30_3 = stackIn_29_3;
                    stackIn_30_4 = 16181230;
                    break L4;
                  }
                }
                de.e(stackIn_30_0, stackIn_30_1, stackIn_30_2, stackIn_30_3, stackIn_30_4, 230);
                break L3;
              } else {
                L5: {
                  stackIn_22_0 = param4;

                  stackIn_22_1 = param6;

                  stackIn_22_2 = param1;

                  stackIn_22_3 = param5;

                  if (var8_int != 0) {
                    stackIn_23_0 = stackIn_22_0;
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = stackIn_22_3;
                    stackIn_23_4 = 14075852;
                    break L5;
                  } else {




                    stackIn_23_0 = stackIn_22_0;
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = stackIn_22_3;
                    stackIn_23_4 = 11374744;
                    break L5;
                  }
                }
                de.e(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, 230);
                break L3;
              }
            }
            de.b(param4 - 1, param6 - -3, param4 - -4, param6 + -2, 1572892);
            de.b(param4 - 2, 5 + param6, 5 + param4, param6 - 2, 14802120);
            de.b(-1 + param4, 5 + param6, 5 + param4, -1 + param6, 1572892);
            de.b(param4, 5 + param6, 5 + param4, param6, 7887708);
            de.b(param1 + (param4 - 0), param6 - -3, param1 + (-5 + param4), -2 + param6, 1572892);
            de.b(param1 + (1 + param4), param6 + 5, param1 + (param4 + -6), -2 + param6, 14802120);
            de.b(param4 + 0 - -param1, param6 + 5, -6 + (param4 + param1), param6 + -1, 1572892);
            de.b(-1 + param4 + param1, 5 + param6, param1 + (-6 + param4), param6, 7887708);
            de.b(param4 - 1, param6 - (4 + -param5), 4 + param4, 1 + param6 - -param5, 1572892);
            de.b(param4 - 2, param6 + -6 + param5, 5 + param4, param5 + 1 + param6, 14802120);
            de.b(-1 + param4, param5 + (-6 + param6), 5 + param4, param5 + (0 + param6), 1572892);
            de.b(param4, param5 + -6 + param6, 5 + param4, param5 + param6 - 1, 7887708);
            de.b(param4 - 0 - -param1, param5 + (-4 + param6), param1 + (-5 + param4), param6 - -1 + param5, 1572892);
            de.b(param1 + 1 + param4, param5 + param6 + -6, param4 + (-6 + param1), param5 + 1 + param6, 14802120);
            de.b(param1 + (param4 - 0), param6 - 6 - -param5, param4 + -6 + param1, param5 + (param6 + 0), 1572892);
            de.b(param4 - (1 + -param1), param5 + (param6 - 6), -6 + (param4 - -param1), -1 + (param5 + param6), 7887708);
            stackIn_32_0 = var8_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var8), "lc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_32_0 != 0;
    }

    private final void d(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!lc.a((byte) 112)) {
              L1: {
                if (null == nj.field_e) {
                  nj.field_e = eb.a(true, 10, 0, 7);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var2_int = 125 + uc.field_a + -16;
                var2_int += 16;
                var3 = 0;
                mi.field_B.b(rd.field_d, no.field_tb[0] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(ej.field_H, no.field_tb[1] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(oo.field_o, no.field_tb[2] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(fc.field_d, no.field_tb[3] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(sl.field_N, no.field_tb[4] + bi.field_I, var2_int, var3, -1);
                if (param0) {
                  break L2;
                } else {
                  this.f(-123);
                  break L2;
                }
              }
              L3: {
                var2_int = var2_int + (8 + tj.field_t.field_C);
                if (!nj.field_e.field_g) {
                  var4 = ba.field_f;
                  break L3;
                } else {
                  if (null != nj.field_e.field_r) {
                    var4 = rm.field_d;
                    var5 = nj.field_e.field_r[ie.field_Sb];
                    var6 = nj.field_e.field_l[ie.field_Sb];
                    var7 = 0;
                    var8 = 0;
                    L4: while (true) {
                      if (-11 >= (var8 ^ -1)) {
                        if (var7 == 0) {
                          var3 = 16776960;
                          this.a(var3, nj.field_e.field_k, ah.field_b, nj.field_e.field_s, nj.field_e.field_i, -1, (byte) -126, nj.field_e.field_h, var2_int);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (null != var5[var8]) {
                            L6: {
                              var3 = 0;
                              if ((var8 & 1) == 1) {
                                var3 = 16777215;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              var9 = var5[var8];
                              if (var9.equals(ah.field_b)) {
                                var3 = 16776960;
                                var7 = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.a(var3, var6[4 * var8 - -1], var9, var6[3 + var8 * 4], var6[4 * var8], var8, (byte) -114, var6[2 + var8 * 4], var2_int);
                            var4 = "";
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2_int += 25;
                        var8++;
                        continue L4;
                      }
                    }
                  } else {
                    var4 = rk.field_R;
                    break L3;
                  }
                }
              }
              L8: {
                var3 = 0;
                var2_int = -16 + uc.field_a - -125;
                de.d(-((-no.field_tb[0] + no.field_tb[1]) / 2) + no.field_tb[0] + bi.field_I, 16 + (var2_int - -9), 276, var3);
                de.d(bi.field_I + (no.field_tb[0] - -no.field_tb[1]) / 2, 16 + (9 + var2_int), 276, var3);
                de.d(bi.field_I + (no.field_tb[2] + no.field_tb[1]) / 2, 16 + (9 + var2_int), 276, var3);
                de.d(bi.field_I + (no.field_tb[2] - -no.field_tb[3]) / 2, 16 + var2_int - -9, 276, var3);
                de.d(bi.field_I + (no.field_tb[3] + no.field_tb[4]) / 2, 9 + var2_int + 16, 276, var3);
                if ("" != var4) {
                  var2_int = 16 + uc.field_a - -125;
                  mi.field_B.a(var4, bi.field_I + 64, -16 + var2_int, 0, -1);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (ie.field_Sb != 0) {
                  var2_int = uc.field_a - -125;
                  mi.field_B.b(ij.field_Cb, 320 + bi.field_I, var2_int - 16, 0, -1);
                  break L9;
                } else {
                  var2_int = uc.field_a - -125;
                  mi.field_B.b(me.field_N, bi.field_I + 320, var2_int - 16, 0, -1);
                  break L9;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.g(12);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != 103) {
            return;
        }
        try {
            if (6 == this.field_l) {
                nj.field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lc.D(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int stackIn_63_0;
        int stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_68_5;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = wl.field_L[this.field_l][param2];
              var5 = ce.field_g[var4_int];
              if ((var4_int ^ -1) != -9) {
                break L1;
              } else {
                L2: {
                  if (th.field_f == 0) {
                    break L2;
                  } else {
                    if (mn.field_r == 0) {
                      break L2;
                    } else {
                      if (10 == th.field_f) {
                        break L2;
                      } else {
                        if (10 != mn.field_r) {
                          L3: {
                            if ((th.field_f ^ -1) == -2) {
                              break L3;
                            } else {
                              if (mn.field_r != 1) {
                                L4: {
                                  if (-3 == (th.field_f ^ -1)) {
                                    break L4;
                                  } else {
                                    if (2 == mn.field_r) {
                                      break L4;
                                    } else {
                                      if (3 == th.field_f) {
                                        break L4;
                                      } else {
                                        if (3 == mn.field_r) {
                                          break L4;
                                        } else {
                                          if (-5 == (th.field_f ^ -1)) {
                                            break L4;
                                          } else {
                                            if (mn.field_r != 4) {
                                              L5: {
                                                if (-16 == (th.field_f ^ -1)) {
                                                  break L5;
                                                } else {
                                                  if (mn.field_r != 15) {
                                                    break L1;
                                                  } else {
                                                    break L5;
                                                  }
                                                }
                                              }
                                              var5 = ce.field_g[14];
                                              break L1;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var5 = q.field_I;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5 = ja.field_r;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = ce.field_g[7];
                break L1;
              }
            }
            L6: {
              L7: {
                var6 = tj.field_t.b(var5);
                var7 = this.d(41, param2);
                var8 = this.a(param2, (byte) 103);
                var9 = this.f(param2, -7661);
                if (-21 == (var4_int ^ -1)) {
                  break L7;
                } else {
                  if (var4_int == 21) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              var6 = ff.field_c - -120;
              break L6;
            }
            L8: {
              var10 = -var6 + (var7 + var8) >> 574804385;
              var11 = this.c(param2, 110);
              var12 = -var7 + var8;
              var13 = this.c(param2, 100);
              var14 = 0;
              if (-1 == (this.field_l ^ -1)) {
                break L8;
              } else {
                if (15 == this.field_l) {
                  break L8;
                } else {
                  L9: {
                    stackIn_63_0 = var7 + 2;

                    stackIn_63_1 = 1 + var9;

                    stackIn_63_2 = var12 - 4;

                    stackIn_63_3 = -2 + var13;

                    if (!param1) {
                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = stackIn_63_1;
                      stackIn_64_2 = stackIn_63_2;
                      stackIn_64_3 = stackIn_63_3;
                      stackIn_64_4 = 0;
                      break L9;
                    } else {




                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = stackIn_63_1;
                      stackIn_64_2 = stackIn_63_2;
                      stackIn_64_3 = stackIn_63_3;
                      stackIn_64_4 = 2964062;
                      break L9;
                    }
                  }
                  L10: {










                    if (param1) {





                      stackIn_68_5 = 16711164;
                      break L10;
                    } else {





                      stackIn_68_5 = 5928124;
                      break L10;
                    }
                  }
                  de.c(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4, stackIn_68_5);
                  var14 = 1;
                  de.a(1 + var7, var9, var12 - 2, var13, 5, 0);
                  de.a(var7, var9 + -1, var12, var13 + 2, 6, 16777215);
                  de.h(var7 + 2, 1 + var9, var12 + (2 + var7 + -4), -2 + (1 + var9 + var13));
                  var15 = 2 + var7;
                  L11: while (true) {
                    if ((var12 + (2 + var7 - 4) ^ -1) >= (var15 ^ -1)) {
                      de.a();
                      de.c(var7 + 4, var9 - -2, var12 + -8, 9, 4, 16777215, 64);
                      de.c(5 + var7, var9 + 3, var12 - 10, 7, 3, 16777215, 64);
                      break L8;
                    } else {
                      sm.field_d.b(var15, -16 + var9, 32);
                      var15 = var15 + sm.field_d.field_n;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (!param1) {
                stackIn_77_0 = 16173159;
                break L12;
              } else {
                stackIn_77_0 = 7097239;
                break L12;
              }
            }
            L13: {
              var15 = stackIn_77_0;
              if (param1) {
                stackIn_81_0 = 16598235;
                break L13;
              } else {
                stackIn_81_0 = 16738820;
                break L13;
              }
            }
            L14: {
              var16 = stackIn_81_0;
              if (lc.a((byte) 112)) {
                break L14;
              } else {
                if (0 >= ah.field_c) {
                  break L14;
                } else {
                  if (-16 == (var4_int ^ -1)) {
                    L15: {
                      if (!param1) {
                        stackIn_93_0 = 0;
                        break L15;
                      } else {
                        stackIn_93_0 = 7097239;
                        break L15;
                      }
                    }
                    L16: {
                      var15 = stackIn_93_0;
                      if (!param1) {
                        stackIn_97_0 = 16738820;
                        break L16;
                      } else {
                        stackIn_97_0 = 16777215;
                        break L16;
                      }
                    }
                    var16 = stackIn_97_0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L17: {
              var17 = var15;
              if (param1) {
                stackIn_102_0 = 7536857;
                break L17;
              } else {
                stackIn_102_0 = 10027008;
                break L17;
              }
            }
            L18: {
              var18 = stackIn_102_0;
              if (param0 == 98) {
                break L18;
              } else {
                this.d(false);
                break L18;
              }
            }
            L19: {
              if (var14 != 0) {
                var17 = var16;
                var18 = 0;
                break L19;
              } else {
                if ((wl.field_L[this.field_l].length ^ -1) < -2) {
                  var17 = km.a(param2, wl.field_L[this.field_l].length, -1422079448, var16, var15);
                  break L19;
                } else {
                  break L19;
                }
              }
            }
            L20: {
              L21: {
                lk.a(var9, var10, var5, var18, var17, param0 ^ -15);
                if ((var4_int ^ -1) == -21) {
                  break L21;
                } else {
                  if ((var4_int ^ -1) == -22) {
                    break L21;
                  } else {
                    break L20;
                  }
                }
              }
              L22: {
                var10 = var10 + ff.field_c;
                de.g(var10, -4 + (var9 - -(var11 / 2)), 121, 8, 3, var17);
                de.a(var10, -4 + (var11 / 2 + var9), 121, 8, 3, var18);
                if (20 == var4_int) {
                  stackIn_121_0 = 120 * si.field_l / 256;
                  break L22;
                } else {
                  stackIn_121_0 = 120 * ul.field_A / 256;
                  break L22;
                }
              }
              var19 = stackIn_121_0;
              de.g(-4 + var10 + var19, var9 - -3, 8, var11 + -6, 3, var17);
              de.a(-4 + var19 + var10, 3 + var9, 8, -6 + var11, 3, var18);
              break L20;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-15 == (this.field_l ^ -1)) {
                break L1;
              } else {
                if (this.field_l == 8) {
                  break L1;
                } else {
                  if (this.field_l == 7) {
                    break L1;
                  } else {
                    if (param1 == -7661) {
                      stackIn_14_0 = this.e(param0, param1 + 7736) + uc.field_a;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_12_0 = 94;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = this.e(param0, 75) + uc.field_a - -(uc.field_a / 8);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        String[] array$4 = null;
        boolean discarded$5 = false;
        int stackIn_87_0 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_493_0 = 0;
        int stackIn_493_1 = 0;
        int stackIn_573_0 = 0;
        int stackIn_573_1 = 0;
        int stackIn_586_0 = 0;
        int stackIn_636_0 = 0;
        int stackIn_636_1 = 0;
        int stackIn_731_0 = 0;
        int stackIn_731_1 = 0;
        int stackIn_770_0 = 0;
        int stackIn_770_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        double var14_double = 0.0;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        String var15_ref_String = null;
        double var16_double = 0.0;
        int var16 = 0;
        int var17_int = 0;
        double var17_double = 0.0;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var20_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        qb var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        var29 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var32 = tg.field_b[7].b();
              var3 = -ua.field_P + jf.field_j;
              this.c(-26733);
              this.field_m = -1;
              discarded$0 = this.a(false, 245, (byte) -43, false, bi.field_I - -26, 245, uc.field_a + 178);
              if ((this.field_d ^ -1) <= -1) {
                break L1;
              } else {
                this.field_d = 0;
                break L1;
              }
            }
            L2: {
              var4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
              if ((-6 + var4.length ^ -1) > (this.field_d ^ -1)) {
                this.field_d = -6 + var4.length;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_d > this.field_h) {
                this.field_h = this.field_d;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (6 - -this.field_d <= this.field_h) {
                this.field_h = 5 + this.field_d;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var5 = uc.field_a - -102;
              var6 = 41 + bi.field_I;
              de.h(var6, var5 + 4, 558, 16777215, 128);
              de.e(var6, 5 + var5, 558, 55, 16777215, 64);
              de.h(var6, var5 - -65 - 5, 558, 16777215, 128);
              var7 = var6 - vi.field_I.field_n;
              if ((this.field_d ^ -1) < -1) {
                L6: {
                  if (var7 > an.field_g) {
                    break L6;
                  } else {
                    if ((var6 ^ -1) >= (an.field_g ^ -1)) {
                      break L6;
                    } else {
                      if ((var5 ^ -1) < (me.field_I ^ -1)) {
                        break L6;
                      } else {
                        if (var5 - -65 <= me.field_I) {
                          break L6;
                        } else {
                          vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 16777215);
                          vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
                          this.field_m = 10;
                          this.field_i = -1;
                          break L5;
                        }
                      }
                    }
                  }
                }
                vi.field_I.c(var7, var5, vi.field_I.field_n, 65);
                break L5;
              } else {
                vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 0);
                vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
                break L5;
              }
            }
            L7: {
              var7 = var6 + 558;
              var8 = vi.field_I.b();
              if (this.field_d < -6 + var4.length) {
                L8: {
                  if (var7 > an.field_g) {
                    break L8;
                  } else {
                    if ((an.field_g ^ -1) <= (var7 - -vi.field_I.field_n ^ -1)) {
                      break L8;
                    } else {
                      if (var5 > me.field_I) {
                        break L8;
                      } else {
                        if ((65 + var5 ^ -1) < (me.field_I ^ -1)) {
                          var8.b(var7, var5, vi.field_I.field_n, 65, 16777215);
                          var8.c(var7, var5, vi.field_I.field_n, 65, 128);
                          this.field_m = 10;
                          this.field_i = 1;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                var8.c(var7, var5, vi.field_I.field_n, 65);
                break L7;
              } else {
                var8.b(var7, var5, vi.field_I.field_n, 65, 0);
                var8.c(var7, var5, vi.field_I.field_n, 65, 128);
                break L7;
              }
            }
            var9 = this.field_d;
            L9: while (true) {
              L10: {
                if (var9 >= this.field_d + 6) {
                  discarded$1 = this.a(false, 332, (byte) -71, false, 287 + bi.field_I, 245, 178 + uc.field_a);
                  discarded$2 = this.a(true, 284, (byte) 108, false, 21 + bi.field_I + 287, 29, -4 + (178 + uc.field_a));
                  tj.field_t.a(tc.field_F, 21 + (290 + bi.field_I) + -1, -4 + (uc.field_a - -178 - 1), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                  tj.field_t.a(tc.field_F, 311 + bi.field_I, -2 + (178 + uc.field_a) - 4, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                  tj.field_t.a(tc.field_F, 290 + (bi.field_I - -21), -5 + uc.field_a + 178, 281, 29, 12569299, -1, param0, 1, tj.field_t.field_C);
                  var9 = -1;
                  var10 = -1;
                  var11 = 0;
                  stackIn_152_0 = 0;
                  break L10;
                } else {
                  var10 = (var9 - this.field_d) * 89 + var6 - -24;
                  var11 = var5;
                  var12 = 0;
                  stackIn_152_0 = var9;

                  L11: {
                    if (stackIn_152_0 == 0) {
                      var12 = 16711935;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var9 ^ -1) == -2) {
                      var12 = 16711680;
                      var11 += 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var9 != 2) {
                      break L13;
                    } else {
                      var11 += 0;
                      var12 = 16746632;
                      break L13;
                    }
                  }
                  L14: {
                    if ((var9 ^ -1) != -4) {
                      break L14;
                    } else {
                      var11 += 0;
                      var12 = 16776960;
                      break L14;
                    }
                  }
                  L15: {
                    if (4 == var9) {
                      var11 += 0;
                      var12 = 65535;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-6 != (var9 ^ -1)) {
                      break L16;
                    } else {
                      var11 += 0;
                      var12 = 34816;
                      break L16;
                    }
                  }
                  L17: {
                    if ((var9 ^ -1) != -7) {
                      break L17;
                    } else {
                      var11 += 0;
                      var12 = 16777215;
                      break L17;
                    }
                  }
                  L18: {
                    if (-8 != (var9 ^ -1)) {
                      break L18;
                    } else {
                      var11 += 0;
                      var12 = 4521762;
                      break L18;
                    }
                  }
                  L19: {
                    if ((var9 ^ -1) != -9) {
                      break L19;
                    } else {
                      var11 += 0;
                      var12 = 1364125;
                      break L19;
                    }
                  }
                  L20: {
                    if (-10 != (var9 ^ -1)) {
                      break L20;
                    } else {
                      var11 += 0;
                      var12 = 8947848;
                      break L20;
                    }
                  }
                  L21: {
                    if ((bc.field_b ^ -1) != (var9 ^ -1)) {
                      stackIn_87_0 = 0;
                      break L21;
                    } else {
                      stackIn_87_0 = 1;
                      break L21;
                    }
                  }
                  L22: {
                    var13_int = stackIn_87_0;
                    de.d(var10, var11, 65, 65, var12);
                    stackIn_90_0 = this;

                    if (var9 != this.field_h) {
                      stackIn_91_0 = this;
                      stackIn_91_1 = 0;
                      break L22;
                    } else {
                      stackIn_91_0 = this;
                      stackIn_91_1 = 1;
                      break L22;
                    }
                  }
                  L23: {
                    discarded$3 = this.a(stackIn_91_1 != 0, 65, (byte) 74, true, var10, 65, var11);
                    if (var13_int == 0) {
                      break L23;
                    } else {
                      L24: {
                        if (-10 != (var9 ^ -1)) {
                          break L24;
                        } else {
                          if (ArcanistsMulti.i((byte) -77)) {
                            break L24;
                          } else {
                            if (0 >= ad.field_d) {
                              break L24;
                            } else {
                              var13_int = 0;
                              break L24;
                            }
                          }
                        }
                      }
                      L25: {
                        if (0L == (1L << -14 + var9 * 8 & cb.field_e)) {
                          break L25;
                        } else {
                          if (var9 <= 1) {
                            break L25;
                          } else {
                            if (var9 < 9) {
                              if ((cb.field_e & 1L << -13 + 8 * var9 + mf.field_a / 2) != 0L) {
                                var13_int = 0;
                                break L25;
                              } else {
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      if (var13_int == 0) {
                        break L23;
                      } else {
                        var14_double = 0.5 * (3.14 * Math.sin((double)jb.field_v * 0.1)) + 3.14;
                        tk.field_x[10].a(2048, (int)(16.0 * Math.cos(var14_double)) + var11 + 16, 125, var10 + ((int)(Math.sin(var14_double) * 32.0) - -32), 0);
                        break L23;
                      }
                    }
                  }
                  L26: {
                    if (this.field_h == var9) {
                      if (-10 != (this.field_h ^ -1)) {
                        L27: {
                          if (0L != (1L << -14 + 8 * this.field_h & cb.field_e)) {
                            break L27;
                          } else {
                            if (1 < this.field_h) {
                              L28: {
                                rm.field_o[10].a(26 + (bi.field_I + (245 + -rm.field_o[9].field_n) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, var12 >> 772288865 & 8355711 | 8421504);
                                rm.field_o[var9].a(bi.field_I + (32 - (6 + -((-rm.field_o[var9].field_n + 245) / 2))), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 8355711 & var12 >> 2115331649 | 8421504);
                                de.d(6, 6, 8 + (32 + bi.field_I), 186 + uc.field_a, 229, 229);
                                rm.field_o[10].f((-rm.field_o[9].field_n + 245) / 2 + bi.field_I - -26, (245 + -rm.field_o[9].field_w) / 2 + uc.field_a - -178, 64);
                                rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (-6 + bi.field_I + 32), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 64);
                                ce.field_m.a(true);
                                var14 = 416 + (bi.field_I << 2005454852) + 1960;
                                var15 = 2848 + ((uc.field_a << -184663324) - -1960);
                                if (!ArcanistsMulti.i((byte) -102)) {
                                  var32.b(80, 1088, var14, var15, jb.field_v * 30 + -26214, 4096);
                                  var32.b(80, 1088, var14, var15, -13107 + jb.field_v * 30, 4096);
                                  var32.b(80, 1088, var14, var15, jb.field_v * 30 + 0, 4096);
                                  var32.b(80, 1088, var14, var15, 13107 + jb.field_v * 30, 4096);
                                  var32.b(80, 1088, var14, var15, 26214 - -(jb.field_v * 30), 4096);
                                  if (5 > var3) {
                                    break L28;
                                  } else {
                                    var16_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                                    var18 = (int)(4096.0 + 256.0 * Math.cos(4.0 * var16_double) - 256.0);
                                    var19 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var16_double));
                                    tk.field_x[4].a(var18, uc.field_a - -300, param0 ^ 0, 148 + bi.field_I, var19);
                                    gn.a(16, (byte) 111, 128, -(8 * var18 / 4096) + (148 + bi.field_I), -(var18 * 8 / 4096) + 300 + uc.field_a);
                                    break L28;
                                  }
                                } else {
                                  break L28;
                                }
                              }
                              if (!mi.a(256, 178 + uc.field_a, 256, -8, bi.field_I - -26)) {
                                break L26;
                              } else {
                                this.field_i = var9;
                                this.field_m = 5;
                                break L26;
                              }
                            } else {
                              break L27;
                            }
                          }
                        }
                        rm.field_o[10].a(32 + (bi.field_I + -6) - -((-rm.field_o[9].field_n + 245) / 2), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12) >> -1809086495 | 8421504);
                        rm.field_o[var9].a(-6 + bi.field_I - (-32 - (-rm.field_o[var9].field_n + 245) / 2), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178, 8421504 | (var12 & 16711422) >> 949379969);
                        de.d(6, 6, 8 + bi.field_I + 32, 8 + uc.field_a + 178, 229, 229);
                        rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + bi.field_I + 26, uc.field_a + 178 - -((245 - rm.field_o[9].field_w) / 2));
                        rm.field_o[var9].c(-6 + bi.field_I + (32 + (245 - rm.field_o[var9].field_n) / 2), (245 + -rm.field_o[9].field_w) / 2 + (uc.field_a - -178));
                        break L26;
                      } else {
                        L29: {
                          if (!ArcanistsMulti.i((byte) -72)) {
                            break L29;
                          } else {
                            if (0 >= ad.field_d) {
                              rm.field_o[10].a(32 + (bi.field_I + -6 - -((245 + -rm.field_o[9].field_n) / 2)), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12 | 16843009) >> -545025343);
                              rm.field_o[var9].a((245 - rm.field_o[var9].field_n) / 2 + (bi.field_I + 32 - 6), 178 + (uc.field_a - -((245 - rm.field_o[9].field_w) / 2)), (var12 & 16711422 | 16843009) >> 705385793);
                              de.d(6, 6, bi.field_I - -32 - -8, 8 + (uc.field_a + 178), 229, 229);
                              rm.field_o[10].f(-6 + (bi.field_I - -32 + (-rm.field_o[9].field_n + 245) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 64);
                              rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (bi.field_I - -26), uc.field_a - (-178 + -((-rm.field_o[9].field_w + 245) / 2)), 64);
                              ce.field_m.a(true);
                              break L26;
                            } else {
                              break L29;
                            }
                          }
                        }
                        rm.field_o[10].a((-rm.field_o[9].field_n + 245) / 2 + -6 + (bi.field_I - -32), 178 + (uc.field_a - -((-rm.field_o[9].field_w + 245) / 2)), (16843008 | var12 & 16711422) >> 1299689985);
                        rm.field_o[var9].a(32 + (bi.field_I + (-6 - -((245 + -rm.field_o[var9].field_n) / 2))), (245 - rm.field_o[9].field_w) / 2 + uc.field_a - -178, var12 >> -616152095 & 8355711 | 8421504);
                        de.d(6, 6, 32 + bi.field_I + 8, 8 + (uc.field_a - -178), 229, 229);
                        rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + 32 + (bi.field_I - 6), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178);
                        rm.field_o[var9].c(-6 + bi.field_I + (32 - -((245 - rm.field_o[var9].field_n) / 2)), 178 + (uc.field_a + (-rm.field_o[9].field_w + 245) / 2));
                        ce.field_m.a(true);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L30: {
                    rm.field_o[10].b(2 + var10, var11);
                    rm.field_o[var9].b(var10 - -2, var11);
                    if (mi.a(65, var11, 65, -8, var10)) {
                      this.field_m = 0;
                      this.field_i = var9;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  var9++;
                  continue L9;
                }
              }
              var12 = stackIn_152_0;
              L31: while (true) {
                stackIn_154_0 = var12 ^ -1;
                L32: while (true) {
                  if (stackIn_154_0 <= -9) {
                    var12 = 0;
                    L33: while (true) {
                      if (var12 >= 128) {
                        var12 = 0;
                        L34: while (true) {
                          if (var12 >= 128) {
                            L35: {
                              var12 = this.field_h * 12;
                              var11 = 12;
                              if (var12 < 0) {
                                var11 = var11 + var12;
                                var12 = 0;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            var13_int = 0;
                            L36: while (true) {
                              L37: {
                                if (var13_int >= var11) {
                                  stackIn_636_0 = -2;
                                  stackIn_636_1 = this.field_h ^ -1;
                                  break L37;
                                } else {
                                  var14 = 96;
                                  var15 = var13_int;
                                  var16 = 1;
                                  var17_int = 0;
                                  var18 = 16;
                                  var18--;
                                  var19 = 10326659;
                                  var15 = var13_int;
                                  stackIn_636_0 = -1;

                                  stackIn_636_1 = var13_int ^ -1;

                                  L38: {
                                    if (stackIn_636_0 != stackIn_636_1) {
                                      break L38;
                                    } else {
                                      var15 = 2;
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (-2 != (var13_int ^ -1)) {
                                      break L39;
                                    } else {
                                      var15 = 4;
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (2 == var13_int) {
                                      var15 = 1;
                                      break L40;
                                    } else {
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    if (var13_int == 3) {
                                      var15 = 5;
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                  L42: {
                                    if (4 != var13_int) {
                                      break L42;
                                    } else {
                                      var15 = 0;
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    if (5 != var13_int) {
                                      break L43;
                                    } else {
                                      var15 = 6;
                                      break L43;
                                    }
                                  }
                                  L44: {
                                    if (var13_int == 6) {
                                      var15 = 11;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    if ((var13_int ^ -1) == -8) {
                                      var15 = 7;
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    if ((var13_int ^ -1) != -9) {
                                      break L46;
                                    } else {
                                      var15 = 10;
                                      break L46;
                                    }
                                  }
                                  L47: {
                                    if (-10 != (var13_int ^ -1)) {
                                      break L47;
                                    } else {
                                      var15 = 8;
                                      break L47;
                                    }
                                  }
                                  L48: {
                                    if ((var13_int ^ -1) == -11) {
                                      var15 = 3;
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    if (11 == var13_int) {
                                      var15 = 9;
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  }
                                  L50: {
                                    if (var13_int < 10) {
                                      L51: {
                                        if ((var13_int & 1 ^ -1) == -2) {
                                          var20 = 0;
                                          var30 = 0;
                                          var21 = var30;
                                          L52: while (true) {
                                            L53: {
                                              if (var30 >= 16) {
                                                var18++;
                                                stackIn_376_0 = -1;
                                                stackIn_376_1 = var20 ^ -1;
                                                break L53;
                                              } else {
                                                stackIn_376_0 = b.field_f[var30];

                                                stackIn_376_1 = -1 + (var12 + var13_int);

                                                L54: {
                                                  if (stackIn_376_0 == stackIn_376_1) {
                                                    var20++;
                                                    break L54;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                                var30++;
                                                continue L52;
                                              }
                                            }
                                            L55: {
                                              if (stackIn_376_0 == stackIn_376_1) {
                                                var16 = 0;
                                                break L55;
                                              } else {
                                                break L55;
                                              }
                                            }
                                            var19 = 16711935;
                                            break L51;
                                          }
                                        } else {
                                          break L51;
                                        }
                                      }
                                      if (0 >= this.field_h) {
                                        break L50;
                                      } else {
                                        if (-10 != (this.field_h ^ -1)) {
                                          if (-1 != (1 & var13_int ^ -1)) {
                                            if ((cb.field_e & 1L << -13 + 8 * this.field_h - -((-1 + var13_int) / 2)) != 0L) {
                                              break L50;
                                            } else {
                                              L56: {
                                                if (this.field_h != bc.field_b) {
                                                  break L56;
                                                } else {
                                                  if (mf.field_a != -1 + var13_int) {
                                                    break L56;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                              }
                                              if (this.field_h > 1) {
                                                var16 = 0;
                                                var17_int = 2;
                                                break L50;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          } else {
                                            if (0L != (1L << -14 + 8 * this.field_h & cb.field_e)) {
                                              break L50;
                                            } else {
                                              L57: {
                                                if ((this.field_h ^ -1) != (bc.field_b ^ -1)) {
                                                  break L57;
                                                } else {
                                                  if (mf.field_a == var13_int) {
                                                    break L50;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              if (1 >= this.field_h) {
                                                break L50;
                                              } else {
                                                var16 = 0;
                                                var17_int = 0;
                                                break L50;
                                              }
                                            }
                                          }
                                        } else {
                                          break L50;
                                        }
                                      }
                                    } else {
                                      if (0 >= this.field_h) {
                                        break L50;
                                      } else {
                                        var20 = 0;
                                        var21 = 0;
                                        L58: while (true) {
                                          L59: {
                                            if (var21 >= 16) {
                                              var19 = 16744703;
                                              stackIn_353_0 = var20 ^ -1;
                                              stackIn_353_1 = -6;
                                              break L59;
                                            } else {
                                              stackIn_353_0 = var12;

                                              stackIn_353_1 = b.field_f[var21];

                                              L60: {
                                                if (stackIn_353_0 > stackIn_353_1) {
                                                  break L60;
                                                } else {
                                                  if ((b.field_f[var21] ^ -1) <= (10 + var12 ^ -1)) {
                                                    break L60;
                                                  } else {
                                                    L61: {
                                                      if (0 == (1 & b.field_f[var21])) {
                                                        break L61;
                                                      } else {
                                                        if ((var21 ^ -1) >= -1) {
                                                          break L60;
                                                        } else {
                                                          if ((-1 + b.field_f[var21] ^ -1) != (b.field_f[-1 + var21] ^ -1)) {
                                                            break L60;
                                                          } else {
                                                            break L61;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var20++;
                                                    break L60;
                                                  }
                                                }
                                              }
                                              var21++;
                                              continue L58;
                                            }
                                          }
                                          L62: {
                                            if (stackIn_353_0 > stackIn_353_1) {
                                              var16 = 0;
                                              break L62;
                                            } else {
                                              break L62;
                                            }
                                          }
                                          L63: {
                                            var18 += 2;
                                            if (0L != (1L << 8 * this.field_h - (-(var13_int % 12) - -18) & cb.field_e)) {
                                              break L63;
                                            } else {
                                              if ((this.field_h ^ -1) > -10) {
                                                var17_int = 3;
                                                var16 = 0;
                                                break L63;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                          break L50;
                                        }
                                      }
                                    }
                                  }
                                  L64: {
                                    L65: {
                                      var20_double = 2.0 * ((double)var15 * 3.141592653589793) / (double)var11;
                                      var22 = 122 + (-6 + bi.field_I) + 32 - (int)((double)var14 * Math.cos(var20_double)) - 16;
                                      var23 = 178 + uc.field_a - (-122 - -(int)((double)var14 * Math.sin(var20_double)) + 16);
                                      if (this.field_h != 9) {
                                        break L65;
                                      } else {
                                        L66: {
                                          if (ArcanistsMulti.i((byte) -87)) {
                                            break L66;
                                          } else {
                                            if (-1 > (ad.field_d ^ -1)) {
                                              break L65;
                                            } else {
                                              break L66;
                                            }
                                          }
                                        }
                                        if (an.field_g < var22) {
                                          break L64;
                                        } else {
                                          if (var23 > me.field_I) {
                                            break L64;
                                          } else {
                                            if ((var22 - -32 ^ -1) >= (an.field_g ^ -1)) {
                                              break L64;
                                            } else {
                                              if ((me.field_I ^ -1) <= (var23 - -32 ^ -1)) {
                                                break L64;
                                              } else {
                                                this.field_i = var13_int + var12;
                                                this.field_m = 6;
                                                break L64;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var16 != 0) {
                                      if ((an.field_g ^ -1) > (var22 ^ -1)) {
                                        break L64;
                                      } else {
                                        if (me.field_I < var23) {
                                          break L64;
                                        } else {
                                          if (var22 + 32 <= an.field_g) {
                                            break L64;
                                          } else {
                                            if ((var23 - -32 ^ -1) >= (me.field_I ^ -1)) {
                                              break L64;
                                            } else {
                                              this.field_m = 1;
                                              this.field_i = var12 + var13_int;
                                              var18 += 4;
                                              break L64;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (an.field_g < var22) {
                                        break L64;
                                      } else {
                                        if (me.field_I < var23) {
                                          break L64;
                                        } else {
                                          if ((an.field_g ^ -1) <= (var22 - -32 ^ -1)) {
                                            break L64;
                                          } else {
                                            if ((me.field_I ^ -1) <= (var23 - -32 ^ -1)) {
                                              break L64;
                                            } else {
                                              L67: {
                                                L68: {
                                                  L69: {
                                                    this.field_i = var13_int + var12;
                                                    this.field_m = 3;
                                                    if (10 <= var13_int) {
                                                      this.field_m = 4;
                                                      var24 = 0;
                                                      L70: while (true) {
                                                        if (var24 >= 16) {
                                                          this.field_i = var12 + var13_int;
                                                          break L69;
                                                        } else {
                                                          stackIn_493_0 = var12;

                                                          stackIn_493_1 = b.field_f[var24];

                                                          L71: {
                                                            if (stackIn_493_0 > stackIn_493_1) {
                                                              break L71;
                                                            } else {
                                                              if (10 + var12 <= b.field_f[var24]) {
                                                                break L71;
                                                              } else {
                                                                if ((1 & b.field_f[var24]) == 0) {
                                                                  break L71;
                                                                } else {
                                                                  if (-1 <= (var24 ^ -1)) {
                                                                    break L71;
                                                                  } else {
                                                                    if ((b.field_f[var24 + -1] ^ -1) == (b.field_f[var24] - 1 ^ -1)) {
                                                                      break L71;
                                                                    } else {
                                                                      break L71;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var24++;
                                                          continue L70;
                                                        }
                                                      }
                                                    } else {
                                                      break L69;
                                                    }
                                                  }
                                                  L72: {
                                                    var18 += 2;
                                                    if ((cb.field_e & 1L << -14 + this.field_h * 8) != 0L) {
                                                      break L72;
                                                    } else {
                                                      L73: {
                                                        if (this.field_h != bc.field_b) {
                                                          break L73;
                                                        } else {
                                                          if (var13_int == mf.field_a) {
                                                            break L72;
                                                          } else {
                                                            if ((var13_int ^ -1) == (mf.field_a + 1 ^ -1)) {
                                                              break L72;
                                                            } else {
                                                              break L73;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (-2 <= (this.field_h ^ -1)) {
                                                        break L72;
                                                      } else {
                                                        if (-10 >= (this.field_h ^ -1)) {
                                                          break L72;
                                                        } else {
                                                          this.field_i = var13_int + var12;
                                                          this.field_m = 6;
                                                          break L67;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackIn_493_0 = var17_int ^ -1;
                                                  stackIn_493_1 = -1;
                                                  break L68;
                                                }
                                                if (stackIn_493_0 >= stackIn_493_1) {
                                                  break L67;
                                                } else {
                                                  if (9 > this.field_h) {
                                                    this.field_m = 7;
                                                    this.field_i = var12 + var13_int;
                                                    if (2 < var17_int) {
                                                      this.field_m = 8;
                                                      break L67;
                                                    } else {
                                                      break L67;
                                                    }
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                              }
                                              if ((this.field_m ^ -1) == -4) {
                                                var24 = -16 + (32 + (bi.field_I + -6) + 122 + (int)(Math.cos(var20_double) * (double)var14));
                                                gn.a((int)(Math.cos((double)jb.field_v * 0.1) * 4.0) + 20, (byte) 105, 128 - -(int)(Math.sin((double)jb.field_v * 0.1) * 64.0), var24 - -16, 16 + var23);
                                                break L64;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L74: {
                                    L75: {
                                      L76: {
                                        de.c(16 + var22, var23 + 16, 8 + var18, 0, 64);
                                        de.i(16 + var22, var23 + 16, 4 + var18, var19);
                                        de.c(16 + var22, 16 + var23, var18 - -4, 0);
                                        de.i(16 + var22, 16 + var23, var18, 13947080);
                                        de.c(var22 + 16, 16 + var23, var18, 0);
                                        if (9 != this.field_h) {
                                          break L76;
                                        } else {
                                          L77: {
                                            if (ad.field_d == 0) {
                                              break L77;
                                            } else {
                                              if (!ArcanistsMulti.i((byte) -74)) {
                                                break L76;
                                              } else {
                                                break L77;
                                              }
                                            }
                                          }
                                          bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                          break L75;
                                        }
                                      }
                                      L78: {
                                        if ((cb.field_e & 1L << this.field_h * 8 - 14 ^ -1L) != -1L) {
                                          break L78;
                                        } else {
                                          if (-2 <= (this.field_h ^ -1)) {
                                            break L78;
                                          } else {
                                            if (this.field_h >= 9) {
                                              break L78;
                                            } else {
                                              if (var16 != 0) {
                                                break L78;
                                              } else {
                                                bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, var23 - 4, 32);
                                                break L75;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var16 != 0) {
                                        bb.field_g[dd.field_f[var13_int + var12]].c(-4 + var22, var23 - 4);
                                        var24 = 0;
                                        var31 = 0;
                                        var25_int = var31;
                                        L79: while (true) {
                                          if (var31 >= 16) {
                                            if (var24 == 0) {
                                              break L75;
                                            } else {
                                              gn.a(24, (byte) 63, -128, var22 - -16, var23 - -16);
                                              de.c(var22 - -16, var23 + 16, 24, 0);
                                              break L75;
                                            }
                                          } else {
                                            stackIn_573_0 = b.field_f[var31];

                                            stackIn_573_1 = var13_int + var12;

                                            L80: {
                                              if (stackIn_573_0 != stackIn_573_1) {
                                                break L80;
                                              } else {
                                                var24 = 1;
                                                break L80;
                                              }
                                            }
                                            var31++;
                                            continue L79;
                                          }
                                        }
                                      } else {
                                        if (-1 == (var17_int ^ -1)) {
                                          bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                          break L75;
                                        } else {
                                          L81: {
                                            bb.field_g[dd.field_f[var12 + var13_int]].f(-4 + var22, -4 + var23, 32);
                                            var24 = var22 - -16 << -1582940220;
                                            var25_int = 16 + var23 << -1100081116;
                                            if (ArcanistsMulti.i((byte) -102)) {
                                              break L81;
                                            } else {
                                              L82: {
                                                if (-4 != (var17_int ^ -1)) {
                                                  break L82;
                                                } else {
                                                  var32.b(80, 320, var24, var25_int, jb.field_v * 30 + -21845, 4096);
                                                  var32.b(80, 320, var24, var25_int, jb.field_v * 30 + 0, 4096);
                                                  var32.b(80, 320, var24, var25_int, 30 * jb.field_v + 21845, 4096);
                                                  break L82;
                                                }
                                              }
                                              if ((var17_int ^ -1) != -3) {
                                                break L81;
                                              } else {
                                                var32.b(160, 320, var24, var25_int, -16384 + jb.field_v * 30, 4096);
                                                var32.b(160, 320, var24, var25_int, 16384 + 30 * jb.field_v, 4096);
                                                break L75;
                                              }
                                            }
                                          }
                                          break L75;
                                        }
                                      }
                                    }
                                    stackIn_573_0 = 1;
                                    stackIn_573_1 = this.field_h;
                                    break L74;
                                  }
                                  L83: {
                                    if (stackIn_573_0 != stackIn_573_1) {
                                      break L83;
                                    } else {
                                      if (10 > var13_int) {
                                        break L83;
                                      } else {
                                        if (ArcanistsMulti.i((byte) -84)) {
                                          ii.field_d.c(-4 + var22, var23 - 4, 40, 40, 128);
                                          break L83;
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                  }
                                  L84: {
                                    if (-1L == (cb.field_e & 1L << this.field_h * 8 + -14 ^ -1L)) {
                                      stackIn_586_0 = 0;
                                      break L84;
                                    } else {
                                      stackIn_586_0 = 1;
                                      break L84;
                                    }
                                  }
                                  L85: {
                                    var24 = stackIn_586_0;
                                    if (var16 != 0) {
                                      break L85;
                                    } else {
                                      if (0 >= var17_int) {
                                        break L85;
                                      } else {
                                        if (var3 < var17_int) {
                                          break L85;
                                        } else {
                                          L86: {
                                            if (var24 != 0) {
                                              break L86;
                                            } else {
                                              if ((this.field_h ^ -1) != -2) {
                                                break L85;
                                              } else {
                                                break L86;
                                              }
                                            }
                                          }
                                          if (var22 > an.field_g) {
                                            break L85;
                                          } else {
                                            if (var23 > me.field_I) {
                                              break L85;
                                            } else {
                                              if (32 + var22 <= an.field_g) {
                                                break L85;
                                              } else {
                                                if (me.field_I >= 32 + var23) {
                                                  break L85;
                                                } else {
                                                  if (ArcanistsMulti.i((byte) -125)) {
                                                    break L85;
                                                  } else {
                                                    var25 = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                                    var27 = (int)(2048.0 + Math.cos(var25 * 4.0) * 256.0 - 256.0);
                                                    var28 = (int)(5000.0 * Math.sin(var25 * 2.0) + 0.0);
                                                    if (-149 < (16 + var22 ^ -1)) {
                                                      tk.field_x[4].a(var27, var23, -4, var22, var28);
                                                      gn.a(8, (byte) 118, 128, var22 + -(var27 * 8 / 4096), var23 - 8 * var27 / 4096);
                                                      break L85;
                                                    } else {
                                                      tk.field_x[4].a(var27, var23, -41, 32 + var22, var28);
                                                      gn.a(8, (byte) 126, 128, -(var27 * 8 / 4096) + var22 - -32, var23 + -(8 * var27 / 4096));
                                                      break L85;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L87: {
                                    if ((bc.field_b ^ -1) != (this.field_h ^ -1)) {
                                      break L87;
                                    } else {
                                      L88: {
                                        L89: {
                                          if ((var13_int ^ -1) != (mf.field_a ^ -1)) {
                                            break L89;
                                          } else {
                                            if (var24 == 0) {
                                              break L88;
                                            } else {
                                              break L89;
                                            }
                                          }
                                        }
                                        if (mf.field_a - -1 != var13_int) {
                                          break L87;
                                        } else {
                                          if ((1L << (-1 + var13_int) / 2 + -13 + 8 * this.field_h & cb.field_e ^ -1L) == -1L) {
                                            break L88;
                                          } else {
                                            break L87;
                                          }
                                        }
                                      }
                                      var25 = Math.cos(3.141592653589793 * (double)(jb.field_v & 255) / 64.0) * 5.0 + 32.0;
                                      var27 = (int)(Math.cos(var20_double) * var25) + (16 + var22);
                                      var28 = (int)(var25 * Math.sin(var20_double)) + 16 + var23;
                                      tk.field_x[10].a(2048, var28, 120, var27, 0);
                                      break L87;
                                    }
                                  }
                                  var13_int++;
                                  continue L36;
                                }
                              }
                              L90: {
                                if (stackIn_636_0 <= stackIn_636_1) {
                                  break L90;
                                } else {
                                  if (!ArcanistsMulti.i((byte) -127)) {
                                    break L90;
                                  } else {
                                    if (this.field_h >= 9) {
                                      break L90;
                                    } else {
                                      var13_int = 122 + (bi.field_I + 26);
                                      var14 = 178 + (uc.field_a + 122);
                                      ii.field_d.c(-64 + var13_int, -64 + var14, 128);
                                      break L90;
                                    }
                                  }
                                }
                              }
                              L91: {
                                if (9 != this.field_h) {
                                  break L91;
                                } else {
                                  L92: {
                                    if ((ad.field_d ^ -1) >= -1) {
                                      break L92;
                                    } else {
                                      if (!ArcanistsMulti.i((byte) -60)) {
                                        break L91;
                                      } else {
                                        break L92;
                                      }
                                    }
                                  }
                                  var13_int = 148 + bi.field_I;
                                  var14 = uc.field_a + 178 + 122;
                                  ii.field_d.c(var13_int + -64, -64 + var14, 128);
                                  break L91;
                                }
                              }
                              L93: {
                                L94: {
                                  L95: {
                                    if (-2 == (this.field_m ^ -1)) {
                                      break L95;
                                    } else {
                                      if (6 == this.field_m) {
                                        break L95;
                                      } else {
                                        if (7 == this.field_m) {
                                          break L95;
                                        } else {
                                          if ((this.field_m ^ -1) == -9) {
                                            break L95;
                                          } else {
                                            if ((this.field_m ^ -1) == -3) {
                                              if (this.field_i < 0) {
                                                break L94;
                                              } else {
                                                if (-17 >= (this.field_i ^ -1)) {
                                                  break L94;
                                                } else {
                                                  if (0 != (b.field_f[this.field_i] ^ -1)) {
                                                    L96: {
                                                      L97: {
                                                        var13_int = b.field_f[this.field_i];
                                                        var36 = tc.field_w[var13_int];
                                                        var37 = vm.field_d[var13_int];
                                                        var16 = bi.field_I + 301;
                                                        var17_int = -1 + (uc.field_a + 303);
                                                        if (!ArcanistsMulti.i((byte) -91)) {
                                                          break L97;
                                                        } else {
                                                          if (-23 < (var13_int ^ -1)) {
                                                            break L97;
                                                          } else {
                                                            L98: {
                                                              if ((var13_int / 12 ^ -1) != (bc.field_b ^ -1)) {
                                                                break L98;
                                                              } else {
                                                                if ((-(var13_int / 12 * 12) + var13_int ^ -1) == (mf.field_a ^ -1)) {
                                                                  break L97;
                                                                } else {
                                                                  if (var13_int - 12 * (var13_int / 12) != 1 + mf.field_a) {
                                                                    break L98;
                                                                  } else {
                                                                    break L97;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            mi.field_B.a(var36, var16 - 1, var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                                            mi.field_B.a(var36, var16, -1 + var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                                            mi.field_B.a(var36, var16, var17_int, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                                                            mi.field_B.a(qe.field_r, 447, 294, 171, 29, 16711680, 0, 1, 1, mi.field_B.field_C);
                                                            break L96;
                                                          }
                                                        }
                                                      }
                                                      tj.field_t.a(var36, 10 + (var16 + -1), var17_int, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      tj.field_t.a(var36, 10 + var16, var17_int + -1, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      tj.field_t.a(var36, var16 - -10, var17_int, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                      break L96;
                                                    }
                                                    mi.field_B.a(var37, 8 + (290 + bi.field_I), uc.field_a - -340 - 8, 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                                    break L93;
                                                  } else {
                                                    break L93;
                                                  }
                                                }
                                              }
                                            } else {
                                              L99: {
                                                var13 = vl.field_l;
                                                if (0 < this.field_h) {
                                                  var13 = tn.field_Ib;
                                                  if ((this.field_h ^ -1) != -10) {
                                                    break L99;
                                                  } else {
                                                    L100: {
                                                      if (-1 == (ad.field_d ^ -1)) {
                                                        break L100;
                                                      } else {
                                                        if (ArcanistsMulti.i((byte) -77)) {
                                                          break L100;
                                                        } else {
                                                          break L99;
                                                        }
                                                      }
                                                    }
                                                    var13 = vn.field_j;
                                                    break L99;
                                                  }
                                                } else {
                                                  break L99;
                                                }
                                              }
                                              L101: {
                                                L102: {
                                                  if ((an.field_g ^ -1) > (bi.field_I + 557 ^ -1)) {
                                                    break L102;
                                                  } else {
                                                    if ((uc.field_a + 51 ^ -1) > (me.field_I ^ -1)) {
                                                      break L102;
                                                    } else {
                                                      if (!ArcanistsMulti.i((byte) -50)) {
                                                        var13 = "";
                                                        var14 = bi.field_I - -300;
                                                        var15 = 340 + uc.field_a;
                                                        this.a(var15, var3, var14, 113);
                                                        break L101;
                                                      } else {
                                                        break L102;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (this.field_m == 0) {
                                                  L103: {
                                                    var14_ref_String = ee.field_c;
                                                    var13 = ld.field_k;
                                                    if ((Math.abs(this.field_i) ^ -1) == -2) {
                                                      var13 = j.field_b;
                                                      var14_ref_String = gd.field_qb;
                                                      break L103;
                                                    } else {
                                                      break L103;
                                                    }
                                                  }
                                                  L104: {
                                                    if (2 != Math.abs(this.field_i)) {
                                                      break L104;
                                                    } else {
                                                      var14_ref_String = io.field_z;
                                                      var13 = ri.field_d;
                                                      break L104;
                                                    }
                                                  }
                                                  L105: {
                                                    if ((Math.abs(this.field_i) ^ -1) != -4) {
                                                      break L105;
                                                    } else {
                                                      var13 = hm.field_d;
                                                      var14_ref_String = df.field_x;
                                                      break L105;
                                                    }
                                                  }
                                                  L106: {
                                                    if (-5 != (Math.abs(this.field_i) ^ -1)) {
                                                      break L106;
                                                    } else {
                                                      var13 = tk.field_r;
                                                      var14_ref_String = fh.field_d;
                                                      break L106;
                                                    }
                                                  }
                                                  L107: {
                                                    if (Math.abs(this.field_i) == 5) {
                                                      var13 = pk.field_g;
                                                      var14_ref_String = ad.field_g;
                                                      break L107;
                                                    } else {
                                                      break L107;
                                                    }
                                                  }
                                                  L108: {
                                                    if (6 == Math.abs(this.field_i)) {
                                                      var13 = gi.field_f;
                                                      var14_ref_String = ej.field_M;
                                                      break L108;
                                                    } else {
                                                      break L108;
                                                    }
                                                  }
                                                  L109: {
                                                    if (Math.abs(this.field_i) != 7) {
                                                      break L109;
                                                    } else {
                                                      var14_ref_String = nf.field_e;
                                                      var13 = tk.field_w;
                                                      break L109;
                                                    }
                                                  }
                                                  L110: {
                                                    if ((Math.abs(this.field_i) ^ -1) == -9) {
                                                      var13 = mi.field_s;
                                                      var14_ref_String = oo.field_r;
                                                      break L110;
                                                    } else {
                                                      break L110;
                                                    }
                                                  }
                                                  L111: {
                                                    if (-10 != (Math.abs(this.field_i) ^ -1)) {
                                                      break L111;
                                                    } else {
                                                      var13 = uk.field_f;
                                                      var14_ref_String = j.field_c;
                                                      break L111;
                                                    }
                                                  }
                                                  tj.field_t.a(var14_ref_String, -1 + (311 + bi.field_I), -1 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                  tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a + -2, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                  tj.field_t.a(var14_ref_String, 21 + (bi.field_I - -290), 303 + (uc.field_a + -1), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                  break L101;
                                                } else {
                                                  if (3 == this.field_m) {
                                                    var34 = tc.field_w[this.field_i];
                                                    var14_ref_String = var34;
                                                    tj.field_t.a(var34, bi.field_I - -310, -1 + (uc.field_a + 303), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    tj.field_t.a(var34, 21 + bi.field_I + 290, 303 + (uc.field_a - 2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    tj.field_t.a(var14_ref_String, 21 + bi.field_I - -290, -1 + (303 + uc.field_a), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                    var13 = tj.a(param0 + 126, new String[]{tc.field_w[-1 + this.field_i]}, jf.field_f);
                                                    break L101;
                                                  } else {
                                                    if (-5 == (this.field_m ^ -1)) {
                                                      L112: {
                                                        var33 = tc.field_w[this.field_i];
                                                        var14_ref_String = var33;
                                                        tj.field_t.a(var33, 290 + bi.field_I - -21 - 1, -1 + uc.field_a - -303, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                        tj.field_t.a(var33, 21 + (bi.field_I + 290), 303 + (uc.field_a + -2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                        tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a - 1, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                        var15_ref_String = gd.field_qb;
                                                        if ((this.field_h ^ -1) != -3) {
                                                          break L112;
                                                        } else {
                                                          var15_ref_String = io.field_z;
                                                          break L112;
                                                        }
                                                      }
                                                      L113: {
                                                        if (3 != this.field_h) {
                                                          break L113;
                                                        } else {
                                                          var15_ref_String = df.field_x;
                                                          break L113;
                                                        }
                                                      }
                                                      L114: {
                                                        if (this.field_h == 4) {
                                                          var15_ref_String = fh.field_d;
                                                          break L114;
                                                        } else {
                                                          break L114;
                                                        }
                                                      }
                                                      L115: {
                                                        if (5 != this.field_h) {
                                                          break L115;
                                                        } else {
                                                          var15_ref_String = ad.field_g;
                                                          break L115;
                                                        }
                                                      }
                                                      L116: {
                                                        if (-7 != (this.field_h ^ -1)) {
                                                          break L116;
                                                        } else {
                                                          var15_ref_String = ej.field_M;
                                                          break L116;
                                                        }
                                                      }
                                                      L117: {
                                                        if ((this.field_h ^ -1) == -8) {
                                                          var15_ref_String = nf.field_e;
                                                          break L117;
                                                        } else {
                                                          break L117;
                                                        }
                                                      }
                                                      L118: {
                                                        if (this.field_h == 8) {
                                                          var15_ref_String = oo.field_r;
                                                          break L118;
                                                        } else {
                                                          break L118;
                                                        }
                                                      }
                                                      L119: {
                                                        if (this.field_h != 9) {
                                                          break L119;
                                                        } else {
                                                          var15_ref_String = j.field_c;
                                                          break L119;
                                                        }
                                                      }
                                                      var16 = 0;
                                                      var17_int = 0;
                                                      L120: while (true) {
                                                        L121: {
                                                          if (16 <= var17_int) {
                                                            stackIn_770_0 = 116;
                                                            stackIn_770_1 = 2;
                                                            break L121;
                                                          } else {
                                                            stackIn_770_0 = b.field_f[var17_int];

                                                            stackIn_770_1 = this.field_h * 12;

                                                            L122: {
                                                              if (stackIn_770_0 < stackIn_770_1) {
                                                                break L122;
                                                              } else {
                                                                if (10 + 12 * this.field_h < b.field_f[var17_int]) {
                                                                  break L122;
                                                                } else {
                                                                  var16++;
                                                                  break L122;
                                                                }
                                                              }
                                                            }
                                                            var17_int++;
                                                            continue L120;
                                                          }
                                                        }
                                                        array$4 = new String[stackIn_770_1];
                                                        array$4[0] = var15_ref_String;
                                                        array$4[1] = Integer.toString(var16);
                                                        var13 = tj.a(stackIn_770_0, array$4, vl.field_k);
                                                        break L101;
                                                      }
                                                    } else {
                                                      if (-6 != (this.field_m ^ -1)) {
                                                        break L101;
                                                      } else {
                                                        L123: {
                                                          var13 = "You Should NEVER EVER EVER SEE THIS!!!";
                                                          var14_ref_String = gd.field_qb;
                                                          if (Math.abs(this.field_h) != 2) {
                                                            break L123;
                                                          } else {
                                                            var13 = sb.field_d + var3;
                                                            var14_ref_String = io.field_z;
                                                            break L123;
                                                          }
                                                        }
                                                        L124: {
                                                          if (3 == Math.abs(this.field_h)) {
                                                            var13 = ec.field_h + var3;
                                                            var14_ref_String = df.field_x;
                                                            break L124;
                                                          } else {
                                                            break L124;
                                                          }
                                                        }
                                                        L125: {
                                                          if (-5 == (Math.abs(this.field_h) ^ -1)) {
                                                            var14_ref_String = fh.field_d;
                                                            var13 = ie.field_Jb + var3;
                                                            break L125;
                                                          } else {
                                                            break L125;
                                                          }
                                                        }
                                                        L126: {
                                                          if (-6 == (Math.abs(this.field_h) ^ -1)) {
                                                            var14_ref_String = ad.field_g;
                                                            var13 = jk.field_v + var3;
                                                            break L126;
                                                          } else {
                                                            break L126;
                                                          }
                                                        }
                                                        L127: {
                                                          if (6 != Math.abs(this.field_h)) {
                                                            break L127;
                                                          } else {
                                                            var14_ref_String = ej.field_M;
                                                            var13 = wd.field_k + var3;
                                                            break L127;
                                                          }
                                                        }
                                                        L128: {
                                                          if (7 != Math.abs(this.field_h)) {
                                                            break L128;
                                                          } else {
                                                            var13 = dg.field_q + var3;
                                                            var14_ref_String = nf.field_e;
                                                            break L128;
                                                          }
                                                        }
                                                        L129: {
                                                          if (Math.abs(this.field_h) != 8) {
                                                            break L129;
                                                          } else {
                                                            var14_ref_String = oo.field_r;
                                                            var13 = q.field_H + var3;
                                                            break L129;
                                                          }
                                                        }
                                                        tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21 - 1), 302 + uc.field_a, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                        tj.field_t.a(var14_ref_String, 290 + bi.field_I + 21, -2 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                        tj.field_t.a(var14_ref_String, bi.field_I + 311, uc.field_a - -302, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                        var13 = "";
                                                        var15 = 300 + bi.field_I;
                                                        var16 = uc.field_a - -336;
                                                        mi.field_B.a(aj.field_b, var15, var16, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                        var15 += 74;
                                                        var17_int = 0;
                                                        L130: while (true) {
                                                          L131: {
                                                            L132: {
                                                              if (5 <= var17_int) {
                                                                if (!ArcanistsMulti.i((byte) -90)) {
                                                                  stackIn_731_0 = var3;
                                                                  stackIn_731_1 = 5;
                                                                  break L132;
                                                                } else {
                                                                  var13 = nf.field_yb;
                                                                  break L131;
                                                                }
                                                              } else {
                                                                stackIn_731_0 = var17_int ^ -1;

                                                                stackIn_731_1 = var3 ^ -1;

                                                                L133: {
                                                                  if (stackIn_731_0 > stackIn_731_1) {
                                                                    tg.field_b[7].a(var15, var16);
                                                                    break L133;
                                                                  } else {
                                                                    tg.field_b[7].a(var15, var16, 64, 0);
                                                                    break L133;
                                                                  }
                                                                }
                                                                var15 += 9;
                                                                var17_int++;
                                                                continue L130;
                                                              }
                                                            }
                                                            if (stackIn_731_0 < stackIn_731_1) {
                                                              var13 = mb.field_R;
                                                              break L131;
                                                            } else {
                                                              var13 = ij.field_Ob;
                                                              break L131;
                                                            }
                                                          }
                                                          mi.field_B.a(var13, 440 + bi.field_I, var16, 170, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                          var13 = "";
                                                          break L101;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L134: {
                                                if (153 > jf.field_j) {
                                                  break L134;
                                                } else {
                                                  if (ad.field_d >= 10) {
                                                    break L134;
                                                  } else {
                                                    var14 = 308 + (bi.field_I + ad.field_d * 32);
                                                    var15 = 400 + uc.field_a;
                                                    if ((an.field_g ^ -1) > (-16 + var14 ^ -1)) {
                                                      break L134;
                                                    } else {
                                                      if ((an.field_g ^ -1) < (16 + var14 ^ -1)) {
                                                        break L134;
                                                      } else {
                                                        if (me.field_I < -16 + var15) {
                                                          break L134;
                                                        } else {
                                                          if (me.field_I > var15 - -16) {
                                                            break L134;
                                                          } else {
                                                            this.field_m = 9;
                                                            break L134;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L135: {
                                                L136: {
                                                  if (tn.field_Ib == var13) {
                                                    break L136;
                                                  } else {
                                                    if (var13 != vl.field_l) {
                                                      break L135;
                                                    } else {
                                                      break L136;
                                                    }
                                                  }
                                                }
                                                if (153 > jf.field_j) {
                                                  break L135;
                                                } else {
                                                  if (10 <= ad.field_d) {
                                                    break L135;
                                                  } else {
                                                    L137: {
                                                      var13 = ti.field_F;
                                                      if (this.field_m != 9) {
                                                        break L137;
                                                      } else {
                                                        var35 = vh.field_h;
                                                        var14 = 250 + ad.field_d * 250;
                                                        var13 = var35 + tj.a(param0 ^ -50, new String[]{Integer.toString(var14)}, ck.field_e);
                                                        break L137;
                                                      }
                                                    }
                                                    mi.field_B.a(var13, bi.field_I + 302, 116 + (178 + uc.field_a), 299, 129, 0, -1, 1, 0, mi.field_B.field_C);
                                                    var14 = 0;
                                                    L138: while (true) {
                                                      if ((var14 ^ -1) <= -11) {
                                                        break L93;
                                                      } else {
                                                        L139: {
                                                          var15 = 308 + bi.field_I - -(var14 * 32);
                                                          var16 = uc.field_a - -400;
                                                          if ((ad.field_d ^ -1) <= (var14 ^ -1)) {
                                                            de.c(var15, -1 + var16, 14, 16711680);
                                                            de.c(var15 + -1, var16, 14, 16711680);
                                                            de.c(var15, var16 - -1, 14, 8912896);
                                                            de.c(1 + var15, var16, 14, 8912896);
                                                            de.c(var15, var16, 14, 0, 128);
                                                            de.c(var15, var16, 14, 16744576);
                                                            if (ad.field_d != var14) {
                                                              rb.field_o[var14].d(var15 + -15, -rb.field_o[var14].field_o + (var16 - rb.field_o[var14].field_y / 2), 16711680);
                                                              break L139;
                                                            } else {
                                                              L140: {
                                                                rb.field_o[var14].a(var15 + -15, -(rb.field_o[var14].field_y / 2) + (var16 - rb.field_o[var14].field_o), 0);
                                                                if ((var15 - 16 ^ -1) < (an.field_g ^ -1)) {
                                                                  break L140;
                                                                } else {
                                                                  if (an.field_g > 16 + var15) {
                                                                    break L140;
                                                                  } else {
                                                                    if ((-16 + var16 ^ -1) < (me.field_I ^ -1)) {
                                                                      break L140;
                                                                    } else {
                                                                      if (var16 + 16 < me.field_I) {
                                                                        break L140;
                                                                      } else {
                                                                        var17_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                                                                        var19 = (int)(-256.0 + (Math.cos(4.0 * var17_double) * 256.0 + 4096.0)) / 2;
                                                                        var20 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var17_double));
                                                                        tk.field_x[4].a(var15, var16, var20, var19);
                                                                        gn.a(8, (byte) 71, 128, var15 - var19 * 8 / 4096, var16 + -(8 * var19 / 4096));
                                                                        break L139;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var17_double = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                                              var19 = (int)(-256.0 + (256.0 * Math.cos(var17_double * 4.0) + 4096.0)) / 2;
                                                              var20 = (int)(5000.0 * Math.sin(2.0 * var17_double) + 0.0);
                                                              tk.field_x[4].a(var15, var16, var20, var19);
                                                              de.c(var15, var16, 33 * var19 / 4096, 0, 128);
                                                              gn.a(8, (byte) 99, 128, -(var19 * 8 / 4096) + var15, var16 - var19 * 8 / 4096);
                                                              de.c(var15, var16, var19 * 32 / 4096, 0, 128);
                                                              break L139;
                                                            }
                                                          } else {
                                                            vd.field_b.f(var15 + -15, -16 + var16);
                                                            break L139;
                                                          }
                                                        }
                                                        var14++;
                                                        continue L138;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              mi.field_B.a(var13, 12 + (290 + bi.field_I), 294 + uc.field_a, 299, 129, 0, -1, 1, 1, mi.field_B.field_C);
                                              break L93;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if ((this.field_i ^ -1) > (var12 ^ -1)) {
                                    break L94;
                                  } else {
                                    L141: {
                                      var38 = tc.field_w[this.field_i];
                                      var13 = var38;
                                      var39 = vm.field_d[this.field_i];
                                      var15 = 11 + bi.field_I - -290;
                                      var16 = 302 + uc.field_a;
                                      if (1 != this.field_m) {
                                        L142: {
                                          mi.field_B.a(var38, -1 + var15, var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                          mi.field_B.a(var38, var15, -1 + var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                          mi.field_B.a(var13, var15, var16, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                                          var17 = null;
                                          var18 = 16711680;
                                          if (!ArcanistsMulti.i((byte) -101)) {
                                            if (this.field_m != 6) {
                                              if (-8 == (this.field_m ^ -1)) {
                                                if ((var3 ^ -1) <= -3) {
                                                  var18 = 65280;
                                                  var17 = gi.field_l;
                                                  break L142;
                                                } else {
                                                  var17 = jk.field_d + var3 + "/2)";
                                                  break L142;
                                                }
                                              } else {
                                                if (-9 != (this.field_m ^ -1)) {
                                                  break L142;
                                                } else {
                                                  if (3 > var3) {
                                                    var17 = jk.field_d + var3 + "/3)";
                                                    break L142;
                                                  } else {
                                                    var18 = 65280;
                                                    var17 = ej.field_P;
                                                    break L142;
                                                  }
                                                }
                                              }
                                            } else {
                                              var40 = ra.field_i;
                                              if (9 == this.field_h) {
                                                var17 = vf.field_h;
                                                break L142;
                                              } else {
                                                mi.field_B.a(var40, 163 + var15 - 22, var16, 141, 29, var18, 0, 1, 1, mi.field_B.field_C);
                                                mi.field_B.a(var39, -3 + var15, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                                break L93;
                                              }
                                            }
                                          } else {
                                            var17 = gg.field_g;
                                            break L142;
                                          }
                                        }
                                        mi.field_B.a((String) (var17), 163 + var15 - 22, var16, 141, 29, var18, 0, 1, 1, mi.field_B.field_C);
                                        break L141;
                                      } else {
                                        tj.field_t.a(var38, var15 + -1, var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                        tj.field_t.a(var38, var15, -1 + var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                        tj.field_t.a(var13, var15, var16, 301, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                        break L141;
                                      }
                                    }
                                    mi.field_B.a(var39, -3 + var15, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                    break L94;
                                  }
                                }
                                break L93;
                              }
                              break L0;
                            }
                          } else {
                            var13_int = 96;
                            var14_double = 3.141592653589793 * (double)var12 * 2.0 / 128.0;
                            var16 = 122 + (bi.field_I - -32) + (-6 + -(int)(Math.cos(var14_double) * (double)var13_int) + -16);
                            var17_int = 178 + (uc.field_a + 122) - ((int)(Math.sin(var14_double) * (double)var13_int) + 16);
                            de.i(var16 + 16, 16 + var17_int, 4, 10326659);
                            var12++;
                            continue L34;
                          }
                        }
                      } else {
                        var13_int = 96;
                        var14_double = (double)var12 * 3.141592653589793 * 2.0 / 128.0;
                        var16 = 132 + (bi.field_I + -(int)(Math.cos(var14_double) * (double)var13_int));
                        var17_int = -16 + (122 + (uc.field_a + 178 - (int)((double)var13_int * Math.sin(var14_double))));
                        de.i(var16 - -16, 16 + var17_int, 5, 0);
                        var12++;
                        continue L33;
                      }
                    }
                  } else {
                    var13_int = 0;
                    L143: while (true) {
                      if (-3 >= (var13_int ^ -1)) {
                        var12++;
                        continue L31;
                      } else {
                        var14 = 290 + bi.field_I + 41 * var12;
                        var15 = 209 + (uc.field_a - -(var13_int * 41));
                        discarded$5 = this.a(true, 39, (byte) -104, true, var14, 39, var15);
                        var16 = b.field_f[var13_int + 2 * var12];
                        stackIn_154_0 = var16 ^ -1;

                        L144: {
                          if (stackIn_154_0 == 0) {
                            break L144;
                          } else {
                            L145: {
                              var17_int = 1;
                              var18 = var16;
                              var19 = var18 / 12;
                              de.h(1 + var14, var15 + 1, 37 + var14, 37 + var15);
                              if (var18 >= 0) {
                                L146: {
                                  L147: {
                                    if (var19 != var9) {
                                      break L147;
                                    } else {
                                      if ((var9 ^ -1) != 0) {
                                        break L146;
                                      } else {
                                        break L147;
                                      }
                                    }
                                  }
                                  var9 = var19;
                                  var11 = 0;
                                  break L146;
                                }
                                L148: {
                                  if ((var18 % 12 ^ -1) <= -11) {
                                    if ((var19 ^ -1) >= -1) {
                                      break L148;
                                    } else {
                                      if (5 > var11) {
                                        var17_int = 0;
                                        break L148;
                                      } else {
                                        break L148;
                                      }
                                    }
                                  } else {
                                    if ((1 & var18) != 1) {
                                      break L148;
                                    } else {
                                      if (var10 != -1 + var18) {
                                        var17_int = 0;
                                        break L148;
                                      } else {
                                        break L148;
                                      }
                                    }
                                  }
                                }
                                if (var17_int != 0) {
                                  var11++;
                                  var10 = var18;
                                  break L145;
                                } else {
                                  break L145;
                                }
                              } else {
                                break L145;
                              }
                            }
                            L149: {
                              if (var17_int != 0) {
                                bb.field_g[dd.field_f[var16]].c(var14 + -1, var15 - 1);
                                break L149;
                              } else {
                                bb.field_g[dd.field_f[var16]].f(var14 + -1, -1 + var15, 64);
                                de.b(var14, var15, var14 + 32, 32 + var15, 16711680);
                                de.b(32 + var14, var15, var14, 32 + var15, 16711680);
                                b.field_f[var13_int + 2 * var12] = -1;
                                break L149;
                              }
                            }
                            L150: {
                              if (!ArcanistsMulti.i((byte) -62)) {
                                if (var16 < 108) {
                                  if (-23 >= (var16 ^ -1)) {
                                    L151: {
                                      if ((var19 ^ -1) >= -2) {
                                        break L151;
                                      } else {
                                        if (0L != (cb.field_e & 1L << var19 * 8 + -14)) {
                                          break L151;
                                        } else {
                                          L152: {
                                            if (bc.field_b != var19) {
                                              break L152;
                                            } else {
                                              if ((mf.field_a ^ -1) == (-(var19 * 12) + var16 ^ -1)) {
                                                break L151;
                                              } else {
                                                if ((mf.field_a - -1 ^ -1) == (var16 + -(var19 * 12) ^ -1)) {
                                                  break L151;
                                                } else {
                                                  break L152;
                                                }
                                              }
                                            }
                                          }
                                          ii.field_d.c(var14 + -1, -1 + var15, 40, 40, 128);
                                          break L150;
                                        }
                                      }
                                    }
                                    if ((var18 % 12 ^ -1) <= -11) {
                                      if ((1L << -18 + (var18 % 12 + 8 * var19) & cb.field_e) != 0L) {
                                        break L150;
                                      } else {
                                        ii.field_d.c(-1 + var14, -1 + var15, 40, 40, 128);
                                        break L150;
                                      }
                                    } else {
                                      if ((1 & var18 ^ -1) != -2) {
                                        break L150;
                                      } else {
                                        if ((1L << -13 + 8 * var19 + (var18 % 12 - 1) / 2 & cb.field_e ^ -1L) != -1L) {
                                          break L150;
                                        } else {
                                          L153: {
                                            if ((bc.field_b ^ -1) != (var19 ^ -1)) {
                                              break L153;
                                            } else {
                                              if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                                break L150;
                                              } else {
                                                break L153;
                                              }
                                            }
                                          }
                                          ii.field_d.c(var14 - 1, -1 + var15, 40, 40, 128);
                                          break L150;
                                        }
                                      }
                                    }
                                  } else {
                                    break L150;
                                  }
                                } else {
                                  L154: {
                                    if (ArcanistsMulti.i((byte) -119)) {
                                      break L154;
                                    } else {
                                      if ((ad.field_d ^ -1) != -1) {
                                        break L150;
                                      } else {
                                        break L154;
                                      }
                                    }
                                  }
                                  ii.field_d.c(-1 + var14, var15 + -1, 40, 40, 128);
                                  break L150;
                                }
                              } else {
                                if (var16 < 22) {
                                  break L150;
                                } else {
                                  L155: {
                                    if ((bc.field_b ^ -1) != (var19 ^ -1)) {
                                      break L155;
                                    } else {
                                      if ((mf.field_a ^ -1) == (-(var19 * 12) + var16 ^ -1)) {
                                        break L150;
                                      } else {
                                        if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                          break L150;
                                        } else {
                                          break L155;
                                        }
                                      }
                                    }
                                  }
                                  ii.field_d.c(var14 - 1, -1 + var15, 40, 40, 128);
                                  break L150;
                                }
                              }
                            }
                            de.a();
                            if ((an.field_g ^ -1) > (var14 ^ -1)) {
                              break L144;
                            } else {
                              if (var15 > me.field_I) {
                                break L144;
                              } else {
                                if ((an.field_g ^ -1) <= (var14 - -39 ^ -1)) {
                                  break L144;
                                } else {
                                  if (var15 + 39 > me.field_I) {
                                    this.field_m = 2;
                                    this.field_i = var13_int + 2 * var12;
                                    break L144;
                                  } else {
                                    break L144;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var13_int++;
                        continue L143;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.N(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_46_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (7 == this.field_l) {
                L2: {
                  if (param1 != 0) {
                    break L2;
                  } else {
                    if (-1 != (fh.field_e ^ -1)) {
                      break L2;
                    } else {
                      return false;
                    }
                  }
                }
                if (param1 != 2) {
                  break L1;
                } else {
                  if ((fh.field_e ^ -1) == (gd.field_kb.length - 1 ^ -1)) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (14 != this.field_l) {
                break L3;
              } else {
                L4: {
                  if ((param1 ^ -1) != -1) {
                    break L4;
                  } else {
                    if (-1 != (mj.field_p ^ -1)) {
                      break L4;
                    } else {
                      stackIn_23_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                if (param1 != 1) {
                  break L3;
                } else {
                  if (7 == mj.field_p) {
                    stackIn_30_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (-4 != (this.field_l ^ -1)) {
              L5: {
                if (param0 == -46) {
                  break L5;
                } else {
                  field_c = (String) null;
                  break L5;
                }
              }
              stackIn_46_0 = 1;
              decompiledRegionSelector0 = 4;
              break L0;
            } else {
              L6: {
                L7: {
                  if (1 == param1) {
                    break L7;
                  } else {
                    if (jb.field_z == null) {
                      stackIn_41_0 = 0;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                stackIn_41_0 = 1;
                break L6;
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_30_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0 != 0;
              } else {
                return stackIn_46_0 != 0;
              }
            }
          }
        }
    }

    private final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (td.e(true)) {
                L2: {
                  if (!ri.field_b[82]) {
                    break L2;
                  } else {
                    if (ri.field_b[28]) {
                      gj.a(false, true, 10, mn.field_r);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!ri.field_b[82]) {
                    break L3;
                  } else {
                    if (!ri.field_b[70]) {
                      break L3;
                    } else {
                      ah.field_c = 1;
                      break L3;
                    }
                  }
                }
                if (si.field_g != 12) {
                  break L1;
                } else {
                  L4: {
                    if ((vn.field_d ^ -1) != -27) {
                      break L4;
                    } else {
                      if (ua.field_P >= jf.field_j) {
                        break L4;
                      } else {
                        jf.field_j = jf.field_j - 1;
                        break L4;
                      }
                    }
                  }
                  if (-28 != (vn.field_d ^ -1)) {
                    break L1;
                  } else {
                    if (jf.field_j >= 153) {
                      break L1;
                    } else {
                      jf.field_j = jf.field_j + 1;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 > 42) {
                break L5;
              } else {
                this.field_g = (so) null;
                break L5;
              }
            }
            L6: {
              if (-13 != (si.field_g ^ -1)) {
                break L6;
              } else {
                L7: {
                  if ((vn.field_d ^ -1) != -97) {
                    break L7;
                  } else {
                    this.field_d = this.field_d - 1;
                    break L7;
                  }
                }
                if (vn.field_d == 97) {
                  this.field_d = this.field_d + 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if ((si.field_g ^ -1) == -9) {
                L9: {
                  if ((vn.field_d ^ -1) != -97) {
                    break L9;
                  } else {
                    if (this.field_g.field_h < 3) {
                      this.field_g.field_h = this.field_g.field_h - 1;
                      if (0 > this.field_g.field_h) {
                        this.field_g.field_h = 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (97 == vn.field_d) {
                    if ((this.field_g.field_h ^ -1) > -4) {
                      this.field_g.field_h = this.field_g.field_h + 1;
                      if ((this.field_g.field_h ^ -1) >= -3) {
                        break L10;
                      } else {
                        this.field_g.field_h = 0;
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if ((vn.field_d ^ -1) == -99) {
                    break L11;
                  } else {
                    if (vn.field_d == 99) {
                      break L11;
                    } else {
                      this.field_g.d(-101);
                      break L8;
                    }
                  }
                }
                L12: {
                  if (this.field_g.field_h != 3) {
                    if ((this.field_g.field_f ^ -1) != -5) {
                      break L12;
                    } else {
                      this.field_g.field_h = 3;
                      break L12;
                    }
                  } else {
                    this.field_g.field_h = 1;
                    break L12;
                  }
                }
                this.field_g.d(-101);
                break L8;
              } else {
                if (-8 != (si.field_g ^ -1)) {
                  L13: {
                    if ((si.field_g ^ -1) != -7) {
                      break L13;
                    } else {
                      if (!lc.a((byte) 112)) {
                        this.c((byte) -92);
                        break L8;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if ((si.field_g ^ -1) != -15) {
                    if ((si.field_g ^ -1) == -11) {
                      this.field_g.a(-100, 0);
                      break L8;
                    } else {
                      this.field_g.a((byte) -76);
                      break L8;
                    }
                  } else {
                    if (-97 == (vn.field_d ^ -1)) {
                      L14: {
                        if (!this.a((byte) -46, 0)) {
                          break L14;
                        } else {
                          this.field_g.a(0, false);
                          break L14;
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-98 == (vn.field_d ^ -1)) {
                        L15: {
                          if (!this.a((byte) -46, 1)) {
                            break L15;
                          } else {
                            this.field_g.a(1, false);
                            break L15;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if ((vn.field_d ^ -1) != -99) {
                          if (vn.field_d == 99) {
                            L16: {
                              var2_int = this.field_g.field_h - -1;
                              if ((var2_int ^ -1) <= (this.field_g.field_f ^ -1)) {
                                var2_int = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if ((var2_int ^ -1) != -1) {
                                break L17;
                              } else {
                                if (!this.a((byte) -46, 0)) {
                                  var2_int++;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (-2 != (var2_int ^ -1)) {
                                break L18;
                              } else {
                                if (!this.a((byte) -46, 1)) {
                                  var2_int++;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            this.field_g.a(var2_int, false);
                            break L8;
                          } else {
                            this.field_g.a((byte) -76);
                            break L8;
                          }
                        } else {
                          L19: {
                            var2_int = -1 + this.field_g.field_h;
                            if (-2 != (var2_int ^ -1)) {
                              break L19;
                            } else {
                              if (this.a((byte) -46, 1)) {
                                break L19;
                              } else {
                                var2_int--;
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if ((var2_int ^ -1) != -1) {
                              break L20;
                            } else {
                              if (!this.a((byte) -46, 0)) {
                                var2_int--;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (-1 < (var2_int ^ -1)) {
                              var2_int = this.field_g.field_f + -1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          this.field_g.a(var2_int, false);
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  this.b(false);
                  break L8;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int b(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (this.field_l != 6) {
              if ((this.field_l ^ -1) == -8) {
                stackIn_15_0 = param0 * 200 + 20;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if ((this.field_l ^ -1) == -12) {
                    if (-1 != (param0 ^ -1)) {
                      if (-2 != (param0 ^ -1)) {
                        break L1;
                      } else {
                        stackIn_24_0 = 304;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_21_0 = 33;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                if ((this.field_l ^ -1) == -13) {
                  if (-1 == (param0 ^ -1)) {
                    stackIn_32_0 = 26;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if (-2 != (param0 ^ -1)) {
                      stackIn_37_0 = param0 * 220 + lm.field_e[this.field_l];
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      stackIn_35_0 = 287;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  }
                } else {
                  L2: {
                    if (-15 == (this.field_l ^ -1)) {
                      if (wl.field_L[this.field_l][param0] != 25) {
                        if (wl.field_L[this.field_l][param0] != 26) {
                          if (29 != wl.field_L[this.field_l][param0]) {
                            if (7 == wl.field_L[this.field_l][param0]) {
                              stackIn_64_0 = 220;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L2;
                            }
                          } else {
                            stackIn_59_0 = 220;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          }
                        } else {
                          L3: {
                            if (this.a((byte) -46, 0)) {
                              stackIn_56_0 = 320;
                              break L3;
                            } else {
                              stackIn_56_0 = 220;
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 9;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (!this.a((byte) -46, 1)) {
                            stackIn_48_0 = 220;
                            break L4;
                          } else {
                            stackIn_48_0 = 120;
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 8;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (this.field_l == 3) {
                    stackIn_69_0 = 80;
                    decompiledRegionSelector0 = 12;
                    break L0;
                  } else {
                    if (this.field_l != 9) {
                      L5: {
                        if (-9 != (this.field_l ^ -1)) {
                          break L5;
                        } else {
                          if (-1 != (param0 ^ -1)) {
                            if (1 == param0) {
                              stackIn_83_0 = 220;
                              decompiledRegionSelector0 = 15;
                              break L0;
                            } else {
                              if ((param0 ^ -1) == -3) {
                                stackIn_88_0 = 420;
                                decompiledRegionSelector0 = 16;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            stackIn_78_0 = 20;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          }
                        }
                      }
                      L6: {
                        if (param1 == 200) {
                          break L6;
                        } else {
                          field_q = (on[]) null;
                          break L6;
                        }
                      }
                      stackIn_93_0 = lm.field_e[this.field_l];
                      decompiledRegionSelector0 = 17;
                      break L0;
                    } else {
                      stackIn_72_0 = 200;
                      decompiledRegionSelector0 = 13;
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (!lc.a((byte) 112)) {
                L7: {
                  if (param0 < 2) {
                    stackIn_10_0 = param0 * 150 + 20;
                    break L7;
                  } else {
                    stackIn_10_0 = 320;
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = 160;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.IA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_37_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_56_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_59_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_64_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_69_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_72_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_78_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_83_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_88_0;
                                        } else {
                                          return stackIn_93_0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_0;
        int stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        int stackIn_10_5;
        String stackIn_25_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = param1 - (-param3 - param7);
              if (var10_int == 0) {
                break L1;
              } else {
                param3 = (200 * param3 - -var10_int) / (var10_int * 2);
                param7 = (200 * param7 - -var10_int) / (2 * var10_int);
                param1 = (param1 * 200 + var10_int) / (var10_int * 2);
                break L1;
              }
            }
            L2: {
              if (param0 != 0) {
                L3: {
                  stackIn_9_0 = 45 + bi.field_I;

                  stackIn_9_1 = param8 + -22;

                  stackIn_9_2 = 550;

                  stackIn_9_3 = 26;

                  stackIn_9_4 = param0;

                  if (param0 == 16777215) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = stackIn_9_2;
                    stackIn_10_3 = stackIn_9_3;
                    stackIn_10_4 = stackIn_9_4;
                    stackIn_10_5 = 32;
                    break L3;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = stackIn_9_2;
                    stackIn_10_3 = stackIn_9_3;
                    stackIn_10_4 = stackIn_9_4;
                    stackIn_10_5 = 128;
                    break L3;
                  }
                }
                de.e(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              param8 -= 4;
              param0 = 0;
              if (-1 == param5) {
                break L4;
              } else {
                mi.field_B.c(param5 - -1 + ". ", 60 + (bi.field_I + 30), param8, param0, -1);
                break L4;
              }
            }
            L5: {
              var14 = param2;
              var11 = var14;
              if (param6 < -92) {
                break L5;
              } else {
                this.field_h = -20;
                break L5;
              }
            }
            var12 = var14.length();
            L6: while (true) {
              if (175 >= mi.field_B.b(var11)) {
                L7: {
                  mi.field_B.a(var11, 90 + bi.field_I, param8, param0, -1);
                  var15 = Integer.toString(param4);
                  mi.field_B.b(var15, no.field_tb[0] + bi.field_I, param8, param0, -1);
                  if (500 <= var10_int) {
                    stackIn_25_0 = "500+";
                    break L7;
                  } else {
                    stackIn_25_0 = Integer.toString(var10_int);
                    break L7;
                  }
                }
                var11 = stackIn_25_0;
                mi.field_B.b(var11, bi.field_I - -no.field_tb[1], param8, param0, -1);
                var16 = param1 + "%";
                mi.field_B.b(var16, bi.field_I + no.field_tb[2], param8, param0, -1);
                var17 = param3 + "%";
                mi.field_B.b(var17, bi.field_I + no.field_tb[3], param8, param0, -1);
                var18 = param7 + "%";
                mi.field_B.b(var18, bi.field_I + no.field_tb[4], param8, param0, -1);
                break L0;
              } else {
                var11 = param2.substring(0, var12) + "...";
                var12--;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var10);

            stackIn_30_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_g = (so) null;
                break L1;
              }
            }
            L2: {
              if (!this.a((byte) -46, 0)) {
                stackIn_8_0 = 1;
                break L2;
              } else {
                stackIn_8_0 = 0;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_8_0;
              if (this.a((byte) -46, 2)) {
                stackIn_12_0 = 2;
                break L3;
              } else {
                stackIn_12_0 = 1;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_12_0;
              if (!this.field_g.c((byte) 84)) {
                L5: {
                  if (96 == vn.field_d) {
                    if ((this.field_g.field_h ^ -1) < (var2_int ^ -1)) {
                      this.field_g.a(this.field_g.field_h + -1, param0);
                      break L5;
                    } else {
                      this.field_g.a(var3, false);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (-98 == (vn.field_d ^ -1)) {
                  L6: {
                    if (0 > this.field_g.field_h) {
                      break L6;
                    } else {
                      if ((this.field_g.field_h ^ -1) > (var3 ^ -1)) {
                        this.field_g.a(1 + this.field_g.field_h, false);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_g.a(var2_int, false);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              this.field_g.d(51);
              if (this.a((byte) -46, 0)) {
                stackIn_38_0 = 0;
                break L7;
              } else {
                stackIn_38_0 = 1;
                break L7;
              }
            }
            L8: {
              var2_int = stackIn_38_0;
              if (!this.a((byte) -46, 2)) {
                stackIn_42_0 = 1;
                break L8;
              } else {
                stackIn_42_0 = 2;
                break L8;
              }
            }
            L9: {
              var3 = stackIn_42_0;
              if (var2_int <= this.field_g.field_h) {
                break L9;
              } else {
                this.field_g.field_h = var2_int;
                break L9;
              }
            }
            L10: {
              if (var3 < this.field_g.field_h) {
                this.field_g.field_h = var3;
                break L10;
              } else {
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.LA(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        int[] stackIn_35_0 = null;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_42_0 = null;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        boolean stackIn_153_0 = false;
        Object stackIn_159_0 = null;
        Object stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        Object stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_165_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_152_0;
        le var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qb var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (cc.c((byte) 118)) {
              pb.a(2341);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == -45) {
                L1: {
                  if (lc.a((byte) 112)) {
                    break L1;
                  } else {
                    if (0 < ah.field_c) {
                      ce.field_g[15] = wj.field_e;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_l == 16) {
                  de.b();
                  to.field_s.b((byte) -102);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if ((this.field_l ^ -1) == -6) {
                        break L3;
                      } else {
                        if (-4 == (this.field_l ^ -1)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      var2 = jb.field_z;
                      if (var2 != null) {
                        break L4;
                      } else {
                        var2 = r.field_b;
                        break L4;
                      }
                    }
                    L5: {
                      var3 = var2.field_V.d(false);
                      if ((var3 ^ -1) <= -1) {
                        break L5;
                      } else {
                        var3 = 6;
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_35_0 = nj.field_n;

                      if ((this.field_l ^ -1) == -4) {
                        stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                        stackIn_36_1 = var3;
                        break L6;
                      } else {


                        if (-1 >= (var2.field_I ^ -1)) {
                          stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                          stackIn_36_1 = var2.field_I;
                          break L6;
                        } else {

                          stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                          stackIn_36_1 = 6;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var4 = stackIn_36_0[stackIn_36_1];
                      if (var2.field_V.field_d) {
                        L8: {
                          stackIn_42_0 = nj.field_n;

                          if (-4 != (this.field_l ^ -1)) {


                            if ((var2.field_I ^ -1) <= -1) {
                              stackIn_46_0 = (int[]) ((Object) stackIn_42_0);
                              stackIn_46_1 = 1 & var3;
                              break L8;
                            } else {
                              stackIn_46_0 = (int[]) ((Object) stackIn_42_0);
                              stackIn_46_1 = 6;
                              break L8;
                            }
                          } else {
                            stackIn_46_0 = (int[]) ((Object) stackIn_42_0);
                            stackIn_46_1 = 1 & var3;
                            break L8;
                          }
                        }
                        var4 = stackIn_46_0[stackIn_46_1];
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var5 = 240;
                    var6 = an.field_f / 2;
                    var7 = an.field_j / 2;
                    var8 = -var5;
                    L9: while (true) {
                      if (var8 >= var5) {
                        de.a();
                        break L2;
                      } else {
                        de.h(0, var8 + var7, an.field_f, var8 + var7 + 1);
                        de.c(var6, -4 + -(var8 / 2) + var7, var5, var4, 192);
                        gn.a(var5, (byte) 126, 100, var6, -(var8 / 2) + (var7 - 4));
                        var8++;
                        continue L9;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (-2 == (this.field_l ^ -1)) {
                        break L11;
                      } else {
                        if (this.field_l == 2) {
                          break L11;
                        } else {
                          if (-5 != (this.field_l ^ -1)) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    ti.field_N = -1;
                    var2_int = 0;
                    L12: while (true) {
                      if (var2_int >= 256) {
                        break L10;
                      } else {
                        de.e(0, var2_int, an.field_f, 0, -var2_int + 256);
                        var2_int++;
                        continue L12;
                      }
                    }
                  }
                  L13: {
                    if (14 == this.field_l) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          ce.field_m.a(true);
                          if (qn.a(this.field_l, (byte) -32)) {
                            break L15;
                          } else {
                            L16: {
                              if (640 < an.field_f) {
                                break L16;
                              } else {
                                if (480 >= an.field_j) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            sc.a(param0 ^ -47, an.field_j, an.field_f);
                            break L14;
                          }
                        }
                        if (0 != (jb.field_v & 63)) {
                          break L14;
                        } else {
                          pn.field_c = null;
                          break L14;
                        }
                      }
                      if (15 == this.field_l) {
                        wm.field_H[0].c(bi.field_I, uc.field_a);
                        break L13;
                      } else {
                        if (null != wm.field_H[this.field_l]) {
                          wm.field_H[this.field_l].c(bi.field_I, uc.field_a);
                          break L13;
                        } else {
                          lj.a(true, this.field_l);
                          ce.field_m.a(true);
                          break L13;
                        }
                      }
                    }
                  }
                  L17: {
                    if (-10 == (this.field_l ^ -1)) {
                      var2_int = (jb.field_v >> 1237709284) % 4;
                      var3 = jb.field_v / 2 % 2400;
                      if (var3 >= 1200) {
                        rc.field_d[var2_int].c();
                        var4 = -var3 + 2200;
                        var4 = an.field_f * var4 / 640;
                        var5 = 0;
                        L18: while (true) {
                          if (3 <= var5) {
                            rc.field_d[var2_int].c();
                            break L17;
                          } else {
                            rc.field_d[var2_int].a(-(var5 * 120) + var4, -(30 * var5) + 200, 32);
                            var5++;
                            continue L18;
                          }
                        }
                      } else {
                        var4 = var3 - 200;
                        var4 = an.field_f * var4 / 640;
                        var5 = 0;
                        L19: while (true) {
                          if (var5 >= 3) {
                            break L17;
                          } else {
                            rc.field_d[var2_int].a(-(120 * var5) + var4, var5 * 30 + 240, 32);
                            var5++;
                            continue L19;
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  L20: {
                    L21: {
                      if (-2 == (this.field_l ^ -1)) {
                        break L21;
                      } else {
                        if (2 == this.field_l) {
                          break L21;
                        } else {
                          if (4 == this.field_l) {
                            break L21;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    gl.a(sc.field_U[this.field_l] * wl.field_L[this.field_l].length + 48, -24 + this.d(41, 0), -27327, 48 - (-this.a(0, (byte) 103) + this.d(41, 0)), kf.field_b, this.f(0, -7661) + -24);
                    break L20;
                  }
                  L22: {
                    var2 = jb.field_z;
                    if (var2 != null) {
                      break L22;
                    } else {
                      var2 = r.field_b;
                      break L22;
                    }
                  }
                  L23: {
                    if (this.field_l != 2) {
                      break L23;
                    } else {
                      if (var2.field_V.d(false) == var2.field_I) {
                        L24: {
                          var3 = 0;
                          var4 = 0;
                          var5 = 0;
                          var6 = 0;
                          var7 = 16;
                          var8 = 0;
                          var9 = -16;
                          var10 = 0;
                          var11 = 0;
                          var12 = var2.field_z / 50;
                          var13 = (-var12 + 160) / 10;
                          if (-1 < (var13 ^ -1)) {
                            var13 = 0;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          var10 = (int)(Math.cos(0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                          var8 = (int)(Math.cos(5.0 + 0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                          var14 = 16;
                          if (var12 < 60) {
                            var14 = 17;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (30 <= var12) {
                            break L26;
                          } else {
                            var11 = var11 - (int)((double)var13 * Math.cos((double)jb.field_v * 0.4) - (double)var13);
                            var14 = 18;
                            break L26;
                          }
                        }
                        L27: {
                          var15 = 32;
                          var16 = 160;
                          var17 = new qb(128, 256);
                          var17.a();
                          pc.a(kg.field_d[2], -var11 + var16 + var8, kg.field_d[3], kg.field_d[0], (byte) -116, kg.field_d[1], qe.field_i[so.field_c[3]], var7 + var15);
                          if (46 == so.field_c[0]) {
                            break L27;
                          } else {
                            pc.a(kg.field_d[2], -(var11 / 2) + var4 + var16, kg.field_d[3], kg.field_d[0], (byte) -81, kg.field_d[1], fn.field_b[0], var3 + var15);
                            break L27;
                          }
                        }
                        L28: {
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 68, kg.field_d[1], jd.field_j[so.field_c[0]], var15);
                          var16 -= 8;
                          var16 -= 16;
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 43, kg.field_d[1], kc.field_kb[so.field_c[1]], var15);
                          var16 += 16;
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 45, kg.field_d[1], hn.field_d[so.field_c[5]], var15);
                          if (53 == so.field_c[5]) {
                            break L28;
                          } else {
                            if ((so.field_c[5] ^ -1) == -56) {
                              break L28;
                            } else {
                              pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) -125, kg.field_d[1], bo.field_a[var14], var15);
                              break L28;
                            }
                          }
                        }
                        L29: {
                          var16 -= 16;
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 2, kg.field_d[1], tj.field_A[so.field_c[4]], var15);
                          var16 += 8;
                          var16 += 16;
                          if (so.field_c[0] == 46) {
                            break L29;
                          } else {
                            pc.a(kg.field_d[2], var16 + (var6 + -(var11 / 2)), kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], h.field_I[0], var15 + var5);
                            break L29;
                          }
                        }
                        L30: {
                          pc.a(kg.field_d[2], var10 + (var16 - var11), kg.field_d[3], kg.field_d[0], (byte) -111, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var15);
                          ce.field_m.a(true);
                          var18 = an.field_f - 256;
                          var19 = an.field_j + -128;
                          de.e(var18, var19, 256, 128, 0, 192);
                          de.a(-2 + var18, -2 + var19, 256, 128, 0);
                          de.a(-1 + var18, var19 - 1, 256, 128, 4799269);
                          de.a(var18, var19, 256, 128, 8547138);
                          de.a(var18 - -1, var19 - -1, 256, 128, 11768360);
                          de.a(2 + var18, 2 + var19, 256, 128, 0);
                          var20 = null;
                          if ((var12 ^ -1) <= -61) {
                            if (-11 >= (var12 % 60 ^ -1)) {
                              var20_ref = var12 / 60 + ":" + var12 % 60;
                              break L30;
                            } else {
                              var20_ref = var12 / 60 + ":0" + var12 % 60;
                              break L30;
                            }
                          } else {
                            var20_ref = Integer.toString(var12);
                            break L30;
                          }
                        }
                        var20_ref = tj.a(param0 + 1, new String[]{var20_ref}, im.field_i);
                        var17.e(152 + var18, var19 + -104);
                        mi.field_B.a(var20_ref, 8 + var18, 8 + var19, 176, 112, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L31: {
                    L32: {
                      if (13 != this.field_l) {
                        var3 = 0;
                        L33: while (true) {
                          if (var3 >= this.field_g.field_f) {
                            break L32;
                          } else {
                            stackOut_152_0 = this.a((byte) -46, var3);
                            stackIn_165_0 = stackOut_152_0 ? 1 : 0;
                            stackIn_153_0 = stackOut_152_0;
                            L34: {
                              if (!stackIn_153_0) {
                                break L34;
                              } else {
                                L35: {
                                  stackIn_161_0 = this;

                                  stackIn_161_1 = 98;

                                  if (this.field_g.field_h != var3) {
                                    stackIn_162_0 = this;
                                    stackIn_162_1 = stackIn_161_1;
                                    stackIn_162_2 = 0;
                                    break L35;
                                  } else {
                                    stackIn_159_0 = this;

                                    stackIn_162_0 = this;
                                    stackIn_162_1 = stackIn_161_1;
                                    stackIn_162_2 = 1;
                                    break L35;
                                  }
                                }
                                this.a((byte) stackIn_162_1, stackIn_162_2 != 0, var3);
                                break L34;
                              }
                            }
                            var3++;
                            continue L33;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    stackIn_165_0 = this.field_l ^ -1;
                    break L31;
                  }
                  L36: {
                    if (stackIn_165_0 != -1) {
                      break L36;
                    } else {
                      this.c(-26733);
                      break L36;
                    }
                  }
                  L37: {
                    if (-7 != (this.field_l ^ -1)) {
                      if (this.field_l == 7) {
                        this.b((byte) 89);
                        break L37;
                      } else {
                        if (this.field_l != 8) {
                          if (this.field_l != 9) {
                            if (11 == this.field_l) {
                              this.i(12);
                              break L37;
                            } else {
                              if (12 == this.field_l) {
                                this.e(1);
                                break L37;
                              } else {
                                if (-15 != (this.field_l ^ -1)) {
                                  if (-6 == (this.field_l ^ -1)) {
                                    this.h(32);
                                    break L37;
                                  } else {
                                    if (3 != this.field_l) {
                                      break L37;
                                    } else {
                                      this.a(true);
                                      break L37;
                                    }
                                  }
                                } else {
                                  this.a(1);
                                  break L37;
                                }
                              }
                            }
                          } else {
                            mi.field_B.a(jm.field_b, bi.field_I + 80, uc.field_a + 140, 480, 180, 0, -1, 0, 1, 30);
                            break L37;
                          }
                        } else {
                          this.e(true);
                          break L37;
                        }
                      }
                    } else {
                      this.d(true);
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      if ((this.field_l ^ -1) == -1) {
                        break L39;
                      } else {
                        if (-16 == (this.field_l ^ -1)) {
                          break L39;
                        } else {
                          if (this.field_l == 13) {
                            break L39;
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                    var3 = -208 + an.field_f;
                    var4 = an.field_j + -40;
                    var5 = 200 * (wn.field_C + jo.field_c + be.field_f) / 127;
                    var6 = 11176106;
                    var7 = 34;
                    if (200 > var5) {
                      de.h(var3, var4, var3 + var5, var4 - -32);
                      de.b(var3, var4, 200, 32, 15, var6, var7);
                      mi.field_B.b(pi.field_e, var3 - -100, var4 + 19, 16777215, 0);
                      de.h(var5 + var3, var4, 200 + var3, var4 + 32);
                      de.b(var3, var4, 200, 32, 15, var6 >> 593151617 & 8355711, var7);
                      mi.field_B.b(pi.field_e, var3 - -100, var4 - -19, 0, 16777215);
                      de.a();
                      de.a(var3, var4, 200, 32, 15, 0);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void c(boolean param0) {
        try {
            field_q = null;
            field_a = null;
            field_o = null;
            field_r = null;
            field_c = null;
            field_e = null;
            field_k = null;
            field_j = null;
            field_p = null;
            if (!param0) {
                lc.a((byte) -10);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lc.BA(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 103) {
              stackIn_4_0 = this.a(-9, param0) + bi.field_I;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void g(int param0) {
        try {
            mi.field_B.a(hg.field_c, 64 + bi.field_I, 128 + uc.field_a, 512, 224, 0, -1, 1, 1, mi.field_B.field_m + mi.field_B.field_C);
            if (param0 != 12) {
                lc.a((byte) -6);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lc.W(" + param0 + ')');
        }
    }

    private final boolean g(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param0 / 8;
            if ((wd.field_d ^ -1) < (var3_int ^ -1)) {
              var4 = 7 - (7 & param0);
              if (param1 != (1 << var4 & ra.field_f[var3_int])) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (2 > qf.field_d) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    private final void c(byte param0) {
        try {
            int var2_int = -61 % ((-38 - param0) / 46);
            this.field_g.a(82, 2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lc.H(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_l == 10) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 88) {
                var4_int = 0;
                L1: while (true) {
                  L2: {
                    if ((wl.field_L[this.field_l].length ^ -1) >= (var4_int ^ -1)) {
                      stackIn_32_0 = -1;
                      break L2;
                    } else {
                      var5 = this.f(var4_int, param0 ^ -7605);
                      stackOut_11_0 = this.a((byte) -46, var4_int);
                      stackIn_32_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      L3: {
                        if (!stackIn_12_0) {
                          break L3;
                        } else {
                          if (param1 < this.d(41, var4_int)) {
                            break L3;
                          } else {
                            if (this.a(var4_int, (byte) 103) <= param1) {
                              break L3;
                            } else {
                              if ((var5 ^ -1) < (param2 ^ -1)) {
                                break L3;
                              } else {
                                if (param2 < var5 - -this.c(var4_int, 113)) {
                                  stackIn_29_0 = var4_int;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      continue L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = 124;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0;
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    private final int e(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if ((this.field_l ^ -1) == -16) {
              stackIn_4_0 = 75 + (param0 * sc.field_U[this.field_l] + tg.field_f[this.field_l]);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (2 == this.field_l) {
                  break L1;
                } else {
                  if (this.field_l == 4) {
                    break L1;
                  } else {
                    if (-2 != (this.field_l ^ -1)) {
                      if ((this.field_l ^ -1) != -7) {
                        if (-8 != (this.field_l ^ -1)) {
                          if ((this.field_l ^ -1) != -12) {
                            if (12 != this.field_l) {
                              L2: {
                                if (param1 == 75) {
                                  break L2;
                                } else {
                                  this.g(-100);
                                  break L2;
                                }
                              }
                              L3: {
                                if ((this.field_l ^ -1) != -15) {
                                  break L3;
                                } else {
                                  if (wl.field_L[this.field_l][param0] == 25) {
                                    stackIn_40_0 = 348;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  } else {
                                    if (wl.field_L[this.field_l][param0] != 26) {
                                      if (-31 == (wl.field_L[this.field_l][param0] ^ -1)) {
                                        stackIn_48_0 = 412;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      } else {
                                        if (29 == wl.field_L[this.field_l][param0]) {
                                          stackIn_53_0 = 380;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          if (-8 != (wl.field_L[this.field_l][param0] ^ -1)) {
                                            break L3;
                                          } else {
                                            stackIn_56_0 = 444;
                                            decompiledRegionSelector0 = 11;
                                            break L0;
                                          }
                                        }
                                      }
                                    } else {
                                      stackIn_43_0 = 348;
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              if ((this.field_l ^ -1) != -4) {
                                if (-9 != (this.field_l ^ -1)) {
                                  stackIn_78_0 = tg.field_f[this.field_l] + param0 * sc.field_U[this.field_l];
                                  decompiledRegionSelector0 = 16;
                                  break L0;
                                } else {
                                  if (param0 == 3) {
                                    stackIn_74_0 = tg.field_f[this.field_l];
                                    decompiledRegionSelector0 = 14;
                                    break L0;
                                  } else {
                                    stackIn_76_0 = tg.field_f[this.field_l] + 1 * sc.field_U[this.field_l];
                                    decompiledRegionSelector0 = 15;
                                    break L0;
                                  }
                                }
                              } else {
                                L4: {
                                  if ((param0 ^ -1) != -2) {
                                    break L4;
                                  } else {
                                    if (jb.field_z != null) {
                                      break L4;
                                    } else {
                                      stackIn_65_0 = 410 + sc.field_U[this.field_l] / 2;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  }
                                }
                                stackIn_67_0 = 410 - -(param0 * sc.field_U[this.field_l]);
                                decompiledRegionSelector0 = 13;
                                break L0;
                              }
                            } else {
                              stackIn_30_0 = tg.field_f[this.field_l];
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            stackIn_27_0 = tg.field_f[this.field_l];
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackIn_24_0 = tg.field_f[this.field_l];
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        if (lc.a((byte) 112)) {
                          stackIn_21_0 = sc.field_U[this.field_l] * param0 + tg.field_f[this.field_l];
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          stackIn_19_0 = sc.field_U[this.field_l] + tg.field_f[this.field_l];
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackIn_13_0 = -32 + (param0 + -wl.field_L[this.field_l].length) * sc.field_U[this.field_l] - -480;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.O(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_30_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_43_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_48_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_53_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_65_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_67_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_74_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_76_0;
                                      } else {
                                        return stackIn_78_0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    lc(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_d = 0;
        try {
          L0: {
            L1: {
              this.field_l = param0;
              if (null == wl.field_L[this.field_l]) {
                this.field_g = null;
                break L1;
              } else {
                this.field_g = new so(wl.field_L[this.field_l].length);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.<init>(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        hf stackIn_66_0 = null;
        hf stackIn_67_0 = null;
        hf stackIn_69_0 = null;
        hf stackIn_71_0 = null;
        hf stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int[][] stackIn_215_0 = null;
        int stackIn_215_1 = 0;
        int[][] stackIn_215_2 = null;
        int stackIn_215_3 = 0;
        int[][] stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        int[][] stackIn_217_2 = null;
        int stackIn_217_3 = 0;
        int[][] stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        int[][] stackIn_218_2 = null;
        int stackIn_218_3 = 0;
        int stackIn_218_4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        hf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 76) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_h = -27;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fo.field_k = fo.field_k + 1;
                        if (cc.c((byte) 118)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = ii.a(89);
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        dm.g((byte) -96);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (kh.field_b) {
                            statePc = 49;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!oc.field_g) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!ib.b(false)) {
                            statePc = 45;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_46_0 = vn.field_d;
                        stackIn_17_0 = stackIn_46_0;
                        stackIn_46_1 = 13;
                        stackIn_17_1 = stackIn_46_1;
                        if (false) {
                            statePc = 46;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 != stackIn_17_1) {
                            statePc = 41;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_l == 0) {
                            statePc = 41;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (5 == this.field_l) {
                            statePc = 38;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (this.field_l == 1) {
                            statePc = 38;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (2 == this.field_l) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (3 == this.field_l) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_l != 4) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        gj.a(false, true, -1, mn.field_r);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        gj.a(false, true, th.field_f, th.field_f);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.d(111);
                        if (0 != (this.field_g.field_h ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.a(false, this.field_g.field_h, false);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_g.a(this.a((byte) 88, an.field_g, me.field_I), this.a((byte) 88, pb.field_h, ja.field_s), -97);
                        stackIn_46_0 = this.field_g.field_h;
                        stackIn_46_1 = -1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 == stackIn_46_1) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.a(true, this.field_g.field_h, false);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-14 != (this.field_l ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        o.field_s = o.field_s + 1;
                        if (o.field_s > 100) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1 != (wk.field_m ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (ri.field_b[84]) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        gj.a(false, true, 0, mn.field_r);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-9 != (this.field_l ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.f(-1);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (16 != this.field_l) {
                            statePc = 86;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var2 = to.field_s;
                        stackIn_71_0 = (hf) (var2);
                        stackIn_66_0 = stackIn_71_0;
                        if (rc.b(-1)) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_71_0 = (hf) ((Object) stackIn_66_0);
                        stackIn_67_0 = stackIn_71_0;
                        if ((mn.field_r ^ -1) != (this.field_l ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_69_0 = (hf) ((Object) stackIn_67_0);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_72_0 = (hf) ((Object) stackIn_69_0);
                        stackIn_72_1 = 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_72_0 = (hf) ((Object) stackIn_71_0);
                        stackIn_72_1 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3 = ((hf) (Object) stackIn_72_0).a(stackIn_72_1 != 0, true);
                        if (var3 != 3) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var3 == 1) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var3 != 2) {
                            statePc = 86;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var3 != 2) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_85_0 = 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_85_0 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var4 = stackIn_85_0;
                        gj.a(var4 != 0, true, 0, mn.field_r);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((this.field_l ^ -1) != -6) {
                            statePc = 92;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        o.field_s = o.field_s + 1;
                        if (-251 <= (o.field_s ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        gj.a(true, true, -1, mn.field_r);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (3 == this.field_l) {
                            statePc = 93;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (this.field_l == 12) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (-2 == (re.field_r ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (this.field_m != 10) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        this.field_d = this.field_d + this.field_i;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (1 == this.field_m) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if ((var3 ^ -1) <= -17) {
                            statePc = 113;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_121_0 = this.field_i;
                        stackIn_108_0 = stackIn_121_0;
                        stackIn_121_1 = b.field_f[var3];
                        stackIn_108_1 = stackIn_121_1;
                        if (false) {
                            statePc = 121;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 != stackIn_108_1) {
                            statePc = 112;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var2_int = 1;
                        this.field_i = var3;
                        this.field_m = 2;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var3++;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var2_int == 0) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if ((this.field_m ^ -1) != -3) {
                            statePc = 135;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var2_int = this.field_i;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (-16 >= (var2_int ^ -1)) {
                            statePc = 134;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        b.field_f[var2_int] = b.field_f[1 + var2_int];
                        var2_int++;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var3 = 0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackIn_121_0 = var3;
                        stackIn_121_1 = 16;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0 >= stackIn_121_1) {
                            statePc = 129;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackIn_124_0 = -1;
                        stackIn_124_1 = b.field_f[var3];
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (stackIn_124_0 == stackIn_124_1) {
                            statePc = 127;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        b.field_f[var3] = this.field_i;
                        this.field_i = -1;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var3++;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if ((this.field_m ^ -1) != -3) {
                            statePc = 135;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var2_int = this.field_i;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (-16 >= (var2_int ^ -1)) {
                            statePc = 134;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        b.field_f[var2_int] = b.field_f[1 + var2_int];
                        var2_int++;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        b.field_f[15] = -1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (-1 != (this.field_m ^ -1)) {
                            statePc = 138;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        this.field_h = this.field_i;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (-6 == (this.field_m ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if ((jf.field_j ^ -1) > (5 + ua.field_P ^ -1)) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        bg.a(2, this.field_h * 8 + -14);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if ((this.field_m ^ -1) != -8) {
                            statePc = 150;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (2 + ua.field_P > jf.field_j) {
                            statePc = 150;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        bg.a(2, -13 + this.field_h * 8 + (-1 + this.field_i % 12) / 2);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((this.field_m ^ -1) == -9) {
                            statePc = 153;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if ((3 + ua.field_P ^ -1) < (jf.field_j ^ -1)) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        bg.a(2, this.field_i % 12 + this.field_h * 8 + -18);
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (-10 != (this.field_m ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (!ri.field_b[82]) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        bb.c((byte) -120);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var2_int = 0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackIn_165_0 = var3;
                        stackIn_165_1 = 15;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (stackIn_165_0 >= stackIn_165_1) {
                            statePc = 177;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackIn_165_0 = 0;
                        stackIn_167_0 = stackIn_165_0;
                        stackIn_165_1 = b.field_f[var3] ^ -1;
                        stackIn_167_1 = stackIn_165_1;
                        if (false) {
                            statePc = 165;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (stackIn_167_0 == stackIn_167_1) {
                            statePc = 171;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (b.field_f[1 + var3] >= b.field_f[var3]) {
                            statePc = 176;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (b.field_f[var3 + 1] != -1) {
                            statePc = 175;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        var4 = b.field_f[var3];
                        b.field_f[var3] = b.field_f[var3 - -1];
                        b.field_f[1 + var3] = var4;
                        var2_int = 1;
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var3++;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (var2_int != 0) {
                            statePc = 163;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (-12 == (this.field_l ^ -1)) {
                            statePc = 181;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        this.field_f = 0.0;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (1 == re.field_r) {
                            statePc = 185;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (this.field_m == 0) {
                            statePc = 188;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        so.field_c[this.field_h] = this.field_i;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if ((this.field_m ^ -1) != -7) {
                            statePc = 192;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        this.field_n = this.field_n + this.field_i;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (-9 != (this.field_m ^ -1)) {
                            statePc = 193;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (1 != this.field_m) {
                            statePc = 196;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        this.field_h = this.field_i;
                        this.field_n = 0;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (this.field_m == 2) {
                            statePc = 199;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        kg.field_d[0] = ld.field_n[this.field_i];
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (3 == this.field_m) {
                            statePc = 203;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        kg.field_d[1] = ud.field_z[this.field_i];
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (4 != this.field_m) {
                            statePc = 207;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        kg.field_d[2] = ug.field_d[this.field_i];
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (this.field_m == 5) {
                            statePc = 210;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        kg.field_d[3] = hi.field_b[this.field_i];
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if ((this.field_m ^ -1) == -8) {
                            statePc = 214;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        so.field_c[0] = (int)(12.0 * Math.random());
                        so.field_c[1] = (int)(18.0 * Math.random() * 3.0);
                        so.field_c[2] = (int)(Math.random() * 12.0);
                        so.field_c[3] = (int)(12.0 * Math.random());
                        so.field_c[4] = (int)(3.0 * (14.0 * Math.random()));
                        so.field_c[5] = (int)(3.0 * (14.0 * Math.random()));
                        kg.field_d[0] = ld.field_n[(int)(Math.random() * (double)ld.field_n.length)];
                        kg.field_d[1] = ud.field_z[(int)(Math.random() * (double)ud.field_z.length)];
                        kg.field_d[2] = ug.field_d[(int)(Math.random() * (double)ug.field_d.length)];
                        stackIn_217_0 = kg.field_d;
                        stackIn_215_0 = stackIn_217_0;
                        stackIn_217_1 = 3;
                        stackIn_215_1 = stackIn_217_1;
                        stackIn_217_2 = hi.field_b;
                        stackIn_215_2 = stackIn_217_2;
                        stackIn_217_3 = (int)(Math.random() * (double)hi.field_b.length);
                        stackIn_215_3 = stackIn_217_3;
                        if (Math.random() >= 1.1) {
                            statePc = 217;
                        } else {
                            statePc = 215;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        stackIn_218_0 = (int[][]) ((Object) stackIn_215_0);
                        stackIn_218_1 = stackIn_215_1;
                        stackIn_218_2 = (int[][]) ((Object) stackIn_215_2);
                        stackIn_218_3 = stackIn_215_3;
                        stackIn_218_4 = 5;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        stackIn_218_0 = (int[][]) ((Object) stackIn_217_0);
                        stackIn_218_1 = stackIn_217_1;
                        stackIn_218_2 = (int[][]) ((Object) stackIn_217_2);
                        stackIn_218_3 = stackIn_217_3;
                        stackIn_218_4 = 8;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        stackIn_218_0[stackIn_218_1] = stackIn_218_2[stackIn_218_3 % stackIn_218_4];
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        this.field_f = this.field_f + 0.4;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 221: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var2_ref), "lc.R(" + param0 + ')');
                }
                case 222: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            field_r = "Waiting";
            field_j = new vn();
            field_q = new on[255];
            field_a = "<%0> has resigned.";
            field_c = "Owner";
            var0 = 0;
            L0: while (true) {
              if (field_q.length <= var0) {
                field_k = "Type your age in years";
                field_e = "Solicitation";
                field_o = "Bounce off the landscape and either explode after 5 seconds or on each bounce. Hold the mouse to increase the velocity of the attack.";
                field_p = "Improves the abilities of Storm, Thunder Shock and Conductor Rod";
                break $cfr$clinit;
              } else {
                field_q[var0] = new on();
                var0++;
                continue L0;
              }
            }
        }
    }
}
