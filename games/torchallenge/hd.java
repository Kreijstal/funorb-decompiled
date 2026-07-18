/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    static int field_d;
    static String field_g;
    private java.util.zip.Inflater field_e;
    static int[] field_c;
    static ka[] field_a;
    static int[][] field_f;
    static ka field_b;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
                    var3 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("hd.A(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 101 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, uj param1, Object param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
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
        Throwable decompiledCaughtException = null;
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
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param1.field_p) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (param1.field_p.peekEvent() == null) {
                      break L2;
                    } else {
                      c.a(40, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                if (param0 > 69) {
                  try {
                    L3: {
                      L4: {
                        if (param2 == null) {
                          break L4;
                        } else {
                          param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                          break L4;
                        }
                      }
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("hd.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_b = null;
    }

    private hd(int param0, int param1, int param2) {
    }

    final static void a(ka[] param0, int param1, int param2, byte param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var23 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var6_int = -44 / ((0 - param3) / 54);
                if (param2 <= 0) {
                  break L1;
                } else {
                  if (param1 > 0) {
                    L2: {
                      if (param0[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param0[3].field_q;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var7 = stackIn_10_0;
                      if (param0[5] == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param0[5].field_q;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_13_0;
                      if (param0[1] == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param0[1].field_v;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_16_0;
                      if (null == param0[7]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param0[7].field_v;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_19_0;
                      var11 = param5 + param2;
                      var12 = param4 + param1;
                      var13 = var7 + param5;
                      var14 = var11 + -var8;
                      var15 = param4 + var9;
                      var16 = -var10 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var17 > var18) {
                        var18 = param5 + var7 * param2 / (var8 + var7);
                        var17 = param5 + var7 * param2 / (var8 + var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      qg.a(hb.field_a);
                      if (var19 <= var20) {
                        break L7;
                      } else {
                        var20 = param4 + param1 * var9 / (var9 - -var10);
                        var19 = param4 + param1 * var9 / (var9 - -var10);
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[0] == null) {
                        break L8;
                      } else {
                        qg.a(param5, param4, var17, var19);
                        param0[0].g(param5, param4);
                        qg.b(hb.field_a);
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[2] == null) {
                        break L9;
                      } else {
                        qg.a(var18, param4, var11, var19);
                        param0[2].g(var14, param4);
                        qg.b(hb.field_a);
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param0[6]) {
                        qg.a(param5, var20, var17, var12);
                        param0[6].g(param5, var16);
                        qg.b(hb.field_a);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[8] == null) {
                        break L11;
                      } else {
                        qg.a(var18, var20, var11, var12);
                        param0[8].g(var14, var16);
                        qg.b(hb.field_a);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (0 == param0[1].field_q) {
                          break L12;
                        } else {
                          qg.a(var17, param4, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var14 <= var21) {
                              qg.b(hb.field_a);
                              break L12;
                            } else {
                              param0[1].g(var21, param4);
                              var21 = var21 + param0[1].field_q;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param0[7] == null) {
                        break L14;
                      } else {
                        if (param0[7].field_q != 0) {
                          qg.a(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var14 <= var21) {
                              qg.b(hb.field_a);
                              break L14;
                            } else {
                              param0[7].g(var21, var16);
                              var21 = var21 + param0[7].field_q;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param0[3] == null) {
                        break L16;
                      } else {
                        if (param0[3].field_v == 0) {
                          break L16;
                        } else {
                          qg.a(param5, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var21 >= var16) {
                              qg.b(hb.field_a);
                              break L16;
                            } else {
                              param0[3].g(param5, var21);
                              var21 = var21 + param0[3].field_v;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (null == param0[5]) {
                        break L18;
                      } else {
                        if (0 == param0[5].field_v) {
                          break L18;
                        } else {
                          qg.a(var18, var19, var11, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var21 >= var16) {
                              qg.b(hb.field_a);
                              break L18;
                            } else {
                              param0[5].g(var14, var21);
                              var21 = var21 + param0[5].field_v;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param0[4]) {
                        break L20;
                      } else {
                        if (0 == param0[4].field_q) {
                          break L20;
                        } else {
                          if (0 != param0[4].field_v) {
                            qg.a(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var21 >= var16) {
                                qg.b(hb.field_a);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param0[4].field_v;
                                    continue L21;
                                  } else {
                                    param0[4].g(var22, var21);
                                    var22 = var22 + param0[4].field_q;
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
            stackOut_70_1 = new StringBuilder().append("hd.D(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte[] param0, byte param1, uf param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (31 != param2.field_m[param2.field_q]) {
                    break L1;
                  } else {
                    if (-117 == param2.field_m[param2.field_q - -1]) {
                      L2: {
                        if (param1 == -117) {
                          break L2;
                        } else {
                          field_f = null;
                          break L2;
                        }
                      }
                      L3: {
                        if (null != ((hd) this).field_e) {
                          break L3;
                        } else {
                          ((hd) this).field_e = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          ((hd) this).field_e.setInput(param2.field_m, param2.field_q - -10, param2.field_m.length + (-8 + -param2.field_q) - 10);
                          int discarded$2 = ((hd) this).field_e.inflate(param0);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((hd) this).field_e.reset();
                        throw new RuntimeException("");
                      }
                      ((hd) this).field_e.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("hd.G(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
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
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public hd() {
        this(-1, 1000000, 1000000);
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        return cj.field_d;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
        rc.field_t = param8;
        vb.field_r = param6;
        mg.field_e = param3;
        vk.field_j = param5;
        pg.field_m = param2;
        mc.field_o = param1;
        vf.field_d = param7;
        wb.field_d = param4;
        gb.field_d = (vb) (Object) new fl();
        try {
            gi.field_a = new rb(param8);
            wf.field_i = new oa(gb.field_d, gi.field_a);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hd.E(" + 7 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[3];
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_f = new int[][]{new int[1], new int[6], new int[1], new int[1], new int[1], new int[1]};
    }
}
