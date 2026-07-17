/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends wb implements qk {
    private ph field_gb;
    static int field_db;
    static bd field_cb;
    static int field_ab;
    static String field_bb;
    static bd[][] field_eb;
    static int field_fb;

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        cl var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = (cl) (Object) ne.field_q.g(-101);
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (param1 < -82) {
                    break L2;
                  } else {
                    var4 = null;
                    jh.a(116, (byte[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                dk.a(var5, param0, 10);
                var5 = (cl) (Object) ne.field_q.a(12684);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "jh.O(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, hm param2) {
        try {
            ih.field_x.a((am) (Object) param2, 98);
            int var3_int = -116 / ((param0 - 59) / 53);
            ci.a(param1, 2, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "jh.P(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, gb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var2_int = 107 % ((param0 - -6) / 59);
            stackOut_0_0 = param1.e(0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jh.T(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void g(byte param0) {
        field_cb = null;
        field_eb = null;
        field_bb = null;
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        try {
            if (((jh) this).field_gb == param3) {
                this.f((byte) -86);
            }
            int var6_int = 64 % ((-63 - param4) / 52);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "jh.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
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
        Object var16 = null;
        vi var17 = null;
        vi var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new vi(param1);
              var18 = var17;
              var18.field_i = param1.length + -2;
              sc.field_c = var18.e(8);
              vh.field_a = new byte[sc.field_c][];
              ja.field_e = new byte[sc.field_c][];
              th.field_Jb = new int[sc.field_c];
              hd.field_r = new int[sc.field_c];
              sf.field_X = new int[sc.field_c];
              if (param0 == -26869) {
                break L1;
              } else {
                var16 = null;
                boolean discarded$3 = jh.a(-126, (gb) null);
                break L1;
              }
            }
            nh.field_O = new int[sc.field_c];
            qj.field_k = new boolean[sc.field_c];
            var18.field_i = -(sc.field_c * 8) + (-7 + param1.length);
            ra.field_a = var18.e(param0 + 26877);
            vc.field_e = var18.e(8);
            var3 = 1 + (255 & var18.l(32270));
            var4 = 0;
            L2: while (true) {
              if (sc.field_c <= var4) {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= sc.field_c) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= sc.field_c) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= sc.field_c) {
                            var18.field_i = 3 + -(var3 * 3) + param1.length - (7 - -(8 * sc.field_c));
                            bf.field_d = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var18.field_i = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= sc.field_c) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = sf.field_X[var4];
                                      var6 = hd.field_r[var4];
                                      var7 = var5 * var6;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      ja.field_e[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      vh.field_a[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.l(32270);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var7 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$4 = var18.j(0);
                                                    var9[var12] = dupTemp$4;
                                                    var13 = dupTemp$4;
                                                    stackOut_46_0 = var10;
                                                    stackIn_48_0 = stackOut_46_0;
                                                    stackIn_47_0 = stackOut_46_0;
                                                    if (var13 == -1) {
                                                      stackOut_48_0 = stackIn_48_0;
                                                      stackOut_48_1 = 0;
                                                      stackIn_49_0 = stackOut_48_0;
                                                      stackIn_49_1 = stackOut_48_1;
                                                      break L11;
                                                    } else {
                                                      stackOut_47_0 = stackIn_47_0;
                                                      stackOut_47_1 = 1;
                                                      stackIn_49_0 = stackOut_47_0;
                                                      stackIn_49_1 = stackOut_47_1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_49_0 | stackIn_49_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var18.j(0);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        byte dupTemp$5 = var18.j(0);
                                                        var9[var5 * var13 + var12] = dupTemp$5;
                                                        var14 = dupTemp$5;
                                                        stackOut_34_0 = var10;
                                                        stackIn_36_0 = stackOut_34_0;
                                                        stackIn_35_0 = stackOut_34_0;
                                                        if (var14 == -1) {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 0;
                                                          stackIn_37_0 = stackOut_36_0;
                                                          stackIn_37_1 = stackOut_36_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 1;
                                                          stackIn_37_0 = stackOut_35_0;
                                                          stackIn_37_1 = stackOut_35_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_37_0 | stackIn_37_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var5 * var13 + var12] = var18.j(0);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    qj.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  bf.field_d[var4] = var18.h(92);
                                  if (0 != bf.field_d[var4]) {
                                    break L17;
                                  } else {
                                    bf.field_d[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            hd.field_r[var4] = var18.e(8);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        sf.field_X[var4] = var18.e(bm.a(param0, -26877));
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    nh.field_O[var4] = var18.e(8);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                th.field_Jb[var4] = var17.e(bm.a(param0, -26877));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("jh.V(").append(param0).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    private final void f(byte param0) {
        if (!((jh) this).field_F) {
            return;
        }
        ((jh) this).field_F = false;
    }

    final static void a(int param0, byte param1, int param2, jb[] param3, int param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (uj.field_l == 1) {
                L2: {
                  if (param4 > 1) {
                    param2 = param2 + (int)(Math.random() * (double)param4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param3 != jc.field_c) {
                    break L3;
                  } else {
                    if (param2 < 1) {
                      break L3;
                    } else {
                      if (param2 >= 9) {
                        break L3;
                      } else {
                        param0 = param0 * 2;
                        break L3;
                      }
                    }
                  }
                }
                eh.field_c.a(param3[param2], 100, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param1 > 28) {
                break L4;
              } else {
                field_ab = 106;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("jh.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    private final ph a(mh param0, String param1, byte param2) {
        ph var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ph stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ph stackOut_0_0 = null;
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
        try {
          L0: {
            var4 = new ph(param1, param0);
            var4.field_h = (nn) (Object) new ke();
            var5 = ((jh) this).field_x - 6;
            ((jh) this).field_x = ((jh) this).field_x + 38;
            var4.a(-30 + ((jh) this).field_s, var5, 0, 15, 30);
            ((jh) this).a(51448, (ag) (Object) var4);
            ((jh) this).c(0);
            stackOut_0_0 = (ph) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("jh.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 50 + 41);
        }
        return stackIn_1_0;
    }

    jh(gg param0, jf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ag var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == id.field_s) {
                var3 = (Object) (Object) he.field_z;
                break L1;
              } else {
                if (hf.field_g != param1) {
                  if (param1 != g.field_M) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) ph.field_y;
                    ((jh) this).field_x = ((jh) this).field_x + 30;
                    break L1;
                  }
                } else {
                  ((jh) this).field_x = ((jh) this).field_x + 10;
                  var3 = (Object) (Object) ha.field_y;
                  if (!kd.a((byte) -114)) {
                    break L1;
                  } else {
                    ((jh) this).field_x = ((jh) this).field_x + 20;
                    var3 = (Object) (Object) nj.field_b;
                    break L1;
                  }
                }
              }
            }
            var4 = new ag((String) var3, (mh) null);
            var4.field_s = ((jh) this).field_s;
            var4.field_x = 80;
            var4.field_v = 0;
            var4.field_m = 50;
            var4.field_h = (nn) (Object) new cn(jn.field_G, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((jh) this).a(51448, var4);
            ((jh) this).field_gb = this.a((mh) this, gi.field_n, (byte) 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("jh.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static bd[] a(bd[] param0, int param1, int param2) {
        bd[] var3 = null;
        RuntimeException var3_ref = null;
        bd[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bd[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        bd[] stackOut_1_0 = null;
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
            if (param0.length != param2) {
              if (param1 == 150) {
                var3 = new bd[param2];
                kf.a((Object[]) (Object) param0, 0, (Object[]) (Object) var3, 0, param2);
                stackOut_6_0 = (bd[]) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (bd[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = (bd[]) param0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("jh.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static String a(byte param0, int param1) {
        StringBuilder var2 = new StringBuilder(5);
        if (!(param1 >= 0)) {
            param1 = -param1;
            StringBuilder discarded$0 = var2.append(45);
        }
        StringBuilder discarded$1 = var2.append(param1 / 60);
        param1 = param1 % 60;
        if (param0 >= -60) {
            field_eb = null;
        }
        StringBuilder discarded$6 = var2.append(58);
        if (param1 < 10) {
            StringBuilder discarded$7 = var2.append(48);
        }
        StringBuilder discarded$8 = var2.append(param1);
        return var2.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "End game";
        field_db = 0;
        field_ab = 1;
    }
}
