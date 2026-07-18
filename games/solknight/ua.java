/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ki implements ka {
    static String[] field_M;
    private ge field_K;
    static String field_E;
    static o[] field_F;
    private pj[] field_J;
    static mf field_I;
    static int field_L;
    static int field_N;
    static mg field_G;
    static int field_H;
    private String[] field_D;

    final static int a(int param0, byte param1) {
        int var3 = SolKnight.field_L ? 1 : 0;
        qf.field_a = null;
        ug.field_f = 0;
        ik.field_b = null;
        int var2 = ue.field_a;
        ue.field_a = vc.field_e;
        if (param0 == 51) {
            il.field_c.field_c = 2;
        } else {
            if (param0 != 50) {
                il.field_c.field_c = 1;
            } else {
                il.field_c.field_c = 5;
            }
        }
        vc.field_e = var2;
        il.field_c.field_l = il.field_c.field_l + 1;
        if (2 <= il.field_c.field_l) {
            if (param0 == 51) {
                return 2;
            }
        }
        if (il.field_c.field_l >= 2) {
            if (!(param0 != 50)) {
                return 5;
            }
        }
        if (il.field_c.field_l >= 4) {
            return 1;
        }
        return -1;
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -77, param2, param3)) {
              var5_int = -102 / ((param1 - 31) / 56);
              if (98 != param2) {
                if (99 != param2) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((ua) this).b(108, param3);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((ua) this).a((byte) -112, param3);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ua.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void e() {
        field_I = null;
        int var1 = 0;
        field_F = null;
        field_M = null;
        field_E = null;
        field_G = null;
    }

    final static void a(byte param0) {
        if (param0 > -92) {
            ua.a((byte) 57);
        }
        hc.a(lf.field_e, false, ug.field_d, true);
        ga.field_G = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        mg var5 = field_G;
        if (((ua) this).field_D != null) {
            int discarded$0 = var5.a(nb.field_d, param2 + ((ua) this).field_m, ((ua) this).field_j + param0, ((ua) this).field_t, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_F);
        }
    }

    final static void a(int param0, byte[] param1) {
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
        gb var16 = null;
        gb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new gb(param1);
            var17 = var16;
            var17.field_m = -2 + param1.length;
            nb.field_c = var17.i(39);
            qf.field_d = new int[nb.field_c];
            rg.field_e = new boolean[nb.field_c];
            ph.field_h = new int[nb.field_c];
            uj.field_b = new int[nb.field_c];
            sa.field_l = new int[nb.field_c];
            jc.field_c = new byte[nb.field_c][];
            uf.field_s = new byte[nb.field_c][];
            var17.field_m = -(nb.field_c * 8) + param1.length - 7;
            kl.field_a = var17.i(-8);
            we.field_e = var17.i(28);
            var3 = 1 + (255 & var17.j(255));
            var4 = 0;
            L1: while (true) {
              if (nb.field_c <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= nb.field_c) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= nb.field_c) {
                        var4 = 0;
                        L4: while (true) {
                          if (nb.field_c <= var4) {
                            var17.field_m = param1.length + (-7 + -(8 * nb.field_c) + 3 + -(3 * var3));
                            ig.field_H = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_m = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= nb.field_c) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = sa.field_l[var4];
                                      var6 = uj.field_b[var4];
                                      var7 = var5 * var6;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      jc.field_c[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      uf.field_s[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.j(255);
                                      if (0 != (var11 & 1)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.a((byte) -14);
                                                        var9[var12 - -(var13 * var5)] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_42_0 = var10;
                                                        stackIn_44_0 = stackOut_42_0;
                                                        stackIn_43_0 = stackOut_42_0;
                                                        if (var14 == -1) {
                                                          stackOut_44_0 = stackIn_44_0;
                                                          stackOut_44_1 = 0;
                                                          stackIn_45_0 = stackOut_44_0;
                                                          stackIn_45_1 = stackOut_44_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_43_0 = stackIn_43_0;
                                                          stackOut_43_1 = 1;
                                                          stackIn_45_0 = stackOut_43_0;
                                                          stackIn_45_1 = stackOut_43_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_45_0 | stackIn_45_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var17.a((byte) -14);
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
                                            if ((2 & var11) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.a((byte) -14);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_27_0 = var10;
                                                    stackIn_29_0 = stackOut_27_0;
                                                    stackIn_28_0 = stackOut_27_0;
                                                    if (var13 == -1) {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 0;
                                                      stackIn_30_0 = stackOut_29_0;
                                                      stackIn_30_1 = stackOut_29_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_28_0 = stackIn_28_0;
                                                      stackOut_28_1 = 1;
                                                      stackIn_30_0 = stackOut_28_0;
                                                      stackIn_30_1 = stackOut_28_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_30_0 | stackIn_30_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.a((byte) -14);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    rg.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  ig.field_H[var4] = var17.b(false);
                                  if (ig.field_H[var4] != 0) {
                                    break L16;
                                  } else {
                                    ig.field_H[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            uj.field_b[var4] = var17.i(40);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        sa.field_l[var4] = var17.i(11);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    qf.field_d[var4] = var17.i(-110);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ph.field_h[var4] = var16.i(-116);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("ua.J(").append(0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    final static ol a(boolean param0, byte[] param1) {
        ol var2 = null;
        RuntimeException var2_ref = null;
        ol stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ol stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new ol(param1, ph.field_h, qf.field_d, sa.field_l, uj.field_b, ig.field_H, jc.field_c);
              int discarded$2 = -97;
              og.a();
              stackOut_3_0 = (ol) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ua.E(").append(true).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param4) {
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= ((ua) this).field_D.length) {
                  L2: {
                    if (param3 != ((ua) this).field_J[((ua) this).field_D.length]) {
                      break L2;
                    } else {
                      ((ua) this).field_K.a((byte) 22);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    if (param3 != ((ua) this).field_J[var6_int]) {
                      break L3;
                    } else {
                      ((ua) this).field_K.a(param4, ((ua) this).field_D[var6_int]);
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final static mb h() {
        int discarded$0 = -1;
        int discarded$1 = 71;
        return new mb(sg.b(), he.a());
    }

    ua(ge param0) {
        super(0, 0, 0, 0, (j) null);
        try {
            ((ua) this).field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ua) this).field_B.a(true);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  ((ua) this).field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      L3: {
                        var4 = new ri(field_G, 0, 1);
                        ((ua) this).field_J = new pj[var3_int + 1];
                        if (param0 == 20870) {
                          break L3;
                        } else {
                          field_L = -28;
                          break L3;
                        }
                      }
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          ((ua) this).field_J[var3_int] = new pj(wc.field_d, (dg) this);
                          ((ua) this).field_J[var3_int].field_w = (j) (Object) var4;
                          ((ua) this).field_J[var3_int].b(15, 100, 0, 0, 20 - -((1 + var3_int) * 16));
                          ((ua) this).a((rc) (Object) ((ua) this).field_J[var3_int], 5411);
                          break L0;
                        } else {
                          ((ua) this).field_J[var5] = new pj(((ua) this).field_D[var5], (dg) this);
                          ((ua) this).field_J[var5].field_w = (j) (Object) var4;
                          ((ua) this).field_J[var5].field_z = he.field_f;
                          ((ua) this).field_J[var5].b(15, 80, 0, 0, 20 - -(16 * var5));
                          ((ua) this).a((rc) (Object) ((ua) this).field_J[var5], 5411);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((ua) this).field_D[var4_int] = gh.a(-31433, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((ua) this).field_D = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ua.H(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Subscribing members have access to fullscreen mode.<br>TODO Game-specific benefits, screenshots, etc.";
        field_M = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_L = 0;
    }
}
