/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends f implements op, bp {
    private kg field_H;
    private ts field_G;
    static String[] field_J;
    private oj field_I;
    static ih field_E;
    static int[][] field_D;
    static int field_K;
    static String field_F;

    public static void a(byte param0) {
        try {
            field_F = null;
            field_E = null;
            int var1_int = 124 % ((-2 - param0) / 45);
            field_D = (int[][]) null;
            field_J = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "pe.E(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                pe.a((byte) 11, 4);
                break L1;
              }
            }
            stackIn_4_0 = param1 * 200 + 100;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "pe.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    pe(oj param0) {
        super(0, 0, 288, 0, (iq) null);
        RuntimeException runtimeException = null;
        String var2 = null;
        int var3 = 0;
        o var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_I = param0;
            this.field_H = new kg(gq.field_b, (ko) null);
            this.field_H.field_p = (iq) ((Object) new qp());
            var2 = re.a(rn.field_e, 4371, new String[]{this.l(98), this.a(56)});
            var3 = 20;
            var4 = new o(gn.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, gn.field_u.field_J, -1, 2147483647, true);
            this.field_G = new ts(var2, var4);
            this.field_G.field_v = "";
            this.field_G.a(0, true, bk.field_c);
            this.field_G.a(1, true, bk.field_c);
            this.field_G.field_u = (ko) (this);
            this.field_G.field_x = -40 + this.field_x;
            this.field_G.a(26, var3, (byte) 57, this.field_x - 40);
            var3 = var3 + (this.field_G.field_n - -15);
            this.b((byte) -46, this.field_G);
            var5 = 4;
            var6 = 200;
            this.field_H.a(var3, 40, (byte) 115, -var6 + 300 >> -1156772575, var6);
            this.field_H.field_u = (ko) (this);
            this.b((byte) -126, this.field_H);
            this.a(0, var3 - -55 - -var5, (byte) 121, 0, 300);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, ts param3) {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == param1) {
                  break L2;
                } else {
                  L3: {
                    if (param1 != 1) {
                      break L3;
                    } else {
                      gm.a(param2 ^ 104, "privacy.ws");
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-3 == (param1 ^ -1)) {
                    gm.a(param2 ^ 127, "conduct.ws");
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              gm.a(57, "terms.ws");
              break L1;
            }
            L4: {
              if (param2 == 2) {
                break L4;
              } else {
                pe.a(false, (int[]) null, false, 25, (int[]) null, true, (sr) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("pe.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private final String l(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 71) {
              stackIn_4_0 = "<u=2164A2><col=2164A2>";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "pe.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final String a(int param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 93 % ((param0 - -30) / 43);
            stackIn_1_0 = "</col></u>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "pe.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(ob param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.h(-1282738780);
                  if (var3_int <= param2) {
                    break L2;
                  } else {
                    var3_int = param2;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_j = param0.field_j + ak.field_v.a(var4, param0.field_h, var3_int, 7, param0.field_j, param1);
                var5 = qi.a(var4, var3_int, 0, param1 ^ -127);
                stackIn_3_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_5_0 = "Cabbage";
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("pe.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param0) {
                if ((param0 ^ -1) == -100) {
                  stackIn_10_0 = this.a(param3, -97);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param3, true);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final static void k(int param0) {
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        eg var1 = null;
        ln[] var1_array = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        ln var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 95) {
                break L1;
              } else {
                field_K = 59;
                break L1;
              }
            }
            L2: {
              fl.a(0, "endturn");
              if (2 != oq.field_a.field_P.field_g.field_e.length) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (ho.field_d != oq.field_a.field_P.field_g.field_e[1].field_y) {
                      break L4;
                    } else {
                      if (qc.a("combatSuccess", -116)) {
                        ac.a(1, n.a("combatSuccess", -21502));
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var1 = vp.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
                  if (null != var1) {
                    if (!qc.a("combatFailed", -116)) {
                      break L3;
                    } else {
                      ac.a(1, n.a("combatFailed", -21502));
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  var1 = vp.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
                  if (null != var1) {
                    uq.field_m.a(nf.a(var1, 23248), 27275, "combatreport1");
                    break L5;
                  } else {
                    break L5;
                  }
                }
                uq.field_m.a(Integer.toString(oq.field_a.field_P.field_g.field_e[1].field_x), 27275, "garrison1");
                break L2;
              }
            }
            L6: {
              if (!oq.field_a.field_P.field_z) {
                break L6;
              } else {
                if (oq.field_a.field_P.field_k == ho.field_d.field_x) {
                  break L6;
                } else {
                  ac.a(1, n.a("lose", -21502));
                  break L6;
                }
              }
            }
            var1_array = oq.field_a.field_P.field_g.field_e;
            var2 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var1_array.length <= var2) {
                    break L9;
                  } else {
                    var3 = var1_array[var2];
                    if (var5 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (null == var3.field_y) {
                          stackIn_40_0 = 8421504;
                          break L10;
                        } else {
                          stackIn_40_0 = var3.field_y.field_s;
                          break L10;
                        }
                      }
                      var4 = stackIn_40_0;
                      uq.field_m.a(re.a("<col=<%0>>" + var3.field_I + "</col>", 4371, new String[]{Integer.toString(var4, 16)}), 27275, "star" + var3.field_p);
                      var2++;
                      if (var5 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                break L8;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "pe.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int param3, int[] param4, boolean param5, sr param6) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param1[3] >> -8909918;
                        var22 = param1[4] >> 1292112290;
                        var23 = param1[5] >> -1234195614;
                        var24 = param1[6] >> -2139743070;
                        var25 = param1[7] >> 532912066;
                        var26 = param1[8] >> 974596642;
                        var27 = param1[9] >> -877681470;
                        var28 = param1[10] >> -1174273246;
                        var13 = param4[4] * var25 + (param4[3] * var24 + param4[5] * var26) >> 381772590;
                        var29 = param1[11] >> -800131678;
                        var12 = param4[5] * var23 + (var22 * param4[4] + param4[3] * var21) >> -2000851122;
                        var16 = var26 * param4[8] + var24 * param4[6] - -(var25 * param4[7]) >> 947938062;
                        var18 = var22 * param4[10] + (var21 * param4[9] - -(param4[11] * var23)) >> 2055348686;
                        var20 = param4[10] * var28 + (var27 * param4[9] + var29 * param4[11]) >> -1109497746;
                        var14 = param4[5] * var29 + (param4[4] * var28 + var27 * param4[3]) >> -1106808658;
                        var15 = var22 * param4[7] + (var21 * param4[6] - -(var23 * param4[8])) >> 853648462;
                        var17 = param4[8] * var29 + var28 * param4[7] + var27 * param4[6] >> 1729741294;
                        var19 = param4[11] * var26 + (param4[10] * var25 + param4[9] * var24) >> -1688219506;
                        var21 = -param1[0] + param4[0];
                        var22 = param4[1] - param1[1];
                        var23 = -param1[2] + param4[2];
                        var9 = var21 * param1[3] - -(param1[4] * var22) - -(var23 * param1[5]) >> 16 + -we.field_e;
                        if (param3 >= 11) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var10 = param1[8] * var23 + (param1[7] * var22 + param1[6] * var21) >> 16 - we.field_e;
                        var11 = var23 * param1[11] + (var22 * param1[10] + param1[9] * var21) >> 1873056176;
                        var21 = wn.field_i;
                        var22 = wn.field_a;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param6.field_x <= var23) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = param6.field_w[var23];
                        var25 = param6.field_z[var23];
                        var26 = param6.field_f[var23];
                        var27 = (var12 * var24 + (var25 * var15 + var26 * var18) >> 16 - we.field_e) + var9;
                        var28 = var10 - -(var25 * var16 + (var24 * var13 + var26 * var19) >> -we.field_e + 16);
                        var29 = var11 - -(var25 * var17 + var24 * var14 + var26 * var20 >> -969017840);
                        stackIn_65_0 = var29 ^ -1;
                        stackIn_6_0 = stackIn_65_0;
                        stackIn_65_1 = -51;
                        stackIn_6_1 = stackIn_65_1;
                        if (var30 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= stackIn_6_1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        no.field_c[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ul.field_Cb[var23] = var27 / var29 + var21;
                        he.field_i[var23] = var28 / var29 + var22;
                        if (var7_int <= var29) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = var29;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var29 <= var8) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        no.field_c[var23] = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param2) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        lg.field_a[var23] = var27 >> we.field_e;
                        dg.field_yb[var23] = var28 >> we.field_e;
                        tg.field_d[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null == param6.field_K) {
                            statePc = 56;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param6.field_D) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param6.field_H == null) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param6.field_a == null) {
                            statePc = 56;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == param6.field_c) {
                            statePc = 56;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param6.field_l == null) {
                            statePc = 56;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == param6.field_A) {
                            statePc = 56;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == param6.field_m) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param6.field_Q != null) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var23 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var23 ^ -1) <= (param6.field_u ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var24 = param6.field_K[var23];
                        var25 = param6.field_D[var23];
                        var26 = param6.field_H[var23];
                        kr.field_e[var23] = var9 + (var26 * var18 + var12 * var24 - -(var15 * var25) >> 1209541872);
                        ib.field_f[var23] = (var24 * var13 - (-(var16 * var25) + -(var19 * var26)) >> -471988304) + var10;
                        dc.field_s[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 2109302032) + var11;
                        var24 = param6.field_a[var23];
                        var25 = param6.field_c[var23];
                        var26 = param6.field_l[var23];
                        k.field_g[var23] = (var12 * var24 + (var15 * var25 + var18 * var26) >> -398653584) + var9;
                        h.field_t[var23] = (var13 * var24 - -(var25 * var16) - -(var26 * var19) >> -1648329712) + var10;
                        nb.field_b[var23] = (var17 * var25 + (var24 * var14 - -(var20 * var26)) >> -452266928) + var11;
                        var24 = param6.field_A[var23];
                        var25 = param6.field_m[var23];
                        var26 = param6.field_Q[var23];
                        aq.field_o[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> -1959885232);
                        fk.field_h[var23] = var10 + (var24 * var13 + var16 * var25 + var19 * var26 >> -1745715024);
                        qo.field_c[var23] = var11 + (var17 * var25 + (var24 * var14 + var26 * var20) >> -857553584);
                        var23++;
                        if (var30 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var30 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!param0) {
                            statePc = 64;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9 = param4[3];
                        var10 = param4[4];
                        var11 = param4[5];
                        var12 = param4[6];
                        var13 = param4[7];
                        var14 = param4[8];
                        var15 = param4[9];
                        var16 = param4[10];
                        var17 = param4[11];
                        var18 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((param6.field_e ^ -1) >= (var18 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_65_0 = fm.field_c.length;
                        stackIn_60_0 = stackIn_65_0;
                        stackIn_65_1 = var18;
                        stackIn_60_1 = stackIn_65_1;
                        if (var30 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 <= stackIn_60_1) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var19 = param6.field_I[var18];
                        var20 = param6.field_y[var18];
                        var21 = param6.field_v[var18];
                        fm.field_c[var18] = var21 * var15 + (var20 * var12 + var9 * var19) >> 1295142128;
                        ra.field_f[var18] = var21 * var16 + (var19 * var10 - -(var13 * var20)) >> 564432080;
                        hk.field_ob[var18] = var11 * var19 - (-(var14 * var20) + -(var21 * var17)) >> -985622992;
                        var18++;
                        if (var30 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = -27;
                        stackIn_65_1 = param5 ? 1 : 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ej.a((byte) stackIn_65_0, stackIn_65_1 != 0, param6, var7_int, var8);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var7);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
                    stackIn_68_1 = stackIn_70_1;
                    if (param1 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param4 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param5).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param6 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw r.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static qr m(int param0) {
        RuntimeException var1 = null;
        qr stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 20) {
                break L1;
              } else {
                field_K = -33;
                break L1;
              }
            }
            stackIn_4_0 = ro.field_a.field_xb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "pe.H(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 6) {
              L1: {
                if (param0 != this.field_H) {
                  break L1;
                } else {
                  rm.b(param1 + -55);
                  this.field_I.i((byte) -104);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("pe.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_J = new String[]{"Overview", "Glossary I", "Glossary II", "Tactical Display", "System HUD", "Controls I", "Controls II", "Animations", "Projects", "Game Types", "Classic Rules"};
        field_E = new ih();
        field_K = 15;
        field_F = "No more fleets available here.";
    }
}
