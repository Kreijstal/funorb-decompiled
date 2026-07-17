/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends km {
    static String[] field_Kb;
    static String field_Gb;
    private km field_Jb;
    static int[] field_Lb;
    int field_Hb;
    private km[] field_Fb;
    private km[] field_Ib;
    static long field_Eb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -22361) {
            Object var9 = null;
            d.a((byte) 53, (byte[]) null);
        }
        ((d) this).field_K = param2;
        ((d) this).field_tb = param5;
        ((d) this).field_F = param6;
        ((d) this).field_ub = param1;
        this.b(param0, param4, param3 ^ -20132);
    }

    final static km h(int param0) {
        return ve.field_q.field_Lb;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (((d) this).field_Fb.length <= var2) {
            return;
          } else {
            if (((d) this).field_Hb != var2) {
              if (((d) this).field_Fb[var2].field_nb != 0) {
                ((d) this).field_Fb[((d) this).field_Hb].field_xb = false;
                ((d) this).field_Ib[((d) this).field_Hb].field_tb = ((d) this).field_Ib[((d) this).field_Hb].field_tb + 10000;
                ((d) this).field_Hb = var2;
                ((d) this).field_Fb[var2].field_xb = true;
                ((d) this).field_Ib[var2].field_tb = ((d) this).field_Ib[var2].field_tb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param2 == 6651) {
          var4 = 0;
          L0: while (true) {
            if (((d) this).field_Fb.length <= var4) {
              ((d) this).field_Jb.a(0, -param0 + ((d) this).field_ub, ((d) this).field_K, (byte) -70, param0);
              var8 = 0;
              var4 = var8;
              L1: while (true) {
                if (var8 >= ((d) this).field_Ib.length) {
                  return;
                } else {
                  ((d) this).field_Ib[var8].a(param1, ((d) this).field_Jb.field_ub - param1 * 2, -(param1 * 2) + ((d) this).field_Jb.field_K, (byte) -115, param1);
                  if (((d) this).field_Hb != var8) {
                    ((d) this).field_Ib[var8].field_tb = ((d) this).field_Ib[var8].field_tb + 10000;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = var4 * ((d) this).field_K / ((d) this).field_Fb.length;
              var6 = ((d) this).field_K * (1 + var4) / ((d) this).field_Fb.length;
              ((d) this).field_Fb[var4].field_tb = var5;
              ((d) this).field_Fb[var4].field_F = 0;
              ((d) this).field_Fb[var4].field_K = -var5 + var6;
              ((d) this).field_Fb[var4].field_ub = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_Lb = null;
        field_Gb = null;
        field_Kb = null;
    }

    final static void a(byte param0, byte[] param1) {
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
        jc var16 = null;
        jc var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
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
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new jc(param1);
            var17 = var16;
            var17.field_l = param1.length + -2;
            rj.field_h = var17.c((byte) -83);
            db.field_k = new int[rj.field_h];
            ei.field_d = new boolean[rj.field_h];
            mb.field_bb = new int[rj.field_h];
            md.field_g = new byte[rj.field_h][];
            gb.field_F = new int[rj.field_h];
            lj.field_j = new byte[rj.field_h][];
            el.field_w = new int[rj.field_h];
            var17.field_l = -(8 * rj.field_h) + param1.length - 7;
            oj.field_Kb = var17.c((byte) -108);
            se.field_d = var17.c((byte) 90);
            var3 = (var17.g(11132) & 255) + 1;
            if (param0 <= 0) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= rj.field_h) {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= rj.field_h) {
                      var4 = 0;
                      L3: while (true) {
                        if (var4 >= rj.field_h) {
                          var4 = 0;
                          L4: while (true) {
                            if (rj.field_h <= var4) {
                              var17.field_l = 3 + -(var3 * 3) + (-7 + (param1.length - 8 * rj.field_h));
                              k.field_c = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if (var4 >= var3) {
                                  var17.field_l = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (var4 >= rj.field_h) {
                                      break L0;
                                    } else {
                                      L7: {
                                        var5 = db.field_k[var4];
                                        var6 = gb.field_F[var4];
                                        var7 = var5 * var6;
                                        var24 = new byte[var7];
                                        var22 = var24;
                                        var20 = var22;
                                        var18 = var20;
                                        var8 = var18;
                                        lj.field_j[var4] = var24;
                                        var25 = new byte[var7];
                                        var23 = var25;
                                        var21 = var23;
                                        var19 = var21;
                                        var9 = var19;
                                        md.field_g[var4] = var25;
                                        var10 = 0;
                                        var11 = var17.g(11132);
                                        if ((1 & var11) != 0) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var5 <= var12) {
                                              if ((var11 & 2) == 0) {
                                                break L7;
                                              } else {
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
                                                          byte dupTemp$2 = var17.a((byte) -69);
                                                          var9[var12 + var5 * var13] = dupTemp$2;
                                                          var14 = dupTemp$2;
                                                          stackOut_44_0 = var10;
                                                          stackIn_46_0 = stackOut_44_0;
                                                          stackIn_45_0 = stackOut_44_0;
                                                          if (var14 == -1) {
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
                                              }
                                            } else {
                                              var13 = 0;
                                              L12: while (true) {
                                                if (var13 >= var6) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  var8[var5 * var13 + var12] = var17.a((byte) 78);
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
                                              if (0 == (var11 & 2)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L14: while (true) {
                                                  if (var12 >= var7) {
                                                    break L7;
                                                  } else {
                                                    L15: {
                                                      byte dupTemp$3 = var17.a((byte) -114);
                                                      var9[var12] = dupTemp$3;
                                                      var13 = dupTemp$3;
                                                      stackOut_29_0 = var10;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_30_0 = stackOut_29_0;
                                                      if (-1 == var13) {
                                                        stackOut_31_0 = stackIn_31_0;
                                                        stackOut_31_1 = 0;
                                                        stackIn_32_0 = stackOut_31_0;
                                                        stackIn_32_1 = stackOut_31_1;
                                                        break L15;
                                                      } else {
                                                        stackOut_30_0 = stackIn_30_0;
                                                        stackOut_30_1 = 1;
                                                        stackIn_32_0 = stackOut_30_0;
                                                        stackIn_32_1 = stackOut_30_1;
                                                        break L15;
                                                      }
                                                    }
                                                    var10 = stackIn_32_0 | stackIn_32_1;
                                                    var12++;
                                                    continue L14;
                                                  }
                                                }
                                              }
                                            } else {
                                              var8[var12] = var17.a((byte) 118);
                                              var12++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      ei.field_d[var4] = var10 != 0;
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L16: {
                                    k.field_c[var4] = var17.a(-25842);
                                    if (k.field_c[var4] != 0) {
                                      break L16;
                                    } else {
                                      k.field_c[var4] = 1;
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              gb.field_F[var4] = var17.c((byte) 97);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          db.field_k[var4] = var17.c((byte) 41);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      mb.field_bb[var4] = var17.c((byte) 53);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  el.field_w[var4] = var16.c((byte) -112);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("d.C(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    d(long param0, km param1, String[] param2, km param3, km[] param4, int param5) {
        super(param0, (km) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        km var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
        try {
          L0: {
            ((d) this).field_Fb = new km[param2.length];
            ((d) this).field_Jb = new km(0L, param3);
            ((d) this).field_Ib = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((d) this).a(0, ((d) this).field_Jb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    ((d) this).field_Hb = param5;
                    ((d) this).field_Fb[param5].field_xb = true;
                    break L0;
                  } else {
                    ((d) this).field_Jb.a(0, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new km(0L, param1);
                var9.field_V = param2[var8_int];
                ((d) this).field_Fb[var8_int] = var9;
                ((d) this).a(0, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("d.<init>(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 41);
        }
    }

    final static int f(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2 = -109 / ((param0 - -29) / 58);
            var1_int = 0;
            L1: while (true) {
              if (!nd.b((byte) -116)) {
                L2: {
                  g.field_b.a(ve.a(hk.field_Jb, nl.field_u, (byte) 66), false, ve.a(a.field_y, ii.field_b, (byte) 66));
                  if (g.field_b.b(false)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var3 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (g.field_b.field_d < 0) {
                      break L3;
                    } else {
                      var3 = ia.field_e[g.field_b.field_d];
                      if (var3 == 2) {
                        wn.c(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = var3;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                g.field_b.e(-87);
                if (!g.field_b.b(false)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "d.F(" + param0 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new int[8192];
        field_Kb = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
