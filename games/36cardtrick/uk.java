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

    public static void a(byte param0) {
        if (param0 < 3) {
            Object var2 = null;
            uk.a((String) null, -12, (String) null);
        }
        field_d = null;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    final static void a(kc[] param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
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
        Object var23 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = Main.field_T;
        if (param0 != null) {
          L0: {
            if ((param4 ^ -1) >= -1) {
              break L0;
            } else {
              if ((param2 ^ -1) >= -1) {
                break L0;
              } else {
                L1: {
                  if (param0[3] == null) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param0[3].field_l;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param0[5] != null) {
                    stackOut_11_0 = param0[5].field_l;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (null == param0[1]) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param0[1].field_k;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (null != param0[7]) {
                    stackOut_17_0 = param0[7].field_k;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param4 + param5;
                  var11 = param2 + param3;
                  if (param1 == -104) {
                    break L5;
                  } else {
                    var23 = null;
                    uk.a((String) null, 4, (String) null);
                    break L5;
                  }
                }
                L6: {
                  var12 = param5 - -var6;
                  var13 = var10 + -var7;
                  var14 = var8 + param3;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = param5 - -(param4 * var6 / (var6 + var7));
                    var16 = param5 - -(param4 * var6 / (var6 + var7));
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
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param0[1].d(var20, param3);
                            var20 = var20 + param0[1].field_l;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        vj.b(kg.field_a);
                        break L12;
                      }
                    }
                  }
                }
                L15: {
                  if (null == param0[7]) {
                    break L15;
                  } else {
                    if (param0[7].field_l == 0) {
                      break L15;
                    } else {
                      vj.f(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param0[7].d(var20, var15);
                            var20 = var20 + param0[7].field_l;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        vj.b(kg.field_a);
                        break L15;
                      }
                    }
                  }
                }
                L18: {
                  if (null == param0[3]) {
                    break L18;
                  } else {
                    if (param0[3].field_k != 0) {
                      vj.f(param5, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var15 <= var20) {
                            break L20;
                          } else {
                            param0[3].d(param5, var20);
                            var20 = var20 + param0[3].field_k;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        vj.b(kg.field_a);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                L21: {
                  if (param0[5] == null) {
                    break L21;
                  } else {
                    if (0 == param0[5].field_k) {
                      break L21;
                    } else {
                      vj.f(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var15 <= var20) {
                            break L23;
                          } else {
                            param0[5].d(var13, var20);
                            var20 = var20 + param0[5].field_k;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        vj.b(kg.field_a);
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  if (null == param0[4]) {
                    break L24;
                  } else {
                    if (-1 == (param0[4].field_l ^ -1)) {
                      break L24;
                    } else {
                      if (param0[4].field_k != 0) {
                        vj.f(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var15 <= var20) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var13 <= var21) {
                                    break L28;
                                  } else {
                                    param0[4].d(var21, var20);
                                    var21 = var21 + param0[4].field_l;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param0[4].field_k;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          vj.b(kg.field_a);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != -23804) {
          return;
        } else {
          L0: {
            if (pc.field_a == null) {
              break L0;
            } else {
              pc.field_a.s(-101);
              break L0;
            }
          }
          i.field_a = new ak(param0, param2, false, true, true);
          vb.field_h.c((lk) (Object) i.field_a, (byte) 106);
          return;
        }
    }

    final static void a(int param0, boolean param1, byte param2, java.awt.Color param3, String param4) {
        Exception var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = tb.field_c.getGraphics();
              if (hk.field_a == null) {
                hk.field_a = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1) {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, gg.field_d, hj.field_j);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 == null) {
                param3 = new java.awt.Color(140, 17, 17);
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (ua.field_F == null) {
                    ua.field_F = tb.field_c.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
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
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
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
                break L6;
              }
            }
            L7: {
              if (null != ub.field_k) {
                var9.setFont(hk.field_a);
                var9.setColor(java.awt.Color.white);
                var9.drawString(ub.field_k, gg.field_d / 2 + -(6 * ub.field_k.length() / 2), hj.field_j / 2 + -26);
                break L7;
              } else {
                break L7;
              }
            }
            var6 = -29 % ((-48 - param2) / 46);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            tb.field_c.repaint();
            break L8;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ml();
    }
}
