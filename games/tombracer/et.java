/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends cg {
    vna field_l;
    private l field_k;
    en field_m;
    static long field_j;

    final cg c() {
        rta var1_ref = null;
        do {
            var1_ref = (rta) ((Object) this.field_l.e(112));
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_x == null);
        return (cg) ((Object) var1_ref.field_x);
    }

    final void a(int param0) {
        int var2 = 0;
        rta var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_m.a(param0);
        var3 = (rta) ((Object) this.field_l.f(-80));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              L1: {
                L2: {
                  if (!this.field_k.c(15, var3)) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = param0;
                L3: while (true) {
                  if (var3.field_B >= var2) {
                    this.a(943, var2, var3);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(943, var3.field_B, var3);
                    var2 = var2 - var3.field_B;
                    if (!this.field_k.a(var3, (int[]) null, 0, (byte) 6, var2)) {
                      continue L3;
                    } else {
                      if (var4 != 0) {
                        var3.field_B = var3.field_B - var2;
                        break L1;
                      } else {
                        if (var4 == 0) {
                          break L1;
                        } else {
                          this.a(943, var2, var3);
                          var3.field_B = var3.field_B - var2;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (rta) ((Object) this.field_l.e(125));
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 4 % ((param2 - 51) / 37);
        if (param1 < param0) {
            return param1;
        }
        return param0;
    }

    final static void a(boolean param0) {
        oga.a(!param0 ? true : false);
        jf.field_r = param0 ? true : false;
        gj.field_r = true;
        ej.field_a.e(true);
        vn.a(86, mj.field_M, false);
    }

    final static void a(byte param0, String param1, java.awt.Color param2, int param3, boolean param4) {
        boolean discarded$2 = false;
        int discarded$3 = 0;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = nma.field_l.getGraphics();
                  if (laa.field_y != null) {
                    break L2;
                  } else {
                    laa.field_y = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (!param4) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, mma.field_a, qf.field_i);
                    break L3;
                  }
                }
                L4: {
                  if (param2 != null) {
                    break L4;
                  } else {
                    param2 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (np.field_x == null) {
                        np.field_x = nma.field_l.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = np.field_x.getGraphics();
                    var10.setColor(param2);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param3 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
                    var10.setFont(laa.field_y);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param1, (-(6 * param1.length()) + 304) / 2, 22);
                    discarded$2 = var9.drawImage(np.field_x, -152 + mma.field_a / 2, qf.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + mma.field_a / 2;
                    var8 = -18 + qf.field_i / 2;
                    var9.setColor(param2);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, param3 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(var7 + (2 + param3 * 3), var8 - -2, 300 - 3 * param3, 30);
                    var9.setFont(laa.field_y);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param1, (304 + -(param1.length() * 6)) / 2 + var7, var8 - -22);
                    break L7;
                  }
                }
                L8: {
                  if (hma.field_e == null) {
                    break L8;
                  } else {
                    var9.setFont(laa.field_y);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(hma.field_e, mma.field_a / 2 - 6 * hma.field_e.length() / 2, qf.field_i / 2 + -26);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                nma.field_l.repaint();
                break L9;
              }
            }
            if (param0 >= 0) {
              break L0;
            } else {
              discarded$3 = et.b(-92, 42, -49);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5_ref);
            stackOut_19_1 = new StringBuilder().append("et.H(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, rta param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        l stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rta stackIn_8_2 = null;
        l stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rta stackIn_9_2 = null;
        l stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        rta stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rta stackOut_7_2 = null;
        l stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        rta stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        l stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        rta stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if ((4 & this.field_k.field_M[param2.field_k]) == 0) {
                break L1;
              } else {
                if (0 > param2.field_t) {
                  var4_int = this.field_k.field_u[param2.field_k] / kta.field_d;
                  var5 = (1048575 + (var4_int + -param2.field_r)) / var4_int;
                  param2.field_r = 1048575 & var4_int * param1 + param2.field_r;
                  if (var5 > param1) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (this.field_k.field_q[param2.field_k] != 0) {
                          break L3;
                        } else {
                          param2.field_x = qia.a(param2.field_n, param2.field_x.j(), param2.field_x.l(), param2.field_x.f());
                          if (!TombRacer.field_G) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param2.field_x = qia.a(param2.field_n, param2.field_x.j(), 0, param2.field_x.f());
                        stackOut_7_0 = this.field_k;
                        stackOut_7_1 = -111;
                        stackOut_7_2 = (rta) (param2);
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        if (0 <= param2.field_y.field_g[param2.field_m]) {
                          stackOut_9_0 = (l) ((Object) stackIn_9_0);
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = (rta) ((Object) stackIn_9_2);
                          stackOut_9_3 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          break L4;
                        } else {
                          stackOut_8_0 = (l) ((Object) stackIn_8_0);
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = (rta) ((Object) stackIn_8_2);
                          stackOut_8_3 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          break L4;
                        }
                      }
                      ((l) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                      break L2;
                    }
                    L5: {
                      if (param2.field_y.field_g[param2.field_m] < 0) {
                        param2.field_x.b(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param1 = param2.field_r / var4_int;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 == 943) {
                break L6;
              } else {
                field_j = 126L;
                break L6;
              }
            }
            param2.field_x.a(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("et.A(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, rta param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qia var11 = null;
        int var12 = 0;
        int stackIn_6_0 = 0;
        l stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        rta stackIn_13_2 = null;
        l stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        rta stackIn_14_2 = null;
        l stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        rta stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        l stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        rta stackOut_12_2 = null;
        l stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        rta stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        l stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        rta stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        boolean stackOut_22_0 = false;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (4 & this.field_k.field_M[param3.field_k] ^ -1)) {
                  break L2;
                } else {
                  if (-1 >= (param3.field_t ^ -1)) {
                    break L2;
                  } else {
                    var7_int = this.field_k.field_u[param3.field_k] / kta.field_d;
                    L3: while (true) {
                      var8 = (var7_int + (1048575 - param3.field_r)) / var7_int;
                      if (param4 < var8) {
                        param3.field_r = param3.field_r + var7_int * param4;
                        break L2;
                      } else {
                        param3.field_x.b(param2, param1, var8);
                        param4 = param4 - var8;
                        param3.field_r = param3.field_r + (var8 * var7_int + -1048576);
                        param1 = param1 + var8;
                        var9 = kta.field_d / 100;
                        var10 = 262144 / var7_int;
                        stackOut_5_0 = var10;
                        stackIn_23_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var12 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_6_0 < var9) {
                              var9 = var10;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              var11 = param3.field_x;
                              if (this.field_k.field_q[param3.field_k] != 0) {
                                break L6;
                              } else {
                                param3.field_x = qia.a(param3.field_n, var11.j(), var11.l(), var11.f());
                                if (var12 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              param3.field_x = qia.a(param3.field_n, var11.j(), 0, var11.f());
                              stackOut_12_0 = this.field_k;
                              stackOut_12_1 = -35;
                              stackOut_12_2 = (rta) (param3);
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              if (-1 >= (param3.field_y.field_g[param3.field_m] ^ -1)) {
                                stackOut_14_0 = (l) ((Object) stackIn_14_0);
                                stackOut_14_1 = stackIn_14_1;
                                stackOut_14_2 = (rta) ((Object) stackIn_14_2);
                                stackOut_14_3 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                stackIn_15_2 = stackOut_14_2;
                                stackIn_15_3 = stackOut_14_3;
                                break L7;
                              } else {
                                stackOut_13_0 = (l) ((Object) stackIn_13_0);
                                stackOut_13_1 = stackIn_13_1;
                                stackOut_13_2 = (rta) ((Object) stackIn_13_2);
                                stackOut_13_3 = 1;
                                stackIn_15_0 = stackOut_13_0;
                                stackIn_15_1 = stackOut_13_1;
                                stackIn_15_2 = stackOut_13_2;
                                stackIn_15_3 = stackOut_13_3;
                                break L7;
                              }
                            }
                            ((l) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                            param3.field_x.b(var9, var11.l());
                            break L5;
                          }
                          L8: {
                            if ((param3.field_y.field_g[param3.field_m] ^ -1) <= -1) {
                              break L8;
                            } else {
                              param3.field_x.b(-1);
                              break L8;
                            }
                          }
                          L9: {
                            var11.d(var9);
                            var11.b(param2, param1, param0 + -param1);
                            if (!var11.m()) {
                              break L9;
                            } else {
                              this.field_m.a(var11);
                              break L9;
                            }
                          }
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_22_0 = param5;
              stackIn_23_0 = stackOut_22_0 ? 1 : 0;
              break L1;
            }
            L10: {
              if (stackIn_23_0 == 0) {
                break L10;
              } else {
                this.field_m = (en) null;
                break L10;
              }
            }
            param3.field_x.b(param2, param1, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var7);
            stackOut_27_1 = new StringBuilder().append("et.F(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rta var6 = null;
        int var7 = 0;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (rta) ((Object) this.field_l.f(-80));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    if (this.field_k.c(15, var6)) {
                      break L2;
                    } else {
                      var4_int = param1;
                      var5 = param2;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (var5 <= var6.field_B) {
                              break L5;
                            } else {
                              this.a(var4_int - -var5, var4_int, param0, var6, var6.field_B, false);
                              var4_int = var4_int + var6.field_B;
                              var5 = var5 - var6.field_B;
                              if (!this.field_k.a(var6, param0, var4_int, (byte) 6, var5)) {
                                continue L3;
                              } else {
                                if (var7 != 0) {
                                  break L4;
                                } else {
                                  if (var7 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          this.a(var4_int - -var5, var4_int, param0, var6, var5, false);
                          break L4;
                        }
                        var6.field_B = var6.field_B - var5;
                        break L2;
                      }
                    }
                  }
                  var6 = (rta) ((Object) this.field_l.e(121));
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("et.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param0, -2988);
        var3.i(3, 0);
        var3.i(9, param1 ^ param1);
        var3.f(param1 ^ -1477662122, param2);
    }

    et(l param0) {
        this.field_l = new vna();
        this.field_m = new en();
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "et.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int a() {
        return 0;
    }

    final cg b() {
        rta var1 = (rta) ((Object) this.field_l.f(-80));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_x)) {
            return (cg) ((Object) var1.field_x);
        }
        return this.c();
    }

    static {
        field_j = 17219L;
    }
}
