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
            var1_ref = (rta) (Object) ((et) this).field_l.e(112);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_x == null);
        return (cg) (Object) var1_ref.field_x;
    }

    final void a(int param0) {
        int var2 = 0;
        rta var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        ((et) this).field_m.a(param0);
        var3 = (rta) (Object) ((et) this).field_l.f(-80);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((et) this).field_k.c(15, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_B >= var2) {
                    this.a(943, var2, var3);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(943, var3.field_B, var3);
                    var2 = var2 - var3.field_B;
                    if (!((et) this).field_k.a(var3, (int[]) null, 0, (byte) 6, var2)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (rta) (Object) ((et) this).field_l.e(125);
            continue L0;
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
        int discarded$0 = 0;
        oga.a();
        jf.field_r = true;
        gj.field_r = true;
        ej.field_a.e(true);
        vn.a(86, mj.field_M, false);
    }

    final static void a(byte param0, String param1, java.awt.Color param2, int param3, boolean param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                    boolean discarded$1 = var9.drawImage(np.field_x, -152 + mma.field_a / 2, qf.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
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
                if (hma.field_e == null) {
                  break L1;
                } else {
                  var9.setFont(laa.field_y);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(hma.field_e, mma.field_a / 2 - 6 * hma.field_e.length() / 2, qf.field_i / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              nma.field_l.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref;
            stackOut_17_1 = new StringBuilder().append("et.H(").append(108).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(int param0, int param1, rta param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        l stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        rta stackIn_7_2 = null;
        l stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rta stackIn_8_2 = null;
        l stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rta stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        rta stackOut_6_2 = null;
        l stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        rta stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        l stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rta stackOut_7_2 = null;
        int stackOut_7_3 = 0;
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
              if ((4 & ((et) this).field_k.field_M[param2.field_k]) == 0) {
                break L1;
              } else {
                if (0 > param2.field_t) {
                  var4_int = ((et) this).field_k.field_u[param2.field_k] / kta.field_d;
                  var5 = (1048575 + (var4_int + -param2.field_r)) / var4_int;
                  param2.field_r = 1048575 & var4_int * param1 + param2.field_r;
                  if (var5 > param1) {
                    break L1;
                  } else {
                    L2: {
                      if (((et) this).field_k.field_q[param2.field_k] != 0) {
                        L3: {
                          param2.field_x = qia.a(param2.field_n, param2.field_x.j(), 0, param2.field_x.f());
                          stackOut_6_0 = ((et) this).field_k;
                          stackOut_6_1 = -111;
                          stackOut_6_2 = (rta) param2;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          if (0 <= param2.field_y.field_g[param2.field_m]) {
                            stackOut_8_0 = (l) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (rta) (Object) stackIn_8_2;
                            stackOut_8_3 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            stackIn_9_3 = stackOut_8_3;
                            break L3;
                          } else {
                            stackOut_7_0 = (l) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (rta) (Object) stackIn_7_2;
                            stackOut_7_3 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
                            break L3;
                          }
                        }
                        ((l) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      } else {
                        param2.field_x = qia.a(param2.field_n, param2.field_x.j(), param2.field_x.l(), param2.field_x.f());
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_y.field_g[param2.field_m] < 0) {
                        param2.field_x.b(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param2.field_r / var4_int;
                    break L1;
                  }
                } else {
                  param2.field_x.a(param1);
                  return;
                }
              }
            }
            param2.field_x.a(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("et.A(").append(943).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final void a(int param0, int param1, int[] param2, rta param3, int param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qia var11 = null;
        int var12 = 0;
        l stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        rta stackIn_11_2 = null;
        l stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        rta stackIn_12_2 = null;
        l stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        rta stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        rta stackOut_10_2 = null;
        l stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        rta stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        l stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        rta stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (4 & ((et) this).field_k.field_M[param3.field_k])) {
                break L1;
              } else {
                if (-1 <= param3.field_t) {
                  break L1;
                } else {
                  var7_int = ((et) this).field_k.field_u[param3.field_k] / kta.field_d;
                  L2: while (true) {
                    var8 = (var7_int + (1048575 - param3.field_r)) / var7_int;
                    if (param4 < var8) {
                      param3.field_r = param3.field_r + var7_int * param4;
                      break L1;
                    } else {
                      L3: {
                        param3.field_x.b(param2, param1, var8);
                        param4 = param4 - var8;
                        param3.field_r = param3.field_r + (var8 * var7_int + -1048576);
                        param1 = param1 + var8;
                        var9 = kta.field_d / 100;
                        var10 = 262144 / var7_int;
                        if (var10 < var9) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param3.field_x;
                        if (((et) this).field_k.field_q[param3.field_k] != 0) {
                          L5: {
                            param3.field_x = qia.a(param3.field_n, var11.j(), 0, var11.f());
                            stackOut_10_0 = ((et) this).field_k;
                            stackOut_10_1 = -35;
                            stackOut_10_2 = (rta) param3;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            if (param3.field_y.field_g[param3.field_m] >= 0) {
                              stackOut_12_0 = (l) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = (rta) (Object) stackIn_12_2;
                              stackOut_12_3 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              break L5;
                            } else {
                              stackOut_11_0 = (l) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (rta) (Object) stackIn_11_2;
                              stackOut_11_3 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              stackIn_13_3 = stackOut_11_3;
                              break L5;
                            }
                          }
                          ((l) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0);
                          param3.field_x.b(var9, var11.l());
                          break L4;
                        } else {
                          param3.field_x = qia.a(param3.field_n, var11.j(), var11.l(), var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (param3.field_y.field_g[param3.field_m] >= 0) {
                          break L6;
                        } else {
                          param3.field_x.b(-1);
                          break L6;
                        }
                      }
                      var11.d(var9);
                      var11.b(param2, param1, param0 + -param1);
                      if (!var11.m()) {
                        continue L2;
                      } else {
                        ((et) this).field_m.a((cg) (Object) var11);
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            param3.field_x.b(param2, param1, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("et.F(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 44 + 0 + 41);
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rta var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((et) this).field_m.b(param0, param1, param2);
            var6 = (rta) (Object) ((et) this).field_l.f(-80);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((et) this).field_k.c(15, var6)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_B) {
                        int discarded$2 = 0;
                        this.a(var4_int - -var5, var4_int, param0, var6, var5);
                        var6.field_B = var6.field_B - var5;
                        break L2;
                      } else {
                        int discarded$3 = 0;
                        this.a(var4_int - -var5, var4_int, param0, var6, var6.field_B);
                        var4_int = var4_int + var6.field_B;
                        var5 = var5 - var6.field_B;
                        if (!((et) this).field_k.a(var6, param0, var4_int, (byte) 6, var5)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (rta) (Object) ((et) this).field_l.e(121);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("et.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param0, -2988);
        var3.i(3, 0);
        var3.i(9, 0);
        var3.f(-1477662136, param2);
    }

    et(l param0) {
        ((et) this).field_l = new vna();
        ((et) this).field_m = new en();
        try {
            ((et) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "et.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final int a() {
        return 0;
    }

    final cg b() {
        rta var1 = (rta) (Object) ((et) this).field_l.f(-80);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_x)) {
            return (cg) (Object) var1.field_x;
        }
        return ((et) this).c();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 17219L;
    }
}
