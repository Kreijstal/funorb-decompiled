/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uk {
    int field_e;
    int field_g;
    int field_b;
    static long field_a;
    int field_h;
    int field_f;
    int field_c;
    static ml field_d;

    public static void a() {
        field_d = null;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    final static void a(kc[] param0, byte param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var22 = Main.field_T;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param4 <= 0) {
                  break L1;
                } else {
                  if (param2 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param0[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param0[3].field_l;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param0[5] != null) {
                        stackOut_12_0 = param0[5].field_l;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null == param0[1]) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param0[1].field_k;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null != param0[7]) {
                        stackOut_18_0 = param0[7].field_k;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param4 + param5;
                      var11 = param2 + param3;
                      var12 = param5 - -var6_int;
                      var13 = var10 + -var7;
                      var14 = var8 + param3;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = param5 - -(param4 * var6_int / (var6_int + var7));
                        var16 = param5 - -(param4 * var6_int / (var6_int + var7));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var18 > var19) {
                        var19 = param2 * var8 / (var8 - -var9) + param3;
                        var18 = param2 * var8 / (var8 - -var9) + param3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      vj.a(kg.field_a);
                      if (param0[0] == null) {
                        break L8;
                      } else {
                        vj.f(param5, param3, var16, var18);
                        param0[0].d(param5, param3);
                        vj.b(kg.field_a);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param0[2]) {
                        vj.f(var17, param3, var10, var18);
                        param0[2].d(var13, param3);
                        vj.b(kg.field_a);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[6] != null) {
                        vj.f(param5, var19, var16, var11);
                        param0[6].d(param5, var15);
                        vj.b(kg.field_a);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[8] == null) {
                        break L11;
                      } else {
                        vj.f(var17, var19, var10, var11);
                        param0[8].d(var13, var15);
                        vj.b(kg.field_a);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (0 == param0[1].field_l) {
                          break L12;
                        } else {
                          vj.f(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              vj.b(kg.field_a);
                              break L12;
                            } else {
                              param0[1].d(var20, param3);
                              var20 = var20 + param0[1].field_l;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (param0[7].field_l == 0) {
                          break L14;
                        } else {
                          vj.f(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var13 <= var20) {
                              vj.b(kg.field_a);
                              break L14;
                            } else {
                              param0[7].d(var20, var15);
                              var20 = var20 + param0[7].field_l;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (param0[3].field_k != 0) {
                          vj.f(param5, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              vj.b(kg.field_a);
                              break L16;
                            } else {
                              param0[3].d(param5, var20);
                              var20 = var20 + param0[3].field_k;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param0[5] == null) {
                        break L18;
                      } else {
                        if (0 == param0[5].field_k) {
                          break L18;
                        } else {
                          vj.f(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              vj.b(kg.field_a);
                              break L18;
                            } else {
                              param0[5].d(var13, var20);
                              var20 = var20 + param0[5].field_k;
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
                        if (param0[4].field_l == 0) {
                          break L20;
                        } else {
                          if (param0[4].field_k != 0) {
                            vj.f(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                vj.b(kg.field_a);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param0[4].field_k;
                                    continue L21;
                                  } else {
                                    param0[4].d(var21, var20);
                                    var21 = var21 + param0[4].field_l;
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
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("uk.E(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + -104 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != -23804) {
            return;
        }
        try {
            if (pc.field_a != null) {
                pc.field_a.s(-101);
            }
            i.field_a = new ak(param0, param2, false, true, true);
            vb.field_h.c((lk) (Object) i.field_a, (byte) 106);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "uk.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, boolean param1, byte param2, java.awt.Color param3, String param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = tb.field_c.getGraphics();
                  if (hk.field_a == null) {
                    hk.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, gg.field_d, hj.field_j);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param3 == null) {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (ua.field_F == null) {
                        ua.field_F = tb.field_c.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = ua.field_F.getGraphics();
                    var10.setColor(param3);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param0 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 + param0 * 3, 2, -(param0 * 3) + 300, 30);
                    var10.setFont(hk.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (-(param4.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(ua.field_F, -152 + gg.field_d / 2, hj.field_j / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    var7 = gg.field_d / 2 + -152;
                    var8 = hj.field_j / 2 - 18;
                    var9.setColor(param3);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, var8 + 2, param0 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(3 * param0 + (var7 + 2), 2 + var8, 300 + -(3 * param0), 30);
                    var9.setFont(hk.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, (-(param4.length() * 6) + 304) / 2 + var7, 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (null != ub.field_k) {
                    var9.setFont(hk.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(ub.field_k, gg.field_d / 2 + -(6 * ub.field_k.length() / 2), hj.field_j / 2 + -26);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6 = 0;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                tb.field_c.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5_ref;
            stackOut_22_1 = new StringBuilder().append("uk.H(").append(param0).append(44).append(param1).append(44).append(-96).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ml();
    }
}
