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

    public static void a() {
        try {
            field_F = null;
            field_E = null;
            int var1_int = 0;
            field_D = null;
            field_J = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "pe.E(" + -75 + 41);
        }
    }

    final static int a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                int discarded$2 = pe.a((byte) 11, 4);
                break L1;
              }
            }
            stackOut_3_0 = param1 * 200 + 100;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "pe.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    pe(oj param0) {
        super(0, 0, 288, 0, (iq) null);
        RuntimeException var2 = null;
        String var2_ref = null;
        int var3 = 0;
        o var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((pe) this).field_I = param0;
            ((pe) this).field_H = new kg(gq.field_b, (ko) null);
            ((pe) this).field_H.field_p = (iq) (Object) new qp();
            int discarded$1 = 98;
            var2_ref = re.a(rn.field_e, 4371, new String[2]);
            var3 = 20;
            var4 = new o(gn.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, gn.field_u.field_J, -1, 2147483647, true);
            ((pe) this).field_G = new ts(var2_ref, (iq) (Object) var4);
            ((pe) this).field_G.field_v = "";
            ((pe) this).field_G.a(0, true, bk.field_c);
            ((pe) this).field_G.a(1, true, bk.field_c);
            ((pe) this).field_G.field_u = (ko) this;
            ((pe) this).field_G.field_x = -40 + ((pe) this).field_x;
            ((pe) this).field_G.a(26, var3, (byte) 57, ((pe) this).field_x - 40);
            var3 = var3 + (((pe) this).field_G.field_n - -15);
            ((pe) this).b((byte) -46, (vg) (Object) ((pe) this).field_G);
            var5 = 4;
            var6 = 200;
            ((pe) this).field_H.a(var3, 40, (byte) 115, -var6 + 300 >> 1, var6);
            ((pe) this).field_H.field_u = (ko) this;
            ((pe) this).b((byte) -126, (vg) (Object) ((pe) this).field_H);
            ((pe) this).a(0, var3 - -55 - -var5, (byte) 121, 0, 300);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("pe.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, ts param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                  if (param1 == 2) {
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
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("pe.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private final String l() {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            stackOut_3_0 = "<u=2164A2><col=2164A2>";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "pe.I(" + 98 + 41);
        }
        return stackIn_4_0;
    }

    private final String a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 1;
            stackOut_0_0 = "</col></u>";
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "pe.A(" + 56 + 41);
        }
        return stackIn_1_0;
    }

    final static String a(ob param0, int param1) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param0.h(-1282738780);
              if (var3_int <= 80) {
                break L0;
              } else {
                var3_int = 80;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param0.field_j = param0.field_j + ak.field_v.a(var4, param0.field_h, var3_int, 7, param0.field_j, param1);
            var5 = qi.a(var4, var3_int, 0, param1 ^ -127);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("pe.G(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + 80 + 41);
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param0) {
                if (param0 == 99) {
                  stackOut_9_0 = ((pe) this).a(param3, -97);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = ((pe) this).a(param3, true);
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("pe.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static void k() {
        RuntimeException var1 = null;
        ln[] var1_array = null;
        eg var1_ref = null;
        int var2 = 0;
        ln var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              fl.a(0, "endturn");
              if (2 != oq.field_a.field_P.field_g.field_e.length) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (ho.field_d != oq.field_a.field_P.field_g.field_e[1].field_y) {
                      break L3;
                    } else {
                      if (qc.a("combatSuccess", -116)) {
                        int discarded$4 = -21502;
                        ac.a(1, n.a("combatSuccess"));
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var1_ref = vp.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
                  if (null != var1_ref) {
                    if (!qc.a("combatFailed", -116)) {
                      break L2;
                    } else {
                      int discarded$5 = -21502;
                      ac.a(1, n.a("combatFailed"));
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  var1_ref = vp.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
                  if (null != var1_ref) {
                    int discarded$6 = 23248;
                    uq.field_m.a(nf.a(var1_ref), 27275, "combatreport1");
                    break L4;
                  } else {
                    break L4;
                  }
                }
                uq.field_m.a(Integer.toString(oq.field_a.field_P.field_g.field_e[1].field_x), 27275, "garrison1");
                break L1;
              }
            }
            L5: {
              if (!oq.field_a.field_P.field_z) {
                break L5;
              } else {
                if (oq.field_a.field_P.field_k == ho.field_d.field_x) {
                  break L5;
                } else {
                  int discarded$7 = -21502;
                  ac.a(1, n.a("lose"));
                  break L5;
                }
              }
            }
            var1_array = oq.field_a.field_P.field_g.field_e;
            var2 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (var1_array.length <= var2) {
                    break L8;
                  } else {
                    var3 = var1_array[var2];
                    if (var5 != 0) {
                      break L7;
                    } else {
                      L9: {
                        if (null == var3.field_y) {
                          stackOut_39_0 = 8421504;
                          stackIn_40_0 = stackOut_39_0;
                          break L9;
                        } else {
                          stackOut_37_0 = var3.field_y.field_s;
                          stackIn_40_0 = stackOut_37_0;
                          break L9;
                        }
                      }
                      var4 = stackIn_40_0;
                      uq.field_m.a(re.a("<col=<%0>>" + var3.field_I + "</col>", 4371, new String[1]), 27275, "star" + var3.field_p);
                      var2++;
                      if (var5 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "pe.J(" + 112 + 41);
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int param3, int[] param4, boolean param5, sr param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_64_1 = false;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var30 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param1[3] >> 2;
            var22 = param1[4] >> 2;
            var23 = param1[5] >> 2;
            var24 = param1[6] >> 2;
            var25 = param1[7] >> 2;
            var26 = param1[8] >> 2;
            var27 = param1[9] >> 2;
            var28 = param1[10] >> 2;
            var13 = param4[4] * var25 + (param4[3] * var24 + param4[5] * var26) >> 14;
            var29 = param1[11] >> 2;
            var12 = param4[5] * var23 + (var22 * param4[4] + param4[3] * var21) >> 14;
            var16 = var26 * param4[8] + var24 * param4[6] - -(var25 * param4[7]) >> 14;
            var18 = var22 * param4[10] + (var21 * param4[9] - -(param4[11] * var23)) >> 14;
            var20 = param4[10] * var28 + (var27 * param4[9] + var29 * param4[11]) >> 14;
            var14 = param4[5] * var29 + (param4[4] * var28 + var27 * param4[3]) >> 14;
            var15 = var22 * param4[7] + (var21 * param4[6] - -(var23 * param4[8])) >> 14;
            var17 = param4[8] * var29 + var28 * param4[7] + var27 * param4[6] >> 14;
            var19 = param4[11] * var26 + (param4[10] * var25 + param4[9] * var24) >> 14;
            var21 = -param1[0] + param4[0];
            var22 = param4[1] - param1[1];
            var23 = -param1[2] + param4[2];
            var9 = var21 * param1[3] - -(param1[4] * var22) - -(var23 * param1[5]) >> 16 + -we.field_e;
            if (param3 >= 11) {
              var10 = param1[8] * var23 + (param1[7] * var22 + param1[6] * var21) >> 16 - we.field_e;
              var11 = var23 * param1[11] + (var22 * param1[10] + param1[9] * var21) >> 16;
              var21 = wn.field_i;
              var22 = wn.field_a;
              var23 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (param6.field_x <= var23) {
                        break L4;
                      } else {
                        var24 = param6.field_w[var23];
                        var25 = param6.field_z[var23];
                        var26 = param6.field_f[var23];
                        var27 = (var12 * var24 + (var25 * var15 + var26 * var18) >> 16 - we.field_e) + var9;
                        var28 = var10 - -(var25 * var16 + (var24 * var13 + var26 * var19) >> -we.field_e + 16);
                        var29 = var11 - -(var25 * var17 + var24 * var14 + var26 * var20 >> 16);
                        stackOut_5_0 = ~var29;
                        stackOut_5_1 = -51;
                        stackIn_65_0 = stackOut_5_0;
                        stackIn_65_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 <= stackIn_6_1) {
                                break L6;
                              } else {
                                no.field_c[var23] = -2147483648;
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              ul.field_Cb[var23] = var27 / var29 + var21;
                              he.field_i[var23] = var28 / var29 + var22;
                              if (var7_int <= var29) {
                                break L7;
                              } else {
                                var7_int = var29;
                                break L7;
                              }
                            }
                            L8: {
                              if (var29 <= var8) {
                                break L8;
                              } else {
                                var8 = var29;
                                break L8;
                              }
                            }
                            no.field_c[var23] = var29;
                            break L5;
                          }
                          var23++;
                          if (var30 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L9: {
                      if (null == param6.field_K) {
                        break L9;
                      } else {
                        if (null == param6.field_D) {
                          break L9;
                        } else {
                          if (param6.field_H == null) {
                            break L9;
                          } else {
                            if (param6.field_a == null) {
                              break L9;
                            } else {
                              if (null == param6.field_c) {
                                break L9;
                              } else {
                                if (param6.field_l == null) {
                                  break L9;
                                } else {
                                  if (null == param6.field_A) {
                                    break L9;
                                  } else {
                                    if (null == param6.field_m) {
                                      break L9;
                                    } else {
                                      if (param6.field_Q != null) {
                                        var23 = 0;
                                        L10: while (true) {
                                          if (~var23 <= ~param6.field_u) {
                                            break L9;
                                          } else {
                                            var24 = param6.field_K[var23];
                                            var25 = param6.field_D[var23];
                                            var26 = param6.field_H[var23];
                                            kr.field_e[var23] = var9 + (var26 * var18 + var12 * var24 - -(var15 * var25) >> 16);
                                            ib.field_f[var23] = (var24 * var13 - (-(var16 * var25) + -(var19 * var26)) >> 16) + var10;
                                            dc.field_s[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 16) + var11;
                                            var24 = param6.field_a[var23];
                                            var25 = param6.field_c[var23];
                                            var26 = param6.field_l[var23];
                                            k.field_g[var23] = (var12 * var24 + (var15 * var25 + var18 * var26) >> 16) + var9;
                                            h.field_t[var23] = (var13 * var24 - -(var25 * var16) - -(var26 * var19) >> 16) + var10;
                                            nb.field_b[var23] = (var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 16) + var11;
                                            var24 = param6.field_A[var23];
                                            var25 = param6.field_m[var23];
                                            var26 = param6.field_Q[var23];
                                            aq.field_o[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 16);
                                            fk.field_h[var23] = var10 + (var24 * var13 + var16 * var25 + var19 * var26 >> 16);
                                            qo.field_c[var23] = var11 + (var17 * var25 + (var24 * var14 + var26 * var20) >> 16);
                                            var23++;
                                            if (var30 != 0) {
                                              break L2;
                                            } else {
                                              if (var30 == 0) {
                                                continue L10;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L9;
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
                    L11: {
                      if (!param0) {
                        break L11;
                      } else {
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
                        L12: while (true) {
                          if (~param6.field_e >= ~var18) {
                            break L11;
                          } else {
                            stackOut_59_0 = fm.field_c.length;
                            stackOut_59_1 = var18;
                            stackIn_65_0 = stackOut_59_0;
                            stackIn_65_1 = stackOut_59_1;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              if (stackIn_60_0 <= stackIn_60_1) {
                                break L11;
                              } else {
                                var19 = param6.field_I[var18];
                                var20 = param6.field_y[var18];
                                var21 = param6.field_v[var18];
                                fm.field_c[var18] = var21 * var15 + (var20 * var12 + var9 * var19) >> 16;
                                ra.field_f[var18] = var21 * var16 + (var19 * var10 - -(var13 * var20)) >> 16;
                                hk.field_ob[var18] = var11 * var19 - (-(var14 * var20) + -(var21 * var17)) >> 16;
                                var18++;
                                if (var30 == 0) {
                                  continue L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_64_0 = -27;
                    stackOut_64_1 = param5;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1 ? 1 : 0;
                    break L3;
                  }
                  ej.a((byte) stackIn_65_0, stackIn_65_1 != 0, param6, var7_int, var8);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("pe.C(").append(param0).append(44);
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L13;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L13;
            }
          }
          L14: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44).append(0).append(44).append(param3).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L14;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L14;
            }
          }
          L15: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(44).append(param5).append(44);
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param6 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L15;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 41);
        }
    }

    final static qr m() {
        RuntimeException var1 = null;
        qr stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_3_0 = null;
        try {
          L0: {
            stackOut_3_0 = ro.field_a.field_xb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "pe.H(" + 42 + 41);
        }
        return stackIn_4_0;
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 6) {
              L1: {
                if (param0 != ((pe) this).field_H) {
                  break L1;
                } else {
                  rm.b(param1 + -55);
                  ((pe) this).field_I.i((byte) -104);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("pe.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Overview", "Glossary I", "Glossary II", "Tactical Display", "System HUD", "Controls I", "Controls II", "Animations", "Projects", "Game Types", "Classic Rules"};
        field_E = new ih();
        field_K = 15;
        field_F = "No more fleets available here.";
    }
}
