/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends u {
    private long field_g;
    static String field_n;
    static he[] field_m;
    static String[] field_i;
    static volatile boolean field_j;
    static he field_k;
    static String field_l;
    private String field_h;

    final static int[] c(byte param0) {
        return new int[8];
    }

    final static vj a(boolean param0, boolean param1, int param2, int param3, int param4) {
        return na.a(true, param2, false, false, true, 1);
    }

    db b(byte param0) {
        if (param0 != -98) {
            ((lk) this).field_g = -35L;
        }
        return si.field_A;
    }

    final static void b(int param0) {
        qg.a(true, bg.field_q, ol.field_j, (byte) -11);
        hl.field_b = true;
    }

    public static void a(int param0) {
        field_l = null;
        field_n = null;
        field_i = null;
        field_k = null;
        field_m = null;
    }

    final static void a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        od var16 = null;
        od var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var16 = new od(param0);
            var17 = var16;
            var17.field_j = -2 + param0.length;
            bd.field_M = var17.j(-788751192);
            vi.field_b = new int[bd.field_M];
            a.field_e = new byte[bd.field_M][];
            bd.field_O = new boolean[bd.field_M];
            ll.field_o = new byte[bd.field_M][];
            kh.field_i = new int[bd.field_M];
            qa.field_J = new int[bd.field_M];
            gf.field_o = new int[bd.field_M];
            var17.field_j = -(bd.field_M * 8) + (-7 + param0.length);
            oe.field_b = var17.j(-788751192);
            ih.field_K = var17.j(-788751192);
            var3 = (var17.l(31760) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (bd.field_M <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= bd.field_M) {
                    var5 = 0;
                    var4 = 0;
                    L3: while (true) {
                      if (bd.field_M <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= bd.field_M) {
                            var17.field_j = -(3 * var3) + (3 + (-7 + param0.length) + -(bd.field_M * 8));
                            aj.field_a = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_j = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (bd.field_M <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = gf.field_o[var4];
                                      var6 = qa.field_J[var4];
                                      var7 = var5 * var6;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      a.field_e[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ll.field_o[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.l(31760);
                                      if ((1 & var11) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.n(99);
                                                        var9[var13 * var5 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (-1 == var14) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.n(-88);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.n(98);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_28_0 = var10;
                                                    stackIn_30_0 = stackOut_28_0;
                                                    stackIn_29_0 = stackOut_28_0;
                                                    if (var13 == -1) {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 0;
                                                      stackIn_31_0 = stackOut_30_0;
                                                      stackIn_31_1 = stackOut_30_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 1;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_31_1 = stackOut_29_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_31_0 | stackIn_31_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.n(-98);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    bd.field_O[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  aj.field_a[var4] = var17.g(-1);
                                  if (aj.field_a[var4] == 0) {
                                    aj.field_a[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            qa.field_J[var4] = var17.j(-788751192);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        gf.field_o[var4] = var17.j(-788751192);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    vi.field_b[var4] = var17.j(-788751192);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                kh.field_i[var4] = var16.j(-788751192);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("lk.O(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + 87 + ')');
        }
    }

    final void a(od param0, int param1) {
        if (param1 <= 19) {
            return;
        }
        try {
            param0.a(((lk) this).field_g, (byte) 127);
            param0.b(1, ((lk) this).field_h);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    lk(long param0, String param1) {
        try {
            ((lk) this).field_g = param0;
            ((lk) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "lk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Connection restored.";
        field_j = false;
        field_l = "Use this alternative as your account name";
    }
}
