/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends gj implements dc, da {
    private ja field_H;
    private bb field_G;
    private ua field_F;

    private final String j(int param0) {
        if (param0 != 0) {
            String discarded$0 = this.j(113);
        }
        return "</col></u>";
    }

    private final String a() {
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param3 == 248) {
              L1: {
                if (param4 != ((og) this).field_G) {
                  break L1;
                } else {
                  int discarded$2 = 255;
                  ih.l();
                  ((og) this).field_F.n(-22645);
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
            stackOut_5_1 = new StringBuilder().append("og.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, dd[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var23 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (param4 > 0) {
                    L2: {
                      if (null == param1[3]) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = param1[3].field_x;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param1[5] != null) {
                        stackOut_11_0 = param1[5].field_x;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param1[1] != null) {
                        stackOut_14_0 = param1[1].field_r;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (null != param1[7]) {
                        stackOut_17_0 = param1[7].field_r;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param3 - -param5;
                      var11 = param0 + param4;
                      var13 = -77 % ((22 - param2) / 54);
                      var12 = param3 + var6_int;
                      var14 = var10 + -var7;
                      var15 = param0 - -var8;
                      var16 = var11 + -var9;
                      var17 = var12;
                      var18 = var14;
                      if (var17 <= var18) {
                        break L6;
                      } else {
                        var18 = param5 * var6_int / (var6_int - -var7) + param3;
                        var17 = param5 * var6_int / (var6_int - -var7) + param3;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      if (var20 >= var19) {
                        break L7;
                      } else {
                        var20 = param4 * var8 / (var8 - -var9) + param0;
                        var19 = param4 * var8 / (var8 - -var9) + param0;
                        break L7;
                      }
                    }
                    L8: {
                      gb.a(il.field_f);
                      if (null == param1[0]) {
                        break L8;
                      } else {
                        gb.g(param3, param0, var17, var19);
                        param1[0].d(param3, param0);
                        gb.b(il.field_f);
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param1[2]) {
                        break L9;
                      } else {
                        gb.g(var18, param0, var10, var19);
                        param1[2].d(var14, param0);
                        gb.b(il.field_f);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] != null) {
                        gb.g(param3, var20, var17, var11);
                        param1[6].d(param3, var16);
                        gb.b(il.field_f);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param1[8]) {
                        break L11;
                      } else {
                        gb.g(var18, var20, var10, var11);
                        param1[8].d(var14, var16);
                        gb.b(il.field_f);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[1]) {
                        break L12;
                      } else {
                        if (param1[1].field_x != 0) {
                          gb.g(var17, param0, var18, var19);
                          var21 = var12;
                          L13: while (true) {
                            if (var21 >= var14) {
                              gb.b(il.field_f);
                              break L12;
                            } else {
                              param1[1].d(var21, param0);
                              var21 = var21 + param1[1].field_x;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param1[7] == null) {
                        break L14;
                      } else {
                        if (param1[7].field_x == 0) {
                          break L14;
                        } else {
                          gb.g(var17, var20, var18, var11);
                          var21 = var12;
                          L15: while (true) {
                            if (var14 <= var21) {
                              gb.b(il.field_f);
                              break L14;
                            } else {
                              param1[7].d(var21, var16);
                              var21 = var21 + param1[7].field_x;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param1[3]) {
                        break L16;
                      } else {
                        if (param1[3].field_r != 0) {
                          gb.g(param3, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var21 >= var16) {
                              gb.b(il.field_f);
                              break L16;
                            } else {
                              param1[3].d(param3, var21);
                              var21 = var21 + param1[3].field_r;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param1[5] == null) {
                        break L18;
                      } else {
                        if (param1[5].field_r != 0) {
                          gb.g(var18, var19, var10, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var21 >= var16) {
                              gb.b(il.field_f);
                              break L18;
                            } else {
                              param1[5].d(var14, var21);
                              var21 = var21 + param1[5].field_r;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param1[4]) {
                        break L20;
                      } else {
                        if (param1[4].field_x == 0) {
                          break L20;
                        } else {
                          if (param1[4].field_r != 0) {
                            gb.g(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var16 <= var21) {
                                gb.b(il.field_f);
                                break L20;
                              } else {
                                var22 = var12;
                                L22: while (true) {
                                  if (var22 >= var14) {
                                    var21 = var21 + param1[4].field_r;
                                    continue L21;
                                  } else {
                                    param1[4].d(var22, var21);
                                    var22 = var22 + param1[4].field_x;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("og.BA(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L23;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L23;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (98 == param1) {
                stackOut_6_0 = ((og) this).b(param2, -28533);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (99 != param1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((og) this).a(32, param2);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("og.N(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    og(ua param0) {
        super(0, 0, 288, 0, (ch) null);
        RuntimeException var2 = null;
        int var3 = 0;
        e var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((og) this).field_F = param0;
            ((og) this).field_G = new bb(ee.field_k, (kd) null);
            ((og) this).field_G.field_p = (ch) (Object) new ri();
            int discarded$1 = -115;
            var7 = db.a(oh.field_jb, new String[2], true);
            var3 = 20;
            var4 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
            ((og) this).field_H = new ja(var7, (ch) (Object) var4);
            ((og) this).field_H.field_m = "";
            ((og) this).field_H.a(0, pi.field_f, 0);
            ((og) this).field_H.a(0, pi.field_f, 1);
            ((og) this).field_H.field_u = -40 + ((og) this).field_u;
            ((og) this).field_H.field_s = (kd) this;
            ((og) this).field_H.b(((og) this).field_u - 40, 26, var3, -9);
            var3 = var3 + (15 + ((og) this).field_H.field_j);
            ((og) this).a((qa) (Object) ((og) this).field_H, (byte) -55);
            var5 = 4;
            var6 = 200;
            ((og) this).field_G.a(-var6 + 300 >> 1, var6, var3, 40, 80);
            ((og) this).field_G.field_s = (kd) this;
            ((og) this).a((qa) (Object) ((og) this).field_G, (byte) -70);
            ((og) this).a(0, 300, 0, var3 - (-55 - var5), 80);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("og.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = -79 % ((param3 - -36) / 61);
              if (0 != param0) {
                if (param0 != 1) {
                  if (param0 != 2) {
                    break L1;
                  } else {
                    lk.a(-15493, "conduct.ws");
                    break L1;
                  }
                } else {
                  lk.a(-15493, "privacy.ws");
                  break L1;
                }
              } else {
                lk.a(-15493, "terms.ws");
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("og.DA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
